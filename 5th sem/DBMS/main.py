from PIL import Image
import numpy as NMP
import glob
ACCU = 0
Tp = 0
Tn = 0
Fp = 0
Fn = 0


def accuracy(imageArr, maskArr, numb):
    tp = 0
    tn = 0
    fp = 0
    fn = 0

    Trained = NMP.zeros([256, 256, 256])
    file = open('accuracy.txt', 'r')
    for i in range(256):
        for j in range(256):
            for k in range(256):
                line = file.readline()
                Trained[i][j][k] = float(line)

    file.close()

    for im in range(500, 555):
        image = Image.open(imageArr[numb[im] - 1])
        mask = Image.open(maskArr[numb[im] - 1])

        width, height = image.size

        pixelImage = image.load()
        pixelMask = mask.load()

        for h in range(height):
            for w in range(width):
                if Trained[pixelImage[w, h][0]][pixelImage[w, h][1]][pixelImage[w, h][2]] < 0.5:  # predicion nonSkin
                    if pixelMask[w, h][0] < 250 or pixelMask[w, h][1] < 250 or pixelMask[w, h][2] < 250:
                        tn += 1
                    else:
                        fn += 1
                else:
                    if pixelMask[w, h][0] < 250 or pixelMask[w, h][1] < 250 or pixelMask[w, h][2] < 250:
                        tp += 1
                    else:
                        fp += 1

    accu = (tp + fn) / (tp + tn + fp + fn)
    global ACCU
    ACCU += accu
    print(ACCU)


def probability(skinPixel, skin, nonSkinPixel, nonSkin):
    Pskin = NMP.zeros([256, 256, 256])
    PnSkin = NMP.zeros([256, 256, 256])
    file = open('accuracy.txt', 'w')
    for i in range(256):
        for j in range(256):
            for k in range(256):
                Pskin[i][j][k] = skinPixel[i][j][k] / skin
                PnSkin[i][j][k] = nonSkinPixel[i][j][k] / nonSkin

                if PnSkin[i][j][k] == 0 and Pskin[i][j][k] == 0:
                    file.write(str(0.0) + "\n")
                elif PnSkin[i][j][k] == 0:
                    file.write(str(100.0) + "\n")
                else:
                    file.write(str(Pskin[i][j][k] / PnSkin[i][j][k]) + "\n")

    file.close()


def skinDet(imageArr, maskArr):
    numb = NMP.random.randint(1, 555, 555)
    skinPixel = NMP.zeros([256, 256, 256])
    nonSkinPixel = NMP.zeros([256, 256, 256])
    skin = 0.0
    nonSkin = 0.0

    for im in range(500):
        image = Image.open(imageArr[numb[im] - 1])
        mask = Image.open(maskArr[numb[im] - 1])
        for (imageP, maskP) in zip(image.getdata(), mask.getdata()):
            if maskP[0] < 250 or maskP[1] < 250 or maskP[2] < 250:
                skinPixel[imageP[0]][imageP[1]][imageP[2]] += 1
                skin += 1
            else:
                nonSkinPixel[imageP[0]][imageP[1]][imageP[2]] += 1
                nonSkin += 1

    probability(skinPixel, skin, nonSkinPixel, nonSkin)
    accuracy(imageArr, maskArr, numb)


def main():
    imageArr = sorted(glob.glob("/ibtd/*.jpg"))
    maskArr = sorted(glob.glob("/ibtd/Mask/*.bmp"))
    for i in range(10):
        skinDet(imageArr, maskArr)

    print("Average accuracy: ", ACCU * 10, "%\n")
    # print("Confusion matrix: \n", Fn/10, "  ", Fp/10, "\n", Tn/10, "  ", Tp/10)


if __name__ == '__main__':
    main()
<?php
$tmp_img  = $img = array();
$fname = $lname = $mail = $address = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $fname= $_POST["fname"];
    $lname= $_POST["lname"];
    $mail= $_POST["mail"];
    $address= $_POST["address"];
    $Image= $_FILES['image']['name'];
    $tmp_img= $_FILES['image']["tmp_name"];
    $UPLOADDIR = "image/".$Image;
    move_uploaded_file($tmp_img,$UPLOADDIR);
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style1.css">
    <title>My site</title>
</head>
    <body>
        <div class="container">
            <div>
                <h1 style="text-align: center;"><?php if (!filter_var($mail, FILTER_VALIDATE_EMAIL)) {
                    echo "Invalid email address";
                    exit;
                    }?>
                </h1>
            </div>
            <div class="left">
                <h2>Name: <?php echo $fname." ".$lname."<br>"."<br>";?></h2>
                <h2>Email: <?php echo $mail."<br>"."<br>";?></h2>
                <h2>Address: <?php echo $address."<br>"."<br>";?></h2>
            </div>
            <div class="right">
                <div class="imagee">
                    <?php echo "<img src='$UPLOADDIR'>";?>
                </div>
            </div>
    </div>
</body>
</html>
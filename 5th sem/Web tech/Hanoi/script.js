// const diskNo = parseInt(prompt('Enter the number of disks'));
function sound() {
    let Sound = new Audio("a.mp3");  
    Sound.play();
    }
let buttons = document.getElementsByClassName("bt");
for (let i = 0; i < buttons.length; i++) {
buttons[i].addEventListener("click", sound);
}
let volumeUp = document.getElementById("volumeUp");
let volumeDown = document.getElementById("volumeDown");
function vup(){
    let music = document.getElementById("bg");
    music.volume += 0.2;
}
function vd(){
    let music = document.getElementById("bg");
    music.volume -= 0.2;
}
volumeUp.addEventListener("click", vup);
volumeDown.addEventListener("click", vd);
function res(){
    location.reload();
}
function ototw(){
    let on= document.getElementById("o");
    let child= on.lastElementChild;
    let tt= document.getElementById("t");
    if(on.children.length != 0){
        if(tt.children.length ===0){
            tt.appendChild(child,tt.lastElementChild);
            on.removeChild(child);
        }
        else if(parseInt(tt.lastElementChild.innerText)>parseInt(on.lastElementChild.innerText)){
            tt.appendChild(child,tt.lastElementChild);
            on.removeChild(child);
        }
    }
}
function ototh(){
    let on= document.getElementById("o");
    let child= on.lastElementChild;
    let tt= document.getElementById("h");
    if(on.children.length != 0){
        if(tt.children.length ===0){
            tt.appendChild(child,tt.lastElementChild);
            on.removeChild(child);
        }
        else if(parseInt(tt.lastElementChild.innerText)>parseInt(on.lastElementChild.innerText)){
            tt.appendChild(child,tt.lastElementChild);
            on.removeChild(child);
        }
    }
}
function thotw(){
    let on= document.getElementById("h");
    let child= on.lastElementChild;
    let tt= document.getElementById("t");
    if(on.children.length != 0){
        if(tt.children.length ===0){
            tt.appendChild(child,tt.lastElementChild);
            on.removeChild(child);
        }
        else if(parseInt(tt.lastElementChild.innerText)>parseInt(on.lastElementChild.innerText)){
            tt.appendChild(child,tt.lastElementChild);
            on.removeChild(child);
        }
    }
}
function twtoth(){
    let on= document.getElementById("t");
    let child= on.lastElementChild;
    console.log(on);
    let tt= document.getElementById("h");
    if(on.children.length != 0){
        if(tt.children.length ===0){
            tt.appendChild(child,tt.lastElementChild);
            on.removeChild(child);
        }
        else if(parseInt(tt.lastElementChild.innerText)>parseInt(on.lastElementChild.innerText)){
            tt.appendChild(child,tt.lastElementChild);
            on.removeChild(child);
        }
    }
}
function thtoo(){
    let on= document.getElementById("h");
    let child= on.lastElementChild;
    console.log(on);
    let tt= document.getElementById("o");
    if(on.children.length != 0){
        if(tt.children.length ===0){
            tt.appendChild(child,tt.lastElementChild);
            on.removeChild(child);
        }
        else if(parseInt(tt.lastElementChild.innerText)>parseInt(on.lastElementChild.innerText)){
            tt.appendChild(child,tt.lastElementChild);
            on.removeChild(child);
        }
    }
}
function twtoo(){
    let on= document.getElementById("t");
    let child= on.lastElementChild;
    console.log(on);
    let tt= document.getElementById("o");
    if(on.children.length != 0){
        if(tt.children.length ===0){
            tt.appendChild(child,tt.lastElementChild);
            on.removeChild(child);
        }
        else if(parseInt(tt.lastElementChild.innerText)>parseInt(on.lastElementChild.innerText)){
            tt.appendChild(child,tt.lastElementChild);
            on.removeChild(child);
        }
    }
}
let numbers = new Set();
let num1=0, num2=0, num3=0, num4=0;
let cnt=0;
let cnt2=1;
let lent=0;
while(numbers.size < 4) {
    var randomNum = Math.floor(Math.random() * 4) + 1;
    if(randomNum===cnt2){
        lent++;
    }
    cnt2++;
    numbers.add(randomNum);
}
function randomize(){
    lent=0;
    while(numbers.size < 4) {
        var randomNum = Math.floor(Math.random() * 4) + 1;
        if(randomNum===cnt2){
            lent++;
        }
        cnt2++;
        numbers.add(randomNum);
    }
}
if(lent=== 4){
    randomize();
}
for (let number of numbers) {
    if(cnt === 0){
        num1 = number;
    }
    if(cnt === 1){
        num2 = number;
    }
    if(cnt === 2){
        num3 = number;
    }
    if(cnt === 3){
        num4 = number;
    }
    cnt++;
}

document.getElementById('on').innerHTML= num1;
document.getElementById('tw').innerHTML= num2;
document.getElementById('th').innerHTML= num3;
document.getElementById('f').innerHTML= num4;
function check() {
    let cols = document.getElementsByClassName("col-lg-4");
    let emp=0;
    let ind=0;
    for (let i = 0; i < cols.length; i++) {
    if (cols[i].children.length <4) {
        emp+=1;
        console.log("empty");
        console.log(emp);
    }
    else{
        ind=i;
        console.log(ind);
        console.log(emp);
    }
    console.log("dhur");
    }
    let bool= false;
    if(emp==2){
        bool=true
        console.log("ashi");
        console.log("aschi");
        let child = cols[ind].children;
        console.log(ind);
        for (let i =  child.length-1; i >= 0; i--) {
            let currentValue = parseInt(child[i].innerText);
            console.log(currentValue);
            console.log("dekhi");
            if(i==0){
                break;
            }
            let nextValue = parseInt(child[i - 1].innerText);
            if (currentValue >= nextValue) {
                console.log("checking");
                bool= false;
                break;
            }
        }
    }
    if (bool) {
        window.open('win.gif', '_self', 'resizable=yes,width=100%,height=100%');
    } else {
        window.open('lose.gif', '_self', 'resizable=yes,width=100%,height=100%')
    }
}
console.log("KHATAM");
console.log("TATA");
console.log("BYE BYE");
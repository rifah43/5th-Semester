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
    tt.appendChild(child,tt.lastElementChild);
    on.removeChild(child);
}
function ototh(){
    let on= document.getElementById("o");
    let child= on.lastElementChild;
    let tt= document.getElementById("h");
    tt.appendChild(child,tt.lastElementChild);
    on.removeChild(child);
}
function thotw(){
    let on= document.getElementById("h");
    let child= on.lastElementChild;
    let tt= document.getElementById("t");
    tt.appendChild(child,tt.lastElementChild);
    on.removeChild(child);
}
function twtoth(){
    let on= document.getElementById("t");
    let child= on.lastElementChild;
    console.log(on);
    let tt= document.getElementById("h");
    tt.appendChild(child,tt.lastElementChild);
    on.removeChild(child);
}
function thtoo(){
    let on= document.getElementById("h");
    let child= on.lastElementChild;
    console.log(on);
    let tt= document.getElementById("o");
    tt.appendChild(child,tt.lastElementChild);
    on.removeChild(child);
}
function twtoo(){
    let on= document.getElementById("t");
    let child= on.lastElementChild;
    console.log(on);
    let tt= document.getElementById("o");
    tt.appendChild(child,tt.lastElementChild);
    on.removeChild(child);
}
function getRandomNumberWithTime() {
const time = new Date().getMilliseconds()*Math.random();
return (time);
}
console.log(getRandomNumberWithTime());
document.getElementById('on').innerHTML= Math.floor(Math.random() * getRandomNumberWithTime());
document.getElementById('tw').innerHTML= Math.floor(Math.random() * getRandomNumberWithTime());
document.getElementById('th').innerHTML= Math.floor(Math.random() * getRandomNumberWithTime());
document.getElementById('f').innerHTML= Math.floor(Math.random() * getRandomNumberWithTime());
function check() {
    var cols = document.getElementsByClassName("col-lg-4");
    let emp=0;
    let ind=0;
    for (let i = 0; i < cols.length; i++) {
    if (cols[i].children.length === 0) {
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
    let bool= true;
    if(emp==2){
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
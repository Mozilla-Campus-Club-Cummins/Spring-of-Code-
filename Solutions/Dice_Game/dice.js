var randomNumber1 = Math.floor(Math.random()*6) + 1;
console.log(randomNumber1);
var randomDiceNumber = "images/dice"+randomNumber1+".png";
document.querySelector(".img1").setAttribute("src",randomDiceNumber);

var randomNumber2 = Math.floor(Math.random()*6) + 1;
console.log(randomNumber2);
var randomDiceNumber = "images/dice"+randomNumber2+".png";
document.querySelector(".img2").setAttribute("src",randomDiceNumber);

// document.querySelectorAll("img")[0].setAttribute("src",randomNumber1);
// document.querySelectorAll("img")[1].setAttribute("src",randomNumber2);

if(randomNumber1>randomNumber2)
document.querySelector("h3").innerHTML = "Player 1 wins";
else if(randomNumber2>randomNumber1)
document.querySelector("h3").innerHTML = "Player 2 wins";
else
document.querySelector("h3").innerHTML = "Draw";

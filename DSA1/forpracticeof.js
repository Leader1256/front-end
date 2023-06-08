
let width1=document.querySelector("#width");
console.log(width1.value);
let height1=document.querySelector("#height");
console.log(height1.value);
let range1=document.querySelector("#rot-range");
console.log(range1.value);
function changeHandler(e){
 e=document.querySelector(".exper");
 e.style.width=`${width1}px`;console.log(width1.value);
 e.style.height=`${height1.value}px`;
  e.style.transform=`rotate(${range1.value}deg)`;
}
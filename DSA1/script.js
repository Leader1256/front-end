const xAxis=document.querySelector("#anim-x");
const yAxis=document.querySelector("#anim-y");
const scale=document.querySelector("#anim-scale");
const rotate=document.querySelector("#anim-rotation");
const duration=document.querySelector("#anim-duration");

function changeHandler(element){
    element=document.querySelector(".animation-div");
    element.style.transform=`translate(${xAxis.value}px,${yAxis.value}px) scale(${scale.value}) rotate(${rotate.value}deg)`;
}
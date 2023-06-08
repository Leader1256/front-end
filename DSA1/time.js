console.log("timeUIntervdl");
const startbtn=document.querySelector(".start");
const stopbtn=document.querySelector(".stop");
const counter=document.querySelector(".counter");
let i=0;
let clearI;
startbtn.addEventListener("click",()=>{
     clearI=setInterval(()=>{
      i++;
      counter.innerText=i;
    },1000);
})
stopbtn.addEventListener("click",()=>{
    clearInterval(clearI);
})

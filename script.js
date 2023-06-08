const circular_slider=document.querySelector('.wrapper');
const slides=document.querySelectorAll('.slides');

slides.forEach((slide,i)=>{
    slide.onclick=()=>{
        circular_slider.style.transform=`rotateZ(-${360 / 5 * (i)}deg)`;
    }
})
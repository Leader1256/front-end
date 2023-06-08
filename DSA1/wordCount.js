const wordcount=document.querySelector("#Wordcount");
const count=document.querySelector(".count");

function counttheWord(str){
   
let wordtrim=str.trim();
let splitword=str.split(" ");
return splitword.length;
}
wordcount.addEventListener("input",function(){
     let wcount=wordcount.value;
    let wordcountreturn=counttheWord(wcount);
    count.innerHTML=wordcountreturn;
})


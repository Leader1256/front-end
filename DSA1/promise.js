console.log("welcome to promise");

function  callBackFunct(resolve,reject){
    resolve("hii i am promise ");
}
let promise1=new Promise(callBackFunct);
console.log(promise1);

let promise12=new Promise((resolve,reject)=>{
    setTimeout(()=>{
       resolve({name:"dinesh"})
    },1000);
})

console.log(promise12);
promise12.then((data)=>{
    resolve("i am in then function");
    console.log(data);
})
console.log(promise12)
console.log("closure example");

// function bar(){
//    let x=20;
//    function buz(){
//     let y=21;
//     return x+y;
//    }
//    return buz();
// }
// let b=bar();
// console.log(b);

// let promise= new Promise((resolve,reject)=>{
//     console.log("this is resolve success");
//     resolve({"name":"sumit"})
        
    
// })
// console.log(promise);

// for(var i=0;i<10;i++){
//    let i=0;
//    while(i<9){
//     console.log(i);
//     setTimeout(()=>{
//         console.log(i); 
//      },1000)
 
//     i++;
//     }
// function sum(a,b){
//    return a+b;
// }

// let addInSum2=sum.bind(this,2);
// let result=addInSum2(2);
// console.log(result);


function sum(a){
    return function sum2(b){
        return a+b;
    };
 }
 
 let r=sum.bind(this,3);
 console.log(r(2));

   



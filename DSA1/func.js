function outFunct(){
    var name="sharad";
    function innerfunct(){
       console.log(name);
    }
    return innerfunct();
}

outFunct();


// hoist

x=5;

let funct=(a)=>{
    return a+x;
}

let x;
console.log(funct(12));
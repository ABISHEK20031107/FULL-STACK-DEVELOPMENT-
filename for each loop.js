//you can't use break or return a array
//array.foreach(value,index)

let fruits=["apple","jack fruit","orange"];
fruits.forEach(function(fruits,index)
{
    console.log(index+":"+fruits);
});

let numbers=[1,2,3];
numbers.forEach(num=>{
    console.log(num*2);
});

let n=[1,2,3];
let doubled=n.map((num)=>num*2);
console.log(doubled);

let num=[1,2,3];
let doub=[];
num.forEach((n1)=>{
    doub.push(n*2)
});
console.log(doub);

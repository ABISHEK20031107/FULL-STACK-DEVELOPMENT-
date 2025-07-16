const num1= 10;
const num2=5;
const num3=15;

let greatest;

if(num1 >= num2 && num1 >= num3){
    console.log("The largest number "+num1);
}
else if(num2 >= num1 && num2 >= num3){
    console.log("The largest number is"+num2);
}
else{
     console.log("The largest number is"+num3);
}
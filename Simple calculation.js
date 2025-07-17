const readline = require("readline");

const rl = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});

rl.question("Enter the Number A : ",function(a){
    const num1=Number(a);
rl.question("Enter the Number B : ",function(b){
    const num2=Number(b);
rl.question("Select the Operator for Add (+), Sub(-), Mul(*) ,Div (/) : ",function(op){
    const operator=op;

   let result;

   switch(operator){
          case '+' :{
            result = num1+num2;
            break;      
          }
          case '-' :{
            result = num1-num2;
            break;      
          }
          case '*' :{
            result = num1*num2;
            break;      
          }
          case '/' :{
            result = num1/num2;
            break;      
          }
          default :{
            result="Invalid Operator"
        }
            
   }
   console.log("The result of " +num1+ " "+operator+ " " +num2+  " is "+ result);
   rl.close();
})
})
})

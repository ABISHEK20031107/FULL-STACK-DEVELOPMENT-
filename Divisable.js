const readline = require('readline');
const r1= readline.createInterface({
    input:process.stdin,
    output:process.stdout
});

r1.question("Enter the Number:", function(num){
    let nu=num;
    if (nu%3==0 && nu%5==0) {
        console.log("The Number "+nu +" is Divisible by 3 and 5.");
    }
    else{
        console.log("The Number "+nu +" is not Divisible by 3 and 5.");
    }
    r1.close();
});



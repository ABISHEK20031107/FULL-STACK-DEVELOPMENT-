
const readline = require("readline");

const r1 = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

let user = {};
r1.question("Enter the Number A :", function (a) {
    user.a =Number(a);
    r1.question("Enter the Number B :", function (b) {
        user.b = Number(b);
        r1.question("Enter the Number C :", function (c) {
            user.c = Number(c);

            if (user.a > user.b && user.a > user.c) {
                console.log("A is Greater");
            }
            else if (user.b > user.a && user.b > user.c) {
                console.log("B is Greater");
            }
            else {
                console.log("C is Greater");
            }
            r1.close();
        });
    });
});

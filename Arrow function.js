const sla=() =>
{
    console.log("Welcome to SLA");

}
sla();
//2.Arrow function with single parameter

    const s=x=>x*x;
    console.log(s(5));
         
    const add=(a,b)=>a+b;
    console.log(add(2,3));
 //3.Arrow function with multiple parameter
 
       const s1=(x1,y1,z1) =>
       {
            console.log(x1+y1+z1);
       }
       s1(10,20,30);      

//4.Arrow function with default  parameter

      const s4=(x4,y4,z4=30)=>
      {
        console.log(x4+" "+y4+" "+z4);

      }
      s4(30,40)
//object
let person={
    name:"ram",
    age:47,
    isStudent:true
};
console.log(person.name)
person.city="London";
console.log(person.city);
delete person.isStudent;
console.log(person.isStudent);

//printing the object
for(let key in person){
    console.log(key+":"+person[key]);

}

//object using function
let user={
    name:"sibi",
great:function()
{
    console.log("HAI I AM SIBI");
}
};


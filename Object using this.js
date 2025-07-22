//obj using this

let user1={
    name:"Hari",
    great1:function()
{
    console.log(this.name); //name is the obj ref
}
};
user1.great1();
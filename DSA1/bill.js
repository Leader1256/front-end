const billItems = [{
    id: 1,
    itemName: "Bread",
    price: 20
  }, {
    id: 2,
    itemName: "Butter",
    price: 50
  }, {
    id: 3,
    itemName: "Tomatoes",
    price: 30
  }, {
    id: 4,
    itemName: "Onion",
    price: 40
  }, {
    id: 5,
    itemName: "Pomegranate",
    price: 60
  }, {
    id: 6,
    itemName: "Apple",
    price: 40
  }, {
    id: 7,
    itemName: "Grapes",
    price: 30
  }, {
    id: 8,
    itemName: "Mango",
    price: 100
  }]
   let searchBar=document.querySelector("#search-bar");
  let table=document.querySelector("table");
    console.log("hello ");
const createTableBody=function(){
     let createHead=document.createElement("tr");
     let createid=document.createElement("th");
     createid.innerText="id";

       let createname=document.createElement("th");
     createname.innerText="itemName";

       let createprice=document.createElement("th");
     createprice.innerText="price";

     createHead.appendChild(createid);
      createHead.appendChild(createname);
       createHead.appendChild(createprice);

       table.appendChild(createHead);
}

const tableData=function(item){
   const fragmentDocument=document.createDocumentFragment();
item.forEach(function(billItems){
 
  let tablerow=document.createElement("tr");
  let tableid=document.createElement("td");
  tableid.innerText=billItems.id;

  let tablename=document.createElement("td");
  tablename.innerText=billItems.itemName;

   let tableprice=document.createElement("td");
  tableprice.innerText=billItems.price;

tablerow.appendChild(tableid);
tablerow.appendChild(tablename);
tablerow.appendChild(tableprice);
fragmentDocument.appendChild(tablerow);
});
table.appendChild(fragmentDocument);
}


const createTable=function(billItems){
  table.innerHTML="";
  if(!(billItems && billItems.length)){
    table.innerText="No items found!";
    return;
  }
  createTableBody();
tableData(billItems);
}
const update=function(event){
    console.log(event.target.value);
const inputuser=event.target.value;

const billItemsall=billItems.filter(function(billItem){
  return billItem.itemName.toLowerCase().includes(inputuser.toLowerCase());

});
console.log(billItemsall);
createTable(billItemsall);
}
















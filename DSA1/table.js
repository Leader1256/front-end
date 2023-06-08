const nameElement = document.querySelector("#name"); // returns JS Object to play with...lets store that object in a variable
const ageElement =  document.querySelector("#age");
const submitElement = document.querySelector("#submit");
const dummyPlaceholder = document.querySelector("#dummy-placeholder");


const tableElement = document.createElement('table');
dummyPlaceholder.appendChild(tableElement);
function addData() {
    const enteredName = nameElement.value;
    const tableRow = document.createElement("tr");
    const tableColumn = document.createElement("td");
    tableColumn.innerText = enteredName;
    tableRow.appendChild(tableColumn);
    tableElement.appendChild(tableRow);
}

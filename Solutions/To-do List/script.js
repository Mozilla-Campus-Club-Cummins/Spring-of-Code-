
// The script of the index file 
let taskList = [];
function addTask() 
{
let taskInput = document.getElementById("task");
let task = taskInput.value;
if (task !== "") {
taskList.push(task);
let li = createTaskElement(task);
li.className="list-group-item";
document.getElementById("taskList").appendChild(li);
taskInput.value = "";
}
}

function createTaskElement(task) {  
// Creating a new task and adding it to list
let li = document.createElement("li");
li.innerText = task;
li.id="mylistitem";                   
let doneButton = document.createElement("button");
doneButton.className="btn btn-primary ";
doneButton.innerText = "Done";
doneButton.style.float="right";
doneButton.onclick = function() {
doneTask(li);
};
li.appendChild(doneButton);
let deleteButton = document.createElement("button");
deleteButton.className="btn btn-danger"
deleteButton.innerText = "Delete";
deleteButton.style.float="right";
deleteButton.onclick = function() {
deleteTask(li);
};
li.appendChild(deleteButton);
return li;
}
// function called when task is done to mark it as done
function doneTask(li)
{
li.className="list-group-item list-group-item-success";
}
// function called when task is deleted to mark it as deleted
function deleteTask(li) {
let task = li.innerText;
let index = taskList.indexOf(task);
taskList.splice(index, 1);
li.remove();
}

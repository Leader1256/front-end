// Get the draggable items
const draggableItems = document.querySelectorAll('.draggableItem');

// Get the droppable area
const droppableArea = document.getElementById('droppableArea');

// Add event listeners for drag events
draggableItems.forEach(item => {
  item.addEventListener('dragstart', dragStart);
  item.addEventListener('dragend', dragEnd);
});

// Add event listeners for drop events
droppableArea.addEventListener('dragover', dragOver);
droppableArea.addEventListener('dragenter', dragEnter);
droppableArea.addEventListener('dragleave', dragLeave);
droppableArea.addEventListener('drop', drop);

// Add event listener for reset button
const resetButton = document.getElementById('resetButton');
resetButton.addEventListener('click', reset);

// Keep track of the dragged item
let draggedItem = null;

// Drag functions
function dragStart() {
  draggedItem = this;
  setTimeout(() => {
    this.style.opacity = '0.5'; // Add visual feedback
  }, 0);
}

function dragEnd() {
  this.style.opacity = '1';
}

function dragOver(e) {
  e.preventDefault();
}

function dragEnter(e) {
  e.preventDefault();
  this.style.backgroundColor = '#f1f1f1'; // Add visual feedback
}

function dragLeave() {
  this.style.backgroundColor = '#e1e1e1';
}

function drop() {
  this.appendChild(draggedItem);
  this.style.backgroundColor = '#e1e1e1';
  showMessage('Item dropped successfully!');
}

function reset() {
  droppableArea.innerHTML = '';
  showMessage('Containers reset!');
}

// Helper function to display a message
function showMessage(message) {
  const messageDiv = document.createElement('div');
  messageDiv.innerText = message;
  droppableArea.appendChild(messageDiv);
}

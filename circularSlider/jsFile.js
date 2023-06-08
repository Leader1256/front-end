const images = document.querySelectorAll('.slider-image');
const infoSection = document.getElementById('image-info');
const prevBtn = document.getElementById('prev-btn');
const nextBtn = document.getElementById('next-btn');

let currentIndex = 0;

// Show image info and highlight the active image
function showImageInfo(index) {
  images.forEach((image, i) => {
    if (i === index) {
      image.classList.add('active');
      infoSection.style.display = 'block';
      infoSection.innerHTML = `<h2>${image.alt}</h2><p>Description of ${image.alt}</p>`;
    } else {
      image.classList.remove('active');
    }
  });
}

// Next button click event
nextBtn.addEventListener('click', () => {
  currentIndex++;
  if (currentIndex >= images.length) {
    currentIndex = 0;
  }
  showImageInfo(currentIndex);
});

// Prev button click event
prevBtn.addEventListener('click', () => {
  currentIndex--;
  if (currentIndex < 0) {
    currentIndex = images.length - 1;
  }
  showImageInfo(currentIndex);
});

// Initial setup
showImageInfo(currentIndex);

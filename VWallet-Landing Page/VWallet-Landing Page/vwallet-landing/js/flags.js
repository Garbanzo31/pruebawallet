const flagsButton = document.querySelector('.flags-button');
const flagsContainer = document.querySelector('.flags-container');
const flagsArrowRight = document.querySelector('.flags-arrow-right');
const flagsArrowDown = document.querySelector('.flags-arrow-down');

flagsButton.addEventListener('click', () => {
  flagsContainer.classList.toggle('active');
  flagsArrowRight.classList.toggle('active');
  flagsArrowDown.classList.toggle('active');
});

flagsContainer.addEventListener('click', (e) => {
  dataLanguage = e.target.parentElement.dataset.language;
  if (dataLanguage != undefined) {
    changeLanguage(dataLanguage);
  }
});

const textsToChange = document.querySelectorAll('[data-section]');

const changeLanguage = async language => {
  const requestJSON = await fetch(`../languages/${language}.json`);
  const texts = await requestJSON.json();
  
  for(const text of textsToChange) {
    const section = text.dataset.section;
    const value = text.dataset.value;
    text.innerHTML = texts[section][value];
  }

  if (language == 'en') {
    localStorage.setItem('currentLanguage', 'english');
  } else {
    localStorage.removeItem('currentLanguage');
  }
};

const currentLanguage = localStorage.getItem('currentLanguage');
if (currentLanguage) {
  changeLanguage('en');
}
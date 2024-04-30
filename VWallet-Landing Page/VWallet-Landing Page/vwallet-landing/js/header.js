const headerMenuBar = document.querySelector(".header-menu-bar");
const openMenu = document.querySelector(".open-menu");
const closeMenu = document.querySelector(".close-menu");
const headerMenu = document.querySelector(".header-menu");

headerMenuBar.addEventListener("click", () => {
  openMenu.classList.toggle("active");
  closeMenu.classList.toggle("active");
  headerMenu.classList.toggle("active");
});

document.addEventListener("DOMContentLoaded", function(event){
	var menu = document.querySelector('.nav-item.dropdown');
	var dropdown = document.querySelector('.dropdown-menu');

	menu.addEventListener('click', function(){
		dropdown.style.display = 'block';	
		i = false;
	});
});
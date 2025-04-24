function initDestinosPage() {
  // Mostrar/ocultar filtros
  const filterBtn = document.getElementById('filter-btn');
  const filterOptions = document.getElementById('filter-options');

  if (filterBtn && filterOptions) {
    filterBtn.addEventListener('click', function () {
      filterOptions.classList.toggle('active');

      // Cambiar el ícono según el estado
      const icon = this.querySelector('i');
      if (filterOptions.classList.contains('active')) {
        icon.classList.remove('fa-filter');
        icon.classList.add('fa-times');
      } else {
        icon.classList.remove('fa-times');
        icon.classList.add('fa-filter');
      }
    });
  }

  // Efecto hover en botones de ver terminales
  const terminalesBtns = document.querySelectorAll('.ver-terminales-btn');
  terminalesBtns.forEach((btn) => {
    btn.addEventListener('mouseenter', function () {
      const icon = this.querySelector('i');
      icon.style.transform = 'translateX(3px)';
    });

    btn.addEventListener('mouseleave', function () {
      const icon = this.querySelector('i');
      icon.style.transform = 'translateX(0)';
    });
  });

  // Función de búsqueda (simulada)
  const searchInput = document.querySelector('.search-box input');
  if (searchInput) {
    searchInput.addEventListener('input', function () {
      const searchTerm = this.value.toLowerCase();
      const destinoCards = document.querySelectorAll('.destino-card');

      destinoCards.forEach((card) => {
        const destinoName = card.querySelector('h2').textContent.toLowerCase();
        card.style.display = destinoName.includes(searchTerm)
          ? 'block'
          : 'none';
      });
    });
  }
}

initDestinosPage();

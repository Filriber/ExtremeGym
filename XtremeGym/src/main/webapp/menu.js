window.addEventListener("scroll", function() {
    let header = document.querySelector('#headers')
    header.classList.toggle('rolagem', window.scrollY>0)

})
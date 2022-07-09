
function mostrarLibro(){
     let libro = cargarLibro();
     alert("ISBN: " + libro.isbn +" Titulo: "+libro.titulo + " Autor: " + libro.autor +" Numero de paginas: "+ libro.numPaginas);
}

function cargarLibro(){
    var isbn = prompt("Ingrese ISBN:") ;
    var titulo = prompt("Ingrese titulo:") ;
    var autor = prompt("Ingrese autor:") ;
    var numPaginas = prompt("Ingrese numero de paginas:");
    let libro = new Libro(isbn , titulo , autor , numPaginas);
    return libro;
}

function Libro(isbn , titulo , autor , numPaginas) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.autor = autor;
    this.numPaginas = numPaginas;
}


mostrarLibro();




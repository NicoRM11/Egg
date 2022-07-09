
let formulario = document.getElementById("form1");
let nombre = document.getElementById("nombre");
let apellido = document.getElementById("apellido");
let ul = document.getElementById("lista");


formulario.onsubmit = function(){
    let nombreVuelta = document.getElementById("nombre").value;
    let apellidoVuelta = document.getElementById("apellido").value;
    
    agregar(nombreVuelta , apellidoVuelta);
    
}

function agregar(nombre , apellido){
    let liNombre = document.createElement("li");
    let liApellido = document.createElement("li");
    liNombre.innerHTML = nombre;
    liApellido.innerHTML = apellido;
    ul.append(liNombre);
    ul.append(liApellido);
}




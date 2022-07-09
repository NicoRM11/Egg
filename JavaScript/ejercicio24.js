
let boton = document.getElementById("btn");


let resultado = document.getElementById("resultado");

boton.onclick = function() {
    let radio = document.getElementById("radio").value;
    resultado.innerText = `El area es:${calculoArea(radio)} y el perimetro es:${calculoPerimetro(radio)} `
    
}

calculoArea = (radio) => Math.pow(radio,2) * Math.PI;

function calculoPerimetro(radio){
    let perimetro = radio * 2 * Math.PI; 
    return perimetro;
}


   














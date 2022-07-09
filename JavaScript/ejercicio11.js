

var frase = prompt("Ingrese una frase:");

function vuelta(frase){
    var arrayFrase = frase.split(" ");

    var palabraMasLarga = arrayFrase[0];

    for(palabra of arrayFrase){
        
        if(palabra.length >= palabraMasLarga.length){
            palabraMasLarga = palabra;
        }
        
    }
    return palabraMasLarga;
}

alert ("La palabra mas larga es: " + vuelta(frase));
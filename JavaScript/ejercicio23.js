
let boton = document.getElementById("btn");

let parrafo = document.getElementById("parrafo");

let array = parrafo.innerText.split(" ");

//al hacer click el usuario las palabras que tengan mas de 8 caracteres del primer parrafo, se ponen de fondo amarillo
boton.onclick = function() {
      
    for (let i = 0; i < array.length; i++){

        if (array[i].length > 8) {
            array[i] = '<span style= "background-color:yellow">' + array[i] + '</span>';
        }


    }

    let texto = array.join(" ");
    
    //2da opcion para realizar el ejercicio
    /*
    let texto = array.toString();
    var re = /,/gi;
    let newTexto = texto.replace( re , " ");
    document.getElementById("parrafo").innerHTML = newTexto;

    */
    document.getElementById("parrafo").innerHTML = texto;

}
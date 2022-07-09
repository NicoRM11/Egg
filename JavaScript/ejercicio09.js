
var frase = prompt("Ingrese una frase:");
var fraseSeparada = "";

for(i=0 ; i < frase.length ; i++){
   
   letraxletra = frase.substring(i,i+1);

   fraseSeparada = fraseSeparada + " " + letraxletra;

}

alert("La frase separada es:" + fraseSeparada);
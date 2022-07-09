

var num = prompt("Ingrese un valor limite positivo:");

var sumatoria = 0;
do{
   var numAdicion =  prompt("Ingrese un numero para adicionar");
   sumatoria = sumatoria + parseInt(numAdicion);
   console.log(sumatoria);
} while(sumatoria <= num);

alert("Se ah superado el limite establecido");

alert('Ingrese numeros hasta teclear el numero 0');
var sumatoria = 0;
var cont = 0;
var max = 0;
var min = 0;

do {    
var num = prompt ("Ingrese numero:");
    //establezco valores iniciales para maximo y minimo
    if(max == 0 && min == 0){
        max = num;
        min = num;
    }
    //hago cuentas
    if(num != 0){
    sumatoria = sumatoria + parseFloat(num);
    cont = cont + 1;
    if(parseFloat(num) >= max){
        max = parseFloat(num);
    } else if(parseFloat(num) < min){
        min = parseFloat(num);
    }
     }

} while (num != 0)

var promedio = sumatoria / cont; 

alert(`-El maximo numero ingresado es:` + max + 
         `-El minimo numero ingresado es: ` + min +
         `-El promedio es: ` + promedio );
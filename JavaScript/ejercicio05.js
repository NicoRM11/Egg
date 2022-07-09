

var num1 = prompt("Ingrese un primer numero:");
var num2 = prompt("Ingrese un segundo numero:");

var letra = prompt(`Que operacion desea realizar?
                    -multiplicacion(ingrese m)
                    -division(ingrese d)
                    -suma(ingrese s)
                    -resta(ingrese r)`);

switch(letra){
    case "m" || 'M' :
        var resultado = num1 * num2;
    break;
    case 'M' :
        var resultado = num1 * num2;
    break;
    case 'd' :
        var resultado = num1 / num2;
    break;
    case 'D' :
        var resultado = num1 / num2;
    break;
    case 's' :
        var resultado = num1 + num2;
    break;
    case 'S' :
        var resultado = num1 + num2;
    break;
    case 'r' :
        var resultado = num1 - num2;
    break;
    case 'R' :
        var resultado = num1 - num2;
    break;
    default:
        resultado = null;
}

alert("El resultado de la operacion elegida es: " + resultado);
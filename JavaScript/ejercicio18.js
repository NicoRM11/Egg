//creacion del array
var valores = [true,5,false,"hola","adios",2];


//nuevo array con valores String
let arrayString = valores.splice(3,3);
arrayString.splice(2,1);

//calculo cual de los dos String es mayor
if(arrayString[0].length > arrayString[1].length){
     console.log(` ${arrayString[0]} es mayor` )
} else {
    console.log(` ${arrayString[1]} es mayor` )
};

//nuevo array con solo booleanos
valores = [true,5,false,"hola","adios",2];
let arrayBooleanos = valores.splice(0,3);
arrayBooleanos.splice(1,1);
console.log(`El array de booleanos es: ${arrayBooleanos[0]} o ${arrayBooleanos[1]} `);


//nuevo array con solo valores numericos
valores = [true,5,false,"hola","adios",2];
let arrayNumeros = valores.splice(1,5);
arrayNumeros.splice(1,3);

//operaciones matematicas con elementos del array
console.log(`suma de ${arrayNumeros[0]} + ${arrayNumeros[1]} : ` + (arrayNumeros[0] + arrayNumeros[1]));
console.log("resta: " + (arrayNumeros[0] - arrayNumeros[1]));
console.log("multiplicacion: " + (arrayNumeros[0] * arrayNumeros[1]));
console.log("division: " + (arrayNumeros[0] / arrayNumeros[1]));


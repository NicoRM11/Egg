let arrayA = [];
let arrayB = [];

//relleno de arrays
for (let i = 0; i < 50; i++) {
    arrayA[i] = parseInt(Math.random()*100); 
}

for (let i = 0; i < 20; i++) {
    arrayB[i] = parseInt(Math.random()*100); 
}

//ordenar array A de menor a mayor
function compareNumeric(a, b) {
    if (a > b) return 1;
    if (a == b) return 0;
    if (a < b) return -1;
}
arrayA.sort(compareNumeric);

//copiar primeros 10 elementos de A, ponerlos en B, y rellenar la otra mitad de B con el valor 5
arrayB.splice(0,10, arrayA[0],arrayA[1],arrayA[2], arrayA[3], arrayA[4], arrayA[5], arrayA[6], arrayA[7], arrayA[8], arrayA[9]);
arrayB.splice(10,10, 5,5,5,5,5,5,5,5,5,5);

//muestra de array A ordenado, y muestra de array B con sus operaciones
console.log(arrayA);
console.log(arrayB);


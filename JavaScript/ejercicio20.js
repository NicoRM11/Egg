/*obtencion de matriz, conversion a array, luego se corta el mismo, se agrega el num 18 
y se muestra por pantalla
*/

var matriz = [[3], [6], [9], [12], [15]];

let array1 = matriz.flat();
array1.splice(0,1);
array1.splice(4,0,18);
console.log(array1);
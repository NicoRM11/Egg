let vector1 = [];
let vector2 = [];

//relleno de vectores, aleatoriamente
for (let i = 0; i < 5; i++){
  vector1[i] = parseInt(Math.random()*100); 
  vector2[i] = parseInt(Math.random()*100);
}

//muestra de vectores
for (const aux of vector1) {
    console.log(aux)
}

for (const aux of vector2) {
    console.log(aux)
}


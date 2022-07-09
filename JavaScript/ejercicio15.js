

var radio = prompt("Ingrese radio:");


 function areaCircunferencia(radio){
 return (Math.PI * Math.pow(radio , 2));  
}

 function perimetroCircunferencia(radio){
 return (2*Math.PI*radio);
}

var area = areaCircunferencia(radio);
var perimetro = perimetroCircunferencia(radio);

alert(`El area de la circunferencia es: ${area} 
       y su perimetro es: ${perimetro}`);
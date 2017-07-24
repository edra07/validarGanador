Imagen = function(){
	var = farm;
	var = id;
	var = server;
	var = secret;
}
this.setImgen = function(n){
	farm =n;
	id =n;
	server =n;
	secret =n;
}
this.getImagen = function(){
	return = id;
}
$(document).ready(function(){
	var imagen1 = new Imagen();
	Imagen.setImgen("5","");
}) 

function Imagen(short far, short id, short server, short secret) {
  this.far = far;
  alert('Una instancia de far imagen');
}

var imagen1 = new Imagen("VER IMAGEN 1");
var imagen2 = new Imagen("VER IMAGEN 2");

// Muestra el primer nombre de persona1
alert ('prueba para ver ' + imagen1.primerNombre); // muestra "persona1 es Alicia"
alert ('prueba para ver' + imagen2.primerNombre); // muestra "persona2 es Sebastian"

var areglo =[1,2,3,4];
areglo[0]="hola";
for (var i = 0; i<areglo[0].length; i++) {
  console.log(areglo[0][i]);

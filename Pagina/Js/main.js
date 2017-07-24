console.clear();
function newImagen(){
  this.info = 'son img1';
  this.mostrarInfo =function(){
    alert(this.info);
  }
}
 var img = new newImagen(); //https://www.youtube.com/watch?v=bLA3IOzSFRg


//Arreglo para mostrar imagenes
    var arreglo = [20];
    arreglo[0] = "5";
    arreglo[1] = "2";
    for (var i = 0; i<arreglo[0].length; i++) {
      console.log(arreglo[i]);
//sustituir el link
  var link = "https://farm{farm-id}.staticflickr.com/{server-id}/{id}_{secret}.jpg"
  var nuevainfo = link.replace("{farm-id}",arreglo[1]);
  document.write(nuevainfo); //https://www.youtube.com/watch?v=nyoF_vtaCOs&t=473s Replace
    }
 
   var cadena = "amaya, julio, miguel ángel, elena, saira, nacho, andrea";
  var nombres = cadena.split(",");
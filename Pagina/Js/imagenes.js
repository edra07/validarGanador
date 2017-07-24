function img (farm,id,server,secret,name){
	this.farm =farm;
	this.id =id;
	this.server =server;
	this.secret =secret;
	this.title=name;
	this.saluda = function(){console.log("hola"+this.farm+this.title);
	}
	
}

var imagen2 = new img(  "id": "35639849520", "owner": "57090561@N08", "secret": "24d294453b", "server": "4292", "farm": 5, "title": "Signs", "ispublic": 1, "isfriend": 0, "isfamily": 0 );
imagen2.saluda();
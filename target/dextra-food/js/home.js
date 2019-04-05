$(document).ready(function() {
    $.ajax({
        url: "http://localhost:9090/cardapio"
    }).then(function(data) {

       $.each(data, function(key,value){
    	  // console.log(value);

        	   
           });
      
    });
});

$.getJSON("http://localhost:9090/cardapio", function(data){
	var keys = [];
	var values = [];
	var lancheData = '';        
        
	
	$.each(data, function(key,value){
		 keys.push(key);
		 values.push(value.ingredientes);

         var ingredientes ='';
		 for (var i = 0; i < value.ingredientes.length; i++) {
			 ingredientes += JSON.stringify(value.ingredientes[i].nome).substring(1).replace('\"',', ');
		 }  
                 
                 lancheData +='<div class="col-md-4">';
		 		 lancheData +='<div class="card mb-4 shadow-sm">';
		 		 //lancheData +='<img src="img/'+value.descricao+'.jpg"  width="351" height="224"/>';
                 lancheData +='<svg class="bd-placeholder-img card-img-top" width="100%" height="225" xmlns="img/xbacon." preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: Thumbnail"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">'+value.descricao+'</text></svg>';
                 //lancheData +='<h2>'+value.descricao+'</h2>';
                 lancheData +='<div class="card-body">';                 
                 lancheData +='<p class="card-text">'+ingredientes.substring(0,ingredientes.length-2)+'.</p>'; 
                 lancheData +='<p class="card-text">'+numberToReal(value.valorDoLanche)+'</p>';                               
                 lancheData +='<div class="d-flex justify-content-between align-items-center">';
                 lancheData +='<div class="btn-group">';
                 lancheData +='<button type="button" onclick="location.href=\'resultado-cardapio.html\'" class="btn btn-sm btn-outline-secondary">Realizar pedido</button>';
                 lancheData +='</div>';

                 lancheData +='</div>';
                 lancheData +='</div>';
                 lancheData +='</div>';
                 lancheData +='</div>';

  });
  
 $("#dadosLanche").append(lancheData);
  

});


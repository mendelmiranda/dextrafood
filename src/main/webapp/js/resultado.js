$.getJSON('http://localhost:9090/solicitar', function(data) {
	
	    var lancheData = '';

	    var ingredientes ='';
	    var quantidade = '';
	    var verificaIngrediente = '';
	    var mensagemPromocao = '';

	    var temBacon  = false;
	    var temAlface = false;
	    
		 for (var i = 0; i < data.ingredientes.length; i++) {
			 verificaIngrediente = JSON.stringify(data.ingredientes[i].nome).substring(1).replace('\"',' ');

			if(verificaIngrediente.startsWith('Bacon')){
				 temBacon = true;
			}

			if(verificaIngrediente.startsWith('Alface')){
				 temAlface = true;
			}
			
			 var bacon = verificaIngrediente.startsWith("Bacon");
			 var alface = verificaIngrediente.startsWith("Alface");

			 
			 
			 ingredientes += JSON.stringify(data.ingredientes[i].nome).substring(1).replace('\"',' ')+
			 ' - Quantidade: '+JSON.stringify(data.ingredientes[i].quantidade)
			 + ' Valor unitário: ' +numberToReal(data.ingredientes[i].valor)+' <br />';
			 
		 }

		 if(temBacon){
			 mensagemPromocao +='';
		 }

		 if(temAlface && !temBacon){
			 mensagemPromocao +='Seu pedido entrou na promoção Light! Por isso você ganhou um desconto de 10%.';
		 }			

        lancheData +='<h4>'+data.descricao+'</h4>';  
        lancheData +=ingredientes+'<br />';       
        lancheData +='<b>Valor Total:</b> '+ numberToReal(data.valorDoLanche)+'<br />';   
        lancheData += mensagemPromocao; 

        $("#dadosResultado").append(lancheData);  
   
});
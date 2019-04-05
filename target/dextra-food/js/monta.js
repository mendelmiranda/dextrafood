$(document).ready(function() {
   
});

$.getJSON("http://localhost:9090/ingredientes", function(data){
	var keys = [];
	var values = [];
	
        var ingrediente = '';        
        var ingredienteData = '';

        
	
	$.each(data, function(key,value){
        ingrediente = value.nome;

        ingredienteData +='<input type="checkbox" value="'+value.nome+'" name="ingredientes" onchange="document.getElementById(\'enviar\').disabled = !this.checked;" /> '+ingrediente+' <br />';
        ingredienteData +='<label for="quantidade'+ingrediente+'">Quantidade: </label>';
        ingredienteData +='<select  style="width:60px;" id="quantidade'+ingrediente+'" name="quantidade'+ingrediente+'">';
        ingredienteData +='<option>1</option>';
        ingredienteData +='<option>2</option>';
        ingredienteData +='<option>3</option>';
        ingredienteData +='<option>4</option>';
        ingredienteData +='<option>5</option>';
        ingredienteData +='<option>6</option>';
        ingredienteData +='<option>7</option>';
        ingredienteData +='<option>8</option>';
        ingredienteData +='<option>9</option>';
        ingredienteData +='<option>10</option>';
        ingredienteData +='</select>';
        ingredienteData +='</br >';

  });
  
 $("#dadosIngrediente").append(ingredienteData);
  

});
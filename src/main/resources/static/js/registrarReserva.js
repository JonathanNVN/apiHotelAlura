// Call the dataTables jQuery plugin
$(document).ready(function() {
	//on ready
});

async function registrarReserva(){	
		
	let datos = {};	
	datos.reservaid = document.getElementById('txtIdReservaC').value
	
  const request = await fetch('api/reservas', {
    method: 'POST',
    headers: getHeaders(),
    body: JSON.stringify(datos)
  });
  alert("Reserva registrada!");
}

function getHeaders(){
	return {
      'Accept': 'application/json',
      'Content-Type': 'application/json',     
    };
}
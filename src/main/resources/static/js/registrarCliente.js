// Call the dataTables jQuery plugin
$(document).ready(function() {
	//on ready
});

async function registrarCliente(){	
		
	let datos = {};	
	datos.nombre = document.getElementById('txtNombreC').value
	datos.apellido = document.getElementById('txtApellidoC').value
	datos.nacimiento = document.getElementById('fNacimientoC').value
	datos.nacionalidad = document.getElementById('nacionalidadC').value
	datos.telefono = document.getElementById('txtTelefonoC').value
	datos.reservaid = document.getElementById('txtIdReservaC').value
	


  const request = await fetch('api/clientes', {
    method: 'POST',
    headers: getHeaders(),
    body: JSON.stringify(datos)
  });
  alert("El nuevo cliente fue creado con éxito!");
  window.location.href = 'clientes.html';
}

function getHeaders(){
	return {
      'Accept': 'application/json',
      'Content-Type': 'application/json',
      'Authorization': localStorage.token
    };
}
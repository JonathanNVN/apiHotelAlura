// Call the dataTables jQuery plugin
$(document).ready(function() {
	//on ready
});

async function registrarUsuarios(){	

	let datos = {};
	datos.nombre = document.getElementById('txtNombre').value
	datos.apellido = document.getElementById('txtApellido').value
	datos.email = document.getElementById('txtEmail').value
	datos.contrasena = document.getElementById('txtPassword').value
	
	let repetirPassword = document.getElementById('txtRepetirPasword').value
	
	if(repetirPassword != datos.contrasena){
		alert('La contraseña que escribiste es diferente');
		return;
	}
	
  const request = await fetch('api/usuarios', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(datos)
  });
  alert("La cuenta fue creado con éxito!");
  window.location.href = 'login.html';
}


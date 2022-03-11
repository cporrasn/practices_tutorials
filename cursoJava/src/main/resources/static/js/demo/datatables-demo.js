// Call the dataTables jQuery plugin
$(document).ready(function() {
  cargarUsuario();
  $('#dataTable').DataTable();
});

async function cargarUsuario(){

    const request = await fetch('/usuario/234666', {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
    });
    const usuarios = await request.json();
    console.log(usuarios);
}

#language:es

Característica: Actualizar nombre de empleado
  Como usuario quiero iniciar sesión exitosamente y cambiar el nombre del empleado en una orden de compra
  Antecedentes:
    Dado que el usuario ha abierto el navegador en la página de inicio de sesion
    Y El usuario ingresa las credenciales validas
    Y el usuario está en el dashboard

  @ActualizarNombre
  Escenario: Cambio de nombre de empleado en una orden de compra existente
    Dado que  el usuario hace clic en Open Orders
    Cuando el usuario selecciona una orden de compra existente
    Y el usuario hace clic en el selector de empleado
    Y el usuario selecciona un empleado de la lista
    Y el usuario confirma que el nombre seleccionado es el deseado
    Y el usuario hace clic en Save
    Entonces el nombre del empleado en la orden de compra se actualiza correctamente

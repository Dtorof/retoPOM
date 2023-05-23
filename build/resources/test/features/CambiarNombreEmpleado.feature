#language:es

Característica: Actualizar nombre de empleado
  Como usuario quiero iniciar sesión exitosamente y cambiar el nombre del empleado en una orden de compra
  Antecedentes:
    Dado que el usuario abre el navegador en la url
    Cuando El usuario limpie los campos e ingrese las credenciales

  @ActualizarNombre
  Escenario: Cambio de nombre de empleado en una orden de compra
    Y el usuario hace clic en Open Orders
    Cuando el usuario hace clic en una orden de compra
    Y el usuario hace clic en el selector de empleado
    Y selecciona un empleado de forma aleatoria
    Y el usuario hace clic en Save
    Entonces el nombre del empleado en la orden de compra se actualiza

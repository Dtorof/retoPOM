#language:es

Característica:  Inicio de sesion
  Como usuario quiero poder iniciar sesión correctamente para acceder a mi dashboard

  @Logeo
  Escenario: Inicio de sesion exitoso con credenciales validas
    Dado que el usuario ha abierto el navegador en la página de inicio de sesion
    Cuando el usuario  limpia los campos y ingresa las credenciales
    Entonces el usuario es redirigido al dashboard

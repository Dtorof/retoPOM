#language:es

Característica: Inicio de sesion
  Yo como usuario quiero validar un
  inicio de sesion exitoso

  @Logeo
  Escenario: Inicio de sesion exitoso
    Dado que el usuario abre el navegador en la url
    Cuando el usuario  limpia los campos y ingresa las credenciales
    Entonces el usuario puede visualizar el dashboard

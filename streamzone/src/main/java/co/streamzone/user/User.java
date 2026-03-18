package co.streamzone.user;

import co.streamzone.Strategies.iRecomendBy;

public class User {
          private String nombre;
          private String contenido;
          private iRecomendBy recomendations;




          public User(String nombre, String contenido, iRecomendBy recomend){
                    this.nombre = nombre;
                    this.contenido = contenido;
                    this.recomendations = recomend;
          }

          public String getNombre() {
                    return nombre;
          }

          public void setNombre(String nombre) {
                    this.nombre = nombre;
          }
          public String getContenido() {
                    return contenido;
          }
          public void setContenido(String contenido) {
                    this.contenido = contenido;
          }          
          public void setRecomendations(iRecomendBy recomendations) {
                    this.recomendations = recomendations;
          }

}

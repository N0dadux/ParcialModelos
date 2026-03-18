package co.metromovil.observer;

public class CommunicationR implements iObserver{

          @Override
          public void update(int notification) {
                    System.out.println("El numero de cambios de rutas es  " + notification);

          }

}

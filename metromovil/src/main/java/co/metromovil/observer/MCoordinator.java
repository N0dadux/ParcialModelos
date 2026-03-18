package co.metromovil.observer;

public class MCoordinator implements iObserver {

          @Override
          public void update(int notification) {
                    System.out.println("Los cambios en las rutas de la ciudad " + notification);
          }

}

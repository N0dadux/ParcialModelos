package co.metromovil.observer;

public class TSurpervisor implements iObserver{

          @Override
          public void update(int notification) {
                    System.out.println("El numero de mantenimientos de estaciones o fallas es " + notification);
          }

}

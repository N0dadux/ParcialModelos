package co.metromovil.subject;

import java.util.ArrayList;

import co.metromovil.observer.CommunicationR;
import co.metromovil.observer.MCoordinator;
import co.metromovil.observer.TSurpervisor;
import co.metromovil.observer.iObserver;

public class MetroMovilStatus implements iSubject {

          ArrayList<iObserver> suscriptors;
          int[] data;

          public MetroMovilStatus(int[] data) {
                    suscriptors = new ArrayList<iObserver>();
                    this.data = data;
          }

          @Override
          public void addObserver(iObserver observer) {
                    suscriptors.add(observer);
          }

          @Override
          public void removeObserver(iObserver observer) {
                    suscriptors.remove(observer);
          }

          @Override
          public void notifyObserver() {
                    for (iObserver sus : suscriptors) {
                              if (sus instanceof MCoordinator) {
                                        sus.update(data[0]);
                              }
                              if (sus instanceof TSurpervisor) {
                                        sus.update(data[1]);

                              }
                              if (sus instanceof CommunicationR) {
                                        sus.update(data[2]);
                              }
                    }
          }

          public ArrayList<iObserver> getSuscriptors() {
                    return suscriptors;
          }

          public void setSuscriptors(ArrayList<iObserver> suscriptors) {
                    this.suscriptors = suscriptors;
          }

}

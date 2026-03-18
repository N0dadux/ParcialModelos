package co.metromovil.subject;

import co.metromovil.observer.iObserver;

public interface iSubject {
          public void addObserver(iObserver observer);
          public void removeObserver(iObserver observer);
          public void notifyObserver();
}

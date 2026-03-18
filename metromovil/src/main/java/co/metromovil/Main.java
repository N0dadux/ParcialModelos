package co.metromovil;


import co.metromovil.observer.CommunicationR;
import co.metromovil.observer.MCoordinator;
import co.metromovil.observer.TSurpervisor;
import co.metromovil.observer.iObserver;
import co.metromovil.subject.MetroMovilStatus;

public class Main {
    public static void main(String[] args) {
        iObserver CR = new CommunicationR();
        iObserver MC = new MCoordinator();
        iObserver TS = new TSurpervisor();

        int[] data = {1,2,3};
        
        MetroMovilStatus mms = new MetroMovilStatus(data);
        mms.addObserver(TS);
        mms.addObserver(MC);
        mms.addObserver(CR);
        mms.notifyObserver();
    }
}
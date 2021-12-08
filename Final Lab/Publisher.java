import java.util.ArrayList; //import array list untuk mengubah data

public class Publisher implements Observable { //implements class Observable
    private ArrayList<Observer> cust = new ArrayList<>(); //create new object untuk semua method yang diberikan pada customer
    
    //overide method class Observable
    @Override
    public void addObserver(Observer observer) {
        cust.add(observer);
    }

     @Override
    public void removeObserver(Observer observer) {
        cust.remove(observer);
    }

    @Override
    public void notif(String n) {
        for (Observer customer : cust) {
            customer.update(n);
        }
    }
}

//class subject design observer, subject tersebut ialah publisher
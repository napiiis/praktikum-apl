public class Customer implements Observer { //implements class Observer
    private String pembeli;

    public Customer (String pembeli) {
        this.pembeli = pembeli;
    }

    @Override //overide method update agar notifikasi diterima customer
    public void update(String n) {
        Magz type = new Sports(new Lifestyle(new Type())); //implements decorator pattern
        System.out.println("Brand new magazine " + n + "this is " + this.pembeli + " chance to get your newly " + type.decorate() + "' at the nearest store."); //this.pembeli berlaku untuk pembeli dan type.decorate berlaku untuk memanggil method decorate pada class type
    }

}

// class customer berguna sebagai observer, class ini juga berguna untuk implements Design Decorator Pattern
// method decorate berguna untuk mendekorasi class Sports dan Lifestyle
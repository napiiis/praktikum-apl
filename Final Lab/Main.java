class Main {
    public static void main (String[] args) {
         
        Observable admin = new Publisher(); //create new object dari class Publisher
        //create 3 object sebagai observer
        Observer cust1 = new Customer("Muhammad Ikbal Firdausy");
        Observer cust2 = new Customer("Mufti Ahmad");
        Observer cust3 = new Customer("Mikail Rifqi");

        admin.addObserver(cust1);
        admin.addObserver(cust2);
        admin.addObserver(cust3);

        admin.notif("has been published, "); //memanggil notifikasi yang disebarkan subject
    }
}


// Magazine Store (Toko Majalah)
// 
// Customer akan mendapatkan notifikasi terkait majalah" terbaru yang diterbitkan dengan jenis majalahnya. 
// Jenis majalah tersebut bisa berupa majalah olahraga/sports dan gaya hidup/lifestyle.
// 

public class Lifestyle extends MagzDecor { //extends class MagzDecor
    public Lifestyle(Magz magz) {
        super(magz); //method super akan mengidentifikasi object dari class Magz (Magazine)
    }

    public String decorate() {
        return super.decorate() + this.decorateWithLifestyle(); //method this akan mengidentifikasi object dari class Lifestyle
    }

    public String decorateWithLifestyle() {
        return "Lifestyle Magazine"; //akan mengembalikan nilai dari Lifestyle
    }
}

//class decorator pertama dari object decorator Magz (Magazine)
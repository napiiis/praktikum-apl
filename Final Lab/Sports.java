public class Sports extends MagzDecor { //extends class MagzDecor
    public Sports(Magz magz) {
        super(magz); //method super akan mengidentifikasi object dari class Magz (Magazine)
    }

    public String decorate() {
        return super.decorate() + this.decorateWithSports(); //method this akan mengidentifikasi object dari class Sports
    }

    public String decorateWithSports() {
        return " and Sports Magazine"; //akan mengembalikan nilai dari Sports
    }
}

//class decorator kedua dari object decorator Magz (Magazine)
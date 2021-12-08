public abstract class MagzDecor implements Magz { //implements interface Magz
    private Magz magz;

    public MagzDecor(Magz magz) {
        this.magz = magz;
    }
    
    @Override //overide method decorate
    public String decorate() {
        return magz.decorate();
    }
}

//implements interface Magz dan override method decorate interface Magz
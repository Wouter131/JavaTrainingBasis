package polymorphism;

class Hond extends Dier {
    @Override
    public void geluidMaken() {
        System.out.println("De hond blaft.");
    }

    //Overloaded methode (andere argumenten)
    public void geluidMaken(String geluid) {
        System.out.println("De hond maakt het geluid: " + geluid);
    }
}

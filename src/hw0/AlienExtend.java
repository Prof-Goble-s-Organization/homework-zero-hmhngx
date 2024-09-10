package hw0;

public class AlienExtend extends SpaceAlien implements ZapsWithSlime{

    private int spaceships;

    public AlienExtend(int spaceships, String homePlanet, double distanceFromEarth) {
        super(homePlanet, distanceFromEarth);
        this.spaceships = spaceships;
    }

    @Override
    public String doSlimeZap(int numHumans) {
        // TODO Auto-generated method stub
        return("We are going turn " + numHumans + " into slime.");
    }

    @Override
    public String slimeWholeEarth() {
        // TODO Auto-generated method stub
        return("We will cover the whole Earth in slime with our " + spaceships + " spaceships.");
    }
    
    @Override
    public void doGreeting() {
        System.out.println("We are aliens who are coming with " + spaceships + " spaceships.");
    }

    public static void main(String[] args) {
        AlienExtend ae = new AlienExtend(10, "NotEarth", 1000000);
        ae.doGreeting();
        ae.slimeWholeEarth();
        ae.doSlimeZap(15);
    }
    
}
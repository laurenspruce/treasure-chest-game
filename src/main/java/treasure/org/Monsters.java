package treasure.org;

public class Monsters implements IMonster{

    private String name;

    public Monsters(String name) {
        this.name = name;
    }

    @Override
    public String getGreeting(){
        return "A wild " + name + " appears!";
    }

    @Override
    public void spawn(){
        //Logic to spawn the monster randomly
    }

}
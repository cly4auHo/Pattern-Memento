package memento_hranitel_sostoyaniya;

public class Game {

    private String lvl;
    private int ms;

    public void set(String lvl, int ms) {
        this.lvl = lvl;
        this.ms = ms;
    }

    public void load(Save save) {
        lvl = save.getLvl();
        ms = save.getMs();
    }

    public Save save() {
        return new Save(lvl, ms);
    }

    @Override
    public String toString() {
        return "Game{" + "lvl=" + lvl + ", ms=" + ms + '}';
    }

}

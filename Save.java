package memento_hranitel_sostoyaniya;

public class Save {

    private final String lvl;
    private final int ms;

    public Save(String lvl, int ms) {
        this.lvl = lvl;
        this.ms = ms;
    }

    public String getLvl() {
        return lvl;
    }

    public int getMs() {
        return ms;
    }

}

class File {

    Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }

}

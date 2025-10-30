public class DanceRoutine {
    private Boohbah[] boohbahs = {};

    public DanceRoutine(Boohbah[] boohbahs){
        this.boohbahs = boohbahs;
    }

    public String buildRoutine(){
        StringBuilder routine = new StringBuilder(); // string  builder
        for (Boohbah b: boohbahs) { // iterates through list using enchanced loop
            routine.append(b.performMove() + "\n"); //appends boobahs to string builder
        }
        return routine.toString(); //converts to string
    }

    public String modifyRoutine(){
        StringBuilder modifiedRoutine = new StringBuilder();
        for (Boohbah b: boohbahs) {
            modifiedRoutine.append(b.performMove() + "\n");
    }
    String Mod = modifiedRoutine.toString().replace("performs", "dances to");//converts string builder to string
    return Mod; //returns modified version
    }

    public String remixRoutine(){
        StringBuilder remix = new StringBuilder(buildRoutine());
        remix.insert(0, "--- REMIX ---\n");
        remix.delete(remix.length()-1, remix.length());
        remix.append("\n(Backwards Boohbah Shuffle! )");
        remix.reverse();

        return remix.toString(); // returns string 
    }
}

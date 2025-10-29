public class DanceRoutine {
    private Boohbah[] boohbahs = {};

    public DanceRoutine(Boohbah[] boohbahs){
        this.boohbahs = boohbahs;
    }

    public String buildRoutine(){
        StringBuilder routine = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            routine.append(boohbahs[i].performMove() + "\n");
        }
        return routine.toString();
    }

    public String modifyRoutine(){
        StringBuilder modifiedRoutine = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            modifiedRoutine.append(boohbahs[i].performMove() + "\n");
    }
    String Mod = modifiedRoutine.toString().replace("performs", "dances to");
    return Mod;
    }
}

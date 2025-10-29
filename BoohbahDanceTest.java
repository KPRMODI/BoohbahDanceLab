public class BoohbahDanceTest {
    public static void main(String[] args) {
        Boohbah Boohbah1 = new Boohbah("Zing Zing Zingbah", "Ghost Dance");
        Boohbah Boohbah2 = new Boohbah("Humbah", "Belly Flop");
        Boohbah Boohbah3 = new Boohbah("Jumbah", "100 jumps");

        Boohbah[] Boohbahs = {Boohbah1, Boohbah2, Boohbah3};
        DanceRoutine Routine = new DanceRoutine(Boohbahs);

        System.out.println("Original Routine: " + "\n" + Routine.buildRoutine());
        System.out.println("Modified Routine: " + "\n" + Routine.modifyRoutine());
    }
}

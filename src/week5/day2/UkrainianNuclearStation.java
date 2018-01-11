package week5.day2;

public final class UkrainianNuclearStation implements NuclearStation {

    public static final String NAME_OF_STATION = "UNS";

    @Override
    public final void work() {
        System.out.println("WORK");
    }

    public void method(final String name){


    }

    public String getName() {
        return NAME_OF_STATION;
    }

}

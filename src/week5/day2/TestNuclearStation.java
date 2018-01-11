package week5.day2;

public class TestNuclearStation {

    public static void main(String[] args) {


        UkrainianNuclearStation nuclearStation = new UkrainianNuclearStation();
        nuclearStation.work();
        System.out.println(nuclearStation.getName());

        UkrainianNuclearStation nuclearStation2 = new UkrainianNuclearStation();
        nuclearStation2.work();
        System.out.println(nuclearStation2.getName());


        System.out.println(ResponseCodes.INTERNAL_SERVER_ERROR.getResponseCode());

        ResponseCodes codes = ResponseCodes.INTERNAL_SERVER_ERROR;

        switch (codes) {

            case INTERNAL_SERVER_ERROR: {

                System.out.println("Here");

                break;
            }

            case NOT_FOUND: {



            }

            default: {



            }

        }


    }

}

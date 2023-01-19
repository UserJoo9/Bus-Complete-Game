import java.util.Scanner;

public class Controller {

    private void gamePlay(){
        Scanner s2 = new Scanner(System.in);
        BusComplete bc1 = new BusComplete();
        System.out.println("Enter MasterLitter: ");
        String master = s2.next();
        bc1.setMasterLitter(master);
            if(bc1.getMasterLitter().length() == 1 ) {
                while (true) {
                    System.out.println("1- Set Boy Name " + "| " + bc1.getBoyName());
                    System.out.println("2- Set Girl Name " + "| " + bc1.getGirlName());
                    System.out.println("3- Set Plant Name " + "| " + bc1.getPlantName());
                    System.out.println("4- Set Animal Name " + "| " + bc1.getAnimalName());
                    System.out.println("5- Set Inanimate Name " + "| " + bc1.getInanimate());
                    System.out.println("6- Set Country Name " + "| " + bc1.getCountryName());
                    System.out.println("-----------------------");
                    System.out.println("7- BusComplete!");
                    System.out.println("8- Delete Value");
                    System.out.println("\nEnter Choice");
                    String choice = s2.next();
                    if (choice.equals("1")) {
                        System.out.println("\nEnter Boy Name: ");
                        String boy = s2.next();
                        bc1.setBoyName(boy);
                    } else if (choice.equals("2")) {
                        System.out.println("\nEnter Girl Name: ");
                        String girl = s2.next();
                        bc1.setGirlName(girl);
                    } else if (choice.equals("3")) {
                        System.out.println("\nEnter Plant Name: ");
                        String plant = s2.next();
                        bc1.setPlantName(plant);
                    } else if (choice.equals("4")) {
                        System.out.println("\nEnter Animal Name: ");
                        String animal = s2.next();
                        bc1.setAnimalName(animal);
                    } else if (choice.equals("5")) {
                        System.out.println("\nEnter Inanimate Name: ");
                        String inanimate = s2.next();
                        bc1.setInanimate(inanimate);
                    } else if (choice.equals("6")) {
                        System.out.println("\nEnter Country Name: ");
                        String country = s2.next();
                        bc1.setCountryName(country);
                    } else if (choice.equals("7")) {
                        bc1.describe();
                        bc1.rivision();
                        bc1.sumTotalScore(bc1.getScore());
                        break;
                    }else if(choice.equals("8")){
                        System.out.println("What Do you Want To Delete?");
                        System.out.println("1- Boy Name");
                        System.out.println("2- Girl Name");
                        System.out.println("3- Plant Name");
                        System.out.println("4- Animal Name");
                        System.out.println("5- Inanimate");
                        System.out.println("6- Country");
                        String target = s2.next();
                        if(target.equals("1")){
                            bc1.setBoyName("");
                        }else if(target.equals("2")){
                            bc1.setGirlName("");
                        }else if(target.equals("3")){
                            bc1.setPlantName("");
                        }else if(target.equals("4")){
                            bc1.setAnimalName("");
                        }else if(target.equals("5")){
                            bc1.setInanimate("");
                        }else if(target.equals("6")){
                            bc1.setCountryName("");
                        }else {
                            System.out.println("\nUnknown Choice!");
                        }
                    }else {
                        System.out.println("\nUnknown Choice!");
                    }

                }
            }else if(bc1.getMasterLitter().length() > 1){
                System.out.println("MasterLitter Must Be 1 Litter Only!");
                System.out.println("Re Enter MasterLitter!");
                gamePlay();
            }
        }

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        while (true) {
            System.out.println("\nMain Menu");
            System.out.println("1# Play");
            System.out.println("2# Exit");
            System.out.println("Enter Choice >> ");
            String choice = s1.next();
            if (choice.equals("1")){
                Controller c1 = new Controller();
                c1.gamePlay();
            }else if(choice.equals("2")){
                break;
            }else {
                System.out.println("\nUnknown Choice?");
            }
        }
        System.out.println("Have a Nice Day 😊");
    }
}




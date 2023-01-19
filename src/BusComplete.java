import java.util.Scanner;

public class BusComplete {
     private String masterLitter = "";
     private int score = 0;
     private static int totalScore = 0;
     private String boyName = "";
     private String girlName = "";
     private String plantName = "";
     private String inanimate = "";
     private String animalName = "";
     private String countryName = "";

     void setMasterLitter(String newMasterLitter) {
         this.masterLitter = newMasterLitter;
     }

     String getMasterLitter(){
        return masterLitter;
     }

     void setScore(int newScore){
        this.score = newScore;
     }

     int getScore(){
        return score;
     }

     void setTotalScore(int newTotal){
         totalScore = newTotal;
     }

     int getTotalScore(){
         return totalScore;
     }

     void setBoyName(String newBoy){
        this.boyName = newBoy;
     }

     String getBoyName(){
        return boyName;
     }

     void setGirlName(String newGirl){
        this.girlName = newGirl;
     }

     String getGirlName(){
        return girlName;
     }

     void setPlantName(String newPlant){
        this.plantName = newPlant;
     }

     String getPlantName(){
        return plantName;
     }

     void setInanimate(String newInanimate){
        this.inanimate = newInanimate;
     }

     String getInanimate(){
        return inanimate;
     }

     void setAnimalName(String newAnimal){
        this.animalName = newAnimal;
     }

     String getAnimalName(){
        return animalName;
     }

     void setCountryName(String newCountry){
        this.countryName = newCountry;
     }

     String getCountryName(){
        return countryName;
     }

     void rivision(){
        int sub = 0;
        if (getBoyName().startsWith(getMasterLitter())){
            sub += 10;
        }if (getGirlName().startsWith(getMasterLitter())){
            sub += 10;
        }if (getPlantName().startsWith(getMasterLitter())){
            sub += 10;
        }if (getAnimalName().startsWith(getMasterLitter())){
            sub += 10;
        }if (getInanimate().startsWith(getMasterLitter())){
            sub += 10;
        }if (getCountryName().startsWith(getMasterLitter())){
            sub += 10;
        }
        setScore(sub);
        modifyScore();
        System.out.println("Score: "+getScore());
    }

     void describe(){
        System.out.println("Boy Name:     "+getBoyName());
        System.out.println("Girl Name:    "+getGirlName());
        System.out.println("Plant Name:   "+getPlantName());
        System.out.println("Animal Name:  "+getAnimalName());
        System.out.println("Inanimate:    "+getInanimate());
        System.out.println("Country Name: "+getCountryName());
    }

    void sumTotalScore(int last_score){
        int ts = getTotalScore() + last_score;
        setTotalScore(ts);
        System.out.println("Total Score: "+getTotalScore());
    }

    void modifyScore(){
        Scanner s2 = new Scanner(System.in);
        while (true) {
            System.out.println("Do You Want To Modify?");
            System.out.println("1- Boy Name");
            System.out.println("2- Girl Name");
            System.out.println("3- Plant Name");
            System.out.println("4- Animal Name");
            System.out.println("5- Inanimate");
            System.out.println("6- Country");
            System.out.println("-----------------");
            System.out.println("7- End");
            System.out.println("Enter What Do You Want To Edit: ");
            String editedScore = s2.next();
            if (editedScore.equals("1") || editedScore.equals("2") || editedScore.equals("3") || editedScore.equals("4") || editedScore.equals("5") || editedScore.equals("6")) {
                setScore(getScore() - 5);
            }else if(editedScore.equals("7")){
                break;
            }
        }
    }

}

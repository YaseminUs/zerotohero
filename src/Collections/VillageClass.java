package Collections;

public class VillageClass {

//HOMEWORK
//Create the program that implements City Application
// VILLAGE CLASS
// 1- Create the Village class that having private instance variables
// name, population, villageID and totalArea (with getters and setters)
// 2- Create one constructor with three argument
//
// CITY CLASS
// 1- Create the Village class that having private instance variables name, capital (with getters and setters)
// 2- Create one Set collection to store the villages to inside city class.
// 3- Create one method to add the villages to Set collection with village name and population,villageId and totalArea. (Method name is addVillage)
// 4- Create one method to find the villages under city. This method will take one parameter as a name of the village
// and it will return the all information of the village.
// If the village is not available this method will return null.
// 5- Create one method to find the villages under city This method will take one parameter as a id of the village
// and it will return the all the information of the village.
// If village is not available, this method will return null.
// 6- Create one method to remove the village under city and with villageID name.
// This method will return true village is removed from the city otherwise it will return false
// 7- Create one method to remove the village under city and with villageName.
// This method will return true village is removed from the city otherwise it will return false.
// 8- Create one method to print all the villageName under City.
// 9- Create one method to calculate total population of the city. This method will return Long number as a population.
// (To calculate city population, you need to get the all population of the villages.
// Sum of villages population creates the City’s population.
    //MAINCITY CLASS
    // Create maincity class to test your application.
    // Create one object from the City call addVillage method to add the villages to your city
    // and call other methods to test your application.

     private String villageName;
     private long population;
     private String villageId;
     public int totalArea;

     public VillageClass (){

    }

     public VillageClass(String villageName,long population,String villageId,int totalArea){
         this.villageName = villageName;
         this.population = population;
         this.totalArea = totalArea;
         this.villageId = villageId;
     }

    public void setName(String villageName) {
        this.villageName = villageName;
    }
    public String getName() {
        return villageName;
    }
    public void setPopulation(long population) {
        this.population = population;
    }
    public long getPopulation() {
        return population;
    }
    public void setTotalArea(int totalArea){
         this.totalArea=totalArea;
    }
    public int gettotalArea(){
         return totalArea;
    }
    public void setVillageId(String villageId){
         this.villageId=villageId;
    }

    public String getVillageId() {
        return villageId;
    }
}
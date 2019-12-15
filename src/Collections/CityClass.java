package Collections;

import java.util.HashSet;
import java.util.Set;

public class CityClass {
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

   private String cityName;
   private String capital;

    public void setcityName(String cityName) {
        this.cityName = cityName;
    }
    public String getcityName(){
        return cityName;
    }
    public void setCapital(String capital){
        this.capital = capital;
    }
    public String getCapital(){
        return capital;
    }
    Set<VillageClass>cityMember = new HashSet<>();

    public void addVillages(String villageName,long population,String villageId,int totalArea){
        cityMember.add(new VillageClass(villageName,population,villageId,totalArea));
        VillageClass vc = new VillageClass();
        vc.setName(villageName);
        vc.setPopulation(population);
        vc.setVillageId(villageId);
        vc.setTotalArea(totalArea);
        cityMember.add(vc);

    }
    public String findVillages(String villageName){

        for(VillageClass cc : cityMember){
            if(cc.getName().equalsIgnoreCase(villageName)){
                String info = (cc.getName()+""+cc.gettotalArea()+""+cc.getVillageId()+""+cc.getPopulation());
                return info;
            }
        }
       return null;
    }

    public String findVillage(String villageId){

        for(VillageClass cc : cityMember){
            if(cc.getName().equalsIgnoreCase(villageId)){
                String info = (cc.getName()+""+cc.gettotalArea()+""+cc.getVillageId()+""+cc.getPopulation());
                return info;
            }
        }
        return null;

        }
    public Boolean removeVillageId(String villageId) {

        for (VillageClass rv : cityMember) {
            if (rv.getName().equalsIgnoreCase(villageId)) {
                cityMember.remove(rv);
                return true;
            }
        }
        return false;
    }
    public Boolean removeVillagename(String villageName) {

        for (VillageClass rn : cityMember) {
            if (rn.getName().equalsIgnoreCase(villageName)) {
                cityMember.remove(rn);
                return true;
            }
        }
        return false;
    }
    public void printName(){
        for(VillageClass vp : cityMember){
            System.out.println(vp.getName());
        }
    }
    public long calculateTotalPopulation() {
        long totalPopulation = 0;
        for (VillageClass p : cityMember) {
            totalPopulation += p.getPopulation();
        }

        return totalPopulation;
    }



}

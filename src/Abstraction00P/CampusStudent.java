package Abstraction00P;

     public class CampusStudent extends Student {

         @Override
         public void study(){
             System.out.println("campus student is studying");
         }

         @Override
         public void study(String name) {

         }

         @Override
         public void attendClass(){
             System.out.println("Student is taking class on campus");
         }
         @Override
         public void homeWork(){
             System.out.println("Campus student is doing her homework");
         }




     }

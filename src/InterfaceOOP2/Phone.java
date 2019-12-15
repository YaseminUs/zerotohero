package InterfaceOOP2;

  public abstract class Phone extends Object implements FlashCard,faceRecognition {

      public Phone(){
          System.out.println("I am Phone Constractor");
      }
      String name;
      String model;
      int size;

      public abstract void call();
      public abstract void text();
      public abstract void takePicture();


  }

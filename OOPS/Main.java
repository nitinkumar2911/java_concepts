public class Main {
    int x = 5;
    int modelYear;
    String modelName;
    // public Main(int year, String name){
    //     modelYear = year;
    //     modelName = name ;
    // }
    public Main(String modelName){
        this(2020, modelName);
    }
    public Main(int modelYear, String modelName){
        this.modelYear = modelYear;
        this.modelName = modelName;
    }
    public void printInfo(){
        System.out.println(modelYear + " " + modelName);
    }

    
    public static void main(String[] args){
      Main car1 = new Main("Corvette");
      Main car2 = new Main(1969, "Mustang");
      car1.printInfo();
      car2.printInfo();
    }
}
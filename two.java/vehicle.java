public class vehicle {
    protected String brand = "toyota";

        public void fuel(){
            System.out.println("Runs on petrol");
        }
}
class car extends vehicle{
    private String modelname = "Audi";
    public static void main(String[]args){
        car myCar = new car();
        myCar.fuel();
        System.out.println(myCar.brand +"  "+myCar.modelname);
    }
}
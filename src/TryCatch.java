public class TryCatch {
    public static void main(String[] args) {
        String count = "0.015";
        int count2;
        float count3 = 0;
        try{
            count2 = Integer.parseInt(count);
        }
        catch (Exception e){
            System.out.println(e);
        }
        try{
            count3 = Float.parseFloat(count);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(count3);
    }
}

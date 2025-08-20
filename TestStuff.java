public class TestStuff{
    public static void main(String[] args){
        AtharvaPalendrome testClass = new AtharvaPalendrome();
        System.out.println(testClass.onlyPalendromes("racecar racecar what??"));
        System.out.println(testClass.onlyPalendromes("racecar!!!!"));
        System.out.println(testClass.onlyPalendromes("racecar."));
        System.out.println(testClass.onlyPalendromes("racecar?? racecar"));
        System.out.println(testClass.onlyPalendromes("tit for tat! yay!!!"));
        System.out.println(testClass.onlyPalendromes("racecar what is the racecar doing here bob??"));
    }
}
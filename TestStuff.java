Public class TestStuff{
    private AtharvaPalendrome testClass;
    public TestStuff(){
        testClass = new AtharvaPalendrome();
    }

    public static void main(String[] args){
        System.out.println(testClass.onlyPalendromes("Racecar Racecar what??"))
        System.out.println(testClass.onlyPalendromes("Racecar!!!!"))
        System.out.println(testClass.onlyPalendromes("Racecar."))
        System.out.println(testClass.onlyPalendromes("Racecar?? Racecar"))
        System.out.println(testClass.onlyPalendromes("tit for tat! yay!!!"))
        System.out.println(testClass.onlyPalendromes("Racecar what is the Racecar doing here bob??"))
    }
}
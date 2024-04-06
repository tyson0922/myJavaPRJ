package codeAcademyJava.Project;

public class Droid{

    String name;
    int batteryLevel;


    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }
    public String toString(){
        return name + " is at " + batteryLevel + "%!";
    }
    public void performTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;
    }
    public void energyReport(){
        System.out.println(name + " is currently at " + batteryLevel + "%");
    }

    public static void main(String[] args){
        Droid d1 = new Droid("Codey");
        System.out.println(d1);
        d1.performTask("Dancing");
        d1.performTask("Walking");
        d1.performTask("Learning");
        d1.energyReport();
    }
}
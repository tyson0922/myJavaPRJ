package class0603;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPractice{
    public static void main(String[] args){
        List<String> car = new ArrayList<>();
        car.add("black");
        car.add("white");
        car.add("red");
        car.add("blue");

        int carSize = car.size();

        //1st
        for (int i = 0; i<carSize; i++){
            System.out.println("color1" + car.get(i));
        }
        //2nd
        for ( String color : car){
            System.out.println("color2" + color);
        }
        //3rd
        car.forEach(color -> System.out.println("color3" + color));

        //4th
        car.parallelStream().forEach(color -> System.out.println("color4"+color));

        //1.5
        Iterator<String> it =car.iterator();

        while(it.hasNext()) {
            String color = it.next();
            System.out.println("color" + color);
        }
    }
}
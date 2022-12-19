package stringClass;

import java.util.StringJoiner;

public class MainStringJoiner {
    public static void main(String[] args) {
        String[] names = {"Siti", "Fadillah", "Supari","Sukarno", "Hatta"};
        StringJoiner joiner = new StringJoiner(" - ","{","}");

        System.out.println("Sebelum add : ");
        System.out.println(joiner.toString());

        for(String name: names){
            joiner.add(name);
        }
        System.out.println("Sesudah di Add :");
        System.out.println(joiner.toString());
    }
}

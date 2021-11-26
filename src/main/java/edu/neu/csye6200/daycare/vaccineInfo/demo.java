package edu.neu.csye6200.daycare.vaccineInfo;

import javax.swing.*;
import java.util.Vector;

public class demo {

    public static void main(String[] args) {
        Student s1 = new Student("s1", 62);
        Student s2 = new Student("s2", 40);
        s1.setImmuRecord(new String[]{"DTaP", "24", "Hib", "25", "Hib", "27"}, 0 , 5);
        s2.setImmuRecord(new String[]{"DTaP", "24", "Hib", "25", "Hib", "27"}, 0 , 5);
        //s1.getImmuRecord().get("DTaP").add(24);
        /*s2.getImmuRecord().get("Hib").add(25);
        s2.getImmuRecord().get("Hib").add(27);*/
        Vector<Student> students = new Vector<>();
        students.add(s1);
        students.add(s2);

        openImmuRecord(students);
        openImmuNotify(students);
    }

    public static void openImmuNotify(Vector<Student> students){
        SwingUtilities.invokeLater(new AlertVaccine(students));
    }

    public static void openImmuRecord(Vector<Student> students){
        SwingUtilities.invokeLater(new ShowVaccine(students));
    }


}

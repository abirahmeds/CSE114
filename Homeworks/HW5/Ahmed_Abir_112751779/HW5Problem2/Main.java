package com.company;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jack", "300 Circle Road",
                "6467445213", "jack@myspace.com");

        Student student = new Student("Jacques", "125 Nicholls Road", "5167893289",
                "travisscott100@yahoo.com", 3);

        Employee employee = new Employee("LeBron", "43 Rodeo Drive", "2362362366",
                "washedking23@gmail.com", 236, 100000000, 17);

        Faculty faculty = new Faculty("Julius", "34 MSG Road", "2129298345",
                "randlestar@aol.com", 611, 5000000, 5, "8pm - 11pm", "PF/C");

        Staff staff = new Staff("Kyrie", "29 Fort Green Place", "7189238760",
                "imsowoke@gmail.com", 666, 65000000, 12, "Point Guard");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}

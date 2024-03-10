package easy;

import java.util.*;

// TODO: 3/2/2024 https://www.hackerrank.com/challenges/java-sort/problem?isFullScreen=false
class Studentt {
    private final int id;
    private final String fname;
    private final double cgpa;

    public Studentt(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class JavaSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Studentt> studentList = new ArrayList<Studentt>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Studentt st = new Studentt(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        // the thenComparing statements are executed in order, providing a hierarchy of sorting criteria.
        // If the first criterion is equal, it moves on to the next one in the list.
        studentList.stream()
                .sorted(Comparator.comparing(Studentt::getCgpa).reversed()
                        .thenComparing(Studentt::getFname)
                        .thenComparing(Studentt::getId))
                .forEach(s -> System.out.println(s.getFname()));
    }
}





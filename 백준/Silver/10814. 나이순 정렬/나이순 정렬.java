import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

class Person {
    int age;
    String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int i = 0;
        List<Person> personList = new ArrayList<>();
        while (i < count) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            personList.add(new Person(Integer.parseInt(st.nextToken()), st.nextToken()));
            i++;
        }

        personList.sort(Comparator.comparingInt(p -> p.age));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (Person p : personList) {
            bw.write(p.age + " " + p.name + "\n");
        }
        bw.close();
    }
}
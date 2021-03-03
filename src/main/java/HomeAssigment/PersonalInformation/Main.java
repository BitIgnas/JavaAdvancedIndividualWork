package HomeAssigment.PersonalInformation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        String file = "Names.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            int count = Integer.parseInt(bufferedReader.readLine());
            for (int i = 0; i < count; i++) {
                String name = String.valueOf(bufferedReader.read());
                String surname = String.valueOf(bufferedReader.read());
                int phoneNumber = bufferedReader.read();

                personList.add(new Person(name, surname, phoneNumber));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


package Mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] studentData = br.readLine().split("\\s+");
        String[] workerData = br.readLine().split("\\s+");

        Student student = null;
        Worker worker = null;
        try {
            student = new Student(studentData[0], studentData[1], studentData[2]);
            worker = new Worker(workerData[0], workerData[1], Double.parseDouble(workerData[2]), Double.parseDouble(workerData[3]));

        System.out.println(student);
        System.out.println(worker);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}

package org.pedro.genericsSetMap;

import org.pedro.genericsSetMap.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(" ");
                String username = fields[0];
                LocalDateTime moment = LocalDateTime.parse(fields[1], DateTimeFormatter.ISO_DATE_TIME);
                set.add(new LogEntry(username, moment));

                line = br.readLine();
            }
            System.out.println("Total users: ");
            System.out.println(set.size());


        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}

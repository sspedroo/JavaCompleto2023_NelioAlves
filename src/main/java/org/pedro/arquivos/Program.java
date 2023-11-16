package org.pedro.arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File file = new File("C:\\ESTUDOS\\JAVA\\UDEMY\\Java COMPLETO 2023 Programação Orientada a Objetos +Projetos\\curso\\in.txt");
        Scanner sc = null;
        System.out.println("*****USANDO A FORMA DIRETA****");
        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
        System.out.println();
        // MEXENDO COM FILE READER E BUFFERED READER

        System.out.println("******USANDO O FILE READER E BUFFERED READER******");
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            String line = br.readLine();   //Le uma linha do arquivo, se tiver no final vai retornar nulo

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null){
                    br.close();
                }
                if (fr != null){
                    fr.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }

        }
        System.out.println();

        //USANDO O BLOCO TRY WITH RESOURCES
        System.out.println("******USANDO O TRY WITH RESOURCES******");
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String linha = bufferedReader.readLine();

            while (linha != null){
                System.out.println(linha);
                linha = bufferedReader.readLine();
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }


    }
}

package org.pedro.arquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CriandoArquivos {
    public static void main(String[] args) {
        String[] lines = new String[]{ "Doncic", "Curry", "LeBron"};
        String path = "C:\\ESTUDOS\\JAVA\\UDEMY\\Java COMPLETO 2023 Programação Orientada a Objetos +Projetos\\curso\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        //INFORMAÇÕES DO CAMINHO DO ARQUIVO
        File file = new File(path);
        System.out.println("getName: " + file.getName());
        System.out.println("getParent: " + file.getParent());
        System.out.println("getPath: " + file.getPath());

        File diskC = new File("C:");
        System.out.println("space: " + diskC.getTotalSpace());
        System.out.println("free space: " + diskC.getFreeSpace());
    }

}

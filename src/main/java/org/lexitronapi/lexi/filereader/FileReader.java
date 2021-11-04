package org.lexitronapi.lexi.filereader;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public List<String> ReadFile() {

        List<String> contentFromFile = new ArrayList<>();


        try (BufferedReader reader = new BufferedReader(new java.io.FileReader("C:\\Users\\admin\\AndroidStudioProjects\\Lexitron\\words.txt"))) {
            contentFromFile.add(reader.readLine());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            contentFromFile.add(0,ex.getMessage());
        }
        return contentFromFile;
    }

}

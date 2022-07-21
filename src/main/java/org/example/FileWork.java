package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileWork {

    public List<byte[]> readDataDirectory(String directoryName) {
        try {
            FileVisitor fileVisitor = new FileVisitor();
            Files.walkFileTree(Paths.get(directoryName), fileVisitor);
            return fileVisitor.getFilesByteList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

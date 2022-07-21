package org.example;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileWork {

    public FileWork() {
    }

    public List<File> readDataDirectory(String directoryName){
        List fileList = new ArrayList();
        File dir = new File(directoryName);

        if(dir.isDirectory()){
            for(File item: dir.listFiles()){
                if(item.isDirectory()){
                    fileList.addAll(readDataDirectory(item.getAbsolutePath()));
                    item.delete();
                } else {
                    fileList.add(item);
                    item.delete();
                }
            }
        } else {
            fileList.add(dir);
            dir.delete();
        }
        return fileList;
    }

}

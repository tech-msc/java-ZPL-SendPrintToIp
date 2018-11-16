package br.msc.sendfiletoip.util;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LabelReader {

    private String LabelPath = "./labels";
    private String LabelName = "z2.prn";

    private Path getLabelPath(){
        Path path =
                Paths.get(LabelPath +
                        File.separator +
                        LabelName );

//        if(!Files.exists(path)){
//            System.out.println(path.getFileName());
//            System.out.println("É um diretório: " + Files.isDirectory(path));
//            System.out.println("É um path absoluto: " + path.isAbsolute() );
//            return null;
//        }

//        return path.toString();

        return  path;
    }

    public String GetLabel()
    {
        Path path = getLabelPath();
        String resultado= "";

        try{
            resultado = Files.readAllLines (path).toString();
        }
        catch (Exception e)
        {
            String em = e.getMessage();
            resultado = "";
        }

        return resultado;
    }

}

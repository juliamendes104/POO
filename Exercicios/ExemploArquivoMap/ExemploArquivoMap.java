
package com.mycompany.exemploarquivomap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class ExemploArquivoMap {
    
    private static SortedMap<String,Integer> map = new TreeMap<>();
    private static List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());

    public static void arquivo(){
        Scanner scan = null;
        File file = new File("C:\\Users\\julia\\OneDrive\\Documentos\\NetBeansProjects\\ExemploArquivoMap\\src\\main\\java\\com\\mycompany\\exemploarquivomap\\Texto.txt");;
        
        try{
            scan = new Scanner(file);
        }catch(FileNotFoundException e){
            System.err.println(e.getMessage());
        }
        
        while(scan.hasNextLine()){
            String linha = scan.nextLine();
            String[] campos = linha.split(" ");
            
            for(String campo: campos){
                campo = campo.toLowerCase();
                if(!map.containsKey(campo)){
                    map.put(campo,1);
                }
                else{
                    map.put(campo, map.get(campo)+1);
                }
                
            }
        }
        
    }
    
    public static void ordenarKey(){
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    
    public static void main(String[] args) {
        arquivo();
        ordenarKey();
        /*Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){
            @Override
            public int compare(Map.Entry<String,Integer> entry1, Map.Entry<String,Integer> entry2){
                return entry2.getValue().compareTo(entry1.getValue());
            }
        });
        
        for(Map.Entry<String,Integer> entry: list){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }*/
    }
}

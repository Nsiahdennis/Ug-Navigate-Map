package src.NavigationAlgorithm;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String[]> csvContents = src.NavigationAlgorithm.ReadCSV.readCSV("src/NavigationAlgorithm/UG-locations.csv");
        src.NavigationAlgorithm.ReadCSV.makeContentsReadable(csvContents);
        System.out.println(56);
        System.out.println(src.NavigationAlgorithm.ReadCSV.getLongitude(csvContents,2));
        System.out.println(44);
        System.out.println(src.NavigationAlgorithm.ReadCSV.getLatitude(csvContents,2));
        System.out.println(src.NavigationAlgorithm.ReadCSV.getLandmark(csvContents,"Commonwealth Hall"));
        System.out.println(68);
        System.out.println(src.NavigationAlgorithm.ReadCSV.getLongitude(csvContents, 24));
        System.out.println(99);
        System.out.println(src.NavigationAlgorithm.ReadCSV.getLatitude(csvContents,24));
        System.out.println(src.NavigationAlgorithm.ReadCSV.getLandmark(csvContents,"Commonwealth"));

        System.out.println(src.NavigationAlgorithm.ReadCSV.getIdByName(csvContents,"Bani hostel"));

        //ArrayList<String[]> csvContents1 = ReadCSV.readCSV("src/NavigationAlgorithm/UG-distances.csv");
        //System.out.println(ReadCSV.getNeighbours(csvContents1,34));
    }
}
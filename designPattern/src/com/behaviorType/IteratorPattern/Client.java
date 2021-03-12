package com.behaviorType.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        ComputerCollege computerCollege=new ComputerCollege();
        ArtCollege artCollege=new ArtCollege();

        List<College> list=new ArrayList<>();
        list.add(computerCollege);
        list.add(artCollege);

        OutputImpl output=new OutputImpl(list);

        output.print();
    }
}

package Homework_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Homework_3.drugs.Component;
import Homework_3.drugs.impl.CatDrug;
import Homework_3.drugs.impl.components.Azitron;
import Homework_3.drugs.impl.components.Pinecilin;
import Homework_3.drugs.impl.components.Water;

public class Main {
    public static void main(String[] args) {
        List<Component> catComponents = new ArrayList<>();
        catComponents.add(new Azitron("Авитрон", "2", 4));
        catComponents.add(new Water("Вода", "100", 1));
        CatDrug сDrug = new CatDrug(catComponents);

        for (Component c : сDrug) {
            System.out.println(c);
        }

        List<Component> catComponents2 = new ArrayList<>();
        catComponents2.add(new Pinecilin("Пинецилин", "5", 4));
        catComponents2.add(new Water("Вода", "100", 1));
        CatDrug сDrug2 = new CatDrug(catComponents2);

        List<Component> catComponents3 = new ArrayList<>();
        catComponents3.add(new Pinecilin("Пинецилин", "5", 4));
        catComponents3.add(new Azitron("Авитрон", "2", 4));
        catComponents3.add(new Water("Вода", "100", 1));
        CatDrug сDrug3 = new CatDrug(catComponents3);

        List<Component> catComponents4 = new ArrayList<>();
        catComponents4.add(new Water("Вода", "200", 1));
        CatDrug сDrug4 = new CatDrug(catComponents4);

        List<CatDrug> drugs = new ArrayList<>();
        drugs.add(сDrug);
        drugs.add(сDrug2);
        drugs.add(сDrug3);
        drugs.add(сDrug4);

        // System.out.println(drugs);

        Collections.sort(drugs);
        System.out.println(drugs);
    }
}

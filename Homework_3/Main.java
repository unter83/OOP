package Homework_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

        List<Component> catComponents2 = new ArrayList<>();
        catComponents2.add(new Pinecilin("Пинецилин", "5", 4));
        catComponents2.add(new Water("Вода", "100", 1));
        CatDrug сDrug2 = new CatDrug(catComponents2);

        List<Component> catComponents3 = new ArrayList<>();
        catComponents3.add(new Pinecilin("Пинецилин", "5", 2));
        catComponents3.add(new Azitron("Авитрон", "2", 2));
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

        Component w = new Water("Физраствор", "10", 1);
        Component s = new Water("Физраствор", "10", 1);
        Component a = new Azitron("Авитрон", "2", 4);
        Component p = new Pinecilin("Пинецилин", "5", 15);

        Set<Component> hs = new HashSet<Component>();
        hs.add(w);
        hs.add(s);
        hs.add(a);
        hs.add(p);

        // System.out.println(w.hashCode() == s.hashCode());
        // System.out.println(w.equals(s));
        // System.out.println(s.equals(w));
        // System.out.println(w.equals(s));

        // System.out.println(w.hashCode());
        // System.out.println(s.hashCode());
        // System.out.println(a.hashCode());

        System.out.println(hs);
        // System.out.println(w.equals(s));

        Collections.sort(drugs);
        System.out.println(drugs);

    }
}

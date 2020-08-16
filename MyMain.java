package be.intecbrussel.javaEnums;

import be.intecbrussel.javaInterface.MyPig;

public class MyMain
{
    enum Saison
    {
        PRINTEMPS,
        ETE,
        AUTOMNE,
        HIVER
    }

    public static void main(String[] args)
    {
        MyLevel monNiveau = MyLevel.MEDIUM;
        System.out.println(monNiveau);
        Saison maSaison = Saison.ETE;
        System.out.println(maSaison);

        for (MyLevel unNiveau: MyLevel.values())
        {
            System.out.println(unNiveau);
        }
        for (Saison uneSaison: Saison.values())
        {
            System.out.println(uneSaison);
        }
    }


}

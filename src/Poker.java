/*
 * File:Poker.java
 * Author:Szebasztián
 * Copyright:2023, Szebi:)
 * Group:SZOFT-I-1-N
 * Date:2023-02-06
 * Github:
 * Licenc: GNU GPL
 */

import java.util.Random;

public class Poker {
    public Poker() {
        about();
        task();
        looker();
    }
    
    private void task(){
        System.out.println("Feladat 0251 meg.");
        System.out.println("Paralelogramma");
    }
    private void about(){
        System.out.println("Szabó Szebasztián");
        System.out.println("Szoft I-1-N");
        System.out.println("2023.01.06.");
    }

    public void looker(){
        System.out.printf(
        "%d %d %d %d %d\n",
        getPitch(),
        getPitch(),
        getPitch(),
        getPitch(),
        getPitch());
    }
    public int getPitch() {
        Random random = new Random();
        int randInt = random.nextInt(6) + 1;
        return randInt;
    }
}

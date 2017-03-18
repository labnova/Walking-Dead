package com.labnova.innocenzotremamondo.walkingdead;

import android.util.Log;

import com.labnova.innocenzotremamondo.walkingdead.model.Frutto;
import com.labnova.innocenzotremamondo.walkingdead.model.SoldatoAlexandria;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class unitTestEp12 {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    public String getRandom(String[] array){
        Random random = new Random();
        return array[random.nextInt(array.length)];
    }

    @Test
    public void generaSoldaMyllati() throws Exception {

        String[] direzione = {"Nord", "Sud", "Ovest", "Est"};
        Frutto mela = new Frutto("Nord", 13, 10);
        boolean scoperto = false;
        int tempoDiPercorrenza = 0;

        final SoldatoAlexandria Lionelle = new SoldatoAlexandria();
        Lionelle.setNomeDiBattaglia("Lionelle");
        SoldatoAlexandria Jeremy = new SoldatoAlexandria();
        Jeremy.setNomeDiBattaglia("Jeremy");
        SoldatoAlexandria Jack = new SoldatoAlexandria();
        Jack.setNomeDiBattaglia("Jack");
        SoldatoAlexandria Mylla = new SoldatoAlexandria();
        Mylla.setNomeDiBattaglia("Mylla");




        //mettiamo i soldati in un'array
        final List<SoldatoAlexandria> soldati = new ArrayList<SoldatoAlexandria>();
        soldati.add(Lionelle);
        soldati.add(Jeremy);
        soldati.add(Jack);
        soldati.add(Mylla);

        for (SoldatoAlexandria soldato: soldati) {
            soldato.setDirezione(getRandom(direzione));
            soldato.setTempoDiPercorrenza(0);
        }

        /*

         */



        if(Lionelle.getDirezione().equals(mela.getDirezione())  ||
           Jeremy.getDirezione().equals(mela.getDirezione())  ||
           Jack.getDirezione().equals(mela.getDirezione())  ||
           Mylla.getDirezione().equals(mela.getDirezione()) ) {

            while (tempoDiPercorrenza <= mela.getDistanza()){
                tempoDiPercorrenza = tempoDiPercorrenza + 1;
                for (SoldatoAlexandria soldato: soldati) {
                    Mylla.setTempoDiPercorrenza(tempoDiPercorrenza);
                }

                if(mela.getPesante() > mela.getDistanza()) {
                    scoperto = true;
                    return;
                }


              }


        }


        assertFalse(scoperto);
    }
}
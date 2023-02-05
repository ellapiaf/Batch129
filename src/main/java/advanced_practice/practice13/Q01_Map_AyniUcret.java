package advanced_practice.practice13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q01_Map_AyniUcret {

//Aşağıda verilen fiyat listesinden fiyatı 29.99 olan ürünlerin adlarını yazdırınız.

    public static void main(String[] args) {


        Map<String, Double> urunler = new HashMap<>();
        urunler.put("Kemer", 19.99);
        urunler.put("Gomlek", 29.99);
        urunler.put("Kazak", 24.99);
        urunler.put("Pijama", 29.99);
        urunler.put("Ayakkabi", 89.99);
        urunler.put("Kravat", 19.99);
        urunler.put("Terlik", 29.99);

        System.out.println("urunler = " + urunler);//urunler = {Kemer=19.99, Kazak=24.99, Kravat=19.99, Ayakkabi=89.99, Terlik=29.99, Pijama=29.99, Gomlek=29.99}

           //1.yol
        for (Map.Entry<String,Double> w:urunler.entrySet()){
            if (w.getValue()==29.99){
                System.out.println(w.getKey());
            }

        }
        //2.yol
        Collection<Double>fiyatlar=urunler.values();
        System.out.println("fiyatlar = " + fiyatlar);
        Set<String> urunadlari=urunler.keySet();
        System.out.println("urunadlari = " + urunadlari);

        for (int i=0; i< fiyatlar.size();i++){
            if (fiyatlar.toArray()[i].equals(29.99)){
                System.out.println(urunadlari.toArray()[i]);
            }
        }
    }
}
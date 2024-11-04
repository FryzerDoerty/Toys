import java.io.*;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<toys> arr_prize = new ArrayList<>();

        Soft_toy a = new Soft_toy(1,"berd", 0, 10);
        Soft_toy a1 = new Soft_toy(2,"cat", 0, 11);
        Soft_toy a2 = new Soft_toy(3,"dog", 0, 10);
        Soft_toy a3 = new Soft_toy(4,"pig", 0, 1);
        //System.out.println(a);


        ShopLotterySoftToys shopLotterySoftToys = new ShopLotterySoftToys(new ArrayList<>());
        shopLotterySoftToys.addSoftToys(a);
        shopLotterySoftToys.addSoftToys(a1);
        shopLotterySoftToys.addSoftToys(a2);
        shopLotterySoftToys.addSoftToys(a3);
        for (Soft_toy b:shopLotterySoftToys.getToys()){
            System.out.println(b);
        }
        System.out.println();
        arr_prize.add(shopLotterySoftToys.lottery());

        System.out.println();


        for (Soft_toy b:shopLotterySoftToys.getToys()){
            System.out.println(b);
        }
        System.out.println();
        arr_prize.add(shopLotterySoftToys.lottery());
        System.out.println();
        for (Soft_toy b:shopLotterySoftToys.getToys()){
            System.out.println(b);
        }
        System.out.println();
        arr_prize.add(shopLotterySoftToys.lottery());
        System.out.println();
        for (Soft_toy b:shopLotterySoftToys.getToys()){
            System.out.println(b);
        }
        System.out.println();
        arr_prize.add(shopLotterySoftToys.lottery());
        System.out.println();
        for (Soft_toy b:shopLotterySoftToys.getToys()){
            System.out.println(b);
        }
        System.out.println();
        arr_prize.add(shopLotterySoftToys.lottery());
        System.out.println();
        for (Soft_toy b:shopLotterySoftToys.getToys()){
            System.out.println(b);
        }
        System.out.println();
        System.out.println(arr_prize);

        FileOutputStreamExample fileOutputStreamExample = new FileOutputStreamExample();
        fileOutputStreamExample.addInfile(arr_prize);


    }


}

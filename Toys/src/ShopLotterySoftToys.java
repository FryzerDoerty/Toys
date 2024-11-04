import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShopLotterySoftToys implements Shop_lottery{
    List<Soft_toy> toy;

    public ShopLotterySoftToys(List<Soft_toy> toy) {
        this.toy = toy;
    }

    public List<Soft_toy> getToys() {
        return toy;
    }

    public void setToys(List<Soft_toy> toy) {
        this.toy = toy;
    }
//возможно в следующем методе надо реализовать саму лотерею.......
    @Override
    public toys getToys(String name) {
        for(toys item:toy){
            if (item.getName().equals(name)){
                return item;
            }
        }
        return null;
    }
    public toys lottery(){
        ArrayList<Integer> array = new ArrayList<>();

        int quIt=0;
        for(toys item:toy){
            quIt = item.getQuant();
            while(quIt>0){
                array.add(item.getId());
                quIt--;
            }
        }
        Random random = new Random();
        int idRand = random.nextInt(array.size());
        //System.out.println(array.get(idRand));

        for(toys item:toy){
            if (item.getId()==array.get(idRand)){
                if(item.getQuant()>1){
                    item.setRate(item.getRate()+10);
                    item.setQuant(item.getQuant()-1);
                }else {
                    item.setRate(0);
                    item.setName(null);
                    item.setQuant(0);
                }

                return item;

            }

        }

        return null;
    }



    public  void addSoftToys(Soft_toy softtoy){

        this.toy.add(softtoy);
    }
}

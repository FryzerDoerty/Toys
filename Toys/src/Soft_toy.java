public class Soft_toy extends toys{
    public Soft_toy(int id, String name, int rate, int quant){
        super(id, name, rate, quant);
    }
    @Override
    public String toString() {
        return "toys{" + "id=" + super.getId() + '\''+ "name=" + super.getName() + '\''+ "rate=" + super.getRate() + '\''+ "quant=" + super.getQuant() + '}';
    }
}

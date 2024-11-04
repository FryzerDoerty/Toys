public abstract class toys {
    public int id;
    public String name;
    public   double rate;
    public int quant;

    public toys(int id, String name, double rate, int quant) {
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.quant = quant;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Integer getQuant() {
        return quant;
    }

    public void setQuant(Integer quant) {
        this.quant = quant;
    }

    @Override
    public String toString() {
        return "toys{" + "id=" + id + '\''+ "name=" + name + '\''+ "rate=" + rate + '\''+ "quant=" + quant + '}';
    }
}


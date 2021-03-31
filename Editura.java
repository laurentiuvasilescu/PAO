package model;

public class Editura {
    private String denumire;
    private Data dataInfiintare;

    public Editura(String denumire, Data dataInfiintare) {
        this.denumire = denumire;
        this.dataInfiintare = dataInfiintare;
    }

    public String getDenumire() {
        return denumire;
    }

    public Data getDataInfiintare() {
        return dataInfiintare;
    }

    @Override
    public String toString() {
        return "Editura{" +
                "denumire='" + denumire + '\'' +
                ", dataInfiintare=" + dataInfiintare +
                '}';
    }
}

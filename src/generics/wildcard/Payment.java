package generics.wildcard;

import java.util.List;

public class Payment {
    private int id;
    private int cost;

    public Payment() {
    }

    public Payment(int id, int cost) {
        this.id = id;
        this.cost = cost;
    }

    //Метод который подсчитывает общую сумму платежей с использованием (Wild Cards)
    // независимо от того какой системой был оплачен платёж
    int overallSum(List<? extends Payment> payments) {
        int sum = 0;
        for (Payment p : payments) {
            sum += p.getCost();
        }
        return sum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", cost=" + cost +
                '}';
    }
}

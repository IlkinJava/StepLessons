package two_abstract;

public class Developer implements LogicalThinking, AlghoritmicThinking {
    @Override
    public boolean isAbleToThink() {
        return true;
    }

    /**
     * В данном случае если мы реализуем 2 интерфейса с двумя одиннаковами абстрактными методами
     * то мы можем либо сделать класс абстрактным. Либо же переопределить метод
     */
    public static void main(String[] args) {
        Developer developer = new Developer();
        System.out.println(developer.isAbleToThink());
    }
}
package exception;

public class SubClass extends SuperClass {
    /**
     * Если метод супер класса не генерирует проверяемое исключение то и подкласс этого не может
     * Если же генерируется проверяемое исключение то его нужно сразу же перехватывать
     */
    @Override
    public int get() { //throws Exception --> ошибка
//        try {
//
//        } catch (Exception e){
//
//        }
        return 9;
    }
}

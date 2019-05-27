package stack_heap;


/**
 * Heap память - (куча) используется Java Runtime для выделения памяти под объекты и JRE классы
 * Создание нового объекта также происходит в куче.Здесь также работает GC
 *
 * Stack память - работает по схеме LIFO.Всякий раз когда вызывается метод в памяти стека
 * создаётся новый блок ,который содержит примитивы и ссылки на другие объекты в методе
 *
 * Размер памяти стека намного меньше чем кучи
 * Из-за простоты распределения памяти(LIFO) стековая память работает быстрее чем куча
 */
public class Memory {
    public static void main(String[] args) {
        int i = 1;
        Object object = new Object();
        Memory memory = new Memory();
        memory.exMethod(object);
    }

    private void exMethod(Object param) {
        String string = param.toString();
        System.out.println(string);
    }
    /**
     * Stack:
     * int i=1
     * object
     * memory
     * memory.exMethod()
     * param
     * string
     *Стек используется только одним патоком,т.е не может быть доступна для других патоков
     *Она существует какое-то время работы программы
     *Если память стека заполнена то бросается java.lang.StackOverFlowError
     *
     * Heap:
     * Object
     * Memory
     * StringPool
     * toString()
     * Память в куче живёт с самого начала до конца работы программы
     * Если память кучи заполнена то бросается исключение java.lang.OutOfMemoryError
     */
}

package ru.tunkoff.fintech.qa;

public class Box<T> {

    private T itemInBox;

    /**
     * Помещает объект в коробку.
     *
     * @param item - объект, присваиваемый полю itemInBox.
     */
    public void put(final T item) {
        this.itemInBox = item;
    }

    /**
     * Определяет, что находится в коробке.
     *
     * @return возвращает ссылку на объект в поле itemInBox.
     */
    public T get() {
        return this.itemInBox;
    }

}

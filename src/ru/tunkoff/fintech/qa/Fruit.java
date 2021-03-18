package ru.tunkoff.fintech.qa;


public class Fruit {

    private boolean fresh = true;

    public Fruit() {
    }

    /**
     * Задает boolean значение свежести фрукта (фрукт свежий? да/нет).
     *
     * @param isFresh - boolean значение, задаваемое полю fresh.
     */
    public void setFresh(final boolean isFresh) {
        this.fresh = isFresh;
    }

    /**
     * Получает boolean значение свежести фрукта (фрукт свежий? да/нет).
     *
     * @return возвращает значение поля fresh.
     */
    public boolean isFresh() {
        return this.fresh;
    }
}

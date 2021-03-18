package ru.tunkoff.fintech.qa;

public class BoxUtil {
    /**
     * Копирует содержимое (ссылку на объект) из Box(src) в Box(dest).
     *
     * @param src - Box коробка, содержащая объект.
     * @param dest - Box коробка, которая может быть типизирована любым родителем объекта, содержащимся в Box(src).
     * @param <T> - объект в коробке.
     */
    public static <T> void copyFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        dest.put(src.get());
    }

    /**
     *  Копирует содержимое (ссылку на объект) из Box(src) в Box(dest) при условии,
     *  что содержащийся в src фрукт является свежим (fresh == true).
     *
     * @param src - Box коробка, которая может быть типизирована только классом Fruit и его наследниками.
     * @param dest - Box коробка, которая может быть типизирована любым родителем объекта, содержащимся в Box(src).
     * @param <T> - объект в коробке.
     */
    public static <T extends Fruit> void copyFreshFruitFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        if (src.get() != null && src.get().isFresh()) {
            dest.put(src.get());
        }
    }

    /**
     * Выводит в консоль (toString()) объект во второй коробке.
     *
     * @param box - Box коробка, которая содержит в себе Box коробку, в которой может быть любой объект.
     * @param <T> - объект в коробке.
     */
    public static <T> void printElementFromTwoBoxes(final Box<Box<T>> box) {
        if (box.get().get() != null) {
            System.out.println(box.get().get().toString());
        } else {
            System.out.println(box.get().get());
        }

    }

    /**
     * Выводит в консоль (toString()) объект в последней коробке.
     *
     * @param box - Box коробка, которая содержит в себе любое кол-во вложенных Box коробок,
     *            в последней из которых может быть любой объект.
     */
    public static void printElementFromBoxes(final Box<?> box) {
        if (box.get() instanceof Box) {
            printElementFromBoxes((Box<?>) box.get());
        } else {
            if (box.get() != null) {
                System.out.println(box.get().toString());
            } else {
                System.out.println(box.get());
            }
        }
    }
}

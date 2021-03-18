package ru.tunkoff.fintech.qa;

public class Main {

    public static void main(final String[] args) {

        /* Проверка метода copyFromBoxToBox */
        System.out.println("\nМетод copyFromBoxToBox:");
        Box<String> box11 = new Box<>();
        Box<Object> box12 = new Box<>();
        box11.put("Объект");
        System.out.println(box11.get());
        System.out.println(box12.get());
        BoxUtil.copyFromBoxToBox(box11, box12);
        System.out.println(box11.get());
        System.out.println(box12.get());


        /* Проверка метода copyFreshFruitFromBoxToBox */
        System.out.println("\nМетод copyFreshFruitFromBoxToBox:");
        Box<Apple> box21 = new Box<>();
        Box<Fruit> box22 = new Box<>();
        Apple apple = new Apple();
        apple.setFresh(true);
        box21.put(apple);

        if (box21.get() != null) {
            System.out.println(box21.get() + "\t" + box21.get().isFresh());
        } else {
            System.out.println(box21.get());
        }
        if (box22.get() != null) {
            System.out.println(box22.get() + "\t" + box22.get().isFresh());
        } else {
            System.out.println(box22.get());
        }

        BoxUtil.copyFreshFruitFromBoxToBox(box21, box22);

        if (box21.get() != null) {
            System.out.println(box21.get() + "\t" + box21.get().isFresh());
        } else {
            System.out.println(box21.get());
        }
        if (box22.get() != null) {
            System.out.println(box22.get() + "\t" + box22.get().isFresh());
        } else {
            System.out.println(box22.get());
        }


        /* Проверка метода printElementFromTwoBoxes */
        System.out.println("\nМетод printElementFromTwoBoxes:");
        Box<String> box32 = new Box<>();
        Box<Box<String>> box31 = new Box<>();
        Box<Box<Box<String>>> box30 = new Box<>();
        box32.put("Объект");
        box31.put(box32);
        box30.put(box31);
        BoxUtil.printElementFromTwoBoxes(box30);
        BoxUtil.printElementFromTwoBoxes(box31);


        /* Проверка метода printElementFromBoxes */
        System.out.println("\nМетод printElementFromBoxes:");
        Box<String> box41 = new Box<>();
        Box<Box<String>> box42 = new Box<>();
        Box<Box<Box<String>>> box43 = new Box<>();
        box41.put("Объект");
        box42.put(box41);
        box43.put(box42);
        BoxUtil.printElementFromBoxes(box41);
        BoxUtil.printElementFromBoxes(box43);
    }
}

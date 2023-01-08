package edu.brain.lesson_19;

import java.util.*;

import static java.lang.System.*;

class List {
    public static void main(String[] args) {
        // 1. Базовая работа с List
        // a. Создать ArrayList<String> (list1)
        java.util.List<String> list1;

        // b. Создать массив строк. Добавить в список все элементы массива (одним методом)
        String[] strings = {"Java", "JS", "C", "C++", "C#"};
        list1 = Arrays.asList(strings);
        out.println(list1);

        // c. Создать новый (list2) ArrayList<String>, проинициализировав его предыдущим списком
        java.util.List<String> list2 = new ArrayList<>();
        list2.addAll(list1);
        out.println(list2);

        // d. Создать список (list3) используя Arrays.asList(…)
        java.util.List<String> list3 = Arrays.asList("Python", "Golang", "Basic", "Pascal", "Assembler");
        out.println(list3);

        // e. Вставить list3 в середину list2
        list2.addAll(2, list3);
        out.println(list2);

        // f. Отсортировать список по убыванию.
        Collections.sort(list2, Collections.reverseOrder());
        out.println(list2);

        // g. *Удалить каждый второй элемент списка используя listIterator
        ListIterator<String> listIterator = list2.listIterator();
        // The first case
        // while (listIterator.hasNext()) {
        //   listIterator.next();
        //   listIterator.next();
        //   listIterator.remove();
        // }

        // And second case
        for (int i = 0; i < list2.size(); i++) {
            listIterator.next();
            listIterator.next();
            listIterator.remove();
        }
        out.println(list2);

        // 2. Базовая работа с Set
        // a.Создать HashSet<String> (set1)
        java.util.Set<String> set1 = new HashSet<>();

        // b. Вставить в set 2 произвольные строки
        set1.add("Javac");
        set1.add("Engineer");

        // c.Вставить в set все элементы из list1 и list2
        set1.addAll(list1);
        set1.addAll(list2);

        // d. Вывести на экран значения set-a
        out.println(set1);

        // e. Создать LinkedHashSet<String> (set2)
        Set<String> set2 = new LinkedHashSet<>();

        // f. Вставить в set все элементы из list2 и list3
        set2.addAll(list2);
        set2.addAll(list3);

        // g. Вывести на экран значения set-a
        out.println(set2);

        // 3.Базовая работа с Map
        // a. Создать LinkedHashMap<Integer, String> (map1)
        Map<Integer, String> map1 = new LinkedHashMap<>();

        // b. Добавить в map значения всех месяцев года (номер месяца : название)
        String[] month = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        for (int i = 0; i < month.length; i++) {
            map1.put(i, month[i]);
        }

        // c. Вывести на экран первый и последний месяц года (0 и 11)
        out.println(map1.get(0));
        out.println(map1.get(11));

        // d. Вставить на место 6-го месяца слово ‘ОТПУСК’, вывести на экран
        map1.replace(5, "ОТПУСК");
        out.println(map1.get(5));

        // e. Создать HashMap<Integer, String> (map2)
        Map<Integer, String> map2 = new HashMap<>();

        // f. Вставить в map2 все значения map1
        map2.putAll(map1);

        // Вывести на экран map1, map2
        getOutputOnConsole(map1);
        out.println();
        getOutputOnConsole(map2);

        // h. *Создать map3  (ключ – имя студента (String), значение -контакты студента:
        // моб.тел, почта, скайп (Set<String>))
        Map<String, Set<String>> map3 = new HashMap<>();
        map3.put("Test1", Collections.singleton("0329234234"));
        map3.put("Test2", Collections.singleton("0929324234"));
        out.println(map3);
    }

    // g. *Создать метод для вывода всех элементов map в консоль
    static void getOutputOnConsole(Map<Integer, String> item) {
        for (Map.Entry entry : item.entrySet()) {
            System.out.printf("Key: %d  Value: %s \n", entry.getKey(), entry.getValue());
        }
    }
}

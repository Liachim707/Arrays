public class CustomArrayListExample {
    public static void main(String[] args) {
        CustomArrayList<String> list = new DefaultCustomArrayList<>();

        // Добавление элементов
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Проверка содержимого
        System.out.println("List size: " + list.size());
        System.out.println("Contains Banana: " + list.contains("Banana"));

        // Получение элементов
        System.out.println("Element at index 1: " + list.get(1));

        // Удаление элемента
        boolean removed = list.remove("Banana");
        System.out.println("Banana removed: " + removed);

        // Перебор элементов
        System.out.print("List elements: ");
        for (String item : list) {
            System.out.print(item + " ");
        }

        // Очистка списка
        list.clear();
        System.out.println("\nList is empty: " + list.isEmpty());
    }
}

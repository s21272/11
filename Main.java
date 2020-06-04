import java.util.*;

public class Main {

    public static void main(String[] args) {

        Car c1 = new Car("Mercedes", 1999);
        Car c2 = new Car("Lexus", 2000);
        Car c3 = new Car("Ferrari", 2001);
        Car c4 = new Car("Toyota", 2002);
        Car c5 = new Car("Honda", 2024);
        Car c6 = new Car("Renault", 1999);
        Car c7 = new Car("Honda", 2000);
        Car c8 = new Car("Tesla", 2020);
        Car c9 = new Car("Lada", 2002);
        Car c10 = new Car("car10", 2024);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);
        cars.add(c6);
        cars.add(c7);
        cars.add(c8);
        cars.add(c9);
        cars.add(c10);

        Collections.sort(cars);

        for (Car c : cars) {
            System.out.println(c.toString());
        }

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("id0", "item"));
        items.add(new Item("id1", "item2"));
        items.add(new Item("id3", "item3"));
        items.add(new Item("id4", "item4"));
        items.add(new Item("id5", "item5"));
        items.add(new Item("id6", "item6"));
        items.add(new Item("id7", "item7"));
        items.add(new Item("id8", "item8"));
        items.add(new Item("id9", "item9"));
        items.add(new Item("id10", "item10"));
        items.add(new Item("id11", "item11"));
        items.add(new Item("id12", "item12"));
        items.add(new Item("id13", "item13"));
        items.add(new Item("id14", "item14"));
        items.add(new Item("id15", "item15"));

        for (Item i : items) {
            i.show();
        }
        HashMap<String, String> itemsMap = new HashMap();
        for (Item i : items) {
            itemsMap.put(i.getId(), i.getName());
        }

        for (Map.Entry<String, String> entries : itemsMap.entrySet()) {
            System.out.println(entries.getKey());
            System.out.println(entries.getValue());
        }

        List<Item> itemsSub = items.subList(5,15);

        int[] arr = new int[10];
        fillArray(arr);

        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int readNumber() throws NegativeNumberException {
        Scanner sc = new Scanner(System.in);
        System.out.println("number:  ");
        int num = sc.nextInt();
        if (num < 0) {
            throw new NegativeNumberException();
        }
        return num;
    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            try {
                arr[i] = readNumber();
            } catch (NegativeNumberException exc) {
                System.out.println("The number is negative");
                arr[i] = 0;
            }
        }
    }

}

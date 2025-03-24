package Hafta_3.Haftalık_Teknik_İcerik_4;

import java.util.Arrays;

public class MyList<T> {

    public static void main(String[] args) {
        MyList<String>cars = new MyList<>();
        cars.add("BMW");
        cars.add("AUDI");
        cars.add("MERCEDES");
        cars.add("RENAULT");
        cars.add("FORD");
        cars.add("TESLA");
        cars.add("DODGE");
        cars.add("OPEL");
        cars.add("VOLKSWAGEN");
        cars.add("FIAT");
        System.out.println("Dizideki Eleman Sayısı : " + cars.size());
        System.out.println("Dizinin Kapasitesi : "+ cars.getCapacity());
        System.out.println(cars.toString());
        System.out.println("");
        cars.add("SEAT");
        System.out.println("Dizideki Eleman Sayısı : " + cars.size());
        System.out.println("Dizinin Kapasitesi : "+ cars.getCapacity());
        System.out.println(cars.toString());

        System.out.println("Değiştirilecek Araç : " + cars.get(10));
        cars.set(10, "HONDA");
        System.out.println(cars.toString());

        System.out.println("Silinecek Araç : " + cars.get(10));
        cars.remove(10);
        System.out.println(cars.toString());

        System.out.println("Dizideki araçların içerisinde BMW var mı : " + cars.contains("BMW"));
        System.out.println("Dizideki araçların içerisinde HONDA var mı : " + cars.contains("HONDA"));

    }

    private Object[] elements;
    private int size = 0;
    private static int capacity = 10;

    public MyList() {
        this.capacity = 10;
        elements = new Object[capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        elements = new Object[capacity];
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(T data) {
        if (size == capacity) {
            increaseCapacity();
        }
        elements[size++] = data;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return (T) elements[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null;
    }

    public void set(int index, T data) {
        if (index < 0 || index >= size) {
            return;
        }
        elements[index] = data;
    }

    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (elements[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T[] toArray() {
        return (T[]) Arrays.copyOf(elements, size, (Class<T[]>) elements.getClass());
    }


    public void clear() {
        elements = new Object[capacity];
        size = 0;
    }

    public MyList<T> sublist(int start, int finish) {
        if (start < 0 || finish >= size || start > finish) {
            return null;
        }
        MyList<T> subList = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            subList.add((T) elements[i]);
        }
        return subList;
    }

    public boolean contains(T data) {
        return indexOf(data) != -1;
    }

    private void increaseCapacity() {
        capacity *= 2;
        Object[] newArray = new Object[capacity];
        System.arraycopy(elements, 0, newArray, 0, size);
        elements = newArray;
    }
}

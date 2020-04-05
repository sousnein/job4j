
package ru.job4j.tracker;

import java.util.Random;
import java.util.Arrays;


public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
    /**

     * @return  возвращает копию массива this.items без null элементов
     */
    public Item[] findAll() {
        Item[] namesWithoutNull = new Item[position];
        int size = 0;
        for (int index = 0; index < this.items.length; index++) {
            Item name = items[index];
            if (name != null) {
                namesWithoutNull[size] = name;
                size++;
            }
        }
        return Arrays.copyOf(namesWithoutNull, size);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[position];
        for (int index = 0; index < position; index++) {
            Item name = this.items[index];
            if (name.getName().equals(key)) {
                result[index] = name;
            }
        }
        return Arrays.copyOf(result, position);
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }
    public boolean replace(String id, Item item) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            result = true;
        }
            return result;
    }

    public boolean delete(String id) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, index + 1, items,  index, position - index);
            items[position - 1] = null;
            position--;
            result = true;
        }
        return result;
    }
}
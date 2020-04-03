package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void findAll() {
        Tracker tracker = new Tracker();
        Item item =  new Item("test1");
        Item item3 = new Item("test2");
        tracker.add(item);
        tracker.add(item3);
        Item[] result = tracker.findAll();
        assertThat(result, is(new Item[] {item, item3}));

    }

    @Test
    public void findByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test2");
        tracker.add(item);
        Item[] result =  tracker.findByName("test2");
        assertThat(result, is(new Item[] {item}));

    }

    @Test
    public void findById() {
        Tracker tracker = new Tracker();
        Item item = new Item("test2");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result, is(item));
    }
}
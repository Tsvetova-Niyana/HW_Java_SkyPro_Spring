package sky.pro.homework.homeworkspring.repository;

import org.springframework.stereotype.Repository;
import sky.pro.homework.homeworkspring.model.Item;

import javax.annotation.PostConstruct;
import java.util.*;

@Repository
public class StoreRepository {

    private int idCounter = 1;
    private final Map<Integer, Item> store = new HashMap<>();

    @PostConstruct
    public void init() {
        store.put(idCounter, new Item(idCounter++, "Ноутбук"));
        store.put(idCounter, new Item(idCounter++, "Мышь"));
        store.put(idCounter, new Item(idCounter++, "Клавиатура"));
    }

    public void add(Item item) {
        store.put(item.getId(), item);
    }

    public Item get(int id) {
        return store.get(id);
    }

    public List<Item> getAll() {
        return new ArrayList<>(store.values());
    }

    public void update(int id, Item item) {
        if (store.containsKey(id)) {
            store.replace(id, item);
        }
    }

    public Item delete(int id) {
        return store.remove(id);
    }
}

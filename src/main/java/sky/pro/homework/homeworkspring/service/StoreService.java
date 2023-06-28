package sky.pro.homework.homeworkspring.service;

import org.springframework.stereotype.Service;
import sky.pro.homework.homeworkspring.model.Basket;
import sky.pro.homework.homeworkspring.model.Item;
import sky.pro.homework.homeworkspring.repository.StoreRepository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class StoreService {
    private final Basket basket;
    private final StoreRepository storeRepository;

    public StoreService(Basket basket, StoreRepository storeRepository) {
        this.basket = basket;
        this.storeRepository = storeRepository;
    }

    public void add(Set<Integer> id) {
        basket.add(id);
    }

    public List<Item> get() {
        return basket.get().stream()
                .map(id -> storeRepository.get(id))
                .collect(Collectors.toList());
    }
}

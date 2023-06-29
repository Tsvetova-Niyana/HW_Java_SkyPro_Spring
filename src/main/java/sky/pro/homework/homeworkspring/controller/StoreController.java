package sky.pro.homework.homeworkspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.homework.homeworkspring.model.Item;
import sky.pro.homework.homeworkspring.service.StoreService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") Set<Integer> id) {
        storeService.add(id);
    }

    @GetMapping("/get")
    public List<Item> get() {
        return storeService.get();
    }
}
//JSESSIONID=D2E9EF700EB5A2DA5F9C861E0F72C1A0
//JSESSIONID=A85202CBB57B909B0ADA926C67AC3793
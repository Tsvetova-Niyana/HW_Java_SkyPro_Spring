package sky.pro.homework.homeworkspring.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Component
@SessionScope
public class Basket {
    private final Set<Integer> id = new HashSet<>();

    public void add(Set<Integer> id) {
        this.id.addAll(id);
    }

    public Set<Integer> get() {
        return Collections.unmodifiableSet(id);
    }
}

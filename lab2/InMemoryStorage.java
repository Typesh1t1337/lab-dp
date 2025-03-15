package lab2;
import java.util.*;

public class InMemoryStorage implements Storage {
    private final Map<String, LibraryItem> items = new HashMap<>();
    private final List<User> usersData = new ArrayList<>();

    @Override
    public void save(LibraryItem item) {
        items.put(item.getId(), item);
    }

    @Override
    public LibraryItem findById(String id) {
        return items.get(id);
    }

    @Override
    public List<LibraryItem> findAll() {
        return new ArrayList<>(items.values());
    }

    @Override
    public void saveUsers(List<User> users){
        this.usersData.addAll(users);
    }


    @Override
    public void delete(String id) { items.remove(id); }
}



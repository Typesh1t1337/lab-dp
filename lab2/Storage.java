package lab2;
import java.util.List;
public interface Storage {
    void save(LibraryItem item);

    LibraryItem findById(String id);
    List<LibraryItem> findAll();
    void delete(String id);

    void saveUsers(List<User> users);

}


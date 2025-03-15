//package lab2;
//import java.util.*;
//
//public class DatabaseStorage implements Storage {
//    private final Map<String, LibraryItem> database = new HashMap<>();
//
//    @Override
//    public void save(LibraryItem item) {
//        database.put(item.getId(), item);
//    }
//
//    @Override
//    public LibraryItem findById(String id) {
//
//        return database.get(id);
//    }
//
//    @Override
//    public List<LibraryItem> findAll() {
//        return new ArrayList<>(database.values());
//    }
//
//    @Override
//    public void delete(String id) {
//        database.remove(id);
//    }
//}
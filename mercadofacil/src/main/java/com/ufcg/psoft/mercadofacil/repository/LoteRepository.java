public interface LoteRepository<T, ID> {
    T save(T lote);
    T find(ID id);

    List<T> findAll();
    T update(T lote);
    void delete(T lote);
    void deleteAll();
}

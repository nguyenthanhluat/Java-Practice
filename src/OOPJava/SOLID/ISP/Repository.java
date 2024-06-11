package OOPJava.SOLID.ISP;

interface Repository<T, ID> {
    Iterable<T> findAll();
    T findOne();
    T save();
    void update(T entity);
    void delete(ID id);
}

package mapper;

/**
 * Конвертер моделей из одного типа в другой.
 * 
 * @param тип, хранимый в БД
 * @param тип, подходящий для конвертации E
 */
public interface Mapper<E, T> {
    T toInput(E e);

    E toOutput(T t);
}

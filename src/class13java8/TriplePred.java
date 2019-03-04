package class13java8;



/**
 * Created by user on 04.03.2019.
 */
@FunctionalInterface
public interface TriplePred <T>{
    boolean test(T arg1, T arg2, T arg3);
}

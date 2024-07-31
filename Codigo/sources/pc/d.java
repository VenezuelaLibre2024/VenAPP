package pc;

import java.util.Set;

/* loaded from: classes.dex */
public interface d {
    <T> ee.a<T> a(e0<T> e0Var);

    <T> ee.b<T> b(e0<T> e0Var);

    default <T> Set<T> c(Class<T> cls) {
        return g(e0.b(cls));
    }

    <T> ee.b<Set<T>> d(e0<T> e0Var);

    default <T> T e(e0<T> e0Var) {
        ee.b<T> b10 = b(e0Var);
        if (b10 == null) {
            return null;
        }
        return b10.get();
    }

    default <T> ee.b<T> f(Class<T> cls) {
        return b(e0.b(cls));
    }

    default <T> Set<T> g(e0<T> e0Var) {
        return d(e0Var).get();
    }

    default <T> T get(Class<T> cls) {
        return (T) e(e0.b(cls));
    }

    default <T> ee.a<T> h(Class<T> cls) {
        return a(e0.b(cls));
    }
}

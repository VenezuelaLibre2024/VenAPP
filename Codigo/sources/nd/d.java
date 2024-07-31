package nd;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface d {
    <T> void b(Class<T> cls, b<? super T> bVar);

    <T> void c(Class<T> cls, b<? super T> bVar);

    <T> void d(Class<T> cls, Executor executor, b<? super T> bVar);
}

package x3;

import c4.j;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<j> f30373a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    private final androidx.collection.a<j, List<Class<?>>> f30374b = new androidx.collection.a<>();

    public List<Class<?>> a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        j andSet = this.f30373a.getAndSet(null);
        if (andSet == null) {
            andSet = new j(cls, cls2, cls3);
        } else {
            andSet.a(cls, cls2, cls3);
        }
        synchronized (this.f30374b) {
            list = this.f30374b.get(andSet);
        }
        this.f30373a.set(andSet);
        return list;
    }

    public void b(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f30374b) {
            this.f30374b.put(new j(cls, cls2, cls3), list);
        }
    }
}

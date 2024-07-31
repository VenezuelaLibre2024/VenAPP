package x3;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final List<C0495a<?>> f30366a = new ArrayList();

    /* renamed from: x3.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0495a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f30367a;

        /* renamed from: b, reason: collision with root package name */
        final h3.d<T> f30368b;

        C0495a(Class<T> cls, h3.d<T> dVar) {
            this.f30367a = cls;
            this.f30368b = dVar;
        }

        boolean a(Class<?> cls) {
            return this.f30367a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(Class<T> cls, h3.d<T> dVar) {
        this.f30366a.add(new C0495a<>(cls, dVar));
    }

    public synchronized <T> h3.d<T> b(Class<T> cls) {
        for (C0495a<?> c0495a : this.f30366a) {
            if (c0495a.a(cls)) {
                return (h3.d<T>) c0495a.f30368b;
            }
        }
        return null;
    }
}

package el;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public abstract class b<T> extends a0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f14757a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f14756a;

    private final Object c(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14757a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = a.f14756a;
        return obj2 != obj3 ? obj2 : androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj3, obj) ? obj : atomicReferenceFieldUpdater.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // el.a0
    public final Object a(Object obj) {
        Object obj2 = f14757a.get(this);
        if (obj2 == a.f14756a) {
            obj2 = c(d(obj));
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t10, Object obj);

    public abstract Object d(T t10);
}

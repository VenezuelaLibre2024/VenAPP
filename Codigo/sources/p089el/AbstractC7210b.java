package p089el;

import androidx.concurrent.futures.C0741b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: el.b */
/* loaded from: classes3.dex */
public abstract class AbstractC7210b<T> extends AbstractC7209a0 {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f16180a = AtomicReferenceFieldUpdater.newUpdater(AbstractC7210b.class, Object.class, "_consensus");
    private volatile Object _consensus = C7208a.f16179a;

    /* renamed from: c */
    private final Object m21540c(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16180a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = C7208a.f16179a;
        return obj2 != obj3 ? obj2 : C0741b.m3751a(atomicReferenceFieldUpdater, this, obj3, obj) ? obj : atomicReferenceFieldUpdater.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p089el.AbstractC7209a0
    /* renamed from: a */
    public final Object mo21539a(Object obj) {
        Object obj2 = f16180a.get(this);
        if (obj2 == C7208a.f16179a) {
            obj2 = m21540c(mo21542d(obj));
        }
        mo21541b(obj, obj2);
        return obj2;
    }

    /* renamed from: b */
    public abstract void mo21541b(T t10, Object obj);

    /* renamed from: d */
    public abstract Object mo21542d(T t10);
}

package p433x3;

import androidx.collection.C0731a;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p036c4.C1869j;

/* renamed from: x3.d */
/* loaded from: classes.dex */
public class C12271d {

    /* renamed from: a */
    private final AtomicReference<C1869j> f32885a = new AtomicReference<>();

    /* renamed from: b */
    private final C0731a<C1869j, List<Class<?>>> f32886b = new C0731a<>();

    /* renamed from: a */
    public List<Class<?>> m39508a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        C1869j andSet = this.f32885a.getAndSet(null);
        if (andSet == null) {
            andSet = new C1869j(cls, cls2, cls3);
        } else {
            andSet.m9946a(cls, cls2, cls3);
        }
        synchronized (this.f32886b) {
            list = this.f32886b.get(andSet);
        }
        this.f32885a.set(andSet);
        return list;
    }

    /* renamed from: b */
    public void m39509b(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f32886b) {
            this.f32886b.put(new C1869j(cls, cls2, cls3), list);
        }
    }
}

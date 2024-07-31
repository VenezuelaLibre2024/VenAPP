package p433x3;

import androidx.collection.C0731a;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p036c4.C1869j;
import p171j3.C8962i;
import p171j3.C8973t;
import p393v3.C11625g;

/* renamed from: x3.c */
/* loaded from: classes.dex */
public class C12270c {

    /* renamed from: c */
    private static final C8973t<?, ?, ?> f32882c = new C8973t<>(Object.class, Object.class, Object.class, Collections.singletonList(new C8962i(Object.class, Object.class, Object.class, Collections.emptyList(), new C11625g(), null)), null);

    /* renamed from: a */
    private final C0731a<C1869j, C8973t<?, ?, ?>> f32883a = new C0731a<>();

    /* renamed from: b */
    private final AtomicReference<C1869j> f32884b = new AtomicReference<>();

    /* renamed from: b */
    private C1869j m39504b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C1869j andSet = this.f32884b.getAndSet(null);
        if (andSet == null) {
            andSet = new C1869j();
        }
        andSet.m9946a(cls, cls2, cls3);
        return andSet;
    }

    /* renamed from: a */
    public <Data, TResource, Transcode> C8973t<Data, TResource, Transcode> m39505a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C8973t<Data, TResource, Transcode> c8973t;
        C1869j m39504b = m39504b(cls, cls2, cls3);
        synchronized (this.f32883a) {
            c8973t = (C8973t) this.f32883a.get(m39504b);
        }
        this.f32884b.set(m39504b);
        return c8973t;
    }

    /* renamed from: c */
    public boolean m39506c(C8973t<?, ?, ?> c8973t) {
        return f32882c.equals(c8973t);
    }

    /* renamed from: d */
    public void m39507d(Class<?> cls, Class<?> cls2, Class<?> cls3, C8973t<?, ?, ?> c8973t) {
        synchronized (this.f32883a) {
            C0731a<C1869j, C8973t<?, ?, ?>> c0731a = this.f32883a;
            C1869j c1869j = new C1869j(cls, cls2, cls3);
            if (c8973t == null) {
                c8973t = f32882c;
            }
            c0731a.put(c1869j, c8973t);
        }
    }
}

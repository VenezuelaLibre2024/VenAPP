package x3;

import c4.j;
import j3.i;
import j3.t;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import v3.g;

/* loaded from: classes.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static final t<?, ?, ?> f30370c = new t<>(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.emptyList(), new g(), null)), null);

    /* renamed from: a, reason: collision with root package name */
    private final androidx.collection.a<j, t<?, ?, ?>> f30371a = new androidx.collection.a<>();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<j> f30372b = new AtomicReference<>();

    private j b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        j andSet = this.f30372b.getAndSet(null);
        if (andSet == null) {
            andSet = new j();
        }
        andSet.a(cls, cls2, cls3);
        return andSet;
    }

    public <Data, TResource, Transcode> t<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        t<Data, TResource, Transcode> tVar;
        j b10 = b(cls, cls2, cls3);
        synchronized (this.f30371a) {
            tVar = (t) this.f30371a.get(b10);
        }
        this.f30372b.set(b10);
        return tVar;
    }

    public boolean c(t<?, ?, ?> tVar) {
        return f30370c.equals(tVar);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, t<?, ?, ?> tVar) {
        synchronized (this.f30371a) {
            androidx.collection.a<j, t<?, ?, ?>> aVar = this.f30371a;
            j jVar = new j(cls, cls2, cls3);
            if (tVar == null) {
                tVar = f30370c;
            }
            aVar.put(jVar, tVar);
        }
    }
}

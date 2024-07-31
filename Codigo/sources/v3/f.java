package v3;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final List<a<?, ?>> f27902a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a<Z, R> {

        /* renamed from: a, reason: collision with root package name */
        final Class<Z> f27903a;

        /* renamed from: b, reason: collision with root package name */
        final Class<R> f27904b;

        /* renamed from: c, reason: collision with root package name */
        final e<Z, R> f27905c;

        a(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
            this.f27903a = cls;
            this.f27904b = cls2;
            this.f27905c = eVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f27903a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f27904b);
        }
    }

    public synchronized <Z, R> e<Z, R> a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a<?, ?> aVar : this.f27902a) {
            if (aVar.a(cls, cls2)) {
                return (e<Z, R>) aVar.f27905c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized <Z, R> List<Class<R>> b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.f27902a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f27904b)) {
                arrayList.add(aVar.f27904b);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
        this.f27902a.add(new a<>(cls, cls2, eVar));
    }
}

package n3;

import com.bumptech.glide.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import n3.o;

/* loaded from: classes.dex */
public class s {

    /* renamed from: e, reason: collision with root package name */
    private static final c f21764e = new c();

    /* renamed from: f, reason: collision with root package name */
    private static final o<Object, Object> f21765f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final List<b<?, ?>> f21766a;

    /* renamed from: b, reason: collision with root package name */
    private final c f21767b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<b<?, ?>> f21768c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.core.util.e<List<Throwable>> f21769d;

    /* loaded from: classes.dex */
    private static class a implements o<Object, Object> {
        a() {
        }

        @Override // n3.o
        public boolean a(Object obj) {
            return false;
        }

        @Override // n3.o
        public o.a<Object> b(Object obj, int i10, int i11, h3.h hVar) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b<Model, Data> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<Model> f21770a;

        /* renamed from: b, reason: collision with root package name */
        final Class<Data> f21771b;

        /* renamed from: c, reason: collision with root package name */
        final p<? extends Model, ? extends Data> f21772c;

        public b(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
            this.f21770a = cls;
            this.f21771b = cls2;
            this.f21772c = pVar;
        }

        public boolean a(Class<?> cls) {
            return this.f21770a.isAssignableFrom(cls);
        }

        public boolean b(Class<?> cls, Class<?> cls2) {
            return a(cls) && this.f21771b.isAssignableFrom(cls2);
        }
    }

    /* loaded from: classes.dex */
    static class c {
        c() {
        }

        public <Model, Data> r<Model, Data> a(List<o<Model, Data>> list, androidx.core.util.e<List<Throwable>> eVar) {
            return new r<>(list, eVar);
        }
    }

    public s(androidx.core.util.e<List<Throwable>> eVar) {
        this(eVar, f21764e);
    }

    s(androidx.core.util.e<List<Throwable>> eVar, c cVar) {
        this.f21766a = new ArrayList();
        this.f21768c = new HashSet();
        this.f21769d = eVar;
        this.f21767b = cVar;
    }

    private <Model, Data> void a(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar, boolean z10) {
        b<?, ?> bVar = new b<>(cls, cls2, pVar);
        List<b<?, ?>> list = this.f21766a;
        list.add(z10 ? list.size() : 0, bVar);
    }

    private <Model, Data> o<Model, Data> e(b<?, ?> bVar) {
        return (o) c4.k.d(bVar.f21772c.d(this));
    }

    private static <Model, Data> o<Model, Data> f() {
        return (o<Model, Data>) f21765f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized <Model, Data> void b(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
        a(cls, cls2, pVar, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized <Model> List<o<Model, ?>> c(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f21766a) {
                if (!this.f21768c.contains(bVar) && bVar.a(cls)) {
                    this.f21768c.add(bVar);
                    arrayList.add(e(bVar));
                    this.f21768c.remove(bVar);
                }
            }
        } catch (Throwable th2) {
            this.f21768c.clear();
            throw th2;
        }
        return arrayList;
    }

    public synchronized <Model, Data> o<Model, Data> d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b<?, ?> bVar : this.f21766a) {
                if (this.f21768c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f21768c.add(bVar);
                    arrayList.add(e(bVar));
                    this.f21768c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f21767b.a(arrayList, this.f21769d);
            }
            if (arrayList.size() == 1) {
                return (o) arrayList.get(0);
            }
            if (!z10) {
                throw new h.c((Class<?>) cls, (Class<?>) cls2);
            }
            return f();
        } catch (Throwable th2) {
            this.f21768c.clear();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized List<Class<?>> g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f21766a) {
            if (!arrayList.contains(bVar.f21771b) && bVar.a(cls)) {
                arrayList.add(bVar.f21771b);
            }
        }
        return arrayList;
    }
}

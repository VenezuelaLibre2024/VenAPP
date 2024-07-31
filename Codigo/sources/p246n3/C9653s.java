package p246n3;

import androidx.core.util.InterfaceC0981e;
import com.bumptech.glide.C2122h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p036c4.C1870k;
import p129h3.C7624h;
import p246n3.InterfaceC9649o;

/* renamed from: n3.s */
/* loaded from: classes.dex */
public class C9653s {

    /* renamed from: e */
    private static final c f23697e = new c();

    /* renamed from: f */
    private static final InterfaceC9649o<Object, Object> f23698f = new a();

    /* renamed from: a */
    private final List<b<?, ?>> f23699a;

    /* renamed from: b */
    private final c f23700b;

    /* renamed from: c */
    private final Set<b<?, ?>> f23701c;

    /* renamed from: d */
    private final InterfaceC0981e<List<Throwable>> f23702d;

    /* renamed from: n3.s$a */
    /* loaded from: classes.dex */
    private static class a implements InterfaceC9649o<Object, Object> {
        a() {
        }

        @Override // p246n3.InterfaceC9649o
        /* renamed from: a */
        public boolean mo28847a(Object obj) {
            return false;
        }

        @Override // p246n3.InterfaceC9649o
        /* renamed from: b */
        public InterfaceC9649o.a<Object> mo28848b(Object obj, int i10, int i11, C7624h c7624h) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n3.s$b */
    /* loaded from: classes.dex */
    public static class b<Model, Data> {

        /* renamed from: a */
        private final Class<Model> f23703a;

        /* renamed from: b */
        final Class<Data> f23704b;

        /* renamed from: c */
        final InterfaceC9650p<? extends Model, ? extends Data> f23705c;

        public b(Class<Model> cls, Class<Data> cls2, InterfaceC9650p<? extends Model, ? extends Data> interfaceC9650p) {
            this.f23703a = cls;
            this.f23704b = cls2;
            this.f23705c = interfaceC9650p;
        }

        /* renamed from: a */
        public boolean m28932a(Class<?> cls) {
            return this.f23703a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean m28933b(Class<?> cls, Class<?> cls2) {
            return m28932a(cls) && this.f23704b.isAssignableFrom(cls2);
        }
    }

    /* renamed from: n3.s$c */
    /* loaded from: classes.dex */
    static class c {
        c() {
        }

        /* renamed from: a */
        public <Model, Data> C9652r<Model, Data> m28934a(List<InterfaceC9649o<Model, Data>> list, InterfaceC0981e<List<Throwable>> interfaceC0981e) {
            return new C9652r<>(list, interfaceC0981e);
        }
    }

    public C9653s(InterfaceC0981e<List<Throwable>> interfaceC0981e) {
        this(interfaceC0981e, f23697e);
    }

    C9653s(InterfaceC0981e<List<Throwable>> interfaceC0981e, c cVar) {
        this.f23699a = new ArrayList();
        this.f23701c = new HashSet();
        this.f23702d = interfaceC0981e;
        this.f23700b = cVar;
    }

    /* renamed from: a */
    private <Model, Data> void m28925a(Class<Model> cls, Class<Data> cls2, InterfaceC9650p<? extends Model, ? extends Data> interfaceC9650p, boolean z10) {
        b<?, ?> bVar = new b<>(cls, cls2, interfaceC9650p);
        List<b<?, ?>> list = this.f23699a;
        list.add(z10 ? list.size() : 0, bVar);
    }

    /* renamed from: e */
    private <Model, Data> InterfaceC9649o<Model, Data> m28926e(b<?, ?> bVar) {
        return (InterfaceC9649o) C1870k.m9950d(bVar.f23705c.mo28852d(this));
    }

    /* renamed from: f */
    private static <Model, Data> InterfaceC9649o<Model, Data> m28927f() {
        return (InterfaceC9649o<Model, Data>) f23698f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized <Model, Data> void m28928b(Class<Model> cls, Class<Data> cls2, InterfaceC9650p<? extends Model, ? extends Data> interfaceC9650p) {
        m28925a(cls, cls2, interfaceC9650p, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized <Model> List<InterfaceC9649o<Model, ?>> m28929c(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f23699a) {
                if (!this.f23701c.contains(bVar) && bVar.m28932a(cls)) {
                    this.f23701c.add(bVar);
                    arrayList.add(m28926e(bVar));
                    this.f23701c.remove(bVar);
                }
            }
        } catch (Throwable th2) {
            this.f23701c.clear();
            throw th2;
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized <Model, Data> InterfaceC9649o<Model, Data> m28930d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b<?, ?> bVar : this.f23699a) {
                if (this.f23701c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.m28933b(cls, cls2)) {
                    this.f23701c.add(bVar);
                    arrayList.add(m28926e(bVar));
                    this.f23701c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f23700b.m28934a(arrayList, this.f23702d);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC9649o) arrayList.get(0);
            }
            if (!z10) {
                throw new C2122h.c((Class<?>) cls, (Class<?>) cls2);
            }
            return m28927f();
        } catch (Throwable th2) {
            this.f23701c.clear();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized List<Class<?>> m28931g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f23699a) {
            if (!arrayList.contains(bVar.f23704b) && bVar.m28932a(cls)) {
                arrayList.add(bVar.f23704b);
            }
        }
        return arrayList;
    }
}

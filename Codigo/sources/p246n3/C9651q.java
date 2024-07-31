package p246n3;

import androidx.core.util.InterfaceC0981e;
import com.bumptech.glide.C2122h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: n3.q */
/* loaded from: classes.dex */
public class C9651q {

    /* renamed from: a */
    private final C9653s f23684a;

    /* renamed from: b */
    private final a f23685b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n3.q$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final Map<Class<?>, C13226a<?>> f23686a = new HashMap();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n3.q$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C13226a<Model> {

            /* renamed from: a */
            final List<InterfaceC9649o<Model, ?>> f23687a;

            public C13226a(List<InterfaceC9649o<Model, ?>> list) {
                this.f23687a = list;
            }
        }

        a() {
        }

        /* renamed from: a */
        public void m28921a() {
            this.f23686a.clear();
        }

        /* renamed from: b */
        public <Model> List<InterfaceC9649o<Model, ?>> m28922b(Class<Model> cls) {
            C13226a<?> c13226a = this.f23686a.get(cls);
            if (c13226a == null) {
                return null;
            }
            return (List<InterfaceC9649o<Model, ?>>) c13226a.f23687a;
        }

        /* renamed from: c */
        public <Model> void m28923c(Class<Model> cls, List<InterfaceC9649o<Model, ?>> list) {
            if (this.f23686a.put(cls, new C13226a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public C9651q(InterfaceC0981e<List<Throwable>> interfaceC0981e) {
        this(new C9653s(interfaceC0981e));
    }

    private C9651q(C9653s c9653s) {
        this.f23685b = new a();
        this.f23684a = c9653s;
    }

    /* renamed from: b */
    private static <A> Class<A> m28916b(A a10) {
        return (Class<A>) a10.getClass();
    }

    /* renamed from: e */
    private synchronized <A> List<InterfaceC9649o<A, ?>> m28917e(Class<A> cls) {
        List<InterfaceC9649o<A, ?>> m28922b;
        m28922b = this.f23685b.m28922b(cls);
        if (m28922b == null) {
            m28922b = Collections.unmodifiableList(this.f23684a.m28929c(cls));
            this.f23685b.m28923c(cls, m28922b);
        }
        return m28922b;
    }

    /* renamed from: a */
    public synchronized <Model, Data> void m28918a(Class<Model> cls, Class<Data> cls2, InterfaceC9650p<? extends Model, ? extends Data> interfaceC9650p) {
        this.f23684a.m28928b(cls, cls2, interfaceC9650p);
        this.f23685b.m28921a();
    }

    /* renamed from: c */
    public synchronized List<Class<?>> m28919c(Class<?> cls) {
        return this.f23684a.m28931g(cls);
    }

    /* renamed from: d */
    public <A> List<InterfaceC9649o<A, ?>> m28920d(A a10) {
        List<InterfaceC9649o<A, ?>> m28917e = m28917e(m28916b(a10));
        if (m28917e.isEmpty()) {
            throw new C2122h.c(a10);
        }
        int size = m28917e.size();
        List<InterfaceC9649o<A, ?>> emptyList = Collections.emptyList();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC9649o<A, ?> interfaceC9649o = m28917e.get(i10);
            if (interfaceC9649o.mo28847a(a10)) {
                if (z10) {
                    emptyList = new ArrayList<>(size - i10);
                    z10 = false;
                }
                emptyList.add(interfaceC9649o);
            }
        }
        if (emptyList.isEmpty()) {
            throw new C2122h.c(a10, m28917e);
        }
        return emptyList;
    }
}

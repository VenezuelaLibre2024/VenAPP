package n3;

import com.bumptech.glide.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final s f21751a;

    /* renamed from: b, reason: collision with root package name */
    private final a f21752b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, C0354a<?>> f21753a = new HashMap();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n3.q$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0354a<Model> {

            /* renamed from: a, reason: collision with root package name */
            final List<o<Model, ?>> f21754a;

            public C0354a(List<o<Model, ?>> list) {
                this.f21754a = list;
            }
        }

        a() {
        }

        public void a() {
            this.f21753a.clear();
        }

        public <Model> List<o<Model, ?>> b(Class<Model> cls) {
            C0354a<?> c0354a = this.f21753a.get(cls);
            if (c0354a == null) {
                return null;
            }
            return (List<o<Model, ?>>) c0354a.f21754a;
        }

        public <Model> void c(Class<Model> cls, List<o<Model, ?>> list) {
            if (this.f21753a.put(cls, new C0354a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public q(androidx.core.util.e<List<Throwable>> eVar) {
        this(new s(eVar));
    }

    private q(s sVar) {
        this.f21752b = new a();
        this.f21751a = sVar;
    }

    private static <A> Class<A> b(A a10) {
        return (Class<A>) a10.getClass();
    }

    private synchronized <A> List<o<A, ?>> e(Class<A> cls) {
        List<o<A, ?>> b10;
        b10 = this.f21752b.b(cls);
        if (b10 == null) {
            b10 = Collections.unmodifiableList(this.f21751a.c(cls));
            this.f21752b.c(cls, b10);
        }
        return b10;
    }

    public synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
        this.f21751a.b(cls, cls2, pVar);
        this.f21752b.a();
    }

    public synchronized List<Class<?>> c(Class<?> cls) {
        return this.f21751a.g(cls);
    }

    public <A> List<o<A, ?>> d(A a10) {
        List<o<A, ?>> e10 = e(b(a10));
        if (e10.isEmpty()) {
            throw new h.c(a10);
        }
        int size = e10.size();
        List<o<A, ?>> emptyList = Collections.emptyList();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            o<A, ?> oVar = e10.get(i10);
            if (oVar.a(a10)) {
                if (z10) {
                    emptyList = new ArrayList<>(size - i10);
                    z10 = false;
                }
                emptyList.add(oVar);
            }
        }
        if (emptyList.isEmpty()) {
            throw new h.c(a10, e10);
        }
        return emptyList;
    }
}

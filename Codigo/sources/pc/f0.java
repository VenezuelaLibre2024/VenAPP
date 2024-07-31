package pc;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f0 implements d {

    /* renamed from: a, reason: collision with root package name */
    private final Set<e0<?>> f22984a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<e0<?>> f22985b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<e0<?>> f22986c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<e0<?>> f22987d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<e0<?>> f22988e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<Class<?>> f22989f;

    /* renamed from: g, reason: collision with root package name */
    private final d f22990g;

    /* loaded from: classes.dex */
    private static class a implements nd.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set<Class<?>> f22991a;

        /* renamed from: b, reason: collision with root package name */
        private final nd.c f22992b;

        public a(Set<Class<?>> set, nd.c cVar) {
            this.f22991a = set;
            this.f22992b = cVar;
        }

        @Override // nd.c
        public void a(nd.a<?> aVar) {
            if (!this.f22991a.contains(aVar.b())) {
                throw new s(String.format("Attempting to publish an undeclared event %s.", aVar));
            }
            this.f22992b.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(c<?> cVar, d dVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : cVar.g()) {
            if (qVar.e()) {
                boolean g10 = qVar.g();
                e0<?> c10 = qVar.c();
                if (g10) {
                    hashSet4.add(c10);
                } else {
                    hashSet.add(c10);
                }
            } else if (qVar.d()) {
                hashSet3.add(qVar.c());
            } else {
                boolean g11 = qVar.g();
                e0<?> c11 = qVar.c();
                if (g11) {
                    hashSet5.add(c11);
                } else {
                    hashSet2.add(c11);
                }
            }
        }
        if (!cVar.k().isEmpty()) {
            hashSet.add(e0.b(nd.c.class));
        }
        this.f22984a = Collections.unmodifiableSet(hashSet);
        this.f22985b = Collections.unmodifiableSet(hashSet2);
        this.f22986c = Collections.unmodifiableSet(hashSet3);
        this.f22987d = Collections.unmodifiableSet(hashSet4);
        this.f22988e = Collections.unmodifiableSet(hashSet5);
        this.f22989f = cVar.k();
        this.f22990g = dVar;
    }

    @Override // pc.d
    public <T> ee.a<T> a(e0<T> e0Var) {
        if (this.f22986c.contains(e0Var)) {
            return this.f22990g.a(e0Var);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Deferred<%s>.", e0Var));
    }

    @Override // pc.d
    public <T> ee.b<T> b(e0<T> e0Var) {
        if (this.f22985b.contains(e0Var)) {
            return this.f22990g.b(e0Var);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<%s>.", e0Var));
    }

    @Override // pc.d
    public <T> ee.b<Set<T>> d(e0<T> e0Var) {
        if (this.f22988e.contains(e0Var)) {
            return this.f22990g.d(e0Var);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", e0Var));
    }

    @Override // pc.d
    public <T> T e(e0<T> e0Var) {
        if (this.f22984a.contains(e0Var)) {
            return (T) this.f22990g.e(e0Var);
        }
        throw new s(String.format("Attempting to request an undeclared dependency %s.", e0Var));
    }

    @Override // pc.d
    public <T> ee.b<T> f(Class<T> cls) {
        return b(e0.b(cls));
    }

    @Override // pc.d
    public <T> Set<T> g(e0<T> e0Var) {
        if (this.f22987d.contains(e0Var)) {
            return this.f22990g.g(e0Var);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Set<%s>.", e0Var));
    }

    @Override // pc.d
    public <T> T get(Class<T> cls) {
        if (!this.f22984a.contains(e0.b(cls))) {
            throw new s(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t10 = (T) this.f22990g.get(cls);
        return !cls.equals(nd.c.class) ? t10 : (T) new a(this.f22989f, (nd.c) t10);
    }

    @Override // pc.d
    public <T> ee.a<T> h(Class<T> cls) {
        return a(e0.b(cls));
    }
}

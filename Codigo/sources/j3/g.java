package j3;

import j3.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n3.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g<Transcode> {

    /* renamed from: a, reason: collision with root package name */
    private final List<o.a<?>> f19571a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<h3.f> f19572b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.d f19573c;

    /* renamed from: d, reason: collision with root package name */
    private Object f19574d;

    /* renamed from: e, reason: collision with root package name */
    private int f19575e;

    /* renamed from: f, reason: collision with root package name */
    private int f19576f;

    /* renamed from: g, reason: collision with root package name */
    private Class<?> f19577g;

    /* renamed from: h, reason: collision with root package name */
    private h.e f19578h;

    /* renamed from: i, reason: collision with root package name */
    private h3.h f19579i;

    /* renamed from: j, reason: collision with root package name */
    private Map<Class<?>, h3.l<?>> f19580j;

    /* renamed from: k, reason: collision with root package name */
    private Class<Transcode> f19581k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f19582l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f19583m;

    /* renamed from: n, reason: collision with root package name */
    private h3.f f19584n;

    /* renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.g f19585o;

    /* renamed from: p, reason: collision with root package name */
    private j f19586p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f19587q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f19588r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f19573c = null;
        this.f19574d = null;
        this.f19584n = null;
        this.f19577g = null;
        this.f19581k = null;
        this.f19579i = null;
        this.f19585o = null;
        this.f19580j = null;
        this.f19586p = null;
        this.f19571a.clear();
        this.f19582l = false;
        this.f19572b.clear();
        this.f19583m = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k3.b b() {
        return this.f19573c.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<h3.f> c() {
        if (!this.f19583m) {
            this.f19583m = true;
            this.f19572b.clear();
            List<o.a<?>> g10 = g();
            int size = g10.size();
            for (int i10 = 0; i10 < size; i10++) {
                o.a<?> aVar = g10.get(i10);
                if (!this.f19572b.contains(aVar.f21748a)) {
                    this.f19572b.add(aVar.f21748a);
                }
                for (int i11 = 0; i11 < aVar.f21749b.size(); i11++) {
                    if (!this.f19572b.contains(aVar.f21749b.get(i11))) {
                        this.f19572b.add(aVar.f21749b.get(i11));
                    }
                }
            }
        }
        return this.f19572b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l3.a d() {
        return this.f19578h.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j e() {
        return this.f19586p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f19576f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<o.a<?>> g() {
        if (!this.f19582l) {
            this.f19582l = true;
            this.f19571a.clear();
            List i10 = this.f19573c.h().i(this.f19574d);
            int size = i10.size();
            for (int i11 = 0; i11 < size; i11++) {
                o.a<?> b10 = ((n3.o) i10.get(i11)).b(this.f19574d, this.f19575e, this.f19576f, this.f19579i);
                if (b10 != null) {
                    this.f19571a.add(b10);
                }
            }
        }
        return this.f19571a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <Data> t<Data, ?, Transcode> h(Class<Data> cls) {
        return this.f19573c.h().h(cls, this.f19577g, this.f19581k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Class<?> i() {
        return this.f19574d.getClass();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<n3.o<File, ?>> j(File file) {
        return this.f19573c.h().i(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h3.h k() {
        return this.f19579i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.bumptech.glide.g l() {
        return this.f19585o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Class<?>> m() {
        return this.f19573c.h().j(this.f19574d.getClass(), this.f19577g, this.f19581k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <Z> h3.k<Z> n(v<Z> vVar) {
        return this.f19573c.h().k(vVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> com.bumptech.glide.load.data.e<T> o(T t10) {
        return this.f19573c.h().l(t10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h3.f p() {
        return this.f19584n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <X> h3.d<X> q(X x10) {
        return this.f19573c.h().m(x10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Class<?> r() {
        return this.f19581k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <Z> h3.l<Z> s(Class<Z> cls) {
        h3.l<Z> lVar = (h3.l) this.f19580j.get(cls);
        if (lVar == null) {
            Iterator<Map.Entry<Class<?>, h3.l<?>>> it = this.f19580j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, h3.l<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    lVar = (h3.l) next.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f19580j.isEmpty() || !this.f19587q) {
            return p3.n.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int t() {
        return this.f19575e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean u(Class<?> cls) {
        return h(cls) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public <R> void v(com.bumptech.glide.d dVar, Object obj, h3.f fVar, int i10, int i11, j jVar, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, h3.h hVar, Map<Class<?>, h3.l<?>> map, boolean z10, boolean z11, h.e eVar) {
        this.f19573c = dVar;
        this.f19574d = obj;
        this.f19584n = fVar;
        this.f19575e = i10;
        this.f19576f = i11;
        this.f19586p = jVar;
        this.f19577g = cls;
        this.f19578h = eVar;
        this.f19581k = cls2;
        this.f19585o = gVar;
        this.f19579i = hVar;
        this.f19580j = map;
        this.f19587q = z10;
        this.f19588r = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean w(v<?> vVar) {
        return this.f19573c.h().n(vVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x() {
        return this.f19588r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean y(h3.f fVar) {
        List<o.a<?>> g10 = g();
        int size = g10.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (g10.get(i10).f21748a.equals(fVar)) {
                return true;
            }
        }
        return false;
    }
}

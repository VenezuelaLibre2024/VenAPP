package j3;

import android.util.Log;
import d4.a;
import j3.h;
import j3.p;
import java.util.Map;
import java.util.concurrent.Executor;
import l3.a;
import l3.h;

/* loaded from: classes.dex */
public class k implements m, h.a, p.a {

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f19625i = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    private final s f19626a;

    /* renamed from: b, reason: collision with root package name */
    private final o f19627b;

    /* renamed from: c, reason: collision with root package name */
    private final l3.h f19628c;

    /* renamed from: d, reason: collision with root package name */
    private final b f19629d;

    /* renamed from: e, reason: collision with root package name */
    private final y f19630e;

    /* renamed from: f, reason: collision with root package name */
    private final c f19631f;

    /* renamed from: g, reason: collision with root package name */
    private final a f19632g;

    /* renamed from: h, reason: collision with root package name */
    private final j3.a f19633h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final h.e f19634a;

        /* renamed from: b, reason: collision with root package name */
        final androidx.core.util.e<h<?>> f19635b = d4.a.d(150, new C0309a());

        /* renamed from: c, reason: collision with root package name */
        private int f19636c;

        /* renamed from: j3.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0309a implements a.d<h<?>> {
            C0309a() {
            }

            @Override // d4.a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h<?> a() {
                a aVar = a.this;
                return new h<>(aVar.f19634a, aVar.f19635b);
            }
        }

        a(h.e eVar) {
            this.f19634a = eVar;
        }

        <R> h<R> a(com.bumptech.glide.d dVar, Object obj, n nVar, h3.f fVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, j jVar, Map<Class<?>, h3.l<?>> map, boolean z10, boolean z11, boolean z12, h3.h hVar, h.b<R> bVar) {
            h hVar2 = (h) c4.k.d(this.f19635b.b());
            int i12 = this.f19636c;
            this.f19636c = i12 + 1;
            return hVar2.v(dVar, obj, nVar, fVar, i10, i11, cls, cls2, gVar, jVar, map, z10, z11, z12, hVar, bVar, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final m3.a f19638a;

        /* renamed from: b, reason: collision with root package name */
        final m3.a f19639b;

        /* renamed from: c, reason: collision with root package name */
        final m3.a f19640c;

        /* renamed from: d, reason: collision with root package name */
        final m3.a f19641d;

        /* renamed from: e, reason: collision with root package name */
        final m f19642e;

        /* renamed from: f, reason: collision with root package name */
        final p.a f19643f;

        /* renamed from: g, reason: collision with root package name */
        final androidx.core.util.e<l<?>> f19644g = d4.a.d(150, new a());

        /* loaded from: classes.dex */
        class a implements a.d<l<?>> {
            a() {
            }

            @Override // d4.a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public l<?> a() {
                b bVar = b.this;
                return new l<>(bVar.f19638a, bVar.f19639b, bVar.f19640c, bVar.f19641d, bVar.f19642e, bVar.f19643f, bVar.f19644g);
            }
        }

        b(m3.a aVar, m3.a aVar2, m3.a aVar3, m3.a aVar4, m mVar, p.a aVar5) {
            this.f19638a = aVar;
            this.f19639b = aVar2;
            this.f19640c = aVar3;
            this.f19641d = aVar4;
            this.f19642e = mVar;
            this.f19643f = aVar5;
        }

        <R> l<R> a(h3.f fVar, boolean z10, boolean z11, boolean z12, boolean z13) {
            return ((l) c4.k.d(this.f19644g.b())).l(fVar, z10, z11, z12, z13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c implements h.e {

        /* renamed from: a, reason: collision with root package name */
        private final a.InterfaceC0327a f19646a;

        /* renamed from: b, reason: collision with root package name */
        private volatile l3.a f19647b;

        c(a.InterfaceC0327a interfaceC0327a) {
            this.f19646a = interfaceC0327a;
        }

        @Override // j3.h.e
        public l3.a a() {
            if (this.f19647b == null) {
                synchronized (this) {
                    if (this.f19647b == null) {
                        this.f19647b = this.f19646a.build();
                    }
                    if (this.f19647b == null) {
                        this.f19647b = new l3.b();
                    }
                }
            }
            return this.f19647b;
        }
    }

    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a, reason: collision with root package name */
        private final l<?> f19648a;

        /* renamed from: b, reason: collision with root package name */
        private final y3.j f19649b;

        d(y3.j jVar, l<?> lVar) {
            this.f19649b = jVar;
            this.f19648a = lVar;
        }

        public void a() {
            synchronized (k.this) {
                this.f19648a.r(this.f19649b);
            }
        }
    }

    k(l3.h hVar, a.InterfaceC0327a interfaceC0327a, m3.a aVar, m3.a aVar2, m3.a aVar3, m3.a aVar4, s sVar, o oVar, j3.a aVar5, b bVar, a aVar6, y yVar, boolean z10) {
        this.f19628c = hVar;
        c cVar = new c(interfaceC0327a);
        this.f19631f = cVar;
        j3.a aVar7 = aVar5 == null ? new j3.a(z10) : aVar5;
        this.f19633h = aVar7;
        aVar7.f(this);
        this.f19627b = oVar == null ? new o() : oVar;
        this.f19626a = sVar == null ? new s() : sVar;
        this.f19629d = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this, this) : bVar;
        this.f19632g = aVar6 == null ? new a(cVar) : aVar6;
        this.f19630e = yVar == null ? new y() : yVar;
        hVar.d(this);
    }

    public k(l3.h hVar, a.InterfaceC0327a interfaceC0327a, m3.a aVar, m3.a aVar2, m3.a aVar3, m3.a aVar4, boolean z10) {
        this(hVar, interfaceC0327a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z10);
    }

    private p<?> f(h3.f fVar) {
        v<?> e10 = this.f19628c.e(fVar);
        if (e10 == null) {
            return null;
        }
        return e10 instanceof p ? (p) e10 : new p<>(e10, true, true, fVar, this);
    }

    private p<?> h(h3.f fVar) {
        p<?> e10 = this.f19633h.e(fVar);
        if (e10 != null) {
            e10.a();
        }
        return e10;
    }

    private p<?> i(h3.f fVar) {
        p<?> f10 = f(fVar);
        if (f10 != null) {
            f10.a();
            this.f19633h.a(fVar, f10);
        }
        return f10;
    }

    private p<?> j(n nVar, boolean z10, long j10) {
        if (!z10) {
            return null;
        }
        p<?> h10 = h(nVar);
        if (h10 != null) {
            if (f19625i) {
                k("Loaded resource from active resources", j10, nVar);
            }
            return h10;
        }
        p<?> i10 = i(nVar);
        if (i10 == null) {
            return null;
        }
        if (f19625i) {
            k("Loaded resource from cache", j10, nVar);
        }
        return i10;
    }

    private static void k(String str, long j10, h3.f fVar) {
        Log.v("Engine", str + " in " + c4.g.a(j10) + "ms, key: " + fVar);
    }

    private <R> d m(com.bumptech.glide.d dVar, Object obj, h3.f fVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, j jVar, Map<Class<?>, h3.l<?>> map, boolean z10, boolean z11, h3.h hVar, boolean z12, boolean z13, boolean z14, boolean z15, y3.j jVar2, Executor executor, n nVar, long j10) {
        l<?> a10 = this.f19626a.a(nVar, z15);
        if (a10 != null) {
            a10.a(jVar2, executor);
            if (f19625i) {
                k("Added to existing load", j10, nVar);
            }
            return new d(jVar2, a10);
        }
        l<R> a11 = this.f19629d.a(nVar, z12, z13, z14, z15);
        h<R> a12 = this.f19632g.a(dVar, obj, nVar, fVar, i10, i11, cls, cls2, gVar, jVar, map, z10, z11, z15, hVar, a11);
        this.f19626a.c(nVar, a11);
        a11.a(jVar2, executor);
        a11.s(a12);
        if (f19625i) {
            k("Started new load", j10, nVar);
        }
        return new d(jVar2, a11);
    }

    @Override // l3.h.a
    public void a(v<?> vVar) {
        this.f19630e.a(vVar, true);
    }

    @Override // j3.m
    public synchronized void b(l<?> lVar, h3.f fVar) {
        this.f19626a.d(fVar, lVar);
    }

    @Override // j3.m
    public synchronized void c(l<?> lVar, h3.f fVar, p<?> pVar) {
        if (pVar != null) {
            if (pVar.c()) {
                this.f19633h.a(fVar, pVar);
            }
        }
        this.f19626a.d(fVar, lVar);
    }

    @Override // j3.p.a
    public void d(h3.f fVar, p<?> pVar) {
        this.f19633h.d(fVar);
        if (pVar.c()) {
            this.f19628c.c(fVar, pVar);
        } else {
            this.f19630e.a(pVar, false);
        }
    }

    public void e() {
        this.f19631f.a().clear();
    }

    public <R> d g(com.bumptech.glide.d dVar, Object obj, h3.f fVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, j jVar, Map<Class<?>, h3.l<?>> map, boolean z10, boolean z11, h3.h hVar, boolean z12, boolean z13, boolean z14, boolean z15, y3.j jVar2, Executor executor) {
        long b10 = f19625i ? c4.g.b() : 0L;
        n a10 = this.f19627b.a(obj, fVar, i10, i11, map, cls, cls2, hVar);
        synchronized (this) {
            p<?> j10 = j(a10, z12, b10);
            if (j10 == null) {
                return m(dVar, obj, fVar, i10, i11, cls, cls2, gVar, jVar, map, z10, z11, hVar, z12, z13, z14, z15, jVar2, executor, a10, b10);
            }
            jVar2.b(j10, h3.a.MEMORY_CACHE, false);
            return null;
        }
    }

    public void l(v<?> vVar) {
        if (!(vVar instanceof p)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((p) vVar).d();
    }
}

package y3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.c;
import j3.k;
import j3.q;
import j3.v;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k<R> implements e, z3.c, j {
    private static final boolean E = Log.isLoggable("GlideRequest", 2);
    private int A;
    private int B;
    private boolean C;
    private RuntimeException D;

    /* renamed from: a, reason: collision with root package name */
    private int f31612a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31613b;

    /* renamed from: c, reason: collision with root package name */
    private final d4.c f31614c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f31615d;

    /* renamed from: e, reason: collision with root package name */
    private final h<R> f31616e;

    /* renamed from: f, reason: collision with root package name */
    private final f f31617f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f31618g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.d f31619h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f31620i;

    /* renamed from: j, reason: collision with root package name */
    private final Class<R> f31621j;

    /* renamed from: k, reason: collision with root package name */
    private final y3.a<?> f31622k;

    /* renamed from: l, reason: collision with root package name */
    private final int f31623l;

    /* renamed from: m, reason: collision with root package name */
    private final int f31624m;

    /* renamed from: n, reason: collision with root package name */
    private final com.bumptech.glide.g f31625n;

    /* renamed from: o, reason: collision with root package name */
    private final z3.d<R> f31626o;

    /* renamed from: p, reason: collision with root package name */
    private final List<h<R>> f31627p;

    /* renamed from: q, reason: collision with root package name */
    private final a4.c<? super R> f31628q;

    /* renamed from: r, reason: collision with root package name */
    private final Executor f31629r;

    /* renamed from: s, reason: collision with root package name */
    private v<R> f31630s;

    /* renamed from: t, reason: collision with root package name */
    private k.d f31631t;

    /* renamed from: u, reason: collision with root package name */
    private long f31632u;

    /* renamed from: v, reason: collision with root package name */
    private volatile j3.k f31633v;

    /* renamed from: w, reason: collision with root package name */
    private a f31634w;

    /* renamed from: x, reason: collision with root package name */
    private Drawable f31635x;

    /* renamed from: y, reason: collision with root package name */
    private Drawable f31636y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f31637z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private k(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class<R> cls, y3.a<?> aVar, int i10, int i11, com.bumptech.glide.g gVar, z3.d<R> dVar2, h<R> hVar, List<h<R>> list, f fVar, j3.k kVar, a4.c<? super R> cVar, Executor executor) {
        this.f31613b = E ? String.valueOf(super.hashCode()) : null;
        this.f31614c = d4.c.a();
        this.f31615d = obj;
        this.f31618g = context;
        this.f31619h = dVar;
        this.f31620i = obj2;
        this.f31621j = cls;
        this.f31622k = aVar;
        this.f31623l = i10;
        this.f31624m = i11;
        this.f31625n = gVar;
        this.f31626o = dVar2;
        this.f31616e = hVar;
        this.f31627p = list;
        this.f31617f = fVar;
        this.f31633v = kVar;
        this.f31628q = cVar;
        this.f31629r = executor;
        this.f31634w = a.PENDING;
        if (this.D == null && dVar.f().a(c.C0128c.class)) {
            this.D = new RuntimeException("Glide request origin trace");
        }
    }

    private void A(v<R> vVar, R r10, h3.a aVar, boolean z10) {
        boolean z11;
        boolean s10 = s();
        this.f31634w = a.COMPLETE;
        this.f31630s = vVar;
        if (this.f31619h.g() <= 3) {
            Log.d("Glide", "Finished loading " + r10.getClass().getSimpleName() + " from " + aVar + " for " + this.f31620i + " with size [" + this.A + "x" + this.B + "] in " + c4.g.a(this.f31632u) + " ms");
        }
        x();
        boolean z12 = true;
        this.C = true;
        try {
            List<h<R>> list = this.f31627p;
            if (list != null) {
                Iterator<h<R>> it = list.iterator();
                z11 = false;
                while (it.hasNext()) {
                    z11 |= it.next().c(r10, this.f31620i, this.f31626o, aVar, s10);
                }
            } else {
                z11 = false;
            }
            h<R> hVar = this.f31616e;
            if (hVar == null || !hVar.c(r10, this.f31620i, this.f31626o, aVar, s10)) {
                z12 = false;
            }
            if (!(z12 | z11)) {
                this.f31626o.b(r10, this.f31628q.a(aVar, s10));
            }
            this.C = false;
            d4.b.f("GlideRequest", this.f31612a);
        } catch (Throwable th2) {
            this.C = false;
            throw th2;
        }
    }

    private void B() {
        if (l()) {
            Drawable q10 = this.f31620i == null ? q() : null;
            if (q10 == null) {
                q10 = p();
            }
            if (q10 == null) {
                q10 = r();
            }
            this.f31626o.j(q10);
        }
    }

    private void i() {
        if (this.C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean k() {
        f fVar = this.f31617f;
        return fVar == null || fVar.b(this);
    }

    private boolean l() {
        f fVar = this.f31617f;
        return fVar == null || fVar.i(this);
    }

    private boolean m() {
        f fVar = this.f31617f;
        return fVar == null || fVar.f(this);
    }

    private void n() {
        i();
        this.f31614c.c();
        this.f31626o.a(this);
        k.d dVar = this.f31631t;
        if (dVar != null) {
            dVar.a();
            this.f31631t = null;
        }
    }

    private void o(Object obj) {
        List<h<R>> list = this.f31627p;
        if (list == null) {
            return;
        }
        for (h<R> hVar : list) {
            if (hVar instanceof c) {
                ((c) hVar).a(obj);
            }
        }
    }

    private Drawable p() {
        if (this.f31635x == null) {
            Drawable k10 = this.f31622k.k();
            this.f31635x = k10;
            if (k10 == null && this.f31622k.j() > 0) {
                this.f31635x = t(this.f31622k.j());
            }
        }
        return this.f31635x;
    }

    private Drawable q() {
        if (this.f31637z == null) {
            Drawable l10 = this.f31622k.l();
            this.f31637z = l10;
            if (l10 == null && this.f31622k.m() > 0) {
                this.f31637z = t(this.f31622k.m());
            }
        }
        return this.f31637z;
    }

    private Drawable r() {
        if (this.f31636y == null) {
            Drawable t10 = this.f31622k.t();
            this.f31636y = t10;
            if (t10 == null && this.f31622k.u() > 0) {
                this.f31636y = t(this.f31622k.u());
            }
        }
        return this.f31636y;
    }

    private boolean s() {
        f fVar = this.f31617f;
        return fVar == null || !fVar.getRoot().a();
    }

    private Drawable t(int i10) {
        return s3.g.a(this.f31618g, i10, this.f31622k.A() != null ? this.f31622k.A() : this.f31618g.getTheme());
    }

    private void u(String str) {
        Log.v("GlideRequest", str + " this: " + this.f31613b);
    }

    private static int v(int i10, float f10) {
        return i10 == Integer.MIN_VALUE ? i10 : Math.round(f10 * i10);
    }

    private void w() {
        f fVar = this.f31617f;
        if (fVar != null) {
            fVar.d(this);
        }
    }

    private void x() {
        f fVar = this.f31617f;
        if (fVar != null) {
            fVar.c(this);
        }
    }

    public static <R> k<R> y(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class<R> cls, y3.a<?> aVar, int i10, int i11, com.bumptech.glide.g gVar, z3.d<R> dVar2, h<R> hVar, List<h<R>> list, f fVar, j3.k kVar, a4.c<? super R> cVar, Executor executor) {
        return new k<>(context, dVar, obj, obj2, cls, aVar, i10, i11, gVar, dVar2, hVar, list, fVar, kVar, cVar, executor);
    }

    private void z(q qVar, int i10) {
        boolean z10;
        this.f31614c.c();
        synchronized (this.f31615d) {
            qVar.k(this.D);
            int g10 = this.f31619h.g();
            if (g10 <= i10) {
                Log.w("Glide", "Load failed for [" + this.f31620i + "] with dimensions [" + this.A + "x" + this.B + "]", qVar);
                if (g10 <= 4) {
                    qVar.g("Glide");
                }
            }
            this.f31631t = null;
            this.f31634w = a.FAILED;
            w();
            boolean z11 = true;
            this.C = true;
            try {
                List<h<R>> list = this.f31627p;
                if (list != null) {
                    Iterator<h<R>> it = list.iterator();
                    z10 = false;
                    while (it.hasNext()) {
                        z10 |= it.next().d(qVar, this.f31620i, this.f31626o, s());
                    }
                } else {
                    z10 = false;
                }
                h<R> hVar = this.f31616e;
                if (hVar == null || !hVar.d(qVar, this.f31620i, this.f31626o, s())) {
                    z11 = false;
                }
                if (!(z10 | z11)) {
                    B();
                }
                this.C = false;
                d4.b.f("GlideRequest", this.f31612a);
            } catch (Throwable th2) {
                this.C = false;
                throw th2;
            }
        }
    }

    @Override // y3.e
    public boolean a() {
        boolean z10;
        synchronized (this.f31615d) {
            z10 = this.f31634w == a.COMPLETE;
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y3.j
    public void b(v<?> vVar, h3.a aVar, boolean z10) {
        this.f31614c.c();
        v<?> vVar2 = null;
        try {
            synchronized (this.f31615d) {
                try {
                    this.f31631t = null;
                    if (vVar == null) {
                        c(new q("Expected to receive a Resource<R> with an object of " + this.f31621j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = vVar.get();
                    try {
                        if (obj != null && this.f31621j.isAssignableFrom(obj.getClass())) {
                            if (m()) {
                                A(vVar, obj, aVar, z10);
                                return;
                            }
                            this.f31630s = null;
                            this.f31634w = a.COMPLETE;
                            d4.b.f("GlideRequest", this.f31612a);
                            this.f31633v.l(vVar);
                            return;
                        }
                        this.f31630s = null;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected to receive an object of ");
                        sb2.append(this.f31621j);
                        sb2.append(" but instead got ");
                        sb2.append(obj != null ? obj.getClass() : "");
                        sb2.append("{");
                        sb2.append(obj);
                        sb2.append("} inside Resource{");
                        sb2.append(vVar);
                        sb2.append("}.");
                        sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        c(new q(sb2.toString()));
                        this.f31633v.l(vVar);
                    } catch (Throwable th2) {
                        vVar2 = vVar;
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (vVar2 != null) {
                this.f31633v.l(vVar2);
            }
            throw th4;
        }
    }

    @Override // y3.j
    public void c(q qVar) {
        z(qVar, 5);
    }

    @Override // y3.e
    public void clear() {
        synchronized (this.f31615d) {
            i();
            this.f31614c.c();
            a aVar = this.f31634w;
            a aVar2 = a.CLEARED;
            if (aVar == aVar2) {
                return;
            }
            n();
            v<R> vVar = this.f31630s;
            if (vVar != null) {
                this.f31630s = null;
            } else {
                vVar = null;
            }
            if (k()) {
                this.f31626o.g(r());
            }
            d4.b.f("GlideRequest", this.f31612a);
            this.f31634w = aVar2;
            if (vVar != null) {
                this.f31633v.l(vVar);
            }
        }
    }

    @Override // z3.c
    public void d(int i10, int i11) {
        Object obj;
        this.f31614c.c();
        Object obj2 = this.f31615d;
        synchronized (obj2) {
            try {
                try {
                    boolean z10 = E;
                    if (z10) {
                        u("Got onSizeReady in " + c4.g.a(this.f31632u));
                    }
                    if (this.f31634w == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        this.f31634w = aVar;
                        float z11 = this.f31622k.z();
                        this.A = v(i10, z11);
                        this.B = v(i11, z11);
                        if (z10) {
                            u("finished setup for calling load in " + c4.g.a(this.f31632u));
                        }
                        obj = obj2;
                        try {
                            this.f31631t = this.f31633v.g(this.f31619h, this.f31620i, this.f31622k.x(), this.A, this.B, this.f31622k.w(), this.f31621j, this.f31625n, this.f31622k.i(), this.f31622k.B(), this.f31622k.K(), this.f31622k.H(), this.f31622k.q(), this.f31622k.F(), this.f31622k.D(), this.f31622k.C(), this.f31622k.p(), this, this.f31629r);
                            if (this.f31634w != aVar) {
                                this.f31631t = null;
                            }
                            if (z10) {
                                u("finished onSizeReady in " + c4.g.a(this.f31632u));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = obj2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // y3.e
    public boolean e() {
        boolean z10;
        synchronized (this.f31615d) {
            z10 = this.f31634w == a.CLEARED;
        }
        return z10;
    }

    @Override // y3.j
    public Object f() {
        this.f31614c.c();
        return this.f31615d;
    }

    @Override // y3.e
    public boolean g() {
        boolean z10;
        synchronized (this.f31615d) {
            z10 = this.f31634w == a.COMPLETE;
        }
        return z10;
    }

    @Override // y3.e
    public boolean h(e eVar) {
        int i10;
        int i11;
        Object obj;
        Class<R> cls;
        y3.a<?> aVar;
        com.bumptech.glide.g gVar;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class<R> cls2;
        y3.a<?> aVar2;
        com.bumptech.glide.g gVar2;
        int size2;
        if (!(eVar instanceof k)) {
            return false;
        }
        synchronized (this.f31615d) {
            i10 = this.f31623l;
            i11 = this.f31624m;
            obj = this.f31620i;
            cls = this.f31621j;
            aVar = this.f31622k;
            gVar = this.f31625n;
            List<h<R>> list = this.f31627p;
            size = list != null ? list.size() : 0;
        }
        k kVar = (k) eVar;
        synchronized (kVar.f31615d) {
            i12 = kVar.f31623l;
            i13 = kVar.f31624m;
            obj2 = kVar.f31620i;
            cls2 = kVar.f31621j;
            aVar2 = kVar.f31622k;
            gVar2 = kVar.f31625n;
            List<h<R>> list2 = kVar.f31627p;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i10 == i12 && i11 == i13 && c4.l.c(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && gVar == gVar2 && size == size2;
    }

    @Override // y3.e
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f31615d) {
            a aVar = this.f31634w;
            z10 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
        }
        return z10;
    }

    @Override // y3.e
    public void j() {
        synchronized (this.f31615d) {
            i();
            this.f31614c.c();
            this.f31632u = c4.g.b();
            Object obj = this.f31620i;
            if (obj == null) {
                if (c4.l.t(this.f31623l, this.f31624m)) {
                    this.A = this.f31623l;
                    this.B = this.f31624m;
                }
                z(new q("Received null model"), q() == null ? 5 : 3);
                return;
            }
            a aVar = this.f31634w;
            a aVar2 = a.RUNNING;
            if (aVar == aVar2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (aVar == a.COMPLETE) {
                b(this.f31630s, h3.a.MEMORY_CACHE, false);
                return;
            }
            o(obj);
            this.f31612a = d4.b.b("GlideRequest");
            a aVar3 = a.WAITING_FOR_SIZE;
            this.f31634w = aVar3;
            if (c4.l.t(this.f31623l, this.f31624m)) {
                d(this.f31623l, this.f31624m);
            } else {
                this.f31626o.i(this);
            }
            a aVar4 = this.f31634w;
            if ((aVar4 == aVar2 || aVar4 == aVar3) && l()) {
                this.f31626o.e(r());
            }
            if (E) {
                u("finished run method in " + c4.g.a(this.f31632u));
            }
        }
    }

    @Override // y3.e
    public void pause() {
        synchronized (this.f31615d) {
            if (isRunning()) {
                clear();
            }
        }
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f31615d) {
            obj = this.f31620i;
            cls = this.f31621j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}

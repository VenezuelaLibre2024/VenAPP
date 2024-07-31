package androidx.camera.core;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.b2;
import androidx.camera.core.impl.c0;
import androidx.camera.core.impl.d1;
import androidx.camera.core.impl.e1;
import androidx.camera.core.impl.f1;
import androidx.camera.core.impl.g1;
import androidx.camera.core.impl.k2;
import androidx.camera.core.impl.l0;
import androidx.camera.core.impl.l1;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.m1;
import androidx.camera.core.impl.n0;
import androidx.camera.core.impl.p1;
import androidx.camera.core.impl.y1;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h0.c;
import java.io.File;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import w.g0;
import w.o0;
import w.y;
import y.r0;

/* loaded from: classes.dex */
public final class n extends w {

    /* renamed from: x */
    public static final c f2705x = new c();

    /* renamed from: y */
    static final e0.b f2706y = new e0.b();

    /* renamed from: n */
    private final g1.a f2707n;

    /* renamed from: o */
    private final int f2708o;

    /* renamed from: p */
    private final AtomicReference<Integer> f2709p;

    /* renamed from: q */
    private final int f2710q;

    /* renamed from: r */
    private int f2711r;

    /* renamed from: s */
    private Rational f2712s;

    /* renamed from: t */
    y1.b f2713t;

    /* renamed from: u */
    private y.r f2714u;

    /* renamed from: v */
    private r0 f2715v;

    /* renamed from: w */
    private final y.q f2716w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements y.q {
        a() {
        }

        @Override // y.q
        public com.google.common.util.concurrent.f<Void> a(List<l0> list) {
            return n.this.m0(list);
        }

        @Override // y.q
        public void b() {
            n.this.k0();
        }

        @Override // y.q
        public void c() {
            n.this.o0();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements k2.a<n, d1, b> {

        /* renamed from: a */
        private final m1 f2718a;

        public b() {
            this(m1.a0());
        }

        private b(m1 m1Var) {
            this.f2718a = m1Var;
            Class cls = (Class) m1Var.g(b0.j.D, null);
            if (cls == null || cls.equals(n.class)) {
                k(n.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        public static b d(n0 n0Var) {
            return new b(m1.b0(n0Var));
        }

        @Override // w.z
        public l1 a() {
            return this.f2718a;
        }

        public n c() {
            Integer num;
            Integer num2 = (Integer) a().g(d1.K, null);
            if (num2 != null) {
                a().r(e1.f2456f, num2);
            } else {
                a().r(e1.f2456f, Integer.valueOf(RecognitionOptions.QR_CODE));
            }
            d1 b10 = b();
            f1.w(b10);
            n nVar = new n(b10);
            Size size = (Size) a().g(f1.f2466l, null);
            if (size != null) {
                nVar.l0(new Rational(size.getWidth(), size.getHeight()));
            }
            androidx.core.util.h.l((Executor) a().g(b0.g.B, z.a.c()), "The IO executor can't be null");
            l1 a10 = a();
            n0.a<Integer> aVar = d1.I;
            if (!a10.b(aVar) || ((num = (Integer) a().a(aVar)) != null && (num.intValue() == 0 || num.intValue() == 1 || num.intValue() == 2))) {
                return nVar;
            }
            throw new IllegalArgumentException("The flash mode is not allowed to set: " + num);
        }

        @Override // androidx.camera.core.impl.k2.a
        /* renamed from: e */
        public d1 b() {
            return new d1(p1.Y(this.f2718a));
        }

        public b f(l2.b bVar) {
            a().r(k2.A, bVar);
            return this;
        }

        public b g(y yVar) {
            if (!Objects.equals(y.f29577d, yVar)) {
                throw new UnsupportedOperationException("ImageCapture currently only supports SDR");
            }
            a().r(e1.f2457g, yVar);
            return this;
        }

        public b h(h0.c cVar) {
            a().r(f1.f2470p, cVar);
            return this;
        }

        public b i(int i10) {
            a().r(k2.f2530v, Integer.valueOf(i10));
            return this;
        }

        @Deprecated
        public b j(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            a().r(f1.f2462h, Integer.valueOf(i10));
            return this;
        }

        public b k(Class<n> cls) {
            a().r(b0.j.D, cls);
            if (a().g(b0.j.C, null) == null) {
                l(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public b l(String str) {
            a().r(b0.j.C, str);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private static final h0.c f2719a;

        /* renamed from: b */
        private static final d1 f2720b;

        /* renamed from: c */
        private static final y f2721c;

        static {
            h0.c a10 = new c.a().d(h0.a.f16346c).e(h0.d.f16356c).a();
            f2719a = a10;
            y yVar = y.f29577d;
            f2721c = yVar;
            f2720b = new b().i(4).j(0).h(a10).f(l2.b.IMAGE_CAPTURE).g(yVar).b();
        }

        public d1 a() {
            return f2720b;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public abstract void a(o oVar);

        public abstract void b(g0 g0Var);
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(g0 g0Var);

        void b(h hVar);
    }

    /* loaded from: classes.dex */
    public static final class g {
        public ContentResolver a() {
            throw null;
        }

        public ContentValues b() {
            throw null;
        }

        public File c() {
            throw null;
        }

        public d d() {
            throw null;
        }

        public OutputStream e() {
            throw null;
        }

        public Uri f() {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a */
        private final Uri f2722a;

        public h(Uri uri) {
            this.f2722a = uri;
        }
    }

    n(d1 d1Var) {
        super(d1Var);
        this.f2707n = new g1.a() { // from class: w.d0
            @Override // androidx.camera.core.impl.g1.a
            public final void a(androidx.camera.core.impl.g1 g1Var) {
                androidx.camera.core.n.i0(g1Var);
            }
        };
        this.f2709p = new AtomicReference<>(null);
        this.f2711r = -1;
        this.f2712s = null;
        this.f2716w = new a();
        d1 d1Var2 = (d1) i();
        this.f2708o = d1Var2.b(d1.H) ? d1Var2.X() : 1;
        this.f2710q = d1Var2.Z(0);
    }

    private void Y() {
        r0 r0Var = this.f2715v;
        if (r0Var != null) {
            r0Var.e();
        }
    }

    private void Z() {
        a0(false);
    }

    private void a0(boolean z10) {
        r0 r0Var;
        Log.d("ImageCapture", "clearPipeline");
        androidx.camera.core.impl.utils.q.a();
        y.r rVar = this.f2714u;
        if (rVar != null) {
            rVar.a();
            this.f2714u = null;
        }
        if (z10 || (r0Var = this.f2715v) == null) {
            return;
        }
        r0Var.e();
        this.f2715v = null;
    }

    private y1.b b0(String str, d1 d1Var, b2 b2Var) {
        androidx.camera.core.impl.utils.q.a();
        Log.d("ImageCapture", String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, b2Var));
        Size e10 = b2Var.e();
        c0 f10 = f();
        Objects.requireNonNull(f10);
        boolean z10 = !f10.m() || g0();
        if (this.f2714u != null) {
            androidx.core.util.h.m(z10);
            this.f2714u.a();
        }
        this.f2714u = new y.r(d1Var, e10, k(), z10);
        if (this.f2715v == null) {
            this.f2715v = new r0(this.f2716w);
        }
        this.f2715v.l(this.f2714u);
        y1.b f11 = this.f2714u.f(b2Var.e());
        if (d0() == 2) {
            g().a(f11);
        }
        if (b2Var.d() != null) {
            f11.g(b2Var.d());
        }
        f11.f(new y1.c() { // from class: w.e0

            /* renamed from: b */
            public final /* synthetic */ String f29460b;

            /* renamed from: c */
            public final /* synthetic */ androidx.camera.core.impl.d1 f29461c;

            /* renamed from: d */
            public final /* synthetic */ b2 f29462d;

            public /* synthetic */ e0(String str2, androidx.camera.core.impl.d1 d1Var2, b2 b2Var2) {
                r2 = str2;
                r3 = d1Var2;
                r4 = b2Var2;
            }

            @Override // androidx.camera.core.impl.y1.c
            public final void a(y1 y1Var, y1.f fVar) {
                androidx.camera.core.n.this.h0(r2, r3, r4, y1Var, fVar);
            }
        });
        return f11;
    }

    private static boolean f0(List<Pair<Integer, Size[]>> list, int i10) {
        if (list == null) {
            return false;
        }
        Iterator<Pair<Integer, Size[]>> it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) it.next().first).equals(Integer.valueOf(i10))) {
                return true;
            }
        }
        return false;
    }

    private boolean g0() {
        return (f() == null || f().e().V(null) == null) ? false : true;
    }

    public /* synthetic */ void h0(String str, d1 d1Var, b2 b2Var, y1 y1Var, y1.f fVar) {
        if (!x(str)) {
            Z();
            return;
        }
        this.f2715v.j();
        a0(true);
        y1.b b02 = b0(str, d1Var, b2Var);
        this.f2713t = b02;
        S(b02.o());
        D();
        this.f2715v.k();
    }

    public static /* synthetic */ void i0(g1 g1Var) {
        try {
            o b10 = g1Var.b();
            try {
                Log.d("ImageCapture", "Discarding ImageProxy which was inadvertently acquired: " + b10);
                if (b10 != null) {
                    b10.close();
                }
            } finally {
            }
        } catch (IllegalStateException e10) {
            Log.e("ImageCapture", "Failed to acquire latest image.", e10);
        }
    }

    public static /* synthetic */ Void j0(List list) {
        return null;
    }

    private void n0() {
        synchronized (this.f2709p) {
            if (this.f2709p.get() != null) {
                return;
            }
            g().f(e0());
        }
    }

    @Override // androidx.camera.core.w
    public void F() {
        androidx.core.util.h.l(f(), "Attached camera cannot be null");
    }

    @Override // androidx.camera.core.w
    public void G() {
        n0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        if (f0(r5, 35) != false) goto L59;
     */
    /* JADX WARN: Type inference failed for: r5v12, types: [androidx.camera.core.impl.k2, androidx.camera.core.impl.k2<?>] */
    @Override // androidx.camera.core.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected androidx.camera.core.impl.k2<?> H(androidx.camera.core.impl.b0 r5, androidx.camera.core.impl.k2.a<?, ?, ?> r6) {
        /*
            r4 = this;
            androidx.camera.core.impl.t1 r5 = r5.e()
            java.lang.Class<d0.h> r0 = d0.h.class
            boolean r5 = r5.a(r0)
            if (r5 == 0) goto L34
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            androidx.camera.core.impl.l1 r0 = r6.a()
            androidx.camera.core.impl.n0$a<java.lang.Boolean> r1 = androidx.camera.core.impl.d1.N
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r0.g(r1, r2)
            boolean r5 = r5.equals(r0)
            java.lang.String r0 = "ImageCapture"
            if (r5 == 0) goto L28
            java.lang.String r5 = "Device quirk suggests software JPEG encoder, but it has been explicitly disabled."
            w.o0.k(r0, r5)
            goto L34
        L28:
            java.lang.String r5 = "Requesting software JPEG due to device quirk."
            w.o0.e(r0, r5)
            androidx.camera.core.impl.l1 r5 = r6.a()
            r5.r(r1, r2)
        L34:
            androidx.camera.core.impl.l1 r5 = r6.a()
            boolean r5 = r4.c0(r5)
            androidx.camera.core.impl.l1 r0 = r6.a()
            androidx.camera.core.impl.n0$a<java.lang.Integer> r1 = androidx.camera.core.impl.d1.K
            r2 = 0
            java.lang.Object r0 = r0.g(r1, r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1 = 256(0x100, float:3.59E-43)
            r3 = 35
            if (r0 == 0) goto L79
            boolean r2 = r4.g0()
            if (r2 == 0) goto L5e
            int r2 = r0.intValue()
            if (r2 != r1) goto L5c
            goto L5e
        L5c:
            r1 = 0
            goto L5f
        L5e:
            r1 = 1
        L5f:
            java.lang.String r2 = "Cannot set non-JPEG buffer format with Extensions enabled."
            androidx.core.util.h.b(r1, r2)
            androidx.camera.core.impl.l1 r1 = r6.a()
            androidx.camera.core.impl.n0$a<java.lang.Integer> r2 = androidx.camera.core.impl.e1.f2456f
            if (r5 == 0) goto L6d
            goto L71
        L6d:
            int r3 = r0.intValue()
        L71:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r1.r(r2, r5)
            goto Lb0
        L79:
            if (r5 == 0) goto L89
        L7b:
            androidx.camera.core.impl.l1 r5 = r6.a()
            androidx.camera.core.impl.n0$a<java.lang.Integer> r0 = androidx.camera.core.impl.e1.f2456f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
        L85:
            r5.r(r0, r1)
            goto Lb0
        L89:
            androidx.camera.core.impl.l1 r5 = r6.a()
            androidx.camera.core.impl.n0$a<java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>> r0 = androidx.camera.core.impl.f1.f2469o
            java.lang.Object r5 = r5.g(r0, r2)
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto La2
        L97:
            androidx.camera.core.impl.l1 r5 = r6.a()
            androidx.camera.core.impl.n0$a<java.lang.Integer> r0 = androidx.camera.core.impl.e1.f2456f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L85
        La2:
            boolean r0 = f0(r5, r1)
            if (r0 == 0) goto La9
            goto L97
        La9:
            boolean r5 = f0(r5, r3)
            if (r5 == 0) goto Lb0
            goto L7b
        Lb0:
            androidx.camera.core.impl.k2 r5 = r6.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.n.H(androidx.camera.core.impl.b0, androidx.camera.core.impl.k2$a):androidx.camera.core.impl.k2");
    }

    @Override // androidx.camera.core.w
    public void J() {
        Y();
    }

    @Override // androidx.camera.core.w
    protected b2 K(n0 n0Var) {
        this.f2713t.g(n0Var);
        S(this.f2713t.o());
        return d().f().d(n0Var).a();
    }

    @Override // androidx.camera.core.w
    protected b2 L(b2 b2Var) {
        y1.b b02 = b0(h(), (d1) i(), b2Var);
        this.f2713t = b02;
        S(b02.o());
        B();
        return b2Var;
    }

    @Override // androidx.camera.core.w
    public void M() {
        Y();
        Z();
    }

    boolean c0(l1 l1Var) {
        boolean z10;
        Boolean bool = Boolean.TRUE;
        n0.a<Boolean> aVar = d1.N;
        Boolean bool2 = Boolean.FALSE;
        boolean z11 = false;
        if (bool.equals(l1Var.g(aVar, bool2))) {
            if (g0()) {
                o0.k("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z10 = false;
            } else {
                z10 = true;
            }
            Integer num = (Integer) l1Var.g(d1.K, null);
            if (num == null || num.intValue() == 256) {
                z11 = z10;
            } else {
                o0.k("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z11) {
                o0.k("ImageCapture", "Unable to support software JPEG. Disabling.");
                l1Var.r(aVar, bool2);
            }
        }
        return z11;
    }

    public int d0() {
        return this.f2708o;
    }

    public int e0() {
        int i10;
        synchronized (this.f2709p) {
            i10 = this.f2711r;
            if (i10 == -1) {
                i10 = ((d1) i()).Y(2);
            }
        }
        return i10;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.camera.core.impl.k2, androidx.camera.core.impl.k2<?>] */
    @Override // androidx.camera.core.w
    public k2<?> j(boolean z10, l2 l2Var) {
        c cVar = f2705x;
        n0 a10 = l2Var.a(cVar.a().N(), d0());
        if (z10) {
            a10 = n0.O(a10, cVar.a());
        }
        if (a10 == null) {
            return null;
        }
        return v(a10).b();
    }

    void k0() {
        synchronized (this.f2709p) {
            if (this.f2709p.get() != null) {
                return;
            }
            this.f2709p.set(Integer.valueOf(e0()));
        }
    }

    public void l0(Rational rational) {
        this.f2712s = rational;
    }

    com.google.common.util.concurrent.f<Void> m0(List<l0> list) {
        androidx.camera.core.impl.utils.q.a();
        return a0.f.o(g().c(list, this.f2708o, this.f2710q), new m.a() { // from class: w.f0
            @Override // m.a
            public final Object apply(Object obj) {
                Void j02;
                j02 = androidx.camera.core.n.j0((List) obj);
                return j02;
            }
        }, z.a.a());
    }

    void o0() {
        synchronized (this.f2709p) {
            Integer andSet = this.f2709p.getAndSet(null);
            if (andSet == null) {
                return;
            }
            if (andSet.intValue() != e0()) {
                n0();
            }
        }
    }

    @Override // androidx.camera.core.w
    public Set<Integer> t() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    public String toString() {
        return "ImageCapture:" + n();
    }

    @Override // androidx.camera.core.w
    public k2.a<?, ?, ?> v(n0 n0Var) {
        return b.d(n0Var);
    }
}

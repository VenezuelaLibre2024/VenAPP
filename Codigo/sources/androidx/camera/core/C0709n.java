package androidx.camera.core;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.C0709n;
import androidx.camera.core.impl.AbstractC0604b2;
import androidx.camera.core.impl.C0611d1;
import androidx.camera.core.impl.C0642l0;
import androidx.camera.core.impl.C0647m1;
import androidx.camera.core.impl.C0656p1;
import androidx.camera.core.impl.C0701y1;
import androidx.camera.core.impl.InterfaceC0606c0;
import androidx.camera.core.impl.InterfaceC0615e1;
import androidx.camera.core.impl.InterfaceC0619f1;
import androidx.camera.core.impl.InterfaceC0623g1;
import androidx.camera.core.impl.InterfaceC0640k2;
import androidx.camera.core.impl.InterfaceC0643l1;
import androidx.camera.core.impl.InterfaceC0644l2;
import androidx.camera.core.impl.InterfaceC0649n0;
import androidx.camera.core.impl.utils.C0688q;
import androidx.core.util.C0984h;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
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
import p002a0.C0009f;
import p018b0.InterfaceC1599g;
import p018b0.InterfaceC1602j;
import p071e0.C7087b;
import p126h0.C7606a;
import p126h0.C7608c;
import p126h0.C7609d;
import p227m.InterfaceC9531a;
import p407w.C12008g0;
import p407w.C12029o0;
import p407w.C12048y;
import p452y.C12564r;
import p452y.C12565r0;
import p452y.InterfaceC12562q;
import p474z.C12747a;

/* renamed from: androidx.camera.core.n */
/* loaded from: classes.dex */
public final class C0709n extends AbstractC0718w {

    /* renamed from: x */
    public static final c f3050x = new c();

    /* renamed from: y */
    static final C7087b f3051y = new C7087b();

    /* renamed from: n */
    private final InterfaceC0623g1.a f3052n;

    /* renamed from: o */
    private final int f3053o;

    /* renamed from: p */
    private final AtomicReference<Integer> f3054p;

    /* renamed from: q */
    private final int f3055q;

    /* renamed from: r */
    private int f3056r;

    /* renamed from: s */
    private Rational f3057s;

    /* renamed from: t */
    C0701y1.b f3058t;

    /* renamed from: u */
    private C12564r f3059u;

    /* renamed from: v */
    private C12565r0 f3060v;

    /* renamed from: w */
    private final InterfaceC12562q f3061w;

    /* renamed from: androidx.camera.core.n$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC12562q {
        a() {
        }

        @Override // p452y.InterfaceC12562q
        /* renamed from: a */
        public InterfaceFutureC5920f<Void> mo3461a(List<C0642l0> list) {
            return C0709n.this.m3458m0(list);
        }

        @Override // p452y.InterfaceC12562q
        /* renamed from: b */
        public void mo3462b() {
            C0709n.this.m3456k0();
        }

        @Override // p452y.InterfaceC12562q
        /* renamed from: c */
        public void mo3463c() {
            C0709n.this.m3459o0();
        }
    }

    /* renamed from: androidx.camera.core.n$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC0640k2.a<C0709n, C0611d1, b> {

        /* renamed from: a */
        private final C0647m1 f3063a;

        public b() {
            this(C0647m1.m3184a0());
        }

        private b(C0647m1 c0647m1) {
            this.f3063a = c0647m1;
            Class cls = (Class) c0647m1.mo3197g(InterfaceC1602j.f6864D, null);
            if (cls == null || cls.equals(C0709n.class)) {
                m3472k(C0709n.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        /* renamed from: d */
        public static b m3464d(InterfaceC0649n0 interfaceC0649n0) {
            return new b(C0647m1.m3185b0(interfaceC0649n0));
        }

        @Override // p407w.InterfaceC12050z
        /* renamed from: a */
        public InterfaceC0643l1 mo2932a() {
            return this.f3063a;
        }

        /* renamed from: c */
        public C0709n m3465c() {
            Integer num;
            Integer num2 = (Integer) mo2932a().mo3197g(C0611d1.f2783K, null);
            if (num2 != null) {
                mo2932a().mo3178r(InterfaceC0615e1.f2794f, num2);
            } else {
                mo2932a().mo3178r(InterfaceC0615e1.f2794f, Integer.valueOf(RecognitionOptions.QR_CODE));
            }
            C0611d1 mo2933b = mo2933b();
            InterfaceC0619f1.m3055w(mo2933b);
            C0709n c0709n = new C0709n(mo2933b);
            Size size = (Size) mo2932a().mo3197g(InterfaceC0619f1.f2804l, null);
            if (size != null) {
                c0709n.m3457l0(new Rational(size.getWidth(), size.getHeight()));
            }
            C0984h.m4834l((Executor) mo2932a().mo3197g(InterfaceC1599g.f6852B, C12747a.m42282c()), "The IO executor can't be null");
            InterfaceC0643l1 mo2932a = mo2932a();
            InterfaceC0649n0.a<Integer> aVar = C0611d1.f2781I;
            if (!mo2932a.mo3192b(aVar) || ((num = (Integer) mo2932a().mo3191a(aVar)) != null && (num.intValue() == 0 || num.intValue() == 1 || num.intValue() == 2))) {
                return c0709n;
            }
            throw new IllegalArgumentException("The flash mode is not allowed to set: " + num);
        }

        @Override // androidx.camera.core.impl.InterfaceC0640k2.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C0611d1 mo2933b() {
            return new C0611d1(C0656p1.m3211Y(this.f3063a));
        }

        /* renamed from: f */
        public b m3467f(InterfaceC0644l2.b bVar) {
            mo2932a().mo3178r(InterfaceC0640k2.f2864A, bVar);
            return this;
        }

        /* renamed from: g */
        public b m3468g(C12048y c12048y) {
            if (!Objects.equals(C12048y.f32040d, c12048y)) {
                throw new UnsupportedOperationException("ImageCapture currently only supports SDR");
            }
            mo2932a().mo3178r(InterfaceC0615e1.f2795g, c12048y);
            return this;
        }

        /* renamed from: h */
        public b m3469h(C7608c c7608c) {
            mo2932a().mo3178r(InterfaceC0619f1.f2808p, c7608c);
            return this;
        }

        /* renamed from: i */
        public b m3470i(int i10) {
            mo2932a().mo3178r(InterfaceC0640k2.f2869v, Integer.valueOf(i10));
            return this;
        }

        @Deprecated
        /* renamed from: j */
        public b m3471j(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            mo2932a().mo3178r(InterfaceC0619f1.f2800h, Integer.valueOf(i10));
            return this;
        }

        /* renamed from: k */
        public b m3472k(Class<C0709n> cls) {
            mo2932a().mo3178r(InterfaceC1602j.f6864D, cls);
            if (mo2932a().mo3197g(InterfaceC1602j.f6863C, null) == null) {
                m3473l(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: l */
        public b m3473l(String str) {
            mo2932a().mo3178r(InterfaceC1602j.f6863C, str);
            return this;
        }
    }

    /* renamed from: androidx.camera.core.n$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private static final C7608c f3064a;

        /* renamed from: b */
        private static final C0611d1 f3065b;

        /* renamed from: c */
        private static final C12048y f3066c;

        static {
            C7608c m23121a = new C7608c.a().m23123d(C7606a.f17983c).m23124e(C7609d.f17993c).m23121a();
            f3064a = m23121a;
            C12048y c12048y = C12048y.f32040d;
            f3066c = c12048y;
            f3065b = new b().m3470i(4).m3471j(0).m3469h(m23121a).m3467f(InterfaceC0644l2.b.IMAGE_CAPTURE).m3468g(c12048y).mo2933b();
        }

        /* renamed from: a */
        public C0611d1 m3474a() {
            return f3065b;
        }
    }

    /* renamed from: androidx.camera.core.n$d */
    /* loaded from: classes.dex */
    public static final class d {
    }

    /* renamed from: androidx.camera.core.n$e */
    /* loaded from: classes.dex */
    public static abstract class e {
        /* renamed from: a */
        public abstract void m3475a(InterfaceC0710o interfaceC0710o);

        /* renamed from: b */
        public abstract void m3476b(C12008g0 c12008g0);
    }

    /* renamed from: androidx.camera.core.n$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        void m3477a(C12008g0 c12008g0);

        /* renamed from: b */
        void m3478b(h hVar);
    }

    /* renamed from: androidx.camera.core.n$g */
    /* loaded from: classes.dex */
    public static final class g {
        /* renamed from: a */
        public ContentResolver m3479a() {
            throw null;
        }

        /* renamed from: b */
        public ContentValues m3480b() {
            throw null;
        }

        /* renamed from: c */
        public File m3481c() {
            throw null;
        }

        /* renamed from: d */
        public d m3482d() {
            throw null;
        }

        /* renamed from: e */
        public OutputStream m3483e() {
            throw null;
        }

        /* renamed from: f */
        public Uri m3484f() {
            throw null;
        }
    }

    /* renamed from: androidx.camera.core.n$h */
    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a */
        private final Uri f3067a;

        public h(Uri uri) {
            this.f3067a = uri;
        }
    }

    C0709n(C0611d1 c0611d1) {
        super(c0611d1);
        this.f3052n = new InterfaceC0623g1.a() { // from class: w.d0
            @Override // androidx.camera.core.impl.InterfaceC0623g1.a
            /* renamed from: a */
            public final void mo2863a(InterfaceC0623g1 interfaceC0623g1) {
                C0709n.m3448i0(interfaceC0623g1);
            }
        };
        this.f3054p = new AtomicReference<>(null);
        this.f3056r = -1;
        this.f3057s = null;
        this.f3061w = new a();
        C0611d1 c0611d12 = (C0611d1) m3556i();
        this.f3053o = c0611d12.mo3192b(C0611d1.f2780H) ? c0611d12.m3020X() : 1;
        this.f3055q = c0611d12.m3022Z(0);
    }

    /* renamed from: Y */
    private void m3441Y() {
        C12565r0 c12565r0 = this.f3060v;
        if (c12565r0 != null) {
            c12565r0.m41269e();
        }
    }

    /* renamed from: Z */
    private void m3442Z() {
        m3443a0(false);
    }

    /* renamed from: a0 */
    private void m3443a0(boolean z10) {
        C12565r0 c12565r0;
        Log.d("ImageCapture", "clearPipeline");
        C0688q.m3339a();
        C12564r c12564r = this.f3059u;
        if (c12564r != null) {
            c12564r.m41254a();
            this.f3059u = null;
        }
        if (z10 || (c12565r0 = this.f3060v) == null) {
            return;
        }
        c12565r0.m41269e();
        this.f3060v = null;
    }

    /* renamed from: b0 */
    private C0701y1.b m3444b0(final String str, final C0611d1 c0611d1, final AbstractC0604b2 abstractC0604b2) {
        C0688q.m3339a();
        Log.d("ImageCapture", String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, abstractC0604b2));
        Size mo2989e = abstractC0604b2.mo2989e();
        InterfaceC0606c0 m3553f = m3553f();
        Objects.requireNonNull(m3553f);
        boolean z10 = !m3553f.mo3001m() || m3446g0();
        if (this.f3059u != null) {
            C0984h.m4835m(z10);
            this.f3059u.m41254a();
        }
        this.f3059u = new C12564r(c0611d1, mo2989e, m3557k(), z10);
        if (this.f3060v == null) {
            this.f3060v = new C12565r0(this.f3061w);
        }
        this.f3060v.m41274l(this.f3059u);
        C0701y1.b m41256f = this.f3059u.m41256f(abstractC0604b2.mo2989e());
        if (m3454d0() == 2) {
            m3554g().mo2720a(m41256f);
        }
        if (abstractC0604b2.mo2988d() != null) {
            m41256f.m3398g(abstractC0604b2.mo2988d());
        }
        m41256f.m3397f(new C0701y1.c() { // from class: w.e0
            @Override // androidx.camera.core.impl.C0701y1.c
            /* renamed from: a */
            public final void mo2550a(C0701y1 c0701y1, C0701y1.f fVar) {
                C0709n.this.m3447h0(str, c0611d1, abstractC0604b2, c0701y1, fVar);
            }
        });
        return m41256f;
    }

    /* renamed from: f0 */
    private static boolean m3445f0(List<Pair<Integer, Size[]>> list, int i10) {
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

    /* renamed from: g0 */
    private boolean m3446g0() {
        return (m3553f() == null || m3553f().mo2490e().m3240V(null) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public /* synthetic */ void m3447h0(String str, C0611d1 c0611d1, AbstractC0604b2 abstractC0604b2, C0701y1 c0701y1, C0701y1.f fVar) {
        if (!m3567x(str)) {
            m3442Z();
            return;
        }
        this.f3060v.m41272j();
        m3443a0(true);
        C0701y1.b m3444b0 = m3444b0(str, c0611d1, abstractC0604b2);
        this.f3058t = m3444b0;
        m3546S(m3444b0.m3406o());
        m3541D();
        this.f3060v.m41273k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public static /* synthetic */ void m3448i0(InterfaceC0623g1 interfaceC0623g1) {
        try {
            InterfaceC0710o mo2894b = interfaceC0623g1.mo2894b();
            try {
                Log.d("ImageCapture", "Discarding ImageProxy which was inadvertently acquired: " + mo2894b);
                if (mo2894b != null) {
                    mo2894b.close();
                }
            } finally {
            }
        } catch (IllegalStateException e10) {
            Log.e("ImageCapture", "Failed to acquire latest image.", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public static /* synthetic */ Void m3449j0(List list) {
        return null;
    }

    /* renamed from: n0 */
    private void m3450n0() {
        synchronized (this.f3054p) {
            if (this.f3054p.get() != null) {
                return;
            }
            m3554g().mo2730f(m3455e0());
        }
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: F */
    public void mo2911F() {
        C0984h.m4834l(m3553f(), "Attached camera cannot be null");
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: G */
    public void mo3451G() {
        m3450n0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        if (m3445f0(r5, 35) != false) goto L23;
     */
    /* JADX WARN: Type inference failed for: r5v12, types: [androidx.camera.core.impl.k2, androidx.camera.core.impl.k2<?>] */
    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected androidx.camera.core.impl.InterfaceC0640k2<?> mo2912H(androidx.camera.core.impl.InterfaceC0602b0 r5, androidx.camera.core.impl.InterfaceC0640k2.a<?, ?, ?> r6) {
        /*
            r4 = this;
            androidx.camera.core.impl.t1 r5 = r5.mo2562e()
            java.lang.Class<d0.h> r0 = p051d0.InterfaceC6813h.class
            boolean r5 = r5.m3237a(r0)
            if (r5 == 0) goto L34
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            androidx.camera.core.impl.l1 r0 = r6.mo2932a()
            androidx.camera.core.impl.n0$a<java.lang.Boolean> r1 = androidx.camera.core.impl.C0611d1.f2786N
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r0.mo3197g(r1, r2)
            boolean r5 = r5.equals(r0)
            java.lang.String r0 = "ImageCapture"
            if (r5 == 0) goto L28
            java.lang.String r5 = "Device quirk suggests software JPEG encoder, but it has been explicitly disabled."
            p407w.C12029o0.m38648k(r0, r5)
            goto L34
        L28:
            java.lang.String r5 = "Requesting software JPEG due to device quirk."
            p407w.C12029o0.m38642e(r0, r5)
            androidx.camera.core.impl.l1 r5 = r6.mo2932a()
            r5.mo3178r(r1, r2)
        L34:
            androidx.camera.core.impl.l1 r5 = r6.mo2932a()
            boolean r5 = r4.m3453c0(r5)
            androidx.camera.core.impl.l1 r0 = r6.mo2932a()
            androidx.camera.core.impl.n0$a<java.lang.Integer> r1 = androidx.camera.core.impl.C0611d1.f2783K
            r2 = 0
            java.lang.Object r0 = r0.mo3197g(r1, r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1 = 256(0x100, float:3.59E-43)
            r3 = 35
            if (r0 == 0) goto L79
            boolean r2 = r4.m3446g0()
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
            androidx.core.util.C0984h.m4824b(r1, r2)
            androidx.camera.core.impl.l1 r1 = r6.mo2932a()
            androidx.camera.core.impl.n0$a<java.lang.Integer> r2 = androidx.camera.core.impl.InterfaceC0615e1.f2794f
            if (r5 == 0) goto L6d
            goto L71
        L6d:
            int r3 = r0.intValue()
        L71:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r1.mo3178r(r2, r5)
            goto Lb0
        L79:
            if (r5 == 0) goto L89
        L7b:
            androidx.camera.core.impl.l1 r5 = r6.mo2932a()
            androidx.camera.core.impl.n0$a<java.lang.Integer> r0 = androidx.camera.core.impl.InterfaceC0615e1.f2794f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
        L85:
            r5.mo3178r(r0, r1)
            goto Lb0
        L89:
            androidx.camera.core.impl.l1 r5 = r6.mo2932a()
            androidx.camera.core.impl.n0$a<java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>> r0 = androidx.camera.core.impl.InterfaceC0619f1.f2807o
            java.lang.Object r5 = r5.mo3197g(r0, r2)
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto La2
        L97:
            androidx.camera.core.impl.l1 r5 = r6.mo2932a()
            androidx.camera.core.impl.n0$a<java.lang.Integer> r0 = androidx.camera.core.impl.InterfaceC0615e1.f2794f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L85
        La2:
            boolean r0 = m3445f0(r5, r1)
            if (r0 == 0) goto La9
            goto L97
        La9:
            boolean r5 = m3445f0(r5, r3)
            if (r5 == 0) goto Lb0
            goto L7b
        Lb0:
            androidx.camera.core.impl.k2 r5 = r6.mo2933b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0709n.mo2912H(androidx.camera.core.impl.b0, androidx.camera.core.impl.k2$a):androidx.camera.core.impl.k2");
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: J */
    public void mo3452J() {
        m3441Y();
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: K */
    protected AbstractC0604b2 mo2913K(InterfaceC0649n0 interfaceC0649n0) {
        this.f3058t.m3398g(interfaceC0649n0);
        m3546S(this.f3058t.m3406o());
        return m3551d().mo2990f().mo2994d(interfaceC0649n0).mo2991a();
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: L */
    protected AbstractC0604b2 mo2914L(AbstractC0604b2 abstractC0604b2) {
        C0701y1.b m3444b0 = m3444b0(m3555h(), (C0611d1) m3556i(), abstractC0604b2);
        this.f3058t = m3444b0;
        m3546S(m3444b0.m3406o());
        m3539B();
        return abstractC0604b2;
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: M */
    public void mo2915M() {
        m3441Y();
        m3442Z();
    }

    /* renamed from: c0 */
    boolean m3453c0(InterfaceC0643l1 interfaceC0643l1) {
        boolean z10;
        Boolean bool = Boolean.TRUE;
        InterfaceC0649n0.a<Boolean> aVar = C0611d1.f2786N;
        Boolean bool2 = Boolean.FALSE;
        boolean z11 = false;
        if (bool.equals(interfaceC0643l1.mo3197g(aVar, bool2))) {
            if (m3446g0()) {
                C12029o0.m38648k("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z10 = false;
            } else {
                z10 = true;
            }
            Integer num = (Integer) interfaceC0643l1.mo3197g(C0611d1.f2783K, null);
            if (num == null || num.intValue() == 256) {
                z11 = z10;
            } else {
                C12029o0.m38648k("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z11) {
                C12029o0.m38648k("ImageCapture", "Unable to support software JPEG. Disabling.");
                interfaceC0643l1.mo3178r(aVar, bool2);
            }
        }
        return z11;
    }

    /* renamed from: d0 */
    public int m3454d0() {
        return this.f3053o;
    }

    /* renamed from: e0 */
    public int m3455e0() {
        int i10;
        synchronized (this.f3054p) {
            i10 = this.f3056r;
            if (i10 == -1) {
                i10 = ((C0611d1) m3556i()).m3021Y(2);
            }
        }
        return i10;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.camera.core.impl.k2, androidx.camera.core.impl.k2<?>] */
    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: j */
    public InterfaceC0640k2<?> mo2926j(boolean z10, InterfaceC0644l2 interfaceC0644l2) {
        c cVar = f3050x;
        InterfaceC0649n0 mo2542a = interfaceC0644l2.mo2542a(cVar.m3474a().mo2588N(), m3454d0());
        if (z10) {
            mo2542a = InterfaceC0649n0.m3189O(mo2542a, cVar.m3474a());
        }
        if (mo2542a == null) {
            return null;
        }
        return mo2928v(mo2542a).mo2933b();
    }

    /* renamed from: k0 */
    void m3456k0() {
        synchronized (this.f3054p) {
            if (this.f3054p.get() != null) {
                return;
            }
            this.f3054p.set(Integer.valueOf(m3455e0()));
        }
    }

    /* renamed from: l0 */
    public void m3457l0(Rational rational) {
        this.f3057s = rational;
    }

    /* renamed from: m0 */
    InterfaceFutureC5920f<Void> m3458m0(List<C0642l0> list) {
        C0688q.m3339a();
        return C0009f.m29o(m3554g().mo2724c(list, this.f3053o, this.f3055q), new InterfaceC9531a() { // from class: w.f0
            @Override // p227m.InterfaceC9531a
            public final Object apply(Object obj) {
                Void m3449j0;
                m3449j0 = C0709n.m3449j0((List) obj);
                return m3449j0;
            }
        }, C12747a.m42280a());
    }

    /* renamed from: o0 */
    void m3459o0() {
        synchronized (this.f3054p) {
            Integer andSet = this.f3054p.getAndSet(null);
            if (andSet == null) {
                return;
            }
            if (andSet.intValue() != m3455e0()) {
                m3450n0();
            }
        }
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: t */
    public Set<Integer> mo3460t() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    public String toString() {
        return "ImageCapture:" + m3560n();
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: v */
    public InterfaceC0640k2.a<?, ?, ?> mo2928v(InterfaceC0649n0 interfaceC0649n0) {
        return b.m3464d(interfaceC0649n0);
    }
}

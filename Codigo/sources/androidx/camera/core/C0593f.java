package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.C0593f;
import androidx.camera.core.C0715t;
import androidx.camera.core.InterfaceC0710o;
import androidx.camera.core.impl.AbstractC0604b2;
import androidx.camera.core.impl.AbstractC0661r0;
import androidx.camera.core.impl.C0607c1;
import androidx.camera.core.impl.C0627h1;
import androidx.camera.core.impl.C0647m1;
import androidx.camera.core.impl.C0656p1;
import androidx.camera.core.impl.C0701y1;
import androidx.camera.core.impl.InterfaceC0602b0;
import androidx.camera.core.impl.InterfaceC0606c0;
import androidx.camera.core.impl.InterfaceC0615e1;
import androidx.camera.core.impl.InterfaceC0619f1;
import androidx.camera.core.impl.InterfaceC0640k2;
import androidx.camera.core.impl.InterfaceC0643l1;
import androidx.camera.core.impl.InterfaceC0644l2;
import androidx.camera.core.impl.InterfaceC0649n0;
import androidx.camera.core.impl.utils.C0688q;
import androidx.core.util.C0984h;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import p018b0.InterfaceC1602j;
import p051d0.InterfaceC6812g;
import p092f0.C7264d;
import p126h0.C7606a;
import p126h0.C7608c;
import p126h0.C7609d;
import p407w.C12041u0;
import p407w.C12048y;
import p474z.C12747a;

/* renamed from: androidx.camera.core.f */
/* loaded from: classes.dex */
public final class C0593f extends AbstractC0718w {

    /* renamed from: s */
    public static final d f2712s = new d();

    /* renamed from: t */
    private static final Boolean f2713t = null;

    /* renamed from: n */
    final AbstractC0596i f2714n;

    /* renamed from: o */
    private final Object f2715o;

    /* renamed from: p */
    private a f2716p;

    /* renamed from: q */
    C0701y1.b f2717q;

    /* renamed from: r */
    private AbstractC0661r0 f2718r;

    /* renamed from: androidx.camera.core.f$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        default Size m2929a() {
            return null;
        }

        /* renamed from: b */
        void mo2930b(InterfaceC0710o interfaceC0710o);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.f$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    /* renamed from: androidx.camera.core.f$c */
    /* loaded from: classes.dex */
    public static final class c implements InterfaceC0640k2.a<C0593f, C0607c1, c> {

        /* renamed from: a */
        private final C0647m1 f2719a;

        public c() {
            this(C0647m1.m3184a0());
        }

        private c(C0647m1 c0647m1) {
            this.f2719a = c0647m1;
            Class cls = (Class) c0647m1.mo3197g(InterfaceC1602j.f6864D, null);
            if (cls == null || cls.equals(C0593f.class)) {
                m2943m(C0593f.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        /* renamed from: d */
        static c m2931d(InterfaceC0649n0 interfaceC0649n0) {
            return new c(C0647m1.m3185b0(interfaceC0649n0));
        }

        @Override // p407w.InterfaceC12050z
        /* renamed from: a */
        public InterfaceC0643l1 mo2932a() {
            return this.f2719a;
        }

        /* renamed from: c */
        public C0593f m2934c() {
            C0607c1 mo2933b = mo2933b();
            InterfaceC0619f1.m3055w(mo2933b);
            return new C0593f(mo2933b);
        }

        @Override // androidx.camera.core.impl.InterfaceC0640k2.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C0607c1 mo2933b() {
            return new C0607c1(C0656p1.m3211Y(this.f2719a));
        }

        /* renamed from: f */
        public c m2936f(int i10) {
            mo2932a().mo3178r(C0607c1.f2769H, Integer.valueOf(i10));
            return this;
        }

        /* renamed from: g */
        public c m2937g(InterfaceC0644l2.b bVar) {
            mo2932a().mo3178r(InterfaceC0640k2.f2864A, bVar);
            return this;
        }

        /* renamed from: h */
        public c m2938h(Size size) {
            mo2932a().mo3178r(InterfaceC0619f1.f2805m, size);
            return this;
        }

        /* renamed from: i */
        public c m2939i(C12048y c12048y) {
            if (!Objects.equals(C12048y.f32040d, c12048y)) {
                throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
            }
            mo2932a().mo3178r(InterfaceC0615e1.f2795g, c12048y);
            return this;
        }

        /* renamed from: j */
        public c m2940j(C7608c c7608c) {
            mo2932a().mo3178r(InterfaceC0619f1.f2808p, c7608c);
            return this;
        }

        /* renamed from: k */
        public c m2941k(int i10) {
            mo2932a().mo3178r(InterfaceC0640k2.f2869v, Integer.valueOf(i10));
            return this;
        }

        @Deprecated
        /* renamed from: l */
        public c m2942l(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            mo2932a().mo3178r(InterfaceC0619f1.f2800h, Integer.valueOf(i10));
            return this;
        }

        /* renamed from: m */
        public c m2943m(Class<C0593f> cls) {
            mo2932a().mo3178r(InterfaceC1602j.f6864D, cls);
            if (mo2932a().mo3197g(InterfaceC1602j.f6863C, null) == null) {
                m2944n(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: n */
        public c m2944n(String str) {
            mo2932a().mo3178r(InterfaceC1602j.f6863C, str);
            return this;
        }

        @Deprecated
        /* renamed from: o */
        public c m2945o(Size size) {
            mo2932a().mo3178r(InterfaceC0619f1.f2804l, size);
            return this;
        }
    }

    /* renamed from: androidx.camera.core.f$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private static final Size f2720a;

        /* renamed from: b */
        private static final C12048y f2721b;

        /* renamed from: c */
        private static final C7608c f2722c;

        /* renamed from: d */
        private static final C0607c1 f2723d;

        static {
            Size size = new Size(640, 480);
            f2720a = size;
            C12048y c12048y = C12048y.f32040d;
            f2721b = c12048y;
            C7608c m23121a = new C7608c.a().m23123d(C7606a.f17983c).m23124e(new C7609d(C7264d.f16273c, 1)).m23121a();
            f2722c = m23121a;
            f2723d = new c().m2938h(size).m2941k(1).m2942l(0).m2940j(m23121a).m2937g(InterfaceC0644l2.b.IMAGE_ANALYSIS).m2939i(c12048y).mo2933b();
        }

        /* renamed from: a */
        public C0607c1 m2946a() {
            return f2723d;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.f$e */
    /* loaded from: classes.dex */
    public @interface e {
    }

    C0593f(C0607c1 c0607c1) {
        super(c0607c1);
        this.f2715o = new Object();
        if (((C0607c1) m3556i()).m3004W(0) == 1) {
            this.f2714n = new C0705j();
        } else {
            this.f2714n = new C0706k(c0607c1.m8927R(C12747a.m42281b()));
        }
        this.f2714n.m2965t(m2923d0());
        this.f2714n.m2966u(m2925g0());
    }

    /* renamed from: f0 */
    private boolean m2906f0(InterfaceC0606c0 interfaceC0606c0) {
        return m2925g0() && m3561o(interfaceC0606c0) % 180 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public static /* synthetic */ void m2907h0(C0715t c0715t, C0715t c0715t2) {
        c0715t.m3534l();
        if (c0715t2 != null) {
            c0715t2.m3534l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public /* synthetic */ void m2908i0(String str, C0607c1 c0607c1, AbstractC0604b2 abstractC0604b2, C0701y1 c0701y1, C0701y1.f fVar) {
        m2918Y();
        this.f2714n.mo2960g();
        if (m3567x(str)) {
            m3546S(m2919Z(str, c0607c1, abstractC0604b2).m3406o());
            m3541D();
        }
    }

    /* renamed from: l0 */
    private void m2910l0() {
        InterfaceC0606c0 m3553f = m3553f();
        if (m3553f != null) {
            this.f2714n.m2968w(m3561o(m3553f));
        }
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: F */
    public void mo2911F() {
        this.f2714n.m2959f();
    }

    /* JADX WARN: Type inference failed for: r6v14, types: [androidx.camera.core.impl.k2, androidx.camera.core.impl.k2<?>] */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.camera.core.impl.u1, androidx.camera.core.impl.k2] */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.camera.core.impl.k2, androidx.camera.core.impl.k2<?>] */
    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: H */
    protected InterfaceC0640k2<?> mo2912H(InterfaceC0602b0 interfaceC0602b0, InterfaceC0640k2.a<?, ?, ?> aVar) {
        Size m2929a;
        Boolean m2922c0 = m2922c0();
        boolean m3237a = interfaceC0602b0.mo2562e().m3237a(InterfaceC6812g.class);
        AbstractC0596i abstractC0596i = this.f2714n;
        if (m2922c0 != null) {
            m3237a = m2922c0.booleanValue();
        }
        abstractC0596i.m2964s(m3237a);
        synchronized (this.f2715o) {
            a aVar2 = this.f2716p;
            m2929a = aVar2 != null ? aVar2.m2929a() : null;
        }
        if (m2929a == null) {
            return aVar.mo2933b();
        }
        if (interfaceC0602b0.mo2565i(((Integer) aVar.mo2932a().mo3197g(InterfaceC0619f1.f2801i, 0)).intValue()) % 180 == 90) {
            m2929a = new Size(m2929a.getHeight(), m2929a.getWidth());
        }
        ?? mo2933b = aVar.mo2933b();
        InterfaceC0649n0.a<Size> aVar3 = InterfaceC0619f1.f2804l;
        if (!mo2933b.mo3192b(aVar3)) {
            aVar.mo2932a().mo3178r(aVar3, m2929a);
        }
        InterfaceC0643l1 mo2932a = aVar.mo2932a();
        InterfaceC0649n0.a<C7608c> aVar4 = InterfaceC0619f1.f2808p;
        C7608c c7608c = (C7608c) mo2932a.mo3197g(aVar4, null);
        if (c7608c != null && c7608c.m23119d() == null) {
            C7608c.a m23120b = C7608c.a.m23120b(c7608c);
            m23120b.m23124e(new C7609d(m2929a, 1));
            aVar.mo2932a().mo3178r(aVar4, m23120b.m23121a());
        }
        return aVar.mo2933b();
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: K */
    protected AbstractC0604b2 mo2913K(InterfaceC0649n0 interfaceC0649n0) {
        this.f2717q.m3398g(interfaceC0649n0);
        m3546S(this.f2717q.m3406o());
        return m3551d().mo2990f().mo2994d(interfaceC0649n0).mo2991a();
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: L */
    protected AbstractC0604b2 mo2914L(AbstractC0604b2 abstractC0604b2) {
        C0701y1.b m2919Z = m2919Z(m3555h(), (C0607c1) m3556i(), abstractC0604b2);
        this.f2717q = m2919Z;
        m3546S(m2919Z.m3406o());
        return abstractC0604b2;
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: M */
    public void mo2915M() {
        m2918Y();
        this.f2714n.m2961j();
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: P */
    public void mo2916P(Matrix matrix) {
        super.mo2916P(matrix);
        this.f2714n.m2969x(matrix);
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: Q */
    public void mo2917Q(Rect rect) {
        super.mo2917Q(rect);
        this.f2714n.m2970y(rect);
    }

    /* renamed from: Y */
    void m2918Y() {
        C0688q.m3339a();
        AbstractC0661r0 abstractC0661r0 = this.f2718r;
        if (abstractC0661r0 != null) {
            abstractC0661r0.m3223d();
            this.f2718r = null;
        }
    }

    /* renamed from: Z */
    C0701y1.b m2919Z(final String str, final C0607c1 c0607c1, final AbstractC0604b2 abstractC0604b2) {
        C0688q.m3339a();
        Size mo2989e = abstractC0604b2.mo2989e();
        Executor executor = (Executor) C0984h.m4833k(c0607c1.m8927R(C12747a.m42281b()));
        boolean z10 = true;
        int m2921b0 = m2920a0() == 1 ? m2921b0() : 4;
        final C0715t c0715t = c0607c1.m3006Y() != null ? new C0715t(c0607c1.m3006Y().m38631a(mo2989e.getWidth(), mo2989e.getHeight(), m3558l(), m2921b0, 0L)) : new C0715t(C0711p.m3485a(mo2989e.getWidth(), mo2989e.getHeight(), m3558l(), m2921b0));
        boolean m2906f0 = m3553f() != null ? m2906f0(m3553f()) : false;
        int height = m2906f0 ? mo2989e.getHeight() : mo2989e.getWidth();
        int width = m2906f0 ? mo2989e.getWidth() : mo2989e.getHeight();
        int i10 = m2923d0() == 2 ? 1 : 35;
        boolean z11 = m3558l() == 35 && m2923d0() == 2;
        if (m3558l() != 35 || ((m3553f() == null || m3561o(m3553f()) == 0) && !Boolean.TRUE.equals(m2922c0()))) {
            z10 = false;
        }
        final C0715t c0715t2 = (z11 || z10) ? new C0715t(C0711p.m3485a(height, width, i10, c0715t.mo2897e())) : null;
        if (c0715t2 != null) {
            this.f2714n.m2967v(c0715t2);
        }
        m2910l0();
        c0715t.mo2898f(this.f2714n, executor);
        C0701y1.b m3391p = C0701y1.b.m3391p(c0607c1, abstractC0604b2.mo2989e());
        if (abstractC0604b2.mo2988d() != null) {
            m3391p.m3398g(abstractC0604b2.mo2988d());
        }
        AbstractC0661r0 abstractC0661r0 = this.f2718r;
        if (abstractC0661r0 != null) {
            abstractC0661r0.m3223d();
        }
        C0627h1 c0627h1 = new C0627h1(c0715t.getSurface(), mo2989e, m3558l());
        this.f2718r = c0627h1;
        c0627h1.m3230k().addListener(new Runnable() { // from class: w.a0
            @Override // java.lang.Runnable
            public final void run() {
                C0593f.m2907h0(C0715t.this, c0715t2);
            }
        }, C12747a.m42283d());
        m3391p.m3407q(abstractC0604b2.mo2987c());
        m3391p.m3404m(this.f2718r, abstractC0604b2.mo2986b());
        m3391p.m3397f(new C0701y1.c() { // from class: w.b0
            @Override // androidx.camera.core.impl.C0701y1.c
            /* renamed from: a */
            public final void mo2550a(C0701y1 c0701y1, C0701y1.f fVar) {
                C0593f.this.m2908i0(str, c0607c1, abstractC0604b2, c0701y1, fVar);
            }
        });
        return m3391p;
    }

    /* renamed from: a0 */
    public int m2920a0() {
        return ((C0607c1) m3556i()).m3004W(0);
    }

    /* renamed from: b0 */
    public int m2921b0() {
        return ((C0607c1) m3556i()).m3005X(6);
    }

    /* renamed from: c0 */
    public Boolean m2922c0() {
        return ((C0607c1) m3556i()).m3007Z(f2713t);
    }

    /* renamed from: d0 */
    public int m2923d0() {
        return ((C0607c1) m3556i()).m3008a0(1);
    }

    /* renamed from: e0 */
    public C12041u0 m2924e0() {
        return m3562q();
    }

    /* renamed from: g0 */
    public boolean m2925g0() {
        return ((C0607c1) m3556i()).m3009b0(Boolean.FALSE).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.camera.core.impl.k2, androidx.camera.core.impl.k2<?>] */
    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: j */
    public InterfaceC0640k2<?> mo2926j(boolean z10, InterfaceC0644l2 interfaceC0644l2) {
        d dVar = f2712s;
        InterfaceC0649n0 mo2542a = interfaceC0644l2.mo2542a(dVar.m2946a().mo2588N(), 1);
        if (z10) {
            mo2542a = InterfaceC0649n0.m3189O(mo2542a, dVar.m2946a());
        }
        if (mo2542a == null) {
            return null;
        }
        return mo2928v(mo2542a).mo2933b();
    }

    /* renamed from: k0 */
    public void m2927k0(Executor executor, final a aVar) {
        synchronized (this.f2715o) {
            this.f2714n.m2963r(executor, new a() { // from class: w.c0
                @Override // androidx.camera.core.C0593f.a
                /* renamed from: b */
                public final void mo2930b(InterfaceC0710o interfaceC0710o) {
                    C0593f.a.this.mo2930b(interfaceC0710o);
                }
            });
            if (this.f2716p == null) {
                m3539B();
            }
            this.f2716p = aVar;
        }
    }

    public String toString() {
        return "ImageAnalysis:" + m3560n();
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: v */
    public InterfaceC0640k2.a<?, ?, ?> mo2928v(InterfaceC0649n0 interfaceC0649n0) {
        return c.m2931d(interfaceC0649n0);
    }
}

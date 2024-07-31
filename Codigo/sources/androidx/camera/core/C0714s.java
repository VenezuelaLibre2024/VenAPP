package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.C0714s;
import androidx.camera.core.impl.AbstractC0604b2;
import androidx.camera.core.impl.AbstractC0661r0;
import androidx.camera.core.impl.C0647m1;
import androidx.camera.core.impl.C0656p1;
import androidx.camera.core.impl.C0662r1;
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
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p018b0.InterfaceC1602j;
import p112g0.C7414n0;
import p112g0.C7430v0;
import p126h0.C7606a;
import p126h0.C7608c;
import p126h0.C7609d;
import p407w.AbstractC12019k;
import p407w.C12015i1;
import p474z.C12747a;

/* renamed from: androidx.camera.core.s */
/* loaded from: classes.dex */
public final class C0714s extends AbstractC0718w {

    /* renamed from: u */
    public static final b f3083u = new b();

    /* renamed from: v */
    private static final Executor f3084v = C12747a.m42283d();

    /* renamed from: n */
    private c f3085n;

    /* renamed from: o */
    private Executor f3086o;

    /* renamed from: p */
    C0701y1.b f3087p;

    /* renamed from: q */
    private AbstractC0661r0 f3088q;

    /* renamed from: r */
    private C7414n0 f3089r;

    /* renamed from: s */
    C12015i1 f3090s;

    /* renamed from: t */
    private C7430v0 f3091t;

    /* renamed from: androidx.camera.core.s$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC0640k2.a<C0714s, C0662r1, a> {

        /* renamed from: a */
        private final C0647m1 f3092a;

        public a() {
            this(C0647m1.m3184a0());
        }

        private a(C0647m1 c0647m1) {
            this.f3092a = c0647m1;
            Class cls = (Class) c0647m1.mo3197g(InterfaceC1602j.f6864D, null);
            if (cls == null || cls.equals(C0714s.class)) {
                m3524j(C0714s.class);
                c0647m1.mo3178r(InterfaceC0619f1.f2803k, 2);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        /* renamed from: d */
        static a m3517d(InterfaceC0649n0 interfaceC0649n0) {
            return new a(C0647m1.m3185b0(interfaceC0649n0));
        }

        @Override // p407w.InterfaceC12050z
        /* renamed from: a */
        public InterfaceC0643l1 mo2932a() {
            return this.f3092a;
        }

        /* renamed from: c */
        public C0714s m3518c() {
            C0662r1 mo2933b = mo2933b();
            InterfaceC0619f1.m3055w(mo2933b);
            return new C0714s(mo2933b);
        }

        @Override // androidx.camera.core.impl.InterfaceC0640k2.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C0662r1 mo2933b() {
            return new C0662r1(C0656p1.m3211Y(this.f3092a));
        }

        /* renamed from: f */
        public a m3520f(InterfaceC0644l2.b bVar) {
            mo2932a().mo3178r(InterfaceC0640k2.f2864A, bVar);
            return this;
        }

        /* renamed from: g */
        public a m3521g(C7608c c7608c) {
            mo2932a().mo3178r(InterfaceC0619f1.f2808p, c7608c);
            return this;
        }

        /* renamed from: h */
        public a m3522h(int i10) {
            mo2932a().mo3178r(InterfaceC0640k2.f2869v, Integer.valueOf(i10));
            return this;
        }

        @Deprecated
        /* renamed from: i */
        public a m3523i(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            mo2932a().mo3178r(InterfaceC0619f1.f2800h, Integer.valueOf(i10));
            return this;
        }

        /* renamed from: j */
        public a m3524j(Class<C0714s> cls) {
            mo2932a().mo3178r(InterfaceC1602j.f6864D, cls);
            if (mo2932a().mo3197g(InterfaceC1602j.f6863C, null) == null) {
                m3525k(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: k */
        public a m3525k(String str) {
            mo2932a().mo3178r(InterfaceC1602j.f6863C, str);
            return this;
        }
    }

    /* renamed from: androidx.camera.core.s$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private static final C7608c f3093a;

        /* renamed from: b */
        private static final C0662r1 f3094b;

        static {
            C7608c m23121a = new C7608c.a().m23123d(C7606a.f17983c).m23124e(C7609d.f17993c).m23121a();
            f3093a = m23121a;
            f3094b = new a().m3522h(2).m3523i(0).m3521g(m23121a).m3520f(InterfaceC0644l2.b.PREVIEW).mo2933b();
        }

        /* renamed from: a */
        public C0662r1 m3526a() {
            return f3094b;
        }
    }

    /* renamed from: androidx.camera.core.s$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo3527a(C12015i1 c12015i1);
    }

    C0714s(C0662r1 c0662r1) {
        super(c0662r1);
        this.f3086o = f3084v;
    }

    /* renamed from: Y */
    private void m3501Y(C0701y1.b bVar, final String str, final C0662r1 c0662r1, final AbstractC0604b2 abstractC0604b2) {
        if (this.f3085n != null) {
            bVar.m3404m(this.f3088q, abstractC0604b2.mo2986b());
        }
        bVar.m3397f(new C0701y1.c() { // from class: w.t0
            @Override // androidx.camera.core.impl.C0701y1.c
            /* renamed from: a */
            public final void mo2550a(C0701y1 c0701y1, C0701y1.f fVar) {
                C0714s.this.m3505d0(str, c0662r1, abstractC0604b2, c0701y1, fVar);
            }
        });
    }

    /* renamed from: Z */
    private void m3502Z() {
        AbstractC0661r0 abstractC0661r0 = this.f3088q;
        if (abstractC0661r0 != null) {
            abstractC0661r0.m3223d();
            this.f3088q = null;
        }
        C7430v0 c7430v0 = this.f3091t;
        if (c7430v0 != null) {
            c7430v0.m22421i();
            this.f3091t = null;
        }
        C7414n0 c7414n0 = this.f3089r;
        if (c7414n0 != null) {
            c7414n0.m22343i();
            this.f3089r = null;
        }
        this.f3090s = null;
    }

    /* renamed from: a0 */
    private C0701y1.b m3503a0(String str, C0662r1 c0662r1, AbstractC0604b2 abstractC0604b2) {
        AbstractC0661r0 m38611j;
        C0688q.m3339a();
        InterfaceC0606c0 m3553f = m3553f();
        Objects.requireNonNull(m3553f);
        final InterfaceC0606c0 interfaceC0606c0 = m3553f;
        m3502Z();
        C0984h.m4835m(this.f3089r == null);
        Matrix m3563r = m3563r();
        boolean mo3001m = interfaceC0606c0.mo3001m();
        Rect m3504b0 = m3504b0(abstractC0604b2.mo2989e());
        Objects.requireNonNull(m3504b0);
        this.f3089r = new C7414n0(1, 34, abstractC0604b2, m3563r, mo3001m, m3504b0, mo3516p(interfaceC0606c0, m3569z(interfaceC0606c0)), m3550c(), m3511l0(interfaceC0606c0));
        AbstractC12019k m3557k = m3557k();
        if (m3557k != null) {
            this.f3091t = new C7430v0(interfaceC0606c0, m3557k.m38623a());
            this.f3089r.m22342f(new Runnable() { // from class: androidx.camera.core.r
                @Override // java.lang.Runnable
                public final void run() {
                    C0714s.this.m3541D();
                }
            });
            C7430v0.d m22427i = C7430v0.d.m22427i(this.f3089r);
            final C7414n0 c7414n0 = this.f3091t.m22423m(C7430v0.b.m22425c(this.f3089r, Collections.singletonList(m22427i))).get(m22427i);
            Objects.requireNonNull(c7414n0);
            c7414n0.m22342f(new Runnable() { // from class: w.r0
                @Override // java.lang.Runnable
                public final void run() {
                    C0714s.this.m3506e0(c7414n0, interfaceC0606c0);
                }
            });
            this.f3090s = c7414n0.m22345k(interfaceC0606c0);
            m38611j = this.f3089r.m22348o();
        } else {
            this.f3089r.m22342f(new Runnable() { // from class: androidx.camera.core.r
                @Override // java.lang.Runnable
                public final void run() {
                    C0714s.this.m3541D();
                }
            });
            C12015i1 m22345k = this.f3089r.m22345k(interfaceC0606c0);
            this.f3090s = m22345k;
            m38611j = m22345k.m38611j();
        }
        this.f3088q = m38611j;
        if (this.f3085n != null) {
            m3509h0();
        }
        C0701y1.b m3391p = C0701y1.b.m3391p(c0662r1, abstractC0604b2.mo2989e());
        m3391p.m3407q(abstractC0604b2.mo2987c());
        if (abstractC0604b2.mo2988d() != null) {
            m3391p.m3398g(abstractC0604b2.mo2988d());
        }
        m3501Y(m3391p, str, c0662r1, abstractC0604b2);
        return m3391p;
    }

    /* renamed from: b0 */
    private Rect m3504b0(Size size) {
        if (m3566w() != null) {
            return m3566w();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ void m3505d0(String str, C0662r1 c0662r1, AbstractC0604b2 abstractC0604b2, C0701y1 c0701y1, C0701y1.f fVar) {
        if (m3567x(str)) {
            m3546S(m3503a0(str, c0662r1, abstractC0604b2).m3406o());
            m3541D();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void m3506e0(C7414n0 c7414n0, InterfaceC0606c0 interfaceC0606c0) {
        C0688q.m3339a();
        if (interfaceC0606c0 == m3553f()) {
            this.f3090s = c7414n0.m22345k(interfaceC0606c0);
            m3509h0();
        }
    }

    /* renamed from: h0 */
    private void m3509h0() {
        m3510i0();
        final c cVar = (c) C0984h.m4833k(this.f3085n);
        final C12015i1 c12015i1 = (C12015i1) C0984h.m4833k(this.f3090s);
        this.f3086o.execute(new Runnable() { // from class: w.s0
            @Override // java.lang.Runnable
            public final void run() {
                C0714s.c.this.mo3527a(c12015i1);
            }
        });
    }

    /* renamed from: i0 */
    private void m3510i0() {
        InterfaceC0606c0 m3553f = m3553f();
        C7414n0 c7414n0 = this.f3089r;
        if (m3553f == null || c7414n0 == null) {
            return;
        }
        c7414n0.m22341D(mo3516p(m3553f, m3569z(m3553f)), m3550c());
    }

    /* renamed from: l0 */
    private boolean m3511l0(InterfaceC0606c0 interfaceC0606c0) {
        return interfaceC0606c0.mo3001m() && m3569z(interfaceC0606c0);
    }

    /* renamed from: m0 */
    private void m3512m0(String str, C0662r1 c0662r1, AbstractC0604b2 abstractC0604b2) {
        C0701y1.b m3503a0 = m3503a0(str, c0662r1, abstractC0604b2);
        this.f3087p = m3503a0;
        m3546S(m3503a0.m3406o());
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.camera.core.impl.k2, androidx.camera.core.impl.k2<?>] */
    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: H */
    protected InterfaceC0640k2<?> mo2912H(InterfaceC0602b0 interfaceC0602b0, InterfaceC0640k2.a<?, ?, ?> aVar) {
        aVar.mo2932a().mo3178r(InterfaceC0615e1.f2794f, 34);
        return aVar.mo2933b();
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: K */
    protected AbstractC0604b2 mo2913K(InterfaceC0649n0 interfaceC0649n0) {
        this.f3087p.m3398g(interfaceC0649n0);
        m3546S(this.f3087p.m3406o());
        return m3551d().mo2990f().mo2994d(interfaceC0649n0).mo2991a();
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: L */
    protected AbstractC0604b2 mo2914L(AbstractC0604b2 abstractC0604b2) {
        m3512m0(m3555h(), (C0662r1) m3556i(), abstractC0604b2);
        return abstractC0604b2;
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: M */
    public void mo2915M() {
        m3502Z();
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: Q */
    public void mo2917Q(Rect rect) {
        super.mo2917Q(rect);
        m3510i0();
    }

    /* renamed from: c0 */
    public int m3513c0() {
        return m3565u();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.camera.core.impl.k2, androidx.camera.core.impl.k2<?>] */
    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: j */
    public InterfaceC0640k2<?> mo2926j(boolean z10, InterfaceC0644l2 interfaceC0644l2) {
        b bVar = f3083u;
        InterfaceC0649n0 mo2542a = interfaceC0644l2.mo2542a(bVar.m3526a().mo2588N(), 1);
        if (z10) {
            mo2542a = InterfaceC0649n0.m3189O(mo2542a, bVar.m3526a());
        }
        if (mo2542a == null) {
            return null;
        }
        return mo2928v(mo2542a).mo2933b();
    }

    /* renamed from: j0 */
    public void m3514j0(c cVar) {
        m3515k0(f3084v, cVar);
    }

    /* renamed from: k0 */
    public void m3515k0(Executor executor, c cVar) {
        C0688q.m3339a();
        if (cVar == null) {
            this.f3085n = null;
            m3540C();
            return;
        }
        this.f3085n = cVar;
        this.f3086o = executor;
        if (m3552e() != null) {
            m3512m0(m3555h(), (C0662r1) m3556i(), m3551d());
            m3541D();
        }
        m3539B();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: p */
    public int mo3516p(InterfaceC0606c0 interfaceC0606c0, boolean z10) {
        if (interfaceC0606c0.mo3001m()) {
            return super.mo3516p(interfaceC0606c0, z10);
        }
        return 0;
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: t */
    public Set<Integer> mo3460t() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    public String toString() {
        return "Preview:" + m3560n();
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: v */
    public InterfaceC0640k2.a<?, ?, ?> mo2928v(InterfaceC0649n0 interfaceC0649n0) {
        return a.m3517d(interfaceC0649n0);
    }
}

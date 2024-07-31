package p112g0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.AbstractC0604b2;
import androidx.camera.core.impl.AbstractC0661r0;
import androidx.camera.core.impl.InterfaceC0606c0;
import androidx.camera.core.impl.utils.C0688q;
import androidx.concurrent.futures.C0742c;
import androidx.core.util.C0984h;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p002a0.C0009f;
import p002a0.InterfaceC0004a;
import p112g0.C7414n0;
import p407w.C12015i1;
import p407w.InterfaceC12047x0;
import p474z.C12747a;

/* renamed from: g0.n0 */
/* loaded from: classes.dex */
public class C7414n0 {

    /* renamed from: a */
    private final int f17188a;

    /* renamed from: b */
    private final Matrix f17189b;

    /* renamed from: c */
    private final boolean f17190c;

    /* renamed from: d */
    private final Rect f17191d;

    /* renamed from: e */
    private final boolean f17192e;

    /* renamed from: f */
    private final int f17193f;

    /* renamed from: g */
    private final AbstractC0604b2 f17194g;

    /* renamed from: h */
    private int f17195h;

    /* renamed from: i */
    private int f17196i;

    /* renamed from: j */
    private C7420q0 f17197j;

    /* renamed from: l */
    private C12015i1 f17199l;

    /* renamed from: m */
    private a f17200m;

    /* renamed from: k */
    private boolean f17198k = false;

    /* renamed from: n */
    private final Set<Runnable> f17201n = new HashSet();

    /* renamed from: o */
    private boolean f17202o = false;

    /* renamed from: g0.n0$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC0661r0 {

        /* renamed from: o */
        final InterfaceFutureC5920f<Surface> f17203o;

        /* renamed from: p */
        C0742c.a<Surface> f17204p;

        /* renamed from: q */
        private AbstractC0661r0 f17205q;

        a(Size size, int i10) {
            super(size, i10);
            this.f17203o = C0742c.m3752a(new C0742c.c() { // from class: g0.l0
                @Override // androidx.concurrent.futures.C0742c.c
                /* renamed from: a */
                public final Object mo14a(C0742c.a aVar) {
                    Object m22357n;
                    m22357n = C7414n0.a.this.m22357n(aVar);
                    return m22357n;
                }
            });
        }

        /* renamed from: n */
        public /* synthetic */ Object m22357n(C0742c.a aVar) {
            this.f17204p = aVar;
            return "SettableFuture hashCode: " + hashCode();
        }

        @Override // androidx.camera.core.impl.AbstractC0661r0
        /* renamed from: r */
        protected InterfaceFutureC5920f<Surface> mo2981r() {
            return this.f17203o;
        }

        /* renamed from: u */
        boolean m22359u() {
            C0688q.m3339a();
            return this.f17205q == null && !m3232m();
        }

        /* renamed from: v */
        public boolean m22360v(final AbstractC0661r0 abstractC0661r0, Runnable runnable) {
            C0688q.m3339a();
            C0984h.m4833k(abstractC0661r0);
            AbstractC0661r0 abstractC0661r02 = this.f17205q;
            if (abstractC0661r02 == abstractC0661r0) {
                return false;
            }
            C0984h.m4836n(abstractC0661r02 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            C0984h.m4824b(m3227h().equals(abstractC0661r0.m3227h()), "The provider's size must match the parent");
            C0984h.m4824b(m3228i() == abstractC0661r0.m3228i(), "The provider's format must match the parent");
            C0984h.m4836n(!m3232m(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.f17205q = abstractC0661r0;
            C0009f.m25k(abstractC0661r0.m3229j(), this.f17204p);
            abstractC0661r0.m3231l();
            m3230k().addListener(new Runnable() { // from class: g0.m0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC0661r0.this.m3224e();
                }
            }, C12747a.m42280a());
            abstractC0661r0.m3225f().addListener(runnable, C12747a.m42283d());
            return true;
        }
    }

    public C7414n0(int i10, int i11, AbstractC0604b2 abstractC0604b2, Matrix matrix, boolean z10, Rect rect, int i12, int i13, boolean z11) {
        this.f17193f = i10;
        this.f17188a = i11;
        this.f17194g = abstractC0604b2;
        this.f17189b = matrix;
        this.f17190c = z10;
        this.f17191d = rect;
        this.f17196i = i12;
        this.f17195h = i13;
        this.f17192e = z11;
        this.f17200m = new a(abstractC0604b2.mo2989e(), i11);
    }

    /* renamed from: A */
    public /* synthetic */ void m22327A(int i10, int i11) {
        boolean z10;
        boolean z11 = true;
        if (this.f17196i != i10) {
            this.f17196i = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f17195h != i11) {
            this.f17195h = i11;
        } else {
            z11 = z10;
        }
        if (z11) {
            m22328B();
        }
    }

    /* renamed from: B */
    private void m22328B() {
        C0688q.m3339a();
        C12015i1 c12015i1 = this.f17199l;
        if (c12015i1 != null) {
            c12015i1.m38615x(C12015i1.h.m38622g(this.f17191d, this.f17196i, this.f17195h, m22355v(), this.f17189b, this.f17192e));
        }
    }

    /* renamed from: g */
    private void m22334g() {
        C0984h.m4836n(!this.f17198k, "Consumer can only be linked once.");
        this.f17198k = true;
    }

    /* renamed from: h */
    private void m22335h() {
        C0984h.m4836n(!this.f17202o, "Edge is already closed.");
    }

    /* renamed from: m */
    public void m22336m() {
        C0688q.m3339a();
        this.f17200m.m3223d();
        C7420q0 c7420q0 = this.f17197j;
        if (c7420q0 != null) {
            c7420q0.m22369l();
            this.f17197j = null;
        }
    }

    /* renamed from: x */
    public /* synthetic */ InterfaceFutureC5920f m22337x(final a aVar, int i10, Size size, Rect rect, int i11, boolean z10, InterfaceC0606c0 interfaceC0606c0, Surface surface) {
        C0984h.m4833k(surface);
        try {
            aVar.m3231l();
            C7420q0 c7420q0 = new C7420q0(surface, m22354u(), i10, this.f17194g.mo2989e(), size, rect, i11, z10, interfaceC0606c0, this.f17189b);
            c7420q0.m22368g().addListener(new Runnable() { // from class: g0.k0
                @Override // java.lang.Runnable
                public final void run() {
                    C7414n0.a.this.m3224e();
                }
            }, C12747a.m42280a());
            this.f17197j = c7420q0;
            return C0009f.m22h(c7420q0);
        } catch (AbstractC0661r0.a e10) {
            return C0009f.m20f(e10);
        }
    }

    /* renamed from: y */
    public /* synthetic */ void m22338y() {
        if (this.f17202o) {
            return;
        }
        m22356w();
    }

    /* renamed from: z */
    public /* synthetic */ void m22339z() {
        C12747a.m42283d().execute(new Runnable() { // from class: g0.i0
            @Override // java.lang.Runnable
            public final void run() {
                C7414n0.this.m22338y();
            }
        });
    }

    /* renamed from: C */
    public void m22340C(AbstractC0661r0 abstractC0661r0) {
        C0688q.m3339a();
        m22335h();
        this.f17200m.m22360v(abstractC0661r0, new RunnableC7400g0(this));
    }

    /* renamed from: D */
    public void m22341D(final int i10, final int i11) {
        C0688q.m3342d(new Runnable() { // from class: g0.e0
            @Override // java.lang.Runnable
            public final void run() {
                C7414n0.this.m22327A(i10, i11);
            }
        });
    }

    /* renamed from: f */
    public void m22342f(Runnable runnable) {
        C0688q.m3339a();
        m22335h();
        this.f17201n.add(runnable);
    }

    /* renamed from: i */
    public final void m22343i() {
        C0688q.m3339a();
        m22336m();
        this.f17202o = true;
    }

    /* renamed from: j */
    public InterfaceFutureC5920f<InterfaceC12047x0> m22344j(final Size size, final int i10, final Rect rect, final int i11, final boolean z10, final InterfaceC0606c0 interfaceC0606c0) {
        C0688q.m3339a();
        m22335h();
        m22334g();
        final a aVar = this.f17200m;
        return C0009f.m30p(aVar.m3229j(), new InterfaceC0004a() { // from class: g0.j0
            @Override // p002a0.InterfaceC0004a
            public final InterfaceFutureC5920f apply(Object obj) {
                InterfaceFutureC5920f m22337x;
                m22337x = C7414n0.this.m22337x(aVar, i10, size, rect, i11, z10, interfaceC0606c0, (Surface) obj);
                return m22337x;
            }
        }, C12747a.m42283d());
    }

    /* renamed from: k */
    public C12015i1 m22345k(InterfaceC0606c0 interfaceC0606c0) {
        C0688q.m3339a();
        m22335h();
        C12015i1 c12015i1 = new C12015i1(this.f17194g.mo2989e(), interfaceC0606c0, this.f17194g.mo2986b(), this.f17194g.mo2987c(), new Runnable() { // from class: g0.f0
            @Override // java.lang.Runnable
            public final void run() {
                C7414n0.this.m22339z();
            }
        });
        try {
            final AbstractC0661r0 m38611j = c12015i1.m38611j();
            if (this.f17200m.m22360v(m38611j, new RunnableC7400g0(this))) {
                InterfaceFutureC5920f<Void> m3230k = this.f17200m.m3230k();
                Objects.requireNonNull(m38611j);
                m3230k.addListener(new Runnable() { // from class: g0.h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC0661r0.this.m3223d();
                    }
                }, C12747a.m42280a());
            }
            this.f17199l = c12015i1;
            m22328B();
            return c12015i1;
        } catch (AbstractC0661r0.a e10) {
            throw new AssertionError("Surface is somehow already closed", e10);
        } catch (RuntimeException e11) {
            c12015i1.m38616y();
            throw e11;
        }
    }

    /* renamed from: l */
    public final void m22346l() {
        C0688q.m3339a();
        m22335h();
        m22336m();
    }

    /* renamed from: n */
    public Rect m22347n() {
        return this.f17191d;
    }

    /* renamed from: o */
    public AbstractC0661r0 m22348o() {
        C0688q.m3339a();
        m22335h();
        m22334g();
        return this.f17200m;
    }

    /* renamed from: p */
    public int m22349p() {
        return this.f17188a;
    }

    /* renamed from: q */
    public boolean m22350q() {
        return this.f17192e;
    }

    /* renamed from: r */
    public int m22351r() {
        return this.f17196i;
    }

    /* renamed from: s */
    public Matrix m22352s() {
        return this.f17189b;
    }

    /* renamed from: t */
    public AbstractC0604b2 m22353t() {
        return this.f17194g;
    }

    /* renamed from: u */
    public int m22354u() {
        return this.f17193f;
    }

    /* renamed from: v */
    public boolean m22355v() {
        return this.f17190c;
    }

    /* renamed from: w */
    public void m22356w() {
        C0688q.m3339a();
        m22335h();
        if (this.f17200m.m22359u()) {
            return;
        }
        m22336m();
        this.f17198k = false;
        this.f17200m = new a(this.f17194g.mo2989e(), this.f17188a);
        Iterator<Runnable> it = this.f17201n.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }
}

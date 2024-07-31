package p148i0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Log;
import android.util.Size;
import androidx.camera.core.AbstractC0718w;
import androidx.camera.core.impl.AbstractC0604b2;
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
import androidx.camera.core.impl.utils.C0689r;
import androidx.core.util.C0984h;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p002a0.C0009f;
import p112g0.C7414n0;
import p112g0.C7427u;
import p112g0.C7430v0;

/* renamed from: i0.d */
/* loaded from: classes.dex */
public class C7762d extends AbstractC0718w {

    /* renamed from: n */
    private final C7764f f18500n;

    /* renamed from: o */
    private final C7765g f18501o;

    /* renamed from: p */
    private C7430v0 f18502p;

    /* renamed from: q */
    private C7430v0 f18503q;

    /* renamed from: r */
    private C7414n0 f18504r;

    /* renamed from: s */
    private C7414n0 f18505s;

    /* renamed from: t */
    C0701y1.b f18506t;

    /* renamed from: i0.d$a */
    /* loaded from: classes.dex */
    interface a {
        /* renamed from: a */
        InterfaceFutureC5920f<Void> mo23681a(int i10, int i11);
    }

    public C7762d(InterfaceC0606c0 interfaceC0606c0, Set<AbstractC0718w> set, InterfaceC0644l2 interfaceC0644l2) {
        super(m23688c0(set));
        this.f18500n = m23688c0(set);
        this.f18501o = new C7765g(interfaceC0606c0, set, interfaceC0644l2, new a() { // from class: i0.c
            @Override // p148i0.C7762d.a
            /* renamed from: a */
            public final InterfaceFutureC5920f mo23681a(int i10, int i11) {
                InterfaceFutureC5920f m23691f0;
                m23691f0 = C7762d.this.m23691f0(i10, i11);
                return m23691f0;
            }
        });
    }

    /* renamed from: X */
    private void m23684X(C0701y1.b bVar, final String str, final InterfaceC0640k2<?> interfaceC0640k2, final AbstractC0604b2 abstractC0604b2) {
        bVar.m3397f(new C0701y1.c() { // from class: i0.b
            @Override // androidx.camera.core.impl.C0701y1.c
            /* renamed from: a */
            public final void mo2550a(C0701y1 c0701y1, C0701y1.f fVar) {
                C7762d.this.m23690e0(str, interfaceC0640k2, abstractC0604b2, c0701y1, fVar);
            }
        });
    }

    /* renamed from: Y */
    private void m23685Y() {
        C7414n0 c7414n0 = this.f18504r;
        if (c7414n0 != null) {
            c7414n0.m22343i();
            this.f18504r = null;
        }
        C7414n0 c7414n02 = this.f18505s;
        if (c7414n02 != null) {
            c7414n02.m22343i();
            this.f18505s = null;
        }
        C7430v0 c7430v0 = this.f18503q;
        if (c7430v0 != null) {
            c7430v0.m22421i();
            this.f18503q = null;
        }
        C7430v0 c7430v02 = this.f18502p;
        if (c7430v02 != null) {
            c7430v02.m22421i();
            this.f18502p = null;
        }
    }

    /* renamed from: Z */
    private C0701y1 m23686Z(String str, InterfaceC0640k2<?> interfaceC0640k2, AbstractC0604b2 abstractC0604b2) {
        C0688q.m3339a();
        InterfaceC0606c0 interfaceC0606c0 = (InterfaceC0606c0) C0984h.m4833k(m3553f());
        Matrix m3563r = m3563r();
        boolean mo3001m = interfaceC0606c0.mo3001m();
        Rect m23687b0 = m23687b0(abstractC0604b2.mo2989e());
        Objects.requireNonNull(m23687b0);
        C7414n0 c7414n0 = new C7414n0(3, 34, abstractC0604b2, m3563r, mo3001m, m23687b0, m3561o(interfaceC0606c0), -1, m3569z(interfaceC0606c0));
        this.f18504r = c7414n0;
        this.f18505s = m23689d0(c7414n0, interfaceC0606c0);
        this.f18503q = new C7430v0(interfaceC0606c0, C7427u.a.m22407a(abstractC0604b2.mo2986b()));
        Map<AbstractC0718w, C7430v0.d> m23715w = this.f18501o.m23715w(this.f18505s);
        C7430v0.c m22423m = this.f18503q.m22423m(C7430v0.b.m22425c(this.f18505s, new ArrayList(m23715w.values())));
        HashMap hashMap = new HashMap();
        for (Map.Entry<AbstractC0718w, C7430v0.d> entry : m23715w.entrySet()) {
            hashMap.put(entry.getKey(), m22423m.get(entry.getValue()));
        }
        this.f18501o.m23710G(hashMap);
        C0701y1.b m3391p = C0701y1.b.m3391p(interfaceC0640k2, abstractC0604b2.mo2989e());
        m3391p.m3403l(this.f18504r.m22348o());
        m3391p.m3401j(this.f18501o.m23716y());
        if (abstractC0604b2.mo2988d() != null) {
            m3391p.m3398g(abstractC0604b2.mo2988d());
        }
        m23684X(m3391p, str, interfaceC0640k2, abstractC0604b2);
        this.f18506t = m3391p;
        return m3391p.m3406o();
    }

    /* renamed from: b0 */
    private Rect m23687b0(Size size) {
        return m3566w() != null ? m3566w() : new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    /* renamed from: c0 */
    private static C7764f m23688c0(Set<AbstractC0718w> set) {
        InterfaceC0643l1 mo2932a = new C7763e().mo2932a();
        mo2932a.mo3178r(InterfaceC0615e1.f2794f, 34);
        mo2932a.mo3178r(InterfaceC0640k2.f2864A, InterfaceC0644l2.b.STREAM_SHARING);
        ArrayList arrayList = new ArrayList();
        for (AbstractC0718w abstractC0718w : set) {
            if (abstractC0718w.m3556i().mo3192b(InterfaceC0640k2.f2864A)) {
                arrayList.add(abstractC0718w.m3556i().mo2588N());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        mo2932a.mo3178r(C7764f.f18508H, arrayList);
        mo2932a.mo3178r(InterfaceC0619f1.f2803k, 2);
        return new C7764f(C0656p1.m3211Y(mo2932a));
    }

    /* renamed from: d0 */
    private C7414n0 m23689d0(C7414n0 c7414n0, InterfaceC0606c0 interfaceC0606c0) {
        if (m3557k() == null) {
            return c7414n0;
        }
        this.f18502p = new C7430v0(interfaceC0606c0, m3557k().m38623a());
        C7430v0.d m22426h = C7430v0.d.m22426h(c7414n0.m22354u(), c7414n0.m22349p(), c7414n0.m22347n(), C0689r.m3346d(c7414n0.m22347n(), 0), 0, false);
        C7414n0 c7414n02 = this.f18502p.m22423m(C7430v0.b.m22425c(c7414n0, Collections.singletonList(m22426h))).get(m22426h);
        Objects.requireNonNull(c7414n02);
        return c7414n02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ void m23690e0(String str, InterfaceC0640k2 interfaceC0640k2, AbstractC0604b2 abstractC0604b2, C0701y1 c0701y1, C0701y1.f fVar) {
        m23685Y();
        if (m3567x(str)) {
            m3546S(m23686Z(str, interfaceC0640k2, abstractC0604b2));
            m3541D();
            this.f18501o.m23709E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public /* synthetic */ InterfaceFutureC5920f m23691f0(int i10, int i11) {
        C7430v0 c7430v0 = this.f18503q;
        return c7430v0 != null ? c7430v0.m22420e().mo22372c(i10, i11) : C0009f.m20f(new Exception("Failed to take picture: pipeline is not ready."));
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: F */
    public void mo2911F() {
        super.mo2911F();
        this.f18501o.m23712o();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.camera.core.impl.k2, androidx.camera.core.impl.k2<?>] */
    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: H */
    protected InterfaceC0640k2<?> mo2912H(InterfaceC0602b0 interfaceC0602b0, InterfaceC0640k2.a<?, ?, ?> aVar) {
        this.f18501o.m23706B(aVar.mo2932a());
        return aVar.mo2933b();
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: I */
    public void mo3543I() {
        super.mo3543I();
        this.f18501o.m23707C();
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: J */
    public void mo3452J() {
        super.mo3452J();
        this.f18501o.m23708D();
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: K */
    protected AbstractC0604b2 mo2913K(InterfaceC0649n0 interfaceC0649n0) {
        this.f18506t.m3398g(interfaceC0649n0);
        m3546S(this.f18506t.m3406o());
        return m3551d().mo2990f().mo2994d(interfaceC0649n0).mo2991a();
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: L */
    protected AbstractC0604b2 mo2914L(AbstractC0604b2 abstractC0604b2) {
        m3546S(m23686Z(m3555h(), m3556i(), abstractC0604b2));
        m3539B();
        return abstractC0604b2;
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: M */
    public void mo2915M() {
        super.mo2915M();
        m23685Y();
        this.f18501o.m23711H();
    }

    /* renamed from: a0 */
    public Set<AbstractC0718w> m23692a0() {
        return this.f18501o.m23714v();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.camera.core.impl.k2, androidx.camera.core.impl.k2<?>] */
    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: j */
    public InterfaceC0640k2<?> mo2926j(boolean z10, InterfaceC0644l2 interfaceC0644l2) {
        InterfaceC0649n0 mo2542a = interfaceC0644l2.mo2542a(this.f18500n.mo2588N(), 1);
        if (z10) {
            mo2542a = InterfaceC0649n0.m3189O(mo2542a, this.f18500n.mo2589m());
        }
        if (mo2542a == null) {
            return null;
        }
        return mo2928v(mo2542a).mo2933b();
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: t */
    public Set<Integer> mo3460t() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // androidx.camera.core.AbstractC0718w
    /* renamed from: v */
    public InterfaceC0640k2.a<?, ?, ?> mo2928v(InterfaceC0649n0 interfaceC0649n0) {
        return new C7763e(C0647m1.m3185b0(interfaceC0649n0));
    }
}

package p148i0;

import androidx.camera.core.AbstractC0718w;
import androidx.camera.core.C0709n;
import androidx.camera.core.C0714s;
import androidx.camera.core.impl.AbstractC0637k;
import androidx.camera.core.impl.AbstractC0661r0;
import androidx.camera.core.impl.C0701y1;
import androidx.camera.core.impl.InterfaceC0602b0;
import androidx.camera.core.impl.InterfaceC0606c0;
import androidx.camera.core.impl.InterfaceC0619f1;
import androidx.camera.core.impl.InterfaceC0640k2;
import androidx.camera.core.impl.InterfaceC0643l1;
import androidx.camera.core.impl.InterfaceC0644l2;
import androidx.camera.core.impl.InterfaceC0663s;
import androidx.camera.core.impl.InterfaceC0699y;
import androidx.camera.core.impl.utils.C0688q;
import androidx.camera.core.impl.utils.C0689r;
import androidx.core.util.C0984h;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p112g0.C7414n0;
import p112g0.C7430v0;
import p148i0.C7762d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i0.g */
/* loaded from: classes.dex */
public class C7765g implements InterfaceC0606c0 {

    /* renamed from: a */
    final Set<AbstractC0718w> f18510a;

    /* renamed from: d */
    private final InterfaceC0644l2 f18513d;

    /* renamed from: e */
    private final InterfaceC0606c0 f18514e;

    /* renamed from: r */
    private final C7767i f18516r;

    /* renamed from: b */
    final Map<AbstractC0718w, C7414n0> f18511b = new HashMap();

    /* renamed from: c */
    final Map<AbstractC0718w, Boolean> f18512c = new HashMap();

    /* renamed from: f */
    private final AbstractC0637k f18515f = m23713p();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0.g$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC0637k {
        a() {
        }

        @Override // androidx.camera.core.impl.AbstractC0637k
        /* renamed from: b */
        public void mo2411b(InterfaceC0663s interfaceC0663s) {
            super.mo2411b(interfaceC0663s);
            Iterator<AbstractC0718w> it = C7765g.this.f18510a.iterator();
            while (it.hasNext()) {
                C7765g.m23698F(interfaceC0663s, it.next().m3564s());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7765g(InterfaceC0606c0 interfaceC0606c0, Set<AbstractC0718w> set, InterfaceC0644l2 interfaceC0644l2, C7762d.a aVar) {
        this.f18514e = interfaceC0606c0;
        this.f18513d = interfaceC0644l2;
        this.f18510a = set;
        this.f18516r = new C7767i(interfaceC0606c0.mo2489d(), aVar);
        Iterator<AbstractC0718w> it = set.iterator();
        while (it.hasNext()) {
            this.f18512c.put(it.next(), Boolean.FALSE);
        }
    }

    /* renamed from: A */
    private boolean m23697A(AbstractC0718w abstractC0718w) {
        Boolean bool = this.f18512c.get(abstractC0718w);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    /* renamed from: F */
    static void m23698F(InterfaceC0663s interfaceC0663s, C0701y1 c0701y1) {
        Iterator<AbstractC0637k> it = c0701y1.m3385g().iterator();
        while (it.hasNext()) {
            it.next().mo2411b(new C7766h(c0701y1.m3386h().m3155g(), interfaceC0663s));
        }
    }

    /* renamed from: q */
    private void m23699q(C7414n0 c7414n0, AbstractC0661r0 abstractC0661r0, C0701y1 c0701y1) {
        c7414n0.m22356w();
        try {
            c7414n0.m22340C(abstractC0661r0);
        } catch (AbstractC0661r0.a unused) {
            Iterator<C0701y1.c> it = c0701y1.m3381c().iterator();
            while (it.hasNext()) {
                it.next().mo2550a(c0701y1, C0701y1.f.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    /* renamed from: r */
    private static int m23700r(AbstractC0718w abstractC0718w) {
        if (abstractC0718w instanceof C0709n) {
            return RecognitionOptions.QR_CODE;
        }
        return 34;
    }

    /* renamed from: s */
    private int m23701s(AbstractC0718w abstractC0718w) {
        if (abstractC0718w instanceof C0714s) {
            return this.f18514e.mo2999b().mo2565i(((C0714s) abstractC0718w).m3513c0());
        }
        return 0;
    }

    /* renamed from: t */
    static AbstractC0661r0 m23702t(AbstractC0718w abstractC0718w) {
        boolean z10 = abstractC0718w instanceof C0709n;
        C0701y1 m3564s = abstractC0718w.m3564s();
        List<AbstractC0661r0> m3389k = z10 ? m3564s.m3389k() : m3564s.m3386h().m3154f();
        C0984h.m4835m(m3389k.size() <= 1);
        if (m3389k.size() == 1) {
            return m3389k.get(0);
        }
        return null;
    }

    /* renamed from: u */
    private static int m23703u(AbstractC0718w abstractC0718w) {
        if (abstractC0718w instanceof C0714s) {
            return 1;
        }
        return abstractC0718w instanceof C0709n ? 4 : 2;
    }

    /* renamed from: x */
    private static int m23704x(Set<InterfaceC0640k2<?>> set) {
        Iterator<InterfaceC0640k2<?>> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 = Math.max(i10, it.next().m3142L());
        }
        return i10;
    }

    /* renamed from: z */
    private C7414n0 m23705z(AbstractC0718w abstractC0718w) {
        C7414n0 c7414n0 = this.f18511b.get(abstractC0718w);
        Objects.requireNonNull(c7414n0);
        return c7414n0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m23706B(InterfaceC0643l1 interfaceC0643l1) {
        HashSet hashSet = new HashSet();
        for (AbstractC0718w abstractC0718w : this.f18510a) {
            hashSet.add(abstractC0718w.m3538A(this.f18514e.mo2495i(), null, abstractC0718w.mo2926j(true, this.f18513d)));
        }
        interfaceC0643l1.mo3178r(InterfaceC0619f1.f2809q, C7759a.m23680a(new ArrayList(this.f18514e.mo2495i().mo2563f(34)), C0689r.m3351i(this.f18514e.mo2489d().mo2728e()), hashSet));
        interfaceC0643l1.mo3178r(InterfaceC0640k2.f2869v, Integer.valueOf(m23704x(hashSet)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void m23707C() {
        Iterator<AbstractC0718w> it = this.f18510a.iterator();
        while (it.hasNext()) {
            it.next().mo3543I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m23708D() {
        Iterator<AbstractC0718w> it = this.f18510a.iterator();
        while (it.hasNext()) {
            it.next().mo3452J();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m23709E() {
        C0688q.m3339a();
        Iterator<AbstractC0718w> it = this.f18510a.iterator();
        while (it.hasNext()) {
            mo2497k(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m23710G(Map<AbstractC0718w, C7414n0> map) {
        this.f18511b.clear();
        this.f18511b.putAll(map);
        for (Map.Entry<AbstractC0718w, C7414n0> entry : this.f18511b.entrySet()) {
            AbstractC0718w key = entry.getKey();
            C7414n0 value = entry.getValue();
            key.mo2917Q(value.m22347n());
            key.mo2916P(value.m22352s());
            key.m3547T(value.m22353t());
            key.m3542E();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m23711H() {
        Iterator<AbstractC0718w> it = this.f18510a.iterator();
        while (it.hasNext()) {
            it.next().m3545R(this);
        }
    }

    @Override // androidx.camera.core.AbstractC0718w.d
    /* renamed from: c */
    public void mo2488c(AbstractC0718w abstractC0718w) {
        C0688q.m3339a();
        if (m23697A(abstractC0718w)) {
            return;
        }
        this.f18512c.put(abstractC0718w, Boolean.TRUE);
        AbstractC0661r0 m23702t = m23702t(abstractC0718w);
        if (m23702t != null) {
            m23699q(m23705z(abstractC0718w), m23702t, abstractC0718w.m3564s());
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0606c0
    /* renamed from: d */
    public InterfaceC0699y mo2489d() {
        return this.f18516r;
    }

    @Override // androidx.camera.core.impl.InterfaceC0606c0
    /* renamed from: g */
    public void mo2492g(Collection<AbstractC0718w> collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.InterfaceC0606c0
    /* renamed from: h */
    public void mo2493h(Collection<AbstractC0718w> collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.InterfaceC0606c0
    /* renamed from: i */
    public InterfaceC0602b0 mo2495i() {
        return this.f18514e.mo2495i();
    }

    @Override // androidx.camera.core.AbstractC0718w.d
    /* renamed from: k */
    public void mo2497k(AbstractC0718w abstractC0718w) {
        AbstractC0661r0 m23702t;
        C0688q.m3339a();
        C7414n0 m23705z = m23705z(abstractC0718w);
        m23705z.m22356w();
        if (m23697A(abstractC0718w) && (m23702t = m23702t(abstractC0718w)) != null) {
            m23699q(m23705z, m23702t, abstractC0718w.m3564s());
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0606c0
    /* renamed from: m */
    public boolean mo3001m() {
        return false;
    }

    @Override // androidx.camera.core.AbstractC0718w.d
    /* renamed from: n */
    public void mo2501n(AbstractC0718w abstractC0718w) {
        C0688q.m3339a();
        if (m23697A(abstractC0718w)) {
            this.f18512c.put(abstractC0718w, Boolean.FALSE);
            m23705z(abstractC0718w).m22346l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m23712o() {
        for (AbstractC0718w abstractC0718w : this.f18510a) {
            abstractC0718w.m3549b(this, null, abstractC0718w.mo2926j(true, this.f18513d));
        }
    }

    /* renamed from: p */
    AbstractC0637k m23713p() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public Set<AbstractC0718w> m23714v() {
        return this.f18510a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public Map<AbstractC0718w, C7430v0.d> m23715w(C7414n0 c7414n0) {
        HashMap hashMap = new HashMap();
        for (AbstractC0718w abstractC0718w : this.f18510a) {
            int m23701s = m23701s(abstractC0718w);
            hashMap.put(abstractC0718w, C7430v0.d.m22426h(m23703u(abstractC0718w), m23700r(abstractC0718w), c7414n0.m22347n(), C0689r.m3346d(c7414n0.m22347n(), m23701s), m23701s, abstractC0718w.m3569z(this)));
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public AbstractC0637k m23716y() {
        return this.f18515f;
    }
}

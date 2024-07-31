package i0;

import androidx.camera.core.impl.b0;
import androidx.camera.core.impl.c0;
import androidx.camera.core.impl.f1;
import androidx.camera.core.impl.k;
import androidx.camera.core.impl.k2;
import androidx.camera.core.impl.l1;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.r0;
import androidx.camera.core.impl.s;
import androidx.camera.core.impl.utils.q;
import androidx.camera.core.impl.utils.r;
import androidx.camera.core.impl.y;
import androidx.camera.core.impl.y1;
import androidx.camera.core.n;
import androidx.camera.core.w;
import com.google.android.libraries.barhopper.RecognitionOptions;
import g0.n0;
import g0.v0;
import i0.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public class g implements c0 {

    /* renamed from: a */
    final Set<w> f16858a;

    /* renamed from: d */
    private final l2 f16861d;

    /* renamed from: e */
    private final c0 f16862e;

    /* renamed from: r */
    private final i f16864r;

    /* renamed from: b */
    final Map<w, n0> f16859b = new HashMap();

    /* renamed from: c */
    final Map<w, Boolean> f16860c = new HashMap();

    /* renamed from: f */
    private final k f16863f = p();

    /* loaded from: classes.dex */
    public class a extends k {
        a() {
        }

        @Override // androidx.camera.core.impl.k
        public void b(s sVar) {
            super.b(sVar);
            Iterator<w> it = g.this.f16858a.iterator();
            while (it.hasNext()) {
                g.F(sVar, it.next().s());
            }
        }
    }

    public g(c0 c0Var, Set<w> set, l2 l2Var, d.a aVar) {
        this.f16862e = c0Var;
        this.f16861d = l2Var;
        this.f16858a = set;
        this.f16864r = new i(c0Var.d(), aVar);
        Iterator<w> it = set.iterator();
        while (it.hasNext()) {
            this.f16860c.put(it.next(), Boolean.FALSE);
        }
    }

    private boolean A(w wVar) {
        Boolean bool = this.f16860c.get(wVar);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    static void F(s sVar, y1 y1Var) {
        Iterator<k> it = y1Var.g().iterator();
        while (it.hasNext()) {
            it.next().b(new h(y1Var.h().g(), sVar));
        }
    }

    private void q(n0 n0Var, r0 r0Var, y1 y1Var) {
        n0Var.w();
        try {
            n0Var.C(r0Var);
        } catch (r0.a unused) {
            Iterator<y1.c> it = y1Var.c().iterator();
            while (it.hasNext()) {
                it.next().a(y1Var, y1.f.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    private static int r(w wVar) {
        if (wVar instanceof n) {
            return RecognitionOptions.QR_CODE;
        }
        return 34;
    }

    private int s(w wVar) {
        if (wVar instanceof androidx.camera.core.s) {
            return this.f16862e.b().i(((androidx.camera.core.s) wVar).c0());
        }
        return 0;
    }

    static r0 t(w wVar) {
        boolean z10 = wVar instanceof n;
        y1 s10 = wVar.s();
        List<r0> k10 = z10 ? s10.k() : s10.h().f();
        androidx.core.util.h.m(k10.size() <= 1);
        if (k10.size() == 1) {
            return k10.get(0);
        }
        return null;
    }

    private static int u(w wVar) {
        if (wVar instanceof androidx.camera.core.s) {
            return 1;
        }
        return wVar instanceof n ? 4 : 2;
    }

    private static int x(Set<k2<?>> set) {
        Iterator<k2<?>> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 = Math.max(i10, it.next().L());
        }
        return i10;
    }

    private n0 z(w wVar) {
        n0 n0Var = this.f16859b.get(wVar);
        Objects.requireNonNull(n0Var);
        return n0Var;
    }

    public void B(l1 l1Var) {
        HashSet hashSet = new HashSet();
        for (w wVar : this.f16858a) {
            hashSet.add(wVar.A(this.f16862e.i(), null, wVar.j(true, this.f16861d)));
        }
        l1Var.r(f1.f2471q, i0.a.a(new ArrayList(this.f16862e.i().f(34)), r.i(this.f16862e.d().e()), hashSet));
        l1Var.r(k2.f2530v, Integer.valueOf(x(hashSet)));
    }

    public void C() {
        Iterator<w> it = this.f16858a.iterator();
        while (it.hasNext()) {
            it.next().I();
        }
    }

    public void D() {
        Iterator<w> it = this.f16858a.iterator();
        while (it.hasNext()) {
            it.next().J();
        }
    }

    public void E() {
        q.a();
        Iterator<w> it = this.f16858a.iterator();
        while (it.hasNext()) {
            k(it.next());
        }
    }

    public void G(Map<w, n0> map) {
        this.f16859b.clear();
        this.f16859b.putAll(map);
        for (Map.Entry<w, n0> entry : this.f16859b.entrySet()) {
            w key = entry.getKey();
            n0 value = entry.getValue();
            key.Q(value.n());
            key.P(value.s());
            key.T(value.t());
            key.E();
        }
    }

    public void H() {
        Iterator<w> it = this.f16858a.iterator();
        while (it.hasNext()) {
            it.next().R(this);
        }
    }

    @Override // androidx.camera.core.w.d
    public void c(w wVar) {
        q.a();
        if (A(wVar)) {
            return;
        }
        this.f16860c.put(wVar, Boolean.TRUE);
        r0 t10 = t(wVar);
        if (t10 != null) {
            q(z(wVar), t10, wVar.s());
        }
    }

    @Override // androidx.camera.core.impl.c0
    public y d() {
        return this.f16864r;
    }

    @Override // androidx.camera.core.impl.c0
    public void g(Collection<w> collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.c0
    public void h(Collection<w> collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.c0
    public b0 i() {
        return this.f16862e.i();
    }

    @Override // androidx.camera.core.w.d
    public void k(w wVar) {
        r0 t10;
        q.a();
        n0 z10 = z(wVar);
        z10.w();
        if (A(wVar) && (t10 = t(wVar)) != null) {
            q(z10, t10, wVar.s());
        }
    }

    @Override // androidx.camera.core.impl.c0
    public boolean m() {
        return false;
    }

    @Override // androidx.camera.core.w.d
    public void n(w wVar) {
        q.a();
        if (A(wVar)) {
            this.f16860c.put(wVar, Boolean.FALSE);
            z(wVar).l();
        }
    }

    public void o() {
        for (w wVar : this.f16858a) {
            wVar.b(this, null, wVar.j(true, this.f16861d));
        }
    }

    k p() {
        return new a();
    }

    public Set<w> v() {
        return this.f16858a;
    }

    public Map<w, v0.d> w(n0 n0Var) {
        HashMap hashMap = new HashMap();
        for (w wVar : this.f16858a) {
            int s10 = s(wVar);
            hashMap.put(wVar, v0.d.h(u(wVar), r(wVar), n0Var.n(), r.d(n0Var.n(), s10), s10, wVar.z(this)));
        }
        return hashMap;
    }

    public k y() {
        return this.f16863f;
    }
}

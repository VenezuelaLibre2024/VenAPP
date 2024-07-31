package i0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Log;
import android.util.Size;
import androidx.camera.core.impl.b0;
import androidx.camera.core.impl.b2;
import androidx.camera.core.impl.c0;
import androidx.camera.core.impl.e1;
import androidx.camera.core.impl.f1;
import androidx.camera.core.impl.k2;
import androidx.camera.core.impl.l1;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.m1;
import androidx.camera.core.impl.p1;
import androidx.camera.core.impl.utils.q;
import androidx.camera.core.impl.utils.r;
import androidx.camera.core.impl.y1;
import androidx.camera.core.w;
import g0.n0;
import g0.u;
import g0.v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public class d extends w {

    /* renamed from: n, reason: collision with root package name */
    private final f f16850n;

    /* renamed from: o, reason: collision with root package name */
    private final g f16851o;

    /* renamed from: p, reason: collision with root package name */
    private v0 f16852p;

    /* renamed from: q, reason: collision with root package name */
    private v0 f16853q;

    /* renamed from: r, reason: collision with root package name */
    private n0 f16854r;

    /* renamed from: s, reason: collision with root package name */
    private n0 f16855s;

    /* renamed from: t, reason: collision with root package name */
    y1.b f16856t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        com.google.common.util.concurrent.f<Void> a(int i10, int i11);
    }

    public d(c0 c0Var, Set<w> set, l2 l2Var) {
        super(c0(set));
        this.f16850n = c0(set);
        this.f16851o = new g(c0Var, set, l2Var, new a() { // from class: i0.c
            @Override // i0.d.a
            public final com.google.common.util.concurrent.f a(int i10, int i11) {
                com.google.common.util.concurrent.f f02;
                f02 = d.this.f0(i10, i11);
                return f02;
            }
        });
    }

    private void X(y1.b bVar, final String str, final k2<?> k2Var, final b2 b2Var) {
        bVar.f(new y1.c() { // from class: i0.b
            @Override // androidx.camera.core.impl.y1.c
            public final void a(y1 y1Var, y1.f fVar) {
                d.this.e0(str, k2Var, b2Var, y1Var, fVar);
            }
        });
    }

    private void Y() {
        n0 n0Var = this.f16854r;
        if (n0Var != null) {
            n0Var.i();
            this.f16854r = null;
        }
        n0 n0Var2 = this.f16855s;
        if (n0Var2 != null) {
            n0Var2.i();
            this.f16855s = null;
        }
        v0 v0Var = this.f16853q;
        if (v0Var != null) {
            v0Var.i();
            this.f16853q = null;
        }
        v0 v0Var2 = this.f16852p;
        if (v0Var2 != null) {
            v0Var2.i();
            this.f16852p = null;
        }
    }

    private y1 Z(String str, k2<?> k2Var, b2 b2Var) {
        q.a();
        c0 c0Var = (c0) androidx.core.util.h.k(f());
        Matrix r10 = r();
        boolean m10 = c0Var.m();
        Rect b02 = b0(b2Var.e());
        Objects.requireNonNull(b02);
        n0 n0Var = new n0(3, 34, b2Var, r10, m10, b02, o(c0Var), -1, z(c0Var));
        this.f16854r = n0Var;
        this.f16855s = d0(n0Var, c0Var);
        this.f16853q = new v0(c0Var, u.a.a(b2Var.b()));
        Map<w, v0.d> w10 = this.f16851o.w(this.f16855s);
        v0.c m11 = this.f16853q.m(v0.b.c(this.f16855s, new ArrayList(w10.values())));
        HashMap hashMap = new HashMap();
        for (Map.Entry<w, v0.d> entry : w10.entrySet()) {
            hashMap.put(entry.getKey(), m11.get(entry.getValue()));
        }
        this.f16851o.G(hashMap);
        y1.b p10 = y1.b.p(k2Var, b2Var.e());
        p10.l(this.f16854r.o());
        p10.j(this.f16851o.y());
        if (b2Var.d() != null) {
            p10.g(b2Var.d());
        }
        X(p10, str, k2Var, b2Var);
        this.f16856t = p10;
        return p10.o();
    }

    private Rect b0(Size size) {
        return w() != null ? w() : new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    private static f c0(Set<w> set) {
        l1 a10 = new e().a();
        a10.r(e1.f2456f, 34);
        a10.r(k2.A, l2.b.STREAM_SHARING);
        ArrayList arrayList = new ArrayList();
        for (w wVar : set) {
            if (wVar.i().b(k2.A)) {
                arrayList.add(wVar.i().N());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        a10.r(f.H, arrayList);
        a10.r(f1.f2465k, 2);
        return new f(p1.Y(a10));
    }

    private n0 d0(n0 n0Var, c0 c0Var) {
        if (k() == null) {
            return n0Var;
        }
        this.f16852p = new v0(c0Var, k().a());
        v0.d h10 = v0.d.h(n0Var.u(), n0Var.p(), n0Var.n(), r.d(n0Var.n(), 0), 0, false);
        n0 n0Var2 = this.f16852p.m(v0.b.c(n0Var, Collections.singletonList(h10))).get(h10);
        Objects.requireNonNull(n0Var2);
        return n0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e0(String str, k2 k2Var, b2 b2Var, y1 y1Var, y1.f fVar) {
        Y();
        if (x(str)) {
            S(Z(str, k2Var, b2Var));
            D();
            this.f16851o.E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.google.common.util.concurrent.f f0(int i10, int i11) {
        v0 v0Var = this.f16853q;
        return v0Var != null ? v0Var.e().c(i10, i11) : a0.f.f(new Exception("Failed to take picture: pipeline is not ready."));
    }

    @Override // androidx.camera.core.w
    public void F() {
        super.F();
        this.f16851o.o();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.camera.core.impl.k2, androidx.camera.core.impl.k2<?>] */
    @Override // androidx.camera.core.w
    protected k2<?> H(b0 b0Var, k2.a<?, ?, ?> aVar) {
        this.f16851o.B(aVar.a());
        return aVar.b();
    }

    @Override // androidx.camera.core.w
    public void I() {
        super.I();
        this.f16851o.C();
    }

    @Override // androidx.camera.core.w
    public void J() {
        super.J();
        this.f16851o.D();
    }

    @Override // androidx.camera.core.w
    protected b2 K(androidx.camera.core.impl.n0 n0Var) {
        this.f16856t.g(n0Var);
        S(this.f16856t.o());
        return d().f().d(n0Var).a();
    }

    @Override // androidx.camera.core.w
    protected b2 L(b2 b2Var) {
        S(Z(h(), i(), b2Var));
        B();
        return b2Var;
    }

    @Override // androidx.camera.core.w
    public void M() {
        super.M();
        Y();
        this.f16851o.H();
    }

    public Set<w> a0() {
        return this.f16851o.v();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.camera.core.impl.k2, androidx.camera.core.impl.k2<?>] */
    @Override // androidx.camera.core.w
    public k2<?> j(boolean z10, l2 l2Var) {
        androidx.camera.core.impl.n0 a10 = l2Var.a(this.f16850n.N(), 1);
        if (z10) {
            a10 = androidx.camera.core.impl.n0.O(a10, this.f16850n.m());
        }
        if (a10 == null) {
            return null;
        }
        return v(a10).b();
    }

    @Override // androidx.camera.core.w
    public Set<Integer> t() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // androidx.camera.core.w
    public k2.a<?, ?, ?> v(androidx.camera.core.impl.n0 n0Var) {
        return new e(m1.b0(n0Var));
    }
}

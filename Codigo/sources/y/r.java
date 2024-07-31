package y;

import android.util.Size;
import androidx.camera.core.e;
import androidx.camera.core.impl.d1;
import androidx.camera.core.impl.l0;
import androidx.camera.core.impl.y1;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import y.o;

/* loaded from: classes.dex */
public class r {

    /* renamed from: g, reason: collision with root package name */
    static final e0.b f31551g = new e0.b();

    /* renamed from: a, reason: collision with root package name */
    private final d1 f31552a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.camera.core.impl.l0 f31553b;

    /* renamed from: c, reason: collision with root package name */
    private final o f31554c;

    /* renamed from: d, reason: collision with root package name */
    private final m0 f31555d;

    /* renamed from: e, reason: collision with root package name */
    private final e0 f31556e;

    /* renamed from: f, reason: collision with root package name */
    private final o.b f31557f;

    public r(d1 d1Var, Size size, w.k kVar, boolean z10) {
        androidx.camera.core.impl.utils.q.a();
        this.f31552a = d1Var;
        this.f31553b = l0.a.j(d1Var).h();
        o oVar = new o();
        this.f31554c = oVar;
        m0 m0Var = new m0();
        this.f31555d = m0Var;
        Executor b02 = d1Var.b0(z.a.c());
        Objects.requireNonNull(b02);
        e0 e0Var = new e0(b02, kVar != null ? new g0.z(kVar) : null);
        this.f31556e = e0Var;
        o.b j10 = o.b.j(size, d1Var.n(), i(), z10, d1Var.a0());
        this.f31557f = j10;
        e0Var.q(m0Var.f(oVar.n(j10)));
    }

    private j b(androidx.camera.core.impl.k0 k0Var, v0 v0Var, n0 n0Var) {
        ArrayList arrayList = new ArrayList();
        String valueOf = String.valueOf(k0Var.hashCode());
        List<androidx.camera.core.impl.m0> a10 = k0Var.a();
        Objects.requireNonNull(a10);
        for (androidx.camera.core.impl.m0 m0Var : a10) {
            l0.a aVar = new l0.a();
            aVar.r(this.f31553b.h());
            aVar.e(this.f31553b.e());
            aVar.a(v0Var.n());
            aVar.f(this.f31557f.h());
            if (this.f31557f.d() == 256) {
                if (f31551g.a()) {
                    aVar.d(androidx.camera.core.impl.l0.f2536i, Integer.valueOf(v0Var.l()));
                }
                aVar.d(androidx.camera.core.impl.l0.f2537j, Integer.valueOf(g(v0Var)));
            }
            aVar.e(m0Var.a().e());
            aVar.g(valueOf, Integer.valueOf(m0Var.getId()));
            aVar.c(this.f31557f.a());
            arrayList.add(aVar.h());
        }
        return new j(arrayList, n0Var);
    }

    private androidx.camera.core.impl.k0 c() {
        androidx.camera.core.impl.k0 W = this.f31552a.W(w.x.b());
        Objects.requireNonNull(W);
        return W;
    }

    private f0 d(androidx.camera.core.impl.k0 k0Var, v0 v0Var, n0 n0Var, com.google.common.util.concurrent.f<Void> fVar) {
        return new f0(k0Var, v0Var.k(), v0Var.g(), v0Var.l(), v0Var.i(), v0Var.m(), n0Var, fVar);
    }

    private int i() {
        Integer num = (Integer) this.f31552a.g(d1.K, null);
        return num != null ? num.intValue() : RecognitionOptions.QR_CODE;
    }

    public void a() {
        androidx.camera.core.impl.utils.q.a();
        this.f31554c.j();
        this.f31555d.d();
        this.f31556e.o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.core.util.d<j, f0> e(v0 v0Var, n0 n0Var, com.google.common.util.concurrent.f<Void> fVar) {
        androidx.camera.core.impl.utils.q.a();
        androidx.camera.core.impl.k0 c10 = c();
        return new androidx.core.util.d<>(b(c10, v0Var, n0Var), d(c10, v0Var, n0Var, fVar));
    }

    public y1.b f(Size size) {
        y1.b p10 = y1.b.p(this.f31552a, size);
        p10.h(this.f31557f.h());
        return p10;
    }

    int g(v0 v0Var) {
        return ((v0Var.j() != null) && androidx.camera.core.impl.utils.r.e(v0Var.g(), this.f31557f.g())) ? v0Var.f() == 0 ? 100 : 95 : v0Var.i();
    }

    public int h() {
        androidx.camera.core.impl.utils.q.a();
        return this.f31554c.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(w.g0 g0Var) {
        androidx.camera.core.impl.utils.q.a();
        this.f31557f.b().accept(g0Var);
    }

    public void k(e.a aVar) {
        androidx.camera.core.impl.utils.q.a();
        this.f31554c.m(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(f0 f0Var) {
        androidx.camera.core.impl.utils.q.a();
        this.f31557f.f().accept(f0Var);
    }
}

package y;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.n;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    private int f31572a = new e0.a().a();

    /* loaded from: classes.dex */
    interface a {
        void b(v0 v0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(w.g0 g0Var) {
        boolean z10 = h() != null;
        boolean z11 = j() != null;
        if (z10 && !z11) {
            n.e h10 = h();
            Objects.requireNonNull(h10);
            h10.b(g0Var);
        } else {
            if (!z11 || z10) {
                throw new IllegalStateException("One and only one callback is allowed.");
            }
            n.f j10 = j();
            Objects.requireNonNull(j10);
            j10.a(g0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(n.h hVar) {
        n.f j10 = j();
        Objects.requireNonNull(j10);
        Objects.requireNonNull(hVar);
        j10.b(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(androidx.camera.core.o oVar) {
        n.e h10 = h();
        Objects.requireNonNull(h10);
        Objects.requireNonNull(oVar);
        h10.a(oVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        androidx.camera.core.impl.utils.q.a();
        int i10 = this.f31572a;
        if (i10 <= 0) {
            return false;
        }
        this.f31572a = i10 - 1;
        return true;
    }

    abstract Executor e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int f();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Rect g();

    abstract n.e h();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int i();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract n.f j();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract n.g k();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int l();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Matrix m();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract List<androidx.camera.core.impl.k> n();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(final w.g0 g0Var) {
        e().execute(new Runnable() { // from class: y.s0
            @Override // java.lang.Runnable
            public final void run() {
                v0.this.o(g0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(final n.h hVar) {
        e().execute(new Runnable() { // from class: y.t0
            @Override // java.lang.Runnable
            public final void run() {
                v0.this.p(hVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(final androidx.camera.core.o oVar) {
        e().execute(new Runnable() { // from class: y.u0
            @Override // java.lang.Runnable
            public final void run() {
                v0.this.q(oVar);
            }
        });
    }
}

package y;

import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.f2;
import androidx.camera.core.impl.g1;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class x implements g1 {

    /* renamed from: a, reason: collision with root package name */
    private final g1 f31575a;

    /* renamed from: b, reason: collision with root package name */
    private f0 f31576b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(g1 g1Var) {
        this.f31575a = g1Var;
    }

    private androidx.camera.core.o i(androidx.camera.core.o oVar) {
        if (oVar == null) {
            return null;
        }
        androidx.core.util.h.n(this.f31576b != null, "Pending request should not be null");
        f2 a10 = f2.a(new Pair(this.f31576b.h(), this.f31576b.g().get(0)));
        this.f31576b = null;
        return new androidx.camera.core.u(oVar, new Size(oVar.getWidth(), oVar.getHeight()), new b0.b(new i0.h(a10, oVar.e1().c())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(g1.a aVar, g1 g1Var) {
        aVar.a(this);
    }

    @Override // androidx.camera.core.impl.g1
    public androidx.camera.core.o b() {
        return i(this.f31575a.b());
    }

    @Override // androidx.camera.core.impl.g1
    public int c() {
        return this.f31575a.c();
    }

    @Override // androidx.camera.core.impl.g1
    public void close() {
        this.f31575a.close();
    }

    @Override // androidx.camera.core.impl.g1
    public void d() {
        this.f31575a.d();
    }

    @Override // androidx.camera.core.impl.g1
    public int e() {
        return this.f31575a.e();
    }

    @Override // androidx.camera.core.impl.g1
    public void f(final g1.a aVar, Executor executor) {
        this.f31575a.f(new g1.a() { // from class: y.w
            @Override // androidx.camera.core.impl.g1.a
            public final void a(g1 g1Var) {
                x.this.j(aVar, g1Var);
            }
        }, executor);
    }

    @Override // androidx.camera.core.impl.g1
    public androidx.camera.core.o g() {
        return i(this.f31575a.g());
    }

    @Override // androidx.camera.core.impl.g1
    public int getHeight() {
        return this.f31575a.getHeight();
    }

    @Override // androidx.camera.core.impl.g1
    public Surface getSurface() {
        return this.f31575a.getSurface();
    }

    @Override // androidx.camera.core.impl.g1
    public int getWidth() {
        return this.f31575a.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(f0 f0Var) {
        androidx.core.util.h.n(this.f31576b == null, "Pending request should be null");
        this.f31576b = f0Var;
    }
}

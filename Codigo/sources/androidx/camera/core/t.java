package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.e;
import androidx.camera.core.impl.g1;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class t implements g1 {

    /* renamed from: d, reason: collision with root package name */
    private final g1 f2753d;

    /* renamed from: e, reason: collision with root package name */
    private final Surface f2754e;

    /* renamed from: f, reason: collision with root package name */
    private e.a f2755f;

    /* renamed from: a, reason: collision with root package name */
    private final Object f2750a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private int f2751b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2752c = false;

    /* renamed from: g, reason: collision with root package name */
    private final e.a f2756g = new e.a() { // from class: w.v0
        @Override // androidx.camera.core.e.a
        public final void a(androidx.camera.core.o oVar) {
            androidx.camera.core.t.this.j(oVar);
        }
    };

    public t(g1 g1Var) {
        this.f2753d = g1Var;
        this.f2754e = g1Var.getSurface();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(o oVar) {
        e.a aVar;
        synchronized (this.f2750a) {
            int i10 = this.f2751b - 1;
            this.f2751b = i10;
            if (this.f2752c && i10 == 0) {
                close();
            }
            aVar = this.f2755f;
        }
        if (aVar != null) {
            aVar.a(oVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(g1.a aVar, g1 g1Var) {
        aVar.a(this);
    }

    private o n(o oVar) {
        if (oVar == null) {
            return null;
        }
        this.f2751b++;
        v vVar = new v(oVar);
        vVar.a(this.f2756g);
        return vVar;
    }

    @Override // androidx.camera.core.impl.g1
    public o b() {
        o n10;
        synchronized (this.f2750a) {
            n10 = n(this.f2753d.b());
        }
        return n10;
    }

    @Override // androidx.camera.core.impl.g1
    public int c() {
        int c10;
        synchronized (this.f2750a) {
            c10 = this.f2753d.c();
        }
        return c10;
    }

    @Override // androidx.camera.core.impl.g1
    public void close() {
        synchronized (this.f2750a) {
            Surface surface = this.f2754e;
            if (surface != null) {
                surface.release();
            }
            this.f2753d.close();
        }
    }

    @Override // androidx.camera.core.impl.g1
    public void d() {
        synchronized (this.f2750a) {
            this.f2753d.d();
        }
    }

    @Override // androidx.camera.core.impl.g1
    public int e() {
        int e10;
        synchronized (this.f2750a) {
            e10 = this.f2753d.e();
        }
        return e10;
    }

    @Override // androidx.camera.core.impl.g1
    public void f(final g1.a aVar, Executor executor) {
        synchronized (this.f2750a) {
            this.f2753d.f(new g1.a() { // from class: w.w0
                @Override // androidx.camera.core.impl.g1.a
                public final void a(androidx.camera.core.impl.g1 g1Var) {
                    androidx.camera.core.t.this.k(aVar, g1Var);
                }
            }, executor);
        }
    }

    @Override // androidx.camera.core.impl.g1
    public o g() {
        o n10;
        synchronized (this.f2750a) {
            n10 = n(this.f2753d.g());
        }
        return n10;
    }

    @Override // androidx.camera.core.impl.g1
    public int getHeight() {
        int height;
        synchronized (this.f2750a) {
            height = this.f2753d.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.g1
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f2750a) {
            surface = this.f2753d.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.g1
    public int getWidth() {
        int width;
        synchronized (this.f2750a) {
            width = this.f2753d.getWidth();
        }
        return width;
    }

    public int i() {
        int e10;
        synchronized (this.f2750a) {
            e10 = this.f2753d.e() - this.f2751b;
        }
        return e10;
    }

    public void l() {
        synchronized (this.f2750a) {
            this.f2752c = true;
            this.f2753d.d();
            if (this.f2751b == 0) {
                close();
            }
        }
    }

    public void m(e.a aVar) {
        synchronized (this.f2750a) {
            this.f2755f = aVar;
        }
    }
}

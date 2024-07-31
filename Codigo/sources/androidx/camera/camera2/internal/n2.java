package androidx.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.y1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class n2 {

    /* renamed from: a, reason: collision with root package name */
    private androidx.camera.core.impl.r0 f2130a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.camera.core.impl.y1 f2131b;

    /* renamed from: d, reason: collision with root package name */
    private final Size f2133d;

    /* renamed from: f, reason: collision with root package name */
    private final c f2135f;

    /* renamed from: e, reason: collision with root package name */
    private final t.s f2134e = new t.s();

    /* renamed from: c, reason: collision with root package name */
    private final b f2132c = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements a0.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Surface f2136a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SurfaceTexture f2137b;

        a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f2136a = surface;
            this.f2137b = surfaceTexture;
        }

        @Override // a0.c
        public void a(Throwable th2) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th2);
        }

        @Override // a0.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            this.f2136a.release();
            this.f2137b.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements androidx.camera.core.impl.k2<androidx.camera.core.w> {
        private final androidx.camera.core.impl.n0 G;

        b() {
            androidx.camera.core.impl.m1 a02 = androidx.camera.core.impl.m1.a0();
            a02.r(androidx.camera.core.impl.k2.f2528t, new j1());
            this.G = a02;
        }

        @Override // androidx.camera.core.impl.k2
        public l2.b N() {
            return l2.b.METERING_REPEATING;
        }

        @Override // androidx.camera.core.impl.u1
        public androidx.camera.core.impl.n0 m() {
            return this.G;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n2(androidx.camera.camera2.internal.compat.d0 d0Var, c2 c2Var, c cVar) {
        this.f2135f = cVar;
        Size f10 = f(d0Var, c2Var);
        this.f2133d = f10;
        w.o0.a("MeteringRepeating", "MeteringSession SurfaceTexture size: " + f10);
        this.f2131b = d();
    }

    private Size f(androidx.camera.camera2.internal.compat.d0 d0Var, c2 c2Var) {
        Size[] b10 = d0Var.b().b(34);
        if (b10 == null) {
            w.o0.c("MeteringRepeating", "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] a10 = this.f2134e.a(b10);
        List asList = Arrays.asList(a10);
        Collections.sort(asList, new Comparator() { // from class: androidx.camera.camera2.internal.m2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int j10;
                j10 = n2.j((Size) obj, (Size) obj2);
                return j10;
            }
        });
        Size f10 = c2Var.f();
        long min = Math.min(f10.getWidth() * f10.getHeight(), 307200L);
        int length = a10.length;
        Size size = null;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Size size2 = a10[i10];
            long width = size2.getWidth() * size2.getHeight();
            if (width == min) {
                return size2;
            }
            if (width <= min) {
                i10++;
                size = size2;
            } else if (size != null) {
                return size;
            }
        }
        return (Size) asList.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(androidx.camera.core.impl.y1 y1Var, y1.f fVar) {
        this.f2131b = d();
        c cVar = this.f2135f;
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int j(Size size, Size size2) {
        return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        w.o0.a("MeteringRepeating", "MeteringRepeating clear!");
        androidx.camera.core.impl.r0 r0Var = this.f2130a;
        if (r0Var != null) {
            r0Var.d();
        }
        this.f2130a = null;
    }

    androidx.camera.core.impl.y1 d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(this.f2133d.getWidth(), this.f2133d.getHeight());
        Surface surface = new Surface(surfaceTexture);
        y1.b p10 = y1.b.p(this.f2132c, this.f2133d);
        p10.t(1);
        androidx.camera.core.impl.h1 h1Var = new androidx.camera.core.impl.h1(surface);
        this.f2130a = h1Var;
        a0.f.b(h1Var.k(), new a(surface, surfaceTexture), z.a.a());
        p10.l(this.f2130a);
        p10.f(new y1.c() { // from class: androidx.camera.camera2.internal.l2
            @Override // androidx.camera.core.impl.y1.c
            public final void a(androidx.camera.core.impl.y1 y1Var, y1.f fVar) {
                n2.this.i(y1Var, fVar);
            }
        });
        return p10.o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        return "MeteringRepeating";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.camera.core.impl.y1 g() {
        return this.f2131b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.camera.core.impl.k2<?> h() {
        return this.f2132c;
    }
}

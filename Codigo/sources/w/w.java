package w;

import android.os.Handler;
import androidx.camera.core.impl.a0;
import androidx.camera.core.impl.l1;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.m1;
import androidx.camera.core.impl.n0;
import androidx.camera.core.impl.p1;
import androidx.camera.core.impl.z;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class w implements b0.j<v> {
    static final n0.a<a0.a> H = n0.a.a("camerax.core.appConfig.cameraFactoryProvider", a0.a.class);
    static final n0.a<z.a> I = n0.a.a("camerax.core.appConfig.deviceSurfaceManagerProvider", z.a.class);
    static final n0.a<l2.c> J = n0.a.a("camerax.core.appConfig.useCaseConfigFactoryProvider", l2.c.class);
    static final n0.a<Executor> K = n0.a.a("camerax.core.appConfig.cameraExecutor", Executor.class);
    static final n0.a<Handler> L = n0.a.a("camerax.core.appConfig.schedulerHandler", Handler.class);
    static final n0.a<Integer> M = n0.a.a("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);
    static final n0.a<p> N = n0.a.a("camerax.core.appConfig.availableCamerasLimiter", p.class);
    private final p1 G;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final m1 f29572a;

        public a() {
            this(m1.a0());
        }

        private a(m1 m1Var) {
            this.f29572a = m1Var;
            Class cls = (Class) m1Var.g(b0.j.D, null);
            if (cls == null || cls.equals(v.class)) {
                e(v.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        private l1 b() {
            return this.f29572a;
        }

        public w a() {
            return new w(p1.Y(this.f29572a));
        }

        public a c(a0.a aVar) {
            b().r(w.H, aVar);
            return this;
        }

        public a d(z.a aVar) {
            b().r(w.I, aVar);
            return this;
        }

        public a e(Class<v> cls) {
            b().r(b0.j.D, cls);
            if (b().g(b0.j.C, null) == null) {
                f(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a f(String str) {
            b().r(b0.j.C, str);
            return this;
        }

        public a g(l2.c cVar) {
            b().r(w.J, cVar);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        w getCameraXConfig();
    }

    w(p1 p1Var) {
        this.G = p1Var;
    }

    public p W(p pVar) {
        return (p) this.G.g(N, pVar);
    }

    public Executor X(Executor executor) {
        return (Executor) this.G.g(K, executor);
    }

    public a0.a Y(a0.a aVar) {
        return (a0.a) this.G.g(H, aVar);
    }

    public z.a Z(z.a aVar) {
        return (z.a) this.G.g(I, aVar);
    }

    public Handler a0(Handler handler) {
        return (Handler) this.G.g(L, handler);
    }

    public l2.c b0(l2.c cVar) {
        return (l2.c) this.G.g(J, cVar);
    }

    @Override // androidx.camera.core.impl.u1
    public androidx.camera.core.impl.n0 m() {
        return this.G;
    }
}

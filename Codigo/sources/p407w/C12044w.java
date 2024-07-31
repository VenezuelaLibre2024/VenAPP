package p407w;

import android.os.Handler;
import androidx.camera.core.impl.C0647m1;
import androidx.camera.core.impl.C0656p1;
import androidx.camera.core.impl.InterfaceC0598a0;
import androidx.camera.core.impl.InterfaceC0643l1;
import androidx.camera.core.impl.InterfaceC0644l2;
import androidx.camera.core.impl.InterfaceC0649n0;
import androidx.camera.core.impl.InterfaceC0702z;
import java.util.UUID;
import java.util.concurrent.Executor;
import p018b0.InterfaceC1602j;

/* renamed from: w.w */
/* loaded from: classes.dex */
public final class C12044w implements InterfaceC1602j<C12042v> {

    /* renamed from: H */
    static final InterfaceC0649n0.a<InterfaceC0598a0.a> f32027H = InterfaceC0649n0.a.m3199a("camerax.core.appConfig.cameraFactoryProvider", InterfaceC0598a0.a.class);

    /* renamed from: I */
    static final InterfaceC0649n0.a<InterfaceC0702z.a> f32028I = InterfaceC0649n0.a.m3199a("camerax.core.appConfig.deviceSurfaceManagerProvider", InterfaceC0702z.a.class);

    /* renamed from: J */
    static final InterfaceC0649n0.a<InterfaceC0644l2.c> f32029J = InterfaceC0649n0.a.m3199a("camerax.core.appConfig.useCaseConfigFactoryProvider", InterfaceC0644l2.c.class);

    /* renamed from: K */
    static final InterfaceC0649n0.a<Executor> f32030K = InterfaceC0649n0.a.m3199a("camerax.core.appConfig.cameraExecutor", Executor.class);

    /* renamed from: L */
    static final InterfaceC0649n0.a<Handler> f32031L = InterfaceC0649n0.a.m3199a("camerax.core.appConfig.schedulerHandler", Handler.class);

    /* renamed from: M */
    static final InterfaceC0649n0.a<Integer> f32032M = InterfaceC0649n0.a.m3199a("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);

    /* renamed from: N */
    static final InterfaceC0649n0.a<C12030p> f32033N = InterfaceC0649n0.a.m3199a("camerax.core.appConfig.availableCamerasLimiter", C12030p.class);

    /* renamed from: G */
    private final C0656p1 f32034G;

    /* renamed from: w.w$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final C0647m1 f32035a;

        public a() {
            this(C0647m1.m3184a0());
        }

        private a(C0647m1 c0647m1) {
            this.f32035a = c0647m1;
            Class cls = (Class) c0647m1.mo3197g(InterfaceC1602j.f6864D, null);
            if (cls == null || cls.equals(C12042v.class)) {
                m38693e(C12042v.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        /* renamed from: b */
        private InterfaceC0643l1 m38689b() {
            return this.f32035a;
        }

        /* renamed from: a */
        public C12044w m38690a() {
            return new C12044w(C0656p1.m3211Y(this.f32035a));
        }

        /* renamed from: c */
        public a m38691c(InterfaceC0598a0.a aVar) {
            m38689b().mo3178r(C12044w.f32027H, aVar);
            return this;
        }

        /* renamed from: d */
        public a m38692d(InterfaceC0702z.a aVar) {
            m38689b().mo3178r(C12044w.f32028I, aVar);
            return this;
        }

        /* renamed from: e */
        public a m38693e(Class<C12042v> cls) {
            m38689b().mo3178r(InterfaceC1602j.f6864D, cls);
            if (m38689b().mo3197g(InterfaceC1602j.f6863C, null) == null) {
                m38694f(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: f */
        public a m38694f(String str) {
            m38689b().mo3178r(InterfaceC1602j.f6863C, str);
            return this;
        }

        /* renamed from: g */
        public a m38695g(InterfaceC0644l2.c cVar) {
            m38689b().mo3178r(C12044w.f32029J, cVar);
            return this;
        }
    }

    /* renamed from: w.w$b */
    /* loaded from: classes.dex */
    public interface b {
        C12044w getCameraXConfig();
    }

    C12044w(C0656p1 c0656p1) {
        this.f32034G = c0656p1;
    }

    /* renamed from: W */
    public C12030p m38683W(C12030p c12030p) {
        return (C12030p) this.f32034G.mo3197g(f32033N, c12030p);
    }

    /* renamed from: X */
    public Executor m38684X(Executor executor) {
        return (Executor) this.f32034G.mo3197g(f32030K, executor);
    }

    /* renamed from: Y */
    public InterfaceC0598a0.a m38685Y(InterfaceC0598a0.a aVar) {
        return (InterfaceC0598a0.a) this.f32034G.mo3197g(f32027H, aVar);
    }

    /* renamed from: Z */
    public InterfaceC0702z.a m38686Z(InterfaceC0702z.a aVar) {
        return (InterfaceC0702z.a) this.f32034G.mo3197g(f32028I, aVar);
    }

    /* renamed from: a0 */
    public Handler m38687a0(Handler handler) {
        return (Handler) this.f32034G.mo3197g(f32031L, handler);
    }

    /* renamed from: b0 */
    public InterfaceC0644l2.c m38688b0(InterfaceC0644l2.c cVar) {
        return (InterfaceC0644l2.c) this.f32034G.mo3197g(f32029J, cVar);
    }

    @Override // androidx.camera.core.impl.InterfaceC0671u1
    /* renamed from: m */
    public InterfaceC0649n0 mo2589m() {
        return this.f32034G;
    }
}

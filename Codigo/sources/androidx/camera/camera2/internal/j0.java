package androidx.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.j0;
import androidx.camera.camera2.internal.j3;
import androidx.camera.camera2.internal.n2;
import androidx.camera.core.impl.c0;
import androidx.camera.core.impl.h0;
import androidx.camera.core.impl.l0;
import androidx.camera.core.impl.r0;
import androidx.camera.core.impl.y;
import androidx.camera.core.impl.y1;
import androidx.concurrent.futures.c;
import com.facebook.ads.AdError;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import w.q;

/* loaded from: classes.dex */
public final class j0 implements androidx.camera.core.impl.c0 {
    final Map<y1, com.google.common.util.concurrent.f<Void>> A;
    final d B;
    final e C;
    final x.a D;
    final androidx.camera.core.impl.h0 E;
    final Set<x1> F;
    private n2 G;
    private final a2 H;
    private final j3.a I;
    private final Set<String> J;
    private androidx.camera.core.impl.u K;
    final Object L;
    private androidx.camera.core.impl.z1 M;
    boolean N;
    private final c2 O;
    private final androidx.camera.camera2.internal.compat.d0 P;
    private final r.b Q;

    /* renamed from: a */
    private final androidx.camera.core.impl.j2 f2047a;

    /* renamed from: b */
    private final androidx.camera.camera2.internal.compat.r0 f2048b;

    /* renamed from: c */
    private final Executor f2049c;

    /* renamed from: d */
    private final ScheduledExecutorService f2050d;

    /* renamed from: e */
    volatile g f2051e = g.INITIALIZED;

    /* renamed from: f */
    private final androidx.camera.core.impl.j1<c0.a> f2052f;

    /* renamed from: r */
    private final p1 f2053r;

    /* renamed from: s */
    private final u f2054s;

    /* renamed from: t */
    private final h f2055t;

    /* renamed from: u */
    final n0 f2056u;

    /* renamed from: v */
    CameraDevice f2057v;

    /* renamed from: w */
    int f2058w;

    /* renamed from: x */
    y1 f2059x;

    /* renamed from: y */
    final AtomicInteger f2060y;

    /* renamed from: z */
    c.a<Void> f2061z;

    /* loaded from: classes.dex */
    public class a implements a0.c<Void> {

        /* renamed from: a */
        final /* synthetic */ y1 f2062a;

        a(y1 y1Var) {
            this.f2062a = y1Var;
        }

        @Override // a0.c
        public void a(Throwable th2) {
        }

        @Override // a0.c
        /* renamed from: b */
        public void onSuccess(Void r22) {
            CameraDevice cameraDevice;
            j0.this.A.remove(this.f2062a);
            int i10 = c.f2065a[j0.this.f2051e.ordinal()];
            if (i10 != 3) {
                if (i10 != 7) {
                    if (i10 != 8) {
                        return;
                    }
                } else if (j0.this.f2058w == 0) {
                    return;
                }
            }
            if (!j0.this.Q() || (cameraDevice = j0.this.f2057v) == null) {
                return;
            }
            androidx.camera.camera2.internal.compat.a.a(cameraDevice);
            j0.this.f2057v = null;
        }
    }

    /* loaded from: classes.dex */
    public class b implements a0.c<Void> {
        b() {
        }

        @Override // a0.c
        public void a(Throwable th2) {
            if (th2 instanceof r0.a) {
                androidx.camera.core.impl.y1 J = j0.this.J(((r0.a) th2).a());
                if (J != null) {
                    j0.this.j0(J);
                    return;
                }
                return;
            }
            if (th2 instanceof CancellationException) {
                j0.this.H("Unable to configure camera cancelled");
                return;
            }
            g gVar = j0.this.f2051e;
            g gVar2 = g.OPENED;
            if (gVar == gVar2) {
                j0.this.q0(gVar2, q.a.b(4, th2));
            }
            if (th2 instanceof CameraAccessException) {
                j0.this.H("Unable to configure camera due to " + th2.getMessage());
                return;
            }
            if (th2 instanceof TimeoutException) {
                w.o0.c("Camera2CameraImpl", "Unable to configure camera " + j0.this.f2056u.b() + ", timeout!");
            }
        }

        @Override // a0.c
        /* renamed from: b */
        public void onSuccess(Void r22) {
            if (j0.this.D.b() == 2 && j0.this.f2051e == g.OPENED) {
                j0.this.p0(g.CONFIGURED);
            }
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f2065a;

        static {
            int[] iArr = new int[g.values().length];
            f2065a = iArr;
            try {
                iArr[g.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2065a[g.PENDING_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2065a[g.CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2065a[g.OPENED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2065a[g.CONFIGURED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2065a[g.OPENING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2065a[g.REOPENING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2065a[g.RELEASING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2065a[g.RELEASED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* loaded from: classes.dex */
    public final class d extends CameraManager.AvailabilityCallback implements h0.c {

        /* renamed from: a */
        private final String f2066a;

        /* renamed from: b */
        private boolean f2067b = true;

        d(String str) {
            this.f2066a = str;
        }

        @Override // androidx.camera.core.impl.h0.c
        public void a() {
            if (j0.this.f2051e == g.PENDING_OPEN) {
                j0.this.x0(false);
            }
        }

        boolean b() {
            return this.f2067b;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            if (this.f2066a.equals(str)) {
                this.f2067b = true;
                if (j0.this.f2051e == g.PENDING_OPEN) {
                    j0.this.x0(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            if (this.f2066a.equals(str)) {
                this.f2067b = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class e implements h0.b {
        e() {
        }

        @Override // androidx.camera.core.impl.h0.b
        public void a() {
            if (j0.this.f2051e == g.OPENED) {
                j0.this.h0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class f implements y.c {
        f() {
        }

        @Override // androidx.camera.core.impl.y.c
        public void a() {
            j0.this.y0();
        }

        @Override // androidx.camera.core.impl.y.c
        public void b(List<androidx.camera.core.impl.l0> list) {
            j0.this.s0((List) androidx.core.util.h.k(list));
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        INITIALIZED,
        PENDING_OPEN,
        OPENING,
        OPENED,
        CONFIGURED,
        CLOSING,
        REOPENING,
        RELEASING,
        RELEASED
    }

    /* loaded from: classes.dex */
    public final class h extends CameraDevice.StateCallback {

        /* renamed from: a */
        private final Executor f2071a;

        /* renamed from: b */
        private final ScheduledExecutorService f2072b;

        /* renamed from: c */
        private b f2073c;

        /* renamed from: d */
        ScheduledFuture<?> f2074d;

        /* renamed from: e */
        private final a f2075e = new a();

        /* loaded from: classes.dex */
        public class a {

            /* renamed from: a */
            private long f2077a = -1;

            a() {
            }

            boolean a() {
                if (!(b() >= ((long) d()))) {
                    return true;
                }
                e();
                return false;
            }

            long b() {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f2077a == -1) {
                    this.f2077a = uptimeMillis;
                }
                return uptimeMillis - this.f2077a;
            }

            int c() {
                if (!h.this.f()) {
                    return 700;
                }
                long b10 = b();
                if (b10 <= 120000) {
                    return AdError.NETWORK_ERROR_CODE;
                }
                if (b10 <= 300000) {
                    return AdError.SERVER_ERROR_CODE;
                }
                return 4000;
            }

            int d() {
                if (h.this.f()) {
                    return 1800000;
                }
                return ModuleDescriptor.MODULE_VERSION;
            }

            void e() {
                this.f2077a = -1L;
            }
        }

        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: a */
            private Executor f2079a;

            /* renamed from: b */
            private boolean f2080b = false;

            b(Executor executor) {
                this.f2079a = executor;
            }

            public /* synthetic */ void c() {
                if (this.f2080b) {
                    return;
                }
                androidx.core.util.h.m(j0.this.f2051e == g.REOPENING);
                if (h.this.f()) {
                    j0.this.w0(true);
                } else {
                    j0.this.x0(true);
                }
            }

            void b() {
                this.f2080b = true;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f2079a.execute(new Runnable() { // from class: androidx.camera.camera2.internal.k0
                    public /* synthetic */ k0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        j0.h.b.this.c();
                    }
                });
            }
        }

        h(Executor executor, ScheduledExecutorService scheduledExecutorService) {
            this.f2071a = executor;
            this.f2072b = scheduledExecutorService;
        }

        private void b(CameraDevice cameraDevice, int i10) {
            androidx.core.util.h.n(j0.this.f2051e == g.OPENING || j0.this.f2051e == g.OPENED || j0.this.f2051e == g.CONFIGURED || j0.this.f2051e == g.REOPENING, "Attempt to handle open error from non open state: " + j0.this.f2051e);
            if (i10 == 1 || i10 == 2 || i10 == 4) {
                w.o0.a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), j0.L(i10)));
                c(i10);
                return;
            }
            w.o0.c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + j0.L(i10) + " closing camera.");
            j0.this.q0(g.CLOSING, q.a.a(i10 == 3 ? 5 : 6));
            j0.this.D(false);
        }

        private void c(int i10) {
            int i11 = 1;
            androidx.core.util.h.n(j0.this.f2058w != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i10 == 1) {
                i11 = 2;
            } else if (i10 != 2) {
                i11 = 3;
            }
            j0.this.q0(g.REOPENING, q.a.a(i11));
            j0.this.D(false);
        }

        boolean a() {
            if (this.f2074d == null) {
                return false;
            }
            j0.this.H("Cancelling scheduled re-open: " + this.f2073c);
            this.f2073c.b();
            this.f2073c = null;
            this.f2074d.cancel(false);
            this.f2074d = null;
            return true;
        }

        void d() {
            this.f2075e.e();
        }

        void e() {
            androidx.core.util.h.m(this.f2073c == null);
            androidx.core.util.h.m(this.f2074d == null);
            if (!this.f2075e.a()) {
                w.o0.c("Camera2CameraImpl", "Camera reopening attempted for " + this.f2075e.d() + "ms without success.");
                j0.this.r0(g.PENDING_OPEN, null, false);
                return;
            }
            this.f2073c = new b(this.f2071a);
            j0.this.H("Attempting camera re-open in " + this.f2075e.c() + "ms: " + this.f2073c + " activeResuming = " + j0.this.N);
            this.f2074d = this.f2072b.schedule(this.f2073c, (long) this.f2075e.c(), TimeUnit.MILLISECONDS);
        }

        boolean f() {
            int i10;
            j0 j0Var = j0.this;
            return j0Var.N && ((i10 = j0Var.f2058w) == 1 || i10 == 2);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            j0.this.H("CameraDevice.onClosed()");
            androidx.core.util.h.n(j0.this.f2057v == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int i10 = c.f2065a[j0.this.f2051e.ordinal()];
            if (i10 != 3) {
                if (i10 == 7) {
                    j0 j0Var = j0.this;
                    if (j0Var.f2058w == 0) {
                        j0Var.x0(false);
                        return;
                    }
                    j0Var.H("Camera closed due to error: " + j0.L(j0.this.f2058w));
                    e();
                    return;
                }
                if (i10 != 8) {
                    throw new IllegalStateException("Camera closed while in state: " + j0.this.f2051e);
                }
            }
            androidx.core.util.h.m(j0.this.Q());
            j0.this.K();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            j0.this.H("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            j0 j0Var = j0.this;
            j0Var.f2057v = cameraDevice;
            j0Var.f2058w = i10;
            switch (c.f2065a[j0Var.f2051e.ordinal()]) {
                case 3:
                case 8:
                    w.o0.c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), j0.L(i10), j0.this.f2051e.name()));
                    j0.this.D(false);
                    return;
                case 4:
                case 5:
                case 6:
                case 7:
                    w.o0.a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), j0.L(i10), j0.this.f2051e.name()));
                    b(cameraDevice, i10);
                    return;
                default:
                    throw new IllegalStateException("onError() should not be possible from state: " + j0.this.f2051e);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            j0.this.H("CameraDevice.onOpened()");
            j0 j0Var = j0.this;
            j0Var.f2057v = cameraDevice;
            j0Var.f2058w = 0;
            d();
            int i10 = c.f2065a[j0.this.f2051e.ordinal()];
            if (i10 != 3) {
                if (i10 == 6 || i10 == 7) {
                    j0.this.p0(g.OPENED);
                    androidx.camera.core.impl.h0 h0Var = j0.this.E;
                    String id2 = cameraDevice.getId();
                    j0 j0Var2 = j0.this;
                    if (h0Var.i(id2, j0Var2.D.a(j0Var2.f2057v.getId()))) {
                        j0.this.h0();
                        return;
                    }
                    return;
                }
                if (i10 != 8) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + j0.this.f2051e);
                }
            }
            androidx.core.util.h.m(j0.this.Q());
            j0.this.f2057v.close();
            j0.this.f2057v = null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i {
        static i a(String str, Class<?> cls, androidx.camera.core.impl.y1 y1Var, androidx.camera.core.impl.k2<?> k2Var, Size size) {
            return new androidx.camera.camera2.internal.d(str, cls, y1Var, k2Var, size);
        }

        static i b(androidx.camera.core.w wVar) {
            return a(j0.N(wVar), wVar.getClass(), wVar.s(), wVar.i(), wVar.e());
        }

        public abstract androidx.camera.core.impl.y1 c();

        public abstract Size d();

        public abstract androidx.camera.core.impl.k2<?> e();

        public abstract String f();

        public abstract Class<?> g();
    }

    public j0(androidx.camera.camera2.internal.compat.r0 r0Var, String str, n0 n0Var, x.a aVar, androidx.camera.core.impl.h0 h0Var, Executor executor, Handler handler, c2 c2Var) {
        androidx.camera.core.impl.j1<c0.a> j1Var = new androidx.camera.core.impl.j1<>();
        this.f2052f = j1Var;
        this.f2058w = 0;
        this.f2060y = new AtomicInteger(0);
        this.A = new LinkedHashMap();
        this.F = new HashSet();
        this.J = new HashSet();
        this.K = androidx.camera.core.impl.x.a();
        this.L = new Object();
        this.N = false;
        this.f2048b = r0Var;
        this.D = aVar;
        this.E = h0Var;
        ScheduledExecutorService e10 = z.a.e(handler);
        this.f2050d = e10;
        Executor f10 = z.a.f(executor);
        this.f2049c = f10;
        this.f2055t = new h(f10, e10);
        this.f2047a = new androidx.camera.core.impl.j2(str);
        j1Var.a(c0.a.CLOSED);
        p1 p1Var = new p1(h0Var);
        this.f2053r = p1Var;
        a2 a2Var = new a2(f10);
        this.H = a2Var;
        this.O = c2Var;
        try {
            androidx.camera.camera2.internal.compat.d0 c10 = r0Var.c(str);
            this.P = c10;
            u uVar = new u(c10, e10, f10, new f(), n0Var.e());
            this.f2054s = uVar;
            this.f2056u = n0Var;
            n0Var.o(uVar);
            n0Var.r(p1Var.a());
            this.Q = r.b.a(c10);
            this.f2059x = d0();
            this.I = new j3.a(f10, e10, handler, a2Var, n0Var.e(), s.l.b());
            d dVar = new d(str);
            this.B = dVar;
            e eVar = new e();
            this.C = eVar;
            h0Var.g(this, f10, eVar, dVar);
            r0Var.g(f10, dVar);
        } catch (androidx.camera.camera2.internal.compat.h e11) {
            throw q1.a(e11);
        }
    }

    private void A() {
        n2 n2Var = this.G;
        if (n2Var != null) {
            String M = M(n2Var);
            this.f2047a.r(M, this.G.g(), this.G.h());
            this.f2047a.q(M, this.G.g(), this.G.h());
        }
    }

    private void B() {
        androidx.camera.core.impl.y1 b10 = this.f2047a.f().b();
        androidx.camera.core.impl.l0 h10 = b10.h();
        int size = h10.f().size();
        int size2 = b10.k().size();
        if (b10.k().isEmpty()) {
            return;
        }
        if (h10.f().isEmpty()) {
            if (this.G == null) {
                this.G = new n2(this.f2056u.l(), this.O, new n2.c() { // from class: androidx.camera.camera2.internal.z
                    public /* synthetic */ z() {
                    }

                    @Override // androidx.camera.camera2.internal.n2.c
                    public final void a() {
                        j0.this.R();
                    }
                });
            }
            A();
        } else {
            if ((size2 == 1 && size == 1) || size >= 2) {
                m0();
                return;
            }
            w.o0.a("Camera2CameraImpl", "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
        }
    }

    private boolean C(l0.a aVar) {
        String str;
        if (aVar.m().isEmpty()) {
            Iterator<androidx.camera.core.impl.y1> it = this.f2047a.e().iterator();
            while (it.hasNext()) {
                List<androidx.camera.core.impl.r0> f10 = it.next().h().f();
                if (!f10.isEmpty()) {
                    Iterator<androidx.camera.core.impl.r0> it2 = f10.iterator();
                    while (it2.hasNext()) {
                        aVar.f(it2.next());
                    }
                }
            }
            if (!aVar.m().isEmpty()) {
                return true;
            }
            str = "Unable to find a repeating surface to attach to CaptureConfig";
        } else {
            str = "The capture config builder already has surface inside.";
        }
        w.o0.k("Camera2CameraImpl", str);
        return false;
    }

    private void E() {
        H("Closing camera.");
        int i10 = c.f2065a[this.f2051e.ordinal()];
        if (i10 == 2) {
            androidx.core.util.h.m(this.f2057v == null);
            p0(g.INITIALIZED);
            return;
        }
        if (i10 == 4 || i10 == 5) {
            p0(g.CLOSING);
            D(false);
            return;
        }
        if (i10 != 6 && i10 != 7) {
            H("close() ignored due to being in state: " + this.f2051e);
            return;
        }
        boolean a10 = this.f2055t.a();
        p0(g.CLOSING);
        if (a10) {
            androidx.core.util.h.m(Q());
            K();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: androidx.camera.camera2.internal.i0.<init>(android.view.Surface, android.graphics.SurfaceTexture):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    private void F(boolean r6) {
        /*
            r5 = this;
            androidx.camera.camera2.internal.x1 r0 = new androidx.camera.camera2.internal.x1
            r.b r1 = r5.Q
            r0.<init>(r1)
            java.util.Set<androidx.camera.camera2.internal.x1> r1 = r5.F
            r1.add(r0)
            r5.n0(r6)
            android.graphics.SurfaceTexture r6 = new android.graphics.SurfaceTexture
            r1 = 0
            r6.<init>(r1)
            r1 = 640(0x280, float:8.97E-43)
            r2 = 480(0x1e0, float:6.73E-43)
            r6.setDefaultBufferSize(r1, r2)
            android.view.Surface r1 = new android.view.Surface
            r1.<init>(r6)
            androidx.camera.camera2.internal.i0 r2 = new androidx.camera.camera2.internal.i0
            r2.<init>()
            androidx.camera.core.impl.y1$b r6 = new androidx.camera.core.impl.y1$b
            r6.<init>()
            androidx.camera.core.impl.h1 r3 = new androidx.camera.core.impl.h1
            r3.<init>(r1)
            r6.h(r3)
            r1 = 1
            r6.t(r1)
            java.lang.String r1 = "Start configAndClose."
            r5.H(r1)
            androidx.camera.core.impl.y1 r6 = r6.o()
            android.hardware.camera2.CameraDevice r1 = r5.f2057v
            java.lang.Object r1 = androidx.core.util.h.k(r1)
            android.hardware.camera2.CameraDevice r1 = (android.hardware.camera2.CameraDevice) r1
            androidx.camera.camera2.internal.j3$a r4 = r5.I
            androidx.camera.camera2.internal.j3 r4 = r4.a()
            com.google.common.util.concurrent.f r6 = r0.g(r6, r1, r4)
            androidx.camera.camera2.internal.y r1 = new androidx.camera.camera2.internal.y
            r1.<init>()
            java.util.concurrent.Executor r0 = r5.f2049c
            r6.addListener(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.j0.F(boolean):void");
    }

    private CameraDevice.StateCallback G() {
        ArrayList arrayList = new ArrayList(this.f2047a.f().b().b());
        arrayList.add(this.H.c());
        arrayList.add(this.f2055t);
        return n1.a(arrayList);
    }

    private void I(String str, Throwable th2) {
        w.o0.b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th2);
    }

    static String L(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    static String M(n2 n2Var) {
        return n2Var.e() + n2Var.hashCode();
    }

    static String N(androidx.camera.core.w wVar) {
        return wVar.n() + wVar.hashCode();
    }

    private boolean O() {
        return ((n0) i()).n() == 2;
    }

    public /* synthetic */ void R() {
        if (P()) {
            o0(M(this.G), this.G.g(), this.G.h());
        }
    }

    public /* synthetic */ void S(List list) {
        try {
            u0(list);
        } finally {
            this.f2054s.v();
        }
    }

    public static /* synthetic */ void T(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    public /* synthetic */ void W(c.a aVar) {
        Boolean valueOf;
        n2 n2Var = this.G;
        if (n2Var == null) {
            valueOf = Boolean.FALSE;
        } else {
            valueOf = Boolean.valueOf(this.f2047a.l(M(n2Var)));
        }
        aVar.c(valueOf);
    }

    public /* synthetic */ Object X(c.a aVar) {
        try {
            this.f2049c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.a0

                /* renamed from: b */
                public final /* synthetic */ c.a f1796b;

                public /* synthetic */ a0(c.a aVar2) {
                    r2 = aVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    j0.this.W(r2);
                }
            });
            return "isMeteringRepeatingAttached";
        } catch (RejectedExecutionException unused) {
            aVar2.f(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }

    public /* synthetic */ void Y(String str, androidx.camera.core.impl.y1 y1Var, androidx.camera.core.impl.k2 k2Var) {
        H("Use case " + str + " ACTIVE");
        this.f2047a.q(str, y1Var, k2Var);
        this.f2047a.u(str, y1Var, k2Var);
        y0();
    }

    public /* synthetic */ void Z(String str) {
        H("Use case " + str + " INACTIVE");
        this.f2047a.t(str);
        y0();
    }

    public static /* synthetic */ void a0(y1.c cVar, androidx.camera.core.impl.y1 y1Var) {
        cVar.a(y1Var, y1.f.SESSION_ERROR_SURFACE_NEEDS_RESET);
    }

    public /* synthetic */ void b0(String str, androidx.camera.core.impl.y1 y1Var, androidx.camera.core.impl.k2 k2Var) {
        H("Use case " + str + " RESET");
        this.f2047a.u(str, y1Var, k2Var);
        B();
        n0(false);
        y0();
        if (this.f2051e == g.OPENED) {
            h0();
        }
    }

    public /* synthetic */ void c0(boolean z10) {
        this.N = z10;
        if (z10 && this.f2051e == g.PENDING_OPEN) {
            w0(false);
        }
    }

    private y1 d0() {
        synchronized (this.L) {
            if (this.M == null) {
                return new x1(this.Q);
            }
            return new t2(this.M, this.f2056u, this.Q, this.f2049c, this.f2050d);
        }
    }

    private void e0(List<androidx.camera.core.w> list) {
        for (androidx.camera.core.w wVar : list) {
            String N = N(wVar);
            if (!this.J.contains(N)) {
                this.J.add(N);
                wVar.I();
                wVar.G();
            }
        }
    }

    private void f0(List<androidx.camera.core.w> list) {
        for (androidx.camera.core.w wVar : list) {
            String N = N(wVar);
            if (this.J.contains(N)) {
                wVar.J();
                this.J.remove(N);
            }
        }
    }

    private void g0(boolean z10) {
        if (!z10) {
            this.f2055t.d();
        }
        this.f2055t.a();
        H("Opening camera.");
        p0(g.OPENING);
        try {
            this.f2048b.f(this.f2056u.b(), this.f2049c, G());
        } catch (androidx.camera.camera2.internal.compat.h e10) {
            H("Unable to open camera due to " + e10.getMessage());
            if (e10.d() != 10001) {
                return;
            }
            q0(g.INITIALIZED, q.a.b(7, e10));
        } catch (SecurityException e11) {
            H("Unable to open camera due to " + e11.getMessage());
            p0(g.REOPENING);
            this.f2055t.e();
        }
    }

    private void i0() {
        int i10 = c.f2065a[this.f2051e.ordinal()];
        if (i10 == 1 || i10 == 2) {
            w0(false);
            return;
        }
        if (i10 != 3) {
            H("open() ignored due to being in state: " + this.f2051e);
            return;
        }
        p0(g.REOPENING);
        if (Q() || this.f2058w != 0) {
            return;
        }
        androidx.core.util.h.n(this.f2057v != null, "Camera Device should be open if session close is not complete");
        p0(g.OPENED);
        h0();
    }

    private void m0() {
        if (this.G != null) {
            this.f2047a.s(this.G.e() + this.G.hashCode());
            this.f2047a.t(this.G.e() + this.G.hashCode());
            this.G.c();
            this.G = null;
        }
    }

    private void o0(String str, androidx.camera.core.impl.y1 y1Var, androidx.camera.core.impl.k2<?> k2Var) {
        this.f2049c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.f0

            /* renamed from: b */
            public final /* synthetic */ String f1982b;

            /* renamed from: c */
            public final /* synthetic */ androidx.camera.core.impl.y1 f1983c;

            /* renamed from: d */
            public final /* synthetic */ androidx.camera.core.impl.k2 f1984d;

            public /* synthetic */ f0(String str2, androidx.camera.core.impl.y1 y1Var2, androidx.camera.core.impl.k2 k2Var2) {
                r2 = str2;
                r3 = y1Var2;
                r4 = k2Var2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                j0.this.b0(r2, r3, r4);
            }
        });
    }

    private Collection<i> t0(Collection<androidx.camera.core.w> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<androidx.camera.core.w> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(i.b(it.next()));
        }
        return arrayList;
    }

    private void u0(Collection<i> collection) {
        Size d10;
        boolean isEmpty = this.f2047a.g().isEmpty();
        ArrayList arrayList = new ArrayList();
        Rational rational = null;
        for (i iVar : collection) {
            if (!this.f2047a.l(iVar.f())) {
                this.f2047a.r(iVar.f(), iVar.c(), iVar.e());
                arrayList.add(iVar.f());
                if (iVar.g() == androidx.camera.core.s.class && (d10 = iVar.d()) != null) {
                    rational = new Rational(d10.getWidth(), d10.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        H("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (isEmpty) {
            this.f2054s.Y(true);
            this.f2054s.I();
        }
        B();
        z0();
        y0();
        n0(false);
        if (this.f2051e == g.OPENED) {
            h0();
        } else {
            i0();
        }
        if (rational != null) {
            this.f2054s.Z(rational);
        }
    }

    /* renamed from: v0 */
    public void V(Collection<i> collection) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (i iVar : collection) {
            if (this.f2047a.l(iVar.f())) {
                this.f2047a.p(iVar.f());
                arrayList.add(iVar.f());
                if (iVar.g() == androidx.camera.core.s.class) {
                    z10 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        H("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z10) {
            this.f2054s.Z(null);
        }
        B();
        if (this.f2047a.h().isEmpty()) {
            this.f2054s.b0(false);
        } else {
            z0();
        }
        if (this.f2047a.g().isEmpty()) {
            this.f2054s.v();
            n0(false);
            this.f2054s.Y(false);
            this.f2059x = d0();
            E();
            return;
        }
        y0();
        n0(false);
        if (this.f2051e == g.OPENED) {
            h0();
        }
    }

    private void z0() {
        Iterator<androidx.camera.core.impl.k2<?>> it = this.f2047a.h().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= it.next().K(false);
        }
        this.f2054s.b0(z10);
    }

    void D(boolean z10) {
        androidx.core.util.h.n(this.f2051e == g.CLOSING || this.f2051e == g.RELEASING || (this.f2051e == g.REOPENING && this.f2058w != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f2051e + " (error: " + L(this.f2058w) + ")");
        if (Build.VERSION.SDK_INT < 29 && O() && this.f2058w == 0) {
            F(z10);
        } else {
            n0(z10);
        }
        this.f2059x.b();
    }

    void H(String str) {
        I(str, null);
    }

    androidx.camera.core.impl.y1 J(androidx.camera.core.impl.r0 r0Var) {
        for (androidx.camera.core.impl.y1 y1Var : this.f2047a.g()) {
            if (y1Var.k().contains(r0Var)) {
                return y1Var;
            }
        }
        return null;
    }

    void K() {
        androidx.core.util.h.m(this.f2051e == g.RELEASING || this.f2051e == g.CLOSING);
        androidx.core.util.h.m(this.A.isEmpty());
        this.f2057v = null;
        if (this.f2051e == g.CLOSING) {
            p0(g.INITIALIZED);
            return;
        }
        this.f2048b.h(this.B);
        p0(g.RELEASED);
        c.a<Void> aVar = this.f2061z;
        if (aVar != null) {
            aVar.c(null);
            this.f2061z = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean P() {
        try {
            return ((Boolean) androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: androidx.camera.camera2.internal.x
                public /* synthetic */ x() {
                }

                @Override // androidx.concurrent.futures.c.InterfaceC0032c
                public final Object a(c.a aVar) {
                    Object X;
                    X = j0.this.X(aVar);
                    return X;
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e10);
        }
    }

    boolean Q() {
        return this.A.isEmpty() && this.F.isEmpty();
    }

    @Override // androidx.camera.core.w.d
    public void c(androidx.camera.core.w wVar) {
        androidx.core.util.h.k(wVar);
        this.f2049c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.d0

            /* renamed from: b */
            public final /* synthetic */ String f1947b;

            /* renamed from: c */
            public final /* synthetic */ androidx.camera.core.impl.y1 f1948c;

            /* renamed from: d */
            public final /* synthetic */ androidx.camera.core.impl.k2 f1949d;

            public /* synthetic */ d0(String str, androidx.camera.core.impl.y1 y1Var, androidx.camera.core.impl.k2 k2Var) {
                r2 = str;
                r3 = y1Var;
                r4 = k2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                j0.this.Y(r2, r3, r4);
            }
        });
    }

    @Override // androidx.camera.core.impl.c0
    public androidx.camera.core.impl.y d() {
        return this.f2054s;
    }

    @Override // androidx.camera.core.impl.c0
    public androidx.camera.core.impl.u e() {
        return this.K;
    }

    @Override // androidx.camera.core.impl.c0
    public void f(boolean z10) {
        this.f2049c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.c0

            /* renamed from: b */
            public final /* synthetic */ boolean f1831b;

            public /* synthetic */ c0(boolean z102) {
                r2 = z102;
            }

            @Override // java.lang.Runnable
            public final void run() {
                j0.this.c0(r2);
            }
        });
    }

    @Override // androidx.camera.core.impl.c0
    public void g(Collection<androidx.camera.core.w> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f2054s.I();
        e0(new ArrayList(arrayList));
        try {
            this.f2049c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.h0

                /* renamed from: b */
                public final /* synthetic */ List f2002b;

                public /* synthetic */ h0(List list) {
                    r2 = list;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    j0.this.S(r2);
                }
            });
        } catch (RejectedExecutionException e10) {
            I("Unable to attach use cases.", e10);
            this.f2054s.v();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: androidx.camera.camera2.internal.g0.<init>(androidx.camera.camera2.internal.j0, java.util.List):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @Override // androidx.camera.core.impl.c0
    public void h(java.util.Collection<androidx.camera.core.w> r3) {
        /*
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto Lc
            return
        Lc:
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.Collection r1 = r2.t0(r0)
            r3.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2.f0(r1)
            java.util.concurrent.Executor r0 = r2.f2049c
            androidx.camera.camera2.internal.g0 r1 = new androidx.camera.camera2.internal.g0
            r1.<init>()
            r0.execute(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.j0.h(java.util.Collection):void");
    }

    void h0() {
        androidx.core.util.h.m(this.f2051e == g.OPENED);
        y1.g f10 = this.f2047a.f();
        if (!f10.e()) {
            H("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (this.E.i(this.f2057v.getId(), this.D.a(this.f2057v.getId()))) {
            HashMap hashMap = new HashMap();
            u2.m(this.f2047a.g(), this.f2047a.h(), hashMap);
            this.f2059x.h(hashMap);
            a0.f.b(this.f2059x.g(f10.b(), (CameraDevice) androidx.core.util.h.k(this.f2057v), this.I.a()), new b(), this.f2049c);
            return;
        }
        H("Unable to create capture session in camera operating mode = " + this.D.b());
    }

    @Override // androidx.camera.core.impl.c0
    public androidx.camera.core.impl.b0 i() {
        return this.f2056u;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: androidx.camera.camera2.internal.e0.<init>(androidx.camera.core.impl.y1$c, androidx.camera.core.impl.y1):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    void j0(androidx.camera.core.impl.y1 r5) {
        /*
            r4 = this;
            java.util.concurrent.ScheduledExecutorService r0 = z.a.d()
            java.util.List r1 = r5.c()
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L27
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            androidx.camera.core.impl.y1$c r1 = (androidx.camera.core.impl.y1.c) r1
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>()
            java.lang.String r3 = "Posting surface closed"
            r4.I(r3, r2)
            androidx.camera.camera2.internal.e0 r2 = new androidx.camera.camera2.internal.e0
            r2.<init>()
            r0.execute(r2)
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.j0.j0(androidx.camera.core.impl.y1):void");
    }

    @Override // androidx.camera.core.w.d
    public void k(androidx.camera.core.w wVar) {
        androidx.core.util.h.k(wVar);
        o0(N(wVar), wVar.s(), wVar.i());
    }

    /* renamed from: k0 */
    public void U(x1 x1Var, androidx.camera.core.impl.r0 r0Var, Runnable runnable) {
        this.F.remove(x1Var);
        com.google.common.util.concurrent.f<Void> l02 = l0(x1Var, false);
        r0Var.d();
        a0.f.n(Arrays.asList(l02, r0Var.k())).addListener(runnable, z.a.a());
    }

    @Override // androidx.camera.core.impl.c0
    public void l(androidx.camera.core.impl.u uVar) {
        if (uVar == null) {
            uVar = androidx.camera.core.impl.x.a();
        }
        androidx.camera.core.impl.z1 V = uVar.V(null);
        this.K = uVar;
        synchronized (this.L) {
            this.M = V;
        }
    }

    com.google.common.util.concurrent.f<Void> l0(y1 y1Var, boolean z10) {
        y1Var.close();
        com.google.common.util.concurrent.f<Void> c10 = y1Var.c(z10);
        H("Releasing session in state " + this.f2051e.name());
        this.A.put(y1Var, c10);
        a0.f.b(c10, new a(y1Var), z.a.a());
        return c10;
    }

    @Override // androidx.camera.core.w.d
    public void n(androidx.camera.core.w wVar) {
        androidx.core.util.h.k(wVar);
        this.f2049c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.b0

            /* renamed from: b */
            public final /* synthetic */ String f1819b;

            public /* synthetic */ b0(String str) {
                r2 = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                j0.this.Z(r2);
            }
        });
    }

    void n0(boolean z10) {
        androidx.core.util.h.m(this.f2059x != null);
        H("Resetting Capture Session");
        y1 y1Var = this.f2059x;
        androidx.camera.core.impl.y1 e10 = y1Var.e();
        List<androidx.camera.core.impl.l0> d10 = y1Var.d();
        y1 d02 = d0();
        this.f2059x = d02;
        d02.f(e10);
        this.f2059x.a(d10);
        l0(y1Var, z10);
    }

    void p0(g gVar) {
        q0(gVar, null);
    }

    void q0(g gVar, q.a aVar) {
        r0(gVar, aVar, true);
    }

    void r0(g gVar, q.a aVar, boolean z10) {
        c0.a aVar2;
        H("Transitioning camera internal state: " + this.f2051e + " --> " + gVar);
        this.f2051e = gVar;
        switch (c.f2065a[gVar.ordinal()]) {
            case 1:
                aVar2 = c0.a.CLOSED;
                break;
            case 2:
                aVar2 = c0.a.PENDING_OPEN;
                break;
            case 3:
                aVar2 = c0.a.CLOSING;
                break;
            case 4:
                aVar2 = c0.a.OPEN;
                break;
            case 5:
                aVar2 = c0.a.CONFIGURED;
                break;
            case 6:
            case 7:
                aVar2 = c0.a.OPENING;
                break;
            case 8:
                aVar2 = c0.a.RELEASING;
                break;
            case 9:
                aVar2 = c0.a.RELEASED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + gVar);
        }
        this.E.e(this, aVar2, z10);
        this.f2052f.a(aVar2);
        this.f2053r.c(aVar2, aVar);
    }

    void s0(List<androidx.camera.core.impl.l0> list) {
        ArrayList arrayList = new ArrayList();
        for (androidx.camera.core.impl.l0 l0Var : list) {
            l0.a k10 = l0.a.k(l0Var);
            if (l0Var.h() == 5 && l0Var.c() != null) {
                k10.o(l0Var.c());
            }
            if (!l0Var.f().isEmpty() || !l0Var.i() || C(k10)) {
                arrayList.add(k10.h());
            }
        }
        H("Issue capture request");
        this.f2059x.a(arrayList);
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f2056u.b());
    }

    void w0(boolean z10) {
        H("Attempting to force open the camera.");
        if (this.E.h(this)) {
            g0(z10);
        } else {
            H("No cameras available. Waiting for available camera before opening camera.");
            p0(g.PENDING_OPEN);
        }
    }

    void x0(boolean z10) {
        H("Attempting to open the camera.");
        if (this.B.b() && this.E.h(this)) {
            g0(z10);
        } else {
            H("No cameras available. Waiting for available camera before opening camera.");
            p0(g.PENDING_OPEN);
        }
    }

    void y0() {
        y1.g d10 = this.f2047a.d();
        if (!d10.e()) {
            this.f2054s.X();
            this.f2059x.f(this.f2054s.z());
            return;
        }
        this.f2054s.a0(d10.b().l());
        d10.a(this.f2054s.z());
        this.f2059x.f(d10.b());
    }
}

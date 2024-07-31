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
import androidx.camera.camera2.internal.C0503j0;
import androidx.camera.camera2.internal.C0506j3;
import androidx.camera.camera2.internal.C0525n2;
import androidx.camera.camera2.internal.compat.C0418a;
import androidx.camera.camera2.internal.compat.C0427d0;
import androidx.camera.camera2.internal.compat.C0434h;
import androidx.camera.camera2.internal.compat.C0455r0;
import androidx.camera.core.AbstractC0718w;
import androidx.camera.core.C0714s;
import androidx.camera.core.impl.AbstractC0661r0;
import androidx.camera.core.impl.C0626h0;
import androidx.camera.core.impl.C0627h1;
import androidx.camera.core.impl.C0635j1;
import androidx.camera.core.impl.C0636j2;
import androidx.camera.core.impl.C0642l0;
import androidx.camera.core.impl.C0696x;
import androidx.camera.core.impl.C0701y1;
import androidx.camera.core.impl.InterfaceC0602b0;
import androidx.camera.core.impl.InterfaceC0606c0;
import androidx.camera.core.impl.InterfaceC0640k2;
import androidx.camera.core.impl.InterfaceC0669u;
import androidx.camera.core.impl.InterfaceC0699y;
import androidx.camera.core.impl.InterfaceC0704z1;
import androidx.concurrent.futures.C0742c;
import androidx.core.util.C0984h;
import com.facebook.ads.AdError;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
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
import p002a0.C0009f;
import p002a0.InterfaceC0006c;
import p320r.C10553b;
import p342s.C10750l;
import p407w.AbstractC12032q;
import p407w.C12029o0;
import p429x.InterfaceC12249a;
import p474z.C12747a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.j0 */
/* loaded from: classes.dex */
public final class C0503j0 implements InterfaceC0606c0 {

    /* renamed from: A */
    final Map<InterfaceC0579y1, InterfaceFutureC5920f<Void>> f2350A;

    /* renamed from: B */
    final d f2351B;

    /* renamed from: C */
    final e f2352C;

    /* renamed from: D */
    final InterfaceC12249a f2353D;

    /* renamed from: E */
    final C0626h0 f2354E;

    /* renamed from: F */
    final Set<C0574x1> f2355F;

    /* renamed from: G */
    private C0525n2 f2356G;

    /* renamed from: H */
    private final C0404a2 f2357H;

    /* renamed from: I */
    private final C0506j3.a f2358I;

    /* renamed from: J */
    private final Set<String> f2359J;

    /* renamed from: K */
    private InterfaceC0669u f2360K;

    /* renamed from: L */
    final Object f2361L;

    /* renamed from: M */
    private InterfaceC0704z1 f2362M;

    /* renamed from: N */
    boolean f2363N;

    /* renamed from: O */
    private final C0416c2 f2364O;

    /* renamed from: P */
    private final C0427d0 f2365P;

    /* renamed from: Q */
    private final C10553b f2366Q;

    /* renamed from: a */
    private final C0636j2 f2367a;

    /* renamed from: b */
    private final C0455r0 f2368b;

    /* renamed from: c */
    private final Executor f2369c;

    /* renamed from: d */
    private final ScheduledExecutorService f2370d;

    /* renamed from: e */
    volatile g f2371e = g.INITIALIZED;

    /* renamed from: f */
    private final C0635j1<InterfaceC0606c0.a> f2372f;

    /* renamed from: r */
    private final C0534p1 f2373r;

    /* renamed from: s */
    private final C0557u f2374s;

    /* renamed from: t */
    private final h f2375t;

    /* renamed from: u */
    final C0523n0 f2376u;

    /* renamed from: v */
    CameraDevice f2377v;

    /* renamed from: w */
    int f2378w;

    /* renamed from: x */
    InterfaceC0579y1 f2379x;

    /* renamed from: y */
    final AtomicInteger f2380y;

    /* renamed from: z */
    C0742c.a<Void> f2381z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.j0$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC0006c<Void> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC0579y1 f2382a;

        a(InterfaceC0579y1 interfaceC0579y1) {
            this.f2382a = interfaceC0579y1;
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: a */
        public void mo8a(Throwable th2) {
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            CameraDevice cameraDevice;
            C0503j0.this.f2350A.remove(this.f2382a);
            int i10 = c.f2385a[C0503j0.this.f2371e.ordinal()];
            if (i10 != 3) {
                if (i10 != 7) {
                    if (i10 != 8) {
                        return;
                    }
                } else if (C0503j0.this.f2378w == 0) {
                    return;
                }
            }
            if (!C0503j0.this.m2487Q() || (cameraDevice = C0503j0.this.f2377v) == null) {
                return;
            }
            C0418a.m2200a(cameraDevice);
            C0503j0.this.f2377v = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.j0$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC0006c<Void> {
        b() {
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: a */
        public void mo8a(Throwable th2) {
            if (th2 instanceof AbstractC0661r0.a) {
                C0701y1 m2484J = C0503j0.this.m2484J(((AbstractC0661r0.a) th2).m3234a());
                if (m2484J != null) {
                    C0503j0.this.m2496j0(m2484J);
                    return;
                }
                return;
            }
            if (th2 instanceof CancellationException) {
                C0503j0.this.m2483H("Unable to configure camera cancelled");
                return;
            }
            g gVar = C0503j0.this.f2371e;
            g gVar2 = g.OPENED;
            if (gVar == gVar2) {
                C0503j0.this.m2504q0(gVar2, AbstractC12032q.a.m38662b(4, th2));
            }
            if (th2 instanceof CameraAccessException) {
                C0503j0.this.m2483H("Unable to configure camera due to " + th2.getMessage());
                return;
            }
            if (th2 instanceof TimeoutException) {
                C12029o0.m38640c("Camera2CameraImpl", "Unable to configure camera " + C0503j0.this.f2376u.mo2559b() + ", timeout!");
            }
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            if (C0503j0.this.f2353D.mo35289b() == 2 && C0503j0.this.f2371e == g.OPENED) {
                C0503j0.this.m2503p0(g.CONFIGURED);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.j0$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f2385a;

        static {
            int[] iArr = new int[g.values().length];
            f2385a = iArr;
            try {
                iArr[g.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2385a[g.PENDING_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2385a[g.CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2385a[g.OPENED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2385a[g.CONFIGURED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2385a[g.OPENING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2385a[g.REOPENING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2385a[g.RELEASING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2385a[g.RELEASED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.j0$d */
    /* loaded from: classes.dex */
    public final class d extends CameraManager.AvailabilityCallback implements C0626h0.c {

        /* renamed from: a */
        private final String f2386a;

        /* renamed from: b */
        private boolean f2387b = true;

        d(String str) {
            this.f2386a = str;
        }

        @Override // androidx.camera.core.impl.C0626h0.c
        /* renamed from: a */
        public void mo2512a() {
            if (C0503j0.this.f2371e == g.PENDING_OPEN) {
                C0503j0.this.m2508x0(false);
            }
        }

        /* renamed from: b */
        boolean m2513b() {
            return this.f2387b;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            if (this.f2386a.equals(str)) {
                this.f2387b = true;
                if (C0503j0.this.f2371e == g.PENDING_OPEN) {
                    C0503j0.this.m2508x0(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            if (this.f2386a.equals(str)) {
                this.f2387b = false;
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.j0$e */
    /* loaded from: classes.dex */
    final class e implements C0626h0.b {
        e() {
        }

        @Override // androidx.camera.core.impl.C0626h0.b
        /* renamed from: a */
        public void mo2514a() {
            if (C0503j0.this.f2371e == g.OPENED) {
                C0503j0.this.m2494h0();
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.j0$f */
    /* loaded from: classes.dex */
    final class f implements InterfaceC0699y.c {
        f() {
        }

        @Override // androidx.camera.core.impl.InterfaceC0699y.c
        /* renamed from: a */
        public void mo2515a() {
            C0503j0.this.m2509y0();
        }

        @Override // androidx.camera.core.impl.InterfaceC0699y.c
        /* renamed from: b */
        public void mo2516b(List<C0642l0> list) {
            C0503j0.this.m2506s0((List) C0984h.m4833k(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.j0$g */
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.j0$h */
    /* loaded from: classes.dex */
    public final class h extends CameraDevice.StateCallback {

        /* renamed from: a */
        private final Executor f2391a;

        /* renamed from: b */
        private final ScheduledExecutorService f2392b;

        /* renamed from: c */
        private b f2393c;

        /* renamed from: d */
        ScheduledFuture<?> f2394d;

        /* renamed from: e */
        private final a f2395e = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.camera.camera2.internal.j0$h$a */
        /* loaded from: classes.dex */
        public class a {

            /* renamed from: a */
            private long f2397a = -1;

            a() {
            }

            /* renamed from: a */
            boolean m2524a() {
                if (!(m2525b() >= ((long) m2527d()))) {
                    return true;
                }
                m2528e();
                return false;
            }

            /* renamed from: b */
            long m2525b() {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f2397a == -1) {
                    this.f2397a = uptimeMillis;
                }
                return uptimeMillis - this.f2397a;
            }

            /* renamed from: c */
            int m2526c() {
                if (!h.this.m2523f()) {
                    return 700;
                }
                long m2525b = m2525b();
                if (m2525b <= 120000) {
                    return AdError.NETWORK_ERROR_CODE;
                }
                if (m2525b <= 300000) {
                    return AdError.SERVER_ERROR_CODE;
                }
                return 4000;
            }

            /* renamed from: d */
            int m2527d() {
                if (h.this.m2523f()) {
                    return 1800000;
                }
                return ModuleDescriptor.MODULE_VERSION;
            }

            /* renamed from: e */
            void m2528e() {
                this.f2397a = -1L;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.camera.camera2.internal.j0$h$b */
        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: a */
            private Executor f2399a;

            /* renamed from: b */
            private boolean f2400b = false;

            b(Executor executor) {
                this.f2399a = executor;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: c */
            public /* synthetic */ void m2530c() {
                if (this.f2400b) {
                    return;
                }
                C0984h.m4835m(C0503j0.this.f2371e == g.REOPENING);
                if (h.this.m2523f()) {
                    C0503j0.this.m2507w0(true);
                } else {
                    C0503j0.this.m2508x0(true);
                }
            }

            /* renamed from: b */
            void m2531b() {
                this.f2400b = true;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f2399a.execute(new Runnable() { // from class: androidx.camera.camera2.internal.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0503j0.h.b.this.m2530c();
                    }
                });
            }
        }

        h(Executor executor, ScheduledExecutorService scheduledExecutorService) {
            this.f2391a = executor;
            this.f2392b = scheduledExecutorService;
        }

        /* renamed from: b */
        private void m2518b(CameraDevice cameraDevice, int i10) {
            C0984h.m4836n(C0503j0.this.f2371e == g.OPENING || C0503j0.this.f2371e == g.OPENED || C0503j0.this.f2371e == g.CONFIGURED || C0503j0.this.f2371e == g.REOPENING, "Attempt to handle open error from non open state: " + C0503j0.this.f2371e);
            if (i10 == 1 || i10 == 2 || i10 == 4) {
                C12029o0.m38638a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), C0503j0.m2443L(i10)));
                m2519c(i10);
                return;
            }
            C12029o0.m38640c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + C0503j0.m2443L(i10) + " closing camera.");
            C0503j0.this.m2504q0(g.CLOSING, AbstractC12032q.a.m38661a(i10 == 3 ? 5 : 6));
            C0503j0.this.m2482D(false);
        }

        /* renamed from: c */
        private void m2519c(int i10) {
            int i11 = 1;
            C0984h.m4836n(C0503j0.this.f2378w != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i10 == 1) {
                i11 = 2;
            } else if (i10 != 2) {
                i11 = 3;
            }
            C0503j0.this.m2504q0(g.REOPENING, AbstractC12032q.a.m38661a(i11));
            C0503j0.this.m2482D(false);
        }

        /* renamed from: a */
        boolean m2520a() {
            if (this.f2394d == null) {
                return false;
            }
            C0503j0.this.m2483H("Cancelling scheduled re-open: " + this.f2393c);
            this.f2393c.m2531b();
            this.f2393c = null;
            this.f2394d.cancel(false);
            this.f2394d = null;
            return true;
        }

        /* renamed from: d */
        void m2521d() {
            this.f2395e.m2528e();
        }

        /* renamed from: e */
        void m2522e() {
            C0984h.m4835m(this.f2393c == null);
            C0984h.m4835m(this.f2394d == null);
            if (!this.f2395e.m2524a()) {
                C12029o0.m38640c("Camera2CameraImpl", "Camera reopening attempted for " + this.f2395e.m2527d() + "ms without success.");
                C0503j0.this.m2505r0(g.PENDING_OPEN, null, false);
                return;
            }
            this.f2393c = new b(this.f2391a);
            C0503j0.this.m2483H("Attempting camera re-open in " + this.f2395e.m2526c() + "ms: " + this.f2393c + " activeResuming = " + C0503j0.this.f2363N);
            this.f2394d = this.f2392b.schedule(this.f2393c, (long) this.f2395e.m2526c(), TimeUnit.MILLISECONDS);
        }

        /* renamed from: f */
        boolean m2523f() {
            int i10;
            C0503j0 c0503j0 = C0503j0.this;
            return c0503j0.f2363N && ((i10 = c0503j0.f2378w) == 1 || i10 == 2);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            C0503j0.this.m2483H("CameraDevice.onClosed()");
            C0984h.m4836n(C0503j0.this.f2377v == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int i10 = c.f2385a[C0503j0.this.f2371e.ordinal()];
            if (i10 != 3) {
                if (i10 == 7) {
                    C0503j0 c0503j0 = C0503j0.this;
                    if (c0503j0.f2378w == 0) {
                        c0503j0.m2508x0(false);
                        return;
                    }
                    c0503j0.m2483H("Camera closed due to error: " + C0503j0.m2443L(C0503j0.this.f2378w));
                    m2522e();
                    return;
                }
                if (i10 != 8) {
                    throw new IllegalStateException("Camera closed while in state: " + C0503j0.this.f2371e);
                }
            }
            C0984h.m4835m(C0503j0.this.m2487Q());
            C0503j0.this.m2485K();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            C0503j0.this.m2483H("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            C0503j0 c0503j0 = C0503j0.this;
            c0503j0.f2377v = cameraDevice;
            c0503j0.f2378w = i10;
            switch (c.f2385a[c0503j0.f2371e.ordinal()]) {
                case 3:
                case 8:
                    C12029o0.m38640c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), C0503j0.m2443L(i10), C0503j0.this.f2371e.name()));
                    C0503j0.this.m2482D(false);
                    return;
                case 4:
                case 5:
                case 6:
                case 7:
                    C12029o0.m38638a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), C0503j0.m2443L(i10), C0503j0.this.f2371e.name()));
                    m2518b(cameraDevice, i10);
                    return;
                default:
                    throw new IllegalStateException("onError() should not be possible from state: " + C0503j0.this.f2371e);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            C0503j0.this.m2483H("CameraDevice.onOpened()");
            C0503j0 c0503j0 = C0503j0.this;
            c0503j0.f2377v = cameraDevice;
            c0503j0.f2378w = 0;
            m2521d();
            int i10 = c.f2385a[C0503j0.this.f2371e.ordinal()];
            if (i10 != 3) {
                if (i10 == 6 || i10 == 7) {
                    C0503j0.this.m2503p0(g.OPENED);
                    C0626h0 c0626h0 = C0503j0.this.f2354E;
                    String id2 = cameraDevice.getId();
                    C0503j0 c0503j02 = C0503j0.this;
                    if (c0626h0.m3095i(id2, c0503j02.f2353D.mo35288a(c0503j02.f2377v.getId()))) {
                        C0503j0.this.m2494h0();
                        return;
                    }
                    return;
                }
                if (i10 != 8) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + C0503j0.this.f2371e);
                }
            }
            C0984h.m4835m(C0503j0.this.m2487Q());
            C0503j0.this.f2377v.close();
            C0503j0.this.f2377v = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.j0$i */
    /* loaded from: classes.dex */
    public static abstract class i {
        /* renamed from: a */
        static i m2532a(String str, Class<?> cls, C0701y1 c0701y1, InterfaceC0640k2<?> interfaceC0640k2, Size size) {
            return new C0472d(str, cls, c0701y1, interfaceC0640k2, size);
        }

        /* renamed from: b */
        static i m2533b(AbstractC0718w abstractC0718w) {
            return m2532a(C0503j0.m2445N(abstractC0718w), abstractC0718w.getClass(), abstractC0718w.m3564s(), abstractC0718w.m3556i(), abstractC0718w.m3552e());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract C0701y1 mo2310c();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract Size mo2311d();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract InterfaceC0640k2<?> mo2312e();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public abstract String mo2313f();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: g */
        public abstract Class<?> mo2314g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0503j0(C0455r0 c0455r0, String str, C0523n0 c0523n0, InterfaceC12249a interfaceC12249a, C0626h0 c0626h0, Executor executor, Handler handler, C0416c2 c0416c2) {
        C0635j1<InterfaceC0606c0.a> c0635j1 = new C0635j1<>();
        this.f2372f = c0635j1;
        this.f2378w = 0;
        this.f2380y = new AtomicInteger(0);
        this.f2350A = new LinkedHashMap();
        this.f2355F = new HashSet();
        this.f2359J = new HashSet();
        this.f2360K = C0696x.m3377a();
        this.f2361L = new Object();
        this.f2363N = false;
        this.f2368b = c0455r0;
        this.f2353D = interfaceC12249a;
        this.f2354E = c0626h0;
        ScheduledExecutorService m42284e = C12747a.m42284e(handler);
        this.f2370d = m42284e;
        Executor m42285f = C12747a.m42285f(executor);
        this.f2369c = m42285f;
        this.f2375t = new h(m42285f, m42284e);
        this.f2367a = new C0636j2(str);
        c0635j1.m3104a(InterfaceC0606c0.a.CLOSED);
        C0534p1 c0534p1 = new C0534p1(c0626h0);
        this.f2373r = c0534p1;
        C0404a2 c0404a2 = new C0404a2(m42285f);
        this.f2357H = c0404a2;
        this.f2364O = c0416c2;
        try {
            C0427d0 m2276c = c0455r0.m2276c(str);
            this.f2365P = m2276c;
            C0557u c0557u = new C0557u(m2276c, m42284e, m42285f, new f(), c0523n0.mo2562e());
            this.f2374s = c0557u;
            this.f2376u = c0523n0;
            c0523n0.m2571o(c0557u);
            c0523n0.m2572r(c0534p1.m2597a());
            this.f2366Q = C10553b.m32038a(m2276c);
            this.f2379x = m2459d0();
            this.f2358I = new C0506j3.a(m42285f, m42284e, handler, c0404a2, c0523n0.mo2562e(), C10750l.m32700b());
            d dVar = new d(str);
            this.f2351B = dVar;
            e eVar = new e();
            this.f2352C = eVar;
            c0626h0.m3093g(this, m42285f, eVar, dVar);
            c0455r0.m2280g(m42285f, dVar);
        } catch (C0434h e10) {
            throw C0539q1.m2610a(e10);
        }
    }

    /* renamed from: A */
    private void m2436A() {
        C0525n2 c0525n2 = this.f2356G;
        if (c0525n2 != null) {
            String m2444M = m2444M(c0525n2);
            this.f2367a.m3124r(m2444M, this.f2356G.m2585g(), this.f2356G.m2586h());
            this.f2367a.m3123q(m2444M, this.f2356G.m2585g(), this.f2356G.m2586h());
        }
    }

    /* renamed from: B */
    private void m2437B() {
        C0701y1 m3417b = this.f2367a.m3118f().m3417b();
        C0642l0 m3386h = m3417b.m3386h();
        int size = m3386h.m3154f().size();
        int size2 = m3417b.m3389k().size();
        if (m3417b.m3389k().isEmpty()) {
            return;
        }
        if (m3386h.m3154f().isEmpty()) {
            if (this.f2356G == null) {
                this.f2356G = new C0525n2(this.f2376u.m2568l(), this.f2364O, new C0525n2.c() { // from class: androidx.camera.camera2.internal.z
                    @Override // androidx.camera.camera2.internal.C0525n2.c
                    /* renamed from: a */
                    public final void mo2590a() {
                        C0503j0.this.m2447R();
                    }
                });
            }
            m2436A();
        } else {
            if ((size2 == 1 && size == 1) || size >= 2) {
                m2464m0();
                return;
            }
            C12029o0.m38638a("Camera2CameraImpl", "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
        }
    }

    /* renamed from: C */
    private boolean m2438C(C0642l0.a aVar) {
        String str;
        if (aVar.m3170m().isEmpty()) {
            Iterator<C0701y1> it = this.f2367a.m3117e().iterator();
            while (it.hasNext()) {
                List<AbstractC0661r0> m3154f = it.next().m3386h().m3154f();
                if (!m3154f.isEmpty()) {
                    Iterator<AbstractC0661r0> it2 = m3154f.iterator();
                    while (it2.hasNext()) {
                        aVar.m3165f(it2.next());
                    }
                }
            }
            if (!aVar.m3170m().isEmpty()) {
                return true;
            }
            str = "Unable to find a repeating surface to attach to CaptureConfig";
        } else {
            str = "The capture config builder already has surface inside.";
        }
        C12029o0.m38648k("Camera2CameraImpl", str);
        return false;
    }

    /* renamed from: E */
    private void m2439E() {
        m2483H("Closing camera.");
        int i10 = c.f2385a[this.f2371e.ordinal()];
        if (i10 == 2) {
            C0984h.m4835m(this.f2377v == null);
            m2503p0(g.INITIALIZED);
            return;
        }
        if (i10 == 4 || i10 == 5) {
            m2503p0(g.CLOSING);
            m2482D(false);
            return;
        }
        if (i10 != 6 && i10 != 7) {
            m2483H("close() ignored due to being in state: " + this.f2371e);
            return;
        }
        boolean m2520a = this.f2375t.m2520a();
        m2503p0(g.CLOSING);
        if (m2520a) {
            C0984h.m4835m(m2487Q());
            m2485K();
        }
    }

    /* renamed from: F */
    private void m2440F(boolean z10) {
        final C0574x1 c0574x1 = new C0574x1(this.f2366Q);
        this.f2355F.add(c0574x1);
        m2502n0(z10);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final Runnable runnable = new Runnable() { // from class: androidx.camera.camera2.internal.i0
            @Override // java.lang.Runnable
            public final void run() {
                C0503j0.m2449T(surface, surfaceTexture);
            }
        };
        C0701y1.b bVar = new C0701y1.b();
        final C0627h1 c0627h1 = new C0627h1(surface);
        bVar.m3399h(c0627h1);
        bVar.m3410t(1);
        m2483H("Start configAndClose.");
        c0574x1.mo2677g(bVar.m3406o(), (CameraDevice) C0984h.m4833k(this.f2377v), this.f2358I.m2541a()).addListener(new Runnable() { // from class: androidx.camera.camera2.internal.y
            @Override // java.lang.Runnable
            public final void run() {
                C0503j0.this.m2450U(c0574x1, c0627h1, runnable);
            }
        }, this.f2369c);
    }

    /* renamed from: G */
    private CameraDevice.StateCallback m2441G() {
        ArrayList arrayList = new ArrayList(this.f2367a.m3118f().m3417b().m3380b());
        arrayList.add(this.f2357H.m2154c());
        arrayList.add(this.f2375t);
        return C0524n1.m2575a(arrayList);
    }

    /* renamed from: I */
    private void m2442I(String str, Throwable th2) {
        C12029o0.m38639b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th2);
    }

    /* renamed from: L */
    static String m2443L(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    /* renamed from: M */
    static String m2444M(C0525n2 c0525n2) {
        return c0525n2.m2584e() + c0525n2.hashCode();
    }

    /* renamed from: N */
    static String m2445N(AbstractC0718w abstractC0718w) {
        return abstractC0718w.m3560n() + abstractC0718w.hashCode();
    }

    /* renamed from: O */
    private boolean m2446O() {
        return ((C0523n0) mo2495i()).m2570n() == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m2447R() {
        if (m2486P()) {
            m2466o0(m2444M(this.f2356G), this.f2356G.m2585g(), this.f2356G.m2586h());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m2448S(List list) {
        try {
            m2474u0(list);
        } finally {
            this.f2374s.m2738v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public static /* synthetic */ void m2449T(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ void m2452W(C0742c.a aVar) {
        Boolean valueOf;
        C0525n2 c0525n2 = this.f2356G;
        if (c0525n2 == null) {
            valueOf = Boolean.FALSE;
        } else {
            valueOf = Boolean.valueOf(this.f2367a.m3121l(m2444M(c0525n2)));
        }
        aVar.m3756c(valueOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ Object m2453X(final C0742c.a aVar) {
        try {
            this.f2369c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.a0
                @Override // java.lang.Runnable
                public final void run() {
                    C0503j0.this.m2452W(aVar);
                }
            });
            return "isMeteringRepeatingAttached";
        } catch (RejectedExecutionException unused) {
            aVar.m3758f(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m2454Y(String str, C0701y1 c0701y1, InterfaceC0640k2 interfaceC0640k2) {
        m2483H("Use case " + str + " ACTIVE");
        this.f2367a.m3123q(str, c0701y1, interfaceC0640k2);
        this.f2367a.m3127u(str, c0701y1, interfaceC0640k2);
        m2509y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ void m2455Z(String str) {
        m2483H("Use case " + str + " INACTIVE");
        this.f2367a.m3126t(str);
        m2509y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static /* synthetic */ void m2456a0(C0701y1.c cVar, C0701y1 c0701y1) {
        cVar.mo2550a(c0701y1, C0701y1.f.SESSION_ERROR_SURFACE_NEEDS_RESET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ void m2457b0(String str, C0701y1 c0701y1, InterfaceC0640k2 interfaceC0640k2) {
        m2483H("Use case " + str + " RESET");
        this.f2367a.m3127u(str, c0701y1, interfaceC0640k2);
        m2437B();
        m2502n0(false);
        m2509y0();
        if (this.f2371e == g.OPENED) {
            m2494h0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public /* synthetic */ void m2458c0(boolean z10) {
        this.f2363N = z10;
        if (z10 && this.f2371e == g.PENDING_OPEN) {
            m2507w0(false);
        }
    }

    /* renamed from: d0 */
    private InterfaceC0579y1 m2459d0() {
        synchronized (this.f2361L) {
            if (this.f2362M == null) {
                return new C0574x1(this.f2366Q);
            }
            return new C0555t2(this.f2362M, this.f2376u, this.f2366Q, this.f2369c, this.f2370d);
        }
    }

    /* renamed from: e0 */
    private void m2460e0(List<AbstractC0718w> list) {
        for (AbstractC0718w abstractC0718w : list) {
            String m2445N = m2445N(abstractC0718w);
            if (!this.f2359J.contains(m2445N)) {
                this.f2359J.add(m2445N);
                abstractC0718w.mo3543I();
                abstractC0718w.mo3451G();
            }
        }
    }

    /* renamed from: f0 */
    private void m2461f0(List<AbstractC0718w> list) {
        for (AbstractC0718w abstractC0718w : list) {
            String m2445N = m2445N(abstractC0718w);
            if (this.f2359J.contains(m2445N)) {
                abstractC0718w.mo3452J();
                this.f2359J.remove(m2445N);
            }
        }
    }

    /* renamed from: g0 */
    private void m2462g0(boolean z10) {
        if (!z10) {
            this.f2375t.m2521d();
        }
        this.f2375t.m2520a();
        m2483H("Opening camera.");
        m2503p0(g.OPENING);
        try {
            this.f2368b.m2279f(this.f2376u.mo2559b(), this.f2369c, m2441G());
        } catch (C0434h e10) {
            m2483H("Unable to open camera due to " + e10.getMessage());
            if (e10.m2236d() != 10001) {
                return;
            }
            m2504q0(g.INITIALIZED, AbstractC12032q.a.m38662b(7, e10));
        } catch (SecurityException e11) {
            m2483H("Unable to open camera due to " + e11.getMessage());
            m2503p0(g.REOPENING);
            this.f2375t.m2522e();
        }
    }

    /* renamed from: i0 */
    private void m2463i0() {
        int i10 = c.f2385a[this.f2371e.ordinal()];
        if (i10 == 1 || i10 == 2) {
            m2507w0(false);
            return;
        }
        if (i10 != 3) {
            m2483H("open() ignored due to being in state: " + this.f2371e);
            return;
        }
        m2503p0(g.REOPENING);
        if (m2487Q() || this.f2378w != 0) {
            return;
        }
        C0984h.m4836n(this.f2377v != null, "Camera Device should be open if session close is not complete");
        m2503p0(g.OPENED);
        m2494h0();
    }

    /* renamed from: m0 */
    private void m2464m0() {
        if (this.f2356G != null) {
            this.f2367a.m3125s(this.f2356G.m2584e() + this.f2356G.hashCode());
            this.f2367a.m3126t(this.f2356G.m2584e() + this.f2356G.hashCode());
            this.f2356G.m2582c();
            this.f2356G = null;
        }
    }

    /* renamed from: o0 */
    private void m2466o0(final String str, final C0701y1 c0701y1, final InterfaceC0640k2<?> interfaceC0640k2) {
        this.f2369c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.f0
            @Override // java.lang.Runnable
            public final void run() {
                C0503j0.this.m2457b0(str, c0701y1, interfaceC0640k2);
            }
        });
    }

    /* renamed from: t0 */
    private Collection<i> m2472t0(Collection<AbstractC0718w> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC0718w> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(i.m2533b(it.next()));
        }
        return arrayList;
    }

    /* renamed from: u0 */
    private void m2474u0(Collection<i> collection) {
        Size mo2311d;
        boolean isEmpty = this.f2367a.m3119g().isEmpty();
        ArrayList arrayList = new ArrayList();
        Rational rational = null;
        for (i iVar : collection) {
            if (!this.f2367a.m3121l(iVar.mo2313f())) {
                this.f2367a.m3124r(iVar.mo2313f(), iVar.mo2310c(), iVar.mo2312e());
                arrayList.add(iVar.mo2313f());
                if (iVar.mo2314g() == C0714s.class && (mo2311d = iVar.mo2311d()) != null) {
                    rational = new Rational(mo2311d.getWidth(), mo2311d.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        m2483H("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (isEmpty) {
            this.f2374s.m2718Y(true);
            this.f2374s.m2714I();
        }
        m2437B();
        m2481z0();
        m2509y0();
        m2502n0(false);
        if (this.f2371e == g.OPENED) {
            m2494h0();
        } else {
            m2463i0();
        }
        if (rational != null) {
            this.f2374s.m2719Z(rational);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public void m2451V(Collection<i> collection) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (i iVar : collection) {
            if (this.f2367a.m3121l(iVar.mo2313f())) {
                this.f2367a.m3122p(iVar.mo2313f());
                arrayList.add(iVar.mo2313f());
                if (iVar.mo2314g() == C0714s.class) {
                    z10 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        m2483H("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z10) {
            this.f2374s.m2719Z(null);
        }
        m2437B();
        if (this.f2367a.m3120h().isEmpty()) {
            this.f2374s.m2723b0(false);
        } else {
            m2481z0();
        }
        if (this.f2367a.m3119g().isEmpty()) {
            this.f2374s.m2738v();
            m2502n0(false);
            this.f2374s.m2718Y(false);
            this.f2379x = m2459d0();
            m2439E();
            return;
        }
        m2509y0();
        m2502n0(false);
        if (this.f2371e == g.OPENED) {
            m2494h0();
        }
    }

    /* renamed from: z0 */
    private void m2481z0() {
        Iterator<InterfaceC0640k2<?>> it = this.f2367a.m3120h().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= it.next().m3141K(false);
        }
        this.f2374s.m2723b0(z10);
    }

    /* renamed from: D */
    void m2482D(boolean z10) {
        C0984h.m4836n(this.f2371e == g.CLOSING || this.f2371e == g.RELEASING || (this.f2371e == g.REOPENING && this.f2378w != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f2371e + " (error: " + m2443L(this.f2378w) + ")");
        if (Build.VERSION.SDK_INT < 29 && m2446O() && this.f2378w == 0) {
            m2440F(z10);
        } else {
            m2502n0(z10);
        }
        this.f2379x.mo2672b();
    }

    /* renamed from: H */
    void m2483H(String str) {
        m2442I(str, null);
    }

    /* renamed from: J */
    C0701y1 m2484J(AbstractC0661r0 abstractC0661r0) {
        for (C0701y1 c0701y1 : this.f2367a.m3119g()) {
            if (c0701y1.m3389k().contains(abstractC0661r0)) {
                return c0701y1;
            }
        }
        return null;
    }

    /* renamed from: K */
    void m2485K() {
        C0984h.m4835m(this.f2371e == g.RELEASING || this.f2371e == g.CLOSING);
        C0984h.m4835m(this.f2350A.isEmpty());
        this.f2377v = null;
        if (this.f2371e == g.CLOSING) {
            m2503p0(g.INITIALIZED);
            return;
        }
        this.f2368b.m2281h(this.f2351B);
        m2503p0(g.RELEASED);
        C0742c.a<Void> aVar = this.f2381z;
        if (aVar != null) {
            aVar.m3756c(null);
            this.f2381z = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: P */
    boolean m2486P() {
        try {
            return ((Boolean) C0742c.m3752a(new C0742c.c() { // from class: androidx.camera.camera2.internal.x
                @Override // androidx.concurrent.futures.C0742c.c
                /* renamed from: a */
                public final Object mo14a(C0742c.a aVar) {
                    Object m2453X;
                    m2453X = C0503j0.this.m2453X(aVar);
                    return m2453X;
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e10);
        }
    }

    /* renamed from: Q */
    boolean m2487Q() {
        return this.f2350A.isEmpty() && this.f2355F.isEmpty();
    }

    @Override // androidx.camera.core.AbstractC0718w.d
    /* renamed from: c */
    public void mo2488c(AbstractC0718w abstractC0718w) {
        C0984h.m4833k(abstractC0718w);
        final String m2445N = m2445N(abstractC0718w);
        final C0701y1 m3564s = abstractC0718w.m3564s();
        final InterfaceC0640k2<?> m3556i = abstractC0718w.m3556i();
        this.f2369c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.d0
            @Override // java.lang.Runnable
            public final void run() {
                C0503j0.this.m2454Y(m2445N, m3564s, m3556i);
            }
        });
    }

    @Override // androidx.camera.core.impl.InterfaceC0606c0
    /* renamed from: d */
    public InterfaceC0699y mo2489d() {
        return this.f2374s;
    }

    @Override // androidx.camera.core.impl.InterfaceC0606c0
    /* renamed from: e */
    public InterfaceC0669u mo2490e() {
        return this.f2360K;
    }

    @Override // androidx.camera.core.impl.InterfaceC0606c0
    /* renamed from: f */
    public void mo2491f(final boolean z10) {
        this.f2369c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.c0
            @Override // java.lang.Runnable
            public final void run() {
                C0503j0.this.m2458c0(z10);
            }
        });
    }

    @Override // androidx.camera.core.impl.InterfaceC0606c0
    /* renamed from: g */
    public void mo2492g(Collection<AbstractC0718w> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f2374s.m2714I();
        m2460e0(new ArrayList(arrayList));
        final ArrayList arrayList2 = new ArrayList(m2472t0(arrayList));
        try {
            this.f2369c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.h0
                @Override // java.lang.Runnable
                public final void run() {
                    C0503j0.this.m2448S(arrayList2);
                }
            });
        } catch (RejectedExecutionException e10) {
            m2442I("Unable to attach use cases.", e10);
            this.f2374s.m2738v();
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0606c0
    /* renamed from: h */
    public void mo2493h(Collection<AbstractC0718w> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(m2472t0(arrayList));
        m2461f0(new ArrayList(arrayList));
        this.f2369c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.g0
            @Override // java.lang.Runnable
            public final void run() {
                C0503j0.this.m2451V(arrayList2);
            }
        });
    }

    /* renamed from: h0 */
    void m2494h0() {
        C0984h.m4835m(this.f2371e == g.OPENED);
        C0701y1.g m3118f = this.f2367a.m3118f();
        if (!m3118f.m3419e()) {
            m2483H("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (this.f2354E.m3095i(this.f2377v.getId(), this.f2353D.mo35288a(this.f2377v.getId()))) {
            HashMap hashMap = new HashMap();
            C0560u2.m2766m(this.f2367a.m3119g(), this.f2367a.m3120h(), hashMap);
            this.f2379x.mo2678h(hashMap);
            C0009f.m16b(this.f2379x.mo2677g(m3118f.m3417b(), (CameraDevice) C0984h.m4833k(this.f2377v), this.f2358I.m2541a()), new b(), this.f2369c);
            return;
        }
        m2483H("Unable to create capture session in camera operating mode = " + this.f2353D.mo35289b());
    }

    @Override // androidx.camera.core.impl.InterfaceC0606c0
    /* renamed from: i */
    public InterfaceC0602b0 mo2495i() {
        return this.f2376u;
    }

    /* renamed from: j0 */
    void m2496j0(final C0701y1 c0701y1) {
        ScheduledExecutorService m42283d = C12747a.m42283d();
        List<C0701y1.c> m3381c = c0701y1.m3381c();
        if (m3381c.isEmpty()) {
            return;
        }
        final C0701y1.c cVar = m3381c.get(0);
        m2442I("Posting surface closed", new Throwable());
        m42283d.execute(new Runnable() { // from class: androidx.camera.camera2.internal.e0
            @Override // java.lang.Runnable
            public final void run() {
                C0503j0.m2456a0(C0701y1.c.this, c0701y1);
            }
        });
    }

    @Override // androidx.camera.core.AbstractC0718w.d
    /* renamed from: k */
    public void mo2497k(AbstractC0718w abstractC0718w) {
        C0984h.m4833k(abstractC0718w);
        m2466o0(m2445N(abstractC0718w), abstractC0718w.m3564s(), abstractC0718w.m3556i());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void m2450U(C0574x1 c0574x1, AbstractC0661r0 abstractC0661r0, Runnable runnable) {
        this.f2355F.remove(c0574x1);
        InterfaceFutureC5920f<Void> m2500l0 = m2500l0(c0574x1, false);
        abstractC0661r0.m3223d();
        C0009f.m28n(Arrays.asList(m2500l0, abstractC0661r0.m3230k())).addListener(runnable, C12747a.m42280a());
    }

    @Override // androidx.camera.core.impl.InterfaceC0606c0
    /* renamed from: l */
    public void mo2499l(InterfaceC0669u interfaceC0669u) {
        if (interfaceC0669u == null) {
            interfaceC0669u = C0696x.m3377a();
        }
        InterfaceC0704z1 m3240V = interfaceC0669u.m3240V(null);
        this.f2360K = interfaceC0669u;
        synchronized (this.f2361L) {
            this.f2362M = m3240V;
        }
    }

    /* renamed from: l0 */
    InterfaceFutureC5920f<Void> m2500l0(InterfaceC0579y1 interfaceC0579y1, boolean z10) {
        interfaceC0579y1.close();
        InterfaceFutureC5920f<Void> mo2673c = interfaceC0579y1.mo2673c(z10);
        m2483H("Releasing session in state " + this.f2371e.name());
        this.f2350A.put(interfaceC0579y1, mo2673c);
        C0009f.m16b(mo2673c, new a(interfaceC0579y1), C12747a.m42280a());
        return mo2673c;
    }

    @Override // androidx.camera.core.AbstractC0718w.d
    /* renamed from: n */
    public void mo2501n(AbstractC0718w abstractC0718w) {
        C0984h.m4833k(abstractC0718w);
        final String m2445N = m2445N(abstractC0718w);
        this.f2369c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.b0
            @Override // java.lang.Runnable
            public final void run() {
                C0503j0.this.m2455Z(m2445N);
            }
        });
    }

    /* renamed from: n0 */
    void m2502n0(boolean z10) {
        C0984h.m4835m(this.f2379x != null);
        m2483H("Resetting Capture Session");
        InterfaceC0579y1 interfaceC0579y1 = this.f2379x;
        C0701y1 mo2675e = interfaceC0579y1.mo2675e();
        List<C0642l0> mo2674d = interfaceC0579y1.mo2674d();
        InterfaceC0579y1 m2459d0 = m2459d0();
        this.f2379x = m2459d0;
        m2459d0.mo2676f(mo2675e);
        this.f2379x.mo2671a(mo2674d);
        m2500l0(interfaceC0579y1, z10);
    }

    /* renamed from: p0 */
    void m2503p0(g gVar) {
        m2504q0(gVar, null);
    }

    /* renamed from: q0 */
    void m2504q0(g gVar, AbstractC12032q.a aVar) {
        m2505r0(gVar, aVar, true);
    }

    /* renamed from: r0 */
    void m2505r0(g gVar, AbstractC12032q.a aVar, boolean z10) {
        InterfaceC0606c0.a aVar2;
        m2483H("Transitioning camera internal state: " + this.f2371e + " --> " + gVar);
        this.f2371e = gVar;
        switch (c.f2385a[gVar.ordinal()]) {
            case 1:
                aVar2 = InterfaceC0606c0.a.CLOSED;
                break;
            case 2:
                aVar2 = InterfaceC0606c0.a.PENDING_OPEN;
                break;
            case 3:
                aVar2 = InterfaceC0606c0.a.CLOSING;
                break;
            case 4:
                aVar2 = InterfaceC0606c0.a.OPEN;
                break;
            case 5:
                aVar2 = InterfaceC0606c0.a.CONFIGURED;
                break;
            case 6:
            case 7:
                aVar2 = InterfaceC0606c0.a.OPENING;
                break;
            case 8:
                aVar2 = InterfaceC0606c0.a.RELEASING;
                break;
            case 9:
                aVar2 = InterfaceC0606c0.a.RELEASED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + gVar);
        }
        this.f2354E.m3092e(this, aVar2, z10);
        this.f2372f.m3104a(aVar2);
        this.f2373r.m2598c(aVar2, aVar);
    }

    /* renamed from: s0 */
    void m2506s0(List<C0642l0> list) {
        ArrayList arrayList = new ArrayList();
        for (C0642l0 c0642l0 : list) {
            C0642l0.a m3159k = C0642l0.a.m3159k(c0642l0);
            if (c0642l0.m3156h() == 5 && c0642l0.m3151c() != null) {
                m3159k.m3172o(c0642l0.m3151c());
            }
            if (!c0642l0.m3154f().isEmpty() || !c0642l0.m3157i() || m2438C(m3159k)) {
                arrayList.add(m3159k.m3167h());
            }
        }
        m2483H("Issue capture request");
        this.f2379x.mo2671a(arrayList);
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f2376u.mo2559b());
    }

    /* renamed from: w0 */
    void m2507w0(boolean z10) {
        m2483H("Attempting to force open the camera.");
        if (this.f2354E.m3094h(this)) {
            m2462g0(z10);
        } else {
            m2483H("No cameras available. Waiting for available camera before opening camera.");
            m2503p0(g.PENDING_OPEN);
        }
    }

    /* renamed from: x0 */
    void m2508x0(boolean z10) {
        m2483H("Attempting to open the camera.");
        if (this.f2351B.m2513b() && this.f2354E.m3094h(this)) {
            m2462g0(z10);
        } else {
            m2483H("No cameras available. Waiting for available camera before opening camera.");
            m2503p0(g.PENDING_OPEN);
        }
    }

    /* renamed from: y0 */
    void m2509y0() {
        C0701y1.g m3116d = this.f2367a.m3116d();
        if (!m3116d.m3419e()) {
            this.f2374s.m2717X();
            this.f2379x.mo2676f(this.f2374s.m2742z());
            return;
        }
        this.f2374s.m2721a0(m3116d.m3417b().m3390l());
        m3116d.m3416a(this.f2374s.m2742z());
        this.f2379x.mo2676f(m3116d.m3417b());
    }
}

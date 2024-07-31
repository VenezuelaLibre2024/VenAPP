package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Size;
import androidx.camera.core.impl.n0;
import androidx.camera.core.impl.r0;
import androidx.camera.core.impl.y1;
import androidx.camera.core.impl.z1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import q.a;
import v.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t2 implements y1 {

    /* renamed from: q, reason: collision with root package name */
    private static List<androidx.camera.core.impl.r0> f2225q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    private static int f2226r = 0;

    /* renamed from: a, reason: collision with root package name */
    private final androidx.camera.core.impl.z1 f2227a;

    /* renamed from: b, reason: collision with root package name */
    private final n0 f2228b;

    /* renamed from: c, reason: collision with root package name */
    final Executor f2229c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f2230d;

    /* renamed from: e, reason: collision with root package name */
    private final x1 f2231e;

    /* renamed from: g, reason: collision with root package name */
    private androidx.camera.core.impl.y1 f2233g;

    /* renamed from: h, reason: collision with root package name */
    private i1 f2234h;

    /* renamed from: i, reason: collision with root package name */
    private androidx.camera.core.impl.y1 f2235i;

    /* renamed from: p, reason: collision with root package name */
    private int f2242p;

    /* renamed from: f, reason: collision with root package name */
    private List<androidx.camera.core.impl.r0> f2232f = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private volatile List<androidx.camera.core.impl.l0> f2237k = null;

    /* renamed from: l, reason: collision with root package name */
    volatile boolean f2238l = false;

    /* renamed from: n, reason: collision with root package name */
    private v.j f2240n = new j.a().d();

    /* renamed from: o, reason: collision with root package name */
    private v.j f2241o = new j.a().d();

    /* renamed from: j, reason: collision with root package name */
    private e f2236j = e.UNINITIALIZED;

    /* renamed from: m, reason: collision with root package name */
    private final f f2239m = new f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements a0.c<Void> {
        a() {
        }

        @Override // a0.c
        public void a(Throwable th2) {
            w.o0.d("ProcessingCaptureSession", "open session failed ", th2);
            t2.this.close();
            t2.this.c(false);
        }

        @Override // a0.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements z1.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.camera.core.impl.l0 f2244a;

        b(androidx.camera.core.impl.l0 l0Var) {
            this.f2244a = l0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements z1.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.camera.core.impl.l0 f2246a;

        c(androidx.camera.core.impl.l0 l0Var) {
            this.f2246a = l0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2248a;

        static {
            int[] iArr = new int[e.values().length];
            f2248a = iArr;
            try {
                iArr[e.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2248a[e.SESSION_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2248a[e.ON_CAPTURE_SESSION_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2248a[e.ON_CAPTURE_SESSION_ENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2248a[e.DE_INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum e {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        DE_INITIALIZED
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f implements z1.a {
        f() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t2(androidx.camera.core.impl.z1 z1Var, n0 n0Var, r.b bVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f2242p = 0;
        this.f2231e = new x1(bVar);
        this.f2227a = z1Var;
        this.f2228b = n0Var;
        this.f2229c = executor;
        this.f2230d = scheduledExecutorService;
        int i10 = f2226r;
        f2226r = i10 + 1;
        this.f2242p = i10;
        w.o0.a("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + this.f2242p + ")");
    }

    private static void n(List<androidx.camera.core.impl.l0> list) {
        Iterator<androidx.camera.core.impl.l0> it = list.iterator();
        while (it.hasNext()) {
            Iterator<androidx.camera.core.impl.k> it2 = it.next().b().iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
        }
    }

    private static List<androidx.camera.core.impl.a2> o(List<androidx.camera.core.impl.r0> list) {
        ArrayList arrayList = new ArrayList();
        for (androidx.camera.core.impl.r0 r0Var : list) {
            androidx.core.util.h.b(r0Var instanceof androidx.camera.core.impl.a2, "Surface must be SessionProcessorSurface");
            arrayList.add((androidx.camera.core.impl.a2) r0Var);
        }
        return arrayList;
    }

    private boolean p(androidx.camera.core.impl.l0 l0Var) {
        Iterator<androidx.camera.core.impl.r0> it = l0Var.f().iterator();
        while (it.hasNext()) {
            if (Objects.equals(it.next().g(), androidx.camera.core.s.class)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        androidx.camera.core.impl.w0.e(this.f2232f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(androidx.camera.core.impl.r0 r0Var) {
        f2225q.remove(r0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.google.common.util.concurrent.f u(androidx.camera.core.impl.y1 y1Var, CameraDevice cameraDevice, j3 j3Var, List list) {
        w.o0.a("ProcessingCaptureSession", "-- getSurfaces done, start init (id=" + this.f2242p + ")");
        if (this.f2236j == e.DE_INITIALIZED) {
            return a0.f.f(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        androidx.camera.core.impl.q1 q1Var = null;
        if (list.contains(null)) {
            return a0.f.f(new r0.a("Surface closed", y1Var.k().get(list.indexOf(null))));
        }
        androidx.camera.core.impl.q1 q1Var2 = null;
        androidx.camera.core.impl.q1 q1Var3 = null;
        for (int i10 = 0; i10 < y1Var.k().size(); i10++) {
            androidx.camera.core.impl.r0 r0Var = y1Var.k().get(i10);
            if (Objects.equals(r0Var.g(), androidx.camera.core.s.class)) {
                q1Var = androidx.camera.core.impl.q1.a(r0Var.j().get(), new Size(r0Var.h().getWidth(), r0Var.h().getHeight()), r0Var.i());
            } else if (Objects.equals(r0Var.g(), androidx.camera.core.n.class)) {
                q1Var2 = androidx.camera.core.impl.q1.a(r0Var.j().get(), new Size(r0Var.h().getWidth(), r0Var.h().getHeight()), r0Var.i());
            } else if (Objects.equals(r0Var.g(), androidx.camera.core.f.class)) {
                q1Var3 = androidx.camera.core.impl.q1.a(r0Var.j().get(), new Size(r0Var.h().getWidth(), r0Var.h().getHeight()), r0Var.i());
            }
        }
        this.f2236j = e.SESSION_INITIALIZED;
        try {
            androidx.camera.core.impl.w0.f(this.f2232f);
            w.o0.k("ProcessingCaptureSession", "== initSession (id=" + this.f2242p + ")");
            try {
                androidx.camera.core.impl.y1 h10 = this.f2227a.h(this.f2228b, q1Var, q1Var2, q1Var3);
                this.f2235i = h10;
                h10.k().get(0).k().addListener(new Runnable() { // from class: androidx.camera.camera2.internal.r2
                    @Override // java.lang.Runnable
                    public final void run() {
                        t2.this.s();
                    }
                }, z.a.a());
                for (final androidx.camera.core.impl.r0 r0Var2 : this.f2235i.k()) {
                    f2225q.add(r0Var2);
                    r0Var2.k().addListener(new Runnable() { // from class: androidx.camera.camera2.internal.s2
                        @Override // java.lang.Runnable
                        public final void run() {
                            t2.t(androidx.camera.core.impl.r0.this);
                        }
                    }, this.f2229c);
                }
                y1.g gVar = new y1.g();
                gVar.a(y1Var);
                gVar.c();
                gVar.a(this.f2235i);
                androidx.core.util.h.b(gVar.e(), "Cannot transform the SessionConfig");
                com.google.common.util.concurrent.f<Void> g10 = this.f2231e.g(gVar.b(), (CameraDevice) androidx.core.util.h.k(cameraDevice), j3Var);
                a0.f.b(g10, new a(), this.f2229c);
                return g10;
            } catch (Throwable th2) {
                androidx.camera.core.impl.w0.e(this.f2232f);
                throw th2;
            }
        } catch (r0.a e10) {
            return a0.f.f(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void v(Void r12) {
        x(this.f2231e);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        w.o0.a("ProcessingCaptureSession", "== deInitSession (id=" + this.f2242p + ")");
        this.f2227a.c();
    }

    private void y(v.j jVar, v.j jVar2) {
        a.C0388a c0388a = new a.C0388a();
        c0388a.d(jVar);
        c0388a.d(jVar2);
        this.f2227a.i(c0388a.c());
    }

    @Override // androidx.camera.camera2.internal.y1
    public void a(List<androidx.camera.core.impl.l0> list) {
        if (list.isEmpty()) {
            return;
        }
        w.o0.a("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f2242p + ") + state =" + this.f2236j);
        int i10 = d.f2248a[this.f2236j.ordinal()];
        if (i10 == 1 || i10 == 2) {
            this.f2237k = list;
            return;
        }
        if (i10 == 3) {
            for (androidx.camera.core.impl.l0 l0Var : list) {
                if (l0Var.h() == 2) {
                    q(l0Var);
                } else {
                    r(l0Var);
                }
            }
            return;
        }
        if (i10 == 4 || i10 == 5) {
            w.o0.a("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.f2236j);
            n(list);
        }
    }

    @Override // androidx.camera.camera2.internal.y1
    public void b() {
        w.o0.a("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f2242p + ")");
        if (this.f2237k != null) {
            Iterator<androidx.camera.core.impl.l0> it = this.f2237k.iterator();
            while (it.hasNext()) {
                Iterator<androidx.camera.core.impl.k> it2 = it.next().b().iterator();
                while (it2.hasNext()) {
                    it2.next().a();
                }
            }
            this.f2237k = null;
        }
    }

    @Override // androidx.camera.camera2.internal.y1
    public com.google.common.util.concurrent.f<Void> c(boolean z10) {
        w.o0.a("ProcessingCaptureSession", "release (id=" + this.f2242p + ") mProcessorState=" + this.f2236j);
        com.google.common.util.concurrent.f<Void> c10 = this.f2231e.c(z10);
        int i10 = d.f2248a[this.f2236j.ordinal()];
        if (i10 == 2 || i10 == 4) {
            c10.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.o2
                @Override // java.lang.Runnable
                public final void run() {
                    t2.this.w();
                }
            }, z.a.a());
        }
        this.f2236j = e.DE_INITIALIZED;
        return c10;
    }

    @Override // androidx.camera.camera2.internal.y1
    public void close() {
        w.o0.a("ProcessingCaptureSession", "close (id=" + this.f2242p + ") state=" + this.f2236j);
        if (this.f2236j == e.ON_CAPTURE_SESSION_STARTED) {
            w.o0.a("ProcessingCaptureSession", "== onCaptureSessionEnd (id = " + this.f2242p + ")");
            this.f2227a.b();
            i1 i1Var = this.f2234h;
            if (i1Var != null) {
                i1Var.a();
            }
            this.f2236j = e.ON_CAPTURE_SESSION_ENDED;
        }
        this.f2231e.close();
    }

    @Override // androidx.camera.camera2.internal.y1
    public List<androidx.camera.core.impl.l0> d() {
        return this.f2237k != null ? this.f2237k : Collections.emptyList();
    }

    @Override // androidx.camera.camera2.internal.y1
    public androidx.camera.core.impl.y1 e() {
        return this.f2233g;
    }

    @Override // androidx.camera.camera2.internal.y1
    public void f(androidx.camera.core.impl.y1 y1Var) {
        w.o0.a("ProcessingCaptureSession", "setSessionConfig (id=" + this.f2242p + ")");
        this.f2233g = y1Var;
        if (y1Var == null) {
            return;
        }
        i1 i1Var = this.f2234h;
        if (i1Var != null) {
            i1Var.b(y1Var);
        }
        if (this.f2236j == e.ON_CAPTURE_SESSION_STARTED) {
            v.j d10 = j.a.e(y1Var.d()).d();
            this.f2240n = d10;
            y(d10, this.f2241o);
            if (p(y1Var.h())) {
                this.f2227a.g(this.f2239m);
            } else {
                this.f2227a.d();
            }
        }
    }

    @Override // androidx.camera.camera2.internal.y1
    public com.google.common.util.concurrent.f<Void> g(final androidx.camera.core.impl.y1 y1Var, final CameraDevice cameraDevice, final j3 j3Var) {
        androidx.core.util.h.b(this.f2236j == e.UNINITIALIZED, "Invalid state state:" + this.f2236j);
        androidx.core.util.h.b(y1Var.k().isEmpty() ^ true, "SessionConfig contains no surfaces");
        w.o0.a("ProcessingCaptureSession", "open (id=" + this.f2242p + ")");
        List<androidx.camera.core.impl.r0> k10 = y1Var.k();
        this.f2232f = k10;
        return a0.d.a(androidx.camera.core.impl.w0.k(k10, false, 5000L, this.f2229c, this.f2230d)).e(new a0.a() { // from class: androidx.camera.camera2.internal.p2
            @Override // a0.a
            public final com.google.common.util.concurrent.f apply(Object obj) {
                com.google.common.util.concurrent.f u10;
                u10 = t2.this.u(y1Var, cameraDevice, j3Var, (List) obj);
                return u10;
            }
        }, this.f2229c).d(new m.a() { // from class: androidx.camera.camera2.internal.q2
            @Override // m.a
            public final Object apply(Object obj) {
                Void v10;
                v10 = t2.this.v((Void) obj);
                return v10;
            }
        }, this.f2229c);
    }

    @Override // androidx.camera.camera2.internal.y1
    public void h(Map<androidx.camera.core.impl.r0, Long> map) {
    }

    void q(androidx.camera.core.impl.l0 l0Var) {
        j.a e10 = j.a.e(l0Var.e());
        androidx.camera.core.impl.n0 e11 = l0Var.e();
        n0.a<Integer> aVar = androidx.camera.core.impl.l0.f2536i;
        if (e11.b(aVar)) {
            e10.g(CaptureRequest.JPEG_ORIENTATION, (Integer) l0Var.e().a(aVar));
        }
        androidx.camera.core.impl.n0 e12 = l0Var.e();
        n0.a<Integer> aVar2 = androidx.camera.core.impl.l0.f2537j;
        if (e12.b(aVar2)) {
            e10.g(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) l0Var.e().a(aVar2)).byteValue()));
        }
        v.j d10 = e10.d();
        this.f2241o = d10;
        y(this.f2240n, d10);
        this.f2227a.j(new c(l0Var));
    }

    void r(androidx.camera.core.impl.l0 l0Var) {
        boolean z10;
        w.o0.a("ProcessingCaptureSession", "issueTriggerRequest");
        v.j d10 = j.a.e(l0Var.e()).d();
        Iterator<n0.a<?>> it = d10.e().iterator();
        while (it.hasNext()) {
            CaptureRequest.Key key = (CaptureRequest.Key) it.next().d();
            if (key.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                z10 = true;
                break;
            }
        }
        z10 = false;
        if (z10) {
            this.f2227a.f(d10, new b(l0Var));
        } else {
            n(Arrays.asList(l0Var));
        }
    }

    void x(x1 x1Var) {
        androidx.core.util.h.b(this.f2236j == e.SESSION_INITIALIZED, "Invalid state state:" + this.f2236j);
        this.f2234h = new i1(x1Var, o(this.f2235i.k()));
        w.o0.a("ProcessingCaptureSession", "== onCaptureSessinStarted (id = " + this.f2242p + ")");
        this.f2227a.a(this.f2234h);
        this.f2236j = e.ON_CAPTURE_SESSION_STARTED;
        androidx.camera.core.impl.y1 y1Var = this.f2233g;
        if (y1Var != null) {
            f(y1Var);
        }
        if (this.f2237k != null) {
            a(this.f2237k);
            this.f2237k = null;
        }
    }
}

package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.internal.k3;
import androidx.camera.camera2.internal.l1;
import androidx.camera.camera2.internal.x2;
import androidx.camera.core.impl.l0;
import androidx.camera.core.impl.n0;
import androidx.camera.core.impl.y1;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x1 implements y1 {

    /* renamed from: e, reason: collision with root package name */
    j3 f2342e;

    /* renamed from: f, reason: collision with root package name */
    x2 f2343f;

    /* renamed from: g, reason: collision with root package name */
    androidx.camera.core.impl.y1 f2344g;

    /* renamed from: l, reason: collision with root package name */
    e f2349l;

    /* renamed from: m, reason: collision with root package name */
    com.google.common.util.concurrent.f<Void> f2350m;

    /* renamed from: n, reason: collision with root package name */
    c.a<Void> f2351n;

    /* renamed from: r, reason: collision with root package name */
    private final r.b f2355r;

    /* renamed from: a, reason: collision with root package name */
    final Object f2338a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final List<androidx.camera.core.impl.l0> f2339b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final CameraCaptureSession.CaptureCallback f2340c = new a();

    /* renamed from: h, reason: collision with root package name */
    androidx.camera.core.impl.n0 f2345h = androidx.camera.core.impl.p1.X();

    /* renamed from: i, reason: collision with root package name */
    q.c f2346i = q.c.e();

    /* renamed from: j, reason: collision with root package name */
    private final Map<androidx.camera.core.impl.r0, Surface> f2347j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    List<androidx.camera.core.impl.r0> f2348k = Collections.emptyList();

    /* renamed from: o, reason: collision with root package name */
    Map<androidx.camera.core.impl.r0, Long> f2352o = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    final t.r f2353p = new t.r();

    /* renamed from: q, reason: collision with root package name */
    final t.u f2354q = new t.u();

    /* renamed from: d, reason: collision with root package name */
    private final f f2341d = new f();

    /* loaded from: classes.dex */
    class a extends CameraCaptureSession.CaptureCallback {
        a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }
    }

    /* loaded from: classes.dex */
    class b implements a0.c<Void> {
        b() {
        }

        @Override // a0.c
        public void a(Throwable th2) {
            synchronized (x1.this.f2338a) {
                x1.this.f2342e.e();
                int i10 = d.f2359a[x1.this.f2349l.ordinal()];
                if ((i10 == 4 || i10 == 6 || i10 == 7) && !(th2 instanceof CancellationException)) {
                    w.o0.l("CaptureSession", "Opening session with fail " + x1.this.f2349l, th2);
                    x1.this.m();
                }
            }
        }

        @Override // a0.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends CameraCaptureSession.CaptureCallback {
        c() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            synchronized (x1.this.f2338a) {
                androidx.camera.core.impl.y1 y1Var = x1.this.f2344g;
                if (y1Var == null) {
                    return;
                }
                androidx.camera.core.impl.l0 h10 = y1Var.h();
                w.o0.a("CaptureSession", "Submit FLASH_MODE_OFF request");
                x1 x1Var = x1.this;
                x1Var.a(Collections.singletonList(x1Var.f2354q.a(h10)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2359a;

        static {
            int[] iArr = new int[e.values().length];
            f2359a = iArr;
            try {
                iArr[e.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2359a[e.INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2359a[e.GET_SURFACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2359a[e.OPENING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2359a[e.OPENED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2359a[e.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2359a[e.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2359a[e.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum e {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class f extends x2.a {
        f() {
        }

        @Override // androidx.camera.camera2.internal.x2.a
        public void q(x2 x2Var) {
            synchronized (x1.this.f2338a) {
                switch (d.f2359a[x1.this.f2349l.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                        throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + x1.this.f2349l);
                    case 4:
                    case 6:
                    case 7:
                        x1.this.m();
                        break;
                    case 8:
                        w.o0.a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                        break;
                }
                w.o0.c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + x1.this.f2349l);
            }
        }

        @Override // androidx.camera.camera2.internal.x2.a
        public void r(x2 x2Var) {
            synchronized (x1.this.f2338a) {
                switch (d.f2359a[x1.this.f2349l.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 8:
                        throw new IllegalStateException("onConfigured() should not be possible in state: " + x1.this.f2349l);
                    case 4:
                        x1 x1Var = x1.this;
                        x1Var.f2349l = e.OPENED;
                        x1Var.f2343f = x2Var;
                        if (x1Var.f2344g != null) {
                            List<androidx.camera.core.impl.l0> c10 = x1Var.f2346i.d().c();
                            if (!c10.isEmpty()) {
                                x1 x1Var2 = x1.this;
                                x1Var2.p(x1Var2.x(c10));
                            }
                        }
                        w.o0.a("CaptureSession", "Attempting to send capture request onConfigured");
                        x1 x1Var3 = x1.this;
                        x1Var3.r(x1Var3.f2344g);
                        x1.this.q();
                        break;
                    case 6:
                        x1.this.f2343f = x2Var;
                        break;
                    case 7:
                        x2Var.close();
                        break;
                }
                w.o0.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + x1.this.f2349l);
            }
        }

        @Override // androidx.camera.camera2.internal.x2.a
        public void s(x2 x2Var) {
            synchronized (x1.this.f2338a) {
                if (d.f2359a[x1.this.f2349l.ordinal()] == 1) {
                    throw new IllegalStateException("onReady() should not be possible in state: " + x1.this.f2349l);
                }
                w.o0.a("CaptureSession", "CameraCaptureSession.onReady() " + x1.this.f2349l);
            }
        }

        @Override // androidx.camera.camera2.internal.x2.a
        public void t(x2 x2Var) {
            synchronized (x1.this.f2338a) {
                if (x1.this.f2349l == e.UNINITIALIZED) {
                    throw new IllegalStateException("onSessionFinished() should not be possible in state: " + x1.this.f2349l);
                }
                w.o0.a("CaptureSession", "onSessionFinished()");
                x1.this.m();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x1(r.b bVar) {
        this.f2349l = e.UNINITIALIZED;
        this.f2349l = e.INITIALIZED;
        this.f2355r = bVar;
    }

    private CameraCaptureSession.CaptureCallback l(List<androidx.camera.core.impl.k> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator<androidx.camera.core.impl.k> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(t1.a(it.next()));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return o0.a(arrayList);
    }

    private r.f n(y1.e eVar, Map<androidx.camera.core.impl.r0, Surface> map, String str) {
        long j10;
        DynamicRangeProfiles d10;
        Surface surface = map.get(eVar.e());
        androidx.core.util.h.l(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        r.f fVar = new r.f(eVar.f(), surface);
        if (str == null) {
            str = eVar.c();
        }
        fVar.f(str);
        if (!eVar.d().isEmpty()) {
            fVar.b();
            Iterator<androidx.camera.core.impl.r0> it = eVar.d().iterator();
            while (it.hasNext()) {
                Surface surface2 = map.get(it.next());
                androidx.core.util.h.l(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                fVar.a(surface2);
            }
        }
        if (Build.VERSION.SDK_INT >= 33 && (d10 = this.f2355r.d()) != null) {
            w.y b10 = eVar.b();
            Long a10 = r.a.a(b10, d10);
            if (a10 != null) {
                j10 = a10.longValue();
                fVar.e(j10);
                return fVar;
            }
            w.o0.c("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + b10);
        }
        j10 = 1;
        fVar.e(j10);
        return fVar;
    }

    private List<r.f> o(List<r.f> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (r.f fVar : list) {
            if (!arrayList.contains(fVar.d())) {
                arrayList.add(fVar.d());
                arrayList2.add(fVar);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(CameraCaptureSession cameraCaptureSession, int i10, boolean z10) {
        synchronized (this.f2338a) {
            if (this.f2349l == e.OPENED) {
                r(this.f2344g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object u(c.a aVar) {
        String str;
        synchronized (this.f2338a) {
            androidx.core.util.h.n(this.f2351n == null, "Release completer expected to be null");
            this.f2351n = aVar;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    private static androidx.camera.core.impl.n0 v(List<androidx.camera.core.impl.l0> list) {
        androidx.camera.core.impl.m1 a02 = androidx.camera.core.impl.m1.a0();
        Iterator<androidx.camera.core.impl.l0> it = list.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.n0 e10 = it.next().e();
            for (n0.a<?> aVar : e10.e()) {
                Object g10 = e10.g(aVar, null);
                if (a02.b(aVar)) {
                    Object g11 = a02.g(aVar, null);
                    if (!Objects.equals(g11, g10)) {
                        w.o0.a("CaptureSession", "Detect conflicting option " + aVar.c() + " : " + g10 + " != " + g11);
                    }
                } else {
                    a02.r(aVar, g10);
                }
            }
        }
        return a02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public com.google.common.util.concurrent.f<Void> t(List<Surface> list, androidx.camera.core.impl.y1 y1Var, CameraDevice cameraDevice) {
        synchronized (this.f2338a) {
            int i10 = d.f2359a[this.f2349l.ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    this.f2347j.clear();
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        this.f2347j.put(this.f2348k.get(i11), list.get(i11));
                    }
                    this.f2349l = e.OPENING;
                    w.o0.a("CaptureSession", "Opening capture session.");
                    x2.a v10 = k3.v(this.f2341d, new k3.a(y1Var.i()));
                    q.a aVar = new q.a(y1Var.d());
                    q.c X = aVar.X(q.c.e());
                    this.f2346i = X;
                    List<androidx.camera.core.impl.l0> d10 = X.d().d();
                    l0.a k10 = l0.a.k(y1Var.h());
                    Iterator<androidx.camera.core.impl.l0> it = d10.iterator();
                    while (it.hasNext()) {
                        k10.e(it.next().e());
                    }
                    ArrayList arrayList = new ArrayList();
                    String c02 = aVar.c0(null);
                    for (y1.e eVar : y1Var.f()) {
                        r.f n10 = n(eVar, this.f2347j, c02);
                        if (this.f2352o.containsKey(eVar.e())) {
                            n10.g(this.f2352o.get(eVar.e()).longValue());
                        }
                        arrayList.add(n10);
                    }
                    r.w a10 = this.f2342e.a(0, o(arrayList), v10);
                    if (y1Var.l() == 5 && y1Var.e() != null) {
                        a10.f(r.e.b(y1Var.e()));
                    }
                    try {
                        CaptureRequest d11 = f1.d(k10.h(), cameraDevice);
                        if (d11 != null) {
                            a10.g(d11);
                        }
                        return this.f2342e.c(cameraDevice, a10, this.f2348k);
                    } catch (CameraAccessException e10) {
                        return a0.f.f(e10);
                    }
                }
                if (i10 != 5) {
                    return a0.f.f(new CancellationException("openCaptureSession() not execute in state: " + this.f2349l));
                }
            }
            return a0.f.f(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f2349l));
        }
    }

    @Override // androidx.camera.camera2.internal.y1
    public void a(List<androidx.camera.core.impl.l0> list) {
        synchronized (this.f2338a) {
            switch (d.f2359a[this.f2349l.ordinal()]) {
                case 1:
                    throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f2349l);
                case 2:
                case 3:
                case 4:
                    this.f2339b.addAll(list);
                    break;
                case 5:
                    this.f2339b.addAll(list);
                    q();
                    break;
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
            }
        }
    }

    @Override // androidx.camera.camera2.internal.y1
    public void b() {
        ArrayList arrayList;
        synchronized (this.f2338a) {
            if (this.f2339b.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(this.f2339b);
                this.f2339b.clear();
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator<androidx.camera.core.impl.k> it2 = ((androidx.camera.core.impl.l0) it.next()).b().iterator();
                while (it2.hasNext()) {
                    it2.next().a();
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[Catch: all -> 0x00af, TryCatch #1 {, blocks: (B:4:0x0003, B:5:0x000d, B:7:0x00a8, B:11:0x0012, B:16:0x0018, B:14:0x0024, B:19:0x001d, B:20:0x0029, B:22:0x0056, B:23:0x005a, B:25:0x005e, B:26:0x0069, B:27:0x006b, B:29:0x006d, B:30:0x008a, B:31:0x008f, B:32:0x00a7), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e A[Catch: all -> 0x00af, TryCatch #1 {, blocks: (B:4:0x0003, B:5:0x000d, B:7:0x00a8, B:11:0x0012, B:16:0x0018, B:14:0x0024, B:19:0x001d, B:20:0x0029, B:22:0x0056, B:23:0x005a, B:25:0x005e, B:26:0x0069, B:27:0x006b, B:29:0x006d, B:30:0x008a, B:31:0x008f, B:32:0x00a7), top: B:3:0x0003, inners: #0 }] */
    @Override // androidx.camera.camera2.internal.y1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.util.concurrent.f<java.lang.Void> c(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f2338a
            monitor-enter(r0)
            int[] r1 = androidx.camera.camera2.internal.x1.d.f2359a     // Catch: java.lang.Throwable -> Laf
            androidx.camera.camera2.internal.x1$e r2 = r3.f2349l     // Catch: java.lang.Throwable -> Laf
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> Laf
            r1 = r1[r2]     // Catch: java.lang.Throwable -> Laf
            switch(r1) {
                case 1: goto L8f;
                case 2: goto L8a;
                case 3: goto L6d;
                case 4: goto L29;
                case 5: goto L12;
                case 6: goto L12;
                case 7: goto L5a;
                default: goto L10;
            }     // Catch: java.lang.Throwable -> Laf
        L10:
            goto La8
        L12:
            androidx.camera.camera2.internal.x2 r1 = r3.f2343f     // Catch: java.lang.Throwable -> Laf
            if (r1 == 0) goto L29
            if (r4 == 0) goto L24
            r1.f()     // Catch: android.hardware.camera2.CameraAccessException -> L1c java.lang.Throwable -> Laf
            goto L24
        L1c:
            r4 = move-exception
            java.lang.String r1 = "CaptureSession"
            java.lang.String r2 = "Unable to abort captures."
            w.o0.d(r1, r2, r4)     // Catch: java.lang.Throwable -> Laf
        L24:
            androidx.camera.camera2.internal.x2 r4 = r3.f2343f     // Catch: java.lang.Throwable -> Laf
            r4.close()     // Catch: java.lang.Throwable -> Laf
        L29:
            q.c r4 = r3.f2346i     // Catch: java.lang.Throwable -> Laf
            q.c$a r4 = r4.d()     // Catch: java.lang.Throwable -> Laf
            r4.a()     // Catch: java.lang.Throwable -> Laf
            androidx.camera.camera2.internal.x1$e r4 = androidx.camera.camera2.internal.x1.e.RELEASING     // Catch: java.lang.Throwable -> Laf
            r3.f2349l = r4     // Catch: java.lang.Throwable -> Laf
            androidx.camera.camera2.internal.j3 r4 = r3.f2342e     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r1.<init>()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch: java.lang.Throwable -> Laf
            androidx.camera.camera2.internal.x1$e r2 = r3.f2349l     // Catch: java.lang.Throwable -> Laf
            r1.append(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Laf
            androidx.core.util.h.l(r4, r1)     // Catch: java.lang.Throwable -> Laf
            androidx.camera.camera2.internal.j3 r4 = r3.f2342e     // Catch: java.lang.Throwable -> Laf
            boolean r4 = r4.e()     // Catch: java.lang.Throwable -> Laf
            if (r4 == 0) goto L5a
            r3.m()     // Catch: java.lang.Throwable -> Laf
            goto La8
        L5a:
            com.google.common.util.concurrent.f<java.lang.Void> r4 = r3.f2350m     // Catch: java.lang.Throwable -> Laf
            if (r4 != 0) goto L69
            androidx.camera.camera2.internal.w1 r4 = new androidx.camera.camera2.internal.w1     // Catch: java.lang.Throwable -> Laf
            r4.<init>()     // Catch: java.lang.Throwable -> Laf
            com.google.common.util.concurrent.f r4 = androidx.concurrent.futures.c.a(r4)     // Catch: java.lang.Throwable -> Laf
            r3.f2350m = r4     // Catch: java.lang.Throwable -> Laf
        L69:
            com.google.common.util.concurrent.f<java.lang.Void> r4 = r3.f2350m     // Catch: java.lang.Throwable -> Laf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laf
            return r4
        L6d:
            androidx.camera.camera2.internal.j3 r4 = r3.f2342e     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r1.<init>()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch: java.lang.Throwable -> Laf
            androidx.camera.camera2.internal.x1$e r2 = r3.f2349l     // Catch: java.lang.Throwable -> Laf
            r1.append(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Laf
            androidx.core.util.h.l(r4, r1)     // Catch: java.lang.Throwable -> Laf
            androidx.camera.camera2.internal.j3 r4 = r3.f2342e     // Catch: java.lang.Throwable -> Laf
            r4.e()     // Catch: java.lang.Throwable -> Laf
        L8a:
            androidx.camera.camera2.internal.x1$e r4 = androidx.camera.camera2.internal.x1.e.RELEASED     // Catch: java.lang.Throwable -> Laf
            r3.f2349l = r4     // Catch: java.lang.Throwable -> Laf
            goto La8
        L8f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r1.<init>()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = "release() should not be possible in state: "
            r1.append(r2)     // Catch: java.lang.Throwable -> Laf
            androidx.camera.camera2.internal.x1$e r2 = r3.f2349l     // Catch: java.lang.Throwable -> Laf
            r1.append(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Laf
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Laf
            throw r4     // Catch: java.lang.Throwable -> Laf
        La8:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laf
            r4 = 0
            com.google.common.util.concurrent.f r4 = a0.f.h(r4)
            return r4
        Laf:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laf
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.x1.c(boolean):com.google.common.util.concurrent.f");
    }

    @Override // androidx.camera.camera2.internal.y1
    public void close() {
        synchronized (this.f2338a) {
            int i10 = d.f2359a[this.f2349l.ordinal()];
            if (i10 == 1) {
                throw new IllegalStateException("close() should not be possible in state: " + this.f2349l);
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            if (this.f2344g != null) {
                                List<androidx.camera.core.impl.l0> b10 = this.f2346i.d().b();
                                if (!b10.isEmpty()) {
                                    try {
                                        a(x(b10));
                                    } catch (IllegalStateException e10) {
                                        w.o0.d("CaptureSession", "Unable to issue the request before close the capture session", e10);
                                    }
                                }
                            }
                        }
                    }
                    androidx.core.util.h.l(this.f2342e, "The Opener shouldn't null in state:" + this.f2349l);
                    this.f2342e.e();
                    this.f2349l = e.CLOSED;
                    this.f2344g = null;
                } else {
                    androidx.core.util.h.l(this.f2342e, "The Opener shouldn't null in state:" + this.f2349l);
                    this.f2342e.e();
                }
            }
            this.f2349l = e.RELEASED;
        }
    }

    @Override // androidx.camera.camera2.internal.y1
    public List<androidx.camera.core.impl.l0> d() {
        List<androidx.camera.core.impl.l0> unmodifiableList;
        synchronized (this.f2338a) {
            unmodifiableList = Collections.unmodifiableList(this.f2339b);
        }
        return unmodifiableList;
    }

    @Override // androidx.camera.camera2.internal.y1
    public androidx.camera.core.impl.y1 e() {
        androidx.camera.core.impl.y1 y1Var;
        synchronized (this.f2338a) {
            y1Var = this.f2344g;
        }
        return y1Var;
    }

    @Override // androidx.camera.camera2.internal.y1
    public void f(androidx.camera.core.impl.y1 y1Var) {
        synchronized (this.f2338a) {
            switch (d.f2359a[this.f2349l.ordinal()]) {
                case 1:
                    throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f2349l);
                case 2:
                case 3:
                case 4:
                    this.f2344g = y1Var;
                    break;
                case 5:
                    this.f2344g = y1Var;
                    if (y1Var != null) {
                        if (!this.f2347j.keySet().containsAll(y1Var.k())) {
                            w.o0.c("CaptureSession", "Does not have the proper configured lists");
                            return;
                        } else {
                            w.o0.a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                            r(this.f2344g);
                            break;
                        }
                    } else {
                        return;
                    }
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
            }
        }
    }

    @Override // androidx.camera.camera2.internal.y1
    public com.google.common.util.concurrent.f<Void> g(final androidx.camera.core.impl.y1 y1Var, final CameraDevice cameraDevice, j3 j3Var) {
        synchronized (this.f2338a) {
            if (d.f2359a[this.f2349l.ordinal()] == 2) {
                this.f2349l = e.GET_SURFACE;
                ArrayList arrayList = new ArrayList(y1Var.k());
                this.f2348k = arrayList;
                this.f2342e = j3Var;
                a0.d e10 = a0.d.a(j3Var.d(arrayList, 5000L)).e(new a0.a() { // from class: androidx.camera.camera2.internal.v1
                    @Override // a0.a
                    public final com.google.common.util.concurrent.f apply(Object obj) {
                        com.google.common.util.concurrent.f t10;
                        t10 = x1.this.t(y1Var, cameraDevice, (List) obj);
                        return t10;
                    }
                }, this.f2342e.b());
                a0.f.b(e10, new b(), this.f2342e.b());
                return a0.f.j(e10);
            }
            w.o0.c("CaptureSession", "Open not allowed in state: " + this.f2349l);
            return a0.f.f(new IllegalStateException("open() should not allow the state: " + this.f2349l));
        }
    }

    @Override // androidx.camera.camera2.internal.y1
    public void h(Map<androidx.camera.core.impl.r0, Long> map) {
        synchronized (this.f2338a) {
            this.f2352o = map;
        }
    }

    void m() {
        e eVar = this.f2349l;
        e eVar2 = e.RELEASED;
        if (eVar == eVar2) {
            w.o0.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f2349l = eVar2;
        this.f2343f = null;
        c.a<Void> aVar = this.f2351n;
        if (aVar != null) {
            aVar.c(null);
            this.f2351n = null;
        }
    }

    int p(List<androidx.camera.core.impl.l0> list) {
        l1 l1Var;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        synchronized (this.f2338a) {
            if (this.f2349l != e.OPENED) {
                w.o0.a("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                return -1;
            }
            if (list.isEmpty()) {
                return -1;
            }
            try {
                l1Var = new l1();
                arrayList = new ArrayList();
                w.o0.a("CaptureSession", "Issuing capture request.");
                z10 = false;
                for (androidx.camera.core.impl.l0 l0Var : list) {
                    if (l0Var.f().isEmpty()) {
                        w.o0.a("CaptureSession", "Skipping issuing empty capture request.");
                    } else {
                        Iterator<androidx.camera.core.impl.r0> it = l0Var.f().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z11 = true;
                                break;
                            }
                            androidx.camera.core.impl.r0 next = it.next();
                            if (!this.f2347j.containsKey(next)) {
                                w.o0.a("CaptureSession", "Skipping capture request with invalid surface: " + next);
                                z11 = false;
                                break;
                            }
                        }
                        if (z11) {
                            if (l0Var.h() == 2) {
                                z10 = true;
                            }
                            l0.a k10 = l0.a.k(l0Var);
                            if (l0Var.h() == 5 && l0Var.c() != null) {
                                k10.o(l0Var.c());
                            }
                            androidx.camera.core.impl.y1 y1Var = this.f2344g;
                            if (y1Var != null) {
                                k10.e(y1Var.h().e());
                            }
                            k10.e(this.f2345h);
                            k10.e(l0Var.e());
                            CaptureRequest c10 = f1.c(k10.h(), this.f2343f.g(), this.f2347j);
                            if (c10 == null) {
                                w.o0.a("CaptureSession", "Skipping issuing request without surface.");
                                return -1;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<androidx.camera.core.impl.k> it2 = l0Var.b().iterator();
                            while (it2.hasNext()) {
                                t1.b(it2.next(), arrayList2);
                            }
                            l1Var.a(c10, arrayList2);
                            arrayList.add(c10);
                        }
                    }
                }
            } catch (CameraAccessException e10) {
                w.o0.c("CaptureSession", "Unable to access camera: " + e10.getMessage());
                Thread.dumpStack();
            }
            if (arrayList.isEmpty()) {
                w.o0.a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                return -1;
            }
            if (this.f2353p.a(arrayList, z10)) {
                this.f2343f.d();
                l1Var.c(new l1.a() { // from class: androidx.camera.camera2.internal.u1
                    @Override // androidx.camera.camera2.internal.l1.a
                    public final void a(CameraCaptureSession cameraCaptureSession, int i10, boolean z12) {
                        x1.this.s(cameraCaptureSession, i10, z12);
                    }
                });
            }
            if (this.f2354q.b(arrayList, z10)) {
                l1Var.a((CaptureRequest) arrayList.get(arrayList.size() - 1), Collections.singletonList(new c()));
            }
            return this.f2343f.k(arrayList, l1Var);
        }
    }

    void q() {
        if (this.f2339b.isEmpty()) {
            return;
        }
        try {
            p(this.f2339b);
        } finally {
            this.f2339b.clear();
        }
    }

    int r(androidx.camera.core.impl.y1 y1Var) {
        synchronized (this.f2338a) {
            if (y1Var == null) {
                w.o0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            if (this.f2349l != e.OPENED) {
                w.o0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                return -1;
            }
            androidx.camera.core.impl.l0 h10 = y1Var.h();
            if (h10.f().isEmpty()) {
                w.o0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.f2343f.d();
                } catch (CameraAccessException e10) {
                    w.o0.c("CaptureSession", "Unable to access camera: " + e10.getMessage());
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                w.o0.a("CaptureSession", "Issuing request for session.");
                l0.a k10 = l0.a.k(h10);
                androidx.camera.core.impl.n0 v10 = v(this.f2346i.d().e());
                this.f2345h = v10;
                k10.e(v10);
                CaptureRequest c10 = f1.c(k10.h(), this.f2343f.g(), this.f2347j);
                if (c10 == null) {
                    w.o0.a("CaptureSession", "Skipping issuing empty request for session.");
                    return -1;
                }
                return this.f2343f.h(c10, l(h10.b(), this.f2340c));
            } catch (CameraAccessException e11) {
                w.o0.c("CaptureSession", "Unable to access camera: " + e11.getMessage());
                Thread.dumpStack();
                return -1;
            }
        }
    }

    List<androidx.camera.core.impl.l0> x(List<androidx.camera.core.impl.l0> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<androidx.camera.core.impl.l0> it = list.iterator();
        while (it.hasNext()) {
            l0.a k10 = l0.a.k(it.next());
            k10.r(1);
            Iterator<androidx.camera.core.impl.r0> it2 = this.f2344g.h().f().iterator();
            while (it2.hasNext()) {
                k10.f(it2.next());
            }
            arrayList.add(k10.h());
        }
        return arrayList;
    }
}

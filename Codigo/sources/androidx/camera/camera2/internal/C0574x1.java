package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.internal.C0511k3;
import androidx.camera.camera2.internal.C0514l1;
import androidx.camera.camera2.internal.InterfaceC0575x2;
import androidx.camera.core.impl.AbstractC0637k;
import androidx.camera.core.impl.AbstractC0661r0;
import androidx.camera.core.impl.C0642l0;
import androidx.camera.core.impl.C0647m1;
import androidx.camera.core.impl.C0656p1;
import androidx.camera.core.impl.C0701y1;
import androidx.camera.core.impl.InterfaceC0649n0;
import androidx.concurrent.futures.C0742c;
import androidx.core.util.C0984h;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import p002a0.C0007d;
import p002a0.C0009f;
import p002a0.InterfaceC0004a;
import p002a0.InterfaceC0006c;
import p298q.C10214a;
import p298q.C10216c;
import p320r.C10552a;
import p320r.C10553b;
import p320r.C10556e;
import p320r.C10557f;
import p320r.C10574w;
import p354t.C10953r;
import p354t.C10956u;
import p407w.C12029o0;
import p407w.C12048y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.x1 */
/* loaded from: classes.dex */
public final class C0574x1 implements InterfaceC0579y1 {

    /* renamed from: e */
    C0506j3 f2663e;

    /* renamed from: f */
    InterfaceC0575x2 f2664f;

    /* renamed from: g */
    C0701y1 f2665g;

    /* renamed from: l */
    e f2670l;

    /* renamed from: m */
    InterfaceFutureC5920f<Void> f2671m;

    /* renamed from: n */
    C0742c.a<Void> f2672n;

    /* renamed from: r */
    private final C10553b f2676r;

    /* renamed from: a */
    final Object f2659a = new Object();

    /* renamed from: b */
    private final List<C0642l0> f2660b = new ArrayList();

    /* renamed from: c */
    private final CameraCaptureSession.CaptureCallback f2661c = new a();

    /* renamed from: h */
    InterfaceC0649n0 f2666h = C0656p1.m3210X();

    /* renamed from: i */
    C10216c f2667i = C10216c.m30577e();

    /* renamed from: j */
    private final Map<AbstractC0661r0, Surface> f2668j = new HashMap();

    /* renamed from: k */
    List<AbstractC0661r0> f2669k = Collections.emptyList();

    /* renamed from: o */
    Map<AbstractC0661r0, Long> f2673o = new HashMap();

    /* renamed from: p */
    final C10953r f2674p = new C10953r();

    /* renamed from: q */
    final C10956u f2675q = new C10956u();

    /* renamed from: d */
    private final f f2662d = new f();

    /* renamed from: androidx.camera.camera2.internal.x1$a */
    /* loaded from: classes.dex */
    class a extends CameraCaptureSession.CaptureCallback {
        a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.x1$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC0006c<Void> {
        b() {
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: a */
        public void mo8a(Throwable th2) {
            synchronized (C0574x1.this.f2659a) {
                C0574x1.this.f2663e.m2540e();
                int i10 = d.f2680a[C0574x1.this.f2670l.ordinal()];
                if ((i10 == 4 || i10 == 6 || i10 == 7) && !(th2 instanceof CancellationException)) {
                    C12029o0.m38649l("CaptureSession", "Opening session with fail " + C0574x1.this.f2670l, th2);
                    C0574x1.this.m2856m();
                }
            }
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.x1$c */
    /* loaded from: classes.dex */
    public class c extends CameraCaptureSession.CaptureCallback {
        c() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            synchronized (C0574x1.this.f2659a) {
                C0701y1 c0701y1 = C0574x1.this.f2665g;
                if (c0701y1 == null) {
                    return;
                }
                C0642l0 m3386h = c0701y1.m3386h();
                C12029o0.m38638a("CaptureSession", "Submit FLASH_MODE_OFF request");
                C0574x1 c0574x1 = C0574x1.this;
                c0574x1.mo2671a(Collections.singletonList(c0574x1.f2675q.m33437a(m3386h)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.x1$d */
    /* loaded from: classes.dex */
    public static /* synthetic */ class d {

        /* renamed from: a */
        static final /* synthetic */ int[] f2680a;

        static {
            int[] iArr = new int[e.values().length];
            f2680a = iArr;
            try {
                iArr[e.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2680a[e.INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2680a[e.GET_SURFACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2680a[e.OPENING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2680a[e.OPENED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2680a[e.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2680a[e.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2680a[e.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.x1$e */
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
    /* renamed from: androidx.camera.camera2.internal.x1$f */
    /* loaded from: classes.dex */
    public final class f extends InterfaceC0575x2.a {
        f() {
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
        /* renamed from: q */
        public void mo2356q(InterfaceC0575x2 interfaceC0575x2) {
            synchronized (C0574x1.this.f2659a) {
                switch (d.f2680a[C0574x1.this.f2670l.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                        throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + C0574x1.this.f2670l);
                    case 4:
                    case 6:
                    case 7:
                        C0574x1.this.m2856m();
                        break;
                    case 8:
                        C12029o0.m38638a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                        break;
                }
                C12029o0.m38640c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + C0574x1.this.f2670l);
            }
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
        /* renamed from: r */
        public void mo2357r(InterfaceC0575x2 interfaceC0575x2) {
            synchronized (C0574x1.this.f2659a) {
                switch (d.f2680a[C0574x1.this.f2670l.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 8:
                        throw new IllegalStateException("onConfigured() should not be possible in state: " + C0574x1.this.f2670l);
                    case 4:
                        C0574x1 c0574x1 = C0574x1.this;
                        c0574x1.f2670l = e.OPENED;
                        c0574x1.f2664f = interfaceC0575x2;
                        if (c0574x1.f2665g != null) {
                            List<C0642l0> m30581c = c0574x1.f2667i.m30578d().m30581c();
                            if (!m30581c.isEmpty()) {
                                C0574x1 c0574x12 = C0574x1.this;
                                c0574x12.m2857p(c0574x12.m2860x(m30581c));
                            }
                        }
                        C12029o0.m38638a("CaptureSession", "Attempting to send capture request onConfigured");
                        C0574x1 c0574x13 = C0574x1.this;
                        c0574x13.m2859r(c0574x13.f2665g);
                        C0574x1.this.m2858q();
                        break;
                    case 6:
                        C0574x1.this.f2664f = interfaceC0575x2;
                        break;
                    case 7:
                        interfaceC0575x2.close();
                        break;
                }
                C12029o0.m38638a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + C0574x1.this.f2670l);
            }
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
        /* renamed from: s */
        public void mo2358s(InterfaceC0575x2 interfaceC0575x2) {
            synchronized (C0574x1.this.f2659a) {
                if (d.f2680a[C0574x1.this.f2670l.ordinal()] == 1) {
                    throw new IllegalStateException("onReady() should not be possible in state: " + C0574x1.this.f2670l);
                }
                C12029o0.m38638a("CaptureSession", "CameraCaptureSession.onReady() " + C0574x1.this.f2670l);
            }
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
        /* renamed from: t */
        public void mo2359t(InterfaceC0575x2 interfaceC0575x2) {
            synchronized (C0574x1.this.f2659a) {
                if (C0574x1.this.f2670l == e.UNINITIALIZED) {
                    throw new IllegalStateException("onSessionFinished() should not be possible in state: " + C0574x1.this.f2670l);
                }
                C12029o0.m38638a("CaptureSession", "onSessionFinished()");
                C0574x1.this.m2856m();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0574x1(C10553b c10553b) {
        this.f2670l = e.UNINITIALIZED;
        this.f2670l = e.INITIALIZED;
        this.f2676r = c10553b;
    }

    /* renamed from: l */
    private CameraCaptureSession.CaptureCallback m2848l(List<AbstractC0637k> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator<AbstractC0637k> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C0554t1.m2655a(it.next()));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return C0528o0.m2591a(arrayList);
    }

    /* renamed from: n */
    private C10557f m2849n(C0701y1.e eVar, Map<AbstractC0661r0, Surface> map, String str) {
        long j10;
        DynamicRangeProfiles m32042d;
        Surface surface = map.get(eVar.mo3076e());
        C0984h.m4834l(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        C10557f c10557f = new C10557f(eVar.mo3077f(), surface);
        if (str == null) {
            str = eVar.mo3074c();
        }
        c10557f.m32058f(str);
        if (!eVar.mo3075d().isEmpty()) {
            c10557f.m32054b();
            Iterator<AbstractC0661r0> it = eVar.mo3075d().iterator();
            while (it.hasNext()) {
                Surface surface2 = map.get(it.next());
                C0984h.m4834l(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                c10557f.m32053a(surface2);
            }
        }
        if (Build.VERSION.SDK_INT >= 33 && (m32042d = this.f2676r.m32042d()) != null) {
            C12048y mo3073b = eVar.mo3073b();
            Long m32036a = C10552a.m32036a(mo3073b, m32042d);
            if (m32036a != null) {
                j10 = m32036a.longValue();
                c10557f.m32057e(j10);
                return c10557f;
            }
            C12029o0.m38640c("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + mo3073b);
        }
        j10 = 1;
        c10557f.m32057e(j10);
        return c10557f;
    }

    /* renamed from: o */
    private List<C10557f> m2850o(List<C10557f> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C10557f c10557f : list) {
            if (!arrayList.contains(c10557f.m32056d())) {
                arrayList.add(c10557f.m32056d());
                arrayList2.add(c10557f);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m2851s(CameraCaptureSession cameraCaptureSession, int i10, boolean z10) {
        synchronized (this.f2659a) {
            if (this.f2670l == e.OPENED) {
                m2859r(this.f2665g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ Object m2853u(C0742c.a aVar) {
        String str;
        synchronized (this.f2659a) {
            C0984h.m4836n(this.f2672n == null, "Release completer expected to be null");
            this.f2672n = aVar;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    /* renamed from: v */
    private static InterfaceC0649n0 m2854v(List<C0642l0> list) {
        C0647m1 m3184a0 = C0647m1.m3184a0();
        Iterator<C0642l0> it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0649n0 m3153e = it.next().m3153e();
            for (InterfaceC0649n0.a<?> aVar : m3153e.mo3195e()) {
                Object mo3197g = m3153e.mo3197g(aVar, null);
                if (m3184a0.mo3192b(aVar)) {
                    Object mo3197g2 = m3184a0.mo3197g(aVar, null);
                    if (!Objects.equals(mo3197g2, mo3197g)) {
                        C12029o0.m38638a("CaptureSession", "Detect conflicting option " + aVar.mo3015c() + " : " + mo3197g + " != " + mo3197g2);
                    }
                } else {
                    m3184a0.mo3178r(aVar, mo3197g);
                }
            }
        }
        return m3184a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public InterfaceFutureC5920f<Void> m2852t(List<Surface> list, C0701y1 c0701y1, CameraDevice cameraDevice) {
        synchronized (this.f2659a) {
            int i10 = d.f2680a[this.f2670l.ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    this.f2668j.clear();
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        this.f2668j.put(this.f2669k.get(i11), list.get(i11));
                    }
                    this.f2670l = e.OPENING;
                    C12029o0.m38638a("CaptureSession", "Opening capture session.");
                    InterfaceC0575x2.a m2544v = C0511k3.m2544v(this.f2662d, new C0511k3.a(c0701y1.m3387i()));
                    C10214a c10214a = new C10214a(c0701y1.m3382d());
                    C10216c m30560X = c10214a.m30560X(C10216c.m30577e());
                    this.f2667i = m30560X;
                    List<C0642l0> m30582d = m30560X.m30578d().m30582d();
                    C0642l0.a m3159k = C0642l0.a.m3159k(c0701y1.m3386h());
                    Iterator<C0642l0> it = m30582d.iterator();
                    while (it.hasNext()) {
                        m3159k.m3164e(it.next().m3153e());
                    }
                    ArrayList arrayList = new ArrayList();
                    String m30565c0 = c10214a.m30565c0(null);
                    for (C0701y1.e eVar : c0701y1.m3384f()) {
                        C10557f m2849n = m2849n(eVar, this.f2668j, m30565c0);
                        if (this.f2673o.containsKey(eVar.mo3076e())) {
                            m2849n.m32059g(this.f2673o.get(eVar.mo3076e()).longValue());
                        }
                        arrayList.add(m2849n);
                    }
                    C10574w m2536a = this.f2663e.m2536a(0, m2850o(arrayList), m2544v);
                    if (c0701y1.m3390l() == 5 && c0701y1.m3383e() != null) {
                        m2536a.m32091f(C10556e.m32049b(c0701y1.m3383e()));
                    }
                    try {
                        CaptureRequest m2373d = C0484f1.m2373d(m3159k.m3167h(), cameraDevice);
                        if (m2373d != null) {
                            m2536a.m32092g(m2373d);
                        }
                        return this.f2663e.m2538c(cameraDevice, m2536a, this.f2669k);
                    } catch (CameraAccessException e10) {
                        return C0009f.m20f(e10);
                    }
                }
                if (i10 != 5) {
                    return C0009f.m20f(new CancellationException("openCaptureSession() not execute in state: " + this.f2670l));
                }
            }
            return C0009f.m20f(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f2670l));
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0579y1
    /* renamed from: a */
    public void mo2671a(List<C0642l0> list) {
        synchronized (this.f2659a) {
            switch (d.f2680a[this.f2670l.ordinal()]) {
                case 1:
                    throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f2670l);
                case 2:
                case 3:
                case 4:
                    this.f2660b.addAll(list);
                    break;
                case 5:
                    this.f2660b.addAll(list);
                    m2858q();
                    break;
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
            }
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0579y1
    /* renamed from: b */
    public void mo2672b() {
        ArrayList arrayList;
        synchronized (this.f2659a) {
            if (this.f2660b.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(this.f2660b);
                this.f2660b.clear();
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator<AbstractC0637k> it2 = ((C0642l0) it.next()).m3150b().iterator();
                while (it2.hasNext()) {
                    it2.next().mo2410a();
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[Catch: all -> 0x00af, TryCatch #1 {, blocks: (B:4:0x0003, B:5:0x000d, B:7:0x00a8, B:11:0x0012, B:16:0x0018, B:14:0x0024, B:19:0x001d, B:20:0x0029, B:22:0x0056, B:23:0x005a, B:25:0x005e, B:26:0x0069, B:27:0x006b, B:29:0x006d, B:30:0x008a, B:31:0x008f, B:32:0x00a7), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e A[Catch: all -> 0x00af, TryCatch #1 {, blocks: (B:4:0x0003, B:5:0x000d, B:7:0x00a8, B:11:0x0012, B:16:0x0018, B:14:0x0024, B:19:0x001d, B:20:0x0029, B:22:0x0056, B:23:0x005a, B:25:0x005e, B:26:0x0069, B:27:0x006b, B:29:0x006d, B:30:0x008a, B:31:0x008f, B:32:0x00a7), top: B:3:0x0003, inners: #0 }] */
    @Override // androidx.camera.camera2.internal.InterfaceC0579y1
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.util.concurrent.InterfaceFutureC5920f<java.lang.Void> mo2673c(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f2659a
            monitor-enter(r0)
            int[] r1 = androidx.camera.camera2.internal.C0574x1.d.f2680a     // Catch: java.lang.Throwable -> Laf
            androidx.camera.camera2.internal.x1$e r2 = r3.f2670l     // Catch: java.lang.Throwable -> Laf
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
            androidx.camera.camera2.internal.x2 r1 = r3.f2664f     // Catch: java.lang.Throwable -> Laf
            if (r1 == 0) goto L29
            if (r4 == 0) goto L24
            r1.mo2345f()     // Catch: android.hardware.camera2.CameraAccessException -> L1c java.lang.Throwable -> Laf
            goto L24
        L1c:
            r4 = move-exception
            java.lang.String r1 = "CaptureSession"
            java.lang.String r2 = "Unable to abort captures."
            p407w.C12029o0.m38641d(r1, r2, r4)     // Catch: java.lang.Throwable -> Laf
        L24:
            androidx.camera.camera2.internal.x2 r4 = r3.f2664f     // Catch: java.lang.Throwable -> Laf
            r4.close()     // Catch: java.lang.Throwable -> Laf
        L29:
            q.c r4 = r3.f2667i     // Catch: java.lang.Throwable -> Laf
            q.c$a r4 = r4.m30578d()     // Catch: java.lang.Throwable -> Laf
            r4.m30579a()     // Catch: java.lang.Throwable -> Laf
            androidx.camera.camera2.internal.x1$e r4 = androidx.camera.camera2.internal.C0574x1.e.RELEASING     // Catch: java.lang.Throwable -> Laf
            r3.f2670l = r4     // Catch: java.lang.Throwable -> Laf
            androidx.camera.camera2.internal.j3 r4 = r3.f2663e     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r1.<init>()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch: java.lang.Throwable -> Laf
            androidx.camera.camera2.internal.x1$e r2 = r3.f2670l     // Catch: java.lang.Throwable -> Laf
            r1.append(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Laf
            androidx.core.util.C0984h.m4834l(r4, r1)     // Catch: java.lang.Throwable -> Laf
            androidx.camera.camera2.internal.j3 r4 = r3.f2663e     // Catch: java.lang.Throwable -> Laf
            boolean r4 = r4.m2540e()     // Catch: java.lang.Throwable -> Laf
            if (r4 == 0) goto L5a
            r3.m2856m()     // Catch: java.lang.Throwable -> Laf
            goto La8
        L5a:
            com.google.common.util.concurrent.f<java.lang.Void> r4 = r3.f2671m     // Catch: java.lang.Throwable -> Laf
            if (r4 != 0) goto L69
            androidx.camera.camera2.internal.w1 r4 = new androidx.camera.camera2.internal.w1     // Catch: java.lang.Throwable -> Laf
            r4.<init>()     // Catch: java.lang.Throwable -> Laf
            com.google.common.util.concurrent.f r4 = androidx.concurrent.futures.C0742c.m3752a(r4)     // Catch: java.lang.Throwable -> Laf
            r3.f2671m = r4     // Catch: java.lang.Throwable -> Laf
        L69:
            com.google.common.util.concurrent.f<java.lang.Void> r4 = r3.f2671m     // Catch: java.lang.Throwable -> Laf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laf
            return r4
        L6d:
            androidx.camera.camera2.internal.j3 r4 = r3.f2663e     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r1.<init>()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch: java.lang.Throwable -> Laf
            androidx.camera.camera2.internal.x1$e r2 = r3.f2670l     // Catch: java.lang.Throwable -> Laf
            r1.append(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Laf
            androidx.core.util.C0984h.m4834l(r4, r1)     // Catch: java.lang.Throwable -> Laf
            androidx.camera.camera2.internal.j3 r4 = r3.f2663e     // Catch: java.lang.Throwable -> Laf
            r4.m2540e()     // Catch: java.lang.Throwable -> Laf
        L8a:
            androidx.camera.camera2.internal.x1$e r4 = androidx.camera.camera2.internal.C0574x1.e.RELEASED     // Catch: java.lang.Throwable -> Laf
            r3.f2670l = r4     // Catch: java.lang.Throwable -> Laf
            goto La8
        L8f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r1.<init>()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = "release() should not be possible in state: "
            r1.append(r2)     // Catch: java.lang.Throwable -> Laf
            androidx.camera.camera2.internal.x1$e r2 = r3.f2670l     // Catch: java.lang.Throwable -> Laf
            r1.append(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Laf
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Laf
            throw r4     // Catch: java.lang.Throwable -> Laf
        La8:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laf
            r4 = 0
            com.google.common.util.concurrent.f r4 = p002a0.C0009f.m22h(r4)
            return r4
        Laf:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laf
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.C0574x1.mo2673c(boolean):com.google.common.util.concurrent.f");
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0579y1
    public void close() {
        synchronized (this.f2659a) {
            int i10 = d.f2680a[this.f2670l.ordinal()];
            if (i10 == 1) {
                throw new IllegalStateException("close() should not be possible in state: " + this.f2670l);
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            if (this.f2665g != null) {
                                List<C0642l0> m30580b = this.f2667i.m30578d().m30580b();
                                if (!m30580b.isEmpty()) {
                                    try {
                                        mo2671a(m2860x(m30580b));
                                    } catch (IllegalStateException e10) {
                                        C12029o0.m38641d("CaptureSession", "Unable to issue the request before close the capture session", e10);
                                    }
                                }
                            }
                        }
                    }
                    C0984h.m4834l(this.f2663e, "The Opener shouldn't null in state:" + this.f2670l);
                    this.f2663e.m2540e();
                    this.f2670l = e.CLOSED;
                    this.f2665g = null;
                } else {
                    C0984h.m4834l(this.f2663e, "The Opener shouldn't null in state:" + this.f2670l);
                    this.f2663e.m2540e();
                }
            }
            this.f2670l = e.RELEASED;
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0579y1
    /* renamed from: d */
    public List<C0642l0> mo2674d() {
        List<C0642l0> unmodifiableList;
        synchronized (this.f2659a) {
            unmodifiableList = Collections.unmodifiableList(this.f2660b);
        }
        return unmodifiableList;
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0579y1
    /* renamed from: e */
    public C0701y1 mo2675e() {
        C0701y1 c0701y1;
        synchronized (this.f2659a) {
            c0701y1 = this.f2665g;
        }
        return c0701y1;
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0579y1
    /* renamed from: f */
    public void mo2676f(C0701y1 c0701y1) {
        synchronized (this.f2659a) {
            switch (d.f2680a[this.f2670l.ordinal()]) {
                case 1:
                    throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f2670l);
                case 2:
                case 3:
                case 4:
                    this.f2665g = c0701y1;
                    break;
                case 5:
                    this.f2665g = c0701y1;
                    if (c0701y1 != null) {
                        if (!this.f2668j.keySet().containsAll(c0701y1.m3389k())) {
                            C12029o0.m38640c("CaptureSession", "Does not have the proper configured lists");
                            return;
                        } else {
                            C12029o0.m38638a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                            m2859r(this.f2665g);
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

    @Override // androidx.camera.camera2.internal.InterfaceC0579y1
    /* renamed from: g */
    public InterfaceFutureC5920f<Void> mo2677g(final C0701y1 c0701y1, final CameraDevice cameraDevice, C0506j3 c0506j3) {
        synchronized (this.f2659a) {
            if (d.f2680a[this.f2670l.ordinal()] == 2) {
                this.f2670l = e.GET_SURFACE;
                ArrayList arrayList = new ArrayList(c0701y1.m3389k());
                this.f2669k = arrayList;
                this.f2663e = c0506j3;
                C0007d m13e = C0007d.m9a(c0506j3.m2539d(arrayList, 5000L)).m13e(new InterfaceC0004a() { // from class: androidx.camera.camera2.internal.v1
                    @Override // p002a0.InterfaceC0004a
                    public final InterfaceFutureC5920f apply(Object obj) {
                        InterfaceFutureC5920f m2852t;
                        m2852t = C0574x1.this.m2852t(c0701y1, cameraDevice, (List) obj);
                        return m2852t;
                    }
                }, this.f2663e.m2537b());
                C0009f.m16b(m13e, new b(), this.f2663e.m2537b());
                return C0009f.m24j(m13e);
            }
            C12029o0.m38640c("CaptureSession", "Open not allowed in state: " + this.f2670l);
            return C0009f.m20f(new IllegalStateException("open() should not allow the state: " + this.f2670l));
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0579y1
    /* renamed from: h */
    public void mo2678h(Map<AbstractC0661r0, Long> map) {
        synchronized (this.f2659a) {
            this.f2673o = map;
        }
    }

    /* renamed from: m */
    void m2856m() {
        e eVar = this.f2670l;
        e eVar2 = e.RELEASED;
        if (eVar == eVar2) {
            C12029o0.m38638a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f2670l = eVar2;
        this.f2664f = null;
        C0742c.a<Void> aVar = this.f2672n;
        if (aVar != null) {
            aVar.m3756c(null);
            this.f2672n = null;
        }
    }

    /* renamed from: p */
    int m2857p(List<C0642l0> list) {
        C0514l1 c0514l1;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        synchronized (this.f2659a) {
            if (this.f2670l != e.OPENED) {
                C12029o0.m38638a("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                return -1;
            }
            if (list.isEmpty()) {
                return -1;
            }
            try {
                c0514l1 = new C0514l1();
                arrayList = new ArrayList();
                C12029o0.m38638a("CaptureSession", "Issuing capture request.");
                z10 = false;
                for (C0642l0 c0642l0 : list) {
                    if (c0642l0.m3154f().isEmpty()) {
                        C12029o0.m38638a("CaptureSession", "Skipping issuing empty capture request.");
                    } else {
                        Iterator<AbstractC0661r0> it = c0642l0.m3154f().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z11 = true;
                                break;
                            }
                            AbstractC0661r0 next = it.next();
                            if (!this.f2668j.containsKey(next)) {
                                C12029o0.m38638a("CaptureSession", "Skipping capture request with invalid surface: " + next);
                                z11 = false;
                                break;
                            }
                        }
                        if (z11) {
                            if (c0642l0.m3156h() == 2) {
                                z10 = true;
                            }
                            C0642l0.a m3159k = C0642l0.a.m3159k(c0642l0);
                            if (c0642l0.m3156h() == 5 && c0642l0.m3151c() != null) {
                                m3159k.m3172o(c0642l0.m3151c());
                            }
                            C0701y1 c0701y1 = this.f2665g;
                            if (c0701y1 != null) {
                                m3159k.m3164e(c0701y1.m3386h().m3153e());
                            }
                            m3159k.m3164e(this.f2666h);
                            m3159k.m3164e(c0642l0.m3153e());
                            CaptureRequest m2372c = C0484f1.m2372c(m3159k.m3167h(), this.f2664f.mo2346g(), this.f2668j);
                            if (m2372c == null) {
                                C12029o0.m38638a("CaptureSession", "Skipping issuing request without surface.");
                                return -1;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<AbstractC0637k> it2 = c0642l0.m3150b().iterator();
                            while (it2.hasNext()) {
                                C0554t1.m2656b(it2.next(), arrayList2);
                            }
                            c0514l1.m2547a(m2372c, arrayList2);
                            arrayList.add(m2372c);
                        }
                    }
                }
            } catch (CameraAccessException e10) {
                C12029o0.m38640c("CaptureSession", "Unable to access camera: " + e10.getMessage());
                Thread.dumpStack();
            }
            if (arrayList.isEmpty()) {
                C12029o0.m38638a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                return -1;
            }
            if (this.f2674p.m33434a(arrayList, z10)) {
                this.f2664f.mo2343d();
                c0514l1.m2548c(new C0514l1.a() { // from class: androidx.camera.camera2.internal.u1
                    @Override // androidx.camera.camera2.internal.C0514l1.a
                    /* renamed from: a */
                    public final void mo2549a(CameraCaptureSession cameraCaptureSession, int i10, boolean z12) {
                        C0574x1.this.m2851s(cameraCaptureSession, i10, z12);
                    }
                });
            }
            if (this.f2675q.m33438b(arrayList, z10)) {
                c0514l1.m2547a((CaptureRequest) arrayList.get(arrayList.size() - 1), Collections.singletonList(new c()));
            }
            return this.f2664f.mo2350k(arrayList, c0514l1);
        }
    }

    /* renamed from: q */
    void m2858q() {
        if (this.f2660b.isEmpty()) {
            return;
        }
        try {
            m2857p(this.f2660b);
        } finally {
            this.f2660b.clear();
        }
    }

    /* renamed from: r */
    int m2859r(C0701y1 c0701y1) {
        synchronized (this.f2659a) {
            if (c0701y1 == null) {
                C12029o0.m38638a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            if (this.f2670l != e.OPENED) {
                C12029o0.m38638a("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                return -1;
            }
            C0642l0 m3386h = c0701y1.m3386h();
            if (m3386h.m3154f().isEmpty()) {
                C12029o0.m38638a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.f2664f.mo2343d();
                } catch (CameraAccessException e10) {
                    C12029o0.m38640c("CaptureSession", "Unable to access camera: " + e10.getMessage());
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                C12029o0.m38638a("CaptureSession", "Issuing request for session.");
                C0642l0.a m3159k = C0642l0.a.m3159k(m3386h);
                InterfaceC0649n0 m2854v = m2854v(this.f2667i.m30578d().m30583e());
                this.f2666h = m2854v;
                m3159k.m3164e(m2854v);
                CaptureRequest m2372c = C0484f1.m2372c(m3159k.m3167h(), this.f2664f.mo2346g(), this.f2668j);
                if (m2372c == null) {
                    C12029o0.m38638a("CaptureSession", "Skipping issuing empty request for session.");
                    return -1;
                }
                return this.f2664f.mo2347h(m2372c, m2848l(m3386h.m3150b(), this.f2661c));
            } catch (CameraAccessException e11) {
                C12029o0.m38640c("CaptureSession", "Unable to access camera: " + e11.getMessage());
                Thread.dumpStack();
                return -1;
            }
        }
    }

    /* renamed from: x */
    List<C0642l0> m2860x(List<C0642l0> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<C0642l0> it = list.iterator();
        while (it.hasNext()) {
            C0642l0.a m3159k = C0642l0.a.m3159k(it.next());
            m3159k.m3175r(1);
            Iterator<AbstractC0661r0> it2 = this.f2665g.m3386h().m3154f().iterator();
            while (it2.hasNext()) {
                m3159k.m3165f(it2.next());
            }
            arrayList.add(m3159k.m3167h());
        }
        return arrayList;
    }
}

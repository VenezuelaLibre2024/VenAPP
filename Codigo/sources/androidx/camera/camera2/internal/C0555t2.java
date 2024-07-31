package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Size;
import androidx.camera.core.C0593f;
import androidx.camera.core.C0709n;
import androidx.camera.core.C0714s;
import androidx.camera.core.impl.AbstractC0637k;
import androidx.camera.core.impl.AbstractC0659q1;
import androidx.camera.core.impl.AbstractC0661r0;
import androidx.camera.core.impl.C0600a2;
import androidx.camera.core.impl.C0642l0;
import androidx.camera.core.impl.C0694w0;
import androidx.camera.core.impl.C0701y1;
import androidx.camera.core.impl.InterfaceC0649n0;
import androidx.camera.core.impl.InterfaceC0704z1;
import androidx.core.util.C0984h;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p002a0.C0007d;
import p002a0.C0009f;
import p002a0.InterfaceC0004a;
import p002a0.InterfaceC0006c;
import p227m.InterfaceC9531a;
import p298q.C10214a;
import p320r.C10553b;
import p389v.C11600j;
import p407w.C12029o0;
import p474z.C12747a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.t2 */
/* loaded from: classes.dex */
public final class C0555t2 implements InterfaceC0579y1 {

    /* renamed from: q */
    private static List<AbstractC0661r0> f2546q = new ArrayList();

    /* renamed from: r */
    private static int f2547r = 0;

    /* renamed from: a */
    private final InterfaceC0704z1 f2548a;

    /* renamed from: b */
    private final C0523n0 f2549b;

    /* renamed from: c */
    final Executor f2550c;

    /* renamed from: d */
    private final ScheduledExecutorService f2551d;

    /* renamed from: e */
    private final C0574x1 f2552e;

    /* renamed from: g */
    private C0701y1 f2554g;

    /* renamed from: h */
    private C0499i1 f2555h;

    /* renamed from: i */
    private C0701y1 f2556i;

    /* renamed from: p */
    private int f2563p;

    /* renamed from: f */
    private List<AbstractC0661r0> f2553f = new ArrayList();

    /* renamed from: k */
    private volatile List<C0642l0> f2558k = null;

    /* renamed from: l */
    volatile boolean f2559l = false;

    /* renamed from: n */
    private C11600j f2561n = new C11600j.a().m36369d();

    /* renamed from: o */
    private C11600j f2562o = new C11600j.a().m36369d();

    /* renamed from: j */
    private e f2557j = e.UNINITIALIZED;

    /* renamed from: m */
    private final f f2560m = new f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.t2$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC0006c<Void> {
        a() {
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: a */
        public void mo8a(Throwable th2) {
            C12029o0.m38641d("ProcessingCaptureSession", "open session failed ", th2);
            C0555t2.this.close();
            C0555t2.this.mo2673c(false);
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.t2$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC0704z1.a {

        /* renamed from: a */
        final /* synthetic */ C0642l0 f2565a;

        b(C0642l0 c0642l0) {
            this.f2565a = c0642l0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.t2$c */
    /* loaded from: classes.dex */
    public class c implements InterfaceC0704z1.a {

        /* renamed from: a */
        final /* synthetic */ C0642l0 f2567a;

        c(C0642l0 c0642l0) {
            this.f2567a = c0642l0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.t2$d */
    /* loaded from: classes.dex */
    public static /* synthetic */ class d {

        /* renamed from: a */
        static final /* synthetic */ int[] f2569a;

        static {
            int[] iArr = new int[e.values().length];
            f2569a = iArr;
            try {
                iArr[e.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2569a[e.SESSION_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2569a[e.ON_CAPTURE_SESSION_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2569a[e.ON_CAPTURE_SESSION_ENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2569a[e.DE_INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.camera.camera2.internal.t2$e */
    /* loaded from: classes.dex */
    public enum e {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        DE_INITIALIZED
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.camera.camera2.internal.t2$f */
    /* loaded from: classes.dex */
    public static class f implements InterfaceC0704z1.a {
        f() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0555t2(InterfaceC0704z1 interfaceC0704z1, C0523n0 c0523n0, C10553b c10553b, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f2563p = 0;
        this.f2552e = new C0574x1(c10553b);
        this.f2548a = interfaceC0704z1;
        this.f2549b = c0523n0;
        this.f2550c = executor;
        this.f2551d = scheduledExecutorService;
        int i10 = f2547r;
        f2547r = i10 + 1;
        this.f2563p = i10;
        C12029o0.m38638a("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + this.f2563p + ")");
    }

    /* renamed from: n */
    private static void m2662n(List<C0642l0> list) {
        Iterator<C0642l0> it = list.iterator();
        while (it.hasNext()) {
            Iterator<AbstractC0637k> it2 = it.next().m3150b().iterator();
            while (it2.hasNext()) {
                it2.next().mo2410a();
            }
        }
    }

    /* renamed from: o */
    private static List<C0600a2> m2663o(List<AbstractC0661r0> list) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0661r0 abstractC0661r0 : list) {
            C0984h.m4824b(abstractC0661r0 instanceof C0600a2, "Surface must be SessionProcessorSurface");
            arrayList.add((C0600a2) abstractC0661r0);
        }
        return arrayList;
    }

    /* renamed from: p */
    private boolean m2664p(C0642l0 c0642l0) {
        Iterator<AbstractC0661r0> it = c0642l0.m3154f().iterator();
        while (it.hasNext()) {
            if (Objects.equals(it.next().m3226g(), C0714s.class)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m2665s() {
        C0694w0.m3367e(this.f2553f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static /* synthetic */ void m2666t(AbstractC0661r0 abstractC0661r0) {
        f2546q.remove(abstractC0661r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ InterfaceFutureC5920f m2667u(C0701y1 c0701y1, CameraDevice cameraDevice, C0506j3 c0506j3, List list) {
        C12029o0.m38638a("ProcessingCaptureSession", "-- getSurfaces done, start init (id=" + this.f2563p + ")");
        if (this.f2557j == e.DE_INITIALIZED) {
            return C0009f.m20f(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        AbstractC0659q1 abstractC0659q1 = null;
        if (list.contains(null)) {
            return C0009f.m20f(new AbstractC0661r0.a("Surface closed", c0701y1.m3389k().get(list.indexOf(null))));
        }
        AbstractC0659q1 abstractC0659q12 = null;
        AbstractC0659q1 abstractC0659q13 = null;
        for (int i10 = 0; i10 < c0701y1.m3389k().size(); i10++) {
            AbstractC0661r0 abstractC0661r0 = c0701y1.m3389k().get(i10);
            if (Objects.equals(abstractC0661r0.m3226g(), C0714s.class)) {
                abstractC0659q1 = AbstractC0659q1.m3214a(abstractC0661r0.m3229j().get(), new Size(abstractC0661r0.m3227h().getWidth(), abstractC0661r0.m3227h().getHeight()), abstractC0661r0.m3228i());
            } else if (Objects.equals(abstractC0661r0.m3226g(), C0709n.class)) {
                abstractC0659q12 = AbstractC0659q1.m3214a(abstractC0661r0.m3229j().get(), new Size(abstractC0661r0.m3227h().getWidth(), abstractC0661r0.m3227h().getHeight()), abstractC0661r0.m3228i());
            } else if (Objects.equals(abstractC0661r0.m3226g(), C0593f.class)) {
                abstractC0659q13 = AbstractC0659q1.m3214a(abstractC0661r0.m3229j().get(), new Size(abstractC0661r0.m3227h().getWidth(), abstractC0661r0.m3227h().getHeight()), abstractC0661r0.m3228i());
            }
        }
        this.f2557j = e.SESSION_INITIALIZED;
        try {
            C0694w0.m3368f(this.f2553f);
            C12029o0.m38648k("ProcessingCaptureSession", "== initSession (id=" + this.f2563p + ")");
            try {
                C0701y1 m3428h = this.f2548a.m3428h(this.f2549b, abstractC0659q1, abstractC0659q12, abstractC0659q13);
                this.f2556i = m3428h;
                m3428h.m3389k().get(0).m3230k().addListener(new Runnable() { // from class: androidx.camera.camera2.internal.r2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0555t2.this.m2665s();
                    }
                }, C12747a.m42280a());
                for (final AbstractC0661r0 abstractC0661r02 : this.f2556i.m3389k()) {
                    f2546q.add(abstractC0661r02);
                    abstractC0661r02.m3230k().addListener(new Runnable() { // from class: androidx.camera.camera2.internal.s2
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0555t2.m2666t(AbstractC0661r0.this);
                        }
                    }, this.f2550c);
                }
                C0701y1.g gVar = new C0701y1.g();
                gVar.m3416a(c0701y1);
                gVar.m3418c();
                gVar.m3416a(this.f2556i);
                C0984h.m4824b(gVar.m3419e(), "Cannot transform the SessionConfig");
                InterfaceFutureC5920f<Void> mo2677g = this.f2552e.mo2677g(gVar.m3417b(), (CameraDevice) C0984h.m4833k(cameraDevice), c0506j3);
                C0009f.m16b(mo2677g, new a(), this.f2550c);
                return mo2677g;
            } catch (Throwable th2) {
                C0694w0.m3367e(this.f2553f);
                throw th2;
            }
        } catch (AbstractC0661r0.a e10) {
            return C0009f.m20f(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ Void m2668v(Void r12) {
        m2681x(this.f2552e);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m2669w() {
        C12029o0.m38638a("ProcessingCaptureSession", "== deInitSession (id=" + this.f2563p + ")");
        this.f2548a.m3423c();
    }

    /* renamed from: y */
    private void m2670y(C11600j c11600j, C11600j c11600j2) {
        C10214a.a aVar = new C10214a.a();
        aVar.m30570d(c11600j);
        aVar.m30570d(c11600j2);
        this.f2548a.m3429i(aVar.m30569c());
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0579y1
    /* renamed from: a */
    public void mo2671a(List<C0642l0> list) {
        if (list.isEmpty()) {
            return;
        }
        C12029o0.m38638a("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f2563p + ") + state =" + this.f2557j);
        int i10 = d.f2569a[this.f2557j.ordinal()];
        if (i10 == 1 || i10 == 2) {
            this.f2558k = list;
            return;
        }
        if (i10 == 3) {
            for (C0642l0 c0642l0 : list) {
                if (c0642l0.m3156h() == 2) {
                    m2679q(c0642l0);
                } else {
                    m2680r(c0642l0);
                }
            }
            return;
        }
        if (i10 == 4 || i10 == 5) {
            C12029o0.m38638a("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.f2557j);
            m2662n(list);
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0579y1
    /* renamed from: b */
    public void mo2672b() {
        C12029o0.m38638a("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f2563p + ")");
        if (this.f2558k != null) {
            Iterator<C0642l0> it = this.f2558k.iterator();
            while (it.hasNext()) {
                Iterator<AbstractC0637k> it2 = it.next().m3150b().iterator();
                while (it2.hasNext()) {
                    it2.next().mo2410a();
                }
            }
            this.f2558k = null;
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0579y1
    /* renamed from: c */
    public InterfaceFutureC5920f<Void> mo2673c(boolean z10) {
        C12029o0.m38638a("ProcessingCaptureSession", "release (id=" + this.f2563p + ") mProcessorState=" + this.f2557j);
        InterfaceFutureC5920f<Void> mo2673c = this.f2552e.mo2673c(z10);
        int i10 = d.f2569a[this.f2557j.ordinal()];
        if (i10 == 2 || i10 == 4) {
            mo2673c.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.o2
                @Override // java.lang.Runnable
                public final void run() {
                    C0555t2.this.m2669w();
                }
            }, C12747a.m42280a());
        }
        this.f2557j = e.DE_INITIALIZED;
        return mo2673c;
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0579y1
    public void close() {
        C12029o0.m38638a("ProcessingCaptureSession", "close (id=" + this.f2563p + ") state=" + this.f2557j);
        if (this.f2557j == e.ON_CAPTURE_SESSION_STARTED) {
            C12029o0.m38638a("ProcessingCaptureSession", "== onCaptureSessionEnd (id = " + this.f2563p + ")");
            this.f2548a.m3422b();
            C0499i1 c0499i1 = this.f2555h;
            if (c0499i1 != null) {
                c0499i1.m2414a();
            }
            this.f2557j = e.ON_CAPTURE_SESSION_ENDED;
        }
        this.f2552e.close();
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0579y1
    /* renamed from: d */
    public List<C0642l0> mo2674d() {
        return this.f2558k != null ? this.f2558k : Collections.emptyList();
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0579y1
    /* renamed from: e */
    public C0701y1 mo2675e() {
        return this.f2554g;
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0579y1
    /* renamed from: f */
    public void mo2676f(C0701y1 c0701y1) {
        C12029o0.m38638a("ProcessingCaptureSession", "setSessionConfig (id=" + this.f2563p + ")");
        this.f2554g = c0701y1;
        if (c0701y1 == null) {
            return;
        }
        C0499i1 c0499i1 = this.f2555h;
        if (c0499i1 != null) {
            c0499i1.m2415b(c0701y1);
        }
        if (this.f2557j == e.ON_CAPTURE_SESSION_STARTED) {
            C11600j m36369d = C11600j.a.m36367e(c0701y1.m3382d()).m36369d();
            this.f2561n = m36369d;
            m2670y(m36369d, this.f2562o);
            if (m2664p(c0701y1.m3386h())) {
                this.f2548a.m3427g(this.f2560m);
            } else {
                this.f2548a.m3424d();
            }
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0579y1
    /* renamed from: g */
    public InterfaceFutureC5920f<Void> mo2677g(final C0701y1 c0701y1, final CameraDevice cameraDevice, final C0506j3 c0506j3) {
        C0984h.m4824b(this.f2557j == e.UNINITIALIZED, "Invalid state state:" + this.f2557j);
        C0984h.m4824b(c0701y1.m3389k().isEmpty() ^ true, "SessionConfig contains no surfaces");
        C12029o0.m38638a("ProcessingCaptureSession", "open (id=" + this.f2563p + ")");
        List<AbstractC0661r0> m3389k = c0701y1.m3389k();
        this.f2553f = m3389k;
        return C0007d.m9a(C0694w0.m3373k(m3389k, false, 5000L, this.f2550c, this.f2551d)).m13e(new InterfaceC0004a() { // from class: androidx.camera.camera2.internal.p2
            @Override // p002a0.InterfaceC0004a
            public final InterfaceFutureC5920f apply(Object obj) {
                InterfaceFutureC5920f m2667u;
                m2667u = C0555t2.this.m2667u(c0701y1, cameraDevice, c0506j3, (List) obj);
                return m2667u;
            }
        }, this.f2550c).m12d(new InterfaceC9531a() { // from class: androidx.camera.camera2.internal.q2
            @Override // p227m.InterfaceC9531a
            public final Object apply(Object obj) {
                Void m2668v;
                m2668v = C0555t2.this.m2668v((Void) obj);
                return m2668v;
            }
        }, this.f2550c);
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0579y1
    /* renamed from: h */
    public void mo2678h(Map<AbstractC0661r0, Long> map) {
    }

    /* renamed from: q */
    void m2679q(C0642l0 c0642l0) {
        C11600j.a m36367e = C11600j.a.m36367e(c0642l0.m3153e());
        InterfaceC0649n0 m3153e = c0642l0.m3153e();
        InterfaceC0649n0.a<Integer> aVar = C0642l0.f2875i;
        if (m3153e.mo3192b(aVar)) {
            m36367e.m36370g(CaptureRequest.JPEG_ORIENTATION, (Integer) c0642l0.m3153e().mo3191a(aVar));
        }
        InterfaceC0649n0 m3153e2 = c0642l0.m3153e();
        InterfaceC0649n0.a<Integer> aVar2 = C0642l0.f2876j;
        if (m3153e2.mo3192b(aVar2)) {
            m36367e.m36370g(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) c0642l0.m3153e().mo3191a(aVar2)).byteValue()));
        }
        C11600j m36369d = m36367e.m36369d();
        this.f2562o = m36369d;
        m2670y(this.f2561n, m36369d);
        this.f2548a.m3430j(new c(c0642l0));
    }

    /* renamed from: r */
    void m2680r(C0642l0 c0642l0) {
        boolean z10;
        C12029o0.m38638a("ProcessingCaptureSession", "issueTriggerRequest");
        C11600j m36369d = C11600j.a.m36367e(c0642l0.m3153e()).m36369d();
        Iterator<InterfaceC0649n0.a<?>> it = m36369d.mo3195e().iterator();
        while (it.hasNext()) {
            CaptureRequest.Key key = (CaptureRequest.Key) it.next().mo3016d();
            if (key.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                z10 = true;
                break;
            }
        }
        z10 = false;
        if (z10) {
            this.f2548a.m3426f(m36369d, new b(c0642l0));
        } else {
            m2662n(Arrays.asList(c0642l0));
        }
    }

    /* renamed from: x */
    void m2681x(C0574x1 c0574x1) {
        C0984h.m4824b(this.f2557j == e.SESSION_INITIALIZED, "Invalid state state:" + this.f2557j);
        this.f2555h = new C0499i1(c0574x1, m2663o(this.f2556i.m3389k()));
        C12029o0.m38638a("ProcessingCaptureSession", "== onCaptureSessinStarted (id = " + this.f2563p + ")");
        this.f2548a.m3421a(this.f2555h);
        this.f2557j = e.ON_CAPTURE_SESSION_STARTED;
        C0701y1 c0701y1 = this.f2554g;
        if (c0701y1 != null) {
            mo2676f(c0701y1);
        }
        if (this.f2558k != null) {
            mo2671a(this.f2558k);
            this.f2558k = null;
        }
    }
}

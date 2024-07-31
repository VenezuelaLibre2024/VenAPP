package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.InterfaceC0575x2;
import androidx.camera.core.impl.AbstractC0661r0;
import androidx.camera.core.impl.C0668t1;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p320r.C10557f;
import p320r.C10574w;
import p354t.C10943h;
import p354t.C10944i;
import p354t.C10960y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.j3 */
/* loaded from: classes.dex */
public final class C0506j3 {

    /* renamed from: a */
    private final b f2405a;

    /* renamed from: androidx.camera.camera2.internal.j3$a */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a */
        private final Executor f2406a;

        /* renamed from: b */
        private final ScheduledExecutorService f2407b;

        /* renamed from: c */
        private final Handler f2408c;

        /* renamed from: d */
        private final C0404a2 f2409d;

        /* renamed from: e */
        private final C0668t1 f2410e;

        /* renamed from: f */
        private final C0668t1 f2411f;

        /* renamed from: g */
        private final boolean f2412g;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, C0404a2 c0404a2, C0668t1 c0668t1, C0668t1 c0668t12) {
            this.f2406a = executor;
            this.f2407b = scheduledExecutorService;
            this.f2408c = handler;
            this.f2409d = c0404a2;
            this.f2410e = c0668t1;
            this.f2411f = c0668t12;
            this.f2412g = new C10944i(c0668t1, c0668t12).m33421b() || new C10960y(c0668t1).m33448i() || new C10943h(c0668t12).m33419d();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public C0506j3 m2541a() {
            return new C0506j3(this.f2412g ? new C0501i3(this.f2410e, this.f2411f, this.f2409d, this.f2406a, this.f2407b, this.f2408c) : new C0476d3(this.f2409d, this.f2406a, this.f2407b, this.f2408c));
        }
    }

    /* renamed from: androidx.camera.camera2.internal.j3$b */
    /* loaded from: classes.dex */
    interface b {
        /* renamed from: b */
        Executor mo2341b();

        /* renamed from: i */
        C10574w mo2348i(int i10, List<C10557f> list, InterfaceC0575x2.a aVar);

        /* renamed from: j */
        InterfaceFutureC5920f<List<Surface>> mo2349j(List<AbstractC0661r0> list, long j10);

        /* renamed from: n */
        InterfaceFutureC5920f<Void> mo2353n(CameraDevice cameraDevice, C10574w c10574w, List<AbstractC0661r0> list);

        boolean stop();
    }

    C0506j3(b bVar) {
        this.f2405a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C10574w m2536a(int i10, List<C10557f> list, InterfaceC0575x2.a aVar) {
        return this.f2405a.mo2348i(i10, list, aVar);
    }

    /* renamed from: b */
    public Executor m2537b() {
        return this.f2405a.mo2341b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public InterfaceFutureC5920f<Void> m2538c(CameraDevice cameraDevice, C10574w c10574w, List<AbstractC0661r0> list) {
        return this.f2405a.mo2353n(cameraDevice, c10574w, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public InterfaceFutureC5920f<List<Surface>> m2539d(List<AbstractC0661r0> list, long j10) {
        return this.f2405a.mo2349j(list, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m2540e() {
        return this.f2405a.stop();
    }
}

package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.x2;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j3 {

    /* renamed from: a, reason: collision with root package name */
    private final b f2085a;

    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f2086a;

        /* renamed from: b, reason: collision with root package name */
        private final ScheduledExecutorService f2087b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f2088c;

        /* renamed from: d, reason: collision with root package name */
        private final a2 f2089d;

        /* renamed from: e, reason: collision with root package name */
        private final androidx.camera.core.impl.t1 f2090e;

        /* renamed from: f, reason: collision with root package name */
        private final androidx.camera.core.impl.t1 f2091f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f2092g;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, a2 a2Var, androidx.camera.core.impl.t1 t1Var, androidx.camera.core.impl.t1 t1Var2) {
            this.f2086a = executor;
            this.f2087b = scheduledExecutorService;
            this.f2088c = handler;
            this.f2089d = a2Var;
            this.f2090e = t1Var;
            this.f2091f = t1Var2;
            this.f2092g = new t.i(t1Var, t1Var2).b() || new t.y(t1Var).i() || new t.h(t1Var2).d();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public j3 a() {
            return new j3(this.f2092g ? new i3(this.f2090e, this.f2091f, this.f2089d, this.f2086a, this.f2087b, this.f2088c) : new d3(this.f2089d, this.f2086a, this.f2087b, this.f2088c));
        }
    }

    /* loaded from: classes.dex */
    interface b {
        Executor b();

        r.w i(int i10, List<r.f> list, x2.a aVar);

        com.google.common.util.concurrent.f<List<Surface>> j(List<androidx.camera.core.impl.r0> list, long j10);

        com.google.common.util.concurrent.f<Void> n(CameraDevice cameraDevice, r.w wVar, List<androidx.camera.core.impl.r0> list);

        boolean stop();
    }

    j3(b bVar) {
        this.f2085a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r.w a(int i10, List<r.f> list, x2.a aVar) {
        return this.f2085a.i(i10, list, aVar);
    }

    public Executor b() {
        return this.f2085a.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.common.util.concurrent.f<Void> c(CameraDevice cameraDevice, r.w wVar, List<androidx.camera.core.impl.r0> list) {
        return this.f2085a.n(cameraDevice, wVar, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.common.util.concurrent.f<List<Surface>> d(List<androidx.camera.core.impl.r0> list, long j10) {
        return this.f2085a.j(list, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.f2085a.stop();
    }
}

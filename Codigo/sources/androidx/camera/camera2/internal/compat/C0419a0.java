package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.C0436i;
import androidx.core.util.C0984h;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.compat.a0 */
/* loaded from: classes.dex */
public class C0419a0 implements C0436i.a {

    /* renamed from: a */
    final CameraCaptureSession f2147a;

    /* renamed from: b */
    final Object f2148b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.camera.camera2.internal.compat.a0$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Handler f2149a;

        a(Handler handler) {
            this.f2149a = handler;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0419a0(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f2147a = (CameraCaptureSession) C0984h.m4833k(cameraCaptureSession);
        this.f2148b = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C0436i.a m2201d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C0419a0(cameraCaptureSession, new a(handler));
    }

    @Override // androidx.camera.camera2.internal.compat.C0436i.a
    /* renamed from: a */
    public CameraCaptureSession mo2202a() {
        return this.f2147a;
    }

    @Override // androidx.camera.camera2.internal.compat.C0436i.a
    /* renamed from: b */
    public int mo2203b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f2147a.captureBurst(list, new C0436i.b(executor, captureCallback), ((a) this.f2148b).f2149a);
    }

    @Override // androidx.camera.camera2.internal.compat.C0436i.a
    /* renamed from: c */
    public int mo2204c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f2147a.setRepeatingRequest(captureRequest, new C0436i.b(executor, captureCallback), ((a) this.f2148b).f2149a);
    }
}

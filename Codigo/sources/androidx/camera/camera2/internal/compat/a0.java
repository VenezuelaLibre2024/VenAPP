package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.i;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a0 implements i.a {

    /* renamed from: a, reason: collision with root package name */
    final CameraCaptureSession f1844a;

    /* renamed from: b, reason: collision with root package name */
    final Object f1845b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Handler f1846a;

        a(Handler handler) {
            this.f1846a = handler;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f1844a = (CameraCaptureSession) androidx.core.util.h.k(cameraCaptureSession);
        this.f1845b = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i.a d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new a0(cameraCaptureSession, new a(handler));
    }

    @Override // androidx.camera.camera2.internal.compat.i.a
    public CameraCaptureSession a() {
        return this.f1844a;
    }

    @Override // androidx.camera.camera2.internal.compat.i.a
    public int b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f1844a.captureBurst(list, new i.b(executor, captureCallback), ((a) this.f1845b).f1846a);
    }

    @Override // androidx.camera.camera2.internal.compat.i.a
    public int c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f1844a.setRepeatingRequest(captureRequest, new i.b(executor, captureCallback), ((a) this.f1845b).f1846a);
    }
}

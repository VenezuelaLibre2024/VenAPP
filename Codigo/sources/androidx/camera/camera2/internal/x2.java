package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.List;

/* loaded from: classes.dex */
public interface x2 {

    /* loaded from: classes.dex */
    public static abstract class a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(x2 x2Var) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void o(x2 x2Var) {
        }

        public void p(x2 x2Var) {
        }

        public void q(x2 x2Var) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void r(x2 x2Var) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void s(x2 x2Var) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void t(x2 x2Var) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void u(x2 x2Var, Surface surface) {
        }
    }

    a c();

    void close();

    void d();

    void e();

    void f();

    CameraDevice g();

    int h(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    int k(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback);

    androidx.camera.camera2.internal.compat.i l();

    com.google.common.util.concurrent.f<Void> m();
}

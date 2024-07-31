package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.C0436i;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.List;

/* renamed from: androidx.camera.camera2.internal.x2 */
/* loaded from: classes.dex */
public interface InterfaceC0575x2 {

    /* renamed from: androidx.camera.camera2.internal.x2$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2340a(InterfaceC0575x2 interfaceC0575x2) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo2354o(InterfaceC0575x2 interfaceC0575x2) {
        }

        /* renamed from: p */
        public void mo2355p(InterfaceC0575x2 interfaceC0575x2) {
        }

        /* renamed from: q */
        public void mo2356q(InterfaceC0575x2 interfaceC0575x2) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo2357r(InterfaceC0575x2 interfaceC0575x2) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo2358s(InterfaceC0575x2 interfaceC0575x2) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo2359t(InterfaceC0575x2 interfaceC0575x2) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo2360u(InterfaceC0575x2 interfaceC0575x2, Surface surface) {
        }
    }

    /* renamed from: c */
    a mo2342c();

    void close();

    /* renamed from: d */
    void mo2343d();

    /* renamed from: e */
    void mo2344e();

    /* renamed from: f */
    void mo2345f();

    /* renamed from: g */
    CameraDevice mo2346g();

    /* renamed from: h */
    int mo2347h(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    /* renamed from: k */
    int mo2350k(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback);

    /* renamed from: l */
    C0436i mo2351l();

    /* renamed from: m */
    InterfaceFutureC5920f<Void> mo2352m();
}

package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        private final List<CameraCaptureSession.CaptureCallback> f2142a = new ArrayList();

        a(List<CameraCaptureSession.CaptureCallback> list) {
            for (CameraCaptureSession.CaptureCallback captureCallback : list) {
                if (!(captureCallback instanceof b)) {
                    this.f2142a.add(captureCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
            Iterator<CameraCaptureSession.CaptureCallback> it = this.f2142a.iterator();
            while (it.hasNext()) {
                androidx.camera.camera2.internal.compat.c.a(it.next(), cameraCaptureSession, captureRequest, surface, j10);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            Iterator<CameraCaptureSession.CaptureCallback> it = this.f2142a.iterator();
            while (it.hasNext()) {
                it.next().onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            Iterator<CameraCaptureSession.CaptureCallback> it = this.f2142a.iterator();
            while (it.hasNext()) {
                it.next().onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            Iterator<CameraCaptureSession.CaptureCallback> it = this.f2142a.iterator();
            while (it.hasNext()) {
                it.next().onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
            Iterator<CameraCaptureSession.CaptureCallback> it = this.f2142a.iterator();
            while (it.hasNext()) {
                it.next().onCaptureSequenceAborted(cameraCaptureSession, i10);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
            Iterator<CameraCaptureSession.CaptureCallback> it = this.f2142a.iterator();
            while (it.hasNext()) {
                it.next().onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            Iterator<CameraCaptureSession.CaptureCallback> it = this.f2142a.iterator();
            while (it.hasNext()) {
                it.next().onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
            }
        }
    }

    /* loaded from: classes.dex */
    static final class b extends CameraCaptureSession.CaptureCallback {
        b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CameraCaptureSession.CaptureCallback a(List<CameraCaptureSession.CaptureCallback> list) {
        return new a(list);
    }

    public static CameraCaptureSession.CaptureCallback b(CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        return a(Arrays.asList(captureCallbackArr));
    }

    public static CameraCaptureSession.CaptureCallback c() {
        return new b();
    }
}

package io.flutter.plugins.camera;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Handler;
import android.view.Surface;
import java.util.List;

/* loaded from: classes3.dex */
interface CameraDeviceWrapper {
    void close();

    CaptureRequest.Builder createCaptureRequest(int i10);

    void createCaptureSession(SessionConfiguration sessionConfiguration);

    void createCaptureSession(List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler);
}

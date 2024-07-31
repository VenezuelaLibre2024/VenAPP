package io.flutter.plugins.camera.features;

import android.hardware.camera2.CaptureRequest;
import io.flutter.plugins.camera.CameraProperties;

/* loaded from: classes3.dex */
public abstract class CameraFeature<T> {
    protected final CameraProperties cameraProperties;

    /* JADX INFO: Access modifiers changed from: protected */
    public CameraFeature(CameraProperties cameraProperties) {
        this.cameraProperties = cameraProperties;
    }

    public abstract boolean checkIsSupported();

    public abstract String getDebugName();

    public abstract T getValue();

    public abstract void setValue(T t10);

    public abstract void updateBuilder(CaptureRequest.Builder builder);
}

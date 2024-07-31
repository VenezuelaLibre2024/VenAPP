package io.flutter.plugins.camera;

import android.app.Activity;
import io.flutter.plugin.common.PluginRegistry;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class CameraPermissions {
    private static final String AUDIO_ACCESS_DENIED = "AudioAccessDenied";
    private static final String AUDIO_ACCESS_DENIED_MESSAGE = "Audio access permission was denied.";
    private static final String CAMERA_ACCESS_DENIED = "CameraAccessDenied";
    private static final String CAMERA_ACCESS_DENIED_MESSAGE = "Camera access permission was denied.";
    private static final String CAMERA_PERMISSIONS_REQUEST_ONGOING = "CameraPermissionsRequestOngoing";
    private static final String CAMERA_PERMISSIONS_REQUEST_ONGOING_MESSAGE = "Another request is ongoing and multiple requests cannot be handled at once.";
    private static final int CAMERA_REQUEST_ID = 9796;
    boolean ongoing = false;

    /* loaded from: classes3.dex */
    static final class CameraRequestPermissionsListener implements PluginRegistry.RequestPermissionsResultListener {
        boolean alreadyCalled = false;
        final ResultCallback callback;

        CameraRequestPermissionsListener(ResultCallback resultCallback) {
            this.callback = resultCallback;
        }

        @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
        public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
            ResultCallback resultCallback;
            String str;
            String str2;
            if (this.alreadyCalled || i10 != CameraPermissions.CAMERA_REQUEST_ID) {
                return false;
            }
            this.alreadyCalled = true;
            if (iArr.length == 0 || iArr[0] != 0) {
                resultCallback = this.callback;
                str = CameraPermissions.CAMERA_ACCESS_DENIED;
                str2 = CameraPermissions.CAMERA_ACCESS_DENIED_MESSAGE;
            } else {
                if (iArr.length <= 1 || iArr[1] == 0) {
                    this.callback.onResult(null, null);
                    return true;
                }
                resultCallback = this.callback;
                str = CameraPermissions.AUDIO_ACCESS_DENIED;
                str2 = CameraPermissions.AUDIO_ACCESS_DENIED_MESSAGE;
            }
            resultCallback.onResult(str, str2);
            return true;
        }
    }

    /* loaded from: classes3.dex */
    interface PermissionsRegistry {
        void addListener(PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface ResultCallback {
        void onResult(String str, String str2);
    }

    private boolean hasAudioPermission(Activity activity) {
        return androidx.core.content.a.checkSelfPermission(activity, "android.permission.RECORD_AUDIO") == 0;
    }

    private boolean hasCameraPermission(Activity activity) {
        return androidx.core.content.a.checkSelfPermission(activity, "android.permission.CAMERA") == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestPermissions$0(ResultCallback resultCallback, String str, String str2) {
        this.ongoing = false;
        resultCallback.onResult(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void requestPermissions(Activity activity, PermissionsRegistry permissionsRegistry, boolean z10, final ResultCallback resultCallback) {
        if (this.ongoing) {
            resultCallback.onResult(CAMERA_PERMISSIONS_REQUEST_ONGOING, CAMERA_PERMISSIONS_REQUEST_ONGOING_MESSAGE);
            return;
        }
        if (hasCameraPermission(activity) && (!z10 || hasAudioPermission(activity))) {
            resultCallback.onResult(null, null);
            return;
        }
        permissionsRegistry.addListener(new CameraRequestPermissionsListener(new ResultCallback() { // from class: io.flutter.plugins.camera.s
            @Override // io.flutter.plugins.camera.CameraPermissions.ResultCallback
            public final void onResult(String str, String str2) {
                CameraPermissions.this.lambda$requestPermissions$0(resultCallback, str, str2);
            }
        }));
        this.ongoing = true;
        androidx.core.app.b.g(activity, z10 ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, CAMERA_REQUEST_ID);
    }
}

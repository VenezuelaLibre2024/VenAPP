package p183jg;

import android.hardware.Camera;
import android.util.Log;

/* renamed from: jg.a */
/* loaded from: classes2.dex */
public final class C9049a {

    /* renamed from: a */
    private static final String f21669a = "jg.a";

    /* renamed from: a */
    public static int m26560a(int i10) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w(f21669a, "No cameras!");
            return -1;
        }
        boolean z10 = i10 >= 0;
        if (!z10) {
            i10 = 0;
            while (i10 < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i10, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i10++;
            }
        }
        return i10 < numberOfCameras ? i10 : z10 ? -1 : 0;
    }

    /* renamed from: b */
    public static Camera m26561b(int i10) {
        int m26560a = m26560a(i10);
        if (m26560a == -1) {
            return null;
        }
        return Camera.open(m26560a);
    }
}

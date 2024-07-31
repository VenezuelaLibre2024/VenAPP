package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class u0 extends y0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(Context context) {
        super(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u0 i(Context context) {
        return new u0(context);
    }

    private boolean j(Throwable th2) {
        return Build.VERSION.SDK_INT == 28 && k(th2);
    }

    private static boolean k(Throwable th2) {
        StackTraceElement[] stackTrace;
        if (!th2.getClass().equals(RuntimeException.class) || (stackTrace = th2.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    private void l(Throwable th2) {
        throw new h(10001, th2);
    }

    @Override // androidx.camera.camera2.internal.compat.y0, androidx.camera.camera2.internal.compat.r0.b
    public void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f1932a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.y0, androidx.camera.camera2.internal.compat.r0.b
    public CameraCharacteristics b(String str) {
        try {
            return super.b(str);
        } catch (RuntimeException e10) {
            if (j(e10)) {
                l(e10);
            }
            throw e10;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.y0, androidx.camera.camera2.internal.compat.r0.b
    public void d(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f1932a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw h.e(e10);
        } catch (IllegalArgumentException e11) {
            throw e11;
        } catch (SecurityException e12) {
        } catch (RuntimeException e13) {
            if (j(e13)) {
                l(e13);
            }
            throw e13;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.y0, androidx.camera.camera2.internal.compat.r0.b
    public void f(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f1932a.unregisterAvailabilityCallback(availabilityCallback);
    }
}

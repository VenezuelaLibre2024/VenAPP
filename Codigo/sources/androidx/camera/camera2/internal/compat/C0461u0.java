package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.compat.u0 */
/* loaded from: classes.dex */
public class C0461u0 extends C0469y0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0461u0(Context context) {
        super(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static C0461u0 m2298i(Context context) {
        return new C0461u0(context);
    }

    /* renamed from: j */
    private boolean m2299j(Throwable th2) {
        return Build.VERSION.SDK_INT == 28 && m2300k(th2);
    }

    /* renamed from: k */
    private static boolean m2300k(Throwable th2) {
        StackTraceElement[] stackTrace;
        if (!th2.getClass().equals(RuntimeException.class) || (stackTrace = th2.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    /* renamed from: l */
    private void m2301l(Throwable th2) {
        throw new C0434h(10001, th2);
    }

    @Override // androidx.camera.camera2.internal.compat.C0469y0, androidx.camera.camera2.internal.compat.C0455r0.b
    /* renamed from: a */
    public void mo2290a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f2235a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.C0469y0, androidx.camera.camera2.internal.compat.C0455r0.b
    /* renamed from: b */
    public CameraCharacteristics mo2291b(String str) {
        try {
            return super.mo2291b(str);
        } catch (RuntimeException e10) {
            if (m2299j(e10)) {
                m2301l(e10);
            }
            throw e10;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.C0469y0, androidx.camera.camera2.internal.compat.C0455r0.b
    /* renamed from: d */
    public void mo2293d(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f2235a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw C0434h.m2235e(e10);
        } catch (IllegalArgumentException e11) {
            throw e11;
        } catch (SecurityException e12) {
        } catch (RuntimeException e13) {
            if (m2299j(e13)) {
                m2301l(e13);
            }
            throw e13;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.C0469y0, androidx.camera.camera2.internal.compat.C0455r0.b
    /* renamed from: f */
    public void mo2295f(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f2235a.unregisterAvailabilityCallback(availabilityCallback);
    }
}

package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.compat.v0 */
/* loaded from: classes.dex */
public class C0463v0 extends C0461u0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0463v0(Context context) {
        super(context);
    }

    @Override // androidx.camera.camera2.internal.compat.C0461u0, androidx.camera.camera2.internal.compat.C0469y0, androidx.camera.camera2.internal.compat.C0455r0.b
    /* renamed from: b */
    public CameraCharacteristics mo2291b(String str) {
        try {
            return this.f2235a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw C0434h.m2235e(e10);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.C0461u0, androidx.camera.camera2.internal.compat.C0469y0, androidx.camera.camera2.internal.compat.C0455r0.b
    /* renamed from: d */
    public void mo2293d(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f2235a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw C0434h.m2235e(e10);
        }
    }
}

package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.C0427d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.compat.c0 */
/* loaded from: classes.dex */
public class C0425c0 implements C0427d0.a {

    /* renamed from: a */
    protected final CameraCharacteristics f2151a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0425c0(CameraCharacteristics cameraCharacteristics) {
        this.f2151a = cameraCharacteristics;
    }

    @Override // androidx.camera.camera2.internal.compat.C0427d0.a
    /* renamed from: a */
    public <T> T mo2211a(CameraCharacteristics.Key<T> key) {
        return (T) this.f2151a.get(key);
    }
}

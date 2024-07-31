package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c0 implements d0.a {

    /* renamed from: a, reason: collision with root package name */
    protected final CameraCharacteristics f1848a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(CameraCharacteristics cameraCharacteristics) {
        this.f1848a = cameraCharacteristics;
    }

    @Override // androidx.camera.camera2.internal.compat.d0.a
    public <T> T a(CameraCharacteristics.Key<T> key) {
        return (T) this.f1848a.get(key);
    }
}

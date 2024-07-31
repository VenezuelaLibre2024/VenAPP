package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class x0 extends v0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public x0(Context context) {
        super(context);
    }

    @Override // androidx.camera.camera2.internal.compat.y0, androidx.camera.camera2.internal.compat.r0.b
    public Set<Set<String>> c() {
        Set<Set<String>> concurrentCameraIds;
        try {
            concurrentCameraIds = this.f1932a.getConcurrentCameraIds();
            return concurrentCameraIds;
        } catch (CameraAccessException e10) {
            throw h.e(e10);
        }
    }
}

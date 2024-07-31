package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.compat.x0 */
/* loaded from: classes.dex */
public class C0467x0 extends C0463v0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0467x0(Context context) {
        super(context);
    }

    @Override // androidx.camera.camera2.internal.compat.C0469y0, androidx.camera.camera2.internal.compat.C0455r0.b
    /* renamed from: c */
    public Set<Set<String>> mo2292c() {
        Set<Set<String>> concurrentCameraIds;
        try {
            concurrentCameraIds = this.f2235a.getConcurrentCameraIds();
            return concurrentCameraIds;
        } catch (CameraAccessException e10) {
            throw C0434h.m2235e(e10);
        }
    }
}

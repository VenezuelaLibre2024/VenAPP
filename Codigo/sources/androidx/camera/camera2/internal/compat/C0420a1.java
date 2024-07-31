package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.compat.a1 */
/* loaded from: classes.dex */
public class C0420a1 extends C0423b1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0420a1(StreamConfigurationMap streamConfigurationMap) {
        super(streamConfigurationMap);
    }

    @Override // androidx.camera.camera2.internal.compat.C0471z0.a
    /* renamed from: b */
    public Size[] mo2205b(int i10) {
        return this.f2150a.getOutputSizes(i10);
    }
}

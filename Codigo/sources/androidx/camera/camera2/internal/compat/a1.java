package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a1 extends b1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a1(StreamConfigurationMap streamConfigurationMap) {
        super(streamConfigurationMap);
    }

    @Override // androidx.camera.camera2.internal.compat.z0.a
    public Size[] b(int i10) {
        return this.f1847a.getOutputSizes(i10);
    }
}

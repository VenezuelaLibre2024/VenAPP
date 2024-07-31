package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.camera.camera2.internal.compat.z0;

/* loaded from: classes.dex */
class b1 implements z0.a {

    /* renamed from: a, reason: collision with root package name */
    final StreamConfigurationMap f1847a;

    /* loaded from: classes.dex */
    static class a {
        static Size[] a(StreamConfigurationMap streamConfigurationMap, int i10) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b1(StreamConfigurationMap streamConfigurationMap) {
        this.f1847a = streamConfigurationMap;
    }

    @Override // androidx.camera.camera2.internal.compat.z0.a
    public StreamConfigurationMap a() {
        return this.f1847a;
    }

    @Override // androidx.camera.camera2.internal.compat.z0.a
    public Size[] c(int i10) {
        return a.a(this.f1847a, i10);
    }
}

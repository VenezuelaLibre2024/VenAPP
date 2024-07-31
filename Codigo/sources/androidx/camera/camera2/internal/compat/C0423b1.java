package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.camera.camera2.internal.compat.C0471z0;

/* renamed from: androidx.camera.camera2.internal.compat.b1 */
/* loaded from: classes.dex */
class C0423b1 implements C0471z0.a {

    /* renamed from: a */
    final StreamConfigurationMap f2150a;

    /* renamed from: androidx.camera.camera2.internal.compat.b1$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static Size[] m2209a(StreamConfigurationMap streamConfigurationMap, int i10) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0423b1(StreamConfigurationMap streamConfigurationMap) {
        this.f2150a = streamConfigurationMap;
    }

    @Override // androidx.camera.camera2.internal.compat.C0471z0.a
    /* renamed from: a */
    public StreamConfigurationMap mo2207a() {
        return this.f2150a;
    }

    @Override // androidx.camera.camera2.internal.compat.C0471z0.a
    /* renamed from: c */
    public Size[] mo2208c(int i10) {
        return a.m2209a(this.f2150a, i10);
    }
}

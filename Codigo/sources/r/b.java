package r;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import androidx.camera.camera2.internal.compat.d0;
import java.util.Set;
import w.y;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final a f24452a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        DynamicRangeProfiles a();

        Set<y> b(y yVar);

        Set<y> c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar) {
        this.f24452a = aVar;
    }

    public static b a(d0 d0Var) {
        b e10 = Build.VERSION.SDK_INT >= 33 ? e((DynamicRangeProfiles) d0Var.a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES)) : null;
        return e10 == null ? d.f24454a : e10;
    }

    public static b e(DynamicRangeProfiles dynamicRangeProfiles) {
        if (dynamicRangeProfiles == null) {
            return null;
        }
        androidx.core.util.h.n(Build.VERSION.SDK_INT >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
        return new b(new c(dynamicRangeProfiles));
    }

    public Set<y> b(y yVar) {
        return this.f24452a.b(yVar);
    }

    public Set<y> c() {
        return this.f24452a.c();
    }

    public DynamicRangeProfiles d() {
        androidx.core.util.h.n(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.f24452a.a();
    }
}

package p320r;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import androidx.camera.camera2.internal.compat.C0427d0;
import androidx.core.util.C0984h;
import java.util.Set;
import p407w.C12048y;

/* renamed from: r.b */
/* loaded from: classes.dex */
public final class C10553b {

    /* renamed from: a */
    private final a f26566a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r.b$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        DynamicRangeProfiles mo32043a();

        /* renamed from: b */
        Set<C12048y> mo32044b(C12048y c12048y);

        /* renamed from: c */
        Set<C12048y> mo32045c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10553b(a aVar) {
        this.f26566a = aVar;
    }

    /* renamed from: a */
    public static C10553b m32038a(C0427d0 c0427d0) {
        C10553b m32039e = Build.VERSION.SDK_INT >= 33 ? m32039e((DynamicRangeProfiles) c0427d0.m2215a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES)) : null;
        return m32039e == null ? C10555d.f26568a : m32039e;
    }

    /* renamed from: e */
    public static C10553b m32039e(DynamicRangeProfiles dynamicRangeProfiles) {
        if (dynamicRangeProfiles == null) {
            return null;
        }
        C0984h.m4836n(Build.VERSION.SDK_INT >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
        return new C10553b(new C10554c(dynamicRangeProfiles));
    }

    /* renamed from: b */
    public Set<C12048y> m32040b(C12048y c12048y) {
        return this.f26566a.mo32044b(c12048y);
    }

    /* renamed from: c */
    public Set<C12048y> m32041c() {
        return this.f26566a.mo32045c();
    }

    /* renamed from: d */
    public DynamicRangeProfiles m32042d() {
        C0984h.m4836n(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.f26566a.mo32043a();
    }
}

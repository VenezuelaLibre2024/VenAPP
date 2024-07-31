package p365ta;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;

/* renamed from: ta.b0 */
/* loaded from: classes2.dex */
public final class C11196b0 {
    private C11196b0() {
    }

    /* renamed from: a */
    public static Parcelable m35093a(Bundle bundle, String str) {
        ClassLoader m35096d = m35096d();
        bundle.setClassLoader(m35096d);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(m35096d);
        return bundle2.getParcelable(str);
    }

    /* renamed from: b */
    public static void m35094b(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        Parcelable m35093a = m35093a(bundle, "MapOptions");
        if (m35093a != null) {
            m35095c(bundle2, "MapOptions", m35093a);
        }
        Parcelable m35093a2 = m35093a(bundle, "StreetViewPanoramaOptions");
        if (m35093a2 != null) {
            m35095c(bundle2, "StreetViewPanoramaOptions", m35093a2);
        }
        Parcelable m35093a3 = m35093a(bundle, "camera");
        if (m35093a3 != null) {
            m35095c(bundle2, "camera", m35093a3);
        }
        if (bundle.containsKey("position")) {
            bundle2.putString("position", bundle.getString("position"));
        }
        if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
            bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
        }
    }

    /* renamed from: c */
    public static void m35095c(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader m35096d = m35096d();
        bundle.setClassLoader(m35096d);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(m35096d);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    /* renamed from: d */
    private static ClassLoader m35096d() {
        return (ClassLoader) C5276s.m13324j(C11196b0.class.getClassLoader());
    }
}

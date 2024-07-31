package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import java.util.HashMap;
import java.util.Map;
import p354t.C10949n;
import p407w.C12029o0;

/* renamed from: androidx.camera.camera2.internal.compat.z0 */
/* loaded from: classes.dex */
public class C0471z0 {

    /* renamed from: a */
    private final a f2239a;

    /* renamed from: b */
    private final C10949n f2240b;

    /* renamed from: c */
    private final Map<Integer, Size[]> f2241c = new HashMap();

    /* renamed from: d */
    private final Map<Integer, Size[]> f2242d = new HashMap();

    /* renamed from: e */
    private final Map<Class<?>, Size[]> f2243e = new HashMap();

    /* renamed from: androidx.camera.camera2.internal.compat.z0$a */
    /* loaded from: classes.dex */
    interface a {
        /* renamed from: a */
        StreamConfigurationMap mo2207a();

        /* renamed from: b */
        Size[] mo2205b(int i10);

        /* renamed from: c */
        Size[] mo2208c(int i10);
    }

    private C0471z0(StreamConfigurationMap streamConfigurationMap, C10949n c10949n) {
        this.f2239a = new C0420a1(streamConfigurationMap);
        this.f2240b = c10949n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C0471z0 m2306d(StreamConfigurationMap streamConfigurationMap, C10949n c10949n) {
        return new C0471z0(streamConfigurationMap, c10949n);
    }

    /* renamed from: a */
    public Size[] m2307a(int i10) {
        if (this.f2242d.containsKey(Integer.valueOf(i10))) {
            if (this.f2242d.get(Integer.valueOf(i10)) == null) {
                return null;
            }
            return (Size[]) this.f2242d.get(Integer.valueOf(i10)).clone();
        }
        Size[] mo2208c = this.f2239a.mo2208c(i10);
        if (mo2208c != null && mo2208c.length > 0) {
            mo2208c = this.f2240b.m33427b(mo2208c, i10);
        }
        this.f2242d.put(Integer.valueOf(i10), mo2208c);
        if (mo2208c != null) {
            return (Size[]) mo2208c.clone();
        }
        return null;
    }

    /* renamed from: b */
    public Size[] m2308b(int i10) {
        if (this.f2241c.containsKey(Integer.valueOf(i10))) {
            if (this.f2241c.get(Integer.valueOf(i10)) == null) {
                return null;
            }
            return (Size[]) this.f2241c.get(Integer.valueOf(i10)).clone();
        }
        Size[] mo2205b = this.f2239a.mo2205b(i10);
        if (mo2205b != null && mo2205b.length != 0) {
            Size[] m33427b = this.f2240b.m33427b(mo2205b, i10);
            this.f2241c.put(Integer.valueOf(i10), m33427b);
            return (Size[]) m33427b.clone();
        }
        C12029o0.m38648k("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i10);
        return mo2205b;
    }

    /* renamed from: c */
    public StreamConfigurationMap m2309c() {
        return this.f2239a.mo2207a();
    }
}

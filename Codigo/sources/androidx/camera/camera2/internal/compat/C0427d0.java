package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import p354t.C10949n;

/* renamed from: androidx.camera.camera2.internal.compat.d0 */
/* loaded from: classes.dex */
public class C0427d0 {

    /* renamed from: b */
    private final a f2153b;

    /* renamed from: c */
    private final String f2154c;

    /* renamed from: a */
    private final Map<CameraCharacteristics.Key<?>, Object> f2152a = new HashMap();

    /* renamed from: d */
    private C0471z0 f2155d = null;

    /* renamed from: androidx.camera.camera2.internal.compat.d0$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        <T> T mo2211a(CameraCharacteristics.Key<T> key);
    }

    private C0427d0(CameraCharacteristics cameraCharacteristics, String str) {
        this.f2153b = Build.VERSION.SDK_INT >= 28 ? new C0422b0(cameraCharacteristics) : new C0425c0(cameraCharacteristics);
        this.f2154c = str;
    }

    /* renamed from: c */
    private boolean m2213c(CameraCharacteristics.Key<?> key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }

    /* renamed from: d */
    public static C0427d0 m2214d(CameraCharacteristics cameraCharacteristics, String str) {
        return new C0427d0(cameraCharacteristics, str);
    }

    /* renamed from: a */
    public <T> T m2215a(CameraCharacteristics.Key<T> key) {
        if (m2213c(key)) {
            return (T) this.f2153b.mo2211a(key);
        }
        synchronized (this) {
            T t10 = (T) this.f2152a.get(key);
            if (t10 != null) {
                return t10;
            }
            T t11 = (T) this.f2153b.mo2211a(key);
            if (t11 != null) {
                this.f2152a.put(key, t11);
            }
            return t11;
        }
    }

    /* renamed from: b */
    public C0471z0 m2216b() {
        if (this.f2155d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) m2215a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.f2155d = C0471z0.m2306d(streamConfigurationMap, new C10949n(this.f2154c));
            } catch (AssertionError e10) {
                throw new IllegalArgumentException(e10.getMessage());
            }
        }
        return this.f2155d;
    }
}

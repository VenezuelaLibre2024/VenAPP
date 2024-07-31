package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class d0 {

    /* renamed from: b */
    private final a f1850b;

    /* renamed from: c */
    private final String f1851c;

    /* renamed from: a */
    private final Map<CameraCharacteristics.Key<?>, Object> f1849a = new HashMap();

    /* renamed from: d */
    private z0 f1852d = null;

    /* loaded from: classes.dex */
    public interface a {
        <T> T a(CameraCharacteristics.Key<T> key);
    }

    private d0(CameraCharacteristics cameraCharacteristics, String str) {
        this.f1850b = Build.VERSION.SDK_INT >= 28 ? new b0(cameraCharacteristics) : new c0(cameraCharacteristics);
        this.f1851c = str;
    }

    private boolean c(CameraCharacteristics.Key<?> key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }

    public static d0 d(CameraCharacteristics cameraCharacteristics, String str) {
        return new d0(cameraCharacteristics, str);
    }

    public <T> T a(CameraCharacteristics.Key<T> key) {
        if (c(key)) {
            return (T) this.f1850b.a(key);
        }
        synchronized (this) {
            T t10 = (T) this.f1849a.get(key);
            if (t10 != null) {
                return t10;
            }
            T t11 = (T) this.f1850b.a(key);
            if (t11 != null) {
                this.f1849a.put(key, t11);
            }
            return t11;
        }
    }

    public z0 b() {
        if (this.f1852d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.f1852d = z0.d(streamConfigurationMap, new t.n(this.f1851c));
            } catch (AssertionError e10) {
                throw new IllegalArgumentException(e10.getMessage());
            }
        }
        return this.f1852d;
    }
}

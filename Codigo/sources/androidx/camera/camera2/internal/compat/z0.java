package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class z0 {

    /* renamed from: a */
    private final a f1936a;

    /* renamed from: b */
    private final t.n f1937b;

    /* renamed from: c */
    private final Map<Integer, Size[]> f1938c = new HashMap();

    /* renamed from: d */
    private final Map<Integer, Size[]> f1939d = new HashMap();

    /* renamed from: e */
    private final Map<Class<?>, Size[]> f1940e = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        StreamConfigurationMap a();

        Size[] b(int i10);

        Size[] c(int i10);
    }

    private z0(StreamConfigurationMap streamConfigurationMap, t.n nVar) {
        this.f1936a = new a1(streamConfigurationMap);
        this.f1937b = nVar;
    }

    public static z0 d(StreamConfigurationMap streamConfigurationMap, t.n nVar) {
        return new z0(streamConfigurationMap, nVar);
    }

    public Size[] a(int i10) {
        if (this.f1939d.containsKey(Integer.valueOf(i10))) {
            if (this.f1939d.get(Integer.valueOf(i10)) == null) {
                return null;
            }
            return (Size[]) this.f1939d.get(Integer.valueOf(i10)).clone();
        }
        Size[] c10 = this.f1936a.c(i10);
        if (c10 != null && c10.length > 0) {
            c10 = this.f1937b.b(c10, i10);
        }
        this.f1939d.put(Integer.valueOf(i10), c10);
        if (c10 != null) {
            return (Size[]) c10.clone();
        }
        return null;
    }

    public Size[] b(int i10) {
        if (this.f1938c.containsKey(Integer.valueOf(i10))) {
            if (this.f1938c.get(Integer.valueOf(i10)) == null) {
                return null;
            }
            return (Size[]) this.f1938c.get(Integer.valueOf(i10)).clone();
        }
        Size[] b10 = this.f1936a.b(i10);
        if (b10 != null && b10.length != 0) {
            Size[] b11 = this.f1937b.b(b10, i10);
            this.f1938c.put(Integer.valueOf(i10), b11);
            return (Size[]) b11.clone();
        }
        w.o0.k("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i10);
        return b10;
    }

    public StreamConfigurationMap c() {
        return this.f1936a.a();
    }
}

package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.lifecycle.g0 */
/* loaded from: classes.dex */
public abstract class AbstractC1303g0 {

    /* renamed from: a */
    private final Map<String, Object> f5684a = new HashMap();

    /* renamed from: b */
    private final Set<Closeable> f5685b = new LinkedHashSet();

    /* renamed from: c */
    private volatile boolean f5686c = false;

    /* renamed from: b */
    private static void m7332b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m7333a() {
        this.f5686c = true;
        Map<String, Object> map = this.f5684a;
        if (map != null) {
            synchronized (map) {
                Iterator<Object> it = this.f5684a.values().iterator();
                while (it.hasNext()) {
                    m7332b(it.next());
                }
            }
        }
        Set<Closeable> set = this.f5685b;
        if (set != null) {
            synchronized (set) {
                Iterator<Closeable> it2 = this.f5685b.iterator();
                while (it2.hasNext()) {
                    m7332b(it2.next());
                }
            }
        }
        mo7144d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public <T> T m7334c(String str) {
        T t10;
        Map<String, Object> map = this.f5684a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t10 = (T) this.f5684a.get(str);
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7144d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public <T> T m7335e(String str, T t10) {
        Object obj;
        synchronized (this.f5684a) {
            obj = this.f5684a.get(str);
            if (obj == 0) {
                this.f5684a.put(str, t10);
            }
        }
        if (obj != 0) {
            t10 = obj;
        }
        if (this.f5686c) {
            m7332b(t10);
        }
        return t10;
    }
}

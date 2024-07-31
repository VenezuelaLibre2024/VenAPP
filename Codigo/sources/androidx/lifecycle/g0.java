package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f4930a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Set<Closeable> f4931b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f4932c = false;

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f4932c = true;
        Map<String, Object> map = this.f4930a;
        if (map != null) {
            synchronized (map) {
                Iterator<Object> it = this.f4930a.values().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }
        Set<Closeable> set = this.f4931b;
        if (set != null) {
            synchronized (set) {
                Iterator<Closeable> it2 = this.f4931b.iterator();
                while (it2.hasNext()) {
                    b(it2.next());
                }
            }
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> T c(String str) {
        T t10;
        Map<String, Object> map = this.f4930a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t10 = (T) this.f4930a.get(str);
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> T e(String str, T t10) {
        Object obj;
        synchronized (this.f4930a) {
            obj = this.f4930a.get(str);
            if (obj == 0) {
                this.f4930a.put(str, t10);
            }
        }
        if (obj != 0) {
            t10 = obj;
        }
        if (this.f4932c) {
            b(t10);
        }
        return t10;
    }
}

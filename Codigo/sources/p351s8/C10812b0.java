package p351s8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: s8.b0 */
/* loaded from: classes.dex */
public final class C10812b0 {

    /* renamed from: a */
    private final Map<String, String> f27310a = new HashMap();

    /* renamed from: b */
    private Map<String, String> f27311b;

    /* renamed from: a */
    public synchronized void m32947a(Map<String, String> map) {
        this.f27311b = null;
        this.f27310a.clear();
        this.f27310a.putAll(map);
    }

    /* renamed from: b */
    public synchronized Map<String, String> m32948b() {
        if (this.f27311b == null) {
            this.f27311b = Collections.unmodifiableMap(new HashMap(this.f27310a));
        }
        return this.f27311b;
    }
}

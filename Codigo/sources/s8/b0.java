package s8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f25191a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f25192b;

    public synchronized void a(Map<String, String> map) {
        this.f25192b = null;
        this.f25191a.clear();
        this.f25191a.putAll(map);
    }

    public synchronized Map<String, String> b() {
        if (this.f25192b == null) {
            this.f25192b = Collections.unmodifiableMap(new HashMap(this.f25191a));
        }
        return this.f25192b;
    }
}

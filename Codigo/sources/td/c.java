package td;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class c<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<K, V> f26875a;

    private c(int i10) {
        this.f26875a = a.b(i10);
    }

    public static <K, V> c<K, V> b(int i10) {
        return new c<>(i10);
    }

    public Map<K, V> a() {
        return this.f26875a.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f26875a);
    }

    public c<K, V> c(K k10, V v10) {
        this.f26875a.put(k10, v10);
        return this;
    }
}

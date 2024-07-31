package td;

import java.util.Collections;
import java.util.Map;

/* renamed from: td.c */
/* loaded from: classes.dex */
public final class C11245c<K, V> {

    /* renamed from: a */
    private final Map<K, V> f29171a;

    private C11245c(int i10) {
        this.f29171a = C11243a.m35123b(i10);
    }

    /* renamed from: b */
    public static <K, V> C11245c<K, V> m35126b(int i10) {
        return new C11245c<>(i10);
    }

    /* renamed from: a */
    public Map<K, V> m35127a() {
        return this.f29171a.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f29171a);
    }

    /* renamed from: c */
    public C11245c<K, V> m35128c(K k10, V v10) {
        this.f29171a.put(k10, v10);
        return this;
    }
}

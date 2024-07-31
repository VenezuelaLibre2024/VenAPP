package l;

import java.util.HashMap;
import java.util.Map;
import l.b;

/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<K, b.c<K, V>> f20762e = new HashMap<>();

    public boolean contains(K k10) {
        return this.f20762e.containsKey(k10);
    }

    @Override // l.b
    protected b.c<K, V> d(K k10) {
        return this.f20762e.get(k10);
    }

    @Override // l.b
    public V l(K k10, V v10) {
        b.c<K, V> d10 = d(k10);
        if (d10 != null) {
            return d10.f20768b;
        }
        this.f20762e.put(k10, k(k10, v10));
        return null;
    }

    @Override // l.b
    public V m(K k10) {
        V v10 = (V) super.m(k10);
        this.f20762e.remove(k10);
        return v10;
    }

    public Map.Entry<K, V> n(K k10) {
        if (contains(k10)) {
            return this.f20762e.get(k10).f20770d;
        }
        return null;
    }
}

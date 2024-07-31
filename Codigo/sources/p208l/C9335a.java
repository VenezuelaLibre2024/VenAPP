package p208l;

import java.util.HashMap;
import java.util.Map;
import p208l.C9336b;

/* renamed from: l.a */
/* loaded from: classes.dex */
public class C9335a<K, V> extends C9336b<K, V> {

    /* renamed from: e */
    private final HashMap<K, C9336b.c<K, V>> f22584e = new HashMap<>();

    public boolean contains(K k10) {
        return this.f22584e.containsKey(k10);
    }

    @Override // p208l.C9336b
    /* renamed from: d */
    protected C9336b.c<K, V> mo27810d(K k10) {
        return this.f22584e.get(k10);
    }

    @Override // p208l.C9336b
    /* renamed from: l */
    public V mo27811l(K k10, V v10) {
        C9336b.c<K, V> mo27810d = mo27810d(k10);
        if (mo27810d != null) {
            return mo27810d.f22590b;
        }
        this.f22584e.put(k10, m27817k(k10, v10));
        return null;
    }

    @Override // p208l.C9336b
    /* renamed from: m */
    public V mo27812m(K k10) {
        V v10 = (V) super.mo27812m(k10);
        this.f22584e.remove(k10);
        return v10;
    }

    /* renamed from: n */
    public Map.Entry<K, V> m27813n(K k10) {
        if (contains(k10)) {
            return this.f22584e.get(k10).f22592d;
        }
        return null;
    }
}

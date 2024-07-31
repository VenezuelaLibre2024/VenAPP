package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.collection.a */
/* loaded from: classes.dex */
public class C0731a<K, V> extends C0738h<K, V> implements Map<K, V> {

    /* renamed from: s */
    AbstractC0737g<K, V> f3175s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.collection.a$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC0737g<K, V> {
        a() {
        }

        @Override // androidx.collection.AbstractC0737g
        /* renamed from: a */
        protected void mo3652a() {
            C0731a.this.clear();
        }

        @Override // androidx.collection.AbstractC0737g
        /* renamed from: b */
        protected Object mo3653b(int i10, int i11) {
            return C0731a.this.f3220b[(i10 << 1) + i11];
        }

        @Override // androidx.collection.AbstractC0737g
        /* renamed from: c */
        protected Map<K, V> mo3654c() {
            return C0731a.this;
        }

        @Override // androidx.collection.AbstractC0737g
        /* renamed from: d */
        protected int mo3655d() {
            return C0731a.this.f3221c;
        }

        @Override // androidx.collection.AbstractC0737g
        /* renamed from: e */
        protected int mo3656e(Object obj) {
            return C0731a.this.m3708f(obj);
        }

        @Override // androidx.collection.AbstractC0737g
        /* renamed from: f */
        protected int mo3657f(Object obj) {
            return C0731a.this.m3710i(obj);
        }

        @Override // androidx.collection.AbstractC0737g
        /* renamed from: g */
        protected void mo3658g(K k10, V v10) {
            C0731a.this.put(k10, v10);
        }

        @Override // androidx.collection.AbstractC0737g
        /* renamed from: h */
        protected void mo3659h(int i10) {
            C0731a.this.mo3713l(i10);
        }

        @Override // androidx.collection.AbstractC0737g
        /* renamed from: i */
        protected V mo3660i(int i10, V v10) {
            return C0731a.this.mo3714m(i10, v10);
        }
    }

    public C0731a() {
    }

    public C0731a(int i10) {
        super(i10);
    }

    public C0731a(C0738h c0738h) {
        super(c0738h);
    }

    /* renamed from: o */
    private AbstractC0737g<K, V> m3650o() {
        if (this.f3175s == null) {
            this.f3175s = new a();
        }
        return this.f3175s;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m3650o().m3696l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m3650o().m3697m();
    }

    /* renamed from: p */
    public boolean m3651p(Collection<?> collection) {
        return AbstractC0737g.m3695p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m3706c(this.f3221c + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m3650o().m3698n();
    }
}

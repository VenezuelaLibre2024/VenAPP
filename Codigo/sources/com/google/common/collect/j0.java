package com.google.common.collect;

import com.google.android.gms.common.api.a;
import com.google.common.collect.c1;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class j0 {

    /* loaded from: classes2.dex */
    public class a<K, V> extends g1<Map.Entry<K, V>, V> {
        a(Iterator it) {
            super(it);
        }

        @Override // com.google.common.collect.g1
        /* renamed from: c */
        public V a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class b extends Enum<b> implements eb.g<Map.Entry<?, ?>, Object> {
        public static final b KEY = new a("KEY", 0);
        public static final b VALUE = new C0163b("VALUE", 1);
        private static final /* synthetic */ b[] $VALUES = b();

        /* loaded from: classes2.dex */
        enum a extends b {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // eb.g
            /* renamed from: h */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* renamed from: com.google.common.collect.j0$b$b */
        /* loaded from: classes2.dex */
        enum C0163b extends b {
            C0163b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // eb.g
            /* renamed from: h */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private b(String str, int i10) {
            super(str, i10);
        }

        /* synthetic */ b(String str, int i10, i0 i0Var) {
            this(str, i10);
        }

        private static /* synthetic */ b[] b() {
            return new b[]{KEY, VALUE};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static abstract class c<K, V> extends c1.d<Map.Entry<K, V>> {
        abstract Map<K, V> c();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return c().isEmpty();
        }

        @Override // com.google.common.collect.c1.d, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) eb.o.o(collection));
            } catch (UnsupportedOperationException unused) {
                return c1.j(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.c1.d, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) eb.o.o(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet g10 = c1.g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        g10.add(((Map.Entry) obj).getKey());
                    }
                }
                return c().keySet().retainAll(g10);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return c().size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class d<K, V> extends c1.d<K> {

        /* renamed from: a */
        final Map<K, V> f11103a;

        public d(Map<K, V> map) {
            this.f11103a = (Map) eb.o.o(map);
        }

        public Map<K, V> c() {
            return this.f11103a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return c().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return c().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return c().size();
        }
    }

    /* loaded from: classes2.dex */
    public static class e<K, V> extends AbstractCollection<V> {

        /* renamed from: a */
        final Map<K, V> f11104a;

        e(Map<K, V> map) {
            this.f11104a = (Map) eb.o.o(map);
        }

        final Map<K, V> c() {
            return this.f11104a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return c().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return c().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return j0.l(c().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : c().entrySet()) {
                    if (eb.k.a(obj, entry.getValue())) {
                        c().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) eb.o.o(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f10 = c1.f();
                for (Map.Entry<K, V> entry : c().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f10.add(entry.getKey());
                    }
                }
                return c().keySet().removeAll(f10);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) eb.o.o(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f10 = c1.f();
                for (Map.Entry<K, V> entry : c().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f10.add(entry.getKey());
                    }
                }
                return c().keySet().retainAll(f10);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return c().size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static abstract class f<K, V> extends AbstractMap<K, V> {

        /* renamed from: a */
        private transient Set<Map.Entry<K, V>> f11105a;

        /* renamed from: b */
        private transient Collection<V> f11106b;

        abstract Set<Map.Entry<K, V>> a();

        Collection<V> b() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f11105a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> a10 = a();
            this.f11105a = a10;
            return a10;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f11106b;
            if (collection != null) {
                return collection;
            }
            Collection<V> b10 = b();
            this.f11106b = b10;
            return b10;
        }
    }

    public static int a(int i10) {
        if (i10 >= 3) {
            return i10 < 1073741824 ? (int) Math.ceil(i10 / 0.75d) : a.e.API_PRIORITY_OTHER;
        }
        i.b(i10, "expectedSize");
        return i10 + 1;
    }

    public static boolean b(Map<?, ?> map, Object obj) {
        return f0.d(l(map.entrySet().iterator()), obj);
    }

    public static boolean c(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> Map.Entry<K, V> d(K k10, V v10) {
        return new v(k10, v10);
    }

    public static <K> eb.g<Map.Entry<K, ?>, K> e() {
        return b.KEY;
    }

    public static <K, V> IdentityHashMap<K, V> f() {
        return new IdentityHashMap<>();
    }

    public static boolean g(Map<?, ?> map, Object obj) {
        eb.o.o(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <V> V h(Map<?, V> map, Object obj) {
        eb.o.o(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static <V> V i(Map<?, V> map, Object obj) {
        eb.o.o(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String j(Map<?, ?> map) {
        StringBuilder b10 = j.b(map.size());
        b10.append('{');
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z10) {
                b10.append(", ");
            }
            b10.append(entry.getKey());
            b10.append('=');
            b10.append(entry.getValue());
            z10 = false;
        }
        b10.append('}');
        return b10.toString();
    }

    public static <V> eb.g<Map.Entry<?, V>, V> k() {
        return b.VALUE;
    }

    static <K, V> Iterator<V> l(Iterator<Map.Entry<K, V>> it) {
        return new a(it);
    }
}

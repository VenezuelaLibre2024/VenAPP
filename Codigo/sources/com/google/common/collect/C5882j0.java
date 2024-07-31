package com.google.common.collect;

import com.google.android.gms.common.api.C5101a;
import com.google.common.collect.C5862c1;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p082eb.C7155k;
import p082eb.C7159o;
import p082eb.InterfaceC7151g;

/* renamed from: com.google.common.collect.j0 */
/* loaded from: classes2.dex */
public final class C5882j0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: com.google.common.collect.j0$a */
    /* loaded from: classes2.dex */
    public class a<K, V> extends AbstractC5874g1<Map.Entry<K, V>, V> {
        a(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC5874g1
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public V mo14871a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.google.common.collect.j0$b */
    /* loaded from: classes2.dex */
    public static abstract class b implements InterfaceC7151g<Map.Entry<?, ?>, Object> {
        public static final b KEY = new a("KEY", 0);
        public static final b VALUE = new C13192b("VALUE", 1);
        private static final /* synthetic */ b[] $VALUES = m14901b();

        /* renamed from: com.google.common.collect.j0$b$a */
        /* loaded from: classes2.dex */
        enum a extends b {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // p082eb.InterfaceC7151g
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* renamed from: com.google.common.collect.j0$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        enum C13192b extends b {
            C13192b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // p082eb.InterfaceC7151g
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private b(String str, int i10) {
        }

        /* synthetic */ b(String str, int i10, C5879i0 c5879i0) {
            this(str, i10);
        }

        /* renamed from: b */
        private static /* synthetic */ b[] m14901b() {
            return new b[]{KEY, VALUE};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* renamed from: com.google.common.collect.j0$c */
    /* loaded from: classes2.dex */
    static abstract class c<K, V> extends C5862c1.d<Map.Entry<K, V>> {
        /* renamed from: c */
        abstract Map<K, V> mo14808c();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo14808c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo14808c().isEmpty();
        }

        @Override // com.google.common.collect.C5862c1.d, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C7159o.m21312o(collection));
            } catch (UnsupportedOperationException unused) {
                return C5862c1.m14780j(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.C5862c1.d, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) C7159o.m21312o(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet m14777g = C5862c1.m14777g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        m14777g.add(((Map.Entry) obj).getKey());
                    }
                }
                return mo14808c().keySet().retainAll(m14777g);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo14808c().size();
        }
    }

    /* renamed from: com.google.common.collect.j0$d */
    /* loaded from: classes2.dex */
    static class d<K, V> extends C5862c1.d<K> {

        /* renamed from: a */
        final Map<K, V> f12318a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(Map<K, V> map) {
            this.f12318a = (Map) C7159o.m21312o(map);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public Map<K, V> m14904c() {
            return this.f12318a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return m14904c().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return m14904c().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return m14904c().size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.j0$e */
    /* loaded from: classes2.dex */
    public static class e<K, V> extends AbstractCollection<V> {

        /* renamed from: a */
        final Map<K, V> f12319a;

        e(Map<K, V> map) {
            this.f12319a = (Map) C7159o.m21312o(map);
        }

        /* renamed from: c */
        final Map<K, V> m14905c() {
            return this.f12319a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            m14905c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return m14905c().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return m14905c().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return C5882j0.m14899l(m14905c().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : m14905c().entrySet()) {
                    if (C7155k.m21289a(obj, entry.getValue())) {
                        m14905c().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C7159o.m21312o(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet m14776f = C5862c1.m14776f();
                for (Map.Entry<K, V> entry : m14905c().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        m14776f.add(entry.getKey());
                    }
                }
                return m14905c().keySet().removeAll(m14776f);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) C7159o.m21312o(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet m14776f = C5862c1.m14776f();
                for (Map.Entry<K, V> entry : m14905c().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        m14776f.add(entry.getKey());
                    }
                }
                return m14905c().keySet().retainAll(m14776f);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return m14905c().size();
        }
    }

    /* renamed from: com.google.common.collect.j0$f */
    /* loaded from: classes2.dex */
    static abstract class f<K, V> extends AbstractMap<K, V> {

        /* renamed from: a */
        private transient Set<Map.Entry<K, V>> f12320a;

        /* renamed from: b */
        private transient Collection<V> f12321b;

        /* renamed from: a */
        abstract Set<Map.Entry<K, V>> mo14804a();

        /* renamed from: b */
        Collection<V> m14906b() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f12320a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> mo14804a = mo14804a();
            this.f12320a = mo14804a;
            return mo14804a;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f12321b;
            if (collection != null) {
                return collection;
            }
            Collection<V> m14906b = m14906b();
            this.f12321b = m14906b;
            return m14906b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m14888a(int i10) {
        if (i10 >= 3) {
            return i10 < 1073741824 ? (int) Math.ceil(i10 / 0.75d) : C5101a.e.API_PRIORITY_OTHER;
        }
        C5878i.m14883b(i10, "expectedSize");
        return i10 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m14889b(Map<?, ?> map, Object obj) {
        return C5870f0.m14853d(m14899l(map.entrySet().iterator()), obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m14890c(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: d */
    public static <K, V> Map.Entry<K, V> m14891d(K k10, V v10) {
        return new C5905v(k10, v10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static <K> InterfaceC7151g<Map.Entry<K, ?>, K> m14892e() {
        return b.KEY;
    }

    /* renamed from: f */
    public static <K, V> IdentityHashMap<K, V> m14893f() {
        return new IdentityHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static boolean m14894g(Map<?, ?> map, Object obj) {
        C7159o.m21312o(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static <V> V m14895h(Map<?, V> map, Object obj) {
        C7159o.m21312o(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static <V> V m14896i(Map<?, V> map, Object obj) {
        C7159o.m21312o(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static String m14897j(Map<?, ?> map) {
        StringBuilder m14886b = C5881j.m14886b(map.size());
        m14886b.append('{');
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z10) {
                m14886b.append(", ");
            }
            m14886b.append(entry.getKey());
            m14886b.append('=');
            m14886b.append(entry.getValue());
            z10 = false;
        }
        m14886b.append('}');
        return m14886b.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static <V> InterfaceC7151g<Map.Entry<?, V>, V> m14898k() {
        return b.VALUE;
    }

    /* renamed from: l */
    static <K, V> Iterator<V> m14899l(Iterator<Map.Entry<K, V>> it) {
        return new a(it);
    }
}

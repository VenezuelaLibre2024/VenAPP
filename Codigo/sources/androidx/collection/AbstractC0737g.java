package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.collection.g */
/* loaded from: classes.dex */
public abstract class AbstractC0737g<K, V> {

    /* renamed from: a */
    AbstractC0737g<K, V>.b f3200a;

    /* renamed from: b */
    AbstractC0737g<K, V>.c f3201b;

    /* renamed from: c */
    AbstractC0737g<K, V>.e f3202c;

    /* renamed from: androidx.collection.g$a */
    /* loaded from: classes.dex */
    final class a<T> implements Iterator<T> {

        /* renamed from: a */
        final int f3203a;

        /* renamed from: b */
        int f3204b;

        /* renamed from: c */
        int f3205c;

        /* renamed from: d */
        boolean f3206d = false;

        a(int i10) {
            this.f3203a = i10;
            this.f3204b = AbstractC0737g.this.mo3655d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3205c < this.f3204b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t10 = (T) AbstractC0737g.this.mo3653b(this.f3205c, this.f3203a);
            this.f3205c++;
            this.f3206d = true;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f3206d) {
                throw new IllegalStateException();
            }
            int i10 = this.f3205c - 1;
            this.f3205c = i10;
            this.f3204b--;
            this.f3206d = false;
            AbstractC0737g.this.mo3659h(i10);
        }
    }

    /* renamed from: androidx.collection.g$b */
    /* loaded from: classes.dex */
    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int mo3655d = AbstractC0737g.this.mo3655d();
            for (Map.Entry<K, V> entry : collection) {
                AbstractC0737g.this.mo3658g(entry.getKey(), entry.getValue());
            }
            return mo3655d != AbstractC0737g.this.mo3655d();
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0737g.this.mo3652a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int mo3656e = AbstractC0737g.this.mo3656e(entry.getKey());
            if (mo3656e < 0) {
                return false;
            }
            return C0734d.m3676c(AbstractC0737g.this.mo3653b(mo3656e, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC0737g.m3693k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i10 = 0;
            for (int mo3655d = AbstractC0737g.this.mo3655d() - 1; mo3655d >= 0; mo3655d--) {
                Object mo3653b = AbstractC0737g.this.mo3653b(mo3655d, 0);
                Object mo3653b2 = AbstractC0737g.this.mo3653b(mo3655d, 1);
                i10 += (mo3653b == null ? 0 : mo3653b.hashCode()) ^ (mo3653b2 == null ? 0 : mo3653b2.hashCode());
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0737g.this.mo3655d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC0737g.this.mo3655d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: androidx.collection.g$c */
    /* loaded from: classes.dex */
    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0737g.this.mo3652a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0737g.this.mo3656e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return AbstractC0737g.m3692j(AbstractC0737g.this.mo3654c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC0737g.m3693k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i10 = 0;
            for (int mo3655d = AbstractC0737g.this.mo3655d() - 1; mo3655d >= 0; mo3655d--) {
                Object mo3653b = AbstractC0737g.this.mo3653b(mo3655d, 0);
                i10 += mo3653b == null ? 0 : mo3653b.hashCode();
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0737g.this.mo3655d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int mo3656e = AbstractC0737g.this.mo3656e(obj);
            if (mo3656e < 0) {
                return false;
            }
            AbstractC0737g.this.mo3659h(mo3656e);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return AbstractC0737g.m3694o(AbstractC0737g.this.mo3654c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return AbstractC0737g.m3695p(AbstractC0737g.this.mo3654c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC0737g.this.mo3655d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC0737g.this.m3699q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0737g.this.m3700r(tArr, 0);
        }
    }

    /* renamed from: androidx.collection.g$d */
    /* loaded from: classes.dex */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a */
        int f3210a;

        /* renamed from: c */
        boolean f3212c = false;

        /* renamed from: b */
        int f3211b = -1;

        d() {
            this.f3210a = AbstractC0737g.this.mo3655d() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f3211b++;
            this.f3212c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f3212c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return C0734d.m3676c(entry.getKey(), AbstractC0737g.this.mo3653b(this.f3211b, 0)) && C0734d.m3676c(entry.getValue(), AbstractC0737g.this.mo3653b(this.f3211b, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f3212c) {
                return (K) AbstractC0737g.this.mo3653b(this.f3211b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f3212c) {
                return (V) AbstractC0737g.this.mo3653b(this.f3211b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3211b < this.f3210a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f3212c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object mo3653b = AbstractC0737g.this.mo3653b(this.f3211b, 0);
            Object mo3653b2 = AbstractC0737g.this.mo3653b(this.f3211b, 1);
            return (mo3653b == null ? 0 : mo3653b.hashCode()) ^ (mo3653b2 != null ? mo3653b2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f3212c) {
                throw new IllegalStateException();
            }
            AbstractC0737g.this.mo3659h(this.f3211b);
            this.f3211b--;
            this.f3210a--;
            this.f3212c = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            if (this.f3212c) {
                return (V) AbstractC0737g.this.mo3660i(this.f3211b, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: androidx.collection.g$e */
    /* loaded from: classes.dex */
    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            AbstractC0737g.this.mo3652a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0737g.this.mo3657f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return AbstractC0737g.this.mo3655d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int mo3657f = AbstractC0737g.this.mo3657f(obj);
            if (mo3657f < 0) {
                return false;
            }
            AbstractC0737g.this.mo3659h(mo3657f);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int mo3655d = AbstractC0737g.this.mo3655d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < mo3655d) {
                if (collection.contains(AbstractC0737g.this.mo3653b(i10, 1))) {
                    AbstractC0737g.this.mo3659h(i10);
                    i10--;
                    mo3655d--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int mo3655d = AbstractC0737g.this.mo3655d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < mo3655d) {
                if (!collection.contains(AbstractC0737g.this.mo3653b(i10, 1))) {
                    AbstractC0737g.this.mo3659h(i10);
                    i10--;
                    mo3655d--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public int size() {
            return AbstractC0737g.this.mo3655d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC0737g.this.m3699q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0737g.this.m3700r(tArr, 1);
        }
    }

    /* renamed from: j */
    public static <K, V> boolean m3692j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static <T> boolean m3693k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static <K, V> boolean m3694o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    /* renamed from: p */
    public static <K, V> boolean m3695p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: a */
    protected abstract void mo3652a();

    /* renamed from: b */
    protected abstract Object mo3653b(int i10, int i11);

    /* renamed from: c */
    protected abstract Map<K, V> mo3654c();

    /* renamed from: d */
    protected abstract int mo3655d();

    /* renamed from: e */
    protected abstract int mo3656e(Object obj);

    /* renamed from: f */
    protected abstract int mo3657f(Object obj);

    /* renamed from: g */
    protected abstract void mo3658g(K k10, V v10);

    /* renamed from: h */
    protected abstract void mo3659h(int i10);

    /* renamed from: i */
    protected abstract V mo3660i(int i10, V v10);

    /* renamed from: l */
    public Set<Map.Entry<K, V>> m3696l() {
        if (this.f3200a == null) {
            this.f3200a = new b();
        }
        return this.f3200a;
    }

    /* renamed from: m */
    public Set<K> m3697m() {
        if (this.f3201b == null) {
            this.f3201b = new c();
        }
        return this.f3201b;
    }

    /* renamed from: n */
    public Collection<V> m3698n() {
        if (this.f3202c == null) {
            this.f3202c = new e();
        }
        return this.f3202c;
    }

    /* renamed from: q */
    public Object[] m3699q(int i10) {
        int mo3655d = mo3655d();
        Object[] objArr = new Object[mo3655d];
        for (int i11 = 0; i11 < mo3655d; i11++) {
            objArr[i11] = mo3653b(i11, i10);
        }
        return objArr;
    }

    /* renamed from: r */
    public <T> T[] m3700r(T[] tArr, int i10) {
        int mo3655d = mo3655d();
        if (tArr.length < mo3655d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), mo3655d));
        }
        for (int i11 = 0; i11 < mo3655d; i11++) {
            tArr[i11] = mo3653b(i11, i10);
        }
        if (tArr.length > mo3655d) {
            tArr[mo3655d] = null;
        }
        return tArr;
    }
}

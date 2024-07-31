package l;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a, reason: collision with root package name */
    c<K, V> f20763a;

    /* renamed from: b, reason: collision with root package name */
    private c<K, V> f20764b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakHashMap<f<K, V>, Boolean> f20765c = new WeakHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private int f20766d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // l.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f20770d;
        }

        @Override // l.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f20769c;
        }
    }

    /* renamed from: l.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0323b<K, V> extends e<K, V> {
        C0323b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // l.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f20769c;
        }

        @Override // l.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f20770d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final K f20767a;

        /* renamed from: b, reason: collision with root package name */
        final V f20768b;

        /* renamed from: c, reason: collision with root package name */
        c<K, V> f20769c;

        /* renamed from: d, reason: collision with root package name */
        c<K, V> f20770d;

        c(K k10, V v10) {
            this.f20767a = k10;
            this.f20768b = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f20767a.equals(cVar.f20767a) && this.f20768b.equals(cVar.f20768b);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f20767a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f20768b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f20767a.hashCode() ^ this.f20768b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f20767a + "=" + this.f20768b;
        }
    }

    /* loaded from: classes.dex */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private c<K, V> f20771a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f20772b = true;

        d() {
        }

        @Override // l.b.f
        void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f20771a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f20770d;
                this.f20771a = cVar3;
                this.f20772b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f20772b) {
                this.f20772b = false;
                cVar = b.this.f20763a;
            } else {
                c<K, V> cVar2 = this.f20771a;
                cVar = cVar2 != null ? cVar2.f20769c : null;
            }
            this.f20771a = cVar;
            return this.f20771a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f20772b) {
                return b.this.f20763a != null;
            }
            c<K, V> cVar = this.f20771a;
            return (cVar == null || cVar.f20769c == null) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    private static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        c<K, V> f20774a;

        /* renamed from: b, reason: collision with root package name */
        c<K, V> f20775b;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f20774a = cVar2;
            this.f20775b = cVar;
        }

        private c<K, V> f() {
            c<K, V> cVar = this.f20775b;
            c<K, V> cVar2 = this.f20774a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // l.b.f
        public void a(c<K, V> cVar) {
            if (this.f20774a == cVar && cVar == this.f20775b) {
                this.f20775b = null;
                this.f20774a = null;
            }
            c<K, V> cVar2 = this.f20774a;
            if (cVar2 == cVar) {
                this.f20774a = c(cVar2);
            }
            if (this.f20775b == cVar) {
                this.f20775b = f();
            }
        }

        abstract c<K, V> c(c<K, V> cVar);

        abstract c<K, V> d(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f20775b;
            this.f20775b = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20775b != null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f<K, V> {
        abstract void a(c<K, V> cVar);
    }

    public Map.Entry<K, V> c() {
        return this.f20763a;
    }

    protected c<K, V> d(K k10) {
        c<K, V> cVar = this.f20763a;
        while (cVar != null && !cVar.f20767a.equals(k10)) {
            cVar = cVar.f20769c;
        }
        return cVar;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0323b c0323b = new C0323b(this.f20764b, this.f20763a);
        this.f20765c.put(c0323b, Boolean.FALSE);
        return c0323b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public b<K, V>.d f() {
        b<K, V>.d dVar = new d();
        this.f20765c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> h() {
        return this.f20764b;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().hashCode();
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f20763a, this.f20764b);
        this.f20765c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c<K, V> k(K k10, V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f20766d++;
        c<K, V> cVar2 = this.f20764b;
        if (cVar2 == null) {
            this.f20763a = cVar;
        } else {
            cVar2.f20769c = cVar;
            cVar.f20770d = cVar2;
        }
        this.f20764b = cVar;
        return cVar;
    }

    public V l(K k10, V v10) {
        c<K, V> d10 = d(k10);
        if (d10 != null) {
            return d10.f20768b;
        }
        k(k10, v10);
        return null;
    }

    public V m(K k10) {
        c<K, V> d10 = d(k10);
        if (d10 == null) {
            return null;
        }
        this.f20766d--;
        if (!this.f20765c.isEmpty()) {
            Iterator<f<K, V>> it = this.f20765c.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(d10);
            }
        }
        c<K, V> cVar = d10.f20770d;
        c<K, V> cVar2 = d10.f20769c;
        if (cVar != null) {
            cVar.f20769c = cVar2;
        } else {
            this.f20763a = cVar2;
        }
        c<K, V> cVar3 = d10.f20769c;
        if (cVar3 != null) {
            cVar3.f20770d = cVar;
        } else {
            this.f20764b = cVar;
        }
        d10.f20769c = null;
        d10.f20770d = null;
        return d10.f20768b;
    }

    public int size() {
        return this.f20766d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}

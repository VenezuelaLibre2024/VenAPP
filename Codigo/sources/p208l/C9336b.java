package p208l;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: l.b */
/* loaded from: classes.dex */
public class C9336b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a */
    c<K, V> f22585a;

    /* renamed from: b */
    private c<K, V> f22586b;

    /* renamed from: c */
    private final WeakHashMap<f<K, V>, Boolean> f22587c = new WeakHashMap<>();

    /* renamed from: d */
    private int f22588d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l.b$a */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p208l.C9336b.e
        /* renamed from: c */
        c<K, V> mo27818c(c<K, V> cVar) {
            return cVar.f22592d;
        }

        @Override // p208l.C9336b.e
        /* renamed from: d */
        c<K, V> mo27819d(c<K, V> cVar) {
            return cVar.f22591c;
        }
    }

    /* renamed from: l.b$b */
    /* loaded from: classes.dex */
    private static class b<K, V> extends e<K, V> {
        b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p208l.C9336b.e
        /* renamed from: c */
        c<K, V> mo27818c(c<K, V> cVar) {
            return cVar.f22591c;
        }

        @Override // p208l.C9336b.e
        /* renamed from: d */
        c<K, V> mo27819d(c<K, V> cVar) {
            return cVar.f22592d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l.b$c */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        final K f22589a;

        /* renamed from: b */
        final V f22590b;

        /* renamed from: c */
        c<K, V> f22591c;

        /* renamed from: d */
        c<K, V> f22592d;

        c(K k10, V v10) {
            this.f22589a = k10;
            this.f22590b = v10;
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
            return this.f22589a.equals(cVar.f22589a) && this.f22590b.equals(cVar.f22590b);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f22589a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f22590b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f22589a.hashCode() ^ this.f22590b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f22589a + "=" + this.f22590b;
        }
    }

    /* renamed from: l.b$d */
    /* loaded from: classes.dex */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        private c<K, V> f22593a;

        /* renamed from: b */
        private boolean f22594b = true;

        d() {
        }

        @Override // p208l.C9336b.f
        /* renamed from: a */
        void mo27820a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f22593a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f22592d;
                this.f22593a = cVar3;
                this.f22594b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f22594b) {
                this.f22594b = false;
                cVar = C9336b.this.f22585a;
            } else {
                c<K, V> cVar2 = this.f22593a;
                cVar = cVar2 != null ? cVar2.f22591c : null;
            }
            this.f22593a = cVar;
            return this.f22593a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f22594b) {
                return C9336b.this.f22585a != null;
            }
            c<K, V> cVar = this.f22593a;
            return (cVar == null || cVar.f22591c == null) ? false : true;
        }
    }

    /* renamed from: l.b$e */
    /* loaded from: classes.dex */
    private static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        c<K, V> f22596a;

        /* renamed from: b */
        c<K, V> f22597b;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f22596a = cVar2;
            this.f22597b = cVar;
        }

        /* renamed from: f */
        private c<K, V> m27822f() {
            c<K, V> cVar = this.f22597b;
            c<K, V> cVar2 = this.f22596a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo27819d(cVar);
        }

        @Override // p208l.C9336b.f
        /* renamed from: a */
        public void mo27820a(c<K, V> cVar) {
            if (this.f22596a == cVar && cVar == this.f22597b) {
                this.f22597b = null;
                this.f22596a = null;
            }
            c<K, V> cVar2 = this.f22596a;
            if (cVar2 == cVar) {
                this.f22596a = mo27818c(cVar2);
            }
            if (this.f22597b == cVar) {
                this.f22597b = m27822f();
            }
        }

        /* renamed from: c */
        abstract c<K, V> mo27818c(c<K, V> cVar);

        /* renamed from: d */
        abstract c<K, V> mo27819d(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f22597b;
            this.f22597b = m27822f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22597b != null;
        }
    }

    /* renamed from: l.b$f */
    /* loaded from: classes.dex */
    public static abstract class f<K, V> {
        /* renamed from: a */
        abstract void mo27820a(c<K, V> cVar);
    }

    /* renamed from: c */
    public Map.Entry<K, V> m27814c() {
        return this.f22585a;
    }

    /* renamed from: d */
    protected c<K, V> mo27810d(K k10) {
        c<K, V> cVar = this.f22585a;
        while (cVar != null && !cVar.f22589a.equals(k10)) {
            cVar = cVar.f22591c;
        }
        return cVar;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        b bVar = new b(this.f22586b, this.f22585a);
        this.f22587c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9336b)) {
            return false;
        }
        C9336b c9336b = (C9336b) obj;
        if (size() != c9336b.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c9336b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* renamed from: f */
    public C9336b<K, V>.d m27815f() {
        C9336b<K, V>.d dVar = new d();
        this.f22587c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    /* renamed from: h */
    public Map.Entry<K, V> m27816h() {
        return this.f22586b;
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
        a aVar = new a(this.f22585a, this.f22586b);
        this.f22587c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public c<K, V> m27817k(K k10, V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f22588d++;
        c<K, V> cVar2 = this.f22586b;
        if (cVar2 == null) {
            this.f22585a = cVar;
        } else {
            cVar2.f22591c = cVar;
            cVar.f22592d = cVar2;
        }
        this.f22586b = cVar;
        return cVar;
    }

    /* renamed from: l */
    public V mo27811l(K k10, V v10) {
        c<K, V> mo27810d = mo27810d(k10);
        if (mo27810d != null) {
            return mo27810d.f22590b;
        }
        m27817k(k10, v10);
        return null;
    }

    /* renamed from: m */
    public V mo27812m(K k10) {
        c<K, V> mo27810d = mo27810d(k10);
        if (mo27810d == null) {
            return null;
        }
        this.f22588d--;
        if (!this.f22587c.isEmpty()) {
            Iterator<f<K, V>> it = this.f22587c.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo27820a(mo27810d);
            }
        }
        c<K, V> cVar = mo27810d.f22592d;
        c<K, V> cVar2 = mo27810d.f22591c;
        if (cVar != null) {
            cVar.f22591c = cVar2;
        } else {
            this.f22585a = cVar2;
        }
        c<K, V> cVar3 = mo27810d.f22591c;
        if (cVar3 != null) {
            cVar3.f22592d = cVar;
        } else {
            this.f22586b = cVar;
        }
        mo27810d.f22591c = null;
        mo27810d.f22592d = null;
        return mo27810d.f22590b;
    }

    public int size() {
        return this.f22588d;
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

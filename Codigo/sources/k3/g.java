package k3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k3.m;

/* loaded from: classes.dex */
class g<K extends m, V> {

    /* renamed from: a, reason: collision with root package name */
    private final a<K, V> f20284a = new a<>();

    /* renamed from: b, reason: collision with root package name */
    private final Map<K, a<K, V>> f20285b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final K f20286a;

        /* renamed from: b, reason: collision with root package name */
        private List<V> f20287b;

        /* renamed from: c, reason: collision with root package name */
        a<K, V> f20288c;

        /* renamed from: d, reason: collision with root package name */
        a<K, V> f20289d;

        a() {
            this(null);
        }

        a(K k10) {
            this.f20289d = this;
            this.f20288c = this;
            this.f20286a = k10;
        }

        public void a(V v10) {
            if (this.f20287b == null) {
                this.f20287b = new ArrayList();
            }
            this.f20287b.add(v10);
        }

        public V b() {
            int c10 = c();
            if (c10 > 0) {
                return this.f20287b.remove(c10 - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.f20287b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
    }

    private void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f20284a;
        aVar.f20289d = aVar2;
        aVar.f20288c = aVar2.f20288c;
        g(aVar);
    }

    private void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f20284a;
        aVar.f20289d = aVar2.f20289d;
        aVar.f20288c = aVar2;
        g(aVar);
    }

    private static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f20289d;
        aVar2.f20288c = aVar.f20288c;
        aVar.f20288c.f20289d = aVar2;
    }

    private static <K, V> void g(a<K, V> aVar) {
        aVar.f20288c.f20289d = aVar;
        aVar.f20289d.f20288c = aVar;
    }

    public V a(K k10) {
        a<K, V> aVar = this.f20285b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            this.f20285b.put(k10, aVar);
        } else {
            k10.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(K k10, V v10) {
        a<K, V> aVar = this.f20285b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            c(aVar);
            this.f20285b.put(k10, aVar);
        } else {
            k10.a();
        }
        aVar.a(v10);
    }

    public V f() {
        a aVar = this.f20284a;
        while (true) {
            aVar = aVar.f20289d;
            if (aVar.equals(this.f20284a)) {
                return null;
            }
            V v10 = (V) aVar.b();
            if (v10 != null) {
                return v10;
            }
            e(aVar);
            this.f20285b.remove(aVar.f20286a);
            ((m) aVar.f20286a).a();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f20284a.f20288c;
        boolean z10 = false;
        while (!aVar.equals(this.f20284a)) {
            sb2.append('{');
            sb2.append(aVar.f20286a);
            sb2.append(':');
            sb2.append(aVar.c());
            sb2.append("}, ");
            aVar = aVar.f20288c;
            z10 = true;
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}

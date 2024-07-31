package p193k3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p193k3.InterfaceC9150m;

/* renamed from: k3.g */
/* loaded from: classes.dex */
class C9144g<K extends InterfaceC9150m, V> {

    /* renamed from: a */
    private final a<K, V> f22066a = new a<>();

    /* renamed from: b */
    private final Map<K, a<K, V>> f22067b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k3.g$a */
    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a */
        final K f22068a;

        /* renamed from: b */
        private List<V> f22069b;

        /* renamed from: c */
        a<K, V> f22070c;

        /* renamed from: d */
        a<K, V> f22071d;

        a() {
            this(null);
        }

        a(K k10) {
            this.f22071d = this;
            this.f22070c = this;
            this.f22068a = k10;
        }

        /* renamed from: a */
        public void m26962a(V v10) {
            if (this.f22069b == null) {
                this.f22069b = new ArrayList();
            }
            this.f22069b.add(v10);
        }

        /* renamed from: b */
        public V m26963b() {
            int m26964c = m26964c();
            if (m26964c > 0) {
                return this.f22069b.remove(m26964c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int m26964c() {
            List<V> list = this.f22069b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
    }

    /* renamed from: b */
    private void m26955b(a<K, V> aVar) {
        m26957e(aVar);
        a<K, V> aVar2 = this.f22066a;
        aVar.f22071d = aVar2;
        aVar.f22070c = aVar2.f22070c;
        m26958g(aVar);
    }

    /* renamed from: c */
    private void m26956c(a<K, V> aVar) {
        m26957e(aVar);
        a<K, V> aVar2 = this.f22066a;
        aVar.f22071d = aVar2.f22071d;
        aVar.f22070c = aVar2;
        m26958g(aVar);
    }

    /* renamed from: e */
    private static <K, V> void m26957e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f22071d;
        aVar2.f22070c = aVar.f22070c;
        aVar.f22070c.f22071d = aVar2;
    }

    /* renamed from: g */
    private static <K, V> void m26958g(a<K, V> aVar) {
        aVar.f22070c.f22071d = aVar;
        aVar.f22071d.f22070c = aVar;
    }

    /* renamed from: a */
    public V m26959a(K k10) {
        a<K, V> aVar = this.f22067b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            this.f22067b.put(k10, aVar);
        } else {
            k10.mo26978a();
        }
        m26955b(aVar);
        return aVar.m26963b();
    }

    /* renamed from: d */
    public void m26960d(K k10, V v10) {
        a<K, V> aVar = this.f22067b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            m26956c(aVar);
            this.f22067b.put(k10, aVar);
        } else {
            k10.mo26978a();
        }
        aVar.m26962a(v10);
    }

    /* renamed from: f */
    public V m26961f() {
        a aVar = this.f22066a;
        while (true) {
            aVar = aVar.f22071d;
            if (aVar.equals(this.f22066a)) {
                return null;
            }
            V v10 = (V) aVar.m26963b();
            if (v10 != null) {
                return v10;
            }
            m26957e(aVar);
            this.f22067b.remove(aVar.f22068a);
            ((InterfaceC9150m) aVar.f22068a).mo26978a();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f22066a.f22070c;
        boolean z10 = false;
        while (!aVar.equals(this.f22066a)) {
            sb2.append('{');
            sb2.append(aVar.f22068a);
            sb2.append(':');
            sb2.append(aVar.m26964c());
            sb2.append("}, ");
            aVar = aVar.f22070c;
            z10 = true;
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}

package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.n0;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class p1 implements n0 {
    protected static final Comparator<n0.a<?>> H;
    private static final p1 I;
    protected final TreeMap<n0.a<?>, Map<n0.c, Object>> G;

    static {
        Comparator<n0.a<?>> comparator = new Comparator() { // from class: androidx.camera.core.impl.o1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int Z;
                Z = p1.Z((n0.a) obj, (n0.a) obj2);
                return Z;
            }
        };
        H = comparator;
        I = new p1(new TreeMap(comparator));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p1(TreeMap<n0.a<?>, Map<n0.c, Object>> treeMap) {
        this.G = treeMap;
    }

    public static p1 X() {
        return I;
    }

    public static p1 Y(n0 n0Var) {
        if (p1.class.equals(n0Var.getClass())) {
            return (p1) n0Var;
        }
        TreeMap treeMap = new TreeMap(H);
        for (n0.a<?> aVar : n0Var.e()) {
            Set<n0.c> f10 = n0Var.f(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (n0.c cVar : f10) {
                arrayMap.put(cVar, n0Var.d(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new p1(treeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int Z(n0.a aVar, n0.a aVar2) {
        return aVar.c().compareTo(aVar2.c());
    }

    @Override // androidx.camera.core.impl.n0
    public <ValueT> ValueT a(n0.a<ValueT> aVar) {
        Map<n0.c, Object> map = this.G.get(aVar);
        if (map != null) {
            return (ValueT) map.get((n0.c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // androidx.camera.core.impl.n0
    public boolean b(n0.a<?> aVar) {
        return this.G.containsKey(aVar);
    }

    @Override // androidx.camera.core.impl.n0
    public void c(String str, n0.b bVar) {
        for (Map.Entry<n0.a<?>, Map<n0.c, Object>> entry : this.G.tailMap(n0.a.a(str, Void.class)).entrySet()) {
            if (!entry.getKey().c().startsWith(str) || !bVar.a(entry.getKey())) {
                return;
            }
        }
    }

    @Override // androidx.camera.core.impl.n0
    public <ValueT> ValueT d(n0.a<ValueT> aVar, n0.c cVar) {
        Map<n0.c, Object> map = this.G.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        }
        if (map.containsKey(cVar)) {
            return (ValueT) map.get(cVar);
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + cVar);
    }

    @Override // androidx.camera.core.impl.n0
    public Set<n0.a<?>> e() {
        return Collections.unmodifiableSet(this.G.keySet());
    }

    @Override // androidx.camera.core.impl.n0
    public Set<n0.c> f(n0.a<?> aVar) {
        Map<n0.c, Object> map = this.G.get(aVar);
        return map == null ? Collections.emptySet() : Collections.unmodifiableSet(map.keySet());
    }

    @Override // androidx.camera.core.impl.n0
    public <ValueT> ValueT g(n0.a<ValueT> aVar, ValueT valuet) {
        try {
            return (ValueT) a(aVar);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }

    @Override // androidx.camera.core.impl.n0
    public n0.c h(n0.a<?> aVar) {
        Map<n0.c, Object> map = this.G.get(aVar);
        if (map != null) {
            return (n0.c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }
}

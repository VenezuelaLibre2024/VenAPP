package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.InterfaceC0649n0;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: androidx.camera.core.impl.p1 */
/* loaded from: classes.dex */
public class C0656p1 implements InterfaceC0649n0 {

    /* renamed from: H */
    protected static final Comparator<InterfaceC0649n0.a<?>> f2899H;

    /* renamed from: I */
    private static final C0656p1 f2900I;

    /* renamed from: G */
    protected final TreeMap<InterfaceC0649n0.a<?>, Map<InterfaceC0649n0.c, Object>> f2901G;

    static {
        Comparator<InterfaceC0649n0.a<?>> comparator = new Comparator() { // from class: androidx.camera.core.impl.o1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m3212Z;
                m3212Z = C0656p1.m3212Z((InterfaceC0649n0.a) obj, (InterfaceC0649n0.a) obj2);
                return m3212Z;
            }
        };
        f2899H = comparator;
        f2900I = new C0656p1(new TreeMap(comparator));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0656p1(TreeMap<InterfaceC0649n0.a<?>, Map<InterfaceC0649n0.c, Object>> treeMap) {
        this.f2901G = treeMap;
    }

    /* renamed from: X */
    public static C0656p1 m3210X() {
        return f2900I;
    }

    /* renamed from: Y */
    public static C0656p1 m3211Y(InterfaceC0649n0 interfaceC0649n0) {
        if (C0656p1.class.equals(interfaceC0649n0.getClass())) {
            return (C0656p1) interfaceC0649n0;
        }
        TreeMap treeMap = new TreeMap(f2899H);
        for (InterfaceC0649n0.a<?> aVar : interfaceC0649n0.mo3195e()) {
            Set<InterfaceC0649n0.c> mo3196f = interfaceC0649n0.mo3196f(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (InterfaceC0649n0.c cVar : mo3196f) {
                arrayMap.put(cVar, interfaceC0649n0.mo3194d(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new C0656p1(treeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public static /* synthetic */ int m3212Z(InterfaceC0649n0.a aVar, InterfaceC0649n0.a aVar2) {
        return aVar.mo3015c().compareTo(aVar2.mo3015c());
    }

    @Override // androidx.camera.core.impl.InterfaceC0649n0
    /* renamed from: a */
    public <ValueT> ValueT mo3191a(InterfaceC0649n0.a<ValueT> aVar) {
        Map<InterfaceC0649n0.c, Object> map = this.f2901G.get(aVar);
        if (map != null) {
            return (ValueT) map.get((InterfaceC0649n0.c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // androidx.camera.core.impl.InterfaceC0649n0
    /* renamed from: b */
    public boolean mo3192b(InterfaceC0649n0.a<?> aVar) {
        return this.f2901G.containsKey(aVar);
    }

    @Override // androidx.camera.core.impl.InterfaceC0649n0
    /* renamed from: c */
    public void mo3193c(String str, InterfaceC0649n0.b bVar) {
        for (Map.Entry<InterfaceC0649n0.a<?>, Map<InterfaceC0649n0.c, Object>> entry : this.f2901G.tailMap(InterfaceC0649n0.a.m3199a(str, Void.class)).entrySet()) {
            if (!entry.getKey().mo3015c().startsWith(str) || !bVar.mo3201a(entry.getKey())) {
                return;
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0649n0
    /* renamed from: d */
    public <ValueT> ValueT mo3194d(InterfaceC0649n0.a<ValueT> aVar, InterfaceC0649n0.c cVar) {
        Map<InterfaceC0649n0.c, Object> map = this.f2901G.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        }
        if (map.containsKey(cVar)) {
            return (ValueT) map.get(cVar);
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + cVar);
    }

    @Override // androidx.camera.core.impl.InterfaceC0649n0
    /* renamed from: e */
    public Set<InterfaceC0649n0.a<?>> mo3195e() {
        return Collections.unmodifiableSet(this.f2901G.keySet());
    }

    @Override // androidx.camera.core.impl.InterfaceC0649n0
    /* renamed from: f */
    public Set<InterfaceC0649n0.c> mo3196f(InterfaceC0649n0.a<?> aVar) {
        Map<InterfaceC0649n0.c, Object> map = this.f2901G.get(aVar);
        return map == null ? Collections.emptySet() : Collections.unmodifiableSet(map.keySet());
    }

    @Override // androidx.camera.core.impl.InterfaceC0649n0
    /* renamed from: g */
    public <ValueT> ValueT mo3197g(InterfaceC0649n0.a<ValueT> aVar, ValueT valuet) {
        try {
            return (ValueT) mo3191a(aVar);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0649n0
    /* renamed from: h */
    public InterfaceC0649n0.c mo3198h(InterfaceC0649n0.a<?> aVar) {
        Map<InterfaceC0649n0.c, Object> map = this.f2901G.get(aVar);
        if (map != null) {
            return (InterfaceC0649n0.c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }
}

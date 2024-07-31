package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.InterfaceC0649n0;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: androidx.camera.core.impl.m1 */
/* loaded from: classes.dex */
public final class C0647m1 extends C0656p1 implements InterfaceC0643l1 {

    /* renamed from: J */
    private static final InterfaceC0649n0.c f2896J = InterfaceC0649n0.c.OPTIONAL;

    private C0647m1(TreeMap<InterfaceC0649n0.a<?>, Map<InterfaceC0649n0.c, Object>> treeMap) {
        super(treeMap);
    }

    /* renamed from: a0 */
    public static C0647m1 m3184a0() {
        return new C0647m1(new TreeMap(C0656p1.f2899H));
    }

    /* renamed from: b0 */
    public static C0647m1 m3185b0(InterfaceC0649n0 interfaceC0649n0) {
        TreeMap treeMap = new TreeMap(C0656p1.f2899H);
        for (InterfaceC0649n0.a<?> aVar : interfaceC0649n0.mo3195e()) {
            Set<InterfaceC0649n0.c> mo3196f = interfaceC0649n0.mo3196f(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (InterfaceC0649n0.c cVar : mo3196f) {
                arrayMap.put(cVar, interfaceC0649n0.mo3194d(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new C0647m1(treeMap);
    }

    /* renamed from: c0 */
    public <ValueT> ValueT m3186c0(InterfaceC0649n0.a<ValueT> aVar) {
        return (ValueT) this.f2901G.remove(aVar);
    }

    @Override // androidx.camera.core.impl.InterfaceC0643l1
    /* renamed from: p */
    public <ValueT> void mo3177p(InterfaceC0649n0.a<ValueT> aVar, InterfaceC0649n0.c cVar, ValueT valuet) {
        Map<InterfaceC0649n0.c, Object> map = this.f2901G.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f2901G.put(aVar, arrayMap);
            arrayMap.put(cVar, valuet);
            return;
        }
        InterfaceC0649n0.c cVar2 = (InterfaceC0649n0.c) Collections.min(map.keySet());
        if (Objects.equals(map.get(cVar2), valuet) || !InterfaceC0649n0.m3190z(cVar2, cVar)) {
            map.put(cVar, valuet);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aVar.mo3015c() + ", existing value (" + cVar2 + ")=" + map.get(cVar2) + ", conflicting (" + cVar + ")=" + valuet);
    }

    @Override // androidx.camera.core.impl.InterfaceC0643l1
    /* renamed from: r */
    public <ValueT> void mo3178r(InterfaceC0649n0.a<ValueT> aVar, ValueT valuet) {
        mo3177p(aVar, f2896J, valuet);
    }
}

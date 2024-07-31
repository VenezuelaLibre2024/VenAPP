package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.n0;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class m1 extends p1 implements l1 {
    private static final n0.c J = n0.c.OPTIONAL;

    private m1(TreeMap<n0.a<?>, Map<n0.c, Object>> treeMap) {
        super(treeMap);
    }

    public static m1 a0() {
        return new m1(new TreeMap(p1.H));
    }

    public static m1 b0(n0 n0Var) {
        TreeMap treeMap = new TreeMap(p1.H);
        for (n0.a<?> aVar : n0Var.e()) {
            Set<n0.c> f10 = n0Var.f(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (n0.c cVar : f10) {
                arrayMap.put(cVar, n0Var.d(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new m1(treeMap);
    }

    public <ValueT> ValueT c0(n0.a<ValueT> aVar) {
        return (ValueT) this.G.remove(aVar);
    }

    @Override // androidx.camera.core.impl.l1
    public <ValueT> void p(n0.a<ValueT> aVar, n0.c cVar, ValueT valuet) {
        Map<n0.c, Object> map = this.G.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.G.put(aVar, arrayMap);
            arrayMap.put(cVar, valuet);
            return;
        }
        n0.c cVar2 = (n0.c) Collections.min(map.keySet());
        if (Objects.equals(map.get(cVar2), valuet) || !n0.z(cVar2, cVar)) {
            map.put(cVar, valuet);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aVar.c() + ", existing value (" + cVar2 + ")=" + map.get(cVar2) + ", conflicting (" + cVar + ")=" + valuet);
    }

    @Override // androidx.camera.core.impl.l1
    public <ValueT> void r(n0.a<ValueT> aVar, ValueT valuet) {
        p(aVar, J, valuet);
    }
}

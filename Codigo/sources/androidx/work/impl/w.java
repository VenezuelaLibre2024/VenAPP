package androidx.work.impl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a */
    private final Object f5945a = new Object();

    /* renamed from: b */
    private final Map<k2.m, v> f5946b = new LinkedHashMap();

    public final boolean a(k2.m id2) {
        boolean containsKey;
        kotlin.jvm.internal.n.e(id2, "id");
        synchronized (this.f5945a) {
            containsKey = this.f5946b.containsKey(id2);
        }
        return containsKey;
    }

    public final v b(k2.m id2) {
        v remove;
        kotlin.jvm.internal.n.e(id2, "id");
        synchronized (this.f5945a) {
            remove = this.f5946b.remove(id2);
        }
        return remove;
    }

    public final List<v> c(String workSpecId) {
        List<v> f02;
        kotlin.jvm.internal.n.e(workSpecId, "workSpecId");
        synchronized (this.f5945a) {
            Map<k2.m, v> map = this.f5946b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<k2.m, v> entry : map.entrySet()) {
                if (kotlin.jvm.internal.n.a(entry.getKey().b(), workSpecId)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                this.f5946b.remove((k2.m) it.next());
            }
            f02 = dk.z.f0(linkedHashMap.values());
        }
        return f02;
    }

    public final v d(k2.m id2) {
        v vVar;
        kotlin.jvm.internal.n.e(id2, "id");
        synchronized (this.f5945a) {
            Map<k2.m, v> map = this.f5946b;
            v vVar2 = map.get(id2);
            if (vVar2 == null) {
                vVar2 = new v(id2);
                map.put(id2, vVar2);
            }
            vVar = vVar2;
        }
        return vVar;
    }

    public final v e(k2.u spec) {
        kotlin.jvm.internal.n.e(spec, "spec");
        return d(k2.x.a(spec));
    }
}

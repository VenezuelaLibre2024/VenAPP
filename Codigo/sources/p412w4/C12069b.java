package p412w4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C9322n;

/* renamed from: w4.b */
/* loaded from: classes.dex */
public final class C12069b {

    /* renamed from: a */
    private final ConcurrentHashMap<String, ConcurrentHashMap<String, C12068a>> f32087a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public final List<C12068a> m38747a(String appId) {
        C9322n.m27781e(appId, "appId");
        ConcurrentHashMap<String, C12068a> concurrentHashMap = this.f32087a.get(appId);
        if (concurrentHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        Iterator<Map.Entry<String, C12068a>> it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void m38748b(String appId, List<C12068a> gateKeeperList) {
        C9322n.m27781e(appId, "appId");
        C9322n.m27781e(gateKeeperList, "gateKeeperList");
        ConcurrentHashMap<String, C12068a> concurrentHashMap = new ConcurrentHashMap<>();
        for (C12068a c12068a : gateKeeperList) {
            concurrentHashMap.put(c12068a.m38745a(), c12068a);
        }
        this.f32087a.put(appId, concurrentHashMap);
    }
}

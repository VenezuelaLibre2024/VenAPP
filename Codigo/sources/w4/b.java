package w4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, ConcurrentHashMap<String, a>> f29624a = new ConcurrentHashMap<>();

    public final List<a> a(String appId) {
        n.e(appId, "appId");
        ConcurrentHashMap<String, a> concurrentHashMap = this.f29624a.get(appId);
        if (concurrentHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        Iterator<Map.Entry<String, a>> it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    public final void b(String appId, List<a> gateKeeperList) {
        n.e(appId, "appId");
        n.e(gateKeeperList, "gateKeeperList");
        ConcurrentHashMap<String, a> concurrentHashMap = new ConcurrentHashMap<>();
        for (a aVar : gateKeeperList) {
            concurrentHashMap.put(aVar.a(), aVar);
        }
        this.f29624a.put(appId, concurrentHashMap);
    }
}

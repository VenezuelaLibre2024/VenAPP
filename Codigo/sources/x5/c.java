package x5;

import ck.r;
import com.facebook.ads.AdError;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import dk.j0;
import dk.k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.n;
import w5.d;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f30409a = new c();

    private c() {
    }

    private final w5.d f(Map<?, ?> map) {
        w5.d dVar = new w5.d();
        Object obj = map.get("title");
        n.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
        dVar.f(((Boolean) obj).booleanValue());
        Object obj2 = map.get("size");
        n.c(obj2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        Map map2 = (Map) obj2;
        d.c cVar = new d.c();
        Object obj3 = map2.get("minWidth");
        n.c(obj3, "null cannot be cast to non-null type kotlin.Int");
        cVar.j(((Integer) obj3).intValue());
        Object obj4 = map2.get("maxWidth");
        n.c(obj4, "null cannot be cast to non-null type kotlin.Int");
        cVar.h(((Integer) obj4).intValue());
        Object obj5 = map2.get("minHeight");
        n.c(obj5, "null cannot be cast to non-null type kotlin.Int");
        cVar.i(((Integer) obj5).intValue());
        Object obj6 = map2.get("maxHeight");
        n.c(obj6, "null cannot be cast to non-null type kotlin.Int");
        cVar.g(((Integer) obj6).intValue());
        Object obj7 = map2.get("ignoreSize");
        n.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
        cVar.f(((Boolean) obj7).booleanValue());
        dVar.g(cVar);
        Object obj8 = map.get("duration");
        n.c(obj8, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        Map map3 = (Map) obj8;
        d.b bVar = new d.b();
        n.c(map3.get("min"), "null cannot be cast to non-null type kotlin.Int");
        bVar.f(((Integer) r3).intValue());
        n.c(map3.get("max"), "null cannot be cast to non-null type kotlin.Int");
        bVar.e(((Integer) r3).intValue());
        Object obj9 = map3.get("allowNullable");
        n.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
        bVar.d(((Boolean) obj9).booleanValue());
        dVar.e(bVar);
        return dVar;
    }

    public final Map<String, Object> a(v5.a entity) {
        HashMap j10;
        n.e(entity, "entity");
        j10 = k0.j(r.a(FacebookMediationAdapter.KEY_ID, String.valueOf(entity.e())), r.a("duration", Long.valueOf(entity.c() / AdError.NETWORK_ERROR_CODE)), r.a("type", Integer.valueOf(entity.m())), r.a("createDt", Long.valueOf(entity.a())), r.a("width", Integer.valueOf(entity.o())), r.a("height", Integer.valueOf(entity.d())), r.a("orientation", Integer.valueOf(entity.j())), r.a("modifiedDt", Long.valueOf(entity.i())), r.a("lat", entity.f()), r.a("lng", entity.g()), r.a("title", entity.b()), r.a("relativePath", entity.l()));
        if (entity.h() != null) {
            j10.put("mimeType", entity.h());
        }
        return j10;
    }

    public final Map<String, Object> b(List<v5.a> list) {
        Map<String, Object> f10;
        n.e(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator<v5.a> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        f10 = j0.f(r.a("data", arrayList));
        return f10;
    }

    public final Map<String, Object> c(List<v5.b> list) {
        Map<String, Object> f10;
        Map l10;
        n.e(list, "list");
        ArrayList arrayList = new ArrayList();
        for (v5.b bVar : list) {
            if (bVar.a() != 0) {
                l10 = k0.l(r.a(FacebookMediationAdapter.KEY_ID, bVar.b()), r.a("name", bVar.d()), r.a("assetCount", Integer.valueOf(bVar.a())), r.a("isAll", Boolean.valueOf(bVar.e())));
                if (bVar.c() != null) {
                    Long c10 = bVar.c();
                    n.b(c10);
                    l10.put("modified", c10);
                }
                arrayList.add(l10);
            }
        }
        f10 = j0.f(r.a("data", arrayList));
        return f10;
    }

    public final w5.c d(Map<?, ?> map) {
        n.e(map, "map");
        return new w5.c(Long.parseLong(String.valueOf(map.get("min"))), Long.parseLong(String.valueOf(map.get("max"))), Boolean.parseBoolean(String.valueOf(map.get("ignore"))));
    }

    public final w5.e e(Map<?, ?> map) {
        n.e(map, "map");
        Object obj = map.get("type");
        n.c(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        Object obj2 = map.get("child");
        n.c(obj2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        Map map2 = (Map) obj2;
        if (intValue == 0) {
            return new w5.a(map2);
        }
        if (intValue == 1) {
            return new w5.b(map2);
        }
        throw new IllegalStateException("Unknown type " + intValue + " for filter option.");
    }

    public final List<w5.f> g(List<?> orders) {
        ArrayList f10;
        n.e(orders, "orders");
        ArrayList arrayList = new ArrayList();
        if (orders.isEmpty()) {
            f10 = dk.r.f(new w5.f("_id", false));
            return f10;
        }
        for (Object obj : orders) {
            n.c(obj, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            Map map = (Map) obj;
            Object obj2 = map.get("type");
            n.c(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            Object obj3 = map.get("asc");
            n.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            String str = intValue != 0 ? intValue != 1 ? null : "date_modified" : "date_added";
            if (str != null) {
                arrayList.add(new w5.f(str, booleanValue));
            }
        }
        return arrayList;
    }

    public final w5.d h(Map<?, ?> map, s5.a type) {
        n.e(map, "map");
        n.e(type, "type");
        String lowerCase = type.name().toLowerCase(Locale.ROOT);
        n.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (map.containsKey(lowerCase)) {
            Object obj = map.get(lowerCase);
            if (obj instanceof Map) {
                return f((Map) obj);
            }
        }
        return new w5.d();
    }
}

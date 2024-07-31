package p435x5;

import ck.C2033r;
import com.facebook.ads.AdError;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import dk.C7016j0;
import dk.C7018k0;
import dk.C7031r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C9322n;
import p348s5.EnumC10799a;
import p395v5.C11627a;
import p395v5.C11628b;
import p413w5.AbstractC12074e;
import p413w5.C12070a;
import p413w5.C12071b;
import p413w5.C12072c;
import p413w5.C12073d;
import p413w5.C12075f;

/* renamed from: x5.c */
/* loaded from: classes.dex */
public final class C12287c {

    /* renamed from: a */
    public static final C12287c f32921a = new C12287c();

    private C12287c() {
    }

    /* renamed from: f */
    private final C12073d m39616f(Map<?, ?> map) {
        C12073d c12073d = new C12073d();
        Object obj = map.get("title");
        C9322n.m27779c(obj, "null cannot be cast to non-null type kotlin.Boolean");
        c12073d.m38767f(((Boolean) obj).booleanValue());
        Object obj2 = map.get("size");
        C9322n.m27779c(obj2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        Map map2 = (Map) obj2;
        C12073d.c cVar = new C12073d.c();
        Object obj3 = map2.get("minWidth");
        C9322n.m27779c(obj3, "null cannot be cast to non-null type kotlin.Int");
        cVar.m38786j(((Integer) obj3).intValue());
        Object obj4 = map2.get("maxWidth");
        C9322n.m27779c(obj4, "null cannot be cast to non-null type kotlin.Int");
        cVar.m38784h(((Integer) obj4).intValue());
        Object obj5 = map2.get("minHeight");
        C9322n.m27779c(obj5, "null cannot be cast to non-null type kotlin.Int");
        cVar.m38785i(((Integer) obj5).intValue());
        Object obj6 = map2.get("maxHeight");
        C9322n.m27779c(obj6, "null cannot be cast to non-null type kotlin.Int");
        cVar.m38783g(((Integer) obj6).intValue());
        Object obj7 = map2.get("ignoreSize");
        C9322n.m27779c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
        cVar.m38782f(((Boolean) obj7).booleanValue());
        c12073d.m38768g(cVar);
        Object obj8 = map.get("duration");
        C9322n.m27779c(obj8, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        Map map3 = (Map) obj8;
        C12073d.b bVar = new C12073d.b();
        C9322n.m27779c(map3.get("min"), "null cannot be cast to non-null type kotlin.Int");
        bVar.m38776f(((Integer) r3).intValue());
        C9322n.m27779c(map3.get("max"), "null cannot be cast to non-null type kotlin.Int");
        bVar.m38775e(((Integer) r3).intValue());
        Object obj9 = map3.get("allowNullable");
        C9322n.m27779c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
        bVar.m38774d(((Boolean) obj9).booleanValue());
        c12073d.m38766e(bVar);
        return c12073d;
    }

    /* renamed from: a */
    public final Map<String, Object> m39617a(C11627a entity) {
        HashMap m20423j;
        C9322n.m27781e(entity, "entity");
        m20423j = C7018k0.m20423j(C2033r.m10353a(FacebookMediationAdapter.KEY_ID, String.valueOf(entity.m36432e())), C2033r.m10353a("duration", Long.valueOf(entity.m36430c() / AdError.NETWORK_ERROR_CODE)), C2033r.m10353a("type", Integer.valueOf(entity.m36440m())), C2033r.m10353a("createDt", Long.valueOf(entity.m36428a())), C2033r.m10353a("width", Integer.valueOf(entity.m36442o())), C2033r.m10353a("height", Integer.valueOf(entity.m36431d())), C2033r.m10353a("orientation", Integer.valueOf(entity.m36437j())), C2033r.m10353a("modifiedDt", Long.valueOf(entity.m36436i())), C2033r.m10353a("lat", entity.m36433f()), C2033r.m10353a("lng", entity.m36434g()), C2033r.m10353a("title", entity.m36429b()), C2033r.m10353a("relativePath", entity.m36439l()));
        if (entity.m36435h() != null) {
            m20423j.put("mimeType", entity.m36435h());
        }
        return m20423j;
    }

    /* renamed from: b */
    public final Map<String, Object> m39618b(List<C11627a> list) {
        Map<String, Object> m20419f;
        C9322n.m27781e(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator<C11627a> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m39617a(it.next()));
        }
        m20419f = C7016j0.m20419f(C2033r.m10353a("data", arrayList));
        return m20419f;
    }

    /* renamed from: c */
    public final Map<String, Object> m39619c(List<C11628b> list) {
        Map<String, Object> m20419f;
        Map m20425l;
        C9322n.m27781e(list, "list");
        ArrayList arrayList = new ArrayList();
        for (C11628b c11628b : list) {
            if (c11628b.m36443a() != 0) {
                m20425l = C7018k0.m20425l(C2033r.m10353a(FacebookMediationAdapter.KEY_ID, c11628b.m36444b()), C2033r.m10353a("name", c11628b.m36446d()), C2033r.m10353a("assetCount", Integer.valueOf(c11628b.m36443a())), C2033r.m10353a("isAll", Boolean.valueOf(c11628b.m36447e())));
                if (c11628b.m36445c() != null) {
                    Long m36445c = c11628b.m36445c();
                    C9322n.m27778b(m36445c);
                    m20425l.put("modified", m36445c);
                }
                arrayList.add(m20425l);
            }
        }
        m20419f = C7016j0.m20419f(C2033r.m10353a("data", arrayList));
        return m20419f;
    }

    /* renamed from: d */
    public final C12072c m39620d(Map<?, ?> map) {
        C9322n.m27781e(map, "map");
        return new C12072c(Long.parseLong(String.valueOf(map.get("min"))), Long.parseLong(String.valueOf(map.get("max"))), Boolean.parseBoolean(String.valueOf(map.get("ignore"))));
    }

    /* renamed from: e */
    public final AbstractC12074e m39621e(Map<?, ?> map) {
        C9322n.m27781e(map, "map");
        Object obj = map.get("type");
        C9322n.m27779c(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        Object obj2 = map.get("child");
        C9322n.m27779c(obj2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        Map map2 = (Map) obj2;
        if (intValue == 0) {
            return new C12070a(map2);
        }
        if (intValue == 1) {
            return new C12071b(map2);
        }
        throw new IllegalStateException("Unknown type " + intValue + " for filter option.");
    }

    /* renamed from: g */
    public final List<C12075f> m39622g(List<?> orders) {
        ArrayList m20578f;
        C9322n.m27781e(orders, "orders");
        ArrayList arrayList = new ArrayList();
        if (orders.isEmpty()) {
            m20578f = C7031r.m20578f(new C12075f("_id", false));
            return m20578f;
        }
        for (Object obj : orders) {
            C9322n.m27779c(obj, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            Map map = (Map) obj;
            Object obj2 = map.get("type");
            C9322n.m27779c(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            Object obj3 = map.get("asc");
            C9322n.m27779c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            String str = intValue != 0 ? intValue != 1 ? null : "date_modified" : "date_added";
            if (str != null) {
                arrayList.add(new C12075f(str, booleanValue));
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public final C12073d m39623h(Map<?, ?> map, EnumC10799a type) {
        C9322n.m27781e(map, "map");
        C9322n.m27781e(type, "type");
        String lowerCase = type.name().toLowerCase(Locale.ROOT);
        C9322n.m27780d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (map.containsKey(lowerCase)) {
            Object obj = map.get(lowerCase);
            if (obj instanceof Map) {
                return m39616f((Map) obj);
            }
        }
        return new C12073d();
    }
}

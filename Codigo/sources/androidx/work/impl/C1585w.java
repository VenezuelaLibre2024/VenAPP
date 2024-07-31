package androidx.work.impl;

import dk.C7042z;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C9322n;
import p192k2.C9124m;
import p192k2.C9132u;
import p192k2.C9135x;

/* renamed from: androidx.work.impl.w */
/* loaded from: classes.dex */
public final class C1585w {

    /* renamed from: a */
    private final Object f6800a = new Object();

    /* renamed from: b */
    private final Map<C9124m, C1584v> f6801b = new LinkedHashMap();

    /* renamed from: a */
    public final boolean m8803a(C9124m id2) {
        boolean containsKey;
        C9322n.m27781e(id2, "id");
        synchronized (this.f6800a) {
            containsKey = this.f6801b.containsKey(id2);
        }
        return containsKey;
    }

    /* renamed from: b */
    public final C1584v m8804b(C9124m id2) {
        C1584v remove;
        C9322n.m27781e(id2, "id");
        synchronized (this.f6800a) {
            remove = this.f6801b.remove(id2);
        }
        return remove;
    }

    /* renamed from: c */
    public final List<C1584v> m8805c(String workSpecId) {
        List<C1584v> m20630f0;
        C9322n.m27781e(workSpecId, "workSpecId");
        synchronized (this.f6800a) {
            Map<C9124m, C1584v> map = this.f6801b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<C9124m, C1584v> entry : map.entrySet()) {
                if (C9322n.m27777a(entry.getKey().m26876b(), workSpecId)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                this.f6801b.remove((C9124m) it.next());
            }
            m20630f0 = C7042z.m20630f0(linkedHashMap.values());
        }
        return m20630f0;
    }

    /* renamed from: d */
    public final C1584v m8806d(C9124m id2) {
        C1584v c1584v;
        C9322n.m27781e(id2, "id");
        synchronized (this.f6800a) {
            Map<C9124m, C1584v> map = this.f6801b;
            C1584v c1584v2 = map.get(id2);
            if (c1584v2 == null) {
                c1584v2 = new C1584v(id2);
                map.put(id2, c1584v2);
            }
            c1584v = c1584v2;
        }
        return c1584v;
    }

    /* renamed from: e */
    public final C1584v m8807e(C9132u spec) {
        C9322n.m27781e(spec, "spec");
        return m8806d(C9135x.m26934a(spec));
    }
}

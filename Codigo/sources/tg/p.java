package tg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public final class p extends r {

    /* renamed from: b, reason: collision with root package name */
    private static final r[] f26934b = new r[0];

    /* renamed from: a, reason: collision with root package name */
    private final r[] f26935a;

    public p(Map<dg.e, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(dg.e.POSSIBLE_FORMATS);
        boolean z10 = (map == null || map.get(dg.e.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(dg.a.EAN_13) || collection.contains(dg.a.UPC_A) || collection.contains(dg.a.EAN_8) || collection.contains(dg.a.UPC_E)) {
                arrayList.add(new q(map));
            }
            if (collection.contains(dg.a.CODE_39)) {
                arrayList.add(new e(z10));
            }
            if (collection.contains(dg.a.CODE_93)) {
                arrayList.add(new g());
            }
            if (collection.contains(dg.a.CODE_128)) {
                arrayList.add(new c());
            }
            if (collection.contains(dg.a.ITF)) {
                arrayList.add(new n());
            }
            if (collection.contains(dg.a.CODABAR)) {
                arrayList.add(new a());
            }
            if (collection.contains(dg.a.RSS_14)) {
                arrayList.add(new ug.e());
            }
            if (collection.contains(dg.a.RSS_EXPANDED)) {
                arrayList.add(new vg.d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new q(map));
            arrayList.add(new e());
            arrayList.add(new a());
            arrayList.add(new g());
            arrayList.add(new c());
            arrayList.add(new n());
            arrayList.add(new ug.e());
            arrayList.add(new vg.d());
        }
        this.f26935a = (r[]) arrayList.toArray(f26934b);
    }

    @Override // tg.r
    public dg.q c(int i10, kg.a aVar, Map<dg.e, ?> map) {
        for (r rVar : this.f26935a) {
            try {
                return rVar.c(i10, aVar, map);
            } catch (dg.p unused) {
            }
        }
        throw dg.m.a();
    }

    @Override // tg.r, dg.o
    public void reset() {
        for (r rVar : this.f26935a) {
            rVar.reset();
        }
    }
}

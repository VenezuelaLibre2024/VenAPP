package dg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public final class k implements o {

    /* renamed from: c */
    private static final o[] f14136c = new o[0];

    /* renamed from: a */
    private Map<e, ?> f14137a;

    /* renamed from: b */
    private o[] f14138b;

    private q c(c cVar) {
        o[] oVarArr = this.f14138b;
        if (oVarArr != null) {
            for (o oVar : oVarArr) {
                try {
                    return oVar.b(cVar, this.f14137a);
                } catch (p unused) {
                }
            }
            Map<e, ?> map = this.f14137a;
            if (map != null && map.containsKey(e.ALSO_INVERTED)) {
                cVar.a().d();
                for (o oVar2 : this.f14138b) {
                    try {
                        return oVar2.b(cVar, this.f14137a);
                    } catch (p unused2) {
                    }
                }
            }
        }
        throw m.a();
    }

    @Override // dg.o
    public q a(c cVar) {
        e(null);
        return c(cVar);
    }

    @Override // dg.o
    public q b(c cVar, Map<e, ?> map) {
        e(map);
        return c(cVar);
    }

    public q d(c cVar) {
        if (this.f14138b == null) {
            e(null);
        }
        return c(cVar);
    }

    public void e(Map<e, ?> map) {
        this.f14137a = map;
        boolean z10 = true;
        boolean z11 = map != null && map.containsKey(e.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(e.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(a.UPC_A) && !collection.contains(a.UPC_E) && !collection.contains(a.EAN_13) && !collection.contains(a.EAN_8) && !collection.contains(a.CODABAR) && !collection.contains(a.CODE_39) && !collection.contains(a.CODE_93) && !collection.contains(a.CODE_128) && !collection.contains(a.ITF) && !collection.contains(a.RSS_14) && !collection.contains(a.RSS_EXPANDED)) {
                z10 = false;
            }
            if (z10 && !z11) {
                arrayList.add(new tg.p(map));
            }
            if (collection.contains(a.QR_CODE)) {
                arrayList.add(new ch.a());
            }
            if (collection.contains(a.DATA_MATRIX)) {
                arrayList.add(new ng.a());
            }
            if (collection.contains(a.AZTEC)) {
                arrayList.add(new eg.b());
            }
            if (collection.contains(a.PDF_417)) {
                arrayList.add(new xg.b());
            }
            if (collection.contains(a.MAXICODE)) {
                arrayList.add(new rg.a());
            }
            if (z10 && z11) {
                arrayList.add(new tg.p(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z11) {
                arrayList.add(new tg.p(map));
            }
            arrayList.add(new ch.a());
            arrayList.add(new ng.a());
            arrayList.add(new eg.b());
            arrayList.add(new xg.b());
            arrayList.add(new rg.a());
            if (z11) {
                arrayList.add(new tg.p(map));
            }
        }
        this.f14138b = (o[]) arrayList.toArray(f14136c);
    }

    @Override // dg.o
    public void reset() {
        o[] oVarArr = this.f14138b;
        if (oVarArr != null) {
            for (o oVar : oVarArr) {
                oVar.reset();
            }
        }
    }
}

package xg;

import com.google.android.gms.common.api.a;
import dg.e;
import dg.m;
import dg.o;
import dg.q;
import dg.r;
import dg.s;
import java.util.ArrayList;
import java.util.Map;
import yg.j;

/* loaded from: classes2.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    private static final q[] f31303a = new q[0];

    private static q[] c(dg.c cVar, Map<e, ?> map, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ah.b b10 = ah.a.b(cVar, map, z10);
        for (s[] sVarArr : b10.b()) {
            kg.e i10 = j.i(b10.a(), sVarArr[4], sVarArr[5], sVarArr[6], sVarArr[7], f(sVarArr), d(sVarArr));
            q qVar = new q(i10.i(), i10.e(), sVarArr, dg.a.PDF_417);
            qVar.h(r.ERROR_CORRECTION_LEVEL, i10.b());
            c cVar2 = (c) i10.d();
            if (cVar2 != null) {
                qVar.h(r.PDF417_EXTRA_METADATA, cVar2);
            }
            qVar.h(r.SYMBOLOGY_IDENTIFIER, "]L" + i10.h());
            arrayList.add(qVar);
        }
        return (q[]) arrayList.toArray(f31303a);
    }

    private static int d(s[] sVarArr) {
        return Math.max(Math.max(e(sVarArr[0], sVarArr[4]), (e(sVarArr[6], sVarArr[2]) * 17) / 18), Math.max(e(sVarArr[1], sVarArr[5]), (e(sVarArr[7], sVarArr[3]) * 17) / 18));
    }

    private static int e(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return 0;
        }
        return (int) Math.abs(sVar.c() - sVar2.c());
    }

    private static int f(s[] sVarArr) {
        return Math.min(Math.min(g(sVarArr[0], sVarArr[4]), (g(sVarArr[6], sVarArr[2]) * 17) / 18), Math.min(g(sVarArr[1], sVarArr[5]), (g(sVarArr[7], sVarArr[3]) * 17) / 18));
    }

    private static int g(s sVar, s sVar2) {
        return (sVar == null || sVar2 == null) ? a.e.API_PRIORITY_OTHER : (int) Math.abs(sVar.c() - sVar2.c());
    }

    @Override // dg.o
    public q a(dg.c cVar) {
        return b(cVar, null);
    }

    @Override // dg.o
    public q b(dg.c cVar, Map<e, ?> map) {
        q qVar;
        q[] c10 = c(cVar, map, false);
        if (c10.length == 0 || (qVar = c10[0]) == null) {
            throw m.a();
        }
        return qVar;
    }

    @Override // dg.o
    public void reset() {
    }
}

package tg;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public final class q extends r {

    /* renamed from: b, reason: collision with root package name */
    private static final y[] f26936b = new y[0];

    /* renamed from: a, reason: collision with root package name */
    private final y[] f26937a;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q(java.util.Map<dg.e, ?> r3) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto L7
            r3 = 0
            goto Lf
        L7:
            dg.e r0 = dg.e.POSSIBLE_FORMATS
            java.lang.Object r3 = r3.get(r0)
            java.util.Collection r3 = (java.util.Collection) r3
        Lf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L55
            dg.a r1 = dg.a.EAN_13
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L27
            tg.i r1 = new tg.i
            r1.<init>()
        L23:
            r0.add(r1)
            goto L35
        L27:
            dg.a r1 = dg.a.UPC_A
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L35
            tg.t r1 = new tg.t
            r1.<init>()
            goto L23
        L35:
            dg.a r1 = dg.a.EAN_8
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L45
            tg.k r1 = new tg.k
            r1.<init>()
            r0.add(r1)
        L45:
            dg.a r1 = dg.a.UPC_E
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L55
            tg.a0 r3 = new tg.a0
            r3.<init>()
            r0.add(r3)
        L55:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L73
            tg.i r3 = new tg.i
            r3.<init>()
            r0.add(r3)
            tg.k r3 = new tg.k
            r3.<init>()
            r0.add(r3)
            tg.a0 r3 = new tg.a0
            r3.<init>()
            r0.add(r3)
        L73:
            tg.y[] r3 = tg.q.f26936b
            java.lang.Object[] r3 = r0.toArray(r3)
            tg.y[] r3 = (tg.y[]) r3
            r2.f26937a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.q.<init>(java.util.Map):void");
    }

    @Override // tg.r
    public dg.q c(int i10, kg.a aVar, Map<dg.e, ?> map) {
        boolean z10;
        int[] p10 = y.p(aVar);
        for (y yVar : this.f26937a) {
            try {
                dg.q m10 = yVar.m(i10, aVar, p10, map);
                boolean z11 = m10.b() == dg.a.EAN_13 && m10.f().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(dg.e.POSSIBLE_FORMATS);
                if (collection != null && !collection.contains(dg.a.UPC_A)) {
                    z10 = false;
                    if (z11 || !z10) {
                        return m10;
                    }
                    dg.q qVar = new dg.q(m10.f().substring(1), m10.c(), m10.e(), dg.a.UPC_A);
                    qVar.g(m10.d());
                    return qVar;
                }
                z10 = true;
                if (z11) {
                }
                return m10;
            } catch (dg.p unused) {
            }
        }
        throw dg.m.a();
    }

    @Override // tg.r, dg.o
    public void reset() {
        for (y yVar : this.f26937a) {
            yVar.reset();
        }
    }
}

package eg;

import dg.o;
import dg.q;

/* loaded from: classes2.dex */
public final class b implements o {
    @Override // dg.o
    public q a(dg.c cVar) {
        return b(cVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e A[LOOP:0: B:24:0x005c->B:25:0x005e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // dg.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dg.q b(dg.c r11, java.util.Map<dg.e, ?> r12) {
        /*
            r10 = this;
            gg.a r0 = new gg.a
            kg.b r11 = r11.a()
            r0.<init>(r11)
            r11 = 0
            r1 = 0
            eg.a r2 = r0.a(r11)     // Catch: dg.h -> L25 dg.m -> L2b
            dg.s[] r3 = r2.b()     // Catch: dg.h -> L25 dg.m -> L2b
            fg.a r4 = new fg.a     // Catch: dg.h -> L21 dg.m -> L23
            r4.<init>()     // Catch: dg.h -> L21 dg.m -> L23
            kg.e r2 = r4.c(r2)     // Catch: dg.h -> L21 dg.m -> L23
            r4 = r3
            r3 = r1
            r1 = r2
            r2 = r3
            goto L2f
        L21:
            r2 = move-exception
            goto L27
        L23:
            r2 = move-exception
            goto L2d
        L25:
            r2 = move-exception
            r3 = r1
        L27:
            r4 = r3
            r3 = r2
            r2 = r1
            goto L2f
        L2b:
            r2 = move-exception
            r3 = r1
        L2d:
            r4 = r3
            r3 = r1
        L2f:
            if (r1 != 0) goto L4e
            r1 = 1
            eg.a r0 = r0.a(r1)     // Catch: dg.h -> L44 dg.m -> L46
            dg.s[] r4 = r0.b()     // Catch: dg.h -> L44 dg.m -> L46
            fg.a r1 = new fg.a     // Catch: dg.h -> L44 dg.m -> L46
            r1.<init>()     // Catch: dg.h -> L44 dg.m -> L46
            kg.e r1 = r1.c(r0)     // Catch: dg.h -> L44 dg.m -> L46
            goto L4e
        L44:
            r11 = move-exception
            goto L47
        L46:
            r11 = move-exception
        L47:
            if (r2 != 0) goto L4d
            if (r3 == 0) goto L4c
            throw r3
        L4c:
            throw r11
        L4d:
            throw r2
        L4e:
            r6 = r4
            if (r12 == 0) goto L66
            dg.e r0 = dg.e.NEED_RESULT_POINT_CALLBACK
            java.lang.Object r12 = r12.get(r0)
            dg.t r12 = (dg.t) r12
            if (r12 == 0) goto L66
            int r0 = r6.length
        L5c:
            if (r11 >= r0) goto L66
            r2 = r6[r11]
            r12.a(r2)
            int r11 = r11 + 1
            goto L5c
        L66:
            dg.q r11 = new dg.q
            java.lang.String r3 = r1.i()
            byte[] r4 = r1.e()
            int r5 = r1.c()
            dg.a r7 = dg.a.AZTEC
            long r8 = java.lang.System.currentTimeMillis()
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.util.List r12 = r1.a()
            if (r12 == 0) goto L89
            dg.r r0 = dg.r.BYTE_SEGMENTS
            r11.h(r0, r12)
        L89:
            java.lang.String r12 = r1.b()
            if (r12 == 0) goto L94
            dg.r r0 = dg.r.ERROR_CORRECTION_LEVEL
            r11.h(r0, r12)
        L94:
            dg.r r12 = dg.r.SYMBOLOGY_IDENTIFIER
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "]z"
            r0.append(r2)
            int r1 = r1.h()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11.h(r12, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.b.b(dg.c, java.util.Map):dg.q");
    }

    @Override // dg.o
    public void reset() {
    }
}

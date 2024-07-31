package eg;

import p066dg.C6942c;
import p066dg.C6956q;
import p066dg.InterfaceC6954o;

/* renamed from: eg.b */
/* loaded from: classes2.dex */
public final class C7187b implements InterfaceC6954o {
    @Override // p066dg.InterfaceC6954o
    /* renamed from: a */
    public C6956q mo10300a(C6942c c6942c) {
        return mo10301b(c6942c, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e A[LOOP:0: B:24:0x005c->B:25:0x005e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // p066dg.InterfaceC6954o
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p066dg.C6956q mo10301b(p066dg.C6942c r11, java.util.Map<p066dg.EnumC6944e, ?> r12) {
        /*
            r10 = this;
            gg.a r0 = new gg.a
            kg.b r11 = r11.m20084a()
            r0.<init>(r11)
            r11 = 0
            r1 = 0
            eg.a r2 = r0.m22991a(r11)     // Catch: p066dg.C6947h -> L25 p066dg.C6952m -> L2b
            dg.s[] r3 = r2.m27642b()     // Catch: p066dg.C6947h -> L25 p066dg.C6952m -> L2b
            fg.a r4 = new fg.a     // Catch: p066dg.C6947h -> L21 p066dg.C6952m -> L23
            r4.<init>()     // Catch: p066dg.C6947h -> L21 p066dg.C6952m -> L23
            kg.e r2 = r4.m22087c(r2)     // Catch: p066dg.C6947h -> L21 p066dg.C6952m -> L23
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
            eg.a r0 = r0.m22991a(r1)     // Catch: p066dg.C6947h -> L44 p066dg.C6952m -> L46
            dg.s[] r4 = r0.m27642b()     // Catch: p066dg.C6947h -> L44 p066dg.C6952m -> L46
            fg.a r1 = new fg.a     // Catch: p066dg.C6947h -> L44 p066dg.C6952m -> L46
            r1.<init>()     // Catch: p066dg.C6947h -> L44 p066dg.C6952m -> L46
            kg.e r1 = r1.m22087c(r0)     // Catch: p066dg.C6947h -> L44 p066dg.C6952m -> L46
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
            dg.e r0 = p066dg.EnumC6944e.NEED_RESULT_POINT_CALLBACK
            java.lang.Object r12 = r12.get(r0)
            dg.t r12 = (p066dg.InterfaceC6959t) r12
            if (r12 == 0) goto L66
            int r0 = r6.length
        L5c:
            if (r11 >= r0) goto L66
            r2 = r6[r11]
            r12.mo20121a(r2)
            int r11 = r11 + 1
            goto L5c
        L66:
            dg.q r11 = new dg.q
            java.lang.String r3 = r1.m27633i()
            byte[] r4 = r1.m27629e()
            int r5 = r1.m27627c()
            dg.a r7 = p066dg.EnumC6940a.AZTEC
            long r8 = java.lang.System.currentTimeMillis()
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.util.List r12 = r1.m27625a()
            if (r12 == 0) goto L89
            dg.r r0 = p066dg.EnumC6957r.BYTE_SEGMENTS
            r11.m20115h(r0, r12)
        L89:
            java.lang.String r12 = r1.m27626b()
            if (r12 == 0) goto L94
            dg.r r0 = p066dg.EnumC6957r.ERROR_CORRECTION_LEVEL
            r11.m20115h(r0, r12)
        L94:
            dg.r r12 = p066dg.EnumC6957r.SYMBOLOGY_IDENTIFIER
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "]z"
            r0.append(r2)
            int r1 = r1.m27632h()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11.m20115h(r12, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.C7187b.mo10301b(dg.c, java.util.Map):dg.q");
    }

    @Override // p066dg.InterfaceC6954o
    public void reset() {
    }
}

package xk;

/* loaded from: classes3.dex */
public class i extends h {

    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.o implements ok.l<String, String> {

        /* renamed from: a */
        public static final a f31416a = new a();

        a() {
            super(1);
        }

        @Override // ok.l
        /* renamed from: a */
        public final String invoke(String line) {
            kotlin.jvm.internal.n.e(line, "line");
            return line;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.o implements ok.l<String, String> {

        /* renamed from: a */
        final /* synthetic */ String f31417a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f31417a = str;
        }

        @Override // ok.l
        /* renamed from: a */
        public final String invoke(String line) {
            kotlin.jvm.internal.n.e(line, "line");
            return this.f31417a + line;
        }
    }

    private static final ok.l<String, String> b(String str) {
        return str.length() == 0 ? a.f31416a : new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!xk.b.c(str.charAt(i10))) {
                break;
            }
            i10++;
        }
        return i10 == -1 ? str.length() : i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String d(java.lang.String r14, java.lang.String r15) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.n.e(r14, r0)
            java.lang.String r0 = "newIndent"
            kotlin.jvm.internal.n.e(r15, r0)
            java.util.List r0 = xk.q.c0(r14)
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L33
            java.lang.Object r3 = r1.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = xk.g.t(r4)
            r4 = r4 ^ 1
            if (r4 == 0) goto L1a
            r2.add(r3)
            goto L1a
        L33:
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = dk.p.r(r2, r3)
            r1.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L42:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5a
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = c(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.add(r3)
            goto L42
        L5a:
            java.lang.Comparable r1 = dk.p.P(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 0
            if (r1 == 0) goto L68
            int r1 = r1.intValue()
            goto L69
        L68:
            r1 = r2
        L69:
            int r14 = r14.length()
            int r3 = r15.length()
            int r4 = r0.size()
            int r3 = r3 * r4
            int r14 = r14 + r3
            ok.l r15 = b(r15)
            int r3 = dk.p.k(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L8a:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Lc0
            java.lang.Object r5 = r0.next()
            int r6 = r2 + 1
            if (r2 >= 0) goto L9b
            dk.p.q()
        L9b:
            java.lang.String r5 = (java.lang.String) r5
            if (r2 == 0) goto La1
            if (r2 != r3) goto La9
        La1:
            boolean r2 = xk.g.t(r5)
            if (r2 == 0) goto La9
            r5 = 0
            goto Lb9
        La9:
            java.lang.String r2 = xk.s.L0(r5, r1)
            if (r2 == 0) goto Lb9
            java.lang.Object r2 = r15.invoke(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto Lb8
            goto Lb9
        Lb8:
            r5 = r2
        Lb9:
            if (r5 == 0) goto Lbe
            r4.add(r5)
        Lbe:
            r2 = r6
            goto L8a
        Lc0:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r14)
            java.lang.String r6 = "\n"
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 124(0x7c, float:1.74E-43)
            r13 = 0
            java.lang.Appendable r14 = dk.p.K(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.StringBuilder r14 = (java.lang.StringBuilder) r14
            java.lang.String r14 = r14.toString()
            java.lang.String r15 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            kotlin.jvm.internal.n.d(r14, r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: xk.i.d(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String e(java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xk.i.e(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String f(String str) {
        kotlin.jvm.internal.n.e(str, "<this>");
        return d(str, "");
    }

    public static final String g(String str, String marginPrefix) {
        kotlin.jvm.internal.n.e(str, "<this>");
        kotlin.jvm.internal.n.e(marginPrefix, "marginPrefix");
        return e(str, "", marginPrefix);
    }

    public static /* synthetic */ String h(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return g(str, str2);
    }
}

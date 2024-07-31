package p044cj;

/* renamed from: cj.c */
/* loaded from: classes3.dex */
public final class C2014c {

    /* renamed from: a */
    private static final C2012a f8065a;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1 = 0
            java.lang.String r2 = "io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> Lb
            r3 = r1
            goto Le
        Lb:
            r2 = move-exception
            r3 = r2
            r2 = r1
        Le:
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L31
            java.lang.Class<cj.a> r6 = p044cj.C2012a.class
            java.lang.Class r2 = r2.asSubclass(r6)     // Catch: java.lang.Throwable -> L2f
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L2f
            java.lang.Class<cj.d> r7 = p044cj.C2015d.class
            r6[r4] = r7     // Catch: java.lang.Throwable -> L2f
            java.lang.reflect.Constructor r2 = r2.getConstructor(r6)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L2f
            cj.d r7 = p044cj.C2012a.f8062a     // Catch: java.lang.Throwable -> L2f
            r6[r4] = r7     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r2 = r2.newInstance(r6)     // Catch: java.lang.Throwable -> L2f
            cj.a r2 = (p044cj.C2012a) r2     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r2 = move-exception
            r3 = r2
        L31:
            r2 = r1
        L32:
            if (r2 == 0) goto L35
            goto L3c
        L35:
            cj.a r2 = new cj.a
            cj.d r6 = p044cj.C2012a.f8062a
            r2.<init>(r6)
        L3c:
            p044cj.C2014c.f8065a = r2
            if (r3 == 0) goto L95
            java.lang.String r2 = "io.perfmark.PerfMark.debug"
            boolean r2 = java.lang.Boolean.getBoolean(r2)     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L95
            java.lang.String r2 = "java.util.logging.Logger"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L95
            java.lang.String r6 = "getLogger"
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L95
            r7[r4] = r0     // Catch: java.lang.Throwable -> L95
            java.lang.reflect.Method r6 = r2.getMethod(r6, r7)     // Catch: java.lang.Throwable -> L95
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L95
            java.lang.Class<cj.c> r8 = p044cj.C2014c.class
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> L95
            r7[r4] = r8     // Catch: java.lang.Throwable -> L95
            java.lang.Object r6 = r6.invoke(r1, r7)     // Catch: java.lang.Throwable -> L95
            java.lang.String r7 = "java.util.logging.Level"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Throwable -> L95
            java.lang.String r8 = "FINE"
            java.lang.reflect.Field r8 = r7.getField(r8)     // Catch: java.lang.Throwable -> L95
            java.lang.Object r1 = r8.get(r1)     // Catch: java.lang.Throwable -> L95
            java.lang.String r8 = "log"
            r9 = 3
            java.lang.Class[] r10 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> L95
            r10[r4] = r7     // Catch: java.lang.Throwable -> L95
            r10[r5] = r0     // Catch: java.lang.Throwable -> L95
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            r7 = 2
            r10[r7] = r0     // Catch: java.lang.Throwable -> L95
            java.lang.reflect.Method r0 = r2.getMethod(r8, r10)     // Catch: java.lang.Throwable -> L95
            java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L95
            r2[r4] = r1     // Catch: java.lang.Throwable -> L95
            java.lang.String r1 = "Error during PerfMark.<clinit>"
            r2[r5] = r1     // Catch: java.lang.Throwable -> L95
            r2[r7] = r3     // Catch: java.lang.Throwable -> L95
            r0.invoke(r6, r2)     // Catch: java.lang.Throwable -> L95
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p044cj.C2014c.<clinit>():void");
    }

    private C2014c() {
    }

    /* renamed from: a */
    public static C2015d m10317a(String str) {
        return f8065a.m10309a(str, Long.MIN_VALUE);
    }

    /* renamed from: b */
    public static C2015d m10318b(String str, long j10) {
        return f8065a.m10309a(str, j10);
    }

    /* renamed from: c */
    public static void m10319c(String str, C2015d c2015d) {
        f8065a.m10310b(str, c2015d);
    }

    /* renamed from: d */
    public static void m10320d(C2013b c2013b) {
        f8065a.m10311c(c2013b);
    }

    /* renamed from: e */
    public static C2013b m10321e() {
        return f8065a.m10312d();
    }

    /* renamed from: f */
    public static void m10322f(String str) {
        f8065a.m10313e(str);
    }

    /* renamed from: g */
    public static void m10323g(String str, C2015d c2015d) {
        f8065a.m10314f(str, c2015d);
    }

    /* renamed from: h */
    public static void m10324h(String str) {
        f8065a.m10315g(str);
    }

    /* renamed from: i */
    public static void m10325i(String str, C2015d c2015d) {
        f8065a.m10316h(str, c2015d);
    }
}

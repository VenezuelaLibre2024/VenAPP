package v7;

/* loaded from: classes.dex */
public final class c implements k0 {

    /* renamed from: a, reason: collision with root package name */
    private final y6.p f28263a;

    /* renamed from: b, reason: collision with root package name */
    private y6.k f28264b;

    /* renamed from: c, reason: collision with root package name */
    private y6.l f28265c;

    public c(y6.p pVar) {
        this.f28263a = pVar;
    }

    @Override // v7.k0
    public void a(long j10, long j11) {
        ((y6.k) t8.a.e(this.f28264b)).a(j10, j11);
    }

    @Override // v7.k0
    public void b() {
        y6.k kVar = this.f28264b;
        if (kVar instanceof f7.f) {
            ((f7.f) kVar).j();
        }
    }

    @Override // v7.k0
    public int c(y6.y yVar) {
        return ((y6.k) t8.a.e(this.f28264b)).f((y6.l) t8.a.e(this.f28265c), yVar);
    }

    @Override // v7.k0
    public long d() {
        y6.l lVar = this.f28265c;
        if (lVar != null) {
            return lVar.getPosition();
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        if (r6.getPosition() != r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0061, code lost:
    
        if (r6.getPosition() != r11) goto L33;
     */
    @Override // v7.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(s8.h r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, y6.m r15) {
        /*
            r7 = this;
            y6.e r6 = new y6.e
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f28265c = r6
            y6.k r8 = r7.f28264b
            if (r8 == 0) goto L10
            return
        L10:
            y6.p r8 = r7.f28263a
            y6.k[] r8 = r8.b(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.f28264b = r8
            goto L74
        L20:
            int r10 = r8.length
            r0 = r13
        L22:
            if (r0 >= r10) goto L70
            r1 = r8[r0]
            boolean r2 = r1.e(r6)     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            if (r2 == 0) goto L35
            r7.f28264b = r1     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            t8.a.g(r14)
            r6.f()
            goto L70
        L35:
            y6.k r1 = r7.f28264b
            if (r1 != 0) goto L66
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L64
            goto L66
        L42:
            r8 = move-exception
            y6.k r9 = r7.f28264b
            if (r9 != 0) goto L4f
            long r9 = r6.getPosition()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L50
        L4f:
            r13 = r14
        L50:
            t8.a.g(r13)
            r6.f()
            throw r8
        L57:
            y6.k r1 = r7.f28264b
            if (r1 != 0) goto L66
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L64
            goto L66
        L64:
            r1 = r13
            goto L67
        L66:
            r1 = r14
        L67:
            t8.a.g(r1)
            r6.f()
            int r0 = r0 + 1
            goto L22
        L70:
            y6.k r10 = r7.f28264b
            if (r10 == 0) goto L7a
        L74:
            y6.k r8 = r7.f28264b
            r8.b(r15)
            return
        L7a:
            v7.g1 r10 = new v7.g1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            java.lang.String r8 = t8.r0.M(r8)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.Object r9 = t8.a.e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.c.e(s8.h, android.net.Uri, java.util.Map, long, long, y6.m):void");
    }

    @Override // v7.k0
    public void release() {
        y6.k kVar = this.f28264b;
        if (kVar != null) {
            kVar.release();
            this.f28264b = null;
        }
        this.f28265c = null;
    }
}

package zk;

/* loaded from: classes3.dex */
public class z1 extends d2 implements y {

    /* renamed from: c */
    private final boolean f32952c;

    public z1(w1 w1Var) {
        super(true);
        b0(w1Var);
        this.f32952c = N0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        r0 = r0.X();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if ((r0 instanceof zk.t) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r0 = (zk.t) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r0 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        r0 = r0.w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r0 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x001d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r0 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.T() == false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean N0() {
        /*
            r4 = this;
            zk.s r0 = r4.X()
            boolean r1 = r0 instanceof zk.t
            r2 = 0
            if (r1 == 0) goto Lc
            zk.t r0 = (zk.t) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            r1 = 0
            if (r0 == 0) goto L33
            zk.d2 r0 = r0.w()
            if (r0 != 0) goto L17
            goto L33
        L17:
            boolean r3 = r0.T()
            if (r3 == 0) goto L1f
            r0 = 1
            return r0
        L1f:
            zk.s r0 = r0.X()
            boolean r3 = r0 instanceof zk.t
            if (r3 == 0) goto L2a
            zk.t r0 = (zk.t) r0
            goto L2b
        L2a:
            r0 = r2
        L2b:
            if (r0 == 0) goto L33
            zk.d2 r0 = r0.w()
            if (r0 != 0) goto L17
        L33:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zk.z1.N0():boolean");
    }

    @Override // zk.d2
    public boolean T() {
        return this.f32952c;
    }

    @Override // zk.d2
    public boolean V() {
        return true;
    }
}

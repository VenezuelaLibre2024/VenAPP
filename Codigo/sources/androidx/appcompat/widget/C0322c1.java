package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.c1 */
/* loaded from: classes.dex */
class C0322c1 {

    /* renamed from: a */
    private int f1683a = 0;

    /* renamed from: b */
    private int f1684b = 0;

    /* renamed from: c */
    private int f1685c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f1686d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f1687e = 0;

    /* renamed from: f */
    private int f1688f = 0;

    /* renamed from: g */
    private boolean f1689g = false;

    /* renamed from: h */
    private boolean f1690h = false;

    /* renamed from: a */
    public int m1676a() {
        return this.f1689g ? this.f1683a : this.f1684b;
    }

    /* renamed from: b */
    public int m1677b() {
        return this.f1683a;
    }

    /* renamed from: c */
    public int m1678c() {
        return this.f1684b;
    }

    /* renamed from: d */
    public int m1679d() {
        return this.f1689g ? this.f1684b : this.f1683a;
    }

    /* renamed from: e */
    public void m1680e(int i10, int i11) {
        this.f1690h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f1687e = i10;
            this.f1683a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1688f = i11;
            this.f1684b = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        if (r2 != Integer.MIN_VALUE) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
    
        if (r2 != Integer.MIN_VALUE) goto L25;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1681f(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f1689g
            if (r2 != r0) goto L5
            return
        L5:
            r1.f1689g = r2
            boolean r0 = r1.f1690h
            if (r0 == 0) goto L2b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L1d
            int r2 = r1.f1686d
            if (r2 == r0) goto L14
            goto L16
        L14:
            int r2 = r1.f1687e
        L16:
            r1.f1683a = r2
            int r2 = r1.f1685c
            if (r2 == r0) goto L2f
            goto L31
        L1d:
            int r2 = r1.f1685c
            if (r2 == r0) goto L22
            goto L24
        L22:
            int r2 = r1.f1687e
        L24:
            r1.f1683a = r2
            int r2 = r1.f1686d
            if (r2 == r0) goto L2f
            goto L31
        L2b:
            int r2 = r1.f1687e
            r1.f1683a = r2
        L2f:
            int r2 = r1.f1688f
        L31:
            r1.f1684b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0322c1.m1681f(boolean):void");
    }

    /* renamed from: g */
    public void m1682g(int i10, int i11) {
        this.f1685c = i10;
        this.f1686d = i11;
        this.f1690h = true;
        if (this.f1689g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1683a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1684b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1683a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1684b = i11;
        }
    }
}

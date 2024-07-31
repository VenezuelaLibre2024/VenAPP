package androidx.appcompat.widget;

/* loaded from: classes.dex */
class c1 {

    /* renamed from: a, reason: collision with root package name */
    private int f1418a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f1419b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f1420c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private int f1421d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f1422e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f1423f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1424g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1425h = false;

    public int a() {
        return this.f1424g ? this.f1418a : this.f1419b;
    }

    public int b() {
        return this.f1418a;
    }

    public int c() {
        return this.f1419b;
    }

    public int d() {
        return this.f1424g ? this.f1419b : this.f1418a;
    }

    public void e(int i10, int i11) {
        this.f1425h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f1422e = i10;
            this.f1418a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1423f = i11;
            this.f1419b = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        if (r2 != Integer.MIN_VALUE) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
    
        if (r2 != Integer.MIN_VALUE) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f1424g
            if (r2 != r0) goto L5
            return
        L5:
            r1.f1424g = r2
            boolean r0 = r1.f1425h
            if (r0 == 0) goto L2b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L1d
            int r2 = r1.f1421d
            if (r2 == r0) goto L14
            goto L16
        L14:
            int r2 = r1.f1422e
        L16:
            r1.f1418a = r2
            int r2 = r1.f1420c
            if (r2 == r0) goto L2f
            goto L31
        L1d:
            int r2 = r1.f1420c
            if (r2 == r0) goto L22
            goto L24
        L22:
            int r2 = r1.f1422e
        L24:
            r1.f1418a = r2
            int r2 = r1.f1421d
            if (r2 == r0) goto L2f
            goto L31
        L2b:
            int r2 = r1.f1422e
            r1.f1418a = r2
        L2f:
            int r2 = r1.f1423f
        L31:
            r1.f1419b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c1.f(boolean):void");
    }

    public void g(int i10, int i11) {
        this.f1420c = i10;
        this.f1421d = i11;
        this.f1425h = true;
        if (this.f1424g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1418a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1419b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1418a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1419b = i11;
        }
    }
}

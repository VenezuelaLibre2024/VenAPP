package p468yg;

import kg.C9264b;
import p066dg.C6952m;
import p066dg.C6958s;

/* renamed from: yg.c */
/* loaded from: classes2.dex */
final class C12687c {

    /* renamed from: a */
    private final C9264b f34383a;

    /* renamed from: b */
    private final C6958s f34384b;

    /* renamed from: c */
    private final C6958s f34385c;

    /* renamed from: d */
    private final C6958s f34386d;

    /* renamed from: e */
    private final C6958s f34387e;

    /* renamed from: f */
    private final int f34388f;

    /* renamed from: g */
    private final int f34389g;

    /* renamed from: h */
    private final int f34390h;

    /* renamed from: i */
    private final int f34391i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12687c(C9264b c9264b, C6958s c6958s, C6958s c6958s2, C6958s c6958s3, C6958s c6958s4) {
        boolean z10 = c6958s == null || c6958s2 == null;
        boolean z11 = c6958s3 == null || c6958s4 == null;
        if (z10 && z11) {
            throw C6952m.m20106a();
        }
        if (z10) {
            c6958s = new C6958s(0.0f, c6958s3.m20120d());
            c6958s2 = new C6958s(0.0f, c6958s4.m20120d());
        } else if (z11) {
            c6958s3 = new C6958s(c9264b.m27609m() - 1, c6958s.m20120d());
            c6958s4 = new C6958s(c9264b.m27609m() - 1, c6958s2.m20120d());
        }
        this.f34383a = c9264b;
        this.f34384b = c6958s;
        this.f34385c = c6958s2;
        this.f34386d = c6958s3;
        this.f34387e = c6958s4;
        this.f34388f = (int) Math.min(c6958s.m20119c(), c6958s2.m20119c());
        this.f34389g = (int) Math.max(c6958s3.m20119c(), c6958s4.m20119c());
        this.f34390h = (int) Math.min(c6958s.m20120d(), c6958s3.m20120d());
        this.f34391i = (int) Math.max(c6958s2.m20120d(), c6958s4.m20120d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12687c(C12687c c12687c) {
        this.f34383a = c12687c.f34383a;
        this.f34384b = c12687c.f34384b;
        this.f34385c = c12687c.f34385c;
        this.f34386d = c12687c.f34386d;
        this.f34387e = c12687c.f34387e;
        this.f34388f = c12687c.f34388f;
        this.f34389g = c12687c.f34389g;
        this.f34390h = c12687c.f34390h;
        this.f34391i = c12687c.f34391i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static C12687c m41750j(C12687c c12687c, C12687c c12687c2) {
        return c12687c == null ? c12687c2 : c12687c2 == null ? c12687c : new C12687c(c12687c.f34383a, c12687c.f34384b, c12687c.f34385c, c12687c2.f34386d, c12687c2.f34387e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p468yg.C12687c m41751a(int r13, int r14, boolean r15) {
        /*
            r12 = this;
            dg.s r0 = r12.f34384b
            dg.s r1 = r12.f34385c
            dg.s r2 = r12.f34386d
            dg.s r3 = r12.f34387e
            if (r13 <= 0) goto L29
            if (r15 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r2
        Lf:
            float r5 = r4.m20120d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L18
            r5 = 0
        L18:
            dg.s r13 = new dg.s
            float r4 = r4.m20119c()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L26
            r8 = r13
            goto L2a
        L26:
            r10 = r13
            r8 = r0
            goto L2b
        L29:
            r8 = r0
        L2a:
            r10 = r2
        L2b:
            if (r14 <= 0) goto L5b
            if (r15 == 0) goto L32
            dg.s r13 = r12.f34385c
            goto L34
        L32:
            dg.s r13 = r12.f34387e
        L34:
            float r0 = r13.m20120d()
            int r0 = (int) r0
            int r0 = r0 + r14
            kg.b r14 = r12.f34383a
            int r14 = r14.m27606j()
            if (r0 < r14) goto L4a
            kg.b r14 = r12.f34383a
            int r14 = r14.m27606j()
            int r0 = r14 + (-1)
        L4a:
            dg.s r14 = new dg.s
            float r13 = r13.m20119c()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L58
            r9 = r14
            goto L5c
        L58:
            r11 = r14
            r9 = r1
            goto L5d
        L5b:
            r9 = r1
        L5c:
            r11 = r3
        L5d:
            yg.c r13 = new yg.c
            kg.b r7 = r12.f34383a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p468yg.C12687c.m41751a(int, int, boolean):yg.c");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C6958s m41752b() {
        return this.f34385c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C6958s m41753c() {
        return this.f34387e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m41754d() {
        return this.f34389g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m41755e() {
        return this.f34391i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m41756f() {
        return this.f34388f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m41757g() {
        return this.f34390h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C6958s m41758h() {
        return this.f34384b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C6958s m41759i() {
        return this.f34386d;
    }
}

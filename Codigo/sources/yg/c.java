package yg;

import dg.m;
import dg.s;

/* loaded from: classes2.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final kg.b f31847a;

    /* renamed from: b, reason: collision with root package name */
    private final s f31848b;

    /* renamed from: c, reason: collision with root package name */
    private final s f31849c;

    /* renamed from: d, reason: collision with root package name */
    private final s f31850d;

    /* renamed from: e, reason: collision with root package name */
    private final s f31851e;

    /* renamed from: f, reason: collision with root package name */
    private final int f31852f;

    /* renamed from: g, reason: collision with root package name */
    private final int f31853g;

    /* renamed from: h, reason: collision with root package name */
    private final int f31854h;

    /* renamed from: i, reason: collision with root package name */
    private final int f31855i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(kg.b bVar, s sVar, s sVar2, s sVar3, s sVar4) {
        boolean z10 = sVar == null || sVar2 == null;
        boolean z11 = sVar3 == null || sVar4 == null;
        if (z10 && z11) {
            throw m.a();
        }
        if (z10) {
            sVar = new s(0.0f, sVar3.d());
            sVar2 = new s(0.0f, sVar4.d());
        } else if (z11) {
            sVar3 = new s(bVar.m() - 1, sVar.d());
            sVar4 = new s(bVar.m() - 1, sVar2.d());
        }
        this.f31847a = bVar;
        this.f31848b = sVar;
        this.f31849c = sVar2;
        this.f31850d = sVar3;
        this.f31851e = sVar4;
        this.f31852f = (int) Math.min(sVar.c(), sVar2.c());
        this.f31853g = (int) Math.max(sVar3.c(), sVar4.c());
        this.f31854h = (int) Math.min(sVar.d(), sVar3.d());
        this.f31855i = (int) Math.max(sVar2.d(), sVar4.d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(c cVar) {
        this.f31847a = cVar.f31847a;
        this.f31848b = cVar.f31848b;
        this.f31849c = cVar.f31849c;
        this.f31850d = cVar.f31850d;
        this.f31851e = cVar.f31851e;
        this.f31852f = cVar.f31852f;
        this.f31853g = cVar.f31853g;
        this.f31854h = cVar.f31854h;
        this.f31855i = cVar.f31855i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c j(c cVar, c cVar2) {
        return cVar == null ? cVar2 : cVar2 == null ? cVar : new c(cVar.f31847a, cVar.f31848b, cVar.f31849c, cVar2.f31850d, cVar2.f31851e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public yg.c a(int r13, int r14, boolean r15) {
        /*
            r12 = this;
            dg.s r0 = r12.f31848b
            dg.s r1 = r12.f31849c
            dg.s r2 = r12.f31850d
            dg.s r3 = r12.f31851e
            if (r13 <= 0) goto L29
            if (r15 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r2
        Lf:
            float r5 = r4.d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L18
            r5 = 0
        L18:
            dg.s r13 = new dg.s
            float r4 = r4.c()
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
            dg.s r13 = r12.f31849c
            goto L34
        L32:
            dg.s r13 = r12.f31851e
        L34:
            float r0 = r13.d()
            int r0 = (int) r0
            int r0 = r0 + r14
            kg.b r14 = r12.f31847a
            int r14 = r14.j()
            if (r0 < r14) goto L4a
            kg.b r14 = r12.f31847a
            int r14 = r14.j()
            int r0 = r14 + (-1)
        L4a:
            dg.s r14 = new dg.s
            float r13 = r13.c()
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
            kg.b r7 = r12.f31847a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.c.a(int, int, boolean):yg.c");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s b() {
        return this.f31849c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s c() {
        return this.f31851e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f31853g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f31855i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f31852f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f31854h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s h() {
        return this.f31848b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s i() {
        return this.f31850d;
    }
}

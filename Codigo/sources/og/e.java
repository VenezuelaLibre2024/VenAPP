package og;

import dg.h;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: h, reason: collision with root package name */
    private static final e[] f22553h = a();

    /* renamed from: a, reason: collision with root package name */
    private final int f22554a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22555b;

    /* renamed from: c, reason: collision with root package name */
    private final int f22556c;

    /* renamed from: d, reason: collision with root package name */
    private final int f22557d;

    /* renamed from: e, reason: collision with root package name */
    private final int f22558e;

    /* renamed from: f, reason: collision with root package name */
    private final c f22559f;

    /* renamed from: g, reason: collision with root package name */
    private final int f22560g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f22561a;

        /* renamed from: b, reason: collision with root package name */
        private final int f22562b;

        private b(int i10, int i11) {
            this.f22561a = i10;
            this.f22562b = i11;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int a() {
            return this.f22561a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int b() {
            return this.f22562b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final int f22563a;

        /* renamed from: b, reason: collision with root package name */
        private final b[] f22564b;

        private c(int i10, b bVar) {
            this.f22563a = i10;
            this.f22564b = new b[]{bVar};
        }

        private c(int i10, b bVar, b bVar2) {
            this.f22563a = i10;
            this.f22564b = new b[]{bVar, bVar2};
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b[] a() {
            return this.f22564b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int b() {
            return this.f22563a;
        }
    }

    private e(int i10, int i11, int i12, int i13, int i14, c cVar) {
        this.f22554a = i10;
        this.f22555b = i11;
        this.f22556c = i12;
        this.f22557d = i13;
        this.f22558e = i14;
        this.f22559f = cVar;
        int b10 = cVar.b();
        int i15 = 0;
        for (b bVar : cVar.a()) {
            i15 += bVar.a() * (bVar.b() + b10);
        }
        this.f22560g = i15;
    }

    private static e[] a() {
        int i10 = 48;
        int i11 = 8;
        int i12 = 1;
        int i13 = 5;
        int i14 = 7;
        int i15 = 12;
        int i16 = 18;
        int i17 = 36;
        int i18 = 62;
        int i19 = 42;
        int i20 = 56;
        b bVar = new b(i12, 10);
        b bVar2 = new b(i12, 16);
        int i21 = 32;
        int i22 = 38;
        return new e[]{new e(1, 10, 10, 8, 8, new c(i13, new b(i12, 3))), new e(2, 12, 12, 10, 10, new c(i14, new b(i12, i13))), new e(3, 14, 14, 12, 12, new c(10, new b(i12, i11))), new e(4, 16, 16, 14, 14, new c(i15, new b(i12, i15))), new e(5, 18, 18, 16, 16, new c(14, new b(i12, i16))), new e(6, 20, 20, 18, 18, new c(i16, new b(i12, 22))), new e(7, 22, 22, 20, 20, new c(20, new b(i12, 30))), new e(8, 24, 24, 22, 22, new c(24, new b(i12, i17))), new e(9, 26, 26, 24, 24, new c(28, new b(i12, 44))), new e(10, 32, 32, 14, 14, new c(i17, new b(i12, i18))), new e(11, 36, 36, 16, 16, new c(i19, new b(i12, 86))), new e(12, 40, 40, 18, 18, new c(i10, new b(i12, 114))), new e(13, 44, 44, 20, 20, new c(i20, new b(i12, 144))), new e(14, 48, 48, 22, 22, new c(68, new b(i12, 174))), new e(15, 52, 52, 24, 24, new c(i19, new b(2, 102))), new e(16, 64, 64, 14, 14, new c(i20, new b(2, 140))), new e(17, 72, 72, 16, 16, new c(i17, new b(4, 92))), new e(18, 80, 80, 18, 18, new c(i10, new b(4, 114))), new e(19, 88, 88, 20, 20, new c(i20, new b(4, 144))), new e(20, 96, 96, 22, 22, new c(68, new b(4, 174))), new e(21, 104, 104, 24, 24, new c(i20, new b(6, 136))), new e(22, 120, 120, 18, 18, new c(68, new b(6, 175))), new e(23, 132, 132, 20, 20, new c(i18, new b(i11, 163))), new e(24, 144, 144, 22, 22, new c(i18, new b(i11, 156), new b(2, 155))), new e(25, 8, 18, 6, 16, new c(i14, new b(i12, 5))), new e(26, 8, 32, 6, 14, new c(11, bVar)), new e(27, 12, 26, 10, 24, new c(14, bVar2)), new e(28, 12, 36, 10, 16, new c(i16, new b(i12, 22))), new e(29, 16, 36, 14, 16, new c(24, new b(i12, i21))), new e(30, 16, 48, 14, 22, new c(28, new b(i12, 49))), new e(31, 8, 48, 6, 22, new c(15, new b(i12, i16))), new e(32, 8, 64, 6, 14, new c(i16, new b(i12, 24))), new e(33, 8, 80, 6, 18, new c(22, new b(i12, i21))), new e(34, 8, 96, 6, 22, new c(28, new b(i12, i22))), new e(35, 8, 120, 6, 18, new c(i21, new b(i12, 49))), new e(36, 8, 144, 6, 22, new c(i17, new b(i12, 63))), new e(37, 12, 64, 10, 14, new c(27, new b(i12, 43))), new e(38, 12, 88, 10, 20, new c(i17, new b(i12, 64))), new e(39, 16, 64, 14, 14, new c(i17, new b(i12, i18))), new e(40, 20, 36, 18, 16, new c(28, new b(i12, 44))), new e(41, 20, 44, 18, 20, new c(34, new b(i12, i20))), new e(42, 20, 64, 18, 14, new c(i19, new b(i12, 84))), new e(43, 22, 48, 20, 22, new c(i22, new b(i12, 72))), new e(44, 24, 48, 22, 22, new c(41, new b(i12, 80))), new e(45, 24, 64, 22, 14, new c(46, new b(i12, 108))), new e(46, 26, 40, 24, 18, new c(i22, new b(i12, 70))), new e(47, 26, 48, 24, 22, new c(i19, new b(i12, 90))), new e(48, 26, 64, 24, 14, new c(50, new b(i12, 118)))};
    }

    public static e h(int i10, int i11) {
        if ((i10 & 1) != 0 || (i11 & 1) != 0) {
            throw h.a();
        }
        for (e eVar : f22553h) {
            if (eVar.f22555b == i10 && eVar.f22556c == i11) {
                return eVar;
            }
        }
        throw h.a();
    }

    public int b() {
        return this.f22558e;
    }

    public int c() {
        return this.f22557d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c d() {
        return this.f22559f;
    }

    public int e() {
        return this.f22556c;
    }

    public int f() {
        return this.f22555b;
    }

    public int g() {
        return this.f22560g;
    }

    public int i() {
        return this.f22554a;
    }

    public String toString() {
        return String.valueOf(this.f22554a);
    }
}

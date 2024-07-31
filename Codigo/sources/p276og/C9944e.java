package p276og;

import p066dg.C6947h;

/* renamed from: og.e */
/* loaded from: classes2.dex */
public final class C9944e {

    /* renamed from: h */
    private static final C9944e[] f24486h = m29720a();

    /* renamed from: a */
    private final int f24487a;

    /* renamed from: b */
    private final int f24488b;

    /* renamed from: c */
    private final int f24489c;

    /* renamed from: d */
    private final int f24490d;

    /* renamed from: e */
    private final int f24491e;

    /* renamed from: f */
    private final c f24492f;

    /* renamed from: g */
    private final int f24493g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: og.e$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private final int f24494a;

        /* renamed from: b */
        private final int f24495b;

        private b(int i10, int i11) {
            this.f24494a = i10;
            this.f24495b = i11;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public int m29729a() {
            return this.f24494a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public int m29730b() {
            return this.f24495b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: og.e$c */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a */
        private final int f24496a;

        /* renamed from: b */
        private final b[] f24497b;

        private c(int i10, b bVar) {
            this.f24496a = i10;
            this.f24497b = new b[]{bVar};
        }

        private c(int i10, b bVar, b bVar2) {
            this.f24496a = i10;
            this.f24497b = new b[]{bVar, bVar2};
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public b[] m29731a() {
            return this.f24497b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public int m29732b() {
            return this.f24496a;
        }
    }

    private C9944e(int i10, int i11, int i12, int i13, int i14, c cVar) {
        this.f24487a = i10;
        this.f24488b = i11;
        this.f24489c = i12;
        this.f24490d = i13;
        this.f24491e = i14;
        this.f24492f = cVar;
        int m29732b = cVar.m29732b();
        int i15 = 0;
        for (b bVar : cVar.m29731a()) {
            i15 += bVar.m29729a() * (bVar.m29730b() + m29732b);
        }
        this.f24493g = i15;
    }

    /* renamed from: a */
    private static C9944e[] m29720a() {
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
        return new C9944e[]{new C9944e(1, 10, 10, 8, 8, new c(i13, new b(i12, 3))), new C9944e(2, 12, 12, 10, 10, new c(i14, new b(i12, i13))), new C9944e(3, 14, 14, 12, 12, new c(10, new b(i12, i11))), new C9944e(4, 16, 16, 14, 14, new c(i15, new b(i12, i15))), new C9944e(5, 18, 18, 16, 16, new c(14, new b(i12, i16))), new C9944e(6, 20, 20, 18, 18, new c(i16, new b(i12, 22))), new C9944e(7, 22, 22, 20, 20, new c(20, new b(i12, 30))), new C9944e(8, 24, 24, 22, 22, new c(24, new b(i12, i17))), new C9944e(9, 26, 26, 24, 24, new c(28, new b(i12, 44))), new C9944e(10, 32, 32, 14, 14, new c(i17, new b(i12, i18))), new C9944e(11, 36, 36, 16, 16, new c(i19, new b(i12, 86))), new C9944e(12, 40, 40, 18, 18, new c(i10, new b(i12, 114))), new C9944e(13, 44, 44, 20, 20, new c(i20, new b(i12, 144))), new C9944e(14, 48, 48, 22, 22, new c(68, new b(i12, 174))), new C9944e(15, 52, 52, 24, 24, new c(i19, new b(2, 102))), new C9944e(16, 64, 64, 14, 14, new c(i20, new b(2, 140))), new C9944e(17, 72, 72, 16, 16, new c(i17, new b(4, 92))), new C9944e(18, 80, 80, 18, 18, new c(i10, new b(4, 114))), new C9944e(19, 88, 88, 20, 20, new c(i20, new b(4, 144))), new C9944e(20, 96, 96, 22, 22, new c(68, new b(4, 174))), new C9944e(21, 104, 104, 24, 24, new c(i20, new b(6, 136))), new C9944e(22, 120, 120, 18, 18, new c(68, new b(6, 175))), new C9944e(23, 132, 132, 20, 20, new c(i18, new b(i11, 163))), new C9944e(24, 144, 144, 22, 22, new c(i18, new b(i11, 156), new b(2, 155))), new C9944e(25, 8, 18, 6, 16, new c(i14, new b(i12, 5))), new C9944e(26, 8, 32, 6, 14, new c(11, bVar)), new C9944e(27, 12, 26, 10, 24, new c(14, bVar2)), new C9944e(28, 12, 36, 10, 16, new c(i16, new b(i12, 22))), new C9944e(29, 16, 36, 14, 16, new c(24, new b(i12, i21))), new C9944e(30, 16, 48, 14, 22, new c(28, new b(i12, 49))), new C9944e(31, 8, 48, 6, 22, new c(15, new b(i12, i16))), new C9944e(32, 8, 64, 6, 14, new c(i16, new b(i12, 24))), new C9944e(33, 8, 80, 6, 18, new c(22, new b(i12, i21))), new C9944e(34, 8, 96, 6, 22, new c(28, new b(i12, i22))), new C9944e(35, 8, 120, 6, 18, new c(i21, new b(i12, 49))), new C9944e(36, 8, 144, 6, 22, new c(i17, new b(i12, 63))), new C9944e(37, 12, 64, 10, 14, new c(27, new b(i12, 43))), new C9944e(38, 12, 88, 10, 20, new c(i17, new b(i12, 64))), new C9944e(39, 16, 64, 14, 14, new c(i17, new b(i12, i18))), new C9944e(40, 20, 36, 18, 16, new c(28, new b(i12, 44))), new C9944e(41, 20, 44, 18, 20, new c(34, new b(i12, i20))), new C9944e(42, 20, 64, 18, 14, new c(i19, new b(i12, 84))), new C9944e(43, 22, 48, 20, 22, new c(i22, new b(i12, 72))), new C9944e(44, 24, 48, 22, 22, new c(41, new b(i12, 80))), new C9944e(45, 24, 64, 22, 14, new c(46, new b(i12, 108))), new C9944e(46, 26, 40, 24, 18, new c(i22, new b(i12, 70))), new C9944e(47, 26, 48, 24, 22, new c(i19, new b(i12, 90))), new C9944e(48, 26, 64, 24, 14, new c(50, new b(i12, 118)))};
    }

    /* renamed from: h */
    public static C9944e m29721h(int i10, int i11) {
        if ((i10 & 1) != 0 || (i11 & 1) != 0) {
            throw C6947h.m20094a();
        }
        for (C9944e c9944e : f24486h) {
            if (c9944e.f24488b == i10 && c9944e.f24489c == i11) {
                return c9944e;
            }
        }
        throw C6947h.m20094a();
    }

    /* renamed from: b */
    public int m29722b() {
        return this.f24491e;
    }

    /* renamed from: c */
    public int m29723c() {
        return this.f24490d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public c m29724d() {
        return this.f24492f;
    }

    /* renamed from: e */
    public int m29725e() {
        return this.f24489c;
    }

    /* renamed from: f */
    public int m29726f() {
        return this.f24488b;
    }

    /* renamed from: g */
    public int m29727g() {
        return this.f24493g;
    }

    /* renamed from: i */
    public int m29728i() {
        return this.f24487a;
    }

    public String toString() {
        return String.valueOf(this.f24487a);
    }
}

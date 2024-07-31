package p134h8;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p120g8.AbstractC7497o;
import p120g8.C7484b;
import p120g8.C7496n;
import p120g8.InterfaceC7491i;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p363t8.C11173s;

/* renamed from: h8.a */
/* loaded from: classes.dex */
public final class C7664a extends AbstractC7668e {

    /* renamed from: h */
    private final int f18183h;

    /* renamed from: i */
    private final int f18184i;

    /* renamed from: j */
    private final int f18185j;

    /* renamed from: k */
    private final long f18186k;

    /* renamed from: n */
    private List<C7484b> f18189n;

    /* renamed from: o */
    private List<C7484b> f18190o;

    /* renamed from: p */
    private int f18191p;

    /* renamed from: q */
    private int f18192q;

    /* renamed from: r */
    private boolean f18193r;

    /* renamed from: s */
    private boolean f18194s;

    /* renamed from: t */
    private byte f18195t;

    /* renamed from: u */
    private byte f18196u;

    /* renamed from: w */
    private boolean f18198w;

    /* renamed from: x */
    private long f18199x;

    /* renamed from: y */
    private static final int[] f18180y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z */
    private static final int[] f18181z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: A */
    private static final int[] f18174A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: B */
    private static final int[] f18175B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: C */
    private static final int[] f18176C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: D */
    private static final int[] f18177D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: E */
    private static final int[] f18178E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: F */
    private static final boolean[] f18179F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g */
    private final C11146e0 f18182g = new C11146e0();

    /* renamed from: l */
    private final ArrayList<a> f18187l = new ArrayList<>();

    /* renamed from: m */
    private a f18188m = new a(0, 4);

    /* renamed from: v */
    private int f18197v = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h8.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final List<C13212a> f18200a = new ArrayList();

        /* renamed from: b */
        private final List<SpannableString> f18201b = new ArrayList();

        /* renamed from: c */
        private final StringBuilder f18202c = new StringBuilder();

        /* renamed from: d */
        private int f18203d;

        /* renamed from: e */
        private int f18204e;

        /* renamed from: f */
        private int f18205f;

        /* renamed from: g */
        private int f18206g;

        /* renamed from: h */
        private int f18207h;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h8.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C13212a {

            /* renamed from: a */
            public final int f18208a;

            /* renamed from: b */
            public final boolean f18209b;

            /* renamed from: c */
            public int f18210c;

            public C13212a(int i10, boolean z10, int i11) {
                this.f18208a = i10;
                this.f18209b = z10;
                this.f18210c = i11;
            }
        }

        public a(int i10, int i11) {
            m23336j(i10);
            this.f18207h = i11;
        }

        /* renamed from: h */
        private SpannableString m23328h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f18202c);
            int length = spannableStringBuilder.length();
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            boolean z10 = false;
            while (i14 < this.f18200a.size()) {
                C13212a c13212a = this.f18200a.get(i14);
                boolean z11 = c13212a.f18209b;
                int i16 = c13212a.f18208a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i13 = C7664a.f18174A[i16];
                    }
                    z10 = z12;
                }
                int i17 = c13212a.f18210c;
                i14++;
                if (i17 != (i14 < this.f18200a.size() ? this.f18200a.get(i14).f18210c : length)) {
                    if (i10 != -1 && !z11) {
                        m23331q(spannableStringBuilder, i10, i17);
                        i10 = -1;
                    } else if (i10 == -1 && z11) {
                        i10 = i17;
                    }
                    if (i11 != -1 && !z10) {
                        m23330o(spannableStringBuilder, i11, i17);
                        i11 = -1;
                    } else if (i11 == -1 && z10) {
                        i11 = i17;
                    }
                    if (i13 != i12) {
                        m23329n(spannableStringBuilder, i15, i17, i12);
                        i12 = i13;
                        i15 = i17;
                    }
                }
            }
            if (i10 != -1 && i10 != length) {
                m23331q(spannableStringBuilder, i10, length);
            }
            if (i11 != -1 && i11 != length) {
                m23330o(spannableStringBuilder, i11, length);
            }
            if (i15 != length) {
                m23329n(spannableStringBuilder, i15, length, i12);
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: n */
        private static void m23329n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        }

        /* renamed from: o */
        private static void m23330o(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        /* renamed from: q */
        private static void m23331q(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        /* renamed from: e */
        public void m23332e(char c10) {
            if (this.f18202c.length() < 32) {
                this.f18202c.append(c10);
            }
        }

        /* renamed from: f */
        public void m23333f() {
            int length = this.f18202c.length();
            if (length > 0) {
                this.f18202c.delete(length - 1, length);
                for (int size = this.f18200a.size() - 1; size >= 0; size--) {
                    C13212a c13212a = this.f18200a.get(size);
                    int i10 = c13212a.f18210c;
                    if (i10 != length) {
                        return;
                    }
                    c13212a.f18210c = i10 - 1;
                }
            }
        }

        /* renamed from: g */
        public C7484b m23334g(int i10) {
            float f10;
            int i11 = this.f18204e + this.f18205f;
            int i12 = 32 - i11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.f18201b.size(); i13++) {
                spannableStringBuilder.append(C11172r0.m34907Z0(this.f18201b.get(i13), i12));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(C11172r0.m34907Z0(m23328h(), i12));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i12 - spannableStringBuilder.length();
            int i14 = i11 - length;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f18206g != 2 || (Math.abs(i14) >= 3 && length >= 0)) ? (this.f18206g != 2 || i14 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i11 = 32 - length;
                }
                f10 = ((i11 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i15 = this.f18203d;
            if (i15 > 7) {
                i15 = (i15 - 15) - 2;
            } else if (this.f18206g == 1) {
                i15 -= this.f18207h - 1;
            }
            return new C7484b.b().m22778o(spannableStringBuilder).m22779p(Layout.Alignment.ALIGN_NORMAL).m22771h(i15, 1).m22774k(f10).m22775l(i10).m22764a();
        }

        /* renamed from: i */
        public boolean m23335i() {
            return this.f18200a.isEmpty() && this.f18201b.isEmpty() && this.f18202c.length() == 0;
        }

        /* renamed from: j */
        public void m23336j(int i10) {
            this.f18206g = i10;
            this.f18200a.clear();
            this.f18201b.clear();
            this.f18202c.setLength(0);
            this.f18203d = 15;
            this.f18204e = 0;
            this.f18205f = 0;
        }

        /* renamed from: k */
        public void m23337k() {
            this.f18201b.add(m23328h());
            this.f18202c.setLength(0);
            this.f18200a.clear();
            int min = Math.min(this.f18207h, this.f18203d);
            while (this.f18201b.size() >= min) {
                this.f18201b.remove(0);
            }
        }

        /* renamed from: l */
        public void m23338l(int i10) {
            this.f18206g = i10;
        }

        /* renamed from: m */
        public void m23339m(int i10) {
            this.f18207h = i10;
        }

        /* renamed from: p */
        public void m23340p(int i10, boolean z10) {
            this.f18200a.add(new C13212a(i10, z10, this.f18202c.length()));
        }
    }

    public C7664a(String str, int i10, long j10) {
        this.f18186k = j10 > 0 ? j10 * 1000 : -9223372036854775807L;
        this.f18183h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 != 1) {
            if (i10 == 2) {
                this.f18185j = 1;
                this.f18184i = 0;
                m23302M(0);
                m23301L();
                this.f18198w = true;
                this.f18199x = -9223372036854775807L;
            }
            if (i10 == 3) {
                this.f18185j = 0;
            } else if (i10 != 4) {
                C11173s.m34970i("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            } else {
                this.f18185j = 1;
            }
            this.f18184i = 1;
            m23302M(0);
            m23301L();
            this.f18198w = true;
            this.f18199x = -9223372036854775807L;
        }
        this.f18185j = 0;
        this.f18184i = 0;
        m23302M(0);
        m23301L();
        this.f18198w = true;
        this.f18199x = -9223372036854775807L;
    }

    /* renamed from: A */
    private static boolean m23290A(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    /* renamed from: B */
    private static boolean m23291B(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    /* renamed from: C */
    private static boolean m23292C(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    /* renamed from: D */
    private static boolean m23293D(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    /* renamed from: E */
    private static boolean m23294E(byte b10) {
        return (b10 & 240) == 16;
    }

    /* renamed from: F */
    private boolean m23295F(boolean z10, byte b10, byte b11) {
        if (!z10 || !m23294E(b10)) {
            this.f18194s = false;
        } else {
            if (this.f18194s && this.f18195t == b10 && this.f18196u == b11) {
                this.f18194s = false;
                return true;
            }
            this.f18194s = true;
            this.f18195t = b10;
            this.f18196u = b11;
        }
        return false;
    }

    /* renamed from: G */
    private static boolean m23296G(byte b10) {
        return (b10 & 246) == 20;
    }

    /* renamed from: H */
    private static boolean m23297H(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    /* renamed from: I */
    private static boolean m23298I(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    /* renamed from: J */
    private static boolean m23299J(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    /* renamed from: K */
    private void m23300K(byte b10, byte b11) {
        if (!m23299J(b10)) {
            if (m23296G(b10)) {
                if (b11 != 32 && b11 != 47) {
                    switch (b11) {
                        default:
                            switch (b11) {
                                case 41:
                                    break;
                                case 42:
                                case 43:
                                    break;
                                default:
                                    return;
                            }
                        case 37:
                        case 38:
                        case 39:
                            this.f18198w = true;
                            return;
                    }
                }
                this.f18198w = true;
                return;
            }
            return;
        }
        this.f18198w = false;
    }

    /* renamed from: L */
    private void m23301L() {
        this.f18188m.m23336j(this.f18191p);
        this.f18187l.clear();
        this.f18187l.add(this.f18188m);
    }

    /* renamed from: M */
    private void m23302M(int i10) {
        int i11 = this.f18191p;
        if (i11 == i10) {
            return;
        }
        this.f18191p = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f18187l.size(); i12++) {
                this.f18187l.get(i12).m23338l(i10);
            }
            return;
        }
        m23301L();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f18189n = Collections.emptyList();
        }
    }

    /* renamed from: N */
    private void m23303N(int i10) {
        this.f18192q = i10;
        this.f18188m.m23339m(i10);
    }

    /* renamed from: O */
    private boolean m23304O() {
        return (this.f18186k == -9223372036854775807L || this.f18199x == -9223372036854775807L || m23381j() - this.f18199x < this.f18186k) ? false : true;
    }

    /* renamed from: P */
    private boolean m23305P(byte b10) {
        if (m23317z(b10)) {
            this.f18197v = m23308q(b10);
        }
        return this.f18197v == this.f18185j;
    }

    /* renamed from: p */
    private static char m23307p(byte b10) {
        return (char) f18175B[(b10 & Byte.MAX_VALUE) - 32];
    }

    /* renamed from: q */
    private static int m23308q(byte b10) {
        return (b10 >> 3) & 1;
    }

    /* renamed from: r */
    private List<C7484b> m23309r() {
        int size = this.f18187l.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            C7484b m23334g = this.f18187l.get(i11).m23334g(Integer.MIN_VALUE);
            arrayList.add(m23334g);
            if (m23334g != null) {
                i10 = Math.min(i10, m23334g.f17664t);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            C7484b c7484b = (C7484b) arrayList.get(i12);
            if (c7484b != null) {
                if (c7484b.f17664t != i10) {
                    c7484b = (C7484b) C11137a.m34603e(this.f18187l.get(i12).m23334g(i10));
                }
                arrayList2.add(c7484b);
            }
        }
        return arrayList2;
    }

    /* renamed from: s */
    private static char m23310s(byte b10) {
        return (char) f18177D[b10 & 31];
    }

    /* renamed from: t */
    private static char m23311t(byte b10) {
        return (char) f18178E[b10 & 31];
    }

    /* renamed from: u */
    private static char m23312u(byte b10, byte b11) {
        return (b10 & 1) == 0 ? m23310s(b11) : m23311t(b11);
    }

    /* renamed from: v */
    private static char m23313v(byte b10) {
        return (char) f18176C[b10 & 15];
    }

    /* renamed from: w */
    private void m23314w(byte b10) {
        this.f18188m.m23332e(' ');
        this.f18188m.m23340p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    /* renamed from: x */
    private void m23315x(byte b10) {
        if (b10 == 32) {
            m23302M(2);
            return;
        }
        if (b10 == 41) {
            m23302M(3);
            return;
        }
        switch (b10) {
            case 37:
                m23302M(1);
                m23303N(2);
                return;
            case 38:
                m23302M(1);
                m23303N(3);
                return;
            case 39:
                m23302M(1);
                m23303N(4);
                return;
            default:
                int i10 = this.f18191p;
                if (i10 == 0) {
                    return;
                }
                if (b10 == 33) {
                    this.f18188m.m23333f();
                    return;
                }
                switch (b10) {
                    case 44:
                        this.f18189n = Collections.emptyList();
                        int i11 = this.f18191p;
                        if (i11 != 1 && i11 != 3) {
                            return;
                        }
                        break;
                    case 45:
                        if (i10 != 1 || this.f18188m.m23335i()) {
                            return;
                        }
                        this.f18188m.m23337k();
                        return;
                    case 46:
                        break;
                    case 47:
                        this.f18189n = m23309r();
                        break;
                    default:
                        return;
                }
                m23301L();
                return;
        }
    }

    /* renamed from: y */
    private void m23316y(byte b10, byte b11) {
        int i10 = f18180y[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f18188m.f18203d) {
            if (this.f18191p != 1 && !this.f18188m.m23335i()) {
                a aVar = new a(this.f18191p, this.f18192q);
                this.f18188m = aVar;
                this.f18187l.add(aVar);
            }
            this.f18188m.f18203d = i10;
        }
        boolean z10 = (b11 & 16) == 16;
        boolean z11 = (b11 & 1) == 1;
        int i11 = (b11 >> 1) & 7;
        this.f18188m.m23340p(z10 ? 8 : i11, z11);
        if (z10) {
            this.f18188m.f18204e = f18181z[i11];
        }
    }

    /* renamed from: z */
    private static boolean m23317z(byte b10) {
        return (b10 & 224) == 0;
    }

    @Override // p134h8.AbstractC7668e, p120g8.InterfaceC7492j
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo22790a(long j10) {
        super.mo22790a(j10);
    }

    @Override // p134h8.AbstractC7668e
    /* renamed from: e */
    protected InterfaceC7491i mo23318e() {
        List<C7484b> list = this.f18189n;
        this.f18190o = list;
        return new C7669f((List) C11137a.m34603e(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0017 A[SYNTHETIC] */
    @Override // p134h8.AbstractC7668e
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo23319f(p120g8.C7496n r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p134h8.C7664a.mo23319f(g8.n):void");
    }

    @Override // p134h8.AbstractC7668e, p414w6.InterfaceC12079d
    public void flush() {
        super.flush();
        this.f18189n = null;
        this.f18190o = null;
        m23302M(0);
        m23303N(4);
        m23301L();
        this.f18193r = false;
        this.f18194s = false;
        this.f18195t = (byte) 0;
        this.f18196u = (byte) 0;
        this.f18197v = 0;
        this.f18198w = true;
        this.f18199x = -9223372036854775807L;
    }

    @Override // p134h8.AbstractC7668e
    /* renamed from: g */
    public /* bridge */ /* synthetic */ C7496n mo22793d() {
        return super.mo22793d();
    }

    @Override // p134h8.AbstractC7668e, p414w6.InterfaceC12079d
    /* renamed from: h */
    public AbstractC7497o mo22791b() {
        AbstractC7497o m23380i;
        AbstractC7497o mo22791b = super.mo22791b();
        if (mo22791b != null) {
            return mo22791b;
        }
        if (!m23304O() || (m23380i = m23380i()) == null) {
            return null;
        }
        this.f18189n = Collections.emptyList();
        this.f18199x = -9223372036854775807L;
        m23380i.m22819y(m23381j(), mo23318e(), Long.MAX_VALUE);
        return m23380i;
    }

    @Override // p134h8.AbstractC7668e
    /* renamed from: k */
    protected boolean mo23322k() {
        return this.f18189n != this.f18190o;
    }

    @Override // p134h8.AbstractC7668e
    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo22792c(C7496n c7496n) {
        super.mo22792c(c7496n);
    }

    @Override // p134h8.AbstractC7668e, p414w6.InterfaceC12079d
    public void release() {
    }
}

package h8;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.libraries.barhopper.RecognitionOptions;
import g8.b;
import g8.i;
import g8.n;
import g8.o;
import h8.c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import t8.d0;
import t8.e0;
import t8.s;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: g, reason: collision with root package name */
    private final e0 f16568g = new e0();

    /* renamed from: h, reason: collision with root package name */
    private final d0 f16569h = new d0();

    /* renamed from: i, reason: collision with root package name */
    private int f16570i = -1;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f16571j;

    /* renamed from: k, reason: collision with root package name */
    private final int f16572k;

    /* renamed from: l, reason: collision with root package name */
    private final b[] f16573l;

    /* renamed from: m, reason: collision with root package name */
    private b f16574m;

    /* renamed from: n, reason: collision with root package name */
    private List<g8.b> f16575n;

    /* renamed from: o, reason: collision with root package name */
    private List<g8.b> f16576o;

    /* renamed from: p, reason: collision with root package name */
    private C0276c f16577p;

    /* renamed from: q, reason: collision with root package name */
    private int f16578q;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        private static final Comparator<a> f16579c = new Comparator() { // from class: h8.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int c10;
                c10 = c.a.c((c.a) obj, (c.a) obj2);
                return c10;
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final g8.b f16580a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16581b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            b.C0262b n10 = new b.C0262b().o(charSequence).p(alignment).h(f10, i10).i(i11).k(f11).l(i12).n(f12);
            if (z10) {
                n10.s(i13);
            }
            this.f16580a = n10.a();
            this.f16581b = i14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int c(a aVar, a aVar2) {
            return Integer.compare(aVar2.f16581b, aVar.f16581b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {
        private static final int[] A;
        private static final int[] B;
        private static final boolean[] C;
        private static final int[] D;
        private static final int[] E;
        private static final int[] F;
        private static final int[] G;

        /* renamed from: w, reason: collision with root package name */
        public static final int f16582w = h(2, 2, 2, 0);

        /* renamed from: x, reason: collision with root package name */
        public static final int f16583x;

        /* renamed from: y, reason: collision with root package name */
        public static final int f16584y;

        /* renamed from: z, reason: collision with root package name */
        private static final int[] f16585z;

        /* renamed from: a, reason: collision with root package name */
        private final List<SpannableString> f16586a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final SpannableStringBuilder f16587b = new SpannableStringBuilder();

        /* renamed from: c, reason: collision with root package name */
        private boolean f16588c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f16589d;

        /* renamed from: e, reason: collision with root package name */
        private int f16590e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f16591f;

        /* renamed from: g, reason: collision with root package name */
        private int f16592g;

        /* renamed from: h, reason: collision with root package name */
        private int f16593h;

        /* renamed from: i, reason: collision with root package name */
        private int f16594i;

        /* renamed from: j, reason: collision with root package name */
        private int f16595j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f16596k;

        /* renamed from: l, reason: collision with root package name */
        private int f16597l;

        /* renamed from: m, reason: collision with root package name */
        private int f16598m;

        /* renamed from: n, reason: collision with root package name */
        private int f16599n;

        /* renamed from: o, reason: collision with root package name */
        private int f16600o;

        /* renamed from: p, reason: collision with root package name */
        private int f16601p;

        /* renamed from: q, reason: collision with root package name */
        private int f16602q;

        /* renamed from: r, reason: collision with root package name */
        private int f16603r;

        /* renamed from: s, reason: collision with root package name */
        private int f16604s;

        /* renamed from: t, reason: collision with root package name */
        private int f16605t;

        /* renamed from: u, reason: collision with root package name */
        private int f16606u;

        /* renamed from: v, reason: collision with root package name */
        private int f16607v;

        static {
            int h10 = h(0, 0, 0, 0);
            f16583x = h10;
            int h11 = h(0, 0, 0, 3);
            f16584y = h11;
            f16585z = new int[]{0, 0, 0, 0, 0, 2, 0};
            A = new int[]{0, 0, 0, 0, 0, 0, 2};
            B = new int[]{3, 3, 3, 3, 3, 3, 1};
            C = new boolean[]{false, false, false, true, true, true, false};
            D = new int[]{h10, h11, h10, h10, h11, h10, h10};
            E = new int[]{0, 1, 2, 3, 4, 3, 4};
            F = new int[]{0, 0, 0, 0, 0, 3, 3};
            G = new int[]{h10, h10, h10, h10, h10, h11, h11};
        }

        public b() {
            l();
        }

        public static int g(int i10, int i11, int i12) {
            return h(i10, i11, i12, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0026  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                t8.a.c(r4, r0, r1)
                t8.a.c(r5, r0, r1)
                t8.a.c(r6, r0, r1)
                t8.a.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L21
                if (r7 == r1) goto L21
                r3 = 2
                if (r7 == r3) goto L1e
                r3 = 3
                if (r7 == r3) goto L1c
                goto L21
            L1c:
                r7 = r0
                goto L22
            L1e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L22
            L21:
                r7 = r2
            L22:
                if (r4 <= r1) goto L26
                r4 = r2
                goto L27
            L26:
                r4 = r0
            L27:
                if (r5 <= r1) goto L2b
                r5 = r2
                goto L2c
            L2b:
                r5 = r0
            L2c:
                if (r6 <= r1) goto L2f
                r0 = r2
            L2f:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: h8.c.b.h(int, int, int, int):int");
        }

        public void a(char c10) {
            if (c10 != '\n') {
                this.f16587b.append(c10);
                return;
            }
            this.f16586a.add(d());
            this.f16587b.clear();
            if (this.f16601p != -1) {
                this.f16601p = 0;
            }
            if (this.f16602q != -1) {
                this.f16602q = 0;
            }
            if (this.f16603r != -1) {
                this.f16603r = 0;
            }
            if (this.f16605t != -1) {
                this.f16605t = 0;
            }
            while (true) {
                if ((!this.f16596k || this.f16586a.size() < this.f16595j) && this.f16586a.size() < 15) {
                    return;
                } else {
                    this.f16586a.remove(0);
                }
            }
        }

        public void b() {
            int length = this.f16587b.length();
            if (length > 0) {
                this.f16587b.delete(length - 1, length);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public h8.c.a c() {
            /*
                Method dump skipped, instructions count: 195
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: h8.c.b.c():h8.c$a");
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f16587b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f16601p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f16601p, length, 33);
                }
                if (this.f16602q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f16602q, length, 33);
                }
                if (this.f16603r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f16604s), this.f16603r, length, 33);
                }
                if (this.f16605t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f16606u), this.f16605t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f16586a.clear();
            this.f16587b.clear();
            this.f16601p = -1;
            this.f16602q = -1;
            this.f16603r = -1;
            this.f16605t = -1;
            this.f16607v = 0;
        }

        public void f(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f16588c = true;
            this.f16589d = z10;
            this.f16596k = z11;
            this.f16590e = i10;
            this.f16591f = z13;
            this.f16592g = i11;
            this.f16593h = i12;
            this.f16594i = i15;
            int i18 = i13 + 1;
            if (this.f16595j != i18) {
                this.f16595j = i18;
                while (true) {
                    if ((!z11 || this.f16586a.size() < this.f16595j) && this.f16586a.size() < 15) {
                        break;
                    } else {
                        this.f16586a.remove(0);
                    }
                }
            }
            if (i16 != 0 && this.f16598m != i16) {
                this.f16598m = i16;
                int i19 = i16 - 1;
                q(D[i19], f16584y, C[i19], 0, A[i19], B[i19], f16585z[i19]);
            }
            if (i17 == 0 || this.f16599n == i17) {
                return;
            }
            this.f16599n = i17;
            int i20 = i17 - 1;
            m(0, 1, 1, false, false, F[i20], E[i20]);
            n(f16582w, G[i20], f16583x);
        }

        public boolean i() {
            return this.f16588c;
        }

        public boolean j() {
            return !i() || (this.f16586a.isEmpty() && this.f16587b.length() == 0);
        }

        public boolean k() {
            return this.f16589d;
        }

        public void l() {
            e();
            this.f16588c = false;
            this.f16589d = false;
            this.f16590e = 4;
            this.f16591f = false;
            this.f16592g = 0;
            this.f16593h = 0;
            this.f16594i = 0;
            this.f16595j = 15;
            this.f16596k = true;
            this.f16597l = 0;
            this.f16598m = 0;
            this.f16599n = 0;
            int i10 = f16583x;
            this.f16600o = i10;
            this.f16604s = f16582w;
            this.f16606u = i10;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f16601p != -1) {
                if (!z10) {
                    this.f16587b.setSpan(new StyleSpan(2), this.f16601p, this.f16587b.length(), 33);
                    this.f16601p = -1;
                }
            } else if (z10) {
                this.f16601p = this.f16587b.length();
            }
            if (this.f16602q == -1) {
                if (z11) {
                    this.f16602q = this.f16587b.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f16587b.setSpan(new UnderlineSpan(), this.f16602q, this.f16587b.length(), 33);
                this.f16602q = -1;
            }
        }

        public void n(int i10, int i11, int i12) {
            if (this.f16603r != -1 && this.f16604s != i10) {
                this.f16587b.setSpan(new ForegroundColorSpan(this.f16604s), this.f16603r, this.f16587b.length(), 33);
            }
            if (i10 != f16582w) {
                this.f16603r = this.f16587b.length();
                this.f16604s = i10;
            }
            if (this.f16605t != -1 && this.f16606u != i11) {
                this.f16587b.setSpan(new BackgroundColorSpan(this.f16606u), this.f16605t, this.f16587b.length(), 33);
            }
            if (i11 != f16583x) {
                this.f16605t = this.f16587b.length();
                this.f16606u = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f16607v != i10) {
                a('\n');
            }
            this.f16607v = i10;
        }

        public void p(boolean z10) {
            this.f16589d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f16600o = i10;
            this.f16597l = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h8.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0276c {

        /* renamed from: a, reason: collision with root package name */
        public final int f16608a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16609b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f16610c;

        /* renamed from: d, reason: collision with root package name */
        int f16611d = 0;

        public C0276c(int i10, int i11) {
            this.f16608a = i10;
            this.f16609b = i11;
            this.f16610c = new byte[(i11 * 2) - 1];
        }
    }

    public c(int i10, List<byte[]> list) {
        this.f16572k = i10 == -1 ? 1 : i10;
        this.f16571j = list != null && t8.e.h(list);
        this.f16573l = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f16573l[i11] = new b();
        }
        this.f16574m = this.f16573l[0];
    }

    private void A() {
        int h10 = b.h(this.f16569h.h(2), this.f16569h.h(2), this.f16569h.h(2), this.f16569h.h(2));
        int h11 = b.h(this.f16569h.h(2), this.f16569h.h(2), this.f16569h.h(2), this.f16569h.h(2));
        this.f16569h.r(2);
        this.f16574m.n(h10, h11, b.g(this.f16569h.h(2), this.f16569h.h(2), this.f16569h.h(2)));
    }

    private void B() {
        this.f16569h.r(4);
        int h10 = this.f16569h.h(4);
        this.f16569h.r(2);
        this.f16574m.o(h10, this.f16569h.h(6));
    }

    private void C() {
        int h10 = b.h(this.f16569h.h(2), this.f16569h.h(2), this.f16569h.h(2), this.f16569h.h(2));
        int h11 = this.f16569h.h(2);
        int g10 = b.g(this.f16569h.h(2), this.f16569h.h(2), this.f16569h.h(2));
        if (this.f16569h.g()) {
            h11 |= 4;
        }
        boolean g11 = this.f16569h.g();
        int h12 = this.f16569h.h(2);
        int h13 = this.f16569h.h(2);
        int h14 = this.f16569h.h(2);
        this.f16569h.r(8);
        this.f16574m.q(h10, g10, g11, h11, h12, h13, h14);
    }

    private void D() {
        StringBuilder sb2;
        String str;
        C0276c c0276c = this.f16577p;
        if (c0276c.f16611d != (c0276c.f16609b * 2) - 1) {
            s.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f16577p.f16609b * 2) - 1) + ", but current index is " + this.f16577p.f16611d + " (sequence number " + this.f16577p.f16608a + ");");
        }
        d0 d0Var = this.f16569h;
        C0276c c0276c2 = this.f16577p;
        d0Var.o(c0276c2.f16610c, c0276c2.f16611d);
        boolean z10 = false;
        while (true) {
            if (this.f16569h.b() <= 0) {
                break;
            }
            int h10 = this.f16569h.h(3);
            int h11 = this.f16569h.h(5);
            if (h10 == 7) {
                this.f16569h.r(2);
                h10 = this.f16569h.h(6);
                if (h10 < 7) {
                    s.i("Cea708Decoder", "Invalid extended service number: " + h10);
                }
            }
            if (h11 == 0) {
                if (h10 != 0) {
                    s.i("Cea708Decoder", "serviceNumber is non-zero (" + h10 + ") when blockSize is 0");
                }
            } else if (h10 != this.f16572k) {
                this.f16569h.s(h11);
            } else {
                int e10 = this.f16569h.e() + (h11 * 8);
                while (this.f16569h.e() < e10) {
                    int h12 = this.f16569h.h(8);
                    if (h12 == 16) {
                        h12 = this.f16569h.h(8);
                        if (h12 <= 31) {
                            s(h12);
                        } else {
                            if (h12 <= 127) {
                                x(h12);
                            } else if (h12 <= 159) {
                                t(h12);
                            } else if (h12 <= 255) {
                                y(h12);
                            } else {
                                sb2 = new StringBuilder();
                                str = "Invalid extended command: ";
                                sb2.append(str);
                                sb2.append(h12);
                                s.i("Cea708Decoder", sb2.toString());
                            }
                            z10 = true;
                        }
                    } else if (h12 <= 31) {
                        q(h12);
                    } else {
                        if (h12 <= 127) {
                            v(h12);
                        } else if (h12 <= 159) {
                            r(h12);
                        } else if (h12 <= 255) {
                            w(h12);
                        } else {
                            sb2 = new StringBuilder();
                            str = "Invalid base command: ";
                            sb2.append(str);
                            sb2.append(h12);
                            s.i("Cea708Decoder", sb2.toString());
                        }
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            this.f16575n = p();
        }
    }

    private void E() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f16573l[i10].l();
        }
    }

    private void o() {
        if (this.f16577p == null) {
            return;
        }
        D();
        this.f16577p = null;
    }

    private List<g8.b> p() {
        a c10;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f16573l[i10].j() && this.f16573l[i10].k() && (c10 = this.f16573l[i10].c()) != null) {
                arrayList.add(c10);
            }
        }
        Collections.sort(arrayList, a.f16579c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f16580a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void q(int i10) {
        d0 d0Var;
        if (i10 != 0) {
            if (i10 == 3) {
                this.f16575n = p();
                return;
            }
            int i11 = 8;
            if (i10 == 8) {
                this.f16574m.b();
                return;
            }
            switch (i10) {
                case 12:
                    E();
                    return;
                case 13:
                    this.f16574m.a('\n');
                    return;
                case 14:
                    return;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        s.i("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        d0Var = this.f16569h;
                    } else {
                        if (i10 < 24 || i10 > 31) {
                            s.i("Cea708Decoder", "Invalid C0 command: " + i10);
                            return;
                        }
                        s.i("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                        d0Var = this.f16569h;
                        i11 = 16;
                    }
                    d0Var.r(i11);
                    return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    private void r(int i10) {
        b bVar;
        d0 d0Var;
        int i11 = 16;
        int i12 = 1;
        switch (i10) {
            case RecognitionOptions.ITF /* 128 */:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i13 = i10 - 128;
                if (this.f16578q != i13) {
                    this.f16578q = i13;
                    bVar = this.f16573l[i13];
                    this.f16574m = bVar;
                    return;
                }
                return;
            case 136:
                while (i12 <= 8) {
                    if (this.f16569h.g()) {
                        this.f16573l[8 - i12].e();
                    }
                    i12++;
                }
                return;
            case 137:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f16569h.g()) {
                        this.f16573l[8 - i14].p(true);
                    }
                }
                return;
            case 138:
                while (i12 <= 8) {
                    if (this.f16569h.g()) {
                        this.f16573l[8 - i12].p(false);
                    }
                    i12++;
                }
                return;
            case 139:
                for (int i15 = 1; i15 <= 8; i15++) {
                    if (this.f16569h.g()) {
                        this.f16573l[8 - i15].p(!r0.k());
                    }
                }
                return;
            case 140:
                while (i12 <= 8) {
                    if (this.f16569h.g()) {
                        this.f16573l[8 - i12].l();
                    }
                    i12++;
                }
                return;
            case 141:
                this.f16569h.r(8);
                return;
            case 142:
                return;
            case 143:
                E();
                return;
            case 144:
                if (this.f16574m.i()) {
                    z();
                    return;
                }
                d0Var = this.f16569h;
                d0Var.r(i11);
                return;
            case 145:
                if (this.f16574m.i()) {
                    A();
                    return;
                }
                d0Var = this.f16569h;
                i11 = 24;
                d0Var.r(i11);
                return;
            case 146:
                if (this.f16574m.i()) {
                    B();
                    return;
                }
                d0Var = this.f16569h;
                d0Var.r(i11);
                return;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                s.i("Cea708Decoder", "Invalid C1 command: " + i10);
                return;
            case 151:
                if (this.f16574m.i()) {
                    C();
                    return;
                }
                d0Var = this.f16569h;
                i11 = 32;
                d0Var.r(i11);
                return;
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i16 = i10 - 152;
                u(i16);
                if (this.f16578q != i16) {
                    this.f16578q = i16;
                    bVar = this.f16573l[i16];
                    this.f16574m = bVar;
                    return;
                }
                return;
        }
    }

    private void s(int i10) {
        d0 d0Var;
        int i11;
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            d0Var = this.f16569h;
            i11 = 8;
        } else if (i10 <= 23) {
            d0Var = this.f16569h;
            i11 = 16;
        } else {
            if (i10 > 31) {
                return;
            }
            d0Var = this.f16569h;
            i11 = 24;
        }
        d0Var.r(i11);
    }

    private void t(int i10) {
        d0 d0Var;
        int i11;
        if (i10 <= 135) {
            d0Var = this.f16569h;
            i11 = 32;
        } else {
            if (i10 > 143) {
                if (i10 <= 159) {
                    this.f16569h.r(2);
                    this.f16569h.r(this.f16569h.h(6) * 8);
                    return;
                }
                return;
            }
            d0Var = this.f16569h;
            i11 = 40;
        }
        d0Var.r(i11);
    }

    private void u(int i10) {
        b bVar = this.f16573l[i10];
        this.f16569h.r(2);
        boolean g10 = this.f16569h.g();
        boolean g11 = this.f16569h.g();
        boolean g12 = this.f16569h.g();
        int h10 = this.f16569h.h(3);
        boolean g13 = this.f16569h.g();
        int h11 = this.f16569h.h(7);
        int h12 = this.f16569h.h(8);
        int h13 = this.f16569h.h(4);
        int h14 = this.f16569h.h(4);
        this.f16569h.r(2);
        int h15 = this.f16569h.h(6);
        this.f16569h.r(2);
        bVar.f(g10, g11, g12, h10, g13, h11, h12, h14, h15, h13, this.f16569h.h(3), this.f16569h.h(3));
    }

    private void v(int i10) {
        if (i10 == 127) {
            this.f16574m.a((char) 9835);
        } else {
            this.f16574m.a((char) (i10 & 255));
        }
    }

    private void w(int i10) {
        this.f16574m.a((char) (i10 & 255));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0028. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x002b. Please report as an issue. */
    private void x(int i10) {
        b bVar;
        char c10 = ' ';
        if (i10 == 32) {
            bVar = this.f16574m;
        } else if (i10 == 33) {
            bVar = this.f16574m;
            c10 = 160;
        } else if (i10 == 37) {
            bVar = this.f16574m;
            c10 = 8230;
        } else if (i10 == 42) {
            bVar = this.f16574m;
            c10 = 352;
        } else if (i10 == 44) {
            bVar = this.f16574m;
            c10 = 338;
        } else if (i10 == 63) {
            bVar = this.f16574m;
            c10 = 376;
        } else if (i10 == 57) {
            bVar = this.f16574m;
            c10 = 8482;
        } else if (i10 == 58) {
            bVar = this.f16574m;
            c10 = 353;
        } else if (i10 == 60) {
            bVar = this.f16574m;
            c10 = 339;
        } else if (i10 != 61) {
            switch (i10) {
                case 48:
                    bVar = this.f16574m;
                    c10 = 9608;
                    break;
                case 49:
                    bVar = this.f16574m;
                    c10 = 8216;
                    break;
                case 50:
                    bVar = this.f16574m;
                    c10 = 8217;
                    break;
                case 51:
                    bVar = this.f16574m;
                    c10 = 8220;
                    break;
                case 52:
                    bVar = this.f16574m;
                    c10 = 8221;
                    break;
                case 53:
                    bVar = this.f16574m;
                    c10 = 8226;
                    break;
                default:
                    switch (i10) {
                        case 118:
                            bVar = this.f16574m;
                            c10 = 8539;
                            break;
                        case 119:
                            bVar = this.f16574m;
                            c10 = 8540;
                            break;
                        case 120:
                            bVar = this.f16574m;
                            c10 = 8541;
                            break;
                        case 121:
                            bVar = this.f16574m;
                            c10 = 8542;
                            break;
                        case 122:
                            bVar = this.f16574m;
                            c10 = 9474;
                            break;
                        case 123:
                            bVar = this.f16574m;
                            c10 = 9488;
                            break;
                        case 124:
                            bVar = this.f16574m;
                            c10 = 9492;
                            break;
                        case 125:
                            bVar = this.f16574m;
                            c10 = 9472;
                            break;
                        case 126:
                            bVar = this.f16574m;
                            c10 = 9496;
                            break;
                        case 127:
                            bVar = this.f16574m;
                            c10 = 9484;
                            break;
                        default:
                            s.i("Cea708Decoder", "Invalid G2 character: " + i10);
                            return;
                    }
            }
        } else {
            bVar = this.f16574m;
            c10 = 8480;
        }
        bVar.a(c10);
    }

    private void y(int i10) {
        b bVar;
        char c10;
        if (i10 == 160) {
            bVar = this.f16574m;
            c10 = 13252;
        } else {
            s.i("Cea708Decoder", "Invalid G3 character: " + i10);
            bVar = this.f16574m;
            c10 = '_';
        }
        bVar.a(c10);
    }

    private void z() {
        this.f16574m.m(this.f16569h.h(4), this.f16569h.h(2), this.f16569h.h(2), this.f16569h.g(), this.f16569h.g(), this.f16569h.h(3), this.f16569h.h(3));
    }

    @Override // h8.e, g8.j
    public /* bridge */ /* synthetic */ void a(long j10) {
        super.a(j10);
    }

    @Override // h8.e
    protected i e() {
        List<g8.b> list = this.f16575n;
        this.f16576o = list;
        return new f((List) t8.a.e(list));
    }

    @Override // h8.e
    protected void f(n nVar) {
        ByteBuffer byteBuffer = (ByteBuffer) t8.a.e(nVar.f29679c);
        this.f16568g.S(byteBuffer.array(), byteBuffer.limit());
        while (this.f16568g.a() >= 3) {
            int H = this.f16568g.H() & 7;
            int i10 = H & 3;
            boolean z10 = (H & 4) == 4;
            byte H2 = (byte) this.f16568g.H();
            byte H3 = (byte) this.f16568g.H();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        o();
                        int i11 = (H2 & 192) >> 6;
                        int i12 = this.f16570i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            E();
                            s.i("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f16570i + " current=" + i11);
                        }
                        this.f16570i = i11;
                        int i13 = H2 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        C0276c c0276c = new C0276c(i11, i13);
                        this.f16577p = c0276c;
                        byte[] bArr = c0276c.f16610c;
                        int i14 = c0276c.f16611d;
                        c0276c.f16611d = i14 + 1;
                        bArr[i14] = H3;
                    } else {
                        t8.a.a(i10 == 2);
                        C0276c c0276c2 = this.f16577p;
                        if (c0276c2 == null) {
                            s.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0276c2.f16610c;
                            int i15 = c0276c2.f16611d;
                            int i16 = i15 + 1;
                            bArr2[i15] = H2;
                            c0276c2.f16611d = i16 + 1;
                            bArr2[i16] = H3;
                        }
                    }
                    C0276c c0276c3 = this.f16577p;
                    if (c0276c3.f16611d == (c0276c3.f16609b * 2) - 1) {
                        o();
                    }
                }
            }
        }
    }

    @Override // h8.e, w6.d
    public void flush() {
        super.flush();
        this.f16575n = null;
        this.f16576o = null;
        this.f16578q = 0;
        this.f16574m = this.f16573l[0];
        E();
        this.f16577p = null;
    }

    @Override // h8.e
    /* renamed from: g */
    public /* bridge */ /* synthetic */ n d() {
        return super.d();
    }

    @Override // h8.e
    /* renamed from: h */
    public /* bridge */ /* synthetic */ o b() {
        return super.b();
    }

    @Override // h8.e
    protected boolean k() {
        return this.f16575n != this.f16576o;
    }

    @Override // h8.e
    /* renamed from: l */
    public /* bridge */ /* synthetic */ void c(n nVar) {
        super.c(nVar);
    }

    @Override // h8.e, w6.d
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }
}

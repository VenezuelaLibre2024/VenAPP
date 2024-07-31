package p134h8;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p120g8.AbstractC7497o;
import p120g8.C7484b;
import p120g8.C7496n;
import p120g8.InterfaceC7491i;
import p134h8.C7666c;
import p363t8.C11137a;
import p363t8.C11144d0;
import p363t8.C11145e;
import p363t8.C11146e0;
import p363t8.C11173s;

/* renamed from: h8.c */
/* loaded from: classes.dex */
public final class C7666c extends AbstractC7668e {

    /* renamed from: g */
    private final C11146e0 f18211g = new C11146e0();

    /* renamed from: h */
    private final C11144d0 f18212h = new C11144d0();

    /* renamed from: i */
    private int f18213i = -1;

    /* renamed from: j */
    private final boolean f18214j;

    /* renamed from: k */
    private final int f18215k;

    /* renamed from: l */
    private final b[] f18216l;

    /* renamed from: m */
    private b f18217m;

    /* renamed from: n */
    private List<C7484b> f18218n;

    /* renamed from: o */
    private List<C7484b> f18219o;

    /* renamed from: p */
    private c f18220p;

    /* renamed from: q */
    private int f18221q;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h8.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: c */
        private static final Comparator<a> f18222c = new Comparator() { // from class: h8.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m23360c;
                m23360c = C7666c.a.m23360c((C7666c.a) obj, (C7666c.a) obj2);
                return m23360c;
            }
        };

        /* renamed from: a */
        public final C7484b f18223a;

        /* renamed from: b */
        public final int f18224b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            C7484b.b m22777n = new C7484b.b().m22778o(charSequence).m22779p(alignment).m22771h(f10, i10).m22772i(i11).m22774k(f11).m22775l(i12).m22777n(f12);
            if (z10) {
                m22777n.m22782s(i13);
            }
            this.f18223a = m22777n.m22764a();
            this.f18224b = i14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static /* synthetic */ int m23360c(a aVar, a aVar2) {
            return Integer.compare(aVar2.f18224b, aVar.f18224b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h8.c$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: A */
        private static final int[] f18225A;

        /* renamed from: B */
        private static final int[] f18226B;

        /* renamed from: C */
        private static final boolean[] f18227C;

        /* renamed from: D */
        private static final int[] f18228D;

        /* renamed from: E */
        private static final int[] f18229E;

        /* renamed from: F */
        private static final int[] f18230F;

        /* renamed from: G */
        private static final int[] f18231G;

        /* renamed from: w */
        public static final int f18232w = m23362h(2, 2, 2, 0);

        /* renamed from: x */
        public static final int f18233x;

        /* renamed from: y */
        public static final int f18234y;

        /* renamed from: z */
        private static final int[] f18235z;

        /* renamed from: a */
        private final List<SpannableString> f18236a = new ArrayList();

        /* renamed from: b */
        private final SpannableStringBuilder f18237b = new SpannableStringBuilder();

        /* renamed from: c */
        private boolean f18238c;

        /* renamed from: d */
        private boolean f18239d;

        /* renamed from: e */
        private int f18240e;

        /* renamed from: f */
        private boolean f18241f;

        /* renamed from: g */
        private int f18242g;

        /* renamed from: h */
        private int f18243h;

        /* renamed from: i */
        private int f18244i;

        /* renamed from: j */
        private int f18245j;

        /* renamed from: k */
        private boolean f18246k;

        /* renamed from: l */
        private int f18247l;

        /* renamed from: m */
        private int f18248m;

        /* renamed from: n */
        private int f18249n;

        /* renamed from: o */
        private int f18250o;

        /* renamed from: p */
        private int f18251p;

        /* renamed from: q */
        private int f18252q;

        /* renamed from: r */
        private int f18253r;

        /* renamed from: s */
        private int f18254s;

        /* renamed from: t */
        private int f18255t;

        /* renamed from: u */
        private int f18256u;

        /* renamed from: v */
        private int f18257v;

        static {
            int m23362h = m23362h(0, 0, 0, 0);
            f18233x = m23362h;
            int m23362h2 = m23362h(0, 0, 0, 3);
            f18234y = m23362h2;
            f18235z = new int[]{0, 0, 0, 0, 0, 2, 0};
            f18225A = new int[]{0, 0, 0, 0, 0, 0, 2};
            f18226B = new int[]{3, 3, 3, 3, 3, 3, 1};
            f18227C = new boolean[]{false, false, false, true, true, true, false};
            f18228D = new int[]{m23362h, m23362h2, m23362h, m23362h, m23362h2, m23362h, m23362h};
            f18229E = new int[]{0, 1, 2, 3, 4, 3, 4};
            f18230F = new int[]{0, 0, 0, 0, 0, 3, 3};
            f18231G = new int[]{m23362h, m23362h, m23362h, m23362h, m23362h, m23362h2, m23362h2};
        }

        public b() {
            m23372l();
        }

        /* renamed from: g */
        public static int m23361g(int i10, int i11, int i12) {
            return m23362h(i10, i11, i12, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0026  */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int m23362h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                p363t8.C11137a.m34601c(r4, r0, r1)
                p363t8.C11137a.m34601c(r5, r0, r1)
                p363t8.C11137a.m34601c(r6, r0, r1)
                p363t8.C11137a.m34601c(r7, r0, r1)
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
            throw new UnsupportedOperationException("Method not decompiled: p134h8.C7666c.b.m23362h(int, int, int, int):int");
        }

        /* renamed from: a */
        public void m23363a(char c10) {
            if (c10 != '\n') {
                this.f18237b.append(c10);
                return;
            }
            this.f18236a.add(m23366d());
            this.f18237b.clear();
            if (this.f18251p != -1) {
                this.f18251p = 0;
            }
            if (this.f18252q != -1) {
                this.f18252q = 0;
            }
            if (this.f18253r != -1) {
                this.f18253r = 0;
            }
            if (this.f18255t != -1) {
                this.f18255t = 0;
            }
            while (true) {
                if ((!this.f18246k || this.f18236a.size() < this.f18245j) && this.f18236a.size() < 15) {
                    return;
                } else {
                    this.f18236a.remove(0);
                }
            }
        }

        /* renamed from: b */
        public void m23364b() {
            int length = this.f18237b.length();
            if (length > 0) {
                this.f18237b.delete(length - 1, length);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p134h8.C7666c.a m23365c() {
            /*
                Method dump skipped, instructions count: 195
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p134h8.C7666c.b.m23365c():h8.c$a");
        }

        /* renamed from: d */
        public SpannableString m23366d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f18237b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f18251p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f18251p, length, 33);
                }
                if (this.f18252q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f18252q, length, 33);
                }
                if (this.f18253r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f18254s), this.f18253r, length, 33);
                }
                if (this.f18255t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f18256u), this.f18255t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: e */
        public void m23367e() {
            this.f18236a.clear();
            this.f18237b.clear();
            this.f18251p = -1;
            this.f18252q = -1;
            this.f18253r = -1;
            this.f18255t = -1;
            this.f18257v = 0;
        }

        /* renamed from: f */
        public void m23368f(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f18238c = true;
            this.f18239d = z10;
            this.f18246k = z11;
            this.f18240e = i10;
            this.f18241f = z13;
            this.f18242g = i11;
            this.f18243h = i12;
            this.f18244i = i15;
            int i18 = i13 + 1;
            if (this.f18245j != i18) {
                this.f18245j = i18;
                while (true) {
                    if ((!z11 || this.f18236a.size() < this.f18245j) && this.f18236a.size() < 15) {
                        break;
                    } else {
                        this.f18236a.remove(0);
                    }
                }
            }
            if (i16 != 0 && this.f18248m != i16) {
                this.f18248m = i16;
                int i19 = i16 - 1;
                m23377q(f18228D[i19], f18234y, f18227C[i19], 0, f18225A[i19], f18226B[i19], f18235z[i19]);
            }
            if (i17 == 0 || this.f18249n == i17) {
                return;
            }
            this.f18249n = i17;
            int i20 = i17 - 1;
            m23373m(0, 1, 1, false, false, f18230F[i20], f18229E[i20]);
            m23374n(f18232w, f18231G[i20], f18233x);
        }

        /* renamed from: i */
        public boolean m23369i() {
            return this.f18238c;
        }

        /* renamed from: j */
        public boolean m23370j() {
            return !m23369i() || (this.f18236a.isEmpty() && this.f18237b.length() == 0);
        }

        /* renamed from: k */
        public boolean m23371k() {
            return this.f18239d;
        }

        /* renamed from: l */
        public void m23372l() {
            m23367e();
            this.f18238c = false;
            this.f18239d = false;
            this.f18240e = 4;
            this.f18241f = false;
            this.f18242g = 0;
            this.f18243h = 0;
            this.f18244i = 0;
            this.f18245j = 15;
            this.f18246k = true;
            this.f18247l = 0;
            this.f18248m = 0;
            this.f18249n = 0;
            int i10 = f18233x;
            this.f18250o = i10;
            this.f18254s = f18232w;
            this.f18256u = i10;
        }

        /* renamed from: m */
        public void m23373m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f18251p != -1) {
                if (!z10) {
                    this.f18237b.setSpan(new StyleSpan(2), this.f18251p, this.f18237b.length(), 33);
                    this.f18251p = -1;
                }
            } else if (z10) {
                this.f18251p = this.f18237b.length();
            }
            if (this.f18252q == -1) {
                if (z11) {
                    this.f18252q = this.f18237b.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f18237b.setSpan(new UnderlineSpan(), this.f18252q, this.f18237b.length(), 33);
                this.f18252q = -1;
            }
        }

        /* renamed from: n */
        public void m23374n(int i10, int i11, int i12) {
            if (this.f18253r != -1 && this.f18254s != i10) {
                this.f18237b.setSpan(new ForegroundColorSpan(this.f18254s), this.f18253r, this.f18237b.length(), 33);
            }
            if (i10 != f18232w) {
                this.f18253r = this.f18237b.length();
                this.f18254s = i10;
            }
            if (this.f18255t != -1 && this.f18256u != i11) {
                this.f18237b.setSpan(new BackgroundColorSpan(this.f18256u), this.f18255t, this.f18237b.length(), 33);
            }
            if (i11 != f18233x) {
                this.f18255t = this.f18237b.length();
                this.f18256u = i11;
            }
        }

        /* renamed from: o */
        public void m23375o(int i10, int i11) {
            if (this.f18257v != i10) {
                m23363a('\n');
            }
            this.f18257v = i10;
        }

        /* renamed from: p */
        public void m23376p(boolean z10) {
            this.f18239d = z10;
        }

        /* renamed from: q */
        public void m23377q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f18250o = i10;
            this.f18247l = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h8.c$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final int f18258a;

        /* renamed from: b */
        public final int f18259b;

        /* renamed from: c */
        public final byte[] f18260c;

        /* renamed from: d */
        int f18261d = 0;

        public c(int i10, int i11) {
            this.f18258a = i10;
            this.f18259b = i11;
            this.f18260c = new byte[(i11 * 2) - 1];
        }
    }

    public C7666c(int i10, List<byte[]> list) {
        this.f18215k = i10 == -1 ? 1 : i10;
        this.f18214j = list != null && C11145e.m34651h(list);
        this.f18216l = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f18216l[i11] = new b();
        }
        this.f18217m = this.f18216l[0];
    }

    /* renamed from: A */
    private void m23341A() {
        int m23362h = b.m23362h(this.f18212h.m34632h(2), this.f18212h.m34632h(2), this.f18212h.m34632h(2), this.f18212h.m34632h(2));
        int m23362h2 = b.m23362h(this.f18212h.m34632h(2), this.f18212h.m34632h(2), this.f18212h.m34632h(2), this.f18212h.m34632h(2));
        this.f18212h.m34642r(2);
        this.f18217m.m23374n(m23362h, m23362h2, b.m23361g(this.f18212h.m34632h(2), this.f18212h.m34632h(2), this.f18212h.m34632h(2)));
    }

    /* renamed from: B */
    private void m23342B() {
        this.f18212h.m34642r(4);
        int m34632h = this.f18212h.m34632h(4);
        this.f18212h.m34642r(2);
        this.f18217m.m23375o(m34632h, this.f18212h.m34632h(6));
    }

    /* renamed from: C */
    private void m23343C() {
        int m23362h = b.m23362h(this.f18212h.m34632h(2), this.f18212h.m34632h(2), this.f18212h.m34632h(2), this.f18212h.m34632h(2));
        int m34632h = this.f18212h.m34632h(2);
        int m23361g = b.m23361g(this.f18212h.m34632h(2), this.f18212h.m34632h(2), this.f18212h.m34632h(2));
        if (this.f18212h.m34631g()) {
            m34632h |= 4;
        }
        boolean m34631g = this.f18212h.m34631g();
        int m34632h2 = this.f18212h.m34632h(2);
        int m34632h3 = this.f18212h.m34632h(2);
        int m34632h4 = this.f18212h.m34632h(2);
        this.f18212h.m34642r(8);
        this.f18217m.m23377q(m23362h, m23361g, m34631g, m34632h, m34632h2, m34632h3, m34632h4);
    }

    /* renamed from: D */
    private void m23344D() {
        StringBuilder sb2;
        String str;
        c cVar = this.f18220p;
        if (cVar.f18261d != (cVar.f18259b * 2) - 1) {
            C11173s.m34963b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f18220p.f18259b * 2) - 1) + ", but current index is " + this.f18220p.f18261d + " (sequence number " + this.f18220p.f18258a + ");");
        }
        C11144d0 c11144d0 = this.f18212h;
        c cVar2 = this.f18220p;
        c11144d0.m34639o(cVar2.f18260c, cVar2.f18261d);
        boolean z10 = false;
        while (true) {
            if (this.f18212h.m34626b() <= 0) {
                break;
            }
            int m34632h = this.f18212h.m34632h(3);
            int m34632h2 = this.f18212h.m34632h(5);
            if (m34632h == 7) {
                this.f18212h.m34642r(2);
                m34632h = this.f18212h.m34632h(6);
                if (m34632h < 7) {
                    C11173s.m34970i("Cea708Decoder", "Invalid extended service number: " + m34632h);
                }
            }
            if (m34632h2 == 0) {
                if (m34632h != 0) {
                    C11173s.m34970i("Cea708Decoder", "serviceNumber is non-zero (" + m34632h + ") when blockSize is 0");
                }
            } else if (m34632h != this.f18215k) {
                this.f18212h.m34643s(m34632h2);
            } else {
                int m34629e = this.f18212h.m34629e() + (m34632h2 * 8);
                while (this.f18212h.m34629e() < m34629e) {
                    int m34632h3 = this.f18212h.m34632h(8);
                    if (m34632h3 == 16) {
                        m34632h3 = this.f18212h.m34632h(8);
                        if (m34632h3 <= 31) {
                            m23350s(m34632h3);
                        } else {
                            if (m34632h3 <= 127) {
                                m23355x(m34632h3);
                            } else if (m34632h3 <= 159) {
                                m23351t(m34632h3);
                            } else if (m34632h3 <= 255) {
                                m23356y(m34632h3);
                            } else {
                                sb2 = new StringBuilder();
                                str = "Invalid extended command: ";
                                sb2.append(str);
                                sb2.append(m34632h3);
                                C11173s.m34970i("Cea708Decoder", sb2.toString());
                            }
                            z10 = true;
                        }
                    } else if (m34632h3 <= 31) {
                        m23348q(m34632h3);
                    } else {
                        if (m34632h3 <= 127) {
                            m23353v(m34632h3);
                        } else if (m34632h3 <= 159) {
                            m23349r(m34632h3);
                        } else if (m34632h3 <= 255) {
                            m23354w(m34632h3);
                        } else {
                            sb2 = new StringBuilder();
                            str = "Invalid base command: ";
                            sb2.append(str);
                            sb2.append(m34632h3);
                            C11173s.m34970i("Cea708Decoder", sb2.toString());
                        }
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            this.f18218n = m23347p();
        }
    }

    /* renamed from: E */
    private void m23345E() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f18216l[i10].m23372l();
        }
    }

    /* renamed from: o */
    private void m23346o() {
        if (this.f18220p == null) {
            return;
        }
        m23344D();
        this.f18220p = null;
    }

    /* renamed from: p */
    private List<C7484b> m23347p() {
        a m23365c;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f18216l[i10].m23370j() && this.f18216l[i10].m23371k() && (m23365c = this.f18216l[i10].m23365c()) != null) {
                arrayList.add(m23365c);
            }
        }
        Collections.sort(arrayList, a.f18222c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f18223a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* renamed from: q */
    private void m23348q(int i10) {
        C11144d0 c11144d0;
        if (i10 != 0) {
            if (i10 == 3) {
                this.f18218n = m23347p();
                return;
            }
            int i11 = 8;
            if (i10 == 8) {
                this.f18217m.m23364b();
                return;
            }
            switch (i10) {
                case 12:
                    m23345E();
                    return;
                case 13:
                    this.f18217m.m23363a('\n');
                    return;
                case 14:
                    return;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        C11173s.m34970i("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        c11144d0 = this.f18212h;
                    } else {
                        if (i10 < 24 || i10 > 31) {
                            C11173s.m34970i("Cea708Decoder", "Invalid C0 command: " + i10);
                            return;
                        }
                        C11173s.m34970i("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                        c11144d0 = this.f18212h;
                        i11 = 16;
                    }
                    c11144d0.m34642r(i11);
                    return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    /* renamed from: r */
    private void m23349r(int i10) {
        b bVar;
        C11144d0 c11144d0;
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
                if (this.f18221q != i13) {
                    this.f18221q = i13;
                    bVar = this.f18216l[i13];
                    this.f18217m = bVar;
                    return;
                }
                return;
            case 136:
                while (i12 <= 8) {
                    if (this.f18212h.m34631g()) {
                        this.f18216l[8 - i12].m23367e();
                    }
                    i12++;
                }
                return;
            case 137:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f18212h.m34631g()) {
                        this.f18216l[8 - i14].m23376p(true);
                    }
                }
                return;
            case 138:
                while (i12 <= 8) {
                    if (this.f18212h.m34631g()) {
                        this.f18216l[8 - i12].m23376p(false);
                    }
                    i12++;
                }
                return;
            case 139:
                for (int i15 = 1; i15 <= 8; i15++) {
                    if (this.f18212h.m34631g()) {
                        this.f18216l[8 - i15].m23376p(!r0.m23371k());
                    }
                }
                return;
            case 140:
                while (i12 <= 8) {
                    if (this.f18212h.m34631g()) {
                        this.f18216l[8 - i12].m23372l();
                    }
                    i12++;
                }
                return;
            case 141:
                this.f18212h.m34642r(8);
                return;
            case 142:
                return;
            case 143:
                m23345E();
                return;
            case 144:
                if (this.f18217m.m23369i()) {
                    m23357z();
                    return;
                }
                c11144d0 = this.f18212h;
                c11144d0.m34642r(i11);
                return;
            case 145:
                if (this.f18217m.m23369i()) {
                    m23341A();
                    return;
                }
                c11144d0 = this.f18212h;
                i11 = 24;
                c11144d0.m34642r(i11);
                return;
            case 146:
                if (this.f18217m.m23369i()) {
                    m23342B();
                    return;
                }
                c11144d0 = this.f18212h;
                c11144d0.m34642r(i11);
                return;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                C11173s.m34970i("Cea708Decoder", "Invalid C1 command: " + i10);
                return;
            case 151:
                if (this.f18217m.m23369i()) {
                    m23343C();
                    return;
                }
                c11144d0 = this.f18212h;
                i11 = 32;
                c11144d0.m34642r(i11);
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
                m23352u(i16);
                if (this.f18221q != i16) {
                    this.f18221q = i16;
                    bVar = this.f18216l[i16];
                    this.f18217m = bVar;
                    return;
                }
                return;
        }
    }

    /* renamed from: s */
    private void m23350s(int i10) {
        C11144d0 c11144d0;
        int i11;
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            c11144d0 = this.f18212h;
            i11 = 8;
        } else if (i10 <= 23) {
            c11144d0 = this.f18212h;
            i11 = 16;
        } else {
            if (i10 > 31) {
                return;
            }
            c11144d0 = this.f18212h;
            i11 = 24;
        }
        c11144d0.m34642r(i11);
    }

    /* renamed from: t */
    private void m23351t(int i10) {
        C11144d0 c11144d0;
        int i11;
        if (i10 <= 135) {
            c11144d0 = this.f18212h;
            i11 = 32;
        } else {
            if (i10 > 143) {
                if (i10 <= 159) {
                    this.f18212h.m34642r(2);
                    this.f18212h.m34642r(this.f18212h.m34632h(6) * 8);
                    return;
                }
                return;
            }
            c11144d0 = this.f18212h;
            i11 = 40;
        }
        c11144d0.m34642r(i11);
    }

    /* renamed from: u */
    private void m23352u(int i10) {
        b bVar = this.f18216l[i10];
        this.f18212h.m34642r(2);
        boolean m34631g = this.f18212h.m34631g();
        boolean m34631g2 = this.f18212h.m34631g();
        boolean m34631g3 = this.f18212h.m34631g();
        int m34632h = this.f18212h.m34632h(3);
        boolean m34631g4 = this.f18212h.m34631g();
        int m34632h2 = this.f18212h.m34632h(7);
        int m34632h3 = this.f18212h.m34632h(8);
        int m34632h4 = this.f18212h.m34632h(4);
        int m34632h5 = this.f18212h.m34632h(4);
        this.f18212h.m34642r(2);
        int m34632h6 = this.f18212h.m34632h(6);
        this.f18212h.m34642r(2);
        bVar.m23368f(m34631g, m34631g2, m34631g3, m34632h, m34631g4, m34632h2, m34632h3, m34632h5, m34632h6, m34632h4, this.f18212h.m34632h(3), this.f18212h.m34632h(3));
    }

    /* renamed from: v */
    private void m23353v(int i10) {
        if (i10 == 127) {
            this.f18217m.m23363a((char) 9835);
        } else {
            this.f18217m.m23363a((char) (i10 & 255));
        }
    }

    /* renamed from: w */
    private void m23354w(int i10) {
        this.f18217m.m23363a((char) (i10 & 255));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0028. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x002b. Please report as an issue. */
    /* renamed from: x */
    private void m23355x(int i10) {
        b bVar;
        char c10 = ' ';
        if (i10 == 32) {
            bVar = this.f18217m;
        } else if (i10 == 33) {
            bVar = this.f18217m;
            c10 = 160;
        } else if (i10 == 37) {
            bVar = this.f18217m;
            c10 = 8230;
        } else if (i10 == 42) {
            bVar = this.f18217m;
            c10 = 352;
        } else if (i10 == 44) {
            bVar = this.f18217m;
            c10 = 338;
        } else if (i10 == 63) {
            bVar = this.f18217m;
            c10 = 376;
        } else if (i10 == 57) {
            bVar = this.f18217m;
            c10 = 8482;
        } else if (i10 == 58) {
            bVar = this.f18217m;
            c10 = 353;
        } else if (i10 == 60) {
            bVar = this.f18217m;
            c10 = 339;
        } else if (i10 != 61) {
            switch (i10) {
                case 48:
                    bVar = this.f18217m;
                    c10 = 9608;
                    break;
                case 49:
                    bVar = this.f18217m;
                    c10 = 8216;
                    break;
                case 50:
                    bVar = this.f18217m;
                    c10 = 8217;
                    break;
                case 51:
                    bVar = this.f18217m;
                    c10 = 8220;
                    break;
                case 52:
                    bVar = this.f18217m;
                    c10 = 8221;
                    break;
                case 53:
                    bVar = this.f18217m;
                    c10 = 8226;
                    break;
                default:
                    switch (i10) {
                        case 118:
                            bVar = this.f18217m;
                            c10 = 8539;
                            break;
                        case 119:
                            bVar = this.f18217m;
                            c10 = 8540;
                            break;
                        case 120:
                            bVar = this.f18217m;
                            c10 = 8541;
                            break;
                        case 121:
                            bVar = this.f18217m;
                            c10 = 8542;
                            break;
                        case 122:
                            bVar = this.f18217m;
                            c10 = 9474;
                            break;
                        case 123:
                            bVar = this.f18217m;
                            c10 = 9488;
                            break;
                        case 124:
                            bVar = this.f18217m;
                            c10 = 9492;
                            break;
                        case 125:
                            bVar = this.f18217m;
                            c10 = 9472;
                            break;
                        case 126:
                            bVar = this.f18217m;
                            c10 = 9496;
                            break;
                        case 127:
                            bVar = this.f18217m;
                            c10 = 9484;
                            break;
                        default:
                            C11173s.m34970i("Cea708Decoder", "Invalid G2 character: " + i10);
                            return;
                    }
            }
        } else {
            bVar = this.f18217m;
            c10 = 8480;
        }
        bVar.m23363a(c10);
    }

    /* renamed from: y */
    private void m23356y(int i10) {
        b bVar;
        char c10;
        if (i10 == 160) {
            bVar = this.f18217m;
            c10 = 13252;
        } else {
            C11173s.m34970i("Cea708Decoder", "Invalid G3 character: " + i10);
            bVar = this.f18217m;
            c10 = '_';
        }
        bVar.m23363a(c10);
    }

    /* renamed from: z */
    private void m23357z() {
        this.f18217m.m23373m(this.f18212h.m34632h(4), this.f18212h.m34632h(2), this.f18212h.m34632h(2), this.f18212h.m34631g(), this.f18212h.m34631g(), this.f18212h.m34632h(3), this.f18212h.m34632h(3));
    }

    @Override // p134h8.AbstractC7668e, p120g8.InterfaceC7492j
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo22790a(long j10) {
        super.mo22790a(j10);
    }

    @Override // p134h8.AbstractC7668e
    /* renamed from: e */
    protected InterfaceC7491i mo23318e() {
        List<C7484b> list = this.f18218n;
        this.f18219o = list;
        return new C7669f((List) C11137a.m34603e(list));
    }

    @Override // p134h8.AbstractC7668e
    /* renamed from: f */
    protected void mo23319f(C7496n c7496n) {
        ByteBuffer byteBuffer = (ByteBuffer) C11137a.m34603e(c7496n.f32142c);
        this.f18211g.m34675S(byteBuffer.array(), byteBuffer.limit());
        while (this.f18211g.m34679a() >= 3) {
            int m34664H = this.f18211g.m34664H() & 7;
            int i10 = m34664H & 3;
            boolean z10 = (m34664H & 4) == 4;
            byte m34664H2 = (byte) this.f18211g.m34664H();
            byte m34664H3 = (byte) this.f18211g.m34664H();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        m23346o();
                        int i11 = (m34664H2 & 192) >> 6;
                        int i12 = this.f18213i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            m23345E();
                            C11173s.m34970i("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f18213i + " current=" + i11);
                        }
                        this.f18213i = i11;
                        int i13 = m34664H2 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        c cVar = new c(i11, i13);
                        this.f18220p = cVar;
                        byte[] bArr = cVar.f18260c;
                        int i14 = cVar.f18261d;
                        cVar.f18261d = i14 + 1;
                        bArr[i14] = m34664H3;
                    } else {
                        C11137a.m34599a(i10 == 2);
                        c cVar2 = this.f18220p;
                        if (cVar2 == null) {
                            C11173s.m34964c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.f18260c;
                            int i15 = cVar2.f18261d;
                            int i16 = i15 + 1;
                            bArr2[i15] = m34664H2;
                            cVar2.f18261d = i16 + 1;
                            bArr2[i16] = m34664H3;
                        }
                    }
                    c cVar3 = this.f18220p;
                    if (cVar3.f18261d == (cVar3.f18259b * 2) - 1) {
                        m23346o();
                    }
                }
            }
        }
    }

    @Override // p134h8.AbstractC7668e, p414w6.InterfaceC12079d
    public void flush() {
        super.flush();
        this.f18218n = null;
        this.f18219o = null;
        this.f18221q = 0;
        this.f18217m = this.f18216l[0];
        m23345E();
        this.f18220p = null;
    }

    @Override // p134h8.AbstractC7668e
    /* renamed from: g */
    public /* bridge */ /* synthetic */ C7496n mo22793d() {
        return super.mo22793d();
    }

    @Override // p134h8.AbstractC7668e
    /* renamed from: h */
    public /* bridge */ /* synthetic */ AbstractC7497o mo22791b() {
        return super.mo22791b();
    }

    @Override // p134h8.AbstractC7668e
    /* renamed from: k */
    protected boolean mo23322k() {
        return this.f18218n != this.f18219o;
    }

    @Override // p134h8.AbstractC7668e
    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo22792c(C7496n c7496n) {
        super.mo22792c(c7496n);
    }

    @Override // p134h8.AbstractC7668e, p414w6.InterfaceC12079d
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }
}

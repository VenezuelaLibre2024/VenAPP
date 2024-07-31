package p119g7;

import android.util.Pair;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.common.collect.AbstractC5907w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p082eb.InterfaceC7151g;
import p119g7.AbstractC7465a;
import p137hb.C7690e;
import p216l7.C9400a;
import p328r7.C10631a;
import p328r7.C10635e;
import p361t6.C11005b3;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p363t8.C11173s;
import p363t8.C11178w;
import p378u8.C11447a;
import p378u8.C11450c;
import p378u8.C11451d;
import p378u8.C11453f;
import p436x6.C12318m;
import p459y6.C12624n;
import p459y6.C12632v;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: g7.b */
/* loaded from: classes.dex */
public final class C7466b {

    /* renamed from: a */
    private static final byte[] f17458a = C11172r0.m34935m0("OpusHead");

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g7.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f17459a;

        /* renamed from: b */
        public int f17460b;

        /* renamed from: c */
        public int f17461c;

        /* renamed from: d */
        public long f17462d;

        /* renamed from: e */
        private final boolean f17463e;

        /* renamed from: f */
        private final C11146e0 f17464f;

        /* renamed from: g */
        private final C11146e0 f17465g;

        /* renamed from: h */
        private int f17466h;

        /* renamed from: i */
        private int f17467i;

        public a(C11146e0 c11146e0, C11146e0 c11146e02, boolean z10) {
            this.f17465g = c11146e0;
            this.f17464f = c11146e02;
            this.f17463e = z10;
            c11146e02.m34677U(12);
            this.f17459a = c11146e02.m34668L();
            c11146e0.m34677U(12);
            this.f17467i = c11146e0.m34668L();
            C12624n.m41564a(c11146e0.m34692q() == 1, "first_chunk must be 1");
            this.f17460b = -1;
        }

        /* renamed from: a */
        public boolean m22627a() {
            int i10 = this.f17460b + 1;
            this.f17460b = i10;
            if (i10 == this.f17459a) {
                return false;
            }
            this.f17462d = this.f17463e ? this.f17464f.m34669M() : this.f17464f.m34666J();
            if (this.f17460b == this.f17466h) {
                this.f17461c = this.f17465g.m34668L();
                this.f17465g.m34678V(4);
                int i11 = this.f17467i - 1;
                this.f17467i = i11;
                this.f17466h = i11 > 0 ? this.f17465g.m34668L() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g7.b$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final String f17468a;

        /* renamed from: b */
        private final byte[] f17469b;

        /* renamed from: c */
        private final long f17470c;

        /* renamed from: d */
        private final long f17471d;

        public b(String str, byte[] bArr, long j10, long j11) {
            this.f17468a = str;
            this.f17469b = bArr;
            this.f17470c = j10;
            this.f17471d = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g7.b$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        int mo22632a();

        /* renamed from: b */
        int mo22633b();

        /* renamed from: c */
        int mo22634c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g7.b$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final C7480p[] f17472a;

        /* renamed from: b */
        public C11108u1 f17473b;

        /* renamed from: c */
        public int f17474c;

        /* renamed from: d */
        public int f17475d = 0;

        public d(int i10) {
            this.f17472a = new C7480p[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g7.b$e */
    /* loaded from: classes.dex */
    public static final class e implements c {

        /* renamed from: a */
        private final int f17476a;

        /* renamed from: b */
        private final int f17477b;

        /* renamed from: c */
        private final C11146e0 f17478c;

        public e(AbstractC7465a.b bVar, C11108u1 c11108u1) {
            C11146e0 c11146e0 = bVar.f17457b;
            this.f17478c = c11146e0;
            c11146e0.m34677U(12);
            int m34668L = c11146e0.m34668L();
            if ("audio/raw".equals(c11108u1.f28797w)) {
                int m34919e0 = C11172r0.m34919e0(c11108u1.f28778L, c11108u1.f28776J);
                if (m34668L == 0 || m34668L % m34919e0 != 0) {
                    C11173s.m34970i("AtomParsers", "Audio sample size mismatch. stsd sample size: " + m34919e0 + ", stsz sample size: " + m34668L);
                    m34668L = m34919e0;
                }
            }
            this.f17476a = m34668L == 0 ? -1 : m34668L;
            this.f17477b = c11146e0.m34668L();
        }

        @Override // p119g7.C7466b.c
        /* renamed from: a */
        public int mo22632a() {
            int i10 = this.f17476a;
            return i10 == -1 ? this.f17478c.m34668L() : i10;
        }

        @Override // p119g7.C7466b.c
        /* renamed from: b */
        public int mo22633b() {
            return this.f17476a;
        }

        @Override // p119g7.C7466b.c
        /* renamed from: c */
        public int mo22634c() {
            return this.f17477b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g7.b$f */
    /* loaded from: classes.dex */
    public static final class f implements c {

        /* renamed from: a */
        private final C11146e0 f17479a;

        /* renamed from: b */
        private final int f17480b;

        /* renamed from: c */
        private final int f17481c;

        /* renamed from: d */
        private int f17482d;

        /* renamed from: e */
        private int f17483e;

        public f(AbstractC7465a.b bVar) {
            C11146e0 c11146e0 = bVar.f17457b;
            this.f17479a = c11146e0;
            c11146e0.m34677U(12);
            this.f17481c = c11146e0.m34668L() & 255;
            this.f17480b = c11146e0.m34668L();
        }

        @Override // p119g7.C7466b.c
        /* renamed from: a */
        public int mo22632a() {
            int i10 = this.f17481c;
            if (i10 == 8) {
                return this.f17479a.m34664H();
            }
            if (i10 == 16) {
                return this.f17479a.m34670N();
            }
            int i11 = this.f17482d;
            this.f17482d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f17483e & 15;
            }
            int m34664H = this.f17479a.m34664H();
            this.f17483e = m34664H;
            return (m34664H & 240) >> 4;
        }

        @Override // p119g7.C7466b.c
        /* renamed from: b */
        public int mo22633b() {
            return -1;
        }

        @Override // p119g7.C7466b.c
        /* renamed from: c */
        public int mo22634c() {
            return this.f17480b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g7.b$g */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a */
        private final int f17484a;

        /* renamed from: b */
        private final long f17485b;

        /* renamed from: c */
        private final int f17486c;

        public g(int i10, long j10, int i11) {
            this.f17484a = i10;
            this.f17485b = j10;
            this.f17486c = i11;
        }
    }

    /* renamed from: A */
    public static List<C7482r> m22597A(AbstractC7465a.a aVar, C12632v c12632v, long j10, C12318m c12318m, boolean z10, boolean z11, InterfaceC7151g<C7479o, C7479o> interfaceC7151g) {
        C7479o apply;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < aVar.f17456d.size(); i10++) {
            AbstractC7465a.a aVar2 = aVar.f17456d.get(i10);
            if (aVar2.f17453a == 1953653099 && (apply = interfaceC7151g.apply(m22626z(aVar2, (AbstractC7465a.b) C11137a.m34603e(aVar.m22596g(1836476516)), j10, c12318m, z10, z11))) != null) {
                arrayList.add(m22622v(apply, (AbstractC7465a.a) C11137a.m34603e(((AbstractC7465a.a) C11137a.m34603e(((AbstractC7465a.a) C11137a.m34603e(aVar2.m22595f(1835297121))).m22595f(1835626086))).m22595f(1937007212)), c12632v));
            }
        }
        return arrayList;
    }

    /* renamed from: B */
    public static Pair<C9400a, C9400a> m22598B(AbstractC7465a.b bVar) {
        C11146e0 c11146e0 = bVar.f17457b;
        c11146e0.m34677U(8);
        C9400a c9400a = null;
        C9400a c9400a2 = null;
        while (c11146e0.m34679a() >= 8) {
            int m34683f = c11146e0.m34683f();
            int m34692q = c11146e0.m34692q();
            int m34692q2 = c11146e0.m34692q();
            if (m34692q2 == 1835365473) {
                c11146e0.m34677U(m34683f);
                c9400a = m22599C(c11146e0, m34683f + m34692q);
            } else if (m34692q2 == 1936553057) {
                c11146e0.m34677U(m34683f);
                c9400a2 = m22621u(c11146e0, m34683f + m34692q);
            }
            c11146e0.m34677U(m34683f + m34692q);
        }
        return Pair.create(c9400a, c9400a2);
    }

    /* renamed from: C */
    private static C9400a m22599C(C11146e0 c11146e0, int i10) {
        c11146e0.m34678V(8);
        m22605e(c11146e0);
        while (c11146e0.m34683f() < i10) {
            int m34683f = c11146e0.m34683f();
            int m34692q = c11146e0.m34692q();
            if (c11146e0.m34692q() == 1768715124) {
                c11146e0.m34677U(m34683f);
                return m22612l(c11146e0, m34683f + m34692q);
            }
            c11146e0.m34677U(m34683f + m34692q);
        }
        return null;
    }

    /* renamed from: D */
    private static void m22600D(C11146e0 c11146e0, int i10, int i11, int i12, int i13, int i14, C12318m c12318m, d dVar, int i15) {
        String str;
        C12318m c12318m2;
        int i16;
        int i17;
        float f10;
        List<byte[]> list;
        int i18;
        int i19;
        int i20;
        String str2;
        int i21 = i11;
        int i22 = i12;
        C12318m c12318m3 = c12318m;
        d dVar2 = dVar;
        c11146e0.m34677U(i21 + 8 + 8);
        c11146e0.m34678V(16);
        int m34670N = c11146e0.m34670N();
        int m34670N2 = c11146e0.m34670N();
        c11146e0.m34678V(50);
        int m34683f = c11146e0.m34683f();
        int i23 = i10;
        if (i23 == 1701733238) {
            Pair<Integer, C7480p> m22619s = m22619s(c11146e0, i21, i22);
            if (m22619s != null) {
                i23 = ((Integer) m22619s.first).intValue();
                c12318m3 = c12318m3 == null ? null : c12318m3.m39839c(((C7480p) m22619s.second).f17605b);
                dVar2.f17472a[i15] = (C7480p) m22619s.second;
            }
            c11146e0.m34677U(m34683f);
        }
        String str3 = "video/3gpp";
        String str4 = i23 == 1831958048 ? "video/mpeg" : i23 == 1211250227 ? "video/3gpp" : null;
        float f11 = 1.0f;
        String str5 = null;
        List<byte[]> list2 = null;
        byte[] bArr = null;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        int i27 = -1;
        ByteBuffer byteBuffer = null;
        b bVar = null;
        boolean z10 = false;
        while (m34683f - i21 < i22) {
            c11146e0.m34677U(m34683f);
            int m34683f2 = c11146e0.m34683f();
            int m34692q = c11146e0.m34692q();
            if (m34692q == 0) {
                str = str3;
                if (c11146e0.m34683f() - i21 == i22) {
                    break;
                }
            } else {
                str = str3;
            }
            C12624n.m41564a(m34692q > 0, "childAtomSize must be positive");
            int m34692q2 = c11146e0.m34692q();
            if (m34692q2 == 1635148611) {
                C12624n.m41564a(str4 == null, null);
                c11146e0.m34677U(m34683f2 + 8);
                C11447a m35769b = C11447a.m35769b(c11146e0);
                list2 = m35769b.f29637a;
                dVar2.f17474c = m35769b.f29638b;
                if (!z10) {
                    f11 = m35769b.f29641e;
                }
                str5 = m35769b.f29642f;
                str2 = "video/avc";
            } else {
                if (m34692q2 == 1752589123) {
                    C12624n.m41564a(str4 == null, null);
                    c11146e0.m34677U(m34683f2 + 8);
                    C11453f m35791a = C11453f.m35791a(c11146e0);
                    list2 = m35791a.f29681a;
                    dVar2.f17474c = m35791a.f29682b;
                    if (!z10) {
                        f11 = m35791a.f29685e;
                    }
                    str5 = m35791a.f29689i;
                    int i28 = m35791a.f29686f;
                    int i29 = m35791a.f29687g;
                    i27 = m35791a.f29688h;
                    c12318m2 = c12318m3;
                    i16 = m34670N2;
                    i25 = i28;
                    i17 = i23;
                    i26 = i29;
                    str4 = "video/hevc";
                } else {
                    if (m34692q2 == 1685480259 || m34692q2 == 1685485123) {
                        c12318m2 = c12318m3;
                        i16 = m34670N2;
                        i17 = i23;
                        f10 = f11;
                        list = list2;
                        i18 = i25;
                        i19 = i26;
                        i20 = i27;
                        C11451d m35776a = C11451d.m35776a(c11146e0);
                        if (m35776a != null) {
                            str5 = m35776a.f29666c;
                            str4 = "video/dolby-vision";
                        }
                    } else if (m34692q2 == 1987076931) {
                        C12624n.m41564a(str4 == null, null);
                        str2 = i23 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                        c11146e0.m34677U(m34683f2 + 12);
                        c11146e0.m34678V(2);
                        boolean z11 = (c11146e0.m34664H() & 1) != 0;
                        int m34664H = c11146e0.m34664H();
                        int m34664H2 = c11146e0.m34664H();
                        i25 = C11450c.m35773c(m34664H);
                        i26 = z11 ? 1 : 2;
                        i27 = C11450c.m35774d(m34664H2);
                    } else if (m34692q2 == 1635135811) {
                        C12624n.m41564a(str4 == null, null);
                        str2 = "video/av01";
                    } else if (m34692q2 == 1668050025) {
                        ByteBuffer m22601a = byteBuffer == null ? m22601a() : byteBuffer;
                        m22601a.position(21);
                        m22601a.putShort(c11146e0.m34660D());
                        m22601a.putShort(c11146e0.m34660D());
                        byteBuffer = m22601a;
                        c12318m2 = c12318m3;
                        i16 = m34670N2;
                        i17 = i23;
                    } else if (m34692q2 == 1835295606) {
                        ByteBuffer m22601a2 = byteBuffer == null ? m22601a() : byteBuffer;
                        short m34660D = c11146e0.m34660D();
                        short m34660D2 = c11146e0.m34660D();
                        short m34660D3 = c11146e0.m34660D();
                        i17 = i23;
                        short m34660D4 = c11146e0.m34660D();
                        short m34660D5 = c11146e0.m34660D();
                        c12318m2 = c12318m3;
                        short m34660D6 = c11146e0.m34660D();
                        List<byte[]> list3 = list2;
                        short m34660D7 = c11146e0.m34660D();
                        float f12 = f11;
                        short m34660D8 = c11146e0.m34660D();
                        long m34666J = c11146e0.m34666J();
                        long m34666J2 = c11146e0.m34666J();
                        i16 = m34670N2;
                        m22601a2.position(1);
                        m22601a2.putShort(m34660D5);
                        m22601a2.putShort(m34660D6);
                        m22601a2.putShort(m34660D);
                        m22601a2.putShort(m34660D2);
                        m22601a2.putShort(m34660D3);
                        m22601a2.putShort(m34660D4);
                        m22601a2.putShort(m34660D7);
                        m22601a2.putShort(m34660D8);
                        m22601a2.putShort((short) (m34666J / 10000));
                        m22601a2.putShort((short) (m34666J2 / 10000));
                        byteBuffer = m22601a2;
                        list2 = list3;
                        f11 = f12;
                    } else {
                        c12318m2 = c12318m3;
                        i16 = m34670N2;
                        i17 = i23;
                        f10 = f11;
                        list = list2;
                        if (m34692q2 == 1681012275) {
                            C12624n.m41564a(str4 == null, null);
                            str4 = str;
                        } else if (m34692q2 == 1702061171) {
                            C12624n.m41564a(str4 == null, null);
                            bVar = m22609i(c11146e0, m34683f2);
                            String str6 = bVar.f17468a;
                            byte[] bArr2 = bVar.f17469b;
                            list2 = bArr2 != null ? AbstractC5907w.m15082w(bArr2) : list;
                            str4 = str6;
                            f11 = f10;
                            m34683f += m34692q;
                            i21 = i11;
                            i22 = i12;
                            dVar2 = dVar;
                            str3 = str;
                            i23 = i17;
                            c12318m3 = c12318m2;
                            m34670N2 = i16;
                        } else if (m34692q2 == 1885434736) {
                            f11 = m22617q(c11146e0, m34683f2);
                            list2 = list;
                            z10 = true;
                            m34683f += m34692q;
                            i21 = i11;
                            i22 = i12;
                            dVar2 = dVar;
                            str3 = str;
                            i23 = i17;
                            c12318m3 = c12318m2;
                            m34670N2 = i16;
                        } else if (m34692q2 == 1937126244) {
                            bArr = m22618r(c11146e0, m34683f2, m34692q);
                        } else if (m34692q2 == 1936995172) {
                            int m34664H3 = c11146e0.m34664H();
                            c11146e0.m34678V(3);
                            if (m34664H3 == 0) {
                                int m34664H4 = c11146e0.m34664H();
                                if (m34664H4 == 0) {
                                    i24 = 0;
                                } else if (m34664H4 == 1) {
                                    i24 = 1;
                                } else if (m34664H4 == 2) {
                                    i24 = 2;
                                } else if (m34664H4 == 3) {
                                    i24 = 3;
                                }
                            }
                        } else {
                            i18 = i25;
                            if (m34692q2 == 1668246642) {
                                i19 = i26;
                                if (i18 == -1) {
                                    i20 = i27;
                                    if (i19 == -1 && i20 == -1) {
                                        int m34692q3 = c11146e0.m34692q();
                                        if (m34692q3 == 1852009592 || m34692q3 == 1852009571) {
                                            int m34670N3 = c11146e0.m34670N();
                                            int m34670N4 = c11146e0.m34670N();
                                            c11146e0.m34678V(2);
                                            boolean z12 = m34692q == 19 && (c11146e0.m34664H() & RecognitionOptions.ITF) != 0;
                                            i25 = C11450c.m35773c(m34670N3);
                                            i26 = z12 ? 1 : 2;
                                            i27 = C11450c.m35774d(m34670N4);
                                        } else {
                                            C11173s.m34970i("AtomParsers", "Unsupported color type: " + AbstractC7465a.m22590a(m34692q3));
                                        }
                                    }
                                }
                            } else {
                                i19 = i26;
                            }
                            i20 = i27;
                        }
                        list2 = list;
                        f11 = f10;
                        m34683f += m34692q;
                        i21 = i11;
                        i22 = i12;
                        dVar2 = dVar;
                        str3 = str;
                        i23 = i17;
                        c12318m3 = c12318m2;
                        m34670N2 = i16;
                    }
                    i26 = i19;
                    i27 = i20;
                    i25 = i18;
                    list2 = list;
                    f11 = f10;
                    m34683f += m34692q;
                    i21 = i11;
                    i22 = i12;
                    dVar2 = dVar;
                    str3 = str;
                    i23 = i17;
                    c12318m3 = c12318m2;
                    m34670N2 = i16;
                }
                m34683f += m34692q;
                i21 = i11;
                i22 = i12;
                dVar2 = dVar;
                str3 = str;
                i23 = i17;
                c12318m3 = c12318m2;
                m34670N2 = i16;
            }
            str4 = str2;
            c12318m2 = c12318m3;
            i16 = m34670N2;
            i17 = i23;
            m34683f += m34692q;
            i21 = i11;
            i22 = i12;
            dVar2 = dVar;
            str3 = str;
            i23 = i17;
            c12318m3 = c12318m2;
            m34670N2 = i16;
        }
        C12318m c12318m4 = c12318m3;
        int i30 = m34670N2;
        float f13 = f11;
        List<byte[]> list4 = list2;
        int i31 = i25;
        int i32 = i26;
        int i33 = i27;
        if (str4 == null) {
            return;
        }
        C11108u1.b m34534O = new C11108u1.b().m34539T(i13).m34552g0(str4).m34530K(str5).m34559n0(m34670N).m34538S(i30).m34548c0(f13).m34551f0(i14).m34549d0(bArr).m34555j0(i24).m34541V(list4).m34534O(c12318m4);
        if (i31 != -1 || i32 != -1 || i33 != -1 || byteBuffer != null) {
            m34534O.m34531L(new C11450c(i31, i32, i33, byteBuffer != null ? byteBuffer.array() : null));
        }
        if (bVar != null) {
            m34534O.m34528I(C7690e.m23420k(bVar.f17470c)).m34547b0(C7690e.m23420k(bVar.f17471d));
        }
        dVar.f17473b = m34534O.m34526G();
    }

    /* renamed from: a */
    private static ByteBuffer m22601a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: b */
    private static boolean m22602b(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[C11172r0.m34942q(4, 0, length)] && jArr[C11172r0.m34942q(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    /* renamed from: c */
    private static int m22603c(C11146e0 c11146e0, int i10, int i11, int i12) {
        int m34683f = c11146e0.m34683f();
        C12624n.m41564a(m34683f >= i11, null);
        while (m34683f - i11 < i12) {
            c11146e0.m34677U(m34683f);
            int m34692q = c11146e0.m34692q();
            C12624n.m41564a(m34692q > 0, "childAtomSize must be positive");
            if (c11146e0.m34692q() == i10) {
                return m34683f;
            }
            m34683f += m34692q;
        }
        return -1;
    }

    /* renamed from: d */
    private static int m22604d(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    /* renamed from: e */
    public static void m22605e(C11146e0 c11146e0) {
        int m34683f = c11146e0.m34683f();
        c11146e0.m34678V(4);
        if (c11146e0.m34692q() != 1751411826) {
            m34683f += 4;
        }
        c11146e0.m34677U(m34683f);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0167  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m22606f(p363t8.C11146e0 r22, int r23, int r24, int r25, int r26, java.lang.String r27, boolean r28, p436x6.C12318m r29, p119g7.C7466b.d r30, int r31) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p119g7.C7466b.m22606f(t8.e0, int, int, int, int, java.lang.String, boolean, x6.m, g7.b$d, int):void");
    }

    /* renamed from: g */
    static Pair<Integer, C7480p> m22607g(C11146e0 c11146e0, int i10, int i11) {
        int i12 = i10 + 8;
        int i13 = -1;
        int i14 = 0;
        String str = null;
        Integer num = null;
        while (i12 - i10 < i11) {
            c11146e0.m34677U(i12);
            int m34692q = c11146e0.m34692q();
            int m34692q2 = c11146e0.m34692q();
            if (m34692q2 == 1718775137) {
                num = Integer.valueOf(c11146e0.m34692q());
            } else if (m34692q2 == 1935894637) {
                c11146e0.m34678V(4);
                str = c11146e0.m34661E(4);
            } else if (m34692q2 == 1935894633) {
                i13 = i12;
                i14 = m34692q;
            }
            i12 += m34692q;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        C12624n.m41564a(num != null, "frma atom is mandatory");
        C12624n.m41564a(i13 != -1, "schi atom is mandatory");
        C7480p m22620t = m22620t(c11146e0, i13, i14, str);
        C12624n.m41564a(m22620t != null, "tenc atom is mandatory");
        return Pair.create(num, (C7480p) C11172r0.m34928j(m22620t));
    }

    /* renamed from: h */
    private static Pair<long[], long[]> m22608h(AbstractC7465a.a aVar) {
        AbstractC7465a.b m22596g = aVar.m22596g(1701606260);
        if (m22596g == null) {
            return null;
        }
        C11146e0 c11146e0 = m22596g.f17457b;
        c11146e0.m34677U(8);
        int m22592c = AbstractC7465a.m22592c(c11146e0.m34692q());
        int m34668L = c11146e0.m34668L();
        long[] jArr = new long[m34668L];
        long[] jArr2 = new long[m34668L];
        for (int i10 = 0; i10 < m34668L; i10++) {
            jArr[i10] = m22592c == 1 ? c11146e0.m34669M() : c11146e0.m34666J();
            jArr2[i10] = m22592c == 1 ? c11146e0.m34657A() : c11146e0.m34692q();
            if (c11146e0.m34660D() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            c11146e0.m34678V(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* renamed from: i */
    private static b m22609i(C11146e0 c11146e0, int i10) {
        c11146e0.m34677U(i10 + 8 + 4);
        c11146e0.m34678V(1);
        m22610j(c11146e0);
        c11146e0.m34678V(2);
        int m34664H = c11146e0.m34664H();
        if ((m34664H & RecognitionOptions.ITF) != 0) {
            c11146e0.m34678V(2);
        }
        if ((m34664H & 64) != 0) {
            c11146e0.m34678V(c11146e0.m34664H());
        }
        if ((m34664H & 32) != 0) {
            c11146e0.m34678V(2);
        }
        c11146e0.m34678V(1);
        m22610j(c11146e0);
        String m35000h = C11178w.m35000h(c11146e0.m34664H());
        if ("audio/mpeg".equals(m35000h) || "audio/vnd.dts".equals(m35000h) || "audio/vnd.dts.hd".equals(m35000h)) {
            return new b(m35000h, null, -1L, -1L);
        }
        c11146e0.m34678V(4);
        long m34666J = c11146e0.m34666J();
        long m34666J2 = c11146e0.m34666J();
        c11146e0.m34678V(1);
        int m22610j = m22610j(c11146e0);
        byte[] bArr = new byte[m22610j];
        c11146e0.m34688l(bArr, 0, m22610j);
        return new b(m35000h, bArr, m34666J2 > 0 ? m34666J2 : -1L, m34666J > 0 ? m34666J : -1L);
    }

    /* renamed from: j */
    private static int m22610j(C11146e0 c11146e0) {
        int m34664H = c11146e0.m34664H();
        int i10 = m34664H & 127;
        while ((m34664H & RecognitionOptions.ITF) == 128) {
            m34664H = c11146e0.m34664H();
            i10 = (i10 << 7) | (m34664H & 127);
        }
        return i10;
    }

    /* renamed from: k */
    private static int m22611k(C11146e0 c11146e0) {
        c11146e0.m34677U(16);
        return c11146e0.m34692q();
    }

    /* renamed from: l */
    private static C9400a m22612l(C11146e0 c11146e0, int i10) {
        c11146e0.m34678V(8);
        ArrayList arrayList = new ArrayList();
        while (c11146e0.m34683f() < i10) {
            C9400a.b m22693c = C7472h.m22693c(c11146e0);
            if (m22693c != null) {
                arrayList.add(m22693c);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C9400a(arrayList);
    }

    /* renamed from: m */
    private static Pair<Long, String> m22613m(C11146e0 c11146e0) {
        c11146e0.m34677U(8);
        int m22592c = AbstractC7465a.m22592c(c11146e0.m34692q());
        c11146e0.m34678V(m22592c == 0 ? 8 : 16);
        long m34666J = c11146e0.m34666J();
        c11146e0.m34678V(m22592c == 0 ? 4 : 8);
        int m34670N = c11146e0.m34670N();
        return Pair.create(Long.valueOf(m34666J), "" + ((char) (((m34670N >> 10) & 31) + 96)) + ((char) (((m34670N >> 5) & 31) + 96)) + ((char) ((m34670N & 31) + 96)));
    }

    /* renamed from: n */
    public static C9400a m22614n(AbstractC7465a.a aVar) {
        AbstractC7465a.b m22596g = aVar.m22596g(1751411826);
        AbstractC7465a.b m22596g2 = aVar.m22596g(1801812339);
        AbstractC7465a.b m22596g3 = aVar.m22596g(1768715124);
        if (m22596g == null || m22596g2 == null || m22596g3 == null || m22611k(m22596g.f17457b) != 1835299937) {
            return null;
        }
        C11146e0 c11146e0 = m22596g2.f17457b;
        c11146e0.m34677U(12);
        int m34692q = c11146e0.m34692q();
        String[] strArr = new String[m34692q];
        for (int i10 = 0; i10 < m34692q; i10++) {
            int m34692q2 = c11146e0.m34692q();
            c11146e0.m34678V(4);
            strArr[i10] = c11146e0.m34661E(m34692q2 - 8);
        }
        C11146e0 c11146e02 = m22596g3.f17457b;
        c11146e02.m34677U(8);
        ArrayList arrayList = new ArrayList();
        while (c11146e02.m34679a() > 8) {
            int m34683f = c11146e02.m34683f();
            int m34692q3 = c11146e02.m34692q();
            int m34692q4 = c11146e02.m34692q() - 1;
            if (m34692q4 < 0 || m34692q4 >= m34692q) {
                C11173s.m34970i("AtomParsers", "Skipped metadata with unknown key index: " + m34692q4);
            } else {
                C10631a m22696f = C7472h.m22696f(c11146e02, m34683f + m34692q3, strArr[m34692q4]);
                if (m22696f != null) {
                    arrayList.add(m22696f);
                }
            }
            c11146e02.m34677U(m34683f + m34692q3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C9400a(arrayList);
    }

    /* renamed from: o */
    private static void m22615o(C11146e0 c11146e0, int i10, int i11, int i12, d dVar) {
        c11146e0.m34677U(i11 + 8 + 8);
        if (i10 == 1835365492) {
            c11146e0.m34658B();
            String m34658B = c11146e0.m34658B();
            if (m34658B != null) {
                dVar.f17473b = new C11108u1.b().m34539T(i12).m34552g0(m34658B).m34526G();
            }
        }
    }

    /* renamed from: p */
    private static long m22616p(C11146e0 c11146e0) {
        c11146e0.m34677U(8);
        c11146e0.m34678V(AbstractC7465a.m22592c(c11146e0.m34692q()) != 0 ? 16 : 8);
        return c11146e0.m34666J();
    }

    /* renamed from: q */
    private static float m22617q(C11146e0 c11146e0, int i10) {
        c11146e0.m34677U(i10 + 8);
        return c11146e0.m34668L() / c11146e0.m34668L();
    }

    /* renamed from: r */
    private static byte[] m22618r(C11146e0 c11146e0, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            c11146e0.m34677U(i12);
            int m34692q = c11146e0.m34692q();
            if (c11146e0.m34692q() == 1886547818) {
                return Arrays.copyOfRange(c11146e0.m34682e(), i12, m34692q + i12);
            }
            i12 += m34692q;
        }
        return null;
    }

    /* renamed from: s */
    private static Pair<Integer, C7480p> m22619s(C11146e0 c11146e0, int i10, int i11) {
        Pair<Integer, C7480p> m22607g;
        int m34683f = c11146e0.m34683f();
        while (m34683f - i10 < i11) {
            c11146e0.m34677U(m34683f);
            int m34692q = c11146e0.m34692q();
            C12624n.m41564a(m34692q > 0, "childAtomSize must be positive");
            if (c11146e0.m34692q() == 1936289382 && (m22607g = m22607g(c11146e0, m34683f, m34692q)) != null) {
                return m22607g;
            }
            m34683f += m34692q;
        }
        return null;
    }

    /* renamed from: t */
    private static C7480p m22620t(C11146e0 c11146e0, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            c11146e0.m34677U(i14);
            int m34692q = c11146e0.m34692q();
            if (c11146e0.m34692q() == 1952804451) {
                int m22592c = AbstractC7465a.m22592c(c11146e0.m34692q());
                c11146e0.m34678V(1);
                if (m22592c == 0) {
                    c11146e0.m34678V(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int m34664H = c11146e0.m34664H();
                    i12 = m34664H & 15;
                    i13 = (m34664H & 240) >> 4;
                }
                boolean z10 = c11146e0.m34664H() == 1;
                int m34664H2 = c11146e0.m34664H();
                byte[] bArr2 = new byte[16];
                c11146e0.m34688l(bArr2, 0, 16);
                if (z10 && m34664H2 == 0) {
                    int m34664H3 = c11146e0.m34664H();
                    bArr = new byte[m34664H3];
                    c11146e0.m34688l(bArr, 0, m34664H3);
                }
                return new C7480p(z10, str, m34664H2, bArr2, i13, i12, bArr);
            }
            i14 += m34692q;
        }
    }

    /* renamed from: u */
    private static C9400a m22621u(C11146e0 c11146e0, int i10) {
        c11146e0.m34678V(12);
        while (c11146e0.m34683f() < i10) {
            int m34683f = c11146e0.m34683f();
            int m34692q = c11146e0.m34692q();
            if (c11146e0.m34692q() == 1935766900) {
                if (m34692q < 14) {
                    return null;
                }
                c11146e0.m34678V(5);
                int m34664H = c11146e0.m34664H();
                if (m34664H != 12 && m34664H != 13) {
                    return null;
                }
                float f10 = m34664H == 12 ? 240.0f : 120.0f;
                c11146e0.m34678V(1);
                return new C9400a(new C10635e(f10, c11146e0.m34664H()));
            }
            c11146e0.m34677U(m34683f + m34692q);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0426 A[EDGE_INSN: B:97:0x0426->B:98:0x0426 BREAK  A[LOOP:2: B:76:0x03c5->B:92:0x041f], SYNTHETIC] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p119g7.C7482r m22622v(p119g7.C7479o r38, p119g7.AbstractC7465a.a r39, p459y6.C12632v r40) {
        /*
            Method dump skipped, instructions count: 1308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p119g7.C7466b.m22622v(g7.o, g7.a$a, y6.v):g7.r");
    }

    /* renamed from: w */
    private static d m22623w(C11146e0 c11146e0, int i10, int i11, String str, C12318m c12318m, boolean z10) {
        int i12;
        c11146e0.m34677U(12);
        int m34692q = c11146e0.m34692q();
        d dVar = new d(m34692q);
        for (int i13 = 0; i13 < m34692q; i13++) {
            int m34683f = c11146e0.m34683f();
            int m34692q2 = c11146e0.m34692q();
            C12624n.m41564a(m34692q2 > 0, "childAtomSize must be positive");
            int m34692q3 = c11146e0.m34692q();
            if (m34692q3 == 1635148593 || m34692q3 == 1635148595 || m34692q3 == 1701733238 || m34692q3 == 1831958048 || m34692q3 == 1836070006 || m34692q3 == 1752589105 || m34692q3 == 1751479857 || m34692q3 == 1932670515 || m34692q3 == 1211250227 || m34692q3 == 1987063864 || m34692q3 == 1987063865 || m34692q3 == 1635135537 || m34692q3 == 1685479798 || m34692q3 == 1685479729 || m34692q3 == 1685481573 || m34692q3 == 1685481521) {
                i12 = m34683f;
                m22600D(c11146e0, m34692q3, i12, m34692q2, i10, i11, c12318m, dVar, i13);
            } else if (m34692q3 == 1836069985 || m34692q3 == 1701733217 || m34692q3 == 1633889587 || m34692q3 == 1700998451 || m34692q3 == 1633889588 || m34692q3 == 1835823201 || m34692q3 == 1685353315 || m34692q3 == 1685353317 || m34692q3 == 1685353320 || m34692q3 == 1685353324 || m34692q3 == 1685353336 || m34692q3 == 1935764850 || m34692q3 == 1935767394 || m34692q3 == 1819304813 || m34692q3 == 1936684916 || m34692q3 == 1953984371 || m34692q3 == 778924082 || m34692q3 == 778924083 || m34692q3 == 1835557169 || m34692q3 == 1835560241 || m34692q3 == 1634492771 || m34692q3 == 1634492791 || m34692q3 == 1970037111 || m34692q3 == 1332770163 || m34692q3 == 1716281667) {
                i12 = m34683f;
                m22606f(c11146e0, m34692q3, m34683f, m34692q2, i10, str, z10, c12318m, dVar, i13);
            } else {
                if (m34692q3 == 1414810956 || m34692q3 == 1954034535 || m34692q3 == 2004251764 || m34692q3 == 1937010800 || m34692q3 == 1664495672) {
                    m22624x(c11146e0, m34692q3, m34683f, m34692q2, i10, str, dVar);
                } else if (m34692q3 == 1835365492) {
                    m22615o(c11146e0, m34692q3, m34683f, i10, dVar);
                } else if (m34692q3 == 1667329389) {
                    dVar.f17473b = new C11108u1.b().m34539T(i10).m34552g0("application/x-camera-motion").m34526G();
                }
                i12 = m34683f;
            }
            c11146e0.m34677U(i12 + m34692q2);
        }
        return dVar;
    }

    /* renamed from: x */
    private static void m22624x(C11146e0 c11146e0, int i10, int i11, int i12, int i13, String str, d dVar) {
        c11146e0.m34677U(i11 + 8 + 8);
        String str2 = "application/ttml+xml";
        AbstractC5907w abstractC5907w = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = (i12 - 8) - 8;
                byte[] bArr = new byte[i14];
                c11146e0.m34688l(bArr, 0, i14);
                abstractC5907w = AbstractC5907w.m15082w(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else {
                if (i10 != 1664495672) {
                    throw new IllegalStateException();
                }
                dVar.f17475d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        dVar.f17473b = new C11108u1.b().m34539T(i13).m34552g0(str2).m34543X(str).m34556k0(j10).m34541V(abstractC5907w).m34526G();
    }

    /* renamed from: y */
    private static g m22625y(C11146e0 c11146e0) {
        boolean z10;
        c11146e0.m34677U(8);
        int m22592c = AbstractC7465a.m22592c(c11146e0.m34692q());
        c11146e0.m34678V(m22592c == 0 ? 8 : 16);
        int m34692q = c11146e0.m34692q();
        c11146e0.m34678V(4);
        int m34683f = c11146e0.m34683f();
        int i10 = m22592c == 0 ? 4 : 8;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= i10) {
                z10 = true;
                break;
            }
            if (c11146e0.m34682e()[m34683f + i12] != -1) {
                z10 = false;
                break;
            }
            i12++;
        }
        long j10 = -9223372036854775807L;
        if (z10) {
            c11146e0.m34678V(i10);
        } else {
            long m34666J = m22592c == 0 ? c11146e0.m34666J() : c11146e0.m34669M();
            if (m34666J != 0) {
                j10 = m34666J;
            }
        }
        c11146e0.m34678V(16);
        int m34692q2 = c11146e0.m34692q();
        int m34692q3 = c11146e0.m34692q();
        c11146e0.m34678V(4);
        int m34692q4 = c11146e0.m34692q();
        int m34692q5 = c11146e0.m34692q();
        if (m34692q2 == 0 && m34692q3 == 65536 && m34692q4 == -65536 && m34692q5 == 0) {
            i11 = 90;
        } else if (m34692q2 == 0 && m34692q3 == -65536 && m34692q4 == 65536 && m34692q5 == 0) {
            i11 = 270;
        } else if (m34692q2 == -65536 && m34692q3 == 0 && m34692q4 == 0 && m34692q5 == -65536) {
            i11 = 180;
        }
        return new g(m34692q, j10, i11);
    }

    /* renamed from: z */
    private static C7479o m22626z(AbstractC7465a.a aVar, AbstractC7465a.b bVar, long j10, C12318m c12318m, boolean z10, boolean z11) {
        AbstractC7465a.b bVar2;
        long j11;
        long[] jArr;
        long[] jArr2;
        AbstractC7465a.a m22595f;
        Pair<long[], long[]> m22608h;
        AbstractC7465a.a aVar2 = (AbstractC7465a.a) C11137a.m34603e(aVar.m22595f(1835297121));
        int m22604d = m22604d(m22611k(((AbstractC7465a.b) C11137a.m34603e(aVar2.m22596g(1751411826))).f17457b));
        if (m22604d == -1) {
            return null;
        }
        g m22625y = m22625y(((AbstractC7465a.b) C11137a.m34603e(aVar.m22596g(1953196132))).f17457b);
        if (j10 == -9223372036854775807L) {
            bVar2 = bVar;
            j11 = m22625y.f17485b;
        } else {
            bVar2 = bVar;
            j11 = j10;
        }
        long m22616p = m22616p(bVar2.f17457b);
        long m34885O0 = j11 != -9223372036854775807L ? C11172r0.m34885O0(j11, 1000000L, m22616p) : -9223372036854775807L;
        AbstractC7465a.a aVar3 = (AbstractC7465a.a) C11137a.m34603e(((AbstractC7465a.a) C11137a.m34603e(aVar2.m22595f(1835626086))).m22595f(1937007212));
        Pair<Long, String> m22613m = m22613m(((AbstractC7465a.b) C11137a.m34603e(aVar2.m22596g(1835296868))).f17457b);
        AbstractC7465a.b m22596g = aVar3.m22596g(1937011556);
        if (m22596g == null) {
            throw C11005b3.m33715a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        d m22623w = m22623w(m22596g.f17457b, m22625y.f17484a, m22625y.f17486c, (String) m22613m.second, c12318m, z11);
        if (z10 || (m22595f = aVar.m22595f(1701082227)) == null || (m22608h = m22608h(m22595f)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) m22608h.first;
            jArr2 = (long[]) m22608h.second;
            jArr = jArr3;
        }
        if (m22623w.f17473b == null) {
            return null;
        }
        return new C7479o(m22625y.f17484a, m22604d, ((Long) m22613m.first).longValue(), m22616p, m34885O0, m22623w.f17473b, m22623w.f17475d, m22623w.f17472a, m22623w.f17474c, jArr, jArr2);
    }
}

package p078e7;

import android.util.Pair;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import p361t6.C11005b3;
import p361t6.C11081p;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p363t8.C11173s;
import p363t8.C11175t;
import p363t8.C11179x;
import p378u8.C11450c;
import p436x6.C12318m;
import p459y6.C12610c;
import p459y6.C12611c0;
import p459y6.C12635y;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12621k;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12623m;
import p459y6.InterfaceC12626p;
import p459y6.InterfaceC12636z;

/* renamed from: e7.e */
/* loaded from: classes.dex */
public class C7131e implements InterfaceC12621k {

    /* renamed from: c0 */
    public static final InterfaceC12626p f15888c0 = new InterfaceC12626p() { // from class: e7.d
        @Override // p459y6.InterfaceC12626p
        /* renamed from: c */
        public final InterfaceC12621k[] mo9153c() {
            InterfaceC12621k[] m21095A;
            m21095A = C7131e.m21095A();
            return m21095A;
        }
    };

    /* renamed from: d0 */
    private static final byte[] f15889d0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: e0 */
    private static final byte[] f15890e0 = C11172r0.m34935m0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: f0 */
    private static final byte[] f15891f0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: g0 */
    private static final byte[] f15892g0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: h0 */
    private static final UUID f15893h0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: i0 */
    private static final Map<String, Integer> f15894i0;

    /* renamed from: A */
    private long f15895A;

    /* renamed from: B */
    private long f15896B;

    /* renamed from: C */
    private C11175t f15897C;

    /* renamed from: D */
    private C11175t f15898D;

    /* renamed from: E */
    private boolean f15899E;

    /* renamed from: F */
    private boolean f15900F;

    /* renamed from: G */
    private int f15901G;

    /* renamed from: H */
    private long f15902H;

    /* renamed from: I */
    private long f15903I;

    /* renamed from: J */
    private int f15904J;

    /* renamed from: K */
    private int f15905K;

    /* renamed from: L */
    private int[] f15906L;

    /* renamed from: M */
    private int f15907M;

    /* renamed from: N */
    private int f15908N;

    /* renamed from: O */
    private int f15909O;

    /* renamed from: P */
    private int f15910P;

    /* renamed from: Q */
    private boolean f15911Q;

    /* renamed from: R */
    private long f15912R;

    /* renamed from: S */
    private int f15913S;

    /* renamed from: T */
    private int f15914T;

    /* renamed from: U */
    private int f15915U;

    /* renamed from: V */
    private boolean f15916V;

    /* renamed from: W */
    private boolean f15917W;

    /* renamed from: X */
    private boolean f15918X;

    /* renamed from: Y */
    private int f15919Y;

    /* renamed from: Z */
    private byte f15920Z;

    /* renamed from: a */
    private final InterfaceC7129c f15921a;

    /* renamed from: a0 */
    private boolean f15922a0;

    /* renamed from: b */
    private final C7133g f15923b;

    /* renamed from: b0 */
    private InterfaceC12623m f15924b0;

    /* renamed from: c */
    private final SparseArray<c> f15925c;

    /* renamed from: d */
    private final boolean f15926d;

    /* renamed from: e */
    private final C11146e0 f15927e;

    /* renamed from: f */
    private final C11146e0 f15928f;

    /* renamed from: g */
    private final C11146e0 f15929g;

    /* renamed from: h */
    private final C11146e0 f15930h;

    /* renamed from: i */
    private final C11146e0 f15931i;

    /* renamed from: j */
    private final C11146e0 f15932j;

    /* renamed from: k */
    private final C11146e0 f15933k;

    /* renamed from: l */
    private final C11146e0 f15934l;

    /* renamed from: m */
    private final C11146e0 f15935m;

    /* renamed from: n */
    private final C11146e0 f15936n;

    /* renamed from: o */
    private ByteBuffer f15937o;

    /* renamed from: p */
    private long f15938p;

    /* renamed from: q */
    private long f15939q;

    /* renamed from: r */
    private long f15940r;

    /* renamed from: s */
    private long f15941s;

    /* renamed from: t */
    private long f15942t;

    /* renamed from: u */
    private c f15943u;

    /* renamed from: v */
    private boolean f15944v;

    /* renamed from: w */
    private int f15945w;

    /* renamed from: x */
    private long f15946x;

    /* renamed from: y */
    private boolean f15947y;

    /* renamed from: z */
    private long f15948z;

    /* renamed from: e7.e$b */
    /* loaded from: classes.dex */
    private final class b implements InterfaceC7128b {
        private b() {
        }

        @Override // p078e7.InterfaceC7128b
        /* renamed from: a */
        public void mo21087a(int i10) {
            C7131e.this.m21121o(i10);
        }

        @Override // p078e7.InterfaceC7128b
        /* renamed from: b */
        public void mo21088b(int i10, double d10) {
            C7131e.this.m21122r(i10, d10);
        }

        @Override // p078e7.InterfaceC7128b
        /* renamed from: c */
        public void mo21089c(int i10, int i11, InterfaceC12622l interfaceC12622l) {
            C7131e.this.m21120l(i10, i11, interfaceC12622l);
        }

        @Override // p078e7.InterfaceC7128b
        /* renamed from: d */
        public void mo21090d(int i10, long j10) {
            C7131e.this.m21127x(i10, j10);
        }

        @Override // p078e7.InterfaceC7128b
        /* renamed from: e */
        public int mo21091e(int i10) {
            return C7131e.this.m21124u(i10);
        }

        @Override // p078e7.InterfaceC7128b
        /* renamed from: f */
        public boolean mo21092f(int i10) {
            return C7131e.this.m21128z(i10);
        }

        @Override // p078e7.InterfaceC7128b
        /* renamed from: g */
        public void mo21093g(int i10, String str) {
            C7131e.this.m21119H(i10, str);
        }

        @Override // p078e7.InterfaceC7128b
        /* renamed from: h */
        public void mo21094h(int i10, long j10, long j11) {
            C7131e.this.m21118G(i10, j10, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e7.e$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: N */
        public byte[] f15963N;

        /* renamed from: T */
        public C12611c0 f15969T;

        /* renamed from: U */
        public boolean f15970U;

        /* renamed from: X */
        public InterfaceC12609b0 f15973X;

        /* renamed from: Y */
        public int f15974Y;

        /* renamed from: a */
        public String f15975a;

        /* renamed from: b */
        public String f15976b;

        /* renamed from: c */
        public int f15977c;

        /* renamed from: d */
        public int f15978d;

        /* renamed from: e */
        public int f15979e;

        /* renamed from: f */
        public int f15980f;

        /* renamed from: g */
        private int f15981g;

        /* renamed from: h */
        public boolean f15982h;

        /* renamed from: i */
        public byte[] f15983i;

        /* renamed from: j */
        public InterfaceC12609b0.a f15984j;

        /* renamed from: k */
        public byte[] f15985k;

        /* renamed from: l */
        public C12318m f15986l;

        /* renamed from: m */
        public int f15987m = -1;

        /* renamed from: n */
        public int f15988n = -1;

        /* renamed from: o */
        public int f15989o = -1;

        /* renamed from: p */
        public int f15990p = -1;

        /* renamed from: q */
        public int f15991q = 0;

        /* renamed from: r */
        public int f15992r = -1;

        /* renamed from: s */
        public float f15993s = 0.0f;

        /* renamed from: t */
        public float f15994t = 0.0f;

        /* renamed from: u */
        public float f15995u = 0.0f;

        /* renamed from: v */
        public byte[] f15996v = null;

        /* renamed from: w */
        public int f15997w = -1;

        /* renamed from: x */
        public boolean f15998x = false;

        /* renamed from: y */
        public int f15999y = -1;

        /* renamed from: z */
        public int f16000z = -1;

        /* renamed from: A */
        public int f15950A = -1;

        /* renamed from: B */
        public int f15951B = AdError.NETWORK_ERROR_CODE;

        /* renamed from: C */
        public int f15952C = 200;

        /* renamed from: D */
        public float f15953D = -1.0f;

        /* renamed from: E */
        public float f15954E = -1.0f;

        /* renamed from: F */
        public float f15955F = -1.0f;

        /* renamed from: G */
        public float f15956G = -1.0f;

        /* renamed from: H */
        public float f15957H = -1.0f;

        /* renamed from: I */
        public float f15958I = -1.0f;

        /* renamed from: J */
        public float f15959J = -1.0f;

        /* renamed from: K */
        public float f15960K = -1.0f;

        /* renamed from: L */
        public float f15961L = -1.0f;

        /* renamed from: M */
        public float f15962M = -1.0f;

        /* renamed from: O */
        public int f15964O = 1;

        /* renamed from: P */
        public int f15965P = -1;

        /* renamed from: Q */
        public int f15966Q = 8000;

        /* renamed from: R */
        public long f15967R = 0;

        /* renamed from: S */
        public long f15968S = 0;

        /* renamed from: V */
        public boolean f15971V = true;

        /* renamed from: W */
        private String f15972W = "eng";

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m21134f() {
            C11137a.m34603e(this.f15973X);
        }

        /* renamed from: g */
        private byte[] m21135g(String str) {
            byte[] bArr = this.f15985k;
            if (bArr != null) {
                return bArr;
            }
            throw C11005b3.m33715a("Missing CodecPrivate for codec " + str, null);
        }

        /* renamed from: h */
        private byte[] m21136h() {
            if (this.f15953D == -1.0f || this.f15954E == -1.0f || this.f15955F == -1.0f || this.f15956G == -1.0f || this.f15957H == -1.0f || this.f15958I == -1.0f || this.f15959J == -1.0f || this.f15960K == -1.0f || this.f15961L == -1.0f || this.f15962M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((this.f15953D * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f15954E * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f15955F * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f15956G * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f15957H * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f15958I * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f15959J * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f15960K * 50000.0f) + 0.5f));
            order.putShort((short) (this.f15961L + 0.5f));
            order.putShort((short) (this.f15962M + 0.5f));
            order.putShort((short) this.f15951B);
            order.putShort((short) this.f15952C);
            return bArr;
        }

        /* renamed from: k */
        private static Pair<String, List<byte[]>> m21137k(C11146e0 c11146e0) {
            try {
                c11146e0.m34678V(16);
                long m34699x = c11146e0.m34699x();
                if (m34699x == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (m34699x == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (m34699x != 826496599) {
                    C11173s.m34970i("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] m34682e = c11146e0.m34682e();
                for (int m34683f = c11146e0.m34683f() + 20; m34683f < m34682e.length - 4; m34683f++) {
                    if (m34682e[m34683f] == 0 && m34682e[m34683f + 1] == 0 && m34682e[m34683f + 2] == 1 && m34682e[m34683f + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(m34682e, m34683f, m34682e.length)));
                    }
                }
                throw C11005b3.m33715a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C11005b3.m33715a("Error parsing FourCC private data", null);
            }
        }

        /* renamed from: l */
        private static boolean m21138l(C11146e0 c11146e0) {
            try {
                int m34701z = c11146e0.m34701z();
                if (m34701z == 1) {
                    return true;
                }
                if (m34701z != 65534) {
                    return false;
                }
                c11146e0.m34677U(24);
                if (c11146e0.m34657A() == C7131e.f15893h0.getMostSignificantBits()) {
                    if (c11146e0.m34657A() == C7131e.f15893h0.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C11005b3.m33715a("Error parsing MS/ACM codec private", null);
            }
        }

        /* renamed from: m */
        private static List<byte[]> m21139m(byte[] bArr) {
            int i10;
            int i11;
            try {
                if (bArr[0] != 2) {
                    throw C11005b3.m33715a("Error parsing vorbis codec private", null);
                }
                int i12 = 0;
                int i13 = 1;
                while (true) {
                    i10 = bArr[i13];
                    if ((i10 & 255) != 255) {
                        break;
                    }
                    i12 += 255;
                    i13++;
                }
                int i14 = i13 + 1;
                int i15 = i12 + (i10 & 255);
                int i16 = 0;
                while (true) {
                    i11 = bArr[i14];
                    if ((i11 & 255) != 255) {
                        break;
                    }
                    i16 += 255;
                    i14++;
                }
                int i17 = i14 + 1;
                int i18 = i16 + (i11 & 255);
                if (bArr[i17] != 1) {
                    throw C11005b3.m33715a("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i15];
                System.arraycopy(bArr, i17, bArr2, 0, i15);
                int i19 = i17 + i15;
                if (bArr[i19] != 3) {
                    throw C11005b3.m33715a("Error parsing vorbis codec private", null);
                }
                int i20 = i19 + i18;
                if (bArr[i20] != 5) {
                    throw C11005b3.m33715a("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i20];
                System.arraycopy(bArr, i20, bArr3, 0, bArr.length - i20);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C11005b3.m33715a("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public boolean m21140o(boolean z10) {
            return "A_OPUS".equals(this.f15976b) ? z10 : this.f15980f > 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x01df. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:14:0x03cb  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x03e6  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x03f5  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0511  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0407  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x03e8  */
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m21141i(p459y6.InterfaceC12623m r20, int r21) {
            /*
                Method dump skipped, instructions count: 1574
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p078e7.C7131e.c.m21141i(y6.m, int):void");
        }

        /* renamed from: j */
        public void m21142j() {
            C12611c0 c12611c0 = this.f15969T;
            if (c12611c0 != null) {
                c12611c0.m41514a(this.f15973X, this.f15984j);
            }
        }

        /* renamed from: n */
        public void m21143n() {
            C12611c0 c12611c0 = this.f15969T;
            if (c12611c0 != null) {
                c12611c0.m41515b();
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f15894i0 = Collections.unmodifiableMap(hashMap);
    }

    public C7131e() {
        this(0);
    }

    public C7131e(int i10) {
        this(new C7127a(), i10);
    }

    C7131e(InterfaceC7129c interfaceC7129c, int i10) {
        this.f15939q = -1L;
        this.f15940r = -9223372036854775807L;
        this.f15941s = -9223372036854775807L;
        this.f15942t = -9223372036854775807L;
        this.f15948z = -1L;
        this.f15895A = -1L;
        this.f15896B = -9223372036854775807L;
        this.f15921a = interfaceC7129c;
        interfaceC7129c.mo21084b(new b());
        this.f15926d = (i10 & 1) == 0;
        this.f15923b = new C7133g();
        this.f15925c = new SparseArray<>();
        this.f15929g = new C11146e0(4);
        this.f15930h = new C11146e0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f15931i = new C11146e0(4);
        this.f15927e = new C11146e0(C11179x.f29069a);
        this.f15928f = new C11146e0(4);
        this.f15932j = new C11146e0();
        this.f15933k = new C11146e0();
        this.f15934l = new C11146e0(8);
        this.f15935m = new C11146e0();
        this.f15936n = new C11146e0();
        this.f15906L = new int[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static /* synthetic */ InterfaceC12621k[] m21095A() {
        return new InterfaceC12621k[]{new C7131e()};
    }

    /* renamed from: B */
    private boolean m21096B(C12635y c12635y, long j10) {
        if (this.f15947y) {
            this.f15895A = j10;
            c12635y.f34331a = this.f15948z;
            this.f15947y = false;
            return true;
        }
        if (this.f15944v) {
            long j11 = this.f15895A;
            if (j11 != -1) {
                c12635y.f34331a = j11;
                this.f15895A = -1L;
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    private void m21097C(InterfaceC12622l interfaceC12622l, int i10) {
        if (this.f15929g.m34684g() >= i10) {
            return;
        }
        if (this.f15929g.m34680b() < i10) {
            C11146e0 c11146e0 = this.f15929g;
            c11146e0.m34681c(Math.max(c11146e0.m34680b() * 2, i10));
        }
        interfaceC12622l.readFully(this.f15929g.m34682e(), this.f15929g.m34684g(), i10 - this.f15929g.m34684g());
        this.f15929g.m34676T(i10);
    }

    /* renamed from: D */
    private void m21098D() {
        this.f15913S = 0;
        this.f15914T = 0;
        this.f15915U = 0;
        this.f15916V = false;
        this.f15917W = false;
        this.f15918X = false;
        this.f15919Y = 0;
        this.f15920Z = (byte) 0;
        this.f15922a0 = false;
        this.f15932j.m34673Q(0);
    }

    /* renamed from: E */
    private long m21099E(long j10) {
        long j11 = this.f15940r;
        if (j11 != -9223372036854775807L) {
            return C11172r0.m34885O0(j10, j11, 1000L);
        }
        throw C11005b3.m33715a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    /* renamed from: F */
    private static void m21100F(String str, long j10, byte[] bArr) {
        byte[] m21116s;
        int i10;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                m21116s = m21116s(j10, "%01d:%02d:%02d:%02d", 10000L);
                i10 = 21;
                break;
            case 1:
                m21116s = m21116s(j10, "%02d:%02d:%02d.%03d", 1000L);
                i10 = 25;
                break;
            case 2:
                m21116s = m21116s(j10, "%02d:%02d:%02d,%03d", 1000L);
                i10 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(m21116s, 0, bArr, i10, m21116s.length);
    }

    /* renamed from: I */
    private int m21101I(InterfaceC12622l interfaceC12622l, c cVar, int i10, boolean z10) {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f15976b)) {
            m21102J(interfaceC12622l, f15889d0, i10);
        } else if ("S_TEXT/ASS".equals(cVar.f15976b)) {
            m21102J(interfaceC12622l, f15891f0, i10);
        } else {
            if (!"S_TEXT/WEBVTT".equals(cVar.f15976b)) {
                InterfaceC12609b0 interfaceC12609b0 = cVar.f15973X;
                if (!this.f15916V) {
                    if (cVar.f15982h) {
                        this.f15909O &= -1073741825;
                        boolean z11 = this.f15917W;
                        int i12 = RecognitionOptions.ITF;
                        if (!z11) {
                            interfaceC12622l.readFully(this.f15929g.m34682e(), 0, 1);
                            this.f15913S++;
                            if ((this.f15929g.m34682e()[0] & 128) == 128) {
                                throw C11005b3.m33715a("Extension bit is set in signal byte", null);
                            }
                            this.f15920Z = this.f15929g.m34682e()[0];
                            this.f15917W = true;
                        }
                        byte b10 = this.f15920Z;
                        if ((b10 & 1) == 1) {
                            boolean z12 = (b10 & 2) == 2;
                            this.f15909O |= 1073741824;
                            if (!this.f15922a0) {
                                interfaceC12622l.readFully(this.f15934l.m34682e(), 0, 8);
                                this.f15913S += 8;
                                this.f15922a0 = true;
                                byte[] m34682e = this.f15929g.m34682e();
                                if (!z12) {
                                    i12 = 0;
                                }
                                m34682e[0] = (byte) (i12 | 8);
                                this.f15929g.m34677U(0);
                                interfaceC12609b0.mo333d(this.f15929g, 1, 1);
                                this.f15914T++;
                                this.f15934l.m34677U(0);
                                interfaceC12609b0.mo333d(this.f15934l, 8, 1);
                                this.f15914T += 8;
                            }
                            if (z12) {
                                if (!this.f15918X) {
                                    interfaceC12622l.readFully(this.f15929g.m34682e(), 0, 1);
                                    this.f15913S++;
                                    this.f15929g.m34677U(0);
                                    this.f15919Y = this.f15929g.m34664H();
                                    this.f15918X = true;
                                }
                                int i13 = this.f15919Y * 4;
                                this.f15929g.m34673Q(i13);
                                interfaceC12622l.readFully(this.f15929g.m34682e(), 0, i13);
                                this.f15913S += i13;
                                short s10 = (short) ((this.f15919Y / 2) + 1);
                                int i14 = (s10 * 6) + 2;
                                ByteBuffer byteBuffer = this.f15937o;
                                if (byteBuffer == null || byteBuffer.capacity() < i14) {
                                    this.f15937o = ByteBuffer.allocate(i14);
                                }
                                this.f15937o.position(0);
                                this.f15937o.putShort(s10);
                                int i15 = 0;
                                int i16 = 0;
                                while (true) {
                                    i11 = this.f15919Y;
                                    if (i15 >= i11) {
                                        break;
                                    }
                                    int m34668L = this.f15929g.m34668L();
                                    if (i15 % 2 == 0) {
                                        this.f15937o.putShort((short) (m34668L - i16));
                                    } else {
                                        this.f15937o.putInt(m34668L - i16);
                                    }
                                    i15++;
                                    i16 = m34668L;
                                }
                                int i17 = (i10 - this.f15913S) - i16;
                                int i18 = i11 % 2;
                                ByteBuffer byteBuffer2 = this.f15937o;
                                if (i18 == 1) {
                                    byteBuffer2.putInt(i17);
                                } else {
                                    byteBuffer2.putShort((short) i17);
                                    this.f15937o.putInt(0);
                                }
                                this.f15935m.m34675S(this.f15937o.array(), i14);
                                interfaceC12609b0.mo333d(this.f15935m, i14, 1);
                                this.f15914T += i14;
                            }
                        }
                    } else {
                        byte[] bArr = cVar.f15983i;
                        if (bArr != null) {
                            this.f15932j.m34675S(bArr, bArr.length);
                        }
                    }
                    if (cVar.m21140o(z10)) {
                        this.f15909O |= 268435456;
                        this.f15936n.m34673Q(0);
                        int m34684g = (this.f15932j.m34684g() + i10) - this.f15913S;
                        this.f15929g.m34673Q(4);
                        this.f15929g.m34682e()[0] = (byte) ((m34684g >> 24) & 255);
                        this.f15929g.m34682e()[1] = (byte) ((m34684g >> 16) & 255);
                        this.f15929g.m34682e()[2] = (byte) ((m34684g >> 8) & 255);
                        this.f15929g.m34682e()[3] = (byte) (m34684g & 255);
                        interfaceC12609b0.mo333d(this.f15929g, 4, 2);
                        this.f15914T += 4;
                    }
                    this.f15916V = true;
                }
                int m34684g2 = i10 + this.f15932j.m34684g();
                if (!"V_MPEG4/ISO/AVC".equals(cVar.f15976b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f15976b)) {
                    if (cVar.f15969T != null) {
                        C11137a.m34605g(this.f15932j.m34684g() == 0);
                        cVar.f15969T.m41517d(interfaceC12622l);
                    }
                    while (true) {
                        int i19 = this.f15913S;
                        if (i19 >= m34684g2) {
                            break;
                        }
                        int m21103K = m21103K(interfaceC12622l, interfaceC12609b0, m34684g2 - i19);
                        this.f15913S += m21103K;
                        this.f15914T += m21103K;
                    }
                } else {
                    byte[] m34682e2 = this.f15928f.m34682e();
                    m34682e2[0] = 0;
                    m34682e2[1] = 0;
                    m34682e2[2] = 0;
                    int i20 = cVar.f15974Y;
                    int i21 = 4 - i20;
                    while (this.f15913S < m34684g2) {
                        int i22 = this.f15915U;
                        if (i22 == 0) {
                            m21104L(interfaceC12622l, m34682e2, i21, i20);
                            this.f15913S += i20;
                            this.f15928f.m34677U(0);
                            this.f15915U = this.f15928f.m34668L();
                            this.f15927e.m34677U(0);
                            interfaceC12609b0.m41511a(this.f15927e, 4);
                            this.f15914T += 4;
                        } else {
                            int m21103K2 = m21103K(interfaceC12622l, interfaceC12609b0, i22);
                            this.f15913S += m21103K2;
                            this.f15914T += m21103K2;
                            this.f15915U -= m21103K2;
                        }
                    }
                }
                if ("A_VORBIS".equals(cVar.f15976b)) {
                    this.f15930h.m34677U(0);
                    interfaceC12609b0.m41511a(this.f15930h, 4);
                    this.f15914T += 4;
                }
                return m21115q();
            }
            m21102J(interfaceC12622l, f15892g0, i10);
        }
        return m21115q();
    }

    /* renamed from: J */
    private void m21102J(InterfaceC12622l interfaceC12622l, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        if (this.f15933k.m34680b() < length) {
            this.f15933k.m34674R(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f15933k.m34682e(), 0, bArr.length);
        }
        interfaceC12622l.readFully(this.f15933k.m34682e(), bArr.length, i10);
        this.f15933k.m34677U(0);
        this.f15933k.m34676T(length);
    }

    /* renamed from: K */
    private int m21103K(InterfaceC12622l interfaceC12622l, InterfaceC12609b0 interfaceC12609b0, int i10) {
        int m34679a = this.f15932j.m34679a();
        if (m34679a <= 0) {
            return interfaceC12609b0.m41512f(interfaceC12622l, i10, false);
        }
        int min = Math.min(i10, m34679a);
        interfaceC12609b0.m41511a(this.f15932j, min);
        return min;
    }

    /* renamed from: L */
    private void m21104L(InterfaceC12622l interfaceC12622l, byte[] bArr, int i10, int i11) {
        int min = Math.min(i11, this.f15932j.m34679a());
        interfaceC12622l.readFully(bArr, i10 + min, i11 - min);
        if (min > 0) {
            this.f15932j.m34688l(bArr, i10, min);
        }
    }

    /* renamed from: i */
    private void m21109i(int i10) {
        if (this.f15897C == null || this.f15898D == null) {
            throw C11005b3.m33715a("Element " + i10 + " must be in a Cues", null);
        }
    }

    /* renamed from: j */
    private void m21110j(int i10) {
        if (this.f15943u != null) {
            return;
        }
        throw C11005b3.m33715a("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* renamed from: k */
    private void m21111k() {
        C11137a.m34607i(this.f15924b0);
    }

    /* renamed from: m */
    private InterfaceC12636z m21112m(C11175t c11175t, C11175t c11175t2) {
        int i10;
        if (this.f15939q == -1 || this.f15942t == -9223372036854775807L || c11175t == null || c11175t.m34986c() == 0 || c11175t2 == null || c11175t2.m34986c() != c11175t.m34986c()) {
            return new InterfaceC12636z.b(this.f15942t);
        }
        int m34986c = c11175t.m34986c();
        int[] iArr = new int[m34986c];
        long[] jArr = new long[m34986c];
        long[] jArr2 = new long[m34986c];
        long[] jArr3 = new long[m34986c];
        int i11 = 0;
        for (int i12 = 0; i12 < m34986c; i12++) {
            jArr3[i12] = c11175t.m34985b(i12);
            jArr[i12] = this.f15939q + c11175t2.m34985b(i12);
        }
        while (true) {
            i10 = m34986c - 1;
            if (i11 >= i10) {
                break;
            }
            int i13 = i11 + 1;
            iArr[i11] = (int) (jArr[i13] - jArr[i11]);
            jArr2[i11] = jArr3[i13] - jArr3[i11];
            i11 = i13;
        }
        iArr[i10] = (int) ((this.f15939q + this.f15938p) - jArr[i10]);
        long j10 = this.f15942t - jArr3[i10];
        jArr2[i10] = j10;
        if (j10 <= 0) {
            C11173s.m34970i("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j10);
            iArr = Arrays.copyOf(iArr, i10);
            jArr = Arrays.copyOf(jArr, i10);
            jArr2 = Arrays.copyOf(jArr2, i10);
            jArr3 = Arrays.copyOf(jArr3, i10);
        }
        return new C12610c(iArr, jArr, jArr2, jArr3);
    }

    /* renamed from: n */
    private void m21113n(c cVar, long j10, int i10, int i11, int i12) {
        String str;
        C12611c0 c12611c0 = cVar.f15969T;
        if (c12611c0 != null) {
            c12611c0.m41516c(cVar.f15973X, j10, i10, i11, i12, cVar.f15984j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f15976b) || "S_TEXT/ASS".equals(cVar.f15976b) || "S_TEXT/WEBVTT".equals(cVar.f15976b)) {
                if (this.f15905K > 1) {
                    str = "Skipping subtitle sample in laced block.";
                } else {
                    long j11 = this.f15903I;
                    if (j11 == -9223372036854775807L) {
                        str = "Skipping subtitle sample with no duration.";
                    } else {
                        m21100F(cVar.f15976b, j11, this.f15933k.m34682e());
                        int m34683f = this.f15933k.m34683f();
                        while (true) {
                            if (m34683f >= this.f15933k.m34684g()) {
                                break;
                            }
                            if (this.f15933k.m34682e()[m34683f] == 0) {
                                this.f15933k.m34676T(m34683f);
                                break;
                            }
                            m34683f++;
                        }
                        InterfaceC12609b0 interfaceC12609b0 = cVar.f15973X;
                        C11146e0 c11146e0 = this.f15933k;
                        interfaceC12609b0.m41511a(c11146e0, c11146e0.m34684g());
                        i11 += this.f15933k.m34684g();
                    }
                }
                C11173s.m34970i("MatroskaExtractor", str);
            }
            if ((268435456 & i10) != 0) {
                if (this.f15905K > 1) {
                    this.f15936n.m34673Q(0);
                } else {
                    int m34684g = this.f15936n.m34684g();
                    cVar.f15973X.mo333d(this.f15936n, m34684g, 2);
                    i11 += m34684g;
                }
            }
            cVar.f15973X.mo331b(j10, i10, i11, i12, cVar.f15984j);
        }
        this.f15900F = true;
    }

    /* renamed from: p */
    private static int[] m21114p(int[] iArr, int i10) {
        return iArr == null ? new int[i10] : iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    /* renamed from: q */
    private int m21115q() {
        int i10 = this.f15914T;
        m21098D();
        return i10;
    }

    /* renamed from: s */
    private static byte[] m21116s(long j10, String str, long j11) {
        C11137a.m34599a(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - ((i10 * 3600) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - ((i11 * 60) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return C11172r0.m34935m0(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11))));
    }

    /* renamed from: y */
    private static boolean m21117y(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c10 = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c10 = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c10 = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c10 = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c10 = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c10 = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c10 = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c10 = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c10 = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c10 = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c10 = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c10 = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c10 = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c10 = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c10 = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c10 = 26;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c10 = 27;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c10 = 28;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c10 = 29;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c10 = 30;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c10 = 31;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c10 = ' ';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ' ':
                return true;
            default:
                return false;
        }
    }

    /* renamed from: G */
    protected void m21118G(int i10, long j10, long j11) {
        m21111k();
        if (i10 == 160) {
            this.f15911Q = false;
            this.f15912R = 0L;
            return;
        }
        if (i10 == 174) {
            this.f15943u = new c();
            return;
        }
        if (i10 == 187) {
            this.f15899E = false;
            return;
        }
        if (i10 == 19899) {
            this.f15945w = -1;
            this.f15946x = -1L;
            return;
        }
        if (i10 == 20533) {
            m21123t(i10).f15982h = true;
            return;
        }
        if (i10 == 21968) {
            m21123t(i10).f15998x = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.f15939q;
            if (j12 != -1 && j12 != j10) {
                throw C11005b3.m33715a("Multiple Segment elements not supported", null);
            }
            this.f15939q = j10;
            this.f15938p = j11;
            return;
        }
        if (i10 == 475249515) {
            this.f15897C = new C11175t();
            this.f15898D = new C11175t();
        } else if (i10 == 524531317 && !this.f15944v) {
            if (this.f15926d && this.f15948z != -1) {
                this.f15947y = true;
            } else {
                this.f15924b0.mo323p(new InterfaceC12636z.b(this.f15942t));
                this.f15944v = true;
            }
        }
    }

    /* renamed from: H */
    protected void m21119H(int i10, String str) {
        if (i10 == 134) {
            m21123t(i10).f15976b = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                m21123t(i10).f15975a = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                m21123t(i10).f15972W = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw C11005b3.m33715a("DocType " + str + " not supported", null);
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: a */
    public void mo121a(long j10, long j11) {
        this.f15896B = -9223372036854775807L;
        this.f15901G = 0;
        this.f15921a.reset();
        this.f15923b.m21150e();
        m21098D();
        for (int i10 = 0; i10 < this.f15925c.size(); i10++) {
            this.f15925c.valueAt(i10).m21143n();
        }
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: b */
    public final void mo122b(InterfaceC12623m interfaceC12623m) {
        this.f15924b0 = interfaceC12623m;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: e */
    public final boolean mo123e(InterfaceC12622l interfaceC12622l) {
        return new C7132f().m21145b(interfaceC12622l);
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: f */
    public final int mo124f(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        this.f15900F = false;
        boolean z10 = true;
        while (z10 && !this.f15900F) {
            z10 = this.f15921a.mo21083a(interfaceC12622l);
            if (z10 && m21096B(c12635y, interfaceC12622l.getPosition())) {
                return 1;
            }
        }
        if (z10) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f15925c.size(); i10++) {
            c valueAt = this.f15925c.valueAt(i10);
            valueAt.m21134f();
            valueAt.m21142j();
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0237, code lost:
    
        throw p361t6.C11005b3.m33715a("EBML lacing sample size out of range.", null);
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void m21120l(int r23, int r24, p459y6.InterfaceC12622l r25) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p078e7.C7131e.m21120l(int, int, y6.l):void");
    }

    /* renamed from: o */
    protected void m21121o(int i10) {
        m21111k();
        if (i10 == 160) {
            if (this.f15901G != 2) {
                return;
            }
            c cVar = this.f15925c.get(this.f15907M);
            cVar.m21134f();
            if (this.f15912R > 0 && "A_OPUS".equals(cVar.f15976b)) {
                this.f15936n.m34674R(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f15912R).array());
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.f15905K; i12++) {
                i11 += this.f15906L[i12];
            }
            int i13 = 0;
            while (i13 < this.f15905K) {
                long j10 = this.f15902H + ((cVar.f15979e * i13) / AdError.NETWORK_ERROR_CODE);
                int i14 = this.f15909O;
                if (i13 == 0 && !this.f15911Q) {
                    i14 |= 1;
                }
                int i15 = this.f15906L[i13];
                int i16 = i11 - i15;
                m21113n(cVar, j10, i14, i15, i16);
                i13++;
                i11 = i16;
            }
            this.f15901G = 0;
            return;
        }
        if (i10 == 174) {
            c cVar2 = (c) C11137a.m34607i(this.f15943u);
            String str = cVar2.f15976b;
            if (str == null) {
                throw C11005b3.m33715a("CodecId is missing in TrackEntry element", null);
            }
            if (m21117y(str)) {
                cVar2.m21141i(this.f15924b0, cVar2.f15977c);
                this.f15925c.put(cVar2.f15977c, cVar2);
            }
            this.f15943u = null;
            return;
        }
        if (i10 == 19899) {
            int i17 = this.f15945w;
            if (i17 != -1) {
                long j11 = this.f15946x;
                if (j11 != -1) {
                    if (i17 == 475249515) {
                        this.f15948z = j11;
                        return;
                    }
                    return;
                }
            }
            throw C11005b3.m33715a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i10 == 25152) {
            m21110j(i10);
            c cVar3 = this.f15943u;
            if (cVar3.f15982h) {
                if (cVar3.f15984j == null) {
                    throw C11005b3.m33715a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                cVar3.f15986l = new C12318m(new C12318m.b(C11081p.f28571a, "video/webm", this.f15943u.f15984j.f34226b));
                return;
            }
            return;
        }
        if (i10 == 28032) {
            m21110j(i10);
            c cVar4 = this.f15943u;
            if (cVar4.f15982h && cVar4.f15983i != null) {
                throw C11005b3.m33715a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i10 == 357149030) {
            if (this.f15940r == -9223372036854775807L) {
                this.f15940r = 1000000L;
            }
            long j12 = this.f15941s;
            if (j12 != -9223372036854775807L) {
                this.f15942t = m21099E(j12);
                return;
            }
            return;
        }
        if (i10 == 374648427) {
            if (this.f15925c.size() == 0) {
                throw C11005b3.m33715a("No valid tracks were found", null);
            }
            this.f15924b0.mo324q();
        } else {
            if (i10 != 475249515) {
                return;
            }
            if (!this.f15944v) {
                this.f15924b0.mo323p(m21112m(this.f15897C, this.f15898D));
                this.f15944v = true;
            }
            this.f15897C = null;
            this.f15898D = null;
        }
    }

    /* renamed from: r */
    protected void m21122r(int i10, double d10) {
        if (i10 == 181) {
            m21123t(i10).f15966Q = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.f15941s = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                m21123t(i10).f15953D = (float) d10;
                return;
            case 21970:
                m21123t(i10).f15954E = (float) d10;
                return;
            case 21971:
                m21123t(i10).f15955F = (float) d10;
                return;
            case 21972:
                m21123t(i10).f15956G = (float) d10;
                return;
            case 21973:
                m21123t(i10).f15957H = (float) d10;
                return;
            case 21974:
                m21123t(i10).f15958I = (float) d10;
                return;
            case 21975:
                m21123t(i10).f15959J = (float) d10;
                return;
            case 21976:
                m21123t(i10).f15960K = (float) d10;
                return;
            case 21977:
                m21123t(i10).f15961L = (float) d10;
                return;
            case 21978:
                m21123t(i10).f15962M = (float) d10;
                return;
            default:
                switch (i10) {
                    case 30323:
                        m21123t(i10).f15993s = (float) d10;
                        return;
                    case 30324:
                        m21123t(i10).f15994t = (float) d10;
                        return;
                    case 30325:
                        m21123t(i10).f15995u = (float) d10;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // p459y6.InterfaceC12621k
    public final void release() {
    }

    /* renamed from: t */
    protected c m21123t(int i10) {
        m21110j(i10);
        return this.f15943u;
    }

    /* renamed from: u */
    protected int m21124u(int i10) {
        switch (i10) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: v */
    protected void m21125v(c cVar, InterfaceC12622l interfaceC12622l, int i10) {
        if (cVar.f15981g != 1685485123 && cVar.f15981g != 1685480259) {
            interfaceC12622l.mo41538n(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        cVar.f15963N = bArr;
        interfaceC12622l.readFully(bArr, 0, i10);
    }

    /* renamed from: w */
    protected void m21126w(c cVar, int i10, InterfaceC12622l interfaceC12622l, int i11) {
        if (i10 != 4 || !"V_VP9".equals(cVar.f15976b)) {
            interfaceC12622l.mo41538n(i11);
        } else {
            this.f15936n.m34673Q(i11);
            interfaceC12622l.readFully(this.f15936n.m34682e(), 0, i11);
        }
    }

    /* renamed from: x */
    protected void m21127x(int i10, long j10) {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw C11005b3.m33715a("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw C11005b3.m33715a("ContentEncodingScope " + j10 + " not supported", null);
        }
        switch (i10) {
            case 131:
                m21123t(i10).f15978d = (int) j10;
                return;
            case 136:
                m21123t(i10).f15971V = j10 == 1;
                return;
            case 155:
                this.f15903I = m21099E(j10);
                return;
            case 159:
                m21123t(i10).f15964O = (int) j10;
                return;
            case 176:
                m21123t(i10).f15987m = (int) j10;
                return;
            case 179:
                m21109i(i10);
                this.f15897C.m34984a(m21099E(j10));
                return;
            case 186:
                m21123t(i10).f15988n = (int) j10;
                return;
            case 215:
                m21123t(i10).f15977c = (int) j10;
                return;
            case 231:
                this.f15896B = m21099E(j10);
                return;
            case 238:
                this.f15910P = (int) j10;
                return;
            case 241:
                if (this.f15899E) {
                    return;
                }
                m21109i(i10);
                this.f15898D.m34984a(j10);
                this.f15899E = true;
                return;
            case 251:
                this.f15911Q = true;
                return;
            case 16871:
                m21123t(i10).f15981g = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw C11005b3.m33715a("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw C11005b3.m33715a("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw C11005b3.m33715a("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw C11005b3.m33715a("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw C11005b3.m33715a("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                this.f15946x = j10 + this.f15939q;
                return;
            case 21432:
                int i11 = (int) j10;
                m21110j(i10);
                if (i11 == 0) {
                    this.f15943u.f15997w = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f15943u.f15997w = 2;
                    return;
                } else if (i11 == 3) {
                    this.f15943u.f15997w = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f15943u.f15997w = 3;
                    return;
                }
            case 21680:
                m21123t(i10).f15989o = (int) j10;
                return;
            case 21682:
                m21123t(i10).f15991q = (int) j10;
                return;
            case 21690:
                m21123t(i10).f15990p = (int) j10;
                return;
            case 21930:
                m21123t(i10).f15970U = j10 == 1;
                return;
            case 21998:
                m21123t(i10).f15980f = (int) j10;
                return;
            case 22186:
                m21123t(i10).f15967R = j10;
                return;
            case 22203:
                m21123t(i10).f15968S = j10;
                return;
            case 25188:
                m21123t(i10).f15965P = (int) j10;
                return;
            case 30114:
                this.f15912R = j10;
                return;
            case 30321:
                m21110j(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.f15943u.f15992r = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f15943u.f15992r = 1;
                    return;
                } else if (i12 == 2) {
                    this.f15943u.f15992r = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f15943u.f15992r = 3;
                    return;
                }
            case 2352003:
                m21123t(i10).f15979e = (int) j10;
                return;
            case 2807729:
                this.f15940r = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        m21110j(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.f15943u.f15950A = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f15943u.f15950A = 1;
                            return;
                        }
                    case 21946:
                        m21110j(i10);
                        int m35774d = C11450c.m35774d((int) j10);
                        if (m35774d != -1) {
                            this.f15943u.f16000z = m35774d;
                            return;
                        }
                        return;
                    case 21947:
                        m21110j(i10);
                        this.f15943u.f15998x = true;
                        int m35773c = C11450c.m35773c((int) j10);
                        if (m35773c != -1) {
                            this.f15943u.f15999y = m35773c;
                            return;
                        }
                        return;
                    case 21948:
                        m21123t(i10).f15951B = (int) j10;
                        return;
                    case 21949:
                        m21123t(i10).f15952C = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    /* renamed from: z */
    protected boolean m21128z(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }
}

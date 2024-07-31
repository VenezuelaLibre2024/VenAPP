package e7;

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
import t6.b3;
import t8.e0;
import t8.r0;
import t8.s;
import t8.t;
import t8.x;
import x6.m;
import y6.b0;
import y6.c0;
import y6.k;
import y6.l;
import y6.m;
import y6.p;
import y6.y;
import y6.z;

/* loaded from: classes.dex */
public class e implements k {

    /* renamed from: c0, reason: collision with root package name */
    public static final p f14516c0 = new p() { // from class: e7.d
        @Override // y6.p
        public final k[] c() {
            k[] A;
            A = e.A();
            return A;
        }
    };

    /* renamed from: d0, reason: collision with root package name */
    private static final byte[] f14517d0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: e0, reason: collision with root package name */
    private static final byte[] f14518e0 = r0.m0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: f0, reason: collision with root package name */
    private static final byte[] f14519f0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: g0, reason: collision with root package name */
    private static final byte[] f14520g0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: h0, reason: collision with root package name */
    private static final UUID f14521h0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: i0, reason: collision with root package name */
    private static final Map<String, Integer> f14522i0;
    private long A;
    private long B;
    private t C;
    private t D;
    private boolean E;
    private boolean F;
    private int G;
    private long H;
    private long I;
    private int J;
    private int K;
    private int[] L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private long R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private boolean W;
    private boolean X;
    private int Y;
    private byte Z;

    /* renamed from: a, reason: collision with root package name */
    private final e7.c f14523a;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f14524a0;

    /* renamed from: b, reason: collision with root package name */
    private final g f14525b;

    /* renamed from: b0, reason: collision with root package name */
    private m f14526b0;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray<c> f14527c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f14528d;

    /* renamed from: e, reason: collision with root package name */
    private final e0 f14529e;

    /* renamed from: f, reason: collision with root package name */
    private final e0 f14530f;

    /* renamed from: g, reason: collision with root package name */
    private final e0 f14531g;

    /* renamed from: h, reason: collision with root package name */
    private final e0 f14532h;

    /* renamed from: i, reason: collision with root package name */
    private final e0 f14533i;

    /* renamed from: j, reason: collision with root package name */
    private final e0 f14534j;

    /* renamed from: k, reason: collision with root package name */
    private final e0 f14535k;

    /* renamed from: l, reason: collision with root package name */
    private final e0 f14536l;

    /* renamed from: m, reason: collision with root package name */
    private final e0 f14537m;

    /* renamed from: n, reason: collision with root package name */
    private final e0 f14538n;

    /* renamed from: o, reason: collision with root package name */
    private ByteBuffer f14539o;

    /* renamed from: p, reason: collision with root package name */
    private long f14540p;

    /* renamed from: q, reason: collision with root package name */
    private long f14541q;

    /* renamed from: r, reason: collision with root package name */
    private long f14542r;

    /* renamed from: s, reason: collision with root package name */
    private long f14543s;

    /* renamed from: t, reason: collision with root package name */
    private long f14544t;

    /* renamed from: u, reason: collision with root package name */
    private c f14545u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f14546v;

    /* renamed from: w, reason: collision with root package name */
    private int f14547w;

    /* renamed from: x, reason: collision with root package name */
    private long f14548x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f14549y;

    /* renamed from: z, reason: collision with root package name */
    private long f14550z;

    /* loaded from: classes.dex */
    private final class b implements e7.b {
        private b() {
        }

        @Override // e7.b
        public void a(int i10) {
            e.this.o(i10);
        }

        @Override // e7.b
        public void b(int i10, double d10) {
            e.this.r(i10, d10);
        }

        @Override // e7.b
        public void c(int i10, int i11, l lVar) {
            e.this.l(i10, i11, lVar);
        }

        @Override // e7.b
        public void d(int i10, long j10) {
            e.this.x(i10, j10);
        }

        @Override // e7.b
        public int e(int i10) {
            return e.this.u(i10);
        }

        @Override // e7.b
        public boolean f(int i10) {
            return e.this.z(i10);
        }

        @Override // e7.b
        public void g(int i10, String str) {
            e.this.H(i10, str);
        }

        @Override // e7.b
        public void h(int i10, long j10, long j11) {
            e.this.G(i10, j10, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static final class c {
        public byte[] N;
        public c0 T;
        public boolean U;
        public b0 X;
        public int Y;

        /* renamed from: a, reason: collision with root package name */
        public String f14552a;

        /* renamed from: b, reason: collision with root package name */
        public String f14553b;

        /* renamed from: c, reason: collision with root package name */
        public int f14554c;

        /* renamed from: d, reason: collision with root package name */
        public int f14555d;

        /* renamed from: e, reason: collision with root package name */
        public int f14556e;

        /* renamed from: f, reason: collision with root package name */
        public int f14557f;

        /* renamed from: g, reason: collision with root package name */
        private int f14558g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f14559h;

        /* renamed from: i, reason: collision with root package name */
        public byte[] f14560i;

        /* renamed from: j, reason: collision with root package name */
        public b0.a f14561j;

        /* renamed from: k, reason: collision with root package name */
        public byte[] f14562k;

        /* renamed from: l, reason: collision with root package name */
        public x6.m f14563l;

        /* renamed from: m, reason: collision with root package name */
        public int f14564m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f14565n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f14566o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f14567p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f14568q = 0;

        /* renamed from: r, reason: collision with root package name */
        public int f14569r = -1;

        /* renamed from: s, reason: collision with root package name */
        public float f14570s = 0.0f;

        /* renamed from: t, reason: collision with root package name */
        public float f14571t = 0.0f;

        /* renamed from: u, reason: collision with root package name */
        public float f14572u = 0.0f;

        /* renamed from: v, reason: collision with root package name */
        public byte[] f14573v = null;

        /* renamed from: w, reason: collision with root package name */
        public int f14574w = -1;

        /* renamed from: x, reason: collision with root package name */
        public boolean f14575x = false;

        /* renamed from: y, reason: collision with root package name */
        public int f14576y = -1;

        /* renamed from: z, reason: collision with root package name */
        public int f14577z = -1;
        public int A = -1;
        public int B = AdError.NETWORK_ERROR_CODE;
        public int C = 200;
        public float D = -1.0f;
        public float E = -1.0f;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public int O = 1;
        public int P = -1;
        public int Q = 8000;
        public long R = 0;
        public long S = 0;
        public boolean V = true;
        private String W = "eng";

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            t8.a.e(this.X);
        }

        private byte[] g(String str) {
            byte[] bArr = this.f14562k;
            if (bArr != null) {
                return bArr;
            }
            throw b3.a("Missing CodecPrivate for codec " + str, null);
        }

        private byte[] h() {
            if (this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((this.D * 50000.0f) + 0.5f));
            order.putShort((short) ((this.E * 50000.0f) + 0.5f));
            order.putShort((short) ((this.F * 50000.0f) + 0.5f));
            order.putShort((short) ((this.G * 50000.0f) + 0.5f));
            order.putShort((short) ((this.H * 50000.0f) + 0.5f));
            order.putShort((short) ((this.I * 50000.0f) + 0.5f));
            order.putShort((short) ((this.J * 50000.0f) + 0.5f));
            order.putShort((short) ((this.K * 50000.0f) + 0.5f));
            order.putShort((short) (this.L + 0.5f));
            order.putShort((short) (this.M + 0.5f));
            order.putShort((short) this.B);
            order.putShort((short) this.C);
            return bArr;
        }

        private static Pair<String, List<byte[]>> k(e0 e0Var) {
            try {
                e0Var.V(16);
                long x10 = e0Var.x();
                if (x10 == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (x10 == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (x10 != 826496599) {
                    s.i("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] e10 = e0Var.e();
                for (int f10 = e0Var.f() + 20; f10 < e10.length - 4; f10++) {
                    if (e10[f10] == 0 && e10[f10 + 1] == 0 && e10[f10 + 2] == 1 && e10[f10 + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(e10, f10, e10.length)));
                    }
                }
                throw b3.a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw b3.a("Error parsing FourCC private data", null);
            }
        }

        private static boolean l(e0 e0Var) {
            try {
                int z10 = e0Var.z();
                if (z10 == 1) {
                    return true;
                }
                if (z10 != 65534) {
                    return false;
                }
                e0Var.U(24);
                if (e0Var.A() == e.f14521h0.getMostSignificantBits()) {
                    if (e0Var.A() == e.f14521h0.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw b3.a("Error parsing MS/ACM codec private", null);
            }
        }

        private static List<byte[]> m(byte[] bArr) {
            int i10;
            int i11;
            try {
                if (bArr[0] != 2) {
                    throw b3.a("Error parsing vorbis codec private", null);
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
                    throw b3.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i15];
                System.arraycopy(bArr, i17, bArr2, 0, i15);
                int i19 = i17 + i15;
                if (bArr[i19] != 3) {
                    throw b3.a("Error parsing vorbis codec private", null);
                }
                int i20 = i19 + i18;
                if (bArr[i20] != 5) {
                    throw b3.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i20];
                System.arraycopy(bArr, i20, bArr3, 0, bArr.length - i20);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw b3.a("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean o(boolean z10) {
            return "A_OPUS".equals(this.f14553b) ? z10 : this.f14557f > 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x01df. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:14:0x03cb  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x03e6  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x03f5  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0511  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0407  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x03e8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void i(y6.m r20, int r21) {
            /*
                Method dump skipped, instructions count: 1574
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: e7.e.c.i(y6.m, int):void");
        }

        public void j() {
            c0 c0Var = this.T;
            if (c0Var != null) {
                c0Var.a(this.X, this.f14561j);
            }
        }

        public void n() {
            c0 c0Var = this.T;
            if (c0Var != null) {
                c0Var.b();
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f14522i0 = Collections.unmodifiableMap(hashMap);
    }

    public e() {
        this(0);
    }

    public e(int i10) {
        this(new e7.a(), i10);
    }

    e(e7.c cVar, int i10) {
        this.f14541q = -1L;
        this.f14542r = -9223372036854775807L;
        this.f14543s = -9223372036854775807L;
        this.f14544t = -9223372036854775807L;
        this.f14550z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f14523a = cVar;
        cVar.b(new b());
        this.f14528d = (i10 & 1) == 0;
        this.f14525b = new g();
        this.f14527c = new SparseArray<>();
        this.f14531g = new e0(4);
        this.f14532h = new e0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f14533i = new e0(4);
        this.f14529e = new e0(x.f26773a);
        this.f14530f = new e0(4);
        this.f14534j = new e0();
        this.f14535k = new e0();
        this.f14536l = new e0(8);
        this.f14537m = new e0();
        this.f14538n = new e0();
        this.L = new int[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k[] A() {
        return new k[]{new e()};
    }

    private boolean B(y yVar, long j10) {
        if (this.f14549y) {
            this.A = j10;
            yVar.f31795a = this.f14550z;
            this.f14549y = false;
            return true;
        }
        if (this.f14546v) {
            long j11 = this.A;
            if (j11 != -1) {
                yVar.f31795a = j11;
                this.A = -1L;
                return true;
            }
        }
        return false;
    }

    private void C(l lVar, int i10) {
        if (this.f14531g.g() >= i10) {
            return;
        }
        if (this.f14531g.b() < i10) {
            e0 e0Var = this.f14531g;
            e0Var.c(Math.max(e0Var.b() * 2, i10));
        }
        lVar.readFully(this.f14531g.e(), this.f14531g.g(), i10 - this.f14531g.g());
        this.f14531g.T(i10);
    }

    private void D() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.f14524a0 = false;
        this.f14534j.Q(0);
    }

    private long E(long j10) {
        long j11 = this.f14542r;
        if (j11 != -9223372036854775807L) {
            return r0.O0(j10, j11, 1000L);
        }
        throw b3.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void F(String str, long j10, byte[] bArr) {
        byte[] s10;
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
                s10 = s(j10, "%01d:%02d:%02d:%02d", 10000L);
                i10 = 21;
                break;
            case 1:
                s10 = s(j10, "%02d:%02d:%02d.%03d", 1000L);
                i10 = 25;
                break;
            case 2:
                s10 = s(j10, "%02d:%02d:%02d,%03d", 1000L);
                i10 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(s10, 0, bArr, i10, s10.length);
    }

    private int I(l lVar, c cVar, int i10, boolean z10) {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f14553b)) {
            J(lVar, f14517d0, i10);
        } else if ("S_TEXT/ASS".equals(cVar.f14553b)) {
            J(lVar, f14519f0, i10);
        } else {
            if (!"S_TEXT/WEBVTT".equals(cVar.f14553b)) {
                b0 b0Var = cVar.X;
                if (!this.V) {
                    if (cVar.f14559h) {
                        this.O &= -1073741825;
                        boolean z11 = this.W;
                        int i12 = RecognitionOptions.ITF;
                        if (!z11) {
                            lVar.readFully(this.f14531g.e(), 0, 1);
                            this.S++;
                            if ((this.f14531g.e()[0] & 128) == 128) {
                                throw b3.a("Extension bit is set in signal byte", null);
                            }
                            this.Z = this.f14531g.e()[0];
                            this.W = true;
                        }
                        byte b10 = this.Z;
                        if ((b10 & 1) == 1) {
                            boolean z12 = (b10 & 2) == 2;
                            this.O |= 1073741824;
                            if (!this.f14524a0) {
                                lVar.readFully(this.f14536l.e(), 0, 8);
                                this.S += 8;
                                this.f14524a0 = true;
                                byte[] e10 = this.f14531g.e();
                                if (!z12) {
                                    i12 = 0;
                                }
                                e10[0] = (byte) (i12 | 8);
                                this.f14531g.U(0);
                                b0Var.d(this.f14531g, 1, 1);
                                this.T++;
                                this.f14536l.U(0);
                                b0Var.d(this.f14536l, 8, 1);
                                this.T += 8;
                            }
                            if (z12) {
                                if (!this.X) {
                                    lVar.readFully(this.f14531g.e(), 0, 1);
                                    this.S++;
                                    this.f14531g.U(0);
                                    this.Y = this.f14531g.H();
                                    this.X = true;
                                }
                                int i13 = this.Y * 4;
                                this.f14531g.Q(i13);
                                lVar.readFully(this.f14531g.e(), 0, i13);
                                this.S += i13;
                                short s10 = (short) ((this.Y / 2) + 1);
                                int i14 = (s10 * 6) + 2;
                                ByteBuffer byteBuffer = this.f14539o;
                                if (byteBuffer == null || byteBuffer.capacity() < i14) {
                                    this.f14539o = ByteBuffer.allocate(i14);
                                }
                                this.f14539o.position(0);
                                this.f14539o.putShort(s10);
                                int i15 = 0;
                                int i16 = 0;
                                while (true) {
                                    i11 = this.Y;
                                    if (i15 >= i11) {
                                        break;
                                    }
                                    int L = this.f14531g.L();
                                    if (i15 % 2 == 0) {
                                        this.f14539o.putShort((short) (L - i16));
                                    } else {
                                        this.f14539o.putInt(L - i16);
                                    }
                                    i15++;
                                    i16 = L;
                                }
                                int i17 = (i10 - this.S) - i16;
                                int i18 = i11 % 2;
                                ByteBuffer byteBuffer2 = this.f14539o;
                                if (i18 == 1) {
                                    byteBuffer2.putInt(i17);
                                } else {
                                    byteBuffer2.putShort((short) i17);
                                    this.f14539o.putInt(0);
                                }
                                this.f14537m.S(this.f14539o.array(), i14);
                                b0Var.d(this.f14537m, i14, 1);
                                this.T += i14;
                            }
                        }
                    } else {
                        byte[] bArr = cVar.f14560i;
                        if (bArr != null) {
                            this.f14534j.S(bArr, bArr.length);
                        }
                    }
                    if (cVar.o(z10)) {
                        this.O |= 268435456;
                        this.f14538n.Q(0);
                        int g10 = (this.f14534j.g() + i10) - this.S;
                        this.f14531g.Q(4);
                        this.f14531g.e()[0] = (byte) ((g10 >> 24) & 255);
                        this.f14531g.e()[1] = (byte) ((g10 >> 16) & 255);
                        this.f14531g.e()[2] = (byte) ((g10 >> 8) & 255);
                        this.f14531g.e()[3] = (byte) (g10 & 255);
                        b0Var.d(this.f14531g, 4, 2);
                        this.T += 4;
                    }
                    this.V = true;
                }
                int g11 = i10 + this.f14534j.g();
                if (!"V_MPEG4/ISO/AVC".equals(cVar.f14553b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f14553b)) {
                    if (cVar.T != null) {
                        t8.a.g(this.f14534j.g() == 0);
                        cVar.T.d(lVar);
                    }
                    while (true) {
                        int i19 = this.S;
                        if (i19 >= g11) {
                            break;
                        }
                        int K = K(lVar, b0Var, g11 - i19);
                        this.S += K;
                        this.T += K;
                    }
                } else {
                    byte[] e11 = this.f14530f.e();
                    e11[0] = 0;
                    e11[1] = 0;
                    e11[2] = 0;
                    int i20 = cVar.Y;
                    int i21 = 4 - i20;
                    while (this.S < g11) {
                        int i22 = this.U;
                        if (i22 == 0) {
                            L(lVar, e11, i21, i20);
                            this.S += i20;
                            this.f14530f.U(0);
                            this.U = this.f14530f.L();
                            this.f14529e.U(0);
                            b0Var.a(this.f14529e, 4);
                            this.T += 4;
                        } else {
                            int K2 = K(lVar, b0Var, i22);
                            this.S += K2;
                            this.T += K2;
                            this.U -= K2;
                        }
                    }
                }
                if ("A_VORBIS".equals(cVar.f14553b)) {
                    this.f14532h.U(0);
                    b0Var.a(this.f14532h, 4);
                    this.T += 4;
                }
                return q();
            }
            J(lVar, f14520g0, i10);
        }
        return q();
    }

    private void J(l lVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        if (this.f14535k.b() < length) {
            this.f14535k.R(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f14535k.e(), 0, bArr.length);
        }
        lVar.readFully(this.f14535k.e(), bArr.length, i10);
        this.f14535k.U(0);
        this.f14535k.T(length);
    }

    private int K(l lVar, b0 b0Var, int i10) {
        int a10 = this.f14534j.a();
        if (a10 <= 0) {
            return b0Var.f(lVar, i10, false);
        }
        int min = Math.min(i10, a10);
        b0Var.a(this.f14534j, min);
        return min;
    }

    private void L(l lVar, byte[] bArr, int i10, int i11) {
        int min = Math.min(i11, this.f14534j.a());
        lVar.readFully(bArr, i10 + min, i11 - min);
        if (min > 0) {
            this.f14534j.l(bArr, i10, min);
        }
    }

    private void i(int i10) {
        if (this.C == null || this.D == null) {
            throw b3.a("Element " + i10 + " must be in a Cues", null);
        }
    }

    private void j(int i10) {
        if (this.f14545u != null) {
            return;
        }
        throw b3.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    private void k() {
        t8.a.i(this.f14526b0);
    }

    private z m(t tVar, t tVar2) {
        int i10;
        if (this.f14541q == -1 || this.f14544t == -9223372036854775807L || tVar == null || tVar.c() == 0 || tVar2 == null || tVar2.c() != tVar.c()) {
            return new z.b(this.f14544t);
        }
        int c10 = tVar.c();
        int[] iArr = new int[c10];
        long[] jArr = new long[c10];
        long[] jArr2 = new long[c10];
        long[] jArr3 = new long[c10];
        int i11 = 0;
        for (int i12 = 0; i12 < c10; i12++) {
            jArr3[i12] = tVar.b(i12);
            jArr[i12] = this.f14541q + tVar2.b(i12);
        }
        while (true) {
            i10 = c10 - 1;
            if (i11 >= i10) {
                break;
            }
            int i13 = i11 + 1;
            iArr[i11] = (int) (jArr[i13] - jArr[i11]);
            jArr2[i11] = jArr3[i13] - jArr3[i11];
            i11 = i13;
        }
        iArr[i10] = (int) ((this.f14541q + this.f14540p) - jArr[i10]);
        long j10 = this.f14544t - jArr3[i10];
        jArr2[i10] = j10;
        if (j10 <= 0) {
            s.i("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j10);
            iArr = Arrays.copyOf(iArr, i10);
            jArr = Arrays.copyOf(jArr, i10);
            jArr2 = Arrays.copyOf(jArr2, i10);
            jArr3 = Arrays.copyOf(jArr3, i10);
        }
        return new y6.c(iArr, jArr, jArr2, jArr3);
    }

    private void n(c cVar, long j10, int i10, int i11, int i12) {
        String str;
        c0 c0Var = cVar.T;
        if (c0Var != null) {
            c0Var.c(cVar.X, j10, i10, i11, i12, cVar.f14561j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f14553b) || "S_TEXT/ASS".equals(cVar.f14553b) || "S_TEXT/WEBVTT".equals(cVar.f14553b)) {
                if (this.K > 1) {
                    str = "Skipping subtitle sample in laced block.";
                } else {
                    long j11 = this.I;
                    if (j11 == -9223372036854775807L) {
                        str = "Skipping subtitle sample with no duration.";
                    } else {
                        F(cVar.f14553b, j11, this.f14535k.e());
                        int f10 = this.f14535k.f();
                        while (true) {
                            if (f10 >= this.f14535k.g()) {
                                break;
                            }
                            if (this.f14535k.e()[f10] == 0) {
                                this.f14535k.T(f10);
                                break;
                            }
                            f10++;
                        }
                        b0 b0Var = cVar.X;
                        e0 e0Var = this.f14535k;
                        b0Var.a(e0Var, e0Var.g());
                        i11 += this.f14535k.g();
                    }
                }
                s.i("MatroskaExtractor", str);
            }
            if ((268435456 & i10) != 0) {
                if (this.K > 1) {
                    this.f14538n.Q(0);
                } else {
                    int g10 = this.f14538n.g();
                    cVar.X.d(this.f14538n, g10, 2);
                    i11 += g10;
                }
            }
            cVar.X.b(j10, i10, i11, i12, cVar.f14561j);
        }
        this.F = true;
    }

    private static int[] p(int[] iArr, int i10) {
        return iArr == null ? new int[i10] : iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    private int q() {
        int i10 = this.T;
        D();
        return i10;
    }

    private static byte[] s(long j10, String str, long j11) {
        t8.a.a(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - ((i10 * 3600) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - ((i11 * 60) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return r0.m0(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11))));
    }

    private static boolean y(String str) {
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

    protected void G(int i10, long j10, long j11) {
        k();
        if (i10 == 160) {
            this.Q = false;
            this.R = 0L;
            return;
        }
        if (i10 == 174) {
            this.f14545u = new c();
            return;
        }
        if (i10 == 187) {
            this.E = false;
            return;
        }
        if (i10 == 19899) {
            this.f14547w = -1;
            this.f14548x = -1L;
            return;
        }
        if (i10 == 20533) {
            t(i10).f14559h = true;
            return;
        }
        if (i10 == 21968) {
            t(i10).f14575x = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.f14541q;
            if (j12 != -1 && j12 != j10) {
                throw b3.a("Multiple Segment elements not supported", null);
            }
            this.f14541q = j10;
            this.f14540p = j11;
            return;
        }
        if (i10 == 475249515) {
            this.C = new t();
            this.D = new t();
        } else if (i10 == 524531317 && !this.f14546v) {
            if (this.f14528d && this.f14550z != -1) {
                this.f14549y = true;
            } else {
                this.f14526b0.p(new z.b(this.f14544t));
                this.f14546v = true;
            }
        }
    }

    protected void H(int i10, String str) {
        if (i10 == 134) {
            t(i10).f14553b = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                t(i10).f14552a = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                t(i10).W = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw b3.a("DocType " + str + " not supported", null);
    }

    @Override // y6.k
    public void a(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        this.f14523a.reset();
        this.f14525b.e();
        D();
        for (int i10 = 0; i10 < this.f14527c.size(); i10++) {
            this.f14527c.valueAt(i10).n();
        }
    }

    @Override // y6.k
    public final void b(m mVar) {
        this.f14526b0 = mVar;
    }

    @Override // y6.k
    public final boolean e(l lVar) {
        return new f().b(lVar);
    }

    @Override // y6.k
    public final int f(l lVar, y yVar) {
        this.F = false;
        boolean z10 = true;
        while (z10 && !this.F) {
            z10 = this.f14523a.a(lVar);
            if (z10 && B(yVar, lVar.getPosition())) {
                return 1;
            }
        }
        if (z10) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f14527c.size(); i10++) {
            c valueAt = this.f14527c.valueAt(i10);
            valueAt.f();
            valueAt.j();
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0237, code lost:
    
        throw t6.b3.a("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void l(int r23, int r24, y6.l r25) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.e.l(int, int, y6.l):void");
    }

    protected void o(int i10) {
        k();
        if (i10 == 160) {
            if (this.G != 2) {
                return;
            }
            c cVar = this.f14527c.get(this.M);
            cVar.f();
            if (this.R > 0 && "A_OPUS".equals(cVar.f14553b)) {
                this.f14538n.R(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.R).array());
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.K; i12++) {
                i11 += this.L[i12];
            }
            int i13 = 0;
            while (i13 < this.K) {
                long j10 = this.H + ((cVar.f14556e * i13) / AdError.NETWORK_ERROR_CODE);
                int i14 = this.O;
                if (i13 == 0 && !this.Q) {
                    i14 |= 1;
                }
                int i15 = this.L[i13];
                int i16 = i11 - i15;
                n(cVar, j10, i14, i15, i16);
                i13++;
                i11 = i16;
            }
            this.G = 0;
            return;
        }
        if (i10 == 174) {
            c cVar2 = (c) t8.a.i(this.f14545u);
            String str = cVar2.f14553b;
            if (str == null) {
                throw b3.a("CodecId is missing in TrackEntry element", null);
            }
            if (y(str)) {
                cVar2.i(this.f14526b0, cVar2.f14554c);
                this.f14527c.put(cVar2.f14554c, cVar2);
            }
            this.f14545u = null;
            return;
        }
        if (i10 == 19899) {
            int i17 = this.f14547w;
            if (i17 != -1) {
                long j11 = this.f14548x;
                if (j11 != -1) {
                    if (i17 == 475249515) {
                        this.f14550z = j11;
                        return;
                    }
                    return;
                }
            }
            throw b3.a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i10 == 25152) {
            j(i10);
            c cVar3 = this.f14545u;
            if (cVar3.f14559h) {
                if (cVar3.f14561j == null) {
                    throw b3.a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                cVar3.f14563l = new x6.m(new m.b(t6.p.f26344a, "video/webm", this.f14545u.f14561j.f31690b));
                return;
            }
            return;
        }
        if (i10 == 28032) {
            j(i10);
            c cVar4 = this.f14545u;
            if (cVar4.f14559h && cVar4.f14560i != null) {
                throw b3.a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i10 == 357149030) {
            if (this.f14542r == -9223372036854775807L) {
                this.f14542r = 1000000L;
            }
            long j12 = this.f14543s;
            if (j12 != -9223372036854775807L) {
                this.f14544t = E(j12);
                return;
            }
            return;
        }
        if (i10 == 374648427) {
            if (this.f14527c.size() == 0) {
                throw b3.a("No valid tracks were found", null);
            }
            this.f14526b0.q();
        } else {
            if (i10 != 475249515) {
                return;
            }
            if (!this.f14546v) {
                this.f14526b0.p(m(this.C, this.D));
                this.f14546v = true;
            }
            this.C = null;
            this.D = null;
        }
    }

    protected void r(int i10, double d10) {
        if (i10 == 181) {
            t(i10).Q = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.f14543s = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                t(i10).D = (float) d10;
                return;
            case 21970:
                t(i10).E = (float) d10;
                return;
            case 21971:
                t(i10).F = (float) d10;
                return;
            case 21972:
                t(i10).G = (float) d10;
                return;
            case 21973:
                t(i10).H = (float) d10;
                return;
            case 21974:
                t(i10).I = (float) d10;
                return;
            case 21975:
                t(i10).J = (float) d10;
                return;
            case 21976:
                t(i10).K = (float) d10;
                return;
            case 21977:
                t(i10).L = (float) d10;
                return;
            case 21978:
                t(i10).M = (float) d10;
                return;
            default:
                switch (i10) {
                    case 30323:
                        t(i10).f14570s = (float) d10;
                        return;
                    case 30324:
                        t(i10).f14571t = (float) d10;
                        return;
                    case 30325:
                        t(i10).f14572u = (float) d10;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // y6.k
    public final void release() {
    }

    protected c t(int i10) {
        j(i10);
        return this.f14545u;
    }

    protected int u(int i10) {
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

    protected void v(c cVar, l lVar, int i10) {
        if (cVar.f14558g != 1685485123 && cVar.f14558g != 1685480259) {
            lVar.n(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        cVar.N = bArr;
        lVar.readFully(bArr, 0, i10);
    }

    protected void w(c cVar, int i10, l lVar, int i11) {
        if (i10 != 4 || !"V_VP9".equals(cVar.f14553b)) {
            lVar.n(i11);
        } else {
            this.f14538n.Q(i11);
            lVar.readFully(this.f14538n.e(), 0, i11);
        }
    }

    protected void x(int i10, long j10) {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw b3.a("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw b3.a("ContentEncodingScope " + j10 + " not supported", null);
        }
        switch (i10) {
            case 131:
                t(i10).f14555d = (int) j10;
                return;
            case 136:
                t(i10).V = j10 == 1;
                return;
            case 155:
                this.I = E(j10);
                return;
            case 159:
                t(i10).O = (int) j10;
                return;
            case 176:
                t(i10).f14564m = (int) j10;
                return;
            case 179:
                i(i10);
                this.C.a(E(j10));
                return;
            case 186:
                t(i10).f14565n = (int) j10;
                return;
            case 215:
                t(i10).f14554c = (int) j10;
                return;
            case 231:
                this.B = E(j10);
                return;
            case 238:
                this.P = (int) j10;
                return;
            case 241:
                if (this.E) {
                    return;
                }
                i(i10);
                this.D.a(j10);
                this.E = true;
                return;
            case 251:
                this.Q = true;
                return;
            case 16871:
                t(i10).f14558g = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw b3.a("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw b3.a("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw b3.a("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw b3.a("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw b3.a("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                this.f14548x = j10 + this.f14541q;
                return;
            case 21432:
                int i11 = (int) j10;
                j(i10);
                if (i11 == 0) {
                    this.f14545u.f14574w = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f14545u.f14574w = 2;
                    return;
                } else if (i11 == 3) {
                    this.f14545u.f14574w = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f14545u.f14574w = 3;
                    return;
                }
            case 21680:
                t(i10).f14566o = (int) j10;
                return;
            case 21682:
                t(i10).f14568q = (int) j10;
                return;
            case 21690:
                t(i10).f14567p = (int) j10;
                return;
            case 21930:
                t(i10).U = j10 == 1;
                return;
            case 21998:
                t(i10).f14557f = (int) j10;
                return;
            case 22186:
                t(i10).R = j10;
                return;
            case 22203:
                t(i10).S = j10;
                return;
            case 25188:
                t(i10).P = (int) j10;
                return;
            case 30114:
                this.R = j10;
                return;
            case 30321:
                j(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.f14545u.f14569r = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f14545u.f14569r = 1;
                    return;
                } else if (i12 == 2) {
                    this.f14545u.f14569r = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f14545u.f14569r = 3;
                    return;
                }
            case 2352003:
                t(i10).f14556e = (int) j10;
                return;
            case 2807729:
                this.f14542r = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        j(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.f14545u.A = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f14545u.A = 1;
                            return;
                        }
                    case 21946:
                        j(i10);
                        int d10 = u8.c.d((int) j10);
                        if (d10 != -1) {
                            this.f14545u.f14577z = d10;
                            return;
                        }
                        return;
                    case 21947:
                        j(i10);
                        this.f14545u.f14575x = true;
                        int c10 = u8.c.c((int) j10);
                        if (c10 != -1) {
                            this.f14545u.f14576y = c10;
                            return;
                        }
                        return;
                    case 21948:
                        t(i10).B = (int) j10;
                        return;
                    case 21949:
                        t(i10).C = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    protected boolean z(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }
}

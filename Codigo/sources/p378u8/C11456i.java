package p378u8;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.common.collect.AbstractC5907w;
import io.flutter.plugin.platform.PlatformPlugin;
import java.nio.ByteBuffer;
import java.util.List;
import p197k7.AbstractC9197r;
import p197k7.C9180c0;
import p197k7.C9192m;
import p197k7.C9195p;
import p197k7.InterfaceC9191l;
import p197k7.InterfaceC9199t;
import p361t6.C11108u1;
import p361t6.C11113v1;
import p361t6.C11121x;
import p361t6.InterfaceC11095r3;
import p363t8.C11137a;
import p363t8.C11166o0;
import p363t8.C11172r0;
import p363t8.C11173s;
import p363t8.C11177v;
import p363t8.C11178w;
import p378u8.InterfaceC11472y;
import p414w6.C12080e;
import p414w6.C12082g;
import p414w6.C12084i;

/* renamed from: u8.i */
/* loaded from: classes.dex */
public class C11456i extends AbstractC9197r {

    /* renamed from: A1 */
    private static boolean f29692A1;

    /* renamed from: y1 */
    private static final int[] f29693y1 = {1920, 1600, 1440, PlatformPlugin.DEFAULT_SYSTEM_UI, 960, 854, 640, 540, 480};

    /* renamed from: z1 */
    private static boolean f29694z1;

    /* renamed from: O0 */
    private final Context f29695O0;

    /* renamed from: P0 */
    private final C11461n f29696P0;

    /* renamed from: Q0 */
    private final InterfaceC11472y.a f29697Q0;

    /* renamed from: R0 */
    private final long f29698R0;

    /* renamed from: S0 */
    private final int f29699S0;

    /* renamed from: T0 */
    private final boolean f29700T0;

    /* renamed from: U0 */
    private b f29701U0;

    /* renamed from: V0 */
    private boolean f29702V0;

    /* renamed from: W0 */
    private boolean f29703W0;

    /* renamed from: X0 */
    private Surface f29704X0;

    /* renamed from: Y0 */
    private C11457j f29705Y0;

    /* renamed from: Z0 */
    private boolean f29706Z0;

    /* renamed from: a1 */
    private int f29707a1;

    /* renamed from: b1 */
    private boolean f29708b1;

    /* renamed from: c1 */
    private boolean f29709c1;

    /* renamed from: d1 */
    private boolean f29710d1;

    /* renamed from: e1 */
    private long f29711e1;

    /* renamed from: f1 */
    private long f29712f1;

    /* renamed from: g1 */
    private long f29713g1;

    /* renamed from: h1 */
    private int f29714h1;

    /* renamed from: i1 */
    private int f29715i1;

    /* renamed from: j1 */
    private int f29716j1;

    /* renamed from: k1 */
    private long f29717k1;

    /* renamed from: l1 */
    private long f29718l1;

    /* renamed from: m1 */
    private long f29719m1;

    /* renamed from: n1 */
    private int f29720n1;

    /* renamed from: o1 */
    private long f29721o1;

    /* renamed from: p1 */
    private int f29722p1;

    /* renamed from: q1 */
    private int f29723q1;

    /* renamed from: r1 */
    private int f29724r1;

    /* renamed from: s1 */
    private float f29725s1;

    /* renamed from: t1 */
    private C11448a0 f29726t1;

    /* renamed from: u1 */
    private boolean f29727u1;

    /* renamed from: v1 */
    private int f29728v1;

    /* renamed from: w1 */
    c f29729w1;

    /* renamed from: x1 */
    private InterfaceC11458k f29730x1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u8.i$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static boolean m35836a(Context context) {
            boolean isHdr;
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null) {
                return false;
            }
            isHdr = display.isHdr();
            if (!isHdr) {
                return false;
            }
            for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i10 == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u8.i$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f29731a;

        /* renamed from: b */
        public final int f29732b;

        /* renamed from: c */
        public final int f29733c;

        public b(int i10, int i11, int i12) {
            this.f29731a = i10;
            this.f29732b = i11;
            this.f29733c = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u8.i$c */
    /* loaded from: classes.dex */
    public final class c implements InterfaceC9191l.c, Handler.Callback {

        /* renamed from: a */
        private final Handler f29734a;

        public c(InterfaceC9191l interfaceC9191l) {
            Handler m34956x = C11172r0.m34956x(this);
            this.f29734a = m34956x;
            interfaceC9191l.mo27142h(this, m34956x);
        }

        /* renamed from: b */
        private void m35837b(long j10) {
            C11456i c11456i = C11456i.this;
            if (this != c11456i.f29729w1 || c11456i.m27375w0() == null) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                C11456i.this.m35812a2();
                return;
            }
            try {
                C11456i.this.m35826Z1(j10);
            } catch (C11121x e10) {
                C11456i.this.m27368n1(e10);
            }
        }

        @Override // p197k7.InterfaceC9191l.c
        /* renamed from: a */
        public void mo27260a(InterfaceC9191l interfaceC9191l, long j10, long j11) {
            if (C11172r0.f29040a >= 30) {
                m35837b(j10);
            } else {
                this.f29734a.sendMessageAtFrontOfQueue(Message.obtain(this.f29734a, 0, (int) (j10 >> 32), (int) j10));
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            m35837b(C11172r0.m34903X0(message.arg1, message.arg2));
            return true;
        }
    }

    public C11456i(Context context, InterfaceC9191l.b bVar, InterfaceC9199t interfaceC9199t, long j10, boolean z10, Handler handler, InterfaceC11472y interfaceC11472y, int i10) {
        this(context, bVar, interfaceC9199t, j10, z10, handler, interfaceC11472y, i10, 30.0f);
    }

    public C11456i(Context context, InterfaceC9191l.b bVar, InterfaceC9199t interfaceC9199t, long j10, boolean z10, Handler handler, InterfaceC11472y interfaceC11472y, int i10, float f10) {
        super(2, bVar, interfaceC9199t, z10, f10);
        this.f29698R0 = j10;
        this.f29699S0 = i10;
        Context applicationContext = context.getApplicationContext();
        this.f29695O0 = applicationContext;
        this.f29696P0 = new C11461n(applicationContext);
        this.f29697Q0 = new InterfaceC11472y.a(handler, interfaceC11472y);
        this.f29700T0 = m35797F1();
        this.f29712f1 = -9223372036854775807L;
        this.f29722p1 = -1;
        this.f29723q1 = -1;
        this.f29725s1 = -1.0f;
        this.f29707a1 = 1;
        this.f29728v1 = 0;
        m35795C1();
    }

    /* renamed from: B1 */
    private void m35794B1() {
        InterfaceC9191l m27375w0;
        this.f29708b1 = false;
        if (C11172r0.f29040a < 23 || !this.f29727u1 || (m27375w0 = m27375w0()) == null) {
            return;
        }
        this.f29729w1 = new c(m27375w0);
    }

    /* renamed from: C1 */
    private void m35795C1() {
        this.f29726t1 = null;
    }

    /* renamed from: E1 */
    private static void m35796E1(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    /* renamed from: F1 */
    private static boolean m35797F1() {
        return "NVIDIA".equals(C11172r0.f29042c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0844, code lost:
    
        if (r0.equals("PGN528") == false) goto L91;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x089b. Please report as an issue. */
    /* renamed from: H1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m35798H1() {
        /*
            Method dump skipped, instructions count: 3182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p378u8.C11456i.m35798H1():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x007a, code lost:
    
        if (r3.equals("video/av01") == false) goto L18;
     */
    /* renamed from: I1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m35799I1(p197k7.C9195p r9, p361t6.C11108u1 r10) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p378u8.C11456i.m35799I1(k7.p, t6.u1):int");
    }

    /* renamed from: J1 */
    private static Point m35800J1(C9195p c9195p, C11108u1 c11108u1) {
        int i10 = c11108u1.f28769C;
        int i11 = c11108u1.f28768B;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : f29693y1) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            if (C11172r0.f29040a >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point m27286c = c9195p.m27286c(i15, i13);
                if (c9195p.m27295w(m27286c.x, m27286c.y, c11108u1.f28770D)) {
                    return m27286c;
                }
            } else {
                try {
                    int m34932l = C11172r0.m34932l(i13, 16) * 16;
                    int m34932l2 = C11172r0.m34932l(i14, 16) * 16;
                    if (m34932l * m34932l2 <= C9180c0.m27168N()) {
                        int i16 = z10 ? m34932l2 : m34932l;
                        if (!z10) {
                            m34932l = m34932l2;
                        }
                        return new Point(i16, m34932l);
                    }
                } catch (C9180c0.c unused) {
                }
            }
        }
        return null;
    }

    /* renamed from: L1 */
    private static List<C9195p> m35801L1(Context context, InterfaceC9199t interfaceC9199t, C11108u1 c11108u1, boolean z10, boolean z11) {
        String str = c11108u1.f28797w;
        if (str == null) {
            return AbstractC5907w.m15081v();
        }
        List<C9195p> mo27387a = interfaceC9199t.mo27387a(str, z10, z11);
        String m27185m = C9180c0.m27185m(c11108u1);
        if (m27185m == null) {
            return AbstractC5907w.m15079r(mo27387a);
        }
        List<C9195p> mo27387a2 = interfaceC9199t.mo27387a(m27185m, z10, z11);
        return (C11172r0.f29040a < 26 || !"video/dolby-vision".equals(c11108u1.f28797w) || mo27387a2.isEmpty() || a.m35836a(context)) ? AbstractC5907w.m15077p().m15093j(mo27387a).m15093j(mo27387a2).m15094k() : AbstractC5907w.m15079r(mo27387a2);
    }

    /* renamed from: M1 */
    protected static int m35802M1(C9195p c9195p, C11108u1 c11108u1) {
        if (c11108u1.f28798x == -1) {
            return m35799I1(c9195p, c11108u1);
        }
        int size = c11108u1.f28799y.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += c11108u1.f28799y.get(i11).length;
        }
        return c11108u1.f28798x + i10;
    }

    /* renamed from: N1 */
    private static int m35803N1(int i10, int i11) {
        return (i10 * 3) / (i11 * 2);
    }

    /* renamed from: P1 */
    private static boolean m35804P1(long j10) {
        return j10 < -30000;
    }

    /* renamed from: Q1 */
    private static boolean m35805Q1(long j10) {
        return j10 < -500000;
    }

    /* renamed from: S1 */
    private void m35806S1() {
        if (this.f29714h1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f29697Q0.m35905n(this.f29714h1, elapsedRealtime - this.f29713g1);
            this.f29714h1 = 0;
            this.f29713g1 = elapsedRealtime;
        }
    }

    /* renamed from: U1 */
    private void m35807U1() {
        int i10 = this.f29720n1;
        if (i10 != 0) {
            this.f29697Q0.m35899B(this.f29719m1, i10);
            this.f29719m1 = 0L;
            this.f29720n1 = 0;
        }
    }

    /* renamed from: V1 */
    private void m35808V1() {
        int i10 = this.f29722p1;
        if (i10 == -1 && this.f29723q1 == -1) {
            return;
        }
        C11448a0 c11448a0 = this.f29726t1;
        if (c11448a0 != null && c11448a0.f29649a == i10 && c11448a0.f29650b == this.f29723q1 && c11448a0.f29651c == this.f29724r1 && c11448a0.f29652d == this.f29725s1) {
            return;
        }
        C11448a0 c11448a02 = new C11448a0(this.f29722p1, this.f29723q1, this.f29724r1, this.f29725s1);
        this.f29726t1 = c11448a02;
        this.f29697Q0.m35901D(c11448a02);
    }

    /* renamed from: W1 */
    private void m35809W1() {
        if (this.f29706Z0) {
            this.f29697Q0.m35898A(this.f29704X0);
        }
    }

    /* renamed from: X1 */
    private void m35810X1() {
        C11448a0 c11448a0 = this.f29726t1;
        if (c11448a0 != null) {
            this.f29697Q0.m35901D(c11448a0);
        }
    }

    /* renamed from: Y1 */
    private void m35811Y1(long j10, long j11, C11108u1 c11108u1) {
        InterfaceC11458k interfaceC11458k = this.f29730x1;
        if (interfaceC11458k != null) {
            interfaceC11458k.mo33989a(j10, j11, c11108u1, m27340A0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a2 */
    public void m35812a2() {
        m27367m1();
    }

    /* renamed from: b2 */
    private void m35813b2() {
        Surface surface = this.f29704X0;
        C11457j c11457j = this.f29705Y0;
        if (surface == c11457j) {
            this.f29704X0 = null;
        }
        c11457j.release();
        this.f29705Y0 = null;
    }

    /* renamed from: e2 */
    private static void m35814e2(InterfaceC9191l interfaceC9191l, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        interfaceC9191l.mo27143i(bundle);
    }

    /* renamed from: f2 */
    private void m35815f2() {
        this.f29712f1 = this.f29698R0 > 0 ? SystemClock.elapsedRealtime() + this.f29698R0 : -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [k7.r, t6.l, u8.i] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.Surface] */
    /* renamed from: g2 */
    private void m35816g2(Object obj) {
        C11457j c11457j = obj instanceof Surface ? (Surface) obj : null;
        if (c11457j == null) {
            C11457j c11457j2 = this.f29705Y0;
            if (c11457j2 != null) {
                c11457j = c11457j2;
            } else {
                C9195p m27377x0 = m27377x0();
                if (m27377x0 != null && m35817l2(m27377x0)) {
                    c11457j = C11457j.m35840c(this.f29695O0, m27377x0.f22247g);
                    this.f29705Y0 = c11457j;
                }
            }
        }
        if (this.f29704X0 == c11457j) {
            if (c11457j == null || c11457j == this.f29705Y0) {
                return;
            }
            m35810X1();
            m35809W1();
            return;
        }
        this.f29704X0 = c11457j;
        this.f29696P0.m35863m(c11457j);
        this.f29706Z0 = false;
        int state = getState();
        InterfaceC9191l m27375w0 = m27375w0();
        if (m27375w0 != null) {
            if (C11172r0.f29040a < 23 || c11457j == null || this.f29702V0) {
                m27362e1();
                m27346O0();
            } else {
                m35829h2(m27375w0, c11457j);
            }
        }
        if (c11457j == null || c11457j == this.f29705Y0) {
            m35795C1();
            m35794B1();
            return;
        }
        m35810X1();
        m35794B1();
        if (state == 2) {
            m35815f2();
        }
    }

    /* renamed from: l2 */
    private boolean m35817l2(C9195p c9195p) {
        return C11172r0.f29040a >= 23 && !this.f29727u1 && !m35820D1(c9195p.f22241a) && (!c9195p.f22247g || C11457j.m35839b(this.f29695O0));
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: B0 */
    protected List<C9195p> mo27341B0(InterfaceC9199t interfaceC9199t, C11108u1 c11108u1, boolean z10) {
        return C9180c0.m27193u(m35801L1(this.f29695O0, interfaceC9199t, c11108u1, z10, this.f29727u1), c11108u1);
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: D0 */
    protected InterfaceC9191l.a mo27342D0(C9195p c9195p, C11108u1 c11108u1, MediaCrypto mediaCrypto, float f10) {
        C11457j c11457j = this.f29705Y0;
        if (c11457j != null && c11457j.f29738a != c9195p.f22247g) {
            m35813b2();
        }
        String str = c9195p.f22243c;
        b m35822K1 = m35822K1(c9195p, c11108u1, m34240M());
        this.f29701U0 = m35822K1;
        MediaFormat m35823O1 = m35823O1(c11108u1, str, m35822K1, f10, this.f29700T0, this.f29727u1 ? this.f29728v1 : 0);
        if (this.f29704X0 == null) {
            if (!m35817l2(c9195p)) {
                throw new IllegalStateException();
            }
            if (this.f29705Y0 == null) {
                this.f29705Y0 = C11457j.m35840c(this.f29695O0, c9195p.f22247g);
            }
            this.f29704X0 = this.f29705Y0;
        }
        return InterfaceC9191l.a.m27259b(c9195p, m35823O1, c11108u1, this.f29704X0, mediaCrypto);
    }

    /* renamed from: D1 */
    protected boolean m35820D1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C11456i.class) {
            if (!f29694z1) {
                f29692A1 = m35798H1();
                f29694z1 = true;
            }
        }
        return f29692A1;
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: G0 */
    protected void mo27345G0(C12082g c12082g) {
        if (this.f29703W0) {
            ByteBuffer byteBuffer = (ByteBuffer) C11137a.m34603e(c12082g.f32145f);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        m35814e2(m27375w0(), bArr);
                    }
                }
            }
        }
    }

    /* renamed from: G1 */
    protected void m35821G1(InterfaceC9191l interfaceC9191l, int i10, long j10) {
        C11166o0.m34831a("dropVideoBuffer");
        interfaceC9191l.mo27147m(i10, false);
        C11166o0.m34833c();
        m35834n2(0, 1);
    }

    /* renamed from: K1 */
    protected b m35822K1(C9195p c9195p, C11108u1 c11108u1, C11108u1[] c11108u1Arr) {
        int m35799I1;
        int i10 = c11108u1.f28768B;
        int i11 = c11108u1.f28769C;
        int m35802M1 = m35802M1(c9195p, c11108u1);
        if (c11108u1Arr.length == 1) {
            if (m35802M1 != -1 && (m35799I1 = m35799I1(c9195p, c11108u1)) != -1) {
                m35802M1 = Math.min((int) (m35802M1 * 1.5f), m35799I1);
            }
            return new b(i10, i11, m35802M1);
        }
        int length = c11108u1Arr.length;
        boolean z10 = false;
        for (int i12 = 0; i12 < length; i12++) {
            C11108u1 c11108u12 = c11108u1Arr[i12];
            if (c11108u1.f28775I != null && c11108u12.f28775I == null) {
                c11108u12 = c11108u12.m34488c().m34531L(c11108u1.f28775I).m34526G();
            }
            if (c9195p.m27287f(c11108u1, c11108u12).f32155d != 0) {
                int i13 = c11108u12.f28768B;
                z10 |= i13 == -1 || c11108u12.f28769C == -1;
                i10 = Math.max(i10, i13);
                i11 = Math.max(i11, c11108u12.f28769C);
                m35802M1 = Math.max(m35802M1, m35802M1(c9195p, c11108u12));
            }
        }
        if (z10) {
            C11173s.m34970i("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i10 + "x" + i11);
            Point m35800J1 = m35800J1(c9195p, c11108u1);
            if (m35800J1 != null) {
                i10 = Math.max(i10, m35800J1.x);
                i11 = Math.max(i11, m35800J1.y);
                m35802M1 = Math.max(m35802M1, m35799I1(c9195p, c11108u1.m34488c().m34559n0(i10).m34538S(i11).m34526G()));
                C11173s.m34970i("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i10 + "x" + i11);
            }
        }
        return new b(i10, i11, m35802M1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p197k7.AbstractC9197r, p361t6.AbstractC11061l
    /* renamed from: O */
    public void mo22831O() {
        m35795C1();
        m35794B1();
        this.f29706Z0 = false;
        this.f29729w1 = null;
        try {
            super.mo22831O();
        } finally {
            this.f29697Q0.m35904m(this.f22272J0);
        }
    }

    /* renamed from: O1 */
    protected MediaFormat m35823O1(C11108u1 c11108u1, String str, b bVar, float f10, boolean z10, int i10) {
        Pair<Integer, Integer> m27189q;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", c11108u1.f28768B);
        mediaFormat.setInteger("height", c11108u1.f28769C);
        C11177v.m34992e(mediaFormat, c11108u1.f28799y);
        C11177v.m34990c(mediaFormat, "frame-rate", c11108u1.f28770D);
        C11177v.m34991d(mediaFormat, "rotation-degrees", c11108u1.f28771E);
        C11177v.m34989b(mediaFormat, c11108u1.f28775I);
        if ("video/dolby-vision".equals(c11108u1.f28797w) && (m27189q = C9180c0.m27189q(c11108u1)) != null) {
            C11177v.m34991d(mediaFormat, "profile", ((Integer) m27189q.first).intValue());
        }
        mediaFormat.setInteger("max-width", bVar.f29731a);
        mediaFormat.setInteger("max-height", bVar.f29732b);
        C11177v.m34991d(mediaFormat, "max-input-size", bVar.f29733c);
        if (C11172r0.f29040a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            m35796E1(mediaFormat, i10);
        }
        return mediaFormat;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p197k7.AbstractC9197r, p361t6.AbstractC11061l
    /* renamed from: P */
    public void mo27347P(boolean z10, boolean z11) {
        super.mo27347P(z10, z11);
        boolean z12 = m34236I().f28716a;
        C11137a.m34605g((z12 && this.f29728v1 == 0) ? false : true);
        if (this.f29727u1 != z12) {
            this.f29727u1 = z12;
            m27362e1();
        }
        this.f29697Q0.m35906o(this.f22272J0);
        this.f29709c1 = z11;
        this.f29710d1 = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p197k7.AbstractC9197r, p361t6.AbstractC11061l
    /* renamed from: Q */
    public void mo22832Q(long j10, boolean z10) {
        super.mo22832Q(j10, z10);
        m35794B1();
        this.f29696P0.m35860j();
        this.f29717k1 = -9223372036854775807L;
        this.f29711e1 = -9223372036854775807L;
        this.f29715i1 = 0;
        if (z10) {
            m35815f2();
        } else {
            this.f29712f1 = -9223372036854775807L;
        }
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: Q0 */
    protected void mo27348Q0(Exception exc) {
        C11173s.m34965d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f29697Q0.m35900C(exc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p197k7.AbstractC9197r, p361t6.AbstractC11061l
    /* renamed from: R */
    public void mo27349R() {
        try {
            super.mo27349R();
        } finally {
            if (this.f29705Y0 != null) {
                m35813b2();
            }
        }
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: R0 */
    protected void mo27350R0(String str, InterfaceC9191l.a aVar, long j10, long j11) {
        this.f29697Q0.m35902k(str, j10, j11);
        this.f29702V0 = m35820D1(str);
        this.f29703W0 = ((C9195p) C11137a.m34603e(m27377x0())).m27293p();
        if (C11172r0.f29040a < 23 || !this.f29727u1) {
            return;
        }
        this.f29729w1 = new c((InterfaceC9191l) C11137a.m34603e(m27375w0()));
    }

    /* renamed from: R1 */
    protected boolean m35824R1(long j10, boolean z10) {
        int m34243X = m34243X(j10);
        if (m34243X == 0) {
            return false;
        }
        if (z10) {
            C12080e c12080e = this.f22272J0;
            c12080e.f32132d += m34243X;
            c12080e.f32134f += this.f29716j1;
        } else {
            this.f22272J0.f32138j++;
            m35834n2(m34243X, this.f29716j1);
        }
        m27372t0();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p197k7.AbstractC9197r, p361t6.AbstractC11061l
    /* renamed from: S */
    public void mo27351S() {
        super.mo27351S();
        this.f29714h1 = 0;
        this.f29713g1 = SystemClock.elapsedRealtime();
        this.f29718l1 = SystemClock.elapsedRealtime() * 1000;
        this.f29719m1 = 0L;
        this.f29720n1 = 0;
        this.f29696P0.m35861k();
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: S0 */
    protected void mo27352S0(String str) {
        this.f29697Q0.m35903l(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p197k7.AbstractC9197r, p361t6.AbstractC11061l
    /* renamed from: T */
    public void mo27353T() {
        this.f29712f1 = -9223372036854775807L;
        m35806S1();
        m35807U1();
        this.f29696P0.m35862l();
        super.mo27353T();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p197k7.AbstractC9197r
    /* renamed from: T0 */
    public C12084i mo27354T0(C11113v1 c11113v1) {
        C12084i mo27354T0 = super.mo27354T0(c11113v1);
        this.f29697Q0.m35907p(c11113v1.f28853b, mo27354T0);
        return mo27354T0;
    }

    /* renamed from: T1 */
    void m35825T1() {
        this.f29710d1 = true;
        if (this.f29708b1) {
            return;
        }
        this.f29708b1 = true;
        this.f29697Q0.m35898A(this.f29704X0);
        this.f29706Z0 = true;
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: U0 */
    protected void mo27355U0(C11108u1 c11108u1, MediaFormat mediaFormat) {
        InterfaceC9191l m27375w0 = m27375w0();
        if (m27375w0 != null) {
            m27375w0.mo27136b(this.f29707a1);
        }
        if (this.f29727u1) {
            this.f29722p1 = c11108u1.f28768B;
            this.f29723q1 = c11108u1.f28769C;
        } else {
            C11137a.m34603e(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.f29722p1 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.f29723q1 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f10 = c11108u1.f28772F;
        this.f29725s1 = f10;
        if (C11172r0.f29040a >= 21) {
            int i10 = c11108u1.f28771E;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f29722p1;
                this.f29722p1 = this.f29723q1;
                this.f29723q1 = i11;
                this.f29725s1 = 1.0f / f10;
            }
        } else {
            this.f29724r1 = c11108u1.f28771E;
        }
        this.f29696P0.m35857g(c11108u1.f28770D);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p197k7.AbstractC9197r
    /* renamed from: W0 */
    public void mo27357W0(long j10) {
        super.mo27357W0(j10);
        if (this.f29727u1) {
            return;
        }
        this.f29716j1--;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p197k7.AbstractC9197r
    /* renamed from: X0 */
    public void mo27358X0() {
        super.mo27358X0();
        m35794B1();
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: Y0 */
    protected void mo27359Y0(C12082g c12082g) {
        boolean z10 = this.f29727u1;
        if (!z10) {
            this.f29716j1++;
        }
        if (C11172r0.f29040a >= 23 || !z10) {
            return;
        }
        m35826Z1(c12082g.f32144e);
    }

    /* renamed from: Z1 */
    protected void m35826Z1(long j10) {
        m27378x1(j10);
        m35808V1();
        this.f22272J0.f32133e++;
        m35825T1();
        mo27357W0(j10);
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: a0 */
    protected C12084i mo27360a0(C9195p c9195p, C11108u1 c11108u1, C11108u1 c11108u12) {
        C12084i m27287f = c9195p.m27287f(c11108u1, c11108u12);
        int i10 = m27287f.f32156e;
        int i11 = c11108u12.f28768B;
        b bVar = this.f29701U0;
        if (i11 > bVar.f29731a || c11108u12.f28769C > bVar.f29732b) {
            i10 |= RecognitionOptions.QR_CODE;
        }
        if (m35802M1(c9195p, c11108u12) > this.f29701U0.f29733c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new C12084i(c9195p.f22241a, c11108u1, c11108u12, i12 != 0 ? 0 : m27287f.f32155d, i12);
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: a1 */
    protected boolean mo27361a1(long j10, long j11, InterfaceC9191l interfaceC9191l, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, C11108u1 c11108u1) {
        boolean z12;
        long j13;
        C11137a.m34603e(interfaceC9191l);
        if (this.f29711e1 == -9223372036854775807L) {
            this.f29711e1 = j10;
        }
        if (j12 != this.f29717k1) {
            this.f29696P0.m35858h(j12);
            this.f29717k1 = j12;
        }
        long m27343E0 = m27343E0();
        long j14 = j12 - m27343E0;
        if (z10 && !z11) {
            m35833m2(interfaceC9191l, i10, j14);
            return true;
        }
        double m27344F0 = m27344F0();
        boolean z13 = getState() == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j15 = (long) ((j12 - j10) / m27344F0);
        if (z13) {
            j15 -= elapsedRealtime - j11;
        }
        if (this.f29704X0 == this.f29705Y0) {
            if (!m35804P1(j15)) {
                return false;
            }
            m35833m2(interfaceC9191l, i10, j14);
            m35835o2(j15);
            return true;
        }
        long j16 = elapsedRealtime - this.f29718l1;
        if (this.f29710d1 ? this.f29708b1 : !(z13 || this.f29709c1)) {
            j13 = j16;
            z12 = false;
        } else {
            z12 = true;
            j13 = j16;
        }
        if (!(this.f29712f1 == -9223372036854775807L && j10 >= m27343E0 && (z12 || (z13 && m35832k2(j15, j13))))) {
            if (z13 && j10 != this.f29711e1) {
                long nanoTime = System.nanoTime();
                long m35856b = this.f29696P0.m35856b((j15 * 1000) + nanoTime);
                long j17 = (m35856b - nanoTime) / 1000;
                boolean z14 = this.f29712f1 != -9223372036854775807L;
                if (m35830i2(j17, j11, z11) && m35824R1(j10, z14)) {
                    return false;
                }
                if (m35831j2(j17, j11, z11)) {
                    if (z14) {
                        m35833m2(interfaceC9191l, i10, j14);
                    } else {
                        m35821G1(interfaceC9191l, i10, j14);
                    }
                    j15 = j17;
                } else {
                    j15 = j17;
                    if (C11172r0.f29040a >= 21) {
                        if (j15 < 50000) {
                            if (m35856b == this.f29721o1) {
                                m35833m2(interfaceC9191l, i10, j14);
                            } else {
                                m35811Y1(j14, m35856b, c11108u1);
                                m35828d2(interfaceC9191l, i10, j14, m35856b);
                            }
                            m35835o2(j15);
                            this.f29721o1 = m35856b;
                            return true;
                        }
                    } else if (j15 < 30000) {
                        if (j15 > 11000) {
                            try {
                                Thread.sleep((j15 - 10000) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        m35811Y1(j14, m35856b, c11108u1);
                        m35827c2(interfaceC9191l, i10, j14);
                    }
                }
            }
            return false;
        }
        long nanoTime2 = System.nanoTime();
        m35811Y1(j14, nanoTime2, c11108u1);
        if (C11172r0.f29040a >= 21) {
            m35828d2(interfaceC9191l, i10, j14, nanoTime2);
        }
        m35827c2(interfaceC9191l, i10, j14);
        m35835o2(j15);
        return true;
    }

    /* renamed from: c2 */
    protected void m35827c2(InterfaceC9191l interfaceC9191l, int i10, long j10) {
        m35808V1();
        C11166o0.m34831a("releaseOutputBuffer");
        interfaceC9191l.mo27147m(i10, true);
        C11166o0.m34833c();
        this.f29718l1 = SystemClock.elapsedRealtime() * 1000;
        this.f22272J0.f32133e++;
        this.f29715i1 = 0;
        m35825T1();
    }

    @Override // p197k7.AbstractC9197r, p361t6.InterfaceC11090q3
    /* renamed from: d */
    public boolean mo22835d() {
        C11457j c11457j;
        if (super.mo22835d() && (this.f29708b1 || (((c11457j = this.f29705Y0) != null && this.f29704X0 == c11457j) || m27375w0() == null || this.f29727u1))) {
            this.f29712f1 = -9223372036854775807L;
            return true;
        }
        if (this.f29712f1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f29712f1) {
            return true;
        }
        this.f29712f1 = -9223372036854775807L;
        return false;
    }

    /* renamed from: d2 */
    protected void m35828d2(InterfaceC9191l interfaceC9191l, int i10, long j10, long j11) {
        m35808V1();
        C11166o0.m34831a("releaseOutputBuffer");
        interfaceC9191l.mo27144j(i10, j11);
        C11166o0.m34833c();
        this.f29718l1 = SystemClock.elapsedRealtime() * 1000;
        this.f22272J0.f32133e++;
        this.f29715i1 = 0;
        m35825T1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p197k7.AbstractC9197r
    /* renamed from: g1 */
    public void mo27364g1() {
        super.mo27364g1();
        this.f29716j1 = 0;
    }

    @Override // p361t6.InterfaceC11090q3, p361t6.InterfaceC11095r3
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    /* renamed from: h2 */
    protected void m35829h2(InterfaceC9191l interfaceC9191l, Surface surface) {
        interfaceC9191l.mo27138d(surface);
    }

    /* renamed from: i2 */
    protected boolean m35830i2(long j10, long j11, boolean z10) {
        return m35805Q1(j10) && !z10;
    }

    /* renamed from: j2 */
    protected boolean m35831j2(long j10, long j11, boolean z10) {
        return m35804P1(j10) && !z10;
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: k0 */
    protected C9192m mo27366k0(Throwable th2, C9195p c9195p) {
        return new C11454g(th2, c9195p, this.f29704X0);
    }

    /* renamed from: k2 */
    protected boolean m35832k2(long j10, long j11) {
        return m35804P1(j10) && j11 > 100000;
    }

    /* renamed from: m2 */
    protected void m35833m2(InterfaceC9191l interfaceC9191l, int i10, long j10) {
        C11166o0.m34831a("skipVideoBuffer");
        interfaceC9191l.mo27147m(i10, false);
        C11166o0.m34833c();
        this.f22272J0.f32134f++;
    }

    /* renamed from: n2 */
    protected void m35834n2(int i10, int i11) {
        C12080e c12080e = this.f22272J0;
        c12080e.f32136h += i10;
        int i12 = i10 + i11;
        c12080e.f32135g += i12;
        this.f29714h1 += i12;
        int i13 = this.f29715i1 + i12;
        this.f29715i1 = i13;
        c12080e.f32137i = Math.max(i13, c12080e.f32137i);
        int i14 = this.f29699S0;
        if (i14 <= 0 || this.f29714h1 < i14) {
            return;
        }
        m35806S1();
    }

    /* renamed from: o2 */
    protected void m35835o2(long j10) {
        this.f22272J0.m38805a(j10);
        this.f29719m1 += j10;
        this.f29720n1++;
    }

    @Override // p361t6.AbstractC11061l, p361t6.C11070m3.b
    /* renamed from: p */
    public void mo33992p(int i10, Object obj) {
        if (i10 == 1) {
            m35816g2(obj);
            return;
        }
        if (i10 == 7) {
            this.f29730x1 = (InterfaceC11458k) obj;
            return;
        }
        if (i10 == 10) {
            int intValue = ((Integer) obj).intValue();
            if (this.f29728v1 != intValue) {
                this.f29728v1 = intValue;
                if (this.f29727u1) {
                    m27362e1();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                super.mo33992p(i10, obj);
                return;
            } else {
                this.f29696P0.m35864o(((Integer) obj).intValue());
                return;
            }
        }
        this.f29707a1 = ((Integer) obj).intValue();
        InterfaceC9191l m27375w0 = m27375w0();
        if (m27375w0 != null) {
            m27375w0.mo27136b(this.f29707a1);
        }
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: q1 */
    protected boolean mo27369q1(C9195p c9195p) {
        return this.f29704X0 != null || m35817l2(c9195p);
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: t1 */
    protected int mo27373t1(InterfaceC9199t interfaceC9199t, C11108u1 c11108u1) {
        boolean z10;
        int i10 = 0;
        if (!C11178w.m35011s(c11108u1.f28797w)) {
            return InterfaceC11095r3.m34459o(0);
        }
        boolean z11 = c11108u1.f28800z != null;
        List<C9195p> m35801L1 = m35801L1(this.f29695O0, interfaceC9199t, c11108u1, z11, false);
        if (z11 && m35801L1.isEmpty()) {
            m35801L1 = m35801L1(this.f29695O0, interfaceC9199t, c11108u1, false, false);
        }
        if (m35801L1.isEmpty()) {
            return InterfaceC11095r3.m34459o(1);
        }
        if (!AbstractC9197r.m27336u1(c11108u1)) {
            return InterfaceC11095r3.m34459o(2);
        }
        C9195p c9195p = m35801L1.get(0);
        boolean m27292o = c9195p.m27292o(c11108u1);
        if (!m27292o) {
            for (int i11 = 1; i11 < m35801L1.size(); i11++) {
                C9195p c9195p2 = m35801L1.get(i11);
                if (c9195p2.m27292o(c11108u1)) {
                    z10 = false;
                    m27292o = true;
                    c9195p = c9195p2;
                    break;
                }
            }
        }
        z10 = true;
        int i12 = m27292o ? 4 : 3;
        int i13 = c9195p.m27294r(c11108u1) ? 16 : 8;
        int i14 = c9195p.f22248h ? 64 : 0;
        int i15 = z10 ? RecognitionOptions.ITF : 0;
        if (C11172r0.f29040a >= 26 && "video/dolby-vision".equals(c11108u1.f28797w) && !a.m35836a(this.f29695O0)) {
            i15 = RecognitionOptions.QR_CODE;
        }
        if (m27292o) {
            List<C9195p> m35801L12 = m35801L1(this.f29695O0, interfaceC9199t, c11108u1, z11, true);
            if (!m35801L12.isEmpty()) {
                C9195p c9195p3 = C9180c0.m27193u(m35801L12, c11108u1).get(0);
                if (c9195p3.m27292o(c11108u1) && c9195p3.m27294r(c11108u1)) {
                    i10 = 32;
                }
            }
        }
        return InterfaceC11095r3.m34456l(i12, i13, i10, i14, i15);
    }

    @Override // p197k7.AbstractC9197r, p361t6.InterfaceC11090q3
    /* renamed from: x */
    public void mo27376x(float f10, float f11) {
        super.mo27376x(f10, f11);
        this.f29696P0.m35859i(f10);
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: y0 */
    protected boolean mo27380y0() {
        return this.f29727u1 && C11172r0.f29040a < 23;
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: z0 */
    protected float mo27381z0(float f10, C11108u1 c11108u1, C11108u1[] c11108u1Arr) {
        float f11 = -1.0f;
        for (C11108u1 c11108u12 : c11108u1Arr) {
            float f12 = c11108u12.f28770D;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }
}

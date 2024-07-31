package u8;

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
import io.flutter.plugin.platform.PlatformPlugin;
import java.nio.ByteBuffer;
import java.util.List;
import k7.c0;
import k7.l;
import t6.r3;
import t6.u1;
import t6.v1;
import t8.o0;
import t8.r0;
import u8.y;

/* loaded from: classes.dex */
public class i extends k7.r {
    private static boolean A1;

    /* renamed from: y1, reason: collision with root package name */
    private static final int[] f27389y1 = {1920, 1600, 1440, PlatformPlugin.DEFAULT_SYSTEM_UI, 960, 854, 640, 540, 480};

    /* renamed from: z1, reason: collision with root package name */
    private static boolean f27390z1;
    private final Context O0;
    private final n P0;
    private final y.a Q0;
    private final long R0;
    private final int S0;
    private final boolean T0;
    private b U0;
    private boolean V0;
    private boolean W0;
    private Surface X0;
    private j Y0;
    private boolean Z0;

    /* renamed from: a1, reason: collision with root package name */
    private int f27391a1;

    /* renamed from: b1, reason: collision with root package name */
    private boolean f27392b1;

    /* renamed from: c1, reason: collision with root package name */
    private boolean f27393c1;

    /* renamed from: d1, reason: collision with root package name */
    private boolean f27394d1;

    /* renamed from: e1, reason: collision with root package name */
    private long f27395e1;

    /* renamed from: f1, reason: collision with root package name */
    private long f27396f1;

    /* renamed from: g1, reason: collision with root package name */
    private long f27397g1;

    /* renamed from: h1, reason: collision with root package name */
    private int f27398h1;

    /* renamed from: i1, reason: collision with root package name */
    private int f27399i1;

    /* renamed from: j1, reason: collision with root package name */
    private int f27400j1;

    /* renamed from: k1, reason: collision with root package name */
    private long f27401k1;

    /* renamed from: l1, reason: collision with root package name */
    private long f27402l1;

    /* renamed from: m1, reason: collision with root package name */
    private long f27403m1;

    /* renamed from: n1, reason: collision with root package name */
    private int f27404n1;

    /* renamed from: o1, reason: collision with root package name */
    private long f27405o1;

    /* renamed from: p1, reason: collision with root package name */
    private int f27406p1;

    /* renamed from: q1, reason: collision with root package name */
    private int f27407q1;

    /* renamed from: r1, reason: collision with root package name */
    private int f27408r1;

    /* renamed from: s1, reason: collision with root package name */
    private float f27409s1;

    /* renamed from: t1, reason: collision with root package name */
    private a0 f27410t1;

    /* renamed from: u1, reason: collision with root package name */
    private boolean f27411u1;

    /* renamed from: v1, reason: collision with root package name */
    private int f27412v1;

    /* renamed from: w1, reason: collision with root package name */
    c f27413w1;

    /* renamed from: x1, reason: collision with root package name */
    private k f27414x1;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(Context context) {
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
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f27415a;

        /* renamed from: b, reason: collision with root package name */
        public final int f27416b;

        /* renamed from: c, reason: collision with root package name */
        public final int f27417c;

        public b(int i10, int i11, int i12) {
            this.f27415a = i10;
            this.f27416b = i11;
            this.f27417c = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c implements l.c, Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f27418a;

        public c(k7.l lVar) {
            Handler x10 = r0.x(this);
            this.f27418a = x10;
            lVar.h(this, x10);
        }

        private void b(long j10) {
            i iVar = i.this;
            if (this != iVar.f27413w1 || iVar.w0() == null) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                i.this.a2();
                return;
            }
            try {
                i.this.Z1(j10);
            } catch (t6.x e10) {
                i.this.n1(e10);
            }
        }

        @Override // k7.l.c
        public void a(k7.l lVar, long j10, long j11) {
            if (r0.f26744a >= 30) {
                b(j10);
            } else {
                this.f27418a.sendMessageAtFrontOfQueue(Message.obtain(this.f27418a, 0, (int) (j10 >> 32), (int) j10));
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(r0.X0(message.arg1, message.arg2));
            return true;
        }
    }

    public i(Context context, l.b bVar, k7.t tVar, long j10, boolean z10, Handler handler, y yVar, int i10) {
        this(context, bVar, tVar, j10, z10, handler, yVar, i10, 30.0f);
    }

    public i(Context context, l.b bVar, k7.t tVar, long j10, boolean z10, Handler handler, y yVar, int i10, float f10) {
        super(2, bVar, tVar, z10, f10);
        this.R0 = j10;
        this.S0 = i10;
        Context applicationContext = context.getApplicationContext();
        this.O0 = applicationContext;
        this.P0 = new n(applicationContext);
        this.Q0 = new y.a(handler, yVar);
        this.T0 = F1();
        this.f27396f1 = -9223372036854775807L;
        this.f27406p1 = -1;
        this.f27407q1 = -1;
        this.f27409s1 = -1.0f;
        this.f27391a1 = 1;
        this.f27412v1 = 0;
        C1();
    }

    private void B1() {
        k7.l w02;
        this.f27392b1 = false;
        if (r0.f26744a < 23 || !this.f27411u1 || (w02 = w0()) == null) {
            return;
        }
        this.f27413w1 = new c(w02);
    }

    private void C1() {
        this.f27410t1 = null;
    }

    private static void E1(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    private static boolean F1() {
        return "NVIDIA".equals(r0.f26746c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0844, code lost:
    
        if (r0.equals("PGN528") == false) goto L91;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x089b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean H1() {
        /*
            Method dump skipped, instructions count: 3182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.i.H1():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x007a, code lost:
    
        if (r3.equals("video/av01") == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int I1(k7.p r9, t6.u1 r10) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.i.I1(k7.p, t6.u1):int");
    }

    private static Point J1(k7.p pVar, u1 u1Var) {
        int i10 = u1Var.C;
        int i11 = u1Var.B;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : f27389y1) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            if (r0.f26744a >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point c10 = pVar.c(i15, i13);
                if (pVar.w(c10.x, c10.y, u1Var.D)) {
                    return c10;
                }
            } else {
                try {
                    int l10 = r0.l(i13, 16) * 16;
                    int l11 = r0.l(i14, 16) * 16;
                    if (l10 * l11 <= c0.N()) {
                        int i16 = z10 ? l11 : l10;
                        if (!z10) {
                            l10 = l11;
                        }
                        return new Point(i16, l10);
                    }
                } catch (c0.c unused) {
                }
            }
        }
        return null;
    }

    private static List<k7.p> L1(Context context, k7.t tVar, u1 u1Var, boolean z10, boolean z11) {
        String str = u1Var.f26517w;
        if (str == null) {
            return com.google.common.collect.w.v();
        }
        List<k7.p> a10 = tVar.a(str, z10, z11);
        String m10 = c0.m(u1Var);
        if (m10 == null) {
            return com.google.common.collect.w.r(a10);
        }
        List<k7.p> a11 = tVar.a(m10, z10, z11);
        return (r0.f26744a < 26 || !"video/dolby-vision".equals(u1Var.f26517w) || a11.isEmpty() || a.a(context)) ? com.google.common.collect.w.p().j(a10).j(a11).k() : com.google.common.collect.w.r(a11);
    }

    protected static int M1(k7.p pVar, u1 u1Var) {
        if (u1Var.f26518x == -1) {
            return I1(pVar, u1Var);
        }
        int size = u1Var.f26519y.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += u1Var.f26519y.get(i11).length;
        }
        return u1Var.f26518x + i10;
    }

    private static int N1(int i10, int i11) {
        return (i10 * 3) / (i11 * 2);
    }

    private static boolean P1(long j10) {
        return j10 < -30000;
    }

    private static boolean Q1(long j10) {
        return j10 < -500000;
    }

    private void S1() {
        if (this.f27398h1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.Q0.n(this.f27398h1, elapsedRealtime - this.f27397g1);
            this.f27398h1 = 0;
            this.f27397g1 = elapsedRealtime;
        }
    }

    private void U1() {
        int i10 = this.f27404n1;
        if (i10 != 0) {
            this.Q0.B(this.f27403m1, i10);
            this.f27403m1 = 0L;
            this.f27404n1 = 0;
        }
    }

    private void V1() {
        int i10 = this.f27406p1;
        if (i10 == -1 && this.f27407q1 == -1) {
            return;
        }
        a0 a0Var = this.f27410t1;
        if (a0Var != null && a0Var.f27346a == i10 && a0Var.f27347b == this.f27407q1 && a0Var.f27348c == this.f27408r1 && a0Var.f27349d == this.f27409s1) {
            return;
        }
        a0 a0Var2 = new a0(this.f27406p1, this.f27407q1, this.f27408r1, this.f27409s1);
        this.f27410t1 = a0Var2;
        this.Q0.D(a0Var2);
    }

    private void W1() {
        if (this.Z0) {
            this.Q0.A(this.X0);
        }
    }

    private void X1() {
        a0 a0Var = this.f27410t1;
        if (a0Var != null) {
            this.Q0.D(a0Var);
        }
    }

    private void Y1(long j10, long j11, u1 u1Var) {
        k kVar = this.f27414x1;
        if (kVar != null) {
            kVar.a(j10, j11, u1Var, A0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a2() {
        m1();
    }

    private void b2() {
        Surface surface = this.X0;
        j jVar = this.Y0;
        if (surface == jVar) {
            this.X0 = null;
        }
        jVar.release();
        this.Y0 = null;
    }

    private static void e2(k7.l lVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        lVar.i(bundle);
    }

    private void f2() {
        this.f27396f1 = this.R0 > 0 ? SystemClock.elapsedRealtime() + this.R0 : -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [k7.r, t6.l, u8.i] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.Surface] */
    private void g2(Object obj) {
        j jVar = obj instanceof Surface ? (Surface) obj : null;
        if (jVar == null) {
            j jVar2 = this.Y0;
            if (jVar2 != null) {
                jVar = jVar2;
            } else {
                k7.p x02 = x0();
                if (x02 != null && l2(x02)) {
                    jVar = j.c(this.O0, x02.f20465g);
                    this.Y0 = jVar;
                }
            }
        }
        if (this.X0 == jVar) {
            if (jVar == null || jVar == this.Y0) {
                return;
            }
            X1();
            W1();
            return;
        }
        this.X0 = jVar;
        this.P0.m(jVar);
        this.Z0 = false;
        int state = getState();
        k7.l w02 = w0();
        if (w02 != null) {
            if (r0.f26744a < 23 || jVar == null || this.V0) {
                e1();
                O0();
            } else {
                h2(w02, jVar);
            }
        }
        if (jVar == null || jVar == this.Y0) {
            C1();
            B1();
            return;
        }
        X1();
        B1();
        if (state == 2) {
            f2();
        }
    }

    private boolean l2(k7.p pVar) {
        return r0.f26744a >= 23 && !this.f27411u1 && !D1(pVar.f20459a) && (!pVar.f20465g || j.b(this.O0));
    }

    @Override // k7.r
    protected List<k7.p> B0(k7.t tVar, u1 u1Var, boolean z10) {
        return c0.u(L1(this.O0, tVar, u1Var, z10, this.f27411u1), u1Var);
    }

    @Override // k7.r
    protected l.a D0(k7.p pVar, u1 u1Var, MediaCrypto mediaCrypto, float f10) {
        j jVar = this.Y0;
        if (jVar != null && jVar.f27422a != pVar.f20465g) {
            b2();
        }
        String str = pVar.f20461c;
        b K1 = K1(pVar, u1Var, M());
        this.U0 = K1;
        MediaFormat O1 = O1(u1Var, str, K1, f10, this.T0, this.f27411u1 ? this.f27412v1 : 0);
        if (this.X0 == null) {
            if (!l2(pVar)) {
                throw new IllegalStateException();
            }
            if (this.Y0 == null) {
                this.Y0 = j.c(this.O0, pVar.f20465g);
            }
            this.X0 = this.Y0;
        }
        return l.a.b(pVar, O1, u1Var, this.X0, mediaCrypto);
    }

    protected boolean D1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (i.class) {
            if (!f27390z1) {
                A1 = H1();
                f27390z1 = true;
            }
        }
        return A1;
    }

    @Override // k7.r
    protected void G0(w6.g gVar) {
        if (this.W0) {
            ByteBuffer byteBuffer = (ByteBuffer) t8.a.e(gVar.f29682f);
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
                        e2(w0(), bArr);
                    }
                }
            }
        }
    }

    protected void G1(k7.l lVar, int i10, long j10) {
        o0.a("dropVideoBuffer");
        lVar.m(i10, false);
        o0.c();
        n2(0, 1);
    }

    protected b K1(k7.p pVar, u1 u1Var, u1[] u1VarArr) {
        int I1;
        int i10 = u1Var.B;
        int i11 = u1Var.C;
        int M1 = M1(pVar, u1Var);
        if (u1VarArr.length == 1) {
            if (M1 != -1 && (I1 = I1(pVar, u1Var)) != -1) {
                M1 = Math.min((int) (M1 * 1.5f), I1);
            }
            return new b(i10, i11, M1);
        }
        int length = u1VarArr.length;
        boolean z10 = false;
        for (int i12 = 0; i12 < length; i12++) {
            u1 u1Var2 = u1VarArr[i12];
            if (u1Var.I != null && u1Var2.I == null) {
                u1Var2 = u1Var2.c().L(u1Var.I).G();
            }
            if (pVar.f(u1Var, u1Var2).f29692d != 0) {
                int i13 = u1Var2.B;
                z10 |= i13 == -1 || u1Var2.C == -1;
                i10 = Math.max(i10, i13);
                i11 = Math.max(i11, u1Var2.C);
                M1 = Math.max(M1, M1(pVar, u1Var2));
            }
        }
        if (z10) {
            t8.s.i("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i10 + "x" + i11);
            Point J1 = J1(pVar, u1Var);
            if (J1 != null) {
                i10 = Math.max(i10, J1.x);
                i11 = Math.max(i11, J1.y);
                M1 = Math.max(M1, I1(pVar, u1Var.c().n0(i10).S(i11).G()));
                t8.s.i("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i10 + "x" + i11);
            }
        }
        return new b(i10, i11, M1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.r, t6.l
    public void O() {
        C1();
        B1();
        this.Z0 = false;
        this.f27413w1 = null;
        try {
            super.O();
        } finally {
            this.Q0.m(this.J0);
        }
    }

    protected MediaFormat O1(u1 u1Var, String str, b bVar, float f10, boolean z10, int i10) {
        Pair<Integer, Integer> q10;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", u1Var.B);
        mediaFormat.setInteger("height", u1Var.C);
        t8.v.e(mediaFormat, u1Var.f26519y);
        t8.v.c(mediaFormat, "frame-rate", u1Var.D);
        t8.v.d(mediaFormat, "rotation-degrees", u1Var.E);
        t8.v.b(mediaFormat, u1Var.I);
        if ("video/dolby-vision".equals(u1Var.f26517w) && (q10 = c0.q(u1Var)) != null) {
            t8.v.d(mediaFormat, "profile", ((Integer) q10.first).intValue());
        }
        mediaFormat.setInteger("max-width", bVar.f27415a);
        mediaFormat.setInteger("max-height", bVar.f27416b);
        t8.v.d(mediaFormat, "max-input-size", bVar.f27417c);
        if (r0.f26744a >= 23) {
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
            E1(mediaFormat, i10);
        }
        return mediaFormat;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.r, t6.l
    public void P(boolean z10, boolean z11) {
        super.P(z10, z11);
        boolean z12 = I().f26463a;
        t8.a.g((z12 && this.f27412v1 == 0) ? false : true);
        if (this.f27411u1 != z12) {
            this.f27411u1 = z12;
            e1();
        }
        this.Q0.o(this.J0);
        this.f27393c1 = z11;
        this.f27394d1 = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.r, t6.l
    public void Q(long j10, boolean z10) {
        super.Q(j10, z10);
        B1();
        this.P0.j();
        this.f27401k1 = -9223372036854775807L;
        this.f27395e1 = -9223372036854775807L;
        this.f27399i1 = 0;
        if (z10) {
            f2();
        } else {
            this.f27396f1 = -9223372036854775807L;
        }
    }

    @Override // k7.r
    protected void Q0(Exception exc) {
        t8.s.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.Q0.C(exc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.r, t6.l
    public void R() {
        try {
            super.R();
        } finally {
            if (this.Y0 != null) {
                b2();
            }
        }
    }

    @Override // k7.r
    protected void R0(String str, l.a aVar, long j10, long j11) {
        this.Q0.k(str, j10, j11);
        this.V0 = D1(str);
        this.W0 = ((k7.p) t8.a.e(x0())).p();
        if (r0.f26744a < 23 || !this.f27411u1) {
            return;
        }
        this.f27413w1 = new c((k7.l) t8.a.e(w0()));
    }

    protected boolean R1(long j10, boolean z10) {
        int X = X(j10);
        if (X == 0) {
            return false;
        }
        if (z10) {
            w6.e eVar = this.J0;
            eVar.f29669d += X;
            eVar.f29671f += this.f27400j1;
        } else {
            this.J0.f29675j++;
            n2(X, this.f27400j1);
        }
        t0();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.r, t6.l
    public void S() {
        super.S();
        this.f27398h1 = 0;
        this.f27397g1 = SystemClock.elapsedRealtime();
        this.f27402l1 = SystemClock.elapsedRealtime() * 1000;
        this.f27403m1 = 0L;
        this.f27404n1 = 0;
        this.P0.k();
    }

    @Override // k7.r
    protected void S0(String str) {
        this.Q0.l(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.r, t6.l
    public void T() {
        this.f27396f1 = -9223372036854775807L;
        S1();
        U1();
        this.P0.l();
        super.T();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.r
    public w6.i T0(v1 v1Var) {
        w6.i T0 = super.T0(v1Var);
        this.Q0.p(v1Var.f26567b, T0);
        return T0;
    }

    void T1() {
        this.f27394d1 = true;
        if (this.f27392b1) {
            return;
        }
        this.f27392b1 = true;
        this.Q0.A(this.X0);
        this.Z0 = true;
    }

    @Override // k7.r
    protected void U0(u1 u1Var, MediaFormat mediaFormat) {
        k7.l w02 = w0();
        if (w02 != null) {
            w02.b(this.f27391a1);
        }
        if (this.f27411u1) {
            this.f27406p1 = u1Var.B;
            this.f27407q1 = u1Var.C;
        } else {
            t8.a.e(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.f27406p1 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.f27407q1 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f10 = u1Var.F;
        this.f27409s1 = f10;
        if (r0.f26744a >= 21) {
            int i10 = u1Var.E;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f27406p1;
                this.f27406p1 = this.f27407q1;
                this.f27407q1 = i11;
                this.f27409s1 = 1.0f / f10;
            }
        } else {
            this.f27408r1 = u1Var.E;
        }
        this.P0.g(u1Var.D);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.r
    public void W0(long j10) {
        super.W0(j10);
        if (this.f27411u1) {
            return;
        }
        this.f27400j1--;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.r
    public void X0() {
        super.X0();
        B1();
    }

    @Override // k7.r
    protected void Y0(w6.g gVar) {
        boolean z10 = this.f27411u1;
        if (!z10) {
            this.f27400j1++;
        }
        if (r0.f26744a >= 23 || !z10) {
            return;
        }
        Z1(gVar.f29681e);
    }

    protected void Z1(long j10) {
        x1(j10);
        V1();
        this.J0.f29670e++;
        T1();
        W0(j10);
    }

    @Override // k7.r
    protected w6.i a0(k7.p pVar, u1 u1Var, u1 u1Var2) {
        w6.i f10 = pVar.f(u1Var, u1Var2);
        int i10 = f10.f29693e;
        int i11 = u1Var2.B;
        b bVar = this.U0;
        if (i11 > bVar.f27415a || u1Var2.C > bVar.f27416b) {
            i10 |= RecognitionOptions.QR_CODE;
        }
        if (M1(pVar, u1Var2) > this.U0.f27417c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new w6.i(pVar.f20459a, u1Var, u1Var2, i12 != 0 ? 0 : f10.f29692d, i12);
    }

    @Override // k7.r
    protected boolean a1(long j10, long j11, k7.l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, u1 u1Var) {
        boolean z12;
        long j13;
        t8.a.e(lVar);
        if (this.f27395e1 == -9223372036854775807L) {
            this.f27395e1 = j10;
        }
        if (j12 != this.f27401k1) {
            this.P0.h(j12);
            this.f27401k1 = j12;
        }
        long E0 = E0();
        long j14 = j12 - E0;
        if (z10 && !z11) {
            m2(lVar, i10, j14);
            return true;
        }
        double F0 = F0();
        boolean z13 = getState() == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j15 = (long) ((j12 - j10) / F0);
        if (z13) {
            j15 -= elapsedRealtime - j11;
        }
        if (this.X0 == this.Y0) {
            if (!P1(j15)) {
                return false;
            }
            m2(lVar, i10, j14);
            o2(j15);
            return true;
        }
        long j16 = elapsedRealtime - this.f27402l1;
        if (this.f27394d1 ? this.f27392b1 : !(z13 || this.f27393c1)) {
            j13 = j16;
            z12 = false;
        } else {
            z12 = true;
            j13 = j16;
        }
        if (!(this.f27396f1 == -9223372036854775807L && j10 >= E0 && (z12 || (z13 && k2(j15, j13))))) {
            if (z13 && j10 != this.f27395e1) {
                long nanoTime = System.nanoTime();
                long b10 = this.P0.b((j15 * 1000) + nanoTime);
                long j17 = (b10 - nanoTime) / 1000;
                boolean z14 = this.f27396f1 != -9223372036854775807L;
                if (i2(j17, j11, z11) && R1(j10, z14)) {
                    return false;
                }
                if (j2(j17, j11, z11)) {
                    if (z14) {
                        m2(lVar, i10, j14);
                    } else {
                        G1(lVar, i10, j14);
                    }
                    j15 = j17;
                } else {
                    j15 = j17;
                    if (r0.f26744a >= 21) {
                        if (j15 < 50000) {
                            if (b10 == this.f27405o1) {
                                m2(lVar, i10, j14);
                            } else {
                                Y1(j14, b10, u1Var);
                                d2(lVar, i10, j14, b10);
                            }
                            o2(j15);
                            this.f27405o1 = b10;
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
                        Y1(j14, b10, u1Var);
                        c2(lVar, i10, j14);
                    }
                }
            }
            return false;
        }
        long nanoTime2 = System.nanoTime();
        Y1(j14, nanoTime2, u1Var);
        if (r0.f26744a >= 21) {
            d2(lVar, i10, j14, nanoTime2);
        }
        c2(lVar, i10, j14);
        o2(j15);
        return true;
    }

    protected void c2(k7.l lVar, int i10, long j10) {
        V1();
        o0.a("releaseOutputBuffer");
        lVar.m(i10, true);
        o0.c();
        this.f27402l1 = SystemClock.elapsedRealtime() * 1000;
        this.J0.f29670e++;
        this.f27399i1 = 0;
        T1();
    }

    @Override // k7.r, t6.q3
    public boolean d() {
        j jVar;
        if (super.d() && (this.f27392b1 || (((jVar = this.Y0) != null && this.X0 == jVar) || w0() == null || this.f27411u1))) {
            this.f27396f1 = -9223372036854775807L;
            return true;
        }
        if (this.f27396f1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f27396f1) {
            return true;
        }
        this.f27396f1 = -9223372036854775807L;
        return false;
    }

    protected void d2(k7.l lVar, int i10, long j10, long j11) {
        V1();
        o0.a("releaseOutputBuffer");
        lVar.j(i10, j11);
        o0.c();
        this.f27402l1 = SystemClock.elapsedRealtime() * 1000;
        this.J0.f29670e++;
        this.f27399i1 = 0;
        T1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.r
    public void g1() {
        super.g1();
        this.f27400j1 = 0;
    }

    @Override // t6.q3, t6.r3
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    protected void h2(k7.l lVar, Surface surface) {
        lVar.d(surface);
    }

    protected boolean i2(long j10, long j11, boolean z10) {
        return Q1(j10) && !z10;
    }

    protected boolean j2(long j10, long j11, boolean z10) {
        return P1(j10) && !z10;
    }

    @Override // k7.r
    protected k7.m k0(Throwable th2, k7.p pVar) {
        return new g(th2, pVar, this.X0);
    }

    protected boolean k2(long j10, long j11) {
        return P1(j10) && j11 > 100000;
    }

    protected void m2(k7.l lVar, int i10, long j10) {
        o0.a("skipVideoBuffer");
        lVar.m(i10, false);
        o0.c();
        this.J0.f29671f++;
    }

    protected void n2(int i10, int i11) {
        w6.e eVar = this.J0;
        eVar.f29673h += i10;
        int i12 = i10 + i11;
        eVar.f29672g += i12;
        this.f27398h1 += i12;
        int i13 = this.f27399i1 + i12;
        this.f27399i1 = i13;
        eVar.f29674i = Math.max(i13, eVar.f29674i);
        int i14 = this.S0;
        if (i14 <= 0 || this.f27398h1 < i14) {
            return;
        }
        S1();
    }

    protected void o2(long j10) {
        this.J0.a(j10);
        this.f27403m1 += j10;
        this.f27404n1++;
    }

    @Override // t6.l, t6.m3.b
    public void p(int i10, Object obj) {
        if (i10 == 1) {
            g2(obj);
            return;
        }
        if (i10 == 7) {
            this.f27414x1 = (k) obj;
            return;
        }
        if (i10 == 10) {
            int intValue = ((Integer) obj).intValue();
            if (this.f27412v1 != intValue) {
                this.f27412v1 = intValue;
                if (this.f27411u1) {
                    e1();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                super.p(i10, obj);
                return;
            } else {
                this.P0.o(((Integer) obj).intValue());
                return;
            }
        }
        this.f27391a1 = ((Integer) obj).intValue();
        k7.l w02 = w0();
        if (w02 != null) {
            w02.b(this.f27391a1);
        }
    }

    @Override // k7.r
    protected boolean q1(k7.p pVar) {
        return this.X0 != null || l2(pVar);
    }

    @Override // k7.r
    protected int t1(k7.t tVar, u1 u1Var) {
        boolean z10;
        int i10 = 0;
        if (!t8.w.s(u1Var.f26517w)) {
            return r3.o(0);
        }
        boolean z11 = u1Var.f26520z != null;
        List<k7.p> L1 = L1(this.O0, tVar, u1Var, z11, false);
        if (z11 && L1.isEmpty()) {
            L1 = L1(this.O0, tVar, u1Var, false, false);
        }
        if (L1.isEmpty()) {
            return r3.o(1);
        }
        if (!k7.r.u1(u1Var)) {
            return r3.o(2);
        }
        k7.p pVar = L1.get(0);
        boolean o10 = pVar.o(u1Var);
        if (!o10) {
            for (int i11 = 1; i11 < L1.size(); i11++) {
                k7.p pVar2 = L1.get(i11);
                if (pVar2.o(u1Var)) {
                    z10 = false;
                    o10 = true;
                    pVar = pVar2;
                    break;
                }
            }
        }
        z10 = true;
        int i12 = o10 ? 4 : 3;
        int i13 = pVar.r(u1Var) ? 16 : 8;
        int i14 = pVar.f20466h ? 64 : 0;
        int i15 = z10 ? RecognitionOptions.ITF : 0;
        if (r0.f26744a >= 26 && "video/dolby-vision".equals(u1Var.f26517w) && !a.a(this.O0)) {
            i15 = RecognitionOptions.QR_CODE;
        }
        if (o10) {
            List<k7.p> L12 = L1(this.O0, tVar, u1Var, z11, true);
            if (!L12.isEmpty()) {
                k7.p pVar3 = c0.u(L12, u1Var).get(0);
                if (pVar3.o(u1Var) && pVar3.r(u1Var)) {
                    i10 = 32;
                }
            }
        }
        return r3.l(i12, i13, i10, i14, i15);
    }

    @Override // k7.r, t6.q3
    public void x(float f10, float f11) {
        super.x(f10, f11);
        this.P0.i(f10);
    }

    @Override // k7.r
    protected boolean y0() {
        return this.f27411u1 && r0.f26744a < 23;
    }

    @Override // k7.r
    protected float z0(float f10, u1 u1Var, u1[] u1VarArr) {
        float f11 = -1.0f;
        for (u1 u1Var2 : u1VarArr) {
            float f12 = u1Var2.D;
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

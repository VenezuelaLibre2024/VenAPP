package k7;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import k7.c0;
import k7.l;
import t6.u1;
import t6.v1;
import t8.m0;
import t8.o0;
import t8.r0;
import u6.m3;
import w6.g;
import x6.n;

/* loaded from: classes.dex */
public abstract class r extends t6.l {
    private static final byte[] N0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private final boolean A;
    private boolean A0;
    private final float B;
    private boolean B0;
    private final w6.g C;
    private long C0;
    private final w6.g D;
    private long D0;
    private final w6.g E;
    private boolean E0;
    private final h F;
    private boolean F0;
    private final ArrayList<Long> G;
    private boolean G0;
    private final MediaCodec.BufferInfo H;
    private boolean H0;
    private final ArrayDeque<c> I;
    private t6.x I0;
    private u1 J;
    protected w6.e J0;
    private u1 K;
    private c K0;
    private x6.n L;
    private long L0;
    private x6.n M;
    private boolean M0;
    private MediaCrypto N;
    private boolean O;
    private long P;
    private float Q;
    private float R;
    private l S;
    private u1 T;
    private MediaFormat U;
    private boolean V;
    private float W;
    private ArrayDeque<p> X;
    private b Y;
    private p Z;

    /* renamed from: a0, reason: collision with root package name */
    private int f20470a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f20471b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f20472c0;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f20473d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f20474e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f20475f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f20476g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f20477h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f20478i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f20479j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f20480k0;

    /* renamed from: l0, reason: collision with root package name */
    private i f20481l0;

    /* renamed from: m0, reason: collision with root package name */
    private long f20482m0;

    /* renamed from: n0, reason: collision with root package name */
    private int f20483n0;

    /* renamed from: o0, reason: collision with root package name */
    private int f20484o0;

    /* renamed from: p0, reason: collision with root package name */
    private ByteBuffer f20485p0;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f20486q0;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f20487r0;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f20488s0;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f20489t0;

    /* renamed from: u0, reason: collision with root package name */
    private boolean f20490u0;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f20491v0;

    /* renamed from: w0, reason: collision with root package name */
    private int f20492w0;

    /* renamed from: x0, reason: collision with root package name */
    private int f20493x0;

    /* renamed from: y, reason: collision with root package name */
    private final l.b f20494y;

    /* renamed from: y0, reason: collision with root package name */
    private int f20495y0;

    /* renamed from: z, reason: collision with root package name */
    private final t f20496z;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f20497z0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(l.a aVar, m3 m3Var) {
            LogSessionId logSessionId;
            boolean equals;
            String stringId;
            LogSessionId a10 = m3Var.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a10.equals(logSessionId);
            if (equals) {
                return;
            }
            MediaFormat mediaFormat = aVar.f20452b;
            stringId = a10.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final String f20498a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f20499b;

        /* renamed from: c, reason: collision with root package name */
        public final p f20500c;

        /* renamed from: d, reason: collision with root package name */
        public final String f20501d;

        /* renamed from: e, reason: collision with root package name */
        public final b f20502e;

        private b(String str, Throwable th2, String str2, boolean z10, p pVar, String str3, b bVar) {
            super(str, th2);
            this.f20498a = str2;
            this.f20499b = z10;
            this.f20500c = pVar;
            this.f20501d = str3;
            this.f20502e = bVar;
        }

        public b(u1 u1Var, Throwable th2, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + u1Var, th2, u1Var.f26517w, z10, null, b(i10), null);
        }

        public b(u1 u1Var, Throwable th2, boolean z10, p pVar) {
            this("Decoder init failed: " + pVar.f20459a + ", " + u1Var, th2, u1Var.f26517w, z10, pVar, r0.f26744a >= 21 ? d(th2) : null, null);
        }

        private static String b(int i10) {
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b c(b bVar) {
            return new b(getMessage(), getCause(), this.f20498a, this.f20499b, this.f20500c, this.f20501d, bVar);
        }

        private static String d(Throwable th2) {
            if (th2 instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: e, reason: collision with root package name */
        public static final c f20503e = new c(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* renamed from: a, reason: collision with root package name */
        public final long f20504a;

        /* renamed from: b, reason: collision with root package name */
        public final long f20505b;

        /* renamed from: c, reason: collision with root package name */
        public final long f20506c;

        /* renamed from: d, reason: collision with root package name */
        public final m0<u1> f20507d = new m0<>();

        public c(long j10, long j11, long j12) {
            this.f20504a = j10;
            this.f20505b = j11;
            this.f20506c = j12;
        }
    }

    public r(int i10, l.b bVar, t tVar, boolean z10, float f10) {
        super(i10);
        this.f20494y = bVar;
        this.f20496z = (t) t8.a.e(tVar);
        this.A = z10;
        this.B = f10;
        this.C = w6.g.B();
        this.D = new w6.g(0);
        this.E = new w6.g(2);
        h hVar = new h();
        this.F = hVar;
        this.G = new ArrayList<>();
        this.H = new MediaCodec.BufferInfo();
        this.Q = 1.0f;
        this.R = 1.0f;
        this.P = -9223372036854775807L;
        this.I = new ArrayDeque<>();
        l1(c.f20503e);
        hVar.y(0);
        hVar.f29679c.order(ByteOrder.nativeOrder());
        this.W = -1.0f;
        this.f20470a0 = 0;
        this.f20492w0 = 0;
        this.f20483n0 = -1;
        this.f20484o0 = -1;
        this.f20482m0 = -9223372036854775807L;
        this.C0 = -9223372036854775807L;
        this.D0 = -9223372036854775807L;
        this.L0 = -9223372036854775807L;
        this.f20493x0 = 0;
        this.f20495y0 = 0;
    }

    private x6.c0 C0(x6.n nVar) {
        w6.b f10 = nVar.f();
        if (f10 == null || (f10 instanceof x6.c0)) {
            return (x6.c0) f10;
        }
        throw G(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + f10), this.J, AdError.MEDIAVIEW_MISSING_ERROR_CODE);
    }

    private boolean H0() {
        return this.f20484o0 >= 0;
    }

    private void I0(u1 u1Var) {
        l0();
        String str = u1Var.f26517w;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.F.J(32);
        } else {
            this.F.J(1);
        }
        this.f20488s0 = true;
    }

    private void J0(p pVar, MediaCrypto mediaCrypto) {
        String str = pVar.f20459a;
        int i10 = r0.f26744a;
        float z02 = i10 < 23 ? -1.0f : z0(this.R, this.J, M());
        float f10 = z02 > this.B ? z02 : -1.0f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        l.a D0 = D0(pVar, this.J, mediaCrypto, f10);
        if (i10 >= 31) {
            a.a(D0, L());
        }
        try {
            o0.a("createCodec:" + str);
            this.S = this.f20494y.a(D0);
            o0.c();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!pVar.o(this.J)) {
                t8.s.i("MediaCodecRenderer", r0.C("Format exceeds selected codec's capabilities [%s, %s]", u1.k(this.J), str));
            }
            this.Z = pVar;
            this.W = f10;
            this.T = this.J;
            this.f20470a0 = b0(str);
            this.f20471b0 = c0(str, this.T);
            this.f20472c0 = h0(str);
            this.f20473d0 = j0(str);
            this.f20474e0 = e0(str);
            this.f20475f0 = f0(str);
            this.f20476g0 = d0(str);
            this.f20477h0 = i0(str, this.T);
            this.f20480k0 = g0(pVar) || y0();
            if (this.S.g()) {
                this.f20491v0 = true;
                this.f20492w0 = 1;
                this.f20478i0 = this.f20470a0 != 0;
            }
            if ("c2.android.mp3.decoder".equals(pVar.f20459a)) {
                this.f20481l0 = new i();
            }
            if (getState() == 2) {
                this.f20482m0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.J0.f29666a++;
            R0(str, D0, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th2) {
            o0.c();
            throw th2;
        }
    }

    private boolean K0(long j10) {
        int size = this.G.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.G.get(i10).longValue() == j10) {
                this.G.remove(i10);
                return true;
            }
        }
        return false;
    }

    private static boolean L0(IllegalStateException illegalStateException) {
        if (r0.f26744a >= 21 && M0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private static boolean M0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    private static boolean N0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void P0(android.media.MediaCrypto r8, boolean r9) {
        /*
            r7 = this;
            java.util.ArrayDeque<k7.p> r0 = r7.X
            r1 = 0
            if (r0 != 0) goto L39
            java.util.List r0 = r7.v0(r9)     // Catch: k7.c0.c -> L2d
            java.util.ArrayDeque r2 = new java.util.ArrayDeque     // Catch: k7.c0.c -> L2d
            r2.<init>()     // Catch: k7.c0.c -> L2d
            r7.X = r2     // Catch: k7.c0.c -> L2d
            boolean r3 = r7.A     // Catch: k7.c0.c -> L2d
            if (r3 == 0) goto L18
            r2.addAll(r0)     // Catch: k7.c0.c -> L2d
            goto L2a
        L18:
            boolean r2 = r0.isEmpty()     // Catch: k7.c0.c -> L2d
            if (r2 != 0) goto L2a
            java.util.ArrayDeque<k7.p> r2 = r7.X     // Catch: k7.c0.c -> L2d
            r3 = 0
            java.lang.Object r0 = r0.get(r3)     // Catch: k7.c0.c -> L2d
            k7.p r0 = (k7.p) r0     // Catch: k7.c0.c -> L2d
            r2.add(r0)     // Catch: k7.c0.c -> L2d
        L2a:
            r7.Y = r1     // Catch: k7.c0.c -> L2d
            goto L39
        L2d:
            r8 = move-exception
            k7.r$b r0 = new k7.r$b
            t6.u1 r1 = r7.J
            r2 = -49998(0xffffffffffff3cb2, float:NaN)
            r0.<init>(r1, r8, r9, r2)
            throw r0
        L39:
            java.util.ArrayDeque<k7.p> r0 = r7.X
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb4
            java.util.ArrayDeque<k7.p> r0 = r7.X
            java.lang.Object r0 = r0.peekFirst()
            k7.p r0 = (k7.p) r0
        L49:
            k7.l r2 = r7.S
            if (r2 != 0) goto Lb1
            java.util.ArrayDeque<k7.p> r2 = r7.X
            java.lang.Object r2 = r2.peekFirst()
            k7.p r2 = (k7.p) r2
            boolean r3 = r7.q1(r2)
            if (r3 != 0) goto L5c
            return
        L5c:
            r7.J0(r2, r8)     // Catch: java.lang.Exception -> L60
            goto L49
        L60:
            r3 = move-exception
            java.lang.String r4 = "MediaCodecRenderer"
            if (r2 != r0) goto L73
            java.lang.String r3 = "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."
            t8.s.i(r4, r3)     // Catch: java.lang.Exception -> L74
            r5 = 50
            java.lang.Thread.sleep(r5)     // Catch: java.lang.Exception -> L74
            r7.J0(r2, r8)     // Catch: java.lang.Exception -> L74
            goto L49
        L73:
            throw r3     // Catch: java.lang.Exception -> L74
        L74:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to initialize decoder: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            t8.s.j(r4, r5, r3)
            java.util.ArrayDeque<k7.p> r4 = r7.X
            r4.removeFirst()
            k7.r$b r4 = new k7.r$b
            t6.u1 r5 = r7.J
            r4.<init>(r5, r3, r9, r2)
            r7.Q0(r4)
            k7.r$b r2 = r7.Y
            if (r2 != 0) goto L9f
            r7.Y = r4
            goto La5
        L9f:
            k7.r$b r2 = k7.r.b.a(r2, r4)
            r7.Y = r2
        La5:
            java.util.ArrayDeque<k7.p> r2 = r7.X
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lae
            goto L49
        Lae:
            k7.r$b r8 = r7.Y
            throw r8
        Lb1:
            r7.X = r1
            return
        Lb4:
            k7.r$b r8 = new k7.r$b
            t6.u1 r0 = r7.J
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            r8.<init>(r0, r1, r9, r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.r.P0(android.media.MediaCrypto, boolean):void");
    }

    private void Y() {
        t8.a.g(!this.E0);
        v1 J = J();
        this.E.n();
        do {
            this.E.n();
            int V = V(J, this.E, 0);
            if (V == -5) {
                T0(J);
                return;
            }
            if (V != -4) {
                if (V != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                if (this.E.s()) {
                    this.E0 = true;
                    return;
                }
                if (this.G0) {
                    u1 u1Var = (u1) t8.a.e(this.J);
                    this.K = u1Var;
                    U0(u1Var, null);
                    this.G0 = false;
                }
                this.E.z();
            }
        } while (this.F.D(this.E));
        this.f20489t0 = true;
    }

    private boolean Z(long j10, long j11) {
        boolean z10;
        t8.a.g(!this.F0);
        if (this.F.I()) {
            h hVar = this.F;
            if (!a1(j10, j11, null, hVar.f29679c, this.f20484o0, 0, hVar.H(), this.F.F(), this.F.r(), this.F.s(), this.K)) {
                return false;
            }
            W0(this.F.G());
            this.F.n();
            z10 = false;
        } else {
            z10 = false;
        }
        if (this.E0) {
            this.F0 = true;
            return z10;
        }
        if (this.f20489t0) {
            t8.a.g(this.F.D(this.E));
            this.f20489t0 = z10;
        }
        if (this.f20490u0) {
            if (this.F.I()) {
                return true;
            }
            l0();
            this.f20490u0 = z10;
            O0();
            if (!this.f20488s0) {
                return z10;
            }
        }
        Y();
        if (this.F.I()) {
            this.F.z();
        }
        if (this.F.I() || this.E0 || this.f20490u0) {
            return true;
        }
        return z10;
    }

    private void Z0() {
        int i10 = this.f20495y0;
        if (i10 == 1) {
            s0();
            return;
        }
        if (i10 == 2) {
            s0();
            w1();
        } else if (i10 == 3) {
            d1();
        } else {
            this.F0 = true;
            f1();
        }
    }

    private int b0(String str) {
        int i10 = r0.f26744a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = r0.f26747d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = r0.f26745b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private void b1() {
        this.B0 = true;
        MediaFormat a10 = this.S.a();
        if (this.f20470a0 != 0 && a10.getInteger("width") == 32 && a10.getInteger("height") == 32) {
            this.f20479j0 = true;
            return;
        }
        if (this.f20477h0) {
            a10.setInteger("channel-count", 1);
        }
        this.U = a10;
        this.V = true;
    }

    private static boolean c0(String str, u1 u1Var) {
        return r0.f26744a < 21 && u1Var.f26519y.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private boolean c1(int i10) {
        v1 J = J();
        this.C.n();
        int V = V(J, this.C, i10 | 4);
        if (V == -5) {
            T0(J);
            return true;
        }
        if (V != -4 || !this.C.s()) {
            return false;
        }
        this.E0 = true;
        Z0();
        return false;
    }

    private static boolean d0(String str) {
        if (r0.f26744a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(r0.f26746c)) {
            String str2 = r0.f26745b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    private void d1() {
        e1();
        O0();
    }

    private static boolean e0(String str) {
        int i10 = r0.f26744a;
        if (i10 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i10 <= 19) {
                String str2 = r0.f26745b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    private static boolean f0(String str) {
        return r0.f26744a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean g0(p pVar) {
        String str = pVar.f20459a;
        int i10 = r0.f26744a;
        return (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i10 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i10 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || ("Amazon".equals(r0.f26746c) && "AFTS".equals(r0.f26747d) && pVar.f20465g));
    }

    private static boolean h0(String str) {
        int i10 = r0.f26744a;
        return i10 < 18 || (i10 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i10 == 19 && r0.f26747d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private static boolean i0(String str, u1 u1Var) {
        return r0.f26744a <= 18 && u1Var.J == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    private void i1() {
        this.f20483n0 = -1;
        this.D.f29679c = null;
    }

    private static boolean j0(String str) {
        return r0.f26744a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void j1() {
        this.f20484o0 = -1;
        this.f20485p0 = null;
    }

    private void k1(x6.n nVar) {
        x6.n.b(this.L, nVar);
        this.L = nVar;
    }

    private void l0() {
        this.f20490u0 = false;
        this.F.n();
        this.E.n();
        this.f20489t0 = false;
        this.f20488s0 = false;
    }

    private void l1(c cVar) {
        this.K0 = cVar;
        long j10 = cVar.f20506c;
        if (j10 != -9223372036854775807L) {
            this.M0 = true;
            V0(j10);
        }
    }

    private boolean m0() {
        if (this.f20497z0) {
            this.f20493x0 = 1;
            if (this.f20472c0 || this.f20474e0) {
                this.f20495y0 = 3;
                return false;
            }
            this.f20495y0 = 1;
        }
        return true;
    }

    private void n0() {
        if (!this.f20497z0) {
            d1();
        } else {
            this.f20493x0 = 1;
            this.f20495y0 = 3;
        }
    }

    private boolean o0() {
        if (this.f20497z0) {
            this.f20493x0 = 1;
            if (this.f20472c0 || this.f20474e0) {
                this.f20495y0 = 3;
                return false;
            }
            this.f20495y0 = 2;
        } else {
            w1();
        }
        return true;
    }

    private void o1(x6.n nVar) {
        x6.n.b(this.M, nVar);
        this.M = nVar;
    }

    private boolean p0(long j10, long j11) {
        boolean z10;
        boolean a12;
        int l10;
        if (!H0()) {
            if (this.f20475f0 && this.A0) {
                try {
                    l10 = this.S.l(this.H);
                } catch (IllegalStateException unused) {
                    Z0();
                    if (this.F0) {
                        e1();
                    }
                    return false;
                }
            } else {
                l10 = this.S.l(this.H);
            }
            if (l10 < 0) {
                if (l10 == -2) {
                    b1();
                    return true;
                }
                if (this.f20480k0 && (this.E0 || this.f20493x0 == 2)) {
                    Z0();
                }
                return false;
            }
            if (this.f20479j0) {
                this.f20479j0 = false;
                this.S.m(l10, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.H;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                Z0();
                return false;
            }
            this.f20484o0 = l10;
            ByteBuffer n10 = this.S.n(l10);
            this.f20485p0 = n10;
            if (n10 != null) {
                n10.position(this.H.offset);
                ByteBuffer byteBuffer = this.f20485p0;
                MediaCodec.BufferInfo bufferInfo2 = this.H;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f20476g0) {
                MediaCodec.BufferInfo bufferInfo3 = this.H;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j12 = this.C0;
                    if (j12 != -9223372036854775807L) {
                        bufferInfo3.presentationTimeUs = j12;
                    }
                }
            }
            this.f20486q0 = K0(this.H.presentationTimeUs);
            long j13 = this.D0;
            long j14 = this.H.presentationTimeUs;
            this.f20487r0 = j13 == j14;
            x1(j14);
        }
        if (this.f20475f0 && this.A0) {
            try {
                l lVar = this.S;
                ByteBuffer byteBuffer2 = this.f20485p0;
                int i10 = this.f20484o0;
                MediaCodec.BufferInfo bufferInfo4 = this.H;
                z10 = false;
                try {
                    a12 = a1(j10, j11, lVar, byteBuffer2, i10, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f20486q0, this.f20487r0, this.K);
                } catch (IllegalStateException unused2) {
                    Z0();
                    if (this.F0) {
                        e1();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            l lVar2 = this.S;
            ByteBuffer byteBuffer3 = this.f20485p0;
            int i11 = this.f20484o0;
            MediaCodec.BufferInfo bufferInfo5 = this.H;
            a12 = a1(j10, j11, lVar2, byteBuffer3, i11, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f20486q0, this.f20487r0, this.K);
        }
        if (a12) {
            W0(this.H.presentationTimeUs);
            boolean z11 = (this.H.flags & 4) != 0 ? true : z10;
            j1();
            if (!z11) {
                return true;
            }
            Z0();
        }
        return z10;
    }

    private boolean p1(long j10) {
        return this.P == -9223372036854775807L || SystemClock.elapsedRealtime() - j10 < this.P;
    }

    private boolean q0(p pVar, u1 u1Var, x6.n nVar, x6.n nVar2) {
        x6.c0 C0;
        if (nVar == nVar2) {
            return false;
        }
        if (nVar2 == null || nVar == null || !nVar2.c().equals(nVar.c()) || r0.f26744a < 23) {
            return true;
        }
        UUID uuid = t6.p.f26348e;
        if (uuid.equals(nVar.c()) || uuid.equals(nVar2.c()) || (C0 = C0(nVar2)) == null) {
            return true;
        }
        return !pVar.f20465g && (C0.f30441c ? false : nVar2.i(u1Var.f26517w));
    }

    private boolean r0() {
        int i10;
        if (this.S == null || (i10 = this.f20493x0) == 2 || this.E0) {
            return false;
        }
        if (i10 == 0 && r1()) {
            n0();
        }
        if (this.f20483n0 < 0) {
            int k10 = this.S.k();
            this.f20483n0 = k10;
            if (k10 < 0) {
                return false;
            }
            this.D.f29679c = this.S.c(k10);
            this.D.n();
        }
        if (this.f20493x0 == 1) {
            if (!this.f20480k0) {
                this.A0 = true;
                this.S.e(this.f20483n0, 0, 0, 0L, 4);
                i1();
            }
            this.f20493x0 = 2;
            return false;
        }
        if (this.f20478i0) {
            this.f20478i0 = false;
            ByteBuffer byteBuffer = this.D.f29679c;
            byte[] bArr = N0;
            byteBuffer.put(bArr);
            this.S.e(this.f20483n0, 0, bArr.length, 0L, 0);
            i1();
            this.f20497z0 = true;
            return true;
        }
        if (this.f20492w0 == 1) {
            for (int i11 = 0; i11 < this.T.f26519y.size(); i11++) {
                this.D.f29679c.put(this.T.f26519y.get(i11));
            }
            this.f20492w0 = 2;
        }
        int position = this.D.f29679c.position();
        v1 J = J();
        try {
            int V = V(J, this.D, 0);
            if (i() || this.D.v()) {
                this.D0 = this.C0;
            }
            if (V == -3) {
                return false;
            }
            if (V == -5) {
                if (this.f20492w0 == 2) {
                    this.D.n();
                    this.f20492w0 = 1;
                }
                T0(J);
                return true;
            }
            if (this.D.s()) {
                if (this.f20492w0 == 2) {
                    this.D.n();
                    this.f20492w0 = 1;
                }
                this.E0 = true;
                if (!this.f20497z0) {
                    Z0();
                    return false;
                }
                try {
                    if (!this.f20480k0) {
                        this.A0 = true;
                        this.S.e(this.f20483n0, 0, 0, 0L, 4);
                        i1();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e10) {
                    throw G(e10, this.J, r0.V(e10.getErrorCode()));
                }
            }
            if (!this.f20497z0 && !this.D.u()) {
                this.D.n();
                if (this.f20492w0 == 2) {
                    this.f20492w0 = 1;
                }
                return true;
            }
            boolean A = this.D.A();
            if (A) {
                this.D.f29678b.b(position);
            }
            if (this.f20471b0 && !A) {
                t8.x.b(this.D.f29679c);
                if (this.D.f29679c.position() == 0) {
                    return true;
                }
                this.f20471b0 = false;
            }
            w6.g gVar = this.D;
            long j10 = gVar.f29681e;
            i iVar = this.f20481l0;
            if (iVar != null) {
                j10 = iVar.d(this.J, gVar);
                this.C0 = Math.max(this.C0, this.f20481l0.b(this.J));
            }
            long j11 = j10;
            if (this.D.r()) {
                this.G.add(Long.valueOf(j11));
            }
            if (this.G0) {
                (!this.I.isEmpty() ? this.I.peekLast() : this.K0).f20507d.a(j11, this.J);
                this.G0 = false;
            }
            this.C0 = Math.max(this.C0, j11);
            this.D.z();
            if (this.D.q()) {
                G0(this.D);
            }
            Y0(this.D);
            try {
                if (A) {
                    this.S.f(this.f20483n0, 0, this.D.f29678b, j11, 0);
                } else {
                    this.S.e(this.f20483n0, 0, this.D.f29679c.limit(), j11, 0);
                }
                i1();
                this.f20497z0 = true;
                this.f20492w0 = 0;
                this.J0.f29668c++;
                return true;
            } catch (MediaCodec.CryptoException e11) {
                throw G(e11, this.J, r0.V(e11.getErrorCode()));
            }
        } catch (g.a e12) {
            Q0(e12);
            c1(0);
            s0();
            return true;
        }
    }

    private void s0() {
        try {
            this.S.flush();
        } finally {
            g1();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean u1(u1 u1Var) {
        int i10 = u1Var.R;
        return i10 == 0 || i10 == 2;
    }

    private List<p> v0(boolean z10) {
        List<p> B0 = B0(this.f20496z, this.J, z10);
        if (B0.isEmpty() && z10) {
            B0 = B0(this.f20496z, this.J, false);
            if (!B0.isEmpty()) {
                t8.s.i("MediaCodecRenderer", "Drm session requires secure decoder for " + this.J.f26517w + ", but no secure decoder available. Trying to proceed with " + B0 + ".");
            }
        }
        return B0;
    }

    private boolean v1(u1 u1Var) {
        if (r0.f26744a >= 23 && this.S != null && this.f20495y0 != 3 && getState() != 0) {
            float z02 = z0(this.R, u1Var, M());
            float f10 = this.W;
            if (f10 == z02) {
                return true;
            }
            if (z02 == -1.0f) {
                n0();
                return false;
            }
            if (f10 == -1.0f && z02 <= this.B) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", z02);
            this.S.i(bundle);
            this.W = z02;
        }
        return true;
    }

    private void w1() {
        try {
            this.N.setMediaDrmSession(C0(this.M).f30440b);
            k1(this.M);
            this.f20493x0 = 0;
            this.f20495y0 = 0;
        } catch (MediaCryptoException e10) {
            throw G(e10, this.J, 6006);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final MediaFormat A0() {
        return this.U;
    }

    protected abstract List<p> B0(t tVar, u1 u1Var, boolean z10);

    protected abstract l.a D0(p pVar, u1 u1Var, MediaCrypto mediaCrypto, float f10);

    /* JADX INFO: Access modifiers changed from: protected */
    public final long E0() {
        return this.K0.f20506c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float F0() {
        return this.Q;
    }

    protected void G0(w6.g gVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t6.l
    public void O() {
        this.J = null;
        l1(c.f20503e);
        this.I.clear();
        u0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void O0() {
        u1 u1Var;
        if (this.S != null || this.f20488s0 || (u1Var = this.J) == null) {
            return;
        }
        if (this.M == null && s1(u1Var)) {
            I0(this.J);
            return;
        }
        k1(this.M);
        String str = this.J.f26517w;
        x6.n nVar = this.L;
        if (nVar != null) {
            if (this.N == null) {
                x6.c0 C0 = C0(nVar);
                if (C0 != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(C0.f30439a, C0.f30440b);
                        this.N = mediaCrypto;
                        this.O = !C0.f30441c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e10) {
                        throw G(e10, this.J, 6006);
                    }
                } else if (this.L.a() == null) {
                    return;
                }
            }
            if (x6.c0.f30438d) {
                int state = this.L.getState();
                if (state == 1) {
                    n.a aVar = (n.a) t8.a.e(this.L.a());
                    throw G(aVar, this.J, aVar.f30550a);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            P0(this.N, this.O);
        } catch (b e11) {
            throw G(e11, this.J, 4001);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t6.l
    public void P(boolean z10, boolean z11) {
        this.J0 = new w6.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t6.l
    public void Q(long j10, boolean z10) {
        this.E0 = false;
        this.F0 = false;
        this.H0 = false;
        if (this.f20488s0) {
            this.F.n();
            this.E.n();
            this.f20489t0 = false;
        } else {
            t0();
        }
        if (this.K0.f20507d.l() > 0) {
            this.G0 = true;
        }
        this.K0.f20507d.c();
        this.I.clear();
    }

    protected abstract void Q0(Exception exc);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t6.l
    public void R() {
        try {
            l0();
            e1();
        } finally {
            o1(null);
        }
    }

    protected abstract void R0(String str, l.a aVar, long j10, long j11);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t6.l
    public void S() {
    }

    protected abstract void S0(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t6.l
    public void T() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (o0() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ce, code lost:
    
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b2, code lost:
    
        if (o0() == false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w6.i T0(t6.v1 r12) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.r.T0(t6.v1):w6.i");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5 >= r1) goto L13;
     */
    @Override // t6.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void U(t6.u1[] r13, long r14, long r16) {
        /*
            r12 = this;
            r0 = r12
            k7.r$c r1 = r0.K0
            long r1 = r1.f20506c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            k7.r$c r1 = new k7.r$c
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.l1(r1)
            goto L65
        L20:
            java.util.ArrayDeque<k7.r$c> r1 = r0.I
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            long r1 = r0.C0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L38
            long r5 = r0.L0
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L55
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L55
        L38:
            k7.r$c r1 = new k7.r$c
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.l1(r1)
            k7.r$c r1 = r0.K0
            long r1 = r1.f20506c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L65
            r12.X0()
            goto L65
        L55:
            java.util.ArrayDeque<k7.r$c> r1 = r0.I
            k7.r$c r9 = new k7.r$c
            long r3 = r0.C0
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.r.U(t6.u1[], long, long):void");
    }

    protected abstract void U0(u1 u1Var, MediaFormat mediaFormat);

    protected void V0(long j10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void W0(long j10) {
        this.L0 = j10;
        while (!this.I.isEmpty() && j10 >= this.I.peek().f20504a) {
            l1(this.I.poll());
            X0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void X0() {
    }

    protected abstract void Y0(w6.g gVar);

    @Override // t6.r3
    public final int a(u1 u1Var) {
        try {
            return t1(this.f20496z, u1Var);
        } catch (c0.c e10) {
            throw G(e10, u1Var, 4002);
        }
    }

    protected abstract w6.i a0(p pVar, u1 u1Var, u1 u1Var2);

    protected abstract boolean a1(long j10, long j11, l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, u1 u1Var);

    @Override // t6.q3
    public boolean d() {
        return this.J != null && (N() || H0() || (this.f20482m0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f20482m0));
    }

    @Override // t6.q3
    public boolean e() {
        return this.F0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e1() {
        try {
            l lVar = this.S;
            if (lVar != null) {
                lVar.release();
                this.J0.f29667b++;
                S0(this.Z.f20459a);
            }
            this.S = null;
            try {
                MediaCrypto mediaCrypto = this.N;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.S = null;
            try {
                MediaCrypto mediaCrypto2 = this.N;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    protected void f1() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g1() {
        i1();
        j1();
        this.f20482m0 = -9223372036854775807L;
        this.A0 = false;
        this.f20497z0 = false;
        this.f20478i0 = false;
        this.f20479j0 = false;
        this.f20486q0 = false;
        this.f20487r0 = false;
        this.G.clear();
        this.C0 = -9223372036854775807L;
        this.D0 = -9223372036854775807L;
        this.L0 = -9223372036854775807L;
        i iVar = this.f20481l0;
        if (iVar != null) {
            iVar.c();
        }
        this.f20493x0 = 0;
        this.f20495y0 = 0;
        this.f20492w0 = this.f20491v0 ? 1 : 0;
    }

    protected void h1() {
        g1();
        this.I0 = null;
        this.f20481l0 = null;
        this.X = null;
        this.Z = null;
        this.T = null;
        this.U = null;
        this.V = false;
        this.B0 = false;
        this.W = -1.0f;
        this.f20470a0 = 0;
        this.f20471b0 = false;
        this.f20472c0 = false;
        this.f20473d0 = false;
        this.f20474e0 = false;
        this.f20475f0 = false;
        this.f20476g0 = false;
        this.f20477h0 = false;
        this.f20480k0 = false;
        this.f20491v0 = false;
        this.f20492w0 = 0;
        this.O = false;
    }

    protected m k0(Throwable th2, p pVar) {
        return new m(th2, pVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m1() {
        this.H0 = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n1(t6.x xVar) {
        this.I0 = xVar;
    }

    protected boolean q1(p pVar) {
        return true;
    }

    protected boolean r1() {
        return false;
    }

    protected boolean s1(u1 u1Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean t0() {
        boolean u02 = u0();
        if (u02) {
            O0();
        }
        return u02;
    }

    protected abstract int t1(t tVar, u1 u1Var);

    protected boolean u0() {
        if (this.S == null) {
            return false;
        }
        int i10 = this.f20495y0;
        if (i10 == 3 || this.f20472c0 || ((this.f20473d0 && !this.B0) || (this.f20474e0 && this.A0))) {
            e1();
            return true;
        }
        if (i10 == 2) {
            int i11 = r0.f26744a;
            t8.a.g(i11 >= 23);
            if (i11 >= 23) {
                try {
                    w1();
                } catch (t6.x e10) {
                    t8.s.j("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    e1();
                    return true;
                }
            }
        }
        s0();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final l w0() {
        return this.S;
    }

    @Override // t6.q3
    public void x(float f10, float f11) {
        this.Q = f10;
        this.R = f11;
        v1(this.T);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final p x0() {
        return this.Z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x1(long j10) {
        boolean z10;
        u1 j11 = this.K0.f20507d.j(j10);
        if (j11 == null && this.M0 && this.U != null) {
            j11 = this.K0.f20507d.i();
        }
        if (j11 != null) {
            this.K = j11;
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (this.V && this.K != null)) {
            U0(this.K, this.U);
            this.V = false;
            this.M0 = false;
        }
    }

    @Override // t6.l, t6.r3
    public final int y() {
        return 8;
    }

    protected boolean y0() {
        return false;
    }

    @Override // t6.q3
    public void z(long j10, long j11) {
        boolean z10 = false;
        if (this.H0) {
            this.H0 = false;
            Z0();
        }
        t6.x xVar = this.I0;
        if (xVar != null) {
            this.I0 = null;
            throw xVar;
        }
        try {
            if (this.F0) {
                f1();
                return;
            }
            if (this.J != null || c1(2)) {
                O0();
                if (this.f20488s0) {
                    o0.a("bypassRender");
                    do {
                    } while (Z(j10, j11));
                } else {
                    if (this.S == null) {
                        this.J0.f29669d += X(j10);
                        c1(1);
                        this.J0.c();
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    o0.a("drainAndFeed");
                    while (p0(j10, j11) && p1(elapsedRealtime)) {
                    }
                    while (r0() && p1(elapsedRealtime)) {
                    }
                }
                o0.c();
                this.J0.c();
            }
        } catch (IllegalStateException e10) {
            if (!L0(e10)) {
                throw e10;
            }
            Q0(e10);
            if (r0.f26744a >= 21 && N0(e10)) {
                z10 = true;
            }
            if (z10) {
                e1();
            }
            throw H(k0(e10, x0()), this.J, z10, 4003);
        }
    }

    protected abstract float z0(float f10, u1 u1Var, u1[] u1VarArr);
}

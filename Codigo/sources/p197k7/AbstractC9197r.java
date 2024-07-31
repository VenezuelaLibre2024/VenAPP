package p197k7;

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
import p197k7.C9180c0;
import p197k7.InterfaceC9191l;
import p361t6.AbstractC11061l;
import p361t6.C11081p;
import p361t6.C11108u1;
import p361t6.C11113v1;
import p361t6.C11121x;
import p363t8.C11137a;
import p363t8.C11162m0;
import p363t8.C11166o0;
import p363t8.C11172r0;
import p363t8.C11173s;
import p363t8.C11179x;
import p376u6.C11391m3;
import p414w6.C12080e;
import p414w6.C12082g;
import p414w6.C12084i;
import p414w6.InterfaceC12077b;
import p436x6.C12299c0;
import p436x6.InterfaceC12320n;

/* renamed from: k7.r */
/* loaded from: classes.dex */
public abstract class AbstractC9197r extends AbstractC11061l {

    /* renamed from: N0 */
    private static final byte[] f22252N0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A */
    private final boolean f22253A;

    /* renamed from: A0 */
    private boolean f22254A0;

    /* renamed from: B */
    private final float f22255B;

    /* renamed from: B0 */
    private boolean f22256B0;

    /* renamed from: C */
    private final C12082g f22257C;

    /* renamed from: C0 */
    private long f22258C0;

    /* renamed from: D */
    private final C12082g f22259D;

    /* renamed from: D0 */
    private long f22260D0;

    /* renamed from: E */
    private final C12082g f22261E;

    /* renamed from: E0 */
    private boolean f22262E0;

    /* renamed from: F */
    private final C9187h f22263F;

    /* renamed from: F0 */
    private boolean f22264F0;

    /* renamed from: G */
    private final ArrayList<Long> f22265G;

    /* renamed from: G0 */
    private boolean f22266G0;

    /* renamed from: H */
    private final MediaCodec.BufferInfo f22267H;

    /* renamed from: H0 */
    private boolean f22268H0;

    /* renamed from: I */
    private final ArrayDeque<c> f22269I;

    /* renamed from: I0 */
    private C11121x f22270I0;

    /* renamed from: J */
    private C11108u1 f22271J;

    /* renamed from: J0 */
    protected C12080e f22272J0;

    /* renamed from: K */
    private C11108u1 f22273K;

    /* renamed from: K0 */
    private c f22274K0;

    /* renamed from: L */
    private InterfaceC12320n f22275L;

    /* renamed from: L0 */
    private long f22276L0;

    /* renamed from: M */
    private InterfaceC12320n f22277M;

    /* renamed from: M0 */
    private boolean f22278M0;

    /* renamed from: N */
    private MediaCrypto f22279N;

    /* renamed from: O */
    private boolean f22280O;

    /* renamed from: P */
    private long f22281P;

    /* renamed from: Q */
    private float f22282Q;

    /* renamed from: R */
    private float f22283R;

    /* renamed from: S */
    private InterfaceC9191l f22284S;

    /* renamed from: T */
    private C11108u1 f22285T;

    /* renamed from: U */
    private MediaFormat f22286U;

    /* renamed from: V */
    private boolean f22287V;

    /* renamed from: W */
    private float f22288W;

    /* renamed from: X */
    private ArrayDeque<C9195p> f22289X;

    /* renamed from: Y */
    private b f22290Y;

    /* renamed from: Z */
    private C9195p f22291Z;

    /* renamed from: a0 */
    private int f22292a0;

    /* renamed from: b0 */
    private boolean f22293b0;

    /* renamed from: c0 */
    private boolean f22294c0;

    /* renamed from: d0 */
    private boolean f22295d0;

    /* renamed from: e0 */
    private boolean f22296e0;

    /* renamed from: f0 */
    private boolean f22297f0;

    /* renamed from: g0 */
    private boolean f22298g0;

    /* renamed from: h0 */
    private boolean f22299h0;

    /* renamed from: i0 */
    private boolean f22300i0;

    /* renamed from: j0 */
    private boolean f22301j0;

    /* renamed from: k0 */
    private boolean f22302k0;

    /* renamed from: l0 */
    private C9188i f22303l0;

    /* renamed from: m0 */
    private long f22304m0;

    /* renamed from: n0 */
    private int f22305n0;

    /* renamed from: o0 */
    private int f22306o0;

    /* renamed from: p0 */
    private ByteBuffer f22307p0;

    /* renamed from: q0 */
    private boolean f22308q0;

    /* renamed from: r0 */
    private boolean f22309r0;

    /* renamed from: s0 */
    private boolean f22310s0;

    /* renamed from: t0 */
    private boolean f22311t0;

    /* renamed from: u0 */
    private boolean f22312u0;

    /* renamed from: v0 */
    private boolean f22313v0;

    /* renamed from: w0 */
    private int f22314w0;

    /* renamed from: x0 */
    private int f22315x0;

    /* renamed from: y */
    private final InterfaceC9191l.b f22316y;

    /* renamed from: y0 */
    private int f22317y0;

    /* renamed from: z */
    private final InterfaceC9199t f22318z;

    /* renamed from: z0 */
    private boolean f22319z0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k7.r$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static void m27382a(InterfaceC9191l.a aVar, C11391m3 c11391m3) {
            LogSessionId logSessionId;
            boolean equals;
            String stringId;
            LogSessionId m35573a = c11391m3.m35573a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = m35573a.equals(logSessionId);
            if (equals) {
                return;
            }
            MediaFormat mediaFormat = aVar.f22234b;
            stringId = m35573a.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }

    /* renamed from: k7.r$b */
    /* loaded from: classes.dex */
    public static class b extends Exception {

        /* renamed from: a */
        public final String f22320a;

        /* renamed from: b */
        public final boolean f22321b;

        /* renamed from: c */
        public final C9195p f22322c;

        /* renamed from: d */
        public final String f22323d;

        /* renamed from: e */
        public final b f22324e;

        private b(String str, Throwable th2, String str2, boolean z10, C9195p c9195p, String str3, b bVar) {
            super(str, th2);
            this.f22320a = str2;
            this.f22321b = z10;
            this.f22322c = c9195p;
            this.f22323d = str3;
            this.f22324e = bVar;
        }

        public b(C11108u1 c11108u1, Throwable th2, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + c11108u1, th2, c11108u1.f28797w, z10, null, m27384b(i10), null);
        }

        public b(C11108u1 c11108u1, Throwable th2, boolean z10, C9195p c9195p) {
            this("Decoder init failed: " + c9195p.f22241a + ", " + c11108u1, th2, c11108u1.f28797w, z10, c9195p, C11172r0.f29040a >= 21 ? m27386d(th2) : null, null);
        }

        /* renamed from: b */
        private static String m27384b(int i10) {
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public b m27385c(b bVar) {
            return new b(getMessage(), getCause(), this.f22320a, this.f22321b, this.f22322c, this.f22323d, bVar);
        }

        /* renamed from: d */
        private static String m27386d(Throwable th2) {
            if (th2 instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k7.r$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: e */
        public static final c f22325e = new c(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* renamed from: a */
        public final long f22326a;

        /* renamed from: b */
        public final long f22327b;

        /* renamed from: c */
        public final long f22328c;

        /* renamed from: d */
        public final C11162m0<C11108u1> f22329d = new C11162m0<>();

        public c(long j10, long j11, long j12) {
            this.f22326a = j10;
            this.f22327b = j11;
            this.f22328c = j12;
        }
    }

    public AbstractC9197r(int i10, InterfaceC9191l.b bVar, InterfaceC9199t interfaceC9199t, boolean z10, float f10) {
        super(i10);
        this.f22316y = bVar;
        this.f22318z = (InterfaceC9199t) C11137a.m34603e(interfaceC9199t);
        this.f22253A = z10;
        this.f22255B = f10;
        this.f22257C = C12082g.m38807B();
        this.f22259D = new C12082g(0);
        this.f22261E = new C12082g(2);
        C9187h c9187h = new C9187h();
        this.f22263F = c9187h;
        this.f22265G = new ArrayList<>();
        this.f22267H = new MediaCodec.BufferInfo();
        this.f22282Q = 1.0f;
        this.f22283R = 1.0f;
        this.f22281P = -9223372036854775807L;
        this.f22269I = new ArrayDeque<>();
        m27326l1(c.f22325e);
        c9187h.m38811y(0);
        c9187h.f32142c.order(ByteOrder.nativeOrder());
        this.f22288W = -1.0f;
        this.f22292a0 = 0;
        this.f22314w0 = 0;
        this.f22305n0 = -1;
        this.f22306o0 = -1;
        this.f22304m0 = -9223372036854775807L;
        this.f22258C0 = -9223372036854775807L;
        this.f22260D0 = -9223372036854775807L;
        this.f22276L0 = -9223372036854775807L;
        this.f22315x0 = 0;
        this.f22317y0 = 0;
    }

    /* renamed from: C0 */
    private C12299c0 m27298C0(InterfaceC12320n interfaceC12320n) {
        InterfaceC12077b mo39702f = interfaceC12320n.mo39702f();
        if (mo39702f == null || (mo39702f instanceof C12299c0)) {
            return (C12299c0) mo39702f;
        }
        throw m34234G(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + mo39702f), this.f22271J, AdError.MEDIAVIEW_MISSING_ERROR_CODE);
    }

    /* renamed from: H0 */
    private boolean m27299H0() {
        return this.f22306o0 >= 0;
    }

    /* renamed from: I0 */
    private void m27300I0(C11108u1 c11108u1) {
        m27325l0();
        String str = c11108u1.f28797w;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f22263F.m27248J(32);
        } else {
            this.f22263F.m27248J(1);
        }
        this.f22310s0 = true;
    }

    /* renamed from: J0 */
    private void m27301J0(C9195p c9195p, MediaCrypto mediaCrypto) {
        String str = c9195p.f22241a;
        int i10 = C11172r0.f29040a;
        float mo27381z0 = i10 < 23 ? -1.0f : mo27381z0(this.f22283R, this.f22271J, m34240M());
        float f10 = mo27381z0 > this.f22255B ? mo27381z0 : -1.0f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        InterfaceC9191l.a mo27342D0 = mo27342D0(c9195p, this.f22271J, mediaCrypto, f10);
        if (i10 >= 31) {
            a.m27382a(mo27342D0, m34239L());
        }
        try {
            C11166o0.m34831a("createCodec:" + str);
            this.f22284S = this.f22316y.mo27153a(mo27342D0);
            C11166o0.m34833c();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!c9195p.m27292o(this.f22271J)) {
                C11173s.m34970i("MediaCodecRenderer", C11172r0.m34860C("Format exceeds selected codec's capabilities [%s, %s]", C11108u1.m34487k(this.f22271J), str));
            }
            this.f22291Z = c9195p;
            this.f22288W = f10;
            this.f22285T = this.f22271J;
            this.f22292a0 = m27310b0(str);
            this.f22293b0 = m27312c0(str, this.f22285T);
            this.f22294c0 = m27319h0(str);
            this.f22295d0 = m27322j0(str);
            this.f22296e0 = m27316e0(str);
            this.f22297f0 = m27317f0(str);
            this.f22298g0 = m27314d0(str);
            this.f22299h0 = m27320i0(str, this.f22285T);
            this.f22302k0 = m27318g0(c9195p) || mo27380y0();
            if (this.f22284S.mo27141g()) {
                this.f22313v0 = true;
                this.f22314w0 = 1;
                this.f22300i0 = this.f22292a0 != 0;
            }
            if ("c2.android.mp3.decoder".equals(c9195p.f22241a)) {
                this.f22303l0 = new C9188i();
            }
            if (getState() == 2) {
                this.f22304m0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f22272J0.f32129a++;
            mo27350R0(str, mo27342D0, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th2) {
            C11166o0.m34833c();
            throw th2;
        }
    }

    /* renamed from: K0 */
    private boolean m27302K0(long j10) {
        int size = this.f22265G.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f22265G.get(i10).longValue() == j10) {
                this.f22265G.remove(i10);
                return true;
            }
        }
        return false;
    }

    /* renamed from: L0 */
    private static boolean m27303L0(IllegalStateException illegalStateException) {
        if (C11172r0.f29040a >= 21 && m27304M0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    /* renamed from: M0 */
    private static boolean m27304M0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    /* renamed from: N0 */
    private static boolean m27305N0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* renamed from: P0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m27306P0(android.media.MediaCrypto r8, boolean r9) {
        /*
            r7 = this;
            java.util.ArrayDeque<k7.p> r0 = r7.f22289X
            r1 = 0
            if (r0 != 0) goto L39
            java.util.List r0 = r7.m27337v0(r9)     // Catch: p197k7.C9180c0.c -> L2d
            java.util.ArrayDeque r2 = new java.util.ArrayDeque     // Catch: p197k7.C9180c0.c -> L2d
            r2.<init>()     // Catch: p197k7.C9180c0.c -> L2d
            r7.f22289X = r2     // Catch: p197k7.C9180c0.c -> L2d
            boolean r3 = r7.f22253A     // Catch: p197k7.C9180c0.c -> L2d
            if (r3 == 0) goto L18
            r2.addAll(r0)     // Catch: p197k7.C9180c0.c -> L2d
            goto L2a
        L18:
            boolean r2 = r0.isEmpty()     // Catch: p197k7.C9180c0.c -> L2d
            if (r2 != 0) goto L2a
            java.util.ArrayDeque<k7.p> r2 = r7.f22289X     // Catch: p197k7.C9180c0.c -> L2d
            r3 = 0
            java.lang.Object r0 = r0.get(r3)     // Catch: p197k7.C9180c0.c -> L2d
            k7.p r0 = (p197k7.C9195p) r0     // Catch: p197k7.C9180c0.c -> L2d
            r2.add(r0)     // Catch: p197k7.C9180c0.c -> L2d
        L2a:
            r7.f22290Y = r1     // Catch: p197k7.C9180c0.c -> L2d
            goto L39
        L2d:
            r8 = move-exception
            k7.r$b r0 = new k7.r$b
            t6.u1 r1 = r7.f22271J
            r2 = -49998(0xffffffffffff3cb2, float:NaN)
            r0.<init>(r1, r8, r9, r2)
            throw r0
        L39:
            java.util.ArrayDeque<k7.p> r0 = r7.f22289X
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb4
            java.util.ArrayDeque<k7.p> r0 = r7.f22289X
            java.lang.Object r0 = r0.peekFirst()
            k7.p r0 = (p197k7.C9195p) r0
        L49:
            k7.l r2 = r7.f22284S
            if (r2 != 0) goto Lb1
            java.util.ArrayDeque<k7.p> r2 = r7.f22289X
            java.lang.Object r2 = r2.peekFirst()
            k7.p r2 = (p197k7.C9195p) r2
            boolean r3 = r7.mo27369q1(r2)
            if (r3 != 0) goto L5c
            return
        L5c:
            r7.m27301J0(r2, r8)     // Catch: java.lang.Exception -> L60
            goto L49
        L60:
            r3 = move-exception
            java.lang.String r4 = "MediaCodecRenderer"
            if (r2 != r0) goto L73
            java.lang.String r3 = "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."
            p363t8.C11173s.m34970i(r4, r3)     // Catch: java.lang.Exception -> L74
            r5 = 50
            java.lang.Thread.sleep(r5)     // Catch: java.lang.Exception -> L74
            r7.m27301J0(r2, r8)     // Catch: java.lang.Exception -> L74
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
            p363t8.C11173s.m34971j(r4, r5, r3)
            java.util.ArrayDeque<k7.p> r4 = r7.f22289X
            r4.removeFirst()
            k7.r$b r4 = new k7.r$b
            t6.u1 r5 = r7.f22271J
            r4.<init>(r5, r3, r9, r2)
            r7.mo27348Q0(r4)
            k7.r$b r2 = r7.f22290Y
            if (r2 != 0) goto L9f
            r7.f22290Y = r4
            goto La5
        L9f:
            k7.r$b r2 = p197k7.AbstractC9197r.b.m27383a(r2, r4)
            r7.f22290Y = r2
        La5:
            java.util.ArrayDeque<k7.p> r2 = r7.f22289X
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lae
            goto L49
        Lae:
            k7.r$b r8 = r7.f22290Y
            throw r8
        Lb1:
            r7.f22289X = r1
            return
        Lb4:
            k7.r$b r8 = new k7.r$b
            t6.u1 r0 = r7.f22271J
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            r8.<init>(r0, r1, r9, r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p197k7.AbstractC9197r.m27306P0(android.media.MediaCrypto, boolean):void");
    }

    /* renamed from: Y */
    private void m27307Y() {
        C11137a.m34605g(!this.f22262E0);
        C11113v1 m34237J = m34237J();
        this.f22261E.mo22818n();
        do {
            this.f22261E.mo22818n();
            int m34242V = m34242V(m34237J, this.f22261E, 0);
            if (m34242V == -5) {
                mo27354T0(m34237J);
                return;
            }
            if (m34242V != -4) {
                if (m34242V != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                if (this.f22261E.m38794s()) {
                    this.f22262E0 = true;
                    return;
                }
                if (this.f22266G0) {
                    C11108u1 c11108u1 = (C11108u1) C11137a.m34603e(this.f22271J);
                    this.f22273K = c11108u1;
                    mo27355U0(c11108u1, null);
                    this.f22266G0 = false;
                }
                this.f22261E.m38812z();
            }
        } while (this.f22263F.m27243D(this.f22261E));
        this.f22311t0 = true;
    }

    /* renamed from: Z */
    private boolean m27308Z(long j10, long j11) {
        boolean z10;
        C11137a.m34605g(!this.f22264F0);
        if (this.f22263F.m27247I()) {
            C9187h c9187h = this.f22263F;
            if (!mo27361a1(j10, j11, null, c9187h.f32142c, this.f22306o0, 0, c9187h.m27246H(), this.f22263F.m27244F(), this.f22263F.m38793r(), this.f22263F.m38794s(), this.f22273K)) {
                return false;
            }
            mo27357W0(this.f22263F.m27245G());
            this.f22263F.mo22818n();
            z10 = false;
        } else {
            z10 = false;
        }
        if (this.f22262E0) {
            this.f22264F0 = true;
            return z10;
        }
        if (this.f22311t0) {
            C11137a.m34605g(this.f22263F.m27243D(this.f22261E));
            this.f22311t0 = z10;
        }
        if (this.f22312u0) {
            if (this.f22263F.m27247I()) {
                return true;
            }
            m27325l0();
            this.f22312u0 = z10;
            m27346O0();
            if (!this.f22310s0) {
                return z10;
            }
        }
        m27307Y();
        if (this.f22263F.m27247I()) {
            this.f22263F.m38812z();
        }
        if (this.f22263F.m27247I() || this.f22262E0 || this.f22312u0) {
            return true;
        }
        return z10;
    }

    /* renamed from: Z0 */
    private void m27309Z0() {
        int i10 = this.f22317y0;
        if (i10 == 1) {
            m27335s0();
            return;
        }
        if (i10 == 2) {
            m27335s0();
            m27339w1();
        } else if (i10 == 3) {
            m27315d1();
        } else {
            this.f22264F0 = true;
            mo27363f1();
        }
    }

    /* renamed from: b0 */
    private int m27310b0(String str) {
        int i10 = C11172r0.f29040a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = C11172r0.f29043d;
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
        String str3 = C11172r0.f29041b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    /* renamed from: b1 */
    private void m27311b1() {
        this.f22256B0 = true;
        MediaFormat mo27135a = this.f22284S.mo27135a();
        if (this.f22292a0 != 0 && mo27135a.getInteger("width") == 32 && mo27135a.getInteger("height") == 32) {
            this.f22301j0 = true;
            return;
        }
        if (this.f22299h0) {
            mo27135a.setInteger("channel-count", 1);
        }
        this.f22286U = mo27135a;
        this.f22287V = true;
    }

    /* renamed from: c0 */
    private static boolean m27312c0(String str, C11108u1 c11108u1) {
        return C11172r0.f29040a < 21 && c11108u1.f28799y.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    /* renamed from: c1 */
    private boolean m27313c1(int i10) {
        C11113v1 m34237J = m34237J();
        this.f22257C.mo22818n();
        int m34242V = m34242V(m34237J, this.f22257C, i10 | 4);
        if (m34242V == -5) {
            mo27354T0(m34237J);
            return true;
        }
        if (m34242V != -4 || !this.f22257C.m38794s()) {
            return false;
        }
        this.f22262E0 = true;
        m27309Z0();
        return false;
    }

    /* renamed from: d0 */
    private static boolean m27314d0(String str) {
        if (C11172r0.f29040a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(C11172r0.f29042c)) {
            String str2 = C11172r0.f29041b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d1 */
    private void m27315d1() {
        m27362e1();
        m27346O0();
    }

    /* renamed from: e0 */
    private static boolean m27316e0(String str) {
        int i10 = C11172r0.f29040a;
        if (i10 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i10 <= 19) {
                String str2 = C11172r0.f29041b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    private static boolean m27317f0(String str) {
        return C11172r0.f29040a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    /* renamed from: g0 */
    private static boolean m27318g0(C9195p c9195p) {
        String str = c9195p.f22241a;
        int i10 = C11172r0.f29040a;
        return (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i10 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i10 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || ("Amazon".equals(C11172r0.f29042c) && "AFTS".equals(C11172r0.f29043d) && c9195p.f22247g));
    }

    /* renamed from: h0 */
    private static boolean m27319h0(String str) {
        int i10 = C11172r0.f29040a;
        return i10 < 18 || (i10 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i10 == 19 && C11172r0.f29043d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    /* renamed from: i0 */
    private static boolean m27320i0(String str, C11108u1 c11108u1) {
        return C11172r0.f29040a <= 18 && c11108u1.f28776J == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    /* renamed from: i1 */
    private void m27321i1() {
        this.f22305n0 = -1;
        this.f22259D.f32142c = null;
    }

    /* renamed from: j0 */
    private static boolean m27322j0(String str) {
        return C11172r0.f29040a == 29 && "c2.android.aac.decoder".equals(str);
    }

    /* renamed from: j1 */
    private void m27323j1() {
        this.f22306o0 = -1;
        this.f22307p0 = null;
    }

    /* renamed from: k1 */
    private void m27324k1(InterfaceC12320n interfaceC12320n) {
        InterfaceC12320n.m39850b(this.f22275L, interfaceC12320n);
        this.f22275L = interfaceC12320n;
    }

    /* renamed from: l0 */
    private void m27325l0() {
        this.f22312u0 = false;
        this.f22263F.mo22818n();
        this.f22261E.mo22818n();
        this.f22311t0 = false;
        this.f22310s0 = false;
    }

    /* renamed from: l1 */
    private void m27326l1(c cVar) {
        this.f22274K0 = cVar;
        long j10 = cVar.f22328c;
        if (j10 != -9223372036854775807L) {
            this.f22278M0 = true;
            mo27356V0(j10);
        }
    }

    /* renamed from: m0 */
    private boolean m27327m0() {
        if (this.f22319z0) {
            this.f22315x0 = 1;
            if (this.f22294c0 || this.f22296e0) {
                this.f22317y0 = 3;
                return false;
            }
            this.f22317y0 = 1;
        }
        return true;
    }

    /* renamed from: n0 */
    private void m27328n0() {
        if (!this.f22319z0) {
            m27315d1();
        } else {
            this.f22315x0 = 1;
            this.f22317y0 = 3;
        }
    }

    /* renamed from: o0 */
    private boolean m27329o0() {
        if (this.f22319z0) {
            this.f22315x0 = 1;
            if (this.f22294c0 || this.f22296e0) {
                this.f22317y0 = 3;
                return false;
            }
            this.f22317y0 = 2;
        } else {
            m27339w1();
        }
        return true;
    }

    /* renamed from: o1 */
    private void m27330o1(InterfaceC12320n interfaceC12320n) {
        InterfaceC12320n.m39850b(this.f22277M, interfaceC12320n);
        this.f22277M = interfaceC12320n;
    }

    /* renamed from: p0 */
    private boolean m27331p0(long j10, long j11) {
        boolean z10;
        boolean mo27361a1;
        int mo27146l;
        if (!m27299H0()) {
            if (this.f22297f0 && this.f22254A0) {
                try {
                    mo27146l = this.f22284S.mo27146l(this.f22267H);
                } catch (IllegalStateException unused) {
                    m27309Z0();
                    if (this.f22264F0) {
                        m27362e1();
                    }
                    return false;
                }
            } else {
                mo27146l = this.f22284S.mo27146l(this.f22267H);
            }
            if (mo27146l < 0) {
                if (mo27146l == -2) {
                    m27311b1();
                    return true;
                }
                if (this.f22302k0 && (this.f22262E0 || this.f22315x0 == 2)) {
                    m27309Z0();
                }
                return false;
            }
            if (this.f22301j0) {
                this.f22301j0 = false;
                this.f22284S.mo27147m(mo27146l, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f22267H;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                m27309Z0();
                return false;
            }
            this.f22306o0 = mo27146l;
            ByteBuffer mo27148n = this.f22284S.mo27148n(mo27146l);
            this.f22307p0 = mo27148n;
            if (mo27148n != null) {
                mo27148n.position(this.f22267H.offset);
                ByteBuffer byteBuffer = this.f22307p0;
                MediaCodec.BufferInfo bufferInfo2 = this.f22267H;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f22298g0) {
                MediaCodec.BufferInfo bufferInfo3 = this.f22267H;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j12 = this.f22258C0;
                    if (j12 != -9223372036854775807L) {
                        bufferInfo3.presentationTimeUs = j12;
                    }
                }
            }
            this.f22308q0 = m27302K0(this.f22267H.presentationTimeUs);
            long j13 = this.f22260D0;
            long j14 = this.f22267H.presentationTimeUs;
            this.f22309r0 = j13 == j14;
            m27378x1(j14);
        }
        if (this.f22297f0 && this.f22254A0) {
            try {
                InterfaceC9191l interfaceC9191l = this.f22284S;
                ByteBuffer byteBuffer2 = this.f22307p0;
                int i10 = this.f22306o0;
                MediaCodec.BufferInfo bufferInfo4 = this.f22267H;
                z10 = false;
                try {
                    mo27361a1 = mo27361a1(j10, j11, interfaceC9191l, byteBuffer2, i10, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f22308q0, this.f22309r0, this.f22273K);
                } catch (IllegalStateException unused2) {
                    m27309Z0();
                    if (this.f22264F0) {
                        m27362e1();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            InterfaceC9191l interfaceC9191l2 = this.f22284S;
            ByteBuffer byteBuffer3 = this.f22307p0;
            int i11 = this.f22306o0;
            MediaCodec.BufferInfo bufferInfo5 = this.f22267H;
            mo27361a1 = mo27361a1(j10, j11, interfaceC9191l2, byteBuffer3, i11, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f22308q0, this.f22309r0, this.f22273K);
        }
        if (mo27361a1) {
            mo27357W0(this.f22267H.presentationTimeUs);
            boolean z11 = (this.f22267H.flags & 4) != 0 ? true : z10;
            m27323j1();
            if (!z11) {
                return true;
            }
            m27309Z0();
        }
        return z10;
    }

    /* renamed from: p1 */
    private boolean m27332p1(long j10) {
        return this.f22281P == -9223372036854775807L || SystemClock.elapsedRealtime() - j10 < this.f22281P;
    }

    /* renamed from: q0 */
    private boolean m27333q0(C9195p c9195p, C11108u1 c11108u1, InterfaceC12320n interfaceC12320n, InterfaceC12320n interfaceC12320n2) {
        C12299c0 m27298C0;
        if (interfaceC12320n == interfaceC12320n2) {
            return false;
        }
        if (interfaceC12320n2 == null || interfaceC12320n == null || !interfaceC12320n2.mo39699c().equals(interfaceC12320n.mo39699c()) || C11172r0.f29040a < 23) {
            return true;
        }
        UUID uuid = C11081p.f28575e;
        if (uuid.equals(interfaceC12320n.mo39699c()) || uuid.equals(interfaceC12320n2.mo39699c()) || (m27298C0 = m27298C0(interfaceC12320n2)) == null) {
            return true;
        }
        return !c9195p.f22247g && (m27298C0.f32953c ? false : interfaceC12320n2.mo39705i(c11108u1.f28797w));
    }

    /* renamed from: r0 */
    private boolean m27334r0() {
        int i10;
        if (this.f22284S == null || (i10 = this.f22315x0) == 2 || this.f22262E0) {
            return false;
        }
        if (i10 == 0 && m27370r1()) {
            m27328n0();
        }
        if (this.f22305n0 < 0) {
            int mo27145k = this.f22284S.mo27145k();
            this.f22305n0 = mo27145k;
            if (mo27145k < 0) {
                return false;
            }
            this.f22259D.f32142c = this.f22284S.mo27137c(mo27145k);
            this.f22259D.mo22818n();
        }
        if (this.f22315x0 == 1) {
            if (!this.f22302k0) {
                this.f22254A0 = true;
                this.f22284S.mo27139e(this.f22305n0, 0, 0, 0L, 4);
                m27321i1();
            }
            this.f22315x0 = 2;
            return false;
        }
        if (this.f22300i0) {
            this.f22300i0 = false;
            ByteBuffer byteBuffer = this.f22259D.f32142c;
            byte[] bArr = f22252N0;
            byteBuffer.put(bArr);
            this.f22284S.mo27139e(this.f22305n0, 0, bArr.length, 0L, 0);
            m27321i1();
            this.f22319z0 = true;
            return true;
        }
        if (this.f22314w0 == 1) {
            for (int i11 = 0; i11 < this.f22285T.f28799y.size(); i11++) {
                this.f22259D.f32142c.put(this.f22285T.f28799y.get(i11));
            }
            this.f22314w0 = 2;
        }
        int position = this.f22259D.f32142c.position();
        C11113v1 m34237J = m34237J();
        try {
            int m34242V = m34242V(m34237J, this.f22259D, 0);
            if (mo34247i() || this.f22259D.m38797v()) {
                this.f22260D0 = this.f22258C0;
            }
            if (m34242V == -3) {
                return false;
            }
            if (m34242V == -5) {
                if (this.f22314w0 == 2) {
                    this.f22259D.mo22818n();
                    this.f22314w0 = 1;
                }
                mo27354T0(m34237J);
                return true;
            }
            if (this.f22259D.m38794s()) {
                if (this.f22314w0 == 2) {
                    this.f22259D.mo22818n();
                    this.f22314w0 = 1;
                }
                this.f22262E0 = true;
                if (!this.f22319z0) {
                    m27309Z0();
                    return false;
                }
                try {
                    if (!this.f22302k0) {
                        this.f22254A0 = true;
                        this.f22284S.mo27139e(this.f22305n0, 0, 0, 0L, 4);
                        m27321i1();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e10) {
                    throw m34234G(e10, this.f22271J, C11172r0.m34898V(e10.getErrorCode()));
                }
            }
            if (!this.f22319z0 && !this.f22259D.m38796u()) {
                this.f22259D.mo22818n();
                if (this.f22314w0 == 2) {
                    this.f22314w0 = 1;
                }
                return true;
            }
            boolean m38809A = this.f22259D.m38809A();
            if (m38809A) {
                this.f22259D.f32141b.m38800b(position);
            }
            if (this.f22293b0 && !m38809A) {
                C11179x.m35015b(this.f22259D.f32142c);
                if (this.f22259D.f32142c.position() == 0) {
                    return true;
                }
                this.f22293b0 = false;
            }
            C12082g c12082g = this.f22259D;
            long j10 = c12082g.f32144e;
            C9188i c9188i = this.f22303l0;
            if (c9188i != null) {
                j10 = c9188i.m27252d(this.f22271J, c12082g);
                this.f22258C0 = Math.max(this.f22258C0, this.f22303l0.m27250b(this.f22271J));
            }
            long j11 = j10;
            if (this.f22259D.m38793r()) {
                this.f22265G.add(Long.valueOf(j11));
            }
            if (this.f22266G0) {
                (!this.f22269I.isEmpty() ? this.f22269I.peekLast() : this.f22274K0).f22329d.m34805a(j11, this.f22271J);
                this.f22266G0 = false;
            }
            this.f22258C0 = Math.max(this.f22258C0, j11);
            this.f22259D.m38812z();
            if (this.f22259D.m38792q()) {
                mo27345G0(this.f22259D);
            }
            mo27359Y0(this.f22259D);
            try {
                if (m38809A) {
                    this.f22284S.mo27140f(this.f22305n0, 0, this.f22259D.f32141b, j11, 0);
                } else {
                    this.f22284S.mo27139e(this.f22305n0, 0, this.f22259D.f32142c.limit(), j11, 0);
                }
                m27321i1();
                this.f22319z0 = true;
                this.f22314w0 = 0;
                this.f22272J0.f32131c++;
                return true;
            } catch (MediaCodec.CryptoException e11) {
                throw m34234G(e11, this.f22271J, C11172r0.m34898V(e11.getErrorCode()));
            }
        } catch (C12082g.a e12) {
            mo27348Q0(e12);
            m27313c1(0);
            m27335s0();
            return true;
        }
    }

    /* renamed from: s0 */
    private void m27335s0() {
        try {
            this.f22284S.flush();
        } finally {
            mo27364g1();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u1 */
    public static boolean m27336u1(C11108u1 c11108u1) {
        int i10 = c11108u1.f28784R;
        return i10 == 0 || i10 == 2;
    }

    /* renamed from: v0 */
    private List<C9195p> m27337v0(boolean z10) {
        List<C9195p> mo27341B0 = mo27341B0(this.f22318z, this.f22271J, z10);
        if (mo27341B0.isEmpty() && z10) {
            mo27341B0 = mo27341B0(this.f22318z, this.f22271J, false);
            if (!mo27341B0.isEmpty()) {
                C11173s.m34970i("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f22271J.f28797w + ", but no secure decoder available. Trying to proceed with " + mo27341B0 + ".");
            }
        }
        return mo27341B0;
    }

    /* renamed from: v1 */
    private boolean m27338v1(C11108u1 c11108u1) {
        if (C11172r0.f29040a >= 23 && this.f22284S != null && this.f22317y0 != 3 && getState() != 0) {
            float mo27381z0 = mo27381z0(this.f22283R, c11108u1, m34240M());
            float f10 = this.f22288W;
            if (f10 == mo27381z0) {
                return true;
            }
            if (mo27381z0 == -1.0f) {
                m27328n0();
                return false;
            }
            if (f10 == -1.0f && mo27381z0 <= this.f22255B) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", mo27381z0);
            this.f22284S.mo27143i(bundle);
            this.f22288W = mo27381z0;
        }
        return true;
    }

    /* renamed from: w1 */
    private void m27339w1() {
        try {
            this.f22279N.setMediaDrmSession(m27298C0(this.f22277M).f32952b);
            m27324k1(this.f22277M);
            this.f22315x0 = 0;
            this.f22317y0 = 0;
        } catch (MediaCryptoException e10) {
            throw m34234G(e10, this.f22271J, 6006);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A0 */
    public final MediaFormat m27340A0() {
        return this.f22286U;
    }

    /* renamed from: B0 */
    protected abstract List<C9195p> mo27341B0(InterfaceC9199t interfaceC9199t, C11108u1 c11108u1, boolean z10);

    /* renamed from: D0 */
    protected abstract InterfaceC9191l.a mo27342D0(C9195p c9195p, C11108u1 c11108u1, MediaCrypto mediaCrypto, float f10);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E0 */
    public final long m27343E0() {
        return this.f22274K0.f22328c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F0 */
    public float m27344F0() {
        return this.f22282Q;
    }

    /* renamed from: G0 */
    protected void mo27345G0(C12082g c12082g) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p361t6.AbstractC11061l
    /* renamed from: O */
    public void mo22831O() {
        this.f22271J = null;
        m27326l1(c.f22325e);
        this.f22269I.clear();
        m27374u0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: O0 */
    public final void m27346O0() {
        C11108u1 c11108u1;
        if (this.f22284S != null || this.f22310s0 || (c11108u1 = this.f22271J) == null) {
            return;
        }
        if (this.f22277M == null && mo27371s1(c11108u1)) {
            m27300I0(this.f22271J);
            return;
        }
        m27324k1(this.f22277M);
        String str = this.f22271J.f28797w;
        InterfaceC12320n interfaceC12320n = this.f22275L;
        if (interfaceC12320n != null) {
            if (this.f22279N == null) {
                C12299c0 m27298C0 = m27298C0(interfaceC12320n);
                if (m27298C0 != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(m27298C0.f32951a, m27298C0.f32952b);
                        this.f22279N = mediaCrypto;
                        this.f22280O = !m27298C0.f32953c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e10) {
                        throw m34234G(e10, this.f22271J, 6006);
                    }
                } else if (this.f22275L.mo39698a() == null) {
                    return;
                }
            }
            if (C12299c0.f32950d) {
                int state = this.f22275L.getState();
                if (state == 1) {
                    InterfaceC12320n.a aVar = (InterfaceC12320n.a) C11137a.m34603e(this.f22275L.mo39698a());
                    throw m34234G(aVar, this.f22271J, aVar.f33062a);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            m27306P0(this.f22279N, this.f22280O);
        } catch (b e11) {
            throw m34234G(e11, this.f22271J, 4001);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p361t6.AbstractC11061l
    /* renamed from: P */
    public void mo27347P(boolean z10, boolean z11) {
        this.f22272J0 = new C12080e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p361t6.AbstractC11061l
    /* renamed from: Q */
    public void mo22832Q(long j10, boolean z10) {
        this.f22262E0 = false;
        this.f22264F0 = false;
        this.f22268H0 = false;
        if (this.f22310s0) {
            this.f22263F.mo22818n();
            this.f22261E.mo22818n();
            this.f22311t0 = false;
        } else {
            m27372t0();
        }
        if (this.f22274K0.f22329d.m34810l() > 0) {
            this.f22266G0 = true;
        }
        this.f22274K0.f22329d.m34806c();
        this.f22269I.clear();
    }

    /* renamed from: Q0 */
    protected abstract void mo27348Q0(Exception exc);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p361t6.AbstractC11061l
    /* renamed from: R */
    public void mo27349R() {
        try {
            m27325l0();
            m27362e1();
        } finally {
            m27330o1(null);
        }
    }

    /* renamed from: R0 */
    protected abstract void mo27350R0(String str, InterfaceC9191l.a aVar, long j10, long j11);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p361t6.AbstractC11061l
    /* renamed from: S */
    public void mo27351S() {
    }

    /* renamed from: S0 */
    protected abstract void mo27352S0(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p361t6.AbstractC11061l
    /* renamed from: T */
    public void mo27353T() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (m27329o0() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ce, code lost:
    
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b2, code lost:
    
        if (m27329o0() == false) goto L69;
     */
    /* renamed from: T0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p414w6.C12084i mo27354T0(p361t6.C11113v1 r12) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p197k7.AbstractC9197r.mo27354T0(t6.v1):w6.i");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5 >= r1) goto L13;
     */
    @Override // p361t6.AbstractC11061l
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo22833U(p361t6.C11108u1[] r13, long r14, long r16) {
        /*
            r12 = this;
            r0 = r12
            k7.r$c r1 = r0.f22274K0
            long r1 = r1.f22328c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            k7.r$c r1 = new k7.r$c
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.m27326l1(r1)
            goto L65
        L20:
            java.util.ArrayDeque<k7.r$c> r1 = r0.f22269I
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            long r1 = r0.f22258C0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L38
            long r5 = r0.f22276L0
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
            r12.m27326l1(r1)
            k7.r$c r1 = r0.f22274K0
            long r1 = r1.f22328c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L65
            r12.mo27358X0()
            goto L65
        L55:
            java.util.ArrayDeque<k7.r$c> r1 = r0.f22269I
            k7.r$c r9 = new k7.r$c
            long r3 = r0.f22258C0
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p197k7.AbstractC9197r.mo22833U(t6.u1[], long, long):void");
    }

    /* renamed from: U0 */
    protected abstract void mo27355U0(C11108u1 c11108u1, MediaFormat mediaFormat);

    /* renamed from: V0 */
    protected void mo27356V0(long j10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: W0 */
    public void mo27357W0(long j10) {
        this.f22276L0 = j10;
        while (!this.f22269I.isEmpty() && j10 >= this.f22269I.peek().f22326a) {
            m27326l1(this.f22269I.poll());
            mo27358X0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: X0 */
    public void mo27358X0() {
    }

    /* renamed from: Y0 */
    protected abstract void mo27359Y0(C12082g c12082g);

    @Override // p361t6.InterfaceC11095r3
    /* renamed from: a */
    public final int mo22834a(C11108u1 c11108u1) {
        try {
            return mo27373t1(this.f22318z, c11108u1);
        } catch (C9180c0.c e10) {
            throw m34234G(e10, c11108u1, 4002);
        }
    }

    /* renamed from: a0 */
    protected abstract C12084i mo27360a0(C9195p c9195p, C11108u1 c11108u1, C11108u1 c11108u12);

    /* renamed from: a1 */
    protected abstract boolean mo27361a1(long j10, long j11, InterfaceC9191l interfaceC9191l, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, C11108u1 c11108u1);

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: d */
    public boolean mo22835d() {
        return this.f22271J != null && (m34241N() || m27299H0() || (this.f22304m0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f22304m0));
    }

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: e */
    public boolean mo22836e() {
        return this.f22264F0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e1 */
    public void m27362e1() {
        try {
            InterfaceC9191l interfaceC9191l = this.f22284S;
            if (interfaceC9191l != null) {
                interfaceC9191l.release();
                this.f22272J0.f32130b++;
                mo27352S0(this.f22291Z.f22241a);
            }
            this.f22284S = null;
            try {
                MediaCrypto mediaCrypto = this.f22279N;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f22284S = null;
            try {
                MediaCrypto mediaCrypto2 = this.f22279N;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    /* renamed from: f1 */
    protected void mo27363f1() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g1 */
    public void mo27364g1() {
        m27321i1();
        m27323j1();
        this.f22304m0 = -9223372036854775807L;
        this.f22254A0 = false;
        this.f22319z0 = false;
        this.f22300i0 = false;
        this.f22301j0 = false;
        this.f22308q0 = false;
        this.f22309r0 = false;
        this.f22265G.clear();
        this.f22258C0 = -9223372036854775807L;
        this.f22260D0 = -9223372036854775807L;
        this.f22276L0 = -9223372036854775807L;
        C9188i c9188i = this.f22303l0;
        if (c9188i != null) {
            c9188i.m27251c();
        }
        this.f22315x0 = 0;
        this.f22317y0 = 0;
        this.f22314w0 = this.f22313v0 ? 1 : 0;
    }

    /* renamed from: h1 */
    protected void m27365h1() {
        mo27364g1();
        this.f22270I0 = null;
        this.f22303l0 = null;
        this.f22289X = null;
        this.f22291Z = null;
        this.f22285T = null;
        this.f22286U = null;
        this.f22287V = false;
        this.f22256B0 = false;
        this.f22288W = -1.0f;
        this.f22292a0 = 0;
        this.f22293b0 = false;
        this.f22294c0 = false;
        this.f22295d0 = false;
        this.f22296e0 = false;
        this.f22297f0 = false;
        this.f22298g0 = false;
        this.f22299h0 = false;
        this.f22302k0 = false;
        this.f22313v0 = false;
        this.f22314w0 = 0;
        this.f22280O = false;
    }

    /* renamed from: k0 */
    protected C9192m mo27366k0(Throwable th2, C9195p c9195p) {
        return new C9192m(th2, c9195p);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m1 */
    public final void m27367m1() {
        this.f22268H0 = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n1 */
    public final void m27368n1(C11121x c11121x) {
        this.f22270I0 = c11121x;
    }

    /* renamed from: q1 */
    protected boolean mo27369q1(C9195p c9195p) {
        return true;
    }

    /* renamed from: r1 */
    protected boolean m27370r1() {
        return false;
    }

    /* renamed from: s1 */
    protected boolean mo27371s1(C11108u1 c11108u1) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t0 */
    public final boolean m27372t0() {
        boolean m27374u0 = m27374u0();
        if (m27374u0) {
            m27346O0();
        }
        return m27374u0;
    }

    /* renamed from: t1 */
    protected abstract int mo27373t1(InterfaceC9199t interfaceC9199t, C11108u1 c11108u1);

    /* renamed from: u0 */
    protected boolean m27374u0() {
        if (this.f22284S == null) {
            return false;
        }
        int i10 = this.f22317y0;
        if (i10 == 3 || this.f22294c0 || ((this.f22295d0 && !this.f22256B0) || (this.f22296e0 && this.f22254A0))) {
            m27362e1();
            return true;
        }
        if (i10 == 2) {
            int i11 = C11172r0.f29040a;
            C11137a.m34605g(i11 >= 23);
            if (i11 >= 23) {
                try {
                    m27339w1();
                } catch (C11121x e10) {
                    C11173s.m34971j("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    m27362e1();
                    return true;
                }
            }
        }
        m27335s0();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w0 */
    public final InterfaceC9191l m27375w0() {
        return this.f22284S;
    }

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: x */
    public void mo27376x(float f10, float f11) {
        this.f22282Q = f10;
        this.f22283R = f11;
        m27338v1(this.f22285T);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x0 */
    public final C9195p m27377x0() {
        return this.f22291Z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x1 */
    public final void m27378x1(long j10) {
        boolean z10;
        C11108u1 m34809j = this.f22274K0.f22329d.m34809j(j10);
        if (m34809j == null && this.f22278M0 && this.f22286U != null) {
            m34809j = this.f22274K0.f22329d.m34808i();
        }
        if (m34809j != null) {
            this.f22273K = m34809j;
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (this.f22287V && this.f22273K != null)) {
            mo27355U0(this.f22273K, this.f22286U);
            this.f22287V = false;
            this.f22278M0 = false;
        }
    }

    @Override // p361t6.AbstractC11061l, p361t6.InterfaceC11095r3
    /* renamed from: y */
    public final int mo27379y() {
        return 8;
    }

    /* renamed from: y0 */
    protected boolean mo27380y0() {
        return false;
    }

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: z */
    public void mo22838z(long j10, long j11) {
        boolean z10 = false;
        if (this.f22268H0) {
            this.f22268H0 = false;
            m27309Z0();
        }
        C11121x c11121x = this.f22270I0;
        if (c11121x != null) {
            this.f22270I0 = null;
            throw c11121x;
        }
        try {
            if (this.f22264F0) {
                mo27363f1();
                return;
            }
            if (this.f22271J != null || m27313c1(2)) {
                m27346O0();
                if (this.f22310s0) {
                    C11166o0.m34831a("bypassRender");
                    do {
                    } while (m27308Z(j10, j11));
                } else {
                    if (this.f22284S == null) {
                        this.f22272J0.f32132d += m34243X(j10);
                        m27313c1(1);
                        this.f22272J0.m38806c();
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    C11166o0.m34831a("drainAndFeed");
                    while (m27331p0(j10, j11) && m27332p1(elapsedRealtime)) {
                    }
                    while (m27334r0() && m27332p1(elapsedRealtime)) {
                    }
                }
                C11166o0.m34833c();
                this.f22272J0.m38806c();
            }
        } catch (IllegalStateException e10) {
            if (!m27303L0(e10)) {
                throw e10;
            }
            mo27348Q0(e10);
            if (C11172r0.f29040a >= 21 && m27305N0(e10)) {
                z10 = true;
            }
            if (z10) {
                m27362e1();
            }
            throw m34235H(mo27366k0(e10, m27377x0()), this.f22271J, z10, 4003);
        }
    }

    /* renamed from: z0 */
    protected abstract float mo27381z0(float f10, C11108u1 c11108u1, C11108u1[] c11108u1Arr);
}

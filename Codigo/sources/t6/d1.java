package t6;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import t6.a3;
import t6.b;
import t6.d1;
import t6.d4;
import t6.j;
import t6.j3;
import t6.m3;
import t6.q1;
import t6.y;
import t6.y3;
import t8.r;
import v7.a0;
import v7.x0;
import v8.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d1 extends k implements y {
    private final j A;
    private final y3 B;
    private final j4 C;
    private final k4 D;
    private final long E;
    private int F;
    private boolean G;
    private int H;
    private int I;
    private boolean J;
    private int K;
    private u3 L;
    private v7.x0 M;
    private boolean N;
    private j3.b O;
    private h2 P;
    private h2 Q;
    private u1 R;
    private u1 S;
    private AudioTrack T;
    private Object U;
    private Surface V;
    private SurfaceHolder W;
    private v8.l X;
    private boolean Y;
    private TextureView Z;

    /* renamed from: a0, reason: collision with root package name */
    private int f25987a0;

    /* renamed from: b, reason: collision with root package name */
    final q8.b0 f25988b;

    /* renamed from: b0, reason: collision with root package name */
    private int f25989b0;

    /* renamed from: c, reason: collision with root package name */
    final j3.b f25990c;

    /* renamed from: c0, reason: collision with root package name */
    private t8.h0 f25991c0;

    /* renamed from: d, reason: collision with root package name */
    private final t8.g f25992d;

    /* renamed from: d0, reason: collision with root package name */
    private w6.e f25993d0;

    /* renamed from: e, reason: collision with root package name */
    private final Context f25994e;

    /* renamed from: e0, reason: collision with root package name */
    private w6.e f25995e0;

    /* renamed from: f, reason: collision with root package name */
    private final j3 f25996f;

    /* renamed from: f0, reason: collision with root package name */
    private int f25997f0;

    /* renamed from: g, reason: collision with root package name */
    private final q3[] f25998g;

    /* renamed from: g0, reason: collision with root package name */
    private v6.e f25999g0;

    /* renamed from: h, reason: collision with root package name */
    private final q8.a0 f26000h;

    /* renamed from: h0, reason: collision with root package name */
    private float f26001h0;

    /* renamed from: i, reason: collision with root package name */
    private final t8.o f26002i;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f26003i0;

    /* renamed from: j, reason: collision with root package name */
    private final q1.f f26004j;

    /* renamed from: j0, reason: collision with root package name */
    private g8.f f26005j0;

    /* renamed from: k, reason: collision with root package name */
    private final q1 f26006k;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f26007k0;

    /* renamed from: l, reason: collision with root package name */
    private final t8.r<j3.d> f26008l;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f26009l0;

    /* renamed from: m, reason: collision with root package name */
    private final CopyOnWriteArraySet<y.a> f26010m;

    /* renamed from: m0, reason: collision with root package name */
    private t8.g0 f26011m0;

    /* renamed from: n, reason: collision with root package name */
    private final d4.b f26012n;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f26013n0;

    /* renamed from: o, reason: collision with root package name */
    private final List<e> f26014o;

    /* renamed from: o0, reason: collision with root package name */
    private boolean f26015o0;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f26016p;

    /* renamed from: p0, reason: collision with root package name */
    private v f26017p0;

    /* renamed from: q, reason: collision with root package name */
    private final a0.a f26018q;

    /* renamed from: q0, reason: collision with root package name */
    private u8.a0 f26019q0;

    /* renamed from: r, reason: collision with root package name */
    private final u6.a f26020r;

    /* renamed from: r0, reason: collision with root package name */
    private h2 f26021r0;

    /* renamed from: s, reason: collision with root package name */
    private final Looper f26022s;

    /* renamed from: s0, reason: collision with root package name */
    private g3 f26023s0;

    /* renamed from: t, reason: collision with root package name */
    private final s8.e f26024t;

    /* renamed from: t0, reason: collision with root package name */
    private int f26025t0;

    /* renamed from: u, reason: collision with root package name */
    private final long f26026u;

    /* renamed from: u0, reason: collision with root package name */
    private int f26027u0;

    /* renamed from: v, reason: collision with root package name */
    private final long f26028v;

    /* renamed from: v0, reason: collision with root package name */
    private long f26029v0;

    /* renamed from: w, reason: collision with root package name */
    private final t8.d f26030w;

    /* renamed from: x, reason: collision with root package name */
    private final c f26031x;

    /* renamed from: y, reason: collision with root package name */
    private final d f26032y;

    /* renamed from: z, reason: collision with root package name */
    private final t6.b f26033z;

    /* loaded from: classes.dex */
    private static final class b {
        public static u6.m3 a(Context context, d1 d1Var, boolean z10) {
            LogSessionId logSessionId;
            u6.k3 A0 = u6.k3.A0(context);
            if (A0 == null) {
                t8.s.i("ExoPlayerImpl", "MediaMetricsService unavailable.");
                logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
                return new u6.m3(logSessionId);
            }
            if (z10) {
                d1Var.U0(A0);
            }
            return new u6.m3(A0.H0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c implements u8.y, v6.u, g8.p, l7.e, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, l.b, j.b, b.InterfaceC0436b, y3.b, y.a {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void N(j3.d dVar) {
            dVar.onMediaMetadataChanged(d1.this.P);
        }

        @Override // t6.y.a
        public void A(boolean z10) {
            d1.this.j2();
        }

        @Override // t6.j.b
        public void B(float f10) {
            d1.this.X1();
        }

        @Override // t6.j.b
        public void C(int i10) {
            boolean u10 = d1.this.u();
            d1.this.g2(u10, i10, d1.k1(u10, i10));
        }

        @Override // v6.u
        public void a(Exception exc) {
            d1.this.f26020r.a(exc);
        }

        @Override // u8.y
        public void b(String str) {
            d1.this.f26020r.b(str);
        }

        @Override // u8.y
        public void c(w6.e eVar) {
            d1.this.f26020r.c(eVar);
            d1.this.R = null;
            d1.this.f25993d0 = null;
        }

        @Override // u8.y
        public void d(String str, long j10, long j11) {
            d1.this.f26020r.d(str, j10, j11);
        }

        @Override // u8.y
        public void e(w6.e eVar) {
            d1.this.f25993d0 = eVar;
            d1.this.f26020r.e(eVar);
        }

        @Override // v6.u
        public void f(u1 u1Var, w6.i iVar) {
            d1.this.S = u1Var;
            d1.this.f26020r.f(u1Var, iVar);
        }

        @Override // u8.y
        public void g(u1 u1Var, w6.i iVar) {
            d1.this.R = u1Var;
            d1.this.f26020r.g(u1Var, iVar);
        }

        @Override // v6.u
        public void h(w6.e eVar) {
            d1.this.f26020r.h(eVar);
            d1.this.S = null;
            d1.this.f25995e0 = null;
        }

        @Override // v6.u
        public void i(String str) {
            d1.this.f26020r.i(str);
        }

        @Override // v6.u
        public void j(String str, long j10, long j11) {
            d1.this.f26020r.j(str, j10, j11);
        }

        @Override // v6.u
        public void k(long j10) {
            d1.this.f26020r.k(j10);
        }

        @Override // u8.y
        public void l(Exception exc) {
            d1.this.f26020r.l(exc);
        }

        @Override // v6.u
        public void m(w6.e eVar) {
            d1.this.f25995e0 = eVar;
            d1.this.f26020r.m(eVar);
        }

        @Override // u8.y
        public void n(int i10, long j10) {
            d1.this.f26020r.n(i10, j10);
        }

        @Override // u8.y
        public void o(Object obj, long j10) {
            d1.this.f26020r.o(obj, j10);
            if (d1.this.U == obj) {
                d1.this.f26008l.l(26, new r.a() { // from class: t6.l1
                    @Override // t8.r.a
                    public final void invoke(Object obj2) {
                        ((j3.d) obj2).onRenderedFirstFrame();
                    }
                });
            }
        }

        @Override // g8.p
        public void onCues(final g8.f fVar) {
            d1.this.f26005j0 = fVar;
            d1.this.f26008l.l(27, new r.a() { // from class: t6.k1
                @Override // t8.r.a
                public final void invoke(Object obj) {
                    ((j3.d) obj).onCues(g8.f.this);
                }
            });
        }

        @Override // g8.p
        public void onCues(final List<g8.b> list) {
            d1.this.f26008l.l(27, new r.a() { // from class: t6.h1
                @Override // t8.r.a
                public final void invoke(Object obj) {
                    ((j3.d) obj).onCues((List<g8.b>) list);
                }
            });
        }

        @Override // l7.e
        public void onMetadata(final l7.a aVar) {
            d1 d1Var = d1.this;
            d1Var.f26021r0 = d1Var.f26021r0.c().L(aVar).H();
            h2 Y0 = d1.this.Y0();
            if (!Y0.equals(d1.this.P)) {
                d1.this.P = Y0;
                d1.this.f26008l.i(14, new r.a() { // from class: t6.f1
                    @Override // t8.r.a
                    public final void invoke(Object obj) {
                        d1.c.this.N((j3.d) obj);
                    }
                });
            }
            d1.this.f26008l.i(28, new r.a() { // from class: t6.g1
                @Override // t8.r.a
                public final void invoke(Object obj) {
                    ((j3.d) obj).onMetadata(l7.a.this);
                }
            });
            d1.this.f26008l.f();
        }

        @Override // v6.u
        public void onSkipSilenceEnabledChanged(final boolean z10) {
            if (d1.this.f26003i0 == z10) {
                return;
            }
            d1.this.f26003i0 = z10;
            d1.this.f26008l.l(23, new r.a() { // from class: t6.n1
                @Override // t8.r.a
                public final void invoke(Object obj) {
                    ((j3.d) obj).onSkipSilenceEnabledChanged(z10);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            d1.this.b2(surfaceTexture);
            d1.this.R1(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            d1.this.c2(null);
            d1.this.R1(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            d1.this.R1(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // u8.y
        public void onVideoSizeChanged(final u8.a0 a0Var) {
            d1.this.f26019q0 = a0Var;
            d1.this.f26008l.l(25, new r.a() { // from class: t6.m1
                @Override // t8.r.a
                public final void invoke(Object obj) {
                    ((j3.d) obj).onVideoSizeChanged(u8.a0.this);
                }
            });
        }

        @Override // v6.u
        public void p(Exception exc) {
            d1.this.f26020r.p(exc);
        }

        @Override // v6.u
        public void q(int i10, long j10, long j11) {
            d1.this.f26020r.q(i10, j10, j11);
        }

        @Override // u8.y
        public void r(long j10, int i10) {
            d1.this.f26020r.r(j10, i10);
        }

        @Override // t6.y3.b
        public void s(int i10) {
            final v Z0 = d1.Z0(d1.this.B);
            if (Z0.equals(d1.this.f26017p0)) {
                return;
            }
            d1.this.f26017p0 = Z0;
            d1.this.f26008l.l(29, new r.a() { // from class: t6.i1
                @Override // t8.r.a
                public final void invoke(Object obj) {
                    ((j3.d) obj).onDeviceInfoChanged(v.this);
                }
            });
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            d1.this.R1(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (d1.this.Y) {
                d1.this.c2(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (d1.this.Y) {
                d1.this.c2(null);
            }
            d1.this.R1(0, 0);
        }

        @Override // t6.b.InterfaceC0436b
        public void u() {
            d1.this.g2(false, -1, 3);
        }

        @Override // v8.l.b
        public void w(Surface surface) {
            d1.this.c2(null);
        }

        @Override // v8.l.b
        public void x(Surface surface) {
            d1.this.c2(surface);
        }

        @Override // t6.y3.b
        public void y(final int i10, final boolean z10) {
            d1.this.f26008l.l(30, new r.a() { // from class: t6.j1
                @Override // t8.r.a
                public final void invoke(Object obj) {
                    ((j3.d) obj).onDeviceVolumeChanged(i10, z10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d implements u8.k, v8.a, m3.b {

        /* renamed from: a, reason: collision with root package name */
        private u8.k f26035a;

        /* renamed from: b, reason: collision with root package name */
        private v8.a f26036b;

        /* renamed from: c, reason: collision with root package name */
        private u8.k f26037c;

        /* renamed from: d, reason: collision with root package name */
        private v8.a f26038d;

        private d() {
        }

        @Override // u8.k
        public void a(long j10, long j11, u1 u1Var, MediaFormat mediaFormat) {
            u8.k kVar = this.f26037c;
            if (kVar != null) {
                kVar.a(j10, j11, u1Var, mediaFormat);
            }
            u8.k kVar2 = this.f26035a;
            if (kVar2 != null) {
                kVar2.a(j10, j11, u1Var, mediaFormat);
            }
        }

        @Override // v8.a
        public void b(long j10, float[] fArr) {
            v8.a aVar = this.f26038d;
            if (aVar != null) {
                aVar.b(j10, fArr);
            }
            v8.a aVar2 = this.f26036b;
            if (aVar2 != null) {
                aVar2.b(j10, fArr);
            }
        }

        @Override // v8.a
        public void c() {
            v8.a aVar = this.f26038d;
            if (aVar != null) {
                aVar.c();
            }
            v8.a aVar2 = this.f26036b;
            if (aVar2 != null) {
                aVar2.c();
            }
        }

        @Override // t6.m3.b
        public void p(int i10, Object obj) {
            v8.a cameraMotionListener;
            if (i10 == 7) {
                this.f26035a = (u8.k) obj;
                return;
            }
            if (i10 == 8) {
                this.f26036b = (v8.a) obj;
                return;
            }
            if (i10 != 10000) {
                return;
            }
            v8.l lVar = (v8.l) obj;
            if (lVar == null) {
                cameraMotionListener = null;
                this.f26037c = null;
            } else {
                this.f26037c = lVar.getVideoFrameMetadataListener();
                cameraMotionListener = lVar.getCameraMotionListener();
            }
            this.f26038d = cameraMotionListener;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e implements m2 {

        /* renamed from: a, reason: collision with root package name */
        private final Object f26039a;

        /* renamed from: b, reason: collision with root package name */
        private d4 f26040b;

        public e(Object obj, d4 d4Var) {
            this.f26039a = obj;
            this.f26040b = d4Var;
        }

        @Override // t6.m2
        public d4 a() {
            return this.f26040b;
        }

        @Override // t6.m2
        public Object l() {
            return this.f26039a;
        }
    }

    static {
        r1.a("goog.exo.exoplayer");
    }

    public d1(y.b bVar, j3 j3Var) {
        t8.g gVar = new t8.g();
        this.f25992d = gVar;
        try {
            t8.s.f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.7] [" + t8.r0.f26748e + "]");
            Context applicationContext = bVar.f26594a.getApplicationContext();
            this.f25994e = applicationContext;
            u6.a apply = bVar.f26602i.apply(bVar.f26595b);
            this.f26020r = apply;
            this.f26011m0 = bVar.f26604k;
            this.f25999g0 = bVar.f26605l;
            this.f25987a0 = bVar.f26610q;
            this.f25989b0 = bVar.f26611r;
            this.f26003i0 = bVar.f26609p;
            this.E = bVar.f26618y;
            c cVar = new c();
            this.f26031x = cVar;
            d dVar = new d();
            this.f26032y = dVar;
            Handler handler = new Handler(bVar.f26603j);
            q3[] a10 = bVar.f26597d.get().a(handler, cVar, cVar, cVar, cVar);
            this.f25998g = a10;
            t8.a.g(a10.length > 0);
            q8.a0 a0Var = bVar.f26599f.get();
            this.f26000h = a0Var;
            this.f26018q = bVar.f26598e.get();
            s8.e eVar = bVar.f26601h.get();
            this.f26024t = eVar;
            this.f26016p = bVar.f26612s;
            this.L = bVar.f26613t;
            this.f26026u = bVar.f26614u;
            this.f26028v = bVar.f26615v;
            this.N = bVar.f26619z;
            Looper looper = bVar.f26603j;
            this.f26022s = looper;
            t8.d dVar2 = bVar.f26595b;
            this.f26030w = dVar2;
            j3 j3Var2 = j3Var == null ? this : j3Var;
            this.f25996f = j3Var2;
            this.f26008l = new t8.r<>(looper, dVar2, new r.b() { // from class: t6.q0
                @Override // t8.r.b
                public final void a(Object obj, t8.l lVar) {
                    d1.this.t1((j3.d) obj, lVar);
                }
            });
            this.f26010m = new CopyOnWriteArraySet<>();
            this.f26014o = new ArrayList();
            this.M = new x0.a(0);
            q8.b0 b0Var = new q8.b0(new s3[a10.length], new q8.r[a10.length], i4.f26207b, null);
            this.f25988b = b0Var;
            this.f26012n = new d4.b();
            j3.b e10 = new j3.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).d(29, a0Var.d()).e();
            this.f25990c = e10;
            this.O = new j3.b.a().b(e10).a(4).a(10).e();
            this.f26002i = dVar2.c(looper, null);
            q1.f fVar = new q1.f() { // from class: t6.v0
                @Override // t6.q1.f
                public final void a(q1.e eVar2) {
                    d1.this.v1(eVar2);
                }
            };
            this.f26004j = fVar;
            this.f26023s0 = g3.j(b0Var);
            apply.z(j3Var2, looper);
            int i10 = t8.r0.f26744a;
            q1 q1Var = new q1(a10, a0Var, b0Var, bVar.f26600g.get(), eVar, this.F, this.G, apply, this.L, bVar.f26616w, bVar.f26617x, this.N, looper, dVar2, fVar, i10 < 31 ? new u6.m3() : b.a(applicationContext, this, bVar.A), bVar.B);
            this.f26006k = q1Var;
            this.f26001h0 = 1.0f;
            this.F = 0;
            h2 h2Var = h2.T;
            this.P = h2Var;
            this.Q = h2Var;
            this.f26021r0 = h2Var;
            this.f26025t0 = -1;
            this.f25997f0 = i10 < 21 ? q1(0) : t8.r0.F(applicationContext);
            this.f26005j0 = g8.f.f16074c;
            this.f26007k0 = true;
            s(apply);
            eVar.h(new Handler(looper), apply);
            V0(cVar);
            long j10 = bVar.f26596c;
            if (j10 > 0) {
                q1Var.u(j10);
            }
            t6.b bVar2 = new t6.b(bVar.f26594a, handler, cVar);
            this.f26033z = bVar2;
            bVar2.b(bVar.f26608o);
            j jVar = new j(bVar.f26594a, handler, cVar);
            this.A = jVar;
            jVar.m(bVar.f26606m ? this.f25999g0 : null);
            y3 y3Var = new y3(bVar.f26594a, handler, cVar);
            this.B = y3Var;
            y3Var.h(t8.r0.g0(this.f25999g0.f27973c));
            j4 j4Var = new j4(bVar.f26594a);
            this.C = j4Var;
            j4Var.a(bVar.f26607n != 0);
            k4 k4Var = new k4(bVar.f26594a);
            this.D = k4Var;
            k4Var.a(bVar.f26607n == 2);
            this.f26017p0 = Z0(y3Var);
            this.f26019q0 = u8.a0.f27340e;
            this.f25991c0 = t8.h0.f26670c;
            a0Var.h(this.f25999g0);
            W1(1, 10, Integer.valueOf(this.f25997f0));
            W1(2, 10, Integer.valueOf(this.f25997f0));
            W1(1, 3, this.f25999g0);
            W1(2, 4, Integer.valueOf(this.f25987a0));
            W1(2, 5, Integer.valueOf(this.f25989b0));
            W1(1, 9, Boolean.valueOf(this.f26003i0));
            W1(2, 7, dVar);
            W1(6, 8, dVar);
            gVar.e();
        } catch (Throwable th2) {
            this.f25992d.e();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A1(j3.d dVar) {
        dVar.onAvailableCommandsChanged(this.O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B1(g3 g3Var, int i10, j3.d dVar) {
        dVar.onTimelineChanged(g3Var.f26095a, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C1(int i10, j3.e eVar, j3.e eVar2, j3.d dVar) {
        dVar.onPositionDiscontinuity(i10);
        dVar.onPositionDiscontinuity(eVar, eVar2, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E1(g3 g3Var, j3.d dVar) {
        dVar.onPlayerErrorChanged(g3Var.f26100f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F1(g3 g3Var, j3.d dVar) {
        dVar.onPlayerError(g3Var.f26100f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G1(g3 g3Var, j3.d dVar) {
        dVar.onTracksChanged(g3Var.f26103i.f23629d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I1(g3 g3Var, j3.d dVar) {
        dVar.onLoadingChanged(g3Var.f26101g);
        dVar.onIsLoadingChanged(g3Var.f26101g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void J1(g3 g3Var, j3.d dVar) {
        dVar.onPlayerStateChanged(g3Var.f26106l, g3Var.f26099e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K1(g3 g3Var, j3.d dVar) {
        dVar.onPlaybackStateChanged(g3Var.f26099e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L1(g3 g3Var, int i10, j3.d dVar) {
        dVar.onPlayWhenReadyChanged(g3Var.f26106l, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M1(g3 g3Var, j3.d dVar) {
        dVar.onPlaybackSuppressionReasonChanged(g3Var.f26107m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void N1(g3 g3Var, j3.d dVar) {
        dVar.onIsPlayingChanged(r1(g3Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O1(g3 g3Var, j3.d dVar) {
        dVar.onPlaybackParametersChanged(g3Var.f26108n);
    }

    private g3 P1(g3 g3Var, d4 d4Var, Pair<Object, Long> pair) {
        long j10;
        t8.a.a(d4Var.v() || pair != null);
        d4 d4Var2 = g3Var.f26095a;
        g3 i10 = g3Var.i(d4Var);
        if (d4Var.v()) {
            a0.b k10 = g3.k();
            long C0 = t8.r0.C0(this.f26029v0);
            g3 b10 = i10.c(k10, C0, C0, C0, 0L, v7.f1.f28311d, this.f25988b, com.google.common.collect.w.v()).b(k10);
            b10.f26110p = b10.f26112r;
            return b10;
        }
        Object obj = i10.f26096b.f28543a;
        boolean z10 = !obj.equals(((Pair) t8.r0.j(pair)).first);
        a0.b bVar = z10 ? new a0.b(pair.first) : i10.f26096b;
        long longValue = ((Long) pair.second).longValue();
        long C02 = t8.r0.C0(B());
        if (!d4Var2.v()) {
            C02 -= d4Var2.m(obj, this.f26012n).r();
        }
        if (z10 || longValue < C02) {
            t8.a.g(!bVar.b());
            g3 b11 = i10.c(bVar, longValue, longValue, longValue, 0L, z10 ? v7.f1.f28311d : i10.f26102h, z10 ? this.f25988b : i10.f26103i, z10 ? com.google.common.collect.w.v() : i10.f26104j).b(bVar);
            b11.f26110p = longValue;
            return b11;
        }
        if (longValue == C02) {
            int g10 = d4Var.g(i10.f26105k.f28543a);
            if (g10 == -1 || d4Var.k(g10, this.f26012n).f26057c != d4Var.m(bVar.f28543a, this.f26012n).f26057c) {
                d4Var.m(bVar.f28543a, this.f26012n);
                j10 = bVar.b() ? this.f26012n.f(bVar.f28544b, bVar.f28545c) : this.f26012n.f26058d;
                i10 = i10.c(bVar, i10.f26112r, i10.f26112r, i10.f26098d, j10 - i10.f26112r, i10.f26102h, i10.f26103i, i10.f26104j).b(bVar);
            }
            return i10;
        }
        t8.a.g(!bVar.b());
        long max = Math.max(0L, i10.f26111q - (longValue - C02));
        j10 = i10.f26110p;
        if (i10.f26105k.equals(i10.f26096b)) {
            j10 = longValue + max;
        }
        i10 = i10.c(bVar, longValue, longValue, longValue, max, i10.f26102h, i10.f26103i, i10.f26104j);
        i10.f26110p = j10;
        return i10;
    }

    private Pair<Object, Long> Q1(d4 d4Var, int i10, long j10) {
        if (d4Var.v()) {
            this.f26025t0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f26029v0 = j10;
            this.f26027u0 = 0;
            return null;
        }
        if (i10 == -1 || i10 >= d4Var.u()) {
            i10 = d4Var.f(this.G);
            j10 = d4Var.s(i10, this.f26272a).e();
        }
        return d4Var.o(this.f26272a, this.f26012n, i10, t8.r0.C0(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R1(final int i10, final int i11) {
        if (i10 == this.f25991c0.b() && i11 == this.f25991c0.a()) {
            return;
        }
        this.f25991c0 = new t8.h0(i10, i11);
        this.f26008l.l(24, new r.a() { // from class: t6.f0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((j3.d) obj).onSurfaceSizeChanged(i10, i11);
            }
        });
    }

    private long S1(d4 d4Var, a0.b bVar, long j10) {
        d4Var.m(bVar.f28543a, this.f26012n);
        return j10 + this.f26012n.r();
    }

    private g3 T1(int i10, int i11) {
        int G = G();
        d4 r10 = r();
        int size = this.f26014o.size();
        this.H++;
        U1(i10, i11);
        d4 a12 = a1();
        g3 P1 = P1(this.f26023s0, a12, j1(r10, a12));
        int i12 = P1.f26099e;
        if (i12 != 1 && i12 != 4 && i10 < i11 && i11 == size && G >= P1.f26095a.u()) {
            P1 = P1.g(4);
        }
        this.f26006k.n0(i10, i11, this.M);
        return P1;
    }

    private void U1(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f26014o.remove(i12);
        }
        this.M = this.M.a(i10, i11);
    }

    private void V1() {
        if (this.X != null) {
            c1(this.f26032y).n(ModuleDescriptor.MODULE_VERSION).m(null).l();
            this.X.h(this.f26031x);
            this.X = null;
        }
        TextureView textureView = this.Z;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f26031x) {
                t8.s.i("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.Z.setSurfaceTextureListener(null);
            }
            this.Z = null;
        }
        SurfaceHolder surfaceHolder = this.W;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f26031x);
            this.W = null;
        }
    }

    private List<a3.c> W0(int i10, List<v7.a0> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            a3.c cVar = new a3.c(list.get(i11), this.f26016p);
            arrayList.add(cVar);
            this.f26014o.add(i11 + i10, new e(cVar.f25851b, cVar.f25850a.Z()));
        }
        this.M = this.M.g(i10, arrayList.size());
        return arrayList;
    }

    private void W1(int i10, int i11, Object obj) {
        for (q3 q3Var : this.f25998g) {
            if (q3Var.g() == i10) {
                c1(q3Var).n(i11).m(obj).l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X1() {
        W1(1, 2, Float.valueOf(this.f26001h0 * this.A.g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h2 Y0() {
        d4 r10 = r();
        if (r10.v()) {
            return this.f26021r0;
        }
        return this.f26021r0.c().J(r10.s(G(), this.f26272a).f26068c.f25883e).H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static v Z0(y3 y3Var) {
        return new v(0, y3Var.d(), y3Var.c());
    }

    private d4 a1() {
        return new n3(this.f26014o, this.M);
    }

    private void a2(List<v7.a0> list, int i10, long j10, boolean z10) {
        int i11;
        long j11;
        int i12 = i1();
        long e10 = e();
        this.H++;
        if (!this.f26014o.isEmpty()) {
            U1(0, this.f26014o.size());
        }
        List<a3.c> W0 = W0(0, list);
        d4 a12 = a1();
        if (!a12.v() && i10 >= a12.u()) {
            throw new y1(a12, i10, j10);
        }
        if (z10) {
            j11 = -9223372036854775807L;
            i11 = a12.f(this.G);
        } else if (i10 == -1) {
            i11 = i12;
            j11 = e10;
        } else {
            i11 = i10;
            j11 = j10;
        }
        g3 P1 = P1(this.f26023s0, a12, Q1(a12, i11, j11));
        int i13 = P1.f26099e;
        if (i11 != -1 && i13 != 1) {
            i13 = (a12.v() || i11 >= a12.u()) ? 4 : 2;
        }
        g3 g10 = P1.g(i13);
        this.f26006k.N0(W0, i11, t8.r0.C0(j11), this.M);
        h2(g10, 0, 1, false, (this.f26023s0.f26096b.f28543a.equals(g10.f26096b.f28543a) || this.f26023s0.f26095a.v()) ? false : true, 4, h1(g10), -1, false);
    }

    private List<v7.a0> b1(List<c2> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f26018q.a(list.get(i10)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b2(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        c2(surface);
        this.V = surface;
    }

    private m3 c1(m3.b bVar) {
        int i12 = i1();
        q1 q1Var = this.f26006k;
        d4 d4Var = this.f26023s0.f26095a;
        if (i12 == -1) {
            i12 = 0;
        }
        return new m3(q1Var, bVar, d4Var, i12, this.f26030w, q1Var.B());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c2(Object obj) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        q3[] q3VarArr = this.f25998g;
        int length = q3VarArr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= length) {
                break;
            }
            q3 q3Var = q3VarArr[i10];
            if (q3Var.g() == 2) {
                arrayList.add(c1(q3Var).n(1).m(obj).l());
            }
            i10++;
        }
        Object obj2 = this.U;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((m3) it.next()).a(this.E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj3 = this.U;
            Surface surface = this.V;
            if (obj3 == surface) {
                surface.release();
                this.V = null;
            }
        }
        this.U = obj;
        if (z10) {
            e2(false, x.j(new s1(3), 1003));
        }
    }

    private Pair<Boolean, Integer> d1(g3 g3Var, g3 g3Var2, boolean z10, int i10, boolean z11, boolean z12) {
        d4 d4Var = g3Var2.f26095a;
        d4 d4Var2 = g3Var.f26095a;
        if (d4Var2.v() && d4Var.v()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (d4Var2.v() != d4Var.v()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (d4Var.s(d4Var.m(g3Var2.f26096b.f28543a, this.f26012n).f26057c, this.f26272a).f26066a.equals(d4Var2.s(d4Var2.m(g3Var.f26096b.f28543a, this.f26012n).f26057c, this.f26272a).f26066a)) {
            return (z10 && i10 == 0 && g3Var2.f26096b.f28546d < g3Var.f26096b.f28546d) ? new Pair<>(Boolean.TRUE, 0) : (z10 && i10 == 1 && z12) ? new Pair<>(Boolean.TRUE, 2) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z10 && i10 == 0) {
            i11 = 1;
        } else if (z10 && i10 == 1) {
            i11 = 2;
        } else if (!z11) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i11));
    }

    private void e2(boolean z10, x xVar) {
        g3 b10;
        if (z10) {
            b10 = T1(0, this.f26014o.size()).e(null);
        } else {
            g3 g3Var = this.f26023s0;
            b10 = g3Var.b(g3Var.f26096b);
            b10.f26110p = b10.f26112r;
            b10.f26111q = 0L;
        }
        g3 g10 = b10.g(1);
        if (xVar != null) {
            g10 = g10.e(xVar);
        }
        g3 g3Var2 = g10;
        this.H++;
        this.f26006k.g1();
        h2(g3Var2, 0, 1, false, g3Var2.f26095a.v() && !this.f26023s0.f26095a.v(), 4, h1(g3Var2), -1, false);
    }

    private void f2() {
        j3.b bVar = this.O;
        j3.b H = t8.r0.H(this.f25996f, this.f25990c);
        this.O = H;
        if (H.equals(bVar)) {
            return;
        }
        this.f26008l.i(13, new r.a() { // from class: t6.u0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                d1.this.A1((j3.d) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g2(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        g3 g3Var = this.f26023s0;
        if (g3Var.f26106l == z11 && g3Var.f26107m == i12) {
            return;
        }
        this.H++;
        g3 d10 = g3Var.d(z11, i12);
        this.f26006k.Q0(z11, i12);
        h2(d10, 0, i11, false, false, 5, -9223372036854775807L, -1, false);
    }

    private long h1(g3 g3Var) {
        return g3Var.f26095a.v() ? t8.r0.C0(this.f26029v0) : g3Var.f26096b.b() ? g3Var.f26112r : S1(g3Var.f26095a, g3Var.f26096b, g3Var.f26112r);
    }

    private void h2(final g3 g3Var, final int i10, final int i11, boolean z10, boolean z11, final int i12, long j10, int i13, boolean z12) {
        g3 g3Var2 = this.f26023s0;
        this.f26023s0 = g3Var;
        boolean z13 = !g3Var2.f26095a.equals(g3Var.f26095a);
        Pair<Boolean, Integer> d12 = d1(g3Var, g3Var2, z11, i12, z13, z12);
        boolean booleanValue = ((Boolean) d12.first).booleanValue();
        final int intValue = ((Integer) d12.second).intValue();
        h2 h2Var = this.P;
        if (booleanValue) {
            r3 = g3Var.f26095a.v() ? null : g3Var.f26095a.s(g3Var.f26095a.m(g3Var.f26096b.f28543a, this.f26012n).f26057c, this.f26272a).f26068c;
            this.f26021r0 = h2.T;
        }
        if (booleanValue || !g3Var2.f26104j.equals(g3Var.f26104j)) {
            this.f26021r0 = this.f26021r0.c().K(g3Var.f26104j).H();
            h2Var = Y0();
        }
        boolean z14 = !h2Var.equals(this.P);
        this.P = h2Var;
        boolean z15 = g3Var2.f26106l != g3Var.f26106l;
        boolean z16 = g3Var2.f26099e != g3Var.f26099e;
        if (z16 || z15) {
            j2();
        }
        boolean z17 = g3Var2.f26101g;
        boolean z18 = g3Var.f26101g;
        boolean z19 = z17 != z18;
        if (z19) {
            i2(z18);
        }
        if (z13) {
            this.f26008l.i(0, new r.a() { // from class: t6.a1
                @Override // t8.r.a
                public final void invoke(Object obj) {
                    d1.B1(g3.this, i10, (j3.d) obj);
                }
            });
        }
        if (z11) {
            final j3.e n12 = n1(i12, g3Var2, i13);
            final j3.e m12 = m1(j10);
            this.f26008l.i(11, new r.a() { // from class: t6.j0
                @Override // t8.r.a
                public final void invoke(Object obj) {
                    d1.C1(i12, n12, m12, (j3.d) obj);
                }
            });
        }
        if (booleanValue) {
            this.f26008l.i(1, new r.a() { // from class: t6.k0
                @Override // t8.r.a
                public final void invoke(Object obj) {
                    ((j3.d) obj).onMediaItemTransition(c2.this, intValue);
                }
            });
        }
        if (g3Var2.f26100f != g3Var.f26100f) {
            this.f26008l.i(10, new r.a() { // from class: t6.l0
                @Override // t8.r.a
                public final void invoke(Object obj) {
                    d1.E1(g3.this, (j3.d) obj);
                }
            });
            if (g3Var.f26100f != null) {
                this.f26008l.i(10, new r.a() { // from class: t6.m0
                    @Override // t8.r.a
                    public final void invoke(Object obj) {
                        d1.F1(g3.this, (j3.d) obj);
                    }
                });
            }
        }
        q8.b0 b0Var = g3Var2.f26103i;
        q8.b0 b0Var2 = g3Var.f26103i;
        if (b0Var != b0Var2) {
            this.f26000h.e(b0Var2.f23630e);
            this.f26008l.i(2, new r.a() { // from class: t6.n0
                @Override // t8.r.a
                public final void invoke(Object obj) {
                    d1.G1(g3.this, (j3.d) obj);
                }
            });
        }
        if (z14) {
            final h2 h2Var2 = this.P;
            this.f26008l.i(14, new r.a() { // from class: t6.o0
                @Override // t8.r.a
                public final void invoke(Object obj) {
                    ((j3.d) obj).onMediaMetadataChanged(h2.this);
                }
            });
        }
        if (z19) {
            this.f26008l.i(3, new r.a() { // from class: t6.p0
                @Override // t8.r.a
                public final void invoke(Object obj) {
                    d1.I1(g3.this, (j3.d) obj);
                }
            });
        }
        if (z16 || z15) {
            this.f26008l.i(-1, new r.a() { // from class: t6.r0
                @Override // t8.r.a
                public final void invoke(Object obj) {
                    d1.J1(g3.this, (j3.d) obj);
                }
            });
        }
        if (z16) {
            this.f26008l.i(4, new r.a() { // from class: t6.s0
                @Override // t8.r.a
                public final void invoke(Object obj) {
                    d1.K1(g3.this, (j3.d) obj);
                }
            });
        }
        if (z15) {
            this.f26008l.i(5, new r.a() { // from class: t6.b1
                @Override // t8.r.a
                public final void invoke(Object obj) {
                    d1.L1(g3.this, i11, (j3.d) obj);
                }
            });
        }
        if (g3Var2.f26107m != g3Var.f26107m) {
            this.f26008l.i(6, new r.a() { // from class: t6.c1
                @Override // t8.r.a
                public final void invoke(Object obj) {
                    d1.M1(g3.this, (j3.d) obj);
                }
            });
        }
        if (r1(g3Var2) != r1(g3Var)) {
            this.f26008l.i(7, new r.a() { // from class: t6.g0
                @Override // t8.r.a
                public final void invoke(Object obj) {
                    d1.N1(g3.this, (j3.d) obj);
                }
            });
        }
        if (!g3Var2.f26108n.equals(g3Var.f26108n)) {
            this.f26008l.i(12, new r.a() { // from class: t6.h0
                @Override // t8.r.a
                public final void invoke(Object obj) {
                    d1.O1(g3.this, (j3.d) obj);
                }
            });
        }
        if (z10) {
            this.f26008l.i(-1, new r.a() { // from class: t6.i0
                @Override // t8.r.a
                public final void invoke(Object obj) {
                    ((j3.d) obj).onSeekProcessed();
                }
            });
        }
        f2();
        this.f26008l.f();
        if (g3Var2.f26109o != g3Var.f26109o) {
            Iterator<y.a> it = this.f26010m.iterator();
            while (it.hasNext()) {
                it.next().A(g3Var.f26109o);
            }
        }
    }

    private int i1() {
        if (this.f26023s0.f26095a.v()) {
            return this.f26025t0;
        }
        g3 g3Var = this.f26023s0;
        return g3Var.f26095a.m(g3Var.f26096b.f28543a, this.f26012n).f26057c;
    }

    private void i2(boolean z10) {
        t8.g0 g0Var = this.f26011m0;
        if (g0Var != null) {
            if (z10 && !this.f26013n0) {
                g0Var.a(0);
                this.f26013n0 = true;
            } else {
                if (z10 || !this.f26013n0) {
                    return;
                }
                g0Var.b(0);
                this.f26013n0 = false;
            }
        }
    }

    private Pair<Object, Long> j1(d4 d4Var, d4 d4Var2) {
        long B = B();
        if (d4Var.v() || d4Var2.v()) {
            boolean z10 = !d4Var.v() && d4Var2.v();
            int i12 = z10 ? -1 : i1();
            if (z10) {
                B = -9223372036854775807L;
            }
            return Q1(d4Var2, i12, B);
        }
        Pair<Object, Long> o10 = d4Var.o(this.f26272a, this.f26012n, G(), t8.r0.C0(B));
        Object obj = ((Pair) t8.r0.j(o10)).first;
        if (d4Var2.g(obj) != -1) {
            return o10;
        }
        Object y02 = q1.y0(this.f26272a, this.f26012n, this.F, this.G, obj, d4Var, d4Var2);
        if (y02 == null) {
            return Q1(d4Var2, -1, -9223372036854775807L);
        }
        d4Var2.m(y02, this.f26012n);
        int i10 = this.f26012n.f26057c;
        return Q1(d4Var2, i10, d4Var2.s(i10, this.f26272a).e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j2() {
        int F = F();
        if (F != 1) {
            if (F == 2 || F == 3) {
                this.C.b(u() && !e1());
                this.D.b(u());
                return;
            } else if (F != 4) {
                throw new IllegalStateException();
            }
        }
        this.C.b(false);
        this.D.b(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k1(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    private void k2() {
        this.f25992d.b();
        if (Thread.currentThread() != f1().getThread()) {
            String C = t8.r0.C("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), f1().getThread().getName());
            if (this.f26007k0) {
                throw new IllegalStateException(C);
            }
            t8.s.j("ExoPlayerImpl", C, this.f26009l0 ? null : new IllegalStateException());
            this.f26009l0 = true;
        }
    }

    private j3.e m1(long j10) {
        c2 c2Var;
        Object obj;
        int i10;
        Object obj2;
        int G = G();
        if (this.f26023s0.f26095a.v()) {
            c2Var = null;
            obj = null;
            i10 = -1;
            obj2 = null;
        } else {
            g3 g3Var = this.f26023s0;
            Object obj3 = g3Var.f26096b.f28543a;
            g3Var.f26095a.m(obj3, this.f26012n);
            i10 = this.f26023s0.f26095a.g(obj3);
            obj = obj3;
            obj2 = this.f26023s0.f26095a.s(G, this.f26272a).f26066a;
            c2Var = this.f26272a.f26068c;
        }
        long a12 = t8.r0.a1(j10);
        long a13 = this.f26023s0.f26096b.b() ? t8.r0.a1(o1(this.f26023s0)) : a12;
        a0.b bVar = this.f26023s0.f26096b;
        return new j3.e(obj2, G, c2Var, obj, i10, a12, a13, bVar.f28544b, bVar.f28545c);
    }

    private j3.e n1(int i10, g3 g3Var, int i11) {
        int i12;
        Object obj;
        c2 c2Var;
        Object obj2;
        int i13;
        long j10;
        long j11;
        d4.b bVar = new d4.b();
        if (g3Var.f26095a.v()) {
            i12 = i11;
            obj = null;
            c2Var = null;
            obj2 = null;
            i13 = -1;
        } else {
            Object obj3 = g3Var.f26096b.f28543a;
            g3Var.f26095a.m(obj3, bVar);
            int i14 = bVar.f26057c;
            int g10 = g3Var.f26095a.g(obj3);
            Object obj4 = g3Var.f26095a.s(i14, this.f26272a).f26066a;
            c2Var = this.f26272a.f26068c;
            obj2 = obj3;
            i13 = g10;
            obj = obj4;
            i12 = i14;
        }
        boolean b10 = g3Var.f26096b.b();
        if (i10 == 0) {
            if (b10) {
                a0.b bVar2 = g3Var.f26096b;
                j10 = bVar.f(bVar2.f28544b, bVar2.f28545c);
                j11 = o1(g3Var);
            } else {
                j10 = g3Var.f26096b.f28547e != -1 ? o1(this.f26023s0) : bVar.f26059e + bVar.f26058d;
                j11 = j10;
            }
        } else if (b10) {
            j10 = g3Var.f26112r;
            j11 = o1(g3Var);
        } else {
            j10 = bVar.f26059e + g3Var.f26112r;
            j11 = j10;
        }
        long a12 = t8.r0.a1(j10);
        long a13 = t8.r0.a1(j11);
        a0.b bVar3 = g3Var.f26096b;
        return new j3.e(obj, i12, c2Var, obj2, i13, a12, a13, bVar3.f28544b, bVar3.f28545c);
    }

    private static long o1(g3 g3Var) {
        d4.d dVar = new d4.d();
        d4.b bVar = new d4.b();
        g3Var.f26095a.m(g3Var.f26096b.f28543a, bVar);
        return g3Var.f26097c == -9223372036854775807L ? g3Var.f26095a.s(bVar.f26057c, dVar).f() : bVar.r() + g3Var.f26097c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p1, reason: merged with bridge method [inline-methods] */
    public void u1(q1.e eVar) {
        long j10;
        boolean z10;
        long j11;
        int i10 = this.H - eVar.f26415c;
        this.H = i10;
        boolean z11 = true;
        if (eVar.f26416d) {
            this.I = eVar.f26417e;
            this.J = true;
        }
        if (eVar.f26418f) {
            this.K = eVar.f26419g;
        }
        if (i10 == 0) {
            d4 d4Var = eVar.f26414b.f26095a;
            if (!this.f26023s0.f26095a.v() && d4Var.v()) {
                this.f26025t0 = -1;
                this.f26029v0 = 0L;
                this.f26027u0 = 0;
            }
            if (!d4Var.v()) {
                List<d4> J = ((n3) d4Var).J();
                t8.a.g(J.size() == this.f26014o.size());
                for (int i11 = 0; i11 < J.size(); i11++) {
                    this.f26014o.get(i11).f26040b = J.get(i11);
                }
            }
            if (this.J) {
                if (eVar.f26414b.f26096b.equals(this.f26023s0.f26096b) && eVar.f26414b.f26098d == this.f26023s0.f26112r) {
                    z11 = false;
                }
                if (z11) {
                    if (d4Var.v() || eVar.f26414b.f26096b.b()) {
                        j11 = eVar.f26414b.f26098d;
                    } else {
                        g3 g3Var = eVar.f26414b;
                        j11 = S1(d4Var, g3Var.f26096b, g3Var.f26098d);
                    }
                    j10 = j11;
                } else {
                    j10 = -9223372036854775807L;
                }
                z10 = z11;
            } else {
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.J = false;
            h2(eVar.f26414b, 1, this.K, false, z10, this.I, j10, -1, false);
        }
    }

    private int q1(int i10) {
        AudioTrack audioTrack = this.T;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i10) {
            this.T.release();
            this.T = null;
        }
        if (this.T == null) {
            this.T = new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
        }
        return this.T.getAudioSessionId();
    }

    private static boolean r1(g3 g3Var) {
        return g3Var.f26099e == 3 && g3Var.f26106l && g3Var.f26107m == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t1(j3.d dVar, t8.l lVar) {
        dVar.onEvents(this.f25996f, new j3.c(lVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v1(final q1.e eVar) {
        this.f26002i.h(new Runnable() { // from class: t6.t0
            @Override // java.lang.Runnable
            public final void run() {
                d1.this.u1(eVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w1(j3.d dVar) {
        dVar.onPlayerError(x.j(new s1(1), 1003));
    }

    @Override // t6.j3
    public long B() {
        k2();
        if (!g()) {
            return e();
        }
        g3 g3Var = this.f26023s0;
        g3Var.f26095a.m(g3Var.f26096b.f28543a, this.f26012n);
        g3 g3Var2 = this.f26023s0;
        return g3Var2.f26097c == -9223372036854775807L ? g3Var2.f26095a.s(G(), this.f26272a).e() : this.f26012n.q() + t8.r0.a1(this.f26023s0.f26097c);
    }

    @Override // t6.j3
    public void C(int i10, List<c2> list) {
        k2();
        X0(i10, b1(list));
    }

    @Override // t6.j3
    public long D() {
        k2();
        if (!g()) {
            return g1();
        }
        g3 g3Var = this.f26023s0;
        return g3Var.f26105k.equals(g3Var.f26096b) ? t8.r0.a1(this.f26023s0.f26110p) : getDuration();
    }

    @Override // t6.j3
    public int F() {
        k2();
        return this.f26023s0.f26099e;
    }

    @Override // t6.j3
    public int G() {
        k2();
        int i12 = i1();
        if (i12 == -1) {
            return 0;
        }
        return i12;
    }

    @Override // t6.j3
    public void H(final int i10) {
        k2();
        if (this.F != i10) {
            this.F = i10;
            this.f26006k.U0(i10);
            this.f26008l.i(8, new r.a() { // from class: t6.z0
                @Override // t8.r.a
                public final void invoke(Object obj) {
                    ((j3.d) obj).onRepeatModeChanged(i10);
                }
            });
            f2();
            this.f26008l.f();
        }
    }

    @Override // t6.y
    public void I(v7.a0 a0Var) {
        k2();
        Y1(Collections.singletonList(a0Var));
    }

    @Override // t6.j3
    public int J() {
        k2();
        return this.F;
    }

    @Override // t6.j3
    public boolean K() {
        k2();
        return this.G;
    }

    @Override // t6.y
    public void L(final v6.e eVar, boolean z10) {
        k2();
        if (this.f26015o0) {
            return;
        }
        if (!t8.r0.c(this.f25999g0, eVar)) {
            this.f25999g0 = eVar;
            W1(1, 3, eVar);
            this.B.h(t8.r0.g0(eVar.f27973c));
            this.f26008l.i(20, new r.a() { // from class: t6.w0
                @Override // t8.r.a
                public final void invoke(Object obj) {
                    ((j3.d) obj).onAudioAttributesChanged(v6.e.this);
                }
            });
        }
        this.A.m(z10 ? eVar : null);
        this.f26000h.h(eVar);
        boolean u10 = u();
        int p10 = this.A.p(u10, F());
        g2(u10, p10, k1(u10, p10));
        this.f26008l.f();
    }

    @Override // t6.k
    public void S(int i10, long j10, int i11, boolean z10) {
        k2();
        t8.a.a(i10 >= 0);
        this.f26020r.t();
        d4 d4Var = this.f26023s0.f26095a;
        if (d4Var.v() || i10 < d4Var.u()) {
            this.H++;
            if (g()) {
                t8.s.i("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                q1.e eVar = new q1.e(this.f26023s0);
                eVar.b(1);
                this.f26004j.a(eVar);
                return;
            }
            int i12 = F() != 1 ? 2 : 1;
            int G = G();
            g3 P1 = P1(this.f26023s0.g(i12), d4Var, Q1(d4Var, i10, j10));
            this.f26006k.A0(d4Var, i10, t8.r0.C0(j10));
            h2(P1, 0, 1, true, true, 1, h1(P1), G, z10);
        }
    }

    public void U0(u6.b bVar) {
        this.f26020r.E((u6.b) t8.a.e(bVar));
    }

    public void V0(y.a aVar) {
        this.f26010m.add(aVar);
    }

    public void X0(int i10, List<v7.a0> list) {
        k2();
        t8.a.a(i10 >= 0);
        int min = Math.min(i10, this.f26014o.size());
        d4 r10 = r();
        this.H++;
        List<a3.c> W0 = W0(min, list);
        d4 a12 = a1();
        g3 P1 = P1(this.f26023s0, a12, j1(r10, a12));
        this.f26006k.l(min, W0, this.M);
        h2(P1, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    public void Y1(List<v7.a0> list) {
        k2();
        Z1(list, true);
    }

    public void Z1(List<v7.a0> list, boolean z10) {
        k2();
        a2(list, -1, -9223372036854775807L, z10);
    }

    @Override // t6.j3
    public void a() {
        k2();
        boolean u10 = u();
        int p10 = this.A.p(u10, 2);
        g2(u10, p10, k1(u10, p10));
        g3 g3Var = this.f26023s0;
        if (g3Var.f26099e != 1) {
            return;
        }
        g3 e10 = g3Var.e(null);
        g3 g10 = e10.g(e10.f26095a.v() ? 4 : 2);
        this.H++;
        this.f26006k.i0();
        h2(g10, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // t6.j3
    public void b(i3 i3Var) {
        k2();
        if (i3Var == null) {
            i3Var = i3.f26200d;
        }
        if (this.f26023s0.f26108n.equals(i3Var)) {
            return;
        }
        g3 f10 = this.f26023s0.f(i3Var);
        this.H++;
        this.f26006k.S0(i3Var);
        h2(f10, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // t6.j3
    public i3 c() {
        k2();
        return this.f26023s0.f26108n;
    }

    public void d2(boolean z10) {
        k2();
        this.A.p(u(), 1);
        e2(z10, null);
        this.f26005j0 = new g8.f(com.google.common.collect.w.v(), this.f26023s0.f26112r);
    }

    @Override // t6.j3
    public long e() {
        k2();
        return t8.r0.a1(h1(this.f26023s0));
    }

    public boolean e1() {
        k2();
        return this.f26023s0.f26109o;
    }

    @Override // t6.j3
    public void f(Surface surface) {
        k2();
        V1();
        c2(surface);
        int i10 = surface == null ? 0 : -1;
        R1(i10, i10);
    }

    public Looper f1() {
        return this.f26022s;
    }

    @Override // t6.j3
    public boolean g() {
        k2();
        return this.f26023s0.f26096b.b();
    }

    public long g1() {
        k2();
        if (this.f26023s0.f26095a.v()) {
            return this.f26029v0;
        }
        g3 g3Var = this.f26023s0;
        if (g3Var.f26105k.f28546d != g3Var.f26096b.f28546d) {
            return g3Var.f26095a.s(G(), this.f26272a).g();
        }
        long j10 = g3Var.f26110p;
        if (this.f26023s0.f26105k.b()) {
            g3 g3Var2 = this.f26023s0;
            d4.b m10 = g3Var2.f26095a.m(g3Var2.f26105k.f28543a, this.f26012n);
            long j11 = m10.j(this.f26023s0.f26105k.f28544b);
            j10 = j11 == Long.MIN_VALUE ? m10.f26058d : j11;
        }
        g3 g3Var3 = this.f26023s0;
        return t8.r0.a1(S1(g3Var3.f26095a, g3Var3.f26105k, j10));
    }

    @Override // t6.j3
    public long getDuration() {
        k2();
        if (!g()) {
            return O();
        }
        g3 g3Var = this.f26023s0;
        a0.b bVar = g3Var.f26096b;
        g3Var.f26095a.m(bVar.f28543a, this.f26012n);
        return t8.r0.a1(this.f26012n.f(bVar.f28544b, bVar.f28545c));
    }

    @Override // t6.j3
    public long h() {
        k2();
        return t8.r0.a1(this.f26023s0.f26111q);
    }

    @Override // t6.j3
    public void k(boolean z10) {
        k2();
        int p10 = this.A.p(z10, F());
        g2(z10, p10, k1(z10, p10));
    }

    @Override // t6.y
    public u1 l() {
        k2();
        return this.R;
    }

    @Override // t6.j3
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public x j() {
        k2();
        return this.f26023s0.f26100f;
    }

    @Override // t6.j3
    public i4 m() {
        k2();
        return this.f26023s0.f26103i.f23629d;
    }

    @Override // t6.j3
    public int o() {
        k2();
        if (g()) {
            return this.f26023s0.f26096b.f28544b;
        }
        return -1;
    }

    @Override // t6.j3
    public int q() {
        k2();
        return this.f26023s0.f26107m;
    }

    @Override // t6.j3
    public d4 r() {
        k2();
        return this.f26023s0.f26095a;
    }

    @Override // t6.j3
    public void release() {
        AudioTrack audioTrack;
        t8.s.f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.7] [" + t8.r0.f26748e + "] [" + r1.b() + "]");
        k2();
        if (t8.r0.f26744a < 21 && (audioTrack = this.T) != null) {
            audioTrack.release();
            this.T = null;
        }
        this.f26033z.b(false);
        this.B.g();
        this.C.b(false);
        this.D.b(false);
        this.A.i();
        if (!this.f26006k.k0()) {
            this.f26008l.l(10, new r.a() { // from class: t6.x0
                @Override // t8.r.a
                public final void invoke(Object obj) {
                    d1.w1((j3.d) obj);
                }
            });
        }
        this.f26008l.j();
        this.f26002i.e(null);
        this.f26024t.e(this.f26020r);
        g3 g10 = this.f26023s0.g(1);
        this.f26023s0 = g10;
        g3 b10 = g10.b(g10.f26096b);
        this.f26023s0 = b10;
        b10.f26110p = b10.f26112r;
        this.f26023s0.f26111q = 0L;
        this.f26020r.release();
        this.f26000h.f();
        V1();
        Surface surface = this.V;
        if (surface != null) {
            surface.release();
            this.V = null;
        }
        if (this.f26013n0) {
            ((t8.g0) t8.a.e(this.f26011m0)).b(0);
            this.f26013n0 = false;
        }
        this.f26005j0 = g8.f.f16074c;
        this.f26015o0 = true;
    }

    @Override // t6.j3
    public void s(j3.d dVar) {
        this.f26008l.c((j3.d) t8.a.e(dVar));
    }

    @Override // t6.j3
    public void setVolume(float f10) {
        k2();
        final float p10 = t8.r0.p(f10, 0.0f, 1.0f);
        if (this.f26001h0 == p10) {
            return;
        }
        this.f26001h0 = p10;
        X1();
        this.f26008l.l(22, new r.a() { // from class: t6.y0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((j3.d) obj).onVolumeChanged(p10);
            }
        });
    }

    @Override // t6.j3
    public void stop() {
        k2();
        d2(false);
    }

    @Override // t6.j3
    public void t(j3.d dVar) {
        k2();
        this.f26008l.k((j3.d) t8.a.e(dVar));
    }

    @Override // t6.j3
    public boolean u() {
        k2();
        return this.f26023s0.f26106l;
    }

    @Override // t6.j3
    public int w() {
        k2();
        if (this.f26023s0.f26095a.v()) {
            return this.f26027u0;
        }
        g3 g3Var = this.f26023s0;
        return g3Var.f26095a.g(g3Var.f26096b.f28543a);
    }

    @Override // t6.j3
    public int y() {
        k2();
        if (g()) {
            return this.f26023s0.f26096b.f28545c;
        }
        return -1;
    }
}

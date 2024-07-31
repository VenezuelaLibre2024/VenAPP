package p361t6;

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
import com.google.common.collect.AbstractC5907w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import p120g8.C7484b;
import p120g8.C7488f;
import p120g8.InterfaceC7498p;
import p216l7.C9400a;
import p216l7.InterfaceC9404e;
import p307q8.AbstractC10294a0;
import p307q8.C10296b0;
import p307q8.InterfaceC10312r;
import p351s8.InterfaceC10817e;
import p361t6.AbstractC11018d4;
import p361t6.C10999a3;
import p361t6.C11001b;
import p361t6.C11015d1;
import p361t6.C11049j;
import p361t6.C11070m3;
import p361t6.C11088q1;
import p361t6.C11130y3;
import p361t6.InterfaceC11053j3;
import p361t6.InterfaceC11126y;
import p363t8.C11137a;
import p363t8.C11149g;
import p363t8.C11150g0;
import p363t8.C11152h0;
import p363t8.C11159l;
import p363t8.C11171r;
import p363t8.C11172r0;
import p363t8.C11173s;
import p363t8.InterfaceC11143d;
import p363t8.InterfaceC11165o;
import p376u6.C11381k3;
import p376u6.C11391m3;
import p376u6.InterfaceC11327a;
import p376u6.InterfaceC11332b;
import p378u8.C11448a0;
import p378u8.InterfaceC11458k;
import p378u8.InterfaceC11472y;
import p396v6.C11639e;
import p396v6.InterfaceC11671u;
import p397v7.C11700f1;
import p397v7.InterfaceC11684a0;
import p397v7.InterfaceC11738x0;
import p398v8.C11754l;
import p398v8.InterfaceC11743a;
import p414w6.C12080e;
import p414w6.C12084i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: t6.d1 */
/* loaded from: classes.dex */
public final class C11015d1 extends AbstractC11055k implements InterfaceC11126y {

    /* renamed from: A */
    private final C11049j f28131A;

    /* renamed from: B */
    private final C11130y3 f28132B;

    /* renamed from: C */
    private final C11054j4 f28133C;

    /* renamed from: D */
    private final C11060k4 f28134D;

    /* renamed from: E */
    private final long f28135E;

    /* renamed from: F */
    private int f28136F;

    /* renamed from: G */
    private boolean f28137G;

    /* renamed from: H */
    private int f28138H;

    /* renamed from: I */
    private int f28139I;

    /* renamed from: J */
    private boolean f28140J;

    /* renamed from: K */
    private int f28141K;

    /* renamed from: L */
    private C11110u3 f28142L;

    /* renamed from: M */
    private InterfaceC11738x0 f28143M;

    /* renamed from: N */
    private boolean f28144N;

    /* renamed from: O */
    private InterfaceC11053j3.b f28145O;

    /* renamed from: P */
    private C11040h2 f28146P;

    /* renamed from: Q */
    private C11040h2 f28147Q;

    /* renamed from: R */
    private C11108u1 f28148R;

    /* renamed from: S */
    private C11108u1 f28149S;

    /* renamed from: T */
    private AudioTrack f28150T;

    /* renamed from: U */
    private Object f28151U;

    /* renamed from: V */
    private Surface f28152V;

    /* renamed from: W */
    private SurfaceHolder f28153W;

    /* renamed from: X */
    private C11754l f28154X;

    /* renamed from: Y */
    private boolean f28155Y;

    /* renamed from: Z */
    private TextureView f28156Z;

    /* renamed from: a0 */
    private int f28157a0;

    /* renamed from: b */
    final C10296b0 f28158b;

    /* renamed from: b0 */
    private int f28159b0;

    /* renamed from: c */
    final InterfaceC11053j3.b f28160c;

    /* renamed from: c0 */
    private C11152h0 f28161c0;

    /* renamed from: d */
    private final C11149g f28162d;

    /* renamed from: d0 */
    private C12080e f28163d0;

    /* renamed from: e */
    private final Context f28164e;

    /* renamed from: e0 */
    private C12080e f28165e0;

    /* renamed from: f */
    private final InterfaceC11053j3 f28166f;

    /* renamed from: f0 */
    private int f28167f0;

    /* renamed from: g */
    private final InterfaceC11090q3[] f28168g;

    /* renamed from: g0 */
    private C11639e f28169g0;

    /* renamed from: h */
    private final AbstractC10294a0 f28170h;

    /* renamed from: h0 */
    private float f28171h0;

    /* renamed from: i */
    private final InterfaceC11165o f28172i;

    /* renamed from: i0 */
    private boolean f28173i0;

    /* renamed from: j */
    private final C11088q1.f f28174j;

    /* renamed from: j0 */
    private C7488f f28175j0;

    /* renamed from: k */
    private final C11088q1 f28176k;

    /* renamed from: k0 */
    private boolean f28177k0;

    /* renamed from: l */
    private final C11171r<InterfaceC11053j3.d> f28178l;

    /* renamed from: l0 */
    private boolean f28179l0;

    /* renamed from: m */
    private final CopyOnWriteArraySet<InterfaceC11126y.a> f28180m;

    /* renamed from: m0 */
    private C11150g0 f28181m0;

    /* renamed from: n */
    private final AbstractC11018d4.b f28182n;

    /* renamed from: n0 */
    private boolean f28183n0;

    /* renamed from: o */
    private final List<e> f28184o;

    /* renamed from: o0 */
    private boolean f28185o0;

    /* renamed from: p */
    private final boolean f28186p;

    /* renamed from: p0 */
    private C11111v f28187p0;

    /* renamed from: q */
    private final InterfaceC11684a0.a f28188q;

    /* renamed from: q0 */
    private C11448a0 f28189q0;

    /* renamed from: r */
    private final InterfaceC11327a f28190r;

    /* renamed from: r0 */
    private C11040h2 f28191r0;

    /* renamed from: s */
    private final Looper f28192s;

    /* renamed from: s0 */
    private C11035g3 f28193s0;

    /* renamed from: t */
    private final InterfaceC10817e f28194t;

    /* renamed from: t0 */
    private int f28195t0;

    /* renamed from: u */
    private final long f28196u;

    /* renamed from: u0 */
    private int f28197u0;

    /* renamed from: v */
    private final long f28198v;

    /* renamed from: v0 */
    private long f28199v0;

    /* renamed from: w */
    private final InterfaceC11143d f28200w;

    /* renamed from: x */
    private final c f28201x;

    /* renamed from: y */
    private final d f28202y;

    /* renamed from: z */
    private final C11001b f28203z;

    /* renamed from: t6.d1$b */
    /* loaded from: classes.dex */
    private static final class b {
        /* renamed from: a */
        public static C11391m3 m33947a(Context context, C11015d1 c11015d1, boolean z10) {
            LogSessionId logSessionId;
            C11381k3 m35536A0 = C11381k3.m35536A0(context);
            if (m35536A0 == null) {
                C11173s.m34970i("ExoPlayerImpl", "MediaMetricsService unavailable.");
                logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
                return new C11391m3(logSessionId);
            }
            if (z10) {
                c11015d1.m33918U0(m35536A0);
            }
            return new C11391m3(m35536A0.m35560H0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t6.d1$c */
    /* loaded from: classes.dex */
    public final class c implements InterfaceC11472y, InterfaceC11671u, InterfaceC7498p, InterfaceC9404e, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, C11754l.b, C11049j.b, C11001b.b, C11130y3.b, InterfaceC11126y.a {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: N */
        public /* synthetic */ void m33958N(InterfaceC11053j3.d dVar) {
            dVar.onMediaMetadataChanged(C11015d1.this.f28146P);
        }

        @Override // p361t6.InterfaceC11126y.a
        /* renamed from: A */
        public void mo33964A(boolean z10) {
            C11015d1.this.m33874j2();
        }

        @Override // p361t6.C11049j.b
        /* renamed from: B */
        public void mo33965B(float f10) {
            C11015d1.this.m33844X1();
        }

        @Override // p361t6.C11049j.b
        /* renamed from: C */
        public void mo33966C(int i10) {
            boolean mo33944u = C11015d1.this.mo33944u();
            C11015d1.this.m33865g2(mo33944u, i10, C11015d1.m33876k1(mo33944u, i10));
        }

        @Override // p396v6.InterfaceC11671u
        /* renamed from: a */
        public void mo33967a(Exception exc) {
            C11015d1.this.f28190r.mo35418a(exc);
        }

        @Override // p378u8.InterfaceC11472y
        /* renamed from: b */
        public void mo33968b(String str) {
            C11015d1.this.f28190r.mo35419b(str);
        }

        @Override // p378u8.InterfaceC11472y
        /* renamed from: c */
        public void mo33969c(C12080e c12080e) {
            C11015d1.this.f28190r.mo35420c(c12080e);
            C11015d1.this.f28148R = null;
            C11015d1.this.f28163d0 = null;
        }

        @Override // p378u8.InterfaceC11472y
        /* renamed from: d */
        public void mo33970d(String str, long j10, long j11) {
            C11015d1.this.f28190r.mo35421d(str, j10, j11);
        }

        @Override // p378u8.InterfaceC11472y
        /* renamed from: e */
        public void mo33971e(C12080e c12080e) {
            C11015d1.this.f28163d0 = c12080e;
            C11015d1.this.f28190r.mo35422e(c12080e);
        }

        @Override // p396v6.InterfaceC11671u
        /* renamed from: f */
        public void mo33972f(C11108u1 c11108u1, C12084i c12084i) {
            C11015d1.this.f28149S = c11108u1;
            C11015d1.this.f28190r.mo35423f(c11108u1, c12084i);
        }

        @Override // p378u8.InterfaceC11472y
        /* renamed from: g */
        public void mo33973g(C11108u1 c11108u1, C12084i c12084i) {
            C11015d1.this.f28148R = c11108u1;
            C11015d1.this.f28190r.mo35424g(c11108u1, c12084i);
        }

        @Override // p396v6.InterfaceC11671u
        /* renamed from: h */
        public void mo33974h(C12080e c12080e) {
            C11015d1.this.f28190r.mo35425h(c12080e);
            C11015d1.this.f28149S = null;
            C11015d1.this.f28165e0 = null;
        }

        @Override // p396v6.InterfaceC11671u
        /* renamed from: i */
        public void mo33975i(String str) {
            C11015d1.this.f28190r.mo35426i(str);
        }

        @Override // p396v6.InterfaceC11671u
        /* renamed from: j */
        public void mo33976j(String str, long j10, long j11) {
            C11015d1.this.f28190r.mo35427j(str, j10, j11);
        }

        @Override // p396v6.InterfaceC11671u
        /* renamed from: k */
        public void mo33977k(long j10) {
            C11015d1.this.f28190r.mo35428k(j10);
        }

        @Override // p378u8.InterfaceC11472y
        /* renamed from: l */
        public void mo33978l(Exception exc) {
            C11015d1.this.f28190r.mo35429l(exc);
        }

        @Override // p396v6.InterfaceC11671u
        /* renamed from: m */
        public void mo33979m(C12080e c12080e) {
            C11015d1.this.f28165e0 = c12080e;
            C11015d1.this.f28190r.mo35430m(c12080e);
        }

        @Override // p378u8.InterfaceC11472y
        /* renamed from: n */
        public void mo33980n(int i10, long j10) {
            C11015d1.this.f28190r.mo35431n(i10, j10);
        }

        @Override // p378u8.InterfaceC11472y
        /* renamed from: o */
        public void mo33981o(Object obj, long j10) {
            C11015d1.this.f28190r.mo35432o(obj, j10);
            if (C11015d1.this.f28151U == obj) {
                C11015d1.this.f28178l.m34852l(26, new C11171r.a() { // from class: t6.l1
                    @Override // p363t8.C11171r.a
                    public final void invoke(Object obj2) {
                        ((InterfaceC11053j3.d) obj2).onRenderedFirstFrame();
                    }
                });
            }
        }

        @Override // p120g8.InterfaceC7498p
        public void onCues(final C7488f c7488f) {
            C11015d1.this.f28175j0 = c7488f;
            C11015d1.this.f28178l.m34852l(27, new C11171r.a() { // from class: t6.k1
                @Override // p363t8.C11171r.a
                public final void invoke(Object obj) {
                    ((InterfaceC11053j3.d) obj).onCues(C7488f.this);
                }
            });
        }

        @Override // p120g8.InterfaceC7498p
        public void onCues(final List<C7484b> list) {
            C11015d1.this.f28178l.m34852l(27, new C11171r.a() { // from class: t6.h1
                @Override // p363t8.C11171r.a
                public final void invoke(Object obj) {
                    ((InterfaceC11053j3.d) obj).onCues((List<C7484b>) list);
                }
            });
        }

        @Override // p216l7.InterfaceC9404e
        public void onMetadata(final C9400a c9400a) {
            C11015d1 c11015d1 = C11015d1.this;
            c11015d1.f28191r0 = c11015d1.f28191r0.m34061c().m34099L(c9400a).m34095H();
            C11040h2 m33846Y0 = C11015d1.this.m33846Y0();
            if (!m33846Y0.equals(C11015d1.this.f28146P)) {
                C11015d1.this.f28146P = m33846Y0;
                C11015d1.this.f28178l.m34849i(14, new C11171r.a() { // from class: t6.f1
                    @Override // p363t8.C11171r.a
                    public final void invoke(Object obj) {
                        C11015d1.c.this.m33958N((InterfaceC11053j3.d) obj);
                    }
                });
            }
            C11015d1.this.f28178l.m34849i(28, new C11171r.a() { // from class: t6.g1
                @Override // p363t8.C11171r.a
                public final void invoke(Object obj) {
                    ((InterfaceC11053j3.d) obj).onMetadata(C9400a.this);
                }
            });
            C11015d1.this.f28178l.m34848f();
        }

        @Override // p396v6.InterfaceC11671u
        public void onSkipSilenceEnabledChanged(final boolean z10) {
            if (C11015d1.this.f28173i0 == z10) {
                return;
            }
            C11015d1.this.f28173i0 = z10;
            C11015d1.this.f28178l.m34852l(23, new C11171r.a() { // from class: t6.n1
                @Override // p363t8.C11171r.a
                public final void invoke(Object obj) {
                    ((InterfaceC11053j3.d) obj).onSkipSilenceEnabledChanged(z10);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            C11015d1.this.m33854b2(surfaceTexture);
            C11015d1.this.m33832R1(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C11015d1.this.m33857c2(null);
            C11015d1.this.m33832R1(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            C11015d1.this.m33832R1(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // p378u8.InterfaceC11472y
        public void onVideoSizeChanged(final C11448a0 c11448a0) {
            C11015d1.this.f28189q0 = c11448a0;
            C11015d1.this.f28178l.m34852l(25, new C11171r.a() { // from class: t6.m1
                @Override // p363t8.C11171r.a
                public final void invoke(Object obj) {
                    ((InterfaceC11053j3.d) obj).onVideoSizeChanged(C11448a0.this);
                }
            });
        }

        @Override // p396v6.InterfaceC11671u
        /* renamed from: p */
        public void mo33982p(Exception exc) {
            C11015d1.this.f28190r.mo35433p(exc);
        }

        @Override // p396v6.InterfaceC11671u
        /* renamed from: q */
        public void mo33983q(int i10, long j10, long j11) {
            C11015d1.this.f28190r.mo35434q(i10, j10, j11);
        }

        @Override // p378u8.InterfaceC11472y
        /* renamed from: r */
        public void mo33984r(long j10, int i10) {
            C11015d1.this.f28190r.mo35435r(j10, i10);
        }

        @Override // p361t6.C11130y3.b
        /* renamed from: s */
        public void mo33985s(int i10) {
            final C11111v m33848Z0 = C11015d1.m33848Z0(C11015d1.this.f28132B);
            if (m33848Z0.equals(C11015d1.this.f28187p0)) {
                return;
            }
            C11015d1.this.f28187p0 = m33848Z0;
            C11015d1.this.f28178l.m34852l(29, new C11171r.a() { // from class: t6.i1
                @Override // p363t8.C11171r.a
                public final void invoke(Object obj) {
                    ((InterfaceC11053j3.d) obj).onDeviceInfoChanged(C11111v.this);
                }
            });
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            C11015d1.this.m33832R1(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (C11015d1.this.f28155Y) {
                C11015d1.this.m33857c2(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (C11015d1.this.f28155Y) {
                C11015d1.this.m33857c2(null);
            }
            C11015d1.this.m33832R1(0, 0);
        }

        @Override // p361t6.C11001b.b
        /* renamed from: u */
        public void mo33714u() {
            C11015d1.this.m33865g2(false, -1, 3);
        }

        @Override // p398v8.C11754l.b
        /* renamed from: w */
        public void mo33986w(Surface surface) {
            C11015d1.this.m33857c2(null);
        }

        @Override // p398v8.C11754l.b
        /* renamed from: x */
        public void mo33987x(Surface surface) {
            C11015d1.this.m33857c2(surface);
        }

        @Override // p361t6.C11130y3.b
        /* renamed from: y */
        public void mo33988y(final int i10, final boolean z10) {
            C11015d1.this.f28178l.m34852l(30, new C11171r.a() { // from class: t6.j1
                @Override // p363t8.C11171r.a
                public final void invoke(Object obj) {
                    ((InterfaceC11053j3.d) obj).onDeviceVolumeChanged(i10, z10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t6.d1$d */
    /* loaded from: classes.dex */
    public static final class d implements InterfaceC11458k, InterfaceC11743a, C11070m3.b {

        /* renamed from: a */
        private InterfaceC11458k f28205a;

        /* renamed from: b */
        private InterfaceC11743a f28206b;

        /* renamed from: c */
        private InterfaceC11458k f28207c;

        /* renamed from: d */
        private InterfaceC11743a f28208d;

        private d() {
        }

        @Override // p378u8.InterfaceC11458k
        /* renamed from: a */
        public void mo33989a(long j10, long j11, C11108u1 c11108u1, MediaFormat mediaFormat) {
            InterfaceC11458k interfaceC11458k = this.f28207c;
            if (interfaceC11458k != null) {
                interfaceC11458k.mo33989a(j10, j11, c11108u1, mediaFormat);
            }
            InterfaceC11458k interfaceC11458k2 = this.f28205a;
            if (interfaceC11458k2 != null) {
                interfaceC11458k2.mo33989a(j10, j11, c11108u1, mediaFormat);
            }
        }

        @Override // p398v8.InterfaceC11743a
        /* renamed from: b */
        public void mo33990b(long j10, float[] fArr) {
            InterfaceC11743a interfaceC11743a = this.f28208d;
            if (interfaceC11743a != null) {
                interfaceC11743a.mo33990b(j10, fArr);
            }
            InterfaceC11743a interfaceC11743a2 = this.f28206b;
            if (interfaceC11743a2 != null) {
                interfaceC11743a2.mo33990b(j10, fArr);
            }
        }

        @Override // p398v8.InterfaceC11743a
        /* renamed from: c */
        public void mo33991c() {
            InterfaceC11743a interfaceC11743a = this.f28208d;
            if (interfaceC11743a != null) {
                interfaceC11743a.mo33991c();
            }
            InterfaceC11743a interfaceC11743a2 = this.f28206b;
            if (interfaceC11743a2 != null) {
                interfaceC11743a2.mo33991c();
            }
        }

        @Override // p361t6.C11070m3.b
        /* renamed from: p */
        public void mo33992p(int i10, Object obj) {
            InterfaceC11743a cameraMotionListener;
            if (i10 == 7) {
                this.f28205a = (InterfaceC11458k) obj;
                return;
            }
            if (i10 == 8) {
                this.f28206b = (InterfaceC11743a) obj;
                return;
            }
            if (i10 != 10000) {
                return;
            }
            C11754l c11754l = (C11754l) obj;
            if (c11754l == null) {
                cameraMotionListener = null;
                this.f28207c = null;
            } else {
                this.f28207c = c11754l.getVideoFrameMetadataListener();
                cameraMotionListener = c11754l.getCameraMotionListener();
            }
            this.f28208d = cameraMotionListener;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t6.d1$e */
    /* loaded from: classes.dex */
    public static final class e implements InterfaceC11069m2 {

        /* renamed from: a */
        private final Object f28209a;

        /* renamed from: b */
        private AbstractC11018d4 f28210b;

        public e(Object obj, AbstractC11018d4 abstractC11018d4) {
            this.f28209a = obj;
            this.f28210b = abstractC11018d4;
        }

        @Override // p361t6.InterfaceC11069m2
        /* renamed from: a */
        public AbstractC11018d4 mo33708a() {
            return this.f28210b;
        }

        @Override // p361t6.InterfaceC11069m2
        /* renamed from: l */
        public Object mo33710l() {
            return this.f28209a;
        }
    }

    static {
        C11093r1.m34452a("goog.exo.exoplayer");
    }

    public C11015d1(InterfaceC11126y.b bVar, InterfaceC11053j3 interfaceC11053j3) {
        C11149g c11149g = new C11149g();
        this.f28162d = c11149g;
        try {
            C11173s.m34967f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.7] [" + C11172r0.f29044e + "]");
            Context applicationContext = bVar.f28890a.getApplicationContext();
            this.f28164e = applicationContext;
            InterfaceC11327a apply = bVar.f28898i.apply(bVar.f28891b);
            this.f28190r = apply;
            this.f28181m0 = bVar.f28900k;
            this.f28169g0 = bVar.f28901l;
            this.f28157a0 = bVar.f28906q;
            this.f28159b0 = bVar.f28907r;
            this.f28173i0 = bVar.f28905p;
            this.f28135E = bVar.f28914y;
            c cVar = new c();
            this.f28201x = cVar;
            d dVar = new d();
            this.f28202y = dVar;
            Handler handler = new Handler(bVar.f28899j);
            InterfaceC11090q3[] mo34474a = bVar.f28893d.get().mo34474a(handler, cVar, cVar, cVar, cVar);
            this.f28168g = mo34474a;
            C11137a.m34605g(mo34474a.length > 0);
            AbstractC10294a0 abstractC10294a0 = bVar.f28895f.get();
            this.f28170h = abstractC10294a0;
            this.f28188q = bVar.f28894e.get();
            InterfaceC10817e interfaceC10817e = bVar.f28897h.get();
            this.f28194t = interfaceC10817e;
            this.f28186p = bVar.f28908s;
            this.f28142L = bVar.f28909t;
            this.f28196u = bVar.f28910u;
            this.f28198v = bVar.f28911v;
            this.f28144N = bVar.f28915z;
            Looper looper = bVar.f28899j;
            this.f28192s = looper;
            InterfaceC11143d interfaceC11143d = bVar.f28891b;
            this.f28200w = interfaceC11143d;
            InterfaceC11053j3 interfaceC11053j32 = interfaceC11053j3 == null ? this : interfaceC11053j3;
            this.f28166f = interfaceC11053j32;
            this.f28178l = new C11171r<>(looper, interfaceC11143d, new C11171r.b() { // from class: t6.q0
                @Override // p363t8.C11171r.b
                /* renamed from: a */
                public final void mo34318a(Object obj, C11159l c11159l) {
                    C11015d1.this.m33894t1((InterfaceC11053j3.d) obj, c11159l);
                }
            });
            this.f28180m = new CopyOnWriteArraySet<>();
            this.f28184o = new ArrayList();
            this.f28143M = new InterfaceC11738x0.a(0);
            C10296b0 c10296b0 = new C10296b0(new C11100s3[mo34474a.length], new InterfaceC10312r[mo34474a.length], C11048i4.f28431b, null);
            this.f28158b = c10296b0;
            this.f28182n = new AbstractC11018d4.b();
            InterfaceC11053j3.b m34211e = new InterfaceC11053j3.b.a().m34209c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).m34210d(29, abstractC10294a0.mo30870d()).m34211e();
            this.f28160c = m34211e;
            this.f28145O = new InterfaceC11053j3.b.a().m34208b(m34211e).m34207a(4).m34207a(10).m34211e();
            this.f28172i = interfaceC11143d.mo34623c(looper, null);
            C11088q1.f fVar = new C11088q1.f() { // from class: t6.v0
                @Override // p361t6.C11088q1.f
                /* renamed from: a */
                public final void mo34447a(C11088q1.e eVar) {
                    C11015d1.this.m33898v1(eVar);
                }
            };
            this.f28174j = fVar;
            this.f28193s0 = C11035g3.m34045j(c10296b0);
            apply.mo35437z(interfaceC11053j32, looper);
            int i10 = C11172r0.f29040a;
            C11088q1 c11088q1 = new C11088q1(mo34474a, abstractC10294a0, c10296b0, bVar.f28896g.get(), interfaceC10817e, this.f28136F, this.f28137G, apply, this.f28142L, bVar.f28912w, bVar.f28913x, this.f28144N, looper, interfaceC11143d, fVar, i10 < 31 ? new C11391m3() : b.m33947a(applicationContext, this, bVar.f28887A), bVar.f28888B);
            this.f28176k = c11088q1;
            this.f28171h0 = 1.0f;
            this.f28136F = 0;
            C11040h2 c11040h2 = C11040h2.f28306T;
            this.f28146P = c11040h2;
            this.f28147Q = c11040h2;
            this.f28191r0 = c11040h2;
            this.f28195t0 = -1;
            this.f28167f0 = i10 < 21 ? m33888q1(0) : C11172r0.m34866F(applicationContext);
            this.f28175j0 = C7488f.f17688c;
            this.f28177k0 = true;
            mo33942s(apply);
            interfaceC10817e.mo32961h(new Handler(looper), apply);
            m33919V0(cVar);
            long j10 = bVar.f28892c;
            if (j10 > 0) {
                c11088q1.m34433u(j10);
            }
            C11001b c11001b = new C11001b(bVar.f28890a, handler, cVar);
            this.f28203z = c11001b;
            c11001b.m33713b(bVar.f28904o);
            C11049j c11049j = new C11049j(bVar.f28890a, handler, cVar);
            this.f28131A = c11049j;
            c11049j.m34188m(bVar.f28902m ? this.f28169g0 : null);
            C11130y3 c11130y3 = new C11130y3(bVar.f28890a, handler, cVar);
            this.f28132B = c11130y3;
            c11130y3.m34594h(C11172r0.m34923g0(this.f28169g0.f30297c));
            C11054j4 c11054j4 = new C11054j4(bVar.f28890a);
            this.f28133C = c11054j4;
            c11054j4.m34216a(bVar.f28903n != 0);
            C11060k4 c11060k4 = new C11060k4(bVar.f28890a);
            this.f28134D = c11060k4;
            c11060k4.m34226a(bVar.f28903n == 2);
            this.f28187p0 = m33848Z0(c11130y3);
            this.f28189q0 = C11448a0.f29643e;
            this.f28161c0 = C11152h0.f28966c;
            abstractC10294a0.mo30874h(this.f28169g0);
            m33842W1(1, 10, Integer.valueOf(this.f28167f0));
            m33842W1(2, 10, Integer.valueOf(this.f28167f0));
            m33842W1(1, 3, this.f28169g0);
            m33842W1(2, 4, Integer.valueOf(this.f28157a0));
            m33842W1(2, 5, Integer.valueOf(this.f28159b0));
            m33842W1(1, 9, Boolean.valueOf(this.f28173i0));
            m33842W1(2, 7, dVar);
            m33842W1(6, 8, dVar);
            c11149g.m34721e();
        } catch (Throwable th2) {
            this.f28162d.m34721e();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A1 */
    public /* synthetic */ void m33798A1(InterfaceC11053j3.d dVar) {
        dVar.onAvailableCommandsChanged(this.f28145O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B1 */
    public static /* synthetic */ void m33800B1(C11035g3 c11035g3, int i10, InterfaceC11053j3.d dVar) {
        dVar.onTimelineChanged(c11035g3.f28284a, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C1 */
    public static /* synthetic */ void m33802C1(int i10, InterfaceC11053j3.e eVar, InterfaceC11053j3.e eVar2, InterfaceC11053j3.d dVar) {
        dVar.onPositionDiscontinuity(i10);
        dVar.onPositionDiscontinuity(eVar, eVar2, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E1 */
    public static /* synthetic */ void m33806E1(C11035g3 c11035g3, InterfaceC11053j3.d dVar) {
        dVar.onPlayerErrorChanged(c11035g3.f28289f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F1 */
    public static /* synthetic */ void m33808F1(C11035g3 c11035g3, InterfaceC11053j3.d dVar) {
        dVar.onPlayerError(c11035g3.f28289f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G1 */
    public static /* synthetic */ void m33810G1(C11035g3 c11035g3, InterfaceC11053j3.d dVar) {
        dVar.onTracksChanged(c11035g3.f28292i.f25597d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I1 */
    public static /* synthetic */ void m33814I1(C11035g3 c11035g3, InterfaceC11053j3.d dVar) {
        dVar.onLoadingChanged(c11035g3.f28290g);
        dVar.onIsLoadingChanged(c11035g3.f28290g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J1 */
    public static /* synthetic */ void m33816J1(C11035g3 c11035g3, InterfaceC11053j3.d dVar) {
        dVar.onPlayerStateChanged(c11035g3.f28295l, c11035g3.f28288e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K1 */
    public static /* synthetic */ void m33818K1(C11035g3 c11035g3, InterfaceC11053j3.d dVar) {
        dVar.onPlaybackStateChanged(c11035g3.f28288e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L1 */
    public static /* synthetic */ void m33820L1(C11035g3 c11035g3, int i10, InterfaceC11053j3.d dVar) {
        dVar.onPlayWhenReadyChanged(c11035g3.f28295l, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M1 */
    public static /* synthetic */ void m33822M1(C11035g3 c11035g3, InterfaceC11053j3.d dVar) {
        dVar.onPlaybackSuppressionReasonChanged(c11035g3.f28296m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N1 */
    public static /* synthetic */ void m33824N1(C11035g3 c11035g3, InterfaceC11053j3.d dVar) {
        dVar.onIsPlayingChanged(m33890r1(c11035g3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O1 */
    public static /* synthetic */ void m33826O1(C11035g3 c11035g3, InterfaceC11053j3.d dVar) {
        dVar.onPlaybackParametersChanged(c11035g3.f28297n);
    }

    /* renamed from: P1 */
    private C11035g3 m33828P1(C11035g3 c11035g3, AbstractC11018d4 abstractC11018d4, Pair<Object, Long> pair) {
        long j10;
        C11137a.m34599a(abstractC11018d4.m34005v() || pair != null);
        AbstractC11018d4 abstractC11018d42 = c11035g3.f28284a;
        C11035g3 m34055i = c11035g3.m34055i(abstractC11018d4);
        if (abstractC11018d4.m34005v()) {
            InterfaceC11684a0.b m34046k = C11035g3.m34046k();
            long m34861C0 = C11172r0.m34861C0(this.f28199v0);
            C11035g3 m34048b = m34055i.m34049c(m34046k, m34861C0, m34861C0, m34861C0, 0L, C11700f1.f30689d, this.f28158b, AbstractC5907w.m15081v()).m34048b(m34046k);
            m34048b.f28299p = m34048b.f28301r;
            return m34048b;
        }
        Object obj = m34055i.f28285b.f30974a;
        boolean z10 = !obj.equals(((Pair) C11172r0.m34928j(pair)).first);
        InterfaceC11684a0.b bVar = z10 ? new InterfaceC11684a0.b(pair.first) : m34055i.f28285b;
        long longValue = ((Long) pair.second).longValue();
        long m34861C02 = C11172r0.m34861C0(mo33907B());
        if (!abstractC11018d42.m34005v()) {
            m34861C02 -= abstractC11018d42.mo33628m(obj, this.f28182n).m34023r();
        }
        if (z10 || longValue < m34861C02) {
            C11137a.m34605g(!bVar.m37106b());
            C11035g3 m34048b2 = m34055i.m34049c(bVar, longValue, longValue, longValue, 0L, z10 ? C11700f1.f30689d : m34055i.f28291h, z10 ? this.f28158b : m34055i.f28292i, z10 ? AbstractC5907w.m15081v() : m34055i.f28293j).m34048b(bVar);
            m34048b2.f28299p = longValue;
            return m34048b2;
        }
        if (longValue == m34861C02) {
            int mo11856g = abstractC11018d4.mo11856g(m34055i.f28294k.f30974a);
            if (mo11856g == -1 || abstractC11018d4.m34001k(mo11856g, this.f28182n).f28227c != abstractC11018d4.mo33628m(bVar.f30974a, this.f28182n).f28227c) {
                abstractC11018d4.mo33628m(bVar.f30974a, this.f28182n);
                j10 = bVar.m37106b() ? this.f28182n.m34011f(bVar.f30975b, bVar.f30976c) : this.f28182n.f28228d;
                m34055i = m34055i.m34049c(bVar, m34055i.f28301r, m34055i.f28301r, m34055i.f28287d, j10 - m34055i.f28301r, m34055i.f28291h, m34055i.f28292i, m34055i.f28293j).m34048b(bVar);
            }
            return m34055i;
        }
        C11137a.m34605g(!bVar.m37106b());
        long max = Math.max(0L, m34055i.f28300q - (longValue - m34861C02));
        j10 = m34055i.f28299p;
        if (m34055i.f28294k.equals(m34055i.f28285b)) {
            j10 = longValue + max;
        }
        m34055i = m34055i.m34049c(bVar, longValue, longValue, longValue, max, m34055i.f28291h, m34055i.f28292i, m34055i.f28293j);
        m34055i.f28299p = j10;
        return m34055i;
    }

    /* renamed from: Q1 */
    private Pair<Object, Long> m33830Q1(AbstractC11018d4 abstractC11018d4, int i10, long j10) {
        if (abstractC11018d4.m34005v()) {
            this.f28195t0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f28199v0 = j10;
            this.f28197u0 = 0;
            return null;
        }
        if (i10 == -1 || i10 >= abstractC11018d4.mo11861u()) {
            i10 = abstractC11018d4.mo33625f(this.f28137G);
            j10 = abstractC11018d4.m34004s(i10, this.f28499a).m34032e();
        }
        return abstractC11018d4.m34002o(this.f28499a, this.f28182n, i10, C11172r0.m34861C0(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R1 */
    public void m33832R1(final int i10, final int i11) {
        if (i10 == this.f28161c0.m34725b() && i11 == this.f28161c0.m34724a()) {
            return;
        }
        this.f28161c0 = new C11152h0(i10, i11);
        this.f28178l.m34852l(24, new C11171r.a() { // from class: t6.f0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11053j3.d) obj).onSurfaceSizeChanged(i10, i11);
            }
        });
    }

    /* renamed from: S1 */
    private long m33834S1(AbstractC11018d4 abstractC11018d4, InterfaceC11684a0.b bVar, long j10) {
        abstractC11018d4.mo33628m(bVar.f30974a, this.f28182n);
        return j10 + this.f28182n.m34023r();
    }

    /* renamed from: T1 */
    private C11035g3 m33836T1(int i10, int i11) {
        int mo33911G = mo33911G();
        AbstractC11018d4 mo33941r = mo33941r();
        int size = this.f28184o.size();
        this.f28138H++;
        m33837U1(i10, i11);
        AbstractC11018d4 m33850a1 = m33850a1();
        C11035g3 m33828P1 = m33828P1(this.f28193s0, m33850a1, m33873j1(mo33941r, m33850a1));
        int i12 = m33828P1.f28288e;
        if (i12 != 1 && i12 != 4 && i10 < i11 && i11 == size && mo33911G >= m33828P1.f28284a.mo11861u()) {
            m33828P1 = m33828P1.m34053g(4);
        }
        this.f28176k.m34432n0(i10, i11, this.f28143M);
        return m33828P1;
    }

    /* renamed from: U1 */
    private void m33837U1(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f28184o.remove(i12);
        }
        this.f28143M = this.f28143M.mo37097a(i10, i11);
    }

    /* renamed from: V1 */
    private void m33839V1() {
        if (this.f28154X != null) {
            m33856c1(this.f28202y).m34301n(ModuleDescriptor.MODULE_VERSION).m34300m(null).m34299l();
            this.f28154X.m37163h(this.f28201x);
            this.f28154X = null;
        }
        TextureView textureView = this.f28156Z;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f28201x) {
                C11173s.m34970i("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f28156Z.setSurfaceTextureListener(null);
            }
            this.f28156Z = null;
        }
        SurfaceHolder surfaceHolder = this.f28153W;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f28201x);
            this.f28153W = null;
        }
    }

    /* renamed from: W0 */
    private List<C10999a3.c> m33841W0(int i10, List<InterfaceC11684a0> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            C10999a3.c cVar = new C10999a3.c(list.get(i11), this.f28186p);
            arrayList.add(cVar);
            this.f28184o.add(i11 + i10, new e(cVar.f27995b, cVar.f27994a.m37092Z()));
        }
        this.f28143M = this.f28143M.mo37103g(i10, arrayList.size());
        return arrayList;
    }

    /* renamed from: W1 */
    private void m33842W1(int i10, int i11, Object obj) {
        for (InterfaceC11090q3 interfaceC11090q3 : this.f28168g) {
            if (interfaceC11090q3.mo34245g() == i10) {
                m33856c1(interfaceC11090q3).m34301n(i11).m34300m(obj).m34299l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X1 */
    public void m33844X1() {
        m33842W1(1, 2, Float.valueOf(this.f28171h0 * this.f28131A.m34186g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y0 */
    public C11040h2 m33846Y0() {
        AbstractC11018d4 mo33941r = mo33941r();
        if (mo33941r.m34005v()) {
            return this.f28191r0;
        }
        return this.f28191r0.m34061c().m34097J(mo33941r.m34004s(mo33911G(), this.f28499a).f28257c.f28027e).m34095H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z0 */
    public static C11111v m33848Z0(C11130y3 c11130y3) {
        return new C11111v(0, c11130y3.m34592d(), c11130y3.m34591c());
    }

    /* renamed from: a1 */
    private AbstractC11018d4 m33850a1() {
        return new C11075n3(this.f28184o, this.f28143M);
    }

    /* renamed from: a2 */
    private void m33851a2(List<InterfaceC11684a0> list, int i10, long j10, boolean z10) {
        int i11;
        long j11;
        int m33870i1 = m33870i1();
        long mo33927e = mo33927e();
        this.f28138H++;
        if (!this.f28184o.isEmpty()) {
            m33837U1(0, this.f28184o.size());
        }
        List<C10999a3.c> m33841W0 = m33841W0(0, list);
        AbstractC11018d4 m33850a1 = m33850a1();
        if (!m33850a1.m34005v() && i10 >= m33850a1.mo11861u()) {
            throw new C11128y1(m33850a1, i10, j10);
        }
        if (z10) {
            j11 = -9223372036854775807L;
            i11 = m33850a1.mo33625f(this.f28137G);
        } else if (i10 == -1) {
            i11 = m33870i1;
            j11 = mo33927e;
        } else {
            i11 = i10;
            j11 = j10;
        }
        C11035g3 m33828P1 = m33828P1(this.f28193s0, m33850a1, m33830Q1(m33850a1, i11, j11));
        int i12 = m33828P1.f28288e;
        if (i11 != -1 && i12 != 1) {
            i12 = (m33850a1.m34005v() || i11 >= m33850a1.mo11861u()) ? 4 : 2;
        }
        C11035g3 m34053g = m33828P1.m34053g(i12);
        this.f28176k.m34422N0(m33841W0, i11, C11172r0.m34861C0(j11), this.f28143M);
        m33868h2(m34053g, 0, 1, false, (this.f28193s0.f28285b.f30974a.equals(m34053g.f28285b.f30974a) || this.f28193s0.f28284a.m34005v()) ? false : true, 4, m33867h1(m34053g), -1, false);
    }

    /* renamed from: b1 */
    private List<InterfaceC11684a0> m33853b1(List<C11010c2> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f28188q.mo11846a(list.get(i10)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b2 */
    public void m33854b2(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        m33857c2(surface);
        this.f28152V = surface;
    }

    /* renamed from: c1 */
    private C11070m3 m33856c1(C11070m3.b bVar) {
        int m33870i1 = m33870i1();
        C11088q1 c11088q1 = this.f28176k;
        AbstractC11018d4 abstractC11018d4 = this.f28193s0.f28284a;
        if (m33870i1 == -1) {
            m33870i1 = 0;
        }
        return new C11070m3(c11088q1, bVar, abstractC11018d4, m33870i1, this.f28200w, c11088q1.m34421B());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c2 */
    public void m33857c2(Object obj) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        InterfaceC11090q3[] interfaceC11090q3Arr = this.f28168g;
        int length = interfaceC11090q3Arr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= length) {
                break;
            }
            InterfaceC11090q3 interfaceC11090q3 = interfaceC11090q3Arr[i10];
            if (interfaceC11090q3.mo34245g() == 2) {
                arrayList.add(m33856c1(interfaceC11090q3).m34301n(1).m34300m(obj).m34299l());
            }
            i10++;
        }
        Object obj2 = this.f28151U;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C11070m3) it.next()).m34288a(this.f28135E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj3 = this.f28151U;
            Surface surface = this.f28152V;
            if (obj3 == surface) {
                surface.release();
                this.f28152V = null;
            }
        }
        this.f28151U = obj;
        if (z10) {
            m33861e2(false, C11121x.m34570j(new C11098s1(3), 1003));
        }
    }

    /* renamed from: d1 */
    private Pair<Boolean, Integer> m33859d1(C11035g3 c11035g3, C11035g3 c11035g32, boolean z10, int i10, boolean z11, boolean z12) {
        AbstractC11018d4 abstractC11018d4 = c11035g32.f28284a;
        AbstractC11018d4 abstractC11018d42 = c11035g3.f28284a;
        if (abstractC11018d42.m34005v() && abstractC11018d4.m34005v()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (abstractC11018d42.m34005v() != abstractC11018d4.m34005v()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (abstractC11018d4.m34004s(abstractC11018d4.mo33628m(c11035g32.f28285b.f30974a, this.f28182n).f28227c, this.f28499a).f28255a.equals(abstractC11018d42.m34004s(abstractC11018d42.mo33628m(c11035g3.f28285b.f30974a, this.f28182n).f28227c, this.f28499a).f28255a)) {
            return (z10 && i10 == 0 && c11035g32.f28285b.f30977d < c11035g3.f28285b.f30977d) ? new Pair<>(Boolean.TRUE, 0) : (z10 && i10 == 1 && z12) ? new Pair<>(Boolean.TRUE, 2) : new Pair<>(Boolean.FALSE, -1);
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

    /* renamed from: e2 */
    private void m33861e2(boolean z10, C11121x c11121x) {
        C11035g3 m34048b;
        if (z10) {
            m34048b = m33836T1(0, this.f28184o.size()).m34051e(null);
        } else {
            C11035g3 c11035g3 = this.f28193s0;
            m34048b = c11035g3.m34048b(c11035g3.f28285b);
            m34048b.f28299p = m34048b.f28301r;
            m34048b.f28300q = 0L;
        }
        C11035g3 m34053g = m34048b.m34053g(1);
        if (c11121x != null) {
            m34053g = m34053g.m34051e(c11121x);
        }
        C11035g3 c11035g32 = m34053g;
        this.f28138H++;
        this.f28176k.m34426g1();
        m33868h2(c11035g32, 0, 1, false, c11035g32.f28284a.m34005v() && !this.f28193s0.f28284a.m34005v(), 4, m33867h1(c11035g32), -1, false);
    }

    /* renamed from: f2 */
    private void m33863f2() {
        InterfaceC11053j3.b bVar = this.f28145O;
        InterfaceC11053j3.b m34870H = C11172r0.m34870H(this.f28166f, this.f28160c);
        this.f28145O = m34870H;
        if (m34870H.equals(bVar)) {
            return;
        }
        this.f28178l.m34849i(13, new C11171r.a() { // from class: t6.u0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                C11015d1.this.m33798A1((InterfaceC11053j3.d) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g2 */
    public void m33865g2(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        C11035g3 c11035g3 = this.f28193s0;
        if (c11035g3.f28295l == z11 && c11035g3.f28296m == i12) {
            return;
        }
        this.f28138H++;
        C11035g3 m34050d = c11035g3.m34050d(z11, i12);
        this.f28176k.m34423Q0(z11, i12);
        m33868h2(m34050d, 0, i11, false, false, 5, -9223372036854775807L, -1, false);
    }

    /* renamed from: h1 */
    private long m33867h1(C11035g3 c11035g3) {
        return c11035g3.f28284a.m34005v() ? C11172r0.m34861C0(this.f28199v0) : c11035g3.f28285b.m37106b() ? c11035g3.f28301r : m33834S1(c11035g3.f28284a, c11035g3.f28285b, c11035g3.f28301r);
    }

    /* renamed from: h2 */
    private void m33868h2(final C11035g3 c11035g3, final int i10, final int i11, boolean z10, boolean z11, final int i12, long j10, int i13, boolean z12) {
        C11035g3 c11035g32 = this.f28193s0;
        this.f28193s0 = c11035g3;
        boolean z13 = !c11035g32.f28284a.equals(c11035g3.f28284a);
        Pair<Boolean, Integer> m33859d1 = m33859d1(c11035g3, c11035g32, z11, i12, z13, z12);
        boolean booleanValue = ((Boolean) m33859d1.first).booleanValue();
        final int intValue = ((Integer) m33859d1.second).intValue();
        C11040h2 c11040h2 = this.f28146P;
        if (booleanValue) {
            r3 = c11035g3.f28284a.m34005v() ? null : c11035g3.f28284a.m34004s(c11035g3.f28284a.mo33628m(c11035g3.f28285b.f30974a, this.f28182n).f28227c, this.f28499a).f28257c;
            this.f28191r0 = C11040h2.f28306T;
        }
        if (booleanValue || !c11035g32.f28293j.equals(c11035g3.f28293j)) {
            this.f28191r0 = this.f28191r0.m34061c().m34098K(c11035g3.f28293j).m34095H();
            c11040h2 = m33846Y0();
        }
        boolean z14 = !c11040h2.equals(this.f28146P);
        this.f28146P = c11040h2;
        boolean z15 = c11035g32.f28295l != c11035g3.f28295l;
        boolean z16 = c11035g32.f28288e != c11035g3.f28288e;
        if (z16 || z15) {
            m33874j2();
        }
        boolean z17 = c11035g32.f28290g;
        boolean z18 = c11035g3.f28290g;
        boolean z19 = z17 != z18;
        if (z19) {
            m33871i2(z18);
        }
        if (z13) {
            this.f28178l.m34849i(0, new C11171r.a() { // from class: t6.a1
                @Override // p363t8.C11171r.a
                public final void invoke(Object obj) {
                    C11015d1.m33800B1(C11035g3.this, i10, (InterfaceC11053j3.d) obj);
                }
            });
        }
        if (z11) {
            final InterfaceC11053j3.e m33882n1 = m33882n1(i12, c11035g32, i13);
            final InterfaceC11053j3.e m33880m1 = m33880m1(j10);
            this.f28178l.m34849i(11, new C11171r.a() { // from class: t6.j0
                @Override // p363t8.C11171r.a
                public final void invoke(Object obj) {
                    C11015d1.m33802C1(i12, m33882n1, m33880m1, (InterfaceC11053j3.d) obj);
                }
            });
        }
        if (booleanValue) {
            this.f28178l.m34849i(1, new C11171r.a() { // from class: t6.k0
                @Override // p363t8.C11171r.a
                public final void invoke(Object obj) {
                    ((InterfaceC11053j3.d) obj).onMediaItemTransition(C11010c2.this, intValue);
                }
            });
        }
        if (c11035g32.f28289f != c11035g3.f28289f) {
            this.f28178l.m34849i(10, new C11171r.a() { // from class: t6.l0
                @Override // p363t8.C11171r.a
                public final void invoke(Object obj) {
                    C11015d1.m33806E1(C11035g3.this, (InterfaceC11053j3.d) obj);
                }
            });
            if (c11035g3.f28289f != null) {
                this.f28178l.m34849i(10, new C11171r.a() { // from class: t6.m0
                    @Override // p363t8.C11171r.a
                    public final void invoke(Object obj) {
                        C11015d1.m33808F1(C11035g3.this, (InterfaceC11053j3.d) obj);
                    }
                });
            }
        }
        C10296b0 c10296b0 = c11035g32.f28292i;
        C10296b0 c10296b02 = c11035g3.f28292i;
        if (c10296b0 != c10296b02) {
            this.f28170h.mo30871e(c10296b02.f25598e);
            this.f28178l.m34849i(2, new C11171r.a() { // from class: t6.n0
                @Override // p363t8.C11171r.a
                public final void invoke(Object obj) {
                    C11015d1.m33810G1(C11035g3.this, (InterfaceC11053j3.d) obj);
                }
            });
        }
        if (z14) {
            final C11040h2 c11040h22 = this.f28146P;
            this.f28178l.m34849i(14, new C11171r.a() { // from class: t6.o0
                @Override // p363t8.C11171r.a
                public final void invoke(Object obj) {
                    ((InterfaceC11053j3.d) obj).onMediaMetadataChanged(C11040h2.this);
                }
            });
        }
        if (z19) {
            this.f28178l.m34849i(3, new C11171r.a() { // from class: t6.p0
                @Override // p363t8.C11171r.a
                public final void invoke(Object obj) {
                    C11015d1.m33814I1(C11035g3.this, (InterfaceC11053j3.d) obj);
                }
            });
        }
        if (z16 || z15) {
            this.f28178l.m34849i(-1, new C11171r.a() { // from class: t6.r0
                @Override // p363t8.C11171r.a
                public final void invoke(Object obj) {
                    C11015d1.m33816J1(C11035g3.this, (InterfaceC11053j3.d) obj);
                }
            });
        }
        if (z16) {
            this.f28178l.m34849i(4, new C11171r.a() { // from class: t6.s0
                @Override // p363t8.C11171r.a
                public final void invoke(Object obj) {
                    C11015d1.m33818K1(C11035g3.this, (InterfaceC11053j3.d) obj);
                }
            });
        }
        if (z15) {
            this.f28178l.m34849i(5, new C11171r.a() { // from class: t6.b1
                @Override // p363t8.C11171r.a
                public final void invoke(Object obj) {
                    C11015d1.m33820L1(C11035g3.this, i11, (InterfaceC11053j3.d) obj);
                }
            });
        }
        if (c11035g32.f28296m != c11035g3.f28296m) {
            this.f28178l.m34849i(6, new C11171r.a() { // from class: t6.c1
                @Override // p363t8.C11171r.a
                public final void invoke(Object obj) {
                    C11015d1.m33822M1(C11035g3.this, (InterfaceC11053j3.d) obj);
                }
            });
        }
        if (m33890r1(c11035g32) != m33890r1(c11035g3)) {
            this.f28178l.m34849i(7, new C11171r.a() { // from class: t6.g0
                @Override // p363t8.C11171r.a
                public final void invoke(Object obj) {
                    C11015d1.m33824N1(C11035g3.this, (InterfaceC11053j3.d) obj);
                }
            });
        }
        if (!c11035g32.f28297n.equals(c11035g3.f28297n)) {
            this.f28178l.m34849i(12, new C11171r.a() { // from class: t6.h0
                @Override // p363t8.C11171r.a
                public final void invoke(Object obj) {
                    C11015d1.m33826O1(C11035g3.this, (InterfaceC11053j3.d) obj);
                }
            });
        }
        if (z10) {
            this.f28178l.m34849i(-1, new C11171r.a() { // from class: t6.i0
                @Override // p363t8.C11171r.a
                public final void invoke(Object obj) {
                    ((InterfaceC11053j3.d) obj).onSeekProcessed();
                }
            });
        }
        m33863f2();
        this.f28178l.m34848f();
        if (c11035g32.f28298o != c11035g3.f28298o) {
            Iterator<InterfaceC11126y.a> it = this.f28180m.iterator();
            while (it.hasNext()) {
                it.next().mo33964A(c11035g3.f28298o);
            }
        }
    }

    /* renamed from: i1 */
    private int m33870i1() {
        if (this.f28193s0.f28284a.m34005v()) {
            return this.f28195t0;
        }
        C11035g3 c11035g3 = this.f28193s0;
        return c11035g3.f28284a.mo33628m(c11035g3.f28285b.f30974a, this.f28182n).f28227c;
    }

    /* renamed from: i2 */
    private void m33871i2(boolean z10) {
        C11150g0 c11150g0 = this.f28181m0;
        if (c11150g0 != null) {
            if (z10 && !this.f28183n0) {
                c11150g0.m34722a(0);
                this.f28183n0 = true;
            } else {
                if (z10 || !this.f28183n0) {
                    return;
                }
                c11150g0.m34723b(0);
                this.f28183n0 = false;
            }
        }
    }

    /* renamed from: j1 */
    private Pair<Object, Long> m33873j1(AbstractC11018d4 abstractC11018d4, AbstractC11018d4 abstractC11018d42) {
        long mo33907B = mo33907B();
        if (abstractC11018d4.m34005v() || abstractC11018d42.m34005v()) {
            boolean z10 = !abstractC11018d4.m34005v() && abstractC11018d42.m34005v();
            int m33870i1 = z10 ? -1 : m33870i1();
            if (z10) {
                mo33907B = -9223372036854775807L;
            }
            return m33830Q1(abstractC11018d42, m33870i1, mo33907B);
        }
        Pair<Object, Long> m34002o = abstractC11018d4.m34002o(this.f28499a, this.f28182n, mo33911G(), C11172r0.m34861C0(mo33907B));
        Object obj = ((Pair) C11172r0.m34928j(m34002o)).first;
        if (abstractC11018d42.mo11856g(obj) != -1) {
            return m34002o;
        }
        Object m34417y0 = C11088q1.m34417y0(this.f28499a, this.f28182n, this.f28136F, this.f28137G, obj, abstractC11018d4, abstractC11018d42);
        if (m34417y0 == null) {
            return m33830Q1(abstractC11018d42, -1, -9223372036854775807L);
        }
        abstractC11018d42.mo33628m(m34417y0, this.f28182n);
        int i10 = this.f28182n.f28227c;
        return m33830Q1(abstractC11018d42, i10, abstractC11018d42.m34004s(i10, this.f28499a).m34032e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j2 */
    public void m33874j2() {
        int mo33910F = mo33910F();
        if (mo33910F != 1) {
            if (mo33910F == 2 || mo33910F == 3) {
                this.f28133C.m34217b(mo33944u() && !m33928e1());
                this.f28134D.m34227b(mo33944u());
                return;
            } else if (mo33910F != 4) {
                throw new IllegalStateException();
            }
        }
        this.f28133C.m34217b(false);
        this.f28134D.m34227b(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k1 */
    public static int m33876k1(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    /* renamed from: k2 */
    private void m33877k2() {
        this.f28162d.m34718b();
        if (Thread.currentThread() != m33930f1().getThread()) {
            String m34860C = C11172r0.m34860C("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), m33930f1().getThread().getName());
            if (this.f28177k0) {
                throw new IllegalStateException(m34860C);
            }
            C11173s.m34971j("ExoPlayerImpl", m34860C, this.f28179l0 ? null : new IllegalStateException());
            this.f28179l0 = true;
        }
    }

    /* renamed from: m1 */
    private InterfaceC11053j3.e m33880m1(long j10) {
        C11010c2 c11010c2;
        Object obj;
        int i10;
        Object obj2;
        int mo33911G = mo33911G();
        if (this.f28193s0.f28284a.m34005v()) {
            c11010c2 = null;
            obj = null;
            i10 = -1;
            obj2 = null;
        } else {
            C11035g3 c11035g3 = this.f28193s0;
            Object obj3 = c11035g3.f28285b.f30974a;
            c11035g3.f28284a.mo33628m(obj3, this.f28182n);
            i10 = this.f28193s0.f28284a.mo11856g(obj3);
            obj = obj3;
            obj2 = this.f28193s0.f28284a.m34004s(mo33911G, this.f28499a).f28255a;
            c11010c2 = this.f28499a.f28257c;
        }
        long m34910a1 = C11172r0.m34910a1(j10);
        long m34910a12 = this.f28193s0.f28285b.m37106b() ? C11172r0.m34910a1(m33884o1(this.f28193s0)) : m34910a1;
        InterfaceC11684a0.b bVar = this.f28193s0.f28285b;
        return new InterfaceC11053j3.e(obj2, mo33911G, c11010c2, obj, i10, m34910a1, m34910a12, bVar.f30975b, bVar.f30976c);
    }

    /* renamed from: n1 */
    private InterfaceC11053j3.e m33882n1(int i10, C11035g3 c11035g3, int i11) {
        int i12;
        Object obj;
        C11010c2 c11010c2;
        Object obj2;
        int i13;
        long j10;
        long j11;
        AbstractC11018d4.b bVar = new AbstractC11018d4.b();
        if (c11035g3.f28284a.m34005v()) {
            i12 = i11;
            obj = null;
            c11010c2 = null;
            obj2 = null;
            i13 = -1;
        } else {
            Object obj3 = c11035g3.f28285b.f30974a;
            c11035g3.f28284a.mo33628m(obj3, bVar);
            int i14 = bVar.f28227c;
            int mo11856g = c11035g3.f28284a.mo11856g(obj3);
            Object obj4 = c11035g3.f28284a.m34004s(i14, this.f28499a).f28255a;
            c11010c2 = this.f28499a.f28257c;
            obj2 = obj3;
            i13 = mo11856g;
            obj = obj4;
            i12 = i14;
        }
        boolean m37106b = c11035g3.f28285b.m37106b();
        if (i10 == 0) {
            if (m37106b) {
                InterfaceC11684a0.b bVar2 = c11035g3.f28285b;
                j10 = bVar.m34011f(bVar2.f30975b, bVar2.f30976c);
                j11 = m33884o1(c11035g3);
            } else {
                j10 = c11035g3.f28285b.f30978e != -1 ? m33884o1(this.f28193s0) : bVar.f28229e + bVar.f28228d;
                j11 = j10;
            }
        } else if (m37106b) {
            j10 = c11035g3.f28301r;
            j11 = m33884o1(c11035g3);
        } else {
            j10 = bVar.f28229e + c11035g3.f28301r;
            j11 = j10;
        }
        long m34910a1 = C11172r0.m34910a1(j10);
        long m34910a12 = C11172r0.m34910a1(j11);
        InterfaceC11684a0.b bVar3 = c11035g3.f28285b;
        return new InterfaceC11053j3.e(obj, i12, c11010c2, obj2, i13, m34910a1, m34910a12, bVar3.f30975b, bVar3.f30976c);
    }

    /* renamed from: o1 */
    private static long m33884o1(C11035g3 c11035g3) {
        AbstractC11018d4.d dVar = new AbstractC11018d4.d();
        AbstractC11018d4.b bVar = new AbstractC11018d4.b();
        c11035g3.f28284a.mo33628m(c11035g3.f28285b.f30974a, bVar);
        return c11035g3.f28286c == -9223372036854775807L ? c11035g3.f28284a.m34004s(bVar.f28227c, dVar).m34033f() : bVar.m34023r() + c11035g3.f28286c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p1, reason: merged with bridge method [inline-methods] */
    public void m33896u1(C11088q1.e eVar) {
        long j10;
        boolean z10;
        long j11;
        int i10 = this.f28138H - eVar.f28668c;
        this.f28138H = i10;
        boolean z11 = true;
        if (eVar.f28669d) {
            this.f28139I = eVar.f28670e;
            this.f28140J = true;
        }
        if (eVar.f28671f) {
            this.f28141K = eVar.f28672g;
        }
        if (i10 == 0) {
            AbstractC11018d4 abstractC11018d4 = eVar.f28667b.f28284a;
            if (!this.f28193s0.f28284a.m34005v() && abstractC11018d4.m34005v()) {
                this.f28195t0 = -1;
                this.f28199v0 = 0L;
                this.f28197u0 = 0;
            }
            if (!abstractC11018d4.m34005v()) {
                List<AbstractC11018d4> m34305J = ((C11075n3) abstractC11018d4).m34305J();
                C11137a.m34605g(m34305J.size() == this.f28184o.size());
                for (int i11 = 0; i11 < m34305J.size(); i11++) {
                    this.f28184o.get(i11).f28210b = m34305J.get(i11);
                }
            }
            if (this.f28140J) {
                if (eVar.f28667b.f28285b.equals(this.f28193s0.f28285b) && eVar.f28667b.f28287d == this.f28193s0.f28301r) {
                    z11 = false;
                }
                if (z11) {
                    if (abstractC11018d4.m34005v() || eVar.f28667b.f28285b.m37106b()) {
                        j11 = eVar.f28667b.f28287d;
                    } else {
                        C11035g3 c11035g3 = eVar.f28667b;
                        j11 = m33834S1(abstractC11018d4, c11035g3.f28285b, c11035g3.f28287d);
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
            this.f28140J = false;
            m33868h2(eVar.f28667b, 1, this.f28141K, false, z10, this.f28139I, j10, -1, false);
        }
    }

    /* renamed from: q1 */
    private int m33888q1(int i10) {
        AudioTrack audioTrack = this.f28150T;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i10) {
            this.f28150T.release();
            this.f28150T = null;
        }
        if (this.f28150T == null) {
            this.f28150T = new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
        }
        return this.f28150T.getAudioSessionId();
    }

    /* renamed from: r1 */
    private static boolean m33890r1(C11035g3 c11035g3) {
        return c11035g3.f28288e == 3 && c11035g3.f28295l && c11035g3.f28296m == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t1 */
    public /* synthetic */ void m33894t1(InterfaceC11053j3.d dVar, C11159l c11159l) {
        dVar.onEvents(this.f28166f, new InterfaceC11053j3.c(c11159l));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v1 */
    public /* synthetic */ void m33898v1(final C11088q1.e eVar) {
        this.f28172i.mo34778h(new Runnable() { // from class: t6.t0
            @Override // java.lang.Runnable
            public final void run() {
                C11015d1.this.m33896u1(eVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1 */
    public static /* synthetic */ void m33900w1(InterfaceC11053j3.d dVar) {
        dVar.onPlayerError(C11121x.m34570j(new C11098s1(1), 1003));
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: B */
    public long mo33907B() {
        m33877k2();
        if (!mo33931g()) {
            return mo33927e();
        }
        C11035g3 c11035g3 = this.f28193s0;
        c11035g3.f28284a.mo33628m(c11035g3.f28285b.f30974a, this.f28182n);
        C11035g3 c11035g32 = this.f28193s0;
        return c11035g32.f28286c == -9223372036854775807L ? c11035g32.f28284a.m34004s(mo33911G(), this.f28499a).m34032e() : this.f28182n.m34022q() + C11172r0.m34910a1(this.f28193s0.f28286c);
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: C */
    public void mo33908C(int i10, List<C11010c2> list) {
        m33877k2();
        m33920X0(i10, m33853b1(list));
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: D */
    public long mo33909D() {
        m33877k2();
        if (!mo33931g()) {
            return m33932g1();
        }
        C11035g3 c11035g3 = this.f28193s0;
        return c11035g3.f28294k.equals(c11035g3.f28285b) ? C11172r0.m34910a1(this.f28193s0.f28299p) : getDuration();
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: F */
    public int mo33910F() {
        m33877k2();
        return this.f28193s0.f28288e;
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: G */
    public int mo33911G() {
        m33877k2();
        int m33870i1 = m33870i1();
        if (m33870i1 == -1) {
            return 0;
        }
        return m33870i1;
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: H */
    public void mo33912H(final int i10) {
        m33877k2();
        if (this.f28136F != i10) {
            this.f28136F = i10;
            this.f28176k.m34425U0(i10);
            this.f28178l.m34849i(8, new C11171r.a() { // from class: t6.z0
                @Override // p363t8.C11171r.a
                public final void invoke(Object obj) {
                    ((InterfaceC11053j3.d) obj).onRepeatModeChanged(i10);
                }
            });
            m33863f2();
            this.f28178l.m34848f();
        }
    }

    @Override // p361t6.InterfaceC11126y
    /* renamed from: I */
    public void mo33913I(InterfaceC11684a0 interfaceC11684a0) {
        m33877k2();
        m33921Y1(Collections.singletonList(interfaceC11684a0));
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: J */
    public int mo33914J() {
        m33877k2();
        return this.f28136F;
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: K */
    public boolean mo33915K() {
        m33877k2();
        return this.f28137G;
    }

    @Override // p361t6.InterfaceC11126y
    /* renamed from: L */
    public void mo33916L(final C11639e c11639e, boolean z10) {
        m33877k2();
        if (this.f28185o0) {
            return;
        }
        if (!C11172r0.m34914c(this.f28169g0, c11639e)) {
            this.f28169g0 = c11639e;
            m33842W1(1, 3, c11639e);
            this.f28132B.m34594h(C11172r0.m34923g0(c11639e.f30297c));
            this.f28178l.m34849i(20, new C11171r.a() { // from class: t6.w0
                @Override // p363t8.C11171r.a
                public final void invoke(Object obj) {
                    ((InterfaceC11053j3.d) obj).onAudioAttributesChanged(C11639e.this);
                }
            });
        }
        this.f28131A.m34188m(z10 ? c11639e : null);
        this.f28170h.mo30874h(c11639e);
        boolean mo33944u = mo33944u();
        int m34189p = this.f28131A.m34189p(mo33944u, mo33910F());
        m33865g2(mo33944u, m34189p, m33876k1(mo33944u, m34189p));
        this.f28178l.m34848f();
    }

    @Override // p361t6.AbstractC11055k
    /* renamed from: S */
    public void mo33917S(int i10, long j10, int i11, boolean z10) {
        m33877k2();
        C11137a.m34599a(i10 >= 0);
        this.f28190r.mo35436t();
        AbstractC11018d4 abstractC11018d4 = this.f28193s0.f28284a;
        if (abstractC11018d4.m34005v() || i10 < abstractC11018d4.mo11861u()) {
            this.f28138H++;
            if (mo33931g()) {
                C11173s.m34970i("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                C11088q1.e eVar = new C11088q1.e(this.f28193s0);
                eVar.m34443b(1);
                this.f28174j.mo34447a(eVar);
                return;
            }
            int i12 = mo33910F() != 1 ? 2 : 1;
            int mo33911G = mo33911G();
            C11035g3 m33828P1 = m33828P1(this.f28193s0.m34053g(i12), abstractC11018d4, m33830Q1(abstractC11018d4, i10, j10));
            this.f28176k.m34420A0(abstractC11018d4, i10, C11172r0.m34861C0(j10));
            m33868h2(m33828P1, 0, 1, true, true, 1, m33867h1(m33828P1), mo33911G, z10);
        }
    }

    /* renamed from: U0 */
    public void m33918U0(InterfaceC11332b interfaceC11332b) {
        this.f28190r.mo35416E((InterfaceC11332b) C11137a.m34603e(interfaceC11332b));
    }

    /* renamed from: V0 */
    public void m33919V0(InterfaceC11126y.a aVar) {
        this.f28180m.add(aVar);
    }

    /* renamed from: X0 */
    public void m33920X0(int i10, List<InterfaceC11684a0> list) {
        m33877k2();
        C11137a.m34599a(i10 >= 0);
        int min = Math.min(i10, this.f28184o.size());
        AbstractC11018d4 mo33941r = mo33941r();
        this.f28138H++;
        List<C10999a3.c> m33841W0 = m33841W0(min, list);
        AbstractC11018d4 m33850a1 = m33850a1();
        C11035g3 m33828P1 = m33828P1(this.f28193s0, m33850a1, m33873j1(mo33941r, m33850a1));
        this.f28176k.m34431l(min, m33841W0, this.f28143M);
        m33868h2(m33828P1, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    /* renamed from: Y1 */
    public void m33921Y1(List<InterfaceC11684a0> list) {
        m33877k2();
        m33922Z1(list, true);
    }

    /* renamed from: Z1 */
    public void m33922Z1(List<InterfaceC11684a0> list, boolean z10) {
        m33877k2();
        m33851a2(list, -1, -9223372036854775807L, z10);
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: a */
    public void mo33923a() {
        m33877k2();
        boolean mo33944u = mo33944u();
        int m34189p = this.f28131A.m34189p(mo33944u, 2);
        m33865g2(mo33944u, m34189p, m33876k1(mo33944u, m34189p));
        C11035g3 c11035g3 = this.f28193s0;
        if (c11035g3.f28288e != 1) {
            return;
        }
        C11035g3 m34051e = c11035g3.m34051e(null);
        C11035g3 m34053g = m34051e.m34053g(m34051e.f28284a.m34005v() ? 4 : 2);
        this.f28138H++;
        this.f28176k.m34429i0();
        m33868h2(m34053g, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: b */
    public void mo33924b(C11047i3 c11047i3) {
        m33877k2();
        if (c11047i3 == null) {
            c11047i3 = C11047i3.f28424d;
        }
        if (this.f28193s0.f28297n.equals(c11047i3)) {
            return;
        }
        C11035g3 m34052f = this.f28193s0.m34052f(c11047i3);
        this.f28138H++;
        this.f28176k.m34424S0(c11047i3);
        m33868h2(m34052f, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: c */
    public C11047i3 mo33925c() {
        m33877k2();
        return this.f28193s0.f28297n;
    }

    /* renamed from: d2 */
    public void m33926d2(boolean z10) {
        m33877k2();
        this.f28131A.m34189p(mo33944u(), 1);
        m33861e2(z10, null);
        this.f28175j0 = new C7488f(AbstractC5907w.m15081v(), this.f28193s0.f28301r);
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: e */
    public long mo33927e() {
        m33877k2();
        return C11172r0.m34910a1(m33867h1(this.f28193s0));
    }

    /* renamed from: e1 */
    public boolean m33928e1() {
        m33877k2();
        return this.f28193s0.f28298o;
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: f */
    public void mo33929f(Surface surface) {
        m33877k2();
        m33839V1();
        m33857c2(surface);
        int i10 = surface == null ? 0 : -1;
        m33832R1(i10, i10);
    }

    /* renamed from: f1 */
    public Looper m33930f1() {
        return this.f28192s;
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: g */
    public boolean mo33931g() {
        m33877k2();
        return this.f28193s0.f28285b.m37106b();
    }

    /* renamed from: g1 */
    public long m33932g1() {
        m33877k2();
        if (this.f28193s0.f28284a.m34005v()) {
            return this.f28199v0;
        }
        C11035g3 c11035g3 = this.f28193s0;
        if (c11035g3.f28294k.f30977d != c11035g3.f28285b.f30977d) {
            return c11035g3.f28284a.m34004s(mo33911G(), this.f28499a).m34034g();
        }
        long j10 = c11035g3.f28299p;
        if (this.f28193s0.f28294k.m37106b()) {
            C11035g3 c11035g32 = this.f28193s0;
            AbstractC11018d4.b mo33628m = c11035g32.f28284a.mo33628m(c11035g32.f28294k.f30974a, this.f28182n);
            long m34015j = mo33628m.m34015j(this.f28193s0.f28294k.f30975b);
            j10 = m34015j == Long.MIN_VALUE ? mo33628m.f28228d : m34015j;
        }
        C11035g3 c11035g33 = this.f28193s0;
        return C11172r0.m34910a1(m33834S1(c11035g33.f28284a, c11035g33.f28294k, j10));
    }

    @Override // p361t6.InterfaceC11053j3
    public long getDuration() {
        m33877k2();
        if (!mo33931g()) {
            return m34222O();
        }
        C11035g3 c11035g3 = this.f28193s0;
        InterfaceC11684a0.b bVar = c11035g3.f28285b;
        c11035g3.f28284a.mo33628m(bVar.f30974a, this.f28182n);
        return C11172r0.m34910a1(this.f28182n.m34011f(bVar.f30975b, bVar.f30976c));
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: h */
    public long mo33933h() {
        m33877k2();
        return C11172r0.m34910a1(this.f28193s0.f28300q);
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: k */
    public void mo33935k(boolean z10) {
        m33877k2();
        int m34189p = this.f28131A.m34189p(z10, mo33910F());
        m33865g2(z10, m34189p, m33876k1(z10, m34189p));
    }

    @Override // p361t6.InterfaceC11126y
    /* renamed from: l */
    public C11108u1 mo33936l() {
        m33877k2();
        return this.f28148R;
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public C11121x mo33934j() {
        m33877k2();
        return this.f28193s0.f28289f;
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: m */
    public C11048i4 mo33938m() {
        m33877k2();
        return this.f28193s0.f28292i.f25597d;
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: o */
    public int mo33939o() {
        m33877k2();
        if (mo33931g()) {
            return this.f28193s0.f28285b.f30975b;
        }
        return -1;
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: q */
    public int mo33940q() {
        m33877k2();
        return this.f28193s0.f28296m;
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: r */
    public AbstractC11018d4 mo33941r() {
        m33877k2();
        return this.f28193s0.f28284a;
    }

    @Override // p361t6.InterfaceC11053j3
    public void release() {
        AudioTrack audioTrack;
        C11173s.m34967f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.7] [" + C11172r0.f29044e + "] [" + C11093r1.m34453b() + "]");
        m33877k2();
        if (C11172r0.f29040a < 21 && (audioTrack = this.f28150T) != null) {
            audioTrack.release();
            this.f28150T = null;
        }
        this.f28203z.m33713b(false);
        this.f28132B.m34593g();
        this.f28133C.m34217b(false);
        this.f28134D.m34227b(false);
        this.f28131A.m34187i();
        if (!this.f28176k.m34430k0()) {
            this.f28178l.m34852l(10, new C11171r.a() { // from class: t6.x0
                @Override // p363t8.C11171r.a
                public final void invoke(Object obj) {
                    C11015d1.m33900w1((InterfaceC11053j3.d) obj);
                }
            });
        }
        this.f28178l.m34850j();
        this.f28172i.mo34775e(null);
        this.f28194t.mo32959e(this.f28190r);
        C11035g3 m34053g = this.f28193s0.m34053g(1);
        this.f28193s0 = m34053g;
        C11035g3 m34048b = m34053g.m34048b(m34053g.f28285b);
        this.f28193s0 = m34048b;
        m34048b.f28299p = m34048b.f28301r;
        this.f28193s0.f28300q = 0L;
        this.f28190r.release();
        this.f28170h.mo30872f();
        m33839V1();
        Surface surface = this.f28152V;
        if (surface != null) {
            surface.release();
            this.f28152V = null;
        }
        if (this.f28183n0) {
            ((C11150g0) C11137a.m34603e(this.f28181m0)).m34723b(0);
            this.f28183n0 = false;
        }
        this.f28175j0 = C7488f.f17688c;
        this.f28185o0 = true;
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: s */
    public void mo33942s(InterfaceC11053j3.d dVar) {
        this.f28178l.m34845c((InterfaceC11053j3.d) C11137a.m34603e(dVar));
    }

    @Override // p361t6.InterfaceC11053j3
    public void setVolume(float f10) {
        m33877k2();
        final float m34940p = C11172r0.m34940p(f10, 0.0f, 1.0f);
        if (this.f28171h0 == m34940p) {
            return;
        }
        this.f28171h0 = m34940p;
        m33844X1();
        this.f28178l.m34852l(22, new C11171r.a() { // from class: t6.y0
            @Override // p363t8.C11171r.a
            public final void invoke(Object obj) {
                ((InterfaceC11053j3.d) obj).onVolumeChanged(m34940p);
            }
        });
    }

    @Override // p361t6.InterfaceC11053j3
    public void stop() {
        m33877k2();
        m33926d2(false);
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: t */
    public void mo33943t(InterfaceC11053j3.d dVar) {
        m33877k2();
        this.f28178l.m34851k((InterfaceC11053j3.d) C11137a.m34603e(dVar));
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: u */
    public boolean mo33944u() {
        m33877k2();
        return this.f28193s0.f28295l;
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: w */
    public int mo33945w() {
        m33877k2();
        if (this.f28193s0.f28284a.m34005v()) {
            return this.f28197u0;
        }
        C11035g3 c11035g3 = this.f28193s0;
        return c11035g3.f28284a.mo11856g(c11035g3.f28285b.f30974a);
    }

    @Override // p361t6.InterfaceC11053j3
    /* renamed from: y */
    public int mo33946y() {
        m33877k2();
        if (mo33931g()) {
            return this.f28193s0.f28285b.f30976c;
        }
        return -1;
    }
}

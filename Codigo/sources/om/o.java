package om;

import android.content.Context;
import android.media.AudioManager;
import ck.v;
import nm.p;
import nm.r;
import nm.s;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final nm.m f22725a;

    /* renamed from: b, reason: collision with root package name */
    private final p f22726b;

    /* renamed from: c, reason: collision with root package name */
    private nm.a f22727c;

    /* renamed from: d, reason: collision with root package name */
    private final l f22728d;

    /* renamed from: e, reason: collision with root package name */
    private j f22729e;

    /* renamed from: f, reason: collision with root package name */
    private pm.b f22730f;

    /* renamed from: g, reason: collision with root package name */
    private float f22731g;

    /* renamed from: h, reason: collision with root package name */
    private float f22732h;

    /* renamed from: i, reason: collision with root package name */
    private float f22733i;

    /* renamed from: j, reason: collision with root package name */
    private s f22734j;

    /* renamed from: k, reason: collision with root package name */
    private r f22735k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f22736l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f22737m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f22738n;

    /* renamed from: o, reason: collision with root package name */
    private int f22739o;

    /* renamed from: p, reason: collision with root package name */
    private final c f22740p;

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22741a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.MEDIA_PLAYER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.LOW_LATENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f22741a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b extends kotlin.jvm.internal.k implements ok.a<v> {
        b(Object obj) {
            super(0, obj, o.class, "actuallyPlay", "actuallyPlay()V", 0);
        }

        public final void a() {
            ((o) this.receiver).b();
        }

        @Override // ok.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f7137a;
        }
    }

    public o(nm.m ref, p eventHandler, nm.a context, l soundPoolManager) {
        kotlin.jvm.internal.n.e(ref, "ref");
        kotlin.jvm.internal.n.e(eventHandler, "eventHandler");
        kotlin.jvm.internal.n.e(context, "context");
        kotlin.jvm.internal.n.e(soundPoolManager, "soundPoolManager");
        this.f22725a = ref;
        this.f22726b = eventHandler;
        this.f22727c = context;
        this.f22728d = soundPoolManager;
        this.f22731g = 1.0f;
        this.f22733i = 1.0f;
        this.f22734j = s.RELEASE;
        this.f22735k = r.MEDIA_PLAYER;
        this.f22736l = true;
        this.f22739o = -1;
        this.f22740p = new c(this);
    }

    private final void M(j jVar, float f10, float f11) {
        jVar.j(Math.min(1.0f, 1.0f - f11) * f10, Math.min(1.0f, f11 + 1.0f) * f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        if (this.f22738n || this.f22736l) {
            return;
        }
        j jVar = this.f22729e;
        this.f22738n = true;
        if (jVar == null) {
            s();
        } else if (this.f22737m) {
            jVar.start();
            this.f22725a.C();
        }
    }

    private final void c(j jVar) {
        M(jVar, this.f22731g, this.f22732h);
        jVar.h(u());
        jVar.a();
    }

    private final j d() {
        int i10 = a.f22741a[this.f22735k.ordinal()];
        if (i10 == 1) {
            return new i(this);
        }
        if (i10 == 2) {
            return new m(this, this.f22728d);
        }
        throw new ck.l();
    }

    private final j l() {
        j jVar = this.f22729e;
        if (this.f22736l || jVar == null) {
            j d10 = d();
            this.f22729e = d10;
            this.f22736l = false;
            return d10;
        }
        if (!this.f22737m) {
            return jVar;
        }
        jVar.reset();
        H(false);
        return jVar;
    }

    private final void s() {
        j d10 = d();
        this.f22729e = d10;
        pm.b bVar = this.f22730f;
        if (bVar != null) {
            d10.g(bVar);
            c(d10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int v() {
        /*
            r3 = this;
            r0 = 0
            ck.n$a r1 = ck.n.f7126b     // Catch: java.lang.Throwable -> L22
            om.j r1 = r3.f22729e     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto Lc
            java.lang.Integer r1 = r1.e()     // Catch: java.lang.Throwable -> L22
            goto Ld
        Lc:
            r1 = r0
        Ld:
            if (r1 != 0) goto L10
            goto L18
        L10:
            int r2 = r1.intValue()     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L18
            r2 = 1
            goto L19
        L18:
            r2 = 0
        L19:
            if (r2 != 0) goto L1c
            goto L1d
        L1c:
            r1 = r0
        L1d:
            java.lang.Object r1 = ck.n.b(r1)     // Catch: java.lang.Throwable -> L22
            goto L2d
        L22:
            r1 = move-exception
            ck.n$a r2 = ck.n.f7126b
            java.lang.Object r1 = ck.o.a(r1)
            java.lang.Object r1 = ck.n.b(r1)
        L2d:
            boolean r2 = ck.n.f(r1)
            if (r2 == 0) goto L34
            goto L35
        L34:
            r0 = r1
        L35:
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L3e
            int r0 = r0.intValue()
            goto L3f
        L3e:
            r0 = -1
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: om.o.v():int");
    }

    public final void A() {
        this.f22725a.H(this);
    }

    public final void B() {
        j jVar;
        if (this.f22738n) {
            this.f22738n = false;
            if (!this.f22737m || (jVar = this.f22729e) == null) {
                return;
            }
            jVar.pause();
        }
    }

    public final void C() {
        this.f22740p.g(new b(this));
    }

    public final void D() {
        j jVar;
        this.f22740p.f();
        if (this.f22736l) {
            return;
        }
        if (this.f22738n && (jVar = this.f22729e) != null) {
            jVar.stop();
        }
        K(null);
        this.f22729e = null;
    }

    public final void E(int i10) {
        if (this.f22737m) {
            j jVar = this.f22729e;
            boolean z10 = false;
            if (jVar != null && jVar.k()) {
                z10 = true;
            }
            if (!z10) {
                j jVar2 = this.f22729e;
                if (jVar2 != null) {
                    jVar2.seekTo(i10);
                }
                i10 = -1;
            }
        }
        this.f22739o = i10;
    }

    public final void F(float f10) {
        j jVar;
        if (this.f22732h == f10) {
            return;
        }
        this.f22732h = f10;
        if (this.f22736l || (jVar = this.f22729e) == null) {
            return;
        }
        M(jVar, this.f22731g, f10);
    }

    public final void G(r value) {
        kotlin.jvm.internal.n.e(value, "value");
        if (this.f22735k != value) {
            this.f22735k = value;
            j jVar = this.f22729e;
            if (jVar != null) {
                this.f22739o = v();
                H(false);
                jVar.release();
            }
            s();
        }
    }

    public final void H(boolean z10) {
        if (this.f22737m != z10) {
            this.f22737m = z10;
            this.f22725a.F(this, z10);
        }
    }

    public final void I(float f10) {
        j jVar;
        if (this.f22733i == f10) {
            return;
        }
        this.f22733i = f10;
        if (!this.f22738n || (jVar = this.f22729e) == null) {
            return;
        }
        jVar.l(f10);
    }

    public final void J(s value) {
        j jVar;
        kotlin.jvm.internal.n.e(value, "value");
        if (this.f22734j != value) {
            this.f22734j = value;
            if (this.f22736l || (jVar = this.f22729e) == null) {
                return;
            }
            jVar.h(u());
        }
    }

    public final void K(pm.b bVar) {
        if (kotlin.jvm.internal.n.a(this.f22730f, bVar)) {
            this.f22725a.F(this, true);
            return;
        }
        if (bVar != null) {
            j l10 = l();
            l10.g(bVar);
            c(l10);
        } else {
            this.f22736l = true;
            H(false);
            this.f22738n = false;
            j jVar = this.f22729e;
            if (jVar != null) {
                jVar.release();
            }
        }
        this.f22730f = bVar;
    }

    public final void L(float f10) {
        j jVar;
        if (this.f22731g == f10) {
            return;
        }
        this.f22731g = f10;
        if (this.f22736l || (jVar = this.f22729e) == null) {
            return;
        }
        M(jVar, f10, this.f22732h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        if (r0.k() == true) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N() {
        /*
            r3 = this;
            om.c r0 = r3.f22740p
            r0.f()
            boolean r0 = r3.f22736l
            if (r0 == 0) goto La
            return
        La:
            nm.s r0 = r3.f22734j
            nm.s r1 = nm.s.RELEASE
            if (r0 == r1) goto L3d
            r3.B()
            boolean r0 = r3.f22737m
            if (r0 == 0) goto L40
            om.j r0 = r3.f22729e
            r1 = 0
            if (r0 == 0) goto L24
            boolean r0 = r0.k()
            r2 = 1
            if (r0 != r2) goto L24
            goto L25
        L24:
            r2 = r1
        L25:
            if (r2 == 0) goto L39
            om.j r0 = r3.f22729e
            if (r0 == 0) goto L2e
            r0.stop()
        L2e:
            r3.H(r1)
            om.j r0 = r3.f22729e
            if (r0 == 0) goto L40
            r0.a()
            goto L40
        L39:
            r3.E(r1)
            goto L40
        L3d:
            r3.D()
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: om.o.N():void");
    }

    public final void O(nm.a audioContext) {
        kotlin.jvm.internal.n.e(audioContext, "audioContext");
        if (kotlin.jvm.internal.n.a(this.f22727c, audioContext)) {
            return;
        }
        if (this.f22727c.d() != 0 && audioContext.d() == 0) {
            this.f22740p.f();
        }
        this.f22727c = nm.a.c(audioContext, false, false, 0, 0, 0, 0, 63, null);
        g().setMode(this.f22727c.e());
        g().setSpeakerphoneOn(this.f22727c.g());
        j jVar = this.f22729e;
        if (jVar != null) {
            jVar.stop();
            H(false);
            jVar.f(this.f22727c);
            pm.b bVar = this.f22730f;
            if (bVar != null) {
                jVar.g(bVar);
                c(jVar);
            }
        }
    }

    public final void e() {
        D();
        this.f22726b.a();
    }

    public final Context f() {
        return this.f22725a.o();
    }

    public final AudioManager g() {
        return this.f22725a.p();
    }

    public final nm.a h() {
        return this.f22727c;
    }

    public final Integer i() {
        j jVar;
        if (!this.f22737m || (jVar = this.f22729e) == null) {
            return null;
        }
        return jVar.e();
    }

    public final Integer j() {
        j jVar;
        if (!this.f22737m || (jVar = this.f22729e) == null) {
            return null;
        }
        return jVar.getDuration();
    }

    public final p k() {
        return this.f22726b;
    }

    public final boolean m() {
        return this.f22738n;
    }

    public final boolean n() {
        return this.f22737m;
    }

    public final float o() {
        return this.f22733i;
    }

    public final float p() {
        return this.f22731g;
    }

    public final void q(String str, String str2, Object obj) {
        this.f22725a.w(this, str, str2, obj);
    }

    public final void r(String message) {
        kotlin.jvm.internal.n.e(message, "message");
        this.f22725a.D(this, message);
    }

    public final boolean t() {
        if (!this.f22738n || !this.f22737m) {
            return false;
        }
        j jVar = this.f22729e;
        return jVar != null && jVar.i();
    }

    public final boolean u() {
        return this.f22734j == s.LOOP;
    }

    public final void w(int i10) {
    }

    public final void x() {
        if (this.f22734j != s.LOOP) {
            N();
        }
        this.f22725a.s(this);
    }

    public final boolean y(int i10, int i11) {
        String str;
        String str2;
        if (i10 == 100) {
            str = "MEDIA_ERROR_SERVER_DIED";
        } else {
            str = "MEDIA_ERROR_UNKNOWN {what:" + i10 + '}';
        }
        if (i11 == Integer.MIN_VALUE) {
            str2 = "MEDIA_ERROR_SYSTEM";
        } else if (i11 == -1010) {
            str2 = "MEDIA_ERROR_UNSUPPORTED";
        } else if (i11 == -1007) {
            str2 = "MEDIA_ERROR_MALFORMED";
        } else if (i11 == -1004) {
            str2 = "MEDIA_ERROR_IO";
        } else if (i11 != -110) {
            str2 = "MEDIA_ERROR_UNKNOWN {extra:" + i11 + '}';
        } else {
            str2 = "MEDIA_ERROR_TIMED_OUT";
        }
        if (this.f22737m || !kotlin.jvm.internal.n.a(str2, "MEDIA_ERROR_SYSTEM")) {
            H(false);
            q("AndroidAudioError", str, str2);
        } else {
            q("AndroidAudioError", "Failed to set source. For troubleshooting, see: https://github.com/bluefireteam/audioplayers/blob/main/troubleshooting.md", str + ", " + str2);
        }
        return false;
    }

    public final void z() {
        j jVar;
        H(true);
        this.f22725a.u(this);
        if (this.f22738n) {
            j jVar2 = this.f22729e;
            if (jVar2 != null) {
                jVar2.start();
            }
            this.f22725a.C();
        }
        if (this.f22739o >= 0) {
            j jVar3 = this.f22729e;
            if ((jVar3 != null && jVar3.k()) || (jVar = this.f22729e) == null) {
                return;
            }
            jVar.seekTo(this.f22739o);
        }
    }
}

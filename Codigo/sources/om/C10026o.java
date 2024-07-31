package om;

import android.content.Context;
import android.media.AudioManager;
import ck.C2027l;
import ck.C2037v;
import kotlin.jvm.internal.C9319k;
import kotlin.jvm.internal.C9322n;
import p258nm.C9731a;
import p258nm.C9743m;
import p258nm.C9746p;
import p258nm.EnumC9748r;
import p258nm.EnumC9749s;
import p280ok.InterfaceC9987a;
import pm.InterfaceC10212b;

/* renamed from: om.o */
/* loaded from: classes3.dex */
public final class C10026o {

    /* renamed from: a */
    private final C9743m f24658a;

    /* renamed from: b */
    private final C9746p f24659b;

    /* renamed from: c */
    private C9731a f24660c;

    /* renamed from: d */
    private final C10023l f24661d;

    /* renamed from: e */
    private InterfaceC10021j f24662e;

    /* renamed from: f */
    private InterfaceC10212b f24663f;

    /* renamed from: g */
    private float f24664g;

    /* renamed from: h */
    private float f24665h;

    /* renamed from: i */
    private float f24666i;

    /* renamed from: j */
    private EnumC9749s f24667j;

    /* renamed from: k */
    private EnumC9748r f24668k;

    /* renamed from: l */
    private boolean f24669l;

    /* renamed from: m */
    private boolean f24670m;

    /* renamed from: n */
    private boolean f24671n;

    /* renamed from: o */
    private int f24672o;

    /* renamed from: p */
    private final C10014c f24673p;

    /* renamed from: om.o$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24674a;

        static {
            int[] iArr = new int[EnumC9748r.values().length];
            try {
                iArr[EnumC9748r.MEDIA_PLAYER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC9748r.LOW_LATENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24674a = iArr;
        }
    }

    /* renamed from: om.o$b */
    /* loaded from: classes3.dex */
    /* synthetic */ class b extends C9319k implements InterfaceC9987a<C2037v> {
        b(Object obj) {
            super(0, obj, C10026o.class, "actuallyPlay", "actuallyPlay()V", 0);
        }

        /* renamed from: a */
        public final void m29936a() {
            ((C10026o) this.receiver).m29897b();
        }

        @Override // p280ok.InterfaceC9987a
        public /* bridge */ /* synthetic */ C2037v invoke() {
            m29936a();
            return C2037v.f8089a;
        }
    }

    public C10026o(C9743m ref, C9746p eventHandler, C9731a context, C10023l soundPoolManager) {
        C9322n.m27781e(ref, "ref");
        C9322n.m27781e(eventHandler, "eventHandler");
        C9322n.m27781e(context, "context");
        C9322n.m27781e(soundPoolManager, "soundPoolManager");
        this.f24658a = ref;
        this.f24659b = eventHandler;
        this.f24660c = context;
        this.f24661d = soundPoolManager;
        this.f24664g = 1.0f;
        this.f24666i = 1.0f;
        this.f24667j = EnumC9749s.RELEASE;
        this.f24668k = EnumC9748r.MEDIA_PLAYER;
        this.f24669l = true;
        this.f24672o = -1;
        this.f24673p = new C10014c(this);
    }

    /* renamed from: M */
    private final void m29895M(InterfaceC10021j interfaceC10021j, float f10, float f11) {
        interfaceC10021j.mo29873j(Math.min(1.0f, 1.0f - f11) * f10, Math.min(1.0f, f11 + 1.0f) * f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final void m29897b() {
        if (this.f24671n || this.f24669l) {
            return;
        }
        InterfaceC10021j interfaceC10021j = this.f24662e;
        this.f24671n = true;
        if (interfaceC10021j == null) {
            m29901s();
        } else if (this.f24670m) {
            interfaceC10021j.start();
            this.f24658a.m29202C();
        }
    }

    /* renamed from: c */
    private final void m29898c(InterfaceC10021j interfaceC10021j) {
        m29895M(interfaceC10021j, this.f24664g, this.f24665h);
        interfaceC10021j.mo29871h(m29931u());
        interfaceC10021j.mo29867a();
    }

    /* renamed from: d */
    private final InterfaceC10021j m29899d() {
        int i10 = a.f24674a[this.f24668k.ordinal()];
        if (i10 == 1) {
            return new C10020i(this);
        }
        if (i10 == 2) {
            return new C10024m(this, this.f24661d);
        }
        throw new C2027l();
    }

    /* renamed from: l */
    private final InterfaceC10021j m29900l() {
        InterfaceC10021j interfaceC10021j = this.f24662e;
        if (this.f24669l || interfaceC10021j == null) {
            InterfaceC10021j m29899d = m29899d();
            this.f24662e = m29899d;
            this.f24669l = false;
            return m29899d;
        }
        if (!this.f24670m) {
            return interfaceC10021j;
        }
        interfaceC10021j.reset();
        m29910H(false);
        return interfaceC10021j;
    }

    /* renamed from: s */
    private final void m29901s() {
        InterfaceC10021j m29899d = m29899d();
        this.f24662e = m29899d;
        InterfaceC10212b interfaceC10212b = this.f24663f;
        if (interfaceC10212b != null) {
            m29899d.mo29870g(interfaceC10212b);
            m29898c(m29899d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x001c  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int m29902v() {
        /*
            r3 = this;
            r0 = 0
            ck.n$a r1 = ck.C2029n.f8078b     // Catch: java.lang.Throwable -> L22
            om.j r1 = r3.f24662e     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto Lc
            java.lang.Integer r1 = r1.mo29868e()     // Catch: java.lang.Throwable -> L22
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
            java.lang.Object r1 = ck.C2029n.m10340b(r1)     // Catch: java.lang.Throwable -> L22
            goto L2d
        L22:
            r1 = move-exception
            ck.n$a r2 = ck.C2029n.f8078b
            java.lang.Object r1 = ck.C2030o.m10348a(r1)
            java.lang.Object r1 = ck.C2029n.m10340b(r1)
        L2d:
            boolean r2 = ck.C2029n.m10344f(r1)
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
        throw new UnsupportedOperationException("Method not decompiled: om.C10026o.m29902v():int");
    }

    /* renamed from: A */
    public final void m29903A() {
        this.f24658a.m29205H(this);
    }

    /* renamed from: B */
    public final void m29904B() {
        InterfaceC10021j interfaceC10021j;
        if (this.f24671n) {
            this.f24671n = false;
            if (!this.f24670m || (interfaceC10021j = this.f24662e) == null) {
                return;
            }
            interfaceC10021j.pause();
        }
    }

    /* renamed from: C */
    public final void m29905C() {
        this.f24673p.m29855g(new b(this));
    }

    /* renamed from: D */
    public final void m29906D() {
        InterfaceC10021j interfaceC10021j;
        this.f24673p.m29854f();
        if (this.f24669l) {
            return;
        }
        if (this.f24671n && (interfaceC10021j = this.f24662e) != null) {
            interfaceC10021j.stop();
        }
        m29913K(null);
        this.f24662e = null;
    }

    /* renamed from: E */
    public final void m29907E(int i10) {
        if (this.f24670m) {
            InterfaceC10021j interfaceC10021j = this.f24662e;
            boolean z10 = false;
            if (interfaceC10021j != null && interfaceC10021j.mo29874k()) {
                z10 = true;
            }
            if (!z10) {
                InterfaceC10021j interfaceC10021j2 = this.f24662e;
                if (interfaceC10021j2 != null) {
                    interfaceC10021j2.seekTo(i10);
                }
                i10 = -1;
            }
        }
        this.f24672o = i10;
    }

    /* renamed from: F */
    public final void m29908F(float f10) {
        InterfaceC10021j interfaceC10021j;
        if (this.f24665h == f10) {
            return;
        }
        this.f24665h = f10;
        if (this.f24669l || (interfaceC10021j = this.f24662e) == null) {
            return;
        }
        m29895M(interfaceC10021j, this.f24664g, f10);
    }

    /* renamed from: G */
    public final void m29909G(EnumC9748r value) {
        C9322n.m27781e(value, "value");
        if (this.f24668k != value) {
            this.f24668k = value;
            InterfaceC10021j interfaceC10021j = this.f24662e;
            if (interfaceC10021j != null) {
                this.f24672o = m29902v();
                m29910H(false);
                interfaceC10021j.release();
            }
            m29901s();
        }
    }

    /* renamed from: H */
    public final void m29910H(boolean z10) {
        if (this.f24670m != z10) {
            this.f24670m = z10;
            this.f24658a.m29204F(this, z10);
        }
    }

    /* renamed from: I */
    public final void m29911I(float f10) {
        InterfaceC10021j interfaceC10021j;
        if (this.f24666i == f10) {
            return;
        }
        this.f24666i = f10;
        if (!this.f24671n || (interfaceC10021j = this.f24662e) == null) {
            return;
        }
        interfaceC10021j.mo29875l(f10);
    }

    /* renamed from: J */
    public final void m29912J(EnumC9749s value) {
        InterfaceC10021j interfaceC10021j;
        C9322n.m27781e(value, "value");
        if (this.f24667j != value) {
            this.f24667j = value;
            if (this.f24669l || (interfaceC10021j = this.f24662e) == null) {
                return;
            }
            interfaceC10021j.mo29871h(m29931u());
        }
    }

    /* renamed from: K */
    public final void m29913K(InterfaceC10212b interfaceC10212b) {
        if (C9322n.m27777a(this.f24663f, interfaceC10212b)) {
            this.f24658a.m29204F(this, true);
            return;
        }
        if (interfaceC10212b != null) {
            InterfaceC10021j m29900l = m29900l();
            m29900l.mo29870g(interfaceC10212b);
            m29898c(m29900l);
        } else {
            this.f24669l = true;
            m29910H(false);
            this.f24671n = false;
            InterfaceC10021j interfaceC10021j = this.f24662e;
            if (interfaceC10021j != null) {
                interfaceC10021j.release();
            }
        }
        this.f24663f = interfaceC10212b;
    }

    /* renamed from: L */
    public final void m29914L(float f10) {
        InterfaceC10021j interfaceC10021j;
        if (this.f24664g == f10) {
            return;
        }
        this.f24664g = f10;
        if (this.f24669l || (interfaceC10021j = this.f24662e) == null) {
            return;
        }
        m29895M(interfaceC10021j, f10, this.f24665h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        if (r0.mo29874k() == true) goto L15;
     */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m29915N() {
        /*
            r3 = this;
            om.c r0 = r3.f24673p
            r0.m29854f()
            boolean r0 = r3.f24669l
            if (r0 == 0) goto La
            return
        La:
            nm.s r0 = r3.f24667j
            nm.s r1 = p258nm.EnumC9749s.RELEASE
            if (r0 == r1) goto L3d
            r3.m29904B()
            boolean r0 = r3.f24670m
            if (r0 == 0) goto L40
            om.j r0 = r3.f24662e
            r1 = 0
            if (r0 == 0) goto L24
            boolean r0 = r0.mo29874k()
            r2 = 1
            if (r0 != r2) goto L24
            goto L25
        L24:
            r2 = r1
        L25:
            if (r2 == 0) goto L39
            om.j r0 = r3.f24662e
            if (r0 == 0) goto L2e
            r0.stop()
        L2e:
            r3.m29910H(r1)
            om.j r0 = r3.f24662e
            if (r0 == 0) goto L40
            r0.mo29867a()
            goto L40
        L39:
            r3.m29907E(r1)
            goto L40
        L3d:
            r3.m29906D()
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: om.C10026o.m29915N():void");
    }

    /* renamed from: O */
    public final void m29916O(C9731a audioContext) {
        C9322n.m27781e(audioContext, "audioContext");
        if (C9322n.m27777a(this.f24660c, audioContext)) {
            return;
        }
        if (this.f24660c.m29168d() != 0 && audioContext.m29168d() == 0) {
            this.f24673p.m29854f();
        }
        this.f24660c = C9731a.m29165c(audioContext, false, false, 0, 0, 0, 0, 63, null);
        m29919g().setMode(this.f24660c.m29169e());
        m29919g().setSpeakerphoneOn(this.f24660c.m29171g());
        InterfaceC10021j interfaceC10021j = this.f24662e;
        if (interfaceC10021j != null) {
            interfaceC10021j.stop();
            m29910H(false);
            interfaceC10021j.mo29869f(this.f24660c);
            InterfaceC10212b interfaceC10212b = this.f24663f;
            if (interfaceC10212b != null) {
                interfaceC10021j.mo29870g(interfaceC10212b);
                m29898c(interfaceC10021j);
            }
        }
    }

    /* renamed from: e */
    public final void m29917e() {
        m29906D();
        this.f24659b.m29221a();
    }

    /* renamed from: f */
    public final Context m29918f() {
        return this.f24658a.m29208o();
    }

    /* renamed from: g */
    public final AudioManager m29919g() {
        return this.f24658a.m29209p();
    }

    /* renamed from: h */
    public final C9731a m29920h() {
        return this.f24660c;
    }

    /* renamed from: i */
    public final Integer m29921i() {
        InterfaceC10021j interfaceC10021j;
        if (!this.f24670m || (interfaceC10021j = this.f24662e) == null) {
            return null;
        }
        return interfaceC10021j.mo29868e();
    }

    /* renamed from: j */
    public final Integer m29922j() {
        InterfaceC10021j interfaceC10021j;
        if (!this.f24670m || (interfaceC10021j = this.f24662e) == null) {
            return null;
        }
        return interfaceC10021j.getDuration();
    }

    /* renamed from: k */
    public final C9746p m29923k() {
        return this.f24659b;
    }

    /* renamed from: m */
    public final boolean m29924m() {
        return this.f24671n;
    }

    /* renamed from: n */
    public final boolean m29925n() {
        return this.f24670m;
    }

    /* renamed from: o */
    public final float m29926o() {
        return this.f24666i;
    }

    /* renamed from: p */
    public final float m29927p() {
        return this.f24664g;
    }

    /* renamed from: q */
    public final void m29928q(String str, String str2, Object obj) {
        this.f24658a.m29212w(this, str, str2, obj);
    }

    /* renamed from: r */
    public final void m29929r(String message) {
        C9322n.m27781e(message, "message");
        this.f24658a.m29203D(this, message);
    }

    /* renamed from: t */
    public final boolean m29930t() {
        if (!this.f24671n || !this.f24670m) {
            return false;
        }
        InterfaceC10021j interfaceC10021j = this.f24662e;
        return interfaceC10021j != null && interfaceC10021j.mo29872i();
    }

    /* renamed from: u */
    public final boolean m29931u() {
        return this.f24667j == EnumC9749s.LOOP;
    }

    /* renamed from: w */
    public final void m29932w(int i10) {
    }

    /* renamed from: x */
    public final void m29933x() {
        if (this.f24667j != EnumC9749s.LOOP) {
            m29915N();
        }
        this.f24658a.m29210s(this);
    }

    /* renamed from: y */
    public final boolean m29934y(int i10, int i11) {
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
        if (this.f24670m || !C9322n.m27777a(str2, "MEDIA_ERROR_SYSTEM")) {
            m29910H(false);
            m29928q("AndroidAudioError", str, str2);
        } else {
            m29928q("AndroidAudioError", "Failed to set source. For troubleshooting, see: https://github.com/bluefireteam/audioplayers/blob/main/troubleshooting.md", str + ", " + str2);
        }
        return false;
    }

    /* renamed from: z */
    public final void m29935z() {
        InterfaceC10021j interfaceC10021j;
        m29910H(true);
        this.f24658a.m29211u(this);
        if (this.f24671n) {
            InterfaceC10021j interfaceC10021j2 = this.f24662e;
            if (interfaceC10021j2 != null) {
                interfaceC10021j2.start();
            }
            this.f24658a.m29202C();
        }
        if (this.f24672o >= 0) {
            InterfaceC10021j interfaceC10021j3 = this.f24662e;
            if ((interfaceC10021j3 != null && interfaceC10021j3.mo29874k()) || (interfaceC10021j = this.f24662e) == null) {
                return;
            }
            interfaceC10021j.seekTo(this.f24672o);
        }
    }
}

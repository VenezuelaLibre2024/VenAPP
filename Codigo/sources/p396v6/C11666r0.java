package p396v6;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.common.collect.AbstractC5907w;
import java.nio.ByteBuffer;
import java.util.List;
import p197k7.AbstractC9197r;
import p197k7.C9180c0;
import p197k7.C9195p;
import p197k7.InterfaceC9191l;
import p197k7.InterfaceC9199t;
import p361t6.C11047i3;
import p361t6.C11108u1;
import p361t6.C11113v1;
import p361t6.InterfaceC11090q3;
import p361t6.InterfaceC11095r3;
import p363t8.C11137a;
import p363t8.C11172r0;
import p363t8.C11173s;
import p363t8.C11177v;
import p363t8.C11178w;
import p363t8.InterfaceC11176u;
import p396v6.InterfaceC11671u;
import p396v6.InterfaceC11673v;
import p414w6.C12082g;
import p414w6.C12084i;

/* renamed from: v6.r0 */
/* loaded from: classes.dex */
public class C11666r0 extends AbstractC9197r implements InterfaceC11176u {

    /* renamed from: O0 */
    private final Context f30451O0;

    /* renamed from: P0 */
    private final InterfaceC11671u.a f30452P0;

    /* renamed from: Q0 */
    private final InterfaceC11673v f30453Q0;

    /* renamed from: R0 */
    private int f30454R0;

    /* renamed from: S0 */
    private boolean f30455S0;

    /* renamed from: T0 */
    private C11108u1 f30456T0;

    /* renamed from: U0 */
    private C11108u1 f30457U0;

    /* renamed from: V0 */
    private long f30458V0;

    /* renamed from: W0 */
    private boolean f30459W0;

    /* renamed from: X0 */
    private boolean f30460X0;

    /* renamed from: Y0 */
    private boolean f30461Y0;

    /* renamed from: Z0 */
    private boolean f30462Z0;

    /* renamed from: a1 */
    private InterfaceC11090q3.a f30463a1;

    /* renamed from: v6.r0$b */
    /* loaded from: classes.dex */
    private static final class b {
        /* renamed from: a */
        public static void m36662a(InterfaceC11673v interfaceC11673v, Object obj) {
            interfaceC11673v.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    /* renamed from: v6.r0$c */
    /* loaded from: classes.dex */
    private final class c implements InterfaceC11673v.c {
        private c() {
        }

        @Override // p396v6.InterfaceC11673v.c
        /* renamed from: a */
        public void mo36663a(Exception exc) {
            C11173s.m34965d("MediaCodecAudioRenderer", "Audio sink error", exc);
            C11666r0.this.f30452P0.m36716l(exc);
        }

        @Override // p396v6.InterfaceC11673v.c
        /* renamed from: b */
        public void mo36664b(long j10) {
            C11666r0.this.f30452P0.m36712B(j10);
        }

        @Override // p396v6.InterfaceC11673v.c
        /* renamed from: c */
        public void mo36665c() {
            if (C11666r0.this.f30463a1 != null) {
                C11666r0.this.f30463a1.mo34434a();
            }
        }

        @Override // p396v6.InterfaceC11673v.c
        /* renamed from: d */
        public void mo36666d(int i10, long j10, long j11) {
            C11666r0.this.f30452P0.m36714D(i10, j10, j11);
        }

        @Override // p396v6.InterfaceC11673v.c
        /* renamed from: e */
        public void mo36667e() {
            C11666r0.this.m36661G1();
        }

        @Override // p396v6.InterfaceC11673v.c
        /* renamed from: f */
        public void mo36668f() {
            if (C11666r0.this.f30463a1 != null) {
                C11666r0.this.f30463a1.mo34435b();
            }
        }

        @Override // p396v6.InterfaceC11673v.c
        public void onSkipSilenceEnabledChanged(boolean z10) {
            C11666r0.this.f30452P0.m36713C(z10);
        }
    }

    public C11666r0(Context context, InterfaceC9191l.b bVar, InterfaceC9199t interfaceC9199t, boolean z10, Handler handler, InterfaceC11671u interfaceC11671u, InterfaceC11673v interfaceC11673v) {
        super(1, bVar, interfaceC9199t, z10, 44100.0f);
        this.f30451O0 = context.getApplicationContext();
        this.f30453Q0 = interfaceC11673v;
        this.f30452P0 = new InterfaceC11671u.a(handler, interfaceC11671u);
        interfaceC11673v.mo36566f(new c());
    }

    /* renamed from: A1 */
    private static boolean m36652A1(String str) {
        if (C11172r0.f29040a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(C11172r0.f29042c)) {
            String str2 = C11172r0.f29041b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B1 */
    private static boolean m36653B1() {
        if (C11172r0.f29040a == 23) {
            String str = C11172r0.f29043d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C1 */
    private int m36654C1(C9195p c9195p, C11108u1 c11108u1) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(c9195p.f22241a) || (i10 = C11172r0.f29040a) >= 24 || (i10 == 23 && C11172r0.m34957x0(this.f30451O0))) {
            return c11108u1.f28798x;
        }
        return -1;
    }

    /* renamed from: E1 */
    private static List<C9195p> m36655E1(InterfaceC9199t interfaceC9199t, C11108u1 c11108u1, boolean z10, InterfaceC11673v interfaceC11673v) {
        C9195p m27194v;
        String str = c11108u1.f28797w;
        if (str == null) {
            return AbstractC5907w.m15081v();
        }
        if (interfaceC11673v.mo36561a(c11108u1) && (m27194v = C9180c0.m27194v()) != null) {
            return AbstractC5907w.m15082w(m27194v);
        }
        List<C9195p> mo27387a = interfaceC9199t.mo27387a(str, z10, false);
        String m27185m = C9180c0.m27185m(c11108u1);
        return m27185m == null ? AbstractC5907w.m15079r(mo27387a) : AbstractC5907w.m15077p().m15093j(mo27387a).m15093j(interfaceC9199t.mo27387a(m27185m, z10, false)).m15094k();
    }

    /* renamed from: H1 */
    private void m36656H1() {
        long mo36577q = this.f30453Q0.mo36577q(mo22836e());
        if (mo36577q != Long.MIN_VALUE) {
            if (!this.f30460X0) {
                mo36577q = Math.max(this.f30458V0, mo36577q);
            }
            this.f30458V0 = mo36577q;
            this.f30460X0 = false;
        }
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: B0 */
    protected List<C9195p> mo27341B0(InterfaceC9199t interfaceC9199t, C11108u1 c11108u1, boolean z10) {
        return C9180c0.m27193u(m36655E1(interfaceC9199t, c11108u1, z10, this.f30453Q0), c11108u1);
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: D0 */
    protected InterfaceC9191l.a mo27342D0(C9195p c9195p, C11108u1 c11108u1, MediaCrypto mediaCrypto, float f10) {
        this.f30454R0 = m36659D1(c9195p, c11108u1, m34240M());
        this.f30455S0 = m36652A1(c9195p.f22241a);
        MediaFormat m36660F1 = m36660F1(c11108u1, c9195p.f22243c, this.f30454R0, f10);
        this.f30457U0 = "audio/raw".equals(c9195p.f22242b) && !"audio/raw".equals(c11108u1.f28797w) ? c11108u1 : null;
        return InterfaceC9191l.a.m27258a(c9195p, m36660F1, c11108u1, mediaCrypto);
    }

    /* renamed from: D1 */
    protected int m36659D1(C9195p c9195p, C11108u1 c11108u1, C11108u1[] c11108u1Arr) {
        int m36654C1 = m36654C1(c9195p, c11108u1);
        if (c11108u1Arr.length == 1) {
            return m36654C1;
        }
        for (C11108u1 c11108u12 : c11108u1Arr) {
            if (c9195p.m27287f(c11108u1, c11108u12).f32155d != 0) {
                m36654C1 = Math.max(m36654C1, m36654C1(c9195p, c11108u12));
            }
        }
        return m36654C1;
    }

    @Override // p361t6.AbstractC11061l, p361t6.InterfaceC11090q3
    /* renamed from: E */
    public InterfaceC11176u mo34233E() {
        return this;
    }

    /* renamed from: F1 */
    protected MediaFormat m36660F1(C11108u1 c11108u1, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", c11108u1.f28776J);
        mediaFormat.setInteger("sample-rate", c11108u1.f28777K);
        C11177v.m34992e(mediaFormat, c11108u1.f28799y);
        C11177v.m34991d(mediaFormat, "max-input-size", i10);
        int i11 = C11172r0.f29040a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f && !m36653B1()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(c11108u1.f28797w)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.f30453Q0.mo36572l(C11172r0.m34917d0(4, c11108u1.f28776J, c11108u1.f28777K)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i11 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        return mediaFormat;
    }

    /* renamed from: G1 */
    protected void m36661G1() {
        this.f30460X0 = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p197k7.AbstractC9197r, p361t6.AbstractC11061l
    /* renamed from: O */
    public void mo22831O() {
        this.f30461Y0 = true;
        this.f30456T0 = null;
        try {
            this.f30453Q0.flush();
            try {
                super.mo22831O();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.mo22831O();
                throw th2;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p197k7.AbstractC9197r, p361t6.AbstractC11061l
    /* renamed from: P */
    public void mo27347P(boolean z10, boolean z11) {
        super.mo27347P(z10, z11);
        this.f30452P0.m36720p(this.f22272J0);
        if (m34236I().f28716a) {
            this.f30453Q0.mo36580u();
        } else {
            this.f30453Q0.mo36570j();
        }
        this.f30453Q0.mo36571k(m34239L());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p197k7.AbstractC9197r, p361t6.AbstractC11061l
    /* renamed from: Q */
    public void mo22832Q(long j10, boolean z10) {
        super.mo22832Q(j10, z10);
        if (this.f30462Z0) {
            this.f30453Q0.mo36574n();
        } else {
            this.f30453Q0.flush();
        }
        this.f30458V0 = j10;
        this.f30459W0 = true;
        this.f30460X0 = true;
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: Q0 */
    protected void mo27348Q0(Exception exc) {
        C11173s.m34965d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f30452P0.m36715k(exc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p197k7.AbstractC9197r, p361t6.AbstractC11061l
    /* renamed from: R */
    public void mo27349R() {
        try {
            super.mo27349R();
        } finally {
            if (this.f30461Y0) {
                this.f30461Y0 = false;
                this.f30453Q0.reset();
            }
        }
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: R0 */
    protected void mo27350R0(String str, InterfaceC9191l.a aVar, long j10, long j11) {
        this.f30452P0.m36717m(str, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p197k7.AbstractC9197r, p361t6.AbstractC11061l
    /* renamed from: S */
    public void mo27351S() {
        super.mo27351S();
        this.f30453Q0.mo36564d();
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: S0 */
    protected void mo27352S0(String str) {
        this.f30452P0.m36718n(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p197k7.AbstractC9197r, p361t6.AbstractC11061l
    /* renamed from: T */
    public void mo27353T() {
        m36656H1();
        this.f30453Q0.pause();
        super.mo27353T();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p197k7.AbstractC9197r
    /* renamed from: T0 */
    public C12084i mo27354T0(C11113v1 c11113v1) {
        this.f30456T0 = (C11108u1) C11137a.m34603e(c11113v1.f28853b);
        C12084i mo27354T0 = super.mo27354T0(c11113v1);
        this.f30452P0.m36721q(this.f30456T0, mo27354T0);
        return mo27354T0;
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: U0 */
    protected void mo27355U0(C11108u1 c11108u1, MediaFormat mediaFormat) {
        int i10;
        C11108u1 c11108u12 = this.f30457U0;
        int[] iArr = null;
        if (c11108u12 != null) {
            c11108u1 = c11108u12;
        } else if (m27375w0() != null) {
            C11108u1 m34526G = new C11108u1.b().m34552g0("audio/raw").m34546a0("audio/raw".equals(c11108u1.f28797w) ? c11108u1.f28778L : (C11172r0.f29040a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? C11172r0.m34915c0(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding")).m34535P(c11108u1.f28779M).m34536Q(c11108u1.f28780N).m34529J(mediaFormat.getInteger("channel-count")).m34553h0(mediaFormat.getInteger("sample-rate")).m34526G();
            if (this.f30455S0 && m34526G.f28776J == 6 && (i10 = c11108u1.f28776J) < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < c11108u1.f28776J; i11++) {
                    iArr[i11] = i11;
                }
            }
            c11108u1 = m34526G;
        }
        try {
            this.f30453Q0.mo36575o(c11108u1, 0, iArr);
        } catch (InterfaceC11673v.a e10) {
            throw m34234G(e10, e10.f30487a, 5001);
        }
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: V0 */
    protected void mo27356V0(long j10) {
        this.f30453Q0.m36722r(j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p197k7.AbstractC9197r
    /* renamed from: X0 */
    public void mo27358X0() {
        super.mo27358X0();
        this.f30453Q0.mo36578s();
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: Y0 */
    protected void mo27359Y0(C12082g c12082g) {
        if (!this.f30459W0 || c12082g.m38793r()) {
            return;
        }
        if (Math.abs(c12082g.f32144e - this.f30458V0) > 500000) {
            this.f30458V0 = c12082g.f32144e;
        }
        this.f30459W0 = false;
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: a0 */
    protected C12084i mo27360a0(C9195p c9195p, C11108u1 c11108u1, C11108u1 c11108u12) {
        C12084i m27287f = c9195p.m27287f(c11108u1, c11108u12);
        int i10 = m27287f.f32156e;
        if (m36654C1(c9195p, c11108u12) > this.f30454R0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new C12084i(c9195p.f22241a, c11108u1, c11108u12, i11 != 0 ? 0 : m27287f.f32155d, i11);
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: a1 */
    protected boolean mo27361a1(long j10, long j11, InterfaceC9191l interfaceC9191l, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, C11108u1 c11108u1) {
        C11137a.m34603e(byteBuffer);
        if (this.f30457U0 != null && (i11 & 2) != 0) {
            ((InterfaceC9191l) C11137a.m34603e(interfaceC9191l)).mo27147m(i10, false);
            return true;
        }
        if (z10) {
            if (interfaceC9191l != null) {
                interfaceC9191l.mo27147m(i10, false);
            }
            this.f22272J0.f32134f += i12;
            this.f30453Q0.mo36578s();
            return true;
        }
        try {
            if (!this.f30453Q0.mo36573m(byteBuffer, j12, i12)) {
                return false;
            }
            if (interfaceC9191l != null) {
                interfaceC9191l.mo27147m(i10, false);
            }
            this.f22272J0.f32133e += i12;
            return true;
        } catch (InterfaceC11673v.b e10) {
            throw m34235H(e10, this.f30456T0, e10.f30489b, 5001);
        } catch (InterfaceC11673v.e e11) {
            throw m34235H(e11, c11108u1, e11.f30494b, 5002);
        }
    }

    @Override // p363t8.InterfaceC11176u
    /* renamed from: b */
    public void mo34465b(C11047i3 c11047i3) {
        this.f30453Q0.mo36562b(c11047i3);
    }

    @Override // p363t8.InterfaceC11176u
    /* renamed from: c */
    public C11047i3 mo34466c() {
        return this.f30453Q0.mo36563c();
    }

    @Override // p197k7.AbstractC9197r, p361t6.InterfaceC11090q3
    /* renamed from: d */
    public boolean mo22835d() {
        return this.f30453Q0.mo36567g() || super.mo22835d();
    }

    @Override // p197k7.AbstractC9197r, p361t6.InterfaceC11090q3
    /* renamed from: e */
    public boolean mo22836e() {
        return super.mo22836e() && this.f30453Q0.mo36565e();
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: f1 */
    protected void mo27363f1() {
        try {
            this.f30453Q0.mo36576p();
        } catch (InterfaceC11673v.e e10) {
            throw m34235H(e10, e10.f30495c, e10.f30494b, 5002);
        }
    }

    @Override // p361t6.InterfaceC11090q3, p361t6.InterfaceC11095r3
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // p361t6.AbstractC11061l, p361t6.C11070m3.b
    /* renamed from: p */
    public void mo33992p(int i10, Object obj) {
        if (i10 == 2) {
            this.f30453Q0.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i10 == 3) {
            this.f30453Q0.mo36579t((C11639e) obj);
            return;
        }
        if (i10 == 6) {
            this.f30453Q0.mo36569i((C11679y) obj);
            return;
        }
        switch (i10) {
            case 9:
                this.f30453Q0.mo36581v(((Boolean) obj).booleanValue());
                return;
            case 10:
                this.f30453Q0.mo36568h(((Integer) obj).intValue());
                return;
            case 11:
                this.f30463a1 = (InterfaceC11090q3.a) obj;
                return;
            case 12:
                if (C11172r0.f29040a >= 23) {
                    b.m36662a(this.f30453Q0, obj);
                    return;
                }
                return;
            default:
                super.mo33992p(i10, obj);
                return;
        }
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: s1 */
    protected boolean mo27371s1(C11108u1 c11108u1) {
        return this.f30453Q0.mo36561a(c11108u1);
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: t1 */
    protected int mo27373t1(InterfaceC9199t interfaceC9199t, C11108u1 c11108u1) {
        boolean z10;
        if (!C11178w.m35007o(c11108u1.f28797w)) {
            return InterfaceC11095r3.m34459o(0);
        }
        int i10 = C11172r0.f29040a >= 21 ? 32 : 0;
        boolean z11 = true;
        boolean z12 = c11108u1.f28784R != 0;
        boolean m27336u1 = AbstractC9197r.m27336u1(c11108u1);
        int i11 = 8;
        if (m27336u1 && this.f30453Q0.mo36561a(c11108u1) && (!z12 || C9180c0.m27194v() != null)) {
            return InterfaceC11095r3.m34461v(4, 8, i10);
        }
        if ((!"audio/raw".equals(c11108u1.f28797w) || this.f30453Q0.mo36561a(c11108u1)) && this.f30453Q0.mo36561a(C11172r0.m34917d0(2, c11108u1.f28776J, c11108u1.f28777K))) {
            List<C9195p> m36655E1 = m36655E1(interfaceC9199t, c11108u1, false, this.f30453Q0);
            if (m36655E1.isEmpty()) {
                return InterfaceC11095r3.m34459o(1);
            }
            if (!m27336u1) {
                return InterfaceC11095r3.m34459o(2);
            }
            C9195p c9195p = m36655E1.get(0);
            boolean m27292o = c9195p.m27292o(c11108u1);
            if (!m27292o) {
                for (int i12 = 1; i12 < m36655E1.size(); i12++) {
                    C9195p c9195p2 = m36655E1.get(i12);
                    if (c9195p2.m27292o(c11108u1)) {
                        z10 = false;
                        c9195p = c9195p2;
                        break;
                    }
                }
            }
            z10 = true;
            z11 = m27292o;
            int i13 = z11 ? 4 : 3;
            if (z11 && c9195p.m27294r(c11108u1)) {
                i11 = 16;
            }
            return InterfaceC11095r3.m34456l(i13, i11, i10, c9195p.f22248h ? 64 : 0, z10 ? RecognitionOptions.ITF : 0);
        }
        return InterfaceC11095r3.m34459o(1);
    }

    @Override // p363t8.InterfaceC11176u
    /* renamed from: w */
    public long mo34472w() {
        if (getState() == 2) {
            m36656H1();
        }
        return this.f30458V0;
    }

    @Override // p197k7.AbstractC9197r
    /* renamed from: z0 */
    protected float mo27381z0(float f10, C11108u1 c11108u1, C11108u1[] c11108u1Arr) {
        int i10 = -1;
        for (C11108u1 c11108u12 : c11108u1Arr) {
            int i11 = c11108u12.f28777K;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return f10 * i10;
    }
}

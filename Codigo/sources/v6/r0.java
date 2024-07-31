package v6;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import java.util.List;
import k7.l;
import t6.i3;
import t6.q3;
import t6.r3;
import t6.u1;
import t6.v1;
import v6.u;
import v6.v;

/* loaded from: classes.dex */
public class r0 extends k7.r implements t8.u {
    private final Context O0;
    private final u.a P0;
    private final v Q0;
    private int R0;
    private boolean S0;
    private u1 T0;
    private u1 U0;
    private long V0;
    private boolean W0;
    private boolean X0;
    private boolean Y0;
    private boolean Z0;

    /* renamed from: a1, reason: collision with root package name */
    private q3.a f28101a1;

    /* loaded from: classes.dex */
    private static final class b {
        public static void a(v vVar, Object obj) {
            vVar.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    /* loaded from: classes.dex */
    private final class c implements v.c {
        private c() {
        }

        @Override // v6.v.c
        public void a(Exception exc) {
            t8.s.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            r0.this.P0.l(exc);
        }

        @Override // v6.v.c
        public void b(long j10) {
            r0.this.P0.B(j10);
        }

        @Override // v6.v.c
        public void c() {
            if (r0.this.f28101a1 != null) {
                r0.this.f28101a1.a();
            }
        }

        @Override // v6.v.c
        public void d(int i10, long j10, long j11) {
            r0.this.P0.D(i10, j10, j11);
        }

        @Override // v6.v.c
        public void e() {
            r0.this.G1();
        }

        @Override // v6.v.c
        public void f() {
            if (r0.this.f28101a1 != null) {
                r0.this.f28101a1.b();
            }
        }

        @Override // v6.v.c
        public void onSkipSilenceEnabledChanged(boolean z10) {
            r0.this.P0.C(z10);
        }
    }

    public r0(Context context, l.b bVar, k7.t tVar, boolean z10, Handler handler, u uVar, v vVar) {
        super(1, bVar, tVar, z10, 44100.0f);
        this.O0 = context.getApplicationContext();
        this.Q0 = vVar;
        this.P0 = new u.a(handler, uVar);
        vVar.f(new c());
    }

    private static boolean A1(String str) {
        if (t8.r0.f26744a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(t8.r0.f26746c)) {
            String str2 = t8.r0.f26745b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private static boolean B1() {
        if (t8.r0.f26744a == 23) {
            String str = t8.r0.f26747d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int C1(k7.p pVar, u1 u1Var) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(pVar.f20459a) || (i10 = t8.r0.f26744a) >= 24 || (i10 == 23 && t8.r0.x0(this.O0))) {
            return u1Var.f26518x;
        }
        return -1;
    }

    private static List<k7.p> E1(k7.t tVar, u1 u1Var, boolean z10, v vVar) {
        k7.p v10;
        String str = u1Var.f26517w;
        if (str == null) {
            return com.google.common.collect.w.v();
        }
        if (vVar.a(u1Var) && (v10 = k7.c0.v()) != null) {
            return com.google.common.collect.w.w(v10);
        }
        List<k7.p> a10 = tVar.a(str, z10, false);
        String m10 = k7.c0.m(u1Var);
        return m10 == null ? com.google.common.collect.w.r(a10) : com.google.common.collect.w.p().j(a10).j(tVar.a(m10, z10, false)).k();
    }

    private void H1() {
        long q10 = this.Q0.q(e());
        if (q10 != Long.MIN_VALUE) {
            if (!this.X0) {
                q10 = Math.max(this.V0, q10);
            }
            this.V0 = q10;
            this.X0 = false;
        }
    }

    @Override // k7.r
    protected List<k7.p> B0(k7.t tVar, u1 u1Var, boolean z10) {
        return k7.c0.u(E1(tVar, u1Var, z10, this.Q0), u1Var);
    }

    @Override // k7.r
    protected l.a D0(k7.p pVar, u1 u1Var, MediaCrypto mediaCrypto, float f10) {
        this.R0 = D1(pVar, u1Var, M());
        this.S0 = A1(pVar.f20459a);
        MediaFormat F1 = F1(u1Var, pVar.f20461c, this.R0, f10);
        this.U0 = "audio/raw".equals(pVar.f20460b) && !"audio/raw".equals(u1Var.f26517w) ? u1Var : null;
        return l.a.a(pVar, F1, u1Var, mediaCrypto);
    }

    protected int D1(k7.p pVar, u1 u1Var, u1[] u1VarArr) {
        int C1 = C1(pVar, u1Var);
        if (u1VarArr.length == 1) {
            return C1;
        }
        for (u1 u1Var2 : u1VarArr) {
            if (pVar.f(u1Var, u1Var2).f29692d != 0) {
                C1 = Math.max(C1, C1(pVar, u1Var2));
            }
        }
        return C1;
    }

    @Override // t6.l, t6.q3
    public t8.u E() {
        return this;
    }

    protected MediaFormat F1(u1 u1Var, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", u1Var.J);
        mediaFormat.setInteger("sample-rate", u1Var.K);
        t8.v.e(mediaFormat, u1Var.f26519y);
        t8.v.d(mediaFormat, "max-input-size", i10);
        int i11 = t8.r0.f26744a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f && !B1()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(u1Var.f26517w)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.Q0.l(t8.r0.d0(4, u1Var.J, u1Var.K)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i11 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        return mediaFormat;
    }

    protected void G1() {
        this.X0 = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.r, t6.l
    public void O() {
        this.Y0 = true;
        this.T0 = null;
        try {
            this.Q0.flush();
            try {
                super.O();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.O();
                throw th2;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.r, t6.l
    public void P(boolean z10, boolean z11) {
        super.P(z10, z11);
        this.P0.p(this.J0);
        if (I().f26463a) {
            this.Q0.u();
        } else {
            this.Q0.j();
        }
        this.Q0.k(L());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.r, t6.l
    public void Q(long j10, boolean z10) {
        super.Q(j10, z10);
        if (this.Z0) {
            this.Q0.n();
        } else {
            this.Q0.flush();
        }
        this.V0 = j10;
        this.W0 = true;
        this.X0 = true;
    }

    @Override // k7.r
    protected void Q0(Exception exc) {
        t8.s.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.P0.k(exc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.r, t6.l
    public void R() {
        try {
            super.R();
        } finally {
            if (this.Y0) {
                this.Y0 = false;
                this.Q0.reset();
            }
        }
    }

    @Override // k7.r
    protected void R0(String str, l.a aVar, long j10, long j11) {
        this.P0.m(str, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.r, t6.l
    public void S() {
        super.S();
        this.Q0.d();
    }

    @Override // k7.r
    protected void S0(String str) {
        this.P0.n(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.r, t6.l
    public void T() {
        H1();
        this.Q0.pause();
        super.T();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.r
    public w6.i T0(v1 v1Var) {
        this.T0 = (u1) t8.a.e(v1Var.f26567b);
        w6.i T0 = super.T0(v1Var);
        this.P0.q(this.T0, T0);
        return T0;
    }

    @Override // k7.r
    protected void U0(u1 u1Var, MediaFormat mediaFormat) {
        int i10;
        u1 u1Var2 = this.U0;
        int[] iArr = null;
        if (u1Var2 != null) {
            u1Var = u1Var2;
        } else if (w0() != null) {
            u1 G = new u1.b().g0("audio/raw").a0("audio/raw".equals(u1Var.f26517w) ? u1Var.L : (t8.r0.f26744a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? t8.r0.c0(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding")).P(u1Var.M).Q(u1Var.N).J(mediaFormat.getInteger("channel-count")).h0(mediaFormat.getInteger("sample-rate")).G();
            if (this.S0 && G.J == 6 && (i10 = u1Var.J) < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < u1Var.J; i11++) {
                    iArr[i11] = i11;
                }
            }
            u1Var = G;
        }
        try {
            this.Q0.o(u1Var, 0, iArr);
        } catch (v.a e10) {
            throw G(e10, e10.f28125a, 5001);
        }
    }

    @Override // k7.r
    protected void V0(long j10) {
        this.Q0.r(j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.r
    public void X0() {
        super.X0();
        this.Q0.s();
    }

    @Override // k7.r
    protected void Y0(w6.g gVar) {
        if (!this.W0 || gVar.r()) {
            return;
        }
        if (Math.abs(gVar.f29681e - this.V0) > 500000) {
            this.V0 = gVar.f29681e;
        }
        this.W0 = false;
    }

    @Override // k7.r
    protected w6.i a0(k7.p pVar, u1 u1Var, u1 u1Var2) {
        w6.i f10 = pVar.f(u1Var, u1Var2);
        int i10 = f10.f29693e;
        if (C1(pVar, u1Var2) > this.R0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new w6.i(pVar.f20459a, u1Var, u1Var2, i11 != 0 ? 0 : f10.f29692d, i11);
    }

    @Override // k7.r
    protected boolean a1(long j10, long j11, k7.l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, u1 u1Var) {
        t8.a.e(byteBuffer);
        if (this.U0 != null && (i11 & 2) != 0) {
            ((k7.l) t8.a.e(lVar)).m(i10, false);
            return true;
        }
        if (z10) {
            if (lVar != null) {
                lVar.m(i10, false);
            }
            this.J0.f29671f += i12;
            this.Q0.s();
            return true;
        }
        try {
            if (!this.Q0.m(byteBuffer, j12, i12)) {
                return false;
            }
            if (lVar != null) {
                lVar.m(i10, false);
            }
            this.J0.f29670e += i12;
            return true;
        } catch (v.b e10) {
            throw H(e10, this.T0, e10.f28127b, 5001);
        } catch (v.e e11) {
            throw H(e11, u1Var, e11.f28132b, 5002);
        }
    }

    @Override // t8.u
    public void b(i3 i3Var) {
        this.Q0.b(i3Var);
    }

    @Override // t8.u
    public i3 c() {
        return this.Q0.c();
    }

    @Override // k7.r, t6.q3
    public boolean d() {
        return this.Q0.g() || super.d();
    }

    @Override // k7.r, t6.q3
    public boolean e() {
        return super.e() && this.Q0.e();
    }

    @Override // k7.r
    protected void f1() {
        try {
            this.Q0.p();
        } catch (v.e e10) {
            throw H(e10, e10.f28133c, e10.f28132b, 5002);
        }
    }

    @Override // t6.q3, t6.r3
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // t6.l, t6.m3.b
    public void p(int i10, Object obj) {
        if (i10 == 2) {
            this.Q0.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i10 == 3) {
            this.Q0.t((e) obj);
            return;
        }
        if (i10 == 6) {
            this.Q0.i((y) obj);
            return;
        }
        switch (i10) {
            case 9:
                this.Q0.v(((Boolean) obj).booleanValue());
                return;
            case 10:
                this.Q0.h(((Integer) obj).intValue());
                return;
            case 11:
                this.f28101a1 = (q3.a) obj;
                return;
            case 12:
                if (t8.r0.f26744a >= 23) {
                    b.a(this.Q0, obj);
                    return;
                }
                return;
            default:
                super.p(i10, obj);
                return;
        }
    }

    @Override // k7.r
    protected boolean s1(u1 u1Var) {
        return this.Q0.a(u1Var);
    }

    @Override // k7.r
    protected int t1(k7.t tVar, u1 u1Var) {
        boolean z10;
        if (!t8.w.o(u1Var.f26517w)) {
            return r3.o(0);
        }
        int i10 = t8.r0.f26744a >= 21 ? 32 : 0;
        boolean z11 = true;
        boolean z12 = u1Var.R != 0;
        boolean u12 = k7.r.u1(u1Var);
        int i11 = 8;
        if (u12 && this.Q0.a(u1Var) && (!z12 || k7.c0.v() != null)) {
            return r3.v(4, 8, i10);
        }
        if ((!"audio/raw".equals(u1Var.f26517w) || this.Q0.a(u1Var)) && this.Q0.a(t8.r0.d0(2, u1Var.J, u1Var.K))) {
            List<k7.p> E1 = E1(tVar, u1Var, false, this.Q0);
            if (E1.isEmpty()) {
                return r3.o(1);
            }
            if (!u12) {
                return r3.o(2);
            }
            k7.p pVar = E1.get(0);
            boolean o10 = pVar.o(u1Var);
            if (!o10) {
                for (int i12 = 1; i12 < E1.size(); i12++) {
                    k7.p pVar2 = E1.get(i12);
                    if (pVar2.o(u1Var)) {
                        z10 = false;
                        pVar = pVar2;
                        break;
                    }
                }
            }
            z10 = true;
            z11 = o10;
            int i13 = z11 ? 4 : 3;
            if (z11 && pVar.r(u1Var)) {
                i11 = 16;
            }
            return r3.l(i13, i11, i10, pVar.f20466h ? 64 : 0, z10 ? RecognitionOptions.ITF : 0);
        }
        return r3.o(1);
    }

    @Override // t8.u
    public long w() {
        if (getState() == 2) {
            H1();
        }
        return this.V0;
    }

    @Override // k7.r
    protected float z0(float f10, u1 u1Var, u1[] u1VarArr) {
        int i10 = -1;
        for (u1 u1Var2 : u1VarArr) {
            int i11 = u1Var2.K;
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

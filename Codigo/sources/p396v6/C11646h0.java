package p396v6;

import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import p361t6.C11047i3;
import p361t6.C11108u1;
import p361t6.InterfaceC11126y;
import p363t8.C11137a;
import p363t8.C11149g;
import p363t8.C11172r0;
import p363t8.C11173s;
import p363t8.C11178w;
import p363t8.InterfaceC11143d;
import p376u6.C11391m3;
import p396v6.C11660o0;
import p396v6.C11677x;
import p396v6.InterfaceC11647i;
import p396v6.InterfaceC11673v;

/* renamed from: v6.h0 */
/* loaded from: classes.dex */
public final class C11646h0 implements InterfaceC11673v {

    /* renamed from: e0 */
    public static boolean f30315e0 = false;

    /* renamed from: f0 */
    private static final Object f30316f0 = new Object();

    /* renamed from: g0 */
    private static ExecutorService f30317g0;

    /* renamed from: h0 */
    private static int f30318h0;

    /* renamed from: A */
    private ByteBuffer f30319A;

    /* renamed from: B */
    private int f30320B;

    /* renamed from: C */
    private long f30321C;

    /* renamed from: D */
    private long f30322D;

    /* renamed from: E */
    private long f30323E;

    /* renamed from: F */
    private long f30324F;

    /* renamed from: G */
    private int f30325G;

    /* renamed from: H */
    private boolean f30326H;

    /* renamed from: I */
    private boolean f30327I;

    /* renamed from: J */
    private long f30328J;

    /* renamed from: K */
    private float f30329K;

    /* renamed from: L */
    private InterfaceC11647i[] f30330L;

    /* renamed from: M */
    private ByteBuffer[] f30331M;

    /* renamed from: N */
    private ByteBuffer f30332N;

    /* renamed from: O */
    private int f30333O;

    /* renamed from: P */
    private ByteBuffer f30334P;

    /* renamed from: Q */
    private byte[] f30335Q;

    /* renamed from: R */
    private int f30336R;

    /* renamed from: S */
    private int f30337S;

    /* renamed from: T */
    private boolean f30338T;

    /* renamed from: U */
    private boolean f30339U;

    /* renamed from: V */
    private boolean f30340V;

    /* renamed from: W */
    private boolean f30341W;

    /* renamed from: X */
    private int f30342X;

    /* renamed from: Y */
    private C11679y f30343Y;

    /* renamed from: Z */
    private d f30344Z;

    /* renamed from: a */
    private final C11645h f30345a;

    /* renamed from: a0 */
    private boolean f30346a0;

    /* renamed from: b */
    private final InterfaceC11649j f30347b;

    /* renamed from: b0 */
    private long f30348b0;

    /* renamed from: c */
    private final boolean f30349c;

    /* renamed from: c0 */
    private boolean f30350c0;

    /* renamed from: d */
    private final C11632a0 f30351d;

    /* renamed from: d0 */
    private boolean f30352d0;

    /* renamed from: e */
    private final C11680y0 f30353e;

    /* renamed from: f */
    private final InterfaceC11647i[] f30354f;

    /* renamed from: g */
    private final InterfaceC11647i[] f30355g;

    /* renamed from: h */
    private final C11149g f30356h;

    /* renamed from: i */
    private final C11677x f30357i;

    /* renamed from: j */
    private final ArrayDeque<j> f30358j;

    /* renamed from: k */
    private final boolean f30359k;

    /* renamed from: l */
    private final int f30360l;

    /* renamed from: m */
    private m f30361m;

    /* renamed from: n */
    private final k<InterfaceC11673v.b> f30362n;

    /* renamed from: o */
    private final k<InterfaceC11673v.e> f30363o;

    /* renamed from: p */
    private final e f30364p;

    /* renamed from: q */
    private final InterfaceC11126y.a f30365q;

    /* renamed from: r */
    private C11391m3 f30366r;

    /* renamed from: s */
    private InterfaceC11673v.c f30367s;

    /* renamed from: t */
    private g f30368t;

    /* renamed from: u */
    private g f30369u;

    /* renamed from: v */
    private AudioTrack f30370v;

    /* renamed from: w */
    private C11639e f30371w;

    /* renamed from: x */
    private j f30372x;

    /* renamed from: y */
    private j f30373y;

    /* renamed from: z */
    private C11047i3 f30374z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v6.h0$b */
    /* loaded from: classes.dex */
    public static final class b {
        /* renamed from: a */
        public static void m36582a(AudioTrack audioTrack, d dVar) {
            audioTrack.setPreferredDevice(dVar == null ? null : dVar.f30375a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v6.h0$c */
    /* loaded from: classes.dex */
    public static final class c {
        /* renamed from: a */
        public static void m36583a(AudioTrack audioTrack, C11391m3 c11391m3) {
            LogSessionId logSessionId;
            boolean equals;
            LogSessionId m35573a = c11391m3.m35573a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = m35573a.equals(logSessionId);
            if (equals) {
                return;
            }
            audioTrack.setLogSessionId(m35573a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v6.h0$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final AudioDeviceInfo f30375a;

        public d(AudioDeviceInfo audioDeviceInfo) {
            this.f30375a = audioDeviceInfo;
        }
    }

    /* renamed from: v6.h0$e */
    /* loaded from: classes.dex */
    public interface e {

        /* renamed from: a */
        public static final e f30376a = new C11660o0.a().m36643g();

        /* renamed from: a */
        int mo36584a(int i10, int i11, int i12, int i13, int i14, int i15, double d10);
    }

    /* renamed from: v6.h0$f */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: b */
        private InterfaceC11649j f30378b;

        /* renamed from: c */
        private boolean f30379c;

        /* renamed from: d */
        private boolean f30380d;

        /* renamed from: g */
        InterfaceC11126y.a f30383g;

        /* renamed from: a */
        private C11645h f30377a = C11645h.f30309c;

        /* renamed from: e */
        private int f30381e = 0;

        /* renamed from: f */
        e f30382f = e.f30376a;

        /* renamed from: f */
        public C11646h0 m36590f() {
            if (this.f30378b == null) {
                this.f30378b = new h(new InterfaceC11647i[0]);
            }
            return new C11646h0(this);
        }

        /* renamed from: g */
        public f m36591g(C11645h c11645h) {
            C11137a.m34603e(c11645h);
            this.f30377a = c11645h;
            return this;
        }

        /* renamed from: h */
        public f m36592h(boolean z10) {
            this.f30380d = z10;
            return this;
        }

        /* renamed from: i */
        public f m36593i(boolean z10) {
            this.f30379c = z10;
            return this;
        }

        /* renamed from: j */
        public f m36594j(int i10) {
            this.f30381e = i10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v6.h0$g */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a */
        public final C11108u1 f30384a;

        /* renamed from: b */
        public final int f30385b;

        /* renamed from: c */
        public final int f30386c;

        /* renamed from: d */
        public final int f30387d;

        /* renamed from: e */
        public final int f30388e;

        /* renamed from: f */
        public final int f30389f;

        /* renamed from: g */
        public final int f30390g;

        /* renamed from: h */
        public final int f30391h;

        /* renamed from: i */
        public final InterfaceC11647i[] f30392i;

        public g(C11108u1 c11108u1, int i10, int i11, int i12, int i13, int i14, int i15, int i16, InterfaceC11647i[] interfaceC11647iArr) {
            this.f30384a = c11108u1;
            this.f30385b = i10;
            this.f30386c = i11;
            this.f30387d = i12;
            this.f30388e = i13;
            this.f30389f = i14;
            this.f30390g = i15;
            this.f30391h = i16;
            this.f30392i = interfaceC11647iArr;
        }

        /* renamed from: d */
        private AudioTrack m36595d(boolean z10, C11639e c11639e, int i10) {
            int i11 = C11172r0.f29040a;
            return i11 >= 29 ? m36597f(z10, c11639e, i10) : i11 >= 21 ? m36596e(z10, c11639e, i10) : m36598g(c11639e, i10);
        }

        /* renamed from: e */
        private AudioTrack m36596e(boolean z10, C11639e c11639e, int i10) {
            return new AudioTrack(m36599i(c11639e, z10), C11646h0.m36525L(this.f30388e, this.f30389f, this.f30390g), this.f30391h, 1, i10);
        }

        /* renamed from: f */
        private AudioTrack m36597f(boolean z10, C11639e c11639e, int i10) {
            AudioTrack.Builder offloadedPlayback;
            offloadedPlayback = new AudioTrack.Builder().setAudioAttributes(m36599i(c11639e, z10)).setAudioFormat(C11646h0.m36525L(this.f30388e, this.f30389f, this.f30390g)).setTransferMode(1).setBufferSizeInBytes(this.f30391h).setSessionId(i10).setOffloadedPlayback(this.f30386c == 1);
            return offloadedPlayback.build();
        }

        /* renamed from: g */
        private AudioTrack m36598g(C11639e c11639e, int i10) {
            int m34923g0 = C11172r0.m34923g0(c11639e.f30297c);
            int i11 = this.f30388e;
            int i12 = this.f30389f;
            int i13 = this.f30390g;
            int i14 = this.f30391h;
            return i10 == 0 ? new AudioTrack(m34923g0, i11, i12, i13, i14, 1) : new AudioTrack(m34923g0, i11, i12, i13, i14, 1, i10);
        }

        /* renamed from: i */
        private static AudioAttributes m36599i(C11639e c11639e, boolean z10) {
            return z10 ? m36600j() : c11639e.m36490c().f30301a;
        }

        /* renamed from: j */
        private static AudioAttributes m36600j() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        /* renamed from: a */
        public AudioTrack m36601a(boolean z10, C11639e c11639e, int i10) {
            try {
                AudioTrack m36595d = m36595d(z10, c11639e, i10);
                int state = m36595d.getState();
                if (state == 1) {
                    return m36595d;
                }
                try {
                    m36595d.release();
                } catch (Exception unused) {
                }
                throw new InterfaceC11673v.b(state, this.f30388e, this.f30389f, this.f30391h, this.f30384a, m36606l(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                throw new InterfaceC11673v.b(0, this.f30388e, this.f30389f, this.f30391h, this.f30384a, m36606l(), e10);
            }
        }

        /* renamed from: b */
        public boolean m36602b(g gVar) {
            return gVar.f30386c == this.f30386c && gVar.f30390g == this.f30390g && gVar.f30388e == this.f30388e && gVar.f30389f == this.f30389f && gVar.f30387d == this.f30387d;
        }

        /* renamed from: c */
        public g m36603c(int i10) {
            return new g(this.f30384a, this.f30385b, this.f30386c, this.f30387d, this.f30388e, this.f30389f, this.f30390g, i10, this.f30392i);
        }

        /* renamed from: h */
        public long m36604h(long j10) {
            return (j10 * 1000000) / this.f30388e;
        }

        /* renamed from: k */
        public long m36605k(long j10) {
            return (j10 * 1000000) / this.f30384a.f28777K;
        }

        /* renamed from: l */
        public boolean m36606l() {
            return this.f30386c == 1;
        }
    }

    /* renamed from: v6.h0$h */
    /* loaded from: classes.dex */
    public static class h implements InterfaceC11649j {

        /* renamed from: a */
        private final InterfaceC11647i[] f30393a;

        /* renamed from: b */
        private final C11674v0 f30394b;

        /* renamed from: c */
        private final C11678x0 f30395c;

        public h(InterfaceC11647i... interfaceC11647iArr) {
            this(interfaceC11647iArr, new C11674v0(), new C11678x0());
        }

        public h(InterfaceC11647i[] interfaceC11647iArr, C11674v0 c11674v0, C11678x0 c11678x0) {
            InterfaceC11647i[] interfaceC11647iArr2 = new InterfaceC11647i[interfaceC11647iArr.length + 2];
            this.f30393a = interfaceC11647iArr2;
            System.arraycopy(interfaceC11647iArr, 0, interfaceC11647iArr2, 0, interfaceC11647iArr.length);
            this.f30394b = c11674v0;
            this.f30395c = c11678x0;
            interfaceC11647iArr2[interfaceC11647iArr.length] = c11674v0;
            interfaceC11647iArr2[interfaceC11647iArr.length + 1] = c11678x0;
        }

        @Override // p396v6.InterfaceC11649j
        /* renamed from: a */
        public long mo36607a(long j10) {
            return this.f30395c.m36791g(j10);
        }

        @Override // p396v6.InterfaceC11649j
        /* renamed from: b */
        public InterfaceC11647i[] mo36608b() {
            return this.f30393a;
        }

        @Override // p396v6.InterfaceC11649j
        /* renamed from: c */
        public C11047i3 mo36609c(C11047i3 c11047i3) {
            this.f30395c.m36793i(c11047i3.f28428a);
            this.f30395c.m36792h(c11047i3.f28429b);
            return c11047i3;
        }

        @Override // p396v6.InterfaceC11649j
        /* renamed from: d */
        public long mo36610d() {
            return this.f30394b.m36733p();
        }

        @Override // p396v6.InterfaceC11649j
        /* renamed from: e */
        public boolean mo36611e(boolean z10) {
            this.f30394b.m36734v(z10);
            return z10;
        }
    }

    /* renamed from: v6.h0$i */
    /* loaded from: classes.dex */
    public static final class i extends RuntimeException {
        private i(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v6.h0$j */
    /* loaded from: classes.dex */
    public static final class j {

        /* renamed from: a */
        public final C11047i3 f30396a;

        /* renamed from: b */
        public final boolean f30397b;

        /* renamed from: c */
        public final long f30398c;

        /* renamed from: d */
        public final long f30399d;

        private j(C11047i3 c11047i3, boolean z10, long j10, long j11) {
            this.f30396a = c11047i3;
            this.f30397b = z10;
            this.f30398c = j10;
            this.f30399d = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v6.h0$k */
    /* loaded from: classes.dex */
    public static final class k<T extends Exception> {

        /* renamed from: a */
        private final long f30400a;

        /* renamed from: b */
        private T f30401b;

        /* renamed from: c */
        private long f30402c;

        public k(long j10) {
            this.f30400a = j10;
        }

        /* renamed from: a */
        public void m36612a() {
            this.f30401b = null;
        }

        /* renamed from: b */
        public void m36613b(T t10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f30401b == null) {
                this.f30401b = t10;
                this.f30402c = this.f30400a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f30402c) {
                T t11 = this.f30401b;
                if (t11 != t10) {
                    t11.addSuppressed(t10);
                }
                T t12 = this.f30401b;
                m36612a();
                throw t12;
            }
        }
    }

    /* renamed from: v6.h0$l */
    /* loaded from: classes.dex */
    private final class l implements C11677x.a {
        private l() {
        }

        @Override // p396v6.C11677x.a
        /* renamed from: a */
        public void mo36614a(int i10, long j10) {
            if (C11646h0.this.f30367s != null) {
                C11646h0.this.f30367s.mo36666d(i10, j10, SystemClock.elapsedRealtime() - C11646h0.this.f30348b0);
            }
        }

        @Override // p396v6.C11677x.a
        /* renamed from: b */
        public void mo36615b(long j10) {
            if (C11646h0.this.f30367s != null) {
                C11646h0.this.f30367s.mo36664b(j10);
            }
        }

        @Override // p396v6.C11677x.a
        /* renamed from: c */
        public void mo36616c(long j10) {
            C11173s.m34970i("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // p396v6.C11677x.a
        /* renamed from: d */
        public void mo36617d(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + C11646h0.this.m36531S() + ", " + C11646h0.this.m36532T();
            if (C11646h0.f30315e0) {
                throw new i(str);
            }
            C11173s.m34970i("DefaultAudioSink", str);
        }

        @Override // p396v6.C11677x.a
        /* renamed from: e */
        public void mo36618e(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + C11646h0.this.m36531S() + ", " + C11646h0.this.m36532T();
            if (C11646h0.f30315e0) {
                throw new i(str);
            }
            C11173s.m34970i("DefaultAudioSink", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v6.h0$m */
    /* loaded from: classes.dex */
    public final class m {

        /* renamed from: a */
        private final Handler f30404a = new Handler(Looper.myLooper());

        /* renamed from: b */
        private final AudioTrack.StreamEventCallback f30405b;

        /* renamed from: v6.h0$m$a */
        /* loaded from: classes.dex */
        class a extends AudioTrack.StreamEventCallback {

            /* renamed from: a */
            final /* synthetic */ C11646h0 f30407a;

            a(C11646h0 c11646h0) {
                this.f30407a = c11646h0;
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i10) {
                if (audioTrack.equals(C11646h0.this.f30370v) && C11646h0.this.f30367s != null && C11646h0.this.f30340V) {
                    C11646h0.this.f30367s.mo36668f();
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(C11646h0.this.f30370v) && C11646h0.this.f30367s != null && C11646h0.this.f30340V) {
                    C11646h0.this.f30367s.mo36668f();
                }
            }
        }

        public m() {
            this.f30405b = new a(C11646h0.this);
        }

        /* renamed from: a */
        public void m36619a(AudioTrack audioTrack) {
            Handler handler = this.f30404a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new ExecutorC11658n0(handler), this.f30405b);
        }

        /* renamed from: b */
        public void m36620b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f30405b);
            this.f30404a.removeCallbacksAndMessages(null);
        }
    }

    private C11646h0(f fVar) {
        this.f30345a = fVar.f30377a;
        InterfaceC11649j interfaceC11649j = fVar.f30378b;
        this.f30347b = interfaceC11649j;
        int i10 = C11172r0.f29040a;
        this.f30349c = i10 >= 21 && fVar.f30379c;
        this.f30359k = i10 >= 23 && fVar.f30380d;
        this.f30360l = i10 >= 29 ? fVar.f30381e : 0;
        this.f30364p = fVar.f30382f;
        C11149g c11149g = new C11149g(InterfaceC11143d.f28940a);
        this.f30356h = c11149g;
        c11149g.m34721e();
        this.f30357i = new C11677x(new l());
        C11632a0 c11632a0 = new C11632a0();
        this.f30351d = c11632a0;
        C11680y0 c11680y0 = new C11680y0();
        this.f30353e = c11680y0;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C11672u0(), c11632a0, c11680y0);
        Collections.addAll(arrayList, interfaceC11649j.mo36608b());
        this.f30354f = (InterfaceC11647i[]) arrayList.toArray(new InterfaceC11647i[0]);
        this.f30355g = new InterfaceC11647i[]{new C11664q0()};
        this.f30329K = 1.0f;
        this.f30371w = C11639e.f30288r;
        this.f30342X = 0;
        this.f30343Y = new C11679y(0, 0.0f);
        C11047i3 c11047i3 = C11047i3.f28424d;
        this.f30373y = new j(c11047i3, false, 0L, 0L);
        this.f30374z = c11047i3;
        this.f30337S = -1;
        this.f30330L = new InterfaceC11647i[0];
        this.f30331M = new ByteBuffer[0];
        this.f30358j = new ArrayDeque<>();
        this.f30362n = new k<>(100L);
        this.f30363o = new k<>(100L);
        this.f30365q = fVar.f30383g;
    }

    /* renamed from: E */
    private void m36518E(long j10) {
        C11047i3 mo36609c = m36550l0() ? this.f30347b.mo36609c(m36526M()) : C11047i3.f28424d;
        boolean mo36611e = m36550l0() ? this.f30347b.mo36611e(m36560R()) : false;
        this.f30358j.add(new j(mo36609c, mo36611e, Math.max(0L, j10), this.f30369u.m36604h(m36532T())));
        m36549k0();
        InterfaceC11673v.c cVar = this.f30367s;
        if (cVar != null) {
            cVar.onSkipSilenceEnabledChanged(mo36611e);
        }
    }

    /* renamed from: F */
    private long m36519F(long j10) {
        while (!this.f30358j.isEmpty() && j10 >= this.f30358j.getFirst().f30399d) {
            this.f30373y = this.f30358j.remove();
        }
        j jVar = this.f30373y;
        long j11 = j10 - jVar.f30399d;
        if (jVar.f30396a.equals(C11047i3.f28424d)) {
            return this.f30373y.f30398c + j11;
        }
        if (this.f30358j.isEmpty()) {
            return this.f30373y.f30398c + this.f30347b.mo36607a(j11);
        }
        j first = this.f30358j.getFirst();
        return first.f30398c - C11172r0.m34909a0(first.f30399d - j10, this.f30373y.f30396a.f28428a);
    }

    /* renamed from: G */
    private long m36520G(long j10) {
        return j10 + this.f30369u.m36604h(this.f30347b.mo36610d());
    }

    /* renamed from: H */
    private AudioTrack m36521H(g gVar) {
        try {
            AudioTrack m36601a = gVar.m36601a(this.f30346a0, this.f30371w, this.f30342X);
            InterfaceC11126y.a aVar = this.f30365q;
            if (aVar != null) {
                aVar.m34576z(m36536X(m36601a));
            }
            return m36601a;
        } catch (InterfaceC11673v.b e10) {
            InterfaceC11673v.c cVar = this.f30367s;
            if (cVar != null) {
                cVar.mo36663a(e10);
            }
            throw e10;
        }
    }

    /* renamed from: I */
    private AudioTrack m36522I() {
        try {
            return m36521H((g) C11137a.m34603e(this.f30369u));
        } catch (InterfaceC11673v.b e10) {
            g gVar = this.f30369u;
            if (gVar.f30391h > 1000000) {
                g m36603c = gVar.m36603c(1000000);
                try {
                    AudioTrack m36521H = m36521H(m36603c);
                    this.f30369u = m36603c;
                    return m36521H;
                } catch (InterfaceC11673v.b e11) {
                    e10.addSuppressed(e11);
                    m36538Z();
                    throw e10;
                }
            }
            m36538Z();
            throw e10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m36523J() {
        /*
            r9 = this;
            int r0 = r9.f30337S
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.f30337S = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.f30337S
            v6.i[] r5 = r9.f30330L
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.mo36625f()
        L1f:
            r9.m36540b0(r7)
            boolean r0 = r4.mo36624e()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.f30337S
            int r0 = r0 + r1
            r9.f30337S = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.f30334P
            if (r0 == 0) goto L3b
            r9.m36553o0(r0, r7)
            java.nio.ByteBuffer r0 = r9.f30334P
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.f30337S = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p396v6.C11646h0.m36523J():boolean");
    }

    /* renamed from: K */
    private void m36524K() {
        int i10 = 0;
        while (true) {
            InterfaceC11647i[] interfaceC11647iArr = this.f30330L;
            if (i10 >= interfaceC11647iArr.length) {
                return;
            }
            InterfaceC11647i interfaceC11647i = interfaceC11647iArr[i10];
            interfaceC11647i.flush();
            this.f30331M[i10] = interfaceC11647i.mo36622b();
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static AudioFormat m36525L(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    /* renamed from: M */
    private C11047i3 m36526M() {
        return m36529P().f30396a;
    }

    /* renamed from: N */
    private static int m36527N(int i10, int i11, int i12) {
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        C11137a.m34605g(minBufferSize != -2);
        return minBufferSize;
    }

    /* renamed from: O */
    private static int m36528O(int i10, ByteBuffer byteBuffer) {
        switch (i10) {
            case 5:
            case 6:
            case 18:
                return C11633b.m36473e(byteBuffer);
            case 7:
            case 8:
                return C11662p0.m36648e(byteBuffer);
            case 9:
                int m36681m = C11668s0.m36681m(C11172r0.m34872I(byteBuffer, byteBuffer.position()));
                if (m36681m != -1) {
                    return m36681m;
                }
                throw new IllegalArgumentException();
            case 10:
                return RecognitionOptions.UPC_E;
            case 11:
            case 12:
                return RecognitionOptions.PDF417;
            case 13:
            case 19:
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i10);
            case 14:
                int m36470b = C11633b.m36470b(byteBuffer);
                if (m36470b == -1) {
                    return 0;
                }
                return C11633b.m36477i(byteBuffer, m36470b) * 16;
            case 15:
                return RecognitionOptions.UPC_A;
            case 16:
                return RecognitionOptions.UPC_E;
            case 17:
                return C11635c.m36482c(byteBuffer);
            case 20:
                return C11670t0.m36689g(byteBuffer);
        }
    }

    /* renamed from: P */
    private j m36529P() {
        j jVar = this.f30372x;
        return jVar != null ? jVar : !this.f30358j.isEmpty() ? this.f30358j.getLast() : this.f30373y;
    }

    /* renamed from: Q */
    private int m36530Q(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        boolean isOffloadedPlaybackSupported;
        int playbackOffloadSupport;
        int i10 = C11172r0.f29040a;
        if (i10 >= 31) {
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            return playbackOffloadSupport;
        }
        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
        if (isOffloadedPlaybackSupported) {
            return (i10 == 30 && C11172r0.f29043d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public long m36531S() {
        return this.f30369u.f30386c == 0 ? this.f30321C / r0.f30385b : this.f30322D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public long m36532T() {
        return this.f30369u.f30386c == 0 ? this.f30323E / r0.f30387d : this.f30324F;
    }

    /* renamed from: U */
    private boolean m36533U() {
        C11391m3 c11391m3;
        if (!this.f30356h.m34720d()) {
            return false;
        }
        AudioTrack m36522I = m36522I();
        this.f30370v = m36522I;
        if (m36536X(m36522I)) {
            m36541c0(this.f30370v);
            if (this.f30360l != 3) {
                AudioTrack audioTrack = this.f30370v;
                C11108u1 c11108u1 = this.f30369u.f30384a;
                audioTrack.setOffloadDelayPadding(c11108u1.f28779M, c11108u1.f28780N);
            }
        }
        int i10 = C11172r0.f29040a;
        if (i10 >= 31 && (c11391m3 = this.f30366r) != null) {
            c.m36583a(this.f30370v, c11391m3);
        }
        this.f30342X = this.f30370v.getAudioSessionId();
        C11677x c11677x = this.f30357i;
        AudioTrack audioTrack2 = this.f30370v;
        g gVar = this.f30369u;
        c11677x.m36788s(audioTrack2, gVar.f30386c == 2, gVar.f30390g, gVar.f30387d, gVar.f30391h);
        m36546h0();
        int i11 = this.f30343Y.f30589a;
        if (i11 != 0) {
            this.f30370v.attachAuxEffect(i11);
            this.f30370v.setAuxEffectSendLevel(this.f30343Y.f30590b);
        }
        d dVar = this.f30344Z;
        if (dVar != null && i10 >= 23) {
            b.m36582a(this.f30370v, dVar);
        }
        this.f30327I = true;
        return true;
    }

    /* renamed from: V */
    private static boolean m36534V(int i10) {
        return (C11172r0.f29040a >= 24 && i10 == -6) || i10 == -32;
    }

    /* renamed from: W */
    private boolean m36535W() {
        return this.f30370v != null;
    }

    /* renamed from: X */
    private static boolean m36536X(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (C11172r0.f29040a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static /* synthetic */ void m36537Y(AudioTrack audioTrack, C11149g c11149g) {
        try {
            audioTrack.flush();
            audioTrack.release();
            c11149g.m34721e();
            synchronized (f30316f0) {
                int i10 = f30318h0 - 1;
                f30318h0 = i10;
                if (i10 == 0) {
                    f30317g0.shutdown();
                    f30317g0 = null;
                }
            }
        } catch (Throwable th2) {
            c11149g.m34721e();
            synchronized (f30316f0) {
                int i11 = f30318h0 - 1;
                f30318h0 = i11;
                if (i11 == 0) {
                    f30317g0.shutdown();
                    f30317g0 = null;
                }
                throw th2;
            }
        }
    }

    /* renamed from: Z */
    private void m36538Z() {
        if (this.f30369u.m36606l()) {
            this.f30350c0 = true;
        }
    }

    /* renamed from: a0 */
    private void m36539a0() {
        if (this.f30339U) {
            return;
        }
        this.f30339U = true;
        this.f30357i.m36781g(m36532T());
        this.f30370v.stop();
        this.f30320B = 0;
    }

    /* renamed from: b0 */
    private void m36540b0(long j10) {
        ByteBuffer byteBuffer;
        int length = this.f30330L.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.f30331M[i10 - 1];
            } else {
                byteBuffer = this.f30332N;
                if (byteBuffer == null) {
                    byteBuffer = InterfaceC11647i.f30409a;
                }
            }
            if (i10 == length) {
                m36553o0(byteBuffer, j10);
            } else {
                InterfaceC11647i interfaceC11647i = this.f30330L[i10];
                if (i10 > this.f30337S) {
                    interfaceC11647i.mo36464d(byteBuffer);
                }
                ByteBuffer mo36622b = interfaceC11647i.mo36622b();
                this.f30331M[i10] = mo36622b;
                if (mo36622b.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i10--;
            }
        }
    }

    /* renamed from: c0 */
    private void m36541c0(AudioTrack audioTrack) {
        if (this.f30361m == null) {
            this.f30361m = new m();
        }
        this.f30361m.m36619a(audioTrack);
    }

    /* renamed from: d0 */
    private static void m36542d0(final AudioTrack audioTrack, final C11149g c11149g) {
        c11149g.m34719c();
        synchronized (f30316f0) {
            if (f30317g0 == null) {
                f30317g0 = C11172r0.m34863D0("ExoPlayer:AudioTrackReleaseThread");
            }
            f30318h0++;
            f30317g0.execute(new Runnable() { // from class: v6.g0
                @Override // java.lang.Runnable
                public final void run() {
                    C11646h0.m36537Y(audioTrack, c11149g);
                }
            });
        }
    }

    /* renamed from: e0 */
    private void m36543e0() {
        this.f30321C = 0L;
        this.f30322D = 0L;
        this.f30323E = 0L;
        this.f30324F = 0L;
        this.f30352d0 = false;
        this.f30325G = 0;
        this.f30373y = new j(m36526M(), m36560R(), 0L, 0L);
        this.f30328J = 0L;
        this.f30372x = null;
        this.f30358j.clear();
        this.f30332N = null;
        this.f30333O = 0;
        this.f30334P = null;
        this.f30339U = false;
        this.f30338T = false;
        this.f30337S = -1;
        this.f30319A = null;
        this.f30320B = 0;
        this.f30353e.m36795n();
        m36524K();
    }

    /* renamed from: f0 */
    private void m36544f0(C11047i3 c11047i3, boolean z10) {
        j m36529P = m36529P();
        if (c11047i3.equals(m36529P.f30396a) && z10 == m36529P.f30397b) {
            return;
        }
        j jVar = new j(c11047i3, z10, -9223372036854775807L, -9223372036854775807L);
        if (m36535W()) {
            this.f30372x = jVar;
        } else {
            this.f30373y = jVar;
        }
    }

    /* renamed from: g0 */
    private void m36545g0(C11047i3 c11047i3) {
        if (m36535W()) {
            try {
                this.f30370v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(c11047i3.f28428a).setPitch(c11047i3.f28429b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                C11173s.m34971j("DefaultAudioSink", "Failed to set playback params", e10);
            }
            c11047i3 = new C11047i3(this.f30370v.getPlaybackParams().getSpeed(), this.f30370v.getPlaybackParams().getPitch());
            this.f30357i.m36789t(c11047i3.f28428a);
        }
        this.f30374z = c11047i3;
    }

    /* renamed from: h0 */
    private void m36546h0() {
        if (m36535W()) {
            if (C11172r0.f29040a >= 21) {
                m36547i0(this.f30370v, this.f30329K);
            } else {
                m36548j0(this.f30370v, this.f30329K);
            }
        }
    }

    /* renamed from: i0 */
    private static void m36547i0(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    /* renamed from: j0 */
    private static void m36548j0(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    /* renamed from: k0 */
    private void m36549k0() {
        InterfaceC11647i[] interfaceC11647iArr = this.f30369u.f30392i;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC11647i interfaceC11647i : interfaceC11647iArr) {
            if (interfaceC11647i.mo36621a()) {
                arrayList.add(interfaceC11647i);
            } else {
                interfaceC11647i.flush();
            }
        }
        int size = arrayList.size();
        this.f30330L = (InterfaceC11647i[]) arrayList.toArray(new InterfaceC11647i[size]);
        this.f30331M = new ByteBuffer[size];
        m36524K();
    }

    /* renamed from: l0 */
    private boolean m36550l0() {
        return (this.f30346a0 || !"audio/raw".equals(this.f30369u.f30384a.f28797w) || m36551m0(this.f30369u.f30384a.f28778L)) ? false : true;
    }

    /* renamed from: m0 */
    private boolean m36551m0(int i10) {
        return this.f30349c && C11172r0.m34949t0(i10);
    }

    /* renamed from: n0 */
    private boolean m36552n0(C11108u1 c11108u1, C11639e c11639e) {
        int m34998f;
        int m34868G;
        int m36530Q;
        if (C11172r0.f29040a < 29 || this.f30360l == 0 || (m34998f = C11178w.m34998f((String) C11137a.m34603e(c11108u1.f28797w), c11108u1.f28794t)) == 0 || (m34868G = C11172r0.m34868G(c11108u1.f28776J)) == 0 || (m36530Q = m36530Q(m36525L(c11108u1.f28777K, m34868G, m34998f), c11639e.m36490c().f30301a)) == 0) {
            return false;
        }
        if (m36530Q == 1) {
            return ((c11108u1.f28779M != 0 || c11108u1.f28780N != 0) && (this.f30360l == 1)) ? false : true;
        }
        if (m36530Q == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    /* renamed from: o0 */
    private void m36553o0(ByteBuffer byteBuffer, long j10) {
        int m36554p0;
        InterfaceC11673v.c cVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f30334P;
            if (byteBuffer2 != null) {
                C11137a.m34599a(byteBuffer2 == byteBuffer);
            } else {
                this.f30334P = byteBuffer;
                if (C11172r0.f29040a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f30335Q;
                    if (bArr == null || bArr.length < remaining) {
                        this.f30335Q = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f30335Q, 0, remaining);
                    byteBuffer.position(position);
                    this.f30336R = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (C11172r0.f29040a < 21) {
                int m36779c = this.f30357i.m36779c(this.f30323E);
                if (m36779c > 0) {
                    m36554p0 = this.f30370v.write(this.f30335Q, this.f30336R, Math.min(remaining2, m36779c));
                    if (m36554p0 > 0) {
                        this.f30336R += m36554p0;
                        byteBuffer.position(byteBuffer.position() + m36554p0);
                    }
                } else {
                    m36554p0 = 0;
                }
            } else if (this.f30346a0) {
                C11137a.m34605g(j10 != -9223372036854775807L);
                m36554p0 = m36555q0(this.f30370v, byteBuffer, remaining2, j10);
            } else {
                m36554p0 = m36554p0(this.f30370v, byteBuffer, remaining2);
            }
            this.f30348b0 = SystemClock.elapsedRealtime();
            if (m36554p0 < 0) {
                InterfaceC11673v.e eVar = new InterfaceC11673v.e(m36554p0, this.f30369u.f30384a, m36534V(m36554p0) && this.f30324F > 0);
                InterfaceC11673v.c cVar2 = this.f30367s;
                if (cVar2 != null) {
                    cVar2.mo36663a(eVar);
                }
                if (eVar.f30494b) {
                    throw eVar;
                }
                this.f30363o.m36613b(eVar);
                return;
            }
            this.f30363o.m36612a();
            if (m36536X(this.f30370v)) {
                if (this.f30324F > 0) {
                    this.f30352d0 = false;
                }
                if (this.f30340V && (cVar = this.f30367s) != null && m36554p0 < remaining2 && !this.f30352d0) {
                    cVar.mo36665c();
                }
            }
            int i10 = this.f30369u.f30386c;
            if (i10 == 0) {
                this.f30323E += m36554p0;
            }
            if (m36554p0 == remaining2) {
                if (i10 != 0) {
                    C11137a.m34605g(byteBuffer == this.f30332N);
                    this.f30324F += this.f30325G * this.f30333O;
                }
                this.f30334P = null;
            }
        }
    }

    /* renamed from: p0 */
    private static int m36554p0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    /* renamed from: q0 */
    private int m36555q0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (C11172r0.f29040a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.f30319A == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f30319A = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f30319A.putInt(1431633921);
        }
        if (this.f30320B == 0) {
            this.f30319A.putInt(4, i10);
            this.f30319A.putLong(8, j10 * 1000);
            this.f30319A.position(0);
            this.f30320B = i10;
        }
        int remaining = this.f30319A.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f30319A, remaining, 1);
            if (write < 0) {
                this.f30320B = 0;
                return write;
            }
            if (write < remaining) {
                return 0;
            }
        }
        int m36554p0 = m36554p0(audioTrack, byteBuffer, i10);
        if (m36554p0 < 0) {
            this.f30320B = 0;
            return m36554p0;
        }
        this.f30320B -= m36554p0;
        return m36554p0;
    }

    /* renamed from: R */
    public boolean m36560R() {
        return m36529P().f30397b;
    }

    @Override // p396v6.InterfaceC11673v
    /* renamed from: a */
    public boolean mo36561a(C11108u1 c11108u1) {
        return mo36572l(c11108u1) != 0;
    }

    @Override // p396v6.InterfaceC11673v
    /* renamed from: b */
    public void mo36562b(C11047i3 c11047i3) {
        C11047i3 c11047i32 = new C11047i3(C11172r0.m34940p(c11047i3.f28428a, 0.1f, 8.0f), C11172r0.m34940p(c11047i3.f28429b, 0.1f, 8.0f));
        if (!this.f30359k || C11172r0.f29040a < 23) {
            m36544f0(c11047i32, m36560R());
        } else {
            m36545g0(c11047i32);
        }
    }

    @Override // p396v6.InterfaceC11673v
    /* renamed from: c */
    public C11047i3 mo36563c() {
        return this.f30359k ? this.f30374z : m36526M();
    }

    @Override // p396v6.InterfaceC11673v
    /* renamed from: d */
    public void mo36564d() {
        this.f30340V = true;
        if (m36535W()) {
            this.f30357i.m36790u();
            this.f30370v.play();
        }
    }

    @Override // p396v6.InterfaceC11673v
    /* renamed from: e */
    public boolean mo36565e() {
        return !m36535W() || (this.f30338T && !mo36567g());
    }

    @Override // p396v6.InterfaceC11673v
    /* renamed from: f */
    public void mo36566f(InterfaceC11673v.c cVar) {
        this.f30367s = cVar;
    }

    @Override // p396v6.InterfaceC11673v
    public void flush() {
        if (m36535W()) {
            m36543e0();
            if (this.f30357i.m36783i()) {
                this.f30370v.pause();
            }
            if (m36536X(this.f30370v)) {
                ((m) C11137a.m34603e(this.f30361m)).m36620b(this.f30370v);
            }
            if (C11172r0.f29040a < 21 && !this.f30341W) {
                this.f30342X = 0;
            }
            g gVar = this.f30368t;
            if (gVar != null) {
                this.f30369u = gVar;
                this.f30368t = null;
            }
            this.f30357i.m36787q();
            m36542d0(this.f30370v, this.f30356h);
            this.f30370v = null;
        }
        this.f30363o.m36612a();
        this.f30362n.m36612a();
    }

    @Override // p396v6.InterfaceC11673v
    /* renamed from: g */
    public boolean mo36567g() {
        return m36535W() && this.f30357i.m36782h(m36532T());
    }

    @Override // p396v6.InterfaceC11673v
    /* renamed from: h */
    public void mo36568h(int i10) {
        if (this.f30342X != i10) {
            this.f30342X = i10;
            this.f30341W = i10 != 0;
            flush();
        }
    }

    @Override // p396v6.InterfaceC11673v
    /* renamed from: i */
    public void mo36569i(C11679y c11679y) {
        if (this.f30343Y.equals(c11679y)) {
            return;
        }
        int i10 = c11679y.f30589a;
        float f10 = c11679y.f30590b;
        AudioTrack audioTrack = this.f30370v;
        if (audioTrack != null) {
            if (this.f30343Y.f30589a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f30370v.setAuxEffectSendLevel(f10);
            }
        }
        this.f30343Y = c11679y;
    }

    @Override // p396v6.InterfaceC11673v
    /* renamed from: j */
    public void mo36570j() {
        if (this.f30346a0) {
            this.f30346a0 = false;
            flush();
        }
    }

    @Override // p396v6.InterfaceC11673v
    /* renamed from: k */
    public void mo36571k(C11391m3 c11391m3) {
        this.f30366r = c11391m3;
    }

    @Override // p396v6.InterfaceC11673v
    /* renamed from: l */
    public int mo36572l(C11108u1 c11108u1) {
        if (!"audio/raw".equals(c11108u1.f28797w)) {
            return ((this.f30350c0 || !m36552n0(c11108u1, this.f30371w)) && !this.f30345a.m36510h(c11108u1)) ? 0 : 2;
        }
        if (C11172r0.m34951u0(c11108u1.f28778L)) {
            int i10 = c11108u1.f28778L;
            return (i10 == 2 || (this.f30349c && i10 == 4)) ? 2 : 1;
        }
        C11173s.m34970i("DefaultAudioSink", "Invalid PCM encoding: " + c11108u1.f28778L);
        return 0;
    }

    @Override // p396v6.InterfaceC11673v
    /* renamed from: m */
    public boolean mo36573m(ByteBuffer byteBuffer, long j10, int i10) {
        ByteBuffer byteBuffer2 = this.f30332N;
        C11137a.m34599a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f30368t != null) {
            if (!m36523J()) {
                return false;
            }
            if (this.f30368t.m36602b(this.f30369u)) {
                this.f30369u = this.f30368t;
                this.f30368t = null;
                if (m36536X(this.f30370v) && this.f30360l != 3) {
                    if (this.f30370v.getPlayState() == 3) {
                        this.f30370v.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f30370v;
                    C11108u1 c11108u1 = this.f30369u.f30384a;
                    audioTrack.setOffloadDelayPadding(c11108u1.f28779M, c11108u1.f28780N);
                    this.f30352d0 = true;
                }
            } else {
                m36539a0();
                if (mo36567g()) {
                    return false;
                }
                flush();
            }
            m36518E(j10);
        }
        if (!m36535W()) {
            try {
                if (!m36533U()) {
                    return false;
                }
            } catch (InterfaceC11673v.b e10) {
                if (e10.f30489b) {
                    throw e10;
                }
                this.f30362n.m36613b(e10);
                return false;
            }
        }
        this.f30362n.m36612a();
        if (this.f30327I) {
            this.f30328J = Math.max(0L, j10);
            this.f30326H = false;
            this.f30327I = false;
            if (this.f30359k && C11172r0.f29040a >= 23) {
                m36545g0(this.f30374z);
            }
            m36518E(j10);
            if (this.f30340V) {
                mo36564d();
            }
        }
        if (!this.f30357i.m36785k(m36532T())) {
            return false;
        }
        if (this.f30332N == null) {
            C11137a.m34599a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            g gVar = this.f30369u;
            if (gVar.f30386c != 0 && this.f30325G == 0) {
                int m36528O = m36528O(gVar.f30390g, byteBuffer);
                this.f30325G = m36528O;
                if (m36528O == 0) {
                    return true;
                }
            }
            if (this.f30372x != null) {
                if (!m36523J()) {
                    return false;
                }
                m36518E(j10);
                this.f30372x = null;
            }
            long m36605k = this.f30328J + this.f30369u.m36605k(m36531S() - this.f30353e.m36794m());
            if (!this.f30326H && Math.abs(m36605k - j10) > 200000) {
                InterfaceC11673v.c cVar = this.f30367s;
                if (cVar != null) {
                    cVar.mo36663a(new InterfaceC11673v.d(j10, m36605k));
                }
                this.f30326H = true;
            }
            if (this.f30326H) {
                if (!m36523J()) {
                    return false;
                }
                long j11 = j10 - m36605k;
                this.f30328J += j11;
                this.f30326H = false;
                m36518E(j10);
                InterfaceC11673v.c cVar2 = this.f30367s;
                if (cVar2 != null && j11 != 0) {
                    cVar2.mo36667e();
                }
            }
            if (this.f30369u.f30386c == 0) {
                this.f30321C += byteBuffer.remaining();
            } else {
                this.f30322D += this.f30325G * i10;
            }
            this.f30332N = byteBuffer;
            this.f30333O = i10;
        }
        m36540b0(j10);
        if (!this.f30332N.hasRemaining()) {
            this.f30332N = null;
            this.f30333O = 0;
            return true;
        }
        if (!this.f30357i.m36784j(m36532T())) {
            return false;
        }
        C11173s.m34970i("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // p396v6.InterfaceC11673v
    /* renamed from: n */
    public void mo36574n() {
        if (C11172r0.f29040a < 25) {
            flush();
            return;
        }
        this.f30363o.m36612a();
        this.f30362n.m36612a();
        if (m36535W()) {
            m36543e0();
            if (this.f30357i.m36783i()) {
                this.f30370v.pause();
            }
            this.f30370v.flush();
            this.f30357i.m36787q();
            C11677x c11677x = this.f30357i;
            AudioTrack audioTrack = this.f30370v;
            g gVar = this.f30369u;
            c11677x.m36788s(audioTrack, gVar.f30386c == 2, gVar.f30390g, gVar.f30387d, gVar.f30391h);
            this.f30327I = true;
        }
    }

    @Override // p396v6.InterfaceC11673v
    /* renamed from: o */
    public void mo36575o(C11108u1 c11108u1, int i10, int[] iArr) {
        InterfaceC11647i[] interfaceC11647iArr;
        int i11;
        int i12;
        int i13;
        int intValue;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int mo36584a;
        int[] iArr2;
        if ("audio/raw".equals(c11108u1.f28797w)) {
            C11137a.m34599a(C11172r0.m34951u0(c11108u1.f28778L));
            i11 = C11172r0.m34919e0(c11108u1.f28778L, c11108u1.f28776J);
            InterfaceC11647i[] interfaceC11647iArr2 = m36551m0(c11108u1.f28778L) ? this.f30355g : this.f30354f;
            this.f30353e.m36796o(c11108u1.f28779M, c11108u1.f28780N);
            if (C11172r0.f29040a < 21 && c11108u1.f28776J == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i20 = 0; i20 < 6; i20++) {
                    iArr2[i20] = i20;
                }
            } else {
                iArr2 = iArr;
            }
            this.f30351d.m36468m(iArr2);
            InterfaceC11647i.a aVar = new InterfaceC11647i.a(c11108u1.f28777K, c11108u1.f28776J, c11108u1.f28778L);
            for (InterfaceC11647i interfaceC11647i : interfaceC11647iArr2) {
                try {
                    InterfaceC11647i.a mo36623c = interfaceC11647i.mo36623c(aVar);
                    if (interfaceC11647i.mo36621a()) {
                        aVar = mo36623c;
                    }
                } catch (InterfaceC11647i.b e10) {
                    throw new InterfaceC11673v.a(e10, c11108u1);
                }
            }
            int i21 = aVar.f30413c;
            int i22 = aVar.f30411a;
            int m34868G = C11172r0.m34868G(aVar.f30412b);
            i15 = 0;
            interfaceC11647iArr = interfaceC11647iArr2;
            i12 = C11172r0.m34919e0(i21, aVar.f30412b);
            i14 = i21;
            i13 = i22;
            intValue = m34868G;
        } else {
            InterfaceC11647i[] interfaceC11647iArr3 = new InterfaceC11647i[0];
            int i23 = c11108u1.f28777K;
            if (m36552n0(c11108u1, this.f30371w)) {
                interfaceC11647iArr = interfaceC11647iArr3;
                i11 = -1;
                i12 = -1;
                i15 = 1;
                i13 = i23;
                i14 = C11178w.m34998f((String) C11137a.m34603e(c11108u1.f28797w), c11108u1.f28794t);
                intValue = C11172r0.m34868G(c11108u1.f28776J);
            } else {
                Pair<Integer, Integer> m36509f = this.f30345a.m36509f(c11108u1);
                if (m36509f == null) {
                    throw new InterfaceC11673v.a("Unable to configure passthrough for: " + c11108u1, c11108u1);
                }
                int intValue2 = ((Integer) m36509f.first).intValue();
                interfaceC11647iArr = interfaceC11647iArr3;
                i11 = -1;
                i12 = -1;
                i13 = i23;
                intValue = ((Integer) m36509f.second).intValue();
                i14 = intValue2;
                i15 = 2;
            }
        }
        if (i14 == 0) {
            throw new InterfaceC11673v.a("Invalid output encoding (mode=" + i15 + ") for: " + c11108u1, c11108u1);
        }
        if (intValue == 0) {
            throw new InterfaceC11673v.a("Invalid output channel config (mode=" + i15 + ") for: " + c11108u1, c11108u1);
        }
        if (i10 != 0) {
            mo36584a = i10;
            i16 = i14;
            i17 = intValue;
            i18 = i12;
            i19 = i13;
        } else {
            i16 = i14;
            i17 = intValue;
            i18 = i12;
            i19 = i13;
            mo36584a = this.f30364p.mo36584a(m36527N(i13, intValue, i14), i14, i15, i12 != -1 ? i12 : 1, i13, c11108u1.f28793s, this.f30359k ? 8.0d : 1.0d);
        }
        this.f30350c0 = false;
        g gVar = new g(c11108u1, i11, i15, i18, i19, i17, i16, mo36584a, interfaceC11647iArr);
        if (m36535W()) {
            this.f30368t = gVar;
        } else {
            this.f30369u = gVar;
        }
    }

    @Override // p396v6.InterfaceC11673v
    /* renamed from: p */
    public void mo36576p() {
        if (!this.f30338T && m36535W() && m36523J()) {
            m36539a0();
            this.f30338T = true;
        }
    }

    @Override // p396v6.InterfaceC11673v
    public void pause() {
        this.f30340V = false;
        if (m36535W() && this.f30357i.m36786p()) {
            this.f30370v.pause();
        }
    }

    @Override // p396v6.InterfaceC11673v
    /* renamed from: q */
    public long mo36577q(boolean z10) {
        if (!m36535W() || this.f30327I) {
            return Long.MIN_VALUE;
        }
        return m36520G(m36519F(Math.min(this.f30357i.m36780d(z10), this.f30369u.m36604h(m36532T()))));
    }

    @Override // p396v6.InterfaceC11673v
    public void reset() {
        flush();
        for (InterfaceC11647i interfaceC11647i : this.f30354f) {
            interfaceC11647i.reset();
        }
        for (InterfaceC11647i interfaceC11647i2 : this.f30355g) {
            interfaceC11647i2.reset();
        }
        this.f30340V = false;
        this.f30350c0 = false;
    }

    @Override // p396v6.InterfaceC11673v
    /* renamed from: s */
    public void mo36578s() {
        this.f30326H = true;
    }

    @Override // p396v6.InterfaceC11673v
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        d dVar = audioDeviceInfo == null ? null : new d(audioDeviceInfo);
        this.f30344Z = dVar;
        AudioTrack audioTrack = this.f30370v;
        if (audioTrack != null) {
            b.m36582a(audioTrack, dVar);
        }
    }

    @Override // p396v6.InterfaceC11673v
    public void setVolume(float f10) {
        if (this.f30329K != f10) {
            this.f30329K = f10;
            m36546h0();
        }
    }

    @Override // p396v6.InterfaceC11673v
    /* renamed from: t */
    public void mo36579t(C11639e c11639e) {
        if (this.f30371w.equals(c11639e)) {
            return;
        }
        this.f30371w = c11639e;
        if (this.f30346a0) {
            return;
        }
        flush();
    }

    @Override // p396v6.InterfaceC11673v
    /* renamed from: u */
    public void mo36580u() {
        C11137a.m34605g(C11172r0.f29040a >= 21);
        C11137a.m34605g(this.f30341W);
        if (this.f30346a0) {
            return;
        }
        this.f30346a0 = true;
        flush();
    }

    @Override // p396v6.InterfaceC11673v
    /* renamed from: v */
    public void mo36581v(boolean z10) {
        m36544f0(m36526M(), z10);
    }
}

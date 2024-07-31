package v6;

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
import t6.i3;
import t6.u1;
import t6.y;
import u6.m3;
import v6.i;
import v6.o0;
import v6.v;
import v6.x;

/* loaded from: classes.dex */
public final class h0 implements v {

    /* renamed from: e0, reason: collision with root package name */
    public static boolean f27991e0 = false;

    /* renamed from: f0, reason: collision with root package name */
    private static final Object f27992f0 = new Object();

    /* renamed from: g0, reason: collision with root package name */
    private static ExecutorService f27993g0;

    /* renamed from: h0, reason: collision with root package name */
    private static int f27994h0;
    private ByteBuffer A;
    private int B;
    private long C;
    private long D;
    private long E;
    private long F;
    private int G;
    private boolean H;
    private boolean I;
    private long J;
    private float K;
    private v6.i[] L;
    private ByteBuffer[] M;
    private ByteBuffer N;
    private int O;
    private ByteBuffer P;
    private byte[] Q;
    private int R;
    private int S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private int X;
    private y Y;
    private d Z;

    /* renamed from: a, reason: collision with root package name */
    private final v6.h f27995a;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f27996a0;

    /* renamed from: b, reason: collision with root package name */
    private final v6.j f27997b;

    /* renamed from: b0, reason: collision with root package name */
    private long f27998b0;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f27999c;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f28000c0;

    /* renamed from: d, reason: collision with root package name */
    private final a0 f28001d;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f28002d0;

    /* renamed from: e, reason: collision with root package name */
    private final y0 f28003e;

    /* renamed from: f, reason: collision with root package name */
    private final v6.i[] f28004f;

    /* renamed from: g, reason: collision with root package name */
    private final v6.i[] f28005g;

    /* renamed from: h, reason: collision with root package name */
    private final t8.g f28006h;

    /* renamed from: i, reason: collision with root package name */
    private final x f28007i;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayDeque<j> f28008j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f28009k;

    /* renamed from: l, reason: collision with root package name */
    private final int f28010l;

    /* renamed from: m, reason: collision with root package name */
    private m f28011m;

    /* renamed from: n, reason: collision with root package name */
    private final k<v.b> f28012n;

    /* renamed from: o, reason: collision with root package name */
    private final k<v.e> f28013o;

    /* renamed from: p, reason: collision with root package name */
    private final e f28014p;

    /* renamed from: q, reason: collision with root package name */
    private final y.a f28015q;

    /* renamed from: r, reason: collision with root package name */
    private m3 f28016r;

    /* renamed from: s, reason: collision with root package name */
    private v.c f28017s;

    /* renamed from: t, reason: collision with root package name */
    private g f28018t;

    /* renamed from: u, reason: collision with root package name */
    private g f28019u;

    /* renamed from: v, reason: collision with root package name */
    private AudioTrack f28020v;

    /* renamed from: w, reason: collision with root package name */
    private v6.e f28021w;

    /* renamed from: x, reason: collision with root package name */
    private j f28022x;

    /* renamed from: y, reason: collision with root package name */
    private j f28023y;

    /* renamed from: z, reason: collision with root package name */
    private i3 f28024z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {
        public static void a(AudioTrack audioTrack, d dVar) {
            audioTrack.setPreferredDevice(dVar == null ? null : dVar.f28025a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {
        public static void a(AudioTrack audioTrack, m3 m3Var) {
            LogSessionId logSessionId;
            boolean equals;
            LogSessionId a10 = m3Var.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a10.equals(logSessionId);
            if (equals) {
                return;
            }
            audioTrack.setLogSessionId(a10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final AudioDeviceInfo f28025a;

        public d(AudioDeviceInfo audioDeviceInfo) {
            this.f28025a = audioDeviceInfo;
        }
    }

    /* loaded from: classes.dex */
    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f28026a = new o0.a().g();

        int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10);
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: b, reason: collision with root package name */
        private v6.j f28028b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f28029c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f28030d;

        /* renamed from: g, reason: collision with root package name */
        y.a f28033g;

        /* renamed from: a, reason: collision with root package name */
        private v6.h f28027a = v6.h.f27985c;

        /* renamed from: e, reason: collision with root package name */
        private int f28031e = 0;

        /* renamed from: f, reason: collision with root package name */
        e f28032f = e.f28026a;

        public h0 f() {
            if (this.f28028b == null) {
                this.f28028b = new h(new v6.i[0]);
            }
            return new h0(this);
        }

        public f g(v6.h hVar) {
            t8.a.e(hVar);
            this.f28027a = hVar;
            return this;
        }

        public f h(boolean z10) {
            this.f28030d = z10;
            return this;
        }

        public f i(boolean z10) {
            this.f28029c = z10;
            return this;
        }

        public f j(int i10) {
            this.f28031e = i10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final u1 f28034a;

        /* renamed from: b, reason: collision with root package name */
        public final int f28035b;

        /* renamed from: c, reason: collision with root package name */
        public final int f28036c;

        /* renamed from: d, reason: collision with root package name */
        public final int f28037d;

        /* renamed from: e, reason: collision with root package name */
        public final int f28038e;

        /* renamed from: f, reason: collision with root package name */
        public final int f28039f;

        /* renamed from: g, reason: collision with root package name */
        public final int f28040g;

        /* renamed from: h, reason: collision with root package name */
        public final int f28041h;

        /* renamed from: i, reason: collision with root package name */
        public final v6.i[] f28042i;

        public g(u1 u1Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, v6.i[] iVarArr) {
            this.f28034a = u1Var;
            this.f28035b = i10;
            this.f28036c = i11;
            this.f28037d = i12;
            this.f28038e = i13;
            this.f28039f = i14;
            this.f28040g = i15;
            this.f28041h = i16;
            this.f28042i = iVarArr;
        }

        private AudioTrack d(boolean z10, v6.e eVar, int i10) {
            int i11 = t8.r0.f26744a;
            return i11 >= 29 ? f(z10, eVar, i10) : i11 >= 21 ? e(z10, eVar, i10) : g(eVar, i10);
        }

        private AudioTrack e(boolean z10, v6.e eVar, int i10) {
            return new AudioTrack(i(eVar, z10), h0.L(this.f28038e, this.f28039f, this.f28040g), this.f28041h, 1, i10);
        }

        private AudioTrack f(boolean z10, v6.e eVar, int i10) {
            AudioTrack.Builder offloadedPlayback;
            offloadedPlayback = new AudioTrack.Builder().setAudioAttributes(i(eVar, z10)).setAudioFormat(h0.L(this.f28038e, this.f28039f, this.f28040g)).setTransferMode(1).setBufferSizeInBytes(this.f28041h).setSessionId(i10).setOffloadedPlayback(this.f28036c == 1);
            return offloadedPlayback.build();
        }

        private AudioTrack g(v6.e eVar, int i10) {
            int g02 = t8.r0.g0(eVar.f27973c);
            int i11 = this.f28038e;
            int i12 = this.f28039f;
            int i13 = this.f28040g;
            int i14 = this.f28041h;
            return i10 == 0 ? new AudioTrack(g02, i11, i12, i13, i14, 1) : new AudioTrack(g02, i11, i12, i13, i14, 1, i10);
        }

        private static AudioAttributes i(v6.e eVar, boolean z10) {
            return z10 ? j() : eVar.c().f27977a;
        }

        private static AudioAttributes j() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioTrack a(boolean z10, v6.e eVar, int i10) {
            try {
                AudioTrack d10 = d(z10, eVar, i10);
                int state = d10.getState();
                if (state == 1) {
                    return d10;
                }
                try {
                    d10.release();
                } catch (Exception unused) {
                }
                throw new v.b(state, this.f28038e, this.f28039f, this.f28041h, this.f28034a, l(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                throw new v.b(0, this.f28038e, this.f28039f, this.f28041h, this.f28034a, l(), e10);
            }
        }

        public boolean b(g gVar) {
            return gVar.f28036c == this.f28036c && gVar.f28040g == this.f28040g && gVar.f28038e == this.f28038e && gVar.f28039f == this.f28039f && gVar.f28037d == this.f28037d;
        }

        public g c(int i10) {
            return new g(this.f28034a, this.f28035b, this.f28036c, this.f28037d, this.f28038e, this.f28039f, this.f28040g, i10, this.f28042i);
        }

        public long h(long j10) {
            return (j10 * 1000000) / this.f28038e;
        }

        public long k(long j10) {
            return (j10 * 1000000) / this.f28034a.K;
        }

        public boolean l() {
            return this.f28036c == 1;
        }
    }

    /* loaded from: classes.dex */
    public static class h implements v6.j {

        /* renamed from: a, reason: collision with root package name */
        private final v6.i[] f28043a;

        /* renamed from: b, reason: collision with root package name */
        private final v0 f28044b;

        /* renamed from: c, reason: collision with root package name */
        private final x0 f28045c;

        public h(v6.i... iVarArr) {
            this(iVarArr, new v0(), new x0());
        }

        public h(v6.i[] iVarArr, v0 v0Var, x0 x0Var) {
            v6.i[] iVarArr2 = new v6.i[iVarArr.length + 2];
            this.f28043a = iVarArr2;
            System.arraycopy(iVarArr, 0, iVarArr2, 0, iVarArr.length);
            this.f28044b = v0Var;
            this.f28045c = x0Var;
            iVarArr2[iVarArr.length] = v0Var;
            iVarArr2[iVarArr.length + 1] = x0Var;
        }

        @Override // v6.j
        public long a(long j10) {
            return this.f28045c.g(j10);
        }

        @Override // v6.j
        public v6.i[] b() {
            return this.f28043a;
        }

        @Override // v6.j
        public i3 c(i3 i3Var) {
            this.f28045c.i(i3Var.f26204a);
            this.f28045c.h(i3Var.f26205b);
            return i3Var;
        }

        @Override // v6.j
        public long d() {
            return this.f28044b.p();
        }

        @Override // v6.j
        public boolean e(boolean z10) {
            this.f28044b.v(z10);
            return z10;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends RuntimeException {
        private i(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class j {

        /* renamed from: a, reason: collision with root package name */
        public final i3 f28046a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f28047b;

        /* renamed from: c, reason: collision with root package name */
        public final long f28048c;

        /* renamed from: d, reason: collision with root package name */
        public final long f28049d;

        private j(i3 i3Var, boolean z10, long j10, long j11) {
            this.f28046a = i3Var;
            this.f28047b = z10;
            this.f28048c = j10;
            this.f28049d = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class k<T extends Exception> {

        /* renamed from: a, reason: collision with root package name */
        private final long f28050a;

        /* renamed from: b, reason: collision with root package name */
        private T f28051b;

        /* renamed from: c, reason: collision with root package name */
        private long f28052c;

        public k(long j10) {
            this.f28050a = j10;
        }

        public void a() {
            this.f28051b = null;
        }

        public void b(T t10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f28051b == null) {
                this.f28051b = t10;
                this.f28052c = this.f28050a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f28052c) {
                T t11 = this.f28051b;
                if (t11 != t10) {
                    t11.addSuppressed(t10);
                }
                T t12 = this.f28051b;
                a();
                throw t12;
            }
        }
    }

    /* loaded from: classes.dex */
    private final class l implements x.a {
        private l() {
        }

        @Override // v6.x.a
        public void a(int i10, long j10) {
            if (h0.this.f28017s != null) {
                h0.this.f28017s.d(i10, j10, SystemClock.elapsedRealtime() - h0.this.f27998b0);
            }
        }

        @Override // v6.x.a
        public void b(long j10) {
            if (h0.this.f28017s != null) {
                h0.this.f28017s.b(j10);
            }
        }

        @Override // v6.x.a
        public void c(long j10) {
            t8.s.i("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // v6.x.a
        public void d(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + h0.this.S() + ", " + h0.this.T();
            if (h0.f27991e0) {
                throw new i(str);
            }
            t8.s.i("DefaultAudioSink", str);
        }

        @Override // v6.x.a
        public void e(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + h0.this.S() + ", " + h0.this.T();
            if (h0.f27991e0) {
                throw new i(str);
            }
            t8.s.i("DefaultAudioSink", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class m {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f28054a = new Handler(Looper.myLooper());

        /* renamed from: b, reason: collision with root package name */
        private final AudioTrack.StreamEventCallback f28055b;

        /* loaded from: classes.dex */
        class a extends AudioTrack.StreamEventCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f28057a;

            a(h0 h0Var) {
                this.f28057a = h0Var;
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i10) {
                if (audioTrack.equals(h0.this.f28020v) && h0.this.f28017s != null && h0.this.V) {
                    h0.this.f28017s.f();
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(h0.this.f28020v) && h0.this.f28017s != null && h0.this.V) {
                    h0.this.f28017s.f();
                }
            }
        }

        public m() {
            this.f28055b = new a(h0.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f28054a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new n0(handler), this.f28055b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f28055b);
            this.f28054a.removeCallbacksAndMessages(null);
        }
    }

    private h0(f fVar) {
        this.f27995a = fVar.f28027a;
        v6.j jVar = fVar.f28028b;
        this.f27997b = jVar;
        int i10 = t8.r0.f26744a;
        this.f27999c = i10 >= 21 && fVar.f28029c;
        this.f28009k = i10 >= 23 && fVar.f28030d;
        this.f28010l = i10 >= 29 ? fVar.f28031e : 0;
        this.f28014p = fVar.f28032f;
        t8.g gVar = new t8.g(t8.d.f26644a);
        this.f28006h = gVar;
        gVar.e();
        this.f28007i = new x(new l());
        a0 a0Var = new a0();
        this.f28001d = a0Var;
        y0 y0Var = new y0();
        this.f28003e = y0Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new u0(), a0Var, y0Var);
        Collections.addAll(arrayList, jVar.b());
        this.f28004f = (v6.i[]) arrayList.toArray(new v6.i[0]);
        this.f28005g = new v6.i[]{new q0()};
        this.K = 1.0f;
        this.f28021w = v6.e.f27964r;
        this.X = 0;
        this.Y = new y(0, 0.0f);
        i3 i3Var = i3.f26200d;
        this.f28023y = new j(i3Var, false, 0L, 0L);
        this.f28024z = i3Var;
        this.S = -1;
        this.L = new v6.i[0];
        this.M = new ByteBuffer[0];
        this.f28008j = new ArrayDeque<>();
        this.f28012n = new k<>(100L);
        this.f28013o = new k<>(100L);
        this.f28015q = fVar.f28033g;
    }

    private void E(long j10) {
        i3 c10 = l0() ? this.f27997b.c(M()) : i3.f26200d;
        boolean e10 = l0() ? this.f27997b.e(R()) : false;
        this.f28008j.add(new j(c10, e10, Math.max(0L, j10), this.f28019u.h(T())));
        k0();
        v.c cVar = this.f28017s;
        if (cVar != null) {
            cVar.onSkipSilenceEnabledChanged(e10);
        }
    }

    private long F(long j10) {
        while (!this.f28008j.isEmpty() && j10 >= this.f28008j.getFirst().f28049d) {
            this.f28023y = this.f28008j.remove();
        }
        j jVar = this.f28023y;
        long j11 = j10 - jVar.f28049d;
        if (jVar.f28046a.equals(i3.f26200d)) {
            return this.f28023y.f28048c + j11;
        }
        if (this.f28008j.isEmpty()) {
            return this.f28023y.f28048c + this.f27997b.a(j11);
        }
        j first = this.f28008j.getFirst();
        return first.f28048c - t8.r0.a0(first.f28049d - j10, this.f28023y.f28046a.f26204a);
    }

    private long G(long j10) {
        return j10 + this.f28019u.h(this.f27997b.d());
    }

    private AudioTrack H(g gVar) {
        try {
            AudioTrack a10 = gVar.a(this.f27996a0, this.f28021w, this.X);
            y.a aVar = this.f28015q;
            if (aVar != null) {
                aVar.z(X(a10));
            }
            return a10;
        } catch (v.b e10) {
            v.c cVar = this.f28017s;
            if (cVar != null) {
                cVar.a(e10);
            }
            throw e10;
        }
    }

    private AudioTrack I() {
        try {
            return H((g) t8.a.e(this.f28019u));
        } catch (v.b e10) {
            g gVar = this.f28019u;
            if (gVar.f28041h > 1000000) {
                g c10 = gVar.c(1000000);
                try {
                    AudioTrack H = H(c10);
                    this.f28019u = c10;
                    return H;
                } catch (v.b e11) {
                    e10.addSuppressed(e11);
                    Z();
                    throw e10;
                }
            }
            Z();
            throw e10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean J() {
        /*
            r9 = this;
            int r0 = r9.S
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.S = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.S
            v6.i[] r5 = r9.L
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.f()
        L1f:
            r9.b0(r7)
            boolean r0 = r4.e()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.S
            int r0 = r0 + r1
            r9.S = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.P
            if (r0 == 0) goto L3b
            r9.o0(r0, r7)
            java.nio.ByteBuffer r0 = r9.P
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.S = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.h0.J():boolean");
    }

    private void K() {
        int i10 = 0;
        while (true) {
            v6.i[] iVarArr = this.L;
            if (i10 >= iVarArr.length) {
                return;
            }
            v6.i iVar = iVarArr[i10];
            iVar.flush();
            this.M[i10] = iVar.b();
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AudioFormat L(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    private i3 M() {
        return P().f28046a;
    }

    private static int N(int i10, int i11, int i12) {
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        t8.a.g(minBufferSize != -2);
        return minBufferSize;
    }

    private static int O(int i10, ByteBuffer byteBuffer) {
        switch (i10) {
            case 5:
            case 6:
            case 18:
                return v6.b.e(byteBuffer);
            case 7:
            case 8:
                return p0.e(byteBuffer);
            case 9:
                int m10 = s0.m(t8.r0.I(byteBuffer, byteBuffer.position()));
                if (m10 != -1) {
                    return m10;
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
                int b10 = v6.b.b(byteBuffer);
                if (b10 == -1) {
                    return 0;
                }
                return v6.b.i(byteBuffer, b10) * 16;
            case 15:
                return RecognitionOptions.UPC_A;
            case 16:
                return RecognitionOptions.UPC_E;
            case 17:
                return v6.c.c(byteBuffer);
            case 20:
                return t0.g(byteBuffer);
        }
    }

    private j P() {
        j jVar = this.f28022x;
        return jVar != null ? jVar : !this.f28008j.isEmpty() ? this.f28008j.getLast() : this.f28023y;
    }

    private int Q(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        boolean isOffloadedPlaybackSupported;
        int playbackOffloadSupport;
        int i10 = t8.r0.f26744a;
        if (i10 >= 31) {
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            return playbackOffloadSupport;
        }
        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
        if (isOffloadedPlaybackSupported) {
            return (i10 == 30 && t8.r0.f26747d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long S() {
        return this.f28019u.f28036c == 0 ? this.C / r0.f28035b : this.D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long T() {
        return this.f28019u.f28036c == 0 ? this.E / r0.f28037d : this.F;
    }

    private boolean U() {
        m3 m3Var;
        if (!this.f28006h.d()) {
            return false;
        }
        AudioTrack I = I();
        this.f28020v = I;
        if (X(I)) {
            c0(this.f28020v);
            if (this.f28010l != 3) {
                AudioTrack audioTrack = this.f28020v;
                u1 u1Var = this.f28019u.f28034a;
                audioTrack.setOffloadDelayPadding(u1Var.M, u1Var.N);
            }
        }
        int i10 = t8.r0.f26744a;
        if (i10 >= 31 && (m3Var = this.f28016r) != null) {
            c.a(this.f28020v, m3Var);
        }
        this.X = this.f28020v.getAudioSessionId();
        x xVar = this.f28007i;
        AudioTrack audioTrack2 = this.f28020v;
        g gVar = this.f28019u;
        xVar.s(audioTrack2, gVar.f28036c == 2, gVar.f28040g, gVar.f28037d, gVar.f28041h);
        h0();
        int i11 = this.Y.f28220a;
        if (i11 != 0) {
            this.f28020v.attachAuxEffect(i11);
            this.f28020v.setAuxEffectSendLevel(this.Y.f28221b);
        }
        d dVar = this.Z;
        if (dVar != null && i10 >= 23) {
            b.a(this.f28020v, dVar);
        }
        this.I = true;
        return true;
    }

    private static boolean V(int i10) {
        return (t8.r0.f26744a >= 24 && i10 == -6) || i10 == -32;
    }

    private boolean W() {
        return this.f28020v != null;
    }

    private static boolean X(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (t8.r0.f26744a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Y(AudioTrack audioTrack, t8.g gVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            gVar.e();
            synchronized (f27992f0) {
                int i10 = f27994h0 - 1;
                f27994h0 = i10;
                if (i10 == 0) {
                    f27993g0.shutdown();
                    f27993g0 = null;
                }
            }
        } catch (Throwable th2) {
            gVar.e();
            synchronized (f27992f0) {
                int i11 = f27994h0 - 1;
                f27994h0 = i11;
                if (i11 == 0) {
                    f27993g0.shutdown();
                    f27993g0 = null;
                }
                throw th2;
            }
        }
    }

    private void Z() {
        if (this.f28019u.l()) {
            this.f28000c0 = true;
        }
    }

    private void a0() {
        if (this.U) {
            return;
        }
        this.U = true;
        this.f28007i.g(T());
        this.f28020v.stop();
        this.B = 0;
    }

    private void b0(long j10) {
        ByteBuffer byteBuffer;
        int length = this.L.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.M[i10 - 1];
            } else {
                byteBuffer = this.N;
                if (byteBuffer == null) {
                    byteBuffer = v6.i.f28059a;
                }
            }
            if (i10 == length) {
                o0(byteBuffer, j10);
            } else {
                v6.i iVar = this.L[i10];
                if (i10 > this.S) {
                    iVar.d(byteBuffer);
                }
                ByteBuffer b10 = iVar.b();
                this.M[i10] = b10;
                if (b10.hasRemaining()) {
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

    private void c0(AudioTrack audioTrack) {
        if (this.f28011m == null) {
            this.f28011m = new m();
        }
        this.f28011m.a(audioTrack);
    }

    private static void d0(final AudioTrack audioTrack, final t8.g gVar) {
        gVar.c();
        synchronized (f27992f0) {
            if (f27993g0 == null) {
                f27993g0 = t8.r0.D0("ExoPlayer:AudioTrackReleaseThread");
            }
            f27994h0++;
            f27993g0.execute(new Runnable() { // from class: v6.g0
                @Override // java.lang.Runnable
                public final void run() {
                    h0.Y(audioTrack, gVar);
                }
            });
        }
    }

    private void e0() {
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        this.F = 0L;
        this.f28002d0 = false;
        this.G = 0;
        this.f28023y = new j(M(), R(), 0L, 0L);
        this.J = 0L;
        this.f28022x = null;
        this.f28008j.clear();
        this.N = null;
        this.O = 0;
        this.P = null;
        this.U = false;
        this.T = false;
        this.S = -1;
        this.A = null;
        this.B = 0;
        this.f28003e.n();
        K();
    }

    private void f0(i3 i3Var, boolean z10) {
        j P = P();
        if (i3Var.equals(P.f28046a) && z10 == P.f28047b) {
            return;
        }
        j jVar = new j(i3Var, z10, -9223372036854775807L, -9223372036854775807L);
        if (W()) {
            this.f28022x = jVar;
        } else {
            this.f28023y = jVar;
        }
    }

    private void g0(i3 i3Var) {
        if (W()) {
            try {
                this.f28020v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(i3Var.f26204a).setPitch(i3Var.f26205b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                t8.s.j("DefaultAudioSink", "Failed to set playback params", e10);
            }
            i3Var = new i3(this.f28020v.getPlaybackParams().getSpeed(), this.f28020v.getPlaybackParams().getPitch());
            this.f28007i.t(i3Var.f26204a);
        }
        this.f28024z = i3Var;
    }

    private void h0() {
        if (W()) {
            if (t8.r0.f26744a >= 21) {
                i0(this.f28020v, this.K);
            } else {
                j0(this.f28020v, this.K);
            }
        }
    }

    private static void i0(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    private static void j0(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    private void k0() {
        v6.i[] iVarArr = this.f28019u.f28042i;
        ArrayList arrayList = new ArrayList();
        for (v6.i iVar : iVarArr) {
            if (iVar.a()) {
                arrayList.add(iVar);
            } else {
                iVar.flush();
            }
        }
        int size = arrayList.size();
        this.L = (v6.i[]) arrayList.toArray(new v6.i[size]);
        this.M = new ByteBuffer[size];
        K();
    }

    private boolean l0() {
        return (this.f27996a0 || !"audio/raw".equals(this.f28019u.f28034a.f26517w) || m0(this.f28019u.f28034a.L)) ? false : true;
    }

    private boolean m0(int i10) {
        return this.f27999c && t8.r0.t0(i10);
    }

    private boolean n0(u1 u1Var, v6.e eVar) {
        int f10;
        int G;
        int Q;
        if (t8.r0.f26744a < 29 || this.f28010l == 0 || (f10 = t8.w.f((String) t8.a.e(u1Var.f26517w), u1Var.f26514t)) == 0 || (G = t8.r0.G(u1Var.J)) == 0 || (Q = Q(L(u1Var.K, G, f10), eVar.c().f27977a)) == 0) {
            return false;
        }
        if (Q == 1) {
            return ((u1Var.M != 0 || u1Var.N != 0) && (this.f28010l == 1)) ? false : true;
        }
        if (Q == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    private void o0(ByteBuffer byteBuffer, long j10) {
        int p02;
        v.c cVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.P;
            if (byteBuffer2 != null) {
                t8.a.a(byteBuffer2 == byteBuffer);
            } else {
                this.P = byteBuffer;
                if (t8.r0.f26744a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.Q;
                    if (bArr == null || bArr.length < remaining) {
                        this.Q = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.Q, 0, remaining);
                    byteBuffer.position(position);
                    this.R = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (t8.r0.f26744a < 21) {
                int c10 = this.f28007i.c(this.E);
                if (c10 > 0) {
                    p02 = this.f28020v.write(this.Q, this.R, Math.min(remaining2, c10));
                    if (p02 > 0) {
                        this.R += p02;
                        byteBuffer.position(byteBuffer.position() + p02);
                    }
                } else {
                    p02 = 0;
                }
            } else if (this.f27996a0) {
                t8.a.g(j10 != -9223372036854775807L);
                p02 = q0(this.f28020v, byteBuffer, remaining2, j10);
            } else {
                p02 = p0(this.f28020v, byteBuffer, remaining2);
            }
            this.f27998b0 = SystemClock.elapsedRealtime();
            if (p02 < 0) {
                v.e eVar = new v.e(p02, this.f28019u.f28034a, V(p02) && this.F > 0);
                v.c cVar2 = this.f28017s;
                if (cVar2 != null) {
                    cVar2.a(eVar);
                }
                if (eVar.f28132b) {
                    throw eVar;
                }
                this.f28013o.b(eVar);
                return;
            }
            this.f28013o.a();
            if (X(this.f28020v)) {
                if (this.F > 0) {
                    this.f28002d0 = false;
                }
                if (this.V && (cVar = this.f28017s) != null && p02 < remaining2 && !this.f28002d0) {
                    cVar.c();
                }
            }
            int i10 = this.f28019u.f28036c;
            if (i10 == 0) {
                this.E += p02;
            }
            if (p02 == remaining2) {
                if (i10 != 0) {
                    t8.a.g(byteBuffer == this.N);
                    this.F += this.G * this.O;
                }
                this.P = null;
            }
        }
    }

    private static int p0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    private int q0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (t8.r0.f26744a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.A == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.A = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.A.putInt(1431633921);
        }
        if (this.B == 0) {
            this.A.putInt(4, i10);
            this.A.putLong(8, j10 * 1000);
            this.A.position(0);
            this.B = i10;
        }
        int remaining = this.A.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.A, remaining, 1);
            if (write < 0) {
                this.B = 0;
                return write;
            }
            if (write < remaining) {
                return 0;
            }
        }
        int p02 = p0(audioTrack, byteBuffer, i10);
        if (p02 < 0) {
            this.B = 0;
            return p02;
        }
        this.B -= p02;
        return p02;
    }

    public boolean R() {
        return P().f28047b;
    }

    @Override // v6.v
    public boolean a(u1 u1Var) {
        return l(u1Var) != 0;
    }

    @Override // v6.v
    public void b(i3 i3Var) {
        i3 i3Var2 = new i3(t8.r0.p(i3Var.f26204a, 0.1f, 8.0f), t8.r0.p(i3Var.f26205b, 0.1f, 8.0f));
        if (!this.f28009k || t8.r0.f26744a < 23) {
            f0(i3Var2, R());
        } else {
            g0(i3Var2);
        }
    }

    @Override // v6.v
    public i3 c() {
        return this.f28009k ? this.f28024z : M();
    }

    @Override // v6.v
    public void d() {
        this.V = true;
        if (W()) {
            this.f28007i.u();
            this.f28020v.play();
        }
    }

    @Override // v6.v
    public boolean e() {
        return !W() || (this.T && !g());
    }

    @Override // v6.v
    public void f(v.c cVar) {
        this.f28017s = cVar;
    }

    @Override // v6.v
    public void flush() {
        if (W()) {
            e0();
            if (this.f28007i.i()) {
                this.f28020v.pause();
            }
            if (X(this.f28020v)) {
                ((m) t8.a.e(this.f28011m)).b(this.f28020v);
            }
            if (t8.r0.f26744a < 21 && !this.W) {
                this.X = 0;
            }
            g gVar = this.f28018t;
            if (gVar != null) {
                this.f28019u = gVar;
                this.f28018t = null;
            }
            this.f28007i.q();
            d0(this.f28020v, this.f28006h);
            this.f28020v = null;
        }
        this.f28013o.a();
        this.f28012n.a();
    }

    @Override // v6.v
    public boolean g() {
        return W() && this.f28007i.h(T());
    }

    @Override // v6.v
    public void h(int i10) {
        if (this.X != i10) {
            this.X = i10;
            this.W = i10 != 0;
            flush();
        }
    }

    @Override // v6.v
    public void i(y yVar) {
        if (this.Y.equals(yVar)) {
            return;
        }
        int i10 = yVar.f28220a;
        float f10 = yVar.f28221b;
        AudioTrack audioTrack = this.f28020v;
        if (audioTrack != null) {
            if (this.Y.f28220a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f28020v.setAuxEffectSendLevel(f10);
            }
        }
        this.Y = yVar;
    }

    @Override // v6.v
    public void j() {
        if (this.f27996a0) {
            this.f27996a0 = false;
            flush();
        }
    }

    @Override // v6.v
    public void k(m3 m3Var) {
        this.f28016r = m3Var;
    }

    @Override // v6.v
    public int l(u1 u1Var) {
        if (!"audio/raw".equals(u1Var.f26517w)) {
            return ((this.f28000c0 || !n0(u1Var, this.f28021w)) && !this.f27995a.h(u1Var)) ? 0 : 2;
        }
        if (t8.r0.u0(u1Var.L)) {
            int i10 = u1Var.L;
            return (i10 == 2 || (this.f27999c && i10 == 4)) ? 2 : 1;
        }
        t8.s.i("DefaultAudioSink", "Invalid PCM encoding: " + u1Var.L);
        return 0;
    }

    @Override // v6.v
    public boolean m(ByteBuffer byteBuffer, long j10, int i10) {
        ByteBuffer byteBuffer2 = this.N;
        t8.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f28018t != null) {
            if (!J()) {
                return false;
            }
            if (this.f28018t.b(this.f28019u)) {
                this.f28019u = this.f28018t;
                this.f28018t = null;
                if (X(this.f28020v) && this.f28010l != 3) {
                    if (this.f28020v.getPlayState() == 3) {
                        this.f28020v.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f28020v;
                    u1 u1Var = this.f28019u.f28034a;
                    audioTrack.setOffloadDelayPadding(u1Var.M, u1Var.N);
                    this.f28002d0 = true;
                }
            } else {
                a0();
                if (g()) {
                    return false;
                }
                flush();
            }
            E(j10);
        }
        if (!W()) {
            try {
                if (!U()) {
                    return false;
                }
            } catch (v.b e10) {
                if (e10.f28127b) {
                    throw e10;
                }
                this.f28012n.b(e10);
                return false;
            }
        }
        this.f28012n.a();
        if (this.I) {
            this.J = Math.max(0L, j10);
            this.H = false;
            this.I = false;
            if (this.f28009k && t8.r0.f26744a >= 23) {
                g0(this.f28024z);
            }
            E(j10);
            if (this.V) {
                d();
            }
        }
        if (!this.f28007i.k(T())) {
            return false;
        }
        if (this.N == null) {
            t8.a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            g gVar = this.f28019u;
            if (gVar.f28036c != 0 && this.G == 0) {
                int O = O(gVar.f28040g, byteBuffer);
                this.G = O;
                if (O == 0) {
                    return true;
                }
            }
            if (this.f28022x != null) {
                if (!J()) {
                    return false;
                }
                E(j10);
                this.f28022x = null;
            }
            long k10 = this.J + this.f28019u.k(S() - this.f28003e.m());
            if (!this.H && Math.abs(k10 - j10) > 200000) {
                v.c cVar = this.f28017s;
                if (cVar != null) {
                    cVar.a(new v.d(j10, k10));
                }
                this.H = true;
            }
            if (this.H) {
                if (!J()) {
                    return false;
                }
                long j11 = j10 - k10;
                this.J += j11;
                this.H = false;
                E(j10);
                v.c cVar2 = this.f28017s;
                if (cVar2 != null && j11 != 0) {
                    cVar2.e();
                }
            }
            if (this.f28019u.f28036c == 0) {
                this.C += byteBuffer.remaining();
            } else {
                this.D += this.G * i10;
            }
            this.N = byteBuffer;
            this.O = i10;
        }
        b0(j10);
        if (!this.N.hasRemaining()) {
            this.N = null;
            this.O = 0;
            return true;
        }
        if (!this.f28007i.j(T())) {
            return false;
        }
        t8.s.i("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // v6.v
    public void n() {
        if (t8.r0.f26744a < 25) {
            flush();
            return;
        }
        this.f28013o.a();
        this.f28012n.a();
        if (W()) {
            e0();
            if (this.f28007i.i()) {
                this.f28020v.pause();
            }
            this.f28020v.flush();
            this.f28007i.q();
            x xVar = this.f28007i;
            AudioTrack audioTrack = this.f28020v;
            g gVar = this.f28019u;
            xVar.s(audioTrack, gVar.f28036c == 2, gVar.f28040g, gVar.f28037d, gVar.f28041h);
            this.I = true;
        }
    }

    @Override // v6.v
    public void o(u1 u1Var, int i10, int[] iArr) {
        v6.i[] iVarArr;
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
        int a10;
        int[] iArr2;
        if ("audio/raw".equals(u1Var.f26517w)) {
            t8.a.a(t8.r0.u0(u1Var.L));
            i11 = t8.r0.e0(u1Var.L, u1Var.J);
            v6.i[] iVarArr2 = m0(u1Var.L) ? this.f28005g : this.f28004f;
            this.f28003e.o(u1Var.M, u1Var.N);
            if (t8.r0.f26744a < 21 && u1Var.J == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i20 = 0; i20 < 6; i20++) {
                    iArr2[i20] = i20;
                }
            } else {
                iArr2 = iArr;
            }
            this.f28001d.m(iArr2);
            i.a aVar = new i.a(u1Var.K, u1Var.J, u1Var.L);
            for (v6.i iVar : iVarArr2) {
                try {
                    i.a c10 = iVar.c(aVar);
                    if (iVar.a()) {
                        aVar = c10;
                    }
                } catch (i.b e10) {
                    throw new v.a(e10, u1Var);
                }
            }
            int i21 = aVar.f28063c;
            int i22 = aVar.f28061a;
            int G = t8.r0.G(aVar.f28062b);
            i15 = 0;
            iVarArr = iVarArr2;
            i12 = t8.r0.e0(i21, aVar.f28062b);
            i14 = i21;
            i13 = i22;
            intValue = G;
        } else {
            v6.i[] iVarArr3 = new v6.i[0];
            int i23 = u1Var.K;
            if (n0(u1Var, this.f28021w)) {
                iVarArr = iVarArr3;
                i11 = -1;
                i12 = -1;
                i15 = 1;
                i13 = i23;
                i14 = t8.w.f((String) t8.a.e(u1Var.f26517w), u1Var.f26514t);
                intValue = t8.r0.G(u1Var.J);
            } else {
                Pair<Integer, Integer> f10 = this.f27995a.f(u1Var);
                if (f10 == null) {
                    throw new v.a("Unable to configure passthrough for: " + u1Var, u1Var);
                }
                int intValue2 = ((Integer) f10.first).intValue();
                iVarArr = iVarArr3;
                i11 = -1;
                i12 = -1;
                i13 = i23;
                intValue = ((Integer) f10.second).intValue();
                i14 = intValue2;
                i15 = 2;
            }
        }
        if (i14 == 0) {
            throw new v.a("Invalid output encoding (mode=" + i15 + ") for: " + u1Var, u1Var);
        }
        if (intValue == 0) {
            throw new v.a("Invalid output channel config (mode=" + i15 + ") for: " + u1Var, u1Var);
        }
        if (i10 != 0) {
            a10 = i10;
            i16 = i14;
            i17 = intValue;
            i18 = i12;
            i19 = i13;
        } else {
            i16 = i14;
            i17 = intValue;
            i18 = i12;
            i19 = i13;
            a10 = this.f28014p.a(N(i13, intValue, i14), i14, i15, i12 != -1 ? i12 : 1, i13, u1Var.f26513s, this.f28009k ? 8.0d : 1.0d);
        }
        this.f28000c0 = false;
        g gVar = new g(u1Var, i11, i15, i18, i19, i17, i16, a10, iVarArr);
        if (W()) {
            this.f28018t = gVar;
        } else {
            this.f28019u = gVar;
        }
    }

    @Override // v6.v
    public void p() {
        if (!this.T && W() && J()) {
            a0();
            this.T = true;
        }
    }

    @Override // v6.v
    public void pause() {
        this.V = false;
        if (W() && this.f28007i.p()) {
            this.f28020v.pause();
        }
    }

    @Override // v6.v
    public long q(boolean z10) {
        if (!W() || this.I) {
            return Long.MIN_VALUE;
        }
        return G(F(Math.min(this.f28007i.d(z10), this.f28019u.h(T()))));
    }

    @Override // v6.v
    public void reset() {
        flush();
        for (v6.i iVar : this.f28004f) {
            iVar.reset();
        }
        for (v6.i iVar2 : this.f28005g) {
            iVar2.reset();
        }
        this.V = false;
        this.f28000c0 = false;
    }

    @Override // v6.v
    public void s() {
        this.H = true;
    }

    @Override // v6.v
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        d dVar = audioDeviceInfo == null ? null : new d(audioDeviceInfo);
        this.Z = dVar;
        AudioTrack audioTrack = this.f28020v;
        if (audioTrack != null) {
            b.a(audioTrack, dVar);
        }
    }

    @Override // v6.v
    public void setVolume(float f10) {
        if (this.K != f10) {
            this.K = f10;
            h0();
        }
    }

    @Override // v6.v
    public void t(v6.e eVar) {
        if (this.f28021w.equals(eVar)) {
            return;
        }
        this.f28021w = eVar;
        if (this.f27996a0) {
            return;
        }
        flush();
    }

    @Override // v6.v
    public void u() {
        t8.a.g(t8.r0.f26744a >= 21);
        t8.a.g(this.W);
        if (this.f27996a0) {
            return;
        }
        this.f27996a0 = true;
        flush();
    }

    @Override // v6.v
    public void v(boolean z10) {
        f0(M(), z10);
    }
}

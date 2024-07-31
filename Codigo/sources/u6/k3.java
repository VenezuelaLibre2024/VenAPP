package u6;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import k7.r;
import s8.n0;
import s8.w;
import t6.c2;
import t6.d4;
import t6.i4;
import t6.j3;
import u6.b;
import u6.l3;
import v6.v;
import v7.a0;
import x6.h;
import x6.n;

/* loaded from: classes.dex */
public final class k3 implements u6.b, l3.a {
    private boolean A;

    /* renamed from: a, reason: collision with root package name */
    private final Context f27189a;

    /* renamed from: b, reason: collision with root package name */
    private final l3 f27190b;

    /* renamed from: c, reason: collision with root package name */
    private final PlaybackSession f27191c;

    /* renamed from: i, reason: collision with root package name */
    private String f27197i;

    /* renamed from: j, reason: collision with root package name */
    private PlaybackMetrics.Builder f27198j;

    /* renamed from: k, reason: collision with root package name */
    private int f27199k;

    /* renamed from: n, reason: collision with root package name */
    private t6.f3 f27202n;

    /* renamed from: o, reason: collision with root package name */
    private b f27203o;

    /* renamed from: p, reason: collision with root package name */
    private b f27204p;

    /* renamed from: q, reason: collision with root package name */
    private b f27205q;

    /* renamed from: r, reason: collision with root package name */
    private t6.u1 f27206r;

    /* renamed from: s, reason: collision with root package name */
    private t6.u1 f27207s;

    /* renamed from: t, reason: collision with root package name */
    private t6.u1 f27208t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f27209u;

    /* renamed from: v, reason: collision with root package name */
    private int f27210v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f27211w;

    /* renamed from: x, reason: collision with root package name */
    private int f27212x;

    /* renamed from: y, reason: collision with root package name */
    private int f27213y;

    /* renamed from: z, reason: collision with root package name */
    private int f27214z;

    /* renamed from: e, reason: collision with root package name */
    private final d4.d f27193e = new d4.d();

    /* renamed from: f, reason: collision with root package name */
    private final d4.b f27194f = new d4.b();

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<String, Long> f27196h = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, Long> f27195g = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final long f27192d = SystemClock.elapsedRealtime();

    /* renamed from: l, reason: collision with root package name */
    private int f27200l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f27201m = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f27215a;

        /* renamed from: b, reason: collision with root package name */
        public final int f27216b;

        public a(int i10, int i11) {
            this.f27215a = i10;
            this.f27216b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final t6.u1 f27217a;

        /* renamed from: b, reason: collision with root package name */
        public final int f27218b;

        /* renamed from: c, reason: collision with root package name */
        public final String f27219c;

        public b(t6.u1 u1Var, int i10, String str) {
            this.f27217a = u1Var;
            this.f27218b = i10;
            this.f27219c = str;
        }
    }

    private k3(Context context, PlaybackSession playbackSession) {
        this.f27189a = context.getApplicationContext();
        this.f27191c = playbackSession;
        p1 p1Var = new p1();
        this.f27190b = p1Var;
        p1Var.d(this);
    }

    public static k3 A0(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        createPlaybackSession = mediaMetricsManager.createPlaybackSession();
        return new k3(context, createPlaybackSession);
    }

    private void B0() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.f27198j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.f27214z);
            this.f27198j.setVideoFramesDropped(this.f27212x);
            this.f27198j.setVideoFramesPlayed(this.f27213y);
            Long l10 = this.f27195g.get(this.f27197i);
            this.f27198j.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = this.f27196h.get(this.f27197i);
            this.f27198j.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f27198j.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            PlaybackSession playbackSession = this.f27191c;
            build = this.f27198j.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.f27198j = null;
        this.f27197i = null;
        this.f27214z = 0;
        this.f27212x = 0;
        this.f27213y = 0;
        this.f27206r = null;
        this.f27207s = null;
        this.f27208t = null;
        this.A = false;
    }

    private static int C0(int i10) {
        switch (t8.r0.V(i10)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private static x6.m D0(com.google.common.collect.w<i4.a> wVar) {
        x6.m mVar;
        com.google.common.collect.h1<i4.a> it = wVar.iterator();
        while (it.hasNext()) {
            i4.a next = it.next();
            for (int i10 = 0; i10 < next.f26216a; i10++) {
                if (next.f(i10) && (mVar = next.c(i10).f26520z) != null) {
                    return mVar;
                }
            }
        }
        return null;
    }

    private static int E0(x6.m mVar) {
        for (int i10 = 0; i10 < mVar.f30540d; i10++) {
            UUID uuid = mVar.e(i10).f30542b;
            if (uuid.equals(t6.p.f26347d)) {
                return 3;
            }
            if (uuid.equals(t6.p.f26348e)) {
                return 2;
            }
            if (uuid.equals(t6.p.f26346c)) {
                return 6;
            }
        }
        return 1;
    }

    private static a F0(t6.f3 f3Var, Context context, boolean z10) {
        int i10;
        boolean z11;
        if (f3Var.f26090a == 1001) {
            return new a(20, 0);
        }
        if (f3Var instanceof t6.x) {
            t6.x xVar = (t6.x) f3Var;
            z11 = xVar.f26579t == 1;
            i10 = xVar.f26583x;
        } else {
            i10 = 0;
            z11 = false;
        }
        Throwable th2 = (Throwable) t8.a.e(f3Var.getCause());
        if (!(th2 instanceof IOException)) {
            if (z11 && (i10 == 0 || i10 == 1)) {
                return new a(35, 0);
            }
            if (z11 && i10 == 3) {
                return new a(15, 0);
            }
            if (z11 && i10 == 2) {
                return new a(23, 0);
            }
            if (th2 instanceof r.b) {
                return new a(13, t8.r0.W(((r.b) th2).f20501d));
            }
            if (th2 instanceof k7.m) {
                return new a(14, t8.r0.W(((k7.m) th2).f20458b));
            }
            if (th2 instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th2 instanceof v.b) {
                return new a(17, ((v.b) th2).f28126a);
            }
            if (th2 instanceof v.e) {
                return new a(18, ((v.e) th2).f28131a);
            }
            if (t8.r0.f26744a < 16 || !(th2 instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th2).getErrorCode();
            return new a(C0(errorCode), errorCode);
        }
        if (th2 instanceof s8.a0) {
            return new a(5, ((s8.a0) th2).f25187d);
        }
        if ((th2 instanceof s8.z) || (th2 instanceof t6.b3)) {
            return new a(z10 ? 10 : 11, 0);
        }
        if ((th2 instanceof s8.y) || (th2 instanceof n0.a)) {
            if (t8.z.d(context).f() == 1) {
                return new a(3, 0);
            }
            Throwable cause = th2.getCause();
            return cause instanceof UnknownHostException ? new a(6, 0) : cause instanceof SocketTimeoutException ? new a(7, 0) : ((th2 instanceof s8.y) && ((s8.y) th2).f25397c == 1) ? new a(4, 0) : new a(8, 0);
        }
        if (f3Var.f26090a == 1002) {
            return new a(21, 0);
        }
        if (!(th2 instanceof n.a)) {
            if (!(th2 instanceof w.b) || !(th2.getCause() instanceof FileNotFoundException)) {
                return new a(9, 0);
            }
            Throwable cause2 = ((Throwable) t8.a.e(th2.getCause())).getCause();
            return (t8.r0.f26744a >= 21 && (cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
        }
        Throwable th3 = (Throwable) t8.a.e(th2.getCause());
        int i11 = t8.r0.f26744a;
        if (i11 < 21 || !(th3 instanceof MediaDrm.MediaDrmStateException)) {
            return (i11 < 23 || !(th3 instanceof MediaDrmResetException)) ? (i11 < 18 || !(th3 instanceof NotProvisionedException)) ? (i11 < 18 || !(th3 instanceof DeniedByServerException)) ? th3 instanceof x6.n0 ? new a(23, 0) : th3 instanceof h.e ? new a(28, 0) : new a(30, 0) : new a(29, 0) : new a(24, 0) : new a(27, 0);
        }
        int W = t8.r0.W(((MediaDrm.MediaDrmStateException) th3).getDiagnosticInfo());
        return new a(C0(W), W);
    }

    private static Pair<String, String> G0(String str) {
        String[] R0 = t8.r0.R0(str, "-");
        return Pair.create(R0[0], R0.length >= 2 ? R0[1] : null);
    }

    private static int I0(Context context) {
        switch (t8.z.d(context).f()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    private static int J0(t6.c2 c2Var) {
        c2.h hVar = c2Var.f25880b;
        if (hVar == null) {
            return 0;
        }
        int p02 = t8.r0.p0(hVar.f25953a, hVar.f25954b);
        if (p02 == 0) {
            return 3;
        }
        if (p02 != 1) {
            return p02 != 2 ? 1 : 4;
        }
        return 5;
    }

    private static int K0(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 1 : 4;
        }
        return 3;
    }

    private void L0(b.C0446b c0446b) {
        for (int i10 = 0; i10 < c0446b.d(); i10++) {
            int b10 = c0446b.b(i10);
            b.a c10 = c0446b.c(b10);
            if (b10 == 0) {
                this.f27190b.g(c10);
            } else if (b10 == 11) {
                this.f27190b.e(c10, this.f27199k);
            } else {
                this.f27190b.f(c10);
            }
        }
    }

    private void M0(long j10) {
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis;
        NetworkEvent build;
        int I0 = I0(this.f27189a);
        if (I0 != this.f27201m) {
            this.f27201m = I0;
            PlaybackSession playbackSession = this.f27191c;
            networkType = new NetworkEvent.Builder().setNetworkType(I0);
            timeSinceCreatedMillis = networkType.setTimeSinceCreatedMillis(j10 - this.f27192d);
            build = timeSinceCreatedMillis.build();
            playbackSession.reportNetworkEvent(build);
        }
    }

    private void N0(long j10) {
        PlaybackErrorEvent.Builder timeSinceCreatedMillis;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build;
        t6.f3 f3Var = this.f27202n;
        if (f3Var == null) {
            return;
        }
        a F0 = F0(f3Var, this.f27189a, this.f27210v == 4);
        PlaybackSession playbackSession = this.f27191c;
        timeSinceCreatedMillis = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(j10 - this.f27192d);
        errorCode = timeSinceCreatedMillis.setErrorCode(F0.f27215a);
        subErrorCode = errorCode.setSubErrorCode(F0.f27216b);
        exception = subErrorCode.setException(f3Var);
        build = exception.build();
        playbackSession.reportPlaybackErrorEvent(build);
        this.A = true;
        this.f27202n = null;
    }

    private void O0(t6.j3 j3Var, b.C0446b c0446b, long j10) {
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis;
        PlaybackStateEvent build;
        if (j3Var.F() != 2) {
            this.f27209u = false;
        }
        if (j3Var.j() == null) {
            this.f27211w = false;
        } else if (c0446b.a(10)) {
            this.f27211w = true;
        }
        int W0 = W0(j3Var);
        if (this.f27200l != W0) {
            this.f27200l = W0;
            this.A = true;
            PlaybackSession playbackSession = this.f27191c;
            state = new PlaybackStateEvent.Builder().setState(this.f27200l);
            timeSinceCreatedMillis = state.setTimeSinceCreatedMillis(j10 - this.f27192d);
            build = timeSinceCreatedMillis.build();
            playbackSession.reportPlaybackStateEvent(build);
        }
    }

    private void P0(t6.j3 j3Var, b.C0446b c0446b, long j10) {
        if (c0446b.a(2)) {
            i4 m10 = j3Var.m();
            boolean d10 = m10.d(2);
            boolean d11 = m10.d(1);
            boolean d12 = m10.d(3);
            if (d10 || d11 || d12) {
                if (!d10) {
                    U0(j10, null, 0);
                }
                if (!d11) {
                    Q0(j10, null, 0);
                }
                if (!d12) {
                    S0(j10, null, 0);
                }
            }
        }
        if (z0(this.f27203o)) {
            b bVar = this.f27203o;
            t6.u1 u1Var = bVar.f27217a;
            if (u1Var.C != -1) {
                U0(j10, u1Var, bVar.f27218b);
                this.f27203o = null;
            }
        }
        if (z0(this.f27204p)) {
            b bVar2 = this.f27204p;
            Q0(j10, bVar2.f27217a, bVar2.f27218b);
            this.f27204p = null;
        }
        if (z0(this.f27205q)) {
            b bVar3 = this.f27205q;
            S0(j10, bVar3.f27217a, bVar3.f27218b);
            this.f27205q = null;
        }
    }

    private void Q0(long j10, t6.u1 u1Var, int i10) {
        if (t8.r0.c(this.f27207s, u1Var)) {
            return;
        }
        if (this.f27207s == null && i10 == 0) {
            i10 = 1;
        }
        this.f27207s = u1Var;
        V0(0, j10, u1Var, i10);
    }

    private void R0(t6.j3 j3Var, b.C0446b c0446b) {
        x6.m D0;
        if (c0446b.a(0)) {
            b.a c10 = c0446b.c(0);
            if (this.f27198j != null) {
                T0(c10.f27115b, c10.f27117d);
            }
        }
        if (c0446b.a(2) && this.f27198j != null && (D0 = D0(j3Var.m().c())) != null) {
            ((PlaybackMetrics.Builder) t8.r0.j(this.f27198j)).setDrmType(E0(D0));
        }
        if (c0446b.a(1011)) {
            this.f27214z++;
        }
    }

    private void S0(long j10, t6.u1 u1Var, int i10) {
        if (t8.r0.c(this.f27208t, u1Var)) {
            return;
        }
        if (this.f27208t == null && i10 == 0) {
            i10 = 1;
        }
        this.f27208t = u1Var;
        V0(2, j10, u1Var, i10);
    }

    private void T0(d4 d4Var, a0.b bVar) {
        int g10;
        PlaybackMetrics.Builder builder = this.f27198j;
        if (bVar == null || (g10 = d4Var.g(bVar.f28543a)) == -1) {
            return;
        }
        d4Var.k(g10, this.f27194f);
        d4Var.s(this.f27194f.f26057c, this.f27193e);
        builder.setStreamType(J0(this.f27193e.f26068c));
        d4.d dVar = this.f27193e;
        if (dVar.f26079y != -9223372036854775807L && !dVar.f26077w && !dVar.f26074t && !dVar.i()) {
            builder.setMediaDurationMillis(this.f27193e.g());
        }
        builder.setPlaybackType(this.f27193e.i() ? 2 : 1);
        this.A = true;
    }

    private void U0(long j10, t6.u1 u1Var, int i10) {
        if (t8.r0.c(this.f27206r, u1Var)) {
            return;
        }
        if (this.f27206r == null && i10 == 0) {
            i10 = 1;
        }
        this.f27206r = u1Var;
        V0(1, j10, u1Var, i10);
    }

    private void V0(int i10, long j10, t6.u1 u1Var, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.f27192d);
        if (u1Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(K0(i11));
            String str = u1Var.f26516v;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = u1Var.f26517w;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = u1Var.f26514t;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = u1Var.f26513s;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = u1Var.B;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = u1Var.C;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = u1Var.J;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = u1Var.K;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = u1Var.f26508c;
            if (str4 != null) {
                Pair<String, String> G0 = G0(str4);
                timeSinceCreatedMillis.setLanguage((String) G0.first);
                Object obj = G0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = u1Var.D;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        PlaybackSession playbackSession = this.f27191c;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }

    private int W0(t6.j3 j3Var) {
        int F = j3Var.F();
        if (this.f27209u) {
            return 5;
        }
        if (this.f27211w) {
            return 13;
        }
        if (F == 4) {
            return 11;
        }
        if (F == 2) {
            int i10 = this.f27200l;
            if (i10 == 0 || i10 == 2) {
                return 2;
            }
            if (j3Var.u()) {
                return j3Var.q() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (F == 3) {
            if (j3Var.u()) {
                return j3Var.q() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (F != 1 || this.f27200l == 0) {
            return this.f27200l;
        }
        return 12;
    }

    private boolean z0(b bVar) {
        return bVar != null && bVar.f27219c.equals(this.f27190b.a());
    }

    @Override // u6.l3.a
    public void C(b.a aVar, String str) {
    }

    @Override // u6.b
    public void H(b.a aVar, j3.e eVar, j3.e eVar2, int i10) {
        if (i10 == 1) {
            this.f27209u = true;
        }
        this.f27199k = i10;
    }

    public LogSessionId H0() {
        LogSessionId sessionId;
        sessionId = this.f27191c.getSessionId();
        return sessionId;
    }

    @Override // u6.b
    public void K(b.a aVar, v7.x xVar) {
        if (aVar.f27117d == null) {
            return;
        }
        b bVar = new b((t6.u1) t8.a.e(xVar.f28525c), xVar.f28526d, this.f27190b.b(aVar.f27115b, (a0.b) t8.a.e(aVar.f27117d)));
        int i10 = xVar.f28524b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f27204p = bVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f27205q = bVar;
                return;
            }
        }
        this.f27203o = bVar;
    }

    @Override // u6.b
    public void P(b.a aVar, int i10, long j10, long j11) {
        a0.b bVar = aVar.f27117d;
        if (bVar != null) {
            String b10 = this.f27190b.b(aVar.f27115b, (a0.b) t8.a.e(bVar));
            Long l10 = this.f27196h.get(b10);
            Long l11 = this.f27195g.get(b10);
            this.f27196h.put(b10, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.f27195g.put(b10, Long.valueOf((l11 != null ? l11.longValue() : 0L) + i10));
        }
    }

    @Override // u6.l3.a
    public void Y(b.a aVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        a0.b bVar = aVar.f27117d;
        if (bVar == null || !bVar.b()) {
            B0();
            this.f27197i = str;
            playerName = new PlaybackMetrics.Builder().setPlayerName("ExoPlayerLib");
            playerVersion = playerName.setPlayerVersion("2.18.7");
            this.f27198j = playerVersion;
            T0(aVar.f27115b, aVar.f27117d);
        }
    }

    @Override // u6.l3.a
    public void b0(b.a aVar, String str, boolean z10) {
        a0.b bVar = aVar.f27117d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f27197i)) {
            B0();
        }
        this.f27195g.remove(str);
        this.f27196h.remove(str);
    }

    @Override // u6.b
    public void c(b.a aVar, t6.f3 f3Var) {
        this.f27202n = f3Var;
    }

    @Override // u6.l3.a
    public void j0(b.a aVar, String str, String str2) {
    }

    @Override // u6.b
    public void k0(t6.j3 j3Var, b.C0446b c0446b) {
        if (c0446b.d() == 0) {
            return;
        }
        L0(c0446b);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        R0(j3Var, c0446b);
        N0(elapsedRealtime);
        P0(j3Var, c0446b, elapsedRealtime);
        M0(elapsedRealtime);
        O0(j3Var, c0446b, elapsedRealtime);
        if (c0446b.a(1028)) {
            this.f27190b.c(c0446b.c(1028));
        }
    }

    @Override // u6.b
    public void q(b.a aVar, w6.e eVar) {
        this.f27212x += eVar.f29672g;
        this.f27213y += eVar.f29670e;
    }

    @Override // u6.b
    public void r0(b.a aVar, u8.a0 a0Var) {
        b bVar = this.f27203o;
        if (bVar != null) {
            t6.u1 u1Var = bVar.f27217a;
            if (u1Var.C == -1) {
                this.f27203o = new b(u1Var.c().n0(a0Var.f27346a).S(a0Var.f27347b).G(), bVar.f27218b, bVar.f27219c);
            }
        }
    }

    @Override // u6.b
    public void v(b.a aVar, v7.u uVar, v7.x xVar, IOException iOException, boolean z10) {
        this.f27210v = xVar.f28523a;
    }
}

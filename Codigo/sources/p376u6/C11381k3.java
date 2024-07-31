package p376u6;

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
import com.google.common.collect.AbstractC5877h1;
import com.google.common.collect.AbstractC5907w;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import p197k7.AbstractC9197r;
import p197k7.C9192m;
import p351s8.C10810a0;
import p351s8.C10836n0;
import p351s8.C10845w;
import p351s8.C10847y;
import p351s8.C10848z;
import p361t6.AbstractC11018d4;
import p361t6.C11005b3;
import p361t6.C11010c2;
import p361t6.C11029f3;
import p361t6.C11048i4;
import p361t6.C11081p;
import p361t6.C11108u1;
import p361t6.C11121x;
import p361t6.InterfaceC11053j3;
import p363t8.C11137a;
import p363t8.C11172r0;
import p363t8.C11181z;
import p376u6.InterfaceC11332b;
import p376u6.InterfaceC11386l3;
import p378u8.C11448a0;
import p396v6.InterfaceC11673v;
import p397v7.C11731u;
import p397v7.C11737x;
import p397v7.InterfaceC11684a0;
import p414w6.C12080e;
import p436x6.C12308h;
import p436x6.C12318m;
import p436x6.C12321n0;
import p436x6.InterfaceC12320n;

/* renamed from: u6.k3 */
/* loaded from: classes.dex */
public final class C11381k3 implements InterfaceC11332b, InterfaceC11386l3.a {

    /* renamed from: A */
    private boolean f29491A;

    /* renamed from: a */
    private final Context f29492a;

    /* renamed from: b */
    private final InterfaceC11386l3 f29493b;

    /* renamed from: c */
    private final PlaybackSession f29494c;

    /* renamed from: i */
    private String f29500i;

    /* renamed from: j */
    private PlaybackMetrics.Builder f29501j;

    /* renamed from: k */
    private int f29502k;

    /* renamed from: n */
    private C11029f3 f29505n;

    /* renamed from: o */
    private b f29506o;

    /* renamed from: p */
    private b f29507p;

    /* renamed from: q */
    private b f29508q;

    /* renamed from: r */
    private C11108u1 f29509r;

    /* renamed from: s */
    private C11108u1 f29510s;

    /* renamed from: t */
    private C11108u1 f29511t;

    /* renamed from: u */
    private boolean f29512u;

    /* renamed from: v */
    private int f29513v;

    /* renamed from: w */
    private boolean f29514w;

    /* renamed from: x */
    private int f29515x;

    /* renamed from: y */
    private int f29516y;

    /* renamed from: z */
    private int f29517z;

    /* renamed from: e */
    private final AbstractC11018d4.d f29496e = new AbstractC11018d4.d();

    /* renamed from: f */
    private final AbstractC11018d4.b f29497f = new AbstractC11018d4.b();

    /* renamed from: h */
    private final HashMap<String, Long> f29499h = new HashMap<>();

    /* renamed from: g */
    private final HashMap<String, Long> f29498g = new HashMap<>();

    /* renamed from: d */
    private final long f29495d = SystemClock.elapsedRealtime();

    /* renamed from: l */
    private int f29503l = 0;

    /* renamed from: m */
    private int f29504m = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u6.k3$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f29518a;

        /* renamed from: b */
        public final int f29519b;

        public a(int i10, int i11) {
            this.f29518a = i10;
            this.f29519b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u6.k3$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final C11108u1 f29520a;

        /* renamed from: b */
        public final int f29521b;

        /* renamed from: c */
        public final String f29522c;

        public b(C11108u1 c11108u1, int i10, String str) {
            this.f29520a = c11108u1;
            this.f29521b = i10;
            this.f29522c = str;
        }
    }

    private C11381k3(Context context, PlaybackSession playbackSession) {
        this.f29492a = context.getApplicationContext();
        this.f29494c = playbackSession;
        C11402p1 c11402p1 = new C11402p1();
        this.f29493b = c11402p1;
        c11402p1.mo35568d(this);
    }

    /* renamed from: A0 */
    public static C11381k3 m35536A0(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        createPlaybackSession = mediaMetricsManager.createPlaybackSession();
        return new C11381k3(context, createPlaybackSession);
    }

    /* renamed from: B0 */
    private void m35537B0() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.f29501j;
        if (builder != null && this.f29491A) {
            builder.setAudioUnderrunCount(this.f29517z);
            this.f29501j.setVideoFramesDropped(this.f29515x);
            this.f29501j.setVideoFramesPlayed(this.f29516y);
            Long l10 = this.f29498g.get(this.f29500i);
            this.f29501j.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = this.f29499h.get(this.f29500i);
            this.f29501j.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f29501j.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            PlaybackSession playbackSession = this.f29494c;
            build = this.f29501j.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.f29501j = null;
        this.f29500i = null;
        this.f29517z = 0;
        this.f29515x = 0;
        this.f29516y = 0;
        this.f29509r = null;
        this.f29510s = null;
        this.f29511t = null;
        this.f29491A = false;
    }

    /* renamed from: C0 */
    private static int m35538C0(int i10) {
        switch (C11172r0.m34898V(i10)) {
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

    /* renamed from: D0 */
    private static C12318m m35539D0(AbstractC5907w<C11048i4.a> abstractC5907w) {
        C12318m c12318m;
        AbstractC5877h1<C11048i4.a> it = abstractC5907w.iterator();
        while (it.hasNext()) {
            C11048i4.a next = it.next();
            for (int i10 = 0; i10 < next.f28440a; i10++) {
                if (next.m34172f(i10) && (c12318m = next.m34169c(i10).f28800z) != null) {
                    return c12318m;
                }
            }
        }
        return null;
    }

    /* renamed from: E0 */
    private static int m35540E0(C12318m c12318m) {
        for (int i10 = 0; i10 < c12318m.f33052d; i10++) {
            UUID uuid = c12318m.m39840e(i10).f33054b;
            if (uuid.equals(C11081p.f28574d)) {
                return 3;
            }
            if (uuid.equals(C11081p.f28575e)) {
                return 2;
            }
            if (uuid.equals(C11081p.f28573c)) {
                return 6;
            }
        }
        return 1;
    }

    /* renamed from: F0 */
    private static a m35541F0(C11029f3 c11029f3, Context context, boolean z10) {
        int i10;
        boolean z11;
        if (c11029f3.f28279a == 1001) {
            return new a(20, 0);
        }
        if (c11029f3 instanceof C11121x) {
            C11121x c11121x = (C11121x) c11029f3;
            z11 = c11121x.f28872t == 1;
            i10 = c11121x.f28876x;
        } else {
            i10 = 0;
            z11 = false;
        }
        Throwable th2 = (Throwable) C11137a.m34603e(c11029f3.getCause());
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
            if (th2 instanceof AbstractC9197r.b) {
                return new a(13, C11172r0.m34900W(((AbstractC9197r.b) th2).f22323d));
            }
            if (th2 instanceof C9192m) {
                return new a(14, C11172r0.m34900W(((C9192m) th2).f22240b));
            }
            if (th2 instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th2 instanceof InterfaceC11673v.b) {
                return new a(17, ((InterfaceC11673v.b) th2).f30488a);
            }
            if (th2 instanceof InterfaceC11673v.e) {
                return new a(18, ((InterfaceC11673v.e) th2).f30493a);
            }
            if (C11172r0.f29040a < 16 || !(th2 instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th2).getErrorCode();
            return new a(m35538C0(errorCode), errorCode);
        }
        if (th2 instanceof C10810a0) {
            return new a(5, ((C10810a0) th2).f27306d);
        }
        if ((th2 instanceof C10848z) || (th2 instanceof C11005b3)) {
            return new a(z10 ? 10 : 11, 0);
        }
        if ((th2 instanceof C10847y) || (th2 instanceof C10836n0.a)) {
            if (C11181z.m35034d(context).m35040f() == 1) {
                return new a(3, 0);
            }
            Throwable cause = th2.getCause();
            return cause instanceof UnknownHostException ? new a(6, 0) : cause instanceof SocketTimeoutException ? new a(7, 0) : ((th2 instanceof C10847y) && ((C10847y) th2).f27516c == 1) ? new a(4, 0) : new a(8, 0);
        }
        if (c11029f3.f28279a == 1002) {
            return new a(21, 0);
        }
        if (!(th2 instanceof InterfaceC12320n.a)) {
            if (!(th2 instanceof C10845w.b) || !(th2.getCause() instanceof FileNotFoundException)) {
                return new a(9, 0);
            }
            Throwable cause2 = ((Throwable) C11137a.m34603e(th2.getCause())).getCause();
            return (C11172r0.f29040a >= 21 && (cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
        }
        Throwable th3 = (Throwable) C11137a.m34603e(th2.getCause());
        int i11 = C11172r0.f29040a;
        if (i11 < 21 || !(th3 instanceof MediaDrm.MediaDrmStateException)) {
            return (i11 < 23 || !(th3 instanceof MediaDrmResetException)) ? (i11 < 18 || !(th3 instanceof NotProvisionedException)) ? (i11 < 18 || !(th3 instanceof DeniedByServerException)) ? th3 instanceof C12321n0 ? new a(23, 0) : th3 instanceof C12308h.e ? new a(28, 0) : new a(30, 0) : new a(29, 0) : new a(24, 0) : new a(27, 0);
        }
        int m34900W = C11172r0.m34900W(((MediaDrm.MediaDrmStateException) th3).getDiagnosticInfo());
        return new a(m35538C0(m34900W), m34900W);
    }

    /* renamed from: G0 */
    private static Pair<String, String> m35542G0(String str) {
        String[] m34891R0 = C11172r0.m34891R0(str, "-");
        return Pair.create(m34891R0[0], m34891R0.length >= 2 ? m34891R0[1] : null);
    }

    /* renamed from: I0 */
    private static int m35543I0(Context context) {
        switch (C11181z.m35034d(context).m35040f()) {
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

    /* renamed from: J0 */
    private static int m35544J0(C11010c2 c11010c2) {
        C11010c2.h hVar = c11010c2.f28024b;
        if (hVar == null) {
            return 0;
        }
        int m34941p0 = C11172r0.m34941p0(hVar.f28097a, hVar.f28098b);
        if (m34941p0 == 0) {
            return 3;
        }
        if (m34941p0 != 1) {
            return m34941p0 != 2 ? 1 : 4;
        }
        return 5;
    }

    /* renamed from: K0 */
    private static int m35545K0(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 1 : 4;
        }
        return 3;
    }

    /* renamed from: L0 */
    private void m35546L0(InterfaceC11332b.b bVar) {
        for (int i10 = 0; i10 < bVar.m35516d(); i10++) {
            int m35514b = bVar.m35514b(i10);
            InterfaceC11332b.a m35515c = bVar.m35515c(m35514b);
            if (m35514b == 0) {
                this.f29493b.mo35571g(m35515c);
            } else if (m35514b == 11) {
                this.f29493b.mo35569e(m35515c, this.f29502k);
            } else {
                this.f29493b.mo35570f(m35515c);
            }
        }
    }

    /* renamed from: M0 */
    private void m35547M0(long j10) {
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis;
        NetworkEvent build;
        int m35543I0 = m35543I0(this.f29492a);
        if (m35543I0 != this.f29504m) {
            this.f29504m = m35543I0;
            PlaybackSession playbackSession = this.f29494c;
            networkType = new NetworkEvent.Builder().setNetworkType(m35543I0);
            timeSinceCreatedMillis = networkType.setTimeSinceCreatedMillis(j10 - this.f29495d);
            build = timeSinceCreatedMillis.build();
            playbackSession.reportNetworkEvent(build);
        }
    }

    /* renamed from: N0 */
    private void m35548N0(long j10) {
        PlaybackErrorEvent.Builder timeSinceCreatedMillis;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build;
        C11029f3 c11029f3 = this.f29505n;
        if (c11029f3 == null) {
            return;
        }
        a m35541F0 = m35541F0(c11029f3, this.f29492a, this.f29513v == 4);
        PlaybackSession playbackSession = this.f29494c;
        timeSinceCreatedMillis = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(j10 - this.f29495d);
        errorCode = timeSinceCreatedMillis.setErrorCode(m35541F0.f29518a);
        subErrorCode = errorCode.setSubErrorCode(m35541F0.f29519b);
        exception = subErrorCode.setException(c11029f3);
        build = exception.build();
        playbackSession.reportPlaybackErrorEvent(build);
        this.f29491A = true;
        this.f29505n = null;
    }

    /* renamed from: O0 */
    private void m35549O0(InterfaceC11053j3 interfaceC11053j3, InterfaceC11332b.b bVar, long j10) {
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis;
        PlaybackStateEvent build;
        if (interfaceC11053j3.mo33910F() != 2) {
            this.f29512u = false;
        }
        if (interfaceC11053j3.mo33934j() == null) {
            this.f29514w = false;
        } else if (bVar.m35513a(10)) {
            this.f29514w = true;
        }
        int m35557W0 = m35557W0(interfaceC11053j3);
        if (this.f29503l != m35557W0) {
            this.f29503l = m35557W0;
            this.f29491A = true;
            PlaybackSession playbackSession = this.f29494c;
            state = new PlaybackStateEvent.Builder().setState(this.f29503l);
            timeSinceCreatedMillis = state.setTimeSinceCreatedMillis(j10 - this.f29495d);
            build = timeSinceCreatedMillis.build();
            playbackSession.reportPlaybackStateEvent(build);
        }
    }

    /* renamed from: P0 */
    private void m35550P0(InterfaceC11053j3 interfaceC11053j3, InterfaceC11332b.b bVar, long j10) {
        if (bVar.m35513a(2)) {
            C11048i4 mo33938m = interfaceC11053j3.mo33938m();
            boolean m34166d = mo33938m.m34166d(2);
            boolean m34166d2 = mo33938m.m34166d(1);
            boolean m34166d3 = mo33938m.m34166d(3);
            if (m34166d || m34166d2 || m34166d3) {
                if (!m34166d) {
                    m35555U0(j10, null, 0);
                }
                if (!m34166d2) {
                    m35551Q0(j10, null, 0);
                }
                if (!m34166d3) {
                    m35553S0(j10, null, 0);
                }
            }
        }
        if (m35558z0(this.f29506o)) {
            b bVar2 = this.f29506o;
            C11108u1 c11108u1 = bVar2.f29520a;
            if (c11108u1.f28769C != -1) {
                m35555U0(j10, c11108u1, bVar2.f29521b);
                this.f29506o = null;
            }
        }
        if (m35558z0(this.f29507p)) {
            b bVar3 = this.f29507p;
            m35551Q0(j10, bVar3.f29520a, bVar3.f29521b);
            this.f29507p = null;
        }
        if (m35558z0(this.f29508q)) {
            b bVar4 = this.f29508q;
            m35553S0(j10, bVar4.f29520a, bVar4.f29521b);
            this.f29508q = null;
        }
    }

    /* renamed from: Q0 */
    private void m35551Q0(long j10, C11108u1 c11108u1, int i10) {
        if (C11172r0.m34914c(this.f29510s, c11108u1)) {
            return;
        }
        if (this.f29510s == null && i10 == 0) {
            i10 = 1;
        }
        this.f29510s = c11108u1;
        m35556V0(0, j10, c11108u1, i10);
    }

    /* renamed from: R0 */
    private void m35552R0(InterfaceC11053j3 interfaceC11053j3, InterfaceC11332b.b bVar) {
        C12318m m35539D0;
        if (bVar.m35513a(0)) {
            InterfaceC11332b.a m35515c = bVar.m35515c(0);
            if (this.f29501j != null) {
                m35554T0(m35515c.f29417b, m35515c.f29419d);
            }
        }
        if (bVar.m35513a(2) && this.f29501j != null && (m35539D0 = m35539D0(interfaceC11053j3.mo33938m().m34165c())) != null) {
            ((PlaybackMetrics.Builder) C11172r0.m34928j(this.f29501j)).setDrmType(m35540E0(m35539D0));
        }
        if (bVar.m35513a(1011)) {
            this.f29517z++;
        }
    }

    /* renamed from: S0 */
    private void m35553S0(long j10, C11108u1 c11108u1, int i10) {
        if (C11172r0.m34914c(this.f29511t, c11108u1)) {
            return;
        }
        if (this.f29511t == null && i10 == 0) {
            i10 = 1;
        }
        this.f29511t = c11108u1;
        m35556V0(2, j10, c11108u1, i10);
    }

    /* renamed from: T0 */
    private void m35554T0(AbstractC11018d4 abstractC11018d4, InterfaceC11684a0.b bVar) {
        int mo11856g;
        PlaybackMetrics.Builder builder = this.f29501j;
        if (bVar == null || (mo11856g = abstractC11018d4.mo11856g(bVar.f30974a)) == -1) {
            return;
        }
        abstractC11018d4.m34001k(mo11856g, this.f29497f);
        abstractC11018d4.m34004s(this.f29497f.f28227c, this.f29496e);
        builder.setStreamType(m35544J0(this.f29496e.f28257c));
        AbstractC11018d4.d dVar = this.f29496e;
        if (dVar.f28268y != -9223372036854775807L && !dVar.f28266w && !dVar.f28263t && !dVar.m34036i()) {
            builder.setMediaDurationMillis(this.f29496e.m34034g());
        }
        builder.setPlaybackType(this.f29496e.m34036i() ? 2 : 1);
        this.f29491A = true;
    }

    /* renamed from: U0 */
    private void m35555U0(long j10, C11108u1 c11108u1, int i10) {
        if (C11172r0.m34914c(this.f29509r, c11108u1)) {
            return;
        }
        if (this.f29509r == null && i10 == 0) {
            i10 = 1;
        }
        this.f29509r = c11108u1;
        m35556V0(1, j10, c11108u1, i10);
    }

    /* renamed from: V0 */
    private void m35556V0(int i10, long j10, C11108u1 c11108u1, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.f29495d);
        if (c11108u1 != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(m35545K0(i11));
            String str = c11108u1.f28796v;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c11108u1.f28797w;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c11108u1.f28794t;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = c11108u1.f28793s;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = c11108u1.f28768B;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = c11108u1.f28769C;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = c11108u1.f28776J;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = c11108u1.f28777K;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = c11108u1.f28788c;
            if (str4 != null) {
                Pair<String, String> m35542G0 = m35542G0(str4);
                timeSinceCreatedMillis.setLanguage((String) m35542G0.first);
                Object obj = m35542G0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = c11108u1.f28770D;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f29491A = true;
        PlaybackSession playbackSession = this.f29494c;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }

    /* renamed from: W0 */
    private int m35557W0(InterfaceC11053j3 interfaceC11053j3) {
        int mo33910F = interfaceC11053j3.mo33910F();
        if (this.f29512u) {
            return 5;
        }
        if (this.f29514w) {
            return 13;
        }
        if (mo33910F == 4) {
            return 11;
        }
        if (mo33910F == 2) {
            int i10 = this.f29503l;
            if (i10 == 0 || i10 == 2) {
                return 2;
            }
            if (interfaceC11053j3.mo33944u()) {
                return interfaceC11053j3.mo33940q() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (mo33910F == 3) {
            if (interfaceC11053j3.mo33944u()) {
                return interfaceC11053j3.mo33940q() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (mo33910F != 1 || this.f29503l == 0) {
            return this.f29503l;
        }
        return 12;
    }

    /* renamed from: z0 */
    private boolean m35558z0(b bVar) {
        return bVar != null && bVar.f29522c.equals(this.f29493b.mo35565a());
    }

    @Override // p376u6.InterfaceC11386l3.a
    /* renamed from: C */
    public void mo35559C(InterfaceC11332b.a aVar, String str) {
    }

    @Override // p376u6.InterfaceC11332b
    /* renamed from: H */
    public void mo35446H(InterfaceC11332b.a aVar, InterfaceC11053j3.e eVar, InterfaceC11053j3.e eVar2, int i10) {
        if (i10 == 1) {
            this.f29512u = true;
        }
        this.f29502k = i10;
    }

    /* renamed from: H0 */
    public LogSessionId m35560H0() {
        LogSessionId sessionId;
        sessionId = this.f29494c.getSessionId();
        return sessionId;
    }

    @Override // p376u6.InterfaceC11332b
    /* renamed from: K */
    public void mo35449K(InterfaceC11332b.a aVar, C11737x c11737x) {
        if (aVar.f29419d == null) {
            return;
        }
        b bVar = new b((C11108u1) C11137a.m34603e(c11737x.f30951c), c11737x.f30952d, this.f29493b.mo35566b(aVar.f29417b, (InterfaceC11684a0.b) C11137a.m34603e(aVar.f29419d)));
        int i10 = c11737x.f30950b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f29507p = bVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f29508q = bVar;
                return;
            }
        }
        this.f29506o = bVar;
    }

    @Override // p376u6.InterfaceC11332b
    /* renamed from: P */
    public void mo35454P(InterfaceC11332b.a aVar, int i10, long j10, long j11) {
        InterfaceC11684a0.b bVar = aVar.f29419d;
        if (bVar != null) {
            String mo35566b = this.f29493b.mo35566b(aVar.f29417b, (InterfaceC11684a0.b) C11137a.m34603e(bVar));
            Long l10 = this.f29499h.get(mo35566b);
            Long l11 = this.f29498g.get(mo35566b);
            this.f29499h.put(mo35566b, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.f29498g.put(mo35566b, Long.valueOf((l11 != null ? l11.longValue() : 0L) + i10));
        }
    }

    @Override // p376u6.InterfaceC11386l3.a
    /* renamed from: Y */
    public void mo35561Y(InterfaceC11332b.a aVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        InterfaceC11684a0.b bVar = aVar.f29419d;
        if (bVar == null || !bVar.m37106b()) {
            m35537B0();
            this.f29500i = str;
            playerName = new PlaybackMetrics.Builder().setPlayerName("ExoPlayerLib");
            playerVersion = playerName.setPlayerVersion("2.18.7");
            this.f29501j = playerVersion;
            m35554T0(aVar.f29417b, aVar.f29419d);
        }
    }

    @Override // p376u6.InterfaceC11386l3.a
    /* renamed from: b0 */
    public void mo35562b0(InterfaceC11332b.a aVar, String str, boolean z10) {
        InterfaceC11684a0.b bVar = aVar.f29419d;
        if ((bVar == null || !bVar.m37106b()) && str.equals(this.f29500i)) {
            m35537B0();
        }
        this.f29498g.remove(str);
        this.f29499h.remove(str);
    }

    @Override // p376u6.InterfaceC11332b
    /* renamed from: c */
    public void mo35467c(InterfaceC11332b.a aVar, C11029f3 c11029f3) {
        this.f29505n = c11029f3;
    }

    @Override // p376u6.InterfaceC11386l3.a
    /* renamed from: j0 */
    public void mo35563j0(InterfaceC11332b.a aVar, String str, String str2) {
    }

    @Override // p376u6.InterfaceC11332b
    /* renamed from: k0 */
    public void mo35483k0(InterfaceC11053j3 interfaceC11053j3, InterfaceC11332b.b bVar) {
        if (bVar.m35516d() == 0) {
            return;
        }
        m35546L0(bVar);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        m35552R0(interfaceC11053j3, bVar);
        m35548N0(elapsedRealtime);
        m35550P0(interfaceC11053j3, bVar, elapsedRealtime);
        m35547M0(elapsedRealtime);
        m35549O0(interfaceC11053j3, bVar, elapsedRealtime);
        if (bVar.m35513a(1028)) {
            this.f29493b.mo35567c(bVar.m35515c(1028));
        }
    }

    @Override // p376u6.InterfaceC11332b
    /* renamed from: q */
    public void mo35494q(InterfaceC11332b.a aVar, C12080e c12080e) {
        this.f29515x += c12080e.f32135g;
        this.f29516y += c12080e.f32133e;
    }

    @Override // p376u6.InterfaceC11332b
    /* renamed from: r0 */
    public void mo35497r0(InterfaceC11332b.a aVar, C11448a0 c11448a0) {
        b bVar = this.f29506o;
        if (bVar != null) {
            C11108u1 c11108u1 = bVar.f29520a;
            if (c11108u1.f28769C == -1) {
                this.f29506o = new b(c11108u1.m34488c().m34559n0(c11448a0.f29649a).m34538S(c11448a0.f29650b).m34526G(), bVar.f29521b, bVar.f29522c);
            }
        }
    }

    @Override // p376u6.InterfaceC11332b
    /* renamed from: v */
    public void mo35504v(InterfaceC11332b.a aVar, C11731u c11731u, C11737x c11737x, IOException iOException, boolean z10) {
        this.f29513v = c11737x.f30949a;
    }
}

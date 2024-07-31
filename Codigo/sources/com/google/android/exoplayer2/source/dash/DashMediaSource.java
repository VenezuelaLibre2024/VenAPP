package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.c;
import com.google.android.exoplayer2.source.dash.e;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s8.d0;
import s8.e0;
import s8.f0;
import s8.g0;
import s8.j;
import s8.m0;
import t6.b3;
import t6.c2;
import t6.d4;
import t6.r1;
import t8.i0;
import t8.r0;
import t8.s;
import v7.a0;
import v7.h0;
import v7.i;
import v7.u;
import v7.y;
import x6.l;
import x6.v;
import x6.x;
import z7.o;

/* loaded from: classes.dex */
public final class DashMediaSource extends v7.a {
    private final long A;
    private final h0.a B;
    private final g0.a<? extends z7.c> C;
    private final e D;
    private final Object E;
    private final SparseArray<com.google.android.exoplayer2.source.dash.b> F;
    private final Runnable G;
    private final Runnable H;
    private final e.b I;
    private final f0 J;
    private j K;
    private e0 L;
    private m0 M;
    private IOException N;
    private Handler O;
    private c2.g P;
    private Uri Q;
    private Uri R;
    private z7.c S;
    private boolean T;
    private long U;
    private long V;
    private long W;
    private int X;
    private long Y;
    private int Z;

    /* renamed from: s */
    private final c2 f8114s;

    /* renamed from: t */
    private final boolean f8115t;

    /* renamed from: u */
    private final j.a f8116u;

    /* renamed from: v */
    private final a.InterfaceC0140a f8117v;

    /* renamed from: w */
    private final i f8118w;

    /* renamed from: x */
    private final v f8119x;

    /* renamed from: y */
    private final d0 f8120y;

    /* renamed from: z */
    private final y7.b f8121z;

    /* loaded from: classes.dex */
    public static final class Factory implements a0.a {

        /* renamed from: a */
        private final a.InterfaceC0140a f8122a;

        /* renamed from: b */
        private final j.a f8123b;

        /* renamed from: c */
        private x f8124c;

        /* renamed from: d */
        private i f8125d;

        /* renamed from: e */
        private d0 f8126e;

        /* renamed from: f */
        private long f8127f;

        /* renamed from: g */
        private g0.a<? extends z7.c> f8128g;

        public Factory(a.InterfaceC0140a interfaceC0140a, j.a aVar) {
            this.f8122a = (a.InterfaceC0140a) t8.a.e(interfaceC0140a);
            this.f8123b = aVar;
            this.f8124c = new l();
            this.f8126e = new s8.v();
            this.f8127f = 30000L;
            this.f8125d = new v7.j();
        }

        public Factory(j.a aVar) {
            this(new c.a(aVar), aVar);
        }

        @Override // v7.a0.a
        /* renamed from: d */
        public DashMediaSource a(c2 c2Var) {
            t8.a.e(c2Var.f25880b);
            g0.a aVar = this.f8128g;
            if (aVar == null) {
                aVar = new z7.d();
            }
            List<u7.c> list = c2Var.f25880b.f25956d;
            return new DashMediaSource(c2Var, null, this.f8123b, !list.isEmpty() ? new u7.b(aVar, list) : aVar, this.f8122a, this.f8125d, this.f8124c.a(c2Var), this.f8126e, this.f8127f, null);
        }

        @Override // v7.a0.a
        /* renamed from: e */
        public Factory b(x xVar) {
            this.f8124c = (x) t8.a.f(xVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // v7.a0.a
        /* renamed from: f */
        public Factory c(d0 d0Var) {
            this.f8126e = (d0) t8.a.f(d0Var, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }
    }

    /* loaded from: classes.dex */
    public class a implements i0.b {
        a() {
        }

        @Override // t8.i0.b
        public void a() {
            DashMediaSource.this.b0(i0.h());
        }

        @Override // t8.i0.b
        public void b(IOException iOException) {
            DashMediaSource.this.a0(iOException);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends d4 {

        /* renamed from: f */
        private final long f8130f;

        /* renamed from: r */
        private final long f8131r;

        /* renamed from: s */
        private final long f8132s;

        /* renamed from: t */
        private final int f8133t;

        /* renamed from: u */
        private final long f8134u;

        /* renamed from: v */
        private final long f8135v;

        /* renamed from: w */
        private final long f8136w;

        /* renamed from: x */
        private final z7.c f8137x;

        /* renamed from: y */
        private final c2 f8138y;

        /* renamed from: z */
        private final c2.g f8139z;

        public b(long j10, long j11, long j12, int i10, long j13, long j14, long j15, z7.c cVar, c2 c2Var, c2.g gVar) {
            t8.a.g(cVar.f32362d == (gVar != null));
            this.f8130f = j10;
            this.f8131r = j11;
            this.f8132s = j12;
            this.f8133t = i10;
            this.f8134u = j13;
            this.f8135v = j14;
            this.f8136w = j15;
            this.f8137x = cVar;
            this.f8138y = c2Var;
            this.f8139z = gVar;
        }

        private long x(long j10) {
            y7.f l10;
            long j11 = this.f8136w;
            if (!y(this.f8137x)) {
                return j11;
            }
            if (j10 > 0) {
                j11 += j10;
                if (j11 > this.f8135v) {
                    return -9223372036854775807L;
                }
            }
            long j12 = this.f8134u + j11;
            long g10 = this.f8137x.g(0);
            int i10 = 0;
            while (i10 < this.f8137x.e() - 1 && j12 >= g10) {
                j12 -= g10;
                i10++;
                g10 = this.f8137x.g(i10);
            }
            z7.g d10 = this.f8137x.d(i10);
            int a10 = d10.a(2);
            return (a10 == -1 || (l10 = d10.f32396c.get(a10).f32351c.get(0).l()) == null || l10.g(g10) == 0) ? j11 : (j11 + l10.c(l10.f(j12, g10))) - j12;
        }

        private static boolean y(z7.c cVar) {
            return cVar.f32362d && cVar.f32363e != -9223372036854775807L && cVar.f32360b == -9223372036854775807L;
        }

        @Override // t6.d4
        public int g(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f8133t) >= 0 && intValue < n()) {
                return intValue;
            }
            return -1;
        }

        @Override // t6.d4
        public d4.b l(int i10, d4.b bVar, boolean z10) {
            t8.a.c(i10, 0, n());
            return bVar.v(z10 ? this.f8137x.d(i10).f32394a : null, z10 ? Integer.valueOf(this.f8133t + i10) : null, 0, this.f8137x.g(i10), r0.C0(this.f8137x.d(i10).f32395b - this.f8137x.d(0).f32395b) - this.f8134u);
        }

        @Override // t6.d4
        public int n() {
            return this.f8137x.e();
        }

        @Override // t6.d4
        public Object r(int i10) {
            t8.a.c(i10, 0, n());
            return Integer.valueOf(this.f8133t + i10);
        }

        @Override // t6.d4
        public d4.d t(int i10, d4.d dVar, long j10) {
            t8.a.c(i10, 0, 1);
            long x10 = x(j10);
            Object obj = d4.d.C;
            c2 c2Var = this.f8138y;
            z7.c cVar = this.f8137x;
            return dVar.j(obj, c2Var, cVar, this.f8130f, this.f8131r, this.f8132s, true, y(cVar), this.f8139z, x10, this.f8135v, 0, n() - 1, this.f8134u);
        }

        @Override // t6.d4
        public int u() {
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c implements e.b {
        private c() {
        }

        /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }

        @Override // com.google.android.exoplayer2.source.dash.e.b
        public void a(long j10) {
            DashMediaSource.this.T(j10);
        }

        @Override // com.google.android.exoplayer2.source.dash.e.b
        public void b() {
            DashMediaSource.this.U();
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements g0.a<Long> {

        /* renamed from: a */
        private static final Pattern f8141a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        d() {
        }

        @Override // s8.g0.a
        /* renamed from: b */
        public Long a(Uri uri, InputStream inputStream) {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, eb.e.f14596c)).readLine();
            try {
                Matcher matcher = f8141a.matcher(readLine);
                if (!matcher.matches()) {
                    throw b3.c("Couldn't parse timestamp: " + readLine, null);
                }
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j10 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long parseLong = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    time -= j10 * ((((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60) * 1000);
                }
                return Long.valueOf(time);
            } catch (ParseException e10) {
                throw b3.c(null, e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class e implements e0.b<g0<z7.c>> {
        private e() {
        }

        /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }

        @Override // s8.e0.b
        /* renamed from: a */
        public void i(g0<z7.c> g0Var, long j10, long j11, boolean z10) {
            DashMediaSource.this.V(g0Var, j10, j11);
        }

        @Override // s8.e0.b
        /* renamed from: b */
        public void m(g0<z7.c> g0Var, long j10, long j11) {
            DashMediaSource.this.W(g0Var, j10, j11);
        }

        @Override // s8.e0.b
        /* renamed from: c */
        public e0.c h(g0<z7.c> g0Var, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.X(g0Var, j10, j11, iOException, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class f implements f0 {
        f() {
        }

        private void b() {
            if (DashMediaSource.this.N != null) {
                throw DashMediaSource.this.N;
            }
        }

        @Override // s8.f0
        public void a() {
            DashMediaSource.this.L.a();
            b();
        }
    }

    /* loaded from: classes.dex */
    public final class g implements e0.b<g0<Long>> {
        private g() {
        }

        /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }

        @Override // s8.e0.b
        /* renamed from: a */
        public void i(g0<Long> g0Var, long j10, long j11, boolean z10) {
            DashMediaSource.this.V(g0Var, j10, j11);
        }

        @Override // s8.e0.b
        /* renamed from: b */
        public void m(g0<Long> g0Var, long j10, long j11) {
            DashMediaSource.this.Y(g0Var, j10, j11);
        }

        @Override // s8.e0.b
        /* renamed from: c */
        public e0.c h(g0<Long> g0Var, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.Z(g0Var, j10, j11, iOException);
        }
    }

    /* loaded from: classes.dex */
    public static final class h implements g0.a<Long> {
        private h() {
        }

        /* synthetic */ h(a aVar) {
            this();
        }

        @Override // s8.g0.a
        /* renamed from: b */
        public Long a(Uri uri, InputStream inputStream) {
            return Long.valueOf(r0.J0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        r1.a("goog.exo.dash");
    }

    private DashMediaSource(c2 c2Var, z7.c cVar, j.a aVar, g0.a<? extends z7.c> aVar2, a.InterfaceC0140a interfaceC0140a, i iVar, v vVar, d0 d0Var, long j10) {
        this.f8114s = c2Var;
        this.P = c2Var.f25882d;
        this.Q = ((c2.h) t8.a.e(c2Var.f25880b)).f25953a;
        this.R = c2Var.f25880b.f25953a;
        this.S = cVar;
        this.f8116u = aVar;
        this.C = aVar2;
        this.f8117v = interfaceC0140a;
        this.f8119x = vVar;
        this.f8120y = d0Var;
        this.A = j10;
        this.f8118w = iVar;
        this.f8121z = new y7.b();
        boolean z10 = cVar != null;
        this.f8115t = z10;
        this.B = w(null);
        this.E = new Object();
        this.F = new SparseArray<>();
        this.I = new c(this, null);
        this.Y = -9223372036854775807L;
        this.W = -9223372036854775807L;
        if (!z10) {
            this.D = new e(this, null);
            this.J = new f();
            this.G = new Runnable() { // from class: y7.d
                public /* synthetic */ d() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    DashMediaSource.this.i0();
                }
            };
            this.H = new Runnable() { // from class: y7.e
                public /* synthetic */ e() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    DashMediaSource.this.R();
                }
            };
            return;
        }
        t8.a.g(true ^ cVar.f32362d);
        this.D = null;
        this.G = null;
        this.H = null;
        this.J = new f0.a();
    }

    /* synthetic */ DashMediaSource(c2 c2Var, z7.c cVar, j.a aVar, g0.a aVar2, a.InterfaceC0140a interfaceC0140a, i iVar, v vVar, d0 d0Var, long j10, a aVar3) {
        this(c2Var, cVar, aVar, aVar2, interfaceC0140a, iVar, vVar, d0Var, j10);
    }

    private static long L(z7.g gVar, long j10, long j11) {
        long C0 = r0.C0(gVar.f32395b);
        boolean P = P(gVar);
        long j12 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < gVar.f32396c.size(); i10++) {
            z7.a aVar = gVar.f32396c.get(i10);
            List<z7.j> list = aVar.f32351c;
            int i11 = aVar.f32350b;
            boolean z10 = (i11 == 1 || i11 == 2) ? false : true;
            if ((!P || !z10) && !list.isEmpty()) {
                y7.f l10 = list.get(0).l();
                if (l10 == null) {
                    return C0 + j10;
                }
                long j13 = l10.j(j10, j11);
                if (j13 == 0) {
                    return C0;
                }
                long b10 = (l10.b(j10, j11) + j13) - 1;
                j12 = Math.min(j12, l10.a(b10, j10) + l10.c(b10) + C0);
            }
        }
        return j12;
    }

    private static long M(z7.g gVar, long j10, long j11) {
        long C0 = r0.C0(gVar.f32395b);
        boolean P = P(gVar);
        long j12 = C0;
        for (int i10 = 0; i10 < gVar.f32396c.size(); i10++) {
            z7.a aVar = gVar.f32396c.get(i10);
            List<z7.j> list = aVar.f32351c;
            int i11 = aVar.f32350b;
            boolean z10 = (i11 == 1 || i11 == 2) ? false : true;
            if ((!P || !z10) && !list.isEmpty()) {
                y7.f l10 = list.get(0).l();
                if (l10 == null || l10.j(j10, j11) == 0) {
                    return C0;
                }
                j12 = Math.max(j12, l10.c(l10.b(j10, j11)) + C0);
            }
        }
        return j12;
    }

    private static long N(z7.c cVar, long j10) {
        y7.f l10;
        int e10 = cVar.e() - 1;
        z7.g d10 = cVar.d(e10);
        long C0 = r0.C0(d10.f32395b);
        long g10 = cVar.g(e10);
        long C02 = r0.C0(j10);
        long C03 = r0.C0(cVar.f32359a);
        long C04 = r0.C0(5000L);
        for (int i10 = 0; i10 < d10.f32396c.size(); i10++) {
            List<z7.j> list = d10.f32396c.get(i10).f32351c;
            if (!list.isEmpty() && (l10 = list.get(0).l()) != null) {
                long d11 = ((C03 + C0) + l10.d(g10, C02)) - C02;
                if (d11 < C04 - 100000 || (d11 > C04 && d11 < C04 + 100000)) {
                    C04 = d11;
                }
            }
        }
        return gb.c.b(C04, 1000L, RoundingMode.CEILING);
    }

    private long O() {
        return Math.min((this.X - 1) * AdError.NETWORK_ERROR_CODE, 5000);
    }

    private static boolean P(z7.g gVar) {
        for (int i10 = 0; i10 < gVar.f32396c.size(); i10++) {
            int i11 = gVar.f32396c.get(i10).f32350b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean Q(z7.g gVar) {
        for (int i10 = 0; i10 < gVar.f32396c.size(); i10++) {
            y7.f l10 = gVar.f32396c.get(i10).f32351c.get(0).l();
            if (l10 == null || l10.h()) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ void R() {
        c0(false);
    }

    private void S() {
        i0.j(this.L, new a());
    }

    public void a0(IOException iOException) {
        s.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        c0(true);
    }

    public void b0(long j10) {
        this.W = j10;
        c0(true);
    }

    private void c0(boolean z10) {
        z7.g gVar;
        long j10;
        long j11;
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            int keyAt = this.F.keyAt(i10);
            if (keyAt >= this.Z) {
                this.F.valueAt(i10).K(this.S, keyAt - this.Z);
            }
        }
        z7.g d10 = this.S.d(0);
        int e10 = this.S.e() - 1;
        z7.g d11 = this.S.d(e10);
        long g10 = this.S.g(e10);
        long C0 = r0.C0(r0.b0(this.W));
        long M = M(d10, this.S.g(0), C0);
        long L = L(d11, g10, C0);
        boolean z11 = this.S.f32362d && !Q(d11);
        if (z11) {
            long j12 = this.S.f32364f;
            if (j12 != -9223372036854775807L) {
                M = Math.max(M, L - r0.C0(j12));
            }
        }
        long j13 = L - M;
        z7.c cVar = this.S;
        if (cVar.f32362d) {
            t8.a.g(cVar.f32359a != -9223372036854775807L);
            long C02 = (C0 - r0.C0(this.S.f32359a)) - M;
            j0(C02, j13);
            long a12 = this.S.f32359a + r0.a1(M);
            long C03 = C02 - r0.C0(this.P.f25943a);
            long min = Math.min(5000000L, j13 / 2);
            j10 = a12;
            j11 = C03 < min ? min : C03;
            gVar = d10;
        } else {
            gVar = d10;
            j10 = -9223372036854775807L;
            j11 = 0;
        }
        long C04 = M - r0.C0(gVar.f32395b);
        z7.c cVar2 = this.S;
        D(new b(cVar2.f32359a, j10, this.W, this.Z, C04, j13, j11, cVar2, this.f8114s, cVar2.f32362d ? this.P : null));
        if (this.f8115t) {
            return;
        }
        this.O.removeCallbacks(this.H);
        if (z11) {
            this.O.postDelayed(this.H, N(this.S, r0.b0(this.W)));
        }
        if (this.T) {
            i0();
            return;
        }
        if (z10) {
            z7.c cVar3 = this.S;
            if (cVar3.f32362d) {
                long j14 = cVar3.f32363e;
                if (j14 != -9223372036854775807L) {
                    if (j14 == 0) {
                        j14 = 5000;
                    }
                    g0(Math.max(0L, (this.U + j14) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    private void d0(o oVar) {
        g0.a<Long> dVar;
        String str = oVar.f32449a;
        if (r0.c(str, "urn:mpeg:dash:utc:direct:2014") || r0.c(str, "urn:mpeg:dash:utc:direct:2012")) {
            e0(oVar);
            return;
        }
        if (r0.c(str, "urn:mpeg:dash:utc:http-iso:2014") || r0.c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            dVar = new d();
        } else {
            if (!r0.c(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !r0.c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                if (r0.c(str, "urn:mpeg:dash:utc:ntp:2014") || r0.c(str, "urn:mpeg:dash:utc:ntp:2012")) {
                    S();
                    return;
                } else {
                    a0(new IOException("Unsupported UTC timing scheme"));
                    return;
                }
            }
            dVar = new h(null);
        }
        f0(oVar, dVar);
    }

    private void e0(o oVar) {
        try {
            b0(r0.J0(oVar.f32450b) - this.V);
        } catch (b3 e10) {
            a0(e10);
        }
    }

    private void f0(o oVar, g0.a<Long> aVar) {
        h0(new g0(this.K, Uri.parse(oVar.f32450b), 5, aVar), new g(this, null), 1);
    }

    private void g0(long j10) {
        this.O.postDelayed(this.G, j10);
    }

    private <T> void h0(g0<T> g0Var, e0.b<g0<T>> bVar, int i10) {
        this.B.z(new u(g0Var.f25248a, g0Var.f25249b, this.L.n(g0Var, bVar, i10)), g0Var.f25250c);
    }

    public void i0() {
        Uri uri;
        this.O.removeCallbacks(this.G);
        if (this.L.i()) {
            return;
        }
        if (this.L.j()) {
            this.T = true;
            return;
        }
        synchronized (this.E) {
            uri = this.Q;
        }
        this.T = false;
        h0(new g0(this.K, uri, 4, this.C), this.D, this.f8120y.a(4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0061, code lost:
    
        if (r1 != (-9223372036854775807L)) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0025, code lost:
    
        if (r1 != (-9223372036854775807L)) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j0(long r18, long r20) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.j0(long, long):void");
    }

    @Override // v7.a
    protected void C(m0 m0Var) {
        this.M = m0Var;
        this.f8119x.b(Looper.myLooper(), A());
        this.f8119x.a();
        if (this.f8115t) {
            c0(false);
            return;
        }
        this.K = this.f8116u.a();
        this.L = new e0("DashMediaSource");
        this.O = r0.w();
        i0();
    }

    @Override // v7.a
    protected void E() {
        this.T = false;
        this.K = null;
        e0 e0Var = this.L;
        if (e0Var != null) {
            e0Var.l();
            this.L = null;
        }
        this.U = 0L;
        this.V = 0L;
        this.S = this.f8115t ? this.S : null;
        this.Q = this.R;
        this.N = null;
        Handler handler = this.O;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.O = null;
        }
        this.W = -9223372036854775807L;
        this.X = 0;
        this.Y = -9223372036854775807L;
        this.Z = 0;
        this.F.clear();
        this.f8121z.i();
        this.f8119x.release();
    }

    void T(long j10) {
        long j11 = this.Y;
        if (j11 == -9223372036854775807L || j11 < j10) {
            this.Y = j10;
        }
    }

    void U() {
        this.O.removeCallbacks(this.H);
        i0();
    }

    void V(g0<?> g0Var, long j10, long j11) {
        u uVar = new u(g0Var.f25248a, g0Var.f25249b, g0Var.f(), g0Var.d(), j10, j11, g0Var.a());
        this.f8120y.c(g0Var.f25248a);
        this.B.q(uVar, g0Var.f25250c);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void W(s8.g0<z7.c> r19, long r20, long r22) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.W(s8.g0, long, long):void");
    }

    e0.c X(g0<z7.c> g0Var, long j10, long j11, IOException iOException, int i10) {
        u uVar = new u(g0Var.f25248a, g0Var.f25249b, g0Var.f(), g0Var.d(), j10, j11, g0Var.a());
        long d10 = this.f8120y.d(new d0.c(uVar, new v7.x(g0Var.f25250c), iOException, i10));
        e0.c h10 = d10 == -9223372036854775807L ? e0.f25221g : e0.h(false, d10);
        boolean z10 = !h10.c();
        this.B.x(uVar, g0Var.f25250c, iOException, z10);
        if (z10) {
            this.f8120y.c(g0Var.f25248a);
        }
        return h10;
    }

    void Y(g0<Long> g0Var, long j10, long j11) {
        u uVar = new u(g0Var.f25248a, g0Var.f25249b, g0Var.f(), g0Var.d(), j10, j11, g0Var.a());
        this.f8120y.c(g0Var.f25248a);
        this.B.t(uVar, g0Var.f25250c);
        b0(g0Var.e().longValue() - j10);
    }

    e0.c Z(g0<Long> g0Var, long j10, long j11, IOException iOException) {
        this.B.x(new u(g0Var.f25248a, g0Var.f25249b, g0Var.f(), g0Var.d(), j10, j11, g0Var.a()), g0Var.f25250c, iOException, true);
        this.f8120y.c(g0Var.f25248a);
        a0(iOException);
        return e0.f25220f;
    }

    @Override // v7.a0
    public c2 d() {
        return this.f8114s;
    }

    @Override // v7.a0
    public y e(a0.b bVar, s8.b bVar2, long j10) {
        int intValue = ((Integer) bVar.f28543a).intValue() - this.Z;
        h0.a x10 = x(bVar, this.S.d(intValue).f32395b);
        com.google.android.exoplayer2.source.dash.b bVar3 = new com.google.android.exoplayer2.source.dash.b(intValue + this.Z, this.S, this.f8121z, intValue, this.f8117v, this.M, this.f8119x, u(bVar), this.f8120y, x10, this.W, this.J, bVar2, this.f8118w, this.I, A());
        this.F.put(bVar3.f8145a, bVar3);
        return bVar3;
    }

    @Override // v7.a0
    public void l(y yVar) {
        com.google.android.exoplayer2.source.dash.b bVar = (com.google.android.exoplayer2.source.dash.b) yVar;
        bVar.G();
        this.F.remove(bVar.f8145a);
    }

    @Override // v7.a0
    public void n() {
        this.J.a();
    }
}

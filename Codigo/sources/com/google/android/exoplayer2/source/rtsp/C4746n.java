package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.source.rtsp.C4731d;
import com.google.android.exoplayer2.source.rtsp.C4742j;
import com.google.android.exoplayer2.source.rtsp.C4746n;
import com.google.android.exoplayer2.source.rtsp.C4751s;
import com.google.android.exoplayer2.source.rtsp.InterfaceC4727b;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.common.collect.AbstractC5907w;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import p307q8.InterfaceC10312r;
import p351s8.C10818e0;
import p351s8.InterfaceC10811b;
import p361t6.C11108u1;
import p361t6.C11110u3;
import p361t6.C11113v1;
import p363t8.C11137a;
import p363t8.C11172r0;
import p397v7.C11694d1;
import p397v7.C11700f1;
import p397v7.C11732u0;
import p397v7.InterfaceC11734v0;
import p397v7.InterfaceC11739y;
import p414w6.C12082g;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12623m;
import p459y6.InterfaceC12636z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.source.rtsp.n */
/* loaded from: classes.dex */
public final class C4746n implements InterfaceC11739y {

    /* renamed from: A */
    private boolean f9436A;

    /* renamed from: B */
    private boolean f9437B;

    /* renamed from: C */
    private boolean f9438C;

    /* renamed from: D */
    private boolean f9439D;

    /* renamed from: E */
    private boolean f9440E;

    /* renamed from: F */
    private int f9441F;

    /* renamed from: G */
    private boolean f9442G;

    /* renamed from: a */
    private final InterfaceC10811b f9443a;

    /* renamed from: b */
    private final Handler f9444b = C11172r0.m34954w();

    /* renamed from: c */
    private final b f9445c;

    /* renamed from: d */
    private final C4742j f9446d;

    /* renamed from: e */
    private final List<e> f9447e;

    /* renamed from: f */
    private final List<d> f9448f;

    /* renamed from: r */
    private final c f9449r;

    /* renamed from: s */
    private final InterfaceC4727b.a f9450s;

    /* renamed from: t */
    private InterfaceC11739y.a f9451t;

    /* renamed from: u */
    private AbstractC5907w<C11694d1> f9452u;

    /* renamed from: v */
    private IOException f9453v;

    /* renamed from: w */
    private RtspMediaSource.C4724c f9454w;

    /* renamed from: x */
    private long f9455x;

    /* renamed from: y */
    private long f9456y;

    /* renamed from: z */
    private long f9457z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.source.rtsp.n$b */
    /* loaded from: classes.dex */
    public final class b implements InterfaceC12623m, C10818e0.b<C4731d>, C11732u0.d, C4742j.f, C4742j.e {
        private b() {
        }

        @Override // p397v7.C11732u0.d
        /* renamed from: a */
        public void mo304a(C11108u1 c11108u1) {
            Handler handler = C4746n.this.f9444b;
            final C4746n c4746n = C4746n.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.o
                @Override // java.lang.Runnable
                public final void run() {
                    C4746n.m12140C(C4746n.this);
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.rtsp.C4742j.f
        /* renamed from: b */
        public void mo12126b(String str, Throwable th2) {
            C4746n.this.f9453v = th2 == null ? new IOException(str) : new IOException(str, th2);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.C4742j.e
        /* renamed from: c */
        public void mo12123c(RtspMediaSource.C4724c c4724c) {
            C4746n.this.f9454w = c4724c;
        }

        @Override // p459y6.InterfaceC12623m
        /* renamed from: d */
        public InterfaceC12609b0 mo308d(int i10, int i11) {
            return ((e) C11137a.m34603e((e) C4746n.this.f9447e.get(i10))).f9465c;
        }

        @Override // com.google.android.exoplayer2.source.rtsp.C4742j.e
        /* renamed from: e */
        public void mo12124e() {
            C4746n.this.f9446d.m12099a1(0L);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.C4742j.e
        /* renamed from: f */
        public void mo12125f(long j10, AbstractC5907w<C4728b0> abstractC5907w) {
            ArrayList arrayList = new ArrayList(abstractC5907w.size());
            for (int i10 = 0; i10 < abstractC5907w.size(); i10++) {
                arrayList.add((String) C11137a.m34603e(abstractC5907w.get(i10).f9325c.getPath()));
            }
            for (int i11 = 0; i11 < C4746n.this.f9448f.size(); i11++) {
                if (!arrayList.contains(((d) C4746n.this.f9448f.get(i11)).m12189c().getPath())) {
                    C4746n.this.f9449r.mo11979a();
                    if (C4746n.this.m12154R()) {
                        C4746n.this.f9437B = true;
                        C4746n.this.f9456y = -9223372036854775807L;
                        C4746n.this.f9455x = -9223372036854775807L;
                        C4746n.this.f9457z = -9223372036854775807L;
                    }
                }
            }
            for (int i12 = 0; i12 < abstractC5907w.size(); i12++) {
                C4728b0 c4728b0 = abstractC5907w.get(i12);
                C4731d m12153P = C4746n.this.m12153P(c4728b0.f9325c);
                if (m12153P != null) {
                    m12153P.m12034h(c4728b0.f9323a);
                    m12153P.m12033g(c4728b0.f9324b);
                    if (C4746n.this.m12154R() && C4746n.this.f9456y == C4746n.this.f9455x) {
                        m12153P.m12032f(j10, c4728b0.f9323a);
                    }
                }
            }
            if (!C4746n.this.m12154R()) {
                if (C4746n.this.f9457z != -9223372036854775807L) {
                    C4746n c4746n = C4746n.this;
                    c4746n.mo251j(c4746n.f9457z);
                    C4746n.this.f9457z = -9223372036854775807L;
                    return;
                }
                return;
            }
            if (C4746n.this.f9456y == C4746n.this.f9455x) {
                C4746n.this.f9456y = -9223372036854775807L;
                C4746n.this.f9455x = -9223372036854775807L;
            } else {
                C4746n.this.f9456y = -9223372036854775807L;
                C4746n c4746n2 = C4746n.this;
                c4746n2.mo251j(c4746n2.f9455x);
            }
        }

        @Override // com.google.android.exoplayer2.source.rtsp.C4742j.f
        /* renamed from: g */
        public void mo12127g(C4758z c4758z, AbstractC5907w<C4750r> abstractC5907w) {
            for (int i10 = 0; i10 < abstractC5907w.size(); i10++) {
                C4750r c4750r = abstractC5907w.get(i10);
                C4746n c4746n = C4746n.this;
                e eVar = new e(c4750r, i10, c4746n.f9450s);
                C4746n.this.f9447e.add(eVar);
                eVar.m12201j();
            }
            C4746n.this.f9449r.mo11980b(c4758z);
        }

        @Override // p351s8.C10818e0.b
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public void mo313i(C4731d c4731d, long j10, long j11, boolean z10) {
        }

        @Override // p459y6.InterfaceC12623m
        /* renamed from: p */
        public void mo323p(InterfaceC12636z interfaceC12636z) {
        }

        @Override // p459y6.InterfaceC12623m
        /* renamed from: q */
        public void mo324q() {
            Handler handler = C4746n.this.f9444b;
            final C4746n c4746n = C4746n.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.p
                @Override // java.lang.Runnable
                public final void run() {
                    C4746n.m12140C(C4746n.this);
                }
            });
        }

        @Override // p351s8.C10818e0.b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public void mo317m(C4731d c4731d, long j10, long j11) {
            if (C4746n.this.mo249f() == 0) {
                if (C4746n.this.f9442G) {
                    return;
                }
                C4746n.this.m12157W();
                C4746n.this.f9442G = true;
                return;
            }
            for (int i10 = 0; i10 < C4746n.this.f9447e.size(); i10++) {
                e eVar = (e) C4746n.this.f9447e.get(i10);
                if (eVar.f9463a.f9460b == c4731d) {
                    eVar.m12194c();
                    return;
                }
            }
        }

        @Override // p351s8.C10818e0.b
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C10818e0.c mo311h(C4731d c4731d, long j10, long j11, IOException iOException, int i10) {
            if (!C4746n.this.f9439D) {
                C4746n.this.f9453v = iOException;
            } else if (!(iOException.getCause() instanceof BindException)) {
                C4746n.this.f9454w = new RtspMediaSource.C4724c(c4731d.f9354b.f9475b.toString(), iOException);
            } else if (C4746n.m12160a(C4746n.this) < 3) {
                return C10818e0.f27337d;
            }
            return C10818e0.f27339f;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.rtsp.n$c */
    /* loaded from: classes.dex */
    interface c {
        /* renamed from: a */
        default void mo11979a() {
        }

        /* renamed from: b */
        void mo11980b(C4758z c4758z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.exoplayer2.source.rtsp.n$d */
    /* loaded from: classes.dex */
    public final class d {

        /* renamed from: a */
        public final C4750r f9459a;

        /* renamed from: b */
        private final C4731d f9460b;

        /* renamed from: c */
        private String f9461c;

        public d(C4750r c4750r, int i10, InterfaceC4727b.a aVar) {
            this.f9459a = c4750r;
            this.f9460b = new C4731d(i10, c4750r, new C4731d.a() { // from class: com.google.android.exoplayer2.source.rtsp.q
                @Override // com.google.android.exoplayer2.source.rtsp.C4731d.a
                /* renamed from: a */
                public final void mo12035a(String str, InterfaceC4727b interfaceC4727b) {
                    C4746n.d.this.m12188f(str, interfaceC4727b);
                }
            }, C4746n.this.f9445c, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m12188f(String str, InterfaceC4727b interfaceC4727b) {
            this.f9461c = str;
            C4751s.b mo11999j = interfaceC4727b.mo11999j();
            if (mo11999j != null) {
                C4746n.this.f9446d.m12094J0(interfaceC4727b.mo11998c(), mo11999j);
                C4746n.this.f9442G = true;
            }
            C4746n.this.m12156T();
        }

        /* renamed from: c */
        public Uri m12189c() {
            return this.f9460b.f9354b.f9475b;
        }

        /* renamed from: d */
        public String m12190d() {
            C11137a.m34607i(this.f9461c);
            return this.f9461c;
        }

        /* renamed from: e */
        public boolean m12191e() {
            return this.f9461c != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.source.rtsp.n$e */
    /* loaded from: classes.dex */
    public final class e {

        /* renamed from: a */
        public final d f9463a;

        /* renamed from: b */
        private final C10818e0 f9464b;

        /* renamed from: c */
        private final C11732u0 f9465c;

        /* renamed from: d */
        private boolean f9466d;

        /* renamed from: e */
        private boolean f9467e;

        public e(C4750r c4750r, int i10, InterfaceC4727b.a aVar) {
            this.f9463a = new d(c4750r, i10, aVar);
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper ");
            sb2.append(i10);
            this.f9464b = new C10818e0(sb2.toString());
            C11732u0 m37041l = C11732u0.m37041l(C4746n.this.f9443a);
            this.f9465c = m37041l;
            m37041l.m37066d0(C4746n.this.f9445c);
        }

        /* renamed from: c */
        public void m12194c() {
            if (this.f9466d) {
                return;
            }
            this.f9463a.f9460b.mo224c();
            this.f9466d = true;
            C4746n.this.m12161a0();
        }

        /* renamed from: d */
        public long m12195d() {
            return this.f9465c.m37077z();
        }

        /* renamed from: e */
        public boolean m12196e() {
            return this.f9465c.m37054K(this.f9466d);
        }

        /* renamed from: f */
        public int m12197f(C11113v1 c11113v1, C12082g c12082g, int i10) {
            return this.f9465c.m37058S(c11113v1, c12082g, i10, this.f9466d);
        }

        /* renamed from: g */
        public void m12198g() {
            if (this.f9467e) {
                return;
            }
            this.f9464b.m32982l();
            this.f9465c.m37059T();
            this.f9467e = true;
        }

        /* renamed from: h */
        public void m12199h(long j10) {
            if (this.f9466d) {
                return;
            }
            this.f9463a.f9460b.m12031e();
            this.f9465c.m37060V();
            this.f9465c.m37065b0(j10);
        }

        /* renamed from: i */
        public int m12200i(long j10) {
            int m37049E = this.f9465c.m37049E(j10, this.f9466d);
            this.f9465c.m37067e0(m37049E);
            return m37049E;
        }

        /* renamed from: j */
        public void m12201j() {
            this.f9464b.m32984n(this.f9463a.f9460b, C4746n.this.f9445c, 0);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.rtsp.n$f */
    /* loaded from: classes.dex */
    private final class f implements InterfaceC11734v0 {

        /* renamed from: a */
        private final int f9469a;

        public f(int i10) {
            this.f9469a = i10;
        }

        @Override // p397v7.InterfaceC11734v0
        /* renamed from: a */
        public void mo262a() {
            if (C4746n.this.f9454w != null) {
                throw C4746n.this.f9454w;
            }
        }

        @Override // p397v7.InterfaceC11734v0
        /* renamed from: d */
        public boolean mo264d() {
            return C4746n.this.m12175Q(this.f9469a);
        }

        @Override // p397v7.InterfaceC11734v0
        /* renamed from: p */
        public int mo266p(long j10) {
            return C4746n.this.m12178Y(this.f9469a, j10);
        }

        @Override // p397v7.InterfaceC11734v0
        /* renamed from: q */
        public int mo267q(C11113v1 c11113v1, C12082g c12082g, int i10) {
            return C4746n.this.m12176U(this.f9469a, c11113v1, c12082g, i10);
        }
    }

    public C4746n(InterfaceC10811b interfaceC10811b, InterfaceC4727b.a aVar, Uri uri, c cVar, String str, SocketFactory socketFactory, boolean z10) {
        this.f9443a = interfaceC10811b;
        this.f9450s = aVar;
        this.f9449r = cVar;
        b bVar = new b();
        this.f9445c = bVar;
        this.f9446d = new C4742j(bVar, bVar, str, uri, socketFactory, z10);
        this.f9447e = new ArrayList();
        this.f9448f = new ArrayList();
        this.f9456y = -9223372036854775807L;
        this.f9455x = -9223372036854775807L;
        this.f9457z = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static /* synthetic */ void m12140C(C4746n c4746n) {
        c4746n.m12155S();
    }

    /* renamed from: O */
    private static AbstractC5907w<C11694d1> m12152O(AbstractC5907w<e> abstractC5907w) {
        AbstractC5907w.a aVar = new AbstractC5907w.a();
        for (int i10 = 0; i10 < abstractC5907w.size(); i10++) {
            aVar.mo14724a(new C11694d1(Integer.toString(i10), (C11108u1) C11137a.m34603e(abstractC5907w.get(i10).f9465c.m37050F())));
        }
        return aVar.m15094k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public C4731d m12153P(Uri uri) {
        for (int i10 = 0; i10 < this.f9447e.size(); i10++) {
            if (!this.f9447e.get(i10).f9466d) {
                d dVar = this.f9447e.get(i10).f9463a;
                if (dVar.m12189c().equals(uri)) {
                    return dVar.f9460b;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public boolean m12154R() {
        return this.f9456y != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public void m12155S() {
        if (this.f9438C || this.f9439D) {
            return;
        }
        for (int i10 = 0; i10 < this.f9447e.size(); i10++) {
            if (this.f9447e.get(i10).f9465c.m37050F() == null) {
                return;
            }
        }
        this.f9439D = true;
        this.f9452u = m12152O(AbstractC5907w.m15079r(this.f9447e));
        ((InterfaceC11739y.a) C11137a.m34603e(this.f9451t)).mo34427h(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public void m12156T() {
        boolean z10 = true;
        for (int i10 = 0; i10 < this.f9448f.size(); i10++) {
            z10 &= this.f9448f.get(i10).m12191e();
        }
        if (z10 && this.f9440E) {
            this.f9446d.m12097W0(this.f9448f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: W */
    public void m12157W() {
        this.f9446d.m12095L0();
        InterfaceC4727b.a mo12001b = this.f9450s.mo12001b();
        if (mo12001b == null) {
            this.f9454w = new RtspMediaSource.C4724c("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList = new ArrayList(this.f9447e.size());
        ArrayList arrayList2 = new ArrayList(this.f9448f.size());
        for (int i10 = 0; i10 < this.f9447e.size(); i10++) {
            e eVar = this.f9447e.get(i10);
            if (eVar.f9466d) {
                arrayList.add(eVar);
            } else {
                e eVar2 = new e(eVar.f9463a.f9459a, i10, mo12001b);
                arrayList.add(eVar2);
                eVar2.m12201j();
                if (this.f9448f.contains(eVar.f9463a)) {
                    arrayList2.add(eVar2.f9463a);
                }
            }
        }
        AbstractC5907w m15079r = AbstractC5907w.m15079r(this.f9447e);
        this.f9447e.clear();
        this.f9447e.addAll(arrayList);
        this.f9448f.clear();
        this.f9448f.addAll(arrayList2);
        for (int i11 = 0; i11 < m15079r.size(); i11++) {
            ((e) m15079r.get(i11)).m12194c();
        }
    }

    /* renamed from: X */
    private boolean m12158X(long j10) {
        for (int i10 = 0; i10 < this.f9447e.size(); i10++) {
            if (!this.f9447e.get(i10).f9465c.m37063Z(j10, false)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Z */
    private boolean m12159Z() {
        return this.f9437B;
    }

    /* renamed from: a */
    static /* synthetic */ int m12160a(C4746n c4746n) {
        int i10 = c4746n.f9441F;
        c4746n.f9441F = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public void m12161a0() {
        this.f9436A = true;
        for (int i10 = 0; i10 < this.f9447e.size(); i10++) {
            this.f9436A &= this.f9447e.get(i10).f9466d;
        }
    }

    /* renamed from: Q */
    boolean m12175Q(int i10) {
        return !m12159Z() && this.f9447e.get(i10).m12196e();
    }

    /* renamed from: U */
    int m12176U(int i10, C11113v1 c11113v1, C12082g c12082g, int i11) {
        if (m12159Z()) {
            return -3;
        }
        return this.f9447e.get(i10).m12197f(c11113v1, c12082g, i11);
    }

    /* renamed from: V */
    public void m12177V() {
        for (int i10 = 0; i10 < this.f9447e.size(); i10++) {
            this.f9447e.get(i10).m12198g();
        }
        C11172r0.m34936n(this.f9446d);
        this.f9438C = true;
    }

    /* renamed from: Y */
    int m12178Y(int i10, long j10) {
        if (m12159Z()) {
            return -3;
        }
        return this.f9447e.get(i10).m12200i(j10);
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: b */
    public long mo245b() {
        return mo249f();
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: c */
    public long mo246c(long j10, C11110u3 c11110u3) {
        return j10;
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: e */
    public boolean mo248e(long j10) {
        return isLoading();
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: f */
    public long mo249f() {
        if (this.f9436A || this.f9447e.isEmpty()) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f9455x;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        boolean z10 = true;
        long j11 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f9447e.size(); i10++) {
            e eVar = this.f9447e.get(i10);
            if (!eVar.f9466d) {
                j11 = Math.min(j11, eVar.m12195d());
                z10 = false;
            }
        }
        if (z10 || j11 == Long.MIN_VALUE) {
            return 0L;
        }
        return j11;
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: g */
    public void mo250g(long j10) {
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    public boolean isLoading() {
        return !this.f9436A;
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: j */
    public long mo251j(long j10) {
        if (mo249f() == 0 && !this.f9442G) {
            this.f9457z = j10;
            return j10;
        }
        mo256s(j10, false);
        this.f9455x = j10;
        if (m12154R()) {
            int m12093H0 = this.f9446d.m12093H0();
            if (m12093H0 == 1) {
                return j10;
            }
            if (m12093H0 != 2) {
                throw new IllegalStateException();
            }
            this.f9456y = j10;
            this.f9446d.m12096R0(j10);
            return j10;
        }
        if (m12158X(j10)) {
            return j10;
        }
        this.f9456y = j10;
        this.f9446d.m12096R0(j10);
        for (int i10 = 0; i10 < this.f9447e.size(); i10++) {
            this.f9447e.get(i10).m12199h(j10);
        }
        return j10;
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: k */
    public void mo252k(InterfaceC11739y.a aVar, long j10) {
        this.f9451t = aVar;
        try {
            this.f9446d.m12098Y0();
        } catch (IOException e10) {
            this.f9453v = e10;
            C11172r0.m34936n(this.f9446d);
        }
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: l */
    public long mo253l() {
        if (!this.f9437B) {
            return -9223372036854775807L;
        }
        this.f9437B = false;
        return 0L;
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: o */
    public void mo254o() {
        IOException iOException = this.f9453v;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: r */
    public C11700f1 mo255r() {
        C11137a.m34605g(this.f9439D);
        return new C11700f1((C11694d1[]) ((AbstractC5907w) C11137a.m34603e(this.f9452u)).toArray(new C11694d1[0]));
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: s */
    public void mo256s(long j10, boolean z10) {
        if (m12154R()) {
            return;
        }
        for (int i10 = 0; i10 < this.f9447e.size(); i10++) {
            e eVar = this.f9447e.get(i10);
            if (!eVar.f9466d) {
                eVar.f9465c.m37071q(j10, z10, true);
            }
        }
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: t */
    public long mo257t(InterfaceC10312r[] interfaceC10312rArr, boolean[] zArr, InterfaceC11734v0[] interfaceC11734v0Arr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < interfaceC10312rArr.length; i10++) {
            if (interfaceC11734v0Arr[i10] != null && (interfaceC10312rArr[i10] == null || !zArr[i10])) {
                interfaceC11734v0Arr[i10] = null;
            }
        }
        this.f9448f.clear();
        for (int i11 = 0; i11 < interfaceC10312rArr.length; i11++) {
            InterfaceC10312r interfaceC10312r = interfaceC10312rArr[i11];
            if (interfaceC10312r != null) {
                C11694d1 mo30884d = interfaceC10312r.mo30884d();
                int indexOf = ((AbstractC5907w) C11137a.m34603e(this.f9452u)).indexOf(mo30884d);
                this.f9448f.add(((e) C11137a.m34603e(this.f9447e.get(indexOf))).f9463a);
                if (this.f9452u.contains(mo30884d) && interfaceC11734v0Arr[i11] == null) {
                    interfaceC11734v0Arr[i11] = new f(indexOf);
                    zArr2[i11] = true;
                }
            }
        }
        for (int i12 = 0; i12 < this.f9447e.size(); i12++) {
            e eVar = this.f9447e.get(i12);
            if (!this.f9448f.contains(eVar.f9463a)) {
                eVar.m12194c();
            }
        }
        this.f9440E = true;
        m12156T();
        return j10;
    }
}

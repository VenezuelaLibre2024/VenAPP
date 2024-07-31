package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p216l7.C9400a;
import p216l7.C9403d;
import p250n7.C9672a;
import p250n7.C9673b;
import p351s8.InterfaceC10811b;
import p351s8.InterfaceC10823h;
import p361t6.C11005b3;
import p361t6.C11108u1;
import p361t6.C11113v1;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p397v7.C11732u0;
import p437x7.AbstractC12340f;
import p459y6.InterfaceC12609b0;
import p482z7.C12811c;

/* renamed from: com.google.android.exoplayer2.source.dash.e */
/* loaded from: classes.dex */
public final class C4719e implements Handler.Callback {

    /* renamed from: a */
    private final InterfaceC10811b f9236a;

    /* renamed from: b */
    private final b f9237b;

    /* renamed from: f */
    private C12811c f9241f;

    /* renamed from: r */
    private long f9242r;

    /* renamed from: s */
    private boolean f9243s;

    /* renamed from: t */
    private boolean f9244t;

    /* renamed from: u */
    private boolean f9245u;

    /* renamed from: e */
    private final TreeMap<Long, Long> f9240e = new TreeMap<>();

    /* renamed from: d */
    private final Handler f9239d = C11172r0.m34956x(this);

    /* renamed from: c */
    private final C9673b f9238c = new C9673b();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.source.dash.e$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final long f9246a;

        /* renamed from: b */
        public final long f9247b;

        public a(long j10, long j11) {
            this.f9246a = j10;
            this.f9247b = j11;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.e$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo11862a(long j10);

        /* renamed from: b */
        void mo11863b();
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.e$c */
    /* loaded from: classes.dex */
    public final class c implements InterfaceC12609b0 {

        /* renamed from: a */
        private final C11732u0 f9248a;

        /* renamed from: b */
        private final C11113v1 f9249b = new C11113v1();

        /* renamed from: c */
        private final C9403d f9250c = new C9403d();

        /* renamed from: d */
        private long f9251d = -9223372036854775807L;

        c(InterfaceC10811b interfaceC10811b) {
            this.f9248a = C11732u0.m37041l(interfaceC10811b);
        }

        /* renamed from: g */
        private C9403d m11951g() {
            this.f9250c.mo22818n();
            if (this.f9248a.m37058S(this.f9249b, this.f9250c, 0, false) != -4) {
                return null;
            }
            this.f9250c.m38812z();
            return this.f9250c;
        }

        /* renamed from: k */
        private void m11952k(long j10, long j11) {
            C4719e.this.f9239d.sendMessage(C4719e.this.f9239d.obtainMessage(1, new a(j10, j11)));
        }

        /* renamed from: l */
        private void m11953l() {
            while (this.f9248a.m37054K(false)) {
                C9403d m11951g = m11951g();
                if (m11951g != null) {
                    long j10 = m11951g.f32144e;
                    C9400a mo28005a = C4719e.this.f9238c.mo28005a(m11951g);
                    if (mo28005a != null) {
                        C9672a c9672a = (C9672a) mo28005a.m27998d(0);
                        if (C4719e.m11941h(c9672a.f23761a, c9672a.f23762b)) {
                            m11954m(j10, c9672a);
                        }
                    }
                }
            }
            this.f9248a.m37073s();
        }

        /* renamed from: m */
        private void m11954m(long j10, C9672a c9672a) {
            long m11939f = C4719e.m11939f(c9672a);
            if (m11939f == -9223372036854775807L) {
                return;
            }
            m11952k(j10, m11939f);
        }

        @Override // p459y6.InterfaceC12609b0
        /* renamed from: b */
        public void mo331b(long j10, int i10, int i11, int i12, InterfaceC12609b0.a aVar) {
            this.f9248a.mo331b(j10, i10, i11, i12, aVar);
            m11953l();
        }

        @Override // p459y6.InterfaceC12609b0
        /* renamed from: c */
        public void mo332c(C11108u1 c11108u1) {
            this.f9248a.mo332c(c11108u1);
        }

        @Override // p459y6.InterfaceC12609b0
        /* renamed from: d */
        public void mo333d(C11146e0 c11146e0, int i10, int i11) {
            this.f9248a.m41511a(c11146e0, i10);
        }

        @Override // p459y6.InterfaceC12609b0
        /* renamed from: e */
        public int mo334e(InterfaceC10823h interfaceC10823h, int i10, boolean z10, int i11) {
            return this.f9248a.m41512f(interfaceC10823h, i10, z10);
        }

        /* renamed from: h */
        public boolean m11955h(long j10) {
            return C4719e.this.m11945j(j10);
        }

        /* renamed from: i */
        public void m11956i(AbstractC12340f abstractC12340f) {
            long j10 = this.f9251d;
            if (j10 == -9223372036854775807L || abstractC12340f.f33120h > j10) {
                this.f9251d = abstractC12340f.f33120h;
            }
            C4719e.this.m11947m(abstractC12340f);
        }

        /* renamed from: j */
        public boolean m11957j(AbstractC12340f abstractC12340f) {
            long j10 = this.f9251d;
            return C4719e.this.m11948n(j10 != -9223372036854775807L && j10 < abstractC12340f.f33119g);
        }

        /* renamed from: n */
        public void m11958n() {
            this.f9248a.m37059T();
        }
    }

    public C4719e(C12811c c12811c, b bVar, InterfaceC10811b interfaceC10811b) {
        this.f9241f = c12811c;
        this.f9237b = bVar;
        this.f9236a = interfaceC10811b;
    }

    /* renamed from: e */
    private Map.Entry<Long, Long> m11938e(long j10) {
        return this.f9240e.ceilingEntry(Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static long m11939f(C9672a c9672a) {
        try {
            return C11172r0.m34875J0(C11172r0.m34862D(c9672a.f23765e));
        } catch (C11005b3 unused) {
            return -9223372036854775807L;
        }
    }

    /* renamed from: g */
    private void m11940g(long j10, long j11) {
        Long l10 = this.f9240e.get(Long.valueOf(j11));
        if (l10 != null && l10.longValue() <= j10) {
            return;
        }
        this.f9240e.put(Long.valueOf(j11), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static boolean m11941h(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    /* renamed from: i */
    private void m11942i() {
        if (this.f9243s) {
            this.f9244t = true;
            this.f9243s = false;
            this.f9237b.mo11863b();
        }
    }

    /* renamed from: l */
    private void m11943l() {
        this.f9237b.mo11862a(this.f9242r);
    }

    /* renamed from: p */
    private void m11944p() {
        Iterator<Map.Entry<Long, Long>> it = this.f9240e.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.f9241f.f34917h) {
                it.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f9245u) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        m11940g(aVar.f9246a, aVar.f9247b);
        return true;
    }

    /* renamed from: j */
    boolean m11945j(long j10) {
        C12811c c12811c = this.f9241f;
        boolean z10 = false;
        if (!c12811c.f34913d) {
            return false;
        }
        if (this.f9244t) {
            return true;
        }
        Map.Entry<Long, Long> m11938e = m11938e(c12811c.f34917h);
        if (m11938e != null && m11938e.getValue().longValue() < j10) {
            this.f9242r = m11938e.getKey().longValue();
            m11943l();
            z10 = true;
        }
        if (z10) {
            m11942i();
        }
        return z10;
    }

    /* renamed from: k */
    public c m11946k() {
        return new c(this.f9236a);
    }

    /* renamed from: m */
    void m11947m(AbstractC12340f abstractC12340f) {
        this.f9243s = true;
    }

    /* renamed from: n */
    boolean m11948n(boolean z10) {
        if (!this.f9241f.f34913d) {
            return false;
        }
        if (this.f9244t) {
            return true;
        }
        if (!z10) {
            return false;
        }
        m11942i();
        return true;
    }

    /* renamed from: o */
    public void m11949o() {
        this.f9245u = true;
        this.f9239d.removeCallbacksAndMessages(null);
    }

    /* renamed from: q */
    public void m11950q(C12811c c12811c) {
        this.f9244t = false;
        this.f9242r = -9223372036854775807L;
        this.f9241f = c12811c;
        m11944p();
    }
}

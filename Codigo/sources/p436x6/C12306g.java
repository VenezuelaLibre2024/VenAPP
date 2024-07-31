package p436x6;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p351s8.InterfaceC10816d0;
import p361t6.C11081p;
import p363t8.C11137a;
import p363t8.C11153i;
import p363t8.C11172r0;
import p363t8.C11173s;
import p363t8.InterfaceC11151h;
import p376u6.C11391m3;
import p397v7.C11731u;
import p397v7.C11737x;
import p414w6.InterfaceC12077b;
import p436x6.C12318m;
import p436x6.InterfaceC12297b0;
import p436x6.InterfaceC12320n;
import p436x6.InterfaceC12329u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x6.g */
/* loaded from: classes.dex */
public class C12306g implements InterfaceC12320n {

    /* renamed from: a */
    public final List<C12318m.b> f32958a;

    /* renamed from: b */
    private final InterfaceC12297b0 f32959b;

    /* renamed from: c */
    private final a f32960c;

    /* renamed from: d */
    private final b f32961d;

    /* renamed from: e */
    private final int f32962e;

    /* renamed from: f */
    private final boolean f32963f;

    /* renamed from: g */
    private final boolean f32964g;

    /* renamed from: h */
    private final HashMap<String, String> f32965h;

    /* renamed from: i */
    private final C11153i<InterfaceC12329u.a> f32966i;

    /* renamed from: j */
    private final InterfaceC10816d0 f32967j;

    /* renamed from: k */
    private final C11391m3 f32968k;

    /* renamed from: l */
    private final InterfaceC12317l0 f32969l;

    /* renamed from: m */
    private final UUID f32970m;

    /* renamed from: n */
    private final Looper f32971n;

    /* renamed from: o */
    private final e f32972o;

    /* renamed from: p */
    private int f32973p;

    /* renamed from: q */
    private int f32974q;

    /* renamed from: r */
    private HandlerThread f32975r;

    /* renamed from: s */
    private c f32976s;

    /* renamed from: t */
    private InterfaceC12077b f32977t;

    /* renamed from: u */
    private InterfaceC12320n.a f32978u;

    /* renamed from: v */
    private byte[] f32979v;

    /* renamed from: w */
    private byte[] f32980w;

    /* renamed from: x */
    private InterfaceC12297b0.a f32981x;

    /* renamed from: y */
    private InterfaceC12297b0.d f32982y;

    /* renamed from: x6.g$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo39754a(Exception exc, boolean z10);

        /* renamed from: b */
        void mo39755b(C12306g c12306g);

        /* renamed from: c */
        void mo39756c();
    }

    /* renamed from: x6.g$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo39757a(C12306g c12306g, int i10);

        /* renamed from: b */
        void mo39758b(C12306g c12306g, int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x6.g$c */
    /* loaded from: classes.dex */
    public class c extends Handler {

        /* renamed from: a */
        private boolean f32983a;

        public c(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        private boolean m39759a(Message message, C12319m0 c12319m0) {
            d dVar = (d) message.obj;
            if (!dVar.f32986b) {
                return false;
            }
            int i10 = dVar.f32989e + 1;
            dVar.f32989e = i10;
            if (i10 > C12306g.this.f32967j.mo32952a(3)) {
                return false;
            }
            long mo32955d = C12306g.this.f32967j.mo32955d(new InterfaceC10816d0.c(new C11731u(dVar.f32985a, c12319m0.f33058a, c12319m0.f33059b, c12319m0.f33060c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f32987c, c12319m0.f33061d), new C11737x(3), c12319m0.getCause() instanceof IOException ? (IOException) c12319m0.getCause() : new f(c12319m0.getCause()), dVar.f32989e));
            if (mo32955d == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f32983a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), mo32955d);
                return true;
            }
        }

        /* renamed from: b */
        void m39760b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(C11731u.m37025a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        /* renamed from: c */
        public synchronized void m39761c() {
            removeCallbacksAndMessages(null);
            this.f32983a = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Throwable th2;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 0) {
                    th2 = C12306g.this.f32969l.mo39831a(C12306g.this.f32970m, (InterfaceC12297b0.d) dVar.f32988d);
                } else {
                    if (i10 != 1) {
                        throw new RuntimeException();
                    }
                    th2 = C12306g.this.f32969l.mo39832b(C12306g.this.f32970m, (InterfaceC12297b0.a) dVar.f32988d);
                }
            } catch (C12319m0 e10) {
                boolean m39759a = m39759a(message, e10);
                th2 = e10;
                if (m39759a) {
                    return;
                }
            } catch (Exception e11) {
                C11173s.m34971j("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                th2 = e11;
            }
            C12306g.this.f32967j.m32954c(dVar.f32985a);
            synchronized (this) {
                if (!this.f32983a) {
                    C12306g.this.f32972o.obtainMessage(message.what, Pair.create(dVar.f32988d, th2)).sendToTarget();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x6.g$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final long f32985a;

        /* renamed from: b */
        public final boolean f32986b;

        /* renamed from: c */
        public final long f32987c;

        /* renamed from: d */
        public final Object f32988d;

        /* renamed from: e */
        public int f32989e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f32985a = j10;
            this.f32986b = z10;
            this.f32987c = j11;
            this.f32988d = obj;
        }
    }

    /* renamed from: x6.g$e */
    /* loaded from: classes.dex */
    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                C12306g.this.m39728F(obj, obj2);
            } else {
                if (i10 != 1) {
                    return;
                }
                C12306g.this.m39748z(obj, obj2);
            }
        }
    }

    /* renamed from: x6.g$f */
    /* loaded from: classes.dex */
    public static final class f extends IOException {
        public f(Throwable th2) {
            super(th2);
        }
    }

    public C12306g(UUID uuid, InterfaceC12297b0 interfaceC12297b0, a aVar, b bVar, List<C12318m.b> list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap<String, String> hashMap, InterfaceC12317l0 interfaceC12317l0, Looper looper, InterfaceC10816d0 interfaceC10816d0, C11391m3 c11391m3) {
        List<C12318m.b> unmodifiableList;
        if (i10 == 1 || i10 == 3) {
            C11137a.m34603e(bArr);
        }
        this.f32970m = uuid;
        this.f32960c = aVar;
        this.f32961d = bVar;
        this.f32959b = interfaceC12297b0;
        this.f32962e = i10;
        this.f32963f = z10;
        this.f32964g = z11;
        if (bArr != null) {
            this.f32980w = bArr;
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList((List) C11137a.m34603e(list));
        }
        this.f32958a = unmodifiableList;
        this.f32965h = hashMap;
        this.f32969l = interfaceC12317l0;
        this.f32966i = new C11153i<>();
        this.f32967j = interfaceC10816d0;
        this.f32968k = c11391m3;
        this.f32973p = 2;
        this.f32971n = looper;
        this.f32972o = new e(looper);
    }

    /* renamed from: A */
    private void m39726A(Exception exc, boolean z10) {
        if (exc instanceof NotProvisionedException) {
            this.f32960c.mo39755b(this);
        } else {
            m39747y(exc, z10 ? 1 : 2);
        }
    }

    /* renamed from: B */
    private void m39727B() {
        if (this.f32962e == 0 && this.f32973p == 4) {
            C11172r0.m34928j(this.f32979v);
            m39742s(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public void m39728F(Object obj, Object obj2) {
        if (obj == this.f32982y) {
            if (this.f32973p == 2 || m39744v()) {
                this.f32982y = null;
                if (obj2 instanceof Exception) {
                    this.f32960c.mo39754a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f32959b.mo39710e((byte[]) obj2);
                    this.f32960c.mo39756c();
                } catch (Exception e10) {
                    this.f32960c.mo39754a(e10, true);
                }
            }
        }
    }

    /* renamed from: G */
    private boolean m39729G() {
        if (m39744v()) {
            return true;
        }
        try {
            byte[] mo39708c = this.f32959b.mo39708c();
            this.f32979v = mo39708c;
            this.f32959b.mo39712g(mo39708c, this.f32968k);
            this.f32977t = this.f32959b.mo39714i(this.f32979v);
            final int i10 = 3;
            this.f32973p = 3;
            m39741r(new InterfaceC11151h() { // from class: x6.d
                @Override // p363t8.InterfaceC11151h
                public final void accept(Object obj) {
                    ((InterfaceC12329u.a) obj).m39870k(i10);
                }
            });
            C11137a.m34603e(this.f32979v);
            return true;
        } catch (NotProvisionedException unused) {
            this.f32960c.mo39755b(this);
            return false;
        } catch (Exception e10) {
            m39747y(e10, 1);
            return false;
        }
    }

    /* renamed from: H */
    private void m39730H(byte[] bArr, int i10, boolean z10) {
        try {
            this.f32981x = this.f32959b.mo39718m(bArr, this.f32958a, i10, this.f32965h);
            ((c) C11172r0.m34928j(this.f32976s)).m39760b(1, C11137a.m34603e(this.f32981x), z10);
        } catch (Exception e10) {
            m39726A(e10, true);
        }
    }

    /* renamed from: J */
    private boolean m39731J() {
        try {
            this.f32959b.mo39709d(this.f32979v, this.f32980w);
            return true;
        } catch (Exception e10) {
            m39747y(e10, 1);
            return false;
        }
    }

    /* renamed from: K */
    private void m39732K() {
        if (Thread.currentThread() != this.f32971n.getThread()) {
            C11173s.m34971j("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f32971n.getThread().getName(), new IllegalStateException());
        }
    }

    /* renamed from: r */
    private void m39741r(InterfaceC11151h<InterfaceC12329u.a> interfaceC11151h) {
        Iterator<InterfaceC12329u.a> it = this.f32966i.m34729z0().iterator();
        while (it.hasNext()) {
            interfaceC11151h.accept(it.next());
        }
    }

    /* renamed from: s */
    private void m39742s(boolean z10) {
        if (this.f32964g) {
            return;
        }
        byte[] bArr = (byte[]) C11172r0.m34928j(this.f32979v);
        int i10 = this.f32962e;
        if (i10 == 0 || i10 == 1) {
            if (this.f32980w == null) {
                m39730H(bArr, 1, z10);
                return;
            }
            if (this.f32973p != 4 && !m39731J()) {
                return;
            }
            long m39743t = m39743t();
            if (this.f32962e != 0 || m39743t > 60) {
                if (m39743t <= 0) {
                    m39747y(new C12315k0(), 2);
                    return;
                } else {
                    this.f32973p = 4;
                    m39741r(new InterfaceC11151h() { // from class: x6.f
                        @Override // p363t8.InterfaceC11151h
                        public final void accept(Object obj) {
                            ((InterfaceC12329u.a) obj).m39869j();
                        }
                    });
                    return;
                }
            }
            C11173s.m34963b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + m39743t);
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                C11137a.m34603e(this.f32980w);
                C11137a.m34603e(this.f32979v);
                m39730H(this.f32980w, 3, z10);
                return;
            }
            if (this.f32980w != null && !m39731J()) {
                return;
            }
        }
        m39730H(bArr, 2, z10);
    }

    /* renamed from: t */
    private long m39743t() {
        if (!C11081p.f28574d.equals(this.f32970m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) C11137a.m34603e(C12323o0.m39852b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    /* renamed from: v */
    private boolean m39744v() {
        int i10 = this.f32973p;
        return i10 == 3 || i10 == 4;
    }

    /* renamed from: y */
    private void m39747y(final Exception exc, int i10) {
        this.f32978u = new InterfaceC12320n.a(exc, C12333y.m39877a(exc, i10));
        C11173s.m34965d("DefaultDrmSession", "DRM session error", exc);
        m39741r(new InterfaceC11151h() { // from class: x6.e
            @Override // p363t8.InterfaceC11151h
            public final void accept(Object obj) {
                ((InterfaceC12329u.a) obj).m39871l(exc);
            }
        });
        if (this.f32973p != 4) {
            this.f32973p = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public void m39748z(Object obj, Object obj2) {
        InterfaceC11151h<InterfaceC12329u.a> interfaceC11151h;
        if (obj == this.f32981x && m39744v()) {
            this.f32981x = null;
            if (obj2 instanceof Exception) {
                m39726A((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f32962e == 3) {
                    this.f32959b.mo39717l((byte[]) C11172r0.m34928j(this.f32980w), bArr);
                    interfaceC11151h = new InterfaceC11151h() { // from class: x6.b
                        @Override // p363t8.InterfaceC11151h
                        public final void accept(Object obj3) {
                            ((InterfaceC12329u.a) obj3).m39868i();
                        }
                    };
                } else {
                    byte[] mo39717l = this.f32959b.mo39717l(this.f32979v, bArr);
                    int i10 = this.f32962e;
                    if ((i10 == 2 || (i10 == 0 && this.f32980w != null)) && mo39717l != null && mo39717l.length != 0) {
                        this.f32980w = mo39717l;
                    }
                    this.f32973p = 4;
                    interfaceC11151h = new InterfaceC11151h() { // from class: x6.c
                        @Override // p363t8.InterfaceC11151h
                        public final void accept(Object obj3) {
                            ((InterfaceC12329u.a) obj3).m39867h();
                        }
                    };
                }
                m39741r(interfaceC11151h);
            } catch (Exception e10) {
                m39726A(e10, true);
            }
        }
    }

    /* renamed from: C */
    public void m39749C(int i10) {
        if (i10 != 2) {
            return;
        }
        m39727B();
    }

    /* renamed from: D */
    public void m39750D() {
        if (m39729G()) {
            m39742s(true);
        }
    }

    /* renamed from: E */
    public void m39751E(Exception exc, boolean z10) {
        m39747y(exc, z10 ? 1 : 3);
    }

    /* renamed from: I */
    public void m39752I() {
        this.f32982y = this.f32959b.mo39707b();
        ((c) C11172r0.m34928j(this.f32976s)).m39760b(0, C11137a.m34603e(this.f32982y), true);
    }

    @Override // p436x6.InterfaceC12320n
    /* renamed from: a */
    public final InterfaceC12320n.a mo39698a() {
        m39732K();
        if (this.f32973p == 1) {
            return this.f32978u;
        }
        return null;
    }

    @Override // p436x6.InterfaceC12320n
    /* renamed from: c */
    public final UUID mo39699c() {
        m39732K();
        return this.f32970m;
    }

    @Override // p436x6.InterfaceC12320n
    /* renamed from: d */
    public void mo39700d(InterfaceC12329u.a aVar) {
        m39732K();
        int i10 = this.f32974q;
        if (i10 <= 0) {
            C11173s.m34964c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f32974q = i11;
        if (i11 == 0) {
            this.f32973p = 0;
            ((e) C11172r0.m34928j(this.f32972o)).removeCallbacksAndMessages(null);
            ((c) C11172r0.m34928j(this.f32976s)).m39761c();
            this.f32976s = null;
            ((HandlerThread) C11172r0.m34928j(this.f32975r)).quit();
            this.f32975r = null;
            this.f32977t = null;
            this.f32978u = null;
            this.f32981x = null;
            this.f32982y = null;
            byte[] bArr = this.f32979v;
            if (bArr != null) {
                this.f32959b.mo39716k(bArr);
                this.f32979v = null;
            }
        }
        if (aVar != null) {
            this.f32966i.m34728f(aVar);
            if (this.f32966i.m34727d(aVar) == 0) {
                aVar.m39872m();
            }
        }
        this.f32961d.mo39757a(this, this.f32974q);
    }

    @Override // p436x6.InterfaceC12320n
    /* renamed from: e */
    public boolean mo39701e() {
        m39732K();
        return this.f32963f;
    }

    @Override // p436x6.InterfaceC12320n
    /* renamed from: f */
    public final InterfaceC12077b mo39702f() {
        m39732K();
        return this.f32977t;
    }

    @Override // p436x6.InterfaceC12320n
    /* renamed from: g */
    public void mo39703g(InterfaceC12329u.a aVar) {
        m39732K();
        if (this.f32974q < 0) {
            C11173s.m34964c("DefaultDrmSession", "Session reference count less than zero: " + this.f32974q);
            this.f32974q = 0;
        }
        if (aVar != null) {
            this.f32966i.m34726c(aVar);
        }
        int i10 = this.f32974q + 1;
        this.f32974q = i10;
        if (i10 == 1) {
            C11137a.m34605g(this.f32973p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f32975r = handlerThread;
            handlerThread.start();
            this.f32976s = new c(this.f32975r.getLooper());
            if (m39729G()) {
                m39742s(true);
            }
        } else if (aVar != null && m39744v() && this.f32966i.m34727d(aVar) == 1) {
            aVar.m39870k(this.f32973p);
        }
        this.f32961d.mo39758b(this, this.f32974q);
    }

    @Override // p436x6.InterfaceC12320n
    public final int getState() {
        m39732K();
        return this.f32973p;
    }

    @Override // p436x6.InterfaceC12320n
    /* renamed from: h */
    public Map<String, String> mo39704h() {
        m39732K();
        byte[] bArr = this.f32979v;
        if (bArr == null) {
            return null;
        }
        return this.f32959b.mo39706a(bArr);
    }

    @Override // p436x6.InterfaceC12320n
    /* renamed from: i */
    public boolean mo39705i(String str) {
        m39732K();
        return this.f32959b.mo39715j((byte[]) C11137a.m34607i(this.f32979v), str);
    }

    /* renamed from: u */
    public boolean m39753u(byte[] bArr) {
        m39732K();
        return Arrays.equals(this.f32979v, bArr);
    }
}

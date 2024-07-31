package x6;

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
import s8.d0;
import t8.r0;
import u6.m3;
import x6.b0;
import x6.m;
import x6.n;
import x6.u;

/* loaded from: classes.dex */
public class g implements n {

    /* renamed from: a */
    public final List<m.b> f30446a;

    /* renamed from: b */
    private final b0 f30447b;

    /* renamed from: c */
    private final a f30448c;

    /* renamed from: d */
    private final b f30449d;

    /* renamed from: e */
    private final int f30450e;

    /* renamed from: f */
    private final boolean f30451f;

    /* renamed from: g */
    private final boolean f30452g;

    /* renamed from: h */
    private final HashMap<String, String> f30453h;

    /* renamed from: i */
    private final t8.i<u.a> f30454i;

    /* renamed from: j */
    private final s8.d0 f30455j;

    /* renamed from: k */
    private final m3 f30456k;

    /* renamed from: l */
    private final l0 f30457l;

    /* renamed from: m */
    private final UUID f30458m;

    /* renamed from: n */
    private final Looper f30459n;

    /* renamed from: o */
    private final e f30460o;

    /* renamed from: p */
    private int f30461p;

    /* renamed from: q */
    private int f30462q;

    /* renamed from: r */
    private HandlerThread f30463r;

    /* renamed from: s */
    private c f30464s;

    /* renamed from: t */
    private w6.b f30465t;

    /* renamed from: u */
    private n.a f30466u;

    /* renamed from: v */
    private byte[] f30467v;

    /* renamed from: w */
    private byte[] f30468w;

    /* renamed from: x */
    private b0.a f30469x;

    /* renamed from: y */
    private b0.d f30470y;

    /* loaded from: classes.dex */
    public interface a {
        void a(Exception exc, boolean z10);

        void b(g gVar);

        void c();
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(g gVar, int i10);

        void b(g gVar, int i10);
    }

    /* loaded from: classes.dex */
    public class c extends Handler {

        /* renamed from: a */
        private boolean f30471a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, m0 m0Var) {
            d dVar = (d) message.obj;
            if (!dVar.f30474b) {
                return false;
            }
            int i10 = dVar.f30477e + 1;
            dVar.f30477e = i10;
            if (i10 > g.this.f30455j.a(3)) {
                return false;
            }
            long d10 = g.this.f30455j.d(new d0.c(new v7.u(dVar.f30473a, m0Var.f30546a, m0Var.f30547b, m0Var.f30548c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f30475c, m0Var.f30549d), new v7.x(3), m0Var.getCause() instanceof IOException ? (IOException) m0Var.getCause() : new f(m0Var.getCause()), dVar.f30477e));
            if (d10 == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f30471a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), d10);
                return true;
            }
        }

        void b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(v7.u.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f30471a = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Throwable th2;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 0) {
                    th2 = g.this.f30457l.a(g.this.f30458m, (b0.d) dVar.f30476d);
                } else {
                    if (i10 != 1) {
                        throw new RuntimeException();
                    }
                    th2 = g.this.f30457l.b(g.this.f30458m, (b0.a) dVar.f30476d);
                }
            } catch (m0 e10) {
                boolean a10 = a(message, e10);
                th2 = e10;
                if (a10) {
                    return;
                }
            } catch (Exception e11) {
                t8.s.j("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                th2 = e11;
            }
            g.this.f30455j.c(dVar.f30473a);
            synchronized (this) {
                if (!this.f30471a) {
                    g.this.f30460o.obtainMessage(message.what, Pair.create(dVar.f30476d, th2)).sendToTarget();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final long f30473a;

        /* renamed from: b */
        public final boolean f30474b;

        /* renamed from: c */
        public final long f30475c;

        /* renamed from: d */
        public final Object f30476d;

        /* renamed from: e */
        public int f30477e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f30473a = j10;
            this.f30474b = z10;
            this.f30475c = j11;
            this.f30476d = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e extends Handler {
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
                g.this.F(obj, obj2);
            } else {
                if (i10 != 1) {
                    return;
                }
                g.this.z(obj, obj2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends IOException {
        public f(Throwable th2) {
            super(th2);
        }
    }

    public g(UUID uuid, b0 b0Var, a aVar, b bVar, List<m.b> list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap<String, String> hashMap, l0 l0Var, Looper looper, s8.d0 d0Var, m3 m3Var) {
        List<m.b> unmodifiableList;
        if (i10 == 1 || i10 == 3) {
            t8.a.e(bArr);
        }
        this.f30458m = uuid;
        this.f30448c = aVar;
        this.f30449d = bVar;
        this.f30447b = b0Var;
        this.f30450e = i10;
        this.f30451f = z10;
        this.f30452g = z11;
        if (bArr != null) {
            this.f30468w = bArr;
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList((List) t8.a.e(list));
        }
        this.f30446a = unmodifiableList;
        this.f30453h = hashMap;
        this.f30457l = l0Var;
        this.f30454i = new t8.i<>();
        this.f30455j = d0Var;
        this.f30456k = m3Var;
        this.f30461p = 2;
        this.f30459n = looper;
        this.f30460o = new e(looper);
    }

    private void A(Exception exc, boolean z10) {
        if (exc instanceof NotProvisionedException) {
            this.f30448c.b(this);
        } else {
            y(exc, z10 ? 1 : 2);
        }
    }

    private void B() {
        if (this.f30450e == 0 && this.f30461p == 4) {
            r0.j(this.f30467v);
            s(false);
        }
    }

    public void F(Object obj, Object obj2) {
        if (obj == this.f30470y) {
            if (this.f30461p == 2 || v()) {
                this.f30470y = null;
                if (obj2 instanceof Exception) {
                    this.f30448c.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f30447b.e((byte[]) obj2);
                    this.f30448c.c();
                } catch (Exception e10) {
                    this.f30448c.a(e10, true);
                }
            }
        }
    }

    private boolean G() {
        if (v()) {
            return true;
        }
        try {
            byte[] c10 = this.f30447b.c();
            this.f30467v = c10;
            this.f30447b.g(c10, this.f30456k);
            this.f30465t = this.f30447b.i(this.f30467v);
            this.f30461p = 3;
            r(new t8.h() { // from class: x6.d

                /* renamed from: a */
                public final /* synthetic */ int f30442a;

                public /* synthetic */ d(int i10) {
                    r1 = i10;
                }

                @Override // t8.h
                public final void accept(Object obj) {
                    ((u.a) obj).k(r1);
                }
            });
            t8.a.e(this.f30467v);
            return true;
        } catch (NotProvisionedException unused) {
            this.f30448c.b(this);
            return false;
        } catch (Exception e10) {
            y(e10, 1);
            return false;
        }
    }

    private void H(byte[] bArr, int i10, boolean z10) {
        try {
            this.f30469x = this.f30447b.m(bArr, this.f30446a, i10, this.f30453h);
            ((c) r0.j(this.f30464s)).b(1, t8.a.e(this.f30469x), z10);
        } catch (Exception e10) {
            A(e10, true);
        }
    }

    private boolean J() {
        try {
            this.f30447b.d(this.f30467v, this.f30468w);
            return true;
        } catch (Exception e10) {
            y(e10, 1);
            return false;
        }
    }

    private void K() {
        if (Thread.currentThread() != this.f30459n.getThread()) {
            t8.s.j("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f30459n.getThread().getName(), new IllegalStateException());
        }
    }

    private void r(t8.h<u.a> hVar) {
        Iterator<u.a> it = this.f30454i.z0().iterator();
        while (it.hasNext()) {
            hVar.accept(it.next());
        }
    }

    private void s(boolean z10) {
        if (this.f30452g) {
            return;
        }
        byte[] bArr = (byte[]) r0.j(this.f30467v);
        int i10 = this.f30450e;
        if (i10 == 0 || i10 == 1) {
            if (this.f30468w == null) {
                H(bArr, 1, z10);
                return;
            }
            if (this.f30461p != 4 && !J()) {
                return;
            }
            long t10 = t();
            if (this.f30450e != 0 || t10 > 60) {
                if (t10 <= 0) {
                    y(new k0(), 2);
                    return;
                } else {
                    this.f30461p = 4;
                    r(new t8.h() { // from class: x6.f
                        @Override // t8.h
                        public final void accept(Object obj) {
                            ((u.a) obj).j();
                        }
                    });
                    return;
                }
            }
            t8.s.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + t10);
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                t8.a.e(this.f30468w);
                t8.a.e(this.f30467v);
                H(this.f30468w, 3, z10);
                return;
            }
            if (this.f30468w != null && !J()) {
                return;
            }
        }
        H(bArr, 2, z10);
    }

    private long t() {
        if (!t6.p.f26347d.equals(this.f30458m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) t8.a.e(o0.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private boolean v() {
        int i10 = this.f30461p;
        return i10 == 3 || i10 == 4;
    }

    private void y(Exception exc, int i10) {
        this.f30466u = new n.a(exc, y.a(exc, i10));
        t8.s.d("DefaultDrmSession", "DRM session error", exc);
        r(new t8.h() { // from class: x6.e

            /* renamed from: a */
            public final /* synthetic */ Exception f30443a;

            public /* synthetic */ e(Exception exc2) {
                r1 = exc2;
            }

            @Override // t8.h
            public final void accept(Object obj) {
                ((u.a) obj).l(r1);
            }
        });
        if (this.f30461p != 4) {
            this.f30461p = 1;
        }
    }

    public void z(Object obj, Object obj2) {
        t8.h<u.a> cVar;
        if (obj == this.f30469x && v()) {
            this.f30469x = null;
            if (obj2 instanceof Exception) {
                A((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f30450e == 3) {
                    this.f30447b.l((byte[]) r0.j(this.f30468w), bArr);
                    cVar = new t8.h() { // from class: x6.b
                        @Override // t8.h
                        public final void accept(Object obj3) {
                            ((u.a) obj3).i();
                        }
                    };
                } else {
                    byte[] l10 = this.f30447b.l(this.f30467v, bArr);
                    int i10 = this.f30450e;
                    if ((i10 == 2 || (i10 == 0 && this.f30468w != null)) && l10 != null && l10.length != 0) {
                        this.f30468w = l10;
                    }
                    this.f30461p = 4;
                    cVar = new t8.h() { // from class: x6.c
                        @Override // t8.h
                        public final void accept(Object obj3) {
                            ((u.a) obj3).h();
                        }
                    };
                }
                r(cVar);
            } catch (Exception e10) {
                A(e10, true);
            }
        }
    }

    public void C(int i10) {
        if (i10 != 2) {
            return;
        }
        B();
    }

    public void D() {
        if (G()) {
            s(true);
        }
    }

    public void E(Exception exc, boolean z10) {
        y(exc, z10 ? 1 : 3);
    }

    public void I() {
        this.f30470y = this.f30447b.b();
        ((c) r0.j(this.f30464s)).b(0, t8.a.e(this.f30470y), true);
    }

    @Override // x6.n
    public final n.a a() {
        K();
        if (this.f30461p == 1) {
            return this.f30466u;
        }
        return null;
    }

    @Override // x6.n
    public final UUID c() {
        K();
        return this.f30458m;
    }

    @Override // x6.n
    public void d(u.a aVar) {
        K();
        int i10 = this.f30462q;
        if (i10 <= 0) {
            t8.s.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f30462q = i11;
        if (i11 == 0) {
            this.f30461p = 0;
            ((e) r0.j(this.f30460o)).removeCallbacksAndMessages(null);
            ((c) r0.j(this.f30464s)).c();
            this.f30464s = null;
            ((HandlerThread) r0.j(this.f30463r)).quit();
            this.f30463r = null;
            this.f30465t = null;
            this.f30466u = null;
            this.f30469x = null;
            this.f30470y = null;
            byte[] bArr = this.f30467v;
            if (bArr != null) {
                this.f30447b.k(bArr);
                this.f30467v = null;
            }
        }
        if (aVar != null) {
            this.f30454i.f(aVar);
            if (this.f30454i.d(aVar) == 0) {
                aVar.m();
            }
        }
        this.f30449d.a(this, this.f30462q);
    }

    @Override // x6.n
    public boolean e() {
        K();
        return this.f30451f;
    }

    @Override // x6.n
    public final w6.b f() {
        K();
        return this.f30465t;
    }

    @Override // x6.n
    public void g(u.a aVar) {
        K();
        if (this.f30462q < 0) {
            t8.s.c("DefaultDrmSession", "Session reference count less than zero: " + this.f30462q);
            this.f30462q = 0;
        }
        if (aVar != null) {
            this.f30454i.c(aVar);
        }
        int i10 = this.f30462q + 1;
        this.f30462q = i10;
        if (i10 == 1) {
            t8.a.g(this.f30461p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f30463r = handlerThread;
            handlerThread.start();
            this.f30464s = new c(this.f30463r.getLooper());
            if (G()) {
                s(true);
            }
        } else if (aVar != null && v() && this.f30454i.d(aVar) == 1) {
            aVar.k(this.f30461p);
        }
        this.f30449d.b(this, this.f30462q);
    }

    @Override // x6.n
    public final int getState() {
        K();
        return this.f30461p;
    }

    @Override // x6.n
    public Map<String, String> h() {
        K();
        byte[] bArr = this.f30467v;
        if (bArr == null) {
            return null;
        }
        return this.f30447b.a(bArr);
    }

    @Override // x6.n
    public boolean i(String str) {
        K();
        return this.f30447b.j((byte[]) t8.a.i(this.f30467v), str);
    }

    public boolean u(byte[] bArr) {
        K();
        return Arrays.equals(this.f30467v, bArr);
    }
}

package x6;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import com.google.common.collect.c1;
import com.google.common.collect.h1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import t6.u1;
import t8.r0;
import u6.m3;
import x6.b0;
import x6.g;
import x6.h;
import x6.m;
import x6.n;
import x6.u;
import x6.v;

/* loaded from: classes.dex */
public class h implements v {

    /* renamed from: c, reason: collision with root package name */
    private final UUID f30479c;

    /* renamed from: d, reason: collision with root package name */
    private final b0.c f30480d;

    /* renamed from: e, reason: collision with root package name */
    private final l0 f30481e;

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<String, String> f30482f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f30483g;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f30484h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f30485i;

    /* renamed from: j, reason: collision with root package name */
    private final g f30486j;

    /* renamed from: k, reason: collision with root package name */
    private final s8.d0 f30487k;

    /* renamed from: l, reason: collision with root package name */
    private final C0499h f30488l;

    /* renamed from: m, reason: collision with root package name */
    private final long f30489m;

    /* renamed from: n, reason: collision with root package name */
    private final List<x6.g> f30490n;

    /* renamed from: o, reason: collision with root package name */
    private final Set<f> f30491o;

    /* renamed from: p, reason: collision with root package name */
    private final Set<x6.g> f30492p;

    /* renamed from: q, reason: collision with root package name */
    private int f30493q;

    /* renamed from: r, reason: collision with root package name */
    private b0 f30494r;

    /* renamed from: s, reason: collision with root package name */
    private x6.g f30495s;

    /* renamed from: t, reason: collision with root package name */
    private x6.g f30496t;

    /* renamed from: u, reason: collision with root package name */
    private Looper f30497u;

    /* renamed from: v, reason: collision with root package name */
    private Handler f30498v;

    /* renamed from: w, reason: collision with root package name */
    private int f30499w;

    /* renamed from: x, reason: collision with root package name */
    private byte[] f30500x;

    /* renamed from: y, reason: collision with root package name */
    private m3 f30501y;

    /* renamed from: z, reason: collision with root package name */
    volatile d f30502z;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        private boolean f30506d;

        /* renamed from: f, reason: collision with root package name */
        private boolean f30508f;

        /* renamed from: a, reason: collision with root package name */
        private final HashMap<String, String> f30503a = new HashMap<>();

        /* renamed from: b, reason: collision with root package name */
        private UUID f30504b = t6.p.f26347d;

        /* renamed from: c, reason: collision with root package name */
        private b0.c f30505c = i0.f30521d;

        /* renamed from: g, reason: collision with root package name */
        private s8.d0 f30509g = new s8.v();

        /* renamed from: e, reason: collision with root package name */
        private int[] f30507e = new int[0];

        /* renamed from: h, reason: collision with root package name */
        private long f30510h = 300000;

        public h a(l0 l0Var) {
            return new h(this.f30504b, this.f30505c, l0Var, this.f30503a, this.f30506d, this.f30507e, this.f30508f, this.f30509g, this.f30510h);
        }

        public b b(boolean z10) {
            this.f30506d = z10;
            return this;
        }

        public b c(boolean z10) {
            this.f30508f = z10;
            return this;
        }

        public b d(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                t8.a.a(z10);
            }
            this.f30507e = (int[]) iArr.clone();
            return this;
        }

        public b e(UUID uuid, b0.c cVar) {
            this.f30504b = (UUID) t8.a.e(uuid);
            this.f30505c = (b0.c) t8.a.e(cVar);
            return this;
        }
    }

    /* loaded from: classes.dex */
    private class c implements b0.b {
        private c() {
        }

        @Override // x6.b0.b
        public void a(b0 b0Var, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) t8.a.e(h.this.f30502z)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (x6.g gVar : h.this.f30490n) {
                if (gVar.u(bArr)) {
                    gVar.C(message.what);
                    return;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends Exception {
        private e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f implements v.b {

        /* renamed from: b, reason: collision with root package name */
        private final u.a f30513b;

        /* renamed from: c, reason: collision with root package name */
        private n f30514c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f30515d;

        public f(u.a aVar) {
            this.f30513b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(u1 u1Var) {
            if (h.this.f30493q == 0 || this.f30515d) {
                return;
            }
            h hVar = h.this;
            this.f30514c = hVar.t((Looper) t8.a.e(hVar.f30497u), this.f30513b, u1Var, false);
            h.this.f30491o.add(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g() {
            if (this.f30515d) {
                return;
            }
            n nVar = this.f30514c;
            if (nVar != null) {
                nVar.d(this.f30513b);
            }
            h.this.f30491o.remove(this);
            this.f30515d = true;
        }

        public void e(final u1 u1Var) {
            ((Handler) t8.a.e(h.this.f30498v)).post(new Runnable() { // from class: x6.j
                @Override // java.lang.Runnable
                public final void run() {
                    h.f.this.f(u1Var);
                }
            });
        }

        @Override // x6.v.b
        public void release() {
            r0.L0((Handler) t8.a.e(h.this.f30498v), new Runnable() { // from class: x6.i
                @Override // java.lang.Runnable
                public final void run() {
                    h.f.this.g();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g implements g.a {

        /* renamed from: a, reason: collision with root package name */
        private final Set<x6.g> f30517a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        private x6.g f30518b;

        public g(h hVar) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // x6.g.a
        public void a(Exception exc, boolean z10) {
            this.f30518b = null;
            com.google.common.collect.w r10 = com.google.common.collect.w.r(this.f30517a);
            this.f30517a.clear();
            h1 it = r10.iterator();
            while (it.hasNext()) {
                ((x6.g) it.next()).E(exc, z10);
            }
        }

        @Override // x6.g.a
        public void b(x6.g gVar) {
            this.f30517a.add(gVar);
            if (this.f30518b != null) {
                return;
            }
            this.f30518b = gVar;
            gVar.I();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // x6.g.a
        public void c() {
            this.f30518b = null;
            com.google.common.collect.w r10 = com.google.common.collect.w.r(this.f30517a);
            this.f30517a.clear();
            h1 it = r10.iterator();
            while (it.hasNext()) {
                ((x6.g) it.next()).D();
            }
        }

        public void d(x6.g gVar) {
            this.f30517a.remove(gVar);
            if (this.f30518b == gVar) {
                this.f30518b = null;
                if (this.f30517a.isEmpty()) {
                    return;
                }
                x6.g next = this.f30517a.iterator().next();
                this.f30518b = next;
                next.I();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x6.h$h, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0499h implements g.b {
        private C0499h() {
        }

        @Override // x6.g.b
        public void a(final x6.g gVar, int i10) {
            if (i10 == 1 && h.this.f30493q > 0 && h.this.f30489m != -9223372036854775807L) {
                h.this.f30492p.add(gVar);
                ((Handler) t8.a.e(h.this.f30498v)).postAtTime(new Runnable() { // from class: x6.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.d(null);
                    }
                }, gVar, SystemClock.uptimeMillis() + h.this.f30489m);
            } else if (i10 == 0) {
                h.this.f30490n.remove(gVar);
                if (h.this.f30495s == gVar) {
                    h.this.f30495s = null;
                }
                if (h.this.f30496t == gVar) {
                    h.this.f30496t = null;
                }
                h.this.f30486j.d(gVar);
                if (h.this.f30489m != -9223372036854775807L) {
                    ((Handler) t8.a.e(h.this.f30498v)).removeCallbacksAndMessages(gVar);
                    h.this.f30492p.remove(gVar);
                }
            }
            h.this.C();
        }

        @Override // x6.g.b
        public void b(x6.g gVar, int i10) {
            if (h.this.f30489m != -9223372036854775807L) {
                h.this.f30492p.remove(gVar);
                ((Handler) t8.a.e(h.this.f30498v)).removeCallbacksAndMessages(gVar);
            }
        }
    }

    private h(UUID uuid, b0.c cVar, l0 l0Var, HashMap<String, String> hashMap, boolean z10, int[] iArr, boolean z11, s8.d0 d0Var, long j10) {
        t8.a.e(uuid);
        t8.a.b(!t6.p.f26345b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f30479c = uuid;
        this.f30480d = cVar;
        this.f30481e = l0Var;
        this.f30482f = hashMap;
        this.f30483g = z10;
        this.f30484h = iArr;
        this.f30485i = z11;
        this.f30487k = d0Var;
        this.f30486j = new g(this);
        this.f30488l = new C0499h();
        this.f30499w = 0;
        this.f30490n = new ArrayList();
        this.f30491o = c1.h();
        this.f30492p = c1.h();
        this.f30489m = j10;
    }

    private n A(int i10, boolean z10) {
        b0 b0Var = (b0) t8.a.e(this.f30494r);
        if ((b0Var.f() == 2 && c0.f30438d) || r0.z0(this.f30484h, i10) == -1 || b0Var.f() == 1) {
            return null;
        }
        x6.g gVar = this.f30495s;
        if (gVar == null) {
            x6.g x10 = x(com.google.common.collect.w.v(), true, null, z10);
            this.f30490n.add(x10);
            this.f30495s = x10;
        } else {
            gVar.g(null);
        }
        return this.f30495s;
    }

    private void B(Looper looper) {
        if (this.f30502z == null) {
            this.f30502z = new d(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (this.f30494r != null && this.f30493q == 0 && this.f30490n.isEmpty() && this.f30491o.isEmpty()) {
            ((b0) t8.a.e(this.f30494r)).release();
            this.f30494r = null;
        }
    }

    private void D() {
        h1 it = com.google.common.collect.a0.r(this.f30492p).iterator();
        while (it.hasNext()) {
            ((n) it.next()).d(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void E() {
        h1 it = com.google.common.collect.a0.r(this.f30491o).iterator();
        while (it.hasNext()) {
            ((f) it.next()).release();
        }
    }

    private void G(n nVar, u.a aVar) {
        nVar.d(aVar);
        if (this.f30489m != -9223372036854775807L) {
            nVar.d(null);
        }
    }

    private void H(boolean z10) {
        if (z10 && this.f30497u == null) {
            t8.s.j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) t8.a.e(this.f30497u)).getThread()) {
            t8.s.j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f30497u.getThread().getName(), new IllegalStateException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public n t(Looper looper, u.a aVar, u1 u1Var, boolean z10) {
        List<m.b> list;
        B(looper);
        m mVar = u1Var.f26520z;
        if (mVar == null) {
            return A(t8.w.k(u1Var.f26517w), z10);
        }
        x6.g gVar = null;
        byte b10 = 0;
        if (this.f30500x == null) {
            list = y((m) t8.a.e(mVar), this.f30479c, false);
            if (list.isEmpty()) {
                e eVar = new e(this.f30479c);
                t8.s.d("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.l(eVar);
                }
                return new a0(new n.a(eVar, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            list = null;
        }
        if (this.f30483g) {
            Iterator<x6.g> it = this.f30490n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                x6.g next = it.next();
                if (r0.c(next.f30446a, list)) {
                    gVar = next;
                    break;
                }
            }
        } else {
            gVar = this.f30496t;
        }
        if (gVar == null) {
            gVar = x(list, false, aVar, z10);
            if (!this.f30483g) {
                this.f30496t = gVar;
            }
            this.f30490n.add(gVar);
        } else {
            gVar.g(aVar);
        }
        return gVar;
    }

    private static boolean u(n nVar) {
        return nVar.getState() == 1 && (r0.f26744a < 19 || (((n.a) t8.a.e(nVar.a())).getCause() instanceof ResourceBusyException));
    }

    private boolean v(m mVar) {
        if (this.f30500x != null) {
            return true;
        }
        if (y(mVar, this.f30479c, true).isEmpty()) {
            if (mVar.f30540d != 1 || !mVar.e(0).d(t6.p.f26345b)) {
                return false;
            }
            t8.s.i("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f30479c);
        }
        String str = mVar.f30539c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? r0.f26744a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private x6.g w(List<m.b> list, boolean z10, u.a aVar) {
        t8.a.e(this.f30494r);
        x6.g gVar = new x6.g(this.f30479c, this.f30494r, this.f30486j, this.f30488l, list, this.f30499w, this.f30485i | z10, z10, this.f30500x, this.f30482f, this.f30481e, (Looper) t8.a.e(this.f30497u), this.f30487k, (m3) t8.a.e(this.f30501y));
        gVar.g(aVar);
        if (this.f30489m != -9223372036854775807L) {
            gVar.g(null);
        }
        return gVar;
    }

    private x6.g x(List<m.b> list, boolean z10, u.a aVar, boolean z11) {
        x6.g w10 = w(list, z10, aVar);
        if (u(w10) && !this.f30492p.isEmpty()) {
            D();
            G(w10, aVar);
            w10 = w(list, z10, aVar);
        }
        if (!u(w10) || !z11 || this.f30491o.isEmpty()) {
            return w10;
        }
        E();
        if (!this.f30492p.isEmpty()) {
            D();
        }
        G(w10, aVar);
        return w(list, z10, aVar);
    }

    private static List<m.b> y(m mVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(mVar.f30540d);
        for (int i10 = 0; i10 < mVar.f30540d; i10++) {
            m.b e10 = mVar.e(i10);
            if ((e10.d(uuid) || (t6.p.f26346c.equals(uuid) && e10.d(t6.p.f26345b))) && (e10.f30545e != null || z10)) {
                arrayList.add(e10);
            }
        }
        return arrayList;
    }

    private synchronized void z(Looper looper) {
        Looper looper2 = this.f30497u;
        if (looper2 == null) {
            this.f30497u = looper;
            this.f30498v = new Handler(looper);
        } else {
            t8.a.g(looper2 == looper);
            t8.a.e(this.f30498v);
        }
    }

    public void F(int i10, byte[] bArr) {
        t8.a.g(this.f30490n.isEmpty());
        if (i10 == 1 || i10 == 3) {
            t8.a.e(bArr);
        }
        this.f30499w = i10;
        this.f30500x = bArr;
    }

    @Override // x6.v
    public final void a() {
        H(true);
        int i10 = this.f30493q;
        this.f30493q = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f30494r == null) {
            b0 a10 = this.f30480d.a(this.f30479c);
            this.f30494r = a10;
            a10.h(new c());
        } else if (this.f30489m != -9223372036854775807L) {
            for (int i11 = 0; i11 < this.f30490n.size(); i11++) {
                this.f30490n.get(i11).g(null);
            }
        }
    }

    @Override // x6.v
    public void b(Looper looper, m3 m3Var) {
        z(looper);
        this.f30501y = m3Var;
    }

    @Override // x6.v
    public n c(u.a aVar, u1 u1Var) {
        H(false);
        t8.a.g(this.f30493q > 0);
        t8.a.i(this.f30497u);
        return t(this.f30497u, aVar, u1Var, true);
    }

    @Override // x6.v
    public int d(u1 u1Var) {
        H(false);
        int f10 = ((b0) t8.a.e(this.f30494r)).f();
        m mVar = u1Var.f26520z;
        if (mVar != null) {
            if (v(mVar)) {
                return f10;
            }
            return 1;
        }
        if (r0.z0(this.f30484h, t8.w.k(u1Var.f26517w)) != -1) {
            return f10;
        }
        return 0;
    }

    @Override // x6.v
    public v.b e(u.a aVar, u1 u1Var) {
        t8.a.g(this.f30493q > 0);
        t8.a.i(this.f30497u);
        f fVar = new f(aVar);
        fVar.e(u1Var);
        return fVar;
    }

    @Override // x6.v
    public final void release() {
        H(true);
        int i10 = this.f30493q - 1;
        this.f30493q = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f30489m != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f30490n);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((x6.g) arrayList.get(i11)).d(null);
            }
        }
        E();
        C();
    }
}

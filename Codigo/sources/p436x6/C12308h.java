package p436x6;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import com.google.common.collect.AbstractC5855a0;
import com.google.common.collect.AbstractC5877h1;
import com.google.common.collect.AbstractC5907w;
import com.google.common.collect.C5862c1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import p351s8.C10844v;
import p351s8.InterfaceC10816d0;
import p361t6.C11081p;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11172r0;
import p363t8.C11173s;
import p363t8.C11178w;
import p376u6.C11391m3;
import p436x6.C12306g;
import p436x6.C12308h;
import p436x6.C12318m;
import p436x6.InterfaceC12297b0;
import p436x6.InterfaceC12320n;
import p436x6.InterfaceC12329u;
import p436x6.InterfaceC12330v;

/* renamed from: x6.h */
/* loaded from: classes.dex */
public class C12308h implements InterfaceC12330v {

    /* renamed from: c */
    private final UUID f32991c;

    /* renamed from: d */
    private final InterfaceC12297b0.c f32992d;

    /* renamed from: e */
    private final InterfaceC12317l0 f32993e;

    /* renamed from: f */
    private final HashMap<String, String> f32994f;

    /* renamed from: g */
    private final boolean f32995g;

    /* renamed from: h */
    private final int[] f32996h;

    /* renamed from: i */
    private final boolean f32997i;

    /* renamed from: j */
    private final g f32998j;

    /* renamed from: k */
    private final InterfaceC10816d0 f32999k;

    /* renamed from: l */
    private final h f33000l;

    /* renamed from: m */
    private final long f33001m;

    /* renamed from: n */
    private final List<C12306g> f33002n;

    /* renamed from: o */
    private final Set<f> f33003o;

    /* renamed from: p */
    private final Set<C12306g> f33004p;

    /* renamed from: q */
    private int f33005q;

    /* renamed from: r */
    private InterfaceC12297b0 f33006r;

    /* renamed from: s */
    private C12306g f33007s;

    /* renamed from: t */
    private C12306g f33008t;

    /* renamed from: u */
    private Looper f33009u;

    /* renamed from: v */
    private Handler f33010v;

    /* renamed from: w */
    private int f33011w;

    /* renamed from: x */
    private byte[] f33012x;

    /* renamed from: y */
    private C11391m3 f33013y;

    /* renamed from: z */
    volatile d f33014z;

    /* renamed from: x6.h$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: d */
        private boolean f33018d;

        /* renamed from: f */
        private boolean f33020f;

        /* renamed from: a */
        private final HashMap<String, String> f33015a = new HashMap<>();

        /* renamed from: b */
        private UUID f33016b = C11081p.f28574d;

        /* renamed from: c */
        private InterfaceC12297b0.c f33017c = C12311i0.f33033d;

        /* renamed from: g */
        private InterfaceC10816d0 f33021g = new C10844v();

        /* renamed from: e */
        private int[] f33019e = new int[0];

        /* renamed from: h */
        private long f33022h = 300000;

        /* renamed from: a */
        public C12308h m39797a(InterfaceC12317l0 interfaceC12317l0) {
            return new C12308h(this.f33016b, this.f33017c, interfaceC12317l0, this.f33015a, this.f33018d, this.f33019e, this.f33020f, this.f33021g, this.f33022h);
        }

        /* renamed from: b */
        public b m39798b(boolean z10) {
            this.f33018d = z10;
            return this;
        }

        /* renamed from: c */
        public b m39799c(boolean z10) {
            this.f33020f = z10;
            return this;
        }

        /* renamed from: d */
        public b m39800d(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                C11137a.m34599a(z10);
            }
            this.f33019e = (int[]) iArr.clone();
            return this;
        }

        /* renamed from: e */
        public b m39801e(UUID uuid, InterfaceC12297b0.c cVar) {
            this.f33016b = (UUID) C11137a.m34603e(uuid);
            this.f33017c = (InterfaceC12297b0.c) C11137a.m34603e(cVar);
            return this;
        }
    }

    /* renamed from: x6.h$c */
    /* loaded from: classes.dex */
    private class c implements InterfaceC12297b0.b {
        private c() {
        }

        @Override // p436x6.InterfaceC12297b0.b
        /* renamed from: a */
        public void mo39721a(InterfaceC12297b0 interfaceC12297b0, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) C11137a.m34603e(C12308h.this.f33014z)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x6.h$d */
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
            for (C12306g c12306g : C12308h.this.f33002n) {
                if (c12306g.m39753u(bArr)) {
                    c12306g.m39749C(message.what);
                    return;
                }
            }
        }
    }

    /* renamed from: x6.h$e */
    /* loaded from: classes.dex */
    public static final class e extends Exception {
        private e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x6.h$f */
    /* loaded from: classes.dex */
    public class f implements InterfaceC12330v.b {

        /* renamed from: b */
        private final InterfaceC12329u.a f33025b;

        /* renamed from: c */
        private InterfaceC12320n f33026c;

        /* renamed from: d */
        private boolean f33027d;

        public f(InterfaceC12329u.a aVar) {
            this.f33025b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m39804f(C11108u1 c11108u1) {
            if (C12308h.this.f33005q == 0 || this.f33027d) {
                return;
            }
            C12308h c12308h = C12308h.this;
            this.f33026c = c12308h.m39784t((Looper) C11137a.m34603e(c12308h.f33009u), this.f33025b, c11108u1, false);
            C12308h.this.f33003o.add(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m39805g() {
            if (this.f33027d) {
                return;
            }
            InterfaceC12320n interfaceC12320n = this.f33026c;
            if (interfaceC12320n != null) {
                interfaceC12320n.mo39700d(this.f33025b);
            }
            C12308h.this.f33003o.remove(this);
            this.f33027d = true;
        }

        /* renamed from: e */
        public void m39806e(final C11108u1 c11108u1) {
            ((Handler) C11137a.m34603e(C12308h.this.f33010v)).post(new Runnable() { // from class: x6.j
                @Override // java.lang.Runnable
                public final void run() {
                    C12308h.f.this.m39804f(c11108u1);
                }
            });
        }

        @Override // p436x6.InterfaceC12330v.b
        public void release() {
            C11172r0.m34879L0((Handler) C11137a.m34603e(C12308h.this.f33010v), new Runnable() { // from class: x6.i
                @Override // java.lang.Runnable
                public final void run() {
                    C12308h.f.this.m39805g();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x6.h$g */
    /* loaded from: classes.dex */
    public class g implements C12306g.a {

        /* renamed from: a */
        private final Set<C12306g> f33029a = new HashSet();

        /* renamed from: b */
        private C12306g f33030b;

        public g(C12308h c12308h) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p436x6.C12306g.a
        /* renamed from: a */
        public void mo39754a(Exception exc, boolean z10) {
            this.f33030b = null;
            AbstractC5907w m15079r = AbstractC5907w.m15079r(this.f33029a);
            this.f33029a.clear();
            AbstractC5877h1 it = m15079r.iterator();
            while (it.hasNext()) {
                ((C12306g) it.next()).m39751E(exc, z10);
            }
        }

        @Override // p436x6.C12306g.a
        /* renamed from: b */
        public void mo39755b(C12306g c12306g) {
            this.f33029a.add(c12306g);
            if (this.f33030b != null) {
                return;
            }
            this.f33030b = c12306g;
            c12306g.m39752I();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p436x6.C12306g.a
        /* renamed from: c */
        public void mo39756c() {
            this.f33030b = null;
            AbstractC5907w m15079r = AbstractC5907w.m15079r(this.f33029a);
            this.f33029a.clear();
            AbstractC5877h1 it = m15079r.iterator();
            while (it.hasNext()) {
                ((C12306g) it.next()).m39750D();
            }
        }

        /* renamed from: d */
        public void m39807d(C12306g c12306g) {
            this.f33029a.remove(c12306g);
            if (this.f33030b == c12306g) {
                this.f33030b = null;
                if (this.f33029a.isEmpty()) {
                    return;
                }
                C12306g next = this.f33029a.iterator().next();
                this.f33030b = next;
                next.m39752I();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x6.h$h */
    /* loaded from: classes.dex */
    public class h implements C12306g.b {
        private h() {
        }

        @Override // p436x6.C12306g.b
        /* renamed from: a */
        public void mo39757a(final C12306g c12306g, int i10) {
            if (i10 == 1 && C12308h.this.f33005q > 0 && C12308h.this.f33001m != -9223372036854775807L) {
                C12308h.this.f33004p.add(c12306g);
                ((Handler) C11137a.m34603e(C12308h.this.f33010v)).postAtTime(new Runnable() { // from class: x6.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        C12306g.this.mo39700d(null);
                    }
                }, c12306g, SystemClock.uptimeMillis() + C12308h.this.f33001m);
            } else if (i10 == 0) {
                C12308h.this.f33002n.remove(c12306g);
                if (C12308h.this.f33007s == c12306g) {
                    C12308h.this.f33007s = null;
                }
                if (C12308h.this.f33008t == c12306g) {
                    C12308h.this.f33008t = null;
                }
                C12308h.this.f32998j.m39807d(c12306g);
                if (C12308h.this.f33001m != -9223372036854775807L) {
                    ((Handler) C11137a.m34603e(C12308h.this.f33010v)).removeCallbacksAndMessages(c12306g);
                    C12308h.this.f33004p.remove(c12306g);
                }
            }
            C12308h.this.m39765C();
        }

        @Override // p436x6.C12306g.b
        /* renamed from: b */
        public void mo39758b(C12306g c12306g, int i10) {
            if (C12308h.this.f33001m != -9223372036854775807L) {
                C12308h.this.f33004p.remove(c12306g);
                ((Handler) C11137a.m34603e(C12308h.this.f33010v)).removeCallbacksAndMessages(c12306g);
            }
        }
    }

    private C12308h(UUID uuid, InterfaceC12297b0.c cVar, InterfaceC12317l0 interfaceC12317l0, HashMap<String, String> hashMap, boolean z10, int[] iArr, boolean z11, InterfaceC10816d0 interfaceC10816d0, long j10) {
        C11137a.m34603e(uuid);
        C11137a.m34600b(!C11081p.f28572b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f32991c = uuid;
        this.f32992d = cVar;
        this.f32993e = interfaceC12317l0;
        this.f32994f = hashMap;
        this.f32995g = z10;
        this.f32996h = iArr;
        this.f32997i = z11;
        this.f32999k = interfaceC10816d0;
        this.f32998j = new g(this);
        this.f33000l = new h();
        this.f33011w = 0;
        this.f33002n = new ArrayList();
        this.f33003o = C5862c1.m14778h();
        this.f33004p = C5862c1.m14778h();
        this.f33001m = j10;
    }

    /* renamed from: A */
    private InterfaceC12320n m39763A(int i10, boolean z10) {
        InterfaceC12297b0 interfaceC12297b0 = (InterfaceC12297b0) C11137a.m34603e(this.f33006r);
        if ((interfaceC12297b0.mo39711f() == 2 && C12299c0.f32950d) || C11172r0.m34961z0(this.f32996h, i10) == -1 || interfaceC12297b0.mo39711f() == 1) {
            return null;
        }
        C12306g c12306g = this.f33007s;
        if (c12306g == null) {
            C12306g m39788x = m39788x(AbstractC5907w.m15081v(), true, null, z10);
            this.f33002n.add(m39788x);
            this.f33007s = m39788x;
        } else {
            c12306g.mo39703g(null);
        }
        return this.f33007s;
    }

    /* renamed from: B */
    private void m39764B(Looper looper) {
        if (this.f33014z == null) {
            this.f33014z = new d(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public void m39765C() {
        if (this.f33006r != null && this.f33005q == 0 && this.f33002n.isEmpty() && this.f33003o.isEmpty()) {
            ((InterfaceC12297b0) C11137a.m34603e(this.f33006r)).release();
            this.f33006r = null;
        }
    }

    /* renamed from: D */
    private void m39766D() {
        AbstractC5877h1 it = AbstractC5855a0.m14712r(this.f33004p).iterator();
        while (it.hasNext()) {
            ((InterfaceC12320n) it.next()).mo39700d(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    private void m39767E() {
        AbstractC5877h1 it = AbstractC5855a0.m14712r(this.f33003o).iterator();
        while (it.hasNext()) {
            ((f) it.next()).release();
        }
    }

    /* renamed from: G */
    private void m39768G(InterfaceC12320n interfaceC12320n, InterfaceC12329u.a aVar) {
        interfaceC12320n.mo39700d(aVar);
        if (this.f33001m != -9223372036854775807L) {
            interfaceC12320n.mo39700d(null);
        }
    }

    /* renamed from: H */
    private void m39769H(boolean z10) {
        if (z10 && this.f33009u == null) {
            C11173s.m34971j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) C11137a.m34603e(this.f33009u)).getThread()) {
            C11173s.m34971j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f33009u.getThread().getName(), new IllegalStateException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public InterfaceC12320n m39784t(Looper looper, InterfaceC12329u.a aVar, C11108u1 c11108u1, boolean z10) {
        List<C12318m.b> list;
        m39764B(looper);
        C12318m c12318m = c11108u1.f28800z;
        if (c12318m == null) {
            return m39763A(C11178w.m35003k(c11108u1.f28797w), z10);
        }
        C12306g c12306g = null;
        byte b10 = 0;
        if (this.f33012x == null) {
            list = m39789y((C12318m) C11137a.m34603e(c12318m), this.f32991c, false);
            if (list.isEmpty()) {
                e eVar = new e(this.f32991c);
                C11173s.m34965d("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.m39871l(eVar);
                }
                return new C12295a0(new InterfaceC12320n.a(eVar, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            list = null;
        }
        if (this.f32995g) {
            Iterator<C12306g> it = this.f33002n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C12306g next = it.next();
                if (C11172r0.m34914c(next.f32958a, list)) {
                    c12306g = next;
                    break;
                }
            }
        } else {
            c12306g = this.f33008t;
        }
        if (c12306g == null) {
            c12306g = m39788x(list, false, aVar, z10);
            if (!this.f32995g) {
                this.f33008t = c12306g;
            }
            this.f33002n.add(c12306g);
        } else {
            c12306g.mo39703g(aVar);
        }
        return c12306g;
    }

    /* renamed from: u */
    private static boolean m39785u(InterfaceC12320n interfaceC12320n) {
        return interfaceC12320n.getState() == 1 && (C11172r0.f29040a < 19 || (((InterfaceC12320n.a) C11137a.m34603e(interfaceC12320n.mo39698a())).getCause() instanceof ResourceBusyException));
    }

    /* renamed from: v */
    private boolean m39786v(C12318m c12318m) {
        if (this.f33012x != null) {
            return true;
        }
        if (m39789y(c12318m, this.f32991c, true).isEmpty()) {
            if (c12318m.f33052d != 1 || !c12318m.m39840e(0).m39847d(C11081p.f28572b)) {
                return false;
            }
            C11173s.m34970i("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f32991c);
        }
        String str = c12318m.f33051c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? C11172r0.f29040a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    /* renamed from: w */
    private C12306g m39787w(List<C12318m.b> list, boolean z10, InterfaceC12329u.a aVar) {
        C11137a.m34603e(this.f33006r);
        C12306g c12306g = new C12306g(this.f32991c, this.f33006r, this.f32998j, this.f33000l, list, this.f33011w, this.f32997i | z10, z10, this.f33012x, this.f32994f, this.f32993e, (Looper) C11137a.m34603e(this.f33009u), this.f32999k, (C11391m3) C11137a.m34603e(this.f33013y));
        c12306g.mo39703g(aVar);
        if (this.f33001m != -9223372036854775807L) {
            c12306g.mo39703g(null);
        }
        return c12306g;
    }

    /* renamed from: x */
    private C12306g m39788x(List<C12318m.b> list, boolean z10, InterfaceC12329u.a aVar, boolean z11) {
        C12306g m39787w = m39787w(list, z10, aVar);
        if (m39785u(m39787w) && !this.f33004p.isEmpty()) {
            m39766D();
            m39768G(m39787w, aVar);
            m39787w = m39787w(list, z10, aVar);
        }
        if (!m39785u(m39787w) || !z11 || this.f33003o.isEmpty()) {
            return m39787w;
        }
        m39767E();
        if (!this.f33004p.isEmpty()) {
            m39766D();
        }
        m39768G(m39787w, aVar);
        return m39787w(list, z10, aVar);
    }

    /* renamed from: y */
    private static List<C12318m.b> m39789y(C12318m c12318m, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(c12318m.f33052d);
        for (int i10 = 0; i10 < c12318m.f33052d; i10++) {
            C12318m.b m39840e = c12318m.m39840e(i10);
            if ((m39840e.m39847d(uuid) || (C11081p.f28573c.equals(uuid) && m39840e.m39847d(C11081p.f28572b))) && (m39840e.f33057e != null || z10)) {
                arrayList.add(m39840e);
            }
        }
        return arrayList;
    }

    /* renamed from: z */
    private synchronized void m39790z(Looper looper) {
        Looper looper2 = this.f33009u;
        if (looper2 == null) {
            this.f33009u = looper;
            this.f33010v = new Handler(looper);
        } else {
            C11137a.m34605g(looper2 == looper);
            C11137a.m34603e(this.f33010v);
        }
    }

    /* renamed from: F */
    public void m39791F(int i10, byte[] bArr) {
        C11137a.m34605g(this.f33002n.isEmpty());
        if (i10 == 1 || i10 == 3) {
            C11137a.m34603e(bArr);
        }
        this.f33011w = i10;
        this.f33012x = bArr;
    }

    @Override // p436x6.InterfaceC12330v
    /* renamed from: a */
    public final void mo39792a() {
        m39769H(true);
        int i10 = this.f33005q;
        this.f33005q = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f33006r == null) {
            InterfaceC12297b0 mo39722a = this.f32992d.mo39722a(this.f32991c);
            this.f33006r = mo39722a;
            mo39722a.mo39713h(new c());
        } else if (this.f33001m != -9223372036854775807L) {
            for (int i11 = 0; i11 < this.f33002n.size(); i11++) {
                this.f33002n.get(i11).mo39703g(null);
            }
        }
    }

    @Override // p436x6.InterfaceC12330v
    /* renamed from: b */
    public void mo39793b(Looper looper, C11391m3 c11391m3) {
        m39790z(looper);
        this.f33013y = c11391m3;
    }

    @Override // p436x6.InterfaceC12330v
    /* renamed from: c */
    public InterfaceC12320n mo39794c(InterfaceC12329u.a aVar, C11108u1 c11108u1) {
        m39769H(false);
        C11137a.m34605g(this.f33005q > 0);
        C11137a.m34607i(this.f33009u);
        return m39784t(this.f33009u, aVar, c11108u1, true);
    }

    @Override // p436x6.InterfaceC12330v
    /* renamed from: d */
    public int mo39795d(C11108u1 c11108u1) {
        m39769H(false);
        int mo39711f = ((InterfaceC12297b0) C11137a.m34603e(this.f33006r)).mo39711f();
        C12318m c12318m = c11108u1.f28800z;
        if (c12318m != null) {
            if (m39786v(c12318m)) {
                return mo39711f;
            }
            return 1;
        }
        if (C11172r0.m34961z0(this.f32996h, C11178w.m35003k(c11108u1.f28797w)) != -1) {
            return mo39711f;
        }
        return 0;
    }

    @Override // p436x6.InterfaceC12330v
    /* renamed from: e */
    public InterfaceC12330v.b mo39796e(InterfaceC12329u.a aVar, C11108u1 c11108u1) {
        C11137a.m34605g(this.f33005q > 0);
        C11137a.m34607i(this.f33009u);
        f fVar = new f(aVar);
        fVar.m39806e(c11108u1);
        return fVar;
    }

    @Override // p436x6.InterfaceC12330v
    public final void release() {
        m39769H(true);
        int i10 = this.f33005q - 1;
        this.f33005q = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f33001m != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f33002n);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((C12306g) arrayList.get(i11)).mo39700d(null);
            }
        }
        m39767E();
        m39765C();
    }
}

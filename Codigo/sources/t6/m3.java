package t6;

import android.os.Looper;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    private final b f26312a;

    /* renamed from: b, reason: collision with root package name */
    private final a f26313b;

    /* renamed from: c, reason: collision with root package name */
    private final t8.d f26314c;

    /* renamed from: d, reason: collision with root package name */
    private final d4 f26315d;

    /* renamed from: e, reason: collision with root package name */
    private int f26316e;

    /* renamed from: f, reason: collision with root package name */
    private Object f26317f;

    /* renamed from: g, reason: collision with root package name */
    private Looper f26318g;

    /* renamed from: h, reason: collision with root package name */
    private int f26319h;

    /* renamed from: i, reason: collision with root package name */
    private long f26320i = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    private boolean f26321j = true;

    /* renamed from: k, reason: collision with root package name */
    private boolean f26322k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f26323l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f26324m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f26325n;

    /* loaded from: classes.dex */
    public interface a {
        void d(m3 m3Var);
    }

    /* loaded from: classes.dex */
    public interface b {
        void p(int i10, Object obj);
    }

    public m3(a aVar, b bVar, d4 d4Var, int i10, t8.d dVar, Looper looper) {
        this.f26313b = aVar;
        this.f26312a = bVar;
        this.f26315d = d4Var;
        this.f26318g = looper;
        this.f26314c = dVar;
        this.f26319h = i10;
    }

    public synchronized boolean a(long j10) {
        boolean z10;
        t8.a.g(this.f26322k);
        t8.a.g(this.f26318g.getThread() != Thread.currentThread());
        long b10 = this.f26314c.b() + j10;
        while (true) {
            z10 = this.f26324m;
            if (z10 || j10 <= 0) {
                break;
            }
            this.f26314c.d();
            wait(j10);
            j10 = b10 - this.f26314c.b();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f26323l;
    }

    public boolean b() {
        return this.f26321j;
    }

    public Looper c() {
        return this.f26318g;
    }

    public int d() {
        return this.f26319h;
    }

    public Object e() {
        return this.f26317f;
    }

    public long f() {
        return this.f26320i;
    }

    public b g() {
        return this.f26312a;
    }

    public d4 h() {
        return this.f26315d;
    }

    public int i() {
        return this.f26316e;
    }

    public synchronized boolean j() {
        return this.f26325n;
    }

    public synchronized void k(boolean z10) {
        this.f26323l = z10 | this.f26323l;
        this.f26324m = true;
        notifyAll();
    }

    public m3 l() {
        t8.a.g(!this.f26322k);
        if (this.f26320i == -9223372036854775807L) {
            t8.a.a(this.f26321j);
        }
        this.f26322k = true;
        this.f26313b.d(this);
        return this;
    }

    public m3 m(Object obj) {
        t8.a.g(!this.f26322k);
        this.f26317f = obj;
        return this;
    }

    public m3 n(int i10) {
        t8.a.g(!this.f26322k);
        this.f26316e = i10;
        return this;
    }
}

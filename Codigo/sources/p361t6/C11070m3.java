package p361t6;

import android.os.Looper;
import java.util.concurrent.TimeoutException;
import p363t8.C11137a;
import p363t8.InterfaceC11143d;

/* renamed from: t6.m3 */
/* loaded from: classes.dex */
public final class C11070m3 {

    /* renamed from: a */
    private final b f28539a;

    /* renamed from: b */
    private final a f28540b;

    /* renamed from: c */
    private final InterfaceC11143d f28541c;

    /* renamed from: d */
    private final AbstractC11018d4 f28542d;

    /* renamed from: e */
    private int f28543e;

    /* renamed from: f */
    private Object f28544f;

    /* renamed from: g */
    private Looper f28545g;

    /* renamed from: h */
    private int f28546h;

    /* renamed from: i */
    private long f28547i = -9223372036854775807L;

    /* renamed from: j */
    private boolean f28548j = true;

    /* renamed from: k */
    private boolean f28549k;

    /* renamed from: l */
    private boolean f28550l;

    /* renamed from: m */
    private boolean f28551m;

    /* renamed from: n */
    private boolean f28552n;

    /* renamed from: t6.m3$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: d */
        void mo34302d(C11070m3 c11070m3);
    }

    /* renamed from: t6.m3$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: p */
        void mo33992p(int i10, Object obj);
    }

    public C11070m3(a aVar, b bVar, AbstractC11018d4 abstractC11018d4, int i10, InterfaceC11143d interfaceC11143d, Looper looper) {
        this.f28540b = aVar;
        this.f28539a = bVar;
        this.f28542d = abstractC11018d4;
        this.f28545g = looper;
        this.f28541c = interfaceC11143d;
        this.f28546h = i10;
    }

    /* renamed from: a */
    public synchronized boolean m34288a(long j10) {
        boolean z10;
        C11137a.m34605g(this.f28549k);
        C11137a.m34605g(this.f28545g.getThread() != Thread.currentThread());
        long mo34622b = this.f28541c.mo34622b() + j10;
        while (true) {
            z10 = this.f28551m;
            if (z10 || j10 <= 0) {
                break;
            }
            this.f28541c.mo34624d();
            wait(j10);
            j10 = mo34622b - this.f28541c.mo34622b();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f28550l;
    }

    /* renamed from: b */
    public boolean m34289b() {
        return this.f28548j;
    }

    /* renamed from: c */
    public Looper m34290c() {
        return this.f28545g;
    }

    /* renamed from: d */
    public int m34291d() {
        return this.f28546h;
    }

    /* renamed from: e */
    public Object m34292e() {
        return this.f28544f;
    }

    /* renamed from: f */
    public long m34293f() {
        return this.f28547i;
    }

    /* renamed from: g */
    public b m34294g() {
        return this.f28539a;
    }

    /* renamed from: h */
    public AbstractC11018d4 m34295h() {
        return this.f28542d;
    }

    /* renamed from: i */
    public int m34296i() {
        return this.f28543e;
    }

    /* renamed from: j */
    public synchronized boolean m34297j() {
        return this.f28552n;
    }

    /* renamed from: k */
    public synchronized void m34298k(boolean z10) {
        this.f28550l = z10 | this.f28550l;
        this.f28551m = true;
        notifyAll();
    }

    /* renamed from: l */
    public C11070m3 m34299l() {
        C11137a.m34605g(!this.f28549k);
        if (this.f28547i == -9223372036854775807L) {
            C11137a.m34599a(this.f28548j);
        }
        this.f28549k = true;
        this.f28540b.mo34302d(this);
        return this;
    }

    /* renamed from: m */
    public C11070m3 m34300m(Object obj) {
        C11137a.m34605g(!this.f28549k);
        this.f28544f = obj;
        return this;
    }

    /* renamed from: n */
    public C11070m3 m34301n(int i10) {
        C11137a.m34605g(!this.f28549k);
        this.f28543e = i10;
        return this;
    }
}

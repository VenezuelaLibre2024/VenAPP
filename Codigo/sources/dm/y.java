package dm;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class y {

    /* renamed from: d, reason: collision with root package name */
    public static final b f14338d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    public static final y f14339e = new a();

    /* renamed from: a, reason: collision with root package name */
    private boolean f14340a;

    /* renamed from: b, reason: collision with root package name */
    private long f14341b;

    /* renamed from: c, reason: collision with root package name */
    private long f14342c;

    /* loaded from: classes3.dex */
    public static final class a extends y {
        a() {
        }

        @Override // dm.y
        public y d(long j10) {
            return this;
        }

        @Override // dm.y
        public void f() {
        }

        @Override // dm.y
        public y g(long j10, TimeUnit unit) {
            kotlin.jvm.internal.n.e(unit, "unit");
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public y a() {
        this.f14340a = false;
        return this;
    }

    public y b() {
        this.f14342c = 0L;
        return this;
    }

    public long c() {
        if (this.f14340a) {
            return this.f14341b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public y d(long j10) {
        this.f14340a = true;
        this.f14341b = j10;
        return this;
    }

    public boolean e() {
        return this.f14340a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f14340a && this.f14341b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public y g(long j10, TimeUnit unit) {
        kotlin.jvm.internal.n.e(unit, "unit");
        if (j10 >= 0) {
            this.f14342c = unit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }

    public long h() {
        return this.f14342c;
    }
}

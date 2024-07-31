package dm;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: dm.y */
/* loaded from: classes3.dex */
public class C7081y {

    /* renamed from: d */
    public static final b f15696d = new b(null);

    /* renamed from: e */
    public static final C7081y f15697e = new a();

    /* renamed from: a */
    private boolean f15698a;

    /* renamed from: b */
    private long f15699b;

    /* renamed from: c */
    private long f15700c;

    /* renamed from: dm.y$a */
    /* loaded from: classes3.dex */
    public static final class a extends C7081y {
        a() {
        }

        @Override // dm.C7081y
        /* renamed from: d */
        public C7081y mo20789d(long j10) {
            return this;
        }

        @Override // dm.C7081y
        /* renamed from: f */
        public void mo20791f() {
        }

        @Override // dm.C7081y
        /* renamed from: g */
        public C7081y mo20792g(long j10, TimeUnit unit) {
            C9322n.m27781e(unit, "unit");
            return this;
        }
    }

    /* renamed from: dm.y$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: a */
    public C7081y mo20786a() {
        this.f15698a = false;
        return this;
    }

    /* renamed from: b */
    public C7081y mo20787b() {
        this.f15700c = 0L;
        return this;
    }

    /* renamed from: c */
    public long mo20788c() {
        if (this.f15698a) {
            return this.f15699b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    /* renamed from: d */
    public C7081y mo20789d(long j10) {
        this.f15698a = true;
        this.f15699b = j10;
        return this;
    }

    /* renamed from: e */
    public boolean mo20790e() {
        return this.f15698a;
    }

    /* renamed from: f */
    public void mo20791f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f15698a && this.f15699b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: g */
    public C7081y mo20792g(long j10, TimeUnit unit) {
        C9322n.m27781e(unit, "unit");
        if (j10 >= 0) {
            this.f15700c = unit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }

    /* renamed from: h */
    public long m20847h() {
        return this.f15700c;
    }
}

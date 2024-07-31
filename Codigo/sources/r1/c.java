package r1;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: m, reason: collision with root package name */
    public static final a f24506m = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public v1.j f24507a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f24508b;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f24509c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f24510d;

    /* renamed from: e, reason: collision with root package name */
    private long f24511e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f24512f;

    /* renamed from: g, reason: collision with root package name */
    private int f24513g;

    /* renamed from: h, reason: collision with root package name */
    private long f24514h;

    /* renamed from: i, reason: collision with root package name */
    private v1.i f24515i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f24516j;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f24517k;

    /* renamed from: l, reason: collision with root package name */
    private final Runnable f24518l;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public c(long j10, TimeUnit autoCloseTimeUnit, Executor autoCloseExecutor) {
        kotlin.jvm.internal.n.e(autoCloseTimeUnit, "autoCloseTimeUnit");
        kotlin.jvm.internal.n.e(autoCloseExecutor, "autoCloseExecutor");
        this.f24508b = new Handler(Looper.getMainLooper());
        this.f24510d = new Object();
        this.f24511e = autoCloseTimeUnit.toMillis(j10);
        this.f24512f = autoCloseExecutor;
        this.f24514h = SystemClock.uptimeMillis();
        this.f24517k = new Runnable() { // from class: r1.a
            @Override // java.lang.Runnable
            public final void run() {
                c.f(c.this);
            }
        };
        this.f24518l = new Runnable() { // from class: r1.b
            @Override // java.lang.Runnable
            public final void run() {
                c.c(c.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(c this$0) {
        ck.v vVar;
        kotlin.jvm.internal.n.e(this$0, "this$0");
        synchronized (this$0.f24510d) {
            if (SystemClock.uptimeMillis() - this$0.f24514h < this$0.f24511e) {
                return;
            }
            if (this$0.f24513g != 0) {
                return;
            }
            Runnable runnable = this$0.f24509c;
            if (runnable != null) {
                runnable.run();
                vVar = ck.v.f7137a;
            } else {
                vVar = null;
            }
            if (vVar == null) {
                throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568".toString());
            }
            v1.i iVar = this$0.f24515i;
            if (iVar != null && iVar.isOpen()) {
                iVar.close();
            }
            this$0.f24515i = null;
            ck.v vVar2 = ck.v.f7137a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(c this$0) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        this$0.f24512f.execute(this$0.f24518l);
    }

    public final void d() {
        synchronized (this.f24510d) {
            this.f24516j = true;
            v1.i iVar = this.f24515i;
            if (iVar != null) {
                iVar.close();
            }
            this.f24515i = null;
            ck.v vVar = ck.v.f7137a;
        }
    }

    public final void e() {
        synchronized (this.f24510d) {
            int i10 = this.f24513g;
            if (!(i10 > 0)) {
                throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement".toString());
            }
            int i11 = i10 - 1;
            this.f24513g = i11;
            if (i11 == 0) {
                if (this.f24515i == null) {
                    return;
                } else {
                    this.f24508b.postDelayed(this.f24517k, this.f24511e);
                }
            }
            ck.v vVar = ck.v.f7137a;
        }
    }

    public final <V> V g(ok.l<? super v1.i, ? extends V> block) {
        kotlin.jvm.internal.n.e(block, "block");
        try {
            return block.invoke(j());
        } finally {
            e();
        }
    }

    public final v1.i h() {
        return this.f24515i;
    }

    public final v1.j i() {
        v1.j jVar = this.f24507a;
        if (jVar != null) {
            return jVar;
        }
        kotlin.jvm.internal.n.p("delegateOpenHelper");
        return null;
    }

    public final v1.i j() {
        synchronized (this.f24510d) {
            this.f24508b.removeCallbacks(this.f24517k);
            this.f24513g++;
            if (!(!this.f24516j)) {
                throw new IllegalStateException("Attempting to open already closed database.".toString());
            }
            v1.i iVar = this.f24515i;
            if (iVar != null && iVar.isOpen()) {
                return iVar;
            }
            v1.i Q0 = i().Q0();
            this.f24515i = Q0;
            return Q0;
        }
    }

    public final void k(v1.j delegateOpenHelper) {
        kotlin.jvm.internal.n.e(delegateOpenHelper, "delegateOpenHelper");
        n(delegateOpenHelper);
    }

    public final boolean l() {
        return !this.f24516j;
    }

    public final void m(Runnable onAutoClose) {
        kotlin.jvm.internal.n.e(onAutoClose, "onAutoClose");
        this.f24509c = onAutoClose;
    }

    public final void n(v1.j jVar) {
        kotlin.jvm.internal.n.e(jVar, "<set-?>");
        this.f24507a = jVar;
    }
}

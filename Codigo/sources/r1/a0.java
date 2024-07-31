package r1;

import androidx.lifecycle.LiveData;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import r1.o;

/* loaded from: classes.dex */
public final class a0<T> extends LiveData<T> {

    /* renamed from: a, reason: collision with root package name */
    private final u f24486a;

    /* renamed from: b, reason: collision with root package name */
    private final m f24487b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f24488c;

    /* renamed from: d, reason: collision with root package name */
    private final Callable<T> f24489d;

    /* renamed from: e, reason: collision with root package name */
    private final o.c f24490e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f24491f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f24492g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f24493h;

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f24494i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f24495j;

    /* loaded from: classes.dex */
    public static final class a extends o.c {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0<T> f24496b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String[] strArr, a0<T> a0Var) {
            super(strArr);
            this.f24496b = a0Var;
        }

        @Override // r1.o.c
        public void c(Set<String> tables) {
            kotlin.jvm.internal.n.e(tables, "tables");
            k.c.h().b(this.f24496b.d());
        }
    }

    public a0(u database, m container, boolean z10, Callable<T> computeFunction, String[] tableNames) {
        kotlin.jvm.internal.n.e(database, "database");
        kotlin.jvm.internal.n.e(container, "container");
        kotlin.jvm.internal.n.e(computeFunction, "computeFunction");
        kotlin.jvm.internal.n.e(tableNames, "tableNames");
        this.f24486a = database;
        this.f24487b = container;
        this.f24488c = z10;
        this.f24489d = computeFunction;
        this.f24490e = new a(tableNames, this);
        this.f24491f = new AtomicBoolean(true);
        this.f24492g = new AtomicBoolean(false);
        this.f24493h = new AtomicBoolean(false);
        this.f24494i = new Runnable() { // from class: r1.y
            @Override // java.lang.Runnable
            public final void run() {
                a0.g(a0.this);
            }
        };
        this.f24495j = new Runnable() { // from class: r1.z
            @Override // java.lang.Runnable
            public final void run() {
                a0.f(a0.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(a0 this$0) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        boolean hasActiveObservers = this$0.hasActiveObservers();
        if (this$0.f24491f.compareAndSet(false, true) && hasActiveObservers) {
            this$0.e().execute(this$0.f24494i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(a0 this$0) {
        boolean z10;
        kotlin.jvm.internal.n.e(this$0, "this$0");
        if (this$0.f24493h.compareAndSet(false, true)) {
            this$0.f24486a.l().c(this$0.f24490e);
        }
        do {
            if (this$0.f24492g.compareAndSet(false, true)) {
                T t10 = null;
                z10 = false;
                while (this$0.f24491f.compareAndSet(true, false)) {
                    try {
                        try {
                            t10 = this$0.f24489d.call();
                            z10 = true;
                        } catch (Exception e10) {
                            throw new RuntimeException("Exception while computing database live data.", e10);
                        }
                    } finally {
                        this$0.f24492g.set(false);
                    }
                }
                if (z10) {
                    this$0.postValue(t10);
                }
            } else {
                z10 = false;
            }
            if (!z10) {
                return;
            }
        } while (this$0.f24491f.get());
    }

    public final Runnable d() {
        return this.f24495j;
    }

    public final Executor e() {
        return this.f24488c ? this.f24486a.q() : this.f24486a.n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        m mVar = this.f24487b;
        kotlin.jvm.internal.n.c(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        mVar.b(this);
        e().execute(this.f24494i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        m mVar = this.f24487b;
        kotlin.jvm.internal.n.c(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        mVar.c(this);
    }
}

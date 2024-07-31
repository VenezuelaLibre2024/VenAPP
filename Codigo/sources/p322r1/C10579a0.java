package p322r1;

import androidx.lifecycle.LiveData;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9322n;
import p189k.C9095c;
import p322r1.C10598o;

/* renamed from: r1.a0 */
/* loaded from: classes.dex */
public final class C10579a0<T> extends LiveData<T> {

    /* renamed from: a */
    private final AbstractC10604u f26600a;

    /* renamed from: b */
    private final C10596m f26601b;

    /* renamed from: c */
    private final boolean f26602c;

    /* renamed from: d */
    private final Callable<T> f26603d;

    /* renamed from: e */
    private final C10598o.c f26604e;

    /* renamed from: f */
    private final AtomicBoolean f26605f;

    /* renamed from: g */
    private final AtomicBoolean f26606g;

    /* renamed from: h */
    private final AtomicBoolean f26607h;

    /* renamed from: i */
    private final Runnable f26608i;

    /* renamed from: j */
    private final Runnable f26609j;

    /* renamed from: r1.a0$a */
    /* loaded from: classes.dex */
    public static final class a extends C10598o.c {

        /* renamed from: b */
        final /* synthetic */ C10579a0<T> f26610b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String[] strArr, C10579a0<T> c10579a0) {
            super(strArr);
            this.f26610b = c10579a0;
        }

        @Override // p322r1.C10598o.c
        /* renamed from: c */
        public void mo32108c(Set<String> tables) {
            C9322n.m27781e(tables, "tables");
            C9095c.m26717h().m26726b(this.f26610b.m32106d());
        }
    }

    public C10579a0(AbstractC10604u database, C10596m container, boolean z10, Callable<T> computeFunction, String[] tableNames) {
        C9322n.m27781e(database, "database");
        C9322n.m27781e(container, "container");
        C9322n.m27781e(computeFunction, "computeFunction");
        C9322n.m27781e(tableNames, "tableNames");
        this.f26600a = database;
        this.f26601b = container;
        this.f26602c = z10;
        this.f26603d = computeFunction;
        this.f26604e = new a(tableNames, this);
        this.f26605f = new AtomicBoolean(true);
        this.f26606g = new AtomicBoolean(false);
        this.f26607h = new AtomicBoolean(false);
        this.f26608i = new Runnable() { // from class: r1.y
            @Override // java.lang.Runnable
            public final void run() {
                C10579a0.m32105g(C10579a0.this);
            }
        };
        this.f26609j = new Runnable() { // from class: r1.z
            @Override // java.lang.Runnable
            public final void run() {
                C10579a0.m32104f(C10579a0.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m32104f(C10579a0 this$0) {
        C9322n.m27781e(this$0, "this$0");
        boolean hasActiveObservers = this$0.hasActiveObservers();
        if (this$0.f26605f.compareAndSet(false, true) && hasActiveObservers) {
            this$0.m32107e().execute(this$0.f26608i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m32105g(C10579a0 this$0) {
        boolean z10;
        C9322n.m27781e(this$0, "this$0");
        if (this$0.f26607h.compareAndSet(false, true)) {
            this$0.f26600a.m32257l().m32195c(this$0.f26604e);
        }
        do {
            if (this$0.f26606g.compareAndSet(false, true)) {
                T t10 = null;
                z10 = false;
                while (this$0.f26605f.compareAndSet(true, false)) {
                    try {
                        try {
                            t10 = this$0.f26603d.call();
                            z10 = true;
                        } catch (Exception e10) {
                            throw new RuntimeException("Exception while computing database live data.", e10);
                        }
                    } finally {
                        this$0.f26606g.set(false);
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
        } while (this$0.f26605f.get());
    }

    /* renamed from: d */
    public final Runnable m32106d() {
        return this.f26609j;
    }

    /* renamed from: e */
    public final Executor m32107e() {
        return this.f26602c ? this.f26600a.m32260q() : this.f26600a.m32259n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        C10596m c10596m = this.f26601b;
        C9322n.m27779c(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        c10596m.m32187b(this);
        m32107e().execute(this.f26608i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        C10596m c10596m = this.f26601b;
        C9322n.m27779c(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        c10596m.m32188c(this);
    }
}

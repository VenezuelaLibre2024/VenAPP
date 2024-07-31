package androidx.activity;

import ck.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f644a;

    /* renamed from: b, reason: collision with root package name */
    private final ok.a<v> f645b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f646c;

    /* renamed from: d, reason: collision with root package name */
    private int f647d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f648e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f649f;

    /* renamed from: g, reason: collision with root package name */
    private final List<ok.a<v>> f650g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f651h;

    public j(Executor executor, ok.a<v> reportFullyDrawn) {
        kotlin.jvm.internal.n.e(executor, "executor");
        kotlin.jvm.internal.n.e(reportFullyDrawn, "reportFullyDrawn");
        this.f644a = executor;
        this.f645b = reportFullyDrawn;
        this.f646c = new Object();
        this.f650g = new ArrayList();
        this.f651h = new Runnable() { // from class: androidx.activity.i
            @Override // java.lang.Runnable
            public final void run() {
                j.d(j.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(j this$0) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        synchronized (this$0.f646c) {
            this$0.f648e = false;
            if (this$0.f647d == 0 && !this$0.f649f) {
                this$0.f645b.invoke();
                this$0.b();
            }
            v vVar = v.f7137a;
        }
    }

    public final void b() {
        synchronized (this.f646c) {
            this.f649f = true;
            Iterator<T> it = this.f650g.iterator();
            while (it.hasNext()) {
                ((ok.a) it.next()).invoke();
            }
            this.f650g.clear();
            v vVar = v.f7137a;
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f646c) {
            z10 = this.f649f;
        }
        return z10;
    }
}

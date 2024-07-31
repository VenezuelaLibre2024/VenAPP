package j2;

import android.content.Context;
import ck.v;
import dk.z;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h<T> {

    /* renamed from: a, reason: collision with root package name */
    private final m2.b f19530a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f19531b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f19532c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedHashSet<h2.a<T>> f19533d;

    /* renamed from: e, reason: collision with root package name */
    private T f19534e;

    /* JADX INFO: Access modifiers changed from: protected */
    public h(Context context, m2.b taskExecutor) {
        kotlin.jvm.internal.n.e(context, "context");
        kotlin.jvm.internal.n.e(taskExecutor, "taskExecutor");
        this.f19530a = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.n.d(applicationContext, "context.applicationContext");
        this.f19531b = applicationContext;
        this.f19532c = new Object();
        this.f19533d = new LinkedHashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(List listenersList, h this$0) {
        kotlin.jvm.internal.n.e(listenersList, "$listenersList");
        kotlin.jvm.internal.n.e(this$0, "this$0");
        Iterator<T> it = listenersList.iterator();
        while (it.hasNext()) {
            ((h2.a) it.next()).a(this$0.f19534e);
        }
    }

    public final void c(h2.a<T> listener) {
        String str;
        kotlin.jvm.internal.n.e(listener, "listener");
        synchronized (this.f19532c) {
            if (this.f19533d.add(listener)) {
                if (this.f19533d.size() == 1) {
                    this.f19534e = e();
                    f2.j e10 = f2.j.e();
                    str = i.f19535a;
                    e10.a(str, getClass().getSimpleName() + ": initial state = " + this.f19534e);
                    h();
                }
                listener.a(this.f19534e);
            }
            v vVar = v.f7137a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Context d() {
        return this.f19531b;
    }

    public abstract T e();

    public final void f(h2.a<T> listener) {
        kotlin.jvm.internal.n.e(listener, "listener");
        synchronized (this.f19532c) {
            if (this.f19533d.remove(listener) && this.f19533d.isEmpty()) {
                i();
            }
            v vVar = v.f7137a;
        }
    }

    public final void g(T t10) {
        final List f02;
        synchronized (this.f19532c) {
            T t11 = this.f19534e;
            if (t11 == null || !kotlin.jvm.internal.n.a(t11, t10)) {
                this.f19534e = t10;
                f02 = z.f0(this.f19533d);
                this.f19530a.a().execute(new Runnable() { // from class: j2.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.b(f02, this);
                    }
                });
                v vVar = v.f7137a;
            }
        }
    }

    public abstract void h();

    public abstract void i();
}

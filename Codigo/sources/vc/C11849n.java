package vc;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: vc.n */
/* loaded from: classes.dex */
public class C11849n {

    /* renamed from: a */
    private final Executor f31251a;

    /* renamed from: b */
    private Task<Void> f31252b = Tasks.forResult(null);

    /* renamed from: c */
    private final Object f31253c = new Object();

    /* renamed from: d */
    private final ThreadLocal<Boolean> f31254d = new ThreadLocal<>();

    /* renamed from: vc.n$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C11849n.this.f31254d.set(Boolean.TRUE);
        }
    }

    /* renamed from: vc.n$b */
    /* loaded from: classes.dex */
    class b implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Runnable f31256a;

        b(Runnable runnable) {
            this.f31256a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.f31256a.run();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: vc.n$c */
    /* loaded from: classes.dex */
    public class c<T> implements Continuation<Void, T> {

        /* renamed from: a */
        final /* synthetic */ Callable f31258a;

        c(Callable callable) {
            this.f31258a = callable;
        }

        @Override // com.google.android.gms.tasks.Continuation
        public T then(Task<Void> task) {
            return (T) this.f31258a.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: vc.n$d */
    /* loaded from: classes.dex */
    public class d<T> implements Continuation<T, Void> {
        d() {
        }

        @Override // com.google.android.gms.tasks.Continuation
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void then(Task<T> task) {
            return null;
        }
    }

    public C11849n(Executor executor) {
        this.f31251a = executor;
        executor.execute(new a());
    }

    /* renamed from: d */
    private <T> Task<Void> m37764d(Task<T> task) {
        return task.continueWith(this.f31251a, new d());
    }

    /* renamed from: e */
    private boolean m37765e() {
        return Boolean.TRUE.equals(this.f31254d.get());
    }

    /* renamed from: f */
    private <T> Continuation<Void, T> m37766f(Callable<T> callable) {
        return new c(callable);
    }

    /* renamed from: b */
    public void m37767b() {
        if (!m37765e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    /* renamed from: c */
    public Executor m37768c() {
        return this.f31251a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Task<Void> m37769g(Runnable runnable) {
        return m37770h(new b(runnable));
    }

    /* renamed from: h */
    public <T> Task<T> m37770h(Callable<T> callable) {
        Task<T> continueWith;
        synchronized (this.f31253c) {
            continueWith = this.f31252b.continueWith(this.f31251a, m37766f(callable));
            this.f31252b = m37764d(continueWith);
        }
        return continueWith;
    }

    /* renamed from: i */
    public <T> Task<T> m37771i(Callable<Task<T>> callable) {
        Task<T> continueWithTask;
        synchronized (this.f31253c) {
            continueWithTask = this.f31252b.continueWithTask(this.f31251a, m37766f(callable));
            this.f31252b = m37764d(continueWithTask);
        }
        return continueWithTask;
    }
}

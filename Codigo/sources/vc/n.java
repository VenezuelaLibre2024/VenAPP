package vc;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f28817a;

    /* renamed from: b, reason: collision with root package name */
    private Task<Void> f28818b = Tasks.forResult(null);

    /* renamed from: c, reason: collision with root package name */
    private final Object f28819c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal<Boolean> f28820d = new ThreadLocal<>();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.f28820d.set(Boolean.TRUE);
        }
    }

    /* loaded from: classes.dex */
    class b implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f28822a;

        b(Runnable runnable) {
            this.f28822a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.f28822a.run();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public class c<T> implements Continuation<Void, T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callable f28824a;

        c(Callable callable) {
            this.f28824a = callable;
        }

        @Override // com.google.android.gms.tasks.Continuation
        public T then(Task<Void> task) {
            return (T) this.f28824a.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
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

    public n(Executor executor) {
        this.f28817a = executor;
        executor.execute(new a());
    }

    private <T> Task<Void> d(Task<T> task) {
        return task.continueWith(this.f28817a, new d());
    }

    private boolean e() {
        return Boolean.TRUE.equals(this.f28820d.get());
    }

    private <T> Continuation<Void, T> f(Callable<T> callable) {
        return new c(callable);
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor c() {
        return this.f28817a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<Void> g(Runnable runnable) {
        return h(new b(runnable));
    }

    public <T> Task<T> h(Callable<T> callable) {
        Task<T> continueWith;
        synchronized (this.f28819c) {
            continueWith = this.f28818b.continueWith(this.f28817a, f(callable));
            this.f28818b = d(continueWith);
        }
        return continueWith;
    }

    public <T> Task<T> i(Callable<Task<T>> callable) {
        Task<T> continueWithTask;
        synchronized (this.f28819c) {
            continueWithTask = this.f28818b.continueWithTask(this.f28817a, f(callable));
            this.f28818b = d(continueWithTask);
        }
        return continueWithTask;
    }
}

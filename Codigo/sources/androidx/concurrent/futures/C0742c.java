package androidx.concurrent.futures;

import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.concurrent.futures.c */
/* loaded from: classes.dex */
public final class C0742c {

    /* renamed from: androidx.concurrent.futures.c$a */
    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a */
        Object f3254a;

        /* renamed from: b */
        d<T> f3255b;

        /* renamed from: c */
        private C0743d<Void> f3256c = C0743d.m3762A();

        /* renamed from: d */
        private boolean f3257d;

        a() {
        }

        /* renamed from: e */
        private void m3753e() {
            this.f3254a = null;
            this.f3255b = null;
            this.f3256c = null;
        }

        /* renamed from: a */
        public void m3754a(Runnable runnable, Executor executor) {
            C0743d<Void> c0743d = this.f3256c;
            if (c0743d != null) {
                c0743d.addListener(runnable, executor);
            }
        }

        /* renamed from: b */
        void m3755b() {
            this.f3254a = null;
            this.f3255b = null;
            this.f3256c.mo3741w(null);
        }

        /* renamed from: c */
        public boolean m3756c(T t10) {
            this.f3257d = true;
            d<T> dVar = this.f3255b;
            boolean z10 = dVar != null && dVar.m3760b(t10);
            if (z10) {
                m3753e();
            }
            return z10;
        }

        /* renamed from: d */
        public boolean m3757d() {
            this.f3257d = true;
            d<T> dVar = this.f3255b;
            boolean z10 = dVar != null && dVar.m3759a(true);
            if (z10) {
                m3753e();
            }
            return z10;
        }

        /* renamed from: f */
        public boolean m3758f(Throwable th2) {
            this.f3257d = true;
            d<T> dVar = this.f3255b;
            boolean z10 = dVar != null && dVar.m3761c(th2);
            if (z10) {
                m3753e();
            }
            return z10;
        }

        protected void finalize() {
            C0743d<Void> c0743d;
            d<T> dVar = this.f3255b;
            if (dVar != null && !dVar.isDone()) {
                dVar.m3761c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f3254a));
            }
            if (this.f3257d || (c0743d = this.f3256c) == null) {
                return;
            }
            c0743d.mo3741w(null);
        }
    }

    /* renamed from: androidx.concurrent.futures.c$b */
    /* loaded from: classes.dex */
    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: androidx.concurrent.futures.c$c */
    /* loaded from: classes.dex */
    public interface c<T> {
        /* renamed from: a */
        Object mo14a(a<T> aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.concurrent.futures.c$d */
    /* loaded from: classes.dex */
    public static final class d<T> implements InterfaceFutureC5920f<T> {

        /* renamed from: a */
        final WeakReference<a<T>> f3258a;

        /* renamed from: b */
        private final AbstractC0740a<T> f3259b = new a();

        /* renamed from: androidx.concurrent.futures.c$d$a */
        /* loaded from: classes.dex */
        class a extends AbstractC0740a<T> {
            a() {
            }

            @Override // androidx.concurrent.futures.AbstractC0740a
            /* renamed from: t */
            protected String mo3740t() {
                a<T> aVar = d.this.f3258a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f3254a + "]";
            }
        }

        d(a<T> aVar) {
            this.f3258a = new WeakReference<>(aVar);
        }

        /* renamed from: a */
        boolean m3759a(boolean z10) {
            return this.f3259b.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.InterfaceFutureC5920f
        public void addListener(Runnable runnable, Executor executor) {
            this.f3259b.addListener(runnable, executor);
        }

        /* renamed from: b */
        boolean m3760b(T t10) {
            return this.f3259b.mo3741w(t10);
        }

        /* renamed from: c */
        boolean m3761c(Throwable th2) {
            return this.f3259b.mo3742x(th2);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a<T> aVar = this.f3258a.get();
            boolean cancel = this.f3259b.cancel(z10);
            if (cancel && aVar != null) {
                aVar.m3755b();
            }
            return cancel;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.f3259b.get();
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, TimeUnit timeUnit) {
            return this.f3259b.get(j10, timeUnit);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f3259b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f3259b.isDone();
        }

        public String toString() {
            return this.f3259b.toString();
        }
    }

    /* renamed from: a */
    public static <T> InterfaceFutureC5920f<T> m3752a(c<T> cVar) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f3255b = dVar;
        aVar.f3254a = cVar.getClass();
        try {
            Object mo14a = cVar.mo14a(aVar);
            if (mo14a != null) {
                aVar.f3254a = mo14a;
            }
        } catch (Exception e10) {
            dVar.m3761c(e10);
        }
        return dVar;
    }
}

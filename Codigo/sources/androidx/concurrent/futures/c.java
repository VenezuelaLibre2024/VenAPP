package androidx.concurrent.futures;

import com.google.common.util.concurrent.f;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a */
        Object f2909a;

        /* renamed from: b */
        d<T> f2910b;

        /* renamed from: c */
        private androidx.concurrent.futures.d<Void> f2911c = androidx.concurrent.futures.d.A();

        /* renamed from: d */
        private boolean f2912d;

        a() {
        }

        private void e() {
            this.f2909a = null;
            this.f2910b = null;
            this.f2911c = null;
        }

        public void a(Runnable runnable, Executor executor) {
            androidx.concurrent.futures.d<Void> dVar = this.f2911c;
            if (dVar != null) {
                dVar.addListener(runnable, executor);
            }
        }

        void b() {
            this.f2909a = null;
            this.f2910b = null;
            this.f2911c.w(null);
        }

        public boolean c(T t10) {
            this.f2912d = true;
            d<T> dVar = this.f2910b;
            boolean z10 = dVar != null && dVar.b(t10);
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean d() {
            this.f2912d = true;
            d<T> dVar = this.f2910b;
            boolean z10 = dVar != null && dVar.a(true);
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean f(Throwable th2) {
            this.f2912d = true;
            d<T> dVar = this.f2910b;
            boolean z10 = dVar != null && dVar.c(th2);
            if (z10) {
                e();
            }
            return z10;
        }

        protected void finalize() {
            androidx.concurrent.futures.d<Void> dVar;
            d<T> dVar2 = this.f2910b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f2909a));
            }
            if (this.f2912d || (dVar = this.f2911c) == null) {
                return;
            }
            dVar.w(null);
        }
    }

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
    public interface InterfaceC0032c<T> {
        Object a(a<T> aVar);
    }

    /* loaded from: classes.dex */
    public static final class d<T> implements f<T> {

        /* renamed from: a */
        final WeakReference<a<T>> f2913a;

        /* renamed from: b */
        private final androidx.concurrent.futures.a<T> f2914b = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends androidx.concurrent.futures.a<T> {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected String t() {
                a<T> aVar = d.this.f2913a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f2909a + "]";
            }
        }

        d(a<T> aVar) {
            this.f2913a = new WeakReference<>(aVar);
        }

        boolean a(boolean z10) {
            return this.f2914b.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.f
        public void addListener(Runnable runnable, Executor executor) {
            this.f2914b.addListener(runnable, executor);
        }

        boolean b(T t10) {
            return this.f2914b.w(t10);
        }

        boolean c(Throwable th2) {
            return this.f2914b.x(th2);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a<T> aVar = this.f2913a.get();
            boolean cancel = this.f2914b.cancel(z10);
            if (cancel && aVar != null) {
                aVar.b();
            }
            return cancel;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.f2914b.get();
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, TimeUnit timeUnit) {
            return this.f2914b.get(j10, timeUnit);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f2914b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f2914b.isDone();
        }

        public String toString() {
            return this.f2914b.toString();
        }
    }

    public static <T> f<T> a(InterfaceC0032c<T> interfaceC0032c) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f2910b = dVar;
        aVar.f2909a = interfaceC0032c.getClass();
        try {
            Object a10 = interfaceC0032c.a(aVar);
            if (a10 != null) {
                aVar.f2909a = a10;
            }
        } catch (Exception e10) {
            dVar.c(e10);
        }
        return dVar;
    }
}

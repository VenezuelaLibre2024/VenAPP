package p002a0;

import androidx.concurrent.futures.C0742c;
import androidx.core.util.C0984h;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p227m.InterfaceC9531a;

/* renamed from: a0.d */
/* loaded from: classes.dex */
public class C0007d<V> implements InterfaceFutureC5920f<V> {

    /* renamed from: a */
    private final InterfaceFutureC5920f<V> f11a;

    /* renamed from: b */
    C0742c.a<V> f12b;

    /* renamed from: a0.d$a */
    /* loaded from: classes.dex */
    class a implements C0742c.c<V> {
        a() {
        }

        @Override // androidx.concurrent.futures.C0742c.c
        /* renamed from: a */
        public Object mo14a(C0742c.a<V> aVar) {
            C0984h.m4836n(C0007d.this.f12b == null, "The result can only set once!");
            C0007d.this.f12b = aVar;
            return "FutureChain[" + C0007d.this + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0007d() {
        this.f11a = C0742c.m3752a(new a());
    }

    C0007d(InterfaceFutureC5920f<V> interfaceFutureC5920f) {
        this.f11a = (InterfaceFutureC5920f) C0984h.m4833k(interfaceFutureC5920f);
    }

    /* renamed from: a */
    public static <V> C0007d<V> m9a(InterfaceFutureC5920f<V> interfaceFutureC5920f) {
        return interfaceFutureC5920f instanceof C0007d ? (C0007d) interfaceFutureC5920f : new C0007d<>(interfaceFutureC5920f);
    }

    @Override // com.google.common.util.concurrent.InterfaceFutureC5920f
    public void addListener(Runnable runnable, Executor executor) {
        this.f11a.addListener(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m10b(V v10) {
        C0742c.a<V> aVar = this.f12b;
        if (aVar != null) {
            return aVar.m3756c(v10);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m11c(Throwable th2) {
        C0742c.a<V> aVar = this.f12b;
        if (aVar != null) {
            return aVar.m3758f(th2);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f11a.cancel(z10);
    }

    /* renamed from: d */
    public final <T> C0007d<T> m12d(InterfaceC9531a<? super V, T> interfaceC9531a, Executor executor) {
        return (C0007d) C0009f.m29o(this, interfaceC9531a, executor);
    }

    /* renamed from: e */
    public final <T> C0007d<T> m13e(InterfaceC0004a<? super V, T> interfaceC0004a, Executor executor) {
        return (C0007d) C0009f.m30p(this, interfaceC0004a, executor);
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f11a.get();
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        return this.f11a.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f11a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f11a.isDone();
    }
}

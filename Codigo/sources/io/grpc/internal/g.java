package io.grpc.internal;

import io.grpc.internal.j2;
import io.grpc.internal.k1;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class g implements k1.b {

    /* renamed from: a, reason: collision with root package name */
    private final d f18843a;

    /* renamed from: b, reason: collision with root package name */
    private final k1.b f18844b;

    /* renamed from: c, reason: collision with root package name */
    private final Queue<InputStream> f18845c = new ArrayDeque();

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f18846a;

        a(int i10) {
            this.f18846a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f18844b.c(this.f18846a);
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f18848a;

        b(boolean z10) {
            this.f18848a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f18844b.e(this.f18848a);
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f18850a;

        c(Throwable th2) {
            this.f18850a = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f18844b.d(this.f18850a);
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void f(Runnable runnable);
    }

    public g(k1.b bVar, d dVar) {
        this.f18844b = (k1.b) eb.o.p(bVar, "listener");
        this.f18843a = (d) eb.o.p(dVar, "transportExecutor");
    }

    @Override // io.grpc.internal.k1.b
    public void a(j2.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            } else {
                this.f18845c.add(next);
            }
        }
    }

    @Override // io.grpc.internal.k1.b
    public void c(int i10) {
        this.f18843a.f(new a(i10));
    }

    @Override // io.grpc.internal.k1.b
    public void d(Throwable th2) {
        this.f18843a.f(new c(th2));
    }

    @Override // io.grpc.internal.k1.b
    public void e(boolean z10) {
        this.f18843a.f(new b(z10));
    }

    public InputStream f() {
        return this.f18845c.poll();
    }
}

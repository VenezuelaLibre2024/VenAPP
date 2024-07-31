package io.grpc.internal;

import io.grpc.internal.C8867k1;
import io.grpc.internal.InterfaceC8864j2;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;
import p082eb.C7159o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.grpc.internal.g */
/* loaded from: classes3.dex */
public final class C8849g implements C8867k1.b {

    /* renamed from: a */
    private final d f20573a;

    /* renamed from: b */
    private final C8867k1.b f20574b;

    /* renamed from: c */
    private final Queue<InputStream> f20575c = new ArrayDeque();

    /* renamed from: io.grpc.internal.g$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f20576a;

        a(int i10) {
            this.f20576a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8849g.this.f20574b.mo25571c(this.f20576a);
        }
    }

    /* renamed from: io.grpc.internal.g$b */
    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f20578a;

        b(boolean z10) {
            this.f20578a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8849g.this.f20574b.mo25233e(this.f20578a);
        }
    }

    /* renamed from: io.grpc.internal.g$c */
    /* loaded from: classes3.dex */
    class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Throwable f20580a;

        c(Throwable th2) {
            this.f20580a = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8849g.this.f20574b.mo25572d(this.f20580a);
        }
    }

    /* renamed from: io.grpc.internal.g$d */
    /* loaded from: classes3.dex */
    public interface d {
        /* renamed from: f */
        void mo25574f(Runnable runnable);
    }

    public C8849g(C8867k1.b bVar, d dVar) {
        this.f20574b = (C8867k1.b) C7159o.m21313p(bVar, "listener");
        this.f20573a = (d) C7159o.m21313p(dVar, "transportExecutor");
    }

    @Override // io.grpc.internal.C8867k1.b
    /* renamed from: a */
    public void mo25374a(InterfaceC8864j2.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            } else {
                this.f20575c.add(next);
            }
        }
    }

    @Override // io.grpc.internal.C8867k1.b
    /* renamed from: c */
    public void mo25571c(int i10) {
        this.f20573a.mo25574f(new a(i10));
    }

    @Override // io.grpc.internal.C8867k1.b
    /* renamed from: d */
    public void mo25572d(Throwable th2) {
        this.f20573a.mo25574f(new c(th2));
    }

    @Override // io.grpc.internal.C8867k1.b
    /* renamed from: e */
    public void mo25233e(boolean z10) {
        this.f20573a.mo25574f(new b(z10));
    }

    /* renamed from: f */
    public InputStream m25573f() {
        return this.f20575c.poll();
    }
}

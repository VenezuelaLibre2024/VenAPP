package io.grpc.internal;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public interface t extends Closeable {

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f19140a = "unknown-authority";

        /* renamed from: b, reason: collision with root package name */
        private vi.a f19141b = vi.a.f29024c;

        /* renamed from: c, reason: collision with root package name */
        private String f19142c;

        /* renamed from: d, reason: collision with root package name */
        private vi.b0 f19143d;

        public String a() {
            return this.f19140a;
        }

        public vi.a b() {
            return this.f19141b;
        }

        public vi.b0 c() {
            return this.f19143d;
        }

        public String d() {
            return this.f19142c;
        }

        public a e(String str) {
            this.f19140a = (String) eb.o.p(str, "authority");
            return this;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f19140a.equals(aVar.f19140a) && this.f19141b.equals(aVar.f19141b) && eb.k.a(this.f19142c, aVar.f19142c) && eb.k.a(this.f19143d, aVar.f19143d);
        }

        public a f(vi.a aVar) {
            eb.o.p(aVar, "eagAttributes");
            this.f19141b = aVar;
            return this;
        }

        public a g(vi.b0 b0Var) {
            this.f19143d = b0Var;
            return this;
        }

        public a h(String str) {
            this.f19142c = str;
            return this;
        }

        public int hashCode() {
            return eb.k.b(this.f19140a, this.f19141b, this.f19142c, this.f19143d);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    v h1(SocketAddress socketAddress, a aVar, vi.f fVar);

    ScheduledExecutorService l0();
}

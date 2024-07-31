package io.grpc.internal;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;
import p082eb.C7155k;
import p082eb.C7159o;
import vi.AbstractC11910f;
import vi.C11895a;
import vi.C11899b0;

/* renamed from: io.grpc.internal.t */
/* loaded from: classes3.dex */
public interface InterfaceC8898t extends Closeable {

    /* renamed from: io.grpc.internal.t$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private String f20887a = "unknown-authority";

        /* renamed from: b */
        private C11895a f20888b = C11895a.f31458c;

        /* renamed from: c */
        private String f20889c;

        /* renamed from: d */
        private C11899b0 f20890d;

        /* renamed from: a */
        public String m25820a() {
            return this.f20887a;
        }

        /* renamed from: b */
        public C11895a m25821b() {
            return this.f20888b;
        }

        /* renamed from: c */
        public C11899b0 m25822c() {
            return this.f20890d;
        }

        /* renamed from: d */
        public String m25823d() {
            return this.f20889c;
        }

        /* renamed from: e */
        public a m25824e(String str) {
            this.f20887a = (String) C7159o.m21313p(str, "authority");
            return this;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f20887a.equals(aVar.f20887a) && this.f20888b.equals(aVar.f20888b) && C7155k.m21289a(this.f20889c, aVar.f20889c) && C7155k.m21289a(this.f20890d, aVar.f20890d);
        }

        /* renamed from: f */
        public a m25825f(C11895a c11895a) {
            C7159o.m21313p(c11895a, "eagAttributes");
            this.f20888b = c11895a;
            return this;
        }

        /* renamed from: g */
        public a m25826g(C11899b0 c11899b0) {
            this.f20890d = c11899b0;
            return this;
        }

        /* renamed from: h */
        public a m25827h(String str) {
            this.f20889c = str;
            return this;
        }

        public int hashCode() {
            return C7155k.m21290b(this.f20887a, this.f20888b, this.f20889c, this.f20890d);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    /* renamed from: h1 */
    InterfaceC8904v mo25642h1(SocketAddress socketAddress, a aVar, AbstractC11910f abstractC11910f);

    /* renamed from: l0 */
    ScheduledExecutorService mo25643l0();
}

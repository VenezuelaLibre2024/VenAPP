package p470yi;

import io.grpc.okhttp.internal.C8923e;

/* renamed from: yi.b */
/* loaded from: classes3.dex */
public final class C12726b {

    /* renamed from: a */
    private final C12725a f34524a;

    /* renamed from: b */
    private final C8923e f34525b;

    /* renamed from: yi.b$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        private C12725a f34526a;

        /* renamed from: b */
        private C8923e.b f34527b = new C8923e.b();

        /* renamed from: c */
        public C12726b m41976c() {
            if (this.f34526a != null) {
                return new C12726b(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: d */
        public b m41977d(String str, String str2) {
            this.f34527b.m26070f(str, str2);
            return this;
        }

        /* renamed from: e */
        public b m41978e(C12725a c12725a) {
            if (c12725a == null) {
                throw new IllegalArgumentException("url == null");
            }
            this.f34526a = c12725a;
            return this;
        }
    }

    private C12726b(b bVar) {
        this.f34524a = bVar.f34526a;
        this.f34525b = bVar.f34527b.m26068c();
    }

    /* renamed from: a */
    public C8923e m41972a() {
        return this.f34525b;
    }

    /* renamed from: b */
    public C12725a m41973b() {
        return this.f34524a;
    }

    public String toString() {
        return "Request{url=" + this.f34524a + '}';
    }
}

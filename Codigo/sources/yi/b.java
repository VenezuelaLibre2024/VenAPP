package yi;

import io.grpc.okhttp.internal.e;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final yi.a f31988a;

    /* renamed from: b, reason: collision with root package name */
    private final e f31989b;

    /* renamed from: yi.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0534b {

        /* renamed from: a, reason: collision with root package name */
        private yi.a f31990a;

        /* renamed from: b, reason: collision with root package name */
        private e.b f31991b = new e.b();

        public b c() {
            if (this.f31990a != null) {
                return new b(this);
            }
            throw new IllegalStateException("url == null");
        }

        public C0534b d(String str, String str2) {
            this.f31991b.f(str, str2);
            return this;
        }

        public C0534b e(yi.a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("url == null");
            }
            this.f31990a = aVar;
            return this;
        }
    }

    private b(C0534b c0534b) {
        this.f31988a = c0534b.f31990a;
        this.f31989b = c0534b.f31991b.c();
    }

    public e a() {
        return this.f31989b;
    }

    public yi.a b() {
        return this.f31988a;
    }

    public String toString() {
        return "Request{url=" + this.f31988a + '}';
    }
}

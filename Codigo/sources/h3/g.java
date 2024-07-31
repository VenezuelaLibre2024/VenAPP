package h3;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class g<T> {

    /* renamed from: e, reason: collision with root package name */
    private static final b<Object> f16370e = new a();

    /* renamed from: a, reason: collision with root package name */
    private final T f16371a;

    /* renamed from: b, reason: collision with root package name */
    private final b<T> f16372b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16373c;

    /* renamed from: d, reason: collision with root package name */
    private volatile byte[] f16374d;

    /* loaded from: classes.dex */
    class a implements b<Object> {
        a() {
        }

        @Override // h3.g.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        void a(byte[] bArr, T t10, MessageDigest messageDigest);
    }

    private g(String str, T t10, b<T> bVar) {
        this.f16373c = c4.k.b(str);
        this.f16371a = t10;
        this.f16372b = (b) c4.k.d(bVar);
    }

    public static <T> g<T> a(String str, T t10, b<T> bVar) {
        return new g<>(str, t10, bVar);
    }

    private static <T> b<T> b() {
        return (b<T>) f16370e;
    }

    private byte[] d() {
        if (this.f16374d == null) {
            this.f16374d = this.f16373c.getBytes(f.f16369a);
        }
        return this.f16374d;
    }

    public static <T> g<T> e(String str) {
        return new g<>(str, null, b());
    }

    public static <T> g<T> f(String str, T t10) {
        return new g<>(str, t10, b());
    }

    public T c() {
        return this.f16371a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f16373c.equals(((g) obj).f16373c);
        }
        return false;
    }

    public void g(T t10, MessageDigest messageDigest) {
        this.f16372b.a(d(), t10, messageDigest);
    }

    public int hashCode() {
        return this.f16373c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f16373c + "'}";
    }
}

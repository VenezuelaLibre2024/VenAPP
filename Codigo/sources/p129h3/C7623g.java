package p129h3;

import java.security.MessageDigest;
import p036c4.C1870k;

/* renamed from: h3.g */
/* loaded from: classes.dex */
public final class C7623g<T> {

    /* renamed from: e */
    private static final b<Object> f18007e = new a();

    /* renamed from: a */
    private final T f18008a;

    /* renamed from: b */
    private final b<T> f18009b;

    /* renamed from: c */
    private final String f18010c;

    /* renamed from: d */
    private volatile byte[] f18011d;

    /* renamed from: h3.g$a */
    /* loaded from: classes.dex */
    class a implements b<Object> {
        a() {
        }

        @Override // p129h3.C7623g.b
        /* renamed from: a */
        public void mo23145a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* renamed from: h3.g$b */
    /* loaded from: classes.dex */
    public interface b<T> {
        /* renamed from: a */
        void mo23145a(byte[] bArr, T t10, MessageDigest messageDigest);
    }

    private C7623g(String str, T t10, b<T> bVar) {
        this.f18010c = C1870k.m9948b(str);
        this.f18008a = t10;
        this.f18009b = (b) C1870k.m9950d(bVar);
    }

    /* renamed from: a */
    public static <T> C7623g<T> m23138a(String str, T t10, b<T> bVar) {
        return new C7623g<>(str, t10, bVar);
    }

    /* renamed from: b */
    private static <T> b<T> m23139b() {
        return (b<T>) f18007e;
    }

    /* renamed from: d */
    private byte[] m23140d() {
        if (this.f18011d == null) {
            this.f18011d = this.f18010c.getBytes(InterfaceC7622f.f18006a);
        }
        return this.f18011d;
    }

    /* renamed from: e */
    public static <T> C7623g<T> m23141e(String str) {
        return new C7623g<>(str, null, m23139b());
    }

    /* renamed from: f */
    public static <T> C7623g<T> m23142f(String str, T t10) {
        return new C7623g<>(str, t10, m23139b());
    }

    /* renamed from: c */
    public T m23143c() {
        return this.f18008a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7623g) {
            return this.f18010c.equals(((C7623g) obj).f18010c);
        }
        return false;
    }

    /* renamed from: g */
    public void m23144g(T t10, MessageDigest messageDigest) {
        this.f18009b.mo23145a(m23140d(), t10, messageDigest);
    }

    public int hashCode() {
        return this.f18010c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f18010c + "'}";
    }
}

package vi;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class i0 {

    /* renamed from: d */
    private static final AtomicLong f29127d = new AtomicLong();

    /* renamed from: a */
    private final String f29128a;

    /* renamed from: b */
    private final String f29129b;

    /* renamed from: c */
    private final long f29130c;

    i0(String str, String str2, long j10) {
        eb.o.p(str, "typeName");
        eb.o.e(!str.isEmpty(), "empty type");
        this.f29128a = str;
        this.f29129b = str2;
        this.f29130c = j10;
    }

    public static i0 a(Class<?> cls, String str) {
        return b(c(cls), str);
    }

    public static i0 b(String str, String str2) {
        return new i0(str, str2, e());
    }

    private static String c(Class<?> cls) {
        String simpleName = ((Class) eb.o.p(cls, "type")).getSimpleName();
        return !simpleName.isEmpty() ? simpleName : cls.getName().substring(cls.getPackage().getName().length() + 1);
    }

    static long e() {
        return f29127d.incrementAndGet();
    }

    public long d() {
        return this.f29130c;
    }

    public String f() {
        return this.f29128a + "<" + this.f29130c + ">";
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f());
        if (this.f29129b != null) {
            sb2.append(": (");
            sb2.append(this.f29129b);
            sb2.append(')');
        }
        return sb2.toString();
    }
}

package vi;

import java.util.concurrent.atomic.AtomicLong;
import p082eb.C7159o;

/* renamed from: vi.i0 */
/* loaded from: classes3.dex */
public final class C11920i0 {

    /* renamed from: d */
    private static final AtomicLong f31562d = new AtomicLong();

    /* renamed from: a */
    private final String f31563a;

    /* renamed from: b */
    private final String f31564b;

    /* renamed from: c */
    private final long f31565c;

    C11920i0(String str, String str2, long j10) {
        C7159o.m21313p(str, "typeName");
        C7159o.m21302e(!str.isEmpty(), "empty type");
        this.f31563a = str;
        this.f31564b = str2;
        this.f31565c = j10;
    }

    /* renamed from: a */
    public static C11920i0 m38161a(Class<?> cls, String str) {
        return m38162b(m38163c(cls), str);
    }

    /* renamed from: b */
    public static C11920i0 m38162b(String str, String str2) {
        return new C11920i0(str, str2, m38164e());
    }

    /* renamed from: c */
    private static String m38163c(Class<?> cls) {
        String simpleName = ((Class) C7159o.m21313p(cls, "type")).getSimpleName();
        return !simpleName.isEmpty() ? simpleName : cls.getName().substring(cls.getPackage().getName().length() + 1);
    }

    /* renamed from: e */
    static long m38164e() {
        return f31562d.incrementAndGet();
    }

    /* renamed from: d */
    public long m38165d() {
        return this.f31565c;
    }

    /* renamed from: f */
    public String m38166f() {
        return this.f31563a + "<" + this.f31565c + ">";
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m38166f());
        if (this.f31564b != null) {
            sb2.append(": (");
            sb2.append(this.f31564b);
            sb2.append(')');
        }
        return sb2.toString();
    }
}

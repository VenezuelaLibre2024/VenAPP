package vi;

import java.nio.charset.Charset;
import p103fb.AbstractC7323a;
import vi.C11953w0;

/* renamed from: vi.k0 */
/* loaded from: classes3.dex */
public final class C11926k0 {

    /* renamed from: a */
    public static final Charset f31578a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final AbstractC7323a f31579b = C11953w0.f31661f;

    /* renamed from: vi.k0$a */
    /* loaded from: classes3.dex */
    public interface a<T> extends C11953w0.j<T> {
    }

    /* renamed from: a */
    public static int m38188a(C11953w0 c11953w0) {
        return c11953w0.m38311h();
    }

    /* renamed from: b */
    public static <T> C11953w0.g<T> m38189b(String str, a<T> aVar) {
        boolean z10 = false;
        if (str != null && !str.isEmpty() && str.charAt(0) == ':') {
            z10 = true;
        }
        return C11953w0.g.m38324g(str, z10, aVar);
    }

    /* renamed from: c */
    public static C11953w0 m38190c(byte[]... bArr) {
        return new C11953w0(bArr);
    }

    /* renamed from: d */
    public static byte[][] m38191d(C11953w0 c11953w0) {
        return c11953w0.m38314p();
    }
}

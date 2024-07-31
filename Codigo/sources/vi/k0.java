package vi;

import java.nio.charset.Charset;
import vi.w0;

/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f29143a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    public static final fb.a f29144b = w0.f29226f;

    /* loaded from: classes3.dex */
    public interface a<T> extends w0.j<T> {
    }

    public static int a(w0 w0Var) {
        return w0Var.h();
    }

    public static <T> w0.g<T> b(String str, a<T> aVar) {
        boolean z10 = false;
        if (str != null && !str.isEmpty() && str.charAt(0) == ':') {
            z10 = true;
        }
        return w0.g.g(str, z10, aVar);
    }

    public static w0 c(byte[]... bArr) {
        return new w0(bArr);
    }

    public static byte[][] d(w0 w0Var) {
        return w0Var.p();
    }
}

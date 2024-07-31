package dm;

/* loaded from: classes3.dex */
public final class b0 {
    public static final byte[] a(String str) {
        kotlin.jvm.internal.n.e(str, "<this>");
        byte[] bytes = str.getBytes(xk.d.f31393b);
        kotlin.jvm.internal.n.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final String b(byte[] bArr) {
        kotlin.jvm.internal.n.e(bArr, "<this>");
        return new String(bArr, xk.d.f31393b);
    }
}

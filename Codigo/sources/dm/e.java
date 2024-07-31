package dm;

import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class e implements Serializable, Comparable<e> {

    /* renamed from: d */
    public static final a f14291d = new a(null);

    /* renamed from: e */
    public static final e f14292e = new e(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private final byte[] f14293a;

    /* renamed from: b */
    private transient int f14294b;

    /* renamed from: c */
    private transient String f14295c;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public static /* synthetic */ e f(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = c0.c();
            }
            return aVar.e(bArr, i10, i11);
        }

        public final e a(String str) {
            int e10;
            int e11;
            kotlin.jvm.internal.n.e(str, "<this>");
            if (!(str.length() % 2 == 0)) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                e10 = em.b.e(str.charAt(i11));
                e11 = em.b.e(str.charAt(i11 + 1));
                bArr[i10] = (byte) ((e10 << 4) + e11);
            }
            return new e(bArr);
        }

        public final e b(String str, Charset charset) {
            kotlin.jvm.internal.n.e(str, "<this>");
            kotlin.jvm.internal.n.e(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.n.d(bytes, "this as java.lang.String).getBytes(charset)");
            return new e(bytes);
        }

        public final e c(String str) {
            kotlin.jvm.internal.n.e(str, "<this>");
            e eVar = new e(b0.a(str));
            eVar.y(str);
            return eVar;
        }

        public final e d(byte... data) {
            kotlin.jvm.internal.n.e(data, "data");
            byte[] copyOf = Arrays.copyOf(data, data.length);
            kotlin.jvm.internal.n.d(copyOf, "copyOf(this, size)");
            return new e(copyOf);
        }

        public final e e(byte[] bArr, int i10, int i11) {
            byte[] h10;
            kotlin.jvm.internal.n.e(bArr, "<this>");
            int e10 = c0.e(bArr, i11);
            c0.b(bArr.length, i10, e10);
            h10 = dk.l.h(bArr, i10, e10 + i10);
            return new e(h10);
        }

        public final e g(InputStream inputStream, int i10) {
            kotlin.jvm.internal.n.e(inputStream, "<this>");
            int i11 = 0;
            if (!(i10 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + i10).toString());
            }
            byte[] bArr = new byte[i10];
            while (i11 < i10) {
                int read = inputStream.read(bArr, i11, i10 - i11);
                if (read == -1) {
                    throw new EOFException();
                }
                i11 += read;
            }
            return new e(bArr);
        }
    }

    public e(byte[] data) {
        kotlin.jvm.internal.n.e(data, "data");
        this.f14293a = data;
    }

    public static final e l(String str) {
        return f14291d.c(str);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        e g10 = f14291d.g(objectInputStream, objectInputStream.readInt());
        Field declaredField = e.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        declaredField.set(this, g10.f14293a);
    }

    public static final e u(byte... bArr) {
        return f14291d.d(bArr);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.f14293a.length);
        objectOutputStream.write(this.f14293a);
    }

    public final e A() {
        return i("SHA-256");
    }

    public final int B() {
        return p();
    }

    public final boolean C(e prefix) {
        kotlin.jvm.internal.n.e(prefix, "prefix");
        return v(0, prefix, 0, prefix.B());
    }

    public e D() {
        byte b10;
        for (int i10 = 0; i10 < n().length; i10++) {
            byte b11 = n()[i10];
            byte b12 = (byte) 65;
            if (b11 >= b12 && b11 <= (b10 = (byte) 90)) {
                byte[] n10 = n();
                byte[] copyOf = Arrays.copyOf(n10, n10.length);
                kotlin.jvm.internal.n.d(copyOf, "copyOf(this, size)");
                copyOf[i10] = (byte) (b11 + 32);
                for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                    byte b13 = copyOf[i11];
                    if (b13 >= b12 && b13 <= b10) {
                        copyOf[i11] = (byte) (b13 + 32);
                    }
                }
                return new e(copyOf);
            }
        }
        return this;
    }

    public byte[] E() {
        byte[] n10 = n();
        byte[] copyOf = Arrays.copyOf(n10, n10.length);
        kotlin.jvm.internal.n.d(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public String F() {
        String q10 = q();
        if (q10 != null) {
            return q10;
        }
        String b10 = b0.b(s());
        y(b10);
        return b10;
    }

    public void G(b buffer, int i10, int i11) {
        kotlin.jvm.internal.n.e(buffer, "buffer");
        em.b.d(this, buffer, i10, i11);
    }

    public String b() {
        return a0.b(n(), null, 1, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (eVar.B() == n().length && eVar.w(0, n(), 0, n().length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r0 < r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L33;
     */
    @Override // java.lang.Comparable
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(dm.e r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.n.e(r10, r0)
            int r0 = r9.B()
            int r1 = r10.B()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.m(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.m(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = r5
            goto L33
        L32:
            r3 = r6
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dm.e.compareTo(dm.e):int");
    }

    public int hashCode() {
        int o10 = o();
        if (o10 != 0) {
            return o10;
        }
        int hashCode = Arrays.hashCode(n());
        x(hashCode);
        return hashCode;
    }

    public e i(String algorithm) {
        kotlin.jvm.internal.n.e(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f14293a, 0, B());
        byte[] digestBytes = messageDigest.digest();
        kotlin.jvm.internal.n.d(digestBytes, "digestBytes");
        return new e(digestBytes);
    }

    public final byte m(int i10) {
        return t(i10);
    }

    public final byte[] n() {
        return this.f14293a;
    }

    public final int o() {
        return this.f14294b;
    }

    public int p() {
        return n().length;
    }

    public final String q() {
        return this.f14295c;
    }

    public String r() {
        String m10;
        char[] cArr = new char[n().length * 2];
        int i10 = 0;
        for (byte b10 : n()) {
            int i11 = i10 + 1;
            cArr[i10] = em.b.f()[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = em.b.f()[b10 & 15];
        }
        m10 = xk.p.m(cArr);
        return m10;
    }

    public byte[] s() {
        return n();
    }

    public byte t(int i10) {
        return n()[i10];
    }

    public String toString() {
        int c10;
        String A;
        String A2;
        String A3;
        StringBuilder sb2;
        e eVar;
        byte[] h10;
        String str;
        if (!(n().length == 0)) {
            c10 = em.b.c(n(), 64);
            if (c10 != -1) {
                String F = F();
                String substring = F.substring(0, c10);
                kotlin.jvm.internal.n.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                A = xk.p.A(substring, "\\", "\\\\", false, 4, null);
                A2 = xk.p.A(A, "\n", "\\n", false, 4, null);
                A3 = xk.p.A(A2, "\r", "\\r", false, 4, null);
                if (c10 >= F.length()) {
                    sb2 = new StringBuilder();
                    sb2.append("[text=");
                    sb2.append(A3);
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(n().length);
                sb2.append(" text=");
                sb2.append(A3);
            } else if (n().length <= 64) {
                str = "[hex=" + r() + ']';
            } else {
                sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(n().length);
                sb2.append(" hex=");
                int d10 = c0.d(this, 64);
                if (!(d10 <= n().length)) {
                    throw new IllegalArgumentException(("endIndex > length(" + n().length + ')').toString());
                }
                if (!(d10 + 0 >= 0)) {
                    throw new IllegalArgumentException("endIndex < beginIndex".toString());
                }
                if (d10 == n().length) {
                    eVar = this;
                } else {
                    h10 = dk.l.h(n(), 0, d10);
                    eVar = new e(h10);
                }
                sb2.append(eVar.r());
            }
            sb2.append("…]");
            return sb2.toString();
        }
        str = "[size=0]";
        return str;
    }

    public boolean v(int i10, e other, int i11, int i12) {
        kotlin.jvm.internal.n.e(other, "other");
        return other.w(i11, n(), i10, i12);
    }

    public boolean w(int i10, byte[] other, int i11, int i12) {
        kotlin.jvm.internal.n.e(other, "other");
        return i10 >= 0 && i10 <= n().length - i12 && i11 >= 0 && i11 <= other.length - i12 && c0.a(n(), i10, other, i11, i12);
    }

    public final void x(int i10) {
        this.f14294b = i10;
    }

    public final void y(String str) {
        this.f14295c = str;
    }

    public final e z() {
        return i("SHA-1");
    }
}

package dm;

import dk.C7019l;
import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p090em.C7252b;
import p450xk.C12524p;

/* renamed from: dm.e */
/* loaded from: classes3.dex */
public class C7061e implements Serializable, Comparable<C7061e> {

    /* renamed from: d */
    public static final a f15649d = new a(null);

    /* renamed from: e */
    public static final C7061e f15650e = new C7061e(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private final byte[] f15651a;

    /* renamed from: b */
    private transient int f15652b;

    /* renamed from: c */
    private transient String f15653c;

    /* renamed from: dm.e$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: f */
        public static /* synthetic */ C7061e m20778f(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = C7059c0.m20746c();
            }
            return aVar.m20783e(bArr, i10, i11);
        }

        /* renamed from: a */
        public final C7061e m20779a(String str) {
            C9322n.m27781e(str, "<this>");
            if (!(str.length() % 2 == 0)) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((C7252b.m21697b(str.charAt(i11)) << 4) + C7252b.m21697b(str.charAt(i11 + 1)));
            }
            return new C7061e(bArr);
        }

        /* renamed from: b */
        public final C7061e m20780b(String str, Charset charset) {
            C9322n.m27781e(str, "<this>");
            C9322n.m27781e(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            C9322n.m27780d(bytes, "this as java.lang.String).getBytes(charset)");
            return new C7061e(bytes);
        }

        /* renamed from: c */
        public final C7061e m20781c(String str) {
            C9322n.m27781e(str, "<this>");
            C7061e c7061e = new C7061e(C7057b0.m20742a(str));
            c7061e.m20776y(str);
            return c7061e;
        }

        /* renamed from: d */
        public final C7061e m20782d(byte... data) {
            C9322n.m27781e(data, "data");
            byte[] copyOf = Arrays.copyOf(data, data.length);
            C9322n.m27780d(copyOf, "copyOf(this, size)");
            return new C7061e(copyOf);
        }

        /* renamed from: e */
        public final C7061e m20783e(byte[] bArr, int i10, int i11) {
            byte[] m20440h;
            C9322n.m27781e(bArr, "<this>");
            int m20748e = C7059c0.m20748e(bArr, i11);
            C7059c0.m20745b(bArr.length, i10, m20748e);
            m20440h = C7019l.m20440h(bArr, i10, m20748e + i10);
            return new C7061e(m20440h);
        }

        /* renamed from: g */
        public final C7061e m20784g(InputStream inputStream, int i10) {
            C9322n.m27781e(inputStream, "<this>");
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
            return new C7061e(bArr);
        }
    }

    public C7061e(byte[] data) {
        C9322n.m27781e(data, "data");
        this.f15651a = data;
    }

    /* renamed from: l */
    public static final C7061e m20753l(String str) {
        return f15649d.m20781c(str);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        C7061e m20784g = f15649d.m20784g(objectInputStream, objectInputStream.readInt());
        Field declaredField = C7061e.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        declaredField.set(this, m20784g.f15651a);
    }

    /* renamed from: u */
    public static final C7061e m20754u(byte... bArr) {
        return f15649d.m20782d(bArr);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.f15651a.length);
        objectOutputStream.write(this.f15651a);
    }

    /* renamed from: A */
    public final C7061e m20755A() {
        return mo20764i("SHA-256");
    }

    /* renamed from: B */
    public final int m20756B() {
        return mo20768p();
    }

    /* renamed from: C */
    public final boolean m20757C(C7061e prefix) {
        C9322n.m27781e(prefix, "prefix");
        return mo20773v(0, prefix, 0, prefix.m20756B());
    }

    /* renamed from: D */
    public C7061e mo20758D() {
        byte b10;
        for (int i10 = 0; i10 < m20766n().length; i10++) {
            byte b11 = m20766n()[i10];
            byte b12 = (byte) 65;
            if (b11 >= b12 && b11 <= (b10 = (byte) 90)) {
                byte[] m20766n = m20766n();
                byte[] copyOf = Arrays.copyOf(m20766n, m20766n.length);
                C9322n.m27780d(copyOf, "copyOf(this, size)");
                copyOf[i10] = (byte) (b11 + 32);
                for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                    byte b13 = copyOf[i11];
                    if (b13 >= b12 && b13 <= b10) {
                        copyOf[i11] = (byte) (b13 + 32);
                    }
                }
                return new C7061e(copyOf);
            }
        }
        return this;
    }

    /* renamed from: E */
    public byte[] mo20759E() {
        byte[] m20766n = m20766n();
        byte[] copyOf = Arrays.copyOf(m20766n, m20766n.length);
        C9322n.m27780d(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    /* renamed from: F */
    public String m20760F() {
        String m20769q = m20769q();
        if (m20769q != null) {
            return m20769q;
        }
        String m20743b = C7057b0.m20743b(mo20771s());
        m20776y(m20743b);
        return m20743b;
    }

    /* renamed from: G */
    public void mo20761G(C7056b buffer, int i10, int i11) {
        C9322n.m27781e(buffer, "buffer");
        C7252b.m21699d(this, buffer, i10, i11);
    }

    /* renamed from: b */
    public String mo20762b() {
        return C7055a0.m20688b(m20766n(), null, 1, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7061e) {
            C7061e c7061e = (C7061e) obj;
            if (c7061e.m20756B() == m20766n().length && c7061e.mo20774w(0, m20766n(), 0, m20766n().length)) {
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
    
        if (r0 < r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L13;
     */
    @Override // java.lang.Comparable
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(dm.C7061e r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.C9322n.m27781e(r10, r0)
            int r0 = r9.m20756B()
            int r1 = r10.m20756B()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.m20765m(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.m20765m(r4)
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
        throw new UnsupportedOperationException("Method not decompiled: dm.C7061e.compareTo(dm.e):int");
    }

    public int hashCode() {
        int m20767o = m20767o();
        if (m20767o != 0) {
            return m20767o;
        }
        int hashCode = Arrays.hashCode(m20766n());
        m20775x(hashCode);
        return hashCode;
    }

    /* renamed from: i */
    public C7061e mo20764i(String algorithm) {
        C9322n.m27781e(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f15651a, 0, m20756B());
        byte[] digestBytes = messageDigest.digest();
        C9322n.m27780d(digestBytes, "digestBytes");
        return new C7061e(digestBytes);
    }

    /* renamed from: m */
    public final byte m20765m(int i10) {
        return mo20772t(i10);
    }

    /* renamed from: n */
    public final byte[] m20766n() {
        return this.f15651a;
    }

    /* renamed from: o */
    public final int m20767o() {
        return this.f15652b;
    }

    /* renamed from: p */
    public int mo20768p() {
        return m20766n().length;
    }

    /* renamed from: q */
    public final String m20769q() {
        return this.f15653c;
    }

    /* renamed from: r */
    public String mo20770r() {
        String m41032m;
        char[] cArr = new char[m20766n().length * 2];
        int i10 = 0;
        for (byte b10 : m20766n()) {
            int i11 = i10 + 1;
            cArr[i10] = C7252b.m21701f()[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = C7252b.m21701f()[b10 & 15];
        }
        m41032m = C12524p.m41032m(cArr);
        return m41032m;
    }

    /* renamed from: s */
    public byte[] mo20771s() {
        return m20766n();
    }

    /* renamed from: t */
    public byte mo20772t(int i10) {
        return m20766n()[i10];
    }

    public String toString() {
        String m41027A;
        String m41027A2;
        String m41027A3;
        StringBuilder sb2;
        C7061e c7061e;
        byte[] m20440h;
        String str;
        if (!(m20766n().length == 0)) {
            int m21696a = C7252b.m21696a(m20766n(), 64);
            if (m21696a != -1) {
                String m20760F = m20760F();
                String substring = m20760F.substring(0, m21696a);
                C9322n.m27780d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                m41027A = C12524p.m41027A(substring, "\\", "\\\\", false, 4, null);
                m41027A2 = C12524p.m41027A(m41027A, "\n", "\\n", false, 4, null);
                m41027A3 = C12524p.m41027A(m41027A2, "\r", "\\r", false, 4, null);
                if (m21696a >= m20760F.length()) {
                    sb2 = new StringBuilder();
                    sb2.append("[text=");
                    sb2.append(m41027A3);
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(m20766n().length);
                sb2.append(" text=");
                sb2.append(m41027A3);
            } else if (m20766n().length <= 64) {
                str = "[hex=" + mo20770r() + ']';
            } else {
                sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(m20766n().length);
                sb2.append(" hex=");
                int m20747d = C7059c0.m20747d(this, 64);
                if (!(m20747d <= m20766n().length)) {
                    throw new IllegalArgumentException(("endIndex > length(" + m20766n().length + ')').toString());
                }
                if (!(m20747d + 0 >= 0)) {
                    throw new IllegalArgumentException("endIndex < beginIndex".toString());
                }
                if (m20747d == m20766n().length) {
                    c7061e = this;
                } else {
                    m20440h = C7019l.m20440h(m20766n(), 0, m20747d);
                    c7061e = new C7061e(m20440h);
                }
                sb2.append(c7061e.mo20770r());
            }
            sb2.append("…]");
            return sb2.toString();
        }
        str = "[size=0]";
        return str;
    }

    /* renamed from: v */
    public boolean mo20773v(int i10, C7061e other, int i11, int i12) {
        C9322n.m27781e(other, "other");
        return other.mo20774w(i11, m20766n(), i10, i12);
    }

    /* renamed from: w */
    public boolean mo20774w(int i10, byte[] other, int i11, int i12) {
        C9322n.m27781e(other, "other");
        return i10 >= 0 && i10 <= m20766n().length - i12 && i11 >= 0 && i11 <= other.length - i12 && C7059c0.m20744a(m20766n(), i10, other, i11, i12);
    }

    /* renamed from: x */
    public final void m20775x(int i10) {
        this.f15652b = i10;
    }

    /* renamed from: y */
    public final void m20776y(String str) {
        this.f15653c = str;
    }

    /* renamed from: z */
    public final C7061e m20777z() {
        return mo20764i("SHA-1");
    }
}

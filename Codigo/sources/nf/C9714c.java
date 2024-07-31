package nf;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* renamed from: nf.c */
/* loaded from: classes2.dex */
public class C9714c implements Closeable, Flushable {

    /* renamed from: u */
    private static final Pattern f23892u = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: v */
    private static final String[] f23893v = new String[RecognitionOptions.ITF];

    /* renamed from: w */
    private static final String[] f23894w;

    /* renamed from: a */
    private final Writer f23895a;

    /* renamed from: b */
    private int[] f23896b = new int[32];

    /* renamed from: c */
    private int f23897c = 0;

    /* renamed from: d */
    private String f23898d;

    /* renamed from: e */
    private String f23899e;

    /* renamed from: f */
    private boolean f23900f;

    /* renamed from: r */
    private boolean f23901r;

    /* renamed from: s */
    private String f23902s;

    /* renamed from: t */
    private boolean f23903t;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f23893v[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f23893v;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f23894w = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C9714c(Writer writer) {
        m29127I(6);
        this.f23899e = ":";
        this.f23903t = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f23895a = writer;
    }

    /* renamed from: E */
    private C9714c m29125E(int i10, char c10) {
        m29131b();
        m29127I(i10);
        this.f23895a.write(c10);
        return this;
    }

    /* renamed from: H */
    private int m29126H() {
        int i10 = this.f23897c;
        if (i10 != 0) {
            return this.f23896b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: I */
    private void m29127I(int i10) {
        int i11 = this.f23897c;
        int[] iArr = this.f23896b;
        if (i11 == iArr.length) {
            this.f23896b = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f23896b;
        int i12 = this.f23897c;
        this.f23897c = i12 + 1;
        iArr2[i12] = i10;
    }

    /* renamed from: O */
    private void m29128O(int i10) {
        this.f23896b[this.f23897c - 1] = i10;
    }

    /* renamed from: a */
    private void m29129a() {
        int m29126H = m29126H();
        if (m29126H == 5) {
            this.f23895a.write(44);
        } else if (m29126H != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m29135y();
        m29128O(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m29130a0(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f23901r
            if (r0 == 0) goto L7
            java.lang.String[] r0 = nf.C9714c.f23894w
            goto L9
        L7:
            java.lang.String[] r0 = nf.C9714c.f23893v
        L9:
            java.io.Writer r1 = r8.f23895a
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f23895a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f23895a
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f23895a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f23895a
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.C9714c.m29130a0(java.lang.String):void");
    }

    /* renamed from: b */
    private void m29131b() {
        int m29126H = m29126H();
        if (m29126H == 1) {
            m29128O(2);
        } else {
            if (m29126H != 2) {
                if (m29126H == 4) {
                    this.f23895a.append((CharSequence) this.f23899e);
                    m29128O(5);
                    return;
                }
                if (m29126H != 6) {
                    if (m29126H != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    if (!this.f23900f) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                m29128O(7);
                return;
            }
            this.f23895a.append(',');
        }
        m29135y();
    }

    /* renamed from: g */
    private C9714c m29132g(int i10, int i11, char c10) {
        int m29126H = m29126H();
        if (m29126H != i11 && m29126H != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f23902s != null) {
            throw new IllegalStateException("Dangling name: " + this.f23902s);
        }
        this.f23897c--;
        if (m29126H == i11) {
            m29135y();
        }
        this.f23895a.write(c10);
        return this;
    }

    /* renamed from: q */
    private static boolean m29133q(Class<? extends Number> cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    /* renamed from: v0 */
    private void m29134v0() {
        if (this.f23902s != null) {
            m29129a();
            m29130a0(this.f23902s);
            this.f23902s = null;
        }
    }

    /* renamed from: y */
    private void m29135y() {
        if (this.f23898d == null) {
            return;
        }
        this.f23895a.write(10);
        int i10 = this.f23897c;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f23895a.write(this.f23898d);
        }
    }

    /* renamed from: B */
    public C9714c mo18219B() {
        if (this.f23902s != null) {
            if (!this.f23903t) {
                this.f23902s = null;
                return this;
            }
            m29134v0();
        }
        m29131b();
        this.f23895a.write("null");
        return this;
    }

    /* renamed from: Q */
    public final void m29136Q(boolean z10) {
        this.f23901r = z10;
    }

    /* renamed from: R */
    public final void m29137R(String str) {
        String str2;
        if (str.length() == 0) {
            this.f23898d = null;
            str2 = ":";
        } else {
            this.f23898d = str;
            str2 = ": ";
        }
        this.f23899e = str2;
    }

    /* renamed from: S */
    public final void m29138S(boolean z10) {
        this.f23900f = z10;
    }

    /* renamed from: U */
    public final void m29139U(boolean z10) {
        this.f23903t = z10;
    }

    /* renamed from: c0 */
    public C9714c mo18220c0(long j10) {
        m29134v0();
        m29131b();
        this.f23895a.write(Long.toString(j10));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f23895a.close();
        int i10 = this.f23897c;
        if (i10 > 1 || (i10 == 1 && this.f23896b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f23897c = 0;
    }

    /* renamed from: e */
    public C9714c mo18221e() {
        m29134v0();
        return m29125E(1, '[');
    }

    /* renamed from: f */
    public C9714c mo18222f() {
        m29134v0();
        return m29125E(3, '{');
    }

    public void flush() {
        if (this.f23897c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f23895a.flush();
    }

    /* renamed from: h0 */
    public C9714c mo18223h0(Boolean bool) {
        if (bool == null) {
            return mo18219B();
        }
        m29134v0();
        m29131b();
        this.f23895a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* renamed from: i */
    public C9714c mo18224i() {
        return m29132g(1, 2, ']');
    }

    /* renamed from: i0 */
    public C9714c mo18225i0(Number number) {
        if (number == null) {
            return mo18219B();
        }
        m29134v0();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!m29133q(cls) && !f23892u.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f23900f) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + obj);
        }
        m29131b();
        this.f23895a.append((CharSequence) obj);
        return this;
    }

    /* renamed from: j */
    public C9714c mo18226j() {
        return m29132g(3, 5, '}');
    }

    /* renamed from: j0 */
    public C9714c mo18227j0(String str) {
        if (str == null) {
            return mo18219B();
        }
        m29134v0();
        m29131b();
        m29130a0(str);
        return this;
    }

    /* renamed from: l */
    public final boolean m29140l() {
        return this.f23903t;
    }

    /* renamed from: m0 */
    public C9714c mo18228m0(boolean z10) {
        m29134v0();
        m29131b();
        this.f23895a.write(z10 ? "true" : "false");
        return this;
    }

    /* renamed from: n */
    public final boolean m29141n() {
        return this.f23901r;
    }

    /* renamed from: o */
    public boolean m29142o() {
        return this.f23900f;
    }

    /* renamed from: r */
    public C9714c mo18229r(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f23902s != null) {
            throw new IllegalStateException();
        }
        if (this.f23897c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f23902s = str;
        return this;
    }
}

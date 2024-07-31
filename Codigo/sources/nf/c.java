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

/* loaded from: classes2.dex */
public class c implements Closeable, Flushable {

    /* renamed from: u, reason: collision with root package name */
    private static final Pattern f21959u = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: v, reason: collision with root package name */
    private static final String[] f21960v = new String[RecognitionOptions.ITF];

    /* renamed from: w, reason: collision with root package name */
    private static final String[] f21961w;

    /* renamed from: a, reason: collision with root package name */
    private final Writer f21962a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f21963b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    private int f21964c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f21965d;

    /* renamed from: e, reason: collision with root package name */
    private String f21966e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f21967f;

    /* renamed from: r, reason: collision with root package name */
    private boolean f21968r;

    /* renamed from: s, reason: collision with root package name */
    private String f21969s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f21970t;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f21960v[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f21960v;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f21961w = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        I(6);
        this.f21966e = ":";
        this.f21970t = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f21962a = writer;
    }

    private c E(int i10, char c10) {
        b();
        I(i10);
        this.f21962a.write(c10);
        return this;
    }

    private int H() {
        int i10 = this.f21964c;
        if (i10 != 0) {
            return this.f21963b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void I(int i10) {
        int i11 = this.f21964c;
        int[] iArr = this.f21963b;
        if (i11 == iArr.length) {
            this.f21963b = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f21963b;
        int i12 = this.f21964c;
        this.f21964c = i12 + 1;
        iArr2[i12] = i10;
    }

    private void O(int i10) {
        this.f21963b[this.f21964c - 1] = i10;
    }

    private void a() {
        int H = H();
        if (H == 5) {
            this.f21962a.write(44);
        } else if (H != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        y();
        O(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a0(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f21968r
            if (r0 == 0) goto L7
            java.lang.String[] r0 = nf.c.f21961w
            goto L9
        L7:
            java.lang.String[] r0 = nf.c.f21960v
        L9:
            java.io.Writer r1 = r8.f21962a
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
            java.io.Writer r6 = r8.f21962a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f21962a
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f21962a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f21962a
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.c.a0(java.lang.String):void");
    }

    private void b() {
        int H = H();
        if (H == 1) {
            O(2);
        } else {
            if (H != 2) {
                if (H == 4) {
                    this.f21962a.append((CharSequence) this.f21966e);
                    O(5);
                    return;
                }
                if (H != 6) {
                    if (H != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    if (!this.f21967f) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                O(7);
                return;
            }
            this.f21962a.append(',');
        }
        y();
    }

    private c g(int i10, int i11, char c10) {
        int H = H();
        if (H != i11 && H != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f21969s != null) {
            throw new IllegalStateException("Dangling name: " + this.f21969s);
        }
        this.f21964c--;
        if (H == i11) {
            y();
        }
        this.f21962a.write(c10);
        return this;
    }

    private static boolean q(Class<? extends Number> cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    private void v0() {
        if (this.f21969s != null) {
            a();
            a0(this.f21969s);
            this.f21969s = null;
        }
    }

    private void y() {
        if (this.f21965d == null) {
            return;
        }
        this.f21962a.write(10);
        int i10 = this.f21964c;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f21962a.write(this.f21965d);
        }
    }

    public c B() {
        if (this.f21969s != null) {
            if (!this.f21970t) {
                this.f21969s = null;
                return this;
            }
            v0();
        }
        b();
        this.f21962a.write("null");
        return this;
    }

    public final void Q(boolean z10) {
        this.f21968r = z10;
    }

    public final void R(String str) {
        String str2;
        if (str.length() == 0) {
            this.f21965d = null;
            str2 = ":";
        } else {
            this.f21965d = str;
            str2 = ": ";
        }
        this.f21966e = str2;
    }

    public final void S(boolean z10) {
        this.f21967f = z10;
    }

    public final void U(boolean z10) {
        this.f21970t = z10;
    }

    public c c0(long j10) {
        v0();
        b();
        this.f21962a.write(Long.toString(j10));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f21962a.close();
        int i10 = this.f21964c;
        if (i10 > 1 || (i10 == 1 && this.f21963b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f21964c = 0;
    }

    public c e() {
        v0();
        return E(1, '[');
    }

    public c f() {
        v0();
        return E(3, '{');
    }

    public void flush() {
        if (this.f21964c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f21962a.flush();
    }

    public c h0(Boolean bool) {
        if (bool == null) {
            return B();
        }
        v0();
        b();
        this.f21962a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c i() {
        return g(1, 2, ']');
    }

    public c i0(Number number) {
        if (number == null) {
            return B();
        }
        v0();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!q(cls) && !f21959u.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f21967f) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + obj);
        }
        b();
        this.f21962a.append((CharSequence) obj);
        return this;
    }

    public c j() {
        return g(3, 5, '}');
    }

    public c j0(String str) {
        if (str == null) {
            return B();
        }
        v0();
        b();
        a0(str);
        return this;
    }

    public final boolean l() {
        return this.f21970t;
    }

    public c m0(boolean z10) {
        v0();
        b();
        this.f21962a.write(z10 ? "true" : "false");
        return this;
    }

    public final boolean n() {
        return this.f21968r;
    }

    public boolean o() {
        return this.f21967f;
    }

    public c r(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f21969s != null) {
            throw new IllegalStateException();
        }
        if (this.f21964c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f21969s = str;
        return this;
    }
}

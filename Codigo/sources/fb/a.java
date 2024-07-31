package fb;

import com.google.android.libraries.barhopper.RecognitionOptions;
import eb.o;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final a f15065a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b, reason: collision with root package name */
    private static final a f15066b = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c, reason: collision with root package name */
    private static final a f15067c = new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* renamed from: d, reason: collision with root package name */
    private static final a f15068d = new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* renamed from: e, reason: collision with root package name */
    private static final a f15069e = new b("base16()", "0123456789ABCDEF");

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fb.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0242a {

        /* renamed from: a, reason: collision with root package name */
        private final String f15070a;

        /* renamed from: b, reason: collision with root package name */
        private final char[] f15071b;

        /* renamed from: c, reason: collision with root package name */
        final int f15072c;

        /* renamed from: d, reason: collision with root package name */
        final int f15073d;

        /* renamed from: e, reason: collision with root package name */
        final int f15074e;

        /* renamed from: f, reason: collision with root package name */
        final int f15075f;

        /* renamed from: g, reason: collision with root package name */
        private final byte[] f15076g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean[] f15077h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f15078i;

        C0242a(String str, char[] cArr) {
            this(str, cArr, b(cArr), false);
        }

        private C0242a(String str, char[] cArr, byte[] bArr, boolean z10) {
            this.f15070a = (String) o.o(str);
            this.f15071b = (char[]) o.o(cArr);
            try {
                int d10 = gb.b.d(cArr.length, RoundingMode.UNNECESSARY);
                this.f15073d = d10;
                int numberOfTrailingZeros = Integer.numberOfTrailingZeros(d10);
                int i10 = 1 << (3 - numberOfTrailingZeros);
                this.f15074e = i10;
                this.f15075f = d10 >> numberOfTrailingZeros;
                this.f15072c = cArr.length - 1;
                this.f15076g = bArr;
                boolean[] zArr = new boolean[i10];
                for (int i11 = 0; i11 < this.f15075f; i11++) {
                    zArr[gb.b.a(i11 * 8, this.f15073d, RoundingMode.CEILING)] = true;
                }
                this.f15077h = zArr;
                this.f15078i = z10;
            } catch (ArithmeticException e10) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e10);
            }
        }

        private static byte[] b(char[] cArr) {
            byte[] bArr = new byte[RecognitionOptions.ITF];
            Arrays.fill(bArr, (byte) -1);
            for (int i10 = 0; i10 < cArr.length; i10++) {
                char c10 = cArr[i10];
                boolean z10 = true;
                o.f(c10 < 128, "Non-ASCII character: %s", c10);
                if (bArr[c10] != -1) {
                    z10 = false;
                }
                o.f(z10, "Duplicate character: %s", c10);
                bArr[c10] = (byte) i10;
            }
            return bArr;
        }

        private boolean e() {
            for (char c10 : this.f15071b) {
                if (eb.c.c(c10)) {
                    return true;
                }
            }
            return false;
        }

        private boolean f() {
            for (char c10 : this.f15071b) {
                if (eb.c.d(c10)) {
                    return true;
                }
            }
            return false;
        }

        int c(char c10) {
            if (c10 > 127) {
                throw new d("Unrecognized character: 0x" + Integer.toHexString(c10));
            }
            byte b10 = this.f15076g[c10];
            if (b10 != -1) {
                return b10;
            }
            if (c10 <= ' ' || c10 == 127) {
                throw new d("Unrecognized character: 0x" + Integer.toHexString(c10));
            }
            throw new d("Unrecognized character: " + c10);
        }

        char d(int i10) {
            return this.f15071b[i10];
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0242a)) {
                return false;
            }
            C0242a c0242a = (C0242a) obj;
            return this.f15078i == c0242a.f15078i && Arrays.equals(this.f15071b, c0242a.f15071b);
        }

        C0242a g() {
            if (this.f15078i) {
                return this;
            }
            byte[] bArr = this.f15076g;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            int i10 = 65;
            while (true) {
                if (i10 > 90) {
                    return new C0242a(this.f15070a + ".ignoreCase()", this.f15071b, copyOf, true);
                }
                int i11 = i10 | 32;
                byte[] bArr2 = this.f15076g;
                byte b10 = bArr2[i10];
                byte b11 = bArr2[i11];
                if (b10 == -1) {
                    copyOf[i10] = b11;
                } else {
                    o.w(b11 == -1, "Can't ignoreCase() since '%s' and '%s' encode different values", (char) i10, (char) i11);
                    copyOf[i11] = b10;
                }
                i10++;
            }
        }

        boolean h(int i10) {
            return this.f15077h[i10 % this.f15074e];
        }

        public int hashCode() {
            return Arrays.hashCode(this.f15071b) + (this.f15078i ? 1231 : 1237);
        }

        public boolean i(char c10) {
            byte[] bArr = this.f15076g;
            return c10 < bArr.length && bArr[c10] != -1;
        }

        C0242a j() {
            if (!e()) {
                return this;
            }
            o.v(!f(), "Cannot call upperCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f15071b.length];
            int i10 = 0;
            while (true) {
                char[] cArr2 = this.f15071b;
                if (i10 >= cArr2.length) {
                    break;
                }
                cArr[i10] = eb.c.f(cArr2[i10]);
                i10++;
            }
            C0242a c0242a = new C0242a(this.f15070a + ".upperCase()", cArr);
            return this.f15078i ? c0242a.g() : c0242a;
        }

        public String toString() {
            return this.f15070a;
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends e {

        /* renamed from: i, reason: collision with root package name */
        final char[] f15079i;

        private b(C0242a c0242a) {
            super(c0242a, null);
            this.f15079i = new char[RecognitionOptions.UPC_A];
            o.d(c0242a.f15071b.length == 16);
            for (int i10 = 0; i10 < 256; i10++) {
                this.f15079i[i10] = c0242a.d(i10 >>> 4);
                this.f15079i[i10 | RecognitionOptions.QR_CODE] = c0242a.d(i10 & 15);
            }
        }

        b(String str, String str2) {
            this(new C0242a(str, str2.toCharArray()));
        }

        @Override // fb.a.e, fb.a
        int e(byte[] bArr, CharSequence charSequence) {
            o.o(bArr);
            if (charSequence.length() % 2 == 1) {
                throw new d("Invalid input length " + charSequence.length());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequence.length()) {
                bArr[i11] = (byte) ((this.f15080f.c(charSequence.charAt(i10)) << 4) | this.f15080f.c(charSequence.charAt(i10 + 1)));
                i10 += 2;
                i11++;
            }
            return i11;
        }

        @Override // fb.a.e, fb.a
        void h(Appendable appendable, byte[] bArr, int i10, int i11) {
            o.o(appendable);
            o.t(i10, i10 + i11, bArr.length);
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = bArr[i10 + i12] & 255;
                appendable.append(this.f15079i[i13]);
                appendable.append(this.f15079i[i13 | RecognitionOptions.QR_CODE]);
            }
        }

        @Override // fb.a.e
        a p(C0242a c0242a, Character ch2) {
            return new b(c0242a);
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends e {
        private c(C0242a c0242a, Character ch2) {
            super(c0242a, ch2);
            o.d(c0242a.f15071b.length == 64);
        }

        c(String str, String str2, Character ch2) {
            this(new C0242a(str, str2.toCharArray()), ch2);
        }

        @Override // fb.a.e, fb.a
        int e(byte[] bArr, CharSequence charSequence) {
            o.o(bArr);
            CharSequence m10 = m(charSequence);
            if (!this.f15080f.h(m10.length())) {
                throw new d("Invalid input length " + m10.length());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < m10.length()) {
                int i12 = i10 + 1;
                int i13 = i12 + 1;
                int c10 = (this.f15080f.c(m10.charAt(i10)) << 18) | (this.f15080f.c(m10.charAt(i12)) << 12);
                int i14 = i11 + 1;
                bArr[i11] = (byte) (c10 >>> 16);
                if (i13 < m10.length()) {
                    int i15 = i13 + 1;
                    int c11 = c10 | (this.f15080f.c(m10.charAt(i13)) << 6);
                    i11 = i14 + 1;
                    bArr[i14] = (byte) ((c11 >>> 8) & 255);
                    if (i15 < m10.length()) {
                        i13 = i15 + 1;
                        i14 = i11 + 1;
                        bArr[i11] = (byte) ((c11 | this.f15080f.c(m10.charAt(i15))) & 255);
                    } else {
                        i10 = i15;
                    }
                }
                i11 = i14;
                i10 = i13;
            }
            return i11;
        }

        @Override // fb.a.e, fb.a
        void h(Appendable appendable, byte[] bArr, int i10, int i11) {
            o.o(appendable);
            int i12 = i10 + i11;
            o.t(i10, i12, bArr.length);
            while (i11 >= 3) {
                int i13 = i10 + 1;
                int i14 = i13 + 1;
                int i15 = ((bArr[i10] & 255) << 16) | ((bArr[i13] & 255) << 8) | (bArr[i14] & 255);
                appendable.append(this.f15080f.d(i15 >>> 18));
                appendable.append(this.f15080f.d((i15 >>> 12) & 63));
                appendable.append(this.f15080f.d((i15 >>> 6) & 63));
                appendable.append(this.f15080f.d(i15 & 63));
                i11 -= 3;
                i10 = i14 + 1;
            }
            if (i10 < i12) {
                o(appendable, bArr, i10, i12 - i10);
            }
        }

        @Override // fb.a.e
        a p(C0242a c0242a, Character ch2) {
            return new c(c0242a, ch2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends IOException {
        d(String str) {
            super(str);
        }
    }

    /* loaded from: classes2.dex */
    static class e extends a {

        /* renamed from: f, reason: collision with root package name */
        final C0242a f15080f;

        /* renamed from: g, reason: collision with root package name */
        final Character f15081g;

        /* renamed from: h, reason: collision with root package name */
        private volatile a f15082h;

        e(C0242a c0242a, Character ch2) {
            this.f15080f = (C0242a) o.o(c0242a);
            o.k(ch2 == null || !c0242a.i(ch2.charValue()), "Padding character %s was already in alphabet", ch2);
            this.f15081g = ch2;
        }

        e(String str, String str2, Character ch2) {
            this(new C0242a(str, str2.toCharArray()), ch2);
        }

        @Override // fb.a
        int e(byte[] bArr, CharSequence charSequence) {
            C0242a c0242a;
            o.o(bArr);
            CharSequence m10 = m(charSequence);
            if (!this.f15080f.h(m10.length())) {
                throw new d("Invalid input length " + m10.length());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < m10.length()) {
                long j10 = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    c0242a = this.f15080f;
                    if (i12 >= c0242a.f15074e) {
                        break;
                    }
                    j10 <<= c0242a.f15073d;
                    if (i10 + i12 < m10.length()) {
                        j10 |= this.f15080f.c(m10.charAt(i13 + i10));
                        i13++;
                    }
                    i12++;
                }
                int i14 = c0242a.f15075f;
                int i15 = (i14 * 8) - (i13 * c0242a.f15073d);
                int i16 = (i14 - 1) * 8;
                while (i16 >= i15) {
                    bArr[i11] = (byte) ((j10 >>> i16) & 255);
                    i16 -= 8;
                    i11++;
                }
                i10 += this.f15080f.f15074e;
            }
            return i11;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f15080f.equals(eVar.f15080f) && Objects.equals(this.f15081g, eVar.f15081g);
        }

        @Override // fb.a
        void h(Appendable appendable, byte[] bArr, int i10, int i11) {
            o.o(appendable);
            o.t(i10, i10 + i11, bArr.length);
            int i12 = 0;
            while (i12 < i11) {
                o(appendable, bArr, i10 + i12, Math.min(this.f15080f.f15075f, i11 - i12));
                i12 += this.f15080f.f15075f;
            }
        }

        public int hashCode() {
            return this.f15080f.hashCode() ^ Objects.hashCode(this.f15081g);
        }

        @Override // fb.a
        int j(int i10) {
            return (int) (((this.f15080f.f15073d * i10) + 7) / 8);
        }

        @Override // fb.a
        int k(int i10) {
            C0242a c0242a = this.f15080f;
            return c0242a.f15074e * gb.b.a(i10, c0242a.f15075f, RoundingMode.CEILING);
        }

        @Override // fb.a
        public a l() {
            return this.f15081g == null ? this : p(this.f15080f, null);
        }

        @Override // fb.a
        CharSequence m(CharSequence charSequence) {
            o.o(charSequence);
            Character ch2 = this.f15081g;
            if (ch2 == null) {
                return charSequence;
            }
            char charValue = ch2.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == charValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        @Override // fb.a
        public a n() {
            a aVar = this.f15082h;
            if (aVar == null) {
                C0242a j10 = this.f15080f.j();
                aVar = j10 == this.f15080f ? this : p(j10, this.f15081g);
                this.f15082h = aVar;
            }
            return aVar;
        }

        void o(Appendable appendable, byte[] bArr, int i10, int i11) {
            o.o(appendable);
            o.t(i10, i10 + i11, bArr.length);
            int i12 = 0;
            o.d(i11 <= this.f15080f.f15075f);
            long j10 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                j10 = (j10 | (bArr[i10 + i13] & 255)) << 8;
            }
            int i14 = ((i11 + 1) * 8) - this.f15080f.f15073d;
            while (i12 < i11 * 8) {
                C0242a c0242a = this.f15080f;
                appendable.append(c0242a.d(((int) (j10 >>> (i14 - i12))) & c0242a.f15072c));
                i12 += this.f15080f.f15073d;
            }
            if (this.f15081g != null) {
                while (i12 < this.f15080f.f15075f * 8) {
                    appendable.append(this.f15081g.charValue());
                    i12 += this.f15080f.f15073d;
                }
            }
        }

        a p(C0242a c0242a, Character ch2) {
            return new e(c0242a, ch2);
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("BaseEncoding.");
            sb2.append(this.f15080f);
            if (8 % this.f15080f.f15073d != 0) {
                if (this.f15081g == null) {
                    str = ".omitPadding()";
                } else {
                    sb2.append(".withPadChar('");
                    sb2.append(this.f15081g);
                    str = "')";
                }
                sb2.append(str);
            }
            return sb2.toString();
        }
    }

    a() {
    }

    public static a a() {
        return f15069e;
    }

    public static a b() {
        return f15065a;
    }

    private static byte[] i(byte[] bArr, int i10) {
        if (i10 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    public final byte[] c(CharSequence charSequence) {
        try {
            return d(charSequence);
        } catch (d e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    final byte[] d(CharSequence charSequence) {
        CharSequence m10 = m(charSequence);
        byte[] bArr = new byte[j(m10.length())];
        return i(bArr, e(bArr, m10));
    }

    abstract int e(byte[] bArr, CharSequence charSequence);

    public String f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public final String g(byte[] bArr, int i10, int i11) {
        o.t(i10, i10 + i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(k(i11));
        try {
            h(sb2, bArr, i10, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    abstract void h(Appendable appendable, byte[] bArr, int i10, int i11);

    abstract int j(int i10);

    abstract int k(int i10);

    public abstract a l();

    abstract CharSequence m(CharSequence charSequence);

    public abstract a n();
}

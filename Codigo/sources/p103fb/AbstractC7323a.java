package p103fb;

import com.google.android.libraries.barhopper.RecognitionOptions;
import gb.C7535b;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import p082eb.C7147c;
import p082eb.C7159o;

/* renamed from: fb.a */
/* loaded from: classes2.dex */
public abstract class AbstractC7323a {

    /* renamed from: a */
    private static final AbstractC7323a f16488a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b */
    private static final AbstractC7323a f16489b = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c */
    private static final AbstractC7323a f16490c = new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* renamed from: d */
    private static final AbstractC7323a f16491d = new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* renamed from: e */
    private static final AbstractC7323a f16492e = new b("base16()", "0123456789ABCDEF");

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fb.a$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private final String f16493a;

        /* renamed from: b */
        private final char[] f16494b;

        /* renamed from: c */
        final int f16495c;

        /* renamed from: d */
        final int f16496d;

        /* renamed from: e */
        final int f16497e;

        /* renamed from: f */
        final int f16498f;

        /* renamed from: g */
        private final byte[] f16499g;

        /* renamed from: h */
        private final boolean[] f16500h;

        /* renamed from: i */
        private final boolean f16501i;

        a(String str, char[] cArr) {
            this(str, cArr, m21964b(cArr), false);
        }

        private a(String str, char[] cArr, byte[] bArr, boolean z10) {
            this.f16493a = (String) C7159o.m21312o(str);
            this.f16494b = (char[]) C7159o.m21312o(cArr);
            try {
                int m22883d = C7535b.m22883d(cArr.length, RoundingMode.UNNECESSARY);
                this.f16496d = m22883d;
                int numberOfTrailingZeros = Integer.numberOfTrailingZeros(m22883d);
                int i10 = 1 << (3 - numberOfTrailingZeros);
                this.f16497e = i10;
                this.f16498f = m22883d >> numberOfTrailingZeros;
                this.f16495c = cArr.length - 1;
                this.f16499g = bArr;
                boolean[] zArr = new boolean[i10];
                for (int i11 = 0; i11 < this.f16498f; i11++) {
                    zArr[C7535b.m22880a(i11 * 8, this.f16496d, RoundingMode.CEILING)] = true;
                }
                this.f16500h = zArr;
                this.f16501i = z10;
            } catch (ArithmeticException e10) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e10);
            }
        }

        /* renamed from: b */
        private static byte[] m21964b(char[] cArr) {
            byte[] bArr = new byte[RecognitionOptions.ITF];
            Arrays.fill(bArr, (byte) -1);
            for (int i10 = 0; i10 < cArr.length; i10++) {
                char c10 = cArr[i10];
                boolean z10 = true;
                C7159o.m21303f(c10 < 128, "Non-ASCII character: %s", c10);
                if (bArr[c10] != -1) {
                    z10 = false;
                }
                C7159o.m21303f(z10, "Duplicate character: %s", c10);
                bArr[c10] = (byte) i10;
            }
            return bArr;
        }

        /* renamed from: e */
        private boolean m21965e() {
            for (char c10 : this.f16494b) {
                if (C7147c.m21251c(c10)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: f */
        private boolean m21966f() {
            for (char c10 : this.f16494b) {
                if (C7147c.m21252d(c10)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c */
        int m21967c(char c10) {
            if (c10 > 127) {
                throw new d("Unrecognized character: 0x" + Integer.toHexString(c10));
            }
            byte b10 = this.f16499g[c10];
            if (b10 != -1) {
                return b10;
            }
            if (c10 <= ' ' || c10 == 127) {
                throw new d("Unrecognized character: 0x" + Integer.toHexString(c10));
            }
            throw new d("Unrecognized character: " + c10);
        }

        /* renamed from: d */
        char m21968d(int i10) {
            return this.f16494b[i10];
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f16501i == aVar.f16501i && Arrays.equals(this.f16494b, aVar.f16494b);
        }

        /* renamed from: g */
        a m21969g() {
            if (this.f16501i) {
                return this;
            }
            byte[] bArr = this.f16499g;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            int i10 = 65;
            while (true) {
                if (i10 > 90) {
                    return new a(this.f16493a + ".ignoreCase()", this.f16494b, copyOf, true);
                }
                int i11 = i10 | 32;
                byte[] bArr2 = this.f16499g;
                byte b10 = bArr2[i10];
                byte b11 = bArr2[i11];
                if (b10 == -1) {
                    copyOf[i10] = b11;
                } else {
                    C7159o.m21320w(b11 == -1, "Can't ignoreCase() since '%s' and '%s' encode different values", (char) i10, (char) i11);
                    copyOf[i11] = b10;
                }
                i10++;
            }
        }

        /* renamed from: h */
        boolean m21970h(int i10) {
            return this.f16500h[i10 % this.f16497e];
        }

        public int hashCode() {
            return Arrays.hashCode(this.f16494b) + (this.f16501i ? 1231 : 1237);
        }

        /* renamed from: i */
        public boolean m21971i(char c10) {
            byte[] bArr = this.f16499g;
            return c10 < bArr.length && bArr[c10] != -1;
        }

        /* renamed from: j */
        a m21972j() {
            if (!m21965e()) {
                return this;
            }
            C7159o.m21319v(!m21966f(), "Cannot call upperCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f16494b.length];
            int i10 = 0;
            while (true) {
                char[] cArr2 = this.f16494b;
                if (i10 >= cArr2.length) {
                    break;
                }
                cArr[i10] = C7147c.m21254f(cArr2[i10]);
                i10++;
            }
            a aVar = new a(this.f16493a + ".upperCase()", cArr);
            return this.f16501i ? aVar.m21969g() : aVar;
        }

        public String toString() {
            return this.f16493a;
        }
    }

    /* renamed from: fb.a$b */
    /* loaded from: classes2.dex */
    static final class b extends e {

        /* renamed from: i */
        final char[] f16502i;

        private b(a aVar) {
            super(aVar, null);
            this.f16502i = new char[RecognitionOptions.UPC_A];
            C7159o.m21301d(aVar.f16494b.length == 16);
            for (int i10 = 0; i10 < 256; i10++) {
                this.f16502i[i10] = aVar.m21968d(i10 >>> 4);
                this.f16502i[i10 | RecognitionOptions.QR_CODE] = aVar.m21968d(i10 & 15);
            }
        }

        b(String str, String str2) {
            this(new a(str, str2.toCharArray()));
        }

        @Override // p103fb.AbstractC7323a.e, p103fb.AbstractC7323a
        /* renamed from: e */
        int mo21954e(byte[] bArr, CharSequence charSequence) {
            C7159o.m21312o(bArr);
            if (charSequence.length() % 2 == 1) {
                throw new d("Invalid input length " + charSequence.length());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequence.length()) {
                bArr[i11] = (byte) ((this.f16503f.m21967c(charSequence.charAt(i10)) << 4) | this.f16503f.m21967c(charSequence.charAt(i10 + 1)));
                i10 += 2;
                i11++;
            }
            return i11;
        }

        @Override // p103fb.AbstractC7323a.e, p103fb.AbstractC7323a
        /* renamed from: h */
        void mo21957h(Appendable appendable, byte[] bArr, int i10, int i11) {
            C7159o.m21312o(appendable);
            C7159o.m21317t(i10, i10 + i11, bArr.length);
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = bArr[i10 + i12] & 255;
                appendable.append(this.f16502i[i13]);
                appendable.append(this.f16502i[i13 | RecognitionOptions.QR_CODE]);
            }
        }

        @Override // p103fb.AbstractC7323a.e
        /* renamed from: p */
        AbstractC7323a mo21973p(a aVar, Character ch2) {
            return new b(aVar);
        }
    }

    /* renamed from: fb.a$c */
    /* loaded from: classes2.dex */
    static final class c extends e {
        private c(a aVar, Character ch2) {
            super(aVar, ch2);
            C7159o.m21301d(aVar.f16494b.length == 64);
        }

        c(String str, String str2, Character ch2) {
            this(new a(str, str2.toCharArray()), ch2);
        }

        @Override // p103fb.AbstractC7323a.e, p103fb.AbstractC7323a
        /* renamed from: e */
        int mo21954e(byte[] bArr, CharSequence charSequence) {
            C7159o.m21312o(bArr);
            CharSequence mo21961m = mo21961m(charSequence);
            if (!this.f16503f.m21970h(mo21961m.length())) {
                throw new d("Invalid input length " + mo21961m.length());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < mo21961m.length()) {
                int i12 = i10 + 1;
                int i13 = i12 + 1;
                int m21967c = (this.f16503f.m21967c(mo21961m.charAt(i10)) << 18) | (this.f16503f.m21967c(mo21961m.charAt(i12)) << 12);
                int i14 = i11 + 1;
                bArr[i11] = (byte) (m21967c >>> 16);
                if (i13 < mo21961m.length()) {
                    int i15 = i13 + 1;
                    int m21967c2 = m21967c | (this.f16503f.m21967c(mo21961m.charAt(i13)) << 6);
                    i11 = i14 + 1;
                    bArr[i14] = (byte) ((m21967c2 >>> 8) & 255);
                    if (i15 < mo21961m.length()) {
                        i13 = i15 + 1;
                        i14 = i11 + 1;
                        bArr[i11] = (byte) ((m21967c2 | this.f16503f.m21967c(mo21961m.charAt(i15))) & 255);
                    } else {
                        i10 = i15;
                    }
                }
                i11 = i14;
                i10 = i13;
            }
            return i11;
        }

        @Override // p103fb.AbstractC7323a.e, p103fb.AbstractC7323a
        /* renamed from: h */
        void mo21957h(Appendable appendable, byte[] bArr, int i10, int i11) {
            C7159o.m21312o(appendable);
            int i12 = i10 + i11;
            C7159o.m21317t(i10, i12, bArr.length);
            while (i11 >= 3) {
                int i13 = i10 + 1;
                int i14 = i13 + 1;
                int i15 = ((bArr[i10] & 255) << 16) | ((bArr[i13] & 255) << 8) | (bArr[i14] & 255);
                appendable.append(this.f16503f.m21968d(i15 >>> 18));
                appendable.append(this.f16503f.m21968d((i15 >>> 12) & 63));
                appendable.append(this.f16503f.m21968d((i15 >>> 6) & 63));
                appendable.append(this.f16503f.m21968d(i15 & 63));
                i11 -= 3;
                i10 = i14 + 1;
            }
            if (i10 < i12) {
                m21974o(appendable, bArr, i10, i12 - i10);
            }
        }

        @Override // p103fb.AbstractC7323a.e
        /* renamed from: p */
        AbstractC7323a mo21973p(a aVar, Character ch2) {
            return new c(aVar, ch2);
        }
    }

    /* renamed from: fb.a$d */
    /* loaded from: classes2.dex */
    public static final class d extends IOException {
        d(String str) {
            super(str);
        }
    }

    /* renamed from: fb.a$e */
    /* loaded from: classes2.dex */
    static class e extends AbstractC7323a {

        /* renamed from: f */
        final a f16503f;

        /* renamed from: g */
        final Character f16504g;

        /* renamed from: h */
        private volatile AbstractC7323a f16505h;

        e(a aVar, Character ch2) {
            this.f16503f = (a) C7159o.m21312o(aVar);
            C7159o.m21308k(ch2 == null || !aVar.m21971i(ch2.charValue()), "Padding character %s was already in alphabet", ch2);
            this.f16504g = ch2;
        }

        e(String str, String str2, Character ch2) {
            this(new a(str, str2.toCharArray()), ch2);
        }

        @Override // p103fb.AbstractC7323a
        /* renamed from: e */
        int mo21954e(byte[] bArr, CharSequence charSequence) {
            a aVar;
            C7159o.m21312o(bArr);
            CharSequence mo21961m = mo21961m(charSequence);
            if (!this.f16503f.m21970h(mo21961m.length())) {
                throw new d("Invalid input length " + mo21961m.length());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < mo21961m.length()) {
                long j10 = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    aVar = this.f16503f;
                    if (i12 >= aVar.f16497e) {
                        break;
                    }
                    j10 <<= aVar.f16496d;
                    if (i10 + i12 < mo21961m.length()) {
                        j10 |= this.f16503f.m21967c(mo21961m.charAt(i13 + i10));
                        i13++;
                    }
                    i12++;
                }
                int i14 = aVar.f16498f;
                int i15 = (i14 * 8) - (i13 * aVar.f16496d);
                int i16 = (i14 - 1) * 8;
                while (i16 >= i15) {
                    bArr[i11] = (byte) ((j10 >>> i16) & 255);
                    i16 -= 8;
                    i11++;
                }
                i10 += this.f16503f.f16497e;
            }
            return i11;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f16503f.equals(eVar.f16503f) && Objects.equals(this.f16504g, eVar.f16504g);
        }

        @Override // p103fb.AbstractC7323a
        /* renamed from: h */
        void mo21957h(Appendable appendable, byte[] bArr, int i10, int i11) {
            C7159o.m21312o(appendable);
            C7159o.m21317t(i10, i10 + i11, bArr.length);
            int i12 = 0;
            while (i12 < i11) {
                m21974o(appendable, bArr, i10 + i12, Math.min(this.f16503f.f16498f, i11 - i12));
                i12 += this.f16503f.f16498f;
            }
        }

        public int hashCode() {
            return this.f16503f.hashCode() ^ Objects.hashCode(this.f16504g);
        }

        @Override // p103fb.AbstractC7323a
        /* renamed from: j */
        int mo21958j(int i10) {
            return (int) (((this.f16503f.f16496d * i10) + 7) / 8);
        }

        @Override // p103fb.AbstractC7323a
        /* renamed from: k */
        int mo21959k(int i10) {
            a aVar = this.f16503f;
            return aVar.f16497e * C7535b.m22880a(i10, aVar.f16498f, RoundingMode.CEILING);
        }

        @Override // p103fb.AbstractC7323a
        /* renamed from: l */
        public AbstractC7323a mo21960l() {
            return this.f16504g == null ? this : mo21973p(this.f16503f, null);
        }

        @Override // p103fb.AbstractC7323a
        /* renamed from: m */
        CharSequence mo21961m(CharSequence charSequence) {
            C7159o.m21312o(charSequence);
            Character ch2 = this.f16504g;
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

        @Override // p103fb.AbstractC7323a
        /* renamed from: n */
        public AbstractC7323a mo21962n() {
            AbstractC7323a abstractC7323a = this.f16505h;
            if (abstractC7323a == null) {
                a m21972j = this.f16503f.m21972j();
                abstractC7323a = m21972j == this.f16503f ? this : mo21973p(m21972j, this.f16504g);
                this.f16505h = abstractC7323a;
            }
            return abstractC7323a;
        }

        /* renamed from: o */
        void m21974o(Appendable appendable, byte[] bArr, int i10, int i11) {
            C7159o.m21312o(appendable);
            C7159o.m21317t(i10, i10 + i11, bArr.length);
            int i12 = 0;
            C7159o.m21301d(i11 <= this.f16503f.f16498f);
            long j10 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                j10 = (j10 | (bArr[i10 + i13] & 255)) << 8;
            }
            int i14 = ((i11 + 1) * 8) - this.f16503f.f16496d;
            while (i12 < i11 * 8) {
                a aVar = this.f16503f;
                appendable.append(aVar.m21968d(((int) (j10 >>> (i14 - i12))) & aVar.f16495c));
                i12 += this.f16503f.f16496d;
            }
            if (this.f16504g != null) {
                while (i12 < this.f16503f.f16498f * 8) {
                    appendable.append(this.f16504g.charValue());
                    i12 += this.f16503f.f16496d;
                }
            }
        }

        /* renamed from: p */
        AbstractC7323a mo21973p(a aVar, Character ch2) {
            return new e(aVar, ch2);
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("BaseEncoding.");
            sb2.append(this.f16503f);
            if (8 % this.f16503f.f16496d != 0) {
                if (this.f16504g == null) {
                    str = ".omitPadding()";
                } else {
                    sb2.append(".withPadChar('");
                    sb2.append(this.f16504g);
                    str = "')";
                }
                sb2.append(str);
            }
            return sb2.toString();
        }
    }

    AbstractC7323a() {
    }

    /* renamed from: a */
    public static AbstractC7323a m21949a() {
        return f16492e;
    }

    /* renamed from: b */
    public static AbstractC7323a m21950b() {
        return f16488a;
    }

    /* renamed from: i */
    private static byte[] m21951i(byte[] bArr, int i10) {
        if (i10 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    /* renamed from: c */
    public final byte[] m21952c(CharSequence charSequence) {
        try {
            return m21953d(charSequence);
        } catch (d e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* renamed from: d */
    final byte[] m21953d(CharSequence charSequence) {
        CharSequence mo21961m = mo21961m(charSequence);
        byte[] bArr = new byte[mo21958j(mo21961m.length())];
        return m21951i(bArr, mo21954e(bArr, mo21961m));
    }

    /* renamed from: e */
    abstract int mo21954e(byte[] bArr, CharSequence charSequence);

    /* renamed from: f */
    public String m21955f(byte[] bArr) {
        return m21956g(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public final String m21956g(byte[] bArr, int i10, int i11) {
        C7159o.m21317t(i10, i10 + i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(mo21959k(i11));
        try {
            mo21957h(sb2, bArr, i10, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: h */
    abstract void mo21957h(Appendable appendable, byte[] bArr, int i10, int i11);

    /* renamed from: j */
    abstract int mo21958j(int i10);

    /* renamed from: k */
    abstract int mo21959k(int i10);

    /* renamed from: l */
    public abstract AbstractC7323a mo21960l();

    /* renamed from: m */
    abstract CharSequence mo21961m(CharSequence charSequence);

    /* renamed from: n */
    public abstract AbstractC7323a mo21962n();
}

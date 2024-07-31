package okhttp3.internal.publicsuffix;

import ck.v;
import dk.q;
import dk.r;
import dk.z;
import dm.i;
import dm.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import mk.b;
import rl.d;
import zl.j;

/* loaded from: classes3.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e */
    public static final a f22688e = new a(null);

    /* renamed from: f */
    private static final byte[] f22689f = {42};

    /* renamed from: g */
    private static final List<String> f22690g;

    /* renamed from: h */
    private static final PublicSuffixDatabase f22691h;

    /* renamed from: a */
    private final AtomicBoolean f22692a = new AtomicBoolean(false);

    /* renamed from: b */
    private final CountDownLatch f22693b = new CountDownLatch(1);

    /* renamed from: c */
    private byte[] f22694c;

    /* renamed from: d */
    private byte[] f22695d;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final String b(byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            boolean z10;
            int d10;
            int d11;
            int length = bArr.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = (i12 + length) / 2;
                while (i13 > -1 && bArr[i13] != 10) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i11 = i14 + i15;
                    if (bArr[i11] == 10) {
                        break;
                    }
                    i15++;
                }
                int i16 = i11 - i14;
                int i17 = i10;
                boolean z11 = false;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (z11) {
                        d10 = 46;
                        z10 = false;
                    } else {
                        z10 = z11;
                        d10 = d.d(bArr2[i17][i18], 255);
                    }
                    d11 = d10 - d.d(bArr[i14 + i19], 255);
                    if (d11 != 0) {
                        break;
                    }
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    }
                    if (bArr2[i17].length != i18) {
                        z11 = z10;
                    } else {
                        if (i17 == bArr2.length - 1) {
                            break;
                        }
                        i17++;
                        i18 = -1;
                        z11 = true;
                    }
                }
                if (d11 >= 0) {
                    if (d11 <= 0) {
                        int i20 = i16 - i19;
                        int length2 = bArr2[i17].length - i18;
                        int length3 = bArr2.length;
                        for (int i21 = i17 + 1; i21 < length3; i21++) {
                            length2 += bArr2[i21].length;
                        }
                        if (length2 >= i20) {
                            if (length2 <= i20) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                n.d(UTF_8, "UTF_8");
                                return new String(bArr, i14, i16, UTF_8);
                            }
                        }
                    }
                    i12 = i11 + 1;
                }
                length = i14 - 1;
            }
            return null;
        }

        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f22691h;
        }
    }

    static {
        List<String> e10;
        e10 = q.e("*");
        f22690g = e10;
        f22691h = new PublicSuffixDatabase();
    }

    private final List<String> b(List<String> list) {
        String str;
        String str2;
        String str3;
        List<String> t02;
        if (this.f22692a.get() || !this.f22692a.compareAndSet(false, true)) {
            try {
                this.f22693b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            e();
        }
        if (!(this.f22694c != null)) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = list.size();
        byte[][] bArr = new byte[size];
        for (int i10 = 0; i10 < size; i10++) {
            String str4 = list.get(i10);
            Charset UTF_8 = StandardCharsets.UTF_8;
            n.d(UTF_8, "UTF_8");
            byte[] bytes = str4.getBytes(UTF_8);
            n.d(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i10] = bytes;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                str = null;
                break;
            }
            int i12 = i11 + 1;
            a aVar = f22688e;
            byte[] bArr2 = this.f22694c;
            if (bArr2 == null) {
                n.p("publicSuffixListBytes");
                bArr2 = null;
            }
            String b10 = aVar.b(bArr2, bArr, i11);
            if (b10 != null) {
                str = b10;
                break;
            }
            i11 = i12;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            int i13 = 0;
            while (i13 < length) {
                int i14 = i13 + 1;
                bArr3[i13] = f22689f;
                a aVar2 = f22688e;
                byte[] bArr4 = this.f22694c;
                if (bArr4 == null) {
                    n.p("publicSuffixListBytes");
                    bArr4 = null;
                }
                String b11 = aVar2.b(bArr4, bArr3, i13);
                if (b11 != null) {
                    str2 = b11;
                    break;
                }
                i13 = i14;
            }
        }
        str2 = null;
        if (str2 != null) {
            int i15 = size - 1;
            int i16 = 0;
            while (i16 < i15) {
                int i17 = i16 + 1;
                a aVar3 = f22688e;
                byte[] bArr5 = this.f22695d;
                if (bArr5 == null) {
                    n.p("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                str3 = aVar3.b(bArr5, bArr, i16);
                if (str3 != null) {
                    break;
                }
                i16 = i17;
            }
        }
        str3 = null;
        if (str3 != null) {
            t02 = xk.q.t0(n.k("!", str3), new char[]{'.'}, false, 0, 6, null);
            return t02;
        }
        if (str == null && str2 == null) {
            return f22690g;
        }
        List<String> t03 = str == null ? null : xk.q.t0(str, new char[]{'.'}, false, 0, 6, null);
        if (t03 == null) {
            t03 = r.j();
        }
        List<String> t04 = str2 != null ? xk.q.t0(str2, new char[]{'.'}, false, 0, 6, null) : null;
        if (t04 == null) {
            t04 = r.j();
        }
        return t03.size() > t04.size() ? t03 : t04;
    }

    private final void d() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        dm.d b10 = l.b(new i(l.g(resourceAsStream)));
        try {
            byte[] g02 = b10.g0(b10.readInt());
            byte[] g03 = b10.g0(b10.readInt());
            v vVar = v.f7137a;
            b.a(b10, null);
            synchronized (this) {
                n.b(g02);
                this.f22694c = g02;
                n.b(g03);
                this.f22695d = g03;
            }
            this.f22693b.countDown();
        } finally {
        }
    }

    private final void e() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    j.f32984a.g().j("Failed to read public suffix list", 5, e10);
                    if (z10) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private final List<String> f(String str) {
        List<String> t02;
        Object O;
        List<String> A;
        t02 = xk.q.t0(str, new char[]{'.'}, false, 0, 6, null);
        O = z.O(t02);
        if (!n.a(O, "")) {
            return t02;
        }
        A = z.A(t02, 1);
        return A;
    }

    public final String c(String domain) {
        wk.d w10;
        wk.d f10;
        String i10;
        n.e(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        n.d(unicodeDomain, "unicodeDomain");
        List<String> f11 = f(unicodeDomain);
        List<String> b10 = b(f11);
        if (f11.size() == b10.size() && b10.get(0).charAt(0) != '!') {
            return null;
        }
        char charAt = b10.get(0).charAt(0);
        int size = f11.size();
        int size2 = b10.size();
        if (charAt != '!') {
            size2++;
        }
        w10 = z.w(f(domain));
        f10 = wk.l.f(w10, size - size2);
        i10 = wk.l.i(f10, ".", null, null, 0, null, null, 62, null);
        return i10;
    }
}

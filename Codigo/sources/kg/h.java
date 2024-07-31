package kg;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    private static final List<CharsetEncoder> f20681c = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    private final CharsetEncoder[] f20682a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20683b;

    static {
        String[] strArr = {"IBM437", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "ISO-8859-16", "windows-1250", "windows-1251", "windows-1252", "windows-1256", "Shift_JIS"};
        for (int i10 = 0; i10 < 20; i10++) {
            String str = strArr[i10];
            if (d.h(str) != null) {
                try {
                    f20681c.add(Charset.forName(str).newEncoder());
                } catch (UnsupportedCharsetException unused) {
                }
            }
        }
    }

    public h(String str, Charset charset, int i10) {
        boolean z10;
        ArrayList<CharsetEncoder> arrayList = new ArrayList();
        arrayList.add(StandardCharsets.ISO_8859_1.newEncoder());
        int i11 = 0;
        boolean z11 = charset != null && charset.name().startsWith("UTF");
        for (int i12 = 0; i12 < str.length(); i12++) {
            for (CharsetEncoder charsetEncoder : arrayList) {
                char charAt = str.charAt(i12);
                if (charAt == i10 || charsetEncoder.canEncode(charAt)) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
            if (!z10) {
                Iterator<CharsetEncoder> it = f20681c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    CharsetEncoder next = it.next();
                    if (next.canEncode(str.charAt(i12))) {
                        arrayList.add(next);
                        z10 = true;
                        break;
                    }
                }
            }
            if (!z10) {
                z11 = true;
            }
        }
        if (arrayList.size() != 1 || z11) {
            this.f20682a = new CharsetEncoder[arrayList.size() + 2];
            Iterator it2 = arrayList.iterator();
            int i13 = 0;
            while (it2.hasNext()) {
                this.f20682a[i13] = (CharsetEncoder) it2.next();
                i13++;
            }
            this.f20682a[i13] = StandardCharsets.UTF_8.newEncoder();
            this.f20682a[i13 + 1] = StandardCharsets.UTF_16BE.newEncoder();
        } else {
            this.f20682a = new CharsetEncoder[]{(CharsetEncoder) arrayList.get(0)};
        }
        if (charset != null) {
            while (true) {
                CharsetEncoder[] charsetEncoderArr = this.f20682a;
                if (i11 >= charsetEncoderArr.length) {
                    break;
                }
                if (charsetEncoderArr[i11] != null && charset.name().equals(this.f20682a[i11].charset().name())) {
                    break;
                } else {
                    i11++;
                }
            }
            this.f20683b = i11;
        }
        i11 = -1;
        this.f20683b = i11;
    }

    public boolean a(char c10, int i10) {
        return this.f20682a[i10].canEncode("" + c10);
    }

    public byte[] b(char c10, int i10) {
        return ("" + c10).getBytes(this.f20682a[i10].charset());
    }

    public byte[] c(String str, int i10) {
        return str.getBytes(this.f20682a[i10].charset());
    }

    public Charset d(int i10) {
        return this.f20682a[i10].charset();
    }

    public int e(int i10) {
        return d.b(this.f20682a[i10].charset()).m();
    }

    public int f() {
        return this.f20683b;
    }

    public int g() {
        return this.f20682a.length;
    }
}

package kg;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: kg.h */
/* loaded from: classes2.dex */
public final class C9270h {

    /* renamed from: c */
    private static final List<CharsetEncoder> f22503c = new ArrayList();

    /* renamed from: a */
    private final CharsetEncoder[] f22504a;

    /* renamed from: b */
    private final int f22505b;

    static {
        String[] strArr = {"IBM437", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "ISO-8859-16", "windows-1250", "windows-1251", "windows-1252", "windows-1256", "Shift_JIS"};
        for (int i10 = 0; i10 < 20; i10++) {
            String str = strArr[i10];
            if (EnumC9266d.m27621h(str) != null) {
                try {
                    f22503c.add(Charset.forName(str).newEncoder());
                } catch (UnsupportedCharsetException unused) {
                }
            }
        }
    }

    public C9270h(String str, Charset charset, int i10) {
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
                Iterator<CharsetEncoder> it = f22503c.iterator();
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
            this.f22504a = new CharsetEncoder[arrayList.size() + 2];
            Iterator it2 = arrayList.iterator();
            int i13 = 0;
            while (it2.hasNext()) {
                this.f22504a[i13] = (CharsetEncoder) it2.next();
                i13++;
            }
            this.f22504a[i13] = StandardCharsets.UTF_8.newEncoder();
            this.f22504a[i13 + 1] = StandardCharsets.UTF_16BE.newEncoder();
        } else {
            this.f22504a = new CharsetEncoder[]{(CharsetEncoder) arrayList.get(0)};
        }
        if (charset != null) {
            while (true) {
                CharsetEncoder[] charsetEncoderArr = this.f22504a;
                if (i11 >= charsetEncoderArr.length) {
                    break;
                }
                if (charsetEncoderArr[i11] != null && charset.name().equals(this.f22504a[i11].charset().name())) {
                    break;
                } else {
                    i11++;
                }
            }
            this.f22505b = i11;
        }
        i11 = -1;
        this.f22505b = i11;
    }

    /* renamed from: a */
    public boolean m27643a(char c10, int i10) {
        return this.f22504a[i10].canEncode("" + c10);
    }

    /* renamed from: b */
    public byte[] m27644b(char c10, int i10) {
        return ("" + c10).getBytes(this.f22504a[i10].charset());
    }

    /* renamed from: c */
    public byte[] m27645c(String str, int i10) {
        return str.getBytes(this.f22504a[i10].charset());
    }

    /* renamed from: d */
    public Charset m27646d(int i10) {
        return this.f22504a[i10].charset();
    }

    /* renamed from: e */
    public int m27647e(int i10) {
        return EnumC9266d.m27620b(this.f22504a[i10].charset()).m27624m();
    }

    /* renamed from: f */
    public int m27648f() {
        return this.f22505b;
    }

    /* renamed from: g */
    public int m27649g() {
        return this.f22504a.length;
    }
}

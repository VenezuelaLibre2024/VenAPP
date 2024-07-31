package kg;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f20707a;

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f20708b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f20709c;

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f20710d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f20711e;

    static {
        Charset defaultCharset = Charset.defaultCharset();
        f20707a = defaultCharset;
        Charset forName = Charset.forName("SJIS");
        f20708b = forName;
        f20709c = Charset.forName("GB2312");
        Charset forName2 = Charset.forName("EUC_JP");
        f20710d = forName2;
        f20711e = forName.equals(defaultCharset) || forName2.equals(defaultCharset);
    }

    public static Charset a(byte[] bArr, Map<dg.e, ?> map) {
        byte b10;
        byte[] bArr2 = bArr;
        if (map != null) {
            dg.e eVar = dg.e.CHARACTER_SET;
            if (map.containsKey(eVar)) {
                return Charset.forName(map.get(eVar).toString());
            }
        }
        boolean z10 = true;
        int i10 = 0;
        if (bArr2.length > 2 && (((b10 = bArr2[0]) == -2 && bArr2[1] == -1) || (b10 == -1 && bArr2[1] == -2))) {
            return StandardCharsets.UTF_16;
        }
        int length = bArr2.length;
        boolean z11 = bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65;
        boolean z12 = true;
        boolean z13 = true;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (i12 < length && (z10 || z12 || z13)) {
            int i22 = bArr2[i12] & 255;
            if (z13) {
                int i23 = i22 & RecognitionOptions.ITF;
                if (i13 > 0) {
                    if (i23 != 0) {
                        i13--;
                    }
                    z13 = false;
                } else if (i23 != 0) {
                    if ((i22 & 64) != 0) {
                        i13++;
                        if ((i22 & 32) == 0) {
                            i15++;
                        } else {
                            i13++;
                            if ((i22 & 16) == 0) {
                                i16++;
                            } else {
                                i13++;
                                if ((i22 & 8) == 0) {
                                    i17++;
                                }
                            }
                        }
                    }
                    z13 = false;
                }
            }
            if (z10) {
                if (i22 > 127 && i22 < 160) {
                    z10 = false;
                } else if (i22 > 159 && (i22 < 192 || i22 == 215 || i22 == 247)) {
                    i19++;
                }
            }
            if (z12) {
                if (i14 > 0) {
                    if (i22 >= 64 && i22 != 127 && i22 <= 252) {
                        i14--;
                    }
                    z12 = false;
                } else {
                    if (i22 != 128 && i22 != 160 && i22 <= 239) {
                        if (i22 <= 160 || i22 >= 224) {
                            if (i22 > 127) {
                                i14++;
                                int i24 = i20 + 1;
                                if (i24 > i10) {
                                    i10 = i24;
                                    i20 = i10;
                                } else {
                                    i20 = i24;
                                }
                            } else {
                                i20 = 0;
                            }
                            i21 = 0;
                        } else {
                            i11++;
                            int i25 = i21 + 1;
                            if (i25 > i18) {
                                i18 = i25;
                                i21 = i18;
                            } else {
                                i21 = i25;
                            }
                            i20 = 0;
                        }
                    }
                    z12 = false;
                }
            }
            i12++;
            bArr2 = bArr;
        }
        if (z13 && i13 > 0) {
            z13 = false;
        }
        if (z12 && i14 > 0) {
            z12 = false;
        }
        return (!z13 || (!z11 && (i15 + i16) + i17 <= 0)) ? (!z12 || (!f20711e && i18 < 3 && i10 < 3)) ? (z10 && z12) ? (!(i18 == 2 && i11 == 2) && i19 * 10 < length) ? StandardCharsets.ISO_8859_1 : f20708b : z10 ? StandardCharsets.ISO_8859_1 : z12 ? f20708b : z13 ? StandardCharsets.UTF_8 : f20707a : f20708b : StandardCharsets.UTF_8;
    }
}

package kg;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import p066dg.EnumC6944e;

/* renamed from: kg.p */
/* loaded from: classes2.dex */
public final class C9278p {

    /* renamed from: a */
    private static final Charset f22529a;

    /* renamed from: b */
    public static final Charset f22530b;

    /* renamed from: c */
    public static final Charset f22531c;

    /* renamed from: d */
    private static final Charset f22532d;

    /* renamed from: e */
    private static final boolean f22533e;

    static {
        Charset defaultCharset = Charset.defaultCharset();
        f22529a = defaultCharset;
        Charset forName = Charset.forName("SJIS");
        f22530b = forName;
        f22531c = Charset.forName("GB2312");
        Charset forName2 = Charset.forName("EUC_JP");
        f22532d = forName2;
        f22533e = forName.equals(defaultCharset) || forName2.equals(defaultCharset);
    }

    /* renamed from: a */
    public static Charset m27684a(byte[] bArr, Map<EnumC6944e, ?> map) {
        byte b10;
        byte[] bArr2 = bArr;
        if (map != null) {
            EnumC6944e enumC6944e = EnumC6944e.CHARACTER_SET;
            if (map.containsKey(enumC6944e)) {
                return Charset.forName(map.get(enumC6944e).toString());
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
        return (!z13 || (!z11 && (i15 + i16) + i17 <= 0)) ? (!z12 || (!f22533e && i18 < 3 && i10 < 3)) ? (z10 && z12) ? (!(i18 == 2 && i11 == 2) && i19 * 10 < length) ? StandardCharsets.ISO_8859_1 : f22530b : z10 ? StandardCharsets.ISO_8859_1 : z12 ? f22530b : z13 ? StandardCharsets.UTF_8 : f22529a : f22530b : StandardCharsets.UTF_8;
    }
}

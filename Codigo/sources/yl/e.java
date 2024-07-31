package yl;

import com.google.android.libraries.barhopper.RecognitionOptions;
import xk.p;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a */
    public static final e f32049a = new e();

    /* renamed from: b */
    public static final dm.e f32050b = dm.e.f14291d.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: c */
    private static final String[] f32051c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: d */
    private static final String[] f32052d = new String[64];

    /* renamed from: e */
    private static final String[] f32053e;

    static {
        String z10;
        String[] strArr = new String[RecognitionOptions.QR_CODE];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            String binaryString = Integer.toBinaryString(i11);
            kotlin.jvm.internal.n.d(binaryString, "toBinaryString(it)");
            z10 = p.z(rl.d.t("%8s", binaryString), ' ', '0', false, 4, null);
            strArr[i11] = z10;
        }
        f32053e = strArr;
        String[] strArr2 = f32052d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        strArr2[1 | 8] = kotlin.jvm.internal.n.k("END_STREAM", "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i12 = 0;
        while (i12 < 3) {
            int i13 = iArr2[i12];
            i12++;
            int i14 = iArr[0];
            String[] strArr3 = f32052d;
            int i15 = i14 | i13;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) strArr3[i14]);
            sb2.append('|');
            sb2.append((Object) strArr3[i13]);
            strArr3[i15] = sb2.toString();
            strArr3[i15 | 8] = ((Object) strArr3[i14]) + '|' + ((Object) strArr3[i13]) + "|PADDED";
        }
        int length = f32052d.length;
        while (i10 < length) {
            int i16 = i10 + 1;
            String[] strArr4 = f32052d;
            if (strArr4[i10] == null) {
                strArr4[i10] = f32053e[i10];
            }
            i10 = i16;
        }
    }

    private e() {
    }

    public final String a(int i10, int i11) {
        String str;
        String str2;
        String str3;
        String A;
        if (i11 == 0) {
            return "";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4 || i10 == 6) {
                return i11 == 1 ? "ACK" : f32053e[i11];
            }
            if (i10 != 7 && i10 != 8) {
                String[] strArr = f32052d;
                if (i11 < strArr.length) {
                    str = strArr[i11];
                    kotlin.jvm.internal.n.b(str);
                } else {
                    str = f32053e[i11];
                }
                String str4 = str;
                if (i10 == 5 && (i11 & 4) != 0) {
                    str2 = "HEADERS";
                    str3 = "PUSH_PROMISE";
                } else {
                    if (i10 != 0 || (i11 & 32) == 0) {
                        return str4;
                    }
                    str2 = "PRIORITY";
                    str3 = "COMPRESSED";
                }
                A = p.A(str4, str2, str3, false, 4, null);
                return A;
            }
        }
        return f32053e[i11];
    }

    public final String b(int i10) {
        String[] strArr = f32051c;
        return i10 < strArr.length ? strArr[i10] : rl.d.t("0x%02x", Integer.valueOf(i10));
    }

    public final String c(boolean z10, int i10, int i11, int i12, int i13) {
        return rl.d.t("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), b(i12), a(i12, i13));
    }
}

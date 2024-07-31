package p473yl;

import com.google.android.libraries.barhopper.RecognitionOptions;
import dm.C7061e;
import kotlin.jvm.internal.C9322n;
import p341rl.C10727d;
import p450xk.C12524p;

/* renamed from: yl.e */
/* loaded from: classes3.dex */
public final class C12737e {

    /* renamed from: a */
    public static final C12737e f34585a = new C12737e();

    /* renamed from: b */
    public static final C7061e f34586b = C7061e.f15649d.m20781c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: c */
    private static final String[] f34587c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: d */
    private static final String[] f34588d = new String[64];

    /* renamed from: e */
    private static final String[] f34589e;

    static {
        String m41045z;
        String[] strArr = new String[RecognitionOptions.QR_CODE];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            String binaryString = Integer.toBinaryString(i11);
            C9322n.m27780d(binaryString, "toBinaryString(it)");
            m41045z = C12524p.m41045z(C10727d.m32660t("%8s", binaryString), ' ', '0', false, 4, null);
            strArr[i11] = m41045z;
        }
        f34589e = strArr;
        String[] strArr2 = f34588d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        strArr2[1 | 8] = C9322n.m27787k("END_STREAM", "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i12 = 0;
        while (i12 < 3) {
            int i13 = iArr2[i12];
            i12++;
            int i14 = iArr[0];
            String[] strArr3 = f34588d;
            int i15 = i14 | i13;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) strArr3[i14]);
            sb2.append('|');
            sb2.append((Object) strArr3[i13]);
            strArr3[i15] = sb2.toString();
            strArr3[i15 | 8] = ((Object) strArr3[i14]) + '|' + ((Object) strArr3[i13]) + "|PADDED";
        }
        int length = f34588d.length;
        while (i10 < length) {
            int i16 = i10 + 1;
            String[] strArr4 = f34588d;
            if (strArr4[i10] == null) {
                strArr4[i10] = f34589e[i10];
            }
            i10 = i16;
        }
    }

    private C12737e() {
    }

    /* renamed from: a */
    public final String m42081a(int i10, int i11) {
        String str;
        String str2;
        String str3;
        String m41027A;
        if (i11 == 0) {
            return "";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4 || i10 == 6) {
                return i11 == 1 ? "ACK" : f34589e[i11];
            }
            if (i10 != 7 && i10 != 8) {
                String[] strArr = f34588d;
                if (i11 < strArr.length) {
                    str = strArr[i11];
                    C9322n.m27778b(str);
                } else {
                    str = f34589e[i11];
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
                m41027A = C12524p.m41027A(str4, str2, str3, false, 4, null);
                return m41027A;
            }
        }
        return f34589e[i11];
    }

    /* renamed from: b */
    public final String m42082b(int i10) {
        String[] strArr = f34587c;
        return i10 < strArr.length ? strArr[i10] : C10727d.m32660t("0x%02x", Integer.valueOf(i10));
    }

    /* renamed from: c */
    public final String m42083c(boolean z10, int i10, int i11, int i12, int i13) {
        return C10727d.m32660t("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), m42082b(i12), m42081a(i12, i13));
    }
}

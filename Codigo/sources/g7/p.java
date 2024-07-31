package g7;

import t8.s;
import y6.b0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16011a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16012b;

    /* renamed from: c, reason: collision with root package name */
    public final b0.a f16013c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16014d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f16015e;

    public p(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        t8.a.a((bArr2 == null) ^ (i10 == 0));
        this.f16011a = z10;
        this.f16012b = str;
        this.f16014d = i10;
        this.f16015e = bArr2;
        this.f16013c = new b0.a(a(str), bArr, i11, i12);
    }

    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            default:
                s.i("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}

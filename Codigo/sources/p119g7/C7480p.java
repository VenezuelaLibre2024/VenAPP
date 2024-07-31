package p119g7;

import p363t8.C11137a;
import p363t8.C11173s;
import p459y6.InterfaceC12609b0;

/* renamed from: g7.p */
/* loaded from: classes.dex */
public final class C7480p {

    /* renamed from: a */
    public final boolean f17604a;

    /* renamed from: b */
    public final String f17605b;

    /* renamed from: c */
    public final InterfaceC12609b0.a f17606c;

    /* renamed from: d */
    public final int f17607d;

    /* renamed from: e */
    public final byte[] f17608e;

    public C7480p(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        C11137a.m34599a((bArr2 == null) ^ (i10 == 0));
        this.f17604a = z10;
        this.f17605b = str;
        this.f17607d = i10;
        this.f17608e = bArr2;
        this.f17606c = new InterfaceC12609b0.a(m22749a(str), bArr, i11, i12);
    }

    /* renamed from: a */
    private static int m22749a(String str) {
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
                C11173s.m34970i("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}

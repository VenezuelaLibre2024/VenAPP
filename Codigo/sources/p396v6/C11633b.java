package p396v6;

import com.facebook.ads.AdError;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import p361t6.C11108u1;
import p363t8.C11144d0;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p436x6.C12318m;

/* renamed from: v6.b */
/* loaded from: classes.dex */
public final class C11633b {

    /* renamed from: a */
    private static final int[] f30269a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f30270b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f30271c = {24000, 22050, 16000};

    /* renamed from: d */
    private static final int[] f30272d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f30273e = {32, 40, 48, 56, 64, 80, 96, 112, RecognitionOptions.ITF, 160, 192, 224, RecognitionOptions.QR_CODE, 320, 384, 448, RecognitionOptions.UPC_A, 576, 640};

    /* renamed from: f */
    private static final int[] f30274f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: v6.b$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final String f30275a;

        /* renamed from: b */
        public final int f30276b;

        /* renamed from: c */
        public final int f30277c;

        /* renamed from: d */
        public final int f30278d;

        /* renamed from: e */
        public final int f30279e;

        /* renamed from: f */
        public final int f30280f;

        /* renamed from: g */
        public final int f30281g;

        private b(String str, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f30275a = str;
            this.f30276b = i10;
            this.f30278d = i11;
            this.f30277c = i12;
            this.f30279e = i13;
            this.f30280f = i14;
            this.f30281g = i15;
        }
    }

    /* renamed from: a */
    private static int m36469a(int i10, int i11, int i12) {
        return (i10 * i11) / (i12 * 32);
    }

    /* renamed from: b */
    public static int m36470b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i10 = position; i10 <= limit; i10++) {
            if ((C11172r0.m34872I(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - position;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private static int m36471c(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f30270b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f30274f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f30273e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    /* renamed from: d */
    public static C11108u1 m36472d(C11146e0 c11146e0, String str, String str2, C12318m c12318m) {
        C11144d0 c11144d0 = new C11144d0();
        c11144d0.m34637m(c11146e0);
        int i10 = f30270b[c11144d0.m34632h(2)];
        c11144d0.m34642r(8);
        int i11 = f30272d[c11144d0.m34632h(3)];
        if (c11144d0.m34632h(1) != 0) {
            i11++;
        }
        int i12 = f30273e[c11144d0.m34632h(5)] * AdError.NETWORK_ERROR_CODE;
        c11144d0.m34627c();
        c11146e0.m34677U(c11144d0.m34628d());
        return new C11108u1.b().m34540U(str).m34552g0("audio/ac3").m34529J(i11).m34553h0(i10).m34534O(c12318m).m34543X(str2).m34528I(i12).m34547b0(i12).m34526G();
    }

    /* renamed from: e */
    public static int m36473e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f30269a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * RecognitionOptions.QR_CODE;
        }
        return 1536;
    }

    /* renamed from: f */
    public static b m36474f(C11144d0 c11144d0) {
        int i10;
        int i11;
        String str;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int m34629e = c11144d0.m34629e();
        c11144d0.m34642r(40);
        boolean z10 = c11144d0.m34632h(5) > 10;
        c11144d0.m34640p(m34629e);
        int i22 = -1;
        if (z10) {
            c11144d0.m34642r(16);
            int m34632h = c11144d0.m34632h(2);
            if (m34632h == 0) {
                i22 = 0;
            } else if (m34632h == 1) {
                i22 = 1;
            } else if (m34632h == 2) {
                i22 = 2;
            }
            c11144d0.m34642r(3);
            int m34632h2 = (c11144d0.m34632h(11) + 1) * 2;
            int m34632h3 = c11144d0.m34632h(2);
            if (m34632h3 == 3) {
                i17 = f30271c[c11144d0.m34632h(2)];
                i16 = 3;
                i18 = 6;
            } else {
                int m34632h4 = c11144d0.m34632h(2);
                int i23 = f30269a[m34632h4];
                i16 = m34632h4;
                i17 = f30270b[m34632h3];
                i18 = i23;
            }
            int i24 = i18 * RecognitionOptions.QR_CODE;
            int m36469a = m36469a(m34632h2, i17, i18);
            int m34632h5 = c11144d0.m34632h(3);
            boolean m34631g = c11144d0.m34631g();
            i10 = f30272d[m34632h5] + (m34631g ? 1 : 0);
            c11144d0.m34642r(10);
            if (c11144d0.m34631g()) {
                c11144d0.m34642r(8);
            }
            if (m34632h5 == 0) {
                c11144d0.m34642r(5);
                if (c11144d0.m34631g()) {
                    c11144d0.m34642r(8);
                }
            }
            if (i22 == 1 && c11144d0.m34631g()) {
                c11144d0.m34642r(16);
            }
            if (c11144d0.m34631g()) {
                if (m34632h5 > 2) {
                    c11144d0.m34642r(2);
                }
                if ((m34632h5 & 1) == 0 || m34632h5 <= 2) {
                    i20 = 6;
                } else {
                    i20 = 6;
                    c11144d0.m34642r(6);
                }
                if ((m34632h5 & 4) != 0) {
                    c11144d0.m34642r(i20);
                }
                if (m34631g && c11144d0.m34631g()) {
                    c11144d0.m34642r(5);
                }
                if (i22 == 0) {
                    if (c11144d0.m34631g()) {
                        i21 = 6;
                        c11144d0.m34642r(6);
                    } else {
                        i21 = 6;
                    }
                    if (m34632h5 == 0 && c11144d0.m34631g()) {
                        c11144d0.m34642r(i21);
                    }
                    if (c11144d0.m34631g()) {
                        c11144d0.m34642r(i21);
                    }
                    int m34632h6 = c11144d0.m34632h(2);
                    if (m34632h6 == 1) {
                        c11144d0.m34642r(5);
                    } else if (m34632h6 == 2) {
                        c11144d0.m34642r(12);
                    } else if (m34632h6 == 3) {
                        int m34632h7 = c11144d0.m34632h(5);
                        if (c11144d0.m34631g()) {
                            c11144d0.m34642r(5);
                            if (c11144d0.m34631g()) {
                                c11144d0.m34642r(4);
                            }
                            if (c11144d0.m34631g()) {
                                c11144d0.m34642r(4);
                            }
                            if (c11144d0.m34631g()) {
                                c11144d0.m34642r(4);
                            }
                            if (c11144d0.m34631g()) {
                                c11144d0.m34642r(4);
                            }
                            if (c11144d0.m34631g()) {
                                c11144d0.m34642r(4);
                            }
                            if (c11144d0.m34631g()) {
                                c11144d0.m34642r(4);
                            }
                            if (c11144d0.m34631g()) {
                                c11144d0.m34642r(4);
                            }
                            if (c11144d0.m34631g()) {
                                if (c11144d0.m34631g()) {
                                    c11144d0.m34642r(4);
                                }
                                if (c11144d0.m34631g()) {
                                    c11144d0.m34642r(4);
                                }
                            }
                        }
                        if (c11144d0.m34631g()) {
                            c11144d0.m34642r(5);
                            if (c11144d0.m34631g()) {
                                c11144d0.m34642r(7);
                                if (c11144d0.m34631g()) {
                                    c11144d0.m34642r(8);
                                }
                            }
                        }
                        c11144d0.m34642r((m34632h7 + 2) * 8);
                        c11144d0.m34627c();
                    }
                    if (m34632h5 < 2) {
                        if (c11144d0.m34631g()) {
                            c11144d0.m34642r(14);
                        }
                        if (m34632h5 == 0 && c11144d0.m34631g()) {
                            c11144d0.m34642r(14);
                        }
                    }
                    if (c11144d0.m34631g()) {
                        if (i16 == 0) {
                            c11144d0.m34642r(5);
                        } else {
                            for (int i25 = 0; i25 < i18; i25++) {
                                if (c11144d0.m34631g()) {
                                    c11144d0.m34642r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c11144d0.m34631g()) {
                c11144d0.m34642r(5);
                if (m34632h5 == 2) {
                    c11144d0.m34642r(4);
                }
                if (m34632h5 >= 6) {
                    c11144d0.m34642r(2);
                }
                if (c11144d0.m34631g()) {
                    c11144d0.m34642r(8);
                }
                if (m34632h5 == 0 && c11144d0.m34631g()) {
                    c11144d0.m34642r(8);
                }
                if (m34632h3 < 3) {
                    c11144d0.m34641q();
                }
            }
            if (i22 == 0 && i16 != 3) {
                c11144d0.m34641q();
            }
            if (i22 == 2 && (i16 == 3 || c11144d0.m34631g())) {
                i19 = 6;
                c11144d0.m34642r(6);
            } else {
                i19 = 6;
            }
            str = (c11144d0.m34631g() && c11144d0.m34632h(i19) == 1 && c11144d0.m34632h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i11 = i22;
            i12 = i24;
            i14 = m34632h2;
            i15 = i17;
            i13 = m36469a;
        } else {
            c11144d0.m34642r(32);
            int m34632h8 = c11144d0.m34632h(2);
            String str2 = m34632h8 == 3 ? null : "audio/ac3";
            int m34632h9 = c11144d0.m34632h(6);
            int i26 = f30273e[m34632h9 / 2] * AdError.NETWORK_ERROR_CODE;
            int m36471c = m36471c(m34632h8, m34632h9);
            c11144d0.m34642r(8);
            int m34632h10 = c11144d0.m34632h(3);
            if ((m34632h10 & 1) != 0 && m34632h10 != 1) {
                c11144d0.m34642r(2);
            }
            if ((m34632h10 & 4) != 0) {
                c11144d0.m34642r(2);
            }
            if (m34632h10 == 2) {
                c11144d0.m34642r(2);
            }
            int[] iArr = f30270b;
            int i27 = m34632h8 < iArr.length ? iArr[m34632h8] : -1;
            i10 = f30272d[m34632h10] + (c11144d0.m34631g() ? 1 : 0);
            i11 = -1;
            str = str2;
            i12 = 1536;
            i13 = i26;
            i14 = m36471c;
            i15 = i27;
        }
        return new b(str, i11, i10, i15, i14, i12, i13);
    }

    /* renamed from: g */
    public static int m36475g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return m36471c((b10 & 192) >> 6, b10 & 63);
    }

    /* renamed from: h */
    public static C11108u1 m36476h(C11146e0 c11146e0, String str, String str2, C12318m c12318m) {
        String str3;
        C11144d0 c11144d0 = new C11144d0();
        c11144d0.m34637m(c11146e0);
        int m34632h = c11144d0.m34632h(13) * AdError.NETWORK_ERROR_CODE;
        c11144d0.m34642r(3);
        int i10 = f30270b[c11144d0.m34632h(2)];
        c11144d0.m34642r(10);
        int i11 = f30272d[c11144d0.m34632h(3)];
        if (c11144d0.m34632h(1) != 0) {
            i11++;
        }
        c11144d0.m34642r(3);
        int m34632h2 = c11144d0.m34632h(4);
        c11144d0.m34642r(1);
        if (m34632h2 > 0) {
            c11144d0.m34643s(6);
            if (c11144d0.m34632h(1) != 0) {
                i11 += 2;
            }
            c11144d0.m34642r(1);
        }
        if (c11144d0.m34626b() > 7) {
            c11144d0.m34642r(7);
            if (c11144d0.m34632h(1) != 0) {
                str3 = "audio/eac3-joc";
                c11144d0.m34627c();
                c11146e0.m34677U(c11144d0.m34628d());
                return new C11108u1.b().m34540U(str).m34552g0(str3).m34529J(i11).m34553h0(i10).m34534O(c12318m).m34543X(str2).m34547b0(m34632h).m34526G();
            }
        }
        str3 = "audio/eac3";
        c11144d0.m34627c();
        c11146e0.m34677U(c11144d0.m34628d());
        return new C11108u1.b().m34540U(str).m34552g0(str3).m34529J(i11).m34553h0(i10).m34534O(c12318m).m34543X(str2).m34547b0(m34632h).m34526G();
    }

    /* renamed from: i */
    public static int m36477i(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    /* renamed from: j */
    public static int m36478j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                return 40 << ((bArr[(b10 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}

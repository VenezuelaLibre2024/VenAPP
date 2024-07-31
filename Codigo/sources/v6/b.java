package v6;

import com.facebook.ads.AdError;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import t6.u1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f27945a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f27946b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f27947c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f27948d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f27949e = {32, 40, 48, 56, 64, 80, 96, 112, RecognitionOptions.ITF, 160, 192, 224, RecognitionOptions.QR_CODE, 320, 384, 448, RecognitionOptions.UPC_A, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f27950f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: v6.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0458b {

        /* renamed from: a, reason: collision with root package name */
        public final String f27951a;

        /* renamed from: b, reason: collision with root package name */
        public final int f27952b;

        /* renamed from: c, reason: collision with root package name */
        public final int f27953c;

        /* renamed from: d, reason: collision with root package name */
        public final int f27954d;

        /* renamed from: e, reason: collision with root package name */
        public final int f27955e;

        /* renamed from: f, reason: collision with root package name */
        public final int f27956f;

        /* renamed from: g, reason: collision with root package name */
        public final int f27957g;

        private C0458b(String str, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f27951a = str;
            this.f27952b = i10;
            this.f27954d = i11;
            this.f27953c = i12;
            this.f27955e = i13;
            this.f27956f = i14;
            this.f27957g = i15;
        }
    }

    private static int a(int i10, int i11, int i12) {
        return (i10 * i11) / (i12 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i10 = position; i10 <= limit; i10++) {
            if ((t8.r0.I(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - position;
            }
        }
        return -1;
    }

    private static int c(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f27946b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f27950f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f27949e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static u1 d(t8.e0 e0Var, String str, String str2, x6.m mVar) {
        t8.d0 d0Var = new t8.d0();
        d0Var.m(e0Var);
        int i10 = f27946b[d0Var.h(2)];
        d0Var.r(8);
        int i11 = f27948d[d0Var.h(3)];
        if (d0Var.h(1) != 0) {
            i11++;
        }
        int i12 = f27949e[d0Var.h(5)] * AdError.NETWORK_ERROR_CODE;
        d0Var.c();
        e0Var.U(d0Var.d());
        return new u1.b().U(str).g0("audio/ac3").J(i11).h0(i10).O(mVar).X(str2).I(i12).b0(i12).G();
    }

    public static int e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f27945a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * RecognitionOptions.QR_CODE;
        }
        return 1536;
    }

    public static C0458b f(t8.d0 d0Var) {
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
        int e10 = d0Var.e();
        d0Var.r(40);
        boolean z10 = d0Var.h(5) > 10;
        d0Var.p(e10);
        int i22 = -1;
        if (z10) {
            d0Var.r(16);
            int h10 = d0Var.h(2);
            if (h10 == 0) {
                i22 = 0;
            } else if (h10 == 1) {
                i22 = 1;
            } else if (h10 == 2) {
                i22 = 2;
            }
            d0Var.r(3);
            int h11 = (d0Var.h(11) + 1) * 2;
            int h12 = d0Var.h(2);
            if (h12 == 3) {
                i17 = f27947c[d0Var.h(2)];
                i16 = 3;
                i18 = 6;
            } else {
                int h13 = d0Var.h(2);
                int i23 = f27945a[h13];
                i16 = h13;
                i17 = f27946b[h12];
                i18 = i23;
            }
            int i24 = i18 * RecognitionOptions.QR_CODE;
            int a10 = a(h11, i17, i18);
            int h14 = d0Var.h(3);
            boolean g10 = d0Var.g();
            i10 = f27948d[h14] + (g10 ? 1 : 0);
            d0Var.r(10);
            if (d0Var.g()) {
                d0Var.r(8);
            }
            if (h14 == 0) {
                d0Var.r(5);
                if (d0Var.g()) {
                    d0Var.r(8);
                }
            }
            if (i22 == 1 && d0Var.g()) {
                d0Var.r(16);
            }
            if (d0Var.g()) {
                if (h14 > 2) {
                    d0Var.r(2);
                }
                if ((h14 & 1) == 0 || h14 <= 2) {
                    i20 = 6;
                } else {
                    i20 = 6;
                    d0Var.r(6);
                }
                if ((h14 & 4) != 0) {
                    d0Var.r(i20);
                }
                if (g10 && d0Var.g()) {
                    d0Var.r(5);
                }
                if (i22 == 0) {
                    if (d0Var.g()) {
                        i21 = 6;
                        d0Var.r(6);
                    } else {
                        i21 = 6;
                    }
                    if (h14 == 0 && d0Var.g()) {
                        d0Var.r(i21);
                    }
                    if (d0Var.g()) {
                        d0Var.r(i21);
                    }
                    int h15 = d0Var.h(2);
                    if (h15 == 1) {
                        d0Var.r(5);
                    } else if (h15 == 2) {
                        d0Var.r(12);
                    } else if (h15 == 3) {
                        int h16 = d0Var.h(5);
                        if (d0Var.g()) {
                            d0Var.r(5);
                            if (d0Var.g()) {
                                d0Var.r(4);
                            }
                            if (d0Var.g()) {
                                d0Var.r(4);
                            }
                            if (d0Var.g()) {
                                d0Var.r(4);
                            }
                            if (d0Var.g()) {
                                d0Var.r(4);
                            }
                            if (d0Var.g()) {
                                d0Var.r(4);
                            }
                            if (d0Var.g()) {
                                d0Var.r(4);
                            }
                            if (d0Var.g()) {
                                d0Var.r(4);
                            }
                            if (d0Var.g()) {
                                if (d0Var.g()) {
                                    d0Var.r(4);
                                }
                                if (d0Var.g()) {
                                    d0Var.r(4);
                                }
                            }
                        }
                        if (d0Var.g()) {
                            d0Var.r(5);
                            if (d0Var.g()) {
                                d0Var.r(7);
                                if (d0Var.g()) {
                                    d0Var.r(8);
                                }
                            }
                        }
                        d0Var.r((h16 + 2) * 8);
                        d0Var.c();
                    }
                    if (h14 < 2) {
                        if (d0Var.g()) {
                            d0Var.r(14);
                        }
                        if (h14 == 0 && d0Var.g()) {
                            d0Var.r(14);
                        }
                    }
                    if (d0Var.g()) {
                        if (i16 == 0) {
                            d0Var.r(5);
                        } else {
                            for (int i25 = 0; i25 < i18; i25++) {
                                if (d0Var.g()) {
                                    d0Var.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (d0Var.g()) {
                d0Var.r(5);
                if (h14 == 2) {
                    d0Var.r(4);
                }
                if (h14 >= 6) {
                    d0Var.r(2);
                }
                if (d0Var.g()) {
                    d0Var.r(8);
                }
                if (h14 == 0 && d0Var.g()) {
                    d0Var.r(8);
                }
                if (h12 < 3) {
                    d0Var.q();
                }
            }
            if (i22 == 0 && i16 != 3) {
                d0Var.q();
            }
            if (i22 == 2 && (i16 == 3 || d0Var.g())) {
                i19 = 6;
                d0Var.r(6);
            } else {
                i19 = 6;
            }
            str = (d0Var.g() && d0Var.h(i19) == 1 && d0Var.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i11 = i22;
            i12 = i24;
            i14 = h11;
            i15 = i17;
            i13 = a10;
        } else {
            d0Var.r(32);
            int h17 = d0Var.h(2);
            String str2 = h17 == 3 ? null : "audio/ac3";
            int h18 = d0Var.h(6);
            int i26 = f27949e[h18 / 2] * AdError.NETWORK_ERROR_CODE;
            int c10 = c(h17, h18);
            d0Var.r(8);
            int h19 = d0Var.h(3);
            if ((h19 & 1) != 0 && h19 != 1) {
                d0Var.r(2);
            }
            if ((h19 & 4) != 0) {
                d0Var.r(2);
            }
            if (h19 == 2) {
                d0Var.r(2);
            }
            int[] iArr = f27946b;
            int i27 = h17 < iArr.length ? iArr[h17] : -1;
            i10 = f27948d[h19] + (d0Var.g() ? 1 : 0);
            i11 = -1;
            str = str2;
            i12 = 1536;
            i13 = i26;
            i14 = c10;
            i15 = i27;
        }
        return new C0458b(str, i11, i10, i15, i14, i12, i13);
    }

    public static int g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return c((b10 & 192) >> 6, b10 & 63);
    }

    public static u1 h(t8.e0 e0Var, String str, String str2, x6.m mVar) {
        String str3;
        t8.d0 d0Var = new t8.d0();
        d0Var.m(e0Var);
        int h10 = d0Var.h(13) * AdError.NETWORK_ERROR_CODE;
        d0Var.r(3);
        int i10 = f27946b[d0Var.h(2)];
        d0Var.r(10);
        int i11 = f27948d[d0Var.h(3)];
        if (d0Var.h(1) != 0) {
            i11++;
        }
        d0Var.r(3);
        int h11 = d0Var.h(4);
        d0Var.r(1);
        if (h11 > 0) {
            d0Var.s(6);
            if (d0Var.h(1) != 0) {
                i11 += 2;
            }
            d0Var.r(1);
        }
        if (d0Var.b() > 7) {
            d0Var.r(7);
            if (d0Var.h(1) != 0) {
                str3 = "audio/eac3-joc";
                d0Var.c();
                e0Var.U(d0Var.d());
                return new u1.b().U(str).g0(str3).J(i11).h0(i10).O(mVar).X(str2).b0(h10).G();
            }
        }
        str3 = "audio/eac3";
        d0Var.c();
        e0Var.U(d0Var.d());
        return new u1.b().U(str).g0(str3).J(i11).h0(i10).O(mVar).X(str2).b0(h10).G();
    }

    public static int i(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                return 40 << ((bArr[(b10 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}

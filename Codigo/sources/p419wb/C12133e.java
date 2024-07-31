package p419wb;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: wb.e */
/* loaded from: classes2.dex */
public final class C12133e {

    /* renamed from: a */
    private static final Charset f32243a = Charset.forName("UTF-8");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wb.e$a */
    /* loaded from: classes2.dex */
    public static abstract class a {

        /* renamed from: a */
        public byte[] f32244a;

        /* renamed from: b */
        public int f32245b;

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wb.e$b */
    /* loaded from: classes2.dex */
    public static class b extends a {

        /* renamed from: f */
        private static final int[] f32246f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: g */
        private static final int[] f32247g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: c */
        private int f32248c;

        /* renamed from: d */
        private int f32249d;

        /* renamed from: e */
        private final int[] f32250e;

        public b(int i10, byte[] bArr) {
            this.f32244a = bArr;
            this.f32250e = (i10 & 8) == 0 ? f32246f : f32247g;
            this.f32248c = 0;
            this.f32249d = 0;
        }

        /* renamed from: a */
        public boolean m38879a(byte[] bArr, int i10, int i11, boolean z10) {
            int i12 = this.f32248c;
            if (i12 == 6) {
                return false;
            }
            int i13 = i11 + i10;
            int i14 = this.f32249d;
            byte[] bArr2 = this.f32244a;
            int[] iArr = this.f32250e;
            int i15 = 0;
            int i16 = i14;
            int i17 = i12;
            int i18 = i10;
            while (i18 < i13) {
                if (i17 == 0) {
                    while (true) {
                        int i19 = i18 + 4;
                        if (i19 > i13 || (i16 = (iArr[bArr[i18] & 255] << 18) | (iArr[bArr[i18 + 1] & 255] << 12) | (iArr[bArr[i18 + 2] & 255] << 6) | iArr[bArr[i18 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i15 + 2] = (byte) i16;
                        bArr2[i15 + 1] = (byte) (i16 >> 8);
                        bArr2[i15] = (byte) (i16 >> 16);
                        i15 += 3;
                        i18 = i19;
                    }
                    if (i18 >= i13) {
                        break;
                    }
                }
                int i20 = i18 + 1;
                int i21 = iArr[bArr[i18] & 255];
                if (i17 != 0) {
                    if (i17 == 1) {
                        if (i21 < 0) {
                            if (i21 != -1) {
                                this.f32248c = 6;
                                return false;
                            }
                        }
                        i21 |= i16 << 6;
                    } else if (i17 == 2) {
                        if (i21 < 0) {
                            if (i21 == -2) {
                                bArr2[i15] = (byte) (i16 >> 4);
                                i15++;
                                i17 = 4;
                            } else if (i21 != -1) {
                                this.f32248c = 6;
                                return false;
                            }
                        }
                        i21 |= i16 << 6;
                    } else if (i17 != 3) {
                        if (i17 != 4) {
                            if (i17 == 5 && i21 != -1) {
                                this.f32248c = 6;
                                return false;
                            }
                        } else if (i21 == -2) {
                            i17++;
                        } else if (i21 != -1) {
                            this.f32248c = 6;
                            return false;
                        }
                    } else if (i21 >= 0) {
                        int i22 = i21 | (i16 << 6);
                        bArr2[i15 + 2] = (byte) i22;
                        bArr2[i15 + 1] = (byte) (i22 >> 8);
                        bArr2[i15] = (byte) (i22 >> 16);
                        i15 += 3;
                        i16 = i22;
                        i17 = 0;
                    } else if (i21 == -2) {
                        bArr2[i15 + 1] = (byte) (i16 >> 2);
                        bArr2[i15] = (byte) (i16 >> 10);
                        i15 += 2;
                        i17 = 5;
                    } else if (i21 != -1) {
                        this.f32248c = 6;
                        return false;
                    }
                    i17++;
                    i16 = i21;
                } else {
                    if (i21 < 0) {
                        if (i21 != -1) {
                            this.f32248c = 6;
                            return false;
                        }
                    }
                    i17++;
                    i16 = i21;
                }
                i18 = i20;
            }
            if (!z10) {
                this.f32248c = i17;
                this.f32249d = i16;
            } else {
                if (i17 == 1) {
                    this.f32248c = 6;
                    return false;
                }
                if (i17 == 2) {
                    bArr2[i15] = (byte) (i16 >> 4);
                    i15++;
                } else if (i17 == 3) {
                    int i23 = i15 + 1;
                    bArr2[i15] = (byte) (i16 >> 10);
                    i15 = i23 + 1;
                    bArr2[i23] = (byte) (i16 >> 2);
                } else if (i17 == 4) {
                    this.f32248c = 6;
                    return false;
                }
                this.f32248c = i17;
            }
            this.f32245b = i15;
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wb.e$c */
    /* loaded from: classes2.dex */
    public static class c extends a {

        /* renamed from: j */
        private static final byte[] f32251j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: k */
        private static final byte[] f32252k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: c */
        private final byte[] f32253c;

        /* renamed from: d */
        int f32254d;

        /* renamed from: e */
        private int f32255e;

        /* renamed from: f */
        public final boolean f32256f;

        /* renamed from: g */
        public final boolean f32257g;

        /* renamed from: h */
        public final boolean f32258h;

        /* renamed from: i */
        private final byte[] f32259i;

        public c(int i10, byte[] bArr) {
            this.f32244a = bArr;
            this.f32256f = (i10 & 1) == 0;
            boolean z10 = (i10 & 2) == 0;
            this.f32257g = z10;
            this.f32258h = (i10 & 4) != 0;
            this.f32259i = (i10 & 8) == 0 ? f32251j : f32252k;
            this.f32253c = new byte[2];
            this.f32254d = 0;
            this.f32255e = z10 ? 19 : -1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00e6 A[SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m38880a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 478
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p419wb.C12133e.c.m38880a(byte[], int, int, boolean):boolean");
        }
    }

    /* renamed from: a */
    public static byte[] m38872a(String str, int i10) {
        return m38873b(str.getBytes(f32243a), i10);
    }

    /* renamed from: b */
    public static byte[] m38873b(byte[] bArr, int i10) {
        return m38874c(bArr, 0, bArr.length, i10);
    }

    /* renamed from: c */
    public static byte[] m38874c(byte[] bArr, int i10, int i11, int i12) {
        b bVar = new b(i12, new byte[(i11 * 3) / 4]);
        if (!bVar.m38879a(bArr, i10, i11, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i13 = bVar.f32245b;
        byte[] bArr2 = bVar.f32244a;
        if (i13 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i13];
        System.arraycopy(bArr2, 0, bArr3, 0, i13);
        return bArr3;
    }

    /* renamed from: d */
    public static String m38875d(byte[] bArr) {
        return m38878g(bArr, 2);
    }

    /* renamed from: e */
    public static byte[] m38876e(byte[] bArr, int i10) {
        return m38877f(bArr, 0, bArr.length, i10);
    }

    /* renamed from: f */
    public static byte[] m38877f(byte[] bArr, int i10, int i11, int i12) {
        c cVar = new c(i12, null);
        int i13 = (i11 / 3) * 4;
        if (!cVar.f32256f) {
            int i14 = i11 % 3;
            if (i14 == 1) {
                i13 += 2;
            } else if (i14 == 2) {
                i13 += 3;
            }
        } else if (i11 % 3 > 0) {
            i13 += 4;
        }
        if (cVar.f32257g && i11 > 0) {
            i13 += (((i11 - 1) / 57) + 1) * (cVar.f32258h ? 2 : 1);
        }
        cVar.f32244a = new byte[i13];
        cVar.m38880a(bArr, i10, i11, true);
        return cVar.f32244a;
    }

    /* renamed from: g */
    public static String m38878g(byte[] bArr, int i10) {
        try {
            return new String(m38876e(bArr, i10), "US-ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }
}

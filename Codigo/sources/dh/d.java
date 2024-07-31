package dh;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Collection;
import java.util.Map;
import kg.p;

/* loaded from: classes2.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f14163a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f14164a;

        static {
            int[] iArr = new int[h.values().length];
            f14164a = iArr;
            try {
                iArr[h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14164a[h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14164a[h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14164a[h.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14164a[h.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14164a[h.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14164a[h.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14164a[h.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14164a[h.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14164a[h.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0040. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0129 A[LOOP:0: B:2:0x0022->B:23:0x0129, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ed A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static kg.e a(byte[] r22, dh.j r23, dh.f r24, java.util.Map<dg.e, ?> r25) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dh.d.a(byte[], dh.j, dh.f, java.util.Map):kg.e");
    }

    private static void b(kg.c cVar, StringBuilder sb2, int i10, boolean z10) {
        while (i10 > 1) {
            if (cVar.a() < 11) {
                throw dg.h.a();
            }
            int d10 = cVar.d(11);
            sb2.append(h(d10 / 45));
            sb2.append(h(d10 % 45));
            i10 -= 2;
        }
        if (i10 == 1) {
            if (cVar.a() < 6) {
                throw dg.h.a();
            }
            sb2.append(h(cVar.d(6)));
        }
        if (z10) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i11 = length + 1;
                        if (sb2.charAt(i11) == '%') {
                            sb2.deleteCharAt(i11);
                        }
                    }
                    sb2.setCharAt(length, (char) 29);
                }
            }
        }
    }

    private static void c(kg.c cVar, StringBuilder sb2, int i10, kg.d dVar, Collection<byte[]> collection, Map<dg.e, ?> map) {
        if (i10 * 8 > cVar.a()) {
            throw dg.h.a();
        }
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) cVar.d(8);
        }
        sb2.append(new String(bArr, dVar == null ? p.a(bArr, map) : dVar.l()));
        collection.add(bArr);
    }

    private static void d(kg.c cVar, StringBuilder sb2, int i10) {
        if (i10 * 13 > cVar.a()) {
            throw dg.h.a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int d10 = cVar.d(13);
            int i12 = (d10 % 96) | ((d10 / 96) << 8);
            int i13 = i12 + (i12 < 2560 ? 41377 : 42657);
            bArr[i11] = (byte) ((i13 >> 8) & 255);
            bArr[i11 + 1] = (byte) (i13 & 255);
            i11 += 2;
            i10--;
        }
        sb2.append(new String(bArr, p.f20709c));
    }

    private static void e(kg.c cVar, StringBuilder sb2, int i10) {
        if (i10 * 13 > cVar.a()) {
            throw dg.h.a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int d10 = cVar.d(13);
            int i12 = (d10 % 192) | ((d10 / 192) << 8);
            int i13 = i12 + (i12 < 7936 ? 33088 : 49472);
            bArr[i11] = (byte) (i13 >> 8);
            bArr[i11 + 1] = (byte) i13;
            i11 += 2;
            i10--;
        }
        sb2.append(new String(bArr, p.f20708b));
    }

    private static void f(kg.c cVar, StringBuilder sb2, int i10) {
        int d10;
        while (i10 >= 3) {
            if (cVar.a() < 10) {
                throw dg.h.a();
            }
            int d11 = cVar.d(10);
            if (d11 >= 1000) {
                throw dg.h.a();
            }
            sb2.append(h(d11 / 100));
            sb2.append(h((d11 / 10) % 10));
            sb2.append(h(d11 % 10));
            i10 -= 3;
        }
        if (i10 == 2) {
            if (cVar.a() < 7) {
                throw dg.h.a();
            }
            int d12 = cVar.d(7);
            if (d12 >= 100) {
                throw dg.h.a();
            }
            sb2.append(h(d12 / 10));
            d10 = d12 % 10;
        } else {
            if (i10 != 1) {
                return;
            }
            if (cVar.a() < 4) {
                throw dg.h.a();
            }
            d10 = cVar.d(4);
            if (d10 >= 10) {
                throw dg.h.a();
            }
        }
        sb2.append(h(d10));
    }

    private static int g(kg.c cVar) {
        int d10 = cVar.d(8);
        if ((d10 & RecognitionOptions.ITF) == 0) {
            return d10 & 127;
        }
        if ((d10 & 192) == 128) {
            return cVar.d(8) | ((d10 & 63) << 8);
        }
        if ((d10 & 224) == 192) {
            return cVar.d(16) | ((d10 & 31) << 16);
        }
        throw dg.h.a();
    }

    private static char h(int i10) {
        char[] cArr = f14163a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw dg.h.a();
    }
}

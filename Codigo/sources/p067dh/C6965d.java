package p067dh;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Collection;
import java.util.Map;
import kg.C9265c;
import kg.C9278p;
import kg.EnumC9266d;
import p066dg.C6947h;
import p066dg.EnumC6944e;

/* renamed from: dh.d */
/* loaded from: classes2.dex */
final class C6965d {

    /* renamed from: a */
    private static final char[] f15517a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* renamed from: dh.d$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15518a;

        static {
            int[] iArr = new int[EnumC6969h.values().length];
            f15518a = iArr;
            try {
                iArr[EnumC6969h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15518a[EnumC6969h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15518a[EnumC6969h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15518a[EnumC6969h.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15518a[EnumC6969h.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15518a[EnumC6969h.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15518a[EnumC6969h.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15518a[EnumC6969h.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15518a[EnumC6969h.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15518a[EnumC6969h.HANZI.ordinal()] = 10;
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
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static kg.C9267e m20134a(byte[] r22, p067dh.C6971j r23, p067dh.EnumC6967f r24, java.util.Map<p066dg.EnumC6944e, ?> r25) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p067dh.C6965d.m20134a(byte[], dh.j, dh.f, java.util.Map):kg.e");
    }

    /* renamed from: b */
    private static void m20135b(C9265c c9265c, StringBuilder sb2, int i10, boolean z10) {
        while (i10 > 1) {
            if (c9265c.m27616a() < 11) {
                throw C6947h.m20094a();
            }
            int m27619d = c9265c.m27619d(11);
            sb2.append(m20141h(m27619d / 45));
            sb2.append(m20141h(m27619d % 45));
            i10 -= 2;
        }
        if (i10 == 1) {
            if (c9265c.m27616a() < 6) {
                throw C6947h.m20094a();
            }
            sb2.append(m20141h(c9265c.m27619d(6)));
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

    /* renamed from: c */
    private static void m20136c(C9265c c9265c, StringBuilder sb2, int i10, EnumC9266d enumC9266d, Collection<byte[]> collection, Map<EnumC6944e, ?> map) {
        if (i10 * 8 > c9265c.m27616a()) {
            throw C6947h.m20094a();
        }
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) c9265c.m27619d(8);
        }
        sb2.append(new String(bArr, enumC9266d == null ? C9278p.m27684a(bArr, map) : enumC9266d.m27623l()));
        collection.add(bArr);
    }

    /* renamed from: d */
    private static void m20137d(C9265c c9265c, StringBuilder sb2, int i10) {
        if (i10 * 13 > c9265c.m27616a()) {
            throw C6947h.m20094a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int m27619d = c9265c.m27619d(13);
            int i12 = (m27619d % 96) | ((m27619d / 96) << 8);
            int i13 = i12 + (i12 < 2560 ? 41377 : 42657);
            bArr[i11] = (byte) ((i13 >> 8) & 255);
            bArr[i11 + 1] = (byte) (i13 & 255);
            i11 += 2;
            i10--;
        }
        sb2.append(new String(bArr, C9278p.f22531c));
    }

    /* renamed from: e */
    private static void m20138e(C9265c c9265c, StringBuilder sb2, int i10) {
        if (i10 * 13 > c9265c.m27616a()) {
            throw C6947h.m20094a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int m27619d = c9265c.m27619d(13);
            int i12 = (m27619d % 192) | ((m27619d / 192) << 8);
            int i13 = i12 + (i12 < 7936 ? 33088 : 49472);
            bArr[i11] = (byte) (i13 >> 8);
            bArr[i11 + 1] = (byte) i13;
            i11 += 2;
            i10--;
        }
        sb2.append(new String(bArr, C9278p.f22530b));
    }

    /* renamed from: f */
    private static void m20139f(C9265c c9265c, StringBuilder sb2, int i10) {
        int m27619d;
        while (i10 >= 3) {
            if (c9265c.m27616a() < 10) {
                throw C6947h.m20094a();
            }
            int m27619d2 = c9265c.m27619d(10);
            if (m27619d2 >= 1000) {
                throw C6947h.m20094a();
            }
            sb2.append(m20141h(m27619d2 / 100));
            sb2.append(m20141h((m27619d2 / 10) % 10));
            sb2.append(m20141h(m27619d2 % 10));
            i10 -= 3;
        }
        if (i10 == 2) {
            if (c9265c.m27616a() < 7) {
                throw C6947h.m20094a();
            }
            int m27619d3 = c9265c.m27619d(7);
            if (m27619d3 >= 100) {
                throw C6947h.m20094a();
            }
            sb2.append(m20141h(m27619d3 / 10));
            m27619d = m27619d3 % 10;
        } else {
            if (i10 != 1) {
                return;
            }
            if (c9265c.m27616a() < 4) {
                throw C6947h.m20094a();
            }
            m27619d = c9265c.m27619d(4);
            if (m27619d >= 10) {
                throw C6947h.m20094a();
            }
        }
        sb2.append(m20141h(m27619d));
    }

    /* renamed from: g */
    private static int m20140g(C9265c c9265c) {
        int m27619d = c9265c.m27619d(8);
        if ((m27619d & RecognitionOptions.ITF) == 0) {
            return m27619d & 127;
        }
        if ((m27619d & 192) == 128) {
            return c9265c.m27619d(8) | ((m27619d & 63) << 8);
        }
        if ((m27619d & 224) == 192) {
            return c9265c.m27619d(16) | ((m27619d & 31) << 16);
        }
        throw C6947h.m20094a();
    }

    /* renamed from: h */
    private static char m20141h(int i10) {
        char[] cArr = f15517a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw C6947h.m20094a();
    }
}

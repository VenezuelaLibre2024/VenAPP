package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A05' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.facebook.ads.redexgen.X.1d */
/* loaded from: assets/audience_network.dex */
public final class EnumC23361d {
    public static byte[] A01;
    public static final /* synthetic */ EnumC23361d[] A02;
    public static final EnumC23361d A03;
    public static final EnumC23361d A04;
    public static final EnumC23361d A05;
    public final String A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{24, 23, 18, 27, 1, 14, 12, 27, 29, 31, 29, 22, 27, 3, 1, 28, 11, 10, 12, 3, 1, 22, 16, 18, 16, 27, 22, 119, 101, 98, 118, 105, 101, 119, Byte.MAX_VALUE, 112, 114, 101, 99, 97, 99, 104, 101};
    }

    static {
        A02();
        String A012 = A01(27, 16, 0);
        EnumC23361d enumC23361d = new EnumC23361d(A012, 0, A012);
        A05 = enumC23361d;
        String A013 = A01(13, 14, 115);
        EnumC23361d enumC23361d2 = new EnumC23361d(A013, 1, A013);
        A04 = enumC23361d2;
        String A014 = A01(0, 13, 126);
        EnumC23361d enumC23361d3 = new EnumC23361d(A014, 2, A014);
        A03 = enumC23361d3;
        A02 = new EnumC23361d[]{enumC23361d, enumC23361d2, enumC23361d3};
    }

    public EnumC23361d(String str, int i10, String str2) {
        this.A00 = str2;
    }

    public static EnumC23361d A00(String str) {
        for (EnumC23361d enumC23361d : values()) {
            if (enumC23361d.A00.equalsIgnoreCase(str)) {
                return enumC23361d;
            }
        }
        return A03;
    }

    public static EnumC23361d valueOf(String str) {
        return (EnumC23361d) Enum.valueOf(EnumC23361d.class, str);
    }

    public static EnumC23361d[] values() {
        return (EnumC23361d[]) A02.clone();
    }
}

package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A03' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.facebook.ads.redexgen.X.Rh */
/* loaded from: assets/audience_network.dex */
public abstract class EnumC3901Rh {
    public static byte[] A00;
    public static String[] A01 = {"nA8fLeyOwVmNwvq6aIqKxCaagHA5eYr", "8Z3ODqLNUnEAqB2P3Amw9Ur1PSsugik5", "YRmdf", "zIg3Ob9eurpeZ06C2uEHUxbrUPW1iO5", "DwODnBhAs5I9lGAPLwBjllp42Gjp41Mv", "6IL6kP5nz", "IHg6IZuYXxuMxytmBHiV", "YXmTZGEBqQ8NuPQvZDB03"};
    public static final /* synthetic */ EnumC3901Rh[] A02;
    public static final EnumC3901Rh A03;
    public static final EnumC3901Rh A04;
    public static final EnumC3901Rh A05;
    public static final EnumC3901Rh A06;
    public static final EnumC3901Rh A07;
    public static final EnumC3901Rh A08;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 4);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-82, -33, -33, -50, -26, 110, -101, -101, -104, -111, -115, -102, -103, -60, -54, -73, -63, -70, Byte.MAX_VALUE, -92, -86, 101, 120, Byte.MIN_VALUE, 123, 121, -118, 123, -100, -102, -111, -106, -113, -99, -74, -77, -74, -73, -65, -74, 104, -68, -63, -72, -83, 104, -73, -82, 104, -78, -69, -73, -74, 104, -73, -86, -78, -83, -85, -68, 104, -77, -83, -63};
    }

    public abstract boolean A04(JSONArray jSONArray, int i10);

    public abstract boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i10);

    public abstract boolean A06(JSONObject jSONObject, String str);

    public abstract boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str);

    static {
        A03();
        final String A022 = A02(0, 5, 105);
        final int i10 = 0;
        EnumC3901Rh enumC3901Rh = new EnumC3901Rh(A022, i10) { // from class: com.facebook.ads.redexgen.X.J6
            @Override // com.facebook.ads.redexgen.uinode.EnumC3901Rh
            public final boolean A04(JSONArray jSONArray, int i11) {
                return jSONArray.optJSONArray(i11) != null;
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC3901Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i11) {
                return AbstractC3902Ri.A01(jSONArray.optJSONArray(i11), jSONArray2.optJSONArray(i11));
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC3901Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optJSONArray(str) != null;
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC3901Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return AbstractC3902Ri.A01(jSONObject.optJSONArray(str), jSONObject2.optJSONArray(str));
            }
        };
        A03 = enumC3901Rh;
        final String A023 = A02(5, 7, 40);
        final int i11 = 1;
        EnumC3901Rh enumC3901Rh2 = new EnumC3901Rh(A023, i11) { // from class: com.facebook.ads.redexgen.X.In
            @Override // com.facebook.ads.redexgen.uinode.EnumC3901Rh
            public final boolean A04(JSONArray jSONArray, int i12) {
                return jSONArray.optBoolean(i12, true) == jSONArray.optBoolean(i12, false);
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC3901Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i12) {
                return jSONArray.optBoolean(i12) == jSONArray2.optBoolean(i12);
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC3901Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optBoolean(str, true) == jSONObject.optBoolean(str, false);
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC3901Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optBoolean(str) == jSONObject2.optBoolean(str);
            }
        };
        A04 = enumC3901Rh2;
        final String A024 = A02(12, 6, 81);
        final int i12 = 2;
        EnumC3901Rh enumC3901Rh3 = new EnumC3901Rh(A024, i12) { // from class: com.facebook.ads.redexgen.X.ID
            @Override // com.facebook.ads.redexgen.uinode.EnumC3901Rh
            public final boolean A04(JSONArray jSONArray, int i13) {
                return jSONArray.optInt(i13, 0) == jSONArray.optInt(i13, 1) && jSONArray.optDouble(i13, 0.0d) == jSONArray.optDouble(i13, 1.0d) && ((double) jSONArray.optInt(i13, 0)) != jSONArray.optDouble(i13, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC3901Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i13) {
                return jSONArray.optDouble(i13) == jSONArray2.optDouble(i13);
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC3901Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, 0.0d) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) != jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC3901Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optDouble(str) == jSONObject2.optDouble(str);
            }
        };
        A05 = enumC3901Rh3;
        final String A025 = A02(18, 3, 50);
        final int i13 = 3;
        EnumC3901Rh enumC3901Rh4 = new EnumC3901Rh(A025, i13) { // from class: com.facebook.ads.redexgen.X.I5
            @Override // com.facebook.ads.redexgen.uinode.EnumC3901Rh
            public final boolean A04(JSONArray jSONArray, int i14) {
                return jSONArray.optInt(i14, 0) == jSONArray.optInt(i14, 1) && jSONArray.optDouble(i14, 0.0d) == jSONArray.optDouble(i14, 1.0d) && ((double) jSONArray.optInt(i14, 0)) == jSONArray.optDouble(i14, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC3901Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i14) {
                return jSONArray.optInt(i14) == jSONArray2.optInt(i14);
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC3901Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, 0.0d) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) == jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC3901Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optInt(str) == jSONObject2.optInt(str);
            }
        };
        A06 = enumC3901Rh4;
        final String A026 = A02(21, 6, 18);
        final int i14 = 4;
        EnumC3901Rh enumC3901Rh5 = new EnumC3901Rh(A026, i14) { // from class: com.facebook.ads.redexgen.X.I4
            @Override // com.facebook.ads.redexgen.uinode.EnumC3901Rh
            public final boolean A04(JSONArray jSONArray, int i15) {
                return jSONArray.optJSONObject(i15) != null;
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC3901Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i15) {
                return AbstractC3902Ri.A02(jSONArray.optJSONObject(i15), jSONArray2.optJSONObject(i15));
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC3901Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optJSONObject(str) != null;
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC3901Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return AbstractC3902Ri.A02(jSONObject.optJSONObject(str), jSONObject2.optJSONObject(str));
            }
        };
        A07 = enumC3901Rh5;
        final String A027 = A02(27, 6, 36);
        final int i15 = 5;
        EnumC3901Rh enumC3901Rh6 = new EnumC3901Rh(A027, i15) { // from class: com.facebook.ads.redexgen.X.Hx
            @Override // com.facebook.ads.redexgen.uinode.EnumC3901Rh
            public final boolean A04(JSONArray jSONArray, int i16) {
                return jSONArray.optString(i16) != null;
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC3901Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i16) {
                return jSONArray.optString(i16).equals(jSONArray2.optString(i16));
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC3901Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optString(str) != null;
            }

            @Override // com.facebook.ads.redexgen.uinode.EnumC3901Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optString(str).equals(jSONObject2.optString(str));
            }
        };
        A08 = enumC3901Rh6;
        A02 = new EnumC3901Rh[]{enumC3901Rh, enumC3901Rh2, enumC3901Rh3, enumC3901Rh4, enumC3901Rh5, enumC3901Rh6};
    }

    public EnumC3901Rh(String str, int i10) {
    }

    public static EnumC3901Rh A00(JSONArray jSONArray, int i10) {
        for (EnumC3901Rh type : values()) {
            if (A01[1].charAt(14) != '2') {
                throw new RuntimeException();
            }
            A01[4] = "PUsgFaltT51mxPXWqnHKjq6lqfkoVDea";
            if (type.A04(jSONArray, i10)) {
                return type;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static EnumC3901Rh A01(JSONObject jSONObject, String str) {
        for (EnumC3901Rh enumC3901Rh : values()) {
            boolean A062 = enumC3901Rh.A06(jSONObject, str);
            if (A01[5].length() != 9) {
                throw new RuntimeException();
            }
            A01[6] = "GmRRmI3tzaTgoS0GQtjO0";
            if (A062) {
                return enumC3901Rh;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static EnumC3901Rh valueOf(String str) {
        return (EnumC3901Rh) Enum.valueOf(EnumC3901Rh.class, str);
    }

    public static EnumC3901Rh[] values() {
        return (EnumC3901Rh[]) A02.clone();
    }
}

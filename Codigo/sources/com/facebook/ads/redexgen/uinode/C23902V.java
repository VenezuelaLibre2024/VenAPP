package com.facebook.ads.redexgen.uinode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.facebook.ads.redexgen.X.2V */
/* loaded from: assets/audience_network.dex */
public final class C23902V {
    public static byte[] A03;
    public static String[] A04 = {"WaajtisyqSdmr5n0MmqvTq", "fdIaRasDBQ3mzQVC7YD5nGkHzZAmQvnJ", "WAxtNKI8ST0O8UsrAPtnvhIOfFZAxPRo", "iXpFblfpqQgQYwoemHyqPvk55iTf4XTw", "RtKJcmIp3WHhRmLDIsvrFFxbXoefOAJz", "sGysMZG", "ia7vWYD1O3n4XjJSJMs69oivtzC", "7HN0WjvVbr0DvNKb02v1a"};
    public C3377JA A00;
    public final List<String> A02 = new ArrayList();
    public final List<String> A01 = new ArrayList();

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{106, 120, 66, 73, 67, 29, 17, 30, 17, 23, 21, 47, 17, 20, 47, 0, 2, 21, 22, 21, 2, 21, 30, 19, 21, 3, 60, 35, 39, 58, 60, 61, 32, 12, 32, 54, 63, 54, 48, 39, 54, 55, 52, 51, 38, 53, 51, 100, 98, 116, 99, 78, 123, 126, 100, 99, Byte.MAX_VALUE, 116, 104, 70, 89, 72, 110, 80, 92, 110, 88, 110, 66, 84, 84, 88, 95, 86, 110, 69, 89, 88, 66};
    }

    static {
        A01();
    }

    public C23902V() {
    }

    public C23902V(C3377JA c3377ja) {
        this.A00 = c3377ja;
    }

    public final Map<String, String> A02() {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(47, 12, 86), new JSONArray((Collection) this.A02).toString());
        hashMap.put(A00(26, 16, 20), new JSONArray((Collection) this.A01).toString());
        return hashMap;
    }

    public final void A03() {
        this.A02.clear();
        this.A01.clear();
    }

    public final void A04() {
        this.A02.add(A00(5, 21, 55));
        C3377JA c3377ja = this.A00;
        if (c3377ja != null) {
            c3377ja.A04(EnumC3376J9.A0B, null);
        }
    }

    public final void A05() {
        this.A02.add(A00(42, 5, 0));
    }

    public final void A06() {
        this.A02.add(A00(59, 20, 118));
        C3377JA c3377ja = this.A00;
        if (c3377ja != null) {
            c3377ja.A04(EnumC3376J9.A0C, null);
        }
    }

    public final void A07(int i10) {
        this.A01.add(String.valueOf(i10));
    }

    public final void A08(EnumC23892U enumC23892U) {
        this.A02.add(enumC23892U.A02() + A00(1, 4, 96));
        C3377JA c3377ja = this.A00;
        if (c3377ja != null) {
            c3377ja.A04(EnumC3376J9.A09, null);
        }
    }

    public final void A09(EnumC23892U enumC23892U, int i10) {
        this.A02.add(enumC23892U.A02() + A00(0, 1, 114) + i10);
    }

    public final boolean A0A() {
        if (this.A02.isEmpty()) {
            List<String> list = this.A01;
            if (A04[0].length() != 22) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[3] = "1yk3ZSNQ1BStxV76R0ws43k7I6sqjrng";
            strArr[1] = "j3RusJXAZ4GZuuXU7mrgX9kSNDex5H9F";
            if (list.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}

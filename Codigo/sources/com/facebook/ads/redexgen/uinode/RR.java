package com.facebook.ads.redexgen.uinode;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class RR {
    public static byte[] A07;
    public RI A05;
    public int A04 = 60000;
    public int A03 = 100;
    public int A00 = ModuleDescriptor.MODULE_VERSION;
    public int A02 = 8000;
    public int A01 = 3;
    public Map<String, String> A06 = new HashMap();

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{49, 29, 4, 21, 17, 9, 17, 92, 14, 25, 8, 14, 21, 25, 15, 92, 17, 9, 15, 8, 92, 30, 25, 92, 30, 25, 8, 11, 25, 25, 18, 92, 77, 92, 29, 18, 24, 92, 77, 68};
    }

    public final RR A02(int i10) {
        this.A00 = i10;
        return this;
    }

    public final RR A03(int i10) {
        if (i10 >= 1 && i10 <= 18) {
            this.A01 = i10;
            return this;
        }
        throw new IllegalArgumentException(A00(0, 40, 56));
    }

    public final RR A04(int i10) {
        this.A02 = i10;
        return this;
    }

    public final RR A05(int i10) {
        this.A03 = i10;
        return this;
    }

    public final RR A06(int i10) {
        this.A04 = i10;
        return this;
    }

    public final RR A07(RI ri2) {
        this.A05 = ri2;
        return this;
    }

    public final RR A08(Map<String, String> requestHeaders) {
        this.A06 = requestHeaders;
        return this;
    }

    public final RS A09() {
        return new RS(this.A04, this.A00, this.A02, this.A03, this.A01, this.A06, this.A05);
    }
}

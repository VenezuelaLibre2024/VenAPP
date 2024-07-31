package com.facebook.ads.redexgen.uinode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8S */
/* loaded from: assets/audience_network.dex */
public final class C27428S {
    public static byte[] A07;
    public C27438T A01;
    public String A02;
    public String A03;
    public String A04;
    public JSONObject A06;
    public int A00 = 0;
    public List<C27408Q> A05 = new ArrayList();

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 109);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{79, 88};
    }

    public C27428S(C27438T c27438t, String str, String str2, String str3) {
        this.A01 = c27438t;
        this.A04 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public final int A02() {
        return this.A05.size();
    }

    public final long A03() {
        C27438T c27438t = this.A01;
        if (c27438t != null) {
            return c27438t.A0C() + this.A01.A03();
        }
        return -1L;
    }

    public final C27408Q A04() {
        if (this.A00 < this.A05.size()) {
            int i10 = this.A00 + 1;
            this.A00 = i10;
            return this.A05.get(i10 - 1);
        }
        return null;
    }

    public final C27438T A05() {
        return this.A01;
    }

    public final String A06() {
        return this.A02;
    }

    public final String A07() {
        int i10 = this.A00;
        if (i10 > 0 && i10 <= this.A05.size()) {
            return this.A05.get(this.A00 - 1).A04().optString(A00(0, 2, 65));
        }
        return null;
    }

    public final String A08() {
        return this.A04;
    }

    public final JSONObject A09() {
        return this.A06;
    }

    public final void A0A(C27408Q c27408q) {
        this.A05.add(c27408q);
    }

    public final void A0B(JSONObject jSONObject) {
        this.A06 = jSONObject;
    }

    public final boolean A0C() {
        return this.A01 == null || C3527Lf.A00() > this.A01.A0C() + ((long) this.A01.A03());
    }
}

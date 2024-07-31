package com.facebook.ads.redexgen.uinode;

import android.view.View;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class FR extends AbstractC1483am {
    public static byte[] A03;
    public long A00;
    public View A01;
    public EQ A02;

    static {
        A05();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 12);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{60, 57, 46, 41, 42, 37, 37, 46, 57, 20, 57, 46, 45, 57, 46, 56, 35, 20, 63, 34, 38, 46, 4, 15, 6, 14, 9, 56, 23, 6, 21, 6, 10, 20, 3, 20, 109, 122, 122, 103, 122, 40, Byte.MAX_VALUE, 96, 97, 100, 109, 40, 120, 105, 122, 123, 97, 102, 111, 40, 107, 96, 105, 97, 102, 109, 108, 40, 105, 108, 123, 40, 74, 105, 102, 102, 109, 122};
    }

    public FR(EQ eq, C05941u c05941u) {
        super(eq, c05941u);
        this.A00 = 10000L;
        this.A02 = eq;
    }

    private C1486ap A01(Runnable runnable) {
        return new C1486ap(this, runnable);
    }

    private List<JSONObject> A04(C05951v c05951v) {
        ArrayList arrayList = new ArrayList();
        JSONObject A032 = c05951v.A03();
        if (A032.has(A03(22, 12, 107))) {
            try {
                this.A00 = A032.getJSONObject(r1).optInt(A03(3, 19, 71), ModuleDescriptor.MODULE_VERSION);
                JSONArray adsArray = A032.getJSONArray(A03(0, 3, 81));
                if (adsArray.length() > 0) {
                    for (int i10 = 0; i10 < adsArray.length(); i10++) {
                        arrayList.add((JSONObject) adsArray.get(i10));
                    }
                }
            } catch (JSONException unused) {
                String A033 = A03(36, 38, 4);
                this.A02.A0E().A4t(C1005Jb.A01(AdErrorType.UNKNOWN_ERROR, A033).A03().getErrorCode(), A033);
                return arrayList;
            }
        } else {
            arrayList.add(A032);
        }
        return arrayList;
    }

    private void A06(C1520bN c1520bN, JSONObject jSONObject, C8T c8t) {
        this.A0C = false;
        C1485ao c1485ao = new C1485ao(this, c1520bN, LJ.A02(jSONObject, A03(34, 2, 108)));
        A0F().postDelayed(c1485ao, c8t.A05());
        c1520bN.A0J(this.A02, this.A08, this.A07.A08, A01(c1485ao), jSONObject, c8t);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1483am
    public final void A0M() {
        if (this.A01 != null) {
            this.A02.A0E().A3y();
            this.A06.A0E(this.A01);
        } else {
            this.A02.A0E().A3z();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1483am
    public final void A0O(InterfaceC05630p interfaceC05630p, C8S c8s, C8Q c8q, C05951v c05951v) {
        this.A02.A0E().A3s();
        C1520bN c1520bN = (C1520bN) interfaceC05630p;
        List<JSONObject> A04 = A04(c05951v);
        A06(c1520bN, A04.get(0), c05951v.A01());
        if (A04.size() > 1) {
            A0F().postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.1w
                public final /* synthetic */ C1520bN A00;
                public final /* synthetic */ C05951v A01;
                public final /* synthetic */ List A03;

                public /* synthetic */ RunnableC05961w(C1520bN c1520bN2, List A042, C05951v c05951v2) {
                    r2 = c1520bN2;
                    r3 = A042;
                    r4 = c05951v2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FR.this.A0X(r2, r3, r4);
                }
            }, this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1483am
    public final void A0R(String str) {
        this.A02.A0E().A3x(str != null);
        super.A0R(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1483am
    public final void A0V(boolean z10) {
        super.A0V(z10);
        this.A01 = null;
    }

    public final /* synthetic */ void A0X(C1520bN c1520bN, List list, C05951v c05951v) {
        A06(c1520bN, (JSONObject) list.get(1), c05951v.A01());
    }
}

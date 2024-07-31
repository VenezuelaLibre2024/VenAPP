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

/* renamed from: com.facebook.ads.redexgen.X.FR */
/* loaded from: assets/audience_network.dex */
public final class C3150FR extends AbstractC4457am {
    public static byte[] A03;
    public long A00;
    public View A01;
    public C3089EQ A02;

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

    public C3150FR(C3089EQ c3089eq, C23531u c23531u) {
        super(c3089eq, c23531u);
        this.A00 = 10000L;
        this.A02 = c3089eq;
    }

    private C4460ap A01(Runnable runnable) {
        return new C4460ap(this, runnable);
    }

    private List<JSONObject> A04(C23541v c23541v) {
        ArrayList arrayList = new ArrayList();
        JSONObject A032 = c23541v.A03();
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
                this.A02.A0E().A4t(C3403Jb.A01(AdErrorType.UNKNOWN_ERROR, A033).A03().getErrorCode(), A033);
                return arrayList;
            }
        } else {
            arrayList.add(A032);
        }
        return arrayList;
    }

    private void A06(C4494bN c4494bN, JSONObject jSONObject, C27438T c27438t) {
        this.A0C = false;
        C4459ao c4459ao = new C4459ao(this, c4494bN, AbstractC3505LJ.A02(jSONObject, A03(34, 2, 108)));
        A0F().postDelayed(c4459ao, c27438t.A05());
        c4494bN.A0J(this.A02, this.A08, this.A07.A08, A01(c4459ao), jSONObject, c27438t);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4457am
    public final void A0M() {
        if (this.A01 != null) {
            this.A02.A0E().A3y();
            this.A06.A0E(this.A01);
        } else {
            this.A02.A0E().A3z();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4457am
    public final void A0O(InterfaceC22860p interfaceC22860p, C27428S c27428s, C27408Q c27408q, final C23541v c23541v) {
        this.A02.A0E().A3s();
        final C4494bN c4494bN = (C4494bN) interfaceC22860p;
        final List<JSONObject> A04 = A04(c23541v);
        A06(c4494bN, A04.get(0), c23541v.A01());
        if (A04.size() > 1) {
            A0F().postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.1w
                @Override // java.lang.Runnable
                public final void run() {
                    C3150FR.this.A0X(c4494bN, A04, c23541v);
                }
            }, this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4457am
    public final void A0R(String str) {
        this.A02.A0E().A3x(str != null);
        super.A0R(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4457am
    public final void A0V(boolean z10) {
        super.A0V(z10);
        this.A01 = null;
    }

    public final /* synthetic */ void A0X(C4494bN c4494bN, List list, C23541v c23541v) {
        A06(c4494bN, (JSONObject) list.get(1), c23541v.A01());
    }
}

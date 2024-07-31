package com.facebook.ads.redexgen.uinode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.JW */
/* loaded from: assets/audience_network.dex */
public class RunnableC3399JW implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ C26937f A00;
    public final /* synthetic */ C3402JZ A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 121);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{3, 27, 5, 60, 61, 39, 32, 59, 38, 45, 89, 78, 91, 68, 89, 95, 66, 69, 76, 54, 33, 53, 49, 33, 55, 48, 27, 45, 32};
    }

    public RunnableC3399JW(C3402JZ c3402jz, String str, C26937f c26937f) {
        this.A01 = c3402jz;
        this.A02 = str;
        this.A00 = c26937f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        List list2;
        ArrayList arrayList;
        List list3;
        int i10;
        int i11;
        int i12;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            C27258B nvl = new C27258B(A00(0, 3, 52));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(A00(3, 7, 45), jSONArray);
            jSONObject.put(A00(19, 10, 61), this.A02);
            list = this.A01.A0D;
            synchronized (list) {
                list2 = this.A01.A0D;
                arrayList = new ArrayList(list2);
                list3 = this.A01.A0D;
                list3.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C3401JY c3401jy = (C3401JY) it.next();
                StringBuilder append = new StringBuilder().append(A00(0, 0, 60));
                i10 = c3401jy.A00;
                StringBuilder append2 = append.append(i10).append(';');
                i11 = c3401jy.A02;
                StringBuilder append3 = append2.append(i11).append(';');
                i12 = c3401jy.A01;
                jSONArray.put(append3.append(i12).toString());
            }
            nvl.A07(jSONObject);
            nvl.A05(1);
            this.A00.A07().A9b(A00(10, 9, 82), AbstractC27248A.A2R, nvl);
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}

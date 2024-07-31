package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.JC */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3379JC {
    public static byte[] A00;
    public static final Map<String, String> A01;
    public static final Map<String, List<String>> A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 27);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-68, -51, -49, -52, -33, -52, -42, -27, -34, -34, -43, -36, -3, 0, -14, -11, -16, 5, -6, -2, -10, -16, -2, 4, -68, -81, -69, -65, -81, -67, -66, -87, -66, -77, -73, -81, -87, -73, -67, -111, -108, 123, -126, -111, -118, -118, -127, -120, 123, -120, -117, -125, -125, -123, -118, -125};
    }

    static {
        A03();
        A02 = new HashMap();
        A01 = new HashMap();
    }

    public static String A01(String str) {
        return A01.get(str);
    }

    public static List<String> A02(C4337Yn c4337Yn, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int eventIndex = 0; eventIndex < jSONArray.length(); eventIndex++) {
            try {
                arrayList.add(jSONArray.getString(eventIndex));
            } catch (JSONException e10) {
                c4337Yn.A07().A9a(A00(39, 17, 1), AbstractC27248A.A1C, new C27258B(e10));
            }
        }
        return arrayList;
    }

    public static void A04(View view, C3377JA c3377ja, EnumC3376J9 enumC3376J9) {
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3378JB(c3377ja, enumC3376J9));
    }

    public static void A05(C4337Yn c4337Yn, String str, long j10) {
        InterfaceC3369J2 adEventManager = c4337Yn.A09();
        C3377JA c3377ja = new C3377JA(str, adEventManager);
        HashMap hashMap = new HashMap();
        hashMap.put(A00(24, 15, 47), C3527Lf.A06(j10));
        hashMap.put(A00(12, 12, 118), C3527Lf.A04(j10));
        c3377ja.A04(EnumC3376J9.A0D, hashMap);
    }

    public static void A06(C4337Yn c4337Yn, JSONObject jSONObject, long j10, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A00(2, 4, 80));
        if (optJSONObject == null) {
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(A00(6, 6, 85));
        if (TextUtils.isEmpty(str) && optJSONArray != null) {
            A07(c4337Yn, optJSONObject, A02(c4337Yn, optJSONArray), j10, null);
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Map<String, List<String>> map = A02;
            if (!map.containsKey(str)) {
                return;
            }
            A07(c4337Yn, optJSONObject, map.get(str), j10, str);
        }
    }

    public static void A07(C4337Yn c4337Yn, JSONObject jSONObject, List<String> list, long j10, String str) {
        String A002 = A00(0, 2, 62);
        if (jSONObject.has(A002)) {
            String clientToken = jSONObject.optString(A002);
            A08(clientToken, str);
            A09(clientToken, list);
            A05(c4337Yn, clientToken, j10);
        }
    }

    public static void A08(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        A01.put(str, str2);
    }

    public static void A09(String str, List<String> events) {
        if (TextUtils.isEmpty(str) || events.isEmpty()) {
            return;
        }
        A02.put(str, events);
    }

    public static boolean A0A(String str, EnumC3376J9 enumC3376J9) {
        return A0B(str, enumC3376J9.A02());
    }

    public static boolean A0B(String str, String str2) {
        Map<String, List<String>> map = A02;
        return map.containsKey(str) && map.get(str).contains(str2);
    }
}

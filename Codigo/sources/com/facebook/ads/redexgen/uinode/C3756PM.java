package com.facebook.ads.redexgen.uinode;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.PM */
/* loaded from: assets/audience_network.dex */
public final class C3756PM {
    public static byte[] A08;
    public WeakReference<C3745PB> A00;
    public WeakReference<InterfaceC3995TD> A01 = new WeakReference<>(null);
    public boolean A02 = false;
    public final C4337Yn A03;
    public final C3732Oy A04;
    public final String A05;
    public final String A06;
    public final WeakReference<InterfaceC3369J2> A07;

    static {
        A09();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A08 = new byte[]{44, 56, 54, 54, 42, 55, 45, 10, 11, 12, 7, 27, 18, 26, 63, 78, 71, 58, -29, -14, -21, -21, -30, -23, -36, -32, -20, -31, -30, 12, 27, 20, 20, 11, 18, 5, 19, 11, 25, 25, 7, 13, 11, -37, -22, -29, -29, -38, -31, -44, -23, -18, -27, -38, -23, -29, -9, 52, 53, 36, 46, 41, 90, 75, 95, 93, 79, 78, 44, 99, 63, 93, 79, 92, 57, 58, 39, 56, 58, 43, 42, 8, 63, 27, 57, 43, 56, 83, 84, 65, 84, 69, 48, 45, 39, 6, 32, 52, -10, -31, -20, -11, -27};
    }

    public C3756PM(C4337Yn c4337Yn, C3745PB c3745pb, InterfaceC3369J2 interfaceC3369J2, C3732Oy c3732Oy, String str, String str2) {
        this.A03 = c4337Yn;
        this.A00 = new WeakReference<>(c3745pb);
        this.A07 = new WeakReference<>(interfaceC3369J2);
        this.A04 = c3732Oy;
        this.A05 = str;
        this.A06 = str2;
    }

    public static Map<String, String> A03(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optString(next));
        }
        return hashMap;
    }

    private void A04() {
        InterfaceC3995TD uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.close();
    }

    private void A05() {
        InterfaceC3995TD uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A8X();
    }

    private void A06() {
        InterfaceC3995TD uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A9K();
    }

    private void A07() {
        this.A03.A0E().A5F();
        this.A02 = true;
        InterfaceC3995TD uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.AGY();
        if (C3348Ih.A1W(this.A03)) {
            this.A03.A0A().ABG();
        }
    }

    private void A08() {
        InterfaceC3995TD uxActionsJavascriptListener = this.A01.get();
        if (uxActionsJavascriptListener == null) {
            return;
        }
        uxActionsJavascriptListener.ABb();
    }

    private void A0A(C3745PB c3745pb, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        SharedPreferences A00 = AbstractC3440KE.A00(this.A03);
        String A01 = A01(57, 5, 81);
        String A012 = A01(0, 0, 21);
        String storageValue = jSONObject.optString(A01, A012);
        String key = jSONObject.optString(A01(54, 3, 10), A01(7, 7, 50));
        String string = A00.getString(A01(14, 4, 103) + key, A012);
        if (string != null) {
            A012 = string;
        }
        c3745pb.A0g(storageValue, A012);
    }

    private void A0B(C3745PB c3745pb, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String A01 = A01(98, 5, 12);
        String A012 = A01(0, 0, 21);
        String optString = jSONObject.optString(A01, A012);
        String optString2 = jSONObject.optString(A01(57, 5, 81), A012);
        AbstractC3440KE.A00(this.A03).edit().putString(A01(14, 4, 103) + jSONObject.optString(A01(54, 3, 10), A01(7, 7, 50)), optString).apply();
        c3745pb.A0f(optString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(EnumC3754PK enumC3754PK, String str) throws JSONException {
        switch (C3753PJ.A00[enumC3754PK.ordinal()]) {
            case 1:
                A0I(new JSONObject(str));
                break;
            case 2:
                A06();
                break;
            case 3:
                A04();
                break;
            case 4:
                A07();
                break;
            case 5:
                A0K(new JSONObject(str));
                break;
            case 6:
                A0L(new JSONObject(str));
                break;
            case 7:
                if (BuildConfigApi.isDebug()) {
                }
                break;
            case 8:
                A05();
            case 9:
                this.A03.A0E().A5R(str);
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                A0D(enumC3754PK, str);
                break;
            case 15:
                A0J(new JSONObject(str));
                break;
            case 16:
                A08();
                break;
            case 17:
                A0M(new JSONObject(str));
                break;
        }
        C3745PB c3745pb = this.A00.get();
        if (c3745pb == null) {
            return;
        }
        switch (enumC3754PK) {
            case A06:
                c3745pb.A0S();
                return;
            case A05:
                c3745pb.A0R();
                return;
            case A0P:
                A0B(c3745pb, str);
                return;
            case A0L:
                A0A(c3745pb, str);
                return;
            case A0F:
                c3745pb.A0i(A03(new JSONObject(str)));
                return;
            default:
                return;
        }
    }

    private void A0D(EnumC3754PK enumC3754PK, String str) throws JSONException {
        InterfaceC3995TD interfaceC3995TD = this.A01.get();
        if (interfaceC3995TD == null) {
            return;
        }
        switch (enumC3754PK) {
            case A0C:
                interfaceC3995TD.ABf();
                return;
            case A0N:
                interfaceC3995TD.AD8();
                return;
            case A0K:
                A0G(interfaceC3995TD, str);
                return;
            case A0J:
                A0F(interfaceC3995TD, str);
                return;
            case A0G:
                A0E(interfaceC3995TD, str);
                return;
            default:
                return;
        }
    }

    private void A0E(InterfaceC3995TD interfaceC3995TD, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STATE_KEY = A01(87, 5, 108);
        interfaceC3995TD.ACL(jSONObject.optBoolean(STATE_KEY, false));
    }

    private void A0F(InterfaceC3995TD interfaceC3995TD, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String PAUSED_BY_USER_KEY = A01(62, 12, 118);
        interfaceC3995TD.ADc(jSONObject.optBoolean(PAUSED_BY_USER_KEY, false));
    }

    private void A0G(InterfaceC3995TD interfaceC3995TD, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STARTED_BY_USER_KEY = A01(74, 13, 82);
        interfaceC3995TD.ADe(jSONObject.optBoolean(STARTED_BY_USER_KEY, false));
    }

    private void A0I(JSONObject jSONObject) {
        InterfaceC3995TD interfaceC3995TD = this.A01.get();
        if (interfaceC3995TD == null) {
            return;
        }
        String productUrl = jSONObject.optString(A01(0, 7, 85));
        if (TextUtils.isEmpty(productUrl)) {
            interfaceC3995TD.A8S();
        } else {
            interfaceC3995TD.A8T(productUrl);
        }
    }

    private void A0J(JSONObject jSONObject) {
        InterfaceC3995TD uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        jSONObject.optString(A01(0, 7, 85));
    }

    private void A0K(JSONObject jSONObject) {
        InterfaceC3369J2 interfaceC3369J2 = this.A07.get();
        if (interfaceC3369J2 == null) {
            return;
        }
        String optString = jSONObject.optString(A01(43, 11, 1));
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        new C3377JA(this.A06, interfaceC3369J2).A05(optString, A03(jSONObject));
    }

    private void A0L(JSONObject jSONObject) {
        int optInt = jSONObject.optInt(A01(18, 11, 9), -1);
        if (optInt == -1) {
            return;
        }
        String message = jSONObject.optString(A01(29, 14, 50));
        if (TextUtils.isEmpty(message)) {
            return;
        }
        this.A03.A0E().A9Y(optInt, message);
    }

    private void A0M(JSONObject jSONObject) {
        String optString;
        InterfaceC3995TD interfaceC3995TD = this.A01.get();
        if (interfaceC3995TD == null || (optString = jSONObject.optString(A01(92, 6, 71))) == null) {
            return;
        }
        interfaceC3995TD.ADr(optString);
    }

    public final void A0N(InterfaceC3995TD interfaceC3995TD) {
        this.A01 = new WeakReference<>(interfaceC3995TD);
    }

    public final boolean A0O() {
        return this.A02;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        ExecutorC3530Li.A00(new RunnableC3752PI(this, str));
    }
}

package com.facebook.ads.redexgen.uinode;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.am */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1483am implements K3 {
    public static byte[] A0D;
    public static String[] A0E = {"4yJhIog9RzpC9w4XHjq79o6hmz2pMXrt", "bLneqHgNlbzxjE", "P7gevZ65hMGDm5VmgpkLcWEi46YxYduR", "Pajg2XTKXpS0pN0AoGLcPnQoa2IWF6Z7", "YyJRdl3XxpBTstTmsw", "OvgbPt0JG7dlaj99kqPbJKVmb9CPKTVr", "21VbiQWRKHmC0d4xB3zoTsbqXtN2ZOxw", "Q3Y9mBD7X4l0uaedlY7FP5X0xCsXbtIX"};
    public static final Handler A0F;
    public static final C05680u A0G = null;
    public static final K4 A0H = null;
    public static final String A0I;
    public InterfaceC05630p A00;
    public InterfaceC05630p A01;
    public C8S A04;
    public K1 A05;
    public AbstractC05640q A06;
    public final C05941u A07;
    public final J2 A08;
    public final C05680u A09;
    public final K4 A0A;
    public final C1399Yn A0B;
    public volatile boolean A0C;
    public long A03 = -1;
    public String A02 = null;

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0D = new byte[]{75, 110, 107, 122, 126, 111, 120, 42, 110, 101, 111, 121, 42, 100, 101, 126, 42, 111, 114, 99, 121, 126, 78, 107, 110, Byte.MAX_VALUE, 123, 106, 125, 47, 102, 124, 47, 97, 122, 99, 99, 47, 39, 108, 103, 110, 102, 97, 47, 97, 96, 123, 47, 99, 96, 110, 107, 106, 107, 38, 57, 28, 25, 8, 12, 29, 10, 88, 17, 11, 88, 22, 13, 20, 20, 88, 80, 27, 16, 25, 17, 22, 29, 28, 81, 45, 8, 13, 28, 24, 9, 30, 76, 5, 31, 76, 2, 25, 0, 0, 76, 68, 2, 3, 76, 15, 4, 13, 5, 2, 69, 78, 107, 110, Byte.MAX_VALUE, 123, 106, 125, 47, 102, 124, 47, 97, 122, 99, 99, 47, 96, 97, 47, 124, 123, 110, 125, 123, 78, 107, 5, 36, 107, 38, 36, 57, 46, 107, 42, 47, 107, 40, 42, 37, 47, 34, 47, 42, 63, 46, 56, 101, 122, 95, 66, 67, 74, 13, 76, 73, 76, 93, 89, 72, 95, 13, 89, 84, 93, 72, 3, 46, 43, 111, 46, 35, 61, 42, 46, 43, 54, 111, 60, 59, 46, 61, 59, 42, 43, 94, 91, 76, 52, 37, 60, 26, 17, 24, 16, 23, 38, 9, 24, 11, 24, 20, 10, 76, 91, 74, 79, 90, 79, 97, 76, 68, 75, 77, 90, 14, 71, 93, 14, 64, 91, 66, 66, 38, 45, 32, 49, 58, 51, 55, 38, 39, 28, 42, 39, 122, 113, 105, 118, 109, 112, 113, 114, 122, 113, 107, 63, 118, 108, 63, 122, 114, 111, 107, 102, 38, 50, 37, 49, 53, 37, 46, 35, 57, 31, 35, 33, 48, 48, 41, 46, 39, 28, 27, 3, 20, 25, 28, 17, 85, 5, 25, 20, 22, 16, 24, 16, 27, 1, 85, 28, 27, 85, 7, 16, 6, 5, 26, 27, 6, 16, 10, 9, 7, 2, 57, 18, 15, 11, 3, 57, 11, 21, 44, 59, 47, 43, 59, 45, 42, 1, 55, 58};
    }

    public abstract void A0M();

    public abstract void A0O(InterfaceC05630p interfaceC05630p, C8S c8s, C8Q c8q, C05951v c05951v);

    static {
        A08();
        AbstractC1068Lq.A02();
        A0I = AbstractC1483am.class.getSimpleName();
        A0F = new Handler(Looper.getMainLooper());
    }

    public AbstractC1483am(C1399Yn c1399Yn, C05941u c05941u) {
        this.A0B = c1399Yn;
        this.A07 = c05941u;
        K4 k42 = A0H;
        if (k42 != null) {
            this.A0A = k42;
        } else {
            this.A0A = new K4(c1399Yn);
        }
        this.A0A.A0P(this);
        C05680u c05680u = A0G;
        if (c05680u != null) {
            this.A09 = c05680u;
        } else {
            this.A09 = new C05680u();
        }
        DynamicLoaderFactory.makeLoader(c1399Yn).getInitApi().onAdLoadInvoked(c1399Yn);
        this.A08 = c1399Yn.A09();
        c1399Yn.A0E().A4r();
    }

    private void A09(C1301Up c1301Up) {
        C8S placement = c1301Up.A00();
        if (placement == null || placement.A05() == null) {
            String A07 = A07(279, 29, 125);
            C1005Jb error = new C1005Jb(AdErrorType.NO_AD_PLACEMENT, A07);
            this.A0B.A0E().A4t(error.A03().getErrorCode(), A07);
            AbstractC05640q abstractC05640q = this.A06;
            if (abstractC05640q != null) {
                abstractC05640q.A0G(error);
                return;
            }
            return;
        }
        this.A04 = placement;
        this.A00 = null;
        C8S c8s = this.A04;
        JSONObject A09 = c8s.A09();
        String A072 = A07(195, 3, 93);
        if (A09 == null) {
            C8Q A04 = c8s.A04();
            if (!A0D(c8s, A04)) {
                return;
            }
            if (this.A00 == null) {
                this.A0B.A07().A9a(A072, C8A.A0a, new C8B(A07(81, 26, 100), A04.A02()));
                ABR(C1005Jb.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            C05951v loadConfig = new C05951v(A04.A04(), c8s.A05(), this.A07.A0A, c8s.A05().A0C());
            A0O(this.A00, c8s, A04, loadConfig);
            return;
        }
        ArrayList arrayList = new ArrayList();
        C8Q A042 = c8s.A04();
        do {
            if (arrayList.isEmpty()) {
                if (A0D(c8s, A042)) {
                    arrayList.add(A042);
                } else {
                    return;
                }
            } else if (A0C(A042)) {
                arrayList.add(A042);
            }
            A042 = c8s.A04();
        } while (A042 != null);
        if (this.A00 == null) {
            this.A0B.A07().A9a(A072, C8A.A0a, new C8B(A07(56, 25, 112), ((C8Q) arrayList.get(0)).A02()));
            ABR(C1005Jb.A00(AdErrorType.INTERNAL_ERROR));
            return;
        }
        boolean loaded = false;
        try {
            if (arrayList.size() > 1 && this.A00.AGd()) {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C8Q) it.next()).A04());
                }
                jSONObject.put(A07(192, 3, 55), jSONArray);
                jSONObject.put(A07(198, 12, 113), c8s.A09());
                C05951v loadConfig2 = new C05951v(jSONObject, c8s.A05(), this.A07.A0A, c8s.A05().A0C());
                A0O(this.A00, c8s, A042, loadConfig2);
                loaded = true;
            }
        } catch (Exception unused) {
            loaded = false;
        }
        if (!loaded) {
            if (arrayList.isEmpty()) {
                C1005Jb A01 = C1005Jb.A01(AdErrorType.NO_FILL, A07(0, 0, 73));
                this.A0B.A0E().A4t(A01.A03().getErrorCode(), A07(133, 22, 67));
                AbstractC05640q abstractC05640q2 = this.A06;
                if (abstractC05640q2 != null) {
                    abstractC05640q2.A0G(A01);
                    return;
                }
                return;
            }
            InterfaceC05630p interfaceC05630p = this.A00;
            String[] strArr = A0E;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[0] = "F2ixlBYVHNYJB4bAHADqJrSynawwg1yM";
            strArr2[5] = "djkwyiiWLTaQwWMcVWQWfq0o8Ww2Jgo9";
            if (interfaceC05630p == null) {
                this.A0B.A07().A9a(A072, C8A.A0a, new C8B(A07(22, 34, 7), ((C8Q) arrayList.get(0)).A02()));
                ABR(C1005Jb.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            C8Q c8q = (C8Q) arrayList.get(0);
            C05951v loadConfig3 = new C05951v(c8q.A04(), c8s.A05(), this.A07.A0A, c8s.A05().A0C());
            A0O(this.A00, c8s, c8q, loadConfig3);
        }
    }

    private final void A0A(String str, AdExperienceType adExperienceType) {
        this.A0B.A0E().A4u(str != null);
        this.A03 = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT < 17) {
            ABR(new C1005Jb(AdErrorType.API_NOT_SUPPORTED, A07(0, 0, 73)));
            return;
        }
        try {
            C1014Jl bidPayload = new C1014Jl(this.A0B, str, this.A07.A0A, this.A07.A09);
            K1 A01 = this.A07.A01(this.A0B, bidPayload, adExperienceType);
            this.A05 = A01;
            this.A0A.A0O(A01);
        } catch (C1006Jc e10) {
            C1005Jb A02 = C1005Jb.A02(e10);
            if (A0E[6].charAt(21) == '6') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[4] = "3q2wB1pMY3UXfOrLgu";
            strArr[1] = "CsXqAZILgfX2KA";
            ABR(A02);
        }
    }

    private void A0B(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.A02 = jSONObject.optString(A07(230, 12, 75));
            C05700w.A01(this.A0B).A0O(jSONObject);
        }
    }

    private boolean A0C(C8Q c8q) {
        return (c8q == null || c8q.A04() == null) ? false : true;
    }

    private boolean A0D(C8S c8s, C8Q c8q) {
        String A07 = A07(0, 0, 73);
        if (c8q == null) {
            C1005Jb A01 = C1005Jb.A01(AdErrorType.NO_FILL, A07);
            this.A0B.A0E().A4t(A01.A03().getErrorCode(), A07(133, 22, 67));
            AbstractC05640q abstractC05640q = this.A06;
            if (abstractC05640q != null) {
                abstractC05640q.A0G(A01);
            }
            return false;
        }
        String A02 = c8q.A02();
        InterfaceC05630p A00 = this.A09.A00(this.A0B, c8s.A05().A0D());
        if (A00 == null) {
            this.A0B.A07().A9a(A07(195, 3, 93), C8A.A0a, new C8B(A07(0, 22, 2), A02));
            ABR(C1005Jb.A00(AdErrorType.INTERNAL_ERROR));
            return false;
        }
        if (this.A07.A00() != A00.A7e()) {
            C1005Jb A012 = C1005Jb.A01(AdErrorType.INTERNAL_ERROR, A07);
            this.A0B.A0E().A4t(A012.A03().getErrorCode(), A07(155, 19, 37));
            AbstractC05640q abstractC05640q2 = this.A06;
            if (abstractC05640q2 != null) {
                abstractC05640q2.A0G(A012);
            }
            return false;
        }
        this.A00 = A00;
        String[] strArr = A0E;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[0] = "MKxF4EMWgzzLH5X7HNcHVA2i4zdAiZz9";
        strArr2[5] = "4tfdEW2uI31voJBW941pIR5b1aNGKiQe";
        JSONObject dataObject = c8q.A04();
        if (dataObject != null) {
            String adapterName = dataObject.optString(A07(320, 10, 86));
            this.A0B.A0E().AGD(adapterName);
            this.A0B.A0C(adapterName);
            C1398Ym A002 = AbstractC07267e.A00();
            if (A002 != null) {
                A002.A0C(adapterName);
            }
            A0B(dataObject.optJSONObject(A07(262, 17, 72)));
            if (this.A05 == null) {
                String A072 = A07(242, 20, 23);
                C1005Jb A013 = C1005Jb.A01(AdErrorType.UNKNOWN_ERROR, A072);
                this.A0B.A0E().A4t(A013.A03().getErrorCode(), A072);
                AbstractC05640q abstractC05640q3 = this.A06;
                if (abstractC05640q3 != null) {
                    abstractC05640q3.A0G(A013);
                }
                return false;
            }
            return true;
        }
        String A073 = A07(212, 18, 38);
        C1005Jb A014 = C1005Jb.A01(AdErrorType.UNKNOWN_ERROR, A073);
        this.A0B.A0E().A4t(A014.A03().getErrorCode(), A073);
        AbstractC05640q abstractC05640q4 = this.A06;
        if (abstractC05640q4 != null) {
            abstractC05640q4.A0G(A014);
        }
        return false;
    }

    public final long A0E() {
        C8S c8s = this.A04;
        if (c8s != null) {
            return c8s.A03();
        }
        return -1L;
    }

    public final Handler A0F() {
        return A0F;
    }

    public C1F A0G() {
        return ((AbstractC1506b9) this.A01).A0H();
    }

    public final C8T A0H() {
        C8S c8s = this.A04;
        if (c8s == null) {
            return null;
        }
        return c8s.A05();
    }

    public final void A0I() {
        String A6T;
        this.A0B.A0E().A2q(C1057Lf.A01(this.A03));
        InterfaceC05630p interfaceC05630p = this.A01;
        if (interfaceC05630p == null || (A6T = interfaceC05630p.A6T()) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String A04 = C1057Lf.A04(this.A03);
        String clientToken = A07(308, 12, 110);
        hashMap.put(clientToken, A04);
        new JA(A6T, this.A08).A04(J9.A08, hashMap);
    }

    public final void A0J() {
        InterfaceC05630p interfaceC05630p = this.A01;
        String A07 = A07(195, 3, 93);
        if (interfaceC05630p == null) {
            String A072 = A07(107, 26, 7);
            this.A0B.A07().A9a(A07, C8A.A0Q, new C8B(A072));
            AdErrorType adErrorType = AdErrorType.INTERNAL_ERROR;
            this.A0B.A0E().A4t(adErrorType.getErrorCode(), A072);
            AbstractC05640q abstractC05640q = this.A06;
            if (abstractC05640q != null) {
                String errorMessage = adErrorType.getDefaultErrorMessage();
                abstractC05640q.A0G(C1005Jb.A01(adErrorType, errorMessage));
            }
            this.A0B.A0E().A4w();
            return;
        }
        if (this.A0C) {
            String A073 = A07(174, 18, 71);
            this.A0B.A07().A9a(A07, C8A.A0M, new C8B(A073));
            AdErrorType adErrorType2 = AdErrorType.AD_ALREADY_STARTED;
            this.A0B.A0E().A4t(adErrorType2.getErrorCode(), A073);
            AbstractC05640q abstractC05640q2 = this.A06;
            if (abstractC05640q2 != null) {
                String errorMessage2 = adErrorType2.getDefaultErrorMessage();
                abstractC05640q2.A0G(C1005Jb.A01(adErrorType2, errorMessage2));
            }
            this.A0B.A0E().A4v();
            return;
        }
        if (!TextUtils.isEmpty(this.A01.A6T())) {
            this.A08.AA3(this.A01.A6T());
        }
        this.A0B.A0E().A4x();
        this.A0C = true;
        A0M();
    }

    public final void A0K() {
        A0V(false);
    }

    public final void A0L() {
        if (this.A02 != null) {
            C05700w.A01(this.A0B).A0N(this.A02);
        }
    }

    public final void A0N(InterfaceC05630p interfaceC05630p) {
        if (interfaceC05630p != null) {
            interfaceC05630p.onDestroy();
        }
    }

    public final void A0P(AbstractC05640q abstractC05640q) {
        this.A06 = abstractC05640q;
    }

    public final void A0Q(C05951v c05951v) {
        A0S(c05951v.A03().optString(A07(210, 2, 39)));
    }

    public void A0R(String str) {
        A0A(str, null);
    }

    public final void A0S(String str) {
        this.A0B.A0E().A4q();
        if (!TextUtils.isEmpty(str)) {
            new JA(str, this.A08).A04(J9.A04, null);
        }
    }

    public final void A0T(String str) {
        A0R(str);
    }

    public final void A0U(String str, AdExperienceType adExperienceType) {
        A0A(str, adExperienceType);
    }

    public void A0V(boolean z10) {
        if (!z10 && !this.A0C) {
            return;
        }
        this.A0B.A0E().A4y();
        A0N(this.A01);
        this.A0C = false;
    }

    public final boolean A0W() {
        C8S c8s = this.A04;
        return c8s == null || c8s.A0C();
    }

    @Override // com.facebook.ads.redexgen.uinode.K3
    public final synchronized void ABR(C1005Jb c1005Jb) {
        A0F().post(new C1484an(this, c1005Jb));
    }

    @Override // com.facebook.ads.redexgen.uinode.K3
    public final synchronized void ADG(C1301Up c1301Up) {
        try {
            A09(c1301Up);
        } catch (Exception e10) {
            this.A0B.A07().A9a(A07(195, 3, 93), C8A.A0T, new C8B(e10));
        }
    }
}

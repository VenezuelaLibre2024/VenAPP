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
public abstract class AbstractC4457am implements InterfaceC3430K3 {
    public static byte[] A0D;
    public static String[] A0E = {"4yJhIog9RzpC9w4XHjq79o6hmz2pMXrt", "bLneqHgNlbzxjE", "P7gevZ65hMGDm5VmgpkLcWEi46YxYduR", "Pajg2XTKXpS0pN0AoGLcPnQoa2IWF6Z7", "YyJRdl3XxpBTstTmsw", "OvgbPt0JG7dlaj99kqPbJKVmb9CPKTVr", "21VbiQWRKHmC0d4xB3zoTsbqXtN2ZOxw", "Q3Y9mBD7X4l0uaedlY7FP5X0xCsXbtIX"};
    public static final Handler A0F;
    public static final C22910u A0G = null;
    public static final C3431K4 A0H = null;
    public static final String A0I;
    public InterfaceC22860p A00;
    public InterfaceC22860p A01;
    public C27428S A04;
    public C3428K1 A05;
    public AbstractC22870q A06;
    public final C23531u A07;
    public final InterfaceC3369J2 A08;
    public final C22910u A09;
    public final C3431K4 A0A;
    public final C4337Yn A0B;
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

    public abstract void A0O(InterfaceC22860p interfaceC22860p, C27428S c27428s, C27408Q c27408q, C23541v c23541v);

    static {
        A08();
        AbstractC3538Lq.A02();
        A0I = AbstractC4457am.class.getSimpleName();
        A0F = new Handler(Looper.getMainLooper());
    }

    public AbstractC4457am(C4337Yn c4337Yn, C23531u c23531u) {
        this.A0B = c4337Yn;
        this.A07 = c23531u;
        C3431K4 c3431k4 = A0H;
        if (c3431k4 != null) {
            this.A0A = c3431k4;
        } else {
            this.A0A = new C3431K4(c4337Yn);
        }
        this.A0A.A0P(this);
        C22910u c22910u = A0G;
        if (c22910u != null) {
            this.A09 = c22910u;
        } else {
            this.A09 = new C22910u();
        }
        DynamicLoaderFactory.makeLoader(c4337Yn).getInitApi().onAdLoadInvoked(c4337Yn);
        this.A08 = c4337Yn.A09();
        c4337Yn.A0E().A4r();
    }

    private void A09(C4094Up c4094Up) {
        C27428S placement = c4094Up.A00();
        if (placement == null || placement.A05() == null) {
            String A07 = A07(279, 29, 125);
            C3403Jb error = new C3403Jb(AdErrorType.NO_AD_PLACEMENT, A07);
            this.A0B.A0E().A4t(error.A03().getErrorCode(), A07);
            AbstractC22870q abstractC22870q = this.A06;
            if (abstractC22870q != null) {
                abstractC22870q.A0G(error);
                return;
            }
            return;
        }
        this.A04 = placement;
        this.A00 = null;
        C27428S c27428s = this.A04;
        JSONObject A09 = c27428s.A09();
        String A072 = A07(195, 3, 93);
        if (A09 == null) {
            C27408Q A04 = c27428s.A04();
            if (!A0D(c27428s, A04)) {
                return;
            }
            if (this.A00 == null) {
                this.A0B.A07().A9a(A072, AbstractC27248A.A0a, new C27258B(A07(81, 26, 100), A04.A02()));
                ABR(C3403Jb.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            C23541v loadConfig = new C23541v(A04.A04(), c27428s.A05(), this.A07.A0A, c27428s.A05().A0C());
            A0O(this.A00, c27428s, A04, loadConfig);
            return;
        }
        ArrayList arrayList = new ArrayList();
        C27408Q A042 = c27428s.A04();
        do {
            if (arrayList.isEmpty()) {
                if (A0D(c27428s, A042)) {
                    arrayList.add(A042);
                } else {
                    return;
                }
            } else if (A0C(A042)) {
                arrayList.add(A042);
            }
            A042 = c27428s.A04();
        } while (A042 != null);
        if (this.A00 == null) {
            this.A0B.A07().A9a(A072, AbstractC27248A.A0a, new C27258B(A07(56, 25, 112), ((C27408Q) arrayList.get(0)).A02()));
            ABR(C3403Jb.A00(AdErrorType.INTERNAL_ERROR));
            return;
        }
        boolean loaded = false;
        try {
            if (arrayList.size() > 1 && this.A00.AGd()) {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C27408Q) it.next()).A04());
                }
                jSONObject.put(A07(192, 3, 55), jSONArray);
                jSONObject.put(A07(198, 12, 113), c27428s.A09());
                C23541v loadConfig2 = new C23541v(jSONObject, c27428s.A05(), this.A07.A0A, c27428s.A05().A0C());
                A0O(this.A00, c27428s, A042, loadConfig2);
                loaded = true;
            }
        } catch (Exception unused) {
            loaded = false;
        }
        if (!loaded) {
            if (arrayList.isEmpty()) {
                C3403Jb A01 = C3403Jb.A01(AdErrorType.NO_FILL, A07(0, 0, 73));
                this.A0B.A0E().A4t(A01.A03().getErrorCode(), A07(133, 22, 67));
                AbstractC22870q abstractC22870q2 = this.A06;
                if (abstractC22870q2 != null) {
                    abstractC22870q2.A0G(A01);
                    return;
                }
                return;
            }
            InterfaceC22860p interfaceC22860p = this.A00;
            String[] strArr = A0E;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[0] = "F2ixlBYVHNYJB4bAHADqJrSynawwg1yM";
            strArr2[5] = "djkwyiiWLTaQwWMcVWQWfq0o8Ww2Jgo9";
            if (interfaceC22860p == null) {
                this.A0B.A07().A9a(A072, AbstractC27248A.A0a, new C27258B(A07(22, 34, 7), ((C27408Q) arrayList.get(0)).A02()));
                ABR(C3403Jb.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            C27408Q c27408q = (C27408Q) arrayList.get(0);
            C23541v loadConfig3 = new C23541v(c27408q.A04(), c27428s.A05(), this.A07.A0A, c27428s.A05().A0C());
            A0O(this.A00, c27428s, c27408q, loadConfig3);
        }
    }

    private final void A0A(String str, AdExperienceType adExperienceType) {
        this.A0B.A0E().A4u(str != null);
        this.A03 = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT < 17) {
            ABR(new C3403Jb(AdErrorType.API_NOT_SUPPORTED, A07(0, 0, 73)));
            return;
        }
        try {
            C3412Jl bidPayload = new C3412Jl(this.A0B, str, this.A07.A0A, this.A07.A09);
            C3428K1 A01 = this.A07.A01(this.A0B, bidPayload, adExperienceType);
            this.A05 = A01;
            this.A0A.A0O(A01);
        } catch (C3404Jc e10) {
            C3403Jb A02 = C3403Jb.A02(e10);
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
            C22930w.A01(this.A0B).A0O(jSONObject);
        }
    }

    private boolean A0C(C27408Q c27408q) {
        return (c27408q == null || c27408q.A04() == null) ? false : true;
    }

    private boolean A0D(C27428S c27428s, C27408Q c27408q) {
        String A07 = A07(0, 0, 73);
        if (c27408q == null) {
            C3403Jb A01 = C3403Jb.A01(AdErrorType.NO_FILL, A07);
            this.A0B.A0E().A4t(A01.A03().getErrorCode(), A07(133, 22, 67));
            AbstractC22870q abstractC22870q = this.A06;
            if (abstractC22870q != null) {
                abstractC22870q.A0G(A01);
            }
            return false;
        }
        String A02 = c27408q.A02();
        InterfaceC22860p A00 = this.A09.A00(this.A0B, c27428s.A05().A0D());
        if (A00 == null) {
            this.A0B.A07().A9a(A07(195, 3, 93), AbstractC27248A.A0a, new C27258B(A07(0, 22, 2), A02));
            ABR(C3403Jb.A00(AdErrorType.INTERNAL_ERROR));
            return false;
        }
        if (this.A07.A00() != A00.A7e()) {
            C3403Jb A012 = C3403Jb.A01(AdErrorType.INTERNAL_ERROR, A07);
            this.A0B.A0E().A4t(A012.A03().getErrorCode(), A07(155, 19, 37));
            AbstractC22870q abstractC22870q2 = this.A06;
            if (abstractC22870q2 != null) {
                abstractC22870q2.A0G(A012);
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
        JSONObject dataObject = c27408q.A04();
        if (dataObject != null) {
            String adapterName = dataObject.optString(A07(320, 10, 86));
            this.A0B.A0E().AGD(adapterName);
            this.A0B.A0C(adapterName);
            C4336Ym A002 = AbstractC26927e.A00();
            if (A002 != null) {
                A002.A0C(adapterName);
            }
            A0B(dataObject.optJSONObject(A07(262, 17, 72)));
            if (this.A05 == null) {
                String A072 = A07(242, 20, 23);
                C3403Jb A013 = C3403Jb.A01(AdErrorType.UNKNOWN_ERROR, A072);
                this.A0B.A0E().A4t(A013.A03().getErrorCode(), A072);
                AbstractC22870q abstractC22870q3 = this.A06;
                if (abstractC22870q3 != null) {
                    abstractC22870q3.A0G(A013);
                }
                return false;
            }
            return true;
        }
        String A073 = A07(212, 18, 38);
        C3403Jb A014 = C3403Jb.A01(AdErrorType.UNKNOWN_ERROR, A073);
        this.A0B.A0E().A4t(A014.A03().getErrorCode(), A073);
        AbstractC22870q abstractC22870q4 = this.A06;
        if (abstractC22870q4 != null) {
            abstractC22870q4.A0G(A014);
        }
        return false;
    }

    public final long A0E() {
        C27428S c27428s = this.A04;
        if (c27428s != null) {
            return c27428s.A03();
        }
        return -1L;
    }

    public final Handler A0F() {
        return A0F;
    }

    public AbstractC23121F A0G() {
        return ((AbstractC4480b9) this.A01).A0H();
    }

    public final C27438T A0H() {
        C27428S c27428s = this.A04;
        if (c27428s == null) {
            return null;
        }
        return c27428s.A05();
    }

    public final void A0I() {
        String A6T;
        this.A0B.A0E().A2q(C3527Lf.A01(this.A03));
        InterfaceC22860p interfaceC22860p = this.A01;
        if (interfaceC22860p == null || (A6T = interfaceC22860p.A6T()) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String A04 = C3527Lf.A04(this.A03);
        String clientToken = A07(308, 12, 110);
        hashMap.put(clientToken, A04);
        new C3377JA(A6T, this.A08).A04(EnumC3376J9.A08, hashMap);
    }

    public final void A0J() {
        InterfaceC22860p interfaceC22860p = this.A01;
        String A07 = A07(195, 3, 93);
        if (interfaceC22860p == null) {
            String A072 = A07(107, 26, 7);
            this.A0B.A07().A9a(A07, AbstractC27248A.A0Q, new C27258B(A072));
            AdErrorType adErrorType = AdErrorType.INTERNAL_ERROR;
            this.A0B.A0E().A4t(adErrorType.getErrorCode(), A072);
            AbstractC22870q abstractC22870q = this.A06;
            if (abstractC22870q != null) {
                String errorMessage = adErrorType.getDefaultErrorMessage();
                abstractC22870q.A0G(C3403Jb.A01(adErrorType, errorMessage));
            }
            this.A0B.A0E().A4w();
            return;
        }
        if (this.A0C) {
            String A073 = A07(174, 18, 71);
            this.A0B.A07().A9a(A07, AbstractC27248A.A0M, new C27258B(A073));
            AdErrorType adErrorType2 = AdErrorType.AD_ALREADY_STARTED;
            this.A0B.A0E().A4t(adErrorType2.getErrorCode(), A073);
            AbstractC22870q abstractC22870q2 = this.A06;
            if (abstractC22870q2 != null) {
                String errorMessage2 = adErrorType2.getDefaultErrorMessage();
                abstractC22870q2.A0G(C3403Jb.A01(adErrorType2, errorMessage2));
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
            C22930w.A01(this.A0B).A0N(this.A02);
        }
    }

    public final void A0N(InterfaceC22860p interfaceC22860p) {
        if (interfaceC22860p != null) {
            interfaceC22860p.onDestroy();
        }
    }

    public final void A0P(AbstractC22870q abstractC22870q) {
        this.A06 = abstractC22870q;
    }

    public final void A0Q(C23541v c23541v) {
        A0S(c23541v.A03().optString(A07(210, 2, 39)));
    }

    public void A0R(String str) {
        A0A(str, null);
    }

    public final void A0S(String str) {
        this.A0B.A0E().A4q();
        if (!TextUtils.isEmpty(str)) {
            new C3377JA(str, this.A08).A04(EnumC3376J9.A04, null);
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
        C27428S c27428s = this.A04;
        return c27428s == null || c27428s.A0C();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3430K3
    public final synchronized void ABR(C3403Jb c3403Jb) {
        A0F().post(new C4458an(this, c3403Jb));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3430K3
    public final synchronized void ADG(C4094Up c4094Up) {
        try {
            A09(c4094Up);
        } catch (Exception e10) {
            this.A0B.A07().A9a(A07(195, 3, 93), AbstractC27248A.A0T, new C27258B(e10));
        }
    }
}

package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.ads.redexgen.X.6x */
/* loaded from: assets/audience_network.dex */
public final class C26586x implements InterfaceC3290Hj, InterfaceC3908Ro {
    public static byte[] A0A;
    public static String[] A0B = {"5Oiv1GLvIq7zEHzIHOTPzi3kaYzi9CKu", "OYJ8Vha7o3AKqeq5fQgjy4YAYzCEKBrH", "4fHxCa0vWIAizdOtLSYViH6HX8wZM136", "7SeobKfCaIBp1RCtBr0PVzHsRPnznuT1", "fOxTiSwrZex6", "3vZIMeafrjOpHP1eiyT8MHuy7IIJRNdQ", "XI5vdZH0G6FndxBvW8fNBqRq2FpLqBJ1", "pJZH6qXQIaEu24ksEJ9XliOUqsc1pAkZ"};
    public final C26937f A00;
    public final InterfaceC27107w A01;
    public final InterfaceC3878RK A02;
    public final InterfaceC3909Rp A03;
    public final C3917Rx A04;
    public final InterfaceC3918Ry A05;
    public final String A06;
    public final Map<EnumC3904Rk, C3303Hw> A09 = new HashMap();
    public final Map<EnumC3904Rk, AbstractC266374> A08 = new HashMap();
    public final List<InterfaceC3922S2> A07 = new ArrayList();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 17);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A04() throws Throwable {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        synchronized (this) {
            for (C3303Hw c3303Hw : this.A09.values()) {
                if (c3303Hw.A9C()) {
                    hashMap.put(c3303Hw, EnumC3925S5.A04);
                } else {
                    hashMap.put(c3303Hw, EnumC3925S5.A03);
                }
            }
            new AtomicReference();
            new AtomicReference();
            Iterator<AbstractC266374> it = this.A08.values().iterator();
            while (it.hasNext()) {
                it.next();
                InterfaceC3903Rj interfaceC3903Rj = null;
                if (interfaceC3903Rj.A9C()) {
                    throw new NullPointerException(A01(349, 20, 91));
                }
            }
            Iterator<InterfaceC3922S2> it2 = this.A07.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw new NullPointerException(A01(424, 22, 50));
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        JSONObject A03 = A03(hashMap, hashMap2, hashMap3, hashMap4);
        String.format(Locale.US, A01(188, 33, 55), this.A06, A03.toString(2));
        this.A02.AE0(this.A06, (A01(327, 8, 88) + URLEncoder.encode(A03.toString())).getBytes(), new C3279HY(this, atomicReference, atomicReference2, countDownLatch));
        while (countDownLatch.getCount() > 0) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this) {
            if (atomicReference2.get() != null) {
                throw ((Throwable) atomicReference2.get());
            }
            Set<InterfaceC3921S1> A02 = A02((JSONObject) atomicReference.get());
            HashMap hashMap5 = new HashMap();
            HashMap hashMap6 = new HashMap();
            Iterator<InterfaceC3921S1> it3 = A02.iterator();
            while (it3.hasNext()) {
                it3.next().A3Z(hashMap5, hashMap6);
            }
            this.A03.A5k(A00((JSONObject) atomicReference.get()));
            Iterator<InterfaceC3922S2> it4 = this.A07.iterator();
            if (it4.hasNext()) {
                it4.next();
                throw new NullPointerException(A01(401, 23, 80));
            }
        }
    }

    public static void A05() {
        A0A = new byte[]{101, -82, -72, 101, -73, -86, -72, -71, -73, -82, -88, -71, -86, -87, 115, 101, -104, -80, -82, -75, -75, -82, -77, -84, 101, -72, -66, -77, -88, -48, -1, -1, -81, -8, -3, -81, -15, -16, -14, -6, -10, 1, -2, 4, -3, -13, -67, -54, -24, -11, -11, -10, -5, -89, -22, -7, -20, -24, -5, -20, -89, -6, -20, -7, -3, -20, -7, -89, -23, -4, -11, -21, -13, -20, -89, -2, -16, -5, -17, -89, -11, -10, -11, -76, -6, -20, -7, -3, -20, -7, -89, -10, -2, -11, -20, -21, -89, -23, -4, -11, -21, -13, -20, -89, -48, -53, -85, -56, -37, -56, -121, -41, -39, -42, -54, -52, -38, -38, -48, -43, -50, -121, -42, -41, -37, -48, -42, -43, -121, -49, -12, -4, -25, -14, -17, -22, -90, -8, -21, -20, -8, -21, -7, -18, -90, -6, -17, -13, -21, -64, -90, -85, -22, -79, -56, -38, -125, -42, -56, -43, -39, -56, -43, -112, -46, -38, -47, -56, -57, -125, -59, -40, -47, -57, -49, -56, -125, -58, -43, -56, -60, -41, -56, -57, -99, -125, -120, -42, -101, -63, -74, -85, -80, -70, -73, -74, -79, -62, -87, -68, -79, -73, -74, 104, -70, -83, -71, -67, -83, -69, -68, 104, -68, -73, 104, 109, -69, -126, 82, 109, -69, -88, -50, -61, -72, -67, -57, -60, -61, -66, -49, -74, -55, -66, -60, -61, 117, -57, -70, -56, -59, -60, -61, -56, -70, -113, 95, 122, -56, 114, -104, -115, -126, -121, -111, -114, -115, -120, -103, Byte.MIN_VALUE, -109, -120, -114, -115, 63, -111, -108, -115, 63, -123, Byte.MIN_VALUE, -120, -117, -124, -125, 90, 63, -123, -114, -111, -126, -120, -115, -122, 63, -120, -115, 63, 68, -125, 63, -110, -124, -126, -114, -115, -125, -110, -103, -84, -91, -101, -93, -100, -86, -107, -95, -96, -90, -105, -86, -90, -122, -125, -106, -125, -89, -86, -81, -88, -90, -77, -79, -77, -86, -81, -75, -39, -54, -30, -43, -40, -54, -51, -90, -45, -58, -57, -45, -58, -44, -55, -40, -53, -41, -37, -53, -39, -38, -34, -47, -35, -31, -43, -34, -47, -33, -65, -27, -38, -49, -83, -38, -48, -66, -47, -33, -47, -32, -60, -73, -59, -62, -63, -64, -59, -73, -19, -33, -20, -16, -33, -20, -55, -15, -24, -33, -34, -68, -17, -24, -34, -26, -33, -67, -20, -33, -37, -18, -33, -34, -44, -38, -49, -60, -55, -45, -48, -49, -54, -37, -62, -43, -54, -48, -49, -89, -54, -49, -54, -44, -55, -58, -59, -74, -68, -79, -90, -85, -75, -78, -79, -84, -67, -92, -73, -84, -78, -79, -106, -73, -92, -75, -73, -88, -89, -53, -72, -55, -66, -68, -53, -74, -55, -68, -67, -55, -68, -54, -65, -74, -54};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private synchronized void A08(Throwable th2) {
        Iterator<InterfaceC3922S2> it = this.A07.iterator();
        if (it.hasNext()) {
            it.next();
            new HashMap();
            new HashMap();
            throw new NullPointerException(A01(401, 23, 80));
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3290Hj
    public final synchronized InterfaceC3903Rj A4i(EnumC3904Rk enumC3904Rk) {
        if (enumC3904Rk.A02() != EnumC3906Rm.A03) {
            throw new IllegalArgumentException(A01(47, 59, 118));
        }
        if (this.A09.containsKey(enumC3904Rk)) {
            return this.A09.get(enumC3904Rk);
        }
        C3303Hw c3303Hw = new C3303Hw(enumC3904Rk);
        this.A09.put(enumC3904Rk, c3303Hw);
        Iterator<InterfaceC3922S2> it = this.A07.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A01(377, 24, 105));
        }
        String.format(Locale.US, A01(153, 35, 82), enumC3904Rk);
        return c3303Hw;
    }

    static {
        A05();
    }

    public C26586x(C26937f c26937f, InterfaceC27107w interfaceC27107w, InterfaceC3878RK interfaceC3878RK, String str, InterfaceC3918Ry interfaceC3918Ry, C3917Rx c3917Rx, InterfaceC3907Rn interfaceC3907Rn) {
        this.A00 = c26937f;
        this.A01 = interfaceC27107w;
        this.A02 = interfaceC3878RK;
        this.A06 = str;
        this.A05 = interfaceC3918Ry;
        this.A04 = c3917Rx;
        this.A03 = interfaceC3907Rn.A4V(this);
    }

    public static int A00(JSONObject jSONObject) throws JSONException {
        int i10 = jSONObject.getJSONObject(A01(335, 7, 80)).getInt(A01(446, 16, 70));
        if (i10 > 0) {
            return i10;
        }
        throw new JSONException(String.format(Locale.US, A01(129, 24, 117), Integer.valueOf(i10)));
    }

    private Set<InterfaceC3921S1> A02(JSONObject jSONObject) throws JSONException {
        HashSet hashSet = new HashSet();
        JSONObject jSONObject2 = jSONObject.getJSONObject(A01(369, 8, 65));
        JSONObject jSONObject3 = jSONObject.getJSONObject(A01(298, 7, 38));
        for (final C3303Hw c3303Hw : this.A09.values()) {
            switch (C3920S0.A01[EnumC3926S6.A00(jSONObject2.getString(c3303Hw.A7A().A03())).ordinal()]) {
                case 1:
                    final JSONObject data = jSONObject3.getJSONObject(c3303Hw.A7A().A03()).getJSONObject(A01(312, 4, 17));
                    final JSONObject responseObject = jSONObject3.getJSONObject(c3303Hw.A7A().A03()).optJSONObject(A01(316, 11, 48));
                    hashSet.add(new AbstractC3268HN(c3303Hw, data, responseObject) { // from class: com.facebook.ads.redexgen.X.70
                        public final JSONObject A00;
                        public final JSONObject A01;

                        {
                            EnumC3926S6 enumC3926S6 = EnumC3926S6.A03;
                            this.A00 = data;
                            this.A01 = responseObject;
                        }

                        @Override // com.facebook.ads.redexgen.uinode.AbstractC3268HN, com.facebook.ads.redexgen.uinode.InterfaceC3921S1
                        public final void A3Z(Map<InterfaceC3903Rj, EnumC3926S6> map, Map<SyncModifiableBundle, EnumC3913Rt> map2) {
                            super.A00.A03(this.A00, this.A01);
                            super.A3Z(map, map2);
                        }
                    });
                    break;
                case 2:
                    hashSet.add(new AbstractC3268HN(c3303Hw) { // from class: com.facebook.ads.redexgen.X.6z
                        {
                            EnumC3926S6 enumC3926S6 = EnumC3926S6.A04;
                        }
                    });
                    break;
                default:
                    throw new AssertionError();
            }
        }
        Iterator<AbstractC266374> it = this.A08.values().iterator();
        while (it.hasNext()) {
            it.next();
            final AbstractC266374 abstractC266374 = null;
            switch (C3920S0.A00[EnumC3913Rt.A00(jSONObject2.getString(abstractC266374.A7A().A03())).ordinal()]) {
                case 1:
                    hashSet.add(new AbstractC3274HT(abstractC266374) { // from class: com.facebook.ads.redexgen.X.73
                        {
                            EnumC3913Rt enumC3913Rt = EnumC3913Rt.A04;
                        }
                    });
                    break;
                case 2:
                    hashSet.add(new AbstractC3274HT(abstractC266374) { // from class: com.facebook.ads.redexgen.X.6y
                        public static byte[] A00;

                        static {
                            A01();
                        }

                        public static String A00(int i10, int i11, int i12) {
                            byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
                            for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                                copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 52);
                            }
                            return new String(copyOfRange);
                        }

                        public static void A01() {
                            A00 = new byte[]{19, 5, 20, 50, 5, 17, 21, 9, 18, 5, 19, 51, 25, 14, 3};
                        }

                        {
                            EnumC3913Rt enumC3913Rt = EnumC3913Rt.A05;
                        }

                        @Override // com.facebook.ads.redexgen.uinode.AbstractC3274HT, com.facebook.ads.redexgen.uinode.InterfaceC3921S1
                        public final void A3Z(Map<InterfaceC3903Rj, EnumC3926S6> map, Map<SyncModifiableBundle, EnumC3913Rt> map2) {
                            throw new NullPointerException(A00(0, 15, 84));
                        }
                    });
                    break;
                default:
                    throw new AssertionError();
            }
        }
        return hashSet;
    }

    private JSONObject A03(Map<InterfaceC3903Rj, EnumC3925S5> map, Map<SyncModifiableBundle, EnumC3912Rs> map2, Map<SyncModifiableBundle, JSONObject> clientBundleData, Map<SyncModifiableBundle, JSONObject> clientBundleFingerprint) throws JSONException {
        String A01;
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<InterfaceC3903Rj, EnumC3925S5> entry : map.entrySet()) {
            jSONObject.put(entry.getKey().A7A().A03(), entry.getValue().A02());
        }
        for (Map.Entry<SyncModifiableBundle, EnumC3912Rs> entry2 : map2.entrySet()) {
            entry2.getKey();
            InterfaceC3903Rj interfaceC3903Rj = null;
            jSONObject.put(interfaceC3903Rj.A7A().A03(), entry2.getValue().A02());
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<Map.Entry<InterfaceC3903Rj, EnumC3925S5>> it = map.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            A01 = A01(316, 11, 48);
            if (!hasNext) {
                break;
            }
            Map.Entry<InterfaceC3903Rj, EnumC3925S5> next = it.next();
            if (next.getValue() == EnumC3925S5.A04) {
                JSONObject bundles = new JSONObject();
                InterfaceC3903Rj key = next.getKey();
                jSONObject2.put(key.A7A().A03(), bundles);
                if (next.getKey().A7A().A04()) {
                    JSONObject request = key.A75();
                    bundles.put(A01, request);
                } else {
                    bundles.put(A01, JSONObject.NULL);
                }
                jSONObject2.put(key.A7A().A03(), bundles);
            }
        }
        for (Map.Entry<SyncModifiableBundle, EnumC3912Rs> entry3 : map2.entrySet()) {
            JSONObject updateData = new JSONObject();
            InterfaceC3903Rj key2 = entry3.getKey();
            JSONObject request2 = clientBundleFingerprint.get(entry3.getKey());
            updateData.put(A01, request2);
            if (entry3.getValue() == EnumC3912Rs.A05) {
                String A012 = A01(312, 4, 17);
                JSONObject request3 = clientBundleData.get(key2);
                updateData.put(A012, request3);
                jSONObject2.put(key2.A7A().A03(), updateData);
            } else {
                String A03 = key2.A7A().A03();
                String[] strArr = A0B;
                if (strArr[1].charAt(20) == strArr[6].charAt(20)) {
                    throw new RuntimeException();
                }
                A0B[5] = "j6hI8A69HBwx3QyEu85lNgwu8aXeWQ7U";
                jSONObject2.put(A03, updateData);
            }
        }
        JSONObject bundleData = new JSONObject();
        for (Map.Entry<String, String> entry4 : this.A05.A6x().entrySet()) {
            if (entry4.getValue() != null) {
                bundleData.put(entry4.getKey(), entry4.getValue());
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(A01(342, 7, 85), jSONObject);
        jSONObject3.put(A01(298, 7, 38), jSONObject2);
        jSONObject3.put(A01(305, 7, 33), bundleData);
        return jSONObject3;
    }

    public static void A06(String str, AtomicReference<JSONObject> atomicReference, AtomicReference<Throwable> atomicReference2) {
        String.format(Locale.US, A01(221, 28, 68), str);
        try {
            atomicReference.set((JSONObject) new JSONTokener(str).nextValue());
        } catch (ClassCastException | JSONException e10) {
            atomicReference2.set(e10);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3290Hj, com.facebook.ads.redexgen.uinode.InterfaceC26997l
    public final void A5m() {
        this.A03.A5l();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3908Ro
    public final void AFP() {
        if (this.A01.A9F()) {
            String str = A01(106, 23, 86) + this.A01.A6i().A07() + A01(0, 29, 52);
            A08(new C3924S4());
            return;
        }
        try {
            if (!C3348Ih.A1e(this.A00) || this.A00.A03().A94()) {
                A04();
                return;
            }
            throw new IllegalStateException(A01(29, 18, 126));
        } catch (Throwable th2) {
            String.format(Locale.US, A01(249, 49, 14), Integer.valueOf(this.A04.A01()));
            A08(th2);
            this.A03.A5k(this.A04.A01());
        }
    }
}
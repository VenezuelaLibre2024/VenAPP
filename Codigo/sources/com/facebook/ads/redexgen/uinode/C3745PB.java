package com.facebook.ads.redexgen.uinode;

import android.os.Build;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.PB */
/* loaded from: assets/audience_network.dex */
public final class C3745PB {
    public static byte[] A0K;
    public static final AtomicInteger A0L;
    public static final AtomicInteger A0M;
    public InterfaceC3734P0 A02;
    public InterfaceC3743P9 A03;
    public InterfaceC3744PA A04;
    public C3872RE A05;
    public final int A08;
    public final AbstractC4476b5 A09;
    public final C26416c A0A;
    public final C4337Yn A0B;
    public final InterfaceC3369J2 A0C;
    public final C3377JA A0D;
    public final C3732Oy A0E;
    public final C3996TE A0F;
    public final C3756PM A0G;
    public final C3757PN A0H;
    public final String A0I;
    public final LinkedList<C3742P8> A0J = new LinkedList<>();
    public C3528Lg A01 = new C3528Lg();
    public boolean A07 = true;
    public boolean A06 = false;
    public long A00 = -1;

    public static String A0A(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0K, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 2);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0K = new byte[]{37, 63, 39, 56, 62, 39, 57, 13, 34, 40, 62, 35, 37, 40, 5, 34, 56, 41, 62, 42, 45, 47, 41, 5, 0, 54, 1, 20, 11, 22, 16, 13, 10, 3, 34, 13, 10, 13, 23, 12, 1, 0, 76, 67, 65, 23, 67, 77, 95, 96, 101, 83, 100, 113, 110, 115, 117, 104, 111, 102, 82, 117, 96, 115, 117, 100, 101, 41, 38, 36, 114, 38, 40, 58, 34, 55, 55, 34, 32, 43, 38, 39, 20, 21, 13, 54, 46, 10, 9, 28, 11, 0, 13, 12, 46, 26, 9, 5, 13, 44, 9, 28, 9, 84, 66, 69, 69, 82, 89, 67, 96, 97, 121, 66, 90, 48, 36, 55, 59, 51, 37, 120, 121, 86, 116, 99, 126, 97, 126, 99, 110, 71, 118, 98, 100, 114, 115, 63, 48, 50, 100, 48, 62, 44, 36, 37, 10, 40, 63, 34, 61, 34, 63, 50, 25, 46, 56, 62, 38, 46, 47, 99, 108, 110, 56, 108, 98, 112, 83, 82, Byte.MAX_VALUE, 80, 83, 79, 89, 122, 73, 80, 80, 79, 95, 78, 89, 89, 82, 106, 85, 89, 75, 20, 27, 25, 79, 27, 21, 67, 66, 106, 89, 64, 64, 95, 79, 94, 73, 73, 66, 122, 69, 73, 91, 4, 11, 9, 95, 11, 5, 72, 73, 113, 70, 75, 82, 66, 117, 66, 70, 67, 15, 0, 2, 84, 0, 11, 7, 0, 2, 84, 0, 11, 7, 0, 2, 84, 0, 14, 28, 120, 121, 65, 118, 123, 98, 114, 64, 101, 126, 99, 99, 114, 121, 63, 48, 50, 100, 48, 59, 55, 48, 50, 100, 48, 62, 44, 106, 124, 122, 118, 119, 125, 70, 122, 113, 120, 119, 119, 124, 117, 20, 2, 19, 38, 18, 19, 15, 44, 2, 30, 79, 64, 66, 20, 64, 75, 64, 66, 20, 64, 78, 92, 77, 91, 74, 124, 95, 77, 91, 8, 10, Byte.MAX_VALUE, 77, 77, 91, 74, 77, 22, 25, 27, 77, 25, 18, 25, 27, 77, 25, 23, 2, 20, 5, 51, 16, 2, 20, 71, 69, 50, 30, 31, 23, 24, 22, 89, 86, 84, 2, 86, 93, 86, 84, 2, 86, 88, 57, 34, 57, 44, 33, 26, 27, 3, 56, 32, 38, 33, 63, 29, 2, 15, 14, 4, 46, 29, 14, 5, 31, 67, 76, 78, 24, 76, 71, 75, 76, 78, 24, 76, 71, 75, 76, 78, 24, 76, 66, 80, 14, 17, 29, 15, 42, 29, 25, 28, 1, 44, 23, 43, 16, 23, 15, 80, 95, 93, 11, 95, 81, 67};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 21
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final void A0i(Map<String, String> map) {
        String A0A = A0A(87, 16, 106);
        if (map.containsKey(A0A) && C3348Ih.A1X(this.A0B)) {
            try {
                JSONArray jSONArray = new JSONArray(map.get(A0A));
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONArray jSONArray2 = new JSONArray(jSONArray.getString(i10));
                    String string = jSONArray2.getString(0);
                    String string2 = jSONArray2.getString(1);
                    String string3 = jSONArray2.getString(2);
                    String string4 = jSONArray2.getString(3);
                    if (string != null && string2 != null && string3 != null) {
                        C3955SZ c3955sz = new C3955SZ(this.A09.A12(), Long.parseLong(string), Long.parseLong(string2), Long.parseLong(string3));
                        c3955sz.A06(Long.parseLong(string4));
                        arrayList.add(c3955sz);
                    }
                }
                String A04 = C3954SY.A04(arrayList);
                HashMap hashMap = new HashMap();
                hashMap.put(A0A(115, 6, 84), A04);
                if (A04 != null) {
                    this.A0C.AA1(this.A09.A12(), hashMap);
                }
            } catch (Exception e10) {
                this.A0B.A07().A9a(A0A(274, 14, 27), 3600, new C27258B(e10));
            }
        }
        if (map.containsKey(A0A)) {
            map.remove(A0A);
        }
        this.A0C.A9Z(this.A09.A12(), new C3654Ni(map).A03(this.A05).A05());
    }

    static {
        A0D();
        A0M = new AtomicInteger();
        A0L = new AtomicInteger();
    }

    public C3745PB(C4337Yn c4337Yn, AbstractC4476b5 abstractC4476b5, InterfaceC3369J2 interfaceC3369J2, int i10) {
        this.A0B = c4337Yn;
        this.A0C = interfaceC3369J2;
        this.A09 = abstractC4476b5;
        this.A08 = i10;
        this.A0F = new C3996TE(this, c4337Yn);
        C26416c c26416c = new C26416c(c4337Yn);
        this.A0A = c26416c;
        C3377JA c3377ja = new C3377JA(abstractC4476b5.A12(), interfaceC3369J2);
        this.A0D = c3377ja;
        C3732Oy c3732Oy = new C3732Oy(abstractC4476b5.A0S(), abstractC4476b5.A0x().A0D().A08(), i10);
        this.A0E = c3732Oy;
        String uuid = UUID.randomUUID().toString();
        this.A0I = uuid;
        this.A0H = AbstractC3758PO.A00(c4337Yn, abstractC4476b5.A0V(), c26416c, c3377ja, c3732Oy, A0H());
        this.A0G = new C3756PM(c4337Yn, this, interfaceC3369J2, c3732Oy, uuid, abstractC4476b5.A12());
    }

    public static AtomicInteger A0B() {
        return A0L;
    }

    private void A0C() {
        A0F(new C3742P8(A0A(288, 22, 101), new String[]{this.A0I, A0A(1, 6, 11)}));
        String assets = Base64.encodeToString(this.A0H.A04.toString().getBytes(), 0).replace(A0A(0, 1, 45), A0A(0, 0, 109));
        String assets2 = this.A0I;
        A0F(new C3742P8(A0A(310, 26, 60), new String[]{assets, assets2}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A0E() {
        if (this.A06) {
            while (!this.A0J.isEmpty()) {
                C3742P8 poll = this.A0J.poll();
                if (poll != null) {
                    this.A0F.A05(String.format(Locale.US, poll.A00, poll.A02));
                    if (poll.A01) {
                        this.A0D.A04(EnumC3376J9.A0L, null);
                        this.A0B.A0E().A5G(poll.A00);
                    }
                }
            }
        }
    }

    private synchronized void A0F(C3742P8 c3742p8) {
        this.A0J.offer(c3742p8);
        A0E();
    }

    private boolean A0H() {
        return !A0I();
    }

    private boolean A0I() {
        return C3348Ih.A2R(this.A0B, C3854Qw.A03());
    }

    public final C3377JA A0K() {
        return this.A0D;
    }

    public final C3528Lg A0L() {
        return this.A01;
    }

    public final C3732Oy A0M() {
        return this.A0E;
    }

    public final InterfaceC3734P0 A0N() {
        return this.A02;
    }

    public final C3996TE A0O() {
        return this.A0F;
    }

    public final void A0P() {
        A0F(new C3742P8(A0A(23, 26, 102), new String[]{this.A0I}));
    }

    public final void A0Q() {
        A0F(new C3742P8(A0A(49, 25, 3), new String[]{this.A0I}));
    }

    public final void A0R() {
        this.A07 = true;
    }

    public final void A0S() {
        this.A07 = false;
    }

    public final void A0T() {
        A0F(new C3742P8(A0A(121, 23, 21), new String[]{this.A0I}));
    }

    public final void A0U() {
        A0F(new C3742P8(A0A(168, 27, 62), new String[]{this.A0I}));
    }

    public final void A0V() {
        A0F(new C3742P8(A0A(195, 22, 46), new String[]{this.A0I}));
    }

    public final void A0W() {
        A0F(new C3742P8(A0A(404, 22, 122), new String[]{this.A0I}));
    }

    public final void A0X() {
        if (Build.VERSION.SDK_INT > 16) {
            this.A0F.addJavascriptInterface(this.A0G, A0A(7, 16, 78));
        }
        this.A0D.A04(EnumC3376J9.A0O, null);
        String str = this.A0H.A00;
        this.A0F.loadUrl(str);
        this.A00 = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            String url = A0A(372, 3, 81);
            jSONObject.put(url, str);
            String url2 = A0A(103, 12, 53);
            jSONObject.put(url2, AbstractC3746PC.A00());
            String url3 = A0A(362, 10, 79);
            jSONObject.put(url3, A0M.getAndIncrement());
            String url4 = A0A(74, 13, 65);
            jSONObject.put(url4, A0L);
        } catch (JSONException unused) {
        }
        this.A0B.A0E().A5M(jSONObject.toString());
        A0C();
    }

    public final void A0Y() {
        A0F(new C3742P8(A0A(144, 24, 73), new String[]{this.A0I}));
    }

    public final void A0Z(C3528Lg c3528Lg) {
        this.A01 = c3528Lg;
    }

    public final void A0a(InterfaceC3734P0 interfaceC3734P0) {
        this.A02 = interfaceC3734P0;
    }

    public final void A0b(InterfaceC3743P9 interfaceC3743P9) {
        this.A03 = interfaceC3743P9;
    }

    public final void A0c(InterfaceC3744PA interfaceC3744PA) {
        this.A04 = interfaceC3744PA;
    }

    public final void A0d(InterfaceC3995TD interfaceC3995TD) {
        this.A0G.A0N(interfaceC3995TD);
    }

    public final void A0e(C3872RE c3872re) {
        this.A05 = c3872re;
    }

    public final void A0f(String str) {
        A0F(new C3742P8(A0A(247, 27, 21), new String[]{this.A0I, str}));
    }

    public final void A0g(String str, String str2) {
        A0F(new C3742P8(A0A(217, 30, 37), new String[]{this.A0I, str, str2}));
    }

    public final void A0h(String str, JSONObject jSONObject) {
        A0F(new C3742P8(A0A(375, 29, 105), new String[]{this.A0I, str, jSONObject.toString()}, false));
    }

    public final void A0j(JSONObject jSONObject) {
        String replace = Base64.encodeToString(jSONObject.toString().getBytes(), 0).replace(A0A(0, 1, 45), A0A(0, 0, 109));
        String assets = this.A0I;
        A0F(new C3742P8(A0A(336, 26, 115), new String[]{replace, assets}));
    }

    public final boolean A0k() {
        return this.A0G.A0O();
    }

    public final boolean A0l() {
        return this.A07;
    }
}
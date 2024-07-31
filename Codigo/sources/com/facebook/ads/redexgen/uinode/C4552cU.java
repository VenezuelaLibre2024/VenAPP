package com.facebook.ads.redexgen.uinode;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.cU */
/* loaded from: assets/audience_network.dex */
public final class C4552cU {
    public InterfaceC4553cV A00;
    public C4539cH A01;
    public final InterfaceC4562ce A03;
    public final InterfaceC4554cW A04;
    public final LinkedHashMap<Integer, Runnable> A05 = new LinkedHashMap<>();
    public final InterfaceC4553cV A02 = new C3258HD(this);

    public C4552cU(InterfaceC4562ce interfaceC4562ce, InterfaceC4554cW interfaceC4554cW) {
        this.A03 = interfaceC4562ce;
        this.A04 = interfaceC4554cW;
    }

    public static C4552cU A01() {
        return new C4552cU(new C3262HH(), null);
    }

    private void A03(AbstractC4556cY abstractC4556cY, InterfaceC4560cc interfaceC4560cc, InterfaceC3256HB interfaceC3256HB) {
        C4539cH A00 = C4539cH.A00(abstractC4556cY, interfaceC4560cc, interfaceC3256HB);
        this.A01 = A00;
        if (0 != 0) {
            A00.A01(null);
        }
        this.A01.A02(this.A02);
    }

    private final void A04(DspViewableNode dspViewableNode) {
        C4539cH localViewpointWatcher = this.A01;
        if (localViewpointWatcher != null && dspViewableNode != null) {
            localViewpointWatcher.A03(dspViewableNode);
        }
    }

    private final void A05(DspViewableNode dspViewableNode, C4558ca c4558ca) {
        C4539cH localViewpointWatcher = this.A01;
        if (localViewpointWatcher != null && dspViewableNode != null && c4558ca != null) {
            localViewpointWatcher.A04(dspViewableNode, c4558ca);
        }
    }

    public final void A06(View view) {
        A04(view != null ? ViewpointViewNode.A00(view) : null);
    }

    public final void A07(View view, C4558ca c4558ca) {
        A05(view != null ? ViewpointViewNode.A00(view) : null, c4558ca);
    }

    public final void A08(AbstractC4556cY abstractC4556cY, View view) {
        if (abstractC4556cY != null && view != null) {
            final InterfaceC4554cW interfaceC4554cW = null;
            A03(abstractC4556cY, new C3259HE(view, this.A03), new InterfaceC3256HB(interfaceC4554cW) { // from class: com.facebook.ads.redexgen.X.6w
                public static byte[] A09;
                public static String[] A0A = {"okBgSYhQGmV0QyU32992deBLR6XrdaZQ", "E", "ZDdZ5rthnspWTI3gzSJHBR7aYCyAxUsq", "EsXM2pc2I6J3hYC1V9OQRTCtALa8wmqB", "DKA0ex9266tXplnV6PUb8C0vdYHWYjG4", "tBgdKBpc94v7LWesC8aTGIaQqZdJYwjy", "iZindrm9v6DBRttH7DMzAa7", "d9237vu9oQoOcpvZwewcjFUDz74P7MIA"};
                public static final String A0B;
                public long A00;
                public InterfaceC4555cX A01;
                public final InterfaceC4554cW A02;
                public final Map<String, C4544cM> A06 = new HashMap();
                public final C4545cN A04 = new C4545cN();
                public final C4545cN A03 = new C4545cN();
                public final List<Rect> A05 = new ArrayList(1);
                public final boolean A08 = false;
                public final boolean A07 = false;

                public static String A02(int i10, int i11, int i12) {
                    byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
                    for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                        copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 91);
                    }
                    return new String(copyOfRange);
                }

                public static void A03() {
                    A09 = new byte[]{41, 21, 20, 14, 93, 11, 20, 24, 10, 13, 18, 20, 19, 9, 93, 21, 28, 14, 93, 19, 18, 9, 93, 31, 24, 24, 19, 93, 16, 24, 28, 14, 8, 15, 24, 25, 93, 18, 15, 93, 20, 14, 93, 28, 93, 26, 15, 18, 8, 13, 93, 10, 21, 20, 30, 21, 93, 10, 20, 17, 17, 93, 19, 24, 11, 24, 15, 93, 15, 24, 9, 8, 15, 19, 93, 28, 93, 16, 24, 28, 14, 8, 15, 24, 16, 24, 19, 9, 93, 14, 20, 19, 30, 24, 93, 20, 9, 90, 14, 93, 16, 28, 25, 24, 93, 8, 13, 93, 18, 27, 93, 14, 8, 31, 11, 20, 24, 10, 14, 93, 9, 21, 28, 9, 93, 30, 18, 8, 17, 25, 93, 31, 24, 93, 18, 27, 27, 14, 30, 15, 24, 24, 19, 118, 125, 111, 75, 123, 121, 118, 63, 36, 61, 61, 113, 39, 56, 52, 38, 113, 33, 35, 62, 33, 52, 35, 37, 40, 113, 55, 62, 35, 113, 35, 52, 60, 62, 39, 52, 53, 113, 56, 37, 52, 60, 113, 125, 97, 104, 122, 92, 107, 126, 97, 124, 122};
                }

                static {
                    A03();
                    A0B = C26576w.class.getSimpleName();
                }

                {
                    this.A02 = interfaceC4554cW;
                }

                public static Rect A00(C4544cM c4544cM) {
                    Rect rect;
                    Rect rect2;
                    Rect rect3;
                    Rect rect4;
                    Rect rect5;
                    if (c4544cM != null) {
                        rect = c4544cM.A02;
                        if (rect.top != Integer.MIN_VALUE) {
                            rect2 = c4544cM.A02;
                            if (rect2.left != Integer.MIN_VALUE) {
                                rect3 = c4544cM.A02;
                                String[] strArr = A0A;
                                if (strArr[1].length() == strArr[6].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A0A;
                                strArr2[1] = "p";
                                strArr2[6] = "Kr6mbDoiLKwWSgNyXDF2oJW";
                                if (rect3.right != Integer.MIN_VALUE) {
                                    rect4 = c4544cM.A02;
                                    if (rect4.bottom != Integer.MIN_VALUE) {
                                        rect5 = c4544cM.A02;
                                        return rect5;
                                    }
                                }
                            }
                        }
                    }
                    throw new IllegalStateException(A02(0, 143, 38));
                }

                private C4544cM A01(C4558ca c4558ca, Rect rect, Rect rect2) {
                    boolean A06;
                    Rect rect3;
                    List list;
                    C4544cM c4544cM = this.A06.get(c4558ca.A04);
                    A06 = this.A04.A06(c4558ca);
                    if (A06) {
                        if (c4544cM != null) {
                            c4544cM.A01 = EnumC4548cQ.A04;
                        } else {
                            c4544cM = C4544cM.A03(this.A00);
                            this.A06.put(c4558ca.A04, c4544cM);
                        }
                    }
                    rect3 = c4544cM.A02;
                    rect3.set(rect2);
                    list = c4544cM.A03;
                    list.add(new Rect(rect));
                    return c4544cM;
                }

                private void A04(C4545cN c4545cN) {
                    Collection<C4558ca> A01;
                    List list;
                    A01 = c4545cN.A01();
                    for (C4558ca c4558ca : A01) {
                        C4544cM c4544cM = this.A06.get(c4558ca.A04);
                        if (c4544cM == null) {
                            if (0 != 0) {
                                String str = A02(150, 36, 10) + c4558ca.A04;
                                throw new NullPointerException(A02(186, 10, 85));
                            }
                        } else {
                            c4544cM.A01 = EnumC4548cQ.A03;
                            list = c4544cM.A03;
                            list.clear();
                            c4558ca.A03(this);
                            if (this.A08) {
                                Map<String, C4544cM> map = this.A06;
                                String[] strArr = A0A;
                                if (strArr[0].charAt(8) == strArr[2].charAt(8)) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A0A;
                                strArr2[0] = "dCpYPRypiVOHB4OlkAqBqk8EySqTLE1k";
                                strArr2[2] = "r3sjB169HJX8vOmMpko73ANLsggTEmi2";
                                map.remove(c4544cM);
                            } else {
                                continue;
                            }
                        }
                    }
                }

                private void A05(C4545cN c4545cN) {
                    Collection A00;
                    A00 = c4545cN.A00();
                    Iterator it = A00.iterator();
                    while (it.hasNext()) {
                        ((C4558ca) it.next()).A03(this);
                    }
                }

                @Override // com.facebook.ads.redexgen.uinode.InterfaceC3256HB
                public final void A3V(C4558ca c4558ca, Rect rect, Rect rect2) {
                    boolean A06;
                    List list;
                    Rect rect3;
                    List list2;
                    A01(c4558ca, rect, rect2);
                    C4558ca c4558ca2 = c4558ca.A01;
                    C4558ca parentViewpointData = C4558ca.A08;
                    if (c4558ca2 == parentViewpointData) {
                        return;
                    }
                    A06 = this.A03.A06(c4558ca2);
                    C4544cM parentViewProperties = this.A06.get(c4558ca2.A04);
                    if (A06) {
                        if (parentViewProperties == null) {
                            parentViewProperties = C4544cM.A03(this.A00);
                            rect3 = parentViewProperties.A02;
                            rect3.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                            this.A06.put(c4558ca2.A04, parentViewProperties);
                        } else {
                            list2 = parentViewProperties.A03;
                            list2.clear();
                            if (!this.A07 || c4558ca2.A04()) {
                                parentViewProperties.A01 = EnumC4548cQ.A04;
                            }
                        }
                    }
                    list = parentViewProperties.A03;
                    list.add(new Rect(rect));
                }

                @Override // com.facebook.ads.redexgen.uinode.InterfaceC3256HB
                public final void A41(long j10, List<Rect> viewportRects) {
                    Collection A01;
                    Collection A012;
                    List list;
                    this.A00 = j10;
                    this.A05.clear();
                    Iterator<Rect> it = viewportRects.iterator();
                    while (it.hasNext()) {
                        this.A05.add(new Rect(it.next()));
                    }
                    A01 = this.A04.A01();
                    Iterator it2 = A01.iterator();
                    while (it2.hasNext()) {
                        this.A06.remove(((C4558ca) it2.next()).A04);
                    }
                    A012 = this.A03.A01();
                    Iterator it3 = A012.iterator();
                    while (it3.hasNext()) {
                        this.A06.remove(((C4558ca) it3.next()).A04);
                    }
                    Iterator<C4544cM> it4 = this.A06.values().iterator();
                    while (it4.hasNext()) {
                        list = it4.next().A03;
                        list.clear();
                    }
                    this.A04.A04();
                    this.A03.A04();
                }

                @Override // com.facebook.ads.redexgen.uinode.InterfaceC3256HB
                public final void A5Z() {
                    Collection A00;
                    Collection A002;
                    A05(this.A04);
                    A04(this.A04);
                    A05(this.A03);
                    A04(this.A03);
                    if (0 != 0) {
                        String obj = toString();
                        List<Rect> list = this.A05;
                        A00 = this.A04.A00();
                        A002 = this.A03.A00();
                        new C4543cL(obj, this, list, A00, A002);
                        throw new NullPointerException(A02(143, 7, 67));
                    }
                }

                @Override // com.facebook.ads.redexgen.uinode.InterfaceC4547cP
                public final void A78(C4558ca c4558ca, Rect rect) {
                    List list;
                    rect.setEmpty();
                    list = this.A06.get(c4558ca.A04).A03;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        rect.union((Rect) it.next());
                    }
                }

                @Override // com.facebook.ads.redexgen.uinode.InterfaceC4547cP
                public final EnumC4548cQ A8J(C4558ca c4558ca) {
                    EnumC4548cQ enumC4548cQ;
                    enumC4548cQ = this.A06.get(c4558ca.A04).A01;
                    return enumC4548cQ;
                }

                @Override // com.facebook.ads.redexgen.uinode.InterfaceC4547cP
                public final void A8L(Rect rect) {
                    rect.setEmpty();
                    Iterator<Rect> it = this.A05.iterator();
                    while (it.hasNext()) {
                        rect.union(it.next());
                    }
                }

                @Override // com.facebook.ads.redexgen.uinode.InterfaceC4547cP
                public final float A8M(C4558ca c4558ca) {
                    List<Rect> list;
                    C4544cM c4544cM = this.A06.get(c4558ca.A04);
                    if (c4544cM != null) {
                        Rect A00 = A00(c4544cM);
                        int height = A00.height() * A00.width();
                        int totalVisibleArea = 0;
                        list = c4544cM.A03;
                        for (Rect rect : list) {
                            totalVisibleArea += rect.height() * rect.width();
                        }
                        return totalVisibleArea / height;
                    }
                    return 0.0f;
                }

                @Override // com.facebook.ads.redexgen.uinode.InterfaceC3256HB
                public final void AGH(InterfaceC4555cX interfaceC4555cX) {
                    this.A01 = interfaceC4555cX;
                }
            });
        }
    }
}

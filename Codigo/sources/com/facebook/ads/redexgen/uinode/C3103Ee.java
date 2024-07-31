package com.facebook.ads.redexgen.uinode;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ee */
/* loaded from: assets/audience_network.dex */
public final class C3103Ee extends AbstractC4386Za {
    public static TimeInterpolator A0B;
    public static String[] A0C = {"K3xavpXOVVnTPS8V8FmisIpuez1NdmFn", "QjoCrUVtXYT15qNhmppxWCsnlOvXMRWn", "HVYav4KnfeU3lAWSFDiSVAYelCZD7hW1", "SKhwmHHGUoQzTLK2kw5WKB1efbL3jYLm", "aZpNXGptJoOcjVlsPlgA0RFw1bcc4fI1", "y8DDj9eTKGlZyxtiH83YwnquX80t2qUq", "Eqht3urb", "PkOCx2w9GPXTa0iGANdHxOJetOGxrMw0"};
    public ArrayList<AbstractC254856> A0A = new ArrayList<>();
    public ArrayList<AbstractC254856> A07 = new ArrayList<>();
    public ArrayList<C25034M> A09 = new ArrayList<>();
    public ArrayList<C25024L> A08 = new ArrayList<>();
    public ArrayList<ArrayList<AbstractC254856>> A01 = new ArrayList<>();
    public ArrayList<ArrayList<C25034M>> A05 = new ArrayList<>();
    public ArrayList<ArrayList<C25024L>> A03 = new ArrayList<>();
    public ArrayList<AbstractC254856> A00 = new ArrayList<>();
    public ArrayList<AbstractC254856> A04 = new ArrayList<>();
    public ArrayList<AbstractC254856> A06 = new ArrayList<>();
    public ArrayList<AbstractC254856> A02 = new ArrayList<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC25264k
    public final void A0I() {
        for (int size = this.A09.size() - 1; size >= 0; size--) {
            C25034M c25034m = this.A09.get(size);
            View view = c25034m.A04.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A0O(c25034m.A04);
            this.A09.remove(size);
        }
        for (int size2 = this.A0A.size() - 1; size2 >= 0; size2--) {
            A0P(this.A0A.get(size2));
            this.A0A.remove(size2);
        }
        for (int size3 = this.A07.size() - 1; size3 >= 0; size3--) {
            AbstractC254856 abstractC254856 = this.A07.get(size3);
            abstractC254856.A0H.setAlpha(1.0f);
            A0N(abstractC254856);
            this.A07.remove(size3);
        }
        for (int size4 = this.A08.size() - 1; size4 >= 0; size4--) {
            A01(this.A08.get(size4));
        }
        this.A08.clear();
        if (A0L()) {
            for (int size5 = this.A05.size() - 1; size5 >= 0; size5--) {
                ArrayList<C25034M> arrayList = this.A05.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C25034M c25034m2 = arrayList.get(size6);
                    View view2 = c25034m2.A04.A0H;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    A0O(c25034m2.A04);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.A05.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.A01.size() - 1; size7 >= 0; size7--) {
                ArrayList<AbstractC254856> arrayList2 = this.A01.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    AbstractC254856 abstractC2548562 = arrayList2.get(size8);
                    abstractC2548562.A0H.setAlpha(1.0f);
                    A0N(abstractC2548562);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.A01.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.A03.size() - 1; size9 >= 0; size9--) {
                ArrayList<C25024L> arrayList3 = this.A03.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    A01(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.A03.remove(arrayList3);
                    }
                }
            }
            A05(this.A06);
            A05(this.A04);
            A05(this.A00);
            A05(this.A02);
            A0A();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC25264k
    public final void A0J() {
        boolean z10 = !this.A0A.isEmpty();
        boolean z11 = !this.A09.isEmpty();
        boolean z12 = !this.A08.isEmpty();
        boolean z13 = !this.A07.isEmpty();
        if (z10 || z11 || z13 || z12) {
            Iterator<AbstractC254856> it = this.A0A.iterator();
            while (it.hasNext()) {
                A03(it.next());
            }
            this.A0A.clear();
            if (z11) {
                final ArrayList<C25034M> arrayList = new ArrayList<>();
                arrayList.addAll(this.A09);
                this.A05.add(arrayList);
                this.A09.clear();
                Runnable runnable = new Runnable() { // from class: com.facebook.ads.redexgen.X.4D
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            C25034M c25034m = (C25034M) it2.next();
                            C3103Ee.this.A0Y(c25034m.A04, c25034m.A00, c25034m.A01, c25034m.A02, c25034m.A03);
                        }
                        arrayList.clear();
                        C3103Ee.this.A05.remove(arrayList);
                    }
                };
                if (z10) {
                    AbstractC24493T.A0E(arrayList.get(0).A04.A0H, runnable, A07());
                } else {
                    runnable.run();
                }
            }
            if (z12) {
                final ArrayList<C25024L> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.A08);
                this.A03.add(arrayList2);
                this.A08.clear();
                Runnable runnable2 = new Runnable() { // from class: com.facebook.ads.redexgen.X.4E
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            C25024L change = (C25024L) it2.next();
                            C3103Ee.this.A0W(change);
                        }
                        arrayList2.clear();
                        C3103Ee.this.A03.remove(arrayList2);
                    }
                };
                if (z10) {
                    AbstractC24493T.A0E(arrayList2.get(0).A05.A0H, runnable2, A07());
                } else {
                    runnable2.run();
                }
            }
            if (z13) {
                final ArrayList<AbstractC254856> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.A07);
                this.A01.add(arrayList3);
                this.A07.clear();
                Runnable runnable3 = new Runnable() { // from class: com.facebook.ads.redexgen.X.4F
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            AbstractC254856 holder = (AbstractC254856) it2.next();
                            C3103Ee.this.A0X(holder);
                        }
                        arrayList3.clear();
                        C3103Ee.this.A01.remove(arrayList3);
                    }
                };
                if (!z10 && !z11 && !z12) {
                    runnable3.run();
                    return;
                }
                if (A0C[0].charAt(3) == 'S') {
                    throw new RuntimeException();
                }
                String[] strArr = A0C;
                strArr[4] = "oGS3g0YSOogxL8fDiPQ9wWzcLRV8E0qu";
                strArr[3] = "UwBhVdK7HoWqzQqehBBKiWd5H5AJwN9O";
                AbstractC24493T.A0E(arrayList3.get(0).A0H, runnable3, Math.max(z11 ? A06() : 0L, z12 ? A05() : 0L) + (z10 ? A07() : 0L));
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC4386Za
    public final boolean A0T(AbstractC254856 abstractC254856, int i10, int i11, int i12, int i13) {
        View view = abstractC254856.A0H;
        int translationX = i10 + ((int) abstractC254856.A0H.getTranslationX());
        int translationY = i11 + ((int) abstractC254856.A0H.getTranslationY());
        A04(abstractC254856);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            A0O(abstractC254856);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.A09.add(new C25034M(abstractC254856, translationX, translationY, i12, i13));
        return true;
    }

    private void A01(C25024L c25024l) {
        if (c25024l.A05 != null) {
            A07(c25024l, c25024l.A05);
        }
        if (c25024l.A04 != null) {
            A07(c25024l, c25024l.A04);
        }
    }

    private void A03(final AbstractC254856 abstractC254856) {
        final View view = abstractC254856.A0H;
        final ViewPropertyAnimator animate = view.animate();
        this.A06.add(abstractC254856);
        ViewPropertyAnimator animation = animate.setDuration(A07());
        animation.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.4G
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                view.setAlpha(1.0f);
                C3103Ee.this.A0P(abstractC254856);
                C3103Ee.this.A06.remove(abstractC254856);
                C3103Ee.this.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }

    private void A04(AbstractC254856 abstractC254856) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        abstractC254856.A0H.animate().setInterpolator(A0B);
        A0K(abstractC254856);
    }

    private final void A05(List<AbstractC254856> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).A0H.animate().cancel();
        }
    }

    private void A06(List<C25024L> list, AbstractC254856 abstractC254856) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C25024L changeInfo = list.get(size);
            if (A07(changeInfo, abstractC254856) && changeInfo.A05 == null && changeInfo.A04 == null) {
                list.remove(changeInfo);
            }
        }
    }

    private boolean A07(C25024L c25024l, AbstractC254856 abstractC254856) {
        boolean z10 = false;
        if (c25024l.A04 == abstractC254856) {
            c25024l.A04 = null;
        } else if (c25024l.A05 == abstractC254856) {
            c25024l.A05 = null;
            z10 = true;
        } else {
            return false;
        }
        abstractC254856.A0H.setAlpha(1.0f);
        abstractC254856.A0H.setTranslationX(0.0f);
        abstractC254856.A0H.setTranslationY(0.0f);
        A0Q(abstractC254856, z10);
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25264k
    public final void A0K(AbstractC254856 abstractC254856) {
        View view = abstractC254856.A0H;
        view.animate().cancel();
        for (int i10 = this.A09.size() - 1; i10 >= 0; i10--) {
            if (this.A09.get(i10).A04 == abstractC254856) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A0O(abstractC254856);
                this.A09.remove(i10);
            }
        }
        A06(this.A08, abstractC254856);
        if (this.A0A.remove(abstractC254856)) {
            view.setAlpha(1.0f);
            A0P(abstractC254856);
        }
        if (this.A07.remove(abstractC254856)) {
            view.setAlpha(1.0f);
            A0N(abstractC254856);
        }
        for (int i11 = this.A03.size() - 1; i11 >= 0; i11--) {
            ArrayList<C25024L> arrayList = this.A03.get(i11);
            A06(arrayList, abstractC254856);
            if (arrayList.isEmpty()) {
                this.A03.remove(i11);
            }
        }
        for (int j10 = this.A05.size() - 1; j10 >= 0; j10--) {
            ArrayList<C25034M> arrayList2 = this.A05.get(j10);
            int size = arrayList2.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                if (arrayList2.get(size).A04 == abstractC254856) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    String[] strArr = A0C;
                    String str = strArr[4];
                    String str2 = strArr[3];
                    int i12 = str.charAt(9);
                    if (i12 != str2.charAt(9)) {
                        throw new RuntimeException();
                    }
                    A0C[1] = "ZnQkkSK02m4qlFQsfXGc8k1uWyp7aRL1";
                    A0O(abstractC254856);
                    arrayList2.remove(size);
                    if (arrayList2.isEmpty()) {
                        this.A05.remove(j10);
                    }
                } else {
                    size--;
                }
            }
        }
        int size2 = this.A01.size();
        if (A0C[0].charAt(3) == 'S') {
            throw new RuntimeException();
        }
        A0C[7] = "NHib0yCpDtVNZGbvtAXjIsv6RzrfBwwf";
        for (int i13 = size2 - 1; i13 >= 0; i13--) {
            ArrayList<AbstractC254856> arrayList3 = this.A01.get(i13);
            if (arrayList3.remove(abstractC254856)) {
                view.setAlpha(1.0f);
                A0N(abstractC254856);
                if (arrayList3.isEmpty()) {
                    this.A01.remove(i13);
                }
            }
        }
        this.A06.remove(abstractC254856);
        this.A00.remove(abstractC254856);
        this.A02.remove(abstractC254856);
        this.A04.remove(abstractC254856);
        A0V();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r3 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (r4.A02.isEmpty() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        if (r4.A05.isEmpty() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        if (r4.A01.isEmpty() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
    
        r3 = r4.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        if (com.facebook.ads.redexgen.uinode.C3103Ee.A0C[7].charAt(30) == 'w') goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
    
        com.facebook.ads.redexgen.uinode.C3103Ee.A0C[7] = "80rjjAfjuSoUPBYOWBOUrC4mhnJBtDwK";
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        if (r3.isEmpty() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
    
        if (r3 != false) goto L20;
     */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC25264k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0L() {
        /*
            r4 = this;
            java.util.ArrayList<com.facebook.ads.redexgen.X.56> r0 = r4.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.4L> r0 = r4.A08
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.4M> r0 = r4.A09
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.56> r0 = r4.A0A
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.56> r0 = r4.A04
            boolean r3 = r0.isEmpty()
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C3103Ee.A0C
            r0 = 2
            r1 = r2[r0]
            r0 = 5
            r2 = r2[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto La5
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C3103Ee.A0C
            java.lang.String r1 = "HATKbuX1ioRbKjbJza4uRkbMkwnilInw"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "55W5G9gSwoJRpeM2nuMk9rdzPBhIsXI5"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.56> r0 = r4.A06
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.56> r0 = r4.A00
            boolean r3 = r0.isEmpty()
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C3103Ee.A0C
            r0 = 2
            r1 = r2[r0]
            r0 = 5
            r2 = r2[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto La2
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C3103Ee.A0C
            java.lang.String r1 = "PBqWGImhwZdo7IXQpaNFK9QlBHxMp4wk"
            r0 = 7
            r2[r0] = r1
            if (r3 == 0) goto Lb8
        L73:
            java.util.ArrayList<com.facebook.ads.redexgen.X.56> r0 = r4.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.X.4M>> r0 = r4.A05
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.X.56>> r0 = r4.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.X.4L>> r3 = r4.A03
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.C3103Ee.A0C
            r0 = 7
            r1 = r1[r0]
            r0 = 30
            char r1 = r1.charAt(r0)
            r0 = 119(0x77, float:1.67E-43)
            if (r1 == r0) goto Lab
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        La2:
            if (r3 == 0) goto Lb8
            goto L73
        La5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        Lab:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C3103Ee.A0C
            java.lang.String r1 = "80rjjAfjuSoUPBYOWBOUrC4mhnJBtDwK"
            r0 = 7
            r2[r0] = r1
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Lba
        Lb8:
            r0 = 1
        Lb9:
            return r0
        Lba:
            r0 = 0
            goto Lb9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C3103Ee.A0L():boolean");
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25264k
    public final boolean A0M(AbstractC254856 abstractC254856, List<Object> payloads) {
        return !payloads.isEmpty() || super.A0M(abstractC254856, payloads);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4386Za
    public final boolean A0R(AbstractC254856 abstractC254856) {
        A04(abstractC254856);
        abstractC254856.A0H.setAlpha(0.0f);
        this.A07.add(abstractC254856);
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4386Za
    public final boolean A0S(AbstractC254856 abstractC254856) {
        A04(abstractC254856);
        this.A0A.add(abstractC254856);
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4386Za
    public final boolean A0U(AbstractC254856 abstractC254856, AbstractC254856 abstractC2548562, int i10, int i11, int i12, int i13) {
        if (abstractC254856 == abstractC2548562) {
            return A0T(abstractC254856, i10, i11, i12, i13);
        }
        float translationX = abstractC254856.A0H.getTranslationX();
        float translationY = abstractC254856.A0H.getTranslationY();
        float prevTranslationY = abstractC254856.A0H.getAlpha();
        A04(abstractC254856);
        float prevTranslationX = i12 - i10;
        int deltaY = (int) (prevTranslationX - translationX);
        float prevTranslationX2 = i13 - i11;
        int deltaX = (int) (prevTranslationX2 - translationY);
        abstractC254856.A0H.setTranslationX(translationX);
        abstractC254856.A0H.setTranslationY(translationY);
        abstractC254856.A0H.setAlpha(prevTranslationY);
        if (abstractC2548562 != null) {
            A04(abstractC2548562);
            float prevTranslationX3 = -deltaY;
            abstractC2548562.A0H.setTranslationX(prevTranslationX3);
            float prevTranslationX4 = -deltaX;
            abstractC2548562.A0H.setTranslationY(prevTranslationX4);
            abstractC2548562.A0H.setAlpha(0.0f);
        }
        this.A08.add(new C25024L(abstractC254856, abstractC2548562, i10, i11, i12, i13));
        return true;
    }

    public final void A0V() {
        if (!A0L()) {
            A0A();
        }
    }

    public final void A0W(final C25024L c25024l) {
        final View view;
        AbstractC254856 holder = c25024l.A05;
        if (holder == null) {
            view = null;
        } else {
            view = holder.A0H;
        }
        AbstractC254856 holder2 = c25024l.A04;
        final View view2 = holder2 != null ? holder2.A0H : null;
        if (view != null) {
            final ViewPropertyAnimator oldViewAnim = view.animate().setDuration(A05());
            this.A02.add(c25024l.A05);
            oldViewAnim.translationX(c25024l.A02 - c25024l.A00);
            oldViewAnim.translationY(c25024l.A03 - c25024l.A01);
            oldViewAnim.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.4J
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    oldViewAnim.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    C3103Ee.this.A0Q(c25024l.A05, true);
                    C3103Ee.this.A02.remove(c25024l.A05);
                    C3103Ee.this.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            }).start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator animate = view2.animate();
            this.A02.add(c25024l.A04);
            animate.translationX(0.0f).translationY(0.0f).setDuration(A05()).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.4K
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    animate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    C3103Ee.this.A0Q(c25024l.A04, false);
                    C3103Ee.this.A02.remove(c25024l.A04);
                    C3103Ee.this.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            }).start();
        }
    }

    public final void A0X(final AbstractC254856 abstractC254856) {
        final View view = abstractC254856.A0H;
        final ViewPropertyAnimator animate = view.animate();
        this.A00.add(abstractC254856);
        ViewPropertyAnimator animation = animate.alpha(1.0f).setDuration(A04());
        animation.setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.4H
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                C3103Ee.this.A0N(abstractC254856);
                C3103Ee.this.A00.remove(abstractC254856);
                C3103Ee.this.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }

    public final void A0Y(final AbstractC254856 abstractC254856, int i10, int i11, int i12, int i13) {
        final View view = abstractC254856.A0H;
        final int i14 = i12 - i10;
        final int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        final ViewPropertyAnimator animate = view.animate();
        this.A04.add(abstractC254856);
        animate.setDuration(A06()).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.4I
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                if (i14 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (i15 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                C3103Ee.this.A0O(abstractC254856);
                C3103Ee.this.A04.remove(abstractC254856);
                C3103Ee.this.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }
}

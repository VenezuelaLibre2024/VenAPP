package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.ZW */
/* loaded from: assets/audience_network.dex */
public class C4382ZW implements InterfaceC3560MC {
    public static String[] A01 = {"JdxG2e87fiw1QxhKtyp6wy4hCZ34K54h", "5l6PiVFmWkFi4LSRmzN6ZIbVVY4PyA16", "qh41B7qjlQhNnOsbjTqj3JtjZfsrgLHf", "L6JKyztUTZrhaC2oSi2AGhNMneOalgfU", "mLvzPn8zSeH", "6Oneq6t5dYPlbDhRy7qxaYTJsizasisX", "J8", "lXMgpjBtmdYXVX4s4nwhe"};
    public final WeakReference<C25735V> A00;

    public C4382ZW(C25735V c25735v) {
        this.A00 = new WeakReference<>(c25735v);
    }

    public /* synthetic */ C4382ZW(C25735V c25735v, C25695R c25695r) {
        this(c25735v);
    }

    private void A00(C25735V c25735v) {
        C3793Px c3793Px;
        RelativeLayout relativeLayout;
        c3793Px = c25735v.A0B;
        if (c3793Px != null) {
            relativeLayout = c25735v.A06;
            relativeLayout.bringChildToFront(c3793Px);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3560MC
    public final void A3T(View view, int i10, RelativeLayout.LayoutParams layoutParams) {
        RelativeLayout relativeLayout;
        C25735V c25735v = this.A00.get();
        if (c25735v != null) {
            relativeLayout = c25735v.A06;
            relativeLayout.addView(view, i10, layoutParams);
            A00(c25735v);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3560MC
    public final void A3U(View view, RelativeLayout.LayoutParams layoutParams) {
        RelativeLayout relativeLayout;
        C25735V c25735v = this.A00.get();
        if (c25735v != null) {
            relativeLayout = c25735v.A06;
            relativeLayout.addView(view, layoutParams);
            A00(c25735v);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3560MC
    public void A43(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0G(str);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3560MC
    public void A44(String str, C27658q c27658q) {
        if (this.A00.get() != null) {
            this.A00.get().A0P(str, c27658q);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3560MC
    public final void A9M(String str, C23331a c23331a) {
        if (this.A00.get() != null) {
            C25735V c25735v = this.A00.get();
            String[] strArr = A01;
            if (strArr[0].charAt(19) != strArr[1].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "LaehfLm13EgRqqa58La6JsJDVjNkKsjm";
            strArr2[1] = "U7opStToMRhy5hKGwjx6Oh4Ofub1lgfJ";
            c25735v.A0H(str, c23331a);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3560MC
    public final void AB0(int i10) {
        C25735V activityApi = this.A00.get();
        if (activityApi != null) {
            activityApi.finish(i10);
        }
    }
}

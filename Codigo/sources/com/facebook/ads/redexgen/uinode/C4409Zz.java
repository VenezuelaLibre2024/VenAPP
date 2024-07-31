package com.facebook.ads.redexgen.uinode;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* renamed from: com.facebook.ads.redexgen.X.Zz */
/* loaded from: assets/audience_network.dex */
public class C4409Zz extends AbstractC242737 {
    public static String[] A01 = {"qdMAGnvFuVn0ea0M3RnyzUUMgxm0S2Dt", "2PeyHnmE0bX58Ffgk0gx7OXrgxltyZLW", "2int", "nVrienaBQfkWnV6qIsNJmuY2fGTgVaBy", "EIAfoPo9YRxYx4hqHxVbjlkHHJjThpFm", "", "SPMlRY4DBSEQqdOiv1Q7wDslDeTbAa0F", "kfFOHzhabps7JVIWzUifit9US33gkwJk"};
    public final /* synthetic */ C24623h A00;

    public C4409Zz(C24623h c24623h) {
        this.A00 = c24623h;
    }

    private boolean A00() {
        return this.A00.A01 != null && this.A00.A01.A01() > 1;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC242737
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(C24623h.class.getName());
        accessibilityEvent.setScrollable(A00());
        if (accessibilityEvent.getEventType() == 4096 && this.A00.A01 != null) {
            accessibilityEvent.setItemCount(this.A00.A01.A01());
            accessibilityEvent.setFromIndex(this.A00.A00);
            accessibilityEvent.setToIndex(this.A00.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC242737
    public final void A08(View view, C24733s c24733s) {
        super.A08(view, c24733s);
        c24733s.A0O(C24623h.class.getName());
        c24733s.A0R(A00());
        if (this.A00.canScrollHorizontally(1)) {
            c24733s.A0N(RecognitionOptions.AZTEC);
        }
        if (this.A00.canScrollHorizontally(-1)) {
            c24733s.A0N(8192);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC242737
    public final boolean A09(View view, int i10, Bundle bundle) {
        if (super.A09(view, i10, bundle)) {
            return true;
        }
        switch (i10) {
            case RecognitionOptions.AZTEC /* 4096 */:
                if (!this.A00.canScrollHorizontally(1)) {
                    return false;
                }
                C24623h c24623h = this.A00;
                int i11 = c24623h.A00;
                String[] strArr = A01;
                if (strArr[3].charAt(13) != strArr[7].charAt(13)) {
                    throw new RuntimeException();
                }
                A01[4] = "Vr8sNFSEZwclN9wLDYuYxTMloU2ohTqa";
                c24623h.setCurrentItem(i11 + 1);
                return true;
            case 8192:
                if (!this.A00.canScrollHorizontally(-1)) {
                    return false;
                }
                C24623h c24623h2 = this.A00;
                c24623h2.setCurrentItem(c24623h2.A00 - 1);
                return true;
            default:
                return false;
        }
    }
}

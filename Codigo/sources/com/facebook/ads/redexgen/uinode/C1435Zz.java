package com.facebook.ads.redexgen.uinode;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* renamed from: com.facebook.ads.redexgen.X.Zz */
/* loaded from: assets/audience_network.dex */
public class C1435Zz extends AnonymousClass37 {
    public static String[] A01 = {"qdMAGnvFuVn0ea0M3RnyzUUMgxm0S2Dt", "2PeyHnmE0bX58Ffgk0gx7OXrgxltyZLW", "2int", "nVrienaBQfkWnV6qIsNJmuY2fGTgVaBy", "EIAfoPo9YRxYx4hqHxVbjlkHHJjThpFm", "", "SPMlRY4DBSEQqdOiv1Q7wDslDeTbAa0F", "kfFOHzhabps7JVIWzUifit9US33gkwJk"};
    public final /* synthetic */ C06333h A00;

    public C1435Zz(C06333h c06333h) {
        this.A00 = c06333h;
    }

    private boolean A00() {
        return this.A00.A01 != null && this.A00.A01.A01() > 1;
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass37
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(C06333h.class.getName());
        accessibilityEvent.setScrollable(A00());
        if (accessibilityEvent.getEventType() == 4096 && this.A00.A01 != null) {
            accessibilityEvent.setItemCount(this.A00.A01.A01());
            accessibilityEvent.setFromIndex(this.A00.A00);
            accessibilityEvent.setToIndex(this.A00.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass37
    public final void A08(View view, C06443s c06443s) {
        super.A08(view, c06443s);
        c06443s.A0O(C06333h.class.getName());
        c06443s.A0R(A00());
        if (this.A00.canScrollHorizontally(1)) {
            c06443s.A0N(RecognitionOptions.AZTEC);
        }
        if (this.A00.canScrollHorizontally(-1)) {
            c06443s.A0N(8192);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass37
    public final boolean A09(View view, int i10, Bundle bundle) {
        if (super.A09(view, i10, bundle)) {
            return true;
        }
        switch (i10) {
            case RecognitionOptions.AZTEC /* 4096 */:
                if (!this.A00.canScrollHorizontally(1)) {
                    return false;
                }
                C06333h c06333h = this.A00;
                int i11 = c06333h.A00;
                String[] strArr = A01;
                if (strArr[3].charAt(13) != strArr[7].charAt(13)) {
                    throw new RuntimeException();
                }
                A01[4] = "Vr8sNFSEZwclN9wLDYuYxTMloU2ohTqa";
                c06333h.setCurrentItem(i11 + 1);
                return true;
            case 8192:
                if (!this.A00.canScrollHorizontally(-1)) {
                    return false;
                }
                C06333h c06333h2 = this.A00;
                c06333h2.setCurrentItem(c06333h2.A00 - 1);
                return true;
            default:
                return false;
        }
    }
}

package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Za */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC4386Za extends AbstractC25264k {
    public static String[] A01 = {"ufm8s7LRmOM7", "sIBwdoM05ajejE", "0NxvrnR7UZDHrBy4xVhLU5lsqzWJ5R3x", "FsILnIqpIa8iE3wffvJrO4tNlZdDmpUd", "wKnqjXSh8f61FKWyknAGi8xlXXoDdiLA", "lpMPMGmveEx5YZPPZgDkriuB4nzdouJK", "fQPzW90JHWOApVaaQbndX59CGXgCnXlm", "Pp9SKBa6RS3IfLIGXA9e4oeVKGHa5CsE"};
    public boolean A00 = true;

    public abstract boolean A0R(AbstractC254856 abstractC254856);

    public abstract boolean A0S(AbstractC254856 abstractC254856);

    public abstract boolean A0T(AbstractC254856 abstractC254856, int i10, int i11, int i12, int i13);

    public abstract boolean A0U(AbstractC254856 abstractC254856, AbstractC254856 abstractC2548562, int i10, int i11, int i12, int i13);

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25264k
    public final boolean A0D(AbstractC254856 abstractC254856) {
        return !this.A00 || abstractC254856.A0Z();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25264k
    public final boolean A0E(AbstractC254856 abstractC254856, C25254j c25254j, C25254j c25254j2) {
        if (c25254j != null && (c25254j.A01 != c25254j2.A01 || c25254j.A03 != c25254j2.A03)) {
            return A0T(abstractC254856, c25254j.A01, c25254j.A03, c25254j2.A01, c25254j2.A03);
        }
        return A0R(abstractC254856);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25264k
    public final boolean A0F(AbstractC254856 abstractC254856, C25254j c25254j, C25254j c25254j2) {
        int i10 = c25254j.A01;
        int i11 = c25254j.A03;
        View view = abstractC254856.A0H;
        int oldLeft = c25254j2 == null ? view.getLeft() : c25254j2.A01;
        int oldTop = c25254j2 == null ? view.getTop() : c25254j2.A03;
        if (!abstractC254856.A0a() && (i10 != oldLeft || i11 != oldTop)) {
            view.layout(oldLeft, oldTop, view.getWidth() + oldLeft, view.getHeight() + oldTop);
            return A0T(abstractC254856, i10, i11, oldLeft, oldTop);
        }
        return A0S(abstractC254856);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25264k
    public final boolean A0G(AbstractC254856 abstractC254856, C25254j c25254j, C25254j c25254j2) {
        if (c25254j.A01 != c25254j2.A01 || c25254j.A03 != c25254j2.A03) {
            return A0T(abstractC254856, c25254j.A01, c25254j.A03, c25254j2.A01, c25254j2.A03);
        }
        A0O(abstractC254856);
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25264k
    public final boolean A0H(AbstractC254856 abstractC254856, AbstractC254856 abstractC2548562, C25254j c25254j, C25254j c25254j2) {
        int fromTop;
        int toLeft;
        int i10 = c25254j.A01;
        int fromLeft = c25254j.A03;
        if (abstractC2548562.A0f()) {
            fromTop = c25254j.A01;
            toLeft = c25254j.A03;
        } else {
            fromTop = c25254j2.A01;
            toLeft = c25254j2.A03;
        }
        int toTop = A01[1].length();
        if (toTop != 14) {
            throw new RuntimeException();
        }
        A01[1] = "7F8ns227Orjao7";
        return A0U(abstractC254856, abstractC2548562, i10, fromLeft, fromTop, toLeft);
    }

    public final void A0N(AbstractC254856 abstractC254856) {
        A0C(abstractC254856);
    }

    public final void A0O(AbstractC254856 abstractC254856) {
        A0C(abstractC254856);
    }

    public final void A0P(AbstractC254856 abstractC254856) {
        A0C(abstractC254856);
    }

    public final void A0Q(AbstractC254856 abstractC254856, boolean z10) {
        A0C(abstractC254856);
    }
}

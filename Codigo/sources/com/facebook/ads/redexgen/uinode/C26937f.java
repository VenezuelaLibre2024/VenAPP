package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.7f */
/* loaded from: assets/audience_network.dex */
public class C26937f extends ContextWrapper {
    public final InterfaceC26957h A00;
    public final AtomicReference<String> A01;

    public C26937f(Context context, InterfaceC26957h interfaceC26957h) {
        super(context.getApplicationContext());
        this.A01 = new AtomicReference<>();
        this.A00 = interfaceC26957h;
    }

    public final InterfaceC26456g A00() {
        return this.A00.A6L();
    }

    public final C4336Ym A01() {
        return this.A00.A7r(this);
    }

    public final InterfaceC26947g A02() {
        return this.A00.A6A(this);
    }

    public final InterfaceC26967i A03() {
        return this.A00.A6v(this);
    }

    public final InterfaceC26987k A04() {
        return this.A00.A7q(this);
    }

    public final InterfaceC26997l A05() {
        return this.A00.A86();
    }

    public final InterfaceC27107w A06() {
        return this.A00.A6j(this);
    }

    public final InterfaceC272389 A07() {
        return this.A00.A6l(this);
    }

    public final C27518c A08() {
        return this.A00.A7y();
    }

    public final InterfaceC3369J2 A09() {
        return this.A00.A5u(A01());
    }

    public final InterfaceC3381JE A0A() {
        return this.A00.A7s(A01());
    }

    public final String A0B() {
        return this.A01.get();
    }

    public final void A0C(String str) {
        this.A01.set(str);
    }
}

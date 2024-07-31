package com.facebook.ads.redexgen.uinode;

import android.hardware.display.DisplayManager;

/* renamed from: com.facebook.ads.redexgen.X.IR */
/* loaded from: assets/audience_network.dex */
public final class C3332IR implements DisplayManager.DisplayListener {
    public final DisplayManager A00;
    public final /* synthetic */ C3334IT A01;

    public C3332IR(C3334IT c3334it, DisplayManager displayManager) {
        this.A01 = c3334it;
        this.A00 = displayManager;
    }

    public final void A00() {
        this.A00.registerDisplayListener(this, null);
    }

    public final void A01() {
        this.A00.unregisterDisplayListener(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        if (i10 != 0) {
            return;
        }
        this.A01.A03();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }
}

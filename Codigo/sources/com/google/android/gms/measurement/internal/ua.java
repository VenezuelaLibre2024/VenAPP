package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
public abstract class ua extends ra {

    /* renamed from: c */
    private boolean f10681c;

    public ua(va vaVar) {
        super(vaVar);
        this.f10606b.m0();
    }

    public final void p() {
        if (!r()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void q() {
        if (this.f10681c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        s();
        this.f10606b.l0();
        this.f10681c = true;
    }

    public final boolean r() {
        return this.f10681c;
    }

    protected abstract boolean s();
}

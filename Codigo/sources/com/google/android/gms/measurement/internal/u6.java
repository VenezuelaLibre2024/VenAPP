package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
public abstract class u6 extends v6 {

    /* renamed from: b */
    private boolean f10674b;

    public u6(w5 w5Var) {
        super(w5Var);
        this.f10701a.i();
    }

    public final void j() {
        if (!m()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void k() {
        if (this.f10674b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (n()) {
            return;
        }
        this.f10701a.M();
        this.f10674b = true;
    }

    public final void l() {
        if (this.f10674b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        o();
        this.f10701a.M();
        this.f10674b = true;
    }

    public final boolean m() {
        return this.f10674b;
    }

    protected abstract boolean n();

    protected void o() {
    }
}

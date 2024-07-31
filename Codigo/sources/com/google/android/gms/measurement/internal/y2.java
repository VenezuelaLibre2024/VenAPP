package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
public abstract class y2 extends z3 {

    /* renamed from: b */
    private boolean f10834b;

    public y2(w5 w5Var) {
        super(w5Var);
        this.f10701a.i();
    }

    public final void q() {
        if (!u()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void r() {
        if (this.f10834b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (v()) {
            return;
        }
        this.f10701a.M();
        this.f10834b = true;
    }

    public final void s() {
        if (this.f10834b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        t();
        this.f10701a.M();
        this.f10834b = true;
    }

    protected void t() {
    }

    public final boolean u() {
        return this.f10834b;
    }

    protected abstract boolean v();
}

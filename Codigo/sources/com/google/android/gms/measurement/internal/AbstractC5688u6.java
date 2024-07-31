package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.u6 */
/* loaded from: classes2.dex */
public abstract class AbstractC5688u6 extends C5701v6 {

    /* renamed from: b */
    private boolean f11872b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC5688u6(C5712w5 c5712w5) {
        super(c5712w5);
        this.f11899a.m14510i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public final void m14356j() {
        if (!m14359m()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: k */
    public final void m14357k() {
        if (this.f11872b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo14040n()) {
            return;
        }
        this.f11899a.m14506M();
        this.f11872b = true;
    }

    /* renamed from: l */
    public final void m14358l() {
        if (this.f11872b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo14042o();
        this.f11899a.m14506M();
        this.f11872b = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean m14359m() {
        return this.f11872b;
    }

    /* renamed from: n */
    protected abstract boolean mo14040n();

    /* renamed from: o */
    protected void mo14042o() {
    }
}

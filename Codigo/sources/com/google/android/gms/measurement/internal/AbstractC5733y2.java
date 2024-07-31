package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.y2 */
/* loaded from: classes2.dex */
public abstract class AbstractC5733y2 extends C5746z3 {

    /* renamed from: b */
    private boolean f12049b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC5733y2(C5712w5 c5712w5) {
        super(c5712w5);
        this.f11899a.m14510i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public final void m14545q() {
        if (!m14548u()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: r */
    public final void m14546r() {
        if (this.f12049b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo13704v()) {
            return;
        }
        this.f11899a.m14506M();
        this.f12049b = true;
    }

    /* renamed from: s */
    public final void m14547s() {
        if (this.f12049b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo13928t();
        this.f11899a.m14506M();
        this.f12049b = true;
    }

    /* renamed from: t */
    protected void mo13928t() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean m14548u() {
        return this.f12049b;
    }

    /* renamed from: v */
    protected abstract boolean mo13704v();
}

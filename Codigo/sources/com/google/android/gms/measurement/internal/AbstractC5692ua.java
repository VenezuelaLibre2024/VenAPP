package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.ua */
/* loaded from: classes2.dex */
public abstract class AbstractC5692ua extends C5653ra {

    /* renamed from: c */
    private boolean f11879c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC5692ua(C5705va c5705va) {
        super(c5705va);
        this.f11804b.m14468m0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public final void m14360p() {
        if (!m14362r()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: q */
    public final void m14361q() {
        if (this.f11879c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo13770s();
        this.f11804b.m14466l0();
        this.f11879c = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final boolean m14362r() {
        return this.f11879c;
    }

    /* renamed from: s */
    protected abstract boolean mo13770s();
}

package com.google.android.gms.common.api;

import ca.C1898d;

/* renamed from: com.google.android.gms.common.api.s */
/* loaded from: classes.dex */
public final class C5209s extends UnsupportedOperationException {

    /* renamed from: a */
    private final C1898d f10626a;

    public C5209s(C1898d c1898d) {
        this.f10626a = c1898d;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f10626a));
    }
}

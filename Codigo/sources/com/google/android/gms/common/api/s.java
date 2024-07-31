package com.google.android.gms.common.api;

/* loaded from: classes.dex */
public final class s extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    private final ca.d f9512a;

    public s(ca.d dVar) {
        this.f9512a = dVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f9512a));
    }
}

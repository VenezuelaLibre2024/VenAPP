package com.google.android.play.integrity.internal;

/* loaded from: classes2.dex */
public final class k implements j {

    /* renamed from: b, reason: collision with root package name */
    private static final k f11022b = new k(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f11023a;

    private k(Object obj) {
        this.f11023a = obj;
    }

    public static j b(Object obj) {
        if (obj != null) {
            return new k(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.play.integrity.internal.m
    public final Object a() {
        return this.f11023a;
    }
}

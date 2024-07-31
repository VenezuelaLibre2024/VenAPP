package com.google.android.play.integrity.internal;

/* renamed from: com.google.android.play.integrity.internal.k */
/* loaded from: classes2.dex */
public final class C5835k implements InterfaceC5833j {

    /* renamed from: b */
    private static final C5835k f12237b = new C5835k(null);

    /* renamed from: a */
    private final Object f12238a;

    private C5835k(Object obj) {
        this.f12238a = obj;
    }

    /* renamed from: b */
    public static InterfaceC5833j m14690b(Object obj) {
        if (obj != null) {
            return new C5835k(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC5839m
    /* renamed from: a */
    public final Object mo14622a() {
        return this.f12238a;
    }
}

package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C5820c0;
import com.google.android.play.integrity.internal.InterfaceC5833j;
import com.google.android.play.integrity.internal.InterfaceC5839m;

/* renamed from: com.google.android.play.core.integrity.af */
/* loaded from: classes2.dex */
public final class C5761af implements InterfaceC5833j {

    /* renamed from: a */
    private final InterfaceC5839m f12129a;

    /* renamed from: b */
    private final InterfaceC5839m f12130b;

    public C5761af(InterfaceC5839m interfaceC5839m, InterfaceC5839m interfaceC5839m2) {
        this.f12129a = interfaceC5839m;
        this.f12130b = interfaceC5839m2;
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC5839m
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14622a() {
        return new C5759ad((Context) this.f12129a.mo14622a(), (C5820c0) this.f12130b.mo14622a());
    }
}

package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.c0;

/* loaded from: classes2.dex */
public final class af implements com.google.android.play.integrity.internal.j {

    /* renamed from: a */
    private final com.google.android.play.integrity.internal.m f10914a;

    /* renamed from: b */
    private final com.google.android.play.integrity.internal.m f10915b;

    public af(com.google.android.play.integrity.internal.m mVar, com.google.android.play.integrity.internal.m mVar2) {
        this.f10914a = mVar;
        this.f10915b = mVar2;
    }

    @Override // com.google.android.play.integrity.internal.m
    public final /* bridge */ /* synthetic */ Object a() {
        return new ad((Context) this.f10914a.a(), (c0) this.f10915b.a());
    }
}

package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.c0;

/* loaded from: classes2.dex */
public final class az implements com.google.android.play.integrity.internal.j {

    /* renamed from: a */
    private final com.google.android.play.integrity.internal.m f10947a;

    /* renamed from: b */
    private final com.google.android.play.integrity.internal.m f10948b;

    public az(com.google.android.play.integrity.internal.m mVar, com.google.android.play.integrity.internal.m mVar2) {
        this.f10947a = mVar;
        this.f10948b = mVar2;
    }

    @Override // com.google.android.play.integrity.internal.m
    public final /* bridge */ /* synthetic */ Object a() {
        return new ax((Context) this.f10947a.a(), (c0) this.f10948b.a());
    }
}

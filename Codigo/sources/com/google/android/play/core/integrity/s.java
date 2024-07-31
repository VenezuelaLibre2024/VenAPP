package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes2.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final s f10979a = this;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.m f10980b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.m f10981c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.m f10982d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.m f10983e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.m f10984f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ s(Context context, r rVar) {
        ao aoVar;
        com.google.android.play.integrity.internal.j b10 = com.google.android.play.integrity.internal.k.b(context);
        this.f10980b = b10;
        aoVar = an.f10925a;
        com.google.android.play.integrity.internal.m b11 = com.google.android.play.integrity.internal.i.b(aoVar);
        this.f10981c = b11;
        com.google.android.play.integrity.internal.m b12 = com.google.android.play.integrity.internal.i.b(new az(b10, b11));
        this.f10982d = b12;
        com.google.android.play.integrity.internal.m b13 = com.google.android.play.integrity.internal.i.b(new be(b12));
        this.f10983e = b13;
        this.f10984f = com.google.android.play.integrity.internal.i.b(new am(b12, b13));
    }

    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f10984f.a();
    }
}

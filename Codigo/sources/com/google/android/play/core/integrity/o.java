package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes2.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    private final o f10973a = this;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.m f10974b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.m f10975c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.m f10976d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.m f10977e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ o(Context context, n nVar) {
        z zVar;
        com.google.android.play.integrity.internal.j b10 = com.google.android.play.integrity.internal.k.b(context);
        this.f10974b = b10;
        zVar = y.f10990a;
        com.google.android.play.integrity.internal.m b11 = com.google.android.play.integrity.internal.i.b(zVar);
        this.f10975c = b11;
        com.google.android.play.integrity.internal.m b12 = com.google.android.play.integrity.internal.i.b(new af(b10, b11));
        this.f10976d = b12;
        this.f10977e = com.google.android.play.integrity.internal.i.b(new x(b12));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f10977e.a();
    }
}

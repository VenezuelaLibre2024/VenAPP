package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* loaded from: classes2.dex */
final class i8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f10284a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Uri f10285b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f10286c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f10287d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ f8 f10288e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i8(f8 f8Var, boolean z10, Uri uri, String str, String str2) {
        this.f10288e = f8Var;
        this.f10284a = z10;
        this.f10285b = uri;
        this.f10286c = str;
        this.f10287d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f8.a(this.f10288e, this.f10284a, this.f10285b, this.f10286c, this.f10287d);
    }
}

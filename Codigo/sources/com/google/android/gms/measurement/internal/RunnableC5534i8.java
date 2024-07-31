package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* renamed from: com.google.android.gms.measurement.internal.i8 */
/* loaded from: classes2.dex */
final class RunnableC5534i8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f11456a;

    /* renamed from: b */
    private final /* synthetic */ Uri f11457b;

    /* renamed from: c */
    private final /* synthetic */ String f11458c;

    /* renamed from: d */
    private final /* synthetic */ String f11459d;

    /* renamed from: e */
    private final /* synthetic */ C5495f8 f11460e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5534i8(C5495f8 c5495f8, boolean z10, Uri uri, String str, String str2) {
        this.f11460e = c5495f8;
        this.f11456a = z10;
        this.f11457b = uri;
        this.f11458c = str;
        this.f11459d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5495f8.m13914a(this.f11460e, this.f11456a, this.f11457b, this.f11458c, this.f11459d);
    }
}

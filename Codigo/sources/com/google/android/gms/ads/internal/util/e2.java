package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.d;
import com.google.android.gms.internal.ads.zzbhb;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzhhv;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e2 implements zzbhb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzbhd f8962a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f8963b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Uri f8964c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e2(j2 j2Var, zzbhd zzbhdVar, Context context, Uri uri) {
        this.f8962a = zzbhdVar;
        this.f8963b = context;
        this.f8964c = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbhb
    public final void zza() {
        androidx.browser.customtabs.d b10 = new d.b(this.f8962a.zza()).b();
        b10.f1766a.setPackage(zzhhv.zza(this.f8963b));
        b10.b(this.f8963b, this.f8964c);
        this.f8962a.zzf((Activity) this.f8963b);
    }
}

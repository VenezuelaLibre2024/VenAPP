package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.C0394d;
import com.google.android.gms.internal.ads.zzbhb;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzhhv;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.util.e2 */
/* loaded from: classes.dex */
public final class C4985e2 implements zzbhb {

    /* renamed from: a */
    final /* synthetic */ zzbhd f10061a;

    /* renamed from: b */
    final /* synthetic */ Context f10062b;

    /* renamed from: c */
    final /* synthetic */ Uri f10063c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4985e2(C5005j2 c5005j2, zzbhd zzbhdVar, Context context, Uri uri) {
        this.f10061a = zzbhdVar;
        this.f10062b = context;
        this.f10063c = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbhb
    public final void zza() {
        C0394d m2113b = new C0394d.b(this.f10061a.zza()).m2113b();
        m2113b.f2069a.setPackage(zzhhv.zza(this.f10062b));
        m2113b.m2108b(this.f10062b, this.f10063c);
        this.f10061a.zzf((Activity) this.f10062b);
    }
}

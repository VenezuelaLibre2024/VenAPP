package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.C4801c3;
import com.google.android.gms.internal.ads.zzfij;
import com.google.android.gms.internal.ads.zzfxt;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.ads.internal.util.d0 */
/* loaded from: classes.dex */
public final class C4979d0 extends AbstractC7138a {
    public static final Parcelable.Creator<C4979d0> CREATOR = new C4983e0();

    /* renamed from: a */
    public final String f10053a;

    /* renamed from: b */
    public final int f10054b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4979d0(String str, int i10) {
        this.f10053a = str == null ? "" : str;
        this.f10054b = i10;
    }

    /* renamed from: v1 */
    public static C4979d0 m12623v1(Throwable th2) {
        C4801c3 zza = zzfij.zza(th2);
        return new C4979d0(zzfxt.zzd(th2.getMessage()) ? zza.f9704b : th2.getMessage(), zza.f9703a);
    }

    /* renamed from: u1 */
    public final C4975c0 m12624u1() {
        return new C4975c0(this.f10053a, this.f10054b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f10053a;
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, str, false);
        C7140c.m21229u(parcel, 2, this.f10054b);
        C7140c.m21210b(parcel, m21209a);
    }
}

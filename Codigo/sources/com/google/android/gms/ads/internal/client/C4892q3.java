package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.ads.internal.client.q3 */
/* loaded from: classes.dex */
public final class C4892q3 extends AbstractC7138a {
    public static final Parcelable.Creator<C4892q3> CREATOR = new C4898r3();

    /* renamed from: a */
    private final int f9804a;

    /* renamed from: b */
    private final int f9805b;

    /* renamed from: c */
    private final String f9806c;

    public C4892q3() {
        this(ModuleDescriptor.MODULE_VERSION, 240304000, "23.0.0");
    }

    public C4892q3(int i10, int i11, String str) {
        this.f9804a = i10;
        this.f9805b = i11;
        this.f9806c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f9804a);
        C7140c.m21229u(parcel, 2, this.f9805b);
        C7140c.m21200G(parcel, 3, this.f9806c, false);
        C7140c.m21210b(parcel, m21209a);
    }

    public final int zza() {
        return this.f9805b;
    }

    public final String zzb() {
        return this.f9806c;
    }
}

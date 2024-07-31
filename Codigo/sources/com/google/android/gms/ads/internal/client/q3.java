package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public final class q3 extends ea.a {
    public static final Parcelable.Creator<q3> CREATOR = new r3();

    /* renamed from: a, reason: collision with root package name */
    private final int f8727a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8728b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8729c;

    public q3() {
        this(ModuleDescriptor.MODULE_VERSION, 240304000, "23.0.0");
    }

    public q3(int i10, int i11, String str) {
        this.f8727a = i10;
        this.f8728b = i11;
        this.f8729c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f8727a);
        ea.c.u(parcel, 2, this.f8728b);
        ea.c.G(parcel, 3, this.f8729c, false);
        ea.c.b(parcel, a10);
    }

    public final int zza() {
        return this.f8728b;
    }

    public final String zzb() {
        return this.f8729c;
    }
}

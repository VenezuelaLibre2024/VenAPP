package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.b;

/* loaded from: classes2.dex */
public final class zzbjk extends zzayg implements zzbjm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbjk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbjm
    public final double zzb() {
        Parcel zzbl = zzbl(3, zza());
        double readDouble = zzbl.readDouble();
        zzbl.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbjm
    public final int zzc() {
        Parcel zzbl = zzbl(5, zza());
        int readInt = zzbl.readInt();
        zzbl.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbjm
    public final int zzd() {
        Parcel zzbl = zzbl(4, zza());
        int readInt = zzbl.readInt();
        zzbl.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbjm
    public final Uri zze() {
        Parcel zzbl = zzbl(2, zza());
        Uri uri = (Uri) zzayi.zza(zzbl, Uri.CREATOR);
        zzbl.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbjm
    public final com.google.android.gms.dynamic.b zzf() {
        Parcel zzbl = zzbl(1, zza());
        com.google.android.gms.dynamic.b f22 = b.a.f2(zzbl.readStrongBinder());
        zzbl.recycle();
        return f22;
    }
}

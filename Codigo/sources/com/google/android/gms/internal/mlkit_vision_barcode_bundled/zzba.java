package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import ea.a;
import ea.c;

/* loaded from: classes2.dex */
public final class zzba extends a {
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();
    private final int zza;
    private final String zzb;
    private final String zzc;
    private final byte[] zzd;
    private final Point[] zze;
    private final int zzf;
    private final zzat zzg;
    private final zzaw zzh;
    private final zzax zzi;
    private final zzaz zzj;
    private final zzay zzk;
    private final zzau zzl;
    private final zzaq zzm;
    private final zzar zzn;
    private final zzas zzo;

    public zzba(int i10, String str, String str2, byte[] bArr, Point[] pointArr, int i11, zzat zzatVar, zzaw zzawVar, zzax zzaxVar, zzaz zzazVar, zzay zzayVar, zzau zzauVar, zzaq zzaqVar, zzar zzarVar, zzas zzasVar) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bArr;
        this.zze = pointArr;
        this.zzf = i11;
        this.zzg = zzatVar;
        this.zzh = zzawVar;
        this.zzi = zzaxVar;
        this.zzj = zzazVar;
        this.zzk = zzayVar;
        this.zzl = zzauVar;
        this.zzm = zzaqVar;
        this.zzn = zzarVar;
        this.zzo = zzasVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, this.zza);
        c.G(parcel, 2, this.zzb, false);
        c.G(parcel, 3, this.zzc, false);
        c.l(parcel, 4, this.zzd, false);
        c.J(parcel, 5, this.zze, i10, false);
        c.u(parcel, 6, this.zzf);
        c.E(parcel, 7, this.zzg, i10, false);
        c.E(parcel, 8, this.zzh, i10, false);
        c.E(parcel, 9, this.zzi, i10, false);
        c.E(parcel, 10, this.zzj, i10, false);
        c.E(parcel, 11, this.zzk, i10, false);
        c.E(parcel, 12, this.zzl, i10, false);
        c.E(parcel, 13, this.zzm, i10, false);
        c.E(parcel, 14, this.zzn, i10, false);
        c.E(parcel, 15, this.zzo, i10, false);
        c.b(parcel, a10);
    }
}

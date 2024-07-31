package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import ea.a;
import ea.c;

/* loaded from: classes2.dex */
public final class zzvj extends a {
    public static final Parcelable.Creator<zzvj> CREATOR = new zzvk();
    private final int zza;
    private final String zzb;
    private final String zzc;
    private final byte[] zzd;
    private final Point[] zze;
    private final int zzf;
    private final zzvc zzg;
    private final zzvf zzh;
    private final zzvg zzi;
    private final zzvi zzj;
    private final zzvh zzk;
    private final zzvd zzl;
    private final zzuz zzm;
    private final zzva zzn;
    private final zzvb zzo;

    public zzvj(int i10, String str, String str2, byte[] bArr, Point[] pointArr, int i11, zzvc zzvcVar, zzvf zzvfVar, zzvg zzvgVar, zzvi zzviVar, zzvh zzvhVar, zzvd zzvdVar, zzuz zzuzVar, zzva zzvaVar, zzvb zzvbVar) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bArr;
        this.zze = pointArr;
        this.zzf = i11;
        this.zzg = zzvcVar;
        this.zzh = zzvfVar;
        this.zzi = zzvgVar;
        this.zzj = zzviVar;
        this.zzk = zzvhVar;
        this.zzl = zzvdVar;
        this.zzm = zzuzVar;
        this.zzn = zzvaVar;
        this.zzo = zzvbVar;
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

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzf;
    }

    public final zzuz zzc() {
        return this.zzm;
    }

    public final zzva zzd() {
        return this.zzn;
    }

    public final zzvb zze() {
        return this.zzo;
    }

    public final zzvc zzf() {
        return this.zzg;
    }

    public final zzvd zzg() {
        return this.zzl;
    }

    public final zzvf zzh() {
        return this.zzh;
    }

    public final zzvg zzi() {
        return this.zzi;
    }

    public final zzvh zzj() {
        return this.zzk;
    }

    public final zzvi zzk() {
        return this.zzj;
    }

    public final String zzl() {
        return this.zzb;
    }

    public final String zzm() {
        return this.zzc;
    }

    public final byte[] zzn() {
        return this.zzd;
    }

    public final Point[] zzo() {
        return this.zze;
    }
}

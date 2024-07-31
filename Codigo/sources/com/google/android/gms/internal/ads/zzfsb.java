package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzfsb extends ea.a {
    public static final Parcelable.Creator<zzfsb> CREATOR = new zzfsc();
    public final int zza;
    private zzatd zzb = null;
    private byte[] zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfsb(int i10, byte[] bArr) {
        this.zza = i10;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzatd zzatdVar = this.zzb;
        if (zzatdVar != null || this.zzc == null) {
            if (zzatdVar == null || this.zzc != null) {
                if (zzatdVar != null && this.zzc != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzatdVar != null || this.zzc != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, i11);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzax();
        }
        ea.c.l(parcel, 2, bArr, false);
        ea.c.b(parcel, a10);
    }

    public final zzatd zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzatd.zze(this.zzc, zzgzf.zza());
                this.zzc = null;
            } catch (zzhag | NullPointerException e10) {
                throw new IllegalStateException(e10);
            }
        }
        zzb();
        return this.zzb;
    }
}

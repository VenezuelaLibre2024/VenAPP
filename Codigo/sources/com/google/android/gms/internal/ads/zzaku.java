package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.a;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaku implements zzaea {
    private final zzaea zza;
    private final zzakp zzb;
    private zzakr zzh;
    private zzam zzi;
    private final zzaki zzc = new zzaki();
    private int zze = 0;
    private int zzf = 0;
    private byte[] zzg = zzfy.zzf;
    private final zzfp zzd = new zzfp();

    public zzaku(zzaea zzaeaVar, zzakp zzakpVar) {
        this.zza = zzaeaVar;
        this.zzb = zzakpVar;
    }

    private final void zzb(int i10) {
        int length = this.zzg.length;
        int i11 = this.zzf;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.zze;
        int max = Math.max(i12 + i12, i10 + i12);
        byte[] bArr = this.zzg;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.zze, bArr2, 0, i12);
        this.zze = 0;
        this.zzf = i12;
        this.zzg = bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(long j10, int i10, zzakj zzakjVar) {
        zzek.zzb(this.zzi);
        zzgaa zzgaaVar = zzakjVar.zza;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzgaaVar.size());
        Iterator<E> it = zzgaaVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzec) it.next()).zza());
        }
        long j11 = zzakjVar.zzc;
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j11);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        zzfp zzfpVar = this.zzd;
        int length = marshall.length;
        zzfpVar.zzI(marshall, length);
        this.zza.zzr(this.zzd, length);
        int i11 = i10 & a.e.API_PRIORITY_OTHER;
        long j12 = zzakjVar.zzb;
        if (j12 == -9223372036854775807L) {
            zzek.zzf(this.zzi.zzq == Long.MAX_VALUE);
        } else {
            long j13 = this.zzi.zzq;
            j10 = j13 == Long.MAX_VALUE ? j10 + j12 : j12 + j13;
        }
        this.zza.zzt(j10, i11, length, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final /* synthetic */ int zzf(zzu zzuVar, int i10, boolean z10) {
        return zzady.zza(this, zzuVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final int zzg(zzu zzuVar, int i10, boolean z10, int i11) {
        if (this.zzh == null) {
            return this.zza.zzg(zzuVar, i10, z10, 0);
        }
        zzb(i10);
        int zza = zzuVar.zza(this.zzg, this.zzf, i10);
        if (zza != -1) {
            this.zzf += zza;
            return zza;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final void zzl(zzam zzamVar) {
        zzaea zzaeaVar;
        String str = zzamVar.zzm;
        str.getClass();
        zzek.zzd(zzcb.zzb(str) == 3);
        if (!zzamVar.equals(this.zzi)) {
            this.zzi = zzamVar;
            this.zzh = this.zzb.zzc(zzamVar) ? this.zzb.zzb(zzamVar) : null;
        }
        if (this.zzh == null) {
            zzaeaVar = this.zza;
        } else {
            zzaeaVar = this.zza;
            zzak zzb = zzamVar.zzb();
            zzb.zzW("application/x-media3-cues");
            zzb.zzz(zzamVar.zzm);
            zzb.zzaa(Long.MAX_VALUE);
            zzb.zzD(this.zzb.zza(zzamVar));
            zzamVar = zzb.zzac();
        }
        zzaeaVar.zzl(zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final /* synthetic */ void zzr(zzfp zzfpVar, int i10) {
        zzady.zzb(this, zzfpVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final void zzs(zzfp zzfpVar, int i10, int i11) {
        if (this.zzh == null) {
            this.zza.zzs(zzfpVar, i10, i11);
            return;
        }
        zzb(i10);
        zzfpVar.zzG(this.zzg, this.zzf, i10);
        this.zzf += i10;
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final void zzt(final long j10, final int i10, int i11, int i12, zzadz zzadzVar) {
        if (this.zzh == null) {
            this.zza.zzt(j10, i10, i11, i12, zzadzVar);
            return;
        }
        zzek.zze(zzadzVar == null, "DRM on subtitles is not supported");
        int i13 = (this.zzf - i12) - i11;
        this.zzh.zza(this.zzg, i13, i11, zzakq.zza(), new zzep() { // from class: com.google.android.gms.internal.ads.zzakt
            @Override // com.google.android.gms.internal.ads.zzep
            public final void zza(Object obj) {
                zzaku.this.zza(j10, i10, (zzakj) obj);
            }
        });
        int i14 = i13 + i11;
        this.zze = i14;
        if (i14 == this.zzf) {
            this.zze = 0;
            this.zzf = 0;
        }
    }
}

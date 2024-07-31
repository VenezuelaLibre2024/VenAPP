package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzggj {
    private final List zza = new ArrayList();
    private final zzgrw zzb = zzgrw.zza;
    private boolean zzc = false;

    public final void zzd() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzggh) it.next()).zza = false;
        }
    }

    public final zzggj zza(zzggh zzgghVar) {
        zzggj zzggjVar;
        boolean z10;
        zzggjVar = zzgghVar.zzf;
        if (zzggjVar != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        z10 = zzgghVar.zza;
        if (z10) {
            zzd();
        }
        zzgghVar.zzf = this;
        this.zza.add(zzgghVar);
        return this;
    }

    public final zzggm zzb() {
        zzggi zzggiVar;
        zzggi zzggiVar2;
        zzggi zzggiVar3;
        int i10;
        zzggq zzggqVar;
        boolean z10;
        zzgge zzggeVar;
        zzggi zzggiVar4;
        zzggi zzggiVar5;
        zzggi zzggiVar6;
        zzggi zzggiVar7;
        zzgge unused;
        zzggi unused2;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.zzc = true;
        List list = this.zza;
        zzgvd zzd = zzgvg.zzd();
        int i11 = 0;
        while (i11 < list.size() - 1) {
            int i12 = i11 + 1;
            zzggiVar4 = ((zzggh) list.get(i11)).zze;
            zzggiVar5 = zzggi.zza;
            if (zzggiVar4 == zzggiVar5) {
                zzggiVar6 = ((zzggh) list.get(i12)).zze;
                zzggiVar7 = zzggi.zza;
                if (zzggiVar6 != zzggiVar7) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
            i11 = i12;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (zzggh zzgghVar : this.zza) {
            unused = zzgghVar.zzb;
            zzggiVar = zzgghVar.zze;
            if (zzggiVar == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            zzggiVar2 = zzgghVar.zze;
            zzggiVar3 = zzggi.zza;
            int i13 = 3;
            if (zzggiVar2 == zzggiVar3) {
                i10 = 0;
                while (true) {
                    if (i10 != 0 && !hashSet.contains(Integer.valueOf(i10))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[4];
                    int i14 = 0;
                    while (i14 == 0) {
                        secureRandom.nextBytes(bArr);
                        i14 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    }
                    i10 = i14;
                }
            } else {
                unused2 = zzgghVar.zze;
                i10 = 0;
            }
            Integer valueOf = Integer.valueOf(i10);
            if (hashSet.contains(valueOf)) {
                throw new GeneralSecurityException("Id " + i10 + " is used twice in the keyset");
            }
            hashSet.add(valueOf);
            zzggh.zza(zzgghVar);
            zzggqVar = zzgghVar.zzd;
            zzgge zzc = zzgghVar.zzc();
            zzgge zzggeVar2 = zzgge.zza;
            if (!zzggeVar2.equals(zzc)) {
                if (zzgge.zzb.equals(zzc)) {
                    i13 = 4;
                } else {
                    if (!zzgge.zzc.equals(zzc)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i13 = 5;
                }
            }
            zzgoy zzgoyVar = (zzgoy) (zzggqVar instanceof zzgnp ? ((zzgnp) zzggqVar).zzb() : zzgoe.zzd().zzf(zzggqVar, zzgoy.class));
            zzgut zza = zzghb.zza(zzgoyVar.zzc());
            zzgve zzd2 = zzgvf.zzd();
            zzd2.zzb(i10);
            zzd2.zzd(i13);
            zzd2.zza(zza);
            zzd2.zzc(zzgoyVar.zzc().zzf());
            zzd.zza((zzgvf) zzd2.zzal());
            z10 = zzgghVar.zza;
            if (z10) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                zzggeVar = zzgghVar.zzb;
                if (zzggeVar != zzggeVar2) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = valueOf;
            }
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzd.zzb(num.intValue());
        return zzggm.zzb((zzgvg) zzd.zzal(), this.zzb);
    }
}

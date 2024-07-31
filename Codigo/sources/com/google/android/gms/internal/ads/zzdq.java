package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzdq {
    private final zzgaa zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private zzdr zzd;
    private zzdr zze;
    private boolean zzf;

    public zzdq(zzgaa zzgaaVar) {
        this.zza = zzgaaVar;
        zzdr zzdrVar = zzdr.zza;
        this.zzd = zzdrVar;
        this.zze = zzdrVar;
        this.zzf = false;
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(ByteBuffer byteBuffer) {
        boolean z10;
        do {
            int i10 = 0;
            z10 = false;
            while (i10 <= zzi()) {
                int i11 = i10 + 1;
                if (!this.zzc[i10].hasRemaining()) {
                    zzdt zzdtVar = (zzdt) this.zzb.get(i10);
                    if (!zzdtVar.zzh()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.zzc[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzdt.zza;
                        long remaining = byteBuffer2.remaining();
                        zzdtVar.zze(byteBuffer2);
                        this.zzc[i10] = zzdtVar.zzb();
                        long remaining2 = remaining - byteBuffer2.remaining();
                        boolean z11 = true;
                        if (remaining2 <= 0 && !this.zzc[i10].hasRemaining()) {
                            z11 = false;
                        }
                        z10 |= z11;
                    } else if (!this.zzc[i10].hasRemaining() && i10 < zzi()) {
                        ((zzdt) this.zzb.get(i11)).zzd();
                    }
                }
                i10 = i11;
            }
        } while (z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdq)) {
            return false;
        }
        zzdq zzdqVar = (zzdq) obj;
        if (this.zza.size() != zzdqVar.zza.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            if (this.zza.get(i10) != zzdqVar.zza.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzdr zza(zzdr zzdrVar) {
        if (zzdrVar.equals(zzdr.zza)) {
            throw new zzds("Unhandled input format:", zzdrVar);
        }
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            zzdt zzdtVar = (zzdt) this.zza.get(i10);
            zzdr zza = zzdtVar.zza(zzdrVar);
            if (zzdtVar.zzg()) {
                zzek.zzf(!zza.equals(zzdr.zza));
                zzdrVar = zza;
            }
        }
        this.zze = zzdrVar;
        return zzdrVar;
    }

    public final ByteBuffer zzb() {
        if (!zzh()) {
            return zzdt.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzi()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzj(zzdt.zza);
        return this.zzc[zzi()];
    }

    public final void zzc() {
        this.zzb.clear();
        this.zzd = this.zze;
        this.zzf = false;
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            zzdt zzdtVar = (zzdt) this.zza.get(i10);
            zzdtVar.zzc();
            if (zzdtVar.zzg()) {
                this.zzb.add(zzdtVar);
            }
        }
        this.zzc = new ByteBuffer[this.zzb.size()];
        for (int i11 = 0; i11 <= zzi(); i11++) {
            this.zzc[i11] = ((zzdt) this.zzb.get(i11)).zzb();
        }
    }

    public final void zzd() {
        if (!zzh() || this.zzf) {
            return;
        }
        this.zzf = true;
        ((zzdt) this.zzb.get(0)).zzd();
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (!zzh() || this.zzf) {
            return;
        }
        zzj(byteBuffer);
    }

    public final void zzf() {
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            zzdt zzdtVar = (zzdt) this.zza.get(i10);
            zzdtVar.zzc();
            zzdtVar.zzf();
        }
        this.zzc = new ByteBuffer[0];
        zzdr zzdrVar = zzdr.zza;
        this.zzd = zzdrVar;
        this.zze = zzdrVar;
        this.zzf = false;
    }

    public final boolean zzg() {
        return this.zzf && ((zzdt) this.zzb.get(zzi())).zzh() && !this.zzc[zzi()].hasRemaining();
    }

    public final boolean zzh() {
        return !this.zzb.isEmpty();
    }
}

package com.google.android.gms.internal.mlkit_vision_common;

import jd.b;
import jd.c;
import jd.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzao implements g {
    private boolean zza = false;
    private boolean zzb = false;
    private c zzc;
    private final zzak zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzao(zzak zzakVar) {
        this.zzd = zzakVar;
    }

    private final void zzb() {
        if (this.zza) {
            throw new b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.zza = true;
    }

    public final g add(double d10) {
        zzb();
        this.zzd.zza(this.zzc, d10, this.zzb);
        return this;
    }

    public final g add(float f10) {
        zzb();
        this.zzd.zzb(this.zzc, f10, this.zzb);
        return this;
    }

    public final g add(int i10) {
        zzb();
        this.zzd.zzd(this.zzc, i10, this.zzb);
        return this;
    }

    public final g add(long j10) {
        zzb();
        this.zzd.zze(this.zzc, j10, this.zzb);
        return this;
    }

    @Override // jd.g
    public final g add(String str) {
        zzb();
        this.zzd.zzc(this.zzc, str, this.zzb);
        return this;
    }

    @Override // jd.g
    public final g add(boolean z10) {
        zzb();
        this.zzd.zzd(this.zzc, z10 ? 1 : 0, this.zzb);
        return this;
    }

    public final g add(byte[] bArr) {
        zzb();
        this.zzd.zzc(this.zzc, bArr, this.zzb);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(c cVar, boolean z10) {
        this.zza = false;
        this.zzc = cVar;
        this.zzb = z10;
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
abstract class zzae extends zzi<String> {
    final CharSequence zza;
    private final zzj zzb;
    private final boolean zzc;
    private int zzd = 0;
    private int zze;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzae(zzab zzabVar, CharSequence charSequence) {
        zzj zzjVar;
        int i10;
        zzjVar = zzabVar.zza;
        this.zzb = zzjVar;
        this.zzc = false;
        i10 = zzabVar.zzd;
        this.zze = i10;
        this.zza = charSequence;
    }

    abstract int zza(int i10);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzi
    protected final /* synthetic */ String zza() {
        int i10 = this.zzd;
        while (true) {
            int i11 = this.zzd;
            if (i11 == -1) {
                zzb();
                return null;
            }
            int zzb = zzb(i11);
            if (zzb == -1) {
                zzb = this.zza.length();
                this.zzd = -1;
            } else {
                this.zzd = zza(zzb);
            }
            int i12 = this.zzd;
            if (i12 != i10) {
                while (i10 < zzb && this.zzb.zza(this.zza.charAt(i10))) {
                    i10++;
                }
                while (zzb > i10 && this.zzb.zza(this.zza.charAt(zzb - 1))) {
                    zzb--;
                }
                int i13 = this.zze;
                if (i13 == 1) {
                    zzb = this.zza.length();
                    this.zzd = -1;
                    while (zzb > i10 && this.zzb.zza(this.zza.charAt(zzb - 1))) {
                        zzb--;
                    }
                } else {
                    this.zze = i13 - 1;
                }
                return this.zza.subSequence(i10, zzb).toString();
            }
            int i14 = i12 + 1;
            this.zzd = i14;
            if (i14 > this.zza.length()) {
                this.zzd = -1;
            }
        }
    }

    abstract int zzb(int i10);
}

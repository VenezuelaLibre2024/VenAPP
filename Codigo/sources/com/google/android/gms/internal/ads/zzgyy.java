package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgyy extends zzgyv {
    private final OutputStream zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgyy(OutputStream outputStream, int i10) {
        super(i10);
        this.zzg = outputStream;
    }

    private final void zzF() {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzG(int i10) {
        if (this.zzb - this.zzc < i10) {
            zzF();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzH() {
        if (this.zzc > 0) {
            zzF();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzI(byte b10) {
        if (this.zzc == this.zzb) {
            zzF();
        }
        zzc(b10);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzJ(int i10, boolean z10) {
        zzG(11);
        zzf(i10 << 3);
        zzc(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzK(int i10, zzgyl zzgylVar) {
        zzs((i10 << 3) | 2);
        zzs(zzgylVar.zzd());
        zzgylVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgza, com.google.android.gms.internal.ads.zzgya
    public final void zza(byte[] bArr, int i10, int i11) {
        zzp(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzh(int i10, int i11) {
        zzG(14);
        zzf((i10 << 3) | 5);
        zzd(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzi(int i10) {
        zzG(4);
        zzd(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzj(int i10, long j10) {
        zzG(18);
        zzf((i10 << 3) | 1);
        zze(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzk(long j10) {
        zzG(8);
        zze(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzl(int i10, int i11) {
        zzG(20);
        zzf(i10 << 3);
        if (i11 >= 0) {
            zzf(i11);
        } else {
            zzg(i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzm(int i10) {
        if (i10 >= 0) {
            zzs(i10);
        } else {
            zzu(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzn(int i10, zzhbe zzhbeVar, zzhby zzhbyVar) {
        zzs((i10 << 3) | 2);
        zzs(((zzgxt) zzhbeVar).zzat(zzhbyVar));
        zzhbyVar.zzm(zzhbeVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzo(int i10, String str) {
        zzs((i10 << 3) | 2);
        zzv(str);
    }

    public final void zzp(byte[] bArr, int i10, int i11) {
        int i12 = this.zzb;
        int i13 = this.zzc;
        int i14 = i12 - i13;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, this.zza, i13, i11);
            this.zzc += i11;
        } else {
            System.arraycopy(bArr, i10, this.zza, i13, i14);
            int i15 = i10 + i14;
            this.zzc = this.zzb;
            this.zzd += i14;
            zzF();
            i11 -= i14;
            if (i11 <= this.zzb) {
                System.arraycopy(bArr, i15, this.zza, 0, i11);
                this.zzc = i11;
            } else {
                this.zzg.write(bArr, i15, i11);
            }
        }
        this.zzd += i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzq(int i10, int i11) {
        zzs((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzr(int i10, int i11) {
        zzG(20);
        zzf(i10 << 3);
        zzf(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzs(int i10) {
        zzG(5);
        zzf(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzt(int i10, long j10) {
        zzG(20);
        zzf(i10 << 3);
        zzg(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzu(long j10) {
        zzG(10);
        zzg(j10);
    }

    public final void zzv(String str) {
        int zze;
        try {
            int length = str.length() * 3;
            int zzz = zzgza.zzz(length);
            int i10 = zzz + length;
            int i11 = this.zzb;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int zzd = zzhde.zzd(str, bArr, 0, length);
                zzs(zzd);
                zzp(bArr, 0, zzd);
                return;
            }
            if (i10 > i11 - this.zzc) {
                zzF();
            }
            int zzz2 = zzgza.zzz(str.length());
            int i12 = this.zzc;
            try {
                if (zzz2 == zzz) {
                    int i13 = i12 + zzz2;
                    this.zzc = i13;
                    int zzd2 = zzhde.zzd(str, this.zza, i13, this.zzb - i13);
                    this.zzc = i12;
                    zze = (zzd2 - i12) - zzz2;
                    zzf(zze);
                    this.zzc = zzd2;
                } else {
                    zze = zzhde.zze(str);
                    zzf(zze);
                    this.zzc = zzhde.zzd(str, this.zza, this.zzc, zze);
                }
                this.zzd += zze;
            } catch (zzhdd e10) {
                this.zzd -= this.zzc - i12;
                this.zzc = i12;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new zzgyx(e11);
            }
        } catch (zzhdd e12) {
            zzD(str, e12);
        }
    }
}

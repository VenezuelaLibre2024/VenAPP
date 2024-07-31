package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class zzrl extends zzdu {
    private int zzd;
    private boolean zze;
    private byte[] zzf;
    private byte[] zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private long zzl;

    public zzrl() {
        byte[] bArr = zzfy.zzf;
        this.zzf = bArr;
        this.zzg = bArr;
    }

    private final int zzq(long j10) {
        return (int) ((j10 * this.zzb.zzb) / 1000000);
    }

    private final int zzr(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > 1024) {
                int i10 = this.zzd;
                return i10 * (position / i10);
            }
        }
        return byteBuffer.limit();
    }

    private final void zzs(byte[] bArr, int i10) {
        zzj(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.zzk = true;
        }
    }

    private final void zzt(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.zzj);
        int i11 = this.zzj - min;
        System.arraycopy(bArr, i10 - i11, this.zzg, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.zzg, i11, min);
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zze(ByteBuffer byteBuffer) {
        int limit;
        int position;
        while (byteBuffer.hasRemaining() && !zzn()) {
            int i10 = this.zzh;
            int i11 = 1;
            if (i10 == 0) {
                limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.zzf.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.getShort(limit2)) > 1024) {
                        int i12 = this.zzd;
                        position = ((limit2 / i12) * i12) + i12;
                        break;
                    }
                }
                if (position != byteBuffer.position()) {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    zzj(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.zzk = true;
                    }
                    byteBuffer.limit(limit);
                }
                this.zzh = i11;
                byteBuffer.limit(limit);
            } else if (i10 != 1) {
                limit = byteBuffer.limit();
                int zzr = zzr(byteBuffer);
                byteBuffer.limit(zzr);
                this.zzl += byteBuffer.remaining() / this.zzd;
                zzt(byteBuffer, this.zzg, this.zzj);
                if (zzr < limit) {
                    zzs(this.zzg, this.zzj);
                    this.zzh = 0;
                    byteBuffer.limit(limit);
                }
            } else {
                limit = byteBuffer.limit();
                int zzr2 = zzr(byteBuffer);
                int position2 = zzr2 - byteBuffer.position();
                byte[] bArr = this.zzf;
                int length = bArr.length;
                int i13 = this.zzi;
                int i14 = length - i13;
                if (zzr2 >= limit || position2 >= i14) {
                    int min = Math.min(position2, i14);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.zzf, this.zzi, min);
                    int i15 = this.zzi + min;
                    this.zzi = i15;
                    byte[] bArr2 = this.zzf;
                    if (i15 == bArr2.length) {
                        if (this.zzk) {
                            zzs(bArr2, this.zzj);
                            long j10 = this.zzl;
                            int i16 = this.zzi;
                            int i17 = this.zzj;
                            this.zzl = j10 + ((i16 - (i17 + i17)) / this.zzd);
                            i15 = i16;
                        } else {
                            this.zzl += (i15 - this.zzj) / this.zzd;
                        }
                        zzt(byteBuffer, this.zzf, i15);
                        this.zzi = 0;
                        i11 = 2;
                        this.zzh = i11;
                    }
                    byteBuffer.limit(limit);
                } else {
                    zzs(bArr, i13);
                    this.zzi = 0;
                    this.zzh = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdu, com.google.android.gms.internal.ads.zzdt
    public final boolean zzg() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    public final zzdr zzi(zzdr zzdrVar) {
        if (zzdrVar.zzd == 2) {
            return this.zze ? zzdrVar : zzdr.zza;
        }
        throw new zzds("Unhandled input format:", zzdrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    protected final void zzk() {
        if (this.zze) {
            this.zzd = this.zzb.zze;
            int zzq = zzq(150000L) * this.zzd;
            if (this.zzf.length != zzq) {
                this.zzf = new byte[zzq];
            }
            int zzq2 = zzq(20000L) * this.zzd;
            this.zzj = zzq2;
            if (this.zzg.length != zzq2) {
                this.zzg = new byte[zzq2];
            }
        }
        this.zzh = 0;
        this.zzl = 0L;
        this.zzi = 0;
        this.zzk = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    protected final void zzl() {
        int i10 = this.zzi;
        if (i10 > 0) {
            zzs(this.zzf, i10);
            this.zzi = 0;
            this.zzh = 0;
        }
        if (this.zzk) {
            return;
        }
        this.zzl += this.zzj / this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    protected final void zzm() {
        this.zze = false;
        this.zzj = 0;
        byte[] bArr = zzfy.zzf;
        this.zzf = bArr;
        this.zzg = bArr;
    }

    public final long zzo() {
        return this.zzl;
    }

    public final void zzp(boolean z10) {
        this.zze = z10;
    }
}

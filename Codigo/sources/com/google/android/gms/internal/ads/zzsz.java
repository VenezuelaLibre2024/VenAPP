package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class zzsz extends zziq {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private int zzA;
    private boolean zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private long zzH;
    private int zzI;
    private int zzJ;
    private ByteBuffer zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private long zzX;
    private long zzY;
    private boolean zzZ;
    protected zzir zza;
    private boolean zzaa;
    private boolean zzab;
    private zzsy zzac;
    private long zzad;
    private boolean zzae;
    private zzrz zzaf;
    private zzrz zzag;
    private final zzsq zzc;
    private final zztb zzd;
    private final float zze;
    private final zzih zzf;
    private final zzih zzg;
    private final zzih zzh;
    private final zzsn zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzrk zzl;
    private zzam zzm;
    private zzam zzn;
    private MediaCrypto zzo;
    private boolean zzp;
    private long zzq;
    private float zzr;
    private zzsr zzs;
    private zzam zzt;
    private MediaFormat zzu;
    private boolean zzv;
    private float zzw;
    private ArrayDeque zzx;
    private zzsx zzy;
    private zzsv zzz;

    public zzsz(int i10, zzsq zzsqVar, zztb zztbVar, boolean z10, float f10) {
        super(i10);
        this.zzc = zzsqVar;
        zztbVar.getClass();
        this.zzd = zztbVar;
        this.zze = f10;
        this.zzf = new zzih(0, 0);
        this.zzg = new zzih(0, 0);
        this.zzh = new zzih(2, 0);
        zzsn zzsnVar = new zzsn();
        this.zzi = zzsnVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzr = 1.0f;
        this.zzq = -9223372036854775807L;
        this.zzk = new ArrayDeque();
        this.zzac = zzsy.zza;
        zzsnVar.zzi(0);
        zzsnVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzrk();
        this.zzw = -1.0f;
        this.zzA = 0;
        this.zzR = 0;
        this.zzI = -1;
        this.zzJ = -1;
        this.zzH = -9223372036854775807L;
        this.zzX = -9223372036854775807L;
        this.zzY = -9223372036854775807L;
        this.zzad = -9223372036854775807L;
        this.zzS = 0;
        this.zzT = 0;
        this.zza = new zzir();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean zzaJ(zzam zzamVar) {
        return zzamVar.zzG == 0;
    }

    private final void zzaK() {
        int i10 = this.zzT;
        if (i10 == 1) {
            zzag();
            return;
        }
        if (i10 == 2) {
            zzag();
            zzaO();
        } else if (i10 != 3) {
            this.zzaa = true;
            zzao();
        } else {
            zzaB();
            zzax();
        }
    }

    private final void zzaL() {
        this.zzI = -1;
        this.zzg.zzc = null;
    }

    private final void zzaM() {
        this.zzJ = -1;
        this.zzK = null;
    }

    private final void zzaN(zzsy zzsyVar) {
        this.zzac = zzsyVar;
        if (zzsyVar.zzd != -9223372036854775807L) {
            this.zzae = true;
        }
    }

    private final void zzaO() {
        zzrz zzrzVar = this.zzag;
        zzrzVar.getClass();
        this.zzaf = zzrzVar;
        this.zzS = 0;
        this.zzT = 0;
    }

    private final boolean zzaP() {
        if (this.zzU) {
            this.zzS = 1;
            if (this.zzC) {
                this.zzT = 3;
                return false;
            }
            this.zzT = 2;
        } else {
            zzaO();
        }
        return true;
    }

    private final boolean zzaQ() {
        zzsr zzsrVar = this.zzs;
        if (zzsrVar == null || this.zzS == 2 || this.zzZ) {
            return false;
        }
        if (this.zzI < 0) {
            int zza = zzsrVar.zza();
            this.zzI = zza;
            if (zza < 0) {
                return false;
            }
            this.zzg.zzc = zzsrVar.zzf(zza);
            this.zzg.zzb();
        }
        if (this.zzS == 1) {
            if (!this.zzG) {
                this.zzV = true;
                zzsrVar.zzj(this.zzI, 0, 0, 0L, 4);
                zzaL();
            }
            this.zzS = 2;
            return false;
        }
        if (this.zzE) {
            this.zzE = false;
            ByteBuffer byteBuffer = this.zzg.zzc;
            byteBuffer.getClass();
            byteBuffer.put(zzb);
            zzsrVar.zzj(this.zzI, 0, 38, 0L, 0);
            zzaL();
            this.zzU = true;
            return true;
        }
        if (this.zzR == 1) {
            int i10 = 0;
            while (true) {
                zzam zzamVar = this.zzt;
                zzamVar.getClass();
                if (i10 >= zzamVar.zzo.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.zzt.zzo.get(i10);
                ByteBuffer byteBuffer2 = this.zzg.zzc;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i10++;
            }
            this.zzR = 2;
        }
        ByteBuffer byteBuffer3 = this.zzg.zzc;
        byteBuffer3.getClass();
        int position = byteBuffer3.position();
        zzlb zzbi = zzbi();
        try {
            int zzbg = zzbg(zzbi, this.zzg, 0);
            if (zzbg == -3) {
                if (zzP()) {
                    this.zzY = this.zzX;
                }
                return false;
            }
            if (zzbg == -5) {
                if (this.zzR == 2) {
                    this.zzg.zzb();
                    this.zzR = 1;
                }
                zzab(zzbi);
                return true;
            }
            zzih zzihVar = this.zzg;
            if (zzihVar.zzf()) {
                this.zzY = this.zzX;
                if (this.zzR == 2) {
                    zzihVar.zzb();
                    this.zzR = 1;
                }
                this.zzZ = true;
                if (!this.zzU) {
                    zzaK();
                    return false;
                }
                try {
                    if (!this.zzG) {
                        this.zzV = true;
                        zzsrVar.zzj(this.zzI, 0, 0, 0L, 4);
                        zzaL();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e10) {
                    throw zzi(e10, this.zzm, false, zzfy.zzi(e10.getErrorCode()));
                }
            }
            if (!this.zzU && !zzihVar.zzg()) {
                zzihVar.zzb();
                if (this.zzR == 2) {
                    this.zzR = 1;
                }
                return true;
            }
            boolean zzk = zzihVar.zzk();
            if (zzk) {
                zzihVar.zzb.zzb(position);
            }
            long j10 = this.zzg.zze;
            if (this.zzab) {
                zzfv zzfvVar = (!this.zzk.isEmpty() ? (zzsy) this.zzk.peekLast() : this.zzac).zze;
                zzam zzamVar2 = this.zzm;
                zzamVar2.getClass();
                zzfvVar.zzd(j10, zzamVar2);
                this.zzab = false;
            }
            long max = Math.max(this.zzX, j10);
            this.zzX = max;
            if (zzP() || this.zzg.zzh()) {
                this.zzY = max;
            }
            this.zzg.zzj();
            zzih zzihVar2 = this.zzg;
            if (zzihVar2.zze()) {
                zzah(zzihVar2);
            }
            zzaz(this.zzg);
            zzar(this.zzg);
            try {
                if (zzk) {
                    zzsrVar.zzk(this.zzI, 0, this.zzg.zzb, j10, 0);
                } else {
                    int i11 = this.zzI;
                    ByteBuffer byteBuffer4 = this.zzg.zzc;
                    byteBuffer4.getClass();
                    zzsrVar.zzj(i11, 0, byteBuffer4.limit(), j10, 0);
                }
                zzaL();
                this.zzU = true;
                this.zzR = 0;
                this.zza.zzc++;
                return true;
            } catch (MediaCodec.CryptoException e11) {
                throw zzi(e11, this.zzm, false, zzfy.zzi(e11.getErrorCode()));
            }
        } catch (zzig e12) {
            zzai(e12);
            zzaT(0);
            zzag();
            return true;
        }
    }

    private final boolean zzaR() {
        return this.zzJ >= 0;
    }

    private final boolean zzaS(long j10, long j11) {
        if (j11 >= j10) {
            return false;
        }
        zzam zzamVar = this.zzn;
        if (zzamVar == null || !Objects.equals(zzamVar.zzm, "audio/opus")) {
            return true;
        }
        return !zzadq.zzf(j10, j11);
    }

    private final boolean zzaT(int i10) {
        zzih zzihVar = this.zzf;
        zzlb zzbi = zzbi();
        zzihVar.zzb();
        int zzbg = zzbg(zzbi, this.zzf, i10 | 4);
        if (zzbg == -5) {
            zzab(zzbi);
            return true;
        }
        if (zzbg != -4 || !this.zzf.zzf()) {
            return false;
        }
        this.zzZ = true;
        zzaK();
        return false;
    }

    private final boolean zzaU(long j10) {
        if (this.zzq == -9223372036854775807L) {
            return true;
        }
        zzh();
        return SystemClock.elapsedRealtime() - j10 < this.zzq;
    }

    private final boolean zzaV(zzam zzamVar) {
        if (zzfy.zza >= 23 && this.zzs != null && this.zzT != 3 && zzbf() != 0) {
            float f10 = this.zzr;
            zzamVar.getClass();
            float zzY = zzY(f10, zzamVar, zzS());
            float f11 = this.zzw;
            if (f11 != zzY) {
                if (zzY == -1.0f) {
                    zzad();
                    return false;
                }
                if (f11 != -1.0f || zzY > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", zzY);
                    zzsr zzsrVar = this.zzs;
                    zzsrVar.getClass();
                    zzsrVar.zzp(bundle);
                    this.zzw = zzY;
                }
            }
        }
        return true;
    }

    private final void zzac() {
        this.zzP = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzO = false;
        this.zzN = false;
        this.zzl.zzb();
    }

    private final void zzad() {
        if (this.zzU) {
            this.zzS = 1;
            this.zzT = 3;
        } else {
            zzaB();
            zzax();
        }
    }

    private final void zzag() {
        try {
            zzsr zzsrVar = this.zzs;
            zzek.zzb(zzsrVar);
            zzsrVar.zzi();
        } finally {
            zzaC();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0406  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzam(com.google.android.gms.internal.ads.zzsv r19, android.media.MediaCrypto r20) {
        /*
            Method dump skipped, instructions count: 1081
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsz.zzam(com.google.android.gms.internal.ads.zzsv, android.media.MediaCrypto):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zziq
    public void zzB() {
        try {
            zzac();
            zzaB();
        } finally {
            this.zzag = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5 >= r1) goto L14;
     */
    @Override // com.google.android.gms.internal.ads.zziq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void zzE(com.google.android.gms.internal.ads.zzam[] r13, long r14, long r16, com.google.android.gms.internal.ads.zzur r18) {
        /*
            r12 = this;
            r0 = r12
            com.google.android.gms.internal.ads.zzsy r1 = r0.zzac
            long r1 = r1.zzd
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            com.google.android.gms.internal.ads.zzsy r1 = new com.google.android.gms.internal.ads.zzsy
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzaN(r1)
            return
        L20:
            java.util.ArrayDeque r1 = r0.zzk
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            long r1 = r0.zzX
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L38
            long r5 = r0.zzad
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L55
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L55
        L38:
            com.google.android.gms.internal.ads.zzsy r1 = new com.google.android.gms.internal.ads.zzsy
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzaN(r1)
            com.google.android.gms.internal.ads.zzsy r1 = r0.zzac
            long r1 = r1.zzd
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L54
            r12.zzan()
        L54:
            return
        L55:
            java.util.ArrayDeque r1 = r0.zzk
            com.google.android.gms.internal.ads.zzsy r9 = new com.google.android.gms.internal.ads.zzsy
            long r3 = r0.zzX
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsz.zzE(com.google.android.gms.internal.ads.zzam[], long, long, com.google.android.gms.internal.ads.zzur):void");
    }

    @Override // com.google.android.gms.internal.ads.zziq, com.google.android.gms.internal.ads.zzmf
    public void zzL(float f10, float f11) {
        this.zzr = f11;
        zzaV(this.zzt);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.zzmf
    public void zzU(long r24, long r26) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsz.zzU(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public boolean zzV() {
        return this.zzaa;
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public boolean zzW() {
        if (this.zzm == null) {
            return false;
        }
        if (zzR() || zzaR()) {
            return true;
        }
        if (this.zzH == -9223372036854775807L) {
            return false;
        }
        zzh();
        return SystemClock.elapsedRealtime() < this.zzH;
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public final int zzX(zzam zzamVar) {
        try {
            return zzZ(this.zzd, zzamVar);
        } catch (zzth e10) {
            throw zzi(e10, zzamVar, false, 4002);
        }
    }

    protected float zzY(float f10, zzam zzamVar, zzam[] zzamVarArr) {
        throw null;
    }

    protected abstract int zzZ(zztb zztbVar, zzam zzamVar);

    protected void zzaA(zzam zzamVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzaB() {
        try {
            zzsr zzsrVar = this.zzs;
            if (zzsrVar != null) {
                zzsrVar.zzl();
                this.zza.zzb++;
                zzsv zzsvVar = this.zzz;
                zzsvVar.getClass();
                zzak(zzsvVar.zza);
            }
        } finally {
            this.zzs = null;
            this.zzo = null;
            this.zzaf = null;
            zzaD();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzaC() {
        zzaL();
        zzaM();
        this.zzH = -9223372036854775807L;
        this.zzV = false;
        this.zzU = false;
        this.zzE = false;
        this.zzF = false;
        this.zzL = false;
        this.zzM = false;
        this.zzX = -9223372036854775807L;
        this.zzY = -9223372036854775807L;
        this.zzad = -9223372036854775807L;
        this.zzS = 0;
        this.zzT = 0;
        this.zzR = this.zzQ ? 1 : 0;
    }

    protected final void zzaD() {
        zzaC();
        this.zzx = null;
        this.zzz = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = false;
        this.zzW = false;
        this.zzw = -1.0f;
        this.zzA = 0;
        this.zzB = false;
        this.zzC = false;
        this.zzD = false;
        this.zzG = false;
        this.zzQ = false;
        this.zzR = 0;
        this.zzp = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzaE() {
        boolean zzaF = zzaF();
        if (zzaF) {
            zzax();
        }
        return zzaF;
    }

    protected final boolean zzaF() {
        if (this.zzs == null) {
            return false;
        }
        int i10 = this.zzT;
        if (i10 == 3 || ((this.zzB && !this.zzW) || (this.zzC && this.zzV))) {
            zzaB();
            return true;
        }
        if (i10 == 2) {
            int i11 = zzfy.zza;
            zzek.zzf(i11 >= 23);
            if (i11 >= 23) {
                try {
                    zzaO();
                } catch (zziz e10) {
                    zzff.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    zzaB();
                    return true;
                }
            }
        }
        zzag();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzaG() {
        return this.zzN;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzaH(zzam zzamVar) {
        return this.zzag == null && zzaq(zzamVar);
    }

    protected boolean zzaI(zzsv zzsvVar) {
        return true;
    }

    protected zzis zzaa(zzsv zzsvVar, zzam zzamVar, zzam zzamVar2) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        if (zzaP() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0092, code lost:
    
        if (zzaP() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a5, code lost:
    
        if (zzaP() == false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.zzis zzab(com.google.android.gms.internal.ads.zzlb r12) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsz.zzab(com.google.android.gms.internal.ads.zzlb):com.google.android.gms.internal.ads.zzis");
    }

    protected abstract zzsp zzae(zzsv zzsvVar, zzam zzamVar, MediaCrypto mediaCrypto, float f10);

    protected abstract List zzaf(zztb zztbVar, zzam zzamVar, boolean z10);

    protected void zzah(zzih zzihVar) {
        throw null;
    }

    protected void zzai(Exception exc) {
        throw null;
    }

    protected void zzaj(String str, zzsp zzspVar, long j10, long j11) {
        throw null;
    }

    protected void zzak(String str) {
        throw null;
    }

    protected void zzal(zzam zzamVar, MediaFormat mediaFormat) {
        throw null;
    }

    protected void zzan() {
    }

    protected void zzao() {
    }

    protected abstract boolean zzap(long j10, long j11, zzsr zzsrVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzam zzamVar);

    protected boolean zzaq(zzam zzamVar) {
        return false;
    }

    protected int zzar(zzih zzihVar) {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzas() {
        return this.zzac.zzd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzat() {
        return this.zzac.zzc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzsr zzau() {
        return this.zzs;
    }

    protected zzst zzav(Throwable th2, zzsv zzsvVar) {
        return new zzst(th2, zzsvVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzsv zzaw() {
        return this.zzz;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00eb A[Catch: zzsx -> 0x010a, TryCatch #3 {zzsx -> 0x010a, blocks: (B:25:0x005a, B:27:0x005f, B:76:0x0064, B:78:0x007a, B:79:0x0085, B:30:0x0092, B:32:0x009a, B:34:0x009f, B:35:0x00a5, B:37:0x00a9, B:39:0x00b2, B:53:0x00d1, B:55:0x00eb, B:56:0x00f4, B:61:0x00fb, B:62:0x00fd, B:63:0x00ee, B:71:0x00fe, B:73:0x0101, B:74:0x0109, B:82:0x0089, B:83:0x0091, B:50:0x00c1, B:65:0x00cf, B:42:0x00b8), top: B:24:0x005a, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee A[Catch: zzsx -> 0x010a, TryCatch #3 {zzsx -> 0x010a, blocks: (B:25:0x005a, B:27:0x005f, B:76:0x0064, B:78:0x007a, B:79:0x0085, B:30:0x0092, B:32:0x009a, B:34:0x009f, B:35:0x00a5, B:37:0x00a9, B:39:0x00b2, B:53:0x00d1, B:55:0x00eb, B:56:0x00f4, B:61:0x00fb, B:62:0x00fd, B:63:0x00ee, B:71:0x00fe, B:73:0x0101, B:74:0x0109, B:82:0x0089, B:83:0x0091, B:50:0x00c1, B:65:0x00cf, B:42:0x00b8), top: B:24:0x005a, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzax() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsz.zzax():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzay(long j10) {
        this.zzad = j10;
        while (!this.zzk.isEmpty() && j10 >= ((zzsy) this.zzk.peek()).zzb) {
            zzsy zzsyVar = (zzsy) this.zzk.poll();
            zzsyVar.getClass();
            zzaN(zzsyVar);
            zzan();
        }
    }

    protected void zzaz(zzih zzihVar) {
    }

    @Override // com.google.android.gms.internal.ads.zziq, com.google.android.gms.internal.ads.zzmh
    public final int zze() {
        return 8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zziq
    public void zzw() {
        this.zzm = null;
        zzaN(zzsy.zza);
        this.zzk.clear();
        zzaF();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zziq
    public void zzx(boolean z10, boolean z11) {
        this.zza = new zzir();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zziq
    public void zzz(long j10, boolean z10) {
        this.zzZ = false;
        this.zzaa = false;
        if (this.zzN) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzO = false;
            this.zzl.zzb();
        } else {
            zzaE();
        }
        zzfv zzfvVar = this.zzac.zze;
        if (zzfvVar.zza() > 0) {
            this.zzab = true;
        }
        zzfvVar.zze();
        this.zzk.clear();
    }
}

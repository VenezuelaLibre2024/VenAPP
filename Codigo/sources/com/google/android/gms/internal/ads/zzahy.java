package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class zzahy implements zzacu {
    public static final zzadb zza = new zzadb() { // from class: com.google.android.gms.internal.ads.zzahu
        @Override // com.google.android.gms.internal.ads.zzadb
        public final /* synthetic */ zzacu[] zza(Uri uri, Map map) {
            int i10 = zzada.zza;
            return new zzacu[]{new zzahy(0)};
        }
    };
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private zzahx zzB;
    private boolean zzC;
    private int zzD;
    private long zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private long zzI;
    private zzfg zzJ;
    private zzfg zzK;
    private boolean zzL;
    private boolean zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int[] zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private int zzZ;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private byte zzag;
    private boolean zzah;
    private zzacx zzai;
    private final zzaht zzh;
    private final zzaia zzi;
    private final SparseArray zzj;
    private final boolean zzk;
    private final zzfp zzl;
    private final zzfp zzm;
    private final zzfp zzn;
    private final zzfp zzo;
    private final zzfp zzp;
    private final zzfp zzq;
    private final zzfp zzr;
    private final zzfp zzs;
    private final zzfp zzt;
    private final zzfp zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i10 = zzfy.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(zzfwq.zzc);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        zzg = Collections.unmodifiableMap(hashMap);
    }

    public zzahy() {
        this(0);
    }

    public zzahy(int i10) {
        zzahr zzahrVar = new zzahr();
        this.zzx = -1L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzG = -1L;
        this.zzH = -1L;
        this.zzI = -9223372036854775807L;
        this.zzh = zzahrVar;
        zzahrVar.zza(new zzahw(this, null));
        this.zzk = true;
        this.zzi = new zzaia();
        this.zzj = new SparseArray();
        this.zzn = new zzfp(4);
        this.zzo = new zzfp(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzfp(4);
        this.zzl = new zzfp(zzgm.zza);
        this.zzm = new zzfp(4);
        this.zzq = new zzfp();
        this.zzr = new zzfp();
        this.zzs = new zzfp(8);
        this.zzt = new zzfp();
        this.zzu = new zzfp();
        this.zzS = new int[1];
    }

    private final int zzn(zzacv zzacvVar, zzahx zzahxVar, int i10, boolean z10) {
        int i11;
        if ("S_TEXT/UTF8".equals(zzahxVar.zzb)) {
            zzv(zzacvVar, zzb, i10);
        } else if ("S_TEXT/ASS".equals(zzahxVar.zzb)) {
            zzv(zzacvVar, zzd, i10);
        } else if ("S_TEXT/WEBVTT".equals(zzahxVar.zzb)) {
            zzv(zzacvVar, zze, i10);
        } else {
            zzaea zzaeaVar = zzahxVar.zzW;
            if (!this.zzac) {
                if (zzahxVar.zzg) {
                    this.zzV &= -1073741825;
                    boolean z11 = this.zzad;
                    int i12 = RecognitionOptions.ITF;
                    if (!z11) {
                        ((zzack) zzacvVar).zzn(this.zzn.zzM(), 0, 1, false);
                        this.zzZ++;
                        if ((this.zzn.zzM()[0] & 128) == 128) {
                            throw zzcc.zza("Extension bit is set in signal byte", null);
                        }
                        this.zzag = this.zzn.zzM()[0];
                        this.zzad = true;
                    }
                    byte b10 = this.zzag;
                    if ((b10 & 1) == 1) {
                        int i13 = b10 & 2;
                        this.zzV |= 1073741824;
                        if (!this.zzah) {
                            ((zzack) zzacvVar).zzn(this.zzs.zzM(), 0, 8, false);
                            this.zzZ += 8;
                            this.zzah = true;
                            zzfp zzfpVar = this.zzn;
                            if (i13 != 2) {
                                i12 = 0;
                            }
                            zzfpVar.zzM()[0] = (byte) (i12 | 8);
                            this.zzn.zzK(0);
                            zzaeaVar.zzs(this.zzn, 1, 1);
                            this.zzaa++;
                            this.zzs.zzK(0);
                            zzaeaVar.zzs(this.zzs, 8, 1);
                            this.zzaa += 8;
                        }
                        if (i13 == 2) {
                            if (!this.zzae) {
                                ((zzack) zzacvVar).zzn(this.zzn.zzM(), 0, 1, false);
                                this.zzZ++;
                                this.zzn.zzK(0);
                                this.zzaf = this.zzn.zzm();
                                this.zzae = true;
                            }
                            int i14 = this.zzaf * 4;
                            this.zzn.zzH(i14);
                            ((zzack) zzacvVar).zzn(this.zzn.zzM(), 0, i14, false);
                            this.zzZ += i14;
                            int i15 = (this.zzaf >> 1) + 1;
                            int i16 = (i15 * 6) + 2;
                            ByteBuffer byteBuffer = this.zzv;
                            if (byteBuffer == null || byteBuffer.capacity() < i16) {
                                this.zzv = ByteBuffer.allocate(i16);
                            }
                            this.zzv.position(0);
                            this.zzv.putShort((short) i15);
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                i11 = this.zzaf;
                                if (i17 >= i11) {
                                    break;
                                }
                                int zzp = this.zzn.zzp();
                                int i19 = zzp - i18;
                                if (i17 % 2 == 0) {
                                    this.zzv.putShort((short) i19);
                                } else {
                                    this.zzv.putInt(i19);
                                }
                                i17++;
                                i18 = zzp;
                            }
                            int i20 = (i10 - this.zzZ) - i18;
                            if ((i11 & 1) == 1) {
                                this.zzv.putInt(i20);
                            } else {
                                this.zzv.putShort((short) i20);
                                this.zzv.putInt(0);
                            }
                            this.zzt.zzI(this.zzv.array(), i16);
                            zzaeaVar.zzs(this.zzt, i16, 1);
                            this.zzaa += i16;
                        }
                    }
                } else {
                    byte[] bArr = zzahxVar.zzh;
                    if (bArr != null) {
                        this.zzq.zzI(bArr, bArr.length);
                    }
                }
                if (!"A_OPUS".equals(zzahxVar.zzb) ? zzahxVar.zzf > 0 : z10) {
                    this.zzV |= 268435456;
                    this.zzu.zzH(0);
                    int zze2 = (this.zzq.zze() + i10) - this.zzZ;
                    this.zzn.zzH(4);
                    this.zzn.zzM()[0] = (byte) ((zze2 >> 24) & 255);
                    this.zzn.zzM()[1] = (byte) ((zze2 >> 16) & 255);
                    this.zzn.zzM()[2] = (byte) ((zze2 >> 8) & 255);
                    this.zzn.zzM()[3] = (byte) (zze2 & 255);
                    zzaeaVar.zzs(this.zzn, 4, 2);
                    this.zzaa += 4;
                }
                this.zzac = true;
            }
            int zze3 = i10 + this.zzq.zze();
            if (!"V_MPEG4/ISO/AVC".equals(zzahxVar.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzahxVar.zzb)) {
                if (zzahxVar.zzT != null) {
                    zzek.zzf(this.zzq.zze() == 0);
                    zzahxVar.zzT.zzd(zzacvVar);
                }
                while (true) {
                    int i21 = this.zzZ;
                    if (i21 >= zze3) {
                        break;
                    }
                    int zzo = zzo(zzacvVar, zzaeaVar, zze3 - i21);
                    this.zzZ += zzo;
                    this.zzaa += zzo;
                }
            } else {
                byte[] zzM = this.zzm.zzM();
                zzM[0] = 0;
                zzM[1] = 0;
                zzM[2] = 0;
                int i22 = zzahxVar.zzX;
                int i23 = 4 - i22;
                while (this.zzZ < zze3) {
                    int i24 = this.zzab;
                    if (i24 == 0) {
                        int min = Math.min(i22, this.zzq.zzb());
                        ((zzack) zzacvVar).zzn(zzM, i23 + min, i22 - min, false);
                        if (min > 0) {
                            this.zzq.zzG(zzM, i23, min);
                        }
                        this.zzZ += i22;
                        this.zzm.zzK(0);
                        this.zzab = this.zzm.zzp();
                        this.zzl.zzK(0);
                        zzady.zzb(zzaeaVar, this.zzl, 4);
                        this.zzaa += 4;
                    } else {
                        int zzo2 = zzo(zzacvVar, zzaeaVar, i24);
                        this.zzZ += zzo2;
                        this.zzaa += zzo2;
                        this.zzab -= zzo2;
                    }
                }
            }
            if ("A_VORBIS".equals(zzahxVar.zzb)) {
                this.zzo.zzK(0);
                zzady.zzb(zzaeaVar, this.zzo, 4);
                this.zzaa += 4;
            }
        }
        int i25 = this.zzaa;
        zzu();
        return i25;
    }

    private final int zzo(zzacv zzacvVar, zzaea zzaeaVar, int i10) {
        int zzb2 = this.zzq.zzb();
        if (zzb2 <= 0) {
            return zzady.zza(zzaeaVar, zzacvVar, i10, false);
        }
        int min = Math.min(i10, zzb2);
        zzady.zzb(zzaeaVar, this.zzq, min);
        return min;
    }

    private final long zzp(long j10) {
        long j11 = this.zzy;
        if (j11 != -9223372036854775807L) {
            return zzfy.zzs(j10, j11, 1000L, RoundingMode.FLOOR);
        }
        throw zzcc.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private final void zzq(int i10) {
        if (this.zzJ == null || this.zzK == null) {
            throw zzcc.zza("Element " + i10 + " must be in a Cues", null);
        }
    }

    private final void zzr(int i10) {
        if (this.zzB != null) {
            return;
        }
        throw zzcc.zza("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de A[EDGE_INSN: B:51:0x00de->B:50:0x00de BREAK  A[LOOP:0: B:43:0x00c3->B:47:0x00db], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzs(com.google.android.gms.internal.ads.zzahx r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahy.zzs(com.google.android.gms.internal.ads.zzahx, long, int, int, int):void");
    }

    private final void zzt(zzacv zzacvVar, int i10) {
        if (this.zzn.zze() >= i10) {
            return;
        }
        if (this.zzn.zzc() < i10) {
            zzfp zzfpVar = this.zzn;
            int zzc2 = zzfpVar.zzc();
            zzfpVar.zzE(Math.max(zzc2 + zzc2, i10));
        }
        zzfp zzfpVar2 = this.zzn;
        ((zzack) zzacvVar).zzn(zzfpVar2.zzM(), zzfpVar2.zze(), i10 - zzfpVar2.zze(), false);
        this.zzn.zzJ(i10);
    }

    private final void zzu() {
        this.zzZ = 0;
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = false;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = 0;
        this.zzag = (byte) 0;
        this.zzah = false;
        this.zzq.zzH(0);
    }

    private final void zzv(zzacv zzacvVar, byte[] bArr, int i10) {
        int length = bArr.length;
        int i11 = length + i10;
        if (this.zzr.zzc() < i11) {
            zzfp zzfpVar = this.zzr;
            byte[] copyOf = Arrays.copyOf(bArr, i11 + i10);
            zzfpVar.zzI(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzr.zzM(), 0, length);
        }
        ((zzack) zzacvVar).zzn(this.zzr.zzM(), length, i10, false);
        this.zzr.zzK(0);
        this.zzr.zzJ(i11);
    }

    private static byte[] zzw(long j10, String str, long j11) {
        zzek.zzd(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i10 * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (i11 * 60000000);
        int i12 = (int) (j13 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11)));
        int i13 = zzfy.zza;
        return format.getBytes(zzfwq.zzc);
    }

    private static int[] zzx(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        int length = iArr.length;
        return length >= i10 ? iArr : new int[Math.max(length + length, i10)];
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzb(zzacv zzacvVar, zzadr zzadrVar) {
        this.zzM = false;
        while (!this.zzM) {
            if (!this.zzh.zzc(zzacvVar)) {
                for (int i10 = 0; i10 < this.zzj.size(); i10++) {
                    zzahx zzahxVar = (zzahx) this.zzj.valueAt(i10);
                    zzahx.zzd(zzahxVar);
                    zzaeb zzaebVar = zzahxVar.zzT;
                    if (zzaebVar != null) {
                        zzaebVar.zza(zzahxVar.zzW, zzahxVar.zzi);
                    }
                }
                return -1;
            }
            long zzf2 = zzacvVar.zzf();
            if (this.zzF) {
                this.zzH = zzf2;
                zzadrVar.zza = this.zzG;
                this.zzF = false;
                return 1;
            }
            if (this.zzC) {
                long j10 = this.zzH;
                if (j10 != -1) {
                    zzadrVar.zza = j10;
                    this.zzH = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzc(zzacx zzacxVar) {
        this.zzai = zzacxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzd(long j10, long j11) {
        this.zzI = -9223372036854775807L;
        this.zzN = 0;
        this.zzh.zzb();
        this.zzi.zze();
        zzu();
        for (int i10 = 0; i10 < this.zzj.size(); i10++) {
            zzaeb zzaebVar = ((zzahx) this.zzj.valueAt(i10)).zzT;
            if (zzaebVar != null) {
                zzaebVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zze(zzacv zzacvVar) {
        return new zzahz().zza(zzacvVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x027f, code lost:
    
        throw com.google.android.gms.internal.ads.zzcc.zza("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(int r20, int r21, com.google.android.gms.internal.ads.zzacv r22) {
        /*
            Method dump skipped, instructions count: 809
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahy.zzg(int, int, com.google.android.gms.internal.ads.zzacv):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01e9, code lost:
    
        if (r5.equals("V_MPEGH/ISO/HEVC") != false) goto L188;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(int r22) {
        /*
            Method dump skipped, instructions count: 1150
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahy.zzh(int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzi(int i10, double d10) {
        if (i10 == 181) {
            zzr(i10);
            this.zzB.zzQ = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.zzz = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                zzr(i10);
                this.zzB.zzD = (float) d10;
                return;
            case 21970:
                zzr(i10);
                this.zzB.zzE = (float) d10;
                return;
            case 21971:
                zzr(i10);
                this.zzB.zzF = (float) d10;
                return;
            case 21972:
                zzr(i10);
                this.zzB.zzG = (float) d10;
                return;
            case 21973:
                zzr(i10);
                this.zzB.zzH = (float) d10;
                return;
            case 21974:
                zzr(i10);
                this.zzB.zzI = (float) d10;
                return;
            case 21975:
                zzr(i10);
                this.zzB.zzJ = (float) d10;
                return;
            case 21976:
                zzr(i10);
                this.zzB.zzK = (float) d10;
                return;
            case 21977:
                zzr(i10);
                this.zzB.zzL = (float) d10;
                return;
            case 21978:
                zzr(i10);
                this.zzB.zzM = (float) d10;
                return;
            default:
                switch (i10) {
                    case 30323:
                        zzr(i10);
                        this.zzB.zzs = (float) d10;
                        return;
                    case 30324:
                        zzr(i10);
                        this.zzB.zzt = (float) d10;
                        return;
                    case 30325:
                        zzr(i10);
                        this.zzB.zzu = (float) d10;
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzj(int i10, long j10) {
        boolean z10;
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw zzcc.zza("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw zzcc.zza("ContentEncodingScope " + j10 + " not supported", null);
        }
        switch (i10) {
            case 131:
                zzr(i10);
                this.zzB.zzd = (int) j10;
                return;
            case 136:
                z10 = j10 == 1;
                zzr(i10);
                this.zzB.zzV = z10;
                return;
            case 155:
                this.zzP = zzp(j10);
                return;
            case 159:
                zzr(i10);
                this.zzB.zzO = (int) j10;
                return;
            case 176:
                zzr(i10);
                this.zzB.zzl = (int) j10;
                return;
            case 179:
                zzq(i10);
                this.zzJ.zzc(zzp(j10));
                return;
            case 186:
                zzr(i10);
                this.zzB.zzm = (int) j10;
                return;
            case 215:
                zzr(i10);
                this.zzB.zzc = (int) j10;
                return;
            case 231:
                this.zzI = zzp(j10);
                return;
            case 238:
                this.zzW = (int) j10;
                return;
            case 241:
                if (this.zzL) {
                    return;
                }
                zzq(i10);
                this.zzK.zzc(j10);
                this.zzL = true;
                return;
            case 251:
                this.zzX = true;
                return;
            case 16871:
                zzr(i10);
                zzahx.zzb(this.zzB, (int) j10);
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw zzcc.zza("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw zzcc.zza("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw zzcc.zza("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw zzcc.zza("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw zzcc.zza("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                this.zzE = j10 + this.zzx;
                return;
            case 21432:
                int i11 = (int) j10;
                zzr(i10);
                if (i11 == 0) {
                    this.zzB.zzw = 0;
                    return;
                }
                if (i11 == 1) {
                    this.zzB.zzw = 2;
                    return;
                } else if (i11 == 3) {
                    this.zzB.zzw = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.zzB.zzw = 3;
                    return;
                }
            case 21680:
                zzr(i10);
                this.zzB.zzo = (int) j10;
                return;
            case 21682:
                zzr(i10);
                this.zzB.zzq = (int) j10;
                return;
            case 21690:
                zzr(i10);
                this.zzB.zzp = (int) j10;
                return;
            case 21930:
                z10 = j10 == 1;
                zzr(i10);
                this.zzB.zzU = z10;
                return;
            case 21938:
                zzr(i10);
                zzahx zzahxVar = this.zzB;
                zzahxVar.zzx = true;
                zzahxVar.zzn = (int) j10;
                return;
            case 21998:
                zzr(i10);
                this.zzB.zzf = (int) j10;
                return;
            case 22186:
                zzr(i10);
                this.zzB.zzR = j10;
                return;
            case 22203:
                zzr(i10);
                this.zzB.zzS = j10;
                return;
            case 25188:
                zzr(i10);
                this.zzB.zzP = (int) j10;
                return;
            case 30114:
                this.zzY = j10;
                return;
            case 30321:
                int i12 = (int) j10;
                zzr(i10);
                if (i12 == 0) {
                    this.zzB.zzr = 0;
                    return;
                }
                if (i12 == 1) {
                    this.zzB.zzr = 1;
                    return;
                } else if (i12 == 2) {
                    this.zzB.zzr = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.zzB.zzr = 3;
                    return;
                }
            case 2352003:
                zzr(i10);
                this.zzB.zze = (int) j10;
                return;
            case 2807729:
                this.zzy = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        int i13 = (int) j10;
                        zzr(i10);
                        if (i13 == 1) {
                            this.zzB.zzA = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.zzB.zzA = 1;
                            return;
                        }
                    case 21946:
                        zzr(i10);
                        int zzb2 = zzt.zzb((int) j10);
                        if (zzb2 != -1) {
                            this.zzB.zzz = zzb2;
                            return;
                        }
                        return;
                    case 21947:
                        zzr(i10);
                        this.zzB.zzx = true;
                        int zza2 = zzt.zza((int) j10);
                        if (zza2 != -1) {
                            this.zzB.zzy = zza2;
                            return;
                        }
                        return;
                    case 21948:
                        zzr(i10);
                        this.zzB.zzB = (int) j10;
                        return;
                    case 21949:
                        zzr(i10);
                        this.zzB.zzC = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzk(int i10, long j10, long j11) {
        zzek.zzb(this.zzai);
        if (i10 == 160) {
            this.zzX = false;
            this.zzY = 0L;
            return;
        }
        if (i10 == 174) {
            this.zzB = new zzahx();
            return;
        }
        if (i10 == 187) {
            this.zzL = false;
            return;
        }
        if (i10 == 19899) {
            this.zzD = -1;
            this.zzE = -1L;
            return;
        }
        if (i10 == 20533) {
            zzr(i10);
            this.zzB.zzg = true;
            return;
        }
        if (i10 == 21968) {
            zzr(i10);
            this.zzB.zzx = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.zzx;
            if (j12 != -1 && j12 != j10) {
                throw zzcc.zza("Multiple Segment elements not supported", null);
            }
            this.zzx = j10;
            this.zzw = j11;
            return;
        }
        if (i10 == 475249515) {
            this.zzJ = new zzfg(32);
            this.zzK = new zzfg(32);
        } else if (i10 == 524531317 && !this.zzC) {
            if (this.zzk && this.zzG != -1) {
                this.zzF = true;
            } else {
                this.zzai.zzO(new zzadt(this.zzA, 0L));
                this.zzC = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzl(int i10, String str) {
        if (i10 == 134) {
            zzr(i10);
            this.zzB.zzb = str;
            return;
        }
        if (i10 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw zzcc.zza("DocType " + str + " not supported", null);
        }
        if (i10 == 21358) {
            zzr(i10);
            this.zzB.zza = str;
        } else {
            if (i10 != 2274716) {
                return;
            }
            zzr(i10);
            zzahx.zzc(this.zzB, str);
        }
    }
}

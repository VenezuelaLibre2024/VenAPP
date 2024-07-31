package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes2.dex */
public final class zzatd extends zzgzu implements zzhbf {
    private static final zzatd zzb;
    private long zzA;
    private long zzB;
    private long zzF;
    private long zzG;
    private long zzH;
    private long zzJ;
    private zzatf zzM;
    private zzasy zzaC;
    private long zzaI;
    private zzasp zzaL;
    private zzasr zzaM;
    private int zzaP;
    private long zzaQ;
    private boolean zzaT;
    private long zzaV;
    private zzatm zzaW;
    private zzata zzae;
    private zzatc zzag;
    private int zzar;
    private int zzas;
    private int zzat;
    private zzato zzau;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzg = "";
    private String zzh = "";
    private String zzs = "";
    private String zzC = "";
    private String zzD = "D";
    private String zzE = "";
    private String zzI = "";
    private long zzK = -1;
    private long zzL = -1;
    private long zzN = -1;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private String zzT = "D";
    private String zzU = "D";
    private long zzV = -1;
    private int zzW = AdError.NETWORK_ERROR_CODE;
    private int zzX = AdError.NETWORK_ERROR_CODE;
    private long zzY = -1;
    private long zzZ = -1;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private int zzad = AdError.NETWORK_ERROR_CODE;
    private zzhad zzaf = zzgzu.zzaN();
    private long zzah = -1;
    private long zzai = -1;
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private String zzap = "D";
    private long zzaq = -1;
    private long zzav = -1;
    private int zzaw = AdError.NETWORK_ERROR_CODE;
    private int zzax = AdError.NETWORK_ERROR_CODE;
    private String zzay = "D";
    private zzhad zzaz = zzgzu.zzaN();
    private int zzaA = AdError.NETWORK_ERROR_CODE;
    private zzhad zzaB = zzgzu.zzaN();
    private String zzaD = "";
    private long zzaE = -1;
    private long zzaF = -1;
    private long zzaG = -1;
    private long zzaH = -1;
    private long zzaJ = -1;
    private String zzaK = "";
    private long zzaN = -1;
    private long zzaO = -1;
    private String zzaR = "";
    private int zzaS = 2;
    private String zzaU = "";
    private long zzaX = -1;
    private String zzaY = "";

    static {
        zzatd zzatdVar = new zzatd();
        zzb = zzatdVar;
        zzgzu.zzaU(zzatd.class, zzatdVar);
    }

    private zzatd() {
    }

    public static /* synthetic */ void zzA(zzatd zzatdVar, long j10) {
        zzatdVar.zzd |= 134217728;
        zzatdVar.zzH = j10;
    }

    public static /* synthetic */ void zzB(zzatd zzatdVar, String str) {
        str.getClass();
        zzatdVar.zzd |= 268435456;
        zzatdVar.zzI = str;
    }

    public static /* synthetic */ void zzC(zzatd zzatdVar, long j10) {
        zzatdVar.zzd |= 536870912;
        zzatdVar.zzJ = j10;
    }

    public static /* synthetic */ void zzD(zzatd zzatdVar, long j10) {
        zzatdVar.zzd |= 1073741824;
        zzatdVar.zzK = j10;
    }

    public static /* synthetic */ void zzE(zzatd zzatdVar, long j10) {
        zzatdVar.zzd |= Integer.MIN_VALUE;
        zzatdVar.zzL = j10;
    }

    public static /* synthetic */ void zzF(zzatd zzatdVar, long j10) {
        zzatdVar.zze |= 2;
        zzatdVar.zzN = j10;
    }

    public static /* synthetic */ void zzG(zzatd zzatdVar, long j10) {
        zzatdVar.zze |= 4;
        zzatdVar.zzO = j10;
    }

    public static /* synthetic */ void zzH(zzatd zzatdVar, long j10) {
        zzatdVar.zze |= 8;
        zzatdVar.zzP = j10;
    }

    public static /* synthetic */ void zzI(zzatd zzatdVar, long j10) {
        zzatdVar.zze |= 16;
        zzatdVar.zzQ = j10;
    }

    public static /* synthetic */ void zzJ(zzatd zzatdVar, long j10) {
        zzatdVar.zze |= 32;
        zzatdVar.zzR = j10;
    }

    public static /* synthetic */ void zzK(zzatd zzatdVar, long j10) {
        zzatdVar.zze |= 64;
        zzatdVar.zzS = j10;
    }

    public static /* synthetic */ void zzL(zzatd zzatdVar, String str) {
        str.getClass();
        zzatdVar.zze |= RecognitionOptions.ITF;
        zzatdVar.zzT = str;
    }

    public static /* synthetic */ void zzM(zzatd zzatdVar, String str) {
        str.getClass();
        zzatdVar.zze |= RecognitionOptions.QR_CODE;
        zzatdVar.zzU = str;
    }

    public static /* synthetic */ void zzN(zzatd zzatdVar, long j10) {
        zzatdVar.zze |= RecognitionOptions.AZTEC;
        zzatdVar.zzY = j10;
    }

    public static /* synthetic */ void zzO(zzatd zzatdVar, long j10) {
        zzatdVar.zze |= 8192;
        zzatdVar.zzZ = j10;
    }

    public static /* synthetic */ void zzP(zzatd zzatdVar, long j10) {
        zzatdVar.zze |= 16384;
        zzatdVar.zzaa = j10;
    }

    public static /* synthetic */ void zzQ(zzatd zzatdVar, zzata zzataVar) {
        zzataVar.getClass();
        zzatdVar.zzae = zzataVar;
        zzatdVar.zze |= 262144;
    }

    public static /* synthetic */ void zzR(zzatd zzatdVar, zzata zzataVar) {
        zzataVar.getClass();
        zzhad zzhadVar = zzatdVar.zzaf;
        if (!zzhadVar.zzc()) {
            zzatdVar.zzaf = zzgzu.zzaO(zzhadVar);
        }
        zzatdVar.zzaf.add(zzataVar);
    }

    public static /* synthetic */ void zzT(zzatd zzatdVar, zzatc zzatcVar) {
        zzatcVar.getClass();
        zzatdVar.zzag = zzatcVar;
        zzatdVar.zze |= 524288;
    }

    public static /* synthetic */ void zzU(zzatd zzatdVar, long j10) {
        zzatdVar.zze |= 2097152;
        zzatdVar.zzai = j10;
    }

    public static /* synthetic */ void zzV(zzatd zzatdVar, long j10) {
        zzatdVar.zze |= 4194304;
        zzatdVar.zzaj = j10;
    }

    public static /* synthetic */ void zzW(zzatd zzatdVar, long j10) {
        zzatdVar.zze |= 8388608;
        zzatdVar.zzak = j10;
    }

    public static /* synthetic */ void zzX(zzatd zzatdVar, long j10) {
        zzatdVar.zze |= 67108864;
        zzatdVar.zzan = j10;
    }

    public static /* synthetic */ void zzY(zzatd zzatdVar, long j10) {
        zzatdVar.zze |= 134217728;
        zzatdVar.zzao = j10;
    }

    public static /* synthetic */ void zzZ(zzatd zzatdVar, String str) {
        str.getClass();
        zzatdVar.zze |= 268435456;
        zzatdVar.zzap = str;
    }

    public static zzasg zza() {
        return (zzasg) zzb.zzaA();
    }

    public static /* synthetic */ void zzaa(zzatd zzatdVar, long j10) {
        zzatdVar.zzf |= RecognitionOptions.UPC_A;
        zzatdVar.zzaE = j10;
    }

    public static /* synthetic */ void zzab(zzatd zzatdVar, long j10) {
        zzatdVar.zzf |= RecognitionOptions.UPC_E;
        zzatdVar.zzaF = j10;
    }

    public static /* synthetic */ void zzac(zzatd zzatdVar, long j10) {
        zzatdVar.zzf |= RecognitionOptions.PDF417;
        zzatdVar.zzaG = j10;
    }

    public static /* synthetic */ void zzad(zzatd zzatdVar, long j10) {
        zzatdVar.zzf |= RecognitionOptions.AZTEC;
        zzatdVar.zzaH = j10;
    }

    public static /* synthetic */ void zzae(zzatd zzatdVar, String str) {
        str.getClass();
        zzatdVar.zzf |= RecognitionOptions.TEZ_CODE;
        zzatdVar.zzaK = str;
    }

    public static /* synthetic */ void zzaf(zzatd zzatdVar, String str) {
        str.getClass();
        zzatdVar.zzf |= 4194304;
        zzatdVar.zzaR = str;
    }

    public static /* synthetic */ void zzag(zzatd zzatdVar, boolean z10) {
        zzatdVar.zzf |= 16777216;
        zzatdVar.zzaT = z10;
    }

    public static /* synthetic */ void zzah(zzatd zzatdVar, long j10) {
        zzatdVar.zzf |= 67108864;
        zzatdVar.zzaV = j10;
    }

    public static /* synthetic */ void zzam(zzatd zzatdVar, int i10) {
        zzatdVar.zzW = i10 - 1;
        zzatdVar.zze |= RecognitionOptions.UPC_E;
    }

    public static /* synthetic */ void zzan(zzatd zzatdVar, int i10) {
        zzatdVar.zzX = i10 - 1;
        zzatdVar.zze |= RecognitionOptions.PDF417;
    }

    public static /* synthetic */ void zzao(zzatd zzatdVar, int i10) {
        zzatdVar.zzad = i10 - 1;
        zzatdVar.zze |= 131072;
    }

    public static /* synthetic */ void zzap(zzatd zzatdVar, int i10) {
        zzatdVar.zzaw = i10 - 1;
        zzatdVar.zzf |= 8;
    }

    public static /* synthetic */ void zzaq(zzatd zzatdVar, int i10) {
        zzatdVar.zzax = i10 - 1;
        zzatdVar.zzf |= 16;
    }

    public static /* synthetic */ void zzar(zzatd zzatdVar, int i10) {
        zzatdVar.zzaP = i10 - 1;
        zzatdVar.zzf |= 1048576;
    }

    public static /* synthetic */ void zzas(zzatd zzatdVar, int i10) {
        zzatdVar.zzaS = 5;
        zzatdVar.zzf |= 8388608;
    }

    public static zzatd zzd() {
        return zzb;
    }

    public static zzatd zze(byte[] bArr, zzgzf zzgzfVar) {
        return (zzatd) zzgzu.zzaI(zzb, bArr, zzgzfVar);
    }

    public static /* synthetic */ void zzi(zzatd zzatdVar, String str) {
        str.getClass();
        zzatdVar.zzd |= 1;
        zzatdVar.zzg = str;
    }

    public static /* synthetic */ void zzj(zzatd zzatdVar, String str) {
        str.getClass();
        zzatdVar.zzd |= 2;
        zzatdVar.zzh = str;
    }

    public static /* synthetic */ void zzk(zzatd zzatdVar, long j10) {
        zzatdVar.zzd |= 4;
        zzatdVar.zzi = j10;
    }

    public static /* synthetic */ void zzl(zzatd zzatdVar, long j10) {
        zzatdVar.zzd |= 16;
        zzatdVar.zzk = j10;
    }

    public static /* synthetic */ void zzm(zzatd zzatdVar, long j10) {
        zzatdVar.zzd |= 32;
        zzatdVar.zzl = j10;
    }

    public static /* synthetic */ void zzn(zzatd zzatdVar, long j10) {
        zzatdVar.zzd |= RecognitionOptions.UPC_E;
        zzatdVar.zzq = j10;
    }

    public static /* synthetic */ void zzo(zzatd zzatdVar, long j10) {
        zzatdVar.zzd |= RecognitionOptions.PDF417;
        zzatdVar.zzr = j10;
    }

    public static /* synthetic */ void zzp(zzatd zzatdVar, long j10) {
        zzatdVar.zzd |= 8192;
        zzatdVar.zzt = j10;
    }

    public static /* synthetic */ void zzq(zzatd zzatdVar, long j10) {
        zzatdVar.zzd |= 16384;
        zzatdVar.zzu = j10;
    }

    public static /* synthetic */ void zzr(zzatd zzatdVar, long j10) {
        zzatdVar.zzd |= RecognitionOptions.TEZ_CODE;
        zzatdVar.zzv = j10;
    }

    public static /* synthetic */ void zzs(zzatd zzatdVar, long j10) {
        zzatdVar.zzd |= 65536;
        zzatdVar.zzw = j10;
    }

    public static /* synthetic */ void zzt(zzatd zzatdVar, long j10) {
        zzatdVar.zzd |= 524288;
        zzatdVar.zzz = j10;
    }

    public static /* synthetic */ void zzu(zzatd zzatdVar, long j10) {
        zzatdVar.zzd |= 1048576;
        zzatdVar.zzA = j10;
    }

    public static /* synthetic */ void zzv(zzatd zzatdVar, long j10) {
        zzatdVar.zzd |= 2097152;
        zzatdVar.zzB = j10;
    }

    public static /* synthetic */ void zzw(zzatd zzatdVar, String str) {
        str.getClass();
        zzatdVar.zzd |= 4194304;
        zzatdVar.zzC = str;
    }

    public static /* synthetic */ void zzx(zzatd zzatdVar, String str) {
        str.getClass();
        zzatdVar.zzd |= 16777216;
        zzatdVar.zzE = str;
    }

    public static /* synthetic */ void zzy(zzatd zzatdVar, long j10) {
        zzatdVar.zzd |= 33554432;
        zzatdVar.zzF = j10;
    }

    public static /* synthetic */ void zzz(zzatd zzatdVar, long j10) {
        zzatdVar.zzd |= 67108864;
        zzatdVar.zzG = j10;
    }

    public final boolean zzai() {
        return this.zzaT;
    }

    public final boolean zzaj() {
        return (this.zzd & 4194304) != 0;
    }

    public final boolean zzak() {
        return (this.zzf & 134217728) != 0;
    }

    public final int zzal() {
        int zza = zzasm.zza(this.zzaS);
        if (zza == 0) {
            return 3;
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzgzy zzgzyVar = zzatj.zza;
            return zzgzu.zzaR(zzb, "\u0001a\u0000\u0003\u0001Įa\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂU\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈV\u0019ဂZ\u001a᠌W\u001bဈ\u0016\u001cဇX\u001dဈ\u0018\u001eဈY\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌@EဉAFဂBGဂ8Hဂ9I᠌CJဂ)Kဈ\u0017L᠌DMဈEN\u001bO᠌FP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOZဉP[ဉQ\\ဂR]ဂS^᠌TÉဉ[ĭဂ\\Įဈ]", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaQ", "zzA", "zzB", "zzaR", "zzaV", "zzaS", zzasl.zza, "zzC", "zzaT", "zzE", "zzaU", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzaf", zzata.class, "zzR", "zzS", "zzT", "zzU", "zzW", zzgzyVar, "zzX", zzgzyVar, "zzae", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", zzgzyVar, "zzag", "zzah", "zzai", "zzaj", "zzak", "zzan", "zzao", "zzaq", "zzar", zzati.zza, "zzas", zzatk.zza, "zzap", "zzat", zzash.zza, "zzau", "zzav", "zzal", "zzam", "zzaw", zzgzyVar, "zzV", "zzD", "zzax", zzgzyVar, "zzay", "zzaz", zzasw.class, "zzaA", zzgzyVar, "zzaB", zzasj.class, "zzaC", "zzaD", "zzaE", "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", zzast.zza, "zzaW", "zzaX", "zzaY"});
        }
        if (i11 == 3) {
            return new zzatd();
        }
        if (i11 == 4) {
            return new zzasg(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzatm zzf() {
        zzatm zzatmVar = this.zzaW;
        return zzatmVar == null ? zzatm.zzd() : zzatmVar;
    }

    public final String zzg() {
        return this.zzaR;
    }

    public final String zzh() {
        return this.zzC;
    }
}

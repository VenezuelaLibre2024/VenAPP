package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class zzah {
    public static final zzag zza = new zzag(null);
    private static zzkj zzb;
    private final String zzc;
    private final zzs zzd;
    private final zzku zze;
    private final long zzf;

    public zzah(zzaf zzafVar, String str, zzs zzsVar) {
        this.zzc = str;
        this.zzd = zzsVar;
        zzku zzi = zzkx.zzi();
        this.zze = zzi;
        this.zzf = System.currentTimeMillis();
        zzi.zzq(zzafVar.zza());
        zzi.zze(zzafVar.zzb());
        zzi.zzs(zzafVar.zzc());
        zzi.zzv(zzafVar.zzd());
        zzi.zzu(zzka.zzc(zzka.zzb(System.currentTimeMillis())));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|2|3|4|(2:6|(8:8|9|10|11|(1:13)(2:18|(1:20)(3:21|15|16))|14|15|16))(1:25)|23|10|11|(0)(0)|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r2 == (-1)) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046 A[Catch: NameNotFoundException -> 0x0089, TryCatch #0 {NameNotFoundException -> 0x0089, blocks: (B:11:0x0042, B:13:0x0046, B:14:0x005c, B:20:0x0066, B:21:0x0077), top: B:10:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final com.google.android.recaptcha.internal.zzkj zzd(android.content.Context r8) {
        /*
            java.lang.String r0 = "unknown"
            r1 = 33
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41
            java.lang.String r3 = "com.google.android.gms.version"
            r4 = -1
            if (r2 < r1) goto L2b
            android.content.pm.PackageManager r2 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41
            java.lang.String r5 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41
            r6 = 128(0x80, double:6.3E-322)
            android.content.pm.PackageManager$ApplicationInfoFlags r6 = android.content.pm.PackageManager.ApplicationInfoFlags.of(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41
            int r2 = r2.getInt(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41
            if (r2 != r4) goto L26
            goto L41
        L26:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41
            goto L42
        L2b:
            android.content.pm.PackageManager r2 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41
            java.lang.String r5 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41
            r6 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41
            int r2 = r2.getInt(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41
            if (r2 != r4) goto L26
        L41:
            r2 = r0
        L42:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L89
            if (r3 < r1) goto L61
            android.content.pm.PackageManager r1 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L89
            java.lang.String r8 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L89
            r3 = 0
            android.content.pm.PackageManager$PackageInfoFlags r3 = android.content.pm.PackageManager.PackageInfoFlags.of(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L89
            android.content.pm.PackageInfo r8 = r1.getPackageInfo(r8, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L89
            long r3 = androidx.core.content.pm.d.a(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L89
        L5c:
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L89
            goto L89
        L61:
            r1 = 28
            r4 = 0
            if (r3 < r1) goto L77
            android.content.pm.PackageManager r1 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L89
            java.lang.String r8 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L89
            android.content.pm.PackageInfo r8 = r1.getPackageInfo(r8, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L89
            long r3 = androidx.core.content.pm.d.a(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L89
            goto L5c
        L77:
            android.content.pm.PackageManager r1 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L89
            java.lang.String r8 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L89
            android.content.pm.PackageInfo r8 = r1.getPackageInfo(r8, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L89
            int r8 = r8.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L89
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L89
        L89:
            com.google.android.recaptcha.internal.zzki r8 = com.google.android.recaptcha.internal.zzkj.zzf()
            int r1 = android.os.Build.VERSION.SDK_INT
            r8.zzd(r1)
            r8.zzq(r2)
            java.lang.String r1 = "18.1.2"
            r8.zzs(r1)
            java.lang.String r1 = android.os.Build.MODEL
            r8.zzp(r1)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            r8.zzr(r1)
            r8.zze(r0)
            com.google.android.recaptcha.internal.zzgo r8 = r8.zzj()
            com.google.android.recaptcha.internal.zzkj r8 = (com.google.android.recaptcha.internal.zzkj) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzah.zzd(android.content.Context):com.google.android.recaptcha.internal.zzkj");
    }

    public final long zza() {
        return this.zzf;
    }

    public final zzku zzb() {
        return this.zze;
    }

    public final zzkx zzc(int i10, zzkm zzkmVar, Context context) {
        zzku zzkuVar = this.zze;
        zzkuVar.zzp(System.currentTimeMillis() - this.zzf);
        zzkuVar.zzw(i10);
        if (zzkmVar != null) {
            this.zze.zzr(zzkmVar);
        }
        if (zzb == null) {
            zzb = zzd(context);
        }
        zzku zzkuVar2 = this.zze;
        zzli zzf = zzlj.zzf();
        zzf.zzq(this.zzc);
        zzkj zzkjVar = zzb;
        if (zzkjVar == null) {
            zzkjVar = zzd(context);
        }
        zzf.zzd(zzkjVar);
        zzf.zzp(Locale.getDefault().getISO3Language());
        zzf.zze(Locale.getDefault().getISO3Country());
        zzkuVar2.zzt((zzlj) zzf.zzj());
        return (zzkx) this.zze.zzj();
    }
}

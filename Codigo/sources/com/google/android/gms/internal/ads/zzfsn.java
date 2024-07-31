package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class zzfsn {
    private static final Object zza = new Object();
    private final Context zzb;
    private final SharedPreferences zzc;
    private final String zzd;
    private final zzfru zze;
    private boolean zzf;

    public zzfsn(Context context, int i10, zzfru zzfruVar, boolean z10) {
        this.zzf = false;
        this.zzb = context;
        this.zzd = Integer.toString(i10 - 1);
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        this.zze = zzfruVar;
        this.zzf = z10;
    }

    private final File zze(String str) {
        return new File(new File(this.zzb.getDir("pccache", 0), this.zzd), str);
    }

    private static String zzf(zzayc zzaycVar) {
        zzaye zze = zzayf.zze();
        zze.zze(zzaycVar.zzd().zzk());
        zze.zza(zzaycVar.zzd().zzj());
        zze.zzb(zzaycVar.zzd().zza());
        zze.zzd(zzaycVar.zzd().zzd());
        zze.zzc(zzaycVar.zzd().zzc());
        return la.k.a(((zzayf) zze.zzal()).zzax());
    }

    private final String zzg() {
        return "FBAMTD".concat(String.valueOf(this.zzd));
    }

    private final String zzh() {
        return "LATMTD".concat(String.valueOf(this.zzd));
    }

    private final void zzi(int i10, long j10) {
        this.zze.zza(i10, j10);
    }

    private final void zzj(int i10, long j10, String str) {
        this.zze.zzb(i10, j10, str);
    }

    private final zzayf zzk(int i10) {
        SharedPreferences sharedPreferences;
        String zzg;
        int i11;
        if (i10 == 1) {
            sharedPreferences = this.zzc;
            zzg = zzh();
        } else {
            sharedPreferences = this.zzc;
            zzg = zzg();
        }
        String string = sharedPreferences.getString(zzg, null);
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] d10 = la.k.d(string);
            zzgyl zzgylVar = zzgyl.zzb;
            return zzayf.zzi(zzgyl.zzv(d10, 0, d10.length), this.zzf ? zzgzf.zza() : zzgzf.zzb());
        } catch (zzhag unused) {
            return null;
        } catch (NullPointerException unused2) {
            i11 = 2029;
            zzi(i11, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            i11 = 2032;
            zzi(i11, currentTimeMillis);
            return null;
        }
    }

    public final boolean zza(zzayc zzaycVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            if (!zzfsh.zze(new File(zze(zzaycVar.zzd().zzk()), "pcbc"), zzaycVar.zze().zzA())) {
                zzi(4020, currentTimeMillis);
                return false;
            }
            String zzf = zzf(zzaycVar);
            SharedPreferences.Editor edit = this.zzc.edit();
            edit.putString(zzh(), zzf);
            boolean commit = edit.commit();
            if (commit) {
                zzi(5015, currentTimeMillis);
            } else {
                zzi(4021, currentTimeMillis);
            }
            return commit;
        }
    }

    public final boolean zzb(zzayc zzaycVar, zzfsm zzfsmVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzayf zzk = zzk(1);
            String zzk2 = zzaycVar.zzd().zzk();
            if (zzk != null && zzk.zzk().equals(zzk2)) {
                zzi(4014, currentTimeMillis);
                return false;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            File zze = zze(zzk2);
            if (zze.exists()) {
                zzj(4023, currentTimeMillis2, "d:" + (true != zze.isDirectory() ? "0" : "1") + ",f:" + (true != zze.isFile() ? "0" : "1"));
                zzi(4015, currentTimeMillis2);
            } else if (!zze.mkdirs()) {
                zzj(4024, currentTimeMillis2, "cw:".concat(true != zze.canWrite() ? "0" : "1"));
                zzi(4015, currentTimeMillis2);
                return false;
            }
            File zze2 = zze(zzk2);
            File file = new File(zze2, "pcam.jar");
            File file2 = new File(zze2, "pcbc");
            if (!zzfsh.zze(file, zzaycVar.zzf().zzA())) {
                zzi(4016, currentTimeMillis);
                return false;
            }
            if (!zzfsh.zze(file2, zzaycVar.zze().zzA())) {
                zzi(4017, currentTimeMillis);
                return false;
            }
            if (zzfsmVar != null && !zzfsmVar.zza(file)) {
                zzi(4018, currentTimeMillis);
                zzfsh.zzd(zze2);
                return false;
            }
            String zzf = zzf(zzaycVar);
            long currentTimeMillis3 = System.currentTimeMillis();
            String string = this.zzc.getString(zzh(), null);
            SharedPreferences.Editor edit = this.zzc.edit();
            edit.putString(zzh(), zzf);
            if (string != null) {
                edit.putString(zzg(), string);
            }
            if (!edit.commit()) {
                zzi(4019, currentTimeMillis3);
                return false;
            }
            HashSet hashSet = new HashSet();
            zzayf zzk3 = zzk(1);
            if (zzk3 != null) {
                hashSet.add(zzk3.zzk());
            }
            zzayf zzk4 = zzk(2);
            if (zzk4 != null) {
                hashSet.add(zzk4.zzk());
            }
            for (File file3 : new File(this.zzb.getDir("pccache", 0), this.zzd).listFiles()) {
                if (!hashSet.contains(file3.getName())) {
                    zzfsh.zzd(file3);
                }
            }
            zzi(5014, currentTimeMillis);
            return true;
        }
    }

    public final zzfsf zzc(int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzayf zzk = zzk(1);
            if (zzk == null) {
                zzi(4022, currentTimeMillis);
                return null;
            }
            File zze = zze(zzk.zzk());
            File file = new File(zze, "pcam.jar");
            if (!file.exists()) {
                file = new File(zze, "pcam");
            }
            File file2 = new File(zze, "pcbc");
            File file3 = new File(zze, "pcopt");
            zzi(5016, currentTimeMillis);
            return new zzfsf(zzk, file, file2, file3);
        }
    }

    public final boolean zzd(int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzayf zzk = zzk(1);
            if (zzk == null) {
                zzi(4025, currentTimeMillis);
                return false;
            }
            File zze = zze(zzk.zzk());
            if (!new File(zze, "pcam.jar").exists()) {
                zzi(4026, currentTimeMillis);
                return false;
            }
            if (new File(zze, "pcbc").exists()) {
                zzi(5019, currentTimeMillis);
                return true;
            }
            zzi(4027, currentTimeMillis);
            return false;
        }
    }
}

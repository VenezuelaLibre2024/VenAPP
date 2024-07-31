package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import com.google.android.gms.ads.internal.util.u1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzbbp {
    private final zzbbv zza;
    private final zzbde zzb;
    private final boolean zzc;

    private zzbbp() {
        this.zzb = zzbdf.zzd();
        this.zzc = false;
        this.zza = new zzbbv();
    }

    public zzbbp(zzbbv zzbbvVar) {
        this.zzb = zzbdf.zzd();
        this.zza = zzbbvVar;
        this.zzc = ((Boolean) a0.c().zza(zzbgc.zzeO)).booleanValue();
    }

    public static zzbbp zza() {
        return new zzbbp();
    }

    private final synchronized String zzd(int i10) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.zzb.zzk(), Long.valueOf(t.b().b()), Integer.valueOf(i10 - 1), Base64.encodeToString(((zzbdf) this.zzb.zzal()).zzax(), 3));
    }

    private final synchronized void zze(int i10) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(zzd(i10).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        u1.a("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    u1.a("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        u1.a("Could not close Clearcut output stream.");
                    }
                }
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    u1.a("Could not close Clearcut output stream.");
                }
                throw th2;
            }
        } catch (FileNotFoundException unused5) {
            u1.a("Could not find file for Clearcut");
        }
    }

    private final synchronized void zzf(int i10) {
        zzbde zzbdeVar = this.zzb;
        zzbdeVar.zzd();
        zzbdeVar.zzc(j2.F());
        zzbbu zzbbuVar = new zzbbu(this.zza, ((zzbdf) this.zzb.zzal()).zzax(), null);
        int i11 = i10 - 1;
        zzbbuVar.zza(i11);
        zzbbuVar.zzc();
        u1.a("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i11, 10))));
    }

    public final synchronized void zzb(zzbbo zzbboVar) {
        if (this.zzc) {
            try {
                zzbboVar.zza(this.zzb);
            } catch (NullPointerException e10) {
                t.q().zzw(e10, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i10) {
        if (this.zzc) {
            if (((Boolean) a0.c().zza(zzbgc.zzeP)).booleanValue()) {
                zze(i10);
            } else {
                zzf(i10);
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.u1;

/* loaded from: classes2.dex */
public final class zzeac extends zzfua {
    private final Context zzb;
    private SensorManager zzc;
    private Sensor zzd;
    private long zze;
    private int zzf;
    private zzeab zzg;
    private boolean zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeac(Context context) {
        super("ShakeDetector", "ads");
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfua
    public final void zza(SensorEvent sensorEvent) {
        if (((Boolean) a0.c().zza(zzbgc.zziR)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0] / 9.80665f;
            float f11 = fArr[1] / 9.80665f;
            float f12 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f10 * f10) + (f11 * f11) + (f12 * f12))) >= ((Float) a0.c().zza(zzbgc.zziS)).floatValue()) {
                long a10 = t.b().a();
                if (this.zze + ((Integer) a0.c().zza(zzbgc.zziT)).intValue() <= a10) {
                    if (this.zze + ((Integer) a0.c().zza(zzbgc.zziU)).intValue() < a10) {
                        this.zzf = 0;
                    }
                    u1.a("Shake detected.");
                    this.zze = a10;
                    int i10 = this.zzf + 1;
                    this.zzf = i10;
                    zzeab zzeabVar = this.zzg;
                    if (zzeabVar != null) {
                        if (i10 == ((Integer) a0.c().zza(zzbgc.zziV)).intValue()) {
                            zzdzd zzdzdVar = (zzdzd) zzeabVar;
                            zzdzdVar.zzh(new zzdza(zzdzdVar), zzdzc.GESTURE);
                        }
                    }
                }
            }
        }
    }

    public final void zzb() {
        synchronized (this) {
            if (this.zzh) {
                SensorManager sensorManager = this.zzc;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.zzd);
                    u1.a("Stopped listening for shake gestures.");
                }
                this.zzh = false;
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) a0.c().zza(zzbgc.zziR)).booleanValue()) {
                if (this.zzc == null) {
                    SensorManager sensorManager2 = (SensorManager) this.zzb.getSystemService("sensor");
                    this.zzc = sensorManager2;
                    if (sensorManager2 == null) {
                        zzcec.zzj("Shake detection failed to initialize. Failed to obtain accelerometer.");
                        return;
                    }
                    this.zzd = sensorManager2.getDefaultSensor(1);
                }
                if (!this.zzh && (sensorManager = this.zzc) != null && (sensor = this.zzd) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.zze = t.b().a() - ((Integer) a0.c().zza(zzbgc.zziT)).intValue();
                    this.zzh = true;
                    u1.a("Listening for shake gestures.");
                }
            }
        }
    }

    public final void zzd(zzeab zzeabVar) {
        this.zzg = zzeabVar;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.u1;

/* loaded from: classes2.dex */
public final class zzdyp extends zzfua {
    private final SensorManager zzb;
    private final Sensor zzc;
    private float zzd;
    private Float zze;
    private long zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private zzdyo zzj;
    private boolean zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyp(Context context) {
        super("FlickDetector", "ads");
        this.zzd = 0.0f;
        this.zze = Float.valueOf(0.0f);
        this.zzf = t.b().a();
        this.zzg = 0;
        this.zzh = false;
        this.zzi = false;
        this.zzj = null;
        this.zzk = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.zzb = sensorManager;
        if (sensorManager != null) {
            this.zzc = sensorManager.getDefaultSensor(4);
        } else {
            this.zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfua
    public final void zza(SensorEvent sensorEvent) {
        if (((Boolean) a0.c().zza(zzbgc.zziW)).booleanValue()) {
            long a10 = t.b().a();
            if (this.zzf + ((Integer) a0.c().zza(zzbgc.zziY)).intValue() < a10) {
                this.zzg = 0;
                this.zzf = a10;
                this.zzh = false;
                this.zzi = false;
                this.zzd = this.zze.floatValue();
            }
            Float valueOf = Float.valueOf(this.zze.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.zze = valueOf;
            float floatValue = valueOf.floatValue();
            float f10 = this.zzd;
            zzbfu zzbfuVar = zzbgc.zziX;
            if (floatValue > f10 + ((Float) a0.c().zza(zzbfuVar)).floatValue()) {
                this.zzd = this.zze.floatValue();
                this.zzi = true;
            } else if (this.zze.floatValue() < this.zzd - ((Float) a0.c().zza(zzbfuVar)).floatValue()) {
                this.zzd = this.zze.floatValue();
                this.zzh = true;
            }
            if (this.zze.isInfinite()) {
                this.zze = Float.valueOf(0.0f);
                this.zzd = 0.0f;
            }
            if (this.zzh && this.zzi) {
                u1.a("Flick detected.");
                this.zzf = a10;
                int i10 = this.zzg + 1;
                this.zzg = i10;
                this.zzh = false;
                this.zzi = false;
                zzdyo zzdyoVar = this.zzj;
                if (zzdyoVar != null) {
                    if (i10 == ((Integer) a0.c().zza(zzbgc.zziZ)).intValue()) {
                        zzdzd zzdzdVar = (zzdzd) zzdyoVar;
                        zzdzdVar.zzh(new zzdzb(zzdzdVar), zzdzc.GESTURE);
                    }
                }
            }
        }
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (this.zzk && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                sensorManager.unregisterListener(this, sensor);
                this.zzk = false;
                u1.a("Stopped listening for flick gestures.");
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) a0.c().zza(zzbgc.zziW)).booleanValue()) {
                if (!this.zzk && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.zzk = true;
                    u1.a("Listening for flick gestures.");
                }
                if (this.zzb == null || this.zzc == null) {
                    zzcec.zzj("Flick detection failed to initialize. Failed to obtain gyroscope.");
                }
            }
        }
    }

    public final void zzd(zzdyo zzdyoVar) {
        this.zzj = zzdyoVar;
    }
}

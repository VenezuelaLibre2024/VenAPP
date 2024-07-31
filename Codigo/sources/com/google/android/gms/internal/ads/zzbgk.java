package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

@Deprecated
/* loaded from: classes2.dex */
public final class zzbgk {
    String zzd;
    Context zze;
    String zzf;
    private AtomicBoolean zzh;
    private File zzi;
    final BlockingQueue zza = new ArrayBlockingQueue(100);
    final LinkedHashMap zzb = new LinkedHashMap();
    final Map zzc = new HashMap();
    private final HashSet zzg = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void zzc(zzbgk zzbgkVar) {
        while (true) {
            try {
                zzbgu zzbguVar = (zzbgu) zzbgkVar.zza.take();
                zzbgt zza = zzbguVar.zza();
                if (!TextUtils.isEmpty(zza.zzb())) {
                    zzbgkVar.zzg(zzbgkVar.zzb(zzbgkVar.zzb, zzbguVar.zzb()), zza);
                }
            } catch (InterruptedException e10) {
                zzcec.zzk("CsiReporter:reporter interrupted", e10);
                return;
            }
        }
    }

    private final void zzg(Map map, zzbgt zzbgtVar) {
        Uri.Builder buildUpon = Uri.parse(this.zzd).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (zzbgtVar != null) {
            StringBuilder sb2 = new StringBuilder(uri);
            if (!TextUtils.isEmpty(zzbgtVar.zzb())) {
                sb2.append("&it=");
                sb2.append(zzbgtVar.zzb());
            }
            if (!TextUtils.isEmpty(zzbgtVar.zza())) {
                sb2.append("&blat=");
                sb2.append(zzbgtVar.zza());
            }
            uri = sb2.toString();
        }
        if (!this.zzh.get()) {
            t.r();
            j2.k(this.zze, this.zzf, uri);
            return;
        }
        File file = this.zzi;
        if (file == null) {
            zzcec.zzj("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(uri.getBytes());
                    fileOutputStream2.write(10);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e10) {
                        zzcec.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e10);
                    }
                } catch (IOException e11) {
                    e = e11;
                    fileOutputStream = fileOutputStream2;
                    zzcec.zzk("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e12) {
                            zzcec.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e12);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e13) {
                            zzcec.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e13);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e14) {
            e = e14;
        }
    }

    public final zzbgq zza(String str) {
        zzbgq zzbgqVar = (zzbgq) this.zzc.get(str);
        return zzbgqVar != null ? zzbgqVar : zzbgq.zza;
    }

    final Map zzb(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(str, zza(str).zza((String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    public final void zzd(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.zze = context;
        this.zzf = str;
        this.zzd = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzh = atomicBoolean;
        atomicBoolean.set(((Boolean) zzbhv.zzc.zze()).booleanValue());
        if (this.zzh.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.zzi = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry entry : map.entrySet()) {
            this.zzb.put((String) entry.getKey(), (String) entry.getValue());
        }
        zzcep.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbgj
            public /* synthetic */ zzbgj() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbgk.zzc(zzbgk.this);
            }
        });
        Map map2 = this.zzc;
        zzbgq zzbgqVar = zzbgq.zzb;
        map2.put("action", zzbgqVar);
        this.zzc.put("ad_format", zzbgqVar);
        this.zzc.put("e", zzbgq.zzc);
    }

    public final void zze(String str) {
        if (this.zzg.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.zzf);
        linkedHashMap.put("ue", str);
        zzg(zzb(this.zzb, linkedHashMap), null);
    }

    public final boolean zzf(zzbgu zzbguVar) {
        return this.zza.offer(zzbguVar);
    }
}

package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.a;
import eb.o;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzfy implements zzgb {
    private static final Map<Uri, zzfy> zza = new a();
    private static final String[] zzb = {Constants.KEY, "value"};
    private final ContentResolver zzc;
    private final Uri zzd;
    private final Runnable zze;
    private final ContentObserver zzf;
    private final Object zzg;
    private volatile Map<String, String> zzh;
    private final List<zzfz> zzi;

    private zzfy(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzga zzgaVar = new zzga(this, null);
        this.zzf = zzgaVar;
        this.zzg = new Object();
        this.zzi = new ArrayList();
        o.o(contentResolver);
        o.o(uri);
        this.zzc = contentResolver;
        this.zzd = uri;
        this.zze = runnable;
        contentResolver.registerContentObserver(uri, false, zzgaVar);
    }

    public static zzfy zza(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzfy zzfyVar;
        synchronized (zzfy.class) {
            Map<Uri, zzfy> map = zza;
            zzfyVar = map.get(uri);
            if (zzfyVar == null) {
                try {
                    zzfy zzfyVar2 = new zzfy(contentResolver, uri, runnable);
                    try {
                        map.put(uri, zzfyVar2);
                    } catch (SecurityException unused) {
                    }
                    zzfyVar = zzfyVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzfyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void zzc() {
        synchronized (zzfy.class) {
            for (zzfy zzfyVar : zza.values()) {
                zzfyVar.zzc.unregisterContentObserver(zzfyVar.zzf);
            }
            zza.clear();
        }
    }

    private final Map<String, String> zze() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                return (Map) zzge.zza(new zzgd() { // from class: com.google.android.gms.internal.measurement.zzfx
                    @Override // com.google.android.gms.internal.measurement.zzgd
                    public final Object zza() {
                        return zzfy.this.zzb();
                    }
                });
            } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return null;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgb
    public final /* synthetic */ Object zza(String str) {
        return zza().get(str);
    }

    public final Map<String, String> zza() {
        Map<String, String> map = this.zzh;
        if (map == null) {
            synchronized (this.zzg) {
                map = this.zzh;
                if (map == null) {
                    map = zze();
                    this.zzh = map;
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Map zzb() {
        Cursor query = this.zzc.query(this.zzd, zzb, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map aVar = count <= 256 ? new a(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                aVar.put(query.getString(0), query.getString(1));
            }
            return aVar;
        } finally {
            query.close();
        }
    }

    public final void zzd() {
        synchronized (this.zzg) {
            this.zzh = null;
            this.zze.run();
        }
        synchronized (this) {
            Iterator<zzfz> it = this.zzi.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
    }
}

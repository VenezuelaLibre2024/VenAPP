package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import com.google.android.gms.ads.internal.util.u1;
import com.google.android.gms.ads.internal.util.v0;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzehh extends SQLiteOpenHelper {
    private final Context zza;
    private final zzgey zzb;

    public zzehh(Context context, zzgey zzgeyVar) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) a0.c().zza(zzbgc.zzik)).intValue());
        this.zza = context;
        this.zzb = zzgeyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Void zzb(zzceh zzcehVar, SQLiteDatabase sQLiteDatabase) {
        zzj(sQLiteDatabase, zzcehVar);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(SQLiteDatabase sQLiteDatabase, String str, zzceh zzcehVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzcehVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, zzceh zzcehVar) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i10 = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i10] = query.getString(columnIndex);
                }
                i10++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i11 = 0; i11 < count; i11++) {
                zzcehVar.zza(strArr[i11]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Void zza(zzehj zzehjVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constants.TIMESTAMP, Long.valueOf(zzehjVar.zza));
        contentValues.put("gws_query_id", zzehjVar.zzb);
        contentValues.put("url", zzehjVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzehjVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        t.r();
        v0 a02 = j2.a0(this.zza);
        if (a02 != null) {
            try {
                a02.zze(com.google.android.gms.dynamic.d.h2(this.zza));
            } catch (RemoteException e10) {
                u1.b("Failed to schedule offline ping sender.", e10);
            }
        }
        return null;
    }

    public final void zzc(final String str) {
        zze(new zzfkp() { // from class: com.google.android.gms.internal.ads.zzehf
            @Override // com.google.android.gms.internal.ads.zzfkp
            public final Object zza(Object obj) {
                zzehh.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zzd(final zzehj zzehjVar) {
        zze(new zzfkp() { // from class: com.google.android.gms.internal.ads.zzehb
            @Override // com.google.android.gms.internal.ads.zzfkp
            public final Object zza(Object obj) {
                zzehh.this.zza(zzehjVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(zzfkp zzfkpVar) {
        zzgen.zzr(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzehd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzehh.this.getWritableDatabase();
            }
        }), new zzehg(this, zzfkpVar), this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzg(final SQLiteDatabase sQLiteDatabase, final zzceh zzcehVar, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehe
            @Override // java.lang.Runnable
            public final void run() {
                zzehh.zzf(sQLiteDatabase, str, zzcehVar);
            }
        });
    }

    public final void zzh(final zzceh zzcehVar, final String str) {
        zze(new zzfkp() { // from class: com.google.android.gms.internal.ads.zzehc
            @Override // com.google.android.gms.internal.ads.zzfkp
            public final Object zza(Object obj) {
                zzehh.this.zzg((SQLiteDatabase) obj, zzcehVar, str);
                return null;
            }
        });
    }
}

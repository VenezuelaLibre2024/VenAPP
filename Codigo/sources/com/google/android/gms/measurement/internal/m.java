package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zznk;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zznq;
import com.google.android.gms.internal.measurement.zzpg;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class m extends ua {

    /* renamed from: f */
    private static final String[] f10381f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g */
    private static final String[] f10382g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h */
    private static final String[] f10383h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;"};

    /* renamed from: i */
    private static final String[] f10384i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j */
    private static final String[] f10385j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k */
    private static final String[] f10386k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l */
    private static final String[] f10387l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m */
    private static final String[] f10388m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: n */
    private static final String[] f10389n = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;"};

    /* renamed from: o */
    private static final String[] f10390o = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: d */
    private final s f10391d;

    /* renamed from: e */
    private final oa f10392e;

    public m(va vaVar) {
        super(vaVar);
        this.f10392e = new oa(zzb());
        this.f10391d = new s(this, zza(), "google_app_measurement.db");
    }

    private final long B(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            try {
                cursor = w().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j10;
                }
                long j11 = cursor.getLong(0);
                cursor.close();
                return j11;
            } catch (SQLiteException e10) {
                zzj().B().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    private final Object H(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            zzj().B().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            zzj().B().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        zzj().B().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <T> T I(java.lang.String r3, java.lang.String[] r4, com.google.android.gms.measurement.internal.p<T> r5) {
        /*
            r2 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r2.w()     // Catch: java.lang.Throwable -> L2a android.database.sqlite.SQLiteException -> L2c
            android.database.Cursor r3 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L2a android.database.sqlite.SQLiteException -> L2c
            boolean r4 = r3.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L28 java.lang.Throwable -> L41
            if (r4 != 0) goto L20
            com.google.android.gms.measurement.internal.n4 r4 = r2.zzj()     // Catch: android.database.sqlite.SQLiteException -> L28 java.lang.Throwable -> L41
            com.google.android.gms.measurement.internal.p4 r4 = r4.F()     // Catch: android.database.sqlite.SQLiteException -> L28 java.lang.Throwable -> L41
            java.lang.String r5 = "No data found"
            r4.a(r5)     // Catch: android.database.sqlite.SQLiteException -> L28 java.lang.Throwable -> L41
            r3.close()
            return r0
        L20:
            java.lang.Object r4 = r5.a(r3)     // Catch: android.database.sqlite.SQLiteException -> L28 java.lang.Throwable -> L41
            r3.close()
            return r4
        L28:
            r4 = move-exception
            goto L2e
        L2a:
            r4 = move-exception
            goto L43
        L2c:
            r4 = move-exception
            r3 = r0
        L2e:
            com.google.android.gms.measurement.internal.n4 r5 = r2.zzj()     // Catch: java.lang.Throwable -> L41
            com.google.android.gms.measurement.internal.p4 r5 = r5.B()     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = "Error querying database."
            r5.b(r1, r4)     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L40
            r3.close()
        L40:
            return r0
        L41:
            r4 = move-exception
            r0 = r3
        L43:
            if (r0 == 0) goto L48
            r0.close()
        L48:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.I(java.lang.String, java.lang.String[], com.google.android.gms.measurement.internal.p):java.lang.Object");
    }

    private final String K(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            try {
                cursor = w().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return str2;
                }
                String string = cursor.getString(0);
                cursor.close();
                return string;
            } catch (SQLiteException e10) {
                zzj().B().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    private static void O(ContentValues contentValues, String str, Object obj) {
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.j(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put(str, (Double) obj);
        }
    }

    private final void T(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase w10 = w();
            if (contentValues.getAsString(str2) == null) {
                zzj().C().b("Value of the primary key is not set.", n4.q(str2));
                return;
            }
            if (w10.update(str, contentValues, str2 + " = ?", new String[]{r1}) == 0 && w10.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().B().c("Failed to insert/update table (got -1). key", n4.q(str), n4.q(str2));
            }
        } catch (SQLiteException e10) {
            zzj().B().d("Error storing into table. key", n4.q(str), n4.q(str2), e10);
        }
    }

    private final boolean a0(String str, int i10, zzew.zzb zzbVar) {
        p();
        i();
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.j(zzbVar);
        if (zzbVar.zzf().isEmpty()) {
            zzj().G().d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", n4.q(str), Integer.valueOf(i10), String.valueOf(zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null));
            return false;
        }
        byte[] zzbv = zzbVar.zzbv();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i10));
        contentValues.put("filter_id", zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null);
        contentValues.put("event_name", zzbVar.zzf());
        contentValues.put("session_scoped", zzbVar.zzm() ? Boolean.valueOf(zzbVar.zzj()) : null);
        contentValues.put("data", zzbv);
        try {
            if (w().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().B().b("Failed to insert event filter (got -1). appId", n4.q(str));
            return true;
        } catch (SQLiteException e10) {
            zzj().B().c("Error storing event filter. appId", n4.q(str), e10);
            return false;
        }
    }

    private final boolean b0(String str, int i10, zzew.zze zzeVar) {
        p();
        i();
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.j(zzeVar);
        if (zzeVar.zze().isEmpty()) {
            zzj().G().d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", n4.q(str), Integer.valueOf(i10), String.valueOf(zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null));
            return false;
        }
        byte[] zzbv = zzeVar.zzbv();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i10));
        contentValues.put("filter_id", zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null);
        contentValues.put("property_name", zzeVar.zze());
        contentValues.put("session_scoped", zzeVar.zzj() ? Boolean.valueOf(zzeVar.zzh()) : null);
        contentValues.put("data", zzbv);
        try {
            if (w().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().B().b("Failed to insert property filter (got -1). appId", n4.q(str));
            return false;
        } catch (SQLiteException e10) {
            zzj().B().c("Error storing property filter. appId", n4.q(str), e10);
            return false;
        }
    }

    private final boolean p0() {
        return zza().getDatabasePath("google_app_measurement.db").exists();
    }

    private final long s0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = w().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = rawQuery.getLong(0);
                rawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                zzj().B().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    private final boolean u0(String str, List<Integer> list) {
        com.google.android.gms.common.internal.s.f(str);
        p();
        i();
        SQLiteDatabase w10 = w();
        try {
            long s02 = s0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(AdError.SERVER_ERROR_CODE, a().p(str, e0.H)));
            if (s02 <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                Integer num = list.get(i10);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String str2 = "(" + TextUtils.join(",", arrayList) + ")";
            StringBuilder sb2 = new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb2.append(str2);
            sb2.append(" order by rowid desc limit -1 offset ?)");
            return w10.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e10) {
            zzj().B().c("Database error querying filters. appId", n4.q(str), e10);
            return false;
        }
    }

    public final long A(String str) {
        com.google.android.gms.common.internal.s.f(str);
        i();
        p();
        try {
            return w().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, a().p(str, e0.f10123r))))});
        } catch (SQLiteException e10) {
            zzj().B().c("Error deleting over the limit events. appId", n4.q(str), e10);
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.jb A0(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.s.f(r19)
            com.google.android.gms.common.internal.s.f(r20)
            r18.i()
            r18.p()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.w()     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L84
            java.lang.String r11 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r1 = "value"
            java.lang.String r2 = "origin"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2}     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L84
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L84
            r1 = 0
            r14[r1] = r19     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L84
            r2 = 1
            r14[r2] = r8     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L84
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L84
            boolean r3 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7c
            if (r3 != 0) goto L3d
            r10.close()
            return r9
        L3d:
            long r5 = r10.getLong(r1)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7c
            r11 = r18
            java.lang.Object r7 = r11.H(r10, r2)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            if (r7 != 0) goto L4d
            r10.close()
            return r9
        L4d:
            java.lang.String r3 = r10.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            com.google.android.gms.measurement.internal.jb r0 = new com.google.android.gms.measurement.internal.jb     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            boolean r1 = r10.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            if (r1 == 0) goto L72
            com.google.android.gms.measurement.internal.n4 r1 = r18.zzj()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            com.google.android.gms.measurement.internal.p4 r1 = r1.B()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.n4.q(r19)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            r1.b(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
        L72:
            r10.close()
            return r0
        L76:
            r0 = move-exception
            goto L88
        L78:
            r0 = move-exception
            r11 = r18
            goto La8
        L7c:
            r0 = move-exception
            r11 = r18
            goto L88
        L80:
            r0 = move-exception
            r11 = r18
            goto La9
        L84:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L88:
            com.google.android.gms.measurement.internal.n4 r1 = r18.zzj()     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.measurement.internal.p4 r1 = r1.B()     // Catch: java.lang.Throwable -> La7
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.n4.q(r19)     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.measurement.internal.m4 r4 = r18.d()     // Catch: java.lang.Throwable -> La7
            java.lang.String r4 = r4.g(r8)     // Catch: java.lang.Throwable -> La7
            r1.d(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> La7
            if (r10 == 0) goto La6
            r10.close()
        La6:
            return r9
        La7:
            r0 = move-exception
        La8:
            r9 = r10
        La9:
            if (r9 == 0) goto Lae
            r9.close()
        Lae:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.A0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.jb");
    }

    public final v B0(String str) {
        if (!zznp.zza() || !a().n(e0.T0)) {
            return v.f10684f;
        }
        com.google.android.gms.common.internal.s.j(str);
        i();
        p();
        return v.c(K("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x008b: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:29:0x008b */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<com.google.android.gms.internal.measurement.zzfi.zze, java.lang.Long> C(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.i()
            r7.p()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.w()     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            r6 = 1
            r3[r6] = r5     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            if (r2 != 0) goto L35
            com.google.android.gms.measurement.internal.n4 r8 = r7.zzj()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.measurement.internal.p4 r8 = r8.F()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            java.lang.String r9 = "Main event not found"
            r8.a(r9)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r1.close()
            return r0
        L35:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            long r3 = r1.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzfi$zze$zza r4 = com.google.android.gms.internal.measurement.zzfi.zze.zze()     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzkm r2 = com.google.android.gms.measurement.internal.db.A(r4, r2)     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzfi$zze$zza r2 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r2     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzkj r2 = r2.zzab()     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzix r2 = (com.google.android.gms.internal.measurement.zzix) r2     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzfi$zze r2 = (com.google.android.gms.internal.measurement.zzfi.zze) r2     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r1.close()
            return r8
        L5b:
            r2 = move-exception
            com.google.android.gms.measurement.internal.n4 r3 = r7.zzj()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.measurement.internal.p4 r3 = r3.B()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.n4.q(r8)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r3.d(r4, r8, r9, r2)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r1.close()
            return r0
        L71:
            r8 = move-exception
            goto L77
        L73:
            r8 = move-exception
            goto L8c
        L75:
            r8 = move-exception
            r1 = r0
        L77:
            com.google.android.gms.measurement.internal.n4 r9 = r7.zzj()     // Catch: java.lang.Throwable -> L8a
            com.google.android.gms.measurement.internal.p4 r9 = r9.B()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = "Error selecting main event"
            r9.b(r2, r8)     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L89
            r1.close()
        L89:
            return r0
        L8a:
            r8 = move-exception
            r0 = r1
        L8c:
            if (r0 == 0) goto L91
            r0.close()
        L91:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.C(java.lang.String, java.lang.Long):android.util.Pair");
    }

    public final Map<Integer, List<zzew.zzb>> C0(String str, String str2) {
        p();
        i();
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.f(str2);
        androidx.collection.a aVar = new androidx.collection.a();
        Cursor cursor = null;
        try {
            try {
                Cursor query = w().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzew.zzb>> emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        zzew.zzb zzbVar = (zzew.zzb) ((zzix) ((zzew.zzb.zza) db.A(zzew.zzb.zzc(), query.getBlob(1))).zzab());
                        int i10 = query.getInt(0);
                        List list = (List) aVar.get(Integer.valueOf(i10));
                        if (list == null) {
                            list = new ArrayList();
                            aVar.put(Integer.valueOf(i10), list);
                        }
                        list.add(zzbVar);
                    } catch (IOException e10) {
                        zzj().B().c("Failed to merge filter. appId", n4.q(str), e10);
                    }
                } while (query.moveToNext());
                query.close();
                return aVar;
            } catch (SQLiteException e11) {
                zzj().B().c("Database error querying filters. appId", n4.q(str), e11);
                Map<Integer, List<zzew.zzb>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final n D(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        com.google.android.gms.common.internal.s.f(str);
        i();
        p();
        String[] strArr = {str};
        n nVar = new n();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase w10 = w();
                Cursor query = w10.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    zzj().G().b("Not updating daily counts, app is not known. appId", n4.q(str));
                    query.close();
                    return nVar;
                }
                if (query.getLong(0) == j10) {
                    nVar.f10416b = query.getLong(1);
                    nVar.f10415a = query.getLong(2);
                    nVar.f10417c = query.getLong(3);
                    nVar.f10418d = query.getLong(4);
                    nVar.f10419e = query.getLong(5);
                }
                if (z10) {
                    nVar.f10416b += j11;
                }
                if (z11) {
                    nVar.f10415a += j11;
                }
                if (z12) {
                    nVar.f10417c += j11;
                }
                if (z13) {
                    nVar.f10418d += j11;
                }
                if (z14) {
                    nVar.f10419e += j11;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j10));
                contentValues.put("daily_public_events_count", Long.valueOf(nVar.f10415a));
                contentValues.put("daily_events_count", Long.valueOf(nVar.f10416b));
                contentValues.put("daily_conversions_count", Long.valueOf(nVar.f10417c));
                contentValues.put("daily_error_events_count", Long.valueOf(nVar.f10418d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(nVar.f10419e));
                w10.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return nVar;
            } catch (SQLiteException e10) {
                zzj().B().c("Error updating daily counts. appId", n4.q(str), e10);
                if (0 != 0) {
                    cursor.close();
                }
                return nVar;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final y6 D0(String str) {
        com.google.android.gms.common.internal.s.j(str);
        i();
        p();
        if (!zznp.zza() || !a().n(e0.T0)) {
            return y6.e(K("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str}, "G1"));
        }
        y6 y6Var = (y6) I("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, l.f10342a);
        return y6Var == null ? y6.f10861c : y6Var;
    }

    public final n E(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return D(j10, str, 1L, false, false, z12, false, z14);
    }

    public final Map<Integer, List<zzew.zze>> E0(String str, String str2) {
        p();
        i();
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.f(str2);
        androidx.collection.a aVar = new androidx.collection.a();
        Cursor cursor = null;
        try {
            try {
                Cursor query = w().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzew.zze>> emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        zzew.zze zzeVar = (zzew.zze) ((zzix) ((zzew.zze.zza) db.A(zzew.zze.zzc(), query.getBlob(1))).zzab());
                        int i10 = query.getInt(0);
                        List list = (List) aVar.get(Integer.valueOf(i10));
                        if (list == null) {
                            list = new ArrayList();
                            aVar.put(Integer.valueOf(i10), list);
                        }
                        list.add(zzeVar);
                    } catch (IOException e10) {
                        zzj().B().c("Failed to merge filter", n4.q(str), e10);
                    }
                } while (query.moveToNext());
                query.close();
                return aVar;
            } catch (SQLiteException e11) {
                zzj().B().c("Database error querying filters. appId", n4.q(str), e11);
                Map<Integer, List<zzew.zze>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final List<na> F0(String str) {
        com.google.android.gms.common.internal.s.f(str);
        i();
        p();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = w().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(new na(string, cursor.getLong(1), cursor.getInt(2)));
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e10) {
                zzj().B().c("Error querying trigger uris. appId", n4.q(str), e10);
                List<na> emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final void G0(String str, String str2) {
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.f(str2);
        i();
        p();
        try {
            w().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            zzj().B().d("Error deleting user property. appId", n4.q(str), d().g(str2), e10);
        }
    }

    public final List<jb> H0(String str) {
        com.google.android.gms.common.internal.s.f(str);
        i();
        p();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = w().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j10 = cursor.getLong(2);
                    Object H = H(cursor, 3);
                    if (H == null) {
                        zzj().B().b("Read invalid user property value, ignoring it. appId", n4.q(str));
                    } else {
                        arrayList.add(new jb(str, str2, string, j10, H));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e10) {
                zzj().B().c("Error querying user properties. appId", n4.q(str), e10);
                List<jb> emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final Map<Integer, zzfi.zzl> I0(String str) {
        p();
        i();
        com.google.android.gms.common.internal.s.f(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = w().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, zzfi.zzl> emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                androidx.collection.a aVar = new androidx.collection.a();
                do {
                    int i10 = query.getInt(0);
                    try {
                        aVar.put(Integer.valueOf(i10), (zzfi.zzl) ((zzix) ((zzfi.zzl.zza) db.A(zzfi.zzl.zze(), query.getBlob(1))).zzab()));
                    } catch (IOException e10) {
                        zzj().B().d("Failed to merge filter results. appId, audienceId, error", n4.q(str), Integer.valueOf(i10), e10);
                    }
                } while (query.moveToNext());
                query.close();
                return aVar;
            } catch (SQLiteException e11) {
                zzj().B().c("Database error querying filter results. appId", n4.q(str), e11);
                Map<Integer, zzfi.zzl> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String J(long r5) {
        /*
            r4 = this;
            r4.i()
            r4.p()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.w()     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            boolean r1 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            if (r1 != 0) goto L32
            com.google.android.gms.measurement.internal.n4 r6 = r4.zzj()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            com.google.android.gms.measurement.internal.p4 r6 = r6.F()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.a(r1)     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            r5.close()
            return r0
        L32:
            java.lang.String r6 = r5.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            r5.close()
            return r6
        L3a:
            r6 = move-exception
            goto L40
        L3c:
            r6 = move-exception
            goto L55
        L3e:
            r6 = move-exception
            r5 = r0
        L40:
            com.google.android.gms.measurement.internal.n4 r1 = r4.zzj()     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.measurement.internal.p4 r1 = r1.B()     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = "Error selecting expired configs"
            r1.b(r2, r6)     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L52
            r5.close()
        L52:
            return r0
        L53:
            r6 = move-exception
            r0 = r5
        L55:
            if (r0 == 0) goto L5a
            r0.close()
        L5a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.J(long):java.lang.String");
    }

    public final Map<Integer, List<zzew.zzb>> J0(String str) {
        com.google.android.gms.common.internal.s.f(str);
        androidx.collection.a aVar = new androidx.collection.a();
        Cursor cursor = null;
        try {
            try {
                Cursor query = w().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzew.zzb>> emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        zzew.zzb zzbVar = (zzew.zzb) ((zzix) ((zzew.zzb.zza) db.A(zzew.zzb.zzc(), query.getBlob(1))).zzab());
                        if (zzbVar.zzk()) {
                            int i10 = query.getInt(0);
                            List list = (List) aVar.get(Integer.valueOf(i10));
                            if (list == null) {
                                list = new ArrayList();
                                aVar.put(Integer.valueOf(i10), list);
                            }
                            list.add(zzbVar);
                        }
                    } catch (IOException e10) {
                        zzj().B().c("Failed to merge filter. appId", n4.q(str), e10);
                    }
                } while (query.moveToNext());
                query.close();
                return aVar;
            } catch (SQLiteException e11) {
                zzj().B().c("Database error querying filters. appId", n4.q(str), e11);
                Map<Integer, List<zzew.zzb>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final Map<Integer, List<Integer>> K0(String str) {
        p();
        i();
        com.google.android.gms.common.internal.s.f(str);
        androidx.collection.a aVar = new androidx.collection.a();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = w().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                if (!rawQuery.moveToFirst()) {
                    Map<Integer, List<Integer>> emptyMap = Collections.emptyMap();
                    rawQuery.close();
                    return emptyMap;
                }
                do {
                    int i10 = rawQuery.getInt(0);
                    List list = (List) aVar.get(Integer.valueOf(i10));
                    if (list == null) {
                        list = new ArrayList();
                        aVar.put(Integer.valueOf(i10), list);
                    }
                    list.add(Integer.valueOf(rawQuery.getInt(1)));
                } while (rawQuery.moveToNext());
                rawQuery.close();
                return aVar;
            } catch (SQLiteException e10) {
                zzj().B().c("Database error querying scoped filters. appId", n4.q(str), e10);
                Map<Integer, List<Integer>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x017f A[EDGE_INSN: B:63:0x017f->B:25:0x017f BREAK  A[LOOP:0: B:16:0x0054->B:76:0x017c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.zzfi.zzj, java.lang.Long>> L(java.lang.String r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.L(java.lang.String, int, int):java.util.List");
    }

    public final void L0() {
        p();
        w().beginTransaction();
    }

    public final List<d> M(String str, String str2, String str3) {
        com.google.android.gms.common.internal.s.f(str);
        i();
        p();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb2.append(" and name glob ?");
        }
        return N(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void M0() {
        p();
        w().endTransaction();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        zzj().B().b("Read more than the max allowed conditional properties, ignoring extra", java.lang.Integer.valueOf(com.facebook.ads.AdError.NETWORK_ERROR_CODE));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.d> N(java.lang.String r27, java.lang.String[] r28) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.N(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final void N0() {
        int delete;
        i();
        p();
        if (p0()) {
            long a10 = n().f10868e.a();
            long b10 = zzb().b();
            if (Math.abs(b10 - a10) > e0.A.a(null).longValue()) {
                n().f10868e.b(b10);
                i();
                p();
                if (!p0() || (delete = w().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzb().a()), String.valueOf(f.H())})) <= 0) {
                    return;
                }
                zzj().F().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
    }

    public final void O0() {
        p();
        w().setTransactionSuccessful();
    }

    public final void P(a0 a0Var) {
        com.google.android.gms.common.internal.s.j(a0Var);
        i();
        p();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", a0Var.f9934a);
        contentValues.put("name", a0Var.f9935b);
        contentValues.put("lifetime_count", Long.valueOf(a0Var.f9936c));
        contentValues.put("current_bundle_count", Long.valueOf(a0Var.f9937d));
        contentValues.put("last_fire_timestamp", Long.valueOf(a0Var.f9939f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(a0Var.f9940g));
        contentValues.put("last_bundled_day", a0Var.f9941h);
        contentValues.put("last_sampled_complex_event_id", a0Var.f9942i);
        contentValues.put("last_sampling_rate", a0Var.f9943j);
        contentValues.put("current_session_count", Long.valueOf(a0Var.f9938e));
        Boolean bool = a0Var.f9944k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (w().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                zzj().B().b("Failed to insert/update event aggregates (got -1). appId", n4.q(a0Var.f9934a));
            }
        } catch (SQLiteException e10) {
            zzj().B().c("Error storing event aggregates. appId", n4.q(a0Var.f9934a), e10);
        }
    }

    public final boolean P0() {
        return s0("select count(1) > 0 from raw_events", null) != 0;
    }

    public final void Q(r5 r5Var) {
        com.google.android.gms.common.internal.s.j(r5Var);
        i();
        p();
        String t02 = r5Var.t0();
        com.google.android.gms.common.internal.s.j(t02);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", t02);
        contentValues.put("app_instance_id", r5Var.u0());
        contentValues.put("gmp_app_id", r5Var.j());
        contentValues.put("resettable_device_id_hash", r5Var.l());
        contentValues.put("last_bundle_index", Long.valueOf(r5Var.k0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(r5Var.m0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(r5Var.i0()));
        contentValues.put("app_version", r5Var.h());
        contentValues.put("app_store", r5Var.v0());
        contentValues.put("gmp_version", Long.valueOf(r5Var.g0()));
        contentValues.put("dev_cert_hash", Long.valueOf(r5Var.a0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(r5Var.r()));
        contentValues.put("day", Long.valueOf(r5Var.Y()));
        contentValues.put("daily_public_events_count", Long.valueOf(r5Var.T()));
        contentValues.put("daily_events_count", Long.valueOf(r5Var.Q()));
        contentValues.put("daily_conversions_count", Long.valueOf(r5Var.K()));
        contentValues.put("config_fetched_time", Long.valueOf(r5Var.H()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(r5Var.e0()));
        contentValues.put("app_version_int", Long.valueOf(r5Var.z()));
        contentValues.put("firebase_instance_id", r5Var.i());
        contentValues.put("daily_error_events_count", Long.valueOf(r5Var.N()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(r5Var.W()));
        contentValues.put("health_monitor_sample", r5Var.k());
        contentValues.put("android_id", Long.valueOf(r5Var.v()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(r5Var.q()));
        contentValues.put("admob_app_id", r5Var.r0());
        contentValues.put("dynamite_version", Long.valueOf(r5Var.c0()));
        contentValues.put("session_stitching_token", r5Var.m());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(r5Var.t()));
        contentValues.put("target_os_version", Long.valueOf(r5Var.p0()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(r5Var.o0()));
        if (zzpg.zza() && a().w(t02, e0.L0)) {
            contentValues.put("ad_services_version", Integer.valueOf(r5Var.a()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(r5Var.D()));
        }
        if (zznk.zza() && a().w(t02, e0.Y0)) {
            contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(r5Var.u()));
        }
        List<String> n10 = r5Var.n();
        if (n10 != null) {
            if (n10.isEmpty()) {
                zzj().G().b("Safelisted events should not be an empty list. appId", t02);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", n10));
            }
        }
        if (zznq.zza() && a().n(e0.f10130u0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        if (zznp.zza() && a().w(t02, e0.T0)) {
            contentValues.put("npa_metadata_value", r5Var.q0());
        }
        try {
            SQLiteDatabase w10 = w();
            if (w10.update("apps", contentValues, "app_id = ?", new String[]{t02}) == 0 && w10.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzj().B().b("Failed to insert/update app (got -1). appId", n4.q(t02));
            }
        } catch (SQLiteException e10) {
            zzj().B().c("Error storing app. appId", n4.q(t02), e10);
        }
    }

    public final boolean Q0() {
        return s0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final void R(String str, v vVar) {
        if (zznp.zza() && a().n(e0.T0)) {
            com.google.android.gms.common.internal.s.j(str);
            com.google.android.gms.common.internal.s.j(vVar);
            i();
            p();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("dma_consent_settings", vVar.i());
            T("consent_settings", "app_id", contentValues);
        }
    }

    public final boolean R0() {
        return s0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    public final void S(String str, y6 y6Var) {
        com.google.android.gms.common.internal.s.j(str);
        com.google.android.gms.common.internal.s.j(y6Var);
        i();
        p();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", y6Var.v());
        if (zznp.zza() && a().n(e0.T0)) {
            contentValues.put("consent_source", Integer.valueOf(y6Var.b()));
            T("consent_settings", "app_id", contentValues);
            return;
        }
        try {
            if (w().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzj().B().b("Failed to insert/update consent setting (got -1). appId", n4.q(str));
            }
        } catch (SQLiteException e10) {
            zzj().B().c("Error storing consent setting. appId, error", n4.q(str), e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0164, code lost:
    
        r8.c(r10, r11, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U(java.lang.String r18, java.util.List<com.google.android.gms.internal.measurement.zzew.zza> r19) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.U(java.lang.String, java.util.List):void");
    }

    public final void V(List<Long> list) {
        i();
        p();
        com.google.android.gms.common.internal.s.j(list);
        com.google.android.gms.common.internal.s.l(list.size());
        if (p0()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (s0("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                zzj().G().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                w().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e10) {
                zzj().B().b("Error incrementing retry count. error", e10);
            }
        }
    }

    public final boolean W(zzfi.zzj zzjVar, boolean z10) {
        p4 B;
        Object q10;
        String str;
        i();
        p();
        com.google.android.gms.common.internal.s.j(zzjVar);
        com.google.android.gms.common.internal.s.f(zzjVar.zzx());
        com.google.android.gms.common.internal.s.n(zzjVar.zzbe());
        N0();
        long a10 = zzb().a();
        if (zzjVar.zzl() < a10 - f.H() || zzjVar.zzl() > f.H() + a10) {
            zzj().G().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", n4.q(zzjVar.zzx()), Long.valueOf(a10), Long.valueOf(zzjVar.zzl()));
        }
        try {
            byte[] b02 = j().b0(zzjVar.zzbv());
            zzj().F().b("Saving bundle, size", Integer.valueOf(b02.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzjVar.zzx());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzjVar.zzl()));
            contentValues.put("data", b02);
            contentValues.put("has_realtime", Integer.valueOf(z10 ? 1 : 0));
            if (zzjVar.zzbl()) {
                contentValues.put("retry_count", Integer.valueOf(zzjVar.zzf()));
            }
            try {
                if (w().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                zzj().B().b("Failed to insert bundle (got -1). appId", n4.q(zzjVar.zzx()));
                return false;
            } catch (SQLiteException e10) {
                e = e10;
                B = zzj().B();
                q10 = n4.q(zzjVar.zzx());
                str = "Error storing bundle. appId";
                B.c(str, q10, e);
                return false;
            }
        } catch (IOException e11) {
            e = e11;
            B = zzj().B();
            q10 = n4.q(zzjVar.zzx());
            str = "Data loss. Failed to serialize bundle. appId";
        }
    }

    public final boolean X(d dVar) {
        com.google.android.gms.common.internal.s.j(dVar);
        i();
        p();
        String str = dVar.f10043a;
        com.google.android.gms.common.internal.s.j(str);
        if (A0(str, dVar.f10045c.f10237b) == null && s0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", dVar.f10044b);
        contentValues.put("name", dVar.f10045c.f10237b);
        O(contentValues, "value", com.google.android.gms.common.internal.s.j(dVar.f10045c.u1()));
        contentValues.put("active", Boolean.valueOf(dVar.f10047e));
        contentValues.put("trigger_event_name", dVar.f10048f);
        contentValues.put("trigger_timeout", Long.valueOf(dVar.f10050s));
        f();
        contentValues.put("timed_out_event", ib.k0(dVar.f10049r));
        contentValues.put("creation_timestamp", Long.valueOf(dVar.f10046d));
        f();
        contentValues.put("triggered_event", ib.k0(dVar.f10051t));
        contentValues.put("triggered_timestamp", Long.valueOf(dVar.f10045c.f10238c));
        contentValues.put("time_to_live", Long.valueOf(dVar.f10052u));
        f();
        contentValues.put("expired_event", ib.k0(dVar.f10053v));
        try {
            if (w().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                zzj().B().b("Failed to insert/update conditional user property (got -1)", n4.q(str));
            }
        } catch (SQLiteException e10) {
            zzj().B().c("Error storing conditional user property", n4.q(str), e10);
        }
        return true;
    }

    public final boolean Y(w wVar, long j10, boolean z10) {
        i();
        p();
        com.google.android.gms.common.internal.s.j(wVar);
        com.google.android.gms.common.internal.s.f(wVar.f10749a);
        byte[] zzbv = j().y(wVar).zzbv();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", wVar.f10749a);
        contentValues.put("name", wVar.f10750b);
        contentValues.put(Constants.TIMESTAMP, Long.valueOf(wVar.f10752d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j10));
        contentValues.put("data", zzbv);
        contentValues.put("realtime", Integer.valueOf(z10 ? 1 : 0));
        try {
            if (w().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            zzj().B().b("Failed to insert raw event (got -1). appId", n4.q(wVar.f10749a));
            return false;
        } catch (SQLiteException e10) {
            zzj().B().c("Error storing raw event. appId", n4.q(wVar.f10749a), e10);
            return false;
        }
    }

    public final boolean Z(jb jbVar) {
        com.google.android.gms.common.internal.s.j(jbVar);
        i();
        p();
        if (A0(jbVar.f10318a, jbVar.f10320c) == null) {
            if (ib.E0(jbVar.f10320c)) {
                if (s0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{jbVar.f10318a}) >= a().l(jbVar.f10318a, e0.I, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(jbVar.f10320c) && s0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{jbVar.f10318a, jbVar.f10319b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", jbVar.f10318a);
        contentValues.put("origin", jbVar.f10319b);
        contentValues.put("name", jbVar.f10320c);
        contentValues.put("set_timestamp", Long.valueOf(jbVar.f10321d));
        O(contentValues, "value", jbVar.f10322e);
        try {
            if (w().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                zzj().B().b("Failed to insert/update user property (got -1). appId", n4.q(jbVar.f10318a));
            }
        } catch (SQLiteException e10) {
            zzj().B().c("Error storing user property. appId", n4.q(jbVar.f10318a), e10);
        }
        return true;
    }

    public final boolean c0(String str, Bundle bundle) {
        i();
        p();
        byte[] zzbv = j().y(new w(this.f10701a, "", str, "dep", 0L, 0L, bundle)).zzbv();
        zzj().F().c("Saving default event parameters, appId, data size", d().c(str), Integer.valueOf(zzbv.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(io.flutter.plugins.firebase.analytics.Constants.PARAMETERS, zzbv);
        try {
            if (w().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().B().b("Failed to insert default event parameters (got -1). appId", n4.q(str));
            return false;
        } catch (SQLiteException e10) {
            zzj().B().c("Error storing default event parameters. appId", n4.q(str), e10);
            return false;
        }
    }

    public final boolean d0(String str, na naVar) {
        i();
        p();
        com.google.android.gms.common.internal.s.j(naVar);
        com.google.android.gms.common.internal.s.f(str);
        long a10 = zzb().a();
        if (naVar.f10448b < a10 - f.H() || naVar.f10448b > f.H() + a10) {
            zzj().G().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", n4.q(str), Long.valueOf(a10), Long.valueOf(naVar.f10448b));
        }
        zzj().F().a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", naVar.f10447a);
        contentValues.put("source", Integer.valueOf(naVar.f10449c));
        contentValues.put("timestamp_millis", Long.valueOf(naVar.f10448b));
        try {
            if (w().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            zzj().B().b("Failed to insert trigger URI (got -1). appId", n4.q(str));
            return false;
        } catch (SQLiteException e10) {
            zzj().B().c("Error storing trigger URI. appId", n4.q(str), e10);
            return false;
        }
    }

    public final boolean e0(String str, Long l10, long j10, zzfi.zze zzeVar) {
        i();
        p();
        com.google.android.gms.common.internal.s.j(zzeVar);
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.j(l10);
        byte[] zzbv = zzeVar.zzbv();
        zzj().F().c("Saving complex main event, appId, data size", d().c(str), Integer.valueOf(zzbv.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", zzbv);
        try {
            if (w().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().B().b("Failed to insert complex main event (got -1). appId", n4.q(str));
            return false;
        } catch (SQLiteException e10) {
            zzj().B().c("Error storing complex main event. appId", n4.q(str), e10);
            return false;
        }
    }

    public final long q0(String str) {
        com.google.android.gms.common.internal.s.f(str);
        return B("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final long r0(String str, String str2) {
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.f(str2);
        i();
        p();
        SQLiteDatabase w10 = w();
        w10.beginTransaction();
        long j10 = 0;
        try {
            try {
                long B = B("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
                if (B == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (w10.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        zzj().B().c("Failed to insert column (got -1). appId", n4.q(str), str2);
                        return -1L;
                    }
                    B = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put(str2, Long.valueOf(1 + B));
                    if (w10.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        zzj().B().c("Failed to update column (got 0). appId", n4.q(str), str2);
                        return -1L;
                    }
                    w10.setTransactionSuccessful();
                    return B;
                } catch (SQLiteException e10) {
                    e = e10;
                    j10 = B;
                    zzj().B().d("Error inserting column. appId", n4.q(str), str2, e);
                    w10.endTransaction();
                    return j10;
                }
            } finally {
                w10.endTransaction();
            }
        } catch (SQLiteException e11) {
            e = e11;
        }
    }

    @Override // com.google.android.gms.measurement.internal.ua
    protected final boolean s() {
        return false;
    }

    public final long t() {
        Cursor cursor = null;
        try {
            try {
                cursor = w().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return -1L;
                }
                long j10 = cursor.getLong(0);
                cursor.close();
                return j10;
            } catch (SQLiteException e10) {
                zzj().B().b("Error querying raw events", e10);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0097, code lost:
    
        zzj().B().b("Read more than the max allowed user properties, ignoring excess", java.lang.Integer.valueOf(com.facebook.ads.AdError.NETWORK_ERROR_CODE));
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.jb> t0(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.t0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final long u() {
        return B("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long v() {
        return B("select max(timestamp) from raw_events", null, 0L);
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d0: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:57:0x00d0 */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle v0(java.lang.String r8) {
        /*
            r7 = this;
            r7.i()
            r7.p()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.w()     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            if (r2 != 0) goto L2e
            com.google.android.gms.measurement.internal.n4 r8 = r7.zzj()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            com.google.android.gms.measurement.internal.p4 r8 = r8.F()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            r1.close()
            return r0
        L2e:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            com.google.android.gms.internal.measurement.zzfi$zze$zza r3 = com.google.android.gms.internal.measurement.zzfi.zze.zze()     // Catch: java.io.IOException -> La0 android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            com.google.android.gms.internal.measurement.zzkm r2 = com.google.android.gms.measurement.internal.db.A(r3, r2)     // Catch: java.io.IOException -> La0 android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            com.google.android.gms.internal.measurement.zzfi$zze$zza r2 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r2     // Catch: java.io.IOException -> La0 android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            com.google.android.gms.internal.measurement.zzkj r2 = r2.zzab()     // Catch: java.io.IOException -> La0 android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            com.google.android.gms.internal.measurement.zzix r2 = (com.google.android.gms.internal.measurement.zzix) r2     // Catch: java.io.IOException -> La0 android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            com.google.android.gms.internal.measurement.zzfi$zze r2 = (com.google.android.gms.internal.measurement.zzfi.zze) r2     // Catch: java.io.IOException -> La0 android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            r7.j()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            java.util.List r8 = r2.zzh()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            android.os.Bundle r2 = new android.os.Bundle     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            java.util.Iterator r8 = r8.iterator()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
        L54:
            boolean r3 = r8.hasNext()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            if (r3 == 0) goto L9c
            java.lang.Object r3 = r8.next()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            com.google.android.gms.internal.measurement.zzfi$zzg r3 = (com.google.android.gms.internal.measurement.zzfi.zzg) r3     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            java.lang.String r4 = r3.zzg()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            boolean r5 = r3.zzj()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            if (r5 == 0) goto L72
            double r5 = r3.zza()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            r2.putDouble(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            goto L54
        L72:
            boolean r5 = r3.zzk()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            if (r5 == 0) goto L80
            float r3 = r3.zzb()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            r2.putFloat(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            goto L54
        L80:
            boolean r5 = r3.zzn()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            if (r5 == 0) goto L8e
            java.lang.String r3 = r3.zzh()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            r2.putString(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            goto L54
        L8e:
            boolean r5 = r3.zzl()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            if (r5 == 0) goto L54
            long r5 = r3.zzd()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            r2.putLong(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            goto L54
        L9c:
            r1.close()
            return r2
        La0:
            r2 = move-exception
            com.google.android.gms.measurement.internal.n4 r3 = r7.zzj()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            com.google.android.gms.measurement.internal.p4 r3 = r3.B()     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.n4.q(r8)     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            r3.c(r4, r8, r2)     // Catch: android.database.sqlite.SQLiteException -> Lb6 java.lang.Throwable -> Lcf
            r1.close()
            return r0
        Lb6:
            r8 = move-exception
            goto Lbc
        Lb8:
            r8 = move-exception
            goto Ld1
        Lba:
            r8 = move-exception
            r1 = r0
        Lbc:
            com.google.android.gms.measurement.internal.n4 r2 = r7.zzj()     // Catch: java.lang.Throwable -> Lcf
            com.google.android.gms.measurement.internal.p4 r2 = r2.B()     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r8)     // Catch: java.lang.Throwable -> Lcf
            if (r1 == 0) goto Lce
            r1.close()
        Lce:
            return r0
        Lcf:
            r8 = move-exception
            r0 = r1
        Ld1:
            if (r0 == 0) goto Ld6
            r0.close()
        Ld6:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.v0(java.lang.String):android.os.Bundle");
    }

    public final SQLiteDatabase w() {
        i();
        try {
            return this.f10391d.getWritableDatabase();
        } catch (SQLiteException e10) {
            zzj().G().b("Error opening database", e10);
            throw e10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.d w0(java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.w0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.d");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String x() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.w()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L25
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r2 = move-exception
            goto L27
        L20:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3b
        L25:
            r2 = move-exception
            r0 = r1
        L27:
            com.google.android.gms.measurement.internal.n4 r3 = r6.zzj()     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.p4 r3 = r3.B()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            r1 = move-exception
        L3b:
            if (r0 == 0) goto L40
            r0.close()
        L40:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.x():java.lang.String");
    }

    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0147: MOVE (r18 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:69:0x0147 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.a0 x0(java.lang.String r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.x0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.a0");
    }

    public final int y(String str, String str2) {
        com.google.android.gms.common.internal.s.f(str);
        com.google.android.gms.common.internal.s.f(str2);
        i();
        p();
        try {
            return w().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            zzj().B().d("Error deleting conditional property", n4.q(str), d().g(str2), e10);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018f A[Catch: SQLiteException -> 0x0293, all -> 0x02bc, TryCatch #1 {SQLiteException -> 0x0293, blocks: (B:13:0x007b, B:15:0x00dc, B:19:0x00e6, B:22:0x0130, B:24:0x015f, B:28:0x0169, B:31:0x0184, B:33:0x018f, B:34:0x01a1, B:36:0x01a7, B:38:0x01b3, B:40:0x01bf, B:41:0x01c8, B:43:0x01ce, B:45:0x01da, B:47:0x01e2, B:50:0x01eb, B:52:0x01ee, B:54:0x0206, B:56:0x0212, B:57:0x0224, B:59:0x022a, B:61:0x0236, B:63:0x023e, B:66:0x0247, B:68:0x024a, B:70:0x0250, B:72:0x025c, B:75:0x0272, B:76:0x0266, B:79:0x026e, B:81:0x0275, B:83:0x027e, B:87:0x0180, B:89:0x012b), top: B:12:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a7 A[Catch: SQLiteException -> 0x0293, all -> 0x02bc, TryCatch #1 {SQLiteException -> 0x0293, blocks: (B:13:0x007b, B:15:0x00dc, B:19:0x00e6, B:22:0x0130, B:24:0x015f, B:28:0x0169, B:31:0x0184, B:33:0x018f, B:34:0x01a1, B:36:0x01a7, B:38:0x01b3, B:40:0x01bf, B:41:0x01c8, B:43:0x01ce, B:45:0x01da, B:47:0x01e2, B:50:0x01eb, B:52:0x01ee, B:54:0x0206, B:56:0x0212, B:57:0x0224, B:59:0x022a, B:61:0x0236, B:63:0x023e, B:66:0x0247, B:68:0x024a, B:70:0x0250, B:72:0x025c, B:75:0x0272, B:76:0x0266, B:79:0x026e, B:81:0x0275, B:83:0x027e, B:87:0x0180, B:89:0x012b), top: B:12:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ce A[Catch: SQLiteException -> 0x0293, all -> 0x02bc, TryCatch #1 {SQLiteException -> 0x0293, blocks: (B:13:0x007b, B:15:0x00dc, B:19:0x00e6, B:22:0x0130, B:24:0x015f, B:28:0x0169, B:31:0x0184, B:33:0x018f, B:34:0x01a1, B:36:0x01a7, B:38:0x01b3, B:40:0x01bf, B:41:0x01c8, B:43:0x01ce, B:45:0x01da, B:47:0x01e2, B:50:0x01eb, B:52:0x01ee, B:54:0x0206, B:56:0x0212, B:57:0x0224, B:59:0x022a, B:61:0x0236, B:63:0x023e, B:66:0x0247, B:68:0x024a, B:70:0x0250, B:72:0x025c, B:75:0x0272, B:76:0x0266, B:79:0x026e, B:81:0x0275, B:83:0x027e, B:87:0x0180, B:89:0x012b), top: B:12:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0206 A[Catch: SQLiteException -> 0x0293, all -> 0x02bc, TryCatch #1 {SQLiteException -> 0x0293, blocks: (B:13:0x007b, B:15:0x00dc, B:19:0x00e6, B:22:0x0130, B:24:0x015f, B:28:0x0169, B:31:0x0184, B:33:0x018f, B:34:0x01a1, B:36:0x01a7, B:38:0x01b3, B:40:0x01bf, B:41:0x01c8, B:43:0x01ce, B:45:0x01da, B:47:0x01e2, B:50:0x01eb, B:52:0x01ee, B:54:0x0206, B:56:0x0212, B:57:0x0224, B:59:0x022a, B:61:0x0236, B:63:0x023e, B:66:0x0247, B:68:0x024a, B:70:0x0250, B:72:0x025c, B:75:0x0272, B:76:0x0266, B:79:0x026e, B:81:0x0275, B:83:0x027e, B:87:0x0180, B:89:0x012b), top: B:12:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022a A[Catch: SQLiteException -> 0x0293, all -> 0x02bc, TryCatch #1 {SQLiteException -> 0x0293, blocks: (B:13:0x007b, B:15:0x00dc, B:19:0x00e6, B:22:0x0130, B:24:0x015f, B:28:0x0169, B:31:0x0184, B:33:0x018f, B:34:0x01a1, B:36:0x01a7, B:38:0x01b3, B:40:0x01bf, B:41:0x01c8, B:43:0x01ce, B:45:0x01da, B:47:0x01e2, B:50:0x01eb, B:52:0x01ee, B:54:0x0206, B:56:0x0212, B:57:0x0224, B:59:0x022a, B:61:0x0236, B:63:0x023e, B:66:0x0247, B:68:0x024a, B:70:0x0250, B:72:0x025c, B:75:0x0272, B:76:0x0266, B:79:0x026e, B:81:0x0275, B:83:0x027e, B:87:0x0180, B:89:0x012b), top: B:12:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0250 A[Catch: SQLiteException -> 0x0293, all -> 0x02bc, TryCatch #1 {SQLiteException -> 0x0293, blocks: (B:13:0x007b, B:15:0x00dc, B:19:0x00e6, B:22:0x0130, B:24:0x015f, B:28:0x0169, B:31:0x0184, B:33:0x018f, B:34:0x01a1, B:36:0x01a7, B:38:0x01b3, B:40:0x01bf, B:41:0x01c8, B:43:0x01ce, B:45:0x01da, B:47:0x01e2, B:50:0x01eb, B:52:0x01ee, B:54:0x0206, B:56:0x0212, B:57:0x0224, B:59:0x022a, B:61:0x0236, B:63:0x023e, B:66:0x0247, B:68:0x024a, B:70:0x0250, B:72:0x025c, B:75:0x0272, B:76:0x0266, B:79:0x026e, B:81:0x0275, B:83:0x027e, B:87:0x0180, B:89:0x012b), top: B:12:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0266 A[Catch: SQLiteException -> 0x0293, all -> 0x02bc, TryCatch #1 {SQLiteException -> 0x0293, blocks: (B:13:0x007b, B:15:0x00dc, B:19:0x00e6, B:22:0x0130, B:24:0x015f, B:28:0x0169, B:31:0x0184, B:33:0x018f, B:34:0x01a1, B:36:0x01a7, B:38:0x01b3, B:40:0x01bf, B:41:0x01c8, B:43:0x01ce, B:45:0x01da, B:47:0x01e2, B:50:0x01eb, B:52:0x01ee, B:54:0x0206, B:56:0x0212, B:57:0x0224, B:59:0x022a, B:61:0x0236, B:63:0x023e, B:66:0x0247, B:68:0x024a, B:70:0x0250, B:72:0x025c, B:75:0x0272, B:76:0x0266, B:79:0x026e, B:81:0x0275, B:83:0x027e, B:87:0x0180, B:89:0x012b), top: B:12:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027e A[Catch: SQLiteException -> 0x0293, all -> 0x02bc, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x0293, blocks: (B:13:0x007b, B:15:0x00dc, B:19:0x00e6, B:22:0x0130, B:24:0x015f, B:28:0x0169, B:31:0x0184, B:33:0x018f, B:34:0x01a1, B:36:0x01a7, B:38:0x01b3, B:40:0x01bf, B:41:0x01c8, B:43:0x01ce, B:45:0x01da, B:47:0x01e2, B:50:0x01eb, B:52:0x01ee, B:54:0x0206, B:56:0x0212, B:57:0x0224, B:59:0x022a, B:61:0x0236, B:63:0x023e, B:66:0x0247, B:68:0x024a, B:70:0x0250, B:72:0x025c, B:75:0x0272, B:76:0x0266, B:79:0x026e, B:81:0x0275, B:83:0x027e, B:87:0x0180, B:89:0x012b), top: B:12:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0180 A[Catch: SQLiteException -> 0x0293, all -> 0x02bc, TryCatch #1 {SQLiteException -> 0x0293, blocks: (B:13:0x007b, B:15:0x00dc, B:19:0x00e6, B:22:0x0130, B:24:0x015f, B:28:0x0169, B:31:0x0184, B:33:0x018f, B:34:0x01a1, B:36:0x01a7, B:38:0x01b3, B:40:0x01bf, B:41:0x01c8, B:43:0x01ce, B:45:0x01da, B:47:0x01e2, B:50:0x01eb, B:52:0x01ee, B:54:0x0206, B:56:0x0212, B:57:0x0224, B:59:0x022a, B:61:0x0236, B:63:0x023e, B:66:0x0247, B:68:0x024a, B:70:0x0250, B:72:0x025c, B:75:0x0272, B:76:0x0266, B:79:0x026e, B:81:0x0275, B:83:0x027e, B:87:0x0180, B:89:0x012b), top: B:12:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012b A[Catch: SQLiteException -> 0x0293, all -> 0x02bc, TryCatch #1 {SQLiteException -> 0x0293, blocks: (B:13:0x007b, B:15:0x00dc, B:19:0x00e6, B:22:0x0130, B:24:0x015f, B:28:0x0169, B:31:0x0184, B:33:0x018f, B:34:0x01a1, B:36:0x01a7, B:38:0x01b3, B:40:0x01bf, B:41:0x01c8, B:43:0x01ce, B:45:0x01da, B:47:0x01e2, B:50:0x01eb, B:52:0x01ee, B:54:0x0206, B:56:0x0212, B:57:0x0224, B:59:0x022a, B:61:0x0236, B:63:0x023e, B:66:0x0247, B:68:0x024a, B:70:0x0250, B:72:0x025c, B:75:0x0272, B:76:0x0266, B:79:0x026e, B:81:0x0275, B:83:0x027e, B:87:0x0180, B:89:0x012b), top: B:12:0x007b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.r5 y0(java.lang.String r42) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.y0(java.lang.String):com.google.android.gms.measurement.internal.r5");
    }

    public final long z(zzfi.zzj zzjVar) {
        i();
        p();
        com.google.android.gms.common.internal.s.j(zzjVar);
        com.google.android.gms.common.internal.s.f(zzjVar.zzx());
        byte[] zzbv = zzjVar.zzbv();
        long v10 = j().v(zzbv);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzjVar.zzx());
        contentValues.put("metadata_fingerprint", Long.valueOf(v10));
        contentValues.put("metadata", zzbv);
        try {
            w().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return v10;
        } catch (SQLiteException e10) {
            zzj().B().c("Error storing raw event metadata. appId", n4.q(zzjVar.zzx()), e10);
            throw e10;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0084: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:27:0x0084 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.o z0(java.lang.String r12) {
        /*
            r11 = this;
            com.google.android.gms.common.internal.s.f(r12)
            r11.i()
            r11.p()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.w()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r4 = "app_id=?"
            r9 = 1
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a
            r10 = 0
            r5[r10] = r12     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            if (r2 != 0) goto L33
            r1.close()
            return r0
        L33:
            byte[] r2 = r1.getBlob(r10)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            java.lang.String r3 = r1.getString(r9)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            r4 = 2
            java.lang.String r4 = r1.getString(r4)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            boolean r5 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            if (r5 == 0) goto L57
            com.google.android.gms.measurement.internal.n4 r5 = r11.zzj()     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            com.google.android.gms.measurement.internal.p4 r5 = r5.B()     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.n4.q(r12)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            r5.b(r6, r7)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
        L57:
            if (r2 != 0) goto L5d
            r1.close()
            return r0
        L5d:
            com.google.android.gms.measurement.internal.o r5 = new com.google.android.gms.measurement.internal.o     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            r5.<init>(r2, r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            r1.close()
            return r5
        L66:
            r2 = move-exception
            goto L6c
        L68:
            r12 = move-exception
            goto L85
        L6a:
            r2 = move-exception
            r1 = r0
        L6c:
            com.google.android.gms.measurement.internal.n4 r3 = r11.zzj()     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.measurement.internal.p4 r3 = r3.B()     // Catch: java.lang.Throwable -> L83
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.n4.q(r12)     // Catch: java.lang.Throwable -> L83
            r3.c(r4, r12, r2)     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L82
            r1.close()
        L82:
            return r0
        L83:
            r12 = move-exception
            r0 = r1
        L85:
            if (r0 == 0) goto L8a
            r0.close()
        L8a:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.z0(java.lang.String):com.google.android.gms.measurement.internal.o");
    }
}

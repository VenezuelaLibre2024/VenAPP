package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.measurement.internal.r */
/* loaded from: classes2.dex */
public final class C5642r {
    /* renamed from: a */
    private static Set<String> m14254a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m14255b(C5595n4 c5595n4, SQLiteDatabase sQLiteDatabase) {
        if (c5595n4 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            c5595n4.m14187G().m14218a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            c5595n4.m14187G().m14218a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            c5595n4.m14187G().m14218a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        c5595n4.m14187G().m14218a("Failed to turn on database write permission for owner");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m14256c(C5595n4 c5595n4, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        if (c5595n4 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        if (!m14257d(c5595n4, sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            Set<String> m14254a = m14254a(sQLiteDatabase, str);
            for (String str4 : str3.split(",")) {
                if (!m14254a.remove(str4)) {
                    throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                }
            }
            if (strArr != null) {
                for (int i10 = 0; i10 < strArr.length; i10 += 2) {
                    if (!m14254a.remove(strArr[i10])) {
                        sQLiteDatabase.execSQL(strArr[i10 + 1]);
                    }
                }
            }
            if (m14254a.isEmpty()) {
                return;
            }
            c5595n4.m14187G().m14220c("Table has extra columns. table, columns", str, TextUtils.join(", ", m14254a));
        } catch (SQLiteException e10) {
            c5595n4.m14182B().m14219b("Failed to verify columns on table that was just created", str);
            throw e10;
        }
    }

    /* renamed from: d */
    private static boolean m14257d(C5595n4 c5595n4, SQLiteDatabase sQLiteDatabase, String str) {
        if (c5595n4 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                boolean moveToFirst = cursor.moveToFirst();
                cursor.close();
                return moveToFirst;
            } catch (SQLiteException e10) {
                c5595n4.m14187G().m14220c("Error querying for table", str, e10);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }
}

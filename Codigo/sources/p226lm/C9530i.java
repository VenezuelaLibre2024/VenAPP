package p226lm;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9322n;
import vn.hunghd.flutterdownloader.C11988b;

/* renamed from: lm.i */
/* loaded from: classes3.dex */
public final class C9530i {

    /* renamed from: a */
    private final C11988b f23162a;

    /* renamed from: b */
    private final String[] f23163b;

    public C9530i(C11988b dbHelper) {
        C9322n.m27781e(dbHelper, "dbHelper");
        this.f23162a = dbHelper;
        this.f23163b = new String[]{"_id", "task_id", "progress", "status", "url", "file_name", "saved_dir", "headers", "mime_type", "resumable", "open_file_from_notification", "show_notification", "time_created", "save_in_public_storage", "allow_cellular"};
    }

    /* renamed from: f */
    private final C9523b m28348f(Cursor cursor) {
        int i10 = cursor.getInt(cursor.getColumnIndexOrThrow("_id"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("task_id"));
        int i11 = cursor.getInt(cursor.getColumnIndexOrThrow("status"));
        int i12 = cursor.getInt(cursor.getColumnIndexOrThrow("progress"));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("url"));
        String string3 = cursor.getString(cursor.getColumnIndexOrThrow("file_name"));
        String string4 = cursor.getString(cursor.getColumnIndexOrThrow("saved_dir"));
        String string5 = cursor.getString(cursor.getColumnIndexOrThrow("headers"));
        String string6 = cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
        short s10 = cursor.getShort(cursor.getColumnIndexOrThrow("resumable"));
        short s11 = cursor.getShort(cursor.getColumnIndexOrThrow("show_notification"));
        short s12 = cursor.getShort(cursor.getColumnIndexOrThrow("open_file_from_notification"));
        long j10 = cursor.getLong(cursor.getColumnIndexOrThrow("time_created"));
        short s13 = cursor.getShort(cursor.getColumnIndexOrThrow("save_in_public_storage"));
        short s14 = cursor.getShort(cursor.getColumnIndexOrThrow("allow_cellular"));
        C9322n.m27778b(string);
        EnumC9522a enumC9522a = EnumC9522a.values()[i11];
        C9322n.m27778b(string2);
        C9322n.m27778b(string4);
        C9322n.m27778b(string5);
        C9322n.m27778b(string6);
        return new C9523b(i10, string, enumC9522a, i12, string2, string3, string4, string5, string6, s10 == 1, s11 == 1, s12 == 1, j10, s13 == 1, s14 == 1);
    }

    /* renamed from: a */
    public final void m28349a(String taskId) {
        C9322n.m27781e(taskId, "taskId");
        SQLiteDatabase writableDatabase = this.f23162a.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            try {
                writableDatabase.delete("task", "task_id = ?", new String[]{taskId});
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }

    /* renamed from: b */
    public final void m28350b(String str, String str2, EnumC9522a status, int i10, String str3, String str4, String str5, boolean z10, boolean z11, boolean z12, boolean z13) {
        C9322n.m27781e(status, "status");
        SQLiteDatabase writableDatabase = this.f23162a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("task_id", str);
        contentValues.put("url", str2);
        contentValues.put("status", Integer.valueOf(status.ordinal()));
        contentValues.put("progress", Integer.valueOf(i10));
        contentValues.put("file_name", str3);
        contentValues.put("saved_dir", str4);
        contentValues.put("headers", str5);
        contentValues.put("mime_type", "unknown");
        contentValues.put("show_notification", Integer.valueOf(z10 ? 1 : 0));
        contentValues.put("open_file_from_notification", Integer.valueOf(z11 ? 1 : 0));
        contentValues.put("resumable", (Integer) 0);
        contentValues.put("time_created", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("save_in_public_storage", Integer.valueOf(z12 ? 1 : 0));
        contentValues.put("allow_cellular", Integer.valueOf(z13 ? 1 : 0));
        writableDatabase.beginTransaction();
        try {
            try {
                writableDatabase.insertWithOnConflict("task", null, contentValues, 5);
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }

    /* renamed from: c */
    public final List<C9523b> m28351c() {
        Cursor query = this.f23162a.getReadableDatabase().query("task", this.f23163b, null, null, null, null, null);
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            C9322n.m27778b(query);
            arrayList.add(m28348f(query));
        }
        query.close();
        return arrayList;
    }

    /* renamed from: d */
    public final C9523b m28352d(String taskId) {
        C9322n.m27781e(taskId, "taskId");
        Cursor query = this.f23162a.getReadableDatabase().query("task", this.f23163b, "task_id = ?", new String[]{taskId}, null, null, "_id DESC", "1");
        C9523b c9523b = null;
        while (query.moveToNext()) {
            C9322n.m27778b(query);
            c9523b = m28348f(query);
        }
        query.close();
        return c9523b;
    }

    /* renamed from: e */
    public final List<C9523b> m28353e(String str) {
        Cursor rawQuery = this.f23162a.getReadableDatabase().rawQuery(str, null);
        ArrayList arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            C9322n.m27778b(rawQuery);
            arrayList.add(m28348f(rawQuery));
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: g */
    public final void m28354g(String taskId, String str, String str2) {
        C9322n.m27781e(taskId, "taskId");
        SQLiteDatabase writableDatabase = this.f23162a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("file_name", str);
        contentValues.put("mime_type", str2);
        writableDatabase.beginTransaction();
        try {
            try {
                writableDatabase.update("task", contentValues, "task_id = ?", new String[]{taskId});
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }

    /* renamed from: h */
    public final void m28355h(String currentTaskId, String str, EnumC9522a status, int i10, boolean z10) {
        C9322n.m27781e(currentTaskId, "currentTaskId");
        C9322n.m27781e(status, "status");
        SQLiteDatabase writableDatabase = this.f23162a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("task_id", str);
        contentValues.put("status", Integer.valueOf(status.ordinal()));
        contentValues.put("progress", Integer.valueOf(i10));
        contentValues.put("resumable", Integer.valueOf(z10 ? 1 : 0));
        contentValues.put("time_created", Long.valueOf(System.currentTimeMillis()));
        writableDatabase.beginTransaction();
        try {
            try {
                writableDatabase.update("task", contentValues, "task_id = ?", new String[]{currentTaskId});
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }

    /* renamed from: i */
    public final void m28356i(String taskId, EnumC9522a status, int i10) {
        C9322n.m27781e(taskId, "taskId");
        C9322n.m27781e(status, "status");
        SQLiteDatabase writableDatabase = this.f23162a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(status.ordinal()));
        contentValues.put("progress", Integer.valueOf(i10));
        writableDatabase.beginTransaction();
        try {
            try {
                writableDatabase.update("task", contentValues, "task_id = ?", new String[]{taskId});
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }

    /* renamed from: j */
    public final void m28357j(String taskId, boolean z10) {
        C9322n.m27781e(taskId, "taskId");
        SQLiteDatabase writableDatabase = this.f23162a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("resumable", Integer.valueOf(z10 ? 1 : 0));
        writableDatabase.beginTransaction();
        try {
            try {
                writableDatabase.update("task", contentValues, "task_id = ?", new String[]{taskId});
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }
}

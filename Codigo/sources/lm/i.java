package lm;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final vn.hunghd.flutterdownloader.b f21309a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f21310b;

    public i(vn.hunghd.flutterdownloader.b dbHelper) {
        n.e(dbHelper, "dbHelper");
        this.f21309a = dbHelper;
        this.f21310b = new String[]{"_id", "task_id", "progress", "status", "url", "file_name", "saved_dir", "headers", "mime_type", "resumable", "open_file_from_notification", "show_notification", "time_created", "save_in_public_storage", "allow_cellular"};
    }

    private final b f(Cursor cursor) {
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
        n.b(string);
        a aVar = a.values()[i11];
        n.b(string2);
        n.b(string4);
        n.b(string5);
        n.b(string6);
        return new b(i10, string, aVar, i12, string2, string3, string4, string5, string6, s10 == 1, s11 == 1, s12 == 1, j10, s13 == 1, s14 == 1);
    }

    public final void a(String taskId) {
        n.e(taskId, "taskId");
        SQLiteDatabase writableDatabase = this.f21309a.getWritableDatabase();
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

    public final void b(String str, String str2, a status, int i10, String str3, String str4, String str5, boolean z10, boolean z11, boolean z12, boolean z13) {
        n.e(status, "status");
        SQLiteDatabase writableDatabase = this.f21309a.getWritableDatabase();
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

    public final List<b> c() {
        Cursor query = this.f21309a.getReadableDatabase().query("task", this.f21310b, null, null, null, null, null);
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            n.b(query);
            arrayList.add(f(query));
        }
        query.close();
        return arrayList;
    }

    public final b d(String taskId) {
        n.e(taskId, "taskId");
        Cursor query = this.f21309a.getReadableDatabase().query("task", this.f21310b, "task_id = ?", new String[]{taskId}, null, null, "_id DESC", "1");
        b bVar = null;
        while (query.moveToNext()) {
            n.b(query);
            bVar = f(query);
        }
        query.close();
        return bVar;
    }

    public final List<b> e(String str) {
        Cursor rawQuery = this.f21309a.getReadableDatabase().rawQuery(str, null);
        ArrayList arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            n.b(rawQuery);
            arrayList.add(f(rawQuery));
        }
        rawQuery.close();
        return arrayList;
    }

    public final void g(String taskId, String str, String str2) {
        n.e(taskId, "taskId");
        SQLiteDatabase writableDatabase = this.f21309a.getWritableDatabase();
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

    public final void h(String currentTaskId, String str, a status, int i10, boolean z10) {
        n.e(currentTaskId, "currentTaskId");
        n.e(status, "status");
        SQLiteDatabase writableDatabase = this.f21309a.getWritableDatabase();
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

    public final void i(String taskId, a status, int i10) {
        n.e(taskId, "taskId");
        n.e(status, "status");
        SQLiteDatabase writableDatabase = this.f21309a.getWritableDatabase();
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

    public final void j(String taskId, boolean z10) {
        n.e(taskId, "taskId");
        SQLiteDatabase writableDatabase = this.f21309a.getWritableDatabase();
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

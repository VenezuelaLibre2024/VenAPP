package p391v1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.CancellationSignal;
import java.io.File;
import kotlin.jvm.internal.C9322n;

/* renamed from: v1.b */
/* loaded from: classes.dex */
public final class C11603b {

    /* renamed from: a */
    public static final C11603b f30182a = new C11603b();

    private C11603b() {
    }

    /* renamed from: a */
    public static final boolean m36377a(File file) {
        C9322n.m27781e(file, "file");
        return SQLiteDatabase.deleteDatabase(file);
    }

    /* renamed from: b */
    public static final boolean m36378b(SQLiteDatabase sQLiteDatabase) {
        C9322n.m27781e(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    /* renamed from: c */
    public static final Cursor m36379c(SQLiteDatabase sQLiteDatabase, String sql, String[] selectionArgs, String str, CancellationSignal cancellationSignal, SQLiteDatabase.CursorFactory cursorFactory) {
        C9322n.m27781e(sQLiteDatabase, "sQLiteDatabase");
        C9322n.m27781e(sql, "sql");
        C9322n.m27781e(selectionArgs, "selectionArgs");
        C9322n.m27781e(cancellationSignal, "cancellationSignal");
        C9322n.m27781e(cursorFactory, "cursorFactory");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, selectionArgs, str, cancellationSignal);
        C9322n.m27780d(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    /* renamed from: d */
    public static final void m36380d(SQLiteOpenHelper sQLiteOpenHelper, boolean z10) {
        C9322n.m27781e(sQLiteOpenHelper, "sQLiteOpenHelper");
        sQLiteOpenHelper.setWriteAheadLoggingEnabled(z10);
    }
}

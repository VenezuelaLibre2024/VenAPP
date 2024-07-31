package vn.hunghd.flutterdownloader;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: vn.hunghd.flutterdownloader.b */
/* loaded from: classes3.dex */
public final class C11988b extends SQLiteOpenHelper {

    /* renamed from: a */
    public static final a f31884a = new a(null);

    /* renamed from: b */
    private static C11988b f31885b;

    /* renamed from: vn.hunghd.flutterdownloader.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C11988b m38569a(Context context) {
            if (C11988b.f31885b == null) {
                C9322n.m27778b(context);
                Context applicationContext = context.getApplicationContext();
                C9322n.m27780d(applicationContext, "getApplicationContext(...)");
                C11988b.f31885b = new C11988b(applicationContext, null);
            }
            C11988b c11988b = C11988b.f31885b;
            C9322n.m27778b(c11988b);
            return c11988b;
        }
    }

    private C11988b(Context context) {
        super(context, "download_tasks.db", (SQLiteDatabase.CursorFactory) null, 4);
    }

    public /* synthetic */ C11988b(Context context, C9315g c9315g) {
        this(context);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db2) {
        C9322n.m27781e(db2, "db");
        db2.execSQL("CREATE TABLE task (_id INTEGER PRIMARY KEY,task_id VARCHAR(256), url TEXT, status INTEGER DEFAULT 0, progress INTEGER DEFAULT 0, file_name TEXT, saved_dir TEXT, headers TEXT, mime_type VARCHAR(128), resumable TINYINT DEFAULT 0, show_notification TINYINT DEFAULT 0, open_file_from_notification TINYINT DEFAULT 0, time_created INTEGER DEFAULT 0, save_in_public_storage TINYINT DEFAULT 0, allow_cellular TINYINT DEFAULT 1)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase db2, int i10, int i11) {
        C9322n.m27781e(db2, "db");
        onUpgrade(db2, i10, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase db2, int i10, int i11) {
        String str;
        C9322n.m27781e(db2, "db");
        if (i11 == 4) {
            str = "ALTER TABLE task ADD COLUMN allow_cellular TINYINT DEFAULT 1";
        } else {
            if (i10 != 2 || i11 != 3) {
                db2.execSQL("DROP TABLE IF EXISTS task");
                onCreate(db2);
                return;
            }
            str = "ALTER TABLE task ADD COLUMN save_in_public_storage TINYINT DEFAULT 0";
        }
        db2.execSQL(str);
    }
}

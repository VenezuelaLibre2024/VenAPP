package vn.hunghd.flutterdownloader;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class b extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final a f29429a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static b f29430b;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final b a(Context context) {
            if (b.f29430b == null) {
                n.b(context);
                Context applicationContext = context.getApplicationContext();
                n.d(applicationContext, "getApplicationContext(...)");
                b.f29430b = new b(applicationContext, null);
            }
            b bVar = b.f29430b;
            n.b(bVar);
            return bVar;
        }
    }

    private b(Context context) {
        super(context, "download_tasks.db", (SQLiteDatabase.CursorFactory) null, 4);
    }

    public /* synthetic */ b(Context context, g gVar) {
        this(context);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db2) {
        n.e(db2, "db");
        db2.execSQL("CREATE TABLE task (_id INTEGER PRIMARY KEY,task_id VARCHAR(256), url TEXT, status INTEGER DEFAULT 0, progress INTEGER DEFAULT 0, file_name TEXT, saved_dir TEXT, headers TEXT, mime_type VARCHAR(128), resumable TINYINT DEFAULT 0, show_notification TINYINT DEFAULT 0, open_file_from_notification TINYINT DEFAULT 0, time_created INTEGER DEFAULT 0, save_in_public_storage TINYINT DEFAULT 0, allow_cellular TINYINT DEFAULT 1)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase db2, int i10, int i11) {
        n.e(db2, "db");
        onUpgrade(db2, i10, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase db2, int i10, int i11) {
        String str;
        n.e(db2, "db");
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

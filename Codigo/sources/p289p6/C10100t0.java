package p289p6;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p6.t0 */
/* loaded from: classes.dex */
public final class C10100t0 extends SQLiteOpenHelper {

    /* renamed from: c */
    private static final String f24769c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: d */
    static int f24770d = 5;

    /* renamed from: e */
    private static final a f24771e;

    /* renamed from: f */
    private static final a f24772f;

    /* renamed from: r */
    private static final a f24773r;

    /* renamed from: s */
    private static final a f24774s;

    /* renamed from: t */
    private static final a f24775t;

    /* renamed from: u */
    private static final List<a> f24776u;

    /* renamed from: a */
    private final int f24777a;

    /* renamed from: b */
    private boolean f24778b;

    /* renamed from: p6.t0$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo30130a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: p6.o0
            @Override // p289p6.C10100t0.a
            /* renamed from: a */
            public final void mo30130a(SQLiteDatabase sQLiteDatabase) {
                C10100t0.m30137j(sQLiteDatabase);
            }
        };
        f24771e = aVar;
        a aVar2 = new a() { // from class: p6.p0
            @Override // p289p6.C10100t0.a
            /* renamed from: a */
            public final void mo30130a(SQLiteDatabase sQLiteDatabase) {
                C10100t0.m30138l(sQLiteDatabase);
            }
        };
        f24772f = aVar2;
        a aVar3 = new a() { // from class: p6.q0
            @Override // p289p6.C10100t0.a
            /* renamed from: a */
            public final void mo30130a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f24773r = aVar3;
        a aVar4 = new a() { // from class: p6.r0
            @Override // p289p6.C10100t0.a
            /* renamed from: a */
            public final void mo30130a(SQLiteDatabase sQLiteDatabase) {
                C10100t0.m30140o(sQLiteDatabase);
            }
        };
        f24774s = aVar4;
        a aVar5 = new a() { // from class: p6.s0
            @Override // p289p6.C10100t0.a
            /* renamed from: a */
            public final void mo30130a(SQLiteDatabase sQLiteDatabase) {
                C10100t0.m30141q(sQLiteDatabase);
            }
        };
        f24775t = aVar5;
        f24776u = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10100t0(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f24778b = false;
        this.f24777a = i10;
    }

    /* renamed from: i */
    private void m30136i(SQLiteDatabase sQLiteDatabase) {
        if (this.f24778b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m30137j(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ void m30138l(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ void m30140o(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ void m30141q(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f24769c);
    }

    /* renamed from: r */
    private void m30142r(SQLiteDatabase sQLiteDatabase, int i10) {
        m30136i(sQLiteDatabase);
        m30143y(sQLiteDatabase, 0, i10);
    }

    /* renamed from: y */
    private void m30143y(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<a> list = f24776u;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                f24776u.get(i10).mo30130a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f24778b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m30142r(sQLiteDatabase, this.f24777a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        m30142r(sQLiteDatabase, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m30136i(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        m30136i(sQLiteDatabase);
        m30143y(sQLiteDatabase, i10, i11);
    }
}

package p6;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import h6.i;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k6.a;
import k6.c;
import q6.b;

/* loaded from: classes.dex */
public class m0 implements p6.d, q6.b, p6.c {

    /* renamed from: f, reason: collision with root package name */
    private static final f6.b f22813f = f6.b.b("proto");

    /* renamed from: a, reason: collision with root package name */
    private final t0 f22814a;

    /* renamed from: b, reason: collision with root package name */
    private final r6.a f22815b;

    /* renamed from: c, reason: collision with root package name */
    private final r6.a f22816c;

    /* renamed from: d, reason: collision with root package name */
    private final e f22817d;

    /* renamed from: e, reason: collision with root package name */
    private final bk.a<String> f22818e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b<T, U> {
        U apply(T t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final String f22819a;

        /* renamed from: b, reason: collision with root package name */
        final String f22820b;

        private c(String str, String str2) {
            this.f22819a = str;
            this.f22820b = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface d<T> {
        T a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(r6.a aVar, r6.a aVar2, e eVar, t0 t0Var, bk.a<String> aVar3) {
        this.f22814a = t0Var;
        this.f22815b = aVar;
        this.f22816c = aVar2;
        this.f22817d = eVar;
        this.f22818e = aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List A1(SQLiteDatabase sQLiteDatabase) {
        return (List) X1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: p6.k0
            @Override // p6.m0.b
            public final Object apply(Object obj) {
                List B1;
                B1 = m0.B1((Cursor) obj);
                return B1;
            }
        });
    }

    private void B0(final SQLiteDatabase sQLiteDatabase) {
        U1(new d() { // from class: p6.g0
            @Override // p6.m0.d
            public final Object a() {
                Object j12;
                j12 = m0.j1(sQLiteDatabase);
                return j12;
            }
        }, new b() { // from class: p6.h0
            @Override // p6.m0.b
            public final Object apply(Object obj) {
                Object q12;
                q12 = m0.q1((Throwable) obj);
                return q12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List B1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(h6.p.a().b(cursor.getString(1)).d(s6.a.b(cursor.getInt(2))).c(R1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List C1(h6.p pVar, SQLiteDatabase sQLiteDatabase) {
        List<k> P1 = P1(sQLiteDatabase, pVar, this.f22817d.d());
        for (f6.d dVar : f6.d.values()) {
            if (dVar != pVar.d()) {
                int d10 = this.f22817d.d() - P1.size();
                if (d10 <= 0) {
                    break;
                }
                P1.addAll(P1(sQLiteDatabase, pVar.f(dVar), d10));
            }
        }
        return a1(P1, Q1(sQLiteDatabase, P1));
    }

    private long D0(SQLiteDatabase sQLiteDatabase, h6.p pVar) {
        Long T0 = T0(sQLiteDatabase, pVar);
        if (T0 != null) {
            return T0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", pVar.b());
        contentValues.put("priority", Integer.valueOf(s6.a.a(pVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (pVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(pVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ k6.a D1(Map map, a.C0320a c0320a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b z02 = z0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(k6.c.c().c(z02).b(j10).a());
        }
        S1(c0320a, map);
        c0320a.e(R0());
        c0320a.d(I0());
        c0320a.c(this.f22818e.get());
        return c0320a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ k6.a E1(String str, final Map map, final a.C0320a c0320a, SQLiteDatabase sQLiteDatabase) {
        return (k6.a) X1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: p6.b0
            @Override // p6.m0.b
            public final Object apply(Object obj) {
                k6.a D1;
                D1 = m0.this.D1(map, c0320a, (Cursor) obj);
                return D1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object F1(List list, h6.p pVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            i.a k10 = h6.i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            k10.h(z10 ? new h6.h(V1(cursor.getString(4)), cursor.getBlob(5)) : new h6.h(V1(cursor.getString(4)), T1(j10)));
            if (!cursor.isNull(6)) {
                k10.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(k.a(j10, pVar, k10.d()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object G1(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j10 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j10));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j10), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long H1(h6.i iVar, h6.p pVar, SQLiteDatabase sQLiteDatabase) {
        if (Y0()) {
            f(1L, c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long D0 = D0(sQLiteDatabase, pVar);
        int e10 = this.f22817d.e();
        byte[] a10 = iVar.e().a();
        boolean z10 = a10.length <= e10;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(D0));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? a10 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int ceil = (int) Math.ceil(a10.length / e10);
            for (int i10 = 1; i10 <= ceil; i10++) {
                byte[] copyOfRange = Arrays.copyOfRange(a10, (i10 - 1) * e10, Math.min(i10 * e10, a10.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    private k6.b I0() {
        return k6.b.b().b(k6.e.c().b(F0()).c(e.f22797a.f()).a()).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] I1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i10 += blob.length;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            byte[] bArr2 = (byte[]) arrayList.get(i12);
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            i11 += bArr2.length;
        }
        return bArr;
    }

    private long J0() {
        return H0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object J1(Cursor cursor) {
        while (cursor.moveToNext()) {
            f(cursor.getInt(0), c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object K1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        X1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: p6.x
            @Override // p6.m0.b
            public final Object apply(Object obj) {
                Object J1;
                J1 = m0.this.J1((Cursor) obj);
                return J1;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    private long L0() {
        return H0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean L1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object M1(String str, c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) X1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.a())}), new b() { // from class: p6.v
            @Override // p6.m0.b
            public final Object apply(Object obj) {
                Boolean L1;
                L1 = m0.L1((Cursor) obj);
                return L1;
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.a())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put(Constants.REASON, Integer.valueOf(bVar.a()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object N1(long j10, h6.p pVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(s6.a.a(pVar.d()))}) < 1) {
            contentValues.put("backend_name", pVar.b());
            contentValues.put("priority", Integer.valueOf(s6.a.a(pVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object O1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f22815b.a()).execute();
        return null;
    }

    private List<k> P1(SQLiteDatabase sQLiteDatabase, final h6.p pVar, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long T0 = T0(sQLiteDatabase, pVar);
        if (T0 == null) {
            return arrayList;
        }
        X1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{T0.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: p6.y
            @Override // p6.m0.b
            public final Object apply(Object obj) {
                Object F1;
                F1 = m0.this.F1(arrayList, pVar, (Cursor) obj);
                return F1;
            }
        });
        return arrayList;
    }

    private Map<Long, Set<c>> Q1(SQLiteDatabase sQLiteDatabase, List<k> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        X1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new b() { // from class: p6.t
            @Override // p6.m0.b
            public final Object apply(Object obj) {
                Object G1;
                G1 = m0.G1(hashMap, (Cursor) obj);
                return G1;
            }
        });
        return hashMap;
    }

    private k6.f R0() {
        final long a10 = this.f22815b.a();
        return (k6.f) W0(new b() { // from class: p6.c0
            @Override // p6.m0.b
            public final Object apply(Object obj) {
                k6.f x12;
                x12 = m0.x1(a10, (SQLiteDatabase) obj);
                return x12;
            }
        });
    }

    private static byte[] R1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void S1(a.C0320a c0320a, Map<String, List<k6.c>> map) {
        for (Map.Entry<String, List<k6.c>> entry : map.entrySet()) {
            c0320a.a(k6.d.c().c(entry.getKey()).b(entry.getValue()).a());
        }
    }

    private Long T0(SQLiteDatabase sQLiteDatabase, h6.p pVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(pVar.b(), String.valueOf(s6.a.a(pVar.d()))));
        if (pVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) X1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: p6.s
            @Override // p6.m0.b
            public final Object apply(Object obj) {
                Long y12;
                y12 = m0.y1((Cursor) obj);
                return y12;
            }
        });
    }

    private byte[] T1(long j10) {
        return (byte[]) X1(H0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: p6.a0
            @Override // p6.m0.b
            public final Object apply(Object obj) {
                byte[] I1;
                I1 = m0.I1((Cursor) obj);
                return I1;
            }
        });
    }

    private <T> T U1(d<T> dVar, b<Throwable, T> bVar) {
        long a10 = this.f22816c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f22816c.a() >= this.f22817d.b() + a10) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static f6.b V1(String str) {
        return str == null ? f22813f : f6.b.b(str);
    }

    private static String W1(Iterable<k> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<k> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    static <T> T X1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private boolean Y0() {
        return J0() * L0() >= this.f22817d.f();
    }

    private List<k> a1(List<k> list, Map<Long, Set<c>> map) {
        ListIterator<k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                i.a l10 = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    l10.c(cVar.f22819a, cVar.f22820b);
                }
                listIterator.set(k.a(next.c(), next.d(), l10.d()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object b1(Cursor cursor) {
        while (cursor.moveToNext()) {
            f(cursor.getInt(0), c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer c1(long j10, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j10)};
        X1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: p6.r
            @Override // p6.m0.b
            public final Object apply(Object obj) {
                Object b12;
                b12 = m0.this.b1((Cursor) obj);
                return b12;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object j1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object q1(Throwable th2) {
        throw new q6.a("Timed out while trying to acquire the lock.", th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase u1(Throwable th2) {
        throw new q6.a("Timed out while trying to open db.", th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long v1(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k6.f w1(long j10, Cursor cursor) {
        cursor.moveToNext();
        return k6.f.c().c(cursor.getLong(0)).b(j10).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k6.f x1(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (k6.f) X1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: p6.d0
            @Override // p6.m0.b
            public final Object apply(Object obj) {
                k6.f w12;
                w12 = m0.w1(j10, (Cursor) obj);
                return w12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long y1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    private c.b z0(int i10) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i10 == bVar.a()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.a()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i10 == bVar3.a()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.a()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.a()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i10 == bVar6.a()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i10 == bVar7.a()) {
            return bVar7;
        }
        l6.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean z1(h6.p pVar, SQLiteDatabase sQLiteDatabase) {
        Long T0 = T0(sQLiteDatabase, pVar);
        return T0 == null ? Boolean.FALSE : (Boolean) X1(H0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{T0.toString()}), new b() { // from class: p6.z
            @Override // p6.m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    long F0() {
        return J0() * L0();
    }

    SQLiteDatabase H0() {
        final t0 t0Var = this.f22814a;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) U1(new d() { // from class: p6.w
            @Override // p6.m0.d
            public final Object a() {
                return t0.this.getWritableDatabase();
            }
        }, new b() { // from class: p6.e0
            @Override // p6.m0.b
            public final Object apply(Object obj) {
                SQLiteDatabase u12;
                u12 = m0.u1((Throwable) obj);
                return u12;
            }
        });
    }

    @Override // p6.d
    public Iterable<h6.p> J() {
        return (Iterable) W0(new b() { // from class: p6.l
            @Override // p6.m0.b
            public final Object apply(Object obj) {
                List A1;
                A1 = m0.A1((SQLiteDatabase) obj);
                return A1;
            }
        });
    }

    @Override // p6.d
    public Iterable<k> K(final h6.p pVar) {
        return (Iterable) W0(new b() { // from class: p6.p
            @Override // p6.m0.b
            public final Object apply(Object obj) {
                List C1;
                C1 = m0.this.C1(pVar, (SQLiteDatabase) obj);
                return C1;
            }
        });
    }

    @Override // p6.d
    public k V(final h6.p pVar, final h6.i iVar) {
        l6.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.d(), iVar.j(), pVar.b());
        long longValue = ((Long) W0(new b() { // from class: p6.i0
            @Override // p6.m0.b
            public final Object apply(Object obj) {
                Long H1;
                H1 = m0.this.H1(iVar, pVar, (SQLiteDatabase) obj);
                return H1;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return k.a(longValue, pVar, iVar);
    }

    <T> T W0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase H0 = H0();
        H0.beginTransaction();
        try {
            T apply = bVar.apply(H0);
            H0.setTransactionSuccessful();
            return apply;
        } finally {
            H0.endTransaction();
        }
    }

    @Override // p6.c
    public void a() {
        W0(new b() { // from class: p6.o
            @Override // p6.m0.b
            public final Object apply(Object obj) {
                Object O1;
                O1 = m0.this.O1((SQLiteDatabase) obj);
                return O1;
            }
        });
    }

    @Override // q6.b
    public <T> T b(b.a<T> aVar) {
        SQLiteDatabase H0 = H0();
        B0(H0);
        try {
            T n10 = aVar.n();
            H0.setTransactionSuccessful();
            return n10;
        } finally {
            H0.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f22814a.close();
    }

    @Override // p6.c
    public k6.a e() {
        final a.C0320a e10 = k6.a.e();
        final HashMap hashMap = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (k6.a) W0(new b() { // from class: p6.u
            @Override // p6.m0.b
            public final Object apply(Object obj) {
                k6.a E1;
                E1 = m0.this.E1(str, hashMap, e10, (SQLiteDatabase) obj);
                return E1;
            }
        });
    }

    @Override // p6.c
    public void f(final long j10, final c.b bVar, final String str) {
        W0(new b() { // from class: p6.m
            @Override // p6.m0.b
            public final Object apply(Object obj) {
                Object M1;
                M1 = m0.M1(str, bVar, j10, (SQLiteDatabase) obj);
                return M1;
            }
        });
    }

    @Override // p6.d
    public void f1(final h6.p pVar, final long j10) {
        W0(new b() { // from class: p6.n
            @Override // p6.m0.b
            public final Object apply(Object obj) {
                Object N1;
                N1 = m0.N1(j10, pVar, (SQLiteDatabase) obj);
                return N1;
            }
        });
    }

    @Override // p6.d
    public boolean k0(final h6.p pVar) {
        return ((Boolean) W0(new b() { // from class: p6.l0
            @Override // p6.m0.b
            public final Object apply(Object obj) {
                Boolean z12;
                z12 = m0.this.z1(pVar, (SQLiteDatabase) obj);
                return z12;
            }
        })).booleanValue();
    }

    @Override // p6.d
    public long n0(h6.p pVar) {
        return ((Long) X1(H0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(s6.a.a(pVar.d()))}), new b() { // from class: p6.f0
            @Override // p6.m0.b
            public final Object apply(Object obj) {
                Long v12;
                v12 = m0.v1((Cursor) obj);
                return v12;
            }
        })).longValue();
    }

    @Override // p6.d
    public void o0(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + W1(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            W0(new b() { // from class: p6.q
                @Override // p6.m0.b
                public final Object apply(Object obj) {
                    Object K1;
                    K1 = m0.this.K1(str, str2, (SQLiteDatabase) obj);
                    return K1;
                }
            });
        }
    }

    @Override // p6.d
    public int u() {
        final long a10 = this.f22815b.a() - this.f22817d.c();
        return ((Integer) W0(new b() { // from class: p6.j0
            @Override // p6.m0.b
            public final Object apply(Object obj) {
                Integer c12;
                c12 = m0.this.c1(a10, (SQLiteDatabase) obj);
                return c12;
            }
        })).intValue();
    }

    @Override // p6.d
    public void v(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            H0().compileStatement("DELETE FROM events WHERE _id in " + W1(iterable)).execute();
        }
    }
}

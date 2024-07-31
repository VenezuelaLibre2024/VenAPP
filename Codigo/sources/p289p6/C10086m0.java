package p289p6;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
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
import p029bk.InterfaceC1806a;
import p098f6.C7298b;
import p098f6.EnumC7300d;
import p132h6.AbstractC7639i;
import p132h6.AbstractC7646p;
import p132h6.C7638h;
import p196k6.C9169a;
import p196k6.C9170b;
import p196k6.C9171c;
import p196k6.C9172d;
import p196k6.C9173e;
import p196k6.C9174f;
import p215l6.C9399a;
import p305q6.C10277a;
import p305q6.InterfaceC10278b;
import p327r6.InterfaceC10625a;
import p349s6.C10801a;

/* renamed from: p6.m0 */
/* loaded from: classes.dex */
public class C10086m0 implements InterfaceC10067d, InterfaceC10278b, InterfaceC10065c {

    /* renamed from: f */
    private static final C7298b f24746f = C7298b.m21878b("proto");

    /* renamed from: a */
    private final C10100t0 f24747a;

    /* renamed from: b */
    private final InterfaceC10625a f24748b;

    /* renamed from: c */
    private final InterfaceC10625a f24749c;

    /* renamed from: d */
    private final AbstractC10069e f24750d;

    /* renamed from: e */
    private final InterfaceC1806a<String> f24751e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p6.m0$b */
    /* loaded from: classes.dex */
    public interface b<T, U> {
        U apply(T t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p6.m0$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        final String f24752a;

        /* renamed from: b */
        final String f24753b;

        private c(String str, String str2) {
            this.f24752a = str;
            this.f24753b = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p6.m0$d */
    /* loaded from: classes.dex */
    public interface d<T> {
        /* renamed from: a */
        T mo30041a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10086m0(InterfaceC10625a interfaceC10625a, InterfaceC10625a interfaceC10625a2, AbstractC10069e abstractC10069e, C10100t0 c10100t0, InterfaceC1806a<String> interfaceC1806a) {
        this.f24747a = c10100t0;
        this.f24748b = interfaceC10625a;
        this.f24749c = interfaceC10625a2;
        this.f24750d = abstractC10069e;
        this.f24751e = interfaceC1806a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A1 */
    public static /* synthetic */ List m30054A1(SQLiteDatabase sQLiteDatabase) {
        return (List) m30093X1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: p6.k0
            @Override // p289p6.C10086m0.b
            public final Object apply(Object obj) {
                List m30057B1;
                m30057B1 = C10086m0.m30057B1((Cursor) obj);
                return m30057B1;
            }
        });
    }

    /* renamed from: B0 */
    private void m30056B0(final SQLiteDatabase sQLiteDatabase) {
        m30090U1(new d() { // from class: p6.g0
            @Override // p289p6.C10086m0.d
            /* renamed from: a */
            public final Object mo30041a() {
                Object m30106j1;
                m30106j1 = C10086m0.m30106j1(sQLiteDatabase);
                return m30106j1;
            }
        }, new b() { // from class: p6.h0
            @Override // p289p6.C10086m0.b
            public final Object apply(Object obj) {
                Object m30112q1;
                m30112q1 = C10086m0.m30112q1((Throwable) obj);
                return m30112q1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B1 */
    public static /* synthetic */ List m30057B1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(AbstractC7646p.m23225a().mo23195b(cursor.getString(1)).mo23197d(C10801a.m32913b(cursor.getInt(2))).mo23196c(m30084R1(cursor.getString(3))).mo23194a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C1 */
    public /* synthetic */ List m30058C1(AbstractC7646p abstractC7646p, SQLiteDatabase sQLiteDatabase) {
        List<AbstractC10081k> m30079P1 = m30079P1(sQLiteDatabase, abstractC7646p, this.f24750d.mo30008d());
        for (EnumC7300d enumC7300d : EnumC7300d.values()) {
            if (enumC7300d != abstractC7646p.mo23193d()) {
                int mo30008d = this.f24750d.mo30008d() - m30079P1.size();
                if (mo30008d <= 0) {
                    break;
                }
                m30079P1.addAll(m30079P1(sQLiteDatabase, abstractC7646p.m23227f(enumC7300d), mo30008d));
            }
        }
        return m30096a1(m30079P1, m30081Q1(sQLiteDatabase, m30079P1));
    }

    /* renamed from: D0 */
    private long m30059D0(SQLiteDatabase sQLiteDatabase, AbstractC7646p abstractC7646p) {
        Long m30087T0 = m30087T0(sQLiteDatabase, abstractC7646p);
        if (m30087T0 != null) {
            return m30087T0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", abstractC7646p.mo23191b());
        contentValues.put("priority", Integer.valueOf(C10801a.m32912a(abstractC7646p.mo23193d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (abstractC7646p.mo23192c() != null) {
            contentValues.put("extras", Base64.encodeToString(abstractC7646p.mo23192c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D1 */
    public /* synthetic */ C9169a m30060D1(Map map, C9169a.a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C9171c.b m30121z0 = m30121z0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C9171c.m27099c().m27104c(m30121z0).m27103b(j10).m27102a());
        }
        m30086S1(aVar, map);
        aVar.m27094e(m30083R0());
        aVar.m27093d(m30068I0());
        aVar.m27092c(this.f24751e.get());
        return aVar.m27091b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E1 */
    public /* synthetic */ C9169a m30062E1(String str, final Map map, final C9169a.a aVar, SQLiteDatabase sQLiteDatabase) {
        return (C9169a) m30093X1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: p6.b0
            @Override // p289p6.C10086m0.b
            public final Object apply(Object obj) {
                C9169a m30060D1;
                m30060D1 = C10086m0.this.m30060D1(map, aVar, (Cursor) obj);
                return m30060D1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F1 */
    public /* synthetic */ Object m30063F1(List list, AbstractC7646p abstractC7646p, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            AbstractC7639i.a mo23179k = AbstractC7639i.m23206a().mo23178j(cursor.getString(1)).mo23177i(cursor.getLong(2)).mo23179k(cursor.getLong(3));
            mo23179k.mo23176h(z10 ? new C7638h(m30091V1(cursor.getString(4)), cursor.getBlob(5)) : new C7638h(m30091V1(cursor.getString(4)), m30088T1(j10)));
            if (!cursor.isNull(6)) {
                mo23179k.mo23175g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC10081k.m30053a(j10, abstractC7646p, mo23179k.mo23172d()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G1 */
    public static /* synthetic */ Object m30064G1(Map map, Cursor cursor) {
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
    /* renamed from: H1 */
    public /* synthetic */ Long m30066H1(AbstractC7639i abstractC7639i, AbstractC7646p abstractC7646p, SQLiteDatabase sQLiteDatabase) {
        if (m30094Y0()) {
            mo30022f(1L, C9171c.b.CACHE_FULL, abstractC7639i.mo23170j());
            return -1L;
        }
        long m30059D0 = m30059D0(sQLiteDatabase, abstractC7646p);
        int mo30009e = this.f24750d.mo30009e();
        byte[] m23204a = abstractC7639i.mo23168e().m23204a();
        boolean z10 = m23204a.length <= mo30009e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(m30059D0));
        contentValues.put("transport_name", abstractC7639i.mo23170j());
        contentValues.put("timestamp_ms", Long.valueOf(abstractC7639i.mo23169f()));
        contentValues.put("uptime_ms", Long.valueOf(abstractC7639i.mo23171k()));
        contentValues.put("payload_encoding", abstractC7639i.mo23168e().m23205b().m21879a());
        contentValues.put("code", abstractC7639i.mo23167d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? m23204a : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int ceil = (int) Math.ceil(m23204a.length / mo30009e);
            for (int i10 = 1; i10 <= ceil; i10++) {
                byte[] copyOfRange = Arrays.copyOfRange(m23204a, (i10 - 1) * mo30009e, Math.min(i10 * mo30009e, m23204a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : abstractC7639i.m23210i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* renamed from: I0 */
    private C9170b m30068I0() {
        return C9170b.m27095b().m27098b(C9173e.m27112c().m27116b(m30123F0()).m27117c(AbstractC10069e.f24730a.mo30010f()).m27115a()).m27097a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I1 */
    public static /* synthetic */ byte[] m30069I1(Cursor cursor) {
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

    /* renamed from: J0 */
    private long m30070J0() {
        return m30124H0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J1 */
    public /* synthetic */ Object m30071J1(Cursor cursor) {
        while (cursor.moveToNext()) {
            mo30022f(cursor.getInt(0), C9171c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K1 */
    public /* synthetic */ Object m30072K1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        m30093X1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: p6.x
            @Override // p289p6.C10086m0.b
            public final Object apply(Object obj) {
                Object m30071J1;
                m30071J1 = C10086m0.this.m30071J1((Cursor) obj);
                return m30071J1;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* renamed from: L0 */
    private long m30073L0() {
        return m30124H0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L1 */
    public static /* synthetic */ Boolean m30074L1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M1 */
    public static /* synthetic */ Object m30075M1(String str, C9171c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) m30093X1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo27105a())}), new b() { // from class: p6.v
            @Override // p289p6.C10086m0.b
            public final Object apply(Object obj) {
                Boolean m30074L1;
                m30074L1 = C10086m0.m30074L1((Cursor) obj);
                return m30074L1;
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo27105a())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put(Constants.REASON, Integer.valueOf(bVar.mo27105a()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N1 */
    public static /* synthetic */ Object m30076N1(long j10, AbstractC7646p abstractC7646p, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{abstractC7646p.mo23191b(), String.valueOf(C10801a.m32912a(abstractC7646p.mo23193d()))}) < 1) {
            contentValues.put("backend_name", abstractC7646p.mo23191b());
            contentValues.put("priority", Integer.valueOf(C10801a.m32912a(abstractC7646p.mo23193d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O1 */
    public /* synthetic */ Object m30078O1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f24748b.mo32385a()).execute();
        return null;
    }

    /* renamed from: P1 */
    private List<AbstractC10081k> m30079P1(SQLiteDatabase sQLiteDatabase, final AbstractC7646p abstractC7646p, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long m30087T0 = m30087T0(sQLiteDatabase, abstractC7646p);
        if (m30087T0 == null) {
            return arrayList;
        }
        m30093X1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{m30087T0.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: p6.y
            @Override // p289p6.C10086m0.b
            public final Object apply(Object obj) {
                Object m30063F1;
                m30063F1 = C10086m0.this.m30063F1(arrayList, abstractC7646p, (Cursor) obj);
                return m30063F1;
            }
        });
        return arrayList;
    }

    /* renamed from: Q1 */
    private Map<Long, Set<c>> m30081Q1(SQLiteDatabase sQLiteDatabase, List<AbstractC10081k> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).mo30018c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        m30093X1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new b() { // from class: p6.t
            @Override // p289p6.C10086m0.b
            public final Object apply(Object obj) {
                Object m30064G1;
                m30064G1 = C10086m0.m30064G1(hashMap, (Cursor) obj);
                return m30064G1;
            }
        });
        return hashMap;
    }

    /* renamed from: R0 */
    private C9174f m30083R0() {
        final long mo32385a = this.f24748b.mo32385a();
        return (C9174f) m30125W0(new b() { // from class: p6.c0
            @Override // p289p6.C10086m0.b
            public final Object apply(Object obj) {
                C9174f m30118x1;
                m30118x1 = C10086m0.m30118x1(mo32385a, (SQLiteDatabase) obj);
                return m30118x1;
            }
        });
    }

    /* renamed from: R1 */
    private static byte[] m30084R1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: S1 */
    private void m30086S1(C9169a.a aVar, Map<String, List<C9171c>> map) {
        for (Map.Entry<String, List<C9171c>> entry : map.entrySet()) {
            aVar.m27090a(C9172d.m27106c().m27111c(entry.getKey()).m27110b(entry.getValue()).m27109a());
        }
    }

    /* renamed from: T0 */
    private Long m30087T0(SQLiteDatabase sQLiteDatabase, AbstractC7646p abstractC7646p) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(abstractC7646p.mo23191b(), String.valueOf(C10801a.m32912a(abstractC7646p.mo23193d()))));
        if (abstractC7646p.mo23192c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(abstractC7646p.mo23192c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) m30093X1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: p6.s
            @Override // p289p6.C10086m0.b
            public final Object apply(Object obj) {
                Long m30120y1;
                m30120y1 = C10086m0.m30120y1((Cursor) obj);
                return m30120y1;
            }
        });
    }

    /* renamed from: T1 */
    private byte[] m30088T1(long j10) {
        return (byte[]) m30093X1(m30124H0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: p6.a0
            @Override // p289p6.C10086m0.b
            public final Object apply(Object obj) {
                byte[] m30069I1;
                m30069I1 = C10086m0.m30069I1((Cursor) obj);
                return m30069I1;
            }
        });
    }

    /* renamed from: U1 */
    private <T> T m30090U1(d<T> dVar, b<Throwable, T> bVar) {
        long mo32385a = this.f24749c.mo32385a();
        while (true) {
            try {
                return dVar.mo30041a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f24749c.mo32385a() >= this.f24750d.mo30006b() + mo32385a) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* renamed from: V1 */
    private static C7298b m30091V1(String str) {
        return str == null ? f24746f : C7298b.m21878b(str);
    }

    /* renamed from: W1 */
    private static String m30092W1(Iterable<AbstractC10081k> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<AbstractC10081k> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().mo30018c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* renamed from: X1 */
    static <T> T m30093X1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: Y0 */
    private boolean m30094Y0() {
        return m30070J0() * m30073L0() >= this.f24750d.mo30010f();
    }

    /* renamed from: a1 */
    private List<AbstractC10081k> m30096a1(List<AbstractC10081k> list, Map<Long, Set<c>> map) {
        ListIterator<AbstractC10081k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC10081k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo30018c()))) {
                AbstractC7639i.a m23211l = next.mo30017b().m23211l();
                for (c cVar : map.get(Long.valueOf(next.mo30018c()))) {
                    m23211l.m23214c(cVar.f24752a, cVar.f24753b);
                }
                listIterator.set(AbstractC10081k.m30053a(next.mo30018c(), next.mo30019d(), m23211l.mo23172d()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b1 */
    public /* synthetic */ Object m30097b1(Cursor cursor) {
        while (cursor.moveToNext()) {
            mo30022f(cursor.getInt(0), C9171c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c1 */
    public /* synthetic */ Integer m30099c1(long j10, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j10)};
        m30093X1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: p6.r
            @Override // p289p6.C10086m0.b
            public final Object apply(Object obj) {
                Object m30097b1;
                m30097b1 = C10086m0.this.m30097b1((Cursor) obj);
                return m30097b1;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j1 */
    public static /* synthetic */ Object m30106j1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q1 */
    public static /* synthetic */ Object m30112q1(Throwable th2) {
        throw new C10277a("Timed out while trying to acquire the lock.", th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u1 */
    public static /* synthetic */ SQLiteDatabase m30114u1(Throwable th2) {
        throw new C10277a("Timed out while trying to open db.", th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v1 */
    public static /* synthetic */ Long m30116v1(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1 */
    public static /* synthetic */ C9174f m30117w1(long j10, Cursor cursor) {
        cursor.moveToNext();
        return C9174f.m27118c().m27123c(cursor.getLong(0)).m27122b(j10).m27121a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x1 */
    public static /* synthetic */ C9174f m30118x1(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (C9174f) m30093X1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: p6.d0
            @Override // p289p6.C10086m0.b
            public final Object apply(Object obj) {
                C9174f m30117w1;
                m30117w1 = C10086m0.m30117w1(j10, (Cursor) obj);
                return m30117w1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y1 */
    public static /* synthetic */ Long m30120y1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* renamed from: z0 */
    private C9171c.b m30121z0(int i10) {
        C9171c.b bVar = C9171c.b.REASON_UNKNOWN;
        if (i10 == bVar.mo27105a()) {
            return bVar;
        }
        C9171c.b bVar2 = C9171c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.mo27105a()) {
            return bVar2;
        }
        C9171c.b bVar3 = C9171c.b.CACHE_FULL;
        if (i10 == bVar3.mo27105a()) {
            return bVar3;
        }
        C9171c.b bVar4 = C9171c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.mo27105a()) {
            return bVar4;
        }
        C9171c.b bVar5 = C9171c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.mo27105a()) {
            return bVar5;
        }
        C9171c.b bVar6 = C9171c.b.INVALID_PAYLOD;
        if (i10 == bVar6.mo27105a()) {
            return bVar6;
        }
        C9171c.b bVar7 = C9171c.b.SERVER_ERROR;
        if (i10 == bVar7.mo27105a()) {
            return bVar7;
        }
        C9399a.m27989b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z1 */
    public /* synthetic */ Boolean m30122z1(AbstractC7646p abstractC7646p, SQLiteDatabase sQLiteDatabase) {
        Long m30087T0 = m30087T0(sQLiteDatabase, abstractC7646p);
        return m30087T0 == null ? Boolean.FALSE : (Boolean) m30093X1(m30124H0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{m30087T0.toString()}), new b() { // from class: p6.z
            @Override // p289p6.C10086m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* renamed from: F0 */
    long m30123F0() {
        return m30070J0() * m30073L0();
    }

    /* renamed from: H0 */
    SQLiteDatabase m30124H0() {
        final C10100t0 c10100t0 = this.f24747a;
        Objects.requireNonNull(c10100t0);
        return (SQLiteDatabase) m30090U1(new d() { // from class: p6.w
            @Override // p289p6.C10086m0.d
            /* renamed from: a */
            public final Object mo30041a() {
                return C10100t0.this.getWritableDatabase();
            }
        }, new b() { // from class: p6.e0
            @Override // p289p6.C10086m0.b
            public final Object apply(Object obj) {
                SQLiteDatabase m30114u1;
                m30114u1 = C10086m0.m30114u1((Throwable) obj);
                return m30114u1;
            }
        });
    }

    @Override // p289p6.InterfaceC10067d
    /* renamed from: J */
    public Iterable<AbstractC7646p> mo30023J() {
        return (Iterable) m30125W0(new b() { // from class: p6.l
            @Override // p289p6.C10086m0.b
            public final Object apply(Object obj) {
                List m30054A1;
                m30054A1 = C10086m0.m30054A1((SQLiteDatabase) obj);
                return m30054A1;
            }
        });
    }

    @Override // p289p6.InterfaceC10067d
    /* renamed from: K */
    public Iterable<AbstractC10081k> mo30024K(final AbstractC7646p abstractC7646p) {
        return (Iterable) m30125W0(new b() { // from class: p6.p
            @Override // p289p6.C10086m0.b
            public final Object apply(Object obj) {
                List m30058C1;
                m30058C1 = C10086m0.this.m30058C1(abstractC7646p, (SQLiteDatabase) obj);
                return m30058C1;
            }
        });
    }

    @Override // p289p6.InterfaceC10067d
    /* renamed from: V */
    public AbstractC10081k mo30025V(final AbstractC7646p abstractC7646p, final AbstractC7639i abstractC7639i) {
        C9399a.m27990c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", abstractC7646p.mo23193d(), abstractC7639i.mo23170j(), abstractC7646p.mo23191b());
        long longValue = ((Long) m30125W0(new b() { // from class: p6.i0
            @Override // p289p6.C10086m0.b
            public final Object apply(Object obj) {
                Long m30066H1;
                m30066H1 = C10086m0.this.m30066H1(abstractC7639i, abstractC7646p, (SQLiteDatabase) obj);
                return m30066H1;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return AbstractC10081k.m30053a(longValue, abstractC7646p, abstractC7639i);
    }

    /* renamed from: W0 */
    <T> T m30125W0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase m30124H0 = m30124H0();
        m30124H0.beginTransaction();
        try {
            T apply = bVar.apply(m30124H0);
            m30124H0.setTransactionSuccessful();
            return apply;
        } finally {
            m30124H0.endTransaction();
        }
    }

    @Override // p289p6.InterfaceC10065c
    /* renamed from: a */
    public void mo30020a() {
        m30125W0(new b() { // from class: p6.o
            @Override // p289p6.C10086m0.b
            public final Object apply(Object obj) {
                Object m30078O1;
                m30078O1 = C10086m0.this.m30078O1((SQLiteDatabase) obj);
                return m30078O1;
            }
        });
    }

    @Override // p305q6.InterfaceC10278b
    /* renamed from: b */
    public <T> T mo30126b(InterfaceC10278b.a<T> aVar) {
        SQLiteDatabase m30124H0 = m30124H0();
        m30056B0(m30124H0);
        try {
            T mo28964n = aVar.mo28964n();
            m30124H0.setTransactionSuccessful();
            return mo28964n;
        } finally {
            m30124H0.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f24747a.close();
    }

    @Override // p289p6.InterfaceC10065c
    /* renamed from: e */
    public C9169a mo30021e() {
        final C9169a.a m27084e = C9169a.m27084e();
        final HashMap hashMap = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (C9169a) m30125W0(new b() { // from class: p6.u
            @Override // p289p6.C10086m0.b
            public final Object apply(Object obj) {
                C9169a m30062E1;
                m30062E1 = C10086m0.this.m30062E1(str, hashMap, m27084e, (SQLiteDatabase) obj);
                return m30062E1;
            }
        });
    }

    @Override // p289p6.InterfaceC10065c
    /* renamed from: f */
    public void mo30022f(final long j10, final C9171c.b bVar, final String str) {
        m30125W0(new b() { // from class: p6.m
            @Override // p289p6.C10086m0.b
            public final Object apply(Object obj) {
                Object m30075M1;
                m30075M1 = C10086m0.m30075M1(str, bVar, j10, (SQLiteDatabase) obj);
                return m30075M1;
            }
        });
    }

    @Override // p289p6.InterfaceC10067d
    /* renamed from: f1 */
    public void mo30026f1(final AbstractC7646p abstractC7646p, final long j10) {
        m30125W0(new b() { // from class: p6.n
            @Override // p289p6.C10086m0.b
            public final Object apply(Object obj) {
                Object m30076N1;
                m30076N1 = C10086m0.m30076N1(j10, abstractC7646p, (SQLiteDatabase) obj);
                return m30076N1;
            }
        });
    }

    @Override // p289p6.InterfaceC10067d
    /* renamed from: k0 */
    public boolean mo30027k0(final AbstractC7646p abstractC7646p) {
        return ((Boolean) m30125W0(new b() { // from class: p6.l0
            @Override // p289p6.C10086m0.b
            public final Object apply(Object obj) {
                Boolean m30122z1;
                m30122z1 = C10086m0.this.m30122z1(abstractC7646p, (SQLiteDatabase) obj);
                return m30122z1;
            }
        })).booleanValue();
    }

    @Override // p289p6.InterfaceC10067d
    /* renamed from: n0 */
    public long mo30028n0(AbstractC7646p abstractC7646p) {
        return ((Long) m30093X1(m30124H0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{abstractC7646p.mo23191b(), String.valueOf(C10801a.m32912a(abstractC7646p.mo23193d()))}), new b() { // from class: p6.f0
            @Override // p289p6.C10086m0.b
            public final Object apply(Object obj) {
                Long m30116v1;
                m30116v1 = C10086m0.m30116v1((Cursor) obj);
                return m30116v1;
            }
        })).longValue();
    }

    @Override // p289p6.InterfaceC10067d
    /* renamed from: o0 */
    public void mo30029o0(Iterable<AbstractC10081k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m30092W1(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            m30125W0(new b() { // from class: p6.q
                @Override // p289p6.C10086m0.b
                public final Object apply(Object obj) {
                    Object m30072K1;
                    m30072K1 = C10086m0.this.m30072K1(str, str2, (SQLiteDatabase) obj);
                    return m30072K1;
                }
            });
        }
    }

    @Override // p289p6.InterfaceC10067d
    /* renamed from: u */
    public int mo30030u() {
        final long mo32385a = this.f24748b.mo32385a() - this.f24750d.mo30007c();
        return ((Integer) m30125W0(new b() { // from class: p6.j0
            @Override // p289p6.C10086m0.b
            public final Object apply(Object obj) {
                Integer m30099c1;
                m30099c1 = C10086m0.this.m30099c1(mo32385a, (SQLiteDatabase) obj);
                return m30099c1;
            }
        })).intValue();
    }

    @Override // p289p6.InterfaceC10067d
    /* renamed from: v */
    public void mo30031v(Iterable<AbstractC10081k> iterable) {
        if (iterable.iterator().hasNext()) {
            m30124H0().compileStatement("DELETE FROM events WHERE _id in " + m30092W1(iterable)).execute();
        }
    }
}

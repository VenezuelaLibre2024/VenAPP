package p356t1;

import android.database.Cursor;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import dk.C7016j0;
import dk.C7018k0;
import dk.C7028p0;
import dk.C7029q;
import dk.C7042z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.C9322n;
import mk.C9602b;
import p356t1.C10976e;
import p391v1.InterfaceC11610i;

/* renamed from: t1.f */
/* loaded from: classes.dex */
public final class C10977f {
    /* renamed from: a */
    private static final Map<String, C10976e.a> m33502a(InterfaceC11610i interfaceC11610i, String str) {
        Map m20416c;
        Map<String, C10976e.a> m20415b;
        Map<String, C10976e.a> m20421h;
        Cursor mo32135S0 = interfaceC11610i.mo32135S0("PRAGMA table_info(`" + str + "`)");
        try {
            if (mo32135S0.getColumnCount() <= 0) {
                m20421h = C7018k0.m20421h();
                C9602b.m28593a(mo32135S0, null);
                return m20421h;
            }
            int columnIndex = mo32135S0.getColumnIndex("name");
            int columnIndex2 = mo32135S0.getColumnIndex("type");
            int columnIndex3 = mo32135S0.getColumnIndex("notnull");
            int columnIndex4 = mo32135S0.getColumnIndex("pk");
            int columnIndex5 = mo32135S0.getColumnIndex("dflt_value");
            m20416c = C7016j0.m20416c();
            while (mo32135S0.moveToNext()) {
                String name = mo32135S0.getString(columnIndex);
                String type = mo32135S0.getString(columnIndex2);
                boolean z10 = mo32135S0.getInt(columnIndex3) != 0;
                int i10 = mo32135S0.getInt(columnIndex4);
                String string = mo32135S0.getString(columnIndex5);
                C9322n.m27780d(name, "name");
                C9322n.m27780d(type, "type");
                m20416c.put(name, new C10976e.a(name, type, z10, i10, string, 2));
            }
            m20415b = C7016j0.m20415b(m20416c);
            C9602b.m28593a(mo32135S0, null);
            return m20415b;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C9602b.m28593a(mo32135S0, th2);
                throw th3;
            }
        }
    }

    /* renamed from: b */
    private static final List<C10976e.d> m33503b(Cursor cursor) {
        List m20570c;
        List m20568a;
        List<C10976e.d> m20624Z;
        int columnIndex = cursor.getColumnIndex(FacebookMediationAdapter.KEY_ID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        m20570c = C7029q.m20570c();
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(columnIndex);
            int i11 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            C9322n.m27780d(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            C9322n.m27780d(string2, "cursor.getString(toColumnIndex)");
            m20570c.add(new C10976e.d(i10, i11, string, string2));
        }
        m20568a = C7029q.m20568a(m20570c);
        m20624Z = C7042z.m20624Z(m20568a);
        return m20624Z;
    }

    /* renamed from: c */
    private static final Set<C10976e.c> m33504c(InterfaceC11610i interfaceC11610i, String str) {
        Set m20565b;
        Set<C10976e.c> m20564a;
        Cursor mo32135S0 = interfaceC11610i.mo32135S0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = mo32135S0.getColumnIndex(FacebookMediationAdapter.KEY_ID);
            int columnIndex2 = mo32135S0.getColumnIndex("seq");
            int columnIndex3 = mo32135S0.getColumnIndex("table");
            int columnIndex4 = mo32135S0.getColumnIndex("on_delete");
            int columnIndex5 = mo32135S0.getColumnIndex("on_update");
            List<C10976e.d> m33503b = m33503b(mo32135S0);
            mo32135S0.moveToPosition(-1);
            m20565b = C7028p0.m20565b();
            while (mo32135S0.moveToNext()) {
                if (mo32135S0.getInt(columnIndex2) == 0) {
                    int i10 = mo32135S0.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<C10976e.d> arrayList3 = new ArrayList();
                    for (Object obj : m33503b) {
                        if (((C10976e.d) obj).m33500i() == i10) {
                            arrayList3.add(obj);
                        }
                    }
                    for (C10976e.d dVar : arrayList3) {
                        arrayList.add(dVar.m33499h());
                        arrayList2.add(dVar.m33501l());
                    }
                    String string = mo32135S0.getString(columnIndex3);
                    C9322n.m27780d(string, "cursor.getString(tableColumnIndex)");
                    String string2 = mo32135S0.getString(columnIndex4);
                    C9322n.m27780d(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = mo32135S0.getString(columnIndex5);
                    C9322n.m27780d(string3, "cursor.getString(onUpdateColumnIndex)");
                    m20565b.add(new C10976e.c(string, string2, string3, arrayList, arrayList2));
                }
            }
            m20564a = C7028p0.m20564a(m20565b);
            C9602b.m28593a(mo32135S0, null);
            return m20564a;
        } finally {
        }
    }

    /* renamed from: d */
    private static final C10976e.e m33505d(InterfaceC11610i interfaceC11610i, String str, boolean z10) {
        List m20630f0;
        List m20630f02;
        Cursor mo32135S0 = interfaceC11610i.mo32135S0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = mo32135S0.getColumnIndex("seqno");
            int columnIndex2 = mo32135S0.getColumnIndex("cid");
            int columnIndex3 = mo32135S0.getColumnIndex("name");
            int columnIndex4 = mo32135S0.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (mo32135S0.moveToNext()) {
                    if (mo32135S0.getInt(columnIndex2) >= 0) {
                        int i10 = mo32135S0.getInt(columnIndex);
                        String columnName = mo32135S0.getString(columnIndex3);
                        String str2 = mo32135S0.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer valueOf = Integer.valueOf(i10);
                        C9322n.m27780d(columnName, "columnName");
                        treeMap.put(valueOf, columnName);
                        treeMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                Collection values = treeMap.values();
                C9322n.m27780d(values, "columnsMap.values");
                m20630f0 = C7042z.m20630f0(values);
                Collection values2 = treeMap2.values();
                C9322n.m27780d(values2, "ordersMap.values");
                m20630f02 = C7042z.m20630f0(values2);
                C10976e.e eVar = new C10976e.e(str, z10, m20630f0, m20630f02);
                C9602b.m28593a(mo32135S0, null);
                return eVar;
            }
            C9602b.m28593a(mo32135S0, null);
            return null;
        } finally {
        }
    }

    /* renamed from: e */
    private static final Set<C10976e.e> m33506e(InterfaceC11610i interfaceC11610i, String str) {
        Set m20565b;
        Set<C10976e.e> m20564a;
        Cursor mo32135S0 = interfaceC11610i.mo32135S0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = mo32135S0.getColumnIndex("name");
            int columnIndex2 = mo32135S0.getColumnIndex("origin");
            int columnIndex3 = mo32135S0.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                m20565b = C7028p0.m20565b();
                while (mo32135S0.moveToNext()) {
                    if (C9322n.m27777a("c", mo32135S0.getString(columnIndex2))) {
                        String name = mo32135S0.getString(columnIndex);
                        boolean z10 = true;
                        if (mo32135S0.getInt(columnIndex3) != 1) {
                            z10 = false;
                        }
                        C9322n.m27780d(name, "name");
                        C10976e.e m33505d = m33505d(interfaceC11610i, name, z10);
                        if (m33505d == null) {
                            C9602b.m28593a(mo32135S0, null);
                            return null;
                        }
                        m20565b.add(m33505d);
                    }
                }
                m20564a = C7028p0.m20564a(m20565b);
                C9602b.m28593a(mo32135S0, null);
                return m20564a;
            }
            C9602b.m28593a(mo32135S0, null);
            return null;
        } finally {
        }
    }

    /* renamed from: f */
    public static final C10976e m33507f(InterfaceC11610i database, String tableName) {
        C9322n.m27781e(database, "database");
        C9322n.m27781e(tableName, "tableName");
        return new C10976e(tableName, m33502a(database, tableName), m33504c(database, tableName), m33506e(database, tableName));
    }
}

package t1;

import android.database.Cursor;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import dk.j0;
import dk.k0;
import dk.p0;
import dk.q;
import dk.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.n;
import t1.e;
import v1.i;

/* loaded from: classes.dex */
public final class f {
    private static final Map<String, e.a> a(i iVar, String str) {
        Map c10;
        Map<String, e.a> b10;
        Map<String, e.a> h10;
        Cursor S0 = iVar.S0("PRAGMA table_info(`" + str + "`)");
        try {
            if (S0.getColumnCount() <= 0) {
                h10 = k0.h();
                mk.b.a(S0, null);
                return h10;
            }
            int columnIndex = S0.getColumnIndex("name");
            int columnIndex2 = S0.getColumnIndex("type");
            int columnIndex3 = S0.getColumnIndex("notnull");
            int columnIndex4 = S0.getColumnIndex("pk");
            int columnIndex5 = S0.getColumnIndex("dflt_value");
            c10 = j0.c();
            while (S0.moveToNext()) {
                String name = S0.getString(columnIndex);
                String type = S0.getString(columnIndex2);
                boolean z10 = S0.getInt(columnIndex3) != 0;
                int i10 = S0.getInt(columnIndex4);
                String string = S0.getString(columnIndex5);
                n.d(name, "name");
                n.d(type, "type");
                c10.put(name, new e.a(name, type, z10, i10, string, 2));
            }
            b10 = j0.b(c10);
            mk.b.a(S0, null);
            return b10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                mk.b.a(S0, th2);
                throw th3;
            }
        }
    }

    private static final List<e.d> b(Cursor cursor) {
        List c10;
        List a10;
        List<e.d> Z;
        int columnIndex = cursor.getColumnIndex(FacebookMediationAdapter.KEY_ID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        c10 = q.c();
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(columnIndex);
            int i11 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            n.d(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            n.d(string2, "cursor.getString(toColumnIndex)");
            c10.add(new e.d(i10, i11, string, string2));
        }
        a10 = q.a(c10);
        Z = z.Z(a10);
        return Z;
    }

    private static final Set<e.c> c(i iVar, String str) {
        Set b10;
        Set<e.c> a10;
        Cursor S0 = iVar.S0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = S0.getColumnIndex(FacebookMediationAdapter.KEY_ID);
            int columnIndex2 = S0.getColumnIndex("seq");
            int columnIndex3 = S0.getColumnIndex("table");
            int columnIndex4 = S0.getColumnIndex("on_delete");
            int columnIndex5 = S0.getColumnIndex("on_update");
            List<e.d> b11 = b(S0);
            S0.moveToPosition(-1);
            b10 = p0.b();
            while (S0.moveToNext()) {
                if (S0.getInt(columnIndex2) == 0) {
                    int i10 = S0.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<e.d> arrayList3 = new ArrayList();
                    for (Object obj : b11) {
                        if (((e.d) obj).i() == i10) {
                            arrayList3.add(obj);
                        }
                    }
                    for (e.d dVar : arrayList3) {
                        arrayList.add(dVar.h());
                        arrayList2.add(dVar.l());
                    }
                    String string = S0.getString(columnIndex3);
                    n.d(string, "cursor.getString(tableColumnIndex)");
                    String string2 = S0.getString(columnIndex4);
                    n.d(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = S0.getString(columnIndex5);
                    n.d(string3, "cursor.getString(onUpdateColumnIndex)");
                    b10.add(new e.c(string, string2, string3, arrayList, arrayList2));
                }
            }
            a10 = p0.a(b10);
            mk.b.a(S0, null);
            return a10;
        } finally {
        }
    }

    private static final e.C0434e d(i iVar, String str, boolean z10) {
        List f02;
        List f03;
        Cursor S0 = iVar.S0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = S0.getColumnIndex("seqno");
            int columnIndex2 = S0.getColumnIndex("cid");
            int columnIndex3 = S0.getColumnIndex("name");
            int columnIndex4 = S0.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (S0.moveToNext()) {
                    if (S0.getInt(columnIndex2) >= 0) {
                        int i10 = S0.getInt(columnIndex);
                        String columnName = S0.getString(columnIndex3);
                        String str2 = S0.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer valueOf = Integer.valueOf(i10);
                        n.d(columnName, "columnName");
                        treeMap.put(valueOf, columnName);
                        treeMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                Collection values = treeMap.values();
                n.d(values, "columnsMap.values");
                f02 = z.f0(values);
                Collection values2 = treeMap2.values();
                n.d(values2, "ordersMap.values");
                f03 = z.f0(values2);
                e.C0434e c0434e = new e.C0434e(str, z10, f02, f03);
                mk.b.a(S0, null);
                return c0434e;
            }
            mk.b.a(S0, null);
            return null;
        } finally {
        }
    }

    private static final Set<e.C0434e> e(i iVar, String str) {
        Set b10;
        Set<e.C0434e> a10;
        Cursor S0 = iVar.S0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = S0.getColumnIndex("name");
            int columnIndex2 = S0.getColumnIndex("origin");
            int columnIndex3 = S0.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                b10 = p0.b();
                while (S0.moveToNext()) {
                    if (n.a("c", S0.getString(columnIndex2))) {
                        String name = S0.getString(columnIndex);
                        boolean z10 = true;
                        if (S0.getInt(columnIndex3) != 1) {
                            z10 = false;
                        }
                        n.d(name, "name");
                        e.C0434e d10 = d(iVar, name, z10);
                        if (d10 == null) {
                            mk.b.a(S0, null);
                            return null;
                        }
                        b10.add(d10);
                    }
                }
                a10 = p0.a(b10);
                mk.b.a(S0, null);
                return a10;
            }
            mk.b.a(S0, null);
            return null;
        } finally {
        }
    }

    public static final e f(i database, String tableName) {
        n.e(database, "database");
        n.e(tableName, "tableName");
        return new e(tableName, a(database, tableName), c(database, tableName), e(database, tableName));
    }
}

package p469yh;

import android.database.sqlite.SQLiteProgram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: yh.c0 */
/* loaded from: classes3.dex */
public class C12700c0 {

    /* renamed from: a */
    private final String f34437a;

    /* renamed from: b */
    private final List<Object> f34438b;

    public C12700c0(String str, List<Object> list) {
        this.f34437a = str;
        this.f34438b = list == null ? new ArrayList<>() : list;
    }

    /* renamed from: e */
    private Object[] m41875e(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m41876f(it.next()));
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    /* renamed from: f */
    private static Object m41876f(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            bArr[i10] = (byte) ((Integer) list.get(i10)).intValue();
        }
        return bArr;
    }

    /* renamed from: a */
    public void m41877a(SQLiteProgram sQLiteProgram) {
        long j10;
        List<Object> list = this.f34438b;
        if (list != null) {
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                Object m41876f = m41876f(this.f34438b.get(i10));
                int i11 = i10 + 1;
                if (m41876f == null) {
                    sQLiteProgram.bindNull(i11);
                } else if (m41876f instanceof byte[]) {
                    sQLiteProgram.bindBlob(i11, (byte[]) m41876f);
                } else if (m41876f instanceof Double) {
                    sQLiteProgram.bindDouble(i11, ((Double) m41876f).doubleValue());
                } else {
                    if (m41876f instanceof Integer) {
                        j10 = ((Integer) m41876f).intValue();
                    } else if (m41876f instanceof Long) {
                        j10 = ((Long) m41876f).longValue();
                    } else if (m41876f instanceof String) {
                        sQLiteProgram.bindString(i11, (String) m41876f);
                    } else {
                        if (!(m41876f instanceof Boolean)) {
                            throw new IllegalArgumentException("Could not bind " + m41876f + " from index " + i10 + ": Supported types are null, byte[], double, long, boolean and String");
                        }
                        j10 = ((Boolean) m41876f).booleanValue() ? 1L : 0L;
                    }
                    sQLiteProgram.bindLong(i11, j10);
                }
                i10 = i11;
            }
        }
    }

    /* renamed from: b */
    public List<Object> m41878b() {
        return this.f34438b;
    }

    /* renamed from: c */
    public String m41879c() {
        return this.f34437a;
    }

    /* renamed from: d */
    public Object[] m41880d() {
        return m41875e(this.f34438b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12700c0)) {
            return false;
        }
        C12700c0 c12700c0 = (C12700c0) obj;
        String str = this.f34437a;
        if (str != null) {
            if (!str.equals(c12700c0.f34437a)) {
                return false;
            }
        } else if (c12700c0.f34437a != null) {
            return false;
        }
        if (this.f34438b.size() != c12700c0.f34438b.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f34438b.size(); i10++) {
            if ((this.f34438b.get(i10) instanceof byte[]) && (c12700c0.f34438b.get(i10) instanceof byte[])) {
                if (!Arrays.equals((byte[]) this.f34438b.get(i10), (byte[]) c12700c0.f34438b.get(i10))) {
                    return false;
                }
            } else if (!this.f34438b.get(i10).equals(c12700c0.f34438b.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.f34437a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f34437a);
        List<Object> list = this.f34438b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + this.f34438b;
        }
        sb2.append(str);
        return sb2.toString();
    }
}

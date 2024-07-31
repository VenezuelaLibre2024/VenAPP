package yh;

import android.database.sqlite.SQLiteProgram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f31901a;

    /* renamed from: b, reason: collision with root package name */
    private final List<Object> f31902b;

    public c0(String str, List<Object> list) {
        this.f31901a = str;
        this.f31902b = list == null ? new ArrayList<>() : list;
    }

    private Object[] e(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(f(it.next()));
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    private static Object f(Object obj) {
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

    public void a(SQLiteProgram sQLiteProgram) {
        long j10;
        List<Object> list = this.f31902b;
        if (list != null) {
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                Object f10 = f(this.f31902b.get(i10));
                int i11 = i10 + 1;
                if (f10 == null) {
                    sQLiteProgram.bindNull(i11);
                } else if (f10 instanceof byte[]) {
                    sQLiteProgram.bindBlob(i11, (byte[]) f10);
                } else if (f10 instanceof Double) {
                    sQLiteProgram.bindDouble(i11, ((Double) f10).doubleValue());
                } else {
                    if (f10 instanceof Integer) {
                        j10 = ((Integer) f10).intValue();
                    } else if (f10 instanceof Long) {
                        j10 = ((Long) f10).longValue();
                    } else if (f10 instanceof String) {
                        sQLiteProgram.bindString(i11, (String) f10);
                    } else {
                        if (!(f10 instanceof Boolean)) {
                            throw new IllegalArgumentException("Could not bind " + f10 + " from index " + i10 + ": Supported types are null, byte[], double, long, boolean and String");
                        }
                        j10 = ((Boolean) f10).booleanValue() ? 1L : 0L;
                    }
                    sQLiteProgram.bindLong(i11, j10);
                }
                i10 = i11;
            }
        }
    }

    public List<Object> b() {
        return this.f31902b;
    }

    public String c() {
        return this.f31901a;
    }

    public Object[] d() {
        return e(this.f31902b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        String str = this.f31901a;
        if (str != null) {
            if (!str.equals(c0Var.f31901a)) {
                return false;
            }
        } else if (c0Var.f31901a != null) {
            return false;
        }
        if (this.f31902b.size() != c0Var.f31902b.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f31902b.size(); i10++) {
            if ((this.f31902b.get(i10) instanceof byte[]) && (c0Var.f31902b.get(i10) instanceof byte[])) {
                if (!Arrays.equals((byte[]) this.f31902b.get(i10), (byte[]) c0Var.f31902b.get(i10))) {
                    return false;
                }
            } else if (!this.f31902b.get(i10).equals(c0Var.f31902b.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.f31901a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f31901a);
        List<Object> list = this.f31902b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + this.f31902b;
        }
        sb2.append(str);
        return sb2.toString();
    }
}

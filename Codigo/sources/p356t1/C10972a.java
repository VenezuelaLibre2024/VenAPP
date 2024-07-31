package p356t1;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import android.util.Log;
import dk.C7021m;
import kotlin.jvm.internal.C9322n;
import mk.C9602b;
import p450xk.C12524p;

/* renamed from: t1.a */
/* loaded from: classes.dex */
public final class C10972a {
    /* renamed from: a */
    public static final Cursor m33482a(Cursor c10) {
        C9322n.m27781e(c10, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(c10.getColumnNames(), c10.getCount());
            while (c10.moveToNext()) {
                Object[] objArr = new Object[c10.getColumnCount()];
                int columnCount = c10.getColumnCount();
                for (int i10 = 0; i10 < columnCount; i10++) {
                    int type = c10.getType(i10);
                    if (type == 0) {
                        objArr[i10] = null;
                    } else if (type == 1) {
                        objArr[i10] = Long.valueOf(c10.getLong(i10));
                    } else if (type == 2) {
                        objArr[i10] = Double.valueOf(c10.getDouble(i10));
                    } else if (type == 3) {
                        objArr[i10] = c10.getString(i10);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i10] = c10.getBlob(i10);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            C9602b.m28593a(c10, null);
            return matrixCursor;
        } finally {
        }
    }

    /* renamed from: b */
    private static final int m33483b(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT > 25) {
            return -1;
        }
        if (str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        C9322n.m27780d(columnNames, "columnNames");
        return m33484c(columnNames, str);
    }

    /* renamed from: c */
    public static final int m33484c(String[] columnNames, String name) {
        boolean m41036q;
        boolean m41036q2;
        C9322n.m27781e(columnNames, "columnNames");
        C9322n.m27781e(name, "name");
        String str = '.' + name;
        String str2 = '.' + name + '`';
        int length = columnNames.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            String str3 = columnNames[i10];
            int i12 = i11 + 1;
            if (str3.length() >= name.length() + 2) {
                m41036q = C12524p.m41036q(str3, str, false, 2, null);
                if (m41036q) {
                    return i11;
                }
                if (str3.charAt(0) == '`') {
                    m41036q2 = C12524p.m41036q(str3, str2, false, 2, null);
                    if (m41036q2) {
                        return i11;
                    }
                } else {
                    continue;
                }
            }
            i10++;
            i11 = i12;
        }
        return -1;
    }

    /* renamed from: d */
    public static final int m33485d(Cursor c10, String name) {
        C9322n.m27781e(c10, "c");
        C9322n.m27781e(name, "name");
        int columnIndex = c10.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c10.getColumnIndex('`' + name + '`');
        return columnIndex2 >= 0 ? columnIndex2 : m33483b(c10, name);
    }

    /* renamed from: e */
    public static final int m33486e(Cursor c10, String name) {
        String str;
        C9322n.m27781e(c10, "c");
        C9322n.m27781e(name, "name");
        int m33485d = m33485d(c10, name);
        if (m33485d >= 0) {
            return m33485d;
        }
        try {
            String[] columnNames = c10.getColumnNames();
            C9322n.m27780d(columnNames, "c.columnNames");
            str = C7021m.m20465R(columnNames, null, null, null, 0, null, null, 63, null);
        } catch (Exception e10) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e10);
            str = "unknown";
        }
        throw new IllegalArgumentException("column '" + name + "' does not exist. Available columns: " + str);
    }
}

package b6;

import android.database.Cursor;
import android.util.Log;
import kotlin.jvm.internal.n;
import xk.p;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6152a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f6153b;

    private a() {
    }

    public static final void a(Object obj) {
        String str;
        if (f6153b) {
            if (obj == null || (str = obj.toString()) == null) {
                str = "null";
            }
            Log.d("PhotoManager", str);
        }
    }

    public static final void b(Object obj) {
        if (f6153b) {
            String localizedMessage = obj instanceof Exception ? ((Exception) obj).getLocalizedMessage() : obj != null ? obj.toString() : null;
            if (localizedMessage == null) {
                localizedMessage = "null";
            }
            Log.e("PhotoManager", localizedMessage);
        }
    }

    public static final void c(Object obj, Throwable th2) {
        if (f6153b) {
            String localizedMessage = obj instanceof Exception ? ((Exception) obj).getLocalizedMessage() : obj != null ? obj.toString() : null;
            if (localizedMessage == null) {
                localizedMessage = "null";
            }
            Log.e("PhotoManager", localizedMessage, th2);
        }
    }

    public static final void d(Object obj) {
        String str;
        if (f6153b) {
            if (obj == null || (str = obj.toString()) == null) {
                str = "null";
            }
            Log.i("PhotoManager", str);
        }
    }

    public static final void f(Cursor cursor, String str) {
        String str2;
        boolean r10;
        if (cursor == null) {
            a("The cursor is null");
            return;
        }
        a("The cursor row: " + cursor.getCount());
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            StringBuilder sb2 = new StringBuilder();
            int columnIndex = cursor.getColumnIndex(str);
            if (columnIndex != -1) {
                String string = cursor.getString(columnIndex);
                sb2.append("\nid: ");
                sb2.append(string);
                sb2.append("\n");
            }
            String[] columnNames = cursor.getColumnNames();
            n.d(columnNames, "getColumnNames(...)");
            for (String str3 : columnNames) {
                int columnIndex2 = cursor.getColumnIndex(str3);
                try {
                    str2 = cursor.getString(columnIndex2);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    str2 = "blob(" + cursor.getBlob(columnIndex2).length + ')';
                }
                r10 = p.r(str3, str, true);
                if (!r10) {
                    sb2.append("|--");
                    sb2.append(str3);
                    sb2.append(" : ");
                    sb2.append(str2);
                    sb2.append("\n");
                }
            }
            a(sb2);
        }
        cursor.moveToPosition(-1);
    }

    public final boolean e() {
        return f6153b;
    }

    public final void g(boolean z10) {
        f6153b = z10;
    }
}

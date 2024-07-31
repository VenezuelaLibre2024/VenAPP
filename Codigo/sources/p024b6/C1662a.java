package p024b6;

import android.database.Cursor;
import android.util.Log;
import kotlin.jvm.internal.C9322n;
import p450xk.C12524p;

/* renamed from: b6.a */
/* loaded from: classes.dex */
public final class C1662a {

    /* renamed from: a */
    public static final C1662a f7047a = new C1662a();

    /* renamed from: b */
    private static boolean f7048b;

    private C1662a() {
    }

    /* renamed from: a */
    public static final void m9132a(Object obj) {
        String str;
        if (f7048b) {
            if (obj == null || (str = obj.toString()) == null) {
                str = "null";
            }
            Log.d("PhotoManager", str);
        }
    }

    /* renamed from: b */
    public static final void m9133b(Object obj) {
        if (f7048b) {
            String localizedMessage = obj instanceof Exception ? ((Exception) obj).getLocalizedMessage() : obj != null ? obj.toString() : null;
            if (localizedMessage == null) {
                localizedMessage = "null";
            }
            Log.e("PhotoManager", localizedMessage);
        }
    }

    /* renamed from: c */
    public static final void m9134c(Object obj, Throwable th2) {
        if (f7048b) {
            String localizedMessage = obj instanceof Exception ? ((Exception) obj).getLocalizedMessage() : obj != null ? obj.toString() : null;
            if (localizedMessage == null) {
                localizedMessage = "null";
            }
            Log.e("PhotoManager", localizedMessage, th2);
        }
    }

    /* renamed from: d */
    public static final void m9135d(Object obj) {
        String str;
        if (f7048b) {
            if (obj == null || (str = obj.toString()) == null) {
                str = "null";
            }
            Log.i("PhotoManager", str);
        }
    }

    /* renamed from: f */
    public static final void m9136f(Cursor cursor, String str) {
        String str2;
        boolean m41037r;
        if (cursor == null) {
            m9132a("The cursor is null");
            return;
        }
        m9132a("The cursor row: " + cursor.getCount());
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
            C9322n.m27780d(columnNames, "getColumnNames(...)");
            for (String str3 : columnNames) {
                int columnIndex2 = cursor.getColumnIndex(str3);
                try {
                    str2 = cursor.getString(columnIndex2);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    str2 = "blob(" + cursor.getBlob(columnIndex2).length + ')';
                }
                m41037r = C12524p.m41037r(str3, str, true);
                if (!m41037r) {
                    sb2.append("|--");
                    sb2.append(str3);
                    sb2.append(" : ");
                    sb2.append(str2);
                    sb2.append("\n");
                }
            }
            m9132a(sb2);
        }
        cursor.moveToPosition(-1);
    }

    /* renamed from: e */
    public final boolean m9137e() {
        return f7048b;
    }

    /* renamed from: g */
    public final void m9138g(boolean z10) {
        f7048b = z10;
    }
}

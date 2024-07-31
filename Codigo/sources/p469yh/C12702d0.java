package p469yh;

import android.database.Cursor;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p491zh.C13028a;

/* renamed from: yh.d0 */
/* loaded from: classes3.dex */
public class C12702d0 {
    /* renamed from: a */
    public static List<Object> m41881a(Cursor cursor, int i10) {
        String str;
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            Object m41882b = m41882b(cursor, i11);
            if (C13028a.f35369c) {
                if (m41882b == null) {
                    str = null;
                } else if (m41882b.getClass().isArray()) {
                    str = "array(" + m41882b.getClass().getComponentType().getName() + ")";
                } else {
                    str = m41882b.getClass().getName();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("column ");
                sb2.append(i11);
                sb2.append(" ");
                sb2.append(cursor.getType(i11));
                sb2.append(": ");
                sb2.append(m41882b);
                sb2.append(str == null ? "" : " (" + str + ")");
                Log.d("Sqflite", sb2.toString());
            }
            arrayList.add(m41882b);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Object m41882b(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            return null;
        }
        return cursor.getBlob(i10);
    }

    /* renamed from: c */
    static Locale m41883c(String str) {
        return Locale.forLanguageTag(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static Locale m41884d(String str) {
        return m41883c(str);
    }
}

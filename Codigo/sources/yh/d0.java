package yh;

import android.database.Cursor;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public class d0 {
    public static List<Object> a(Cursor cursor, int i10) {
        String str;
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            Object b10 = b(cursor, i11);
            if (zh.a.f32818c) {
                if (b10 == null) {
                    str = null;
                } else if (b10.getClass().isArray()) {
                    str = "array(" + b10.getClass().getComponentType().getName() + ")";
                } else {
                    str = b10.getClass().getName();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("column ");
                sb2.append(i11);
                sb2.append(" ");
                sb2.append(cursor.getType(i11));
                sb2.append(": ");
                sb2.append(b10);
                sb2.append(str == null ? "" : " (" + str + ")");
                Log.d("Sqflite", sb2.toString());
            }
            arrayList.add(b10);
        }
        return arrayList;
    }

    public static Object b(Cursor cursor, int i10) {
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

    static Locale c(String str) {
        return Locale.forLanguageTag(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Locale d(String str) {
        return c(str);
    }
}

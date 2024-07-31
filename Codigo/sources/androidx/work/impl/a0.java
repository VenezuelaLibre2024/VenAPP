package androidx.work.impl;

import android.content.Context;
import dk.j0;
import dk.k0;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f5730a = new a0();

    private a0() {
    }

    private final File c(Context context) {
        return new File(a.f5729a.a(context), "androidx.work.workdb");
    }

    public static final void d(Context context) {
        String str;
        StringBuilder sb2;
        String str2;
        String str3;
        kotlin.jvm.internal.n.e(context, "context");
        a0 a0Var = f5730a;
        if (a0Var.b(context).exists()) {
            f2.j e10 = f2.j.e();
            str = b0.f5731a;
            e10.a(str, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry<File, File> entry : a0Var.e(context).entrySet()) {
                File key = entry.getKey();
                File value = entry.getValue();
                if (key.exists()) {
                    if (value.exists()) {
                        f2.j e11 = f2.j.e();
                        str3 = b0.f5731a;
                        e11.k(str3, "Over-writing contents of " + value);
                    }
                    if (key.renameTo(value)) {
                        sb2 = new StringBuilder();
                        sb2.append("Migrated ");
                        sb2.append(key);
                        sb2.append("to ");
                        sb2.append(value);
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append("Renaming ");
                        sb2.append(key);
                        sb2.append(" to ");
                        sb2.append(value);
                        sb2.append(" failed");
                    }
                    String sb3 = sb2.toString();
                    f2.j e12 = f2.j.e();
                    str2 = b0.f5731a;
                    e12.a(str2, sb3);
                }
            }
        }
    }

    public final File a(Context context) {
        kotlin.jvm.internal.n.e(context, "context");
        return c(context);
    }

    public final File b(Context context) {
        kotlin.jvm.internal.n.e(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        kotlin.jvm.internal.n.d(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    public final Map<File, File> e(Context context) {
        String[] strArr;
        int e10;
        int b10;
        Map<File, File> n10;
        kotlin.jvm.internal.n.e(context, "context");
        File b11 = b(context);
        File a10 = a(context);
        strArr = b0.f5732b;
        e10 = j0.e(strArr.length);
        b10 = uk.l.b(e10, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
        for (String str : strArr) {
            ck.m a11 = ck.r.a(new File(b11.getPath() + str), new File(a10.getPath() + str));
            linkedHashMap.put(a11.c(), a11.d());
        }
        n10 = k0.n(linkedHashMap, ck.r.a(b11, a10));
        return n10;
    }
}

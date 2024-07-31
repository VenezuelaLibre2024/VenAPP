package androidx.work.impl;

import android.content.Context;
import ck.C2028m;
import ck.C2033r;
import dk.C7016j0;
import dk.C7018k0;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C9322n;
import p094f2.AbstractC7277j;
import uk.C11585l;

/* renamed from: androidx.work.impl.a0 */
/* loaded from: classes.dex */
public final class C1527a0 {

    /* renamed from: a */
    public static final C1527a0 f6581a = new C1527a0();

    private C1527a0() {
    }

    /* renamed from: c */
    private final File m8589c(Context context) {
        return new File(C1526a.f6580a.m8588a(context), "androidx.work.workdb");
    }

    /* renamed from: d */
    public static final void m8590d(Context context) {
        String str;
        StringBuilder sb2;
        String str2;
        String str3;
        C9322n.m27781e(context, "context");
        C1527a0 c1527a0 = f6581a;
        if (c1527a0.m8592b(context).exists()) {
            AbstractC7277j m21767e = AbstractC7277j.m21767e();
            str = C1529b0.f6582a;
            m21767e.mo21770a(str, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry<File, File> entry : c1527a0.m8593e(context).entrySet()) {
                File key = entry.getKey();
                File value = entry.getValue();
                if (key.exists()) {
                    if (value.exists()) {
                        AbstractC7277j m21767e2 = AbstractC7277j.m21767e();
                        str3 = C1529b0.f6582a;
                        m21767e2.mo21777k(str3, "Over-writing contents of " + value);
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
                    AbstractC7277j m21767e3 = AbstractC7277j.m21767e();
                    str2 = C1529b0.f6582a;
                    m21767e3.mo21770a(str2, sb3);
                }
            }
        }
    }

    /* renamed from: a */
    public final File m8591a(Context context) {
        C9322n.m27781e(context, "context");
        return m8589c(context);
    }

    /* renamed from: b */
    public final File m8592b(Context context) {
        C9322n.m27781e(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        C9322n.m27780d(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    /* renamed from: e */
    public final Map<File, File> m8593e(Context context) {
        String[] strArr;
        int m20418e;
        int m36293b;
        Map<File, File> m20427n;
        C9322n.m27781e(context, "context");
        File m8592b = m8592b(context);
        File m8591a = m8591a(context);
        strArr = C1529b0.f6583b;
        m20418e = C7016j0.m20418e(strArr.length);
        m36293b = C11585l.m36293b(m20418e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m36293b);
        for (String str : strArr) {
            C2028m m10353a = C2033r.m10353a(new File(m8592b.getPath() + str), new File(m8591a.getPath() + str));
            linkedHashMap.put(m10353a.m10337c(), m10353a.m10338d());
        }
        m20427n = C7018k0.m20427n(linkedHashMap, C2033r.m10353a(m8592b, m8591a));
        return m20427n;
    }
}

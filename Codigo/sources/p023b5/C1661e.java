package p023b5;

import com.facebook.internal.C4634n0;
import dk.C7038v;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p152i4.C7799e0;
import p152i4.C7807i0;
import p152i4.C7817n0;
import p434x4.C12284k;
import p450xk.C12514f;

/* renamed from: b5.e */
/* loaded from: classes.dex */
public final class C1661e {

    /* renamed from: a */
    public static final C1661e f7046a = new C1661e();

    private C1661e() {
    }

    /* renamed from: d */
    public static final void m9125d() {
        if (C7799e0.m23864p()) {
            m9129h();
        }
    }

    /* renamed from: e */
    public static final File[] m9126e() {
        File m39552f = C12284k.m39552f();
        if (m39552f == null) {
            return new File[0];
        }
        File[] listFiles = m39552f.listFiles(new FilenameFilter() { // from class: b5.d
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean m9127f;
                m9127f = C1661e.m9127f(file, str);
                return m9127f;
            }
        });
        C9322n.m27780d(listFiles, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
        return listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final boolean m9127f(File file, String name) {
        C9322n.m27780d(name, "name");
        C9308a0 c9308a0 = C9308a0.f22565a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1));
        C9322n.m27780d(format, "java.lang.String.format(format, *args)");
        return new C12514f(format).m40969a(name);
    }

    /* renamed from: g */
    public static final void m9128g(String str) {
        try {
            new C1657a(str).m9120e();
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    public static final void m9129h() {
        if (C4634n0.m11294a0()) {
            return;
        }
        File[] m9126e = m9126e();
        final ArrayList arrayList = new ArrayList();
        int length = m9126e.length;
        int i10 = 0;
        while (i10 < length) {
            File file = m9126e[i10];
            i10++;
            C1657a c1657a = new C1657a(file);
            if (c1657a.m9119d()) {
                arrayList.add(c1657a);
            }
        }
        C7038v.m20596t(arrayList, new Comparator() { // from class: b5.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m9130i;
                m9130i = C1661e.m9130i((C1657a) obj, (C1657a) obj2);
                return m9130i;
            }
        });
        JSONArray jSONArray = new JSONArray();
        for (int i11 = 0; i11 < arrayList.size() && i11 < 1000; i11++) {
            jSONArray.put(arrayList.get(i11));
        }
        C12284k c12284k = C12284k.f32910a;
        C12284k.m39565s("error_reports", jSONArray, new C7807i0.b() { // from class: b5.c
            @Override // p152i4.C7807i0.b
            /* renamed from: b */
            public final void mo9121b(C7817n0 c7817n0) {
                C1661e.m9131j(arrayList, c7817n0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final int m9130i(C1657a c1657a, C1657a o22) {
        C9322n.m27780d(o22, "o2");
        return c1657a.m9117b(o22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m9131j(ArrayList validReports, C7817n0 response) {
        C9322n.m27781e(validReports, "$validReports");
        C9322n.m27781e(response, "response");
        try {
            if (response.m24061b() == null) {
                JSONObject m24063d = response.m24063d();
                if (C9322n.m27777a(m24063d == null ? null : Boolean.valueOf(m24063d.getBoolean("success")), Boolean.TRUE)) {
                    Iterator it = validReports.iterator();
                    while (it.hasNext()) {
                        ((C1657a) it.next()).m9116a();
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }
}

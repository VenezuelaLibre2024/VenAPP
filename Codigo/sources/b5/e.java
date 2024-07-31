package b5;

import com.facebook.internal.n0;
import dk.v;
import i4.e0;
import i4.i0;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x4.k;
import xk.f;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public static final e f6151a = new e();

    private e() {
    }

    public static final void d() {
        if (e0.p()) {
            h();
        }
    }

    public static final File[] e() {
        File f10 = k.f();
        if (f10 == null) {
            return new File[0];
        }
        File[] listFiles = f10.listFiles(new FilenameFilter() { // from class: b5.d
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean f11;
                f11 = e.f(file, str);
                return f11;
            }
        });
        n.d(listFiles, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
        return listFiles;
    }

    public static final boolean f(File file, String name) {
        n.d(name, "name");
        a0 a0Var = a0.f20743a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1));
        n.d(format, "java.lang.String.format(format, *args)");
        return new f(format).a(name);
    }

    public static final void g(String str) {
        try {
            new a(str).e();
        } catch (Exception unused) {
        }
    }

    public static final void h() {
        if (n0.a0()) {
            return;
        }
        File[] e10 = e();
        ArrayList arrayList = new ArrayList();
        int length = e10.length;
        int i10 = 0;
        while (i10 < length) {
            File file = e10[i10];
            i10++;
            a aVar = new a(file);
            if (aVar.d()) {
                arrayList.add(aVar);
            }
        }
        v.t(arrayList, new Comparator() { // from class: b5.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i11;
                i11 = e.i((a) obj, (a) obj2);
                return i11;
            }
        });
        JSONArray jSONArray = new JSONArray();
        for (int i11 = 0; i11 < arrayList.size() && i11 < 1000; i11++) {
            jSONArray.put(arrayList.get(i11));
        }
        k kVar = k.f30398a;
        k.s("error_reports", jSONArray, new i0.b() { // from class: b5.c

            /* renamed from: a */
            public final /* synthetic */ ArrayList f6150a;

            public /* synthetic */ c(ArrayList arrayList2) {
                r1 = arrayList2;
            }

            @Override // i4.i0.b
            public final void b(i4.n0 n0Var) {
                e.j(r1, n0Var);
            }
        });
    }

    public static final int i(a aVar, a o22) {
        n.d(o22, "o2");
        return aVar.b(o22);
    }

    public static final void j(ArrayList validReports, i4.n0 response) {
        n.e(validReports, "$validReports");
        n.e(response, "response");
        try {
            if (response.b() == null) {
                JSONObject d10 = response.d();
                if (n.a(d10 == null ? null : Boolean.valueOf(d10.getBoolean("success")), Boolean.TRUE)) {
                    Iterator it = validReports.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).a();
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }
}

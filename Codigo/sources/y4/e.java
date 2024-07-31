package y4;

import com.facebook.internal.n0;
import dk.z;
import i4.e0;
import i4.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import uk.f;
import uk.l;
import x4.c;
import x4.k;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f31651a = new e();

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f31652b = new AtomicBoolean(false);

    private e() {
    }

    public static final synchronized void c() {
        synchronized (e.class) {
            if (a5.a.d(e.class)) {
                return;
            }
            try {
                if (f31652b.getAndSet(true)) {
                    return;
                }
                if (e0.p()) {
                    d();
                }
                b.d();
            } catch (Throwable th2) {
                a5.a.b(th2, e.class);
            }
        }
    }

    public static final void d() {
        final List a02;
        f k10;
        if (a5.a.d(e.class)) {
            return;
        }
        try {
            if (n0.a0()) {
                return;
            }
            File[] l10 = k.l();
            ArrayList arrayList = new ArrayList(l10.length);
            for (File file : l10) {
                arrayList.add(c.a.d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((x4.c) obj).f()) {
                    arrayList2.add(obj);
                }
            }
            a02 = z.a0(arrayList2, new Comparator() { // from class: y4.c
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    int e10;
                    e10 = e.e((x4.c) obj2, (x4.c) obj3);
                    return e10;
                }
            });
            JSONArray jSONArray = new JSONArray();
            k10 = l.k(0, Math.min(a02.size(), 5));
            Iterator<Integer> it = k10.iterator();
            while (it.hasNext()) {
                jSONArray.put(a02.get(((dk.e0) it).nextInt()));
            }
            k kVar = k.f30398a;
            k.s("anr_reports", jSONArray, new i0.b() { // from class: y4.d
                @Override // i4.i0.b
                public final void b(i4.n0 n0Var) {
                    e.f(a02, n0Var);
                }
            });
        } catch (Throwable th2) {
            a5.a.b(th2, e.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(x4.c cVar, x4.c o22) {
        if (a5.a.d(e.class)) {
            return 0;
        }
        try {
            n.d(o22, "o2");
            return cVar.b(o22);
        } catch (Throwable th2) {
            a5.a.b(th2, e.class);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(List validReports, i4.n0 response) {
        if (a5.a.d(e.class)) {
            return;
        }
        try {
            n.e(validReports, "$validReports");
            n.e(response, "response");
            try {
                if (response.b() == null) {
                    JSONObject d10 = response.d();
                    if (n.a(d10 == null ? null : Boolean.valueOf(d10.getBoolean("success")), Boolean.TRUE)) {
                        Iterator it = validReports.iterator();
                        while (it.hasNext()) {
                            ((x4.c) it.next()).a();
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            a5.a.b(th2, e.class);
        }
    }
}

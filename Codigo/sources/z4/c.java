package z4;

import android.util.Log;
import com.facebook.internal.n0;
import dk.e0;
import dk.z;
import i4.i0;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import uk.f;
import uk.l;
import x4.c;
import x4.k;
import z4.c;

/* loaded from: classes.dex */
public final class c implements Thread.UncaughtExceptionHandler {

    /* renamed from: b, reason: collision with root package name */
    public static final a f32318b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final String f32319c = c.class.getCanonicalName();

    /* renamed from: d, reason: collision with root package name */
    private static c f32320d;

    /* renamed from: a, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f32321a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final void d() {
            final List a02;
            f k10;
            if (n0.a0()) {
                return;
            }
            File[] p10 = k.p();
            ArrayList arrayList = new ArrayList(p10.length);
            for (File file : p10) {
                arrayList.add(c.a.d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((x4.c) obj).f()) {
                    arrayList2.add(obj);
                }
            }
            a02 = z.a0(arrayList2, new Comparator() { // from class: z4.a
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    int e10;
                    e10 = c.a.e((x4.c) obj2, (x4.c) obj3);
                    return e10;
                }
            });
            JSONArray jSONArray = new JSONArray();
            k10 = l.k(0, Math.min(a02.size(), 5));
            Iterator<Integer> it = k10.iterator();
            while (it.hasNext()) {
                jSONArray.put(a02.get(((e0) it).nextInt()));
            }
            k kVar = k.f30398a;
            k.s("crash_reports", jSONArray, new i0.b() { // from class: z4.b
                @Override // i4.i0.b
                public final void b(i4.n0 n0Var) {
                    c.a.f(a02, n0Var);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int e(x4.c cVar, x4.c o22) {
            n.d(o22, "o2");
            return cVar.b(o22);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(List validReports, i4.n0 response) {
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
        }

        public final synchronized void c() {
            if (i4.e0.p()) {
                d();
            }
            if (c.f32320d != null) {
                Log.w(c.f32319c, "Already enabled!");
            } else {
                c.f32320d = new c(Thread.getDefaultUncaughtExceptionHandler(), null);
                Thread.setDefaultUncaughtExceptionHandler(c.f32320d);
            }
        }
    }

    private c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f32321a = uncaughtExceptionHandler;
    }

    public /* synthetic */ c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, g gVar) {
        this(uncaughtExceptionHandler);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread t10, Throwable e10) {
        n.e(t10, "t");
        n.e(e10, "e");
        if (k.j(e10)) {
            x4.b.c(e10);
            c.a aVar = c.a.f30394a;
            c.a.b(e10, c.EnumC0496c.CrashReport).g();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f32321a;
        if (uncaughtExceptionHandler == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(t10, e10);
    }
}

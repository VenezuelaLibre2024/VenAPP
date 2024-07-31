package p479z4;

import android.util.Log;
import com.facebook.internal.C4634n0;
import dk.AbstractC7006e0;
import dk.C7042z;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p152i4.C7799e0;
import p152i4.C7807i0;
import p152i4.C7817n0;
import p434x4.C12275b;
import p434x4.C12276c;
import p434x4.C12284k;
import p479z4.C12801c;
import uk.C11579f;
import uk.C11585l;

/* renamed from: z4.c */
/* loaded from: classes.dex */
public final class C12801c implements Thread.UncaughtExceptionHandler {

    /* renamed from: b */
    public static final a f34869b = new a(null);

    /* renamed from: c */
    private static final String f34870c = C12801c.class.getCanonicalName();

    /* renamed from: d */
    private static C12801c f34871d;

    /* renamed from: a */
    private final Thread.UncaughtExceptionHandler f34872a;

    /* renamed from: z4.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: d */
        private final void m42436d() {
            final List m20625a0;
            C11579f m36302k;
            if (C4634n0.m11294a0()) {
                return;
            }
            File[] m39562p = C12284k.m39562p();
            ArrayList arrayList = new ArrayList(m39562p.length);
            for (File file : m39562p) {
                arrayList.add(C12276c.a.m39535d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((C12276c) obj).m39530f()) {
                    arrayList2.add(obj);
                }
            }
            m20625a0 = C7042z.m20625a0(arrayList2, new Comparator() { // from class: z4.a
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    int m42437e;
                    m42437e = C12801c.a.m42437e((C12276c) obj2, (C12276c) obj3);
                    return m42437e;
                }
            });
            JSONArray jSONArray = new JSONArray();
            m36302k = C11585l.m36302k(0, Math.min(m20625a0.size(), 5));
            Iterator<Integer> it = m36302k.iterator();
            while (it.hasNext()) {
                jSONArray.put(m20625a0.get(((AbstractC7006e0) it).nextInt()));
            }
            C12284k c12284k = C12284k.f32910a;
            C12284k.m39565s("crash_reports", jSONArray, new C7807i0.b() { // from class: z4.b
                @Override // p152i4.C7807i0.b
                /* renamed from: b */
                public final void mo9121b(C7817n0 c7817n0) {
                    C12801c.a.m42438f(m20625a0, c7817n0);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final int m42437e(C12276c c12276c, C12276c o22) {
            C9322n.m27780d(o22, "o2");
            return c12276c.m39529b(o22);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m42438f(List validReports, C7817n0 response) {
            C9322n.m27781e(validReports, "$validReports");
            C9322n.m27781e(response, "response");
            try {
                if (response.m24061b() == null) {
                    JSONObject m24063d = response.m24063d();
                    if (C9322n.m27777a(m24063d == null ? null : Boolean.valueOf(m24063d.getBoolean("success")), Boolean.TRUE)) {
                        Iterator it = validReports.iterator();
                        while (it.hasNext()) {
                            ((C12276c) it.next()).m39528a();
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }

        /* renamed from: c */
        public final synchronized void m42439c() {
            if (C7799e0.m23864p()) {
                m42436d();
            }
            if (C12801c.f34871d != null) {
                Log.w(C12801c.f34870c, "Already enabled!");
            } else {
                C12801c.f34871d = new C12801c(Thread.getDefaultUncaughtExceptionHandler(), null);
                Thread.setDefaultUncaughtExceptionHandler(C12801c.f34871d);
            }
        }
    }

    private C12801c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f34872a = uncaughtExceptionHandler;
    }

    public /* synthetic */ C12801c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C9315g c9315g) {
        this(uncaughtExceptionHandler);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread t10, Throwable e10) {
        C9322n.m27781e(t10, "t");
        C9322n.m27781e(e10, "e");
        if (C12284k.m39556j(e10)) {
            C12275b.m39521c(e10);
            C12276c.a aVar = C12276c.a.f32906a;
            C12276c.a.m39533b(e10, C12276c.c.CrashReport).m39531g();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f34872a;
        if (uncaughtExceptionHandler == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(t10, e10);
    }
}

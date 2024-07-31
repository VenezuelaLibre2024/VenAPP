package p457y4;

import com.facebook.internal.C4634n0;
import dk.AbstractC7006e0;
import dk.C7042z;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007a5.C0033a;
import p152i4.C7799e0;
import p152i4.C7807i0;
import p152i4.C7817n0;
import p434x4.C12276c;
import p434x4.C12284k;
import uk.C11579f;
import uk.C11585l;

/* renamed from: y4.e */
/* loaded from: classes.dex */
public final class C12602e {

    /* renamed from: a */
    public static final C12602e f34187a = new C12602e();

    /* renamed from: b */
    private static final AtomicBoolean f34188b = new AtomicBoolean(false);

    private C12602e() {
    }

    /* renamed from: c */
    public static final synchronized void m41438c() {
        synchronized (C12602e.class) {
            if (C0033a.m107d(C12602e.class)) {
                return;
            }
            try {
                if (f34188b.getAndSet(true)) {
                    return;
                }
                if (C7799e0.m23864p()) {
                    m41439d();
                }
                C12599b.m41435d();
            } catch (Throwable th2) {
                C0033a.m105b(th2, C12602e.class);
            }
        }
    }

    /* renamed from: d */
    public static final void m41439d() {
        final List m20625a0;
        C11579f m36302k;
        if (C0033a.m107d(C12602e.class)) {
            return;
        }
        try {
            if (C4634n0.m11294a0()) {
                return;
            }
            File[] m39558l = C12284k.m39558l();
            ArrayList arrayList = new ArrayList(m39558l.length);
            for (File file : m39558l) {
                arrayList.add(C12276c.a.m39535d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((C12276c) obj).m39530f()) {
                    arrayList2.add(obj);
                }
            }
            m20625a0 = C7042z.m20625a0(arrayList2, new Comparator() { // from class: y4.c
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    int m41440e;
                    m41440e = C12602e.m41440e((C12276c) obj2, (C12276c) obj3);
                    return m41440e;
                }
            });
            JSONArray jSONArray = new JSONArray();
            m36302k = C11585l.m36302k(0, Math.min(m20625a0.size(), 5));
            Iterator<Integer> it = m36302k.iterator();
            while (it.hasNext()) {
                jSONArray.put(m20625a0.get(((AbstractC7006e0) it).nextInt()));
            }
            C12284k c12284k = C12284k.f32910a;
            C12284k.m39565s("anr_reports", jSONArray, new C7807i0.b() { // from class: y4.d
                @Override // p152i4.C7807i0.b
                /* renamed from: b */
                public final void mo9121b(C7817n0 c7817n0) {
                    C12602e.m41441f(m20625a0, c7817n0);
                }
            });
        } catch (Throwable th2) {
            C0033a.m105b(th2, C12602e.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final int m41440e(C12276c c12276c, C12276c o22) {
        if (C0033a.m107d(C12602e.class)) {
            return 0;
        }
        try {
            C9322n.m27780d(o22, "o2");
            return c12276c.m39529b(o22);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C12602e.class);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m41441f(List validReports, C7817n0 response) {
        if (C0033a.m107d(C12602e.class)) {
            return;
        }
        try {
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
        } catch (Throwable th2) {
            C0033a.m105b(th2, C12602e.class);
        }
    }
}

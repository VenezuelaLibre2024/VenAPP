package p434x4;

import com.facebook.internal.C4633n;
import com.facebook.internal.C4634n0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p152i4.C7799e0;
import p152i4.C7807i0;
import p152i4.C7815m0;
import p152i4.C7817n0;
import p434x4.C12276c;

/* renamed from: x4.b */
/* loaded from: classes.dex */
public final class C12275b {

    /* renamed from: a */
    public static final C12275b f32896a = new C12275b();

    /* renamed from: b */
    private static boolean f32897b;

    private C12275b() {
    }

    /* renamed from: b */
    public static final void m39520b() {
        f32897b = true;
        if (C7799e0.m23864p()) {
            f32896a.m39524e();
        }
    }

    /* renamed from: c */
    public static final void m39521c(Throwable th2) {
        if (!f32897b || m39522d() || th2 == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = th2.getStackTrace();
        C9322n.m27780d(stackTrace, "e.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            C4633n c4633n = C4633n.f8754a;
            String className = stackTraceElement.getClassName();
            C9322n.m27780d(className, "it.className");
            C4633n.b m11251d = C4633n.m11251d(className);
            if (m11251d != C4633n.b.Unknown) {
                C4633n.m11250c(m11251d);
                hashSet.add(m11251d.toString());
            }
        }
        if (C7799e0.m23864p() && (!hashSet.isEmpty())) {
            C12276c.a aVar = C12276c.a.f32906a;
            C12276c.a.m39534c(new JSONArray((Collection) hashSet)).m39531g();
        }
    }

    /* renamed from: d */
    public static final boolean m39522d() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m39523f(C12276c instrumentData, C7817n0 response) {
        C9322n.m27781e(instrumentData, "$instrumentData");
        C9322n.m27781e(response, "response");
        try {
            if (response.m24061b() == null) {
                JSONObject m24063d = response.m24063d();
                if (C9322n.m27777a(m24063d == null ? null : Boolean.valueOf(m24063d.getBoolean("success")), Boolean.TRUE)) {
                    instrumentData.m39528a();
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: e */
    public final void m39524e() {
        if (C4634n0.m11294a0()) {
            return;
        }
        File[] m39560n = C12284k.m39560n();
        ArrayList arrayList = new ArrayList();
        int length = m39560n.length;
        int i10 = 0;
        while (i10 < length) {
            File file = m39560n[i10];
            i10++;
            final C12276c m39535d = C12276c.a.m39535d(file);
            if (m39535d.m39530f()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", m39535d.toString());
                    C7807i0.c cVar = C7807i0.f18658n;
                    C9308a0 c9308a0 = C9308a0.f22565a;
                    String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{C7799e0.m23861m()}, 1));
                    C9322n.m27780d(format, "java.lang.String.format(format, *args)");
                    arrayList.add(cVar.m23987A(null, format, jSONObject, new C7807i0.b() { // from class: x4.a
                        @Override // p152i4.C7807i0.b
                        /* renamed from: b */
                        public final void mo9121b(C7817n0 c7817n0) {
                            C12275b.m39523f(C12276c.this, c7817n0);
                        }
                    }));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new C7815m0(arrayList).m24046m();
    }
}

package x4;

import com.facebook.internal.n;
import i4.e0;
import i4.i0;
import i4.m0;
import i4.n0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x4.c;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f30384a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f30385b;

    private b() {
    }

    public static final void b() {
        f30385b = true;
        if (e0.p()) {
            f30384a.e();
        }
    }

    public static final void c(Throwable th2) {
        if (!f30385b || d() || th2 == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = th2.getStackTrace();
        n.d(stackTrace, "e.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            com.facebook.internal.n nVar = com.facebook.internal.n.f7774a;
            String className = stackTraceElement.getClassName();
            n.d(className, "it.className");
            n.b d10 = com.facebook.internal.n.d(className);
            if (d10 != n.b.Unknown) {
                com.facebook.internal.n.c(d10);
                hashSet.add(d10.toString());
            }
        }
        if (e0.p() && (!hashSet.isEmpty())) {
            c.a aVar = c.a.f30394a;
            c.a.c(new JSONArray((Collection) hashSet)).g();
        }
    }

    public static final boolean d() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(c instrumentData, n0 response) {
        kotlin.jvm.internal.n.e(instrumentData, "$instrumentData");
        kotlin.jvm.internal.n.e(response, "response");
        try {
            if (response.b() == null) {
                JSONObject d10 = response.d();
                if (kotlin.jvm.internal.n.a(d10 == null ? null : Boolean.valueOf(d10.getBoolean("success")), Boolean.TRUE)) {
                    instrumentData.a();
                }
            }
        } catch (JSONException unused) {
        }
    }

    public final void e() {
        if (com.facebook.internal.n0.a0()) {
            return;
        }
        File[] n10 = k.n();
        ArrayList arrayList = new ArrayList();
        int length = n10.length;
        int i10 = 0;
        while (i10 < length) {
            File file = n10[i10];
            i10++;
            final c d10 = c.a.d(file);
            if (d10.f()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", d10.toString());
                    i0.c cVar = i0.f17005n;
                    a0 a0Var = a0.f20743a;
                    String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{e0.m()}, 1));
                    kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
                    arrayList.add(cVar.A(null, format, jSONObject, new i0.b() { // from class: x4.a
                        @Override // i4.i0.b
                        public final void b(n0 n0Var) {
                            b.f(c.this, n0Var);
                        }
                    }));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new m0(arrayList).m();
    }
}

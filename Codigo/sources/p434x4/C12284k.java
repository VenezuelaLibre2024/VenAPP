package p434x4;

import com.facebook.internal.C4634n0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p152i4.C7799e0;
import p152i4.C7807i0;
import p450xk.C12512d;
import p450xk.C12514f;
import p450xk.C12515g;

/* renamed from: x4.k */
/* loaded from: classes.dex */
public final class C12284k {

    /* renamed from: a */
    public static final C12284k f32910a = new C12284k();

    private C12284k() {
    }

    /* renamed from: d */
    public static final boolean m39550d(String str) {
        File m39552f = m39552f();
        if (m39552f == null || str == null) {
            return false;
        }
        return new File(m39552f, str).delete();
    }

    /* renamed from: e */
    public static final String m39551e(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        return th2.getCause() == null ? th2.toString() : String.valueOf(th2.getCause());
    }

    /* renamed from: f */
    public static final File m39552f() {
        File file = new File(C7799e0.m23860l().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    /* renamed from: g */
    public static final String m39553g(Thread thread) {
        C9322n.m27781e(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        C9322n.m27780d(stackTrace, "stackTrace");
        int length = stackTrace.length;
        int i10 = 0;
        while (i10 < length) {
            StackTraceElement stackTraceElement = stackTrace[i10];
            i10++;
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    /* renamed from: h */
    public static final String m39554h(Throwable th2) {
        Throwable th3 = null;
        if (th2 == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th2 != null && th2 != th3) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            C9322n.m27780d(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i10 = 0;
            while (i10 < length) {
                StackTraceElement stackTraceElement = stackTrace[i10];
                i10++;
                jSONArray.put(stackTraceElement.toString());
            }
            th3 = th2;
            th2 = th2.getCause();
        }
        return jSONArray.toString();
    }

    /* renamed from: i */
    public static final boolean m39555i(StackTraceElement element) {
        C9322n.m27781e(element, "element");
        String className = element.getClassName();
        C9322n.m27780d(className, "element.className");
        if (!C12515g.m40978E(className, "com.facebook", false, 2, null)) {
            String className2 = element.getClassName();
            C9322n.m27780d(className2, "element.className");
            if (!C12515g.m40978E(className2, "com.meta", false, 2, null)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public static final boolean m39556j(Throwable th2) {
        if (th2 == null) {
            return false;
        }
        Throwable th3 = null;
        while (th2 != null && th2 != th3) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            C9322n.m27780d(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i10 = 0;
            while (i10 < length) {
                StackTraceElement element = stackTrace[i10];
                i10++;
                C9322n.m27780d(element, "element");
                if (m39555i(element)) {
                    return true;
                }
            }
            th3 = th2;
            th2 = th2.getCause();
        }
        return false;
    }

    /* renamed from: k */
    public static final boolean m39557k(Thread thread) {
        StackTraceElement[] stackTrace;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement element : stackTrace) {
                C9322n.m27780d(element, "element");
                if (m39555i(element)) {
                    String className = element.getClassName();
                    C9322n.m27780d(className, "element.className");
                    if (!C12515g.m40978E(className, "com.facebook.appevents.codeless", false, 2, null)) {
                        String className2 = element.getClassName();
                        C9322n.m27780d(className2, "element.className");
                        if (!C12515g.m40978E(className2, "com.facebook.appevents.suggestedevents", false, 2, null)) {
                            return true;
                        }
                    }
                    String methodName = element.getMethodName();
                    C9322n.m27780d(methodName, "element.methodName");
                    if (C12515g.m40978E(methodName, "onClick", false, 2, null)) {
                        continue;
                    } else {
                        String methodName2 = element.getMethodName();
                        C9322n.m27780d(methodName2, "element.methodName");
                        if (C12515g.m40978E(methodName2, "onItemClick", false, 2, null)) {
                            continue;
                        } else {
                            String methodName3 = element.getMethodName();
                            C9322n.m27780d(methodName3, "element.methodName");
                            if (!C12515g.m40978E(methodName3, "onTouch", false, 2, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: l */
    public static final File[] m39558l() {
        File m39552f = m39552f();
        if (m39552f == null) {
            return new File[0];
        }
        File[] listFiles = m39552f.listFiles(new FilenameFilter() { // from class: x4.j
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean m39559m;
                m39559m = C12284k.m39559m(file, str);
                return m39559m;
            }
        });
        return listFiles == null ? new File[0] : listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final boolean m39559m(File file, String name) {
        C9322n.m27780d(name, "name");
        C9308a0 c9308a0 = C9308a0.f22565a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1));
        C9322n.m27780d(format, "java.lang.String.format(format, *args)");
        return new C12514f(format).m40969a(name);
    }

    /* renamed from: n */
    public static final File[] m39560n() {
        File m39552f = m39552f();
        if (m39552f == null) {
            return new File[0];
        }
        File[] listFiles = m39552f.listFiles(new FilenameFilter() { // from class: x4.i
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean m39561o;
                m39561o = C12284k.m39561o(file, str);
                return m39561o;
            }
        });
        return listFiles == null ? new File[0] : listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final boolean m39561o(File file, String name) {
        C9322n.m27780d(name, "name");
        C9308a0 c9308a0 = C9308a0.f22565a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1));
        C9322n.m27780d(format, "java.lang.String.format(format, *args)");
        return new C12514f(format).m40969a(name);
    }

    /* renamed from: p */
    public static final File[] m39562p() {
        File m39552f = m39552f();
        if (m39552f == null) {
            return new File[0];
        }
        File[] listFiles = m39552f.listFiles(new FilenameFilter() { // from class: x4.h
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean m39563q;
                m39563q = C12284k.m39563q(file, str);
                return m39563q;
            }
        });
        return listFiles == null ? new File[0] : listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final boolean m39563q(File file, String name) {
        C9322n.m27780d(name, "name");
        C9308a0 c9308a0 = C9308a0.f22565a;
        String format = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3));
        C9322n.m27780d(format, "java.lang.String.format(format, *args)");
        return new C12514f(format).m40969a(name);
    }

    /* renamed from: r */
    public static final JSONObject m39564r(String str, boolean z10) {
        File m39552f = m39552f();
        if (m39552f != null && str != null) {
            try {
                return new JSONObject(C4634n0.m11332t0(new FileInputStream(new File(m39552f, str))));
            } catch (Exception unused) {
                if (z10) {
                    m39550d(str);
                }
            }
        }
        return null;
    }

    /* renamed from: s */
    public static final void m39565s(String str, JSONArray reports, C7807i0.b bVar) {
        C9322n.m27781e(reports, "reports");
        if (reports.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, reports.toString());
            JSONObject m11267D = C4634n0.m11267D();
            if (m11267D != null) {
                Iterator<String> keys = m11267D.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, m11267D.get(next));
                }
            }
            C7807i0.c cVar = C7807i0.f18658n;
            C9308a0 c9308a0 = C9308a0.f22565a;
            String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{C7799e0.m23861m()}, 1));
            C9322n.m27780d(format, "java.lang.String.format(format, *args)");
            cVar.m23987A(null, format, jSONObject, bVar).m23950l();
        } catch (JSONException unused) {
        }
    }

    /* renamed from: t */
    public static final void m39566t(String str, String str2) {
        File m39552f = m39552f();
        if (m39552f == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(m39552f, str));
            byte[] bytes = str2.getBytes(C12512d.f33913b);
            C9322n.m27780d(bytes, "(this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }
}

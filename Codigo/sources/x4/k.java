package x4;

import com.facebook.internal.n0;
import i4.e0;
import i4.i0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xk.p;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f30398a = new k();

    private k() {
    }

    public static final boolean d(String str) {
        File f10 = f();
        if (f10 == null || str == null) {
            return false;
        }
        return new File(f10, str).delete();
    }

    public static final String e(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        return th2.getCause() == null ? th2.toString() : String.valueOf(th2.getCause());
    }

    public static final File f() {
        File file = new File(e0.l().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static final String g(Thread thread) {
        n.e(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        n.d(stackTrace, "stackTrace");
        int length = stackTrace.length;
        int i10 = 0;
        while (i10 < length) {
            StackTraceElement stackTraceElement = stackTrace[i10];
            i10++;
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    public static final String h(Throwable th2) {
        Throwable th3 = null;
        if (th2 == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th2 != null && th2 != th3) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            n.d(stackTrace, "t.stackTrace");
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

    public static final boolean i(StackTraceElement element) {
        boolean E;
        boolean E2;
        n.e(element, "element");
        String className = element.getClassName();
        n.d(className, "element.className");
        E = p.E(className, "com.facebook", false, 2, null);
        if (!E) {
            String className2 = element.getClassName();
            n.d(className2, "element.className");
            E2 = p.E(className2, "com.meta", false, 2, null);
            if (!E2) {
                return false;
            }
        }
        return true;
    }

    public static final boolean j(Throwable th2) {
        if (th2 == null) {
            return false;
        }
        Throwable th3 = null;
        while (th2 != null && th2 != th3) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            n.d(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i10 = 0;
            while (i10 < length) {
                StackTraceElement element = stackTrace[i10];
                i10++;
                n.d(element, "element");
                if (i(element)) {
                    return true;
                }
            }
            th3 = th2;
            th2 = th2.getCause();
        }
        return false;
    }

    public static final boolean k(Thread thread) {
        StackTraceElement[] stackTrace;
        boolean E;
        boolean E2;
        boolean E3;
        boolean E4;
        boolean E5;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement element : stackTrace) {
                n.d(element, "element");
                if (i(element)) {
                    String className = element.getClassName();
                    n.d(className, "element.className");
                    E = p.E(className, "com.facebook.appevents.codeless", false, 2, null);
                    if (!E) {
                        String className2 = element.getClassName();
                        n.d(className2, "element.className");
                        E5 = p.E(className2, "com.facebook.appevents.suggestedevents", false, 2, null);
                        if (!E5) {
                            return true;
                        }
                    }
                    String methodName = element.getMethodName();
                    n.d(methodName, "element.methodName");
                    E2 = p.E(methodName, "onClick", false, 2, null);
                    if (E2) {
                        continue;
                    } else {
                        String methodName2 = element.getMethodName();
                        n.d(methodName2, "element.methodName");
                        E3 = p.E(methodName2, "onItemClick", false, 2, null);
                        if (E3) {
                            continue;
                        } else {
                            String methodName3 = element.getMethodName();
                            n.d(methodName3, "element.methodName");
                            E4 = p.E(methodName3, "onTouch", false, 2, null);
                            if (!E4) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final File[] l() {
        File f10 = f();
        if (f10 == null) {
            return new File[0];
        }
        File[] listFiles = f10.listFiles(new FilenameFilter() { // from class: x4.j
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean m10;
                m10 = k.m(file, str);
                return m10;
            }
        });
        return listFiles == null ? new File[0] : listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(File file, String name) {
        n.d(name, "name");
        a0 a0Var = a0.f20743a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1));
        n.d(format, "java.lang.String.format(format, *args)");
        return new xk.f(format).a(name);
    }

    public static final File[] n() {
        File f10 = f();
        if (f10 == null) {
            return new File[0];
        }
        File[] listFiles = f10.listFiles(new FilenameFilter() { // from class: x4.i
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean o10;
                o10 = k.o(file, str);
                return o10;
            }
        });
        return listFiles == null ? new File[0] : listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(File file, String name) {
        n.d(name, "name");
        a0 a0Var = a0.f20743a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1));
        n.d(format, "java.lang.String.format(format, *args)");
        return new xk.f(format).a(name);
    }

    public static final File[] p() {
        File f10 = f();
        if (f10 == null) {
            return new File[0];
        }
        File[] listFiles = f10.listFiles(new FilenameFilter() { // from class: x4.h
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean q10;
                q10 = k.q(file, str);
                return q10;
            }
        });
        return listFiles == null ? new File[0] : listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(File file, String name) {
        n.d(name, "name");
        a0 a0Var = a0.f20743a;
        String format = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3));
        n.d(format, "java.lang.String.format(format, *args)");
        return new xk.f(format).a(name);
    }

    public static final JSONObject r(String str, boolean z10) {
        File f10 = f();
        if (f10 != null && str != null) {
            try {
                return new JSONObject(n0.t0(new FileInputStream(new File(f10, str))));
            } catch (Exception unused) {
                if (z10) {
                    d(str);
                }
            }
        }
        return null;
    }

    public static final void s(String str, JSONArray reports, i0.b bVar) {
        n.e(reports, "reports");
        if (reports.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, reports.toString());
            JSONObject D = n0.D();
            if (D != null) {
                Iterator<String> keys = D.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, D.get(next));
                }
            }
            i0.c cVar = i0.f17005n;
            a0 a0Var = a0.f20743a;
            String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{e0.m()}, 1));
            n.d(format, "java.lang.String.format(format, *args)");
            cVar.A(null, format, jSONObject, bVar).l();
        } catch (JSONException unused) {
        }
    }

    public static final void t(String str, String str2) {
        File f10 = f();
        if (f10 == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(f10, str));
            byte[] bytes = str2.getBytes(xk.d.f31393b);
            n.d(bytes, "(this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }
}

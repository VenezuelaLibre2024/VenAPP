package am;

import android.util.Log;
import dk.k0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import ql.y;
import xk.q;
import xk.s;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f498a = new e();

    /* renamed from: b, reason: collision with root package name */
    private static final CopyOnWriteArraySet<Logger> f499b = new CopyOnWriteArraySet<>();

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, String> f500c;

    static {
        Map<String, String> s10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = y.class.getPackage();
        String name = r22 == null ? null : r22.getName();
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = y.class.getName();
        kotlin.jvm.internal.n.d(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = yl.e.class.getName();
        kotlin.jvm.internal.n.d(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = ul.e.class.getName();
        kotlin.jvm.internal.n.d(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        s10 = k0.s(linkedHashMap);
        f500c = s10;
    }

    private e() {
    }

    private final void c(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f499b.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(f.f501a);
        }
    }

    private final String d(String str) {
        String N0;
        String str2 = f500c.get(str);
        if (str2 != null) {
            return str2;
        }
        N0 = s.N0(str, 23);
        return N0;
    }

    public final void a(String loggerName, int i10, String message, Throwable th2) {
        int T;
        int min;
        kotlin.jvm.internal.n.e(loggerName, "loggerName");
        kotlin.jvm.internal.n.e(message, "message");
        String d10 = d(loggerName);
        if (Log.isLoggable(d10, i10)) {
            if (th2 != null) {
                message = message + '\n' + ((Object) Log.getStackTraceString(th2));
            }
            int length = message.length();
            int i11 = 0;
            while (i11 < length) {
                T = q.T(message, '\n', i11, false, 4, null);
                if (T == -1) {
                    T = length;
                }
                while (true) {
                    min = Math.min(T, i11 + 4000);
                    String substring = message.substring(i11, min);
                    kotlin.jvm.internal.n.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, d10, substring);
                    if (min >= T) {
                        break;
                    } else {
                        i11 = min;
                    }
                }
                i11 = min + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry<String, String> entry : f500c.entrySet()) {
            c(entry.getKey(), entry.getValue());
        }
    }
}

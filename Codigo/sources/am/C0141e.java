package am;

import android.util.Log;
import dk.C7018k0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C9322n;
import p319ql.C10550y;
import p388ul.C11590e;
import p450xk.C12525q;
import p450xk.C12527s;
import p473yl.C12737e;

/* renamed from: am.e */
/* loaded from: classes3.dex */
public final class C0141e {

    /* renamed from: a */
    public static final C0141e f563a = new C0141e();

    /* renamed from: b */
    private static final CopyOnWriteArraySet<Logger> f564b = new CopyOnWriteArraySet<>();

    /* renamed from: c */
    private static final Map<String, String> f565c;

    static {
        Map<String, String> m20432s;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = C10550y.class.getPackage();
        String name = r22 == null ? null : r22.getName();
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = C10550y.class.getName();
        C9322n.m27780d(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = C12737e.class.getName();
        C9322n.m27780d(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = C11590e.class.getName();
        C9322n.m27780d(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        m20432s = C7018k0.m20432s(linkedHashMap);
        f565c = m20432s;
    }

    private C0141e() {
    }

    /* renamed from: c */
    private final void m641c(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f564b.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(C0142f.f566a);
        }
    }

    /* renamed from: d */
    private final String m642d(String str) {
        String m41109N0;
        String str2 = f565c.get(str);
        if (str2 != null) {
            return str2;
        }
        m41109N0 = C12527s.m41109N0(str, 23);
        return m41109N0;
    }

    /* renamed from: a */
    public final void m643a(String loggerName, int i10, String message, Throwable th2) {
        int m41071T;
        int min;
        C9322n.m27781e(loggerName, "loggerName");
        C9322n.m27781e(message, "message");
        String m642d = m642d(loggerName);
        if (Log.isLoggable(m642d, i10)) {
            if (th2 != null) {
                message = message + '\n' + ((Object) Log.getStackTraceString(th2));
            }
            int length = message.length();
            int i11 = 0;
            while (i11 < length) {
                m41071T = C12525q.m41071T(message, '\n', i11, false, 4, null);
                if (m41071T == -1) {
                    m41071T = length;
                }
                while (true) {
                    min = Math.min(m41071T, i11 + 4000);
                    String substring = message.substring(i11, min);
                    C9322n.m27780d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, m642d, substring);
                    if (min >= m41071T) {
                        break;
                    } else {
                        i11 = min;
                    }
                }
                i11 = min + 1;
            }
        }
    }

    /* renamed from: b */
    public final void m644b() {
        for (Map.Entry<String, String> entry : f565c.entrySet()) {
            m641c(entry.getKey(), entry.getValue());
        }
    }
}

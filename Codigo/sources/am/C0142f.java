package am;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.C9322n;

/* renamed from: am.f */
/* loaded from: classes3.dex */
public final class C0142f extends Handler {

    /* renamed from: a */
    public static final C0142f f566a = new C0142f();

    private C0142f() {
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        int m646b;
        C9322n.m27781e(record, "record");
        C0141e c0141e = C0141e.f563a;
        String loggerName = record.getLoggerName();
        C9322n.m27780d(loggerName, "record.loggerName");
        m646b = C0143g.m646b(record);
        String message = record.getMessage();
        C9322n.m27780d(message, "record.message");
        c0141e.m643a(loggerName, m646b, message, record.getThrown());
    }
}

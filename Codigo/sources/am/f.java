package am;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

/* loaded from: classes3.dex */
public final class f extends Handler {

    /* renamed from: a */
    public static final f f501a = new f();

    private f() {
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        int b10;
        kotlin.jvm.internal.n.e(record, "record");
        e eVar = e.f498a;
        String loggerName = record.getLoggerName();
        kotlin.jvm.internal.n.d(loggerName, "record.loggerName");
        b10 = g.b(record);
        String message = record.getMessage();
        kotlin.jvm.internal.n.d(message, "record.message");
        eVar.a(loggerName, b10, message, record.getThrown());
    }
}

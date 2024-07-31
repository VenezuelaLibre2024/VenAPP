package am;

import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: am.g */
/* loaded from: classes3.dex */
public final class C0143g {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final int m646b(LogRecord logRecord) {
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
    }
}

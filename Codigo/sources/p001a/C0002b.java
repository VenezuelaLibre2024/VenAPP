package p001a;

/* renamed from: a.b */
/* loaded from: classes.dex */
public final class C0002b {

    /* renamed from: a */
    private static final String f3a = "_COROUTINE";

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final StackTraceElement m4b(Throwable th2, String str) {
        StackTraceElement stackTraceElement = th2.getStackTrace()[0];
        return new StackTraceElement(f3a + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}

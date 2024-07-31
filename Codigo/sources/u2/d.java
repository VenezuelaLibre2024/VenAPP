package u2;

/* loaded from: classes.dex */
public class d implements t2.d {
    @Override // t2.d
    public String a(StackTraceElement stackTraceElement) {
        return "";
    }

    @Override // t2.d
    public String b(StackTraceElement stackTraceElement, boolean z10, boolean z11) {
        String e10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(stackTraceElement.getClassName());
        sb2.append(".");
        sb2.append(stackTraceElement.getMethodName());
        if (stackTraceElement.isNativeMethod()) {
            e10 = d();
        } else if (stackTraceElement.getFileName() == null || stackTraceElement.getFileName().length() <= 0) {
            e10 = e();
        } else {
            sb2.append("(");
            sb2.append(stackTraceElement.getFileName());
            if (stackTraceElement.getLineNumber() >= 0) {
                sb2.append(":");
                sb2.append(stackTraceElement.getLineNumber());
            }
            e10 = ")";
        }
        sb2.append(e10);
        if (z11) {
            sb2.append(c(stackTraceElement));
        }
        return sb2.toString();
    }

    @Override // t2.d
    public String c(StackTraceElement stackTraceElement) {
        StringBuilder sb2 = new StringBuilder();
        String className = stackTraceElement.getClassName();
        Class<?> a10 = a.f27020b.a(className);
        if (a10 != null) {
            sb2.append(t2.a.m(t2.a.l(a10), t2.a.q(a.f27019a, a10, t2.a.n(className))));
        }
        return sb2.toString();
    }

    public String d() {
        return "(Native Method)";
    }

    public String e() {
        return "(Unknown Source)";
    }
}

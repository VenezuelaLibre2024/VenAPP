package p372u2;

import p357t2.AbstractC10978a;
import p357t2.InterfaceC10981d;

/* renamed from: u2.d */
/* loaded from: classes.dex */
public class C11305d implements InterfaceC10981d {
    @Override // p357t2.InterfaceC10981d
    /* renamed from: a */
    public String mo33527a(StackTraceElement stackTraceElement) {
        return "";
    }

    @Override // p357t2.InterfaceC10981d
    /* renamed from: b */
    public String mo33528b(StackTraceElement stackTraceElement, boolean z10, boolean z11) {
        String m35307e;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(stackTraceElement.getClassName());
        sb2.append(".");
        sb2.append(stackTraceElement.getMethodName());
        if (stackTraceElement.isNativeMethod()) {
            m35307e = m35306d();
        } else if (stackTraceElement.getFileName() == null || stackTraceElement.getFileName().length() <= 0) {
            m35307e = m35307e();
        } else {
            sb2.append("(");
            sb2.append(stackTraceElement.getFileName());
            if (stackTraceElement.getLineNumber() >= 0) {
                sb2.append(":");
                sb2.append(stackTraceElement.getLineNumber());
            }
            m35307e = ")";
        }
        sb2.append(m35307e);
        if (z11) {
            sb2.append(mo33529c(stackTraceElement));
        }
        return sb2.toString();
    }

    @Override // p357t2.InterfaceC10981d
    /* renamed from: c */
    public String mo33529c(StackTraceElement stackTraceElement) {
        StringBuilder sb2 = new StringBuilder();
        String className = stackTraceElement.getClassName();
        Class<?> mo33525a = C11302a.f29322b.mo33525a(className);
        if (mo33525a != null) {
            sb2.append(AbstractC10978a.m33520m(AbstractC10978a.m33519l(mo33525a), AbstractC10978a.m33524q(C11302a.f29321a, mo33525a, AbstractC10978a.m33521n(className))));
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public String m35306d() {
        return "(Native Method)";
    }

    /* renamed from: e */
    public String m35307e() {
        return "(Unknown Source)";
    }
}

package p145hj;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: hj.a */
/* loaded from: classes3.dex */
public final class C7743a extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;

    /* renamed from: a */
    private final List<Throwable> f18463a;

    /* renamed from: b */
    private final String f18464b;

    /* renamed from: c */
    private Throwable f18465c;

    /* renamed from: hj.a$a */
    /* loaded from: classes3.dex */
    static final class a extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        a() {
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hj.a$b */
    /* loaded from: classes3.dex */
    public static abstract class b {
        b() {
        }

        /* renamed from: a */
        abstract void mo23646a(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hj.a$c */
    /* loaded from: classes3.dex */
    public static final class c extends b {

        /* renamed from: a */
        private final PrintStream f18466a;

        c(PrintStream printStream) {
            this.f18466a = printStream;
        }

        @Override // p145hj.C7743a.b
        /* renamed from: a */
        void mo23646a(Object obj) {
            this.f18466a.println(obj);
        }
    }

    /* renamed from: hj.a$d */
    /* loaded from: classes3.dex */
    static final class d extends b {

        /* renamed from: a */
        private final PrintWriter f18467a;

        d(PrintWriter printWriter) {
            this.f18467a = printWriter;
        }

        @Override // p145hj.C7743a.b
        /* renamed from: a */
        void mo23646a(Object obj) {
            this.f18467a.println(obj);
        }
    }

    public C7743a(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Object obj : iterable) {
                if (obj instanceof C7743a) {
                    linkedHashSet.addAll(((C7743a) obj).m23644b());
                } else {
                    linkedHashSet.add(obj == null ? new NullPointerException("Throwable was null!") : obj);
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            throw new IllegalArgumentException("errors is empty");
        }
        arrayList.addAll(linkedHashSet);
        List<Throwable> unmodifiableList = Collections.unmodifiableList(arrayList);
        this.f18463a = unmodifiableList;
        this.f18464b = unmodifiableList.size() + " exceptions occurred. ";
    }

    public C7743a(Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    /* renamed from: a */
    private void m23641a(StringBuilder sb2, Throwable th2, String str) {
        sb2.append(str);
        sb2.append(th2);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            sb2.append("\t\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        if (th2.getCause() != null) {
            sb2.append("\tCaused by: ");
            m23641a(sb2, th2.getCause(), "");
        }
    }

    /* renamed from: c */
    private List<Throwable> m23642c(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th2.getCause();
        if (cause != null && cause != th2) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    private void m23643e(b bVar) {
        StringBuilder sb2 = new StringBuilder(RecognitionOptions.ITF);
        sb2.append(this);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb2.append("\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        int i10 = 1;
        for (Throwable th2 : this.f18463a) {
            sb2.append("  ComposedException ");
            sb2.append(i10);
            sb2.append(" :\n");
            m23641a(sb2, th2, "\t");
            i10++;
        }
        bVar.mo23646a(sb2.toString());
    }

    /* renamed from: b */
    public List<Throwable> m23644b() {
        return this.f18463a;
    }

    /* renamed from: d */
    Throwable m23645d(Throwable th2) {
        Throwable cause = th2.getCause();
        if (cause == null || this.f18465c == cause) {
            return th2;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                break;
            }
            cause = cause2;
        }
        return cause;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        if (this.f18465c == null) {
            a aVar = new a();
            HashSet hashSet = new HashSet();
            Iterator<Throwable> it = this.f18463a.iterator();
            Throwable th2 = aVar;
            while (it.hasNext()) {
                Throwable next = it.next();
                if (!hashSet.contains(next)) {
                    hashSet.add(next);
                    for (Throwable th3 : m23642c(next)) {
                        if (hashSet.contains(th3)) {
                            next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th3);
                        }
                    }
                    try {
                        th2.initCause(next);
                    } catch (Throwable unused) {
                    }
                    th2 = m23645d(th2);
                }
            }
            this.f18465c = aVar;
        }
        return this.f18465c;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f18464b;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        m23643e(new c(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        m23643e(new d(printWriter));
    }
}

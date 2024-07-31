package hj;

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

/* loaded from: classes3.dex */
public final class a extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;

    /* renamed from: a, reason: collision with root package name */
    private final List<Throwable> f16813a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16814b;

    /* renamed from: c, reason: collision with root package name */
    private Throwable f16815c;

    /* renamed from: hj.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0278a extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        C0278a() {
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class b {
        b() {
        }

        abstract void a(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        private final PrintStream f16816a;

        c(PrintStream printStream) {
            this.f16816a = printStream;
        }

        @Override // hj.a.b
        void a(Object obj) {
            this.f16816a.println(obj);
        }
    }

    /* loaded from: classes3.dex */
    static final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        private final PrintWriter f16817a;

        d(PrintWriter printWriter) {
            this.f16817a = printWriter;
        }

        @Override // hj.a.b
        void a(Object obj) {
            this.f16817a.println(obj);
        }
    }

    public a(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Object obj : iterable) {
                if (obj instanceof a) {
                    linkedHashSet.addAll(((a) obj).b());
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
        this.f16813a = unmodifiableList;
        this.f16814b = unmodifiableList.size() + " exceptions occurred. ";
    }

    public a(Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    private void a(StringBuilder sb2, Throwable th2, String str) {
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
            a(sb2, th2.getCause(), "");
        }
    }

    private List<Throwable> c(Throwable th2) {
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

    private void e(b bVar) {
        StringBuilder sb2 = new StringBuilder(RecognitionOptions.ITF);
        sb2.append(this);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb2.append("\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        int i10 = 1;
        for (Throwable th2 : this.f16813a) {
            sb2.append("  ComposedException ");
            sb2.append(i10);
            sb2.append(" :\n");
            a(sb2, th2, "\t");
            i10++;
        }
        bVar.a(sb2.toString());
    }

    public List<Throwable> b() {
        return this.f16813a;
    }

    Throwable d(Throwable th2) {
        Throwable cause = th2.getCause();
        if (cause == null || this.f16815c == cause) {
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
        if (this.f16815c == null) {
            C0278a c0278a = new C0278a();
            HashSet hashSet = new HashSet();
            Iterator<Throwable> it = this.f16813a.iterator();
            Throwable th2 = c0278a;
            while (it.hasNext()) {
                Throwable next = it.next();
                if (!hashSet.contains(next)) {
                    hashSet.add(next);
                    for (Throwable th3 : c(next)) {
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
                    th2 = d(th2);
                }
            }
            this.f16815c = c0278a;
        }
        return this.f16815c;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f16814b;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        e(new c(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        e(new d(printWriter));
    }
}

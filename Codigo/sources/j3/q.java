package j3;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class q extends Exception {

    /* renamed from: r, reason: collision with root package name */
    private static final StackTraceElement[] f19689r = new StackTraceElement[0];
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    private final List<Throwable> f19690a;

    /* renamed from: b, reason: collision with root package name */
    private h3.f f19691b;

    /* renamed from: c, reason: collision with root package name */
    private h3.a f19692c;

    /* renamed from: d, reason: collision with root package name */
    private Class<?> f19693d;

    /* renamed from: e, reason: collision with root package name */
    private String f19694e;

    /* renamed from: f, reason: collision with root package name */
    private Exception f19695f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements Appendable {

        /* renamed from: a, reason: collision with root package name */
        private final Appendable f19696a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f19697b = true;

        a(Appendable appendable) {
            this.f19696a = appendable;
        }

        private CharSequence a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c10) {
            if (this.f19697b) {
                this.f19697b = false;
                this.f19696a.append("  ");
            }
            this.f19697b = c10 == '\n';
            this.f19696a.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence a10 = a(charSequence);
            return append(a10, 0, a10.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i10, int i11) {
            CharSequence a10 = a(charSequence);
            boolean z10 = false;
            if (this.f19697b) {
                this.f19697b = false;
                this.f19696a.append("  ");
            }
            if (a10.length() > 0 && a10.charAt(i11 - 1) == '\n') {
                z10 = true;
            }
            this.f19697b = z10;
            this.f19696a.append(a10, i10, i11);
            return this;
        }
    }

    public q(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    public q(String str, Throwable th2) {
        this(str, (List<Throwable>) Collections.singletonList(th2));
    }

    public q(String str, List<Throwable> list) {
        this.f19694e = str;
        setStackTrace(f19689r);
        this.f19690a = list;
    }

    private void a(Throwable th2, List<Throwable> list) {
        if (!(th2 instanceof q)) {
            list.add(th2);
            return;
        }
        Iterator<Throwable> it = ((q) th2).e().iterator();
        while (it.hasNext()) {
            a(it.next(), list);
        }
    }

    private static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void c(List<Throwable> list, Appendable appendable) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th2 = list.get(i10);
            if (th2 instanceof q) {
                ((q) th2).h(appendable);
            } else {
                d(th2, appendable);
            }
            i10 = i11;
        }
    }

    private static void d(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    private void h(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public List<Throwable> e() {
        return this.f19690a;
    }

    public List<Throwable> f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public void g(String str) {
        List<Throwable> f10 = f();
        int size = f10.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Root cause (");
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i(str, sb2.toString(), f10.get(i10));
            i10 = i11;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f19694e);
        sb2.append(this.f19693d != null ? ", " + this.f19693d : "");
        sb2.append(this.f19692c != null ? ", " + this.f19692c : "");
        sb2.append(this.f19691b != null ? ", " + this.f19691b : "");
        List<Throwable> f10 = f();
        if (f10.isEmpty()) {
            return sb2.toString();
        }
        if (f10.size() == 1) {
            str = "\nThere was 1 root cause:";
        } else {
            sb2.append("\nThere were ");
            sb2.append(f10.size());
            str = " root causes:";
        }
        sb2.append(str);
        for (Throwable th2 : f10) {
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(h3.f fVar, h3.a aVar) {
        j(fVar, aVar, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(h3.f fVar, h3.a aVar, Class<?> cls) {
        this.f19691b = fVar;
        this.f19692c = aVar;
        this.f19693d = cls;
    }

    public void k(Exception exc) {
        this.f19695f = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        h(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        h(printWriter);
    }
}

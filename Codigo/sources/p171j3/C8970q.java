package p171j3;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p129h3.EnumC7617a;
import p129h3.InterfaceC7622f;

/* renamed from: j3.q */
/* loaded from: classes.dex */
public final class C8970q extends Exception {

    /* renamed from: r */
    private static final StackTraceElement[] f21468r = new StackTraceElement[0];
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private final List<Throwable> f21469a;

    /* renamed from: b */
    private InterfaceC7622f f21470b;

    /* renamed from: c */
    private EnumC7617a f21471c;

    /* renamed from: d */
    private Class<?> f21472d;

    /* renamed from: e */
    private String f21473e;

    /* renamed from: f */
    private Exception f21474f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j3.q$a */
    /* loaded from: classes.dex */
    public static final class a implements Appendable {

        /* renamed from: a */
        private final Appendable f21475a;

        /* renamed from: b */
        private boolean f21476b = true;

        a(Appendable appendable) {
            this.f21475a = appendable;
        }

        /* renamed from: a */
        private CharSequence m26323a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c10) {
            if (this.f21476b) {
                this.f21476b = false;
                this.f21475a.append("  ");
            }
            this.f21476b = c10 == '\n';
            this.f21475a.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence m26323a = m26323a(charSequence);
            return append(m26323a, 0, m26323a.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i10, int i11) {
            CharSequence m26323a = m26323a(charSequence);
            boolean z10 = false;
            if (this.f21476b) {
                this.f21476b = false;
                this.f21475a.append("  ");
            }
            if (m26323a.length() > 0 && m26323a.charAt(i11 - 1) == '\n') {
                z10 = true;
            }
            this.f21476b = z10;
            this.f21475a.append(m26323a, i10, i11);
            return this;
        }
    }

    public C8970q(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    public C8970q(String str, Throwable th2) {
        this(str, (List<Throwable>) Collections.singletonList(th2));
    }

    public C8970q(String str, List<Throwable> list) {
        this.f21473e = str;
        setStackTrace(f21468r);
        this.f21469a = list;
    }

    /* renamed from: a */
    private void m26312a(Throwable th2, List<Throwable> list) {
        if (!(th2 instanceof C8970q)) {
            list.add(th2);
            return;
        }
        Iterator<Throwable> it = ((C8970q) th2).m26317e().iterator();
        while (it.hasNext()) {
            m26312a(it.next(), list);
        }
    }

    /* renamed from: b */
    private static void m26313b(List<Throwable> list, Appendable appendable) {
        try {
            m26314c(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: c */
    private static void m26314c(List<Throwable> list, Appendable appendable) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th2 = list.get(i10);
            if (th2 instanceof C8970q) {
                ((C8970q) th2).m26316h(appendable);
            } else {
                m26315d(th2, appendable);
            }
            i10 = i11;
        }
    }

    /* renamed from: d */
    private static void m26315d(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    /* renamed from: h */
    private void m26316h(Appendable appendable) {
        m26315d(this, appendable);
        m26313b(m26317e(), new a(appendable));
    }

    /* renamed from: e */
    public List<Throwable> m26317e() {
        return this.f21469a;
    }

    /* renamed from: f */
    public List<Throwable> m26318f() {
        ArrayList arrayList = new ArrayList();
        m26312a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    /* renamed from: g */
    public void m26319g(String str) {
        List<Throwable> m26318f = m26318f();
        int size = m26318f.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Root cause (");
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i(str, sb2.toString(), m26318f.get(i10));
            i10 = i11;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f21473e);
        sb2.append(this.f21472d != null ? ", " + this.f21472d : "");
        sb2.append(this.f21471c != null ? ", " + this.f21471c : "");
        sb2.append(this.f21470b != null ? ", " + this.f21470b : "");
        List<Throwable> m26318f = m26318f();
        if (m26318f.isEmpty()) {
            return sb2.toString();
        }
        if (m26318f.size() == 1) {
            str = "\nThere was 1 root cause:";
        } else {
            sb2.append("\nThere were ");
            sb2.append(m26318f.size());
            str = " root causes:";
        }
        sb2.append(str);
        for (Throwable th2 : m26318f) {
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
    /* renamed from: i */
    public void m26320i(InterfaceC7622f interfaceC7622f, EnumC7617a enumC7617a) {
        m26321j(interfaceC7622f, enumC7617a, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m26321j(InterfaceC7622f interfaceC7622f, EnumC7617a enumC7617a, Class<?> cls) {
        this.f21470b = interfaceC7622f;
        this.f21471c = enumC7617a;
        this.f21472d = cls;
    }

    /* renamed from: k */
    public void m26322k(Exception exc) {
        this.f21474f = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        m26316h(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        m26316h(printWriter);
    }
}

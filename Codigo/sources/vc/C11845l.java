package vc;

import ad.C0103f;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import sc.C10889g;

/* renamed from: vc.l */
/* loaded from: classes.dex */
class C11845l {

    /* renamed from: d */
    private static final FilenameFilter f31244d = new FilenameFilter() { // from class: vc.j
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean m37752d;
            m37752d = C11845l.m37752d(file, str);
            return m37752d;
        }
    };

    /* renamed from: e */
    private static final Comparator<File> f31245e = new Comparator() { // from class: vc.k
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m37753e;
            m37753e = C11845l.m37753e((File) obj, (File) obj2);
            return m37753e;
        }
    };

    /* renamed from: a */
    private final C0103f f31246a;

    /* renamed from: b */
    private String f31247b = null;

    /* renamed from: c */
    private String f31248c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11845l(C0103f c0103f) {
        this.f31246a = c0103f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ boolean m37752d(File file, String str) {
        return str.startsWith("aqs.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ int m37753e(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    /* renamed from: f */
    private static void m37754f(C0103f c0103f, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            c0103f.m461o(str, "aqs." + str2).createNewFile();
        } catch (IOException e10) {
            C10889g.m33216f().m33226l("Failed to persist App Quality Sessions session id.", e10);
        }
    }

    /* renamed from: g */
    static String m37755g(C0103f c0103f, String str) {
        List<File> m462p = c0103f.m462p(str, f31244d);
        if (!m462p.isEmpty()) {
            return ((File) Collections.min(m462p, f31245e)).getName().substring(4);
        }
        C10889g.m33216f().m33225k("Unable to read App Quality Sessions session id.");
        return null;
    }

    /* renamed from: c */
    public synchronized String m37756c(String str) {
        if (Objects.equals(this.f31247b, str)) {
            return this.f31248c;
        }
        return m37755g(this.f31246a, str);
    }

    /* renamed from: h */
    public synchronized void m37757h(String str) {
        if (!Objects.equals(this.f31248c, str)) {
            m37754f(this.f31246a, this.f31247b, str);
            this.f31248c = str;
        }
    }

    /* renamed from: i */
    public synchronized void m37758i(String str) {
        if (!Objects.equals(this.f31247b, str)) {
            m37754f(this.f31246a, str, this.f31248c);
            this.f31247b = str;
        }
    }
}

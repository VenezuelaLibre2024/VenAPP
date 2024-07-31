package ad;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p211l2.C9344a;
import sc.C10889g;

/* renamed from: ad.f */
/* loaded from: classes.dex */
public class C0103f {

    /* renamed from: a */
    private final File f373a;

    /* renamed from: b */
    private final File f374b;

    /* renamed from: c */
    private final File f375c;

    /* renamed from: d */
    private final File f376d;

    /* renamed from: e */
    private final File f377e;

    /* renamed from: f */
    private final File f378f;

    public C0103f(Context context) {
        String str;
        File filesDir = context.getFilesDir();
        this.f373a = filesDir;
        if (m448v()) {
            str = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator + m447u(C9344a.m27835a());
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File m443q = m443q(new File(filesDir, str));
        this.f374b = m443q;
        this.f375c = m443q(new File(m443q, "open-sessions"));
        this.f376d = m443q(new File(m443q, "reports"));
        this.f377e = m443q(new File(m443q, "priority-reports"));
        this.f378f = m443q(new File(m443q, "native-reports"));
    }

    /* renamed from: a */
    private void m441a(File file) {
        if (file.exists() && m445s(file)) {
            C10889g.m33216f().m33217b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    /* renamed from: n */
    private File m442n(String str) {
        return m444r(new File(this.f375c, str));
    }

    /* renamed from: q */
    private static synchronized File m443q(File file) {
        synchronized (C0103f.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                C10889g.m33216f().m33217b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                C10889g.m33216f().m33219d("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        }
    }

    /* renamed from: r */
    private static File m444r(File file) {
        file.mkdirs();
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static boolean m445s(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                m445s(file2);
            }
        }
        return file.delete();
    }

    /* renamed from: t */
    private static <T> List<T> m446t(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    /* renamed from: u */
    static String m447u(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    /* renamed from: v */
    private static boolean m448v() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* renamed from: b */
    public void m449b() {
        m441a(new File(this.f373a, ".com.google.firebase.crashlytics"));
        m441a(new File(this.f373a, ".com.google.firebase.crashlytics-ndk"));
        if (m448v()) {
            m441a(new File(this.f373a, ".com.google.firebase.crashlytics.files.v1"));
        }
    }

    /* renamed from: c */
    public boolean m450c(String str) {
        return m445s(new File(this.f375c, str));
    }

    /* renamed from: d */
    public List<String> m451d() {
        return m446t(this.f375c.list());
    }

    /* renamed from: e */
    public File m452e(String str) {
        return new File(this.f374b, str);
    }

    /* renamed from: f */
    public List<File> m453f(FilenameFilter filenameFilter) {
        return m446t(this.f374b.listFiles(filenameFilter));
    }

    /* renamed from: g */
    public File m454g(String str) {
        return new File(this.f378f, str);
    }

    /* renamed from: h */
    public List<File> m455h() {
        return m446t(this.f378f.listFiles());
    }

    /* renamed from: i */
    public File m456i(String str) {
        return m444r(new File(m442n(str), "native"));
    }

    /* renamed from: j */
    public File m457j(String str) {
        return new File(this.f377e, str);
    }

    /* renamed from: k */
    public List<File> m458k() {
        return m446t(this.f377e.listFiles());
    }

    /* renamed from: l */
    public File m459l(String str) {
        return new File(this.f376d, str);
    }

    /* renamed from: m */
    public List<File> m460m() {
        return m446t(this.f376d.listFiles());
    }

    /* renamed from: o */
    public File m461o(String str, String str2) {
        return new File(m442n(str), str2);
    }

    /* renamed from: p */
    public List<File> m462p(String str, FilenameFilter filenameFilter) {
        return m446t(m442n(str).listFiles(filenameFilter));
    }
}

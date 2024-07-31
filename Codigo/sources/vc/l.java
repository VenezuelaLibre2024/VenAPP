package vc;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
class l {

    /* renamed from: d, reason: collision with root package name */
    private static final FilenameFilter f28810d = new FilenameFilter() { // from class: vc.j
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean d10;
            d10 = l.d(file, str);
            return d10;
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final Comparator<File> f28811e = new Comparator() { // from class: vc.k
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int e10;
            e10 = l.e((File) obj, (File) obj2);
            return e10;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final ad.f f28812a;

    /* renamed from: b, reason: collision with root package name */
    private String f28813b = null;

    /* renamed from: c, reason: collision with root package name */
    private String f28814c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(ad.f fVar) {
        this.f28812a = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(File file, String str) {
        return str.startsWith("aqs.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    private static void f(ad.f fVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            fVar.o(str, "aqs." + str2).createNewFile();
        } catch (IOException e10) {
            sc.g.f().l("Failed to persist App Quality Sessions session id.", e10);
        }
    }

    static String g(ad.f fVar, String str) {
        List<File> p10 = fVar.p(str, f28810d);
        if (!p10.isEmpty()) {
            return ((File) Collections.min(p10, f28811e)).getName().substring(4);
        }
        sc.g.f().k("Unable to read App Quality Sessions session id.");
        return null;
    }

    public synchronized String c(String str) {
        if (Objects.equals(this.f28813b, str)) {
            return this.f28814c;
        }
        return g(this.f28812a, str);
    }

    public synchronized void h(String str) {
        if (!Objects.equals(this.f28814c, str)) {
            f(this.f28812a, this.f28813b, str);
            this.f28814c = str;
        }
    }

    public synchronized void i(String str) {
        if (!Objects.equals(this.f28813b, str)) {
            f(this.f28812a, str, this.f28814c);
            this.f28813b = str;
        }
    }
}

package ad;

import cd.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import sc.g;
import vc.m;
import vc.u;
import wc.n;
import xc.f0;
import yc.j;

/* loaded from: classes.dex */
public class e {

    /* renamed from: e, reason: collision with root package name */
    private static final Charset f313e = Charset.forName("UTF-8");

    /* renamed from: f, reason: collision with root package name */
    private static final int f314f = 15;

    /* renamed from: g, reason: collision with root package name */
    private static final j f315g = new j();

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator<? super File> f316h = new Comparator() { // from class: ad.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int u10;
            u10 = e.u((File) obj, (File) obj2);
            return u10;
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private static final FilenameFilter f317i = new FilenameFilter() { // from class: ad.d
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean v10;
            v10 = e.v(file, str);
            return v10;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f318a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    private final f f319b;

    /* renamed from: c, reason: collision with root package name */
    private final i f320c;

    /* renamed from: d, reason: collision with root package name */
    private final m f321d;

    public e(f fVar, i iVar, m mVar) {
        this.f319b = fVar;
        this.f320c = iVar;
        this.f321d = mVar;
    }

    private static String A(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f313e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    private void B(File file, f0.d dVar, String str, f0.a aVar) {
        String d10 = this.f321d.d(str);
        try {
            j jVar = f315g;
            F(this.f319b.g(str), jVar.M(jVar.L(A(file)).s(dVar).p(aVar).o(d10)));
        } catch (IOException e10) {
            g.f().l("Could not synthesize final native report file for " + file, e10);
        }
    }

    private void C(String str, long j10) {
        boolean z10;
        List<File> p10 = this.f319b.p(str, f317i);
        if (p10.isEmpty()) {
            g.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(p10);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z10 = false;
            for (File file : p10) {
                try {
                    arrayList.add(f315g.j(A(file)));
                } catch (IOException e10) {
                    g.f().l("Could not add event to report for " + file, e10);
                }
                if (z10 || s(file.getName())) {
                    z10 = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            D(this.f319b.o(str, "report"), arrayList, j10, z10, n.m(str, this.f319b), this.f321d.d(str));
        } else {
            g.f().k("Could not parse event files for session " + str);
        }
    }

    private void D(File file, List<f0.e.d> list, long j10, boolean z10, String str, String str2) {
        try {
            j jVar = f315g;
            f0 q10 = jVar.L(A(file)).t(j10, z10, str).o(str2).q(list);
            f0.e m10 = q10.m();
            if (m10 == null) {
                return;
            }
            g.f().b("appQualitySessionId: " + str2);
            F(z10 ? this.f319b.j(m10.i()) : this.f319b.l(m10.i()), jVar.M(q10));
        } catch (IOException e10) {
            g.f().l("Could not synthesize final report file for " + file, e10);
        }
    }

    private int E(String str, int i10) {
        List<File> p10 = this.f319b.p(str, new FilenameFilter() { // from class: ad.a
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                boolean t10;
                t10 = e.t(file, str2);
                return t10;
            }
        });
        Collections.sort(p10, new Comparator() { // from class: ad.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int x10;
                x10 = e.x((File) obj, (File) obj2);
                return x10;
            }
        });
        return f(p10, i10);
    }

    private static void F(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f313e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static void G(File file, String str, long j10) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f313e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j10));
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private SortedSet<String> e(String str) {
        this.f319b.b();
        SortedSet<String> p10 = p();
        if (str != null) {
            p10.remove(str);
        }
        if (p10.size() <= 8) {
            return p10;
        }
        while (p10.size() > 8) {
            String last = p10.last();
            g.f().b("Removing session over cap: " + last);
            this.f319b.c(last);
            p10.remove(last);
        }
        return p10;
    }

    private static int f(List<File> list, int i10) {
        int size = list.size();
        for (File file : list) {
            if (size <= i10) {
                return size;
            }
            f.s(file);
            size--;
        }
        return size;
    }

    private void g() {
        int i10 = this.f320c.b().f7046a.f7058b;
        List<File> n10 = n();
        int size = n10.size();
        if (size <= i10) {
            return;
        }
        Iterator<File> it = n10.subList(i10, size).iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    private static long h(long j10) {
        return j10 * 1000;
    }

    private void j(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    private static String m(int i10, boolean z10) {
        return "event" + String.format(Locale.US, "%010d", Integer.valueOf(i10)) + (z10 ? "_" : "");
    }

    private List<File> n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f319b.k());
        arrayList.addAll(this.f319b.h());
        Comparator<? super File> comparator = f316h;
        Collections.sort(arrayList, comparator);
        List<File> m10 = this.f319b.m();
        Collections.sort(m10, comparator);
        arrayList.addAll(m10);
        return arrayList;
    }

    private static String o(String str) {
        return str.substring(0, f314f);
    }

    private static boolean s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean v(File file, String str) {
        return str.startsWith("event");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(File file, File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public void i() {
        j(this.f319b.m());
        j(this.f319b.k());
        j(this.f319b.h());
    }

    public void k(String str, long j10) {
        for (String str2 : e(str)) {
            g.f().i("Finalizing report for session " + str2);
            C(str2, j10);
            this.f319b.c(str2);
        }
        g();
    }

    public void l(String str, f0.d dVar, f0.a aVar) {
        File o10 = this.f319b.o(str, "report");
        g.f().b("Writing native session report for " + str + " to file: " + o10);
        B(o10, dVar, str, aVar);
    }

    public SortedSet<String> p() {
        return new TreeSet(this.f319b.d()).descendingSet();
    }

    public long q(String str) {
        return this.f319b.o(str, "start-time").lastModified();
    }

    public boolean r() {
        return (this.f319b.m().isEmpty() && this.f319b.k().isEmpty() && this.f319b.h().isEmpty()) ? false : true;
    }

    public List<u> w() {
        List<File> n10 = n();
        ArrayList arrayList = new ArrayList();
        for (File file : n10) {
            try {
                arrayList.add(u.a(f315g.L(A(file)), file.getName(), file));
            } catch (IOException e10) {
                g.f().l("Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        return arrayList;
    }

    public void y(f0.e.d dVar, String str, boolean z10) {
        int i10 = this.f320c.b().f7046a.f7057a;
        try {
            F(this.f319b.o(str, m(this.f318a.getAndIncrement(), z10)), f315g.k(dVar));
        } catch (IOException e10) {
            g.f().l("Could not persist event for session " + str, e10);
        }
        E(str, i10);
    }

    public void z(f0 f0Var) {
        f0.e m10 = f0Var.m();
        if (m10 == null) {
            g.f().b("Could not get session for report");
            return;
        }
        String i10 = m10.i();
        try {
            F(this.f319b.o(i10, "report"), f315g.M(f0Var));
            G(this.f319b.o(i10, "start-time"), "", m10.l());
        } catch (IOException e10) {
            g.f().c("Could not persist report for session " + i10, e10);
        }
    }
}

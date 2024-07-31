package ad;

import cd.InterfaceC1952i;
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
import p420wc.C12161n;
import p442xc.AbstractC12426f0;
import p465yc.C12670j;
import sc.C10889g;
import vc.AbstractC11863u;
import vc.C11847m;

/* renamed from: ad.e */
/* loaded from: classes.dex */
public class C0102e {

    /* renamed from: e */
    private static final Charset f364e = Charset.forName("UTF-8");

    /* renamed from: f */
    private static final int f365f = 15;

    /* renamed from: g */
    private static final C12670j f366g = new C12670j();

    /* renamed from: h */
    private static final Comparator<? super File> f367h = new Comparator() { // from class: ad.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m429u;
            m429u = C0102e.m429u((File) obj, (File) obj2);
            return m429u;
        }
    };

    /* renamed from: i */
    private static final FilenameFilter f368i = new FilenameFilter() { // from class: ad.d
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean m430v;
            m430v = C0102e.m430v(file, str);
            return m430v;
        }
    };

    /* renamed from: a */
    private final AtomicInteger f369a = new AtomicInteger(0);

    /* renamed from: b */
    private final C0103f f370b;

    /* renamed from: c */
    private final InterfaceC1952i f371c;

    /* renamed from: d */
    private final C11847m f372d;

    public C0102e(C0103f c0103f, InterfaceC1952i interfaceC1952i, C11847m c11847m) {
        this.f370b = c0103f;
        this.f371c = interfaceC1952i;
        this.f372d = c11847m;
    }

    /* renamed from: A */
    private static String m408A(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f364e);
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

    /* renamed from: B */
    private void m409B(File file, AbstractC12426f0.d dVar, String str, AbstractC12426f0.a aVar) {
        String m37760d = this.f372d.m37760d(str);
        try {
            C12670j c12670j = f366g;
            m413F(this.f370b.m454g(str), c12670j.m41692M(c12670j.m41691L(m408A(file)).m40188s(dVar).m40185p(aVar).m40184o(m37760d)));
        } catch (IOException e10) {
            C10889g.m33216f().m33226l("Could not synthesize final native report file for " + file, e10);
        }
    }

    /* renamed from: C */
    private void m410C(String str, long j10) {
        boolean z10;
        List<File> m462p = this.f370b.m462p(str, f368i);
        if (m462p.isEmpty()) {
            C10889g.m33216f().m33223i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(m462p);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z10 = false;
            for (File file : m462p) {
                try {
                    arrayList.add(f366g.m41693j(m408A(file)));
                } catch (IOException e10) {
                    C10889g.m33216f().m33226l("Could not add event to report for " + file, e10);
                }
                if (z10 || m427s(file.getName())) {
                    z10 = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            m411D(this.f370b.m461o(str, "report"), arrayList, j10, z10, C12161n.m39001m(str, this.f370b), this.f372d.m37760d(str));
        } else {
            C10889g.m33216f().m33225k("Could not parse event files for session " + str);
        }
    }

    /* renamed from: D */
    private void m411D(File file, List<AbstractC12426f0.e.d> list, long j10, boolean z10, String str, String str2) {
        try {
            C12670j c12670j = f366g;
            AbstractC12426f0 m40186q = c12670j.m41691L(m408A(file)).m40189t(j10, z10, str).m40184o(str2).m40186q(list);
            AbstractC12426f0.e mo40111m = m40186q.mo40111m();
            if (mo40111m == null) {
                return;
            }
            C10889g.m33216f().m33217b("appQualitySessionId: " + str2);
            m413F(z10 ? this.f370b.m457j(mo40111m.mo40208i()) : this.f370b.m459l(mo40111m.mo40208i()), c12670j.m41692M(m40186q));
        } catch (IOException e10) {
            C10889g.m33216f().m33226l("Could not synthesize final report file for " + file, e10);
        }
    }

    /* renamed from: E */
    private int m412E(String str, int i10) {
        List<File> m462p = this.f370b.m462p(str, new FilenameFilter() { // from class: ad.a
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                boolean m428t;
                m428t = C0102e.m428t(file, str2);
                return m428t;
            }
        });
        Collections.sort(m462p, new Comparator() { // from class: ad.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m431x;
                m431x = C0102e.m431x((File) obj, (File) obj2);
                return m431x;
            }
        });
        return m420f(m462p, i10);
    }

    /* renamed from: F */
    private static void m413F(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f364e);
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

    /* renamed from: G */
    private static void m414G(File file, String str, long j10) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f364e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(m422h(j10));
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

    /* renamed from: e */
    private SortedSet<String> m419e(String str) {
        this.f370b.m449b();
        SortedSet<String> m435p = m435p();
        if (str != null) {
            m435p.remove(str);
        }
        if (m435p.size() <= 8) {
            return m435p;
        }
        while (m435p.size() > 8) {
            String last = m435p.last();
            C10889g.m33216f().m33217b("Removing session over cap: " + last);
            this.f370b.m450c(last);
            m435p.remove(last);
        }
        return m435p;
    }

    /* renamed from: f */
    private static int m420f(List<File> list, int i10) {
        int size = list.size();
        for (File file : list) {
            if (size <= i10) {
                return size;
            }
            C0103f.m445s(file);
            size--;
        }
        return size;
    }

    /* renamed from: g */
    private void m421g() {
        int i10 = this.f371c.mo10188b().f7998a.f8010b;
        List<File> m425n = m425n();
        int size = m425n.size();
        if (size <= i10) {
            return;
        }
        Iterator<File> it = m425n.subList(i10, size).iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    /* renamed from: h */
    private static long m422h(long j10) {
        return j10 * 1000;
    }

    /* renamed from: j */
    private void m423j(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    /* renamed from: m */
    private static String m424m(int i10, boolean z10) {
        return "event" + String.format(Locale.US, "%010d", Integer.valueOf(i10)) + (z10 ? "_" : "");
    }

    /* renamed from: n */
    private List<File> m425n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f370b.m458k());
        arrayList.addAll(this.f370b.m455h());
        Comparator<? super File> comparator = f367h;
        Collections.sort(arrayList, comparator);
        List<File> m460m = this.f370b.m460m();
        Collections.sort(m460m, comparator);
        arrayList.addAll(m460m);
        return arrayList;
    }

    /* renamed from: o */
    private static String m426o(String str) {
        return str.substring(0, f365f);
    }

    /* renamed from: s */
    private static boolean m427s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static boolean m428t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static /* synthetic */ int m429u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static /* synthetic */ boolean m430v(File file, String str) {
        return str.startsWith("event");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static int m431x(File file, File file2) {
        return m426o(file.getName()).compareTo(m426o(file2.getName()));
    }

    /* renamed from: i */
    public void m432i() {
        m423j(this.f370b.m460m());
        m423j(this.f370b.m458k());
        m423j(this.f370b.m455h());
    }

    /* renamed from: k */
    public void m433k(String str, long j10) {
        for (String str2 : m419e(str)) {
            C10889g.m33216f().m33223i("Finalizing report for session " + str2);
            m410C(str2, j10);
            this.f370b.m450c(str2);
        }
        m421g();
    }

    /* renamed from: l */
    public void m434l(String str, AbstractC12426f0.d dVar, AbstractC12426f0.a aVar) {
        File m461o = this.f370b.m461o(str, "report");
        C10889g.m33216f().m33217b("Writing native session report for " + str + " to file: " + m461o);
        m409B(m461o, dVar, str, aVar);
    }

    /* renamed from: p */
    public SortedSet<String> m435p() {
        return new TreeSet(this.f370b.m451d()).descendingSet();
    }

    /* renamed from: q */
    public long m436q(String str) {
        return this.f370b.m461o(str, "start-time").lastModified();
    }

    /* renamed from: r */
    public boolean m437r() {
        return (this.f370b.m460m().isEmpty() && this.f370b.m458k().isEmpty() && this.f370b.m455h().isEmpty()) ? false : true;
    }

    /* renamed from: w */
    public List<AbstractC11863u> m438w() {
        List<File> m425n = m425n();
        ArrayList arrayList = new ArrayList();
        for (File file : m425n) {
            try {
                arrayList.add(AbstractC11863u.m37926a(f366g.m41691L(m408A(file)), file.getName(), file));
            } catch (IOException e10) {
                C10889g.m33216f().m33226l("Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        return arrayList;
    }

    /* renamed from: y */
    public void m439y(AbstractC12426f0.e.d dVar, String str, boolean z10) {
        int i10 = this.f371c.mo10188b().f7998a.f8009a;
        try {
            m413F(this.f370b.m461o(str, m424m(this.f369a.getAndIncrement(), z10)), f366g.m41694k(dVar));
        } catch (IOException e10) {
            C10889g.m33216f().m33226l("Could not persist event for session " + str, e10);
        }
        m412E(str, i10);
    }

    /* renamed from: z */
    public void m440z(AbstractC12426f0 abstractC12426f0) {
        AbstractC12426f0.e mo40111m = abstractC12426f0.mo40111m();
        if (mo40111m == null) {
            C10889g.m33216f().m33217b("Could not get session for report");
            return;
        }
        String mo40208i = mo40111m.mo40208i();
        try {
            m413F(this.f370b.m461o(mo40208i, "report"), f366g.m41692M(abstractC12426f0));
            m414G(this.f370b.m461o(mo40208i, "start-time"), "", mo40111m.mo40211l());
        } catch (IOException e10) {
            C10889g.m33216f().m33218c("Could not persist report for session " + mo40208i, e10);
        }
    }
}

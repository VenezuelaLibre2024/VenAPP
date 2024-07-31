package p095f3;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: f3.b */
/* loaded from: classes.dex */
public final class C7291b implements Closeable {

    /* renamed from: a */
    private final File f16335a;

    /* renamed from: b */
    private final File f16336b;

    /* renamed from: c */
    private final File f16337c;

    /* renamed from: d */
    private final File f16338d;

    /* renamed from: e */
    private final int f16339e;

    /* renamed from: f */
    private long f16340f;

    /* renamed from: r */
    private final int f16341r;

    /* renamed from: t */
    private Writer f16343t;

    /* renamed from: v */
    private int f16345v;

    /* renamed from: s */
    private long f16342s = 0;

    /* renamed from: u */
    private final LinkedHashMap<String, d> f16344u = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: w */
    private long f16346w = 0;

    /* renamed from: x */
    final ThreadPoolExecutor f16347x = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* renamed from: y */
    private final Callable<Void> f16348y = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f3.b$a */
    /* loaded from: classes.dex */
    public class a implements Callable<Void> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (C7291b.this) {
                if (C7291b.this.f16343t == null) {
                    return null;
                }
                C7291b.this.m21831i0();
                if (C7291b.this.m21818O()) {
                    C7291b.this.m21824a0();
                    C7291b.this.f16345v = 0;
                }
                return null;
            }
        }
    }

    /* renamed from: f3.b$b */
    /* loaded from: classes.dex */
    private static final class b implements ThreadFactory {
        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* renamed from: f3.b$c */
    /* loaded from: classes.dex */
    public final class c {

        /* renamed from: a */
        private final d f16350a;

        /* renamed from: b */
        private final boolean[] f16351b;

        /* renamed from: c */
        private boolean f16352c;

        private c(d dVar) {
            this.f16350a = dVar;
            this.f16351b = dVar.f16358e ? null : new boolean[C7291b.this.f16341r];
        }

        /* synthetic */ c(C7291b c7291b, d dVar, a aVar) {
            this(dVar);
        }

        /* renamed from: a */
        public void m21845a() {
            C7291b.this.m21836q(this, false);
        }

        /* renamed from: b */
        public void m21846b() {
            if (this.f16352c) {
                return;
            }
            try {
                m21845a();
            } catch (IOException unused) {
            }
        }

        /* renamed from: e */
        public void m21847e() {
            C7291b.this.m21836q(this, true);
            this.f16352c = true;
        }

        /* renamed from: f */
        public File m21848f(int i10) {
            File m21861k;
            synchronized (C7291b.this) {
                if (this.f16350a.f16359f != this) {
                    throw new IllegalStateException();
                }
                if (!this.f16350a.f16358e) {
                    this.f16351b[i10] = true;
                }
                m21861k = this.f16350a.m21861k(i10);
                C7291b.this.f16335a.mkdirs();
            }
            return m21861k;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f3.b$d */
    /* loaded from: classes.dex */
    public final class d {

        /* renamed from: a */
        private final String f16354a;

        /* renamed from: b */
        private final long[] f16355b;

        /* renamed from: c */
        File[] f16356c;

        /* renamed from: d */
        File[] f16357d;

        /* renamed from: e */
        private boolean f16358e;

        /* renamed from: f */
        private c f16359f;

        /* renamed from: g */
        private long f16360g;

        private d(String str) {
            this.f16354a = str;
            this.f16355b = new long[C7291b.this.f16341r];
            this.f16356c = new File[C7291b.this.f16341r];
            this.f16357d = new File[C7291b.this.f16341r];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < C7291b.this.f16341r; i10++) {
                sb2.append(i10);
                this.f16356c[i10] = new File(C7291b.this.f16335a, sb2.toString());
                sb2.append(".tmp");
                this.f16357d[i10] = new File(C7291b.this.f16335a, sb2.toString());
                sb2.setLength(length);
            }
        }

        /* synthetic */ d(C7291b c7291b, String str, a aVar) {
            this(str);
        }

        /* renamed from: m */
        private IOException m21858m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public void m21859n(String[] strArr) {
            if (strArr.length != C7291b.this.f16341r) {
                throw m21858m(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f16355b[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException unused) {
                    throw m21858m(strArr);
                }
            }
        }

        /* renamed from: j */
        public File m21860j(int i10) {
            return this.f16356c[i10];
        }

        /* renamed from: k */
        public File m21861k(int i10) {
            return this.f16357d[i10];
        }

        /* renamed from: l */
        public String m21862l() {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f16355b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }
    }

    /* renamed from: f3.b$e */
    /* loaded from: classes.dex */
    public final class e {

        /* renamed from: a */
        private final String f16362a;

        /* renamed from: b */
        private final long f16363b;

        /* renamed from: c */
        private final long[] f16364c;

        /* renamed from: d */
        private final File[] f16365d;

        private e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f16362a = str;
            this.f16363b = j10;
            this.f16365d = fileArr;
            this.f16364c = jArr;
        }

        /* synthetic */ e(C7291b c7291b, String str, long j10, File[] fileArr, long[] jArr, a aVar) {
            this(str, j10, fileArr, jArr);
        }

        /* renamed from: a */
        public File m21863a(int i10) {
            return this.f16365d[i10];
        }
    }

    private C7291b(File file, int i10, int i11, long j10) {
        this.f16335a = file;
        this.f16339e = i10;
        this.f16336b = new File(file, "journal");
        this.f16337c = new File(file, "journal.tmp");
        this.f16338d = new File(file, "journal.bkp");
        this.f16341r = i11;
        this.f16340f = j10;
    }

    /* renamed from: E */
    private synchronized c m21816E(String str, long j10) {
        m21834n();
        d dVar = this.f16344u.get(str);
        a aVar = null;
        if (j10 != -1 && (dVar == null || dVar.f16360g != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f16344u.put(str, dVar);
        } else if (dVar.f16359f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f16359f = cVar;
        this.f16343t.append((CharSequence) "DIRTY");
        this.f16343t.append(' ');
        this.f16343t.append((CharSequence) str);
        this.f16343t.append('\n');
        m21817H(this.f16343t);
        return cVar;
    }

    /* renamed from: H */
    private static void m21817H(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public boolean m21818O() {
        int i10 = this.f16345v;
        return i10 >= 2000 && i10 >= this.f16344u.size();
    }

    /* renamed from: Q */
    public static C7291b m21819Q(File file, int i10, int i11, long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m21829h0(file2, file3, false);
            }
        }
        C7291b c7291b = new C7291b(file, i10, i11, j10);
        if (c7291b.f16336b.exists()) {
            try {
                c7291b.m21821S();
                c7291b.m21820R();
                return c7291b;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                c7291b.m21841r();
            }
        }
        file.mkdirs();
        C7291b c7291b2 = new C7291b(file, i10, i11, j10);
        c7291b2.m21824a0();
        return c7291b2;
    }

    /* renamed from: R */
    private void m21820R() {
        m21837y(this.f16337c);
        Iterator<d> it = this.f16344u.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f16359f == null) {
                while (i10 < this.f16341r) {
                    this.f16342s += next.f16355b[i10];
                    i10++;
                }
            } else {
                next.f16359f = null;
                while (i10 < this.f16341r) {
                    m21837y(next.m21860j(i10));
                    m21837y(next.m21861k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: S */
    private void m21821S() {
        C7292c c7292c = new C7292c(new FileInputStream(this.f16336b), C7293d.f16373a);
        try {
            String m21867f = c7292c.m21867f();
            String m21867f2 = c7292c.m21867f();
            String m21867f3 = c7292c.m21867f();
            String m21867f4 = c7292c.m21867f();
            String m21867f5 = c7292c.m21867f();
            if (!"libcore.io.DiskLruCache".equals(m21867f) || !"1".equals(m21867f2) || !Integer.toString(this.f16339e).equals(m21867f3) || !Integer.toString(this.f16341r).equals(m21867f4) || !"".equals(m21867f5)) {
                throw new IOException("unexpected journal header: [" + m21867f + ", " + m21867f2 + ", " + m21867f4 + ", " + m21867f5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    m21822U(c7292c.m21867f());
                    i10++;
                } catch (EOFException unused) {
                    this.f16345v = i10 - this.f16344u.size();
                    if (c7292c.m21866e()) {
                        m21824a0();
                    } else {
                        this.f16343t = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f16336b, true), C7293d.f16373a));
                    }
                    C7293d.m21868a(c7292c);
                    return;
                }
            }
        } catch (Throwable th2) {
            C7293d.m21868a(c7292c);
            throw th2;
        }
    }

    /* renamed from: U */
    private void m21822U(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = indexOf + 1;
        int indexOf2 = str.indexOf(32, i10);
        if (indexOf2 == -1) {
            substring = str.substring(i10);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                this.f16344u.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i10, indexOf2);
        }
        d dVar = this.f16344u.get(substring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, substring, aVar);
            this.f16344u.put(substring, dVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            dVar.f16358e = true;
            dVar.f16359f = null;
            dVar.m21859n(split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f16359f = new c(this, dVar, aVar);
            return;
        }
        if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public synchronized void m21824a0() {
        Writer writer = this.f16343t;
        if (writer != null) {
            m21835o(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f16337c), C7293d.f16373a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f16339e));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f16341r));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d dVar : this.f16344u.values()) {
                bufferedWriter.write(dVar.f16359f != null ? "DIRTY " + dVar.f16354a + '\n' : "CLEAN " + dVar.f16354a + dVar.m21862l() + '\n');
            }
            m21835o(bufferedWriter);
            if (this.f16336b.exists()) {
                m21829h0(this.f16336b, this.f16338d, true);
            }
            m21829h0(this.f16337c, this.f16336b, false);
            this.f16338d.delete();
            this.f16343t = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f16336b, true), C7293d.f16373a));
        } catch (Throwable th2) {
            m21835o(bufferedWriter);
            throw th2;
        }
    }

    /* renamed from: h0 */
    private static void m21829h0(File file, File file2, boolean z10) {
        if (z10) {
            m21837y(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public void m21831i0() {
        while (this.f16342s > this.f16340f) {
            m21840c0(this.f16344u.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: n */
    private void m21834n() {
        if (this.f16343t == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: o */
    private static void m21835o(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public synchronized void m21836q(c cVar, boolean z10) {
        d dVar = cVar.f16350a;
        if (dVar.f16359f != cVar) {
            throw new IllegalStateException();
        }
        if (z10 && !dVar.f16358e) {
            for (int i10 = 0; i10 < this.f16341r; i10++) {
                if (!cVar.f16351b[i10]) {
                    cVar.m21845a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                if (!dVar.m21861k(i10).exists()) {
                    cVar.m21845a();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < this.f16341r; i11++) {
            File m21861k = dVar.m21861k(i11);
            if (!z10) {
                m21837y(m21861k);
            } else if (m21861k.exists()) {
                File m21860j = dVar.m21860j(i11);
                m21861k.renameTo(m21860j);
                long j10 = dVar.f16355b[i11];
                long length = m21860j.length();
                dVar.f16355b[i11] = length;
                this.f16342s = (this.f16342s - j10) + length;
            }
        }
        this.f16345v++;
        dVar.f16359f = null;
        if (dVar.f16358e || z10) {
            dVar.f16358e = true;
            this.f16343t.append((CharSequence) "CLEAN");
            this.f16343t.append(' ');
            this.f16343t.append((CharSequence) dVar.f16354a);
            this.f16343t.append((CharSequence) dVar.m21862l());
            this.f16343t.append('\n');
            if (z10) {
                long j11 = this.f16346w;
                this.f16346w = 1 + j11;
                dVar.f16360g = j11;
            }
        } else {
            this.f16344u.remove(dVar.f16354a);
            this.f16343t.append((CharSequence) "REMOVE");
            this.f16343t.append(' ');
            this.f16343t.append((CharSequence) dVar.f16354a);
            this.f16343t.append('\n');
        }
        m21817H(this.f16343t);
        if (this.f16342s > this.f16340f || m21818O()) {
            this.f16347x.submit(this.f16348y);
        }
    }

    /* renamed from: y */
    private static void m21837y(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: B */
    public c m21838B(String str) {
        return m21816E(str, -1L);
    }

    /* renamed from: I */
    public synchronized e m21839I(String str) {
        m21834n();
        d dVar = this.f16344u.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f16358e) {
            return null;
        }
        for (File file : dVar.f16356c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f16345v++;
        this.f16343t.append((CharSequence) "READ");
        this.f16343t.append(' ');
        this.f16343t.append((CharSequence) str);
        this.f16343t.append('\n');
        if (m21818O()) {
            this.f16347x.submit(this.f16348y);
        }
        return new e(this, str, dVar.f16360g, dVar.f16356c, dVar.f16355b, null);
    }

    /* renamed from: c0 */
    public synchronized boolean m21840c0(String str) {
        m21834n();
        d dVar = this.f16344u.get(str);
        if (dVar != null && dVar.f16359f == null) {
            for (int i10 = 0; i10 < this.f16341r; i10++) {
                File m21860j = dVar.m21860j(i10);
                if (m21860j.exists() && !m21860j.delete()) {
                    throw new IOException("failed to delete " + m21860j);
                }
                this.f16342s -= dVar.f16355b[i10];
                dVar.f16355b[i10] = 0;
            }
            this.f16345v++;
            this.f16343t.append((CharSequence) "REMOVE");
            this.f16343t.append(' ');
            this.f16343t.append((CharSequence) str);
            this.f16343t.append('\n');
            this.f16344u.remove(str);
            if (m21818O()) {
                this.f16347x.submit(this.f16348y);
            }
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f16343t == null) {
            return;
        }
        Iterator it = new ArrayList(this.f16344u.values()).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f16359f != null) {
                dVar.f16359f.m21845a();
            }
        }
        m21831i0();
        m21835o(this.f16343t);
        this.f16343t = null;
    }

    /* renamed from: r */
    public void m21841r() {
        close();
        C7293d.m21869b(this.f16335a);
    }
}

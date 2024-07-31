package f3;

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

/* loaded from: classes.dex */
public final class b implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final File f14912a;

    /* renamed from: b, reason: collision with root package name */
    private final File f14913b;

    /* renamed from: c, reason: collision with root package name */
    private final File f14914c;

    /* renamed from: d, reason: collision with root package name */
    private final File f14915d;

    /* renamed from: e, reason: collision with root package name */
    private final int f14916e;

    /* renamed from: f, reason: collision with root package name */
    private long f14917f;

    /* renamed from: r, reason: collision with root package name */
    private final int f14918r;

    /* renamed from: t, reason: collision with root package name */
    private Writer f14920t;

    /* renamed from: v, reason: collision with root package name */
    private int f14922v;

    /* renamed from: s, reason: collision with root package name */
    private long f14919s = 0;

    /* renamed from: u, reason: collision with root package name */
    private final LinkedHashMap<String, d> f14921u = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: w, reason: collision with root package name */
    private long f14923w = 0;

    /* renamed from: x, reason: collision with root package name */
    final ThreadPoolExecutor f14924x = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0237b(null));

    /* renamed from: y, reason: collision with root package name */
    private final Callable<Void> f14925y = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Callable<Void> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (b.this) {
                if (b.this.f14920t == null) {
                    return null;
                }
                b.this.i0();
                if (b.this.O()) {
                    b.this.a0();
                    b.this.f14922v = 0;
                }
                return null;
            }
        }
    }

    /* renamed from: f3.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class ThreadFactoryC0237b implements ThreadFactory {
        private ThreadFactoryC0237b() {
        }

        /* synthetic */ ThreadFactoryC0237b(a aVar) {
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

    /* loaded from: classes.dex */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        private final d f14927a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean[] f14928b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f14929c;

        private c(d dVar) {
            this.f14927a = dVar;
            this.f14928b = dVar.f14935e ? null : new boolean[b.this.f14918r];
        }

        /* synthetic */ c(b bVar, d dVar, a aVar) {
            this(dVar);
        }

        public void a() {
            b.this.q(this, false);
        }

        public void b() {
            if (this.f14929c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() {
            b.this.q(this, true);
            this.f14929c = true;
        }

        public File f(int i10) {
            File k10;
            synchronized (b.this) {
                if (this.f14927a.f14936f != this) {
                    throw new IllegalStateException();
                }
                if (!this.f14927a.f14935e) {
                    this.f14928b[i10] = true;
                }
                k10 = this.f14927a.k(i10);
                b.this.f14912a.mkdirs();
            }
            return k10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f14931a;

        /* renamed from: b, reason: collision with root package name */
        private final long[] f14932b;

        /* renamed from: c, reason: collision with root package name */
        File[] f14933c;

        /* renamed from: d, reason: collision with root package name */
        File[] f14934d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f14935e;

        /* renamed from: f, reason: collision with root package name */
        private c f14936f;

        /* renamed from: g, reason: collision with root package name */
        private long f14937g;

        private d(String str) {
            this.f14931a = str;
            this.f14932b = new long[b.this.f14918r];
            this.f14933c = new File[b.this.f14918r];
            this.f14934d = new File[b.this.f14918r];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < b.this.f14918r; i10++) {
                sb2.append(i10);
                this.f14933c[i10] = new File(b.this.f14912a, sb2.toString());
                sb2.append(".tmp");
                this.f14934d[i10] = new File(b.this.f14912a, sb2.toString());
                sb2.setLength(length);
            }
        }

        /* synthetic */ d(b bVar, String str, a aVar) {
            this(str);
        }

        private IOException m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) {
            if (strArr.length != b.this.f14918r) {
                throw m(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f14932b[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i10) {
            return this.f14933c[i10];
        }

        public File k(int i10) {
            return this.f14934d[i10];
        }

        public String l() {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f14932b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }
    }

    /* loaded from: classes.dex */
    public final class e {

        /* renamed from: a, reason: collision with root package name */
        private final String f14939a;

        /* renamed from: b, reason: collision with root package name */
        private final long f14940b;

        /* renamed from: c, reason: collision with root package name */
        private final long[] f14941c;

        /* renamed from: d, reason: collision with root package name */
        private final File[] f14942d;

        private e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f14939a = str;
            this.f14940b = j10;
            this.f14942d = fileArr;
            this.f14941c = jArr;
        }

        /* synthetic */ e(b bVar, String str, long j10, File[] fileArr, long[] jArr, a aVar) {
            this(str, j10, fileArr, jArr);
        }

        public File a(int i10) {
            return this.f14942d[i10];
        }
    }

    private b(File file, int i10, int i11, long j10) {
        this.f14912a = file;
        this.f14916e = i10;
        this.f14913b = new File(file, "journal");
        this.f14914c = new File(file, "journal.tmp");
        this.f14915d = new File(file, "journal.bkp");
        this.f14918r = i11;
        this.f14917f = j10;
    }

    private synchronized c E(String str, long j10) {
        n();
        d dVar = this.f14921u.get(str);
        a aVar = null;
        if (j10 != -1 && (dVar == null || dVar.f14937g != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f14921u.put(str, dVar);
        } else if (dVar.f14936f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f14936f = cVar;
        this.f14920t.append((CharSequence) "DIRTY");
        this.f14920t.append(' ');
        this.f14920t.append((CharSequence) str);
        this.f14920t.append('\n');
        H(this.f14920t);
        return cVar;
    }

    private static void H(Writer writer) {
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
    public boolean O() {
        int i10 = this.f14922v;
        return i10 >= 2000 && i10 >= this.f14921u.size();
    }

    public static b Q(File file, int i10, int i11, long j10) {
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
                h0(file2, file3, false);
            }
        }
        b bVar = new b(file, i10, i11, j10);
        if (bVar.f14913b.exists()) {
            try {
                bVar.S();
                bVar.R();
                return bVar;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                bVar.r();
            }
        }
        file.mkdirs();
        b bVar2 = new b(file, i10, i11, j10);
        bVar2.a0();
        return bVar2;
    }

    private void R() {
        y(this.f14914c);
        Iterator<d> it = this.f14921u.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f14936f == null) {
                while (i10 < this.f14918r) {
                    this.f14919s += next.f14932b[i10];
                    i10++;
                }
            } else {
                next.f14936f = null;
                while (i10 < this.f14918r) {
                    y(next.j(i10));
                    y(next.k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private void S() {
        f3.c cVar = new f3.c(new FileInputStream(this.f14913b), f3.d.f14950a);
        try {
            String f10 = cVar.f();
            String f11 = cVar.f();
            String f12 = cVar.f();
            String f13 = cVar.f();
            String f14 = cVar.f();
            if (!"libcore.io.DiskLruCache".equals(f10) || !"1".equals(f11) || !Integer.toString(this.f14916e).equals(f12) || !Integer.toString(this.f14918r).equals(f13) || !"".equals(f14)) {
                throw new IOException("unexpected journal header: [" + f10 + ", " + f11 + ", " + f13 + ", " + f14 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    U(cVar.f());
                    i10++;
                } catch (EOFException unused) {
                    this.f14922v = i10 - this.f14921u.size();
                    if (cVar.e()) {
                        a0();
                    } else {
                        this.f14920t = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f14913b, true), f3.d.f14950a));
                    }
                    f3.d.a(cVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            f3.d.a(cVar);
            throw th2;
        }
    }

    private void U(String str) {
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
                this.f14921u.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i10, indexOf2);
        }
        d dVar = this.f14921u.get(substring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, substring, aVar);
            this.f14921u.put(substring, dVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            dVar.f14935e = true;
            dVar.f14936f = null;
            dVar.n(split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f14936f = new c(this, dVar, aVar);
            return;
        }
        if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a0() {
        Writer writer = this.f14920t;
        if (writer != null) {
            o(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f14914c), f3.d.f14950a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f14916e));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f14918r));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d dVar : this.f14921u.values()) {
                bufferedWriter.write(dVar.f14936f != null ? "DIRTY " + dVar.f14931a + '\n' : "CLEAN " + dVar.f14931a + dVar.l() + '\n');
            }
            o(bufferedWriter);
            if (this.f14913b.exists()) {
                h0(this.f14913b, this.f14915d, true);
            }
            h0(this.f14914c, this.f14913b, false);
            this.f14915d.delete();
            this.f14920t = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f14913b, true), f3.d.f14950a));
        } catch (Throwable th2) {
            o(bufferedWriter);
            throw th2;
        }
    }

    private static void h0(File file, File file2, boolean z10) {
        if (z10) {
            y(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0() {
        while (this.f14919s > this.f14917f) {
            c0(this.f14921u.entrySet().iterator().next().getKey());
        }
    }

    private void n() {
        if (this.f14920t == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void o(Writer writer) {
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
    public synchronized void q(c cVar, boolean z10) {
        d dVar = cVar.f14927a;
        if (dVar.f14936f != cVar) {
            throw new IllegalStateException();
        }
        if (z10 && !dVar.f14935e) {
            for (int i10 = 0; i10 < this.f14918r; i10++) {
                if (!cVar.f14928b[i10]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                if (!dVar.k(i10).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < this.f14918r; i11++) {
            File k10 = dVar.k(i11);
            if (!z10) {
                y(k10);
            } else if (k10.exists()) {
                File j10 = dVar.j(i11);
                k10.renameTo(j10);
                long j11 = dVar.f14932b[i11];
                long length = j10.length();
                dVar.f14932b[i11] = length;
                this.f14919s = (this.f14919s - j11) + length;
            }
        }
        this.f14922v++;
        dVar.f14936f = null;
        if (dVar.f14935e || z10) {
            dVar.f14935e = true;
            this.f14920t.append((CharSequence) "CLEAN");
            this.f14920t.append(' ');
            this.f14920t.append((CharSequence) dVar.f14931a);
            this.f14920t.append((CharSequence) dVar.l());
            this.f14920t.append('\n');
            if (z10) {
                long j12 = this.f14923w;
                this.f14923w = 1 + j12;
                dVar.f14937g = j12;
            }
        } else {
            this.f14921u.remove(dVar.f14931a);
            this.f14920t.append((CharSequence) "REMOVE");
            this.f14920t.append(' ');
            this.f14920t.append((CharSequence) dVar.f14931a);
            this.f14920t.append('\n');
        }
        H(this.f14920t);
        if (this.f14919s > this.f14917f || O()) {
            this.f14924x.submit(this.f14925y);
        }
    }

    private static void y(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public c B(String str) {
        return E(str, -1L);
    }

    public synchronized e I(String str) {
        n();
        d dVar = this.f14921u.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f14935e) {
            return null;
        }
        for (File file : dVar.f14933c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f14922v++;
        this.f14920t.append((CharSequence) "READ");
        this.f14920t.append(' ');
        this.f14920t.append((CharSequence) str);
        this.f14920t.append('\n');
        if (O()) {
            this.f14924x.submit(this.f14925y);
        }
        return new e(this, str, dVar.f14937g, dVar.f14933c, dVar.f14932b, null);
    }

    public synchronized boolean c0(String str) {
        n();
        d dVar = this.f14921u.get(str);
        if (dVar != null && dVar.f14936f == null) {
            for (int i10 = 0; i10 < this.f14918r; i10++) {
                File j10 = dVar.j(i10);
                if (j10.exists() && !j10.delete()) {
                    throw new IOException("failed to delete " + j10);
                }
                this.f14919s -= dVar.f14932b[i10];
                dVar.f14932b[i10] = 0;
            }
            this.f14922v++;
            this.f14920t.append((CharSequence) "REMOVE");
            this.f14920t.append(' ');
            this.f14920t.append((CharSequence) str);
            this.f14920t.append('\n');
            this.f14921u.remove(str);
            if (O()) {
                this.f14924x.submit(this.f14925y);
            }
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f14920t == null) {
            return;
        }
        Iterator it = new ArrayList(this.f14921u.values()).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f14936f != null) {
                dVar.f14936f.a();
            }
        }
        i0();
        o(this.f14920t);
        this.f14920t = null;
    }

    public void r() {
        close();
        f3.d.b(this.f14912a);
    }
}

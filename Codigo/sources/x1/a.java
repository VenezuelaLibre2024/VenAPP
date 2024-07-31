package x1;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0494a f30358e = new C0494a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Map<String, Lock> f30359f = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f30360a;

    /* renamed from: b, reason: collision with root package name */
    private final File f30361b;

    /* renamed from: c, reason: collision with root package name */
    private final Lock f30362c;

    /* renamed from: d, reason: collision with root package name */
    private FileChannel f30363d;

    /* renamed from: x1.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0494a {
        private C0494a() {
        }

        public /* synthetic */ C0494a(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Lock b(String str) {
            Lock lock;
            synchronized (a.f30359f) {
                Map map = a.f30359f;
                Object obj = map.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    map.put(str, obj);
                }
                lock = (Lock) obj;
            }
            return lock;
        }
    }

    public a(String name, File lockDir, boolean z10) {
        n.e(name, "name");
        n.e(lockDir, "lockDir");
        this.f30360a = z10;
        File file = new File(lockDir, name + ".lck");
        this.f30361b = file;
        C0494a c0494a = f30358e;
        String absolutePath = file.getAbsolutePath();
        n.d(absolutePath, "lockFile.absolutePath");
        this.f30362c = c0494a.b(absolutePath);
    }

    public static /* synthetic */ void c(a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = aVar.f30360a;
        }
        aVar.b(z10);
    }

    public final void b(boolean z10) {
        this.f30362c.lock();
        if (z10) {
            try {
                File parentFile = this.f30361b.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f30361b).getChannel();
                channel.lock();
                this.f30363d = channel;
            } catch (IOException e10) {
                this.f30363d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.f30363d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f30362c.unlock();
    }
}

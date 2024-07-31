package p431x1;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: x1.a */
/* loaded from: classes.dex */
public final class C12265a {

    /* renamed from: e */
    public static final a f32870e = new a(null);

    /* renamed from: f */
    private static final Map<String, Lock> f32871f = new HashMap();

    /* renamed from: a */
    private final boolean f32872a;

    /* renamed from: b */
    private final File f32873b;

    /* renamed from: c */
    private final Lock f32874c;

    /* renamed from: d */
    private FileChannel f32875d;

    /* renamed from: x1.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final Lock m39498b(String str) {
            Lock lock;
            synchronized (C12265a.f32871f) {
                Map map = C12265a.f32871f;
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

    public C12265a(String name, File lockDir, boolean z10) {
        C9322n.m27781e(name, "name");
        C9322n.m27781e(lockDir, "lockDir");
        this.f32872a = z10;
        File file = new File(lockDir, name + ".lck");
        this.f32873b = file;
        a aVar = f32870e;
        String absolutePath = file.getAbsolutePath();
        C9322n.m27780d(absolutePath, "lockFile.absolutePath");
        this.f32874c = aVar.m39498b(absolutePath);
    }

    /* renamed from: c */
    public static /* synthetic */ void m39494c(C12265a c12265a, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = c12265a.f32872a;
        }
        c12265a.m39495b(z10);
    }

    /* renamed from: b */
    public final void m39495b(boolean z10) {
        this.f32874c.lock();
        if (z10) {
            try {
                File parentFile = this.f32873b.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f32873b).getChannel();
                channel.lock();
                this.f32875d = channel;
            } catch (IOException e10) {
                this.f32875d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    /* renamed from: d */
    public final void m39496d() {
        try {
            FileChannel fileChannel = this.f32875d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f32874c.unlock();
    }
}

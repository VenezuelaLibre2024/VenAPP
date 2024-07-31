package p322r1;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C9322n;
import p356t1.C10973b;
import p356t1.C10974c;
import p391v1.InterfaceC11610i;
import p391v1.InterfaceC11611j;
import p431x1.C12265a;

/* renamed from: r1.b0 */
/* loaded from: classes.dex */
public final class C10581b0 implements InterfaceC11611j, InterfaceC10590g {

    /* renamed from: a */
    private final Context f26612a;

    /* renamed from: b */
    private final String f26613b;

    /* renamed from: c */
    private final File f26614c;

    /* renamed from: d */
    private final Callable<InputStream> f26615d;

    /* renamed from: e */
    private final int f26616e;

    /* renamed from: f */
    private final InterfaceC11611j f26617f;

    /* renamed from: r */
    private C10588f f26618r;

    /* renamed from: s */
    private boolean f26619s;

    public C10581b0(Context context, String str, File file, Callable<InputStream> callable, int i10, InterfaceC11611j delegate) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(delegate, "delegate");
        this.f26612a = context;
        this.f26613b = str;
        this.f26614c = file;
        this.f26615d = callable;
        this.f26616e = i10;
        this.f26617f = delegate;
    }

    /* renamed from: b */
    private final void m32109b(File file, boolean z10) {
        ReadableByteChannel newChannel;
        String str;
        if (this.f26613b != null) {
            newChannel = Channels.newChannel(this.f26612a.getAssets().open(this.f26613b));
            str = "newChannel(context.assets.open(copyFromAssetPath))";
        } else if (this.f26614c != null) {
            newChannel = new FileInputStream(this.f26614c).getChannel();
            str = "FileInputStream(copyFromFile).channel";
        } else {
            Callable<InputStream> callable = this.f26615d;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                newChannel = Channels.newChannel(callable.call());
                str = "newChannel(inputStream)";
            } catch (Exception e10) {
                throw new IOException("inputStreamCallable exception on call", e10);
            }
        }
        C9322n.m27780d(newChannel, str);
        File intermediateFile = File.createTempFile("room-copy-helper", ".tmp", this.f26612a.getCacheDir());
        intermediateFile.deleteOnExit();
        FileChannel output = new FileOutputStream(intermediateFile).getChannel();
        C9322n.m27780d(output, "output");
        C10974c.m33490a(newChannel, output);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        C9322n.m27780d(intermediateFile, "intermediateFile");
        m32110e(intermediateFile, z10);
        if (intermediateFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + intermediateFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    /* renamed from: e */
    private final void m32110e(File file, boolean z10) {
        C10588f c10588f = this.f26618r;
        if (c10588f == null) {
            C9322n.m27792p("databaseConfiguration");
            c10588f = null;
        }
        c10588f.getClass();
    }

    /* renamed from: g */
    private final void m32111g(boolean z10) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        File databaseFile = this.f26612a.getDatabasePath(databaseName);
        C10588f c10588f = this.f26618r;
        C10588f c10588f2 = null;
        if (c10588f == null) {
            C9322n.m27792p("databaseConfiguration");
            c10588f = null;
        }
        boolean z11 = c10588f.f26689s;
        File filesDir = this.f26612a.getFilesDir();
        C9322n.m27780d(filesDir, "context.filesDir");
        C12265a c12265a = new C12265a(databaseName, filesDir, z11);
        try {
            C12265a.m39494c(c12265a, false, 1, null);
            if (!databaseFile.exists()) {
                try {
                    C9322n.m27780d(databaseFile, "databaseFile");
                    m32109b(databaseFile, z10);
                    c12265a.m39496d();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            try {
                C9322n.m27780d(databaseFile, "databaseFile");
                int m33489c = C10973b.m33489c(databaseFile);
                if (m33489c == this.f26616e) {
                    c12265a.m39496d();
                    return;
                }
                C10588f c10588f3 = this.f26618r;
                if (c10588f3 == null) {
                    C9322n.m27792p("databaseConfiguration");
                } else {
                    c10588f2 = c10588f3;
                }
                if (c10588f2.m32177a(m33489c, this.f26616e)) {
                    c12265a.m39496d();
                    return;
                }
                if (this.f26612a.deleteDatabase(databaseName)) {
                    try {
                        m32109b(databaseFile, z10);
                    } catch (IOException e11) {
                        Log.w("ROOM", "Unable to copy database file.", e11);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                c12265a.m39496d();
                return;
            } catch (IOException e12) {
                Log.w("ROOM", "Unable to read database version.", e12);
                c12265a.m39496d();
                return;
            }
        } catch (Throwable th2) {
            c12265a.m39496d();
            throw th2;
        }
        c12265a.m39496d();
        throw th2;
    }

    @Override // p391v1.InterfaceC11611j
    /* renamed from: Q0 */
    public InterfaceC11610i mo32112Q0() {
        if (!this.f26619s) {
            m32111g(true);
            this.f26619s = true;
        }
        return mo32113a().mo32112Q0();
    }

    @Override // p322r1.InterfaceC10590g
    /* renamed from: a */
    public InterfaceC11611j mo32113a() {
        return this.f26617f;
    }

    @Override // p391v1.InterfaceC11611j, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        mo32113a().close();
        this.f26619s = false;
    }

    /* renamed from: f */
    public final void m32114f(C10588f databaseConfiguration) {
        C9322n.m27781e(databaseConfiguration, "databaseConfiguration");
        this.f26618r = databaseConfiguration;
    }

    @Override // p391v1.InterfaceC11611j
    public String getDatabaseName() {
        return mo32113a().getDatabaseName();
    }

    @Override // p391v1.InterfaceC11611j
    public void setWriteAheadLoggingEnabled(boolean z10) {
        mo32113a().setWriteAheadLoggingEnabled(z10);
    }
}

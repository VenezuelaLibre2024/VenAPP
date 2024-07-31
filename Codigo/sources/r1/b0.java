package r1;

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

/* loaded from: classes.dex */
public final class b0 implements v1.j, g {

    /* renamed from: a, reason: collision with root package name */
    private final Context f24498a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24499b;

    /* renamed from: c, reason: collision with root package name */
    private final File f24500c;

    /* renamed from: d, reason: collision with root package name */
    private final Callable<InputStream> f24501d;

    /* renamed from: e, reason: collision with root package name */
    private final int f24502e;

    /* renamed from: f, reason: collision with root package name */
    private final v1.j f24503f;

    /* renamed from: r, reason: collision with root package name */
    private f f24504r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f24505s;

    public b0(Context context, String str, File file, Callable<InputStream> callable, int i10, v1.j delegate) {
        kotlin.jvm.internal.n.e(context, "context");
        kotlin.jvm.internal.n.e(delegate, "delegate");
        this.f24498a = context;
        this.f24499b = str;
        this.f24500c = file;
        this.f24501d = callable;
        this.f24502e = i10;
        this.f24503f = delegate;
    }

    private final void b(File file, boolean z10) {
        ReadableByteChannel newChannel;
        String str;
        if (this.f24499b != null) {
            newChannel = Channels.newChannel(this.f24498a.getAssets().open(this.f24499b));
            str = "newChannel(context.assets.open(copyFromAssetPath))";
        } else if (this.f24500c != null) {
            newChannel = new FileInputStream(this.f24500c).getChannel();
            str = "FileInputStream(copyFromFile).channel";
        } else {
            Callable<InputStream> callable = this.f24501d;
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
        kotlin.jvm.internal.n.d(newChannel, str);
        File intermediateFile = File.createTempFile("room-copy-helper", ".tmp", this.f24498a.getCacheDir());
        intermediateFile.deleteOnExit();
        FileChannel output = new FileOutputStream(intermediateFile).getChannel();
        kotlin.jvm.internal.n.d(output, "output");
        t1.c.a(newChannel, output);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        kotlin.jvm.internal.n.d(intermediateFile, "intermediateFile");
        e(intermediateFile, z10);
        if (intermediateFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + intermediateFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private final void e(File file, boolean z10) {
        f fVar = this.f24504r;
        if (fVar == null) {
            kotlin.jvm.internal.n.p("databaseConfiguration");
            fVar = null;
        }
        fVar.getClass();
    }

    private final void g(boolean z10) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        File databaseFile = this.f24498a.getDatabasePath(databaseName);
        f fVar = this.f24504r;
        f fVar2 = null;
        if (fVar == null) {
            kotlin.jvm.internal.n.p("databaseConfiguration");
            fVar = null;
        }
        boolean z11 = fVar.f24575s;
        File filesDir = this.f24498a.getFilesDir();
        kotlin.jvm.internal.n.d(filesDir, "context.filesDir");
        x1.a aVar = new x1.a(databaseName, filesDir, z11);
        try {
            x1.a.c(aVar, false, 1, null);
            if (!databaseFile.exists()) {
                try {
                    kotlin.jvm.internal.n.d(databaseFile, "databaseFile");
                    b(databaseFile, z10);
                    aVar.d();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            try {
                kotlin.jvm.internal.n.d(databaseFile, "databaseFile");
                int c10 = t1.b.c(databaseFile);
                if (c10 == this.f24502e) {
                    aVar.d();
                    return;
                }
                f fVar3 = this.f24504r;
                if (fVar3 == null) {
                    kotlin.jvm.internal.n.p("databaseConfiguration");
                } else {
                    fVar2 = fVar3;
                }
                if (fVar2.a(c10, this.f24502e)) {
                    aVar.d();
                    return;
                }
                if (this.f24498a.deleteDatabase(databaseName)) {
                    try {
                        b(databaseFile, z10);
                    } catch (IOException e11) {
                        Log.w("ROOM", "Unable to copy database file.", e11);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar.d();
                return;
            } catch (IOException e12) {
                Log.w("ROOM", "Unable to read database version.", e12);
                aVar.d();
                return;
            }
        } catch (Throwable th2) {
            aVar.d();
            throw th2;
        }
        aVar.d();
        throw th2;
    }

    @Override // v1.j
    public v1.i Q0() {
        if (!this.f24505s) {
            g(true);
            this.f24505s = true;
        }
        return a().Q0();
    }

    @Override // r1.g
    public v1.j a() {
        return this.f24503f;
    }

    @Override // v1.j, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        a().close();
        this.f24505s = false;
    }

    public final void f(f databaseConfiguration) {
        kotlin.jvm.internal.n.e(databaseConfiguration, "databaseConfiguration");
        this.f24504r = databaseConfiguration;
    }

    @Override // v1.j
    public String getDatabaseName() {
        return a().getDatabaseName();
    }

    @Override // v1.j
    public void setWriteAheadLoggingEnabled(boolean z10) {
        a().setWriteAheadLoggingEnabled(z10);
    }
}

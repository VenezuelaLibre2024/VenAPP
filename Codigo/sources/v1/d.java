package v1;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f27860a = new d();

    private d() {
    }

    public static final File a(Context context) {
        n.e(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        n.d(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}

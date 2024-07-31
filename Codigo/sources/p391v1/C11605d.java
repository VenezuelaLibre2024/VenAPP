package p391v1;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.C9322n;

/* renamed from: v1.d */
/* loaded from: classes.dex */
public final class C11605d {

    /* renamed from: a */
    public static final C11605d f30184a = new C11605d();

    private C11605d() {
    }

    /* renamed from: a */
    public static final File m36383a(Context context) {
        C9322n.m27781e(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        C9322n.m27780d(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}

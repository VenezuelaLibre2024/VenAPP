package androidx.work.impl;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.C9322n;

/* renamed from: androidx.work.impl.a */
/* loaded from: classes.dex */
public final class C1526a {

    /* renamed from: a */
    public static final C1526a f6580a = new C1526a();

    private C1526a() {
    }

    /* renamed from: a */
    public final File m8588a(Context context) {
        C9322n.m27781e(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        C9322n.m27780d(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}

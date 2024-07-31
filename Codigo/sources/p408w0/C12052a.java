package p408w0;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.C9322n;

/* renamed from: w0.a */
/* loaded from: classes.dex */
public final class C12052a {
    /* renamed from: a */
    public static final File m38704a(Context context, String fileName) {
        C9322n.m27781e(context, "<this>");
        C9322n.m27781e(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), C9322n.m27787k("datastore/", fileName));
    }
}

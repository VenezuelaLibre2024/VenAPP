package w0;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class a {
    public static final File a(Context context, String fileName) {
        n.e(context, "<this>");
        n.e(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), n.k("datastore/", fileName));
    }
}

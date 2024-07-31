package x5;

import java.io.File;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class b {
    public static final void a(String str) {
        n.e(str, "<this>");
        File file = new File(str);
        File parentFile = file.getParentFile();
        n.b(parentFile);
        if (parentFile.exists()) {
            return;
        }
        File parentFile2 = file.getParentFile();
        n.b(parentFile2);
        parentFile2.mkdirs();
    }
}

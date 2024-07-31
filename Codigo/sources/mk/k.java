package mk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import kotlin.jvm.internal.n;
import xk.q;

/* loaded from: classes3.dex */
public class k extends j {
    public static final File b(File file, File target, boolean z10, int i10) {
        n.e(file, "<this>");
        n.e(target, "target");
        if (!file.exists()) {
            throw new l(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z10) {
                throw new e(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new e(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (!file.isDirectory()) {
            File parentFile = target.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(target);
                try {
                    a.a(fileInputStream, fileOutputStream, i10);
                    b.a(fileOutputStream, null);
                    b.a(fileInputStream, null);
                } finally {
                }
            } finally {
            }
        } else if (!target.mkdirs()) {
            throw new f(file, target, "Failed to create target directory.");
        }
        return target;
    }

    public static /* synthetic */ File c(File file, File file2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 8192;
        }
        return b(file, file2, z10, i10);
    }

    public static File d(String prefix, String str, File file) {
        n.e(prefix, "prefix");
        File createTempFile = File.createTempFile(prefix, str, file);
        n.d(createTempFile, "createTempFile(prefix, suffix, directory)");
        return createTempFile;
    }

    public static String e(File file) {
        String E0;
        n.e(file, "<this>");
        String name = file.getName();
        n.d(name, "name");
        E0 = q.E0(name, '.', "");
        return E0;
    }
}

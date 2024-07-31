package mk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import kotlin.jvm.internal.C9322n;
import p450xk.C12525q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: mk.k */
/* loaded from: classes3.dex */
public class C9611k extends C9610j {
    /* renamed from: b */
    public static final File m28602b(File file, File target, boolean z10, int i10) {
        C9322n.m27781e(file, "<this>");
        C9322n.m27781e(target, "target");
        if (!file.exists()) {
            throw new C9612l(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z10) {
                throw new C9605e(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new C9605e(file, target, "Tried to overwrite the destination, but failed to delete it.");
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
                    C9601a.m28590a(fileInputStream, fileOutputStream, i10);
                    C9602b.m28593a(fileOutputStream, null);
                    C9602b.m28593a(fileInputStream, null);
                } finally {
                }
            } finally {
            }
        } else if (!target.mkdirs()) {
            throw new C9606f(file, target, "Failed to create target directory.");
        }
        return target;
    }

    /* renamed from: c */
    public static /* synthetic */ File m28603c(File file, File file2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 8192;
        }
        return m28602b(file, file2, z10, i10);
    }

    /* renamed from: d */
    public static File m28604d(String prefix, String str, File file) {
        C9322n.m27781e(prefix, "prefix");
        File createTempFile = File.createTempFile(prefix, str, file);
        C9322n.m27780d(createTempFile, "createTempFile(prefix, suffix, directory)");
        return createTempFile;
    }

    /* renamed from: e */
    public static String m28605e(File file) {
        String m41050E0;
        C9322n.m27781e(file, "<this>");
        String name = file.getName();
        C9322n.m27780d(name, "name");
        m41050E0 = C12525q.m41050E0(name, '.', "");
        return m41050E0;
    }
}

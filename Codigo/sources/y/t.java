package y;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import androidx.camera.core.n;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class t implements g0.b0<a, n.h> {

    /* loaded from: classes.dex */
    public static abstract class a {
        public static a c(g0.c0<byte[]> c0Var, n.g gVar) {
            return new e(c0Var, gVar);
        }

        public abstract n.g a();

        public abstract g0.c0<byte[]> b();
    }

    private static Uri b(File file, File file2) {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new w.g0(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    private static Uri c(File file, n.g gVar) {
        ContentResolver a10 = gVar.a();
        Objects.requireNonNull(a10);
        ContentValues contentValues = gVar.b() != null ? new ContentValues(gVar.b()) : new ContentValues();
        l(contentValues, 1);
        Uri uri = null;
        try {
            try {
                Uri insert = a10.insert(gVar.f(), contentValues);
                try {
                    if (insert == null) {
                        throw new w.g0(1, "Failed to insert a MediaStore URI.", null);
                    }
                    e(file, insert, a10);
                    n(insert, a10, 0);
                    return insert;
                } catch (IOException e10) {
                    e = e10;
                    uri = insert;
                    throw new w.g0(1, "Failed to write to MediaStore URI: " + uri, e);
                } catch (SecurityException e11) {
                    e = e11;
                    uri = insert;
                    throw new w.g0(1, "Failed to write to MediaStore URI: " + uri, e);
                } catch (Throwable th2) {
                    th = th2;
                    uri = insert;
                    if (uri != null) {
                        n(uri, a10, 0);
                    }
                    throw th;
                }
            } catch (IOException e12) {
                e = e12;
            } catch (SecurityException e13) {
                e = e13;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static void d(File file, OutputStream outputStream) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[RecognitionOptions.UPC_E];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    fileInputStream.close();
                    return;
                }
                outputStream.write(bArr, 0, read);
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static void e(File file, Uri uri, ContentResolver contentResolver) {
        OutputStream openOutputStream = contentResolver.openOutputStream(uri);
        try {
            if (openOutputStream != null) {
                d(file, openOutputStream);
                openOutputStream.close();
            } else {
                throw new FileNotFoundException(uri + " cannot be resolved.");
            }
        } catch (Throwable th2) {
            if (openOutputStream != null) {
                try {
                    openOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private static File f(n.g gVar) {
        try {
            File c10 = gVar.c();
            if (c10 == null) {
                return File.createTempFile("CameraX", ".tmp");
            }
            return new File(c10.getParent(), "CameraX" + UUID.randomUUID().toString() + g(c10));
        } catch (IOException e10) {
            throw new w.g0(1, "Failed to create temp file.", e10);
        }
    }

    private static String g(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf >= 0 ? name.substring(lastIndexOf) : "";
    }

    private static boolean h(n.g gVar) {
        return gVar.c() != null;
    }

    private static boolean i(n.g gVar) {
        return (gVar.f() == null || gVar.a() == null || gVar.b() == null) ? false : true;
    }

    private static boolean j(n.g gVar) {
        return gVar.e() != null;
    }

    static Uri k(File file, n.g gVar) {
        Uri uri = null;
        try {
            try {
                if (i(gVar)) {
                    uri = c(file, gVar);
                } else if (j(gVar)) {
                    OutputStream e10 = gVar.e();
                    Objects.requireNonNull(e10);
                    d(file, e10);
                } else if (h(gVar)) {
                    File c10 = gVar.c();
                    Objects.requireNonNull(c10);
                    uri = b(file, c10);
                }
                return uri;
            } catch (IOException unused) {
                throw new w.g0(1, "Failed to write to OutputStream.", null);
            }
        } finally {
            file.delete();
        }
    }

    private static void l(ContentValues contentValues, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", Integer.valueOf(i10));
        }
    }

    private static void m(File file, androidx.camera.core.impl.utils.h hVar, n.g gVar, int i10) {
        try {
            androidx.camera.core.impl.utils.h e10 = androidx.camera.core.impl.utils.h.e(file);
            hVar.d(e10);
            if (e10.n() == 0 && i10 != 0) {
                e10.u(i10);
            }
            gVar.d();
            throw null;
        } catch (IOException e11) {
            throw new w.g0(1, "Failed to update Exif data", e11);
        }
    }

    private static void n(Uri uri, ContentResolver contentResolver, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            l(contentValues, i10);
            contentResolver.update(uri, contentValues, null, null);
        }
    }

    private static void o(File file, byte[] bArr) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr, 0, new e0.c().a(bArr));
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e10) {
            throw new w.g0(1, "Failed to write to temp file", e10);
        }
    }

    @Override // g0.b0
    /* renamed from: a */
    public n.h apply(a aVar) {
        g0.c0<byte[]> b10 = aVar.b();
        n.g a10 = aVar.a();
        File f10 = f(a10);
        o(f10, b10.c());
        androidx.camera.core.impl.utils.h d10 = b10.d();
        Objects.requireNonNull(d10);
        m(f10, d10, a10, b10.f());
        return new n.h(k(f10, a10));
    }
}

package p452y;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import androidx.camera.core.C0709n;
import androidx.camera.core.impl.utils.C0679h;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.UUID;
import p071e0.C7088c;
import p112g0.AbstractC7392c0;
import p112g0.InterfaceC7390b0;
import p407w.C12008g0;

/* renamed from: y.t */
/* loaded from: classes.dex */
class C12568t implements InterfaceC7390b0<a, C0709n.h> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y.t$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public static a m41293c(AbstractC7392c0<byte[]> abstractC7392c0, C0709n.g gVar) {
            return new C12538e(abstractC7392c0, gVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract C0709n.g mo41150a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract AbstractC7392c0<byte[]> mo41151b();
    }

    /* renamed from: b */
    private static Uri m41278b(File file, File file2) {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new C12008g0(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    /* renamed from: c */
    private static Uri m41279c(File file, C0709n.g gVar) {
        ContentResolver m3479a = gVar.m3479a();
        Objects.requireNonNull(m3479a);
        ContentValues contentValues = gVar.m3480b() != null ? new ContentValues(gVar.m3480b()) : new ContentValues();
        m41288l(contentValues, 1);
        Uri uri = null;
        try {
            try {
                Uri insert = m3479a.insert(gVar.m3484f(), contentValues);
                try {
                    if (insert == null) {
                        throw new C12008g0(1, "Failed to insert a MediaStore URI.", null);
                    }
                    m41281e(file, insert, m3479a);
                    m41290n(insert, m3479a, 0);
                    return insert;
                } catch (IOException e10) {
                    e = e10;
                    uri = insert;
                    throw new C12008g0(1, "Failed to write to MediaStore URI: " + uri, e);
                } catch (SecurityException e11) {
                    e = e11;
                    uri = insert;
                    throw new C12008g0(1, "Failed to write to MediaStore URI: " + uri, e);
                } catch (Throwable th2) {
                    th = th2;
                    uri = insert;
                    if (uri != null) {
                        m41290n(uri, m3479a, 0);
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

    /* renamed from: d */
    private static void m41280d(File file, OutputStream outputStream) {
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

    /* renamed from: e */
    private static void m41281e(File file, Uri uri, ContentResolver contentResolver) {
        OutputStream openOutputStream = contentResolver.openOutputStream(uri);
        try {
            if (openOutputStream != null) {
                m41280d(file, openOutputStream);
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

    /* renamed from: f */
    private static File m41282f(C0709n.g gVar) {
        try {
            File m3481c = gVar.m3481c();
            if (m3481c == null) {
                return File.createTempFile("CameraX", ".tmp");
            }
            return new File(m3481c.getParent(), "CameraX" + UUID.randomUUID().toString() + m41283g(m3481c));
        } catch (IOException e10) {
            throw new C12008g0(1, "Failed to create temp file.", e10);
        }
    }

    /* renamed from: g */
    private static String m41283g(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf >= 0 ? name.substring(lastIndexOf) : "";
    }

    /* renamed from: h */
    private static boolean m41284h(C0709n.g gVar) {
        return gVar.m3481c() != null;
    }

    /* renamed from: i */
    private static boolean m41285i(C0709n.g gVar) {
        return (gVar.m3484f() == null || gVar.m3479a() == null || gVar.m3480b() == null) ? false : true;
    }

    /* renamed from: j */
    private static boolean m41286j(C0709n.g gVar) {
        return gVar.m3483e() != null;
    }

    /* renamed from: k */
    static Uri m41287k(File file, C0709n.g gVar) {
        Uri uri = null;
        try {
            try {
                if (m41285i(gVar)) {
                    uri = m41279c(file, gVar);
                } else if (m41286j(gVar)) {
                    OutputStream m3483e = gVar.m3483e();
                    Objects.requireNonNull(m3483e);
                    m41280d(file, m3483e);
                } else if (m41284h(gVar)) {
                    File m3481c = gVar.m3481c();
                    Objects.requireNonNull(m3481c);
                    uri = m41278b(file, m3481c);
                }
                return uri;
            } catch (IOException unused) {
                throw new C12008g0(1, "Failed to write to OutputStream.", null);
            }
        } finally {
            file.delete();
        }
    }

    /* renamed from: l */
    private static void m41288l(ContentValues contentValues, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", Integer.valueOf(i10));
        }
    }

    /* renamed from: m */
    private static void m41289m(File file, C0679h c0679h, C0709n.g gVar, int i10) {
        try {
            C0679h m3271e = C0679h.m3271e(file);
            c0679h.m3278d(m3271e);
            if (m3271e.m3283n() == 0 && i10 != 0) {
                m3271e.m3288u(i10);
            }
            gVar.m3482d();
            throw null;
        } catch (IOException e10) {
            throw new C12008g0(1, "Failed to update Exif data", e10);
        }
    }

    /* renamed from: n */
    private static void m41290n(Uri uri, ContentResolver contentResolver, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            m41288l(contentValues, i10);
            contentResolver.update(uri, contentValues, null, null);
        }
    }

    /* renamed from: o */
    private static void m41291o(File file, byte[] bArr) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr, 0, new C7088c().m20858a(bArr));
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e10) {
            throw new C12008g0(1, "Failed to write to temp file", e10);
        }
    }

    @Override // p112g0.InterfaceC7390b0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0709n.h apply(a aVar) {
        AbstractC7392c0<byte[]> mo41151b = aVar.mo41151b();
        C0709n.g mo41150a = aVar.mo41150a();
        File m41282f = m41282f(mo41150a);
        m41291o(m41282f, mo41151b.mo22306c());
        C0679h mo22307d = mo41151b.mo22307d();
        Objects.requireNonNull(mo22307d);
        m41289m(m41282f, mo22307d, mo41150a, mo41151b.mo22309f());
        return new C0709n.h(m41287k(m41282f, mo41150a));
    }
}

package p032c0;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;

/* renamed from: c0.b */
/* loaded from: classes.dex */
final class C1827b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9832a(ImageWriter imageWriter) {
        imageWriter.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Image m9833b(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static ImageWriter m9834c(Surface surface, int i10) {
        return ImageWriter.newInstance(surface, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m9835d(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }
}

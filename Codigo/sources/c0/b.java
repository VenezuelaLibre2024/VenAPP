package c0;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;

/* loaded from: classes.dex */
final class b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ImageWriter imageWriter) {
        imageWriter.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Image b(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ImageWriter c(Surface surface, int i10) {
        return ImageWriter.newInstance(surface, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }
}

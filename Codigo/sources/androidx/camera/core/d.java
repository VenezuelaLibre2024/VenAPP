package androidx.camera.core;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.camera.core.impl.g1;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d implements g1 {

    /* renamed from: a, reason: collision with root package name */
    private final ImageReader f2385a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f2386b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private boolean f2387c = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(ImageReader imageReader) {
        this.f2385a = imageReader;
    }

    private boolean i(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(g1.a aVar) {
        aVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(Executor executor, final g1.a aVar, ImageReader imageReader) {
        synchronized (this.f2386b) {
            if (!this.f2387c) {
                executor.execute(new Runnable() { // from class: androidx.camera.core.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.this.j(aVar);
                    }
                });
            }
        }
    }

    @Override // androidx.camera.core.impl.g1
    public o b() {
        Image image;
        synchronized (this.f2386b) {
            try {
                image = this.f2385a.acquireLatestImage();
            } catch (RuntimeException e10) {
                if (!i(e10)) {
                    throw e10;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new a(image);
        }
    }

    @Override // androidx.camera.core.impl.g1
    public int c() {
        int imageFormat;
        synchronized (this.f2386b) {
            imageFormat = this.f2385a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.g1
    public void close() {
        synchronized (this.f2386b) {
            this.f2385a.close();
        }
    }

    @Override // androidx.camera.core.impl.g1
    public void d() {
        synchronized (this.f2386b) {
            this.f2387c = true;
            this.f2385a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // androidx.camera.core.impl.g1
    public int e() {
        int maxImages;
        synchronized (this.f2386b) {
            maxImages = this.f2385a.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.g1
    public void f(final g1.a aVar, final Executor executor) {
        synchronized (this.f2386b) {
            this.f2387c = false;
            this.f2385a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.camera.core.b
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    d.this.k(executor, aVar, imageReader);
                }
            }, androidx.camera.core.impl.utils.n.a());
        }
    }

    @Override // androidx.camera.core.impl.g1
    public o g() {
        Image image;
        synchronized (this.f2386b) {
            try {
                image = this.f2385a.acquireNextImage();
            } catch (RuntimeException e10) {
                if (!i(e10)) {
                    throw e10;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new a(image);
        }
    }

    @Override // androidx.camera.core.impl.g1
    public int getHeight() {
        int height;
        synchronized (this.f2386b) {
            height = this.f2385a.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.g1
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f2386b) {
            surface = this.f2385a.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.g1
    public int getWidth() {
        int width;
        synchronized (this.f2386b) {
            width = this.f2385a.getWidth();
        }
        return width;
    }
}

package androidx.camera.core;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.camera.core.impl.InterfaceC0623g1;
import androidx.camera.core.impl.utils.C0685n;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.d */
/* loaded from: classes.dex */
public class C0591d implements InterfaceC0623g1 {

    /* renamed from: a */
    private final ImageReader f2706a;

    /* renamed from: b */
    private final Object f2707b = new Object();

    /* renamed from: c */
    private boolean f2708c = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0591d(ImageReader imageReader) {
        this.f2706a = imageReader;
    }

    /* renamed from: i */
    private boolean m2891i(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m2892j(InterfaceC0623g1.a aVar) {
        aVar.mo2863a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m2893k(Executor executor, final InterfaceC0623g1.a aVar, ImageReader imageReader) {
        synchronized (this.f2707b) {
            if (!this.f2708c) {
                executor.execute(new Runnable() { // from class: androidx.camera.core.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0591d.this.m2892j(aVar);
                    }
                });
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    /* renamed from: b */
    public InterfaceC0710o mo2894b() {
        Image image;
        synchronized (this.f2707b) {
            try {
                image = this.f2706a.acquireLatestImage();
            } catch (RuntimeException e10) {
                if (!m2891i(e10)) {
                    throw e10;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new C0588a(image);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    /* renamed from: c */
    public int mo2895c() {
        int imageFormat;
        synchronized (this.f2707b) {
            imageFormat = this.f2706a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    public void close() {
        synchronized (this.f2707b) {
            this.f2706a.close();
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    /* renamed from: d */
    public void mo2896d() {
        synchronized (this.f2707b) {
            this.f2708c = true;
            this.f2706a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    /* renamed from: e */
    public int mo2897e() {
        int maxImages;
        synchronized (this.f2707b) {
            maxImages = this.f2706a.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    /* renamed from: f */
    public void mo2898f(final InterfaceC0623g1.a aVar, final Executor executor) {
        synchronized (this.f2707b) {
            this.f2708c = false;
            this.f2706a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.camera.core.b
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    C0591d.this.m2893k(executor, aVar, imageReader);
                }
            }, C0685n.m3333a());
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    /* renamed from: g */
    public InterfaceC0710o mo2899g() {
        Image image;
        synchronized (this.f2707b) {
            try {
                image = this.f2706a.acquireNextImage();
            } catch (RuntimeException e10) {
                if (!m2891i(e10)) {
                    throw e10;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new C0588a(image);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    public int getHeight() {
        int height;
        synchronized (this.f2707b) {
            height = this.f2706a.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f2707b) {
            surface = this.f2706a.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1
    public int getWidth() {
        int width;
        synchronized (this.f2707b) {
            width = this.f2706a.getWidth();
        }
        return width;
    }
}

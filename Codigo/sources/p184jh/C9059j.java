package p184jh;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;

/* renamed from: jh.j */
/* loaded from: classes3.dex */
public class C9059j {

    /* renamed from: a */
    private SurfaceHolder f21734a;

    /* renamed from: b */
    private SurfaceTexture f21735b;

    public C9059j(SurfaceTexture surfaceTexture) {
        if (surfaceTexture == null) {
            throw new IllegalArgumentException("surfaceTexture may not be null");
        }
        this.f21735b = surfaceTexture;
    }

    public C9059j(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            throw new IllegalArgumentException("surfaceHolder may not be null");
        }
        this.f21734a = surfaceHolder;
    }

    /* renamed from: a */
    public void m26652a(Camera camera) {
        SurfaceHolder surfaceHolder = this.f21734a;
        if (surfaceHolder != null) {
            camera.setPreviewDisplay(surfaceHolder);
        } else {
            camera.setPreviewTexture(this.f21735b);
        }
    }
}

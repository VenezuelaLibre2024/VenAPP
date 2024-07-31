package q3;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import q3.q;

/* loaded from: classes.dex */
public class b0 implements h3.j<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final q f23412a;

    /* renamed from: b, reason: collision with root package name */
    private final k3.b f23413b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements q.b {

        /* renamed from: a, reason: collision with root package name */
        private final z f23414a;

        /* renamed from: b, reason: collision with root package name */
        private final c4.d f23415b;

        a(z zVar, c4.d dVar) {
            this.f23414a = zVar;
            this.f23415b = dVar;
        }

        @Override // q3.q.b
        public void a(k3.d dVar, Bitmap bitmap) {
            IOException a10 = this.f23415b.a();
            if (a10 != null) {
                if (bitmap == null) {
                    throw a10;
                }
                dVar.c(bitmap);
                throw a10;
            }
        }

        @Override // q3.q.b
        public void b() {
            this.f23414a.b();
        }
    }

    public b0(q qVar, k3.b bVar) {
        this.f23412a = qVar;
        this.f23413b = bVar;
    }

    @Override // h3.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public j3.v<Bitmap> b(InputStream inputStream, int i10, int i11, h3.h hVar) {
        boolean z10;
        z zVar;
        if (inputStream instanceof z) {
            zVar = (z) inputStream;
            z10 = false;
        } else {
            z10 = true;
            zVar = new z(inputStream, this.f23413b);
        }
        c4.d b10 = c4.d.b(zVar);
        try {
            return this.f23412a.e(new c4.i(b10), i10, i11, hVar, new a(zVar, b10));
        } finally {
            b10.e();
            if (z10) {
                zVar.e();
            }
        }
    }

    @Override // h3.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, h3.h hVar) {
        return this.f23412a.p(inputStream);
    }
}

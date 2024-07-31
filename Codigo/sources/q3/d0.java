package q3;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class d0 implements h3.j<Bitmap, Bitmap> {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements j3.v<Bitmap> {

        /* renamed from: a, reason: collision with root package name */
        private final Bitmap f23424a;

        a(Bitmap bitmap) {
            this.f23424a = bitmap;
        }

        @Override // j3.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f23424a;
        }

        @Override // j3.v
        public int p() {
            return c4.l.h(this.f23424a);
        }

        @Override // j3.v
        public void q() {
        }

        @Override // j3.v
        public Class<Bitmap> r() {
            return Bitmap.class;
        }
    }

    @Override // h3.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public j3.v<Bitmap> b(Bitmap bitmap, int i10, int i11, h3.h hVar) {
        return new a(bitmap);
    }

    @Override // h3.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Bitmap bitmap, h3.h hVar) {
        return true;
    }
}

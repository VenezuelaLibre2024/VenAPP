package p302q3;

import android.graphics.Bitmap;
import p036c4.C1871l;
import p129h3.C7624h;
import p129h3.InterfaceC7626j;
import p171j3.InterfaceC8975v;

/* renamed from: q3.d0 */
/* loaded from: classes.dex */
public final class C10235d0 implements InterfaceC7626j<Bitmap, Bitmap> {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q3.d0$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC8975v<Bitmap> {

        /* renamed from: a */
        private final Bitmap f25392a;

        a(Bitmap bitmap) {
            this.f25392a = bitmap;
        }

        @Override // p171j3.InterfaceC8975v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f25392a;
        }

        @Override // p171j3.InterfaceC8975v
        /* renamed from: p */
        public int mo26309p() {
            return C1871l.m9959h(this.f25392a);
        }

        @Override // p171j3.InterfaceC8975v
        /* renamed from: q */
        public void mo26310q() {
        }

        @Override // p171j3.InterfaceC8975v
        /* renamed from: r */
        public Class<Bitmap> mo26311r() {
            return Bitmap.class;
        }
    }

    @Override // p129h3.InterfaceC7626j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8975v<Bitmap> mo23152b(Bitmap bitmap, int i10, int i11, C7624h c7624h) {
        return new a(bitmap);
    }

    @Override // p129h3.InterfaceC7626j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo23151a(Bitmap bitmap, C7624h c7624h) {
        return true;
    }
}

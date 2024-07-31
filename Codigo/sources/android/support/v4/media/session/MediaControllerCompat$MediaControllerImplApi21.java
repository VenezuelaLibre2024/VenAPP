package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.util.Log;
import androidx.core.app.i;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a, reason: collision with root package name */
    final Object f550a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f551b;

    /* renamed from: c, reason: collision with root package name */
    private HashMap<c, a> f552c;

    /* renamed from: d, reason: collision with root package name */
    final MediaSessionCompat.Token f553d;

    /* loaded from: classes.dex */
    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f554a;

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i10, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f554a.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.f550a) {
                mediaControllerCompat$MediaControllerImplApi21.f553d.c(b.a.f2(i.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.f553d.d(d2.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                mediaControllerCompat$MediaControllerImplApi21.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends c.b {
        a(c cVar) {
            super(cVar);
        }

        @Override // android.support.v4.media.session.a
        public void F0(Bundle bundle) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void Q() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void S(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void p1(CharSequence charSequence) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void r0(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void x(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }
    }

    void a() {
        if (this.f553d.a() == null) {
            return;
        }
        for (c cVar : this.f551b) {
            a aVar = new a(cVar);
            this.f552c.put(cVar, aVar);
            cVar.f589b = aVar;
            try {
                this.f553d.a().s0(aVar);
                cVar.i(13, null, null);
            } catch (RemoteException e10) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
            }
        }
        this.f551b.clear();
    }
}

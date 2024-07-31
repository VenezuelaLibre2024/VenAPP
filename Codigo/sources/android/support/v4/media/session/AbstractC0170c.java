package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.InterfaceC0168a;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
/* loaded from: classes.dex */
public abstract class AbstractC0170c implements IBinder.DeathRecipient {

    /* renamed from: a */
    final MediaController.Callback f653a = new a(this);

    /* renamed from: b */
    InterfaceC0168a f654b;

    /* renamed from: android.support.v4.media.session.c$a */
    /* loaded from: classes.dex */
    private static class a extends MediaController.Callback {

        /* renamed from: a */
        private final WeakReference<AbstractC0170c> f655a;

        a(AbstractC0170c abstractC0170c) {
            this.f655a = new WeakReference<>(abstractC0170c);
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            AbstractC0170c abstractC0170c = this.f655a.get();
            if (abstractC0170c != null) {
                abstractC0170c.m770a(new C0171d(playbackInfo.getPlaybackType(), AudioAttributesCompat.m7438c(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m710a(bundle);
            AbstractC0170c abstractC0170c = this.f655a.get();
            if (abstractC0170c != null) {
                abstractC0170c.m771b(bundle);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            AbstractC0170c abstractC0170c = this.f655a.get();
            if (abstractC0170c != null) {
                abstractC0170c.m772c(MediaMetadataCompat.m698a(mediaMetadata));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            AbstractC0170c abstractC0170c = this.f655a.get();
            if (abstractC0170c == null || abstractC0170c.f654b != null) {
                return;
            }
            abstractC0170c.m773d(PlaybackStateCompat.m729a(playbackState));
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            AbstractC0170c abstractC0170c = this.f655a.get();
            if (abstractC0170c != null) {
                abstractC0170c.m774e(MediaSessionCompat.QueueItem.m713b(list));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            AbstractC0170c abstractC0170c = this.f655a.get();
            if (abstractC0170c != null) {
                abstractC0170c.m775f(charSequence);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            AbstractC0170c abstractC0170c = this.f655a.get();
            if (abstractC0170c != null) {
                abstractC0170c.m776g();
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m710a(bundle);
            AbstractC0170c abstractC0170c = this.f655a.get();
            if (abstractC0170c != null) {
                InterfaceC0168a interfaceC0168a = abstractC0170c.f654b;
                abstractC0170c.m777h(str, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.media.session.c$b */
    /* loaded from: classes.dex */
    public static class b extends InterfaceC0168a.a {

        /* renamed from: a */
        private final WeakReference<AbstractC0170c> f656a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(AbstractC0170c abstractC0170c) {
            this.f656a = new WeakReference<>(abstractC0170c);
        }

        @Override // android.support.v4.media.session.InterfaceC0168a
        /* renamed from: Z0 */
        public void mo761Z0(boolean z10) {
            AbstractC0170c abstractC0170c = this.f656a.get();
            if (abstractC0170c != null) {
                abstractC0170c.m778i(11, Boolean.valueOf(z10), null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0168a
        /* renamed from: a0 */
        public void mo762a0(int i10) {
            AbstractC0170c abstractC0170c = this.f656a.get();
            if (abstractC0170c != null) {
                abstractC0170c.m778i(12, Integer.valueOf(i10), null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0168a
        /* renamed from: c */
        public void mo763c(String str, Bundle bundle) {
            AbstractC0170c abstractC0170c = this.f656a.get();
            if (abstractC0170c != null) {
                abstractC0170c.m778i(1, str, bundle);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0168a
        /* renamed from: e2 */
        public void mo764e2(PlaybackStateCompat playbackStateCompat) {
            AbstractC0170c abstractC0170c = this.f656a.get();
            if (abstractC0170c != null) {
                abstractC0170c.m778i(2, playbackStateCompat, null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0168a
        /* renamed from: n1 */
        public void mo765n1(boolean z10) {
        }

        @Override // android.support.v4.media.session.InterfaceC0168a
        public void onRepeatModeChanged(int i10) {
            AbstractC0170c abstractC0170c = this.f656a.get();
            if (abstractC0170c != null) {
                abstractC0170c.m778i(9, Integer.valueOf(i10), null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0168a
        /* renamed from: t */
        public void mo766t() {
            AbstractC0170c abstractC0170c = this.f656a.get();
            if (abstractC0170c != null) {
                abstractC0170c.m778i(13, null, null);
            }
        }
    }

    /* renamed from: a */
    public void m770a(C0171d c0171d) {
    }

    /* renamed from: b */
    public void m771b(Bundle bundle) {
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        m778i(8, null, null);
    }

    /* renamed from: c */
    public void m772c(MediaMetadataCompat mediaMetadataCompat) {
    }

    /* renamed from: d */
    public void m773d(PlaybackStateCompat playbackStateCompat) {
    }

    /* renamed from: e */
    public void m774e(List<MediaSessionCompat.QueueItem> list) {
    }

    /* renamed from: f */
    public void m775f(CharSequence charSequence) {
    }

    /* renamed from: g */
    public void m776g() {
    }

    /* renamed from: h */
    public void m777h(String str, Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m778i(int i10, Object obj, Bundle bundle) {
    }
}

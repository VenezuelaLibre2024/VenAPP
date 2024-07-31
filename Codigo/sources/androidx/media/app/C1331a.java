package androidx.media.app;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat;

/* renamed from: androidx.media.app.a */
/* loaded from: classes.dex */
class C1331a {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Notification.MediaStyle m7443a() {
        return new Notification.MediaStyle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Notification.MediaStyle m7444b(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat.Token token) {
        if (iArr != null) {
            m7447e(mediaStyle, iArr);
        }
        if (token != null) {
            m7445c(mediaStyle, (MediaSession.Token) token.m722b());
        }
        return mediaStyle;
    }

    /* renamed from: c */
    static void m7445c(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m7446d(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    /* renamed from: e */
    static void m7447e(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }
}

package androidx.media.app;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes.dex */
class a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.MediaStyle a() {
        return new Notification.MediaStyle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.MediaStyle b(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat.Token token) {
        if (iArr != null) {
            e(mediaStyle, iArr);
        }
        if (token != null) {
            c(mediaStyle, (MediaSession.Token) token.b());
        }
        return mediaStyle;
    }

    static void c(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    static void e(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }
}
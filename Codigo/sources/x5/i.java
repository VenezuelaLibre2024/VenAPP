package x5;

import android.media.MediaPlayer;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f30428a = new i();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f30429a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f30430b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f30431c;

        public a(Integer num, Integer num2, Integer num3) {
            this.f30429a = num;
            this.f30430b = num2;
            this.f30431c = num3;
        }

        public final Integer a() {
            return this.f30431c;
        }

        public final Integer b() {
            return this.f30430b;
        }

        public final Integer c() {
            return this.f30429a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return n.a(this.f30429a, aVar.f30429a) && n.a(this.f30430b, aVar.f30430b) && n.a(this.f30431c, aVar.f30431c);
        }

        public int hashCode() {
            Integer num = this.f30429a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.f30430b;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f30431c;
            return hashCode2 + (num3 != null ? num3.hashCode() : 0);
        }

        public String toString() {
            return "VideoInfo(width=" + this.f30429a + ", height=" + this.f30430b + ", duration=" + this.f30431c + ')';
        }
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(MediaPlayer mediaPlayer, int i10, int i11) {
        return true;
    }

    public final a b(String path) {
        n.e(path, "path");
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setDataSource(path);
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: x5.h
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i10, int i11) {
                boolean c10;
                c10 = i.c(mediaPlayer2, i10, i11);
                return c10;
            }
        });
        try {
            mediaPlayer.prepare();
            mediaPlayer.getVideoHeight();
            a aVar = new a(Integer.valueOf(mediaPlayer.getVideoWidth()), Integer.valueOf(mediaPlayer.getVideoHeight()), Integer.valueOf(mediaPlayer.getDuration()));
            mediaPlayer.stop();
            mediaPlayer.release();
            return aVar;
        } catch (Throwable unused) {
            mediaPlayer.release();
            return new a(null, null, null);
        }
    }
}

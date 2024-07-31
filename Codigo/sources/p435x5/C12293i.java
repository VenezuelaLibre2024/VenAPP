package p435x5;

import android.media.MediaPlayer;
import kotlin.jvm.internal.C9322n;

/* renamed from: x5.i */
/* loaded from: classes.dex */
public final class C12293i {

    /* renamed from: a */
    public static final C12293i f32940a = new C12293i();

    /* renamed from: x5.i$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private Integer f32941a;

        /* renamed from: b */
        private Integer f32942b;

        /* renamed from: c */
        private Integer f32943c;

        public a(Integer num, Integer num2, Integer num3) {
            this.f32941a = num;
            this.f32942b = num2;
            this.f32943c = num3;
        }

        /* renamed from: a */
        public final Integer m39691a() {
            return this.f32943c;
        }

        /* renamed from: b */
        public final Integer m39692b() {
            return this.f32942b;
        }

        /* renamed from: c */
        public final Integer m39693c() {
            return this.f32941a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C9322n.m27777a(this.f32941a, aVar.f32941a) && C9322n.m27777a(this.f32942b, aVar.f32942b) && C9322n.m27777a(this.f32943c, aVar.f32943c);
        }

        public int hashCode() {
            Integer num = this.f32941a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.f32942b;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f32943c;
            return hashCode2 + (num3 != null ? num3.hashCode() : 0);
        }

        public String toString() {
            return "VideoInfo(width=" + this.f32941a + ", height=" + this.f32942b + ", duration=" + this.f32943c + ')';
        }
    }

    private C12293i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m39689c(MediaPlayer mediaPlayer, int i10, int i11) {
        return true;
    }

    /* renamed from: b */
    public final a m39690b(String path) {
        C9322n.m27781e(path, "path");
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setDataSource(path);
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: x5.h
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i10, int i11) {
                boolean m39689c;
                m39689c = C12293i.m39689c(mediaPlayer2, i10, i11);
                return m39689c;
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

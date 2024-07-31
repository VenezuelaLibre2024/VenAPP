package pm;

import android.media.MediaPlayer;
import kotlin.jvm.internal.n;
import nm.o;
import om.m;

/* loaded from: classes3.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private final o f23303a;

    public a(o dataSource) {
        n.e(dataSource, "dataSource");
        this.f23303a = dataSource;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(byte[] bytes) {
        this(new o(bytes));
        n.e(bytes, "bytes");
    }

    @Override // pm.b
    public void a(MediaPlayer mediaPlayer) {
        n.e(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.f23303a);
    }

    @Override // pm.b
    public void b(m soundPoolPlayer) {
        n.e(soundPoolPlayer, "soundPoolPlayer");
        throw new IllegalStateException("Bytes sources are not supported on LOW_LATENCY mode yet.".toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && n.a(this.f23303a, ((a) obj).f23303a);
    }

    public int hashCode() {
        return this.f23303a.hashCode();
    }

    public String toString() {
        return "BytesSource(dataSource=" + this.f23303a + ')';
    }
}

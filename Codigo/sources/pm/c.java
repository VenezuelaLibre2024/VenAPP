package pm;

import android.media.MediaPlayer;
import ck.v;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import kotlin.jvm.internal.n;
import om.m;
import xk.q;

/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private final String f23304a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f23305b;

    public c(String url, boolean z10) {
        n.e(url, "url");
        this.f23304a = url;
        this.f23305b = z10;
    }

    private final byte[] c(URL url) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream openStream = url.openStream();
        try {
            byte[] bArr = new byte[RecognitionOptions.AZTEC];
            while (true) {
                Integer valueOf = Integer.valueOf(openStream.read(bArr));
                if (!(valueOf.intValue() > 0)) {
                    valueOf = null;
                }
                if (valueOf == null) {
                    v vVar = v.f7137a;
                    mk.b.a(openStream, null);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    n.d(byteArray, "toByteArray(...)");
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, valueOf.intValue());
            }
        } finally {
        }
    }

    private final File e() {
        URL url = URI.create(this.f23304a).toURL();
        n.d(url, "toURL(...)");
        byte[] c10 = c(url);
        File createTempFile = File.createTempFile("sound", "");
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        try {
            fileOutputStream.write(c10);
            createTempFile.deleteOnExit();
            v vVar = v.f7137a;
            mk.b.a(fileOutputStream, null);
            n.b(createTempFile);
            return createTempFile;
        } finally {
        }
    }

    @Override // pm.b
    public void a(MediaPlayer mediaPlayer) {
        n.e(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.f23304a);
    }

    @Override // pm.b
    public void b(m soundPoolPlayer) {
        n.e(soundPoolPlayer, "soundPoolPlayer");
        soundPoolPlayer.release();
        soundPoolPlayer.r(this);
    }

    public final String d() {
        String n02;
        if (this.f23305b) {
            n02 = q.n0(this.f23304a, "file://");
            return n02;
        }
        String absolutePath = e().getAbsolutePath();
        n.d(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return n.a(this.f23304a, cVar.f23304a) && this.f23305b == cVar.f23305b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f23304a.hashCode() * 31;
        boolean z10 = this.f23305b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "UrlSource(url=" + this.f23304a + ", isLocal=" + this.f23305b + ')';
    }
}

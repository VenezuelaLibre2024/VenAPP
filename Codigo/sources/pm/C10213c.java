package pm;

import android.media.MediaPlayer;
import ck.C2037v;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import kotlin.jvm.internal.C9322n;
import mk.C9602b;
import om.C10024m;
import p450xk.C12525q;

/* renamed from: pm.c */
/* loaded from: classes3.dex */
public final class C10213c implements InterfaceC10212b {

    /* renamed from: a */
    private final String f25243a;

    /* renamed from: b */
    private final boolean f25244b;

    public C10213c(String url, boolean z10) {
        C9322n.m27781e(url, "url");
        this.f25243a = url;
        this.f25244b = z10;
    }

    /* renamed from: c */
    private final byte[] m30556c(URL url) {
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
                    C2037v c2037v = C2037v.f8089a;
                    C9602b.m28593a(openStream, null);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    C9322n.m27780d(byteArray, "toByteArray(...)");
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, valueOf.intValue());
            }
        } finally {
        }
    }

    /* renamed from: e */
    private final File m30557e() {
        URL url = URI.create(this.f25243a).toURL();
        C9322n.m27780d(url, "toURL(...)");
        byte[] m30556c = m30556c(url);
        File createTempFile = File.createTempFile("sound", "");
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        try {
            fileOutputStream.write(m30556c);
            createTempFile.deleteOnExit();
            C2037v c2037v = C2037v.f8089a;
            C9602b.m28593a(fileOutputStream, null);
            C9322n.m27778b(createTempFile);
            return createTempFile;
        } finally {
        }
    }

    @Override // pm.InterfaceC10212b
    /* renamed from: a */
    public void mo30554a(MediaPlayer mediaPlayer) {
        C9322n.m27781e(mediaPlayer, "mediaPlayer");
        mediaPlayer.setDataSource(this.f25243a);
    }

    @Override // pm.InterfaceC10212b
    /* renamed from: b */
    public void mo30555b(C10024m soundPoolPlayer) {
        C9322n.m27781e(soundPoolPlayer, "soundPoolPlayer");
        soundPoolPlayer.release();
        soundPoolPlayer.m29890r(this);
    }

    /* renamed from: d */
    public final String m30558d() {
        String m41091n0;
        if (this.f25244b) {
            m41091n0 = C12525q.m41091n0(this.f25243a, "file://");
            return m41091n0;
        }
        String absolutePath = m30557e().getAbsolutePath();
        C9322n.m27780d(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10213c)) {
            return false;
        }
        C10213c c10213c = (C10213c) obj;
        return C9322n.m27777a(this.f25243a, c10213c.f25243a) && this.f25244b == c10213c.f25244b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f25243a.hashCode() * 31;
        boolean z10 = this.f25244b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "UrlSource(url=" + this.f25243a + ", isLocal=" + this.f25244b + ')';
    }
}

package mk;

import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class m {
    public static final long a(Reader reader, Writer out, int i10) {
        n.e(reader, "<this>");
        n.e(out, "out");
        char[] cArr = new char[i10];
        int read = reader.read(cArr);
        long j10 = 0;
        while (read >= 0) {
            out.write(cArr, 0, read);
            j10 += read;
            read = reader.read(cArr);
        }
        return j10;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return a(reader, writer, i10);
    }

    public static final byte[] c(URL url) {
        n.e(url, "<this>");
        InputStream it = url.openStream();
        try {
            n.d(it, "it");
            byte[] c10 = a.c(it);
            b.a(it, null);
            return c10;
        } finally {
        }
    }

    public static final String d(Reader reader) {
        n.e(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        n.d(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }
}

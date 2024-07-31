package mk;

import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import kotlin.jvm.internal.C9322n;

/* renamed from: mk.m */
/* loaded from: classes3.dex */
public final class C9613m {
    /* renamed from: a */
    public static final long m28606a(Reader reader, Writer out, int i10) {
        C9322n.m27781e(reader, "<this>");
        C9322n.m27781e(out, "out");
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

    /* renamed from: b */
    public static /* synthetic */ long m28607b(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return m28606a(reader, writer, i10);
    }

    /* renamed from: c */
    public static final byte[] m28608c(URL url) {
        C9322n.m27781e(url, "<this>");
        InputStream it = url.openStream();
        try {
            C9322n.m27780d(it, "it");
            byte[] m28592c = C9601a.m28592c(it);
            C9602b.m28593a(it, null);
            return m28592c;
        } finally {
        }
    }

    /* renamed from: d */
    public static final String m28609d(Reader reader) {
        C9322n.m27781e(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        m28607b(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        C9322n.m27780d(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }
}

package p7;

import eb.e;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l7.d;
import l7.g;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f22858c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a, reason: collision with root package name */
    private final CharsetDecoder f22859a = e.f14596c.newDecoder();

    /* renamed from: b, reason: collision with root package name */
    private final CharsetDecoder f22860b = e.f14595b.newDecoder();

    private String c(ByteBuffer byteBuffer) {
        String charBuffer;
        CharsetDecoder charsetDecoder;
        try {
            charBuffer = this.f22859a.decode(byteBuffer).toString();
            charsetDecoder = this.f22859a;
        } catch (CharacterCodingException unused) {
            this.f22859a.reset();
            byteBuffer.rewind();
            try {
                charBuffer = this.f22860b.decode(byteBuffer).toString();
                charsetDecoder = this.f22860b;
            } catch (CharacterCodingException unused2) {
                this.f22860b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th2) {
                this.f22860b.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f22859a.reset();
            byteBuffer.rewind();
            throw th3;
        }
        charsetDecoder.reset();
        byteBuffer.rewind();
        return charBuffer;
    }

    @Override // l7.g
    protected l7.a b(d dVar, ByteBuffer byteBuffer) {
        String c10 = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (c10 == null) {
            return new l7.a(new c(bArr, null, null));
        }
        Matcher matcher = f22858c.matcher(c10);
        String str2 = null;
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String e10 = eb.c.e(group);
                e10.hashCode();
                if (e10.equals("streamurl")) {
                    str2 = group2;
                } else if (e10.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new l7.a(new c(bArr, str, str2));
    }
}

package p290p7;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p082eb.C7147c;
import p082eb.C7149e;
import p216l7.AbstractC9406g;
import p216l7.C9400a;
import p216l7.C9403d;

/* renamed from: p7.a */
/* loaded from: classes.dex */
public final class C10108a extends AbstractC9406g {

    /* renamed from: c */
    private static final Pattern f24791c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a */
    private final CharsetDecoder f24792a = C7149e.f16019c.newDecoder();

    /* renamed from: b */
    private final CharsetDecoder f24793b = C7149e.f16018b.newDecoder();

    /* renamed from: c */
    private String m30147c(ByteBuffer byteBuffer) {
        String charBuffer;
        CharsetDecoder charsetDecoder;
        try {
            charBuffer = this.f24792a.decode(byteBuffer).toString();
            charsetDecoder = this.f24792a;
        } catch (CharacterCodingException unused) {
            this.f24792a.reset();
            byteBuffer.rewind();
            try {
                charBuffer = this.f24793b.decode(byteBuffer).toString();
                charsetDecoder = this.f24793b;
            } catch (CharacterCodingException unused2) {
                this.f24793b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th2) {
                this.f24793b.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f24792a.reset();
            byteBuffer.rewind();
            throw th3;
        }
        charsetDecoder.reset();
        byteBuffer.rewind();
        return charBuffer;
    }

    @Override // p216l7.AbstractC9406g
    /* renamed from: b */
    protected C9400a mo28014b(C9403d c9403d, ByteBuffer byteBuffer) {
        String m30147c = m30147c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (m30147c == null) {
            return new C9400a(new C10110c(bArr, null, null));
        }
        Matcher matcher = f24791c.matcher(m30147c);
        String str2 = null;
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String m21253e = C7147c.m21253e(group);
                m21253e.hashCode();
                if (m21253e.equals("streamurl")) {
                    str2 = group2;
                } else if (m21253e.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new C9400a(new C10110c(bArr, str, str2));
    }
}

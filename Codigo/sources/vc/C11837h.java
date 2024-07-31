package vc;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: vc.h */
/* loaded from: classes.dex */
public class C11837h {

    /* renamed from: a */
    private static final AtomicLong f31241a = new AtomicLong(0);

    /* renamed from: b */
    private static String f31242b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11837h(C11826b0 c11826b0) {
        byte[] bArr = new byte[10];
        m37717e(bArr);
        m37716d(bArr);
        m37715c(bArr);
        String m37745z = C11839i.m37745z(c11826b0.mo37682a().mo37689c());
        String m37739t = C11839i.m37739t(bArr);
        Locale locale = Locale.US;
        f31242b = String.format(locale, "%s%s%s%s", m37739t.substring(0, 12), m37739t.substring(12, 16), m37739t.subSequence(16, 20), m37745z.substring(0, 12)).toUpperCase(locale);
    }

    /* renamed from: a */
    private static byte[] m37713a(long j10) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j10);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: b */
    private static byte[] m37714b(long j10) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j10);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: c */
    private void m37715c(byte[] bArr) {
        byte[] m37714b = m37714b(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = m37714b[0];
        bArr[9] = m37714b[1];
    }

    /* renamed from: d */
    private void m37716d(byte[] bArr) {
        byte[] m37714b = m37714b(f31241a.incrementAndGet());
        bArr[6] = m37714b[0];
        bArr[7] = m37714b[1];
    }

    /* renamed from: e */
    private void m37717e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] m37713a = m37713a(time / 1000);
        bArr[0] = m37713a[0];
        bArr[1] = m37713a[1];
        bArr[2] = m37713a[2];
        bArr[3] = m37713a[3];
        byte[] m37714b = m37714b(time % 1000);
        bArr[4] = m37714b[0];
        bArr[5] = m37714b[1];
    }

    public String toString() {
        return f31242b;
    }
}

package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzapg {
    public static X509Certificate[][] zza(String str) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair zzc = zzaph.zzc(randomAccessFile);
            if (zzc == null) {
                throw new zzapd("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) zzc.first;
            long longValue = ((Long) zzc.second).longValue();
            long j10 = (-20) + longValue;
            if (j10 >= 0) {
                randomAccessFile.seek(j10);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new zzapd("ZIP64 APK not supported");
                }
            }
            long zza = zzaph.zza(byteBuffer);
            if (zza >= longValue) {
                throw new zzapd("ZIP Central Directory offset out of range: " + zza + ". ZIP End of Central Directory offset: " + longValue);
            }
            if (zzaph.zzb(byteBuffer) + zza != longValue) {
                throw new zzapd("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (zza < 32) {
                throw new zzapd("APK too small for APK Signing Block. ZIP Central Directory offset: " + zza);
            }
            ByteBuffer allocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            randomAccessFile.seek(zza - allocate.capacity());
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                throw new zzapd("No APK Signing Block before ZIP Central Directory");
            }
            int i10 = 0;
            long j11 = allocate.getLong(0);
            if (j11 < allocate.capacity() || j11 > 2147483639) {
                throw new zzapd("APK Signing Block size out of range: " + j11);
            }
            int i11 = (int) (8 + j11);
            long j12 = zza - i11;
            if (j12 < 0) {
                throw new zzapd("APK Signing Block offset out of range: " + j12);
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i11);
            allocate2.order(byteOrder);
            randomAccessFile.seek(j12);
            randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
            long j13 = allocate2.getLong(0);
            if (j13 != j11) {
                throw new zzapd("APK Signing Block sizes in header and footer do not match: " + j13 + " vs " + j11);
            }
            Pair create = Pair.create(allocate2, Long.valueOf(j12));
            ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
            long longValue2 = ((Long) create.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int capacity = byteBuffer2.capacity() - 24;
            if (capacity < 8) {
                throw new IllegalArgumentException("end < start: " + capacity + " < 8");
            }
            int capacity2 = byteBuffer2.capacity();
            if (capacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
            }
            int limit = byteBuffer2.limit();
            int position = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(capacity);
                byteBuffer2.position(8);
                ByteBuffer slice = byteBuffer2.slice();
                slice.order(byteBuffer2.order());
                while (slice.hasRemaining()) {
                    i10++;
                    if (slice.remaining() < 8) {
                        throw new zzapd("Insufficient data to read size of APK Signing Block entry #" + i10);
                    }
                    long j14 = slice.getLong();
                    if (j14 < 4 || j14 > 2147483647L) {
                        throw new zzapd("APK Signing Block entry #" + i10 + " size out of range: " + j14);
                    }
                    int i12 = (int) j14;
                    int position2 = slice.position() + i12;
                    if (i12 > slice.remaining()) {
                        throw new zzapd("APK Signing Block entry #" + i10 + " size out of range: " + i12 + ", available: " + slice.remaining());
                    }
                    if (slice.getInt() == 1896449818) {
                        X509Certificate[][] zzl = zzl(randomAccessFile.getChannel(), new zzapc(zze(slice, i12 - 4), longValue2, zza, longValue, byteBuffer, null));
                        randomAccessFile.close();
                        return zzl;
                    }
                    slice.position(position2);
                }
                throw new zzapd("No APK Signature Scheme v2 block in APK Signing Block");
            } finally {
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    private static int zzb(int i10) {
        if (i10 == 1) {
            return 32;
        }
        if (i10 == 2) {
            return 64;
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i10);
    }

    private static int zzc(int i10) {
        if (i10 == 513) {
            return 1;
        }
        if (i10 == 514) {
            return 2;
        }
        if (i10 == 769) {
            return 1;
        }
        switch (i10) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
        }
    }

    private static String zzd(int i10) {
        if (i10 == 1) {
            return "SHA-256";
        }
        if (i10 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i10);
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i10) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i11 = i10 + position;
        if (i11 < position || i11 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i11);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i11);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    private static ByteBuffer zzf(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            return zze(byteBuffer, i10);
        }
        throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i10 + ", remaining: " + byteBuffer.remaining());
    }

    private static void zzg(int i10, byte[] bArr, int i11) {
        bArr[1] = (byte) (i10 & 255);
        bArr[2] = (byte) ((i10 >>> 8) & 255);
        bArr[3] = (byte) ((i10 >>> 16) & 255);
        bArr[4] = (byte) (i10 >> 24);
    }

    private static void zzh(Map map, FileChannel fileChannel, long j10, long j11, long j12, ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        zzapa zzapaVar = new zzapa(fileChannel, 0L, j10);
        zzapa zzapaVar2 = new zzapa(fileChannel, j11, j12 - j11);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        zzaph.zzd(duplicate, j10);
        zzaoy zzaoyVar = new zzaoy(duplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Integer) it.next()).intValue();
            i10++;
        }
        try {
            byte[][] zzk = zzk(iArr, new zzaoz[]{zzapaVar, zzapaVar2, zzaoyVar});
            for (int i11 = 0; i11 < size; i11++) {
                int i12 = iArr[i11];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i12)), zzk[i11])) {
                    throw new SecurityException(zzd(i12).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e10) {
            throw new SecurityException("Failed to compute digest(s) of contents", e10);
        }
    }

    private static byte[] zzi(ByteBuffer byteBuffer) {
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IOException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i10];
            byteBuffer.get(bArr);
            return bArr;
        }
        throw new IOException("Underflow while reading length-prefixed value. Length: " + i10 + ", available: " + byteBuffer.remaining());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = zzc(r6);
        r12 = zzc(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r11 == 1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r12 == 1) goto L141;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x00bb. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:127:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012e A[Catch: InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x024e, InvalidAlgorithmParameterException -> 0x0250, InvalidKeyException -> 0x0252, InvalidKeySpecException -> 0x0254, NoSuchAlgorithmException -> 0x0256, TryCatch #5 {InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x024e, blocks: (B:68:0x0118, B:70:0x012e, B:71:0x0131), top: B:67:0x0118 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.security.cert.X509Certificate[] zzj(java.nio.ByteBuffer r22, java.util.Map r23, java.security.cert.CertificateFactory r24) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapg.zzj(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static byte[][] zzk(int[] iArr, zzaoz[] zzaozVarArr) {
        long j10;
        int i10;
        int length;
        int i11 = 0;
        long j11 = 0;
        int i12 = 0;
        long j12 = 0;
        while (true) {
            j10 = 1048576;
            if (i12 >= 3) {
                break;
            }
            j12 += (zzaozVarArr[i12].zza() + 1048575) / 1048576;
            i12++;
        }
        if (j12 >= 2097151) {
            throw new DigestException("Too many chunks: " + j12);
        }
        byte[][] bArr = new byte[iArr.length];
        int i13 = 0;
        while (true) {
            length = iArr.length;
            if (i13 >= length) {
                break;
            }
            int i14 = (int) j12;
            byte[] bArr2 = new byte[(zzb(iArr[i13]) * i14) + 5];
            bArr2[0] = 90;
            zzg(i14, bArr2, 1);
            bArr[i13] = bArr2;
            i13++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i15 = 0; i15 < iArr.length; i15++) {
            String zzd = zzd(iArr[i15]);
            try {
                messageDigestArr[i15] = MessageDigest.getInstance(zzd);
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(zzd.concat(" digest not supported"), e10);
            }
        }
        int i16 = 0;
        int i17 = 0;
        for (i10 = 3; i16 < i10; i10 = 3) {
            zzaoz zzaozVar = zzaozVarArr[i16];
            long j13 = j11;
            long zza = zzaozVar.zza();
            while (zza > j11) {
                int min = (int) Math.min(zza, j10);
                zzg(min, bArr3, 1);
                for (int i18 = 0; i18 < length; i18++) {
                    messageDigestArr[i18].update(bArr3);
                }
                long j14 = j13;
                try {
                    zzaozVar.zzb(messageDigestArr, j14, min);
                    byte[] bArr4 = bArr3;
                    int i19 = 0;
                    while (i19 < iArr.length) {
                        int i20 = iArr[i19];
                        zzaoz zzaozVar2 = zzaozVar;
                        byte[] bArr5 = bArr[i19];
                        int zzb = zzb(i20);
                        int i21 = length;
                        MessageDigest messageDigest = messageDigestArr[i19];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int digest = messageDigest.digest(bArr5, (i17 * zzb) + 5, zzb);
                        if (digest != zzb) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                        }
                        i19++;
                        zzaozVar = zzaozVar2;
                        length = i21;
                        messageDigestArr = messageDigestArr2;
                    }
                    long j15 = min;
                    long j16 = j14 + j15;
                    zza -= j15;
                    i17++;
                    j11 = 0;
                    j10 = 1048576;
                    bArr3 = bArr4;
                    j13 = j16;
                    messageDigestArr = messageDigestArr;
                } catch (IOException e11) {
                    throw new DigestException("Failed to digest chunk #" + i17 + " of section #" + i11, e11);
                }
            }
            i11++;
            i16++;
            j11 = 0;
            j10 = 1048576;
        }
        byte[][] bArr6 = new byte[iArr.length];
        for (int i22 = 0; i22 < iArr.length; i22++) {
            int i23 = iArr[i22];
            byte[] bArr7 = bArr[i22];
            String zzd2 = zzd(i23);
            try {
                bArr6[i22] = MessageDigest.getInstance(zzd2).digest(bArr7);
            } catch (NoSuchAlgorithmException e12) {
                throw new RuntimeException(zzd2.concat(" digest not supported"), e12);
            }
        }
        return bArr6;
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zzapc zzapcVar) {
        ByteBuffer byteBuffer;
        long j10;
        long j11;
        long j12;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = zzapcVar.zza;
                ByteBuffer zzf = zzf(byteBuffer);
                int i10 = 0;
                while (zzf.hasRemaining()) {
                    i10++;
                    try {
                        arrayList.add(zzj(zzf(zzf), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e10) {
                        throw new SecurityException("Failed to parse/verify signer #" + i10 + " block", e10);
                    }
                }
                if (i10 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                j10 = zzapcVar.zzb;
                j11 = zzapcVar.zzc;
                j12 = zzapcVar.zzd;
                byteBuffer2 = zzapcVar.zze;
                zzh(hashMap, fileChannel, j10, j11, j12, byteBuffer2);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
            } catch (IOException e11) {
                throw new SecurityException("Failed to read list of signers", e11);
            }
        } catch (CertificateException e12) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e12);
        }
    }
}

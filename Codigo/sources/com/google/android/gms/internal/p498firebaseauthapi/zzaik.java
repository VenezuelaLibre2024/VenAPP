package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class zzaik extends zzahm {
    private static final Logger zza = Logger.getLogger(zzaik.class.getName());
    private static final boolean zzb = zzamk.zzc();
    zzain zze;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static abstract class zza extends zzaik {
        final byte[] zza;
        final int zzb;
        int zzc;
        int zzd;

        zza(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.zza = bArr;
            this.zzb = bArr.length;
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final int zza() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        final void zza(byte b10) {
            byte[] bArr = this.zza;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            bArr[i10] = b10;
            this.zzd++;
        }

        final void zza(int i10) {
            byte[] bArr = this.zza;
            int i11 = this.zzc;
            int i12 = i11 + 1;
            bArr[i11] = (byte) i10;
            int i13 = i12 + 1;
            bArr[i12] = (byte) (i10 >> 8);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (i10 >> 16);
            this.zzc = i14 + 1;
            bArr[i14] = (byte) (i10 >>> 24);
            this.zzd += 4;
        }

        final void zza(int i10, int i11) {
            zzb((i10 << 3) | i11);
        }

        final void zza(long j10) {
            byte[] bArr = this.zza;
            int i10 = this.zzc;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i14 + 1;
            bArr[i14] = (byte) (j10 >> 32);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (j10 >> 40);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (j10 >> 48);
            this.zzc = i17 + 1;
            bArr[i17] = (byte) (j10 >> 56);
            this.zzd += 8;
        }

        final void zzb(int i10) {
            if (!zzaik.zzb) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i11 = this.zzc;
                    this.zzc = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | RecognitionOptions.ITF);
                    this.zzd++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i12 = this.zzc;
                this.zzc = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.zzd++;
                return;
            }
            long j10 = this.zzc;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.zza;
                int i13 = this.zzc;
                this.zzc = i13 + 1;
                zzamk.zza(bArr3, i13, (byte) ((i10 & 127) | RecognitionOptions.ITF));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i14 = this.zzc;
            this.zzc = i14 + 1;
            zzamk.zza(bArr4, i14, (byte) i10);
            this.zzd += (int) (this.zzc - j10);
        }

        final void zzb(long j10) {
            if (!zzaik.zzb) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i10 = this.zzc;
                    this.zzc = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | RecognitionOptions.ITF);
                    this.zzd++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.zzd++;
                return;
            }
            long j11 = this.zzc;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.zza;
                int i12 = this.zzc;
                this.zzc = i12 + 1;
                zzamk.zza(bArr3, i12, (byte) ((((int) j10) & 127) | RecognitionOptions.ITF));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i13 = this.zzc;
            this.zzc = i13 + 1;
            zzamk.zza(bArr4, i13, (byte) j10);
            this.zzd += (int) (this.zzc - j11);
        }
    }

    /* loaded from: classes2.dex */
    public static class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }

        zzb(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }
    }

    /* loaded from: classes2.dex */
    private static class zzc extends zzaik {
        private final byte[] zza;
        private final int zzb;
        private final int zzc;
        private int zzd;

        zzc(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if ((i11 | 0 | (bArr.length - i11)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i11)));
            }
            this.zza = bArr;
            this.zzb = 0;
            this.zzd = 0;
            this.zzc = i11;
        }

        private final void zzc(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.zza, this.zzd, i11);
                this.zzd += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i11)), e10);
            }
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final int zza() {
            return this.zzc - this.zzd;
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzahm
        public final void zza(byte[] bArr, int i10, int i11) {
            zzc(bArr, i10, i11);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzb(byte b10) {
            try {
                byte[] bArr = this.zza;
                int i10 = this.zzd;
                this.zzd = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e10);
            }
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzb(int i10, zzakn zzaknVar) {
            zzk(1, 3);
            zzl(2, i10);
            zzk(3, 2);
            zzc(zzaknVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzb(int i10, String str) {
            zzk(i10, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzb(int i10, boolean z10) {
            zzk(i10, 0);
            zzb(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzb(zzahp zzahpVar) {
            zzn(zzahpVar.zzb());
            zzahpVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        final void zzb(zzakn zzaknVar, zzalf zzalfVar) {
            zzn(((zzahf) zzaknVar).zza(zzalfVar));
            zzalfVar.zza((zzalf) zzaknVar, (zzana) this.zze);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzb(String str) {
            int i10 = this.zzd;
            try {
                int zzj = zzaik.zzj(str.length() * 3);
                int zzj2 = zzaik.zzj(str.length());
                if (zzj2 != zzj) {
                    zzn(zzaml.zza(str));
                    this.zzd = zzaml.zza(str, this.zza, this.zzd, zza());
                    return;
                }
                int i11 = i10 + zzj2;
                this.zzd = i11;
                int zza = zzaml.zza(str, this.zza, i11, zza());
                this.zzd = i10;
                zzn((zza - i10) - zzj2);
                this.zzd = zza;
            } catch (zzamo e10) {
                this.zzd = i10;
                zza(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new zzb(e11);
            }
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzb(byte[] bArr, int i10, int i11) {
            zzn(i11);
            zzc(bArr, 0, i11);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzc() {
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzc(int i10, zzahp zzahpVar) {
            zzk(i10, 2);
            zzb(zzahpVar);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        final void zzc(int i10, zzakn zzaknVar, zzalf zzalfVar) {
            zzk(i10, 2);
            zzn(((zzahf) zzaknVar).zza(zzalfVar));
            zzalfVar.zza((zzalf) zzaknVar, (zzana) this.zze);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzc(zzakn zzaknVar) {
            zzn(zzaknVar.zzl());
            zzaknVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzd(int i10, zzahp zzahpVar) {
            zzk(1, 3);
            zzl(2, i10);
            zzc(3, zzahpVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzf(int i10, long j10) {
            zzk(i10, 1);
            zzh(j10);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzh(int i10, int i11) {
            zzk(i10, 5);
            zzk(i11);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzh(int i10, long j10) {
            zzk(i10, 0);
            zzj(j10);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzh(long j10) {
            try {
                byte[] bArr = this.zza;
                int i10 = this.zzd;
                int i11 = i10 + 1;
                bArr[i10] = (byte) j10;
                int i12 = i11 + 1;
                bArr[i11] = (byte) (j10 >> 8);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (j10 >> 16);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (j10 >> 24);
                int i15 = i14 + 1;
                bArr[i14] = (byte) (j10 >> 32);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (j10 >> 40);
                int i17 = i16 + 1;
                bArr[i16] = (byte) (j10 >> 48);
                this.zzd = i17 + 1;
                bArr[i17] = (byte) (j10 >> 56);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e10);
            }
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzi(int i10, int i11) {
            zzk(i10, 0);
            zzl(i11);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzj(long j10) {
            if (zzaik.zzb && zza() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i10 = this.zzd;
                    this.zzd = i10 + 1;
                    zzamk.zza(bArr, i10, (byte) ((((int) j10) & 127) | RecognitionOptions.ITF));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i11 = this.zzd;
                this.zzd = i11 + 1;
                zzamk.zza(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.zza;
                    int i12 = this.zzd;
                    this.zzd = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | RecognitionOptions.ITF);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e10);
                }
            }
            byte[] bArr4 = this.zza;
            int i13 = this.zzd;
            this.zzd = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzk(int i10) {
            try {
                byte[] bArr = this.zza;
                int i11 = this.zzd;
                int i12 = i11 + 1;
                bArr[i11] = (byte) i10;
                int i13 = i12 + 1;
                bArr[i12] = (byte) (i10 >> 8);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (i10 >> 16);
                this.zzd = i14 + 1;
                bArr[i14] = (byte) (i10 >>> 24);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e10);
            }
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzk(int i10, int i11) {
            zzn((i10 << 3) | i11);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzl(int i10) {
            if (i10 >= 0) {
                zzn(i10);
            } else {
                zzj(i10);
            }
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzl(int i10, int i11) {
            zzk(i10, 0);
            zzn(i11);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzn(int i10) {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zza;
                    int i11 = this.zzd;
                    this.zzd = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | RecognitionOptions.ITF);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e10);
                }
            }
            byte[] bArr2 = this.zza;
            int i12 = this.zzd;
            this.zzd = i12 + 1;
            bArr2[i12] = (byte) i10;
        }
    }

    /* loaded from: classes2.dex */
    private static final class zzd extends zza {
        private final OutputStream zzf;

        zzd(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.zzf = outputStream;
        }

        private final void zzc(byte[] bArr, int i10, int i11) {
            int i12 = this.zzb;
            int i13 = this.zzc;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.zza, i13, i11);
                this.zzc += i11;
            } else {
                int i14 = i12 - i13;
                System.arraycopy(bArr, i10, this.zza, i13, i14);
                int i15 = i10 + i14;
                i11 -= i14;
                this.zzc = this.zzb;
                this.zzd += i14;
                zze();
                if (i11 <= this.zzb) {
                    System.arraycopy(bArr, i15, this.zza, 0, i11);
                    this.zzc = i11;
                } else {
                    this.zzf.write(bArr, i15, i11);
                }
            }
            this.zzd += i11;
        }

        private final void zze() {
            this.zzf.write(this.zza, 0, this.zzc);
            this.zzc = 0;
        }

        private final void zzo(int i10) {
            if (this.zzb - this.zzc < i10) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzahm
        public final void zza(byte[] bArr, int i10, int i11) {
            zzc(bArr, i10, i11);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzb(byte b10) {
            if (this.zzc == this.zzb) {
                zze();
            }
            zza(b10);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzb(int i10, zzakn zzaknVar) {
            zzk(1, 3);
            zzl(2, i10);
            zzk(3, 2);
            zzc(zzaknVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzb(int i10, String str) {
            zzk(i10, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzb(int i10, boolean z10) {
            zzo(11);
            zza(i10, 0);
            zza(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzb(zzahp zzahpVar) {
            zzn(zzahpVar.zzb());
            zzahpVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        final void zzb(zzakn zzaknVar, zzalf zzalfVar) {
            zzn(((zzahf) zzaknVar).zza(zzalfVar));
            zzalfVar.zza((zzalf) zzaknVar, (zzana) this.zze);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzb(String str) {
            int zza;
            try {
                int length = str.length() * 3;
                int zzj = zzaik.zzj(length);
                int i10 = zzj + length;
                int i11 = this.zzb;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int zza2 = zzaml.zza(str, bArr, 0, length);
                    zzn(zza2);
                    zza(bArr, 0, zza2);
                    return;
                }
                if (i10 > i11 - this.zzc) {
                    zze();
                }
                int zzj2 = zzaik.zzj(str.length());
                int i12 = this.zzc;
                try {
                    if (zzj2 == zzj) {
                        int i13 = i12 + zzj2;
                        this.zzc = i13;
                        int zza3 = zzaml.zza(str, this.zza, i13, this.zzb - i13);
                        this.zzc = i12;
                        zza = (zza3 - i12) - zzj2;
                        zzb(zza);
                        this.zzc = zza3;
                    } else {
                        zza = zzaml.zza(str);
                        zzb(zza);
                        this.zzc = zzaml.zza(str, this.zza, this.zzc, zza);
                    }
                    this.zzd += zza;
                } catch (zzamo e10) {
                    this.zzd -= this.zzc - i12;
                    this.zzc = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new zzb(e11);
                }
            } catch (zzamo e12) {
                zza(str, e12);
            }
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzb(byte[] bArr, int i10, int i11) {
            zzn(i11);
            zzc(bArr, 0, i11);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzc() {
            if (this.zzc > 0) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzc(int i10, zzahp zzahpVar) {
            zzk(i10, 2);
            zzb(zzahpVar);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        final void zzc(int i10, zzakn zzaknVar, zzalf zzalfVar) {
            zzk(i10, 2);
            zzb(zzaknVar, zzalfVar);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzc(zzakn zzaknVar) {
            zzn(zzaknVar.zzl());
            zzaknVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzd(int i10, zzahp zzahpVar) {
            zzk(1, 3);
            zzl(2, i10);
            zzc(3, zzahpVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzf(int i10, long j10) {
            zzo(18);
            zza(i10, 1);
            zza(j10);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzh(int i10, int i11) {
            zzo(14);
            zza(i10, 5);
            zza(i11);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzh(int i10, long j10) {
            zzo(20);
            zza(i10, 0);
            zzb(j10);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzh(long j10) {
            zzo(8);
            zza(j10);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzi(int i10, int i11) {
            zzo(20);
            zza(i10, 0);
            if (i11 >= 0) {
                zzb(i11);
            } else {
                zzb(i11);
            }
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzj(long j10) {
            zzo(10);
            zzb(j10);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzk(int i10) {
            zzo(4);
            zza(i10);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzk(int i10, int i11) {
            zzn((i10 << 3) | i11);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzl(int i10) {
            if (i10 >= 0) {
                zzn(i10);
            } else {
                zzj(i10);
            }
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzl(int i10, int i11) {
            zzo(20);
            zza(i10, 0);
            zzb(i11);
        }

        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzaik
        public final void zzn(int i10) {
            zzo(5);
            zzb(i10);
        }
    }

    private zzaik() {
    }

    public static int zza(double d10) {
        return 8;
    }

    public static int zza(float f10) {
        return 4;
    }

    private static int zza(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static int zza(int i10, double d10) {
        return zzj(i10 << 3) + 8;
    }

    public static int zza(int i10, float f10) {
        return zzj(i10 << 3) + 4;
    }

    public static int zza(int i10, long j10) {
        return zzj(i10 << 3) + 8;
    }

    public static int zza(int i10, zzahp zzahpVar) {
        int zzj = zzj(i10 << 3);
        int zzb2 = zzahpVar.zzb();
        return zzj + zzj(zzb2) + zzb2;
    }

    public static int zza(int i10, zzajr zzajrVar) {
        return (zzj(8) << 1) + zzg(2, i10) + zzb(3, zzajrVar);
    }

    public static int zza(int i10, zzakn zzaknVar) {
        return (zzj(8) << 1) + zzg(2, i10) + zzj(24) + zzb(zzaknVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int zza(int i10, zzakn zzaknVar, zzalf zzalfVar) {
        return (zzj(i10 << 3) << 1) + ((zzahf) zzaknVar).zza(zzalfVar);
    }

    public static int zza(int i10, String str) {
        return zzj(i10 << 3) + zza(str);
    }

    public static int zza(int i10, boolean z10) {
        return zzj(i10 << 3) + 1;
    }

    public static int zza(zzahp zzahpVar) {
        int zzb2 = zzahpVar.zzb();
        return zzj(zzb2) + zzb2;
    }

    public static int zza(zzajr zzajrVar) {
        int zzb2 = zzajrVar.zzb();
        return zzj(zzb2) + zzb2;
    }

    @Deprecated
    public static int zza(zzakn zzaknVar) {
        return zzaknVar.zzl();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzakn zzaknVar, zzalf zzalfVar) {
        int zza2 = ((zzahf) zzaknVar).zza(zzalfVar);
        return zzj(zza2) + zza2;
    }

    public static int zza(String str) {
        int length;
        try {
            length = zzaml.zza(str);
        } catch (zzamo unused) {
            length = str.getBytes(zzajf.zza).length;
        }
        return zzj(length) + length;
    }

    public static int zza(boolean z10) {
        return 1;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    private static long zza(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static zzaik zza(OutputStream outputStream, int i10) {
        return new zzd(outputStream, i10);
    }

    public static int zzb(int i10, int i11) {
        return zzj(i10 << 3) + zze(i11);
    }

    public static int zzb(int i10, long j10) {
        return zzj(i10 << 3) + zzg(j10);
    }

    public static int zzb(int i10, zzahp zzahpVar) {
        return (zzj(8) << 1) + zzg(2, i10) + zza(3, zzahpVar);
    }

    public static int zzb(int i10, zzajr zzajrVar) {
        int zzj = zzj(i10 << 3);
        int zzb2 = zzajrVar.zzb();
        return zzj + zzj(zzb2) + zzb2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i10, zzakn zzaknVar, zzalf zzalfVar) {
        return zzj(i10 << 3) + zza(zzaknVar, zzalfVar);
    }

    public static int zzb(zzakn zzaknVar) {
        int zzl = zzaknVar.zzl();
        return zzj(zzl) + zzl;
    }

    public static zzaik zzb(byte[] bArr) {
        return new zzc(bArr, 0, bArr.length);
    }

    public static int zzc(int i10) {
        return zze(i10);
    }

    public static int zzc(int i10, int i11) {
        return zzj(i10 << 3) + 4;
    }

    public static int zzc(int i10, long j10) {
        return zzj(i10 << 3) + 8;
    }

    public static int zzc(long j10) {
        return 8;
    }

    public static int zzd(int i10) {
        return 4;
    }

    public static int zzd(int i10, int i11) {
        return zzj(i10 << 3) + zze(i11);
    }

    public static int zzd(int i10, long j10) {
        return zzj(i10 << 3) + zzg(zza(j10));
    }

    public static int zzd(long j10) {
        return zzg(j10);
    }

    public static int zze(int i10) {
        if (i10 >= 0) {
            return zzj(i10);
        }
        return 10;
    }

    public static int zze(int i10, int i11) {
        return zzj(i10 << 3) + 4;
    }

    public static int zze(int i10, long j10) {
        return zzj(i10 << 3) + zzg(j10);
    }

    public static int zze(long j10) {
        return 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(int i10) {
        return i10 > 4096 ? RecognitionOptions.AZTEC : i10;
    }

    public static int zzf(int i10, int i11) {
        return zzj(i10 << 3) + zzj(zza(i11));
    }

    public static int zzf(long j10) {
        return zzg(zza(j10));
    }

    public static int zzg(int i10) {
        return 4;
    }

    public static int zzg(int i10, int i11) {
        return zzj(i10 << 3) + zzj(i11);
    }

    public static int zzg(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int zzh(int i10) {
        return zzj(zza(i10));
    }

    public static int zzi(int i10) {
        return zzj(i10 << 3);
    }

    public static int zzj(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public abstract int zza();

    final void zza(String str, zzamo zzamoVar) {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzamoVar);
        byte[] bytes = str.getBytes(zzajf.zza);
        try {
            zzn(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzb(e10);
        }
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void zzb(byte b10);

    public final void zzb(double d10) {
        zzh(Double.doubleToRawLongBits(d10));
    }

    public final void zzb(float f10) {
        zzk(Float.floatToRawIntBits(f10));
    }

    public final void zzb(int i10, double d10) {
        zzf(i10, Double.doubleToRawLongBits(d10));
    }

    public final void zzb(int i10, float f10) {
        zzh(i10, Float.floatToRawIntBits(f10));
    }

    public abstract void zzb(int i10, zzakn zzaknVar);

    public abstract void zzb(int i10, String str);

    public abstract void zzb(int i10, boolean z10);

    public abstract void zzb(zzahp zzahpVar);

    abstract void zzb(zzakn zzaknVar, zzalf zzalfVar);

    public abstract void zzb(String str);

    public final void zzb(boolean z10) {
        zzb(z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(byte[] bArr, int i10, int i11);

    public abstract void zzc();

    public abstract void zzc(int i10, zzahp zzahpVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzc(int i10, zzakn zzaknVar, zzalf zzalfVar);

    public abstract void zzc(zzakn zzaknVar);

    public abstract void zzd(int i10, zzahp zzahpVar);

    public abstract void zzf(int i10, long j10);

    public final void zzg(int i10, long j10) {
        zzh(i10, zza(j10));
    }

    public abstract void zzh(int i10, int i11);

    public abstract void zzh(int i10, long j10);

    public abstract void zzh(long j10);

    public abstract void zzi(int i10, int i11);

    public final void zzi(long j10) {
        zzj(zza(j10));
    }

    public final void zzj(int i10, int i11) {
        zzl(i10, zza(i11));
    }

    public abstract void zzj(long j10);

    public abstract void zzk(int i10);

    public abstract void zzk(int i10, int i11);

    public abstract void zzl(int i10);

    public abstract void zzl(int i10, int i11);

    public final void zzm(int i10) {
        zzn(zza(i10));
    }

    public abstract void zzn(int i10);
}

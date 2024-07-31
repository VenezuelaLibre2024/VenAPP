package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.t;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import la.l;

/* loaded from: classes2.dex */
public final class zzbzc extends ea.a {
    public static final Parcelable.Creator<zzbzc> CREATOR = new zzbzd();
    ParcelFileDescriptor zza;
    private Parcelable zzb = null;
    private boolean zzc = true;

    public zzbzc(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.zza == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.zzb.writeToParcel(obtain, 0);
                final byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                    try {
                        zzcep.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbzb
                            @Override // java.lang.Runnable
                            public final void run() {
                                Parcelable.Creator<zzbzc> creator = zzbzc.CREATOR;
                                OutputStream outputStream = autoCloseOutputStream;
                                byte[] bArr = marshall;
                                DataOutputStream dataOutputStream = null;
                                try {
                                    try {
                                        DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream);
                                        try {
                                            dataOutputStream2.writeInt(bArr.length);
                                            dataOutputStream2.write(bArr);
                                            l.a(dataOutputStream2);
                                        } catch (IOException e10) {
                                            e = e10;
                                            dataOutputStream = dataOutputStream2;
                                            zzcec.zzh("Error transporting the ad response", e);
                                            t.q().zzw(e, "LargeParcelTeleporter.pipeData.1");
                                            if (dataOutputStream == null) {
                                                l.a(outputStream);
                                            } else {
                                                l.a(dataOutputStream);
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            dataOutputStream = dataOutputStream2;
                                            if (dataOutputStream == null) {
                                                l.a(outputStream);
                                            } else {
                                                l.a(dataOutputStream);
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                } catch (IOException e11) {
                                    e = e11;
                                }
                            }
                        });
                        parcelFileDescriptor = createPipe[0];
                    } catch (IOException e10) {
                        e = e10;
                        zzcec.zzh("Error transporting the ad response", e);
                        t.q().zzw(e, "LargeParcelTeleporter.pipeData.2");
                        l.a(autoCloseOutputStream);
                        this.zza = parcelFileDescriptor;
                        int a10 = ea.c.a(parcel);
                        ea.c.E(parcel, 2, this.zza, i10, false);
                        ea.c.b(parcel, a10);
                    }
                } catch (IOException e11) {
                    e = e11;
                    autoCloseOutputStream = null;
                }
                this.zza = parcelFileDescriptor;
            } catch (Throwable th2) {
                obtain.recycle();
                throw th2;
            }
        }
        int a102 = ea.c.a(parcel);
        ea.c.E(parcel, 2, this.zza, i10, false);
        ea.c.b(parcel, a102);
    }

    public final ea.d zza(Parcelable.Creator creator) {
        if (this.zzc) {
            if (this.zza == null) {
                zzcec.zzg("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.zza));
            try {
                try {
                    int readInt = dataInputStream.readInt();
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr, 0, readInt);
                    l.a(dataInputStream);
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.unmarshall(bArr, 0, readInt);
                        obtain.setDataPosition(0);
                        this.zzb = (Parcelable) creator.createFromParcel(obtain);
                        obtain.recycle();
                        this.zzc = false;
                    } catch (Throwable th2) {
                        obtain.recycle();
                        throw th2;
                    }
                } catch (IOException e10) {
                    zzcec.zzh("Could not read from parcel file descriptor", e10);
                    l.a(dataInputStream);
                    return null;
                }
            } catch (Throwable th3) {
                l.a(dataInputStream);
                throw th3;
            }
        }
        return (ea.d) this.zzb;
    }
}

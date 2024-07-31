.class public abstract Lcom/google/android/gms/ads/internal/client/t0;
.super Lcom/google/android/gms/internal/ads/zzayh;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/ads/internal/client/u0;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.ads.internal.client.IAdManager"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzayh;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static zzac(Landroid/os/IBinder;)Lcom/google/android/gms/ads/internal/client/u0;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.ads.internal.client.IAdManager"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/ads/internal/client/u0;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/google/android/gms/ads/internal/client/u0;

    return-object v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/ads/internal/client/s0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/ads/internal/client/s0;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method protected final zzbO(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 2

    const/4 p4, 0x0

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    const/4 p1, 0x0

    return p1

    :pswitch_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p4, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback"

    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    instance-of v0, p4, Lcom/google/android/gms/ads/internal/client/j1;

    if-eqz v0, :cond_1

    check-cast p4, Lcom/google/android/gms/ads/internal/client/j1;

    goto :goto_0

    :cond_1
    new-instance p4, Lcom/google/android/gms/ads/internal/client/h1;

    invoke-direct {p4, p1}, Lcom/google/android/gms/ads/internal/client/h1;-><init>(Landroid/os/IBinder;)V

    :goto_0
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p4}, Lcom/google/android/gms/ads/internal/client/u0;->zzJ(Lcom/google/android/gms/ads/internal/client/j1;)V

    goto/16 :goto_c

    :pswitch_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/dynamic/b$a;->f2(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/b;

    move-result-object p1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lcom/google/android/gms/ads/internal/client/u0;->zzW(Lcom/google/android/gms/dynamic/b;)V

    goto/16 :goto_c

    :pswitch_3
    sget-object p1, Lcom/google/android/gms/ads/internal/client/u4;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzayi;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/ads/internal/client/u4;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    const-string p4, "com.google.android.gms.ads.internal.client.IAdLoadCallback"

    invoke-interface {v0, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    instance-of v1, p4, Lcom/google/android/gms/ads/internal/client/k0;

    if-eqz v1, :cond_3

    check-cast p4, Lcom/google/android/gms/ads/internal/client/k0;

    goto :goto_1

    :cond_3
    new-instance p4, Lcom/google/android/gms/ads/internal/client/i0;

    invoke-direct {p4, v0}, Lcom/google/android/gms/ads/internal/client/i0;-><init>(Landroid/os/IBinder;)V

    :goto_1
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p4}, Lcom/google/android/gms/ads/internal/client/u0;->zzy(Lcom/google/android/gms/ads/internal/client/u4;Lcom/google/android/gms/ads/internal/client/k0;)V

    goto/16 :goto_c

    :pswitch_4
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    const-string p4, "com.google.android.gms.ads.internal.client.IOnPaidEventListener"

    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    instance-of v0, p4, Lcom/google/android/gms/ads/internal/client/i2;

    if-eqz v0, :cond_5

    check-cast p4, Lcom/google/android/gms/ads/internal/client/i2;

    goto :goto_2

    :cond_5
    new-instance p4, Lcom/google/android/gms/ads/internal/client/g2;

    invoke-direct {p4, p1}, Lcom/google/android/gms/ads/internal/client/g2;-><init>(Landroid/os/IBinder;)V

    :goto_2
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p4}, Lcom/google/android/gms/ads/internal/client/u0;->zzP(Lcom/google/android/gms/ads/internal/client/i2;)V

    goto/16 :goto_c

    :pswitch_5
    invoke-interface {p0}, Lcom/google/android/gms/ads/internal/client/u0;->zzk()Lcom/google/android/gms/ads/internal/client/p2;

    move-result-object p1

    goto/16 :goto_d

    :pswitch_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbal;->zze(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/zzbam;

    move-result-object p1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lcom/google/android/gms/ads/internal/client/u0;->zzH(Lcom/google/android/gms/internal/ads/zzbam;)V

    goto/16 :goto_c

    :pswitch_7
    sget-object p1, Lcom/google/android/gms/ads/internal/client/f5;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzayi;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/ads/internal/client/f5;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lcom/google/android/gms/ads/internal/client/u0;->zzI(Lcom/google/android/gms/ads/internal/client/f5;)V

    goto/16 :goto_c

    :pswitch_8
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lcom/google/android/gms/ads/internal/client/u0;->zzR(Ljava/lang/String;)V

    goto/16 :goto_c

    :pswitch_9
    invoke-interface {p0}, Lcom/google/android/gms/ads/internal/client/u0;->zzd()Landroid/os/Bundle;

    move-result-object p1

    goto/16 :goto_7

    :pswitch_a
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_3

    :cond_6
    const-string p4, "com.google.android.gms.ads.internal.client.IAdMetadataListener"

    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    instance-of v0, p4, Lcom/google/android/gms/ads/internal/client/y0;

    if-eqz v0, :cond_7

    check-cast p4, Lcom/google/android/gms/ads/internal/client/y0;

    goto :goto_3

    :cond_7
    new-instance p4, Lcom/google/android/gms/ads/internal/client/w0;

    invoke-direct {p4, p1}, Lcom/google/android/gms/ads/internal/client/w0;-><init>(Landroid/os/IBinder;)V

    :goto_3
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p4}, Lcom/google/android/gms/ads/internal/client/u0;->zzE(Lcom/google/android/gms/ads/internal/client/y0;)V

    goto/16 :goto_c

    :pswitch_b
    invoke-interface {p0}, Lcom/google/android/gms/ads/internal/client/u0;->zzt()Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_6

    :pswitch_c
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzg(Landroid/os/Parcel;)Z

    move-result p1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lcom/google/android/gms/ads/internal/client/u0;->zzL(Z)V

    goto/16 :goto_c

    :pswitch_d
    invoke-interface {p0}, Lcom/google/android/gms/ads/internal/client/u0;->zzi()Lcom/google/android/gms/ads/internal/client/h0;

    move-result-object p1

    goto/16 :goto_d

    :pswitch_e
    invoke-interface {p0}, Lcom/google/android/gms/ads/internal/client/u0;->zzj()Lcom/google/android/gms/ads/internal/client/c1;

    move-result-object p1

    goto/16 :goto_d

    :pswitch_f
    invoke-interface {p0}, Lcom/google/android/gms/ads/internal/client/u0;->zzr()Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_6

    :pswitch_10
    sget-object p1, Lcom/google/android/gms/ads/internal/client/w2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzayi;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/ads/internal/client/w2;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lcom/google/android/gms/ads/internal/client/u0;->zzK(Lcom/google/android/gms/ads/internal/client/w2;)V

    goto/16 :goto_c

    :pswitch_11
    sget-object p1, Lcom/google/android/gms/ads/internal/client/n4;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzayi;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/ads/internal/client/n4;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lcom/google/android/gms/ads/internal/client/u0;->zzU(Lcom/google/android/gms/ads/internal/client/n4;)V

    goto/16 :goto_c

    :pswitch_12
    invoke-interface {p0}, Lcom/google/android/gms/ads/internal/client/u0;->zzl()Lcom/google/android/gms/ads/internal/client/s2;

    move-result-object p1

    goto/16 :goto_d

    :pswitch_13
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lcom/google/android/gms/ads/internal/client/u0;->zzT(Ljava/lang/String;)V

    goto/16 :goto_c

    :pswitch_14
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbzz;->zzb(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/zzcaa;

    move-result-object p1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lcom/google/android/gms/ads/internal/client/u0;->zzS(Lcom/google/android/gms/internal/ads/zzcaa;)V

    goto/16 :goto_c

    :pswitch_15
    invoke-interface {p0}, Lcom/google/android/gms/ads/internal/client/u0;->zzY()Z

    move-result p1

    goto/16 :goto_a

    :pswitch_16
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzg(Landroid/os/Parcel;)Z

    move-result p1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lcom/google/android/gms/ads/internal/client/u0;->zzN(Z)V

    goto/16 :goto_c

    :pswitch_17
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_8

    goto :goto_4

    :cond_8
    const-string p4, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"

    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    instance-of v0, p4, Lcom/google/android/gms/ads/internal/client/g1;

    if-eqz v0, :cond_9

    check-cast p4, Lcom/google/android/gms/ads/internal/client/g1;

    goto :goto_4

    :cond_9
    new-instance p4, Lcom/google/android/gms/ads/internal/client/g1;

    invoke-direct {p4, p1}, Lcom/google/android/gms/ads/internal/client/g1;-><init>(Landroid/os/IBinder;)V

    :goto_4
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p4}, Lcom/google/android/gms/ads/internal/client/u0;->zzab(Lcom/google/android/gms/ads/internal/client/g1;)V

    goto/16 :goto_c

    :pswitch_18
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_a

    goto :goto_5

    :cond_a
    const-string p4, "com.google.android.gms.ads.internal.client.IAdClickListener"

    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    instance-of v0, p4, Lcom/google/android/gms/ads/internal/client/e0;

    if-eqz v0, :cond_b

    check-cast p4, Lcom/google/android/gms/ads/internal/client/e0;

    goto :goto_5

    :cond_b
    new-instance p4, Lcom/google/android/gms/ads/internal/client/c0;

    invoke-direct {p4, p1}, Lcom/google/android/gms/ads/internal/client/c0;-><init>(Landroid/os/IBinder;)V

    :goto_5
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p4}, Lcom/google/android/gms/ads/internal/client/u0;->zzC(Lcom/google/android/gms/ads/internal/client/e0;)V

    goto/16 :goto_c

    :pswitch_19
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbgz;->zzb(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/zzbha;

    move-result-object p1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lcom/google/android/gms/ads/internal/client/u0;->zzO(Lcom/google/android/gms/internal/ads/zzbha;)V

    goto/16 :goto_c

    :pswitch_1a
    invoke-interface {p0}, Lcom/google/android/gms/ads/internal/client/u0;->zzs()Ljava/lang/String;

    move-result-object p1

    :goto_6
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto/16 :goto_e

    :pswitch_1b
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbxe;->zzb(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/zzbxf;

    move-result-object p1

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p4}, Lcom/google/android/gms/ads/internal/client/u0;->zzQ(Lcom/google/android/gms/internal/ads/zzbxf;Ljava/lang/String;)V

    goto/16 :goto_c

    :pswitch_1c
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbxb;->zzb(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/zzbxc;

    move-result-object p1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lcom/google/android/gms/ads/internal/client/u0;->zzM(Lcom/google/android/gms/internal/ads/zzbxc;)V

    goto/16 :goto_c

    :pswitch_1d
    sget-object p1, Lcom/google/android/gms/ads/internal/client/z4;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzayi;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/ads/internal/client/z4;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lcom/google/android/gms/ads/internal/client/u0;->zzF(Lcom/google/android/gms/ads/internal/client/z4;)V

    goto/16 :goto_c

    :pswitch_1e
    invoke-interface {p0}, Lcom/google/android/gms/ads/internal/client/u0;->zzg()Lcom/google/android/gms/ads/internal/client/z4;

    move-result-object p1

    :goto_7
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/ads/zzayi;->zze(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    goto/16 :goto_e

    :pswitch_1f
    invoke-interface {p0}, Lcom/google/android/gms/ads/internal/client/u0;->zzA()V

    goto/16 :goto_c

    :pswitch_20
    invoke-interface {p0}, Lcom/google/android/gms/ads/internal/client/u0;->zzX()V

    goto/16 :goto_c

    :pswitch_21
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_c

    goto :goto_8

    :cond_c
    const-string p4, "com.google.android.gms.ads.internal.client.IAppEventListener"

    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    instance-of v0, p4, Lcom/google/android/gms/ads/internal/client/c1;

    if-eqz v0, :cond_d

    check-cast p4, Lcom/google/android/gms/ads/internal/client/c1;

    goto :goto_8

    :cond_d
    new-instance p4, Lcom/google/android/gms/ads/internal/client/z0;

    invoke-direct {p4, p1}, Lcom/google/android/gms/ads/internal/client/z0;-><init>(Landroid/os/IBinder;)V

    :goto_8
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p4}, Lcom/google/android/gms/ads/internal/client/u0;->zzG(Lcom/google/android/gms/ads/internal/client/c1;)V

    goto :goto_c

    :pswitch_22
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_e

    goto :goto_9

    :cond_e
    const-string p4, "com.google.android.gms.ads.internal.client.IAdListener"

    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    instance-of v0, p4, Lcom/google/android/gms/ads/internal/client/h0;

    if-eqz v0, :cond_f

    check-cast p4, Lcom/google/android/gms/ads/internal/client/h0;

    goto :goto_9

    :cond_f
    new-instance p4, Lcom/google/android/gms/ads/internal/client/f0;

    invoke-direct {p4, p1}, Lcom/google/android/gms/ads/internal/client/f0;-><init>(Landroid/os/IBinder;)V

    :goto_9
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p4}, Lcom/google/android/gms/ads/internal/client/u0;->zzD(Lcom/google/android/gms/ads/internal/client/h0;)V

    goto :goto_c

    :pswitch_23
    invoke-interface {p0}, Lcom/google/android/gms/ads/internal/client/u0;->zzB()V

    goto :goto_c

    :pswitch_24
    invoke-interface {p0}, Lcom/google/android/gms/ads/internal/client/u0;->zzz()V

    goto :goto_c

    :pswitch_25
    sget-object p1, Lcom/google/android/gms/ads/internal/client/u4;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzayi;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/ads/internal/client/u4;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lcom/google/android/gms/ads/internal/client/u0;->zzaa(Lcom/google/android/gms/ads/internal/client/u4;)Z

    move-result p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_b

    :pswitch_26
    invoke-interface {p0}, Lcom/google/android/gms/ads/internal/client/u0;->zzZ()Z

    move-result p1

    :goto_a
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    sget p2, Lcom/google/android/gms/internal/ads/zzayi;->zza:I

    :goto_b
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_e

    :pswitch_27
    invoke-interface {p0}, Lcom/google/android/gms/ads/internal/client/u0;->zzx()V

    :goto_c
    :pswitch_28
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_e

    :pswitch_29
    invoke-interface {p0}, Lcom/google/android/gms/ads/internal/client/u0;->zzn()Lcom/google/android/gms/dynamic/b;

    move-result-object p1

    :goto_d
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/ads/zzayi;->zzf(Landroid/os/Parcel;Landroid/os/IInterface;)V

    :goto_e
    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_29
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_28
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_0
        :pswitch_0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_0
        :pswitch_0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

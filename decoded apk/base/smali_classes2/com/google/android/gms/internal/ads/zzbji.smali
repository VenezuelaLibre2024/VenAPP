.class public abstract Lcom/google/android/gms/internal/ads/zzbji;
.super Lcom/google/android/gms/internal/ads/zzayh;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbjj;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.ads.internal.formats.client.IMediaContent"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzayh;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final zzbO(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 1

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return p1

    :pswitch_0
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzbjj;->zzk()Z

    move-result p1

    goto :goto_1

    :pswitch_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string p4, "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener"

    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    instance-of v0, p4, Lcom/google/android/gms/internal/ads/zzbku;

    if-eqz v0, :cond_1

    move-object p1, p4

    check-cast p1, Lcom/google/android/gms/internal/ads/zzbku;

    goto :goto_0

    :cond_1
    new-instance p4, Lcom/google/android/gms/internal/ads/zzbku;

    invoke-direct {p4, p1}, Lcom/google/android/gms/internal/ads/zzbku;-><init>(Landroid/os/IBinder;)V

    move-object p1, p4

    :goto_0
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/zzbjj;->zzm(Lcom/google/android/gms/internal/ads/zzbku;)V

    goto :goto_3

    :pswitch_2
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzbjj;->zzl()Z

    move-result p1

    :goto_1
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    sget p2, Lcom/google/android/gms/internal/ads/zzayi;->zza:I

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_5

    :pswitch_3
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzbjj;->zzh()Lcom/google/android/gms/ads/internal/client/s2;

    move-result-object p1

    goto :goto_2

    :pswitch_4
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzbjj;->zzf()F

    move-result p1

    goto :goto_4

    :pswitch_5
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzbjj;->zzg()F

    move-result p1

    goto :goto_4

    :pswitch_6
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzbjj;->zzi()Lcom/google/android/gms/dynamic/b;

    move-result-object p1

    :goto_2
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/ads/zzayi;->zzf(Landroid/os/Parcel;Landroid/os/IInterface;)V

    goto :goto_5

    :pswitch_7
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/dynamic/b$a;->f2(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/b;

    move-result-object p1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzayi;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/zzbjj;->zzj(Lcom/google/android/gms/dynamic/b;)V

    :goto_3
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_5

    :pswitch_8
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzbjj;->zze()F

    move-result p1

    :goto_4
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeFloat(F)V

    :goto_5
    const/4 p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
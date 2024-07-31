.class public final Lcom/google/android/gms/internal/ads/zzbjb;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/ads/zzbjb;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final zza:I

.field public final zzb:Z

.field public final zzc:I

.field public final zzd:Z

.field public final zze:I

.field public final zzf:Lcom/google/android/gms/ads/internal/client/n4;

.field public final zzg:Z

.field public final zzh:I

.field public final zzi:I

.field public final zzj:Z

.field public final zzk:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbjc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbjc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbjb;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IZIZILcom/google/android/gms/ads/internal/client/n4;ZIIZI)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zza:I

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzb:Z

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzc:I

    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzd:Z

    iput p5, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zze:I

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzf:Lcom/google/android/gms/ads/internal/client/n4;

    iput-boolean p7, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzg:Z

    iput p8, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzh:I

    iput-boolean p10, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzj:Z

    iput p9, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzi:I

    iput p11, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzk:I

    return-void
.end method

.method public constructor <init>(La9/e;)V
    .locals 12
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p1}, La9/e;->f()Z

    move-result v2

    invoke-virtual {p1}, La9/e;->b()I

    move-result v3

    invoke-virtual {p1}, La9/e;->e()Z

    move-result v4

    invoke-virtual {p1}, La9/e;->a()I

    move-result v5

    invoke-virtual {p1}, La9/e;->d()Lx8/c0;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/ads/internal/client/n4;

    invoke-virtual {p1}, La9/e;->d()Lx8/c0;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/ads/internal/client/n4;-><init>(Lx8/c0;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v6, v0

    const/4 v1, 0x4

    invoke-virtual {p1}, La9/e;->g()Z

    move-result v7

    invoke-virtual {p1}, La9/e;->c()I

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/internal/ads/zzbjb;-><init>(IZIZILcom/google/android/gms/ads/internal/client/n4;ZIIZI)V

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzbjb;)Lcom/google/android/gms/ads/nativead/c;
    .locals 5

    new-instance v0, Lcom/google/android/gms/ads/nativead/c$a;

    invoke-direct {v0}, Lcom/google/android/gms/ads/nativead/c$a;-><init>()V

    if-nez p0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/nativead/c$a;->a()Lcom/google/android/gms/ads/nativead/c;

    move-result-object p0

    return-object p0

    :cond_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zza:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_6

    const/4 v3, 0x3

    if-eq v1, v3, :cond_5

    const/4 v4, 0x4

    if-eq v1, v4, :cond_1

    goto :goto_1

    :cond_1
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzg:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/nativead/c$a;->e(Z)Lcom/google/android/gms/ads/nativead/c$a;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzh:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/nativead/c$a;->d(I)Lcom/google/android/gms/ads/nativead/c$a;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzi:I

    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzj:Z

    invoke-virtual {v0, v1, v4}, Lcom/google/android/gms/ads/nativead/c$a;->b(IZ)Lcom/google/android/gms/ads/nativead/c$a;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzk:I

    const/4 v4, 0x1

    if-nez v1, :cond_3

    :cond_2
    move v2, v4

    goto :goto_0

    :cond_3
    if-ne v1, v2, :cond_4

    move v2, v3

    goto :goto_0

    :cond_4
    if-ne v1, v4, :cond_2

    :goto_0
    invoke-virtual {v0, v2}, Lcom/google/android/gms/ads/nativead/c$a;->q(I)Lcom/google/android/gms/ads/nativead/c$a;

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzf:Lcom/google/android/gms/ads/internal/client/n4;

    if-eqz v1, :cond_6

    new-instance v2, Lx8/c0;

    invoke-direct {v2, v1}, Lx8/c0;-><init>(Lcom/google/android/gms/ads/internal/client/n4;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/ads/nativead/c$a;->h(Lx8/c0;)Lcom/google/android/gms/ads/nativead/c$a;

    :cond_6
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zze:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/nativead/c$a;->c(I)Lcom/google/android/gms/ads/nativead/c$a;

    :goto_1
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzb:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/nativead/c$a;->g(Z)Lcom/google/android/gms/ads/nativead/c$a;

    iget-boolean p0, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzd:Z

    invoke-virtual {v0, p0}, Lcom/google/android/gms/ads/nativead/c$a;->f(Z)Lcom/google/android/gms/ads/nativead/c$a;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/nativead/c$a;->a()Lcom/google/android/gms/ads/nativead/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zza:I

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x1

    invoke-static {p1, v2, v0}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 v0, 0x2

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzb:Z

    invoke-static {p1, v0, v2}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x3

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzc:I

    invoke-static {p1, v0, v2}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 v0, 0x4

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzd:Z

    invoke-static {p1, v0, v2}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x5

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zze:I

    invoke-static {p1, v0, v2}, Lea/c;->u(Landroid/os/Parcel;II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzf:Lcom/google/android/gms/ads/internal/client/n4;

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {p1, v3, v0, p2, v2}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x7

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzg:Z

    invoke-static {p1, p2, v0}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/16 p2, 0x8

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzh:I

    invoke-static {p1, p2, v0}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/16 p2, 0x9

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzi:I

    invoke-static {p1, p2, v0}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/16 p2, 0xa

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzj:Z

    invoke-static {p1, p2, v0}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/16 p2, 0xb

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbjb;->zzk:I

    invoke-static {p1, p2, v0}, Lea/c;->u(Landroid/os/Parcel;II)V

    invoke-static {p1, v1}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

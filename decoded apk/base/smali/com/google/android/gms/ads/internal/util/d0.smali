.class public final Lcom/google/android/gms/ads/internal/util/d0;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/ads/internal/util/d0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/internal/util/e0;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/util/e0;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/internal/util/d0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/util/d0;->a:Ljava/lang/String;

    iput p2, p0, Lcom/google/android/gms/ads/internal/util/d0;->b:I

    return-void
.end method

.method public static v1(Ljava/lang/Throwable;)Lcom/google/android/gms/ads/internal/util/d0;
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfij;->zza(Ljava/lang/Throwable;)Lcom/google/android/gms/ads/internal/client/c3;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzfxt;->zzd(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p0, v0, Lcom/google/android/gms/ads/internal/client/c3;->b:Ljava/lang/String;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    :goto_0
    new-instance v1, Lcom/google/android/gms/ads/internal/util/d0;

    iget v0, v0, Lcom/google/android/gms/ads/internal/client/c3;->a:I

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/ads/internal/util/d0;-><init>(Ljava/lang/String;I)V

    return-object v1
.end method


# virtual methods
.method public final u1()Lcom/google/android/gms/ads/internal/util/c0;
    .locals 3

    new-instance v0, Lcom/google/android/gms/ads/internal/util/c0;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/util/d0;->a:Ljava/lang/String;

    iget v2, p0, Lcom/google/android/gms/ads/internal/util/d0;->b:I

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/ads/internal/util/c0;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget-object p2, p0, Lcom/google/android/gms/ads/internal/util/d0;->a:Ljava/lang/String;

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, p2, v2}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x2

    iget v1, p0, Lcom/google/android/gms/ads/internal/util/d0;->b:I

    invoke-static {p1, p2, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.class public final Lcom/google/android/gms/ads/internal/client/d5;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/ads/internal/client/d5;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public b:J

.field public c:Lcom/google/android/gms/ads/internal/client/c3;

.field public final d:Landroid/os/Bundle;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final r:Ljava/lang/String;

.field public final s:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/internal/client/e5;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/e5;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/internal/client/d5;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JLcom/google/android/gms/ads/internal/client/c3;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/d5;->a:Ljava/lang/String;

    iput-wide p2, p0, Lcom/google/android/gms/ads/internal/client/d5;->b:J

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/client/d5;->c:Lcom/google/android/gms/ads/internal/client/c3;

    iput-object p5, p0, Lcom/google/android/gms/ads/internal/client/d5;->d:Landroid/os/Bundle;

    iput-object p6, p0, Lcom/google/android/gms/ads/internal/client/d5;->e:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/ads/internal/client/d5;->f:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/ads/internal/client/d5;->r:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/ads/internal/client/d5;->s:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d5;->a:Ljava/lang/String;

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v0, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x2

    iget-wide v4, p0, Lcom/google/android/gms/ads/internal/client/d5;->b:J

    invoke-static {p1, v0, v4, v5}, Lea/c;->z(Landroid/os/Parcel;IJ)V

    const/4 v0, 0x3

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/d5;->c:Lcom/google/android/gms/ads/internal/client/c3;

    invoke-static {p1, v0, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x4

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d5;->d:Landroid/os/Bundle;

    invoke-static {p1, p2, v0, v3}, Lea/c;->j(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    const/4 p2, 0x5

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d5;->e:Ljava/lang/String;

    invoke-static {p1, p2, v0, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x6

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d5;->f:Ljava/lang/String;

    invoke-static {p1, p2, v0, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x7

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d5;->r:Ljava/lang/String;

    invoke-static {p1, p2, v0, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 p2, 0x8

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/d5;->s:Ljava/lang/String;

    invoke-static {p1, p2, v0, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, v1}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

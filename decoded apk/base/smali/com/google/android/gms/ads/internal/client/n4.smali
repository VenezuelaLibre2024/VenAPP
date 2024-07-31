.class public final Lcom/google/android/gms/ads/internal/client/n4;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/ads/internal/client/n4;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/internal/client/o4;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/o4;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/internal/client/n4;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lx8/c0;)V
    .locals 2

    invoke-virtual {p1}, Lx8/c0;->c()Z

    move-result v0

    invoke-virtual {p1}, Lx8/c0;->b()Z

    move-result v1

    invoke-virtual {p1}, Lx8/c0;->a()Z

    move-result p1

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/ads/internal/client/n4;-><init>(ZZZ)V

    return-void
.end method

.method public constructor <init>(ZZZ)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/ads/internal/client/n4;->a:Z

    iput-boolean p2, p0, Lcom/google/android/gms/ads/internal/client/n4;->b:Z

    iput-boolean p3, p0, Lcom/google/android/gms/ads/internal/client/n4;->c:Z

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget-boolean p2, p0, Lcom/google/android/gms/ads/internal/client/n4;->a:Z

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x2

    invoke-static {p1, v1, p2}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/4 p2, 0x3

    iget-boolean v1, p0, Lcom/google/android/gms/ads/internal/client/n4;->b:Z

    invoke-static {p1, p2, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/4 p2, 0x4

    iget-boolean v1, p0, Lcom/google/android/gms/ads/internal/client/n4;->c:Z

    invoke-static {p1, p2, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

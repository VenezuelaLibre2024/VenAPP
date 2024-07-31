.class public final Lcom/google/android/gms/ads/internal/client/i4;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/ads/internal/client/i4;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/internal/client/j4;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/j4;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/internal/client/i4;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput p1, p0, Lcom/google/android/gms/ads/internal/client/i4;->a:I

    iput p2, p0, Lcom/google/android/gms/ads/internal/client/i4;->b:I

    return-void
.end method

.method public constructor <init>(Lx8/y;)V
    .locals 1

    invoke-direct {p0}, Lea/a;-><init>()V

    invoke-virtual {p1}, Lx8/y;->c()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/internal/client/i4;->a:I

    invoke-virtual {p1}, Lx8/y;->d()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/ads/internal/client/i4;->b:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget p2, p0, Lcom/google/android/gms/ads/internal/client/i4;->a:I

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, v1, p2}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 p2, 0x2

    iget v1, p0, Lcom/google/android/gms/ads/internal/client/i4;->b:I

    invoke-static {p1, p2, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

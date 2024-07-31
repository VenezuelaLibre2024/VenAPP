.class public final Lcom/google/android/gms/ads/internal/client/b5;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/ads/internal/client/b5;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/internal/client/c5;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/c5;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/internal/client/b5;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;J)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput p1, p0, Lcom/google/android/gms/ads/internal/client/b5;->a:I

    iput p2, p0, Lcom/google/android/gms/ads/internal/client/b5;->b:I

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/client/b5;->c:Ljava/lang/String;

    iput-wide p4, p0, Lcom/google/android/gms/ads/internal/client/b5;->d:J

    return-void
.end method

.method public static u1(Lorg/json/JSONObject;)Lcom/google/android/gms/ads/internal/client/b5;
    .locals 7

    const-string v0, "type_num"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    const-string v0, "precision_num"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    const-string v0, "currency"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "value"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v5

    new-instance p0, Lcom/google/android/gms/ads/internal/client/b5;

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/ads/internal/client/b5;-><init>(IILjava/lang/String;J)V

    return-object p0
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget p2, p0, Lcom/google/android/gms/ads/internal/client/b5;->a:I

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, v1, p2}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 p2, 0x2

    iget v1, p0, Lcom/google/android/gms/ads/internal/client/b5;->b:I

    invoke-static {p1, p2, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    iget-object p2, p0, Lcom/google/android/gms/ads/internal/client/b5;->c:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {p1, v2, p2, v1}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x4

    iget-wide v1, p0, Lcom/google/android/gms/ads/internal/client/b5;->d:J

    invoke-static {p1, p2, v1, v2}, Lea/c;->z(Landroid/os/Parcel;IJ)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

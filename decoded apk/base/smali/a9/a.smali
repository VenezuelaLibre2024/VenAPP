.class public final La9/a;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "La9/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Z

.field private final b:Landroid/os/IBinder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La9/j;

    invoke-direct {v0}, La9/j;-><init>()V

    sput-object v0, La9/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ZLandroid/os/IBinder;)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput-boolean p1, p0, La9/a;->a:Z

    iput-object p2, p0, La9/a;->b:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public u1()Z
    .locals 1

    iget-boolean v0, p0, La9/a;->a:Z

    return v0
.end method

.method public final v1()Lcom/google/android/gms/internal/ads/zzbld;
    .locals 1

    iget-object v0, p0, La9/a;->b:Landroid/os/IBinder;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzblc;->zzb(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/zzbld;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    invoke-virtual {p0}, La9/a;->u1()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    iget-object v0, p0, La9/a;->b:Landroid/os/IBinder;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v2, v0, v1}, Lea/c;->t(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    invoke-static {p1, p2}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

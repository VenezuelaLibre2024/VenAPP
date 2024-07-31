.class public final Lcom/google/android/gms/location/s;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/location/s;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Z

.field private final b:Z

.field private final c:Z

.field private final d:Z

.field private final e:Z

.field private final f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/location/y;

    invoke-direct {v0}, Lcom/google/android/gms/location/y;-><init>()V

    sput-object v0, Lcom/google/android/gms/location/s;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZZZZZZ)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/location/s;->a:Z

    iput-boolean p2, p0, Lcom/google/android/gms/location/s;->b:Z

    iput-boolean p3, p0, Lcom/google/android/gms/location/s;->c:Z

    iput-boolean p4, p0, Lcom/google/android/gms/location/s;->d:Z

    iput-boolean p5, p0, Lcom/google/android/gms/location/s;->e:Z

    iput-boolean p6, p0, Lcom/google/android/gms/location/s;->f:Z

    return-void
.end method


# virtual methods
.method public u1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/location/s;->f:Z

    return v0
.end method

.method public v1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/location/s;->c:Z

    return v0
.end method

.method public w1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/location/s;->d:Z

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/location/s;->x1()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x2

    invoke-virtual {p0}, Lcom/google/android/gms/location/s;->z1()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x3

    invoke-virtual {p0}, Lcom/google/android/gms/location/s;->v1()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x4

    invoke-virtual {p0}, Lcom/google/android/gms/location/s;->w1()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x5

    invoke-virtual {p0}, Lcom/google/android/gms/location/s;->y1()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x6

    invoke-virtual {p0}, Lcom/google/android/gms/location/s;->u1()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    invoke-static {p1, p2}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public x1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/location/s;->a:Z

    return v0
.end method

.method public y1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/location/s;->e:Z

    return v0
.end method

.method public z1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/location/s;->b:Z

    return v0
.end method

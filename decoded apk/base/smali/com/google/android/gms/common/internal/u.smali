.class public Lcom/google/android/gms/common/internal/u;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/common/internal/u;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Z

.field private final c:Z

.field private final d:I

.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/common/internal/f1;

    invoke-direct {v0}, Lcom/google/android/gms/common/internal/f1;-><init>()V

    sput-object v0, Lcom/google/android/gms/common/internal/u;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IZZII)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput p1, p0, Lcom/google/android/gms/common/internal/u;->a:I

    iput-boolean p2, p0, Lcom/google/android/gms/common/internal/u;->b:Z

    iput-boolean p3, p0, Lcom/google/android/gms/common/internal/u;->c:Z

    iput p4, p0, Lcom/google/android/gms/common/internal/u;->d:I

    iput p5, p0, Lcom/google/android/gms/common/internal/u;->e:I

    return-void
.end method


# virtual methods
.method public u1()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/common/internal/u;->d:I

    return v0
.end method

.method public v1()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/common/internal/u;->e:I

    return v0
.end method

.method public w1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/common/internal/u;->b:Z

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/u;->y1()I

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 v0, 0x2

    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/u;->w1()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x3

    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/u;->x1()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x4

    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/u;->u1()I

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 v0, 0x5

    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/u;->v1()I

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public x1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/common/internal/u;->c:Z

    return v0
.end method

.method public y1()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/common/internal/u;->a:I

    return v0
.end method

.class public Lqa/t;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lqa/t;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:[B

.field private final d:Lqa/h;

.field private final e:Lqa/g;

.field private final f:Lqa/i;

.field private final r:Lqa/e;

.field private final s:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqa/u0;

    invoke-direct {v0}, Lqa/u0;-><init>()V

    sput-object v0, Lqa/t;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;[BLqa/h;Lqa/g;Lqa/i;Lqa/e;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Lea/a;-><init>()V

    const/4 v0, 0x1

    if-eqz p4, :cond_0

    if-nez p5, :cond_0

    if-eqz p6, :cond_3

    :cond_0
    if-nez p4, :cond_1

    if-eqz p5, :cond_1

    if-eqz p6, :cond_3

    :cond_1
    const/4 v1, 0x0

    if-nez p4, :cond_2

    if-nez p5, :cond_2

    if-eqz p6, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :cond_3
    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/s;->a(Z)V

    iput-object p1, p0, Lqa/t;->a:Ljava/lang/String;

    iput-object p2, p0, Lqa/t;->b:Ljava/lang/String;

    iput-object p3, p0, Lqa/t;->c:[B

    iput-object p4, p0, Lqa/t;->d:Lqa/h;

    iput-object p5, p0, Lqa/t;->e:Lqa/g;

    iput-object p6, p0, Lqa/t;->f:Lqa/i;

    iput-object p7, p0, Lqa/t;->r:Lqa/e;

    iput-object p8, p0, Lqa/t;->s:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lqa/t;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lqa/t;

    iget-object v0, p0, Lqa/t;->a:Ljava/lang/String;

    iget-object v2, p1, Lqa/t;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqa/t;->b:Ljava/lang/String;

    iget-object v2, p1, Lqa/t;->b:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqa/t;->c:[B

    iget-object v2, p1, Lqa/t;->c:[B

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqa/t;->d:Lqa/h;

    iget-object v2, p1, Lqa/t;->d:Lqa/h;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqa/t;->e:Lqa/g;

    iget-object v2, p1, Lqa/t;->e:Lqa/g;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqa/t;->f:Lqa/i;

    iget-object v2, p1, Lqa/t;->f:Lqa/i;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqa/t;->r:Lqa/e;

    iget-object v2, p1, Lqa/t;->r:Lqa/e;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqa/t;->s:Ljava/lang/String;

    iget-object p1, p1, Lqa/t;->s:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lqa/t;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lqa/t;->b:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lqa/t;->c:[B

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lqa/t;->e:Lqa/g;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, Lqa/t;->d:Lqa/h;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, Lqa/t;->f:Lqa/i;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    iget-object v2, p0, Lqa/t;->r:Lqa/e;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    iget-object v2, p0, Lqa/t;->s:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public u1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqa/t;->s:Ljava/lang/String;

    return-object v0
.end method

.method public v1()Lqa/e;
    .locals 1

    iget-object v0, p0, Lqa/t;->r:Lqa/e;

    return-object v0
.end method

.method public w1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqa/t;->a:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lqa/t;->w1()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x2

    invoke-virtual {p0}, Lqa/t;->y1()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x3

    invoke-virtual {p0}, Lqa/t;->x1()[B

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lea/c;->l(Landroid/os/Parcel;I[BZ)V

    const/4 v1, 0x4

    iget-object v2, p0, Lqa/t;->d:Lqa/h;

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x5

    iget-object v2, p0, Lqa/t;->e:Lqa/g;

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x6

    iget-object v2, p0, Lqa/t;->f:Lqa/i;

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x7

    invoke-virtual {p0}, Lqa/t;->v1()Lqa/e;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 p2, 0x8

    invoke-virtual {p0}, Lqa/t;->u1()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, p2, v1, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public x1()[B
    .locals 1

    iget-object v0, p0, Lqa/t;->c:[B

    return-object v0
.end method

.method public y1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqa/t;->b:Ljava/lang/String;

    return-object v0
.end method

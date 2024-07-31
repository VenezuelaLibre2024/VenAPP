.class public Lqa/u;
.super Lqa/c0;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lqa/u;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lqa/y;

.field private final b:Lqa/a0;

.field private final c:[B

.field private final d:Ljava/util/List;

.field private final e:Ljava/lang/Double;

.field private final f:Ljava/util/List;

.field private final r:Lqa/k;

.field private final s:Ljava/lang/Integer;

.field private final t:Lqa/e0;

.field private final u:Lqa/c;

.field private final v:Lqa/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqa/t0;

    invoke-direct {v0}, Lqa/t0;-><init>()V

    sput-object v0, Lqa/u;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Lqa/y;Lqa/a0;[BLjava/util/List;Ljava/lang/Double;Ljava/util/List;Lqa/k;Ljava/lang/Integer;Lqa/e0;Ljava/lang/String;Lqa/d;)V
    .locals 0

    invoke-direct {p0}, Lqa/c0;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lqa/y;

    iput-object p1, p0, Lqa/u;->a:Lqa/y;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lqa/a0;

    iput-object p1, p0, Lqa/u;->b:Lqa/a0;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Lqa/u;->c:[B

    invoke-static {p4}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lqa/u;->d:Ljava/util/List;

    iput-object p5, p0, Lqa/u;->e:Ljava/lang/Double;

    iput-object p6, p0, Lqa/u;->f:Ljava/util/List;

    iput-object p7, p0, Lqa/u;->r:Lqa/k;

    iput-object p8, p0, Lqa/u;->s:Ljava/lang/Integer;

    iput-object p9, p0, Lqa/u;->t:Lqa/e0;

    if-eqz p10, :cond_0

    :try_start_0
    invoke-static {p10}, Lqa/c;->b(Ljava/lang/String;)Lqa/c;

    move-result-object p1

    iput-object p1, p0, Lqa/u;->u:Lqa/c;
    :try_end_0
    .catch Lqa/c$a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lqa/u;->u:Lqa/c;

    :goto_0
    iput-object p11, p0, Lqa/u;->v:Lqa/d;

    return-void
.end method


# virtual methods
.method public A1()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lqa/u;->s:Ljava/lang/Integer;

    return-object v0
.end method

.method public B1()Lqa/y;
    .locals 1

    iget-object v0, p0, Lqa/u;->a:Lqa/y;

    return-object v0
.end method

.method public C1()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lqa/u;->e:Ljava/lang/Double;

    return-object v0
.end method

.method public D1()Lqa/e0;
    .locals 1

    iget-object v0, p0, Lqa/u;->t:Lqa/e0;

    return-object v0
.end method

.method public E1()Lqa/a0;
    .locals 1

    iget-object v0, p0, Lqa/u;->b:Lqa/a0;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lqa/u;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lqa/u;

    iget-object v0, p0, Lqa/u;->a:Lqa/y;

    iget-object v2, p1, Lqa/u;->a:Lqa/y;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lqa/u;->b:Lqa/a0;

    iget-object v2, p1, Lqa/u;->b:Lqa/a0;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lqa/u;->c:[B

    iget-object v2, p1, Lqa/u;->c:[B

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lqa/u;->e:Ljava/lang/Double;

    iget-object v2, p1, Lqa/u;->e:Ljava/lang/Double;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lqa/u;->d:Ljava/util/List;

    iget-object v2, p1, Lqa/u;->d:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p1, Lqa/u;->d:Ljava/util/List;

    iget-object v2, p0, Lqa/u;->d:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lqa/u;->f:Ljava/util/List;

    if-nez v0, :cond_1

    iget-object v2, p1, Lqa/u;->f:Ljava/util/List;

    if-eqz v2, :cond_2

    :cond_1
    if-eqz v0, :cond_3

    iget-object v2, p1, Lqa/u;->f:Ljava/util/List;

    if-eqz v2, :cond_3

    invoke-interface {v0, v2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p1, Lqa/u;->f:Ljava/util/List;

    iget-object v2, p0, Lqa/u;->f:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Lqa/u;->r:Lqa/k;

    iget-object v2, p1, Lqa/u;->r:Lqa/k;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lqa/u;->s:Ljava/lang/Integer;

    iget-object v2, p1, Lqa/u;->s:Ljava/lang/Integer;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lqa/u;->t:Lqa/e0;

    iget-object v2, p1, Lqa/u;->t:Lqa/e0;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lqa/u;->u:Lqa/c;

    iget-object v2, p1, Lqa/u;->u:Lqa/c;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lqa/u;->v:Lqa/d;

    iget-object p1, p1, Lqa/u;->v:Lqa/d;

    invoke-static {v0, p1}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/16 v0, 0xb

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lqa/u;->a:Lqa/y;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lqa/u;->b:Lqa/a0;

    aput-object v2, v0, v1

    iget-object v1, p0, Lqa/u;->c:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/4 v1, 0x3

    iget-object v2, p0, Lqa/u;->d:Ljava/util/List;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, Lqa/u;->e:Ljava/lang/Double;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, Lqa/u;->f:Ljava/util/List;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    iget-object v2, p0, Lqa/u;->r:Lqa/k;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    iget-object v2, p0, Lqa/u;->s:Ljava/lang/Integer;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    iget-object v2, p0, Lqa/u;->t:Lqa/e0;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    iget-object v2, p0, Lqa/u;->u:Lqa/c;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    iget-object v2, p0, Lqa/u;->v:Lqa/d;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public u1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqa/u;->u:Lqa/c;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lqa/c;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public v1()Lqa/d;
    .locals 1

    iget-object v0, p0, Lqa/u;->v:Lqa/d;

    return-object v0
.end method

.method public w1()Lqa/k;
    .locals 1

    iget-object v0, p0, Lqa/u;->r:Lqa/k;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lqa/u;->B1()Lqa/y;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x3

    invoke-virtual {p0}, Lqa/u;->E1()Lqa/a0;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x4

    invoke-virtual {p0}, Lqa/u;->x1()[B

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lea/c;->l(Landroid/os/Parcel;I[BZ)V

    const/4 v1, 0x5

    invoke-virtual {p0}, Lqa/u;->z1()Ljava/util/List;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lea/c;->K(Landroid/os/Parcel;ILjava/util/List;Z)V

    const/4 v1, 0x6

    invoke-virtual {p0}, Lqa/u;->C1()Ljava/lang/Double;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lea/c;->p(Landroid/os/Parcel;ILjava/lang/Double;Z)V

    const/4 v1, 0x7

    invoke-virtual {p0}, Lqa/u;->y1()Ljava/util/List;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lea/c;->K(Landroid/os/Parcel;ILjava/util/List;Z)V

    const/16 v1, 0x8

    invoke-virtual {p0}, Lqa/u;->w1()Lqa/k;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0x9

    invoke-virtual {p0}, Lqa/u;->A1()Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lea/c;->x(Landroid/os/Parcel;ILjava/lang/Integer;Z)V

    const/16 v1, 0xa

    invoke-virtual {p0}, Lqa/u;->D1()Lqa/e0;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xb

    invoke-virtual {p0}, Lqa/u;->u1()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v1, 0xc

    invoke-virtual {p0}, Lqa/u;->v1()Lqa/d;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public x1()[B
    .locals 1

    iget-object v0, p0, Lqa/u;->c:[B

    return-object v0
.end method

.method public y1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lqa/v;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lqa/u;->f:Ljava/util/List;

    return-object v0
.end method

.method public z1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lqa/w;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lqa/u;->d:Ljava/util/List;

    return-object v0
.end method

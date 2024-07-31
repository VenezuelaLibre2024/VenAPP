.class public final Lua/t;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lua/t;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/util/List;

.field private b:F

.field private c:I

.field private d:F

.field private e:Z

.field private f:Z

.field private r:Z

.field private s:Lua/e;

.field private t:Lua/e;

.field private u:I

.field private v:Ljava/util/List;

.field private w:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lua/y0;

    invoke-direct {v0}, Lua/y0;-><init>()V

    sput-object v0, Lua/t;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lea/a;-><init>()V

    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lua/t;->b:F

    const/high16 v0, -0x1000000

    iput v0, p0, Lua/t;->c:I

    const/4 v0, 0x0

    iput v0, p0, Lua/t;->d:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Lua/t;->e:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lua/t;->f:Z

    iput-boolean v0, p0, Lua/t;->r:Z

    new-instance v1, Lua/d;

    invoke-direct {v1}, Lua/d;-><init>()V

    iput-object v1, p0, Lua/t;->s:Lua/e;

    new-instance v1, Lua/d;

    invoke-direct {v1}, Lua/d;-><init>()V

    iput-object v1, p0, Lua/t;->t:Lua/e;

    iput v0, p0, Lua/t;->u:I

    const/4 v0, 0x0

    iput-object v0, p0, Lua/t;->v:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lua/t;->w:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lua/t;->a:Ljava/util/List;

    return-void
.end method

.method constructor <init>(Ljava/util/List;FIFZZZLua/e;Lua/e;ILjava/util/List;Ljava/util/List;)V
    .locals 2

    invoke-direct {p0}, Lea/a;-><init>()V

    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lua/t;->b:F

    const/high16 v0, -0x1000000

    iput v0, p0, Lua/t;->c:I

    const/4 v0, 0x0

    iput v0, p0, Lua/t;->d:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Lua/t;->e:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lua/t;->f:Z

    iput-boolean v0, p0, Lua/t;->r:Z

    new-instance v1, Lua/d;

    invoke-direct {v1}, Lua/d;-><init>()V

    iput-object v1, p0, Lua/t;->s:Lua/e;

    new-instance v1, Lua/d;

    invoke-direct {v1}, Lua/d;-><init>()V

    iput-object v1, p0, Lua/t;->t:Lua/e;

    iput v0, p0, Lua/t;->u:I

    const/4 v0, 0x0

    iput-object v0, p0, Lua/t;->v:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lua/t;->w:Ljava/util/List;

    iput-object p1, p0, Lua/t;->a:Ljava/util/List;

    iput p2, p0, Lua/t;->b:F

    iput p3, p0, Lua/t;->c:I

    iput p4, p0, Lua/t;->d:F

    iput-boolean p5, p0, Lua/t;->e:Z

    iput-boolean p6, p0, Lua/t;->f:Z

    iput-boolean p7, p0, Lua/t;->r:Z

    if-eqz p8, :cond_0

    iput-object p8, p0, Lua/t;->s:Lua/e;

    :cond_0
    if-eqz p9, :cond_1

    iput-object p9, p0, Lua/t;->t:Lua/e;

    :cond_1
    iput p10, p0, Lua/t;->u:I

    iput-object p11, p0, Lua/t;->v:Ljava/util/List;

    if-eqz p12, :cond_2

    iput-object p12, p0, Lua/t;->w:Ljava/util/List;

    :cond_2
    return-void
.end method


# virtual methods
.method public A1()Lua/e;
    .locals 1

    iget-object v0, p0, Lua/t;->t:Lua/e;

    invoke-virtual {v0}, Lua/e;->u1()Lua/e;

    move-result-object v0

    return-object v0
.end method

.method public B1()I
    .locals 1

    iget v0, p0, Lua/t;->u:I

    return v0
.end method

.method public C1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lua/o;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lua/t;->v:Ljava/util/List;

    return-object v0
.end method

.method public D1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lua/t;->a:Ljava/util/List;

    return-object v0
.end method

.method public E1()Lua/e;
    .locals 1

    iget-object v0, p0, Lua/t;->s:Lua/e;

    invoke-virtual {v0}, Lua/e;->u1()Lua/e;

    move-result-object v0

    return-object v0
.end method

.method public F1()F
    .locals 1

    iget v0, p0, Lua/t;->b:F

    return v0
.end method

.method public G1()F
    .locals 1

    iget v0, p0, Lua/t;->d:F

    return v0
.end method

.method public H1()Z
    .locals 1

    iget-boolean v0, p0, Lua/t;->r:Z

    return v0
.end method

.method public I1()Z
    .locals 1

    iget-boolean v0, p0, Lua/t;->f:Z

    return v0
.end method

.method public J1()Z
    .locals 1

    iget-boolean v0, p0, Lua/t;->e:Z

    return v0
.end method

.method public K1(I)Lua/t;
    .locals 0

    iput p1, p0, Lua/t;->u:I

    return-object p0
.end method

.method public L1(Ljava/util/List;)Lua/t;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lua/o;",
            ">;)",
            "Lua/t;"
        }
    .end annotation

    iput-object p1, p0, Lua/t;->v:Ljava/util/List;

    return-object p0
.end method

.method public M1(Lua/e;)Lua/t;
    .locals 1

    const-string v0, "startCap must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lua/e;

    iput-object p1, p0, Lua/t;->s:Lua/e;

    return-object p0
.end method

.method public N1(Z)Lua/t;
    .locals 0

    iput-boolean p1, p0, Lua/t;->e:Z

    return-object p0
.end method

.method public O1(F)Lua/t;
    .locals 0

    iput p1, p0, Lua/t;->b:F

    return-object p0
.end method

.method public P1(F)Lua/t;
    .locals 0

    iput p1, p0, Lua/t;->d:F

    return-object p0
.end method

.method public u1(Ljava/lang/Iterable;)Lua/t;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)",
            "Lua/t;"
        }
    .end annotation

    const-string v0, "points must not be null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/LatLng;

    iget-object v1, p0, Lua/t;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public v1(Z)Lua/t;
    .locals 0

    iput-boolean p1, p0, Lua/t;->r:Z

    return-object p0
.end method

.method public w1(I)Lua/t;
    .locals 0

    iput p1, p0, Lua/t;->c:I

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 8

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lua/t;->D1()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Lea/c;->K(Landroid/os/Parcel;ILjava/util/List;Z)V

    const/4 v1, 0x3

    invoke-virtual {p0}, Lua/t;->F1()F

    move-result v2

    invoke-static {p1, v1, v2}, Lea/c;->q(Landroid/os/Parcel;IF)V

    const/4 v1, 0x4

    invoke-virtual {p0}, Lua/t;->z1()I

    move-result v2

    invoke-static {p1, v1, v2}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 v1, 0x5

    invoke-virtual {p0}, Lua/t;->G1()F

    move-result v2

    invoke-static {p1, v1, v2}, Lea/c;->q(Landroid/os/Parcel;IF)V

    const/4 v1, 0x6

    invoke-virtual {p0}, Lua/t;->J1()Z

    move-result v2

    invoke-static {p1, v1, v2}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/4 v1, 0x7

    invoke-virtual {p0}, Lua/t;->I1()Z

    move-result v2

    invoke-static {p1, v1, v2}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/16 v1, 0x8

    invoke-virtual {p0}, Lua/t;->H1()Z

    move-result v2

    invoke-static {p1, v1, v2}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/16 v1, 0x9

    invoke-virtual {p0}, Lua/t;->E1()Lua/e;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xa

    invoke-virtual {p0}, Lua/t;->A1()Lua/e;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 p2, 0xb

    invoke-virtual {p0}, Lua/t;->B1()I

    move-result v1

    invoke-static {p1, p2, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/16 p2, 0xc

    invoke-virtual {p0}, Lua/t;->C1()Ljava/util/List;

    move-result-object v1

    invoke-static {p1, p2, v1, v3}, Lea/c;->K(Landroid/os/Parcel;ILjava/util/List;Z)V

    new-instance p2, Ljava/util/ArrayList;

    iget-object v1, p0, Lua/t;->w:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, Lua/t;->w:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lua/z;

    new-instance v4, Lua/z;

    new-instance v5, Lua/y$a;

    invoke-virtual {v2}, Lua/z;->v1()Lua/y;

    move-result-object v6

    invoke-direct {v5, v6}, Lua/y$a;-><init>(Lua/y;)V

    iget v6, p0, Lua/t;->b:F

    invoke-virtual {v5, v6}, Lua/y$a;->c(F)Lua/y$a;

    iget-boolean v6, p0, Lua/t;->e:Z

    invoke-virtual {v5, v6}, Lua/y$a;->b(Z)Lua/y$a;

    invoke-virtual {v5}, Lua/y$a;->a()Lua/y;

    move-result-object v5

    invoke-virtual {v2}, Lua/z;->u1()D

    move-result-wide v6

    invoke-direct {v4, v5, v6, v7}, Lua/z;-><init>(Lua/y;D)V

    invoke-interface {p2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/16 v1, 0xd

    invoke-static {p1, v1, p2, v3}, Lea/c;->K(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public x1(Lua/e;)Lua/t;
    .locals 1

    const-string v0, "endCap must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lua/e;

    iput-object p1, p0, Lua/t;->t:Lua/e;

    return-object p0
.end method

.method public y1(Z)Lua/t;
    .locals 0

    iput-boolean p1, p0, Lua/t;->f:Z

    return-object p0
.end method

.method public z1()I
    .locals 1

    iget v0, p0, Lua/t;->c:I

    return v0
.end method

.class public final Lua/r;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lua/r;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/util/List;

.field private final b:Ljava/util/List;

.field private c:F

.field private d:I

.field private e:I

.field private f:F

.field private r:Z

.field private s:Z

.field private t:Z

.field private u:I

.field private v:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lua/x0;

    invoke-direct {v0}, Lua/x0;-><init>()V

    sput-object v0, Lua/r;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lea/a;-><init>()V

    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lua/r;->c:F

    const/high16 v0, -0x1000000

    iput v0, p0, Lua/r;->d:I

    const/4 v0, 0x0

    iput v0, p0, Lua/r;->e:I

    const/4 v1, 0x0

    iput v1, p0, Lua/r;->f:F

    const/4 v1, 0x1

    iput-boolean v1, p0, Lua/r;->r:Z

    iput-boolean v0, p0, Lua/r;->s:Z

    iput-boolean v0, p0, Lua/r;->t:Z

    iput v0, p0, Lua/r;->u:I

    const/4 v0, 0x0

    iput-object v0, p0, Lua/r;->v:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lua/r;->a:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lua/r;->b:Ljava/util/List;

    return-void
.end method

.method constructor <init>(Ljava/util/List;Ljava/util/List;FIIFZZZILjava/util/List;)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput-object p1, p0, Lua/r;->a:Ljava/util/List;

    iput-object p2, p0, Lua/r;->b:Ljava/util/List;

    iput p3, p0, Lua/r;->c:F

    iput p4, p0, Lua/r;->d:I

    iput p5, p0, Lua/r;->e:I

    iput p6, p0, Lua/r;->f:F

    iput-boolean p7, p0, Lua/r;->r:Z

    iput-boolean p8, p0, Lua/r;->s:Z

    iput-boolean p9, p0, Lua/r;->t:Z

    iput p10, p0, Lua/r;->u:I

    iput-object p11, p0, Lua/r;->v:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public A1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lua/r;->a:Ljava/util/List;

    return-object v0
.end method

.method public B1()I
    .locals 1

    iget v0, p0, Lua/r;->d:I

    return v0
.end method

.method public C1()I
    .locals 1

    iget v0, p0, Lua/r;->u:I

    return v0
.end method

.method public D1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lua/o;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lua/r;->v:Ljava/util/List;

    return-object v0
.end method

.method public E1()F
    .locals 1

    iget v0, p0, Lua/r;->c:F

    return v0
.end method

.method public F1()F
    .locals 1

    iget v0, p0, Lua/r;->f:F

    return v0
.end method

.method public G1()Z
    .locals 1

    iget-boolean v0, p0, Lua/r;->t:Z

    return v0
.end method

.method public H1()Z
    .locals 1

    iget-boolean v0, p0, Lua/r;->s:Z

    return v0
.end method

.method public I1()Z
    .locals 1

    iget-boolean v0, p0, Lua/r;->r:Z

    return v0
.end method

.method public J1(I)Lua/r;
    .locals 0

    iput p1, p0, Lua/r;->d:I

    return-object p0
.end method

.method public K1(F)Lua/r;
    .locals 0

    iput p1, p0, Lua/r;->c:F

    return-object p0
.end method

.method public L1(Z)Lua/r;
    .locals 0

    iput-boolean p1, p0, Lua/r;->r:Z

    return-object p0
.end method

.method public M1(F)Lua/r;
    .locals 0

    iput p1, p0, Lua/r;->f:F

    return-object p0
.end method

.method public u1(Ljava/lang/Iterable;)Lua/r;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)",
            "Lua/r;"
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

    iget-object v1, p0, Lua/r;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public v1(Ljava/lang/Iterable;)Lua/r;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)",
            "Lua/r;"
        }
    .end annotation

    const-string v0, "points must not be null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lua/r;->b:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public w1(Z)Lua/r;
    .locals 0

    iput-boolean p1, p0, Lua/r;->t:Z

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lua/r;->A1()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lea/c;->K(Landroid/os/Parcel;ILjava/util/List;Z)V

    const/4 v0, 0x3

    iget-object v1, p0, Lua/r;->b:Ljava/util/List;

    invoke-static {p1, v0, v1, v2}, Lea/c;->y(Landroid/os/Parcel;ILjava/util/List;Z)V

    const/4 v0, 0x4

    invoke-virtual {p0}, Lua/r;->E1()F

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->q(Landroid/os/Parcel;IF)V

    const/4 v0, 0x5

    invoke-virtual {p0}, Lua/r;->B1()I

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 v0, 0x6

    invoke-virtual {p0}, Lua/r;->z1()I

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 v0, 0x7

    invoke-virtual {p0}, Lua/r;->F1()F

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->q(Landroid/os/Parcel;IF)V

    const/16 v0, 0x8

    invoke-virtual {p0}, Lua/r;->I1()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/16 v0, 0x9

    invoke-virtual {p0}, Lua/r;->H1()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/16 v0, 0xa

    invoke-virtual {p0}, Lua/r;->G1()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/16 v0, 0xb

    invoke-virtual {p0}, Lua/r;->C1()I

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/16 v0, 0xc

    invoke-virtual {p0}, Lua/r;->D1()Ljava/util/List;

    move-result-object v1

    invoke-static {p1, v0, v1, v2}, Lea/c;->K(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-static {p1, p2}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public x1(I)Lua/r;
    .locals 0

    iput p1, p0, Lua/r;->e:I

    return-object p0
.end method

.method public y1(Z)Lua/r;
    .locals 0

    iput-boolean p1, p0, Lua/r;->s:Z

    return-object p0
.end method

.method public z1()I
    .locals 1

    iget v0, p0, Lua/r;->e:I

    return v0
.end method

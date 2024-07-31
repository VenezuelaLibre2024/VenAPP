.class public final Lua/g;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lua/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Lcom/google/android/gms/maps/model/LatLng;

.field private b:D

.field private c:F

.field private d:I

.field private e:I

.field private f:F

.field private r:Z

.field private s:Z

.field private t:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lua/o0;

    invoke-direct {v0}, Lua/o0;-><init>()V

    sput-object v0, Lua/g;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lea/a;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lua/g;->a:Lcom/google/android/gms/maps/model/LatLng;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lua/g;->b:D

    const/high16 v1, 0x41200000    # 10.0f

    iput v1, p0, Lua/g;->c:F

    const/high16 v1, -0x1000000

    iput v1, p0, Lua/g;->d:I

    const/4 v1, 0x0

    iput v1, p0, Lua/g;->e:I

    const/4 v2, 0x0

    iput v2, p0, Lua/g;->f:F

    const/4 v2, 0x1

    iput-boolean v2, p0, Lua/g;->r:Z

    iput-boolean v1, p0, Lua/g;->s:Z

    iput-object v0, p0, Lua/g;->t:Ljava/util/List;

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/maps/model/LatLng;DFIIFZZLjava/util/List;)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput-object p1, p0, Lua/g;->a:Lcom/google/android/gms/maps/model/LatLng;

    iput-wide p2, p0, Lua/g;->b:D

    iput p4, p0, Lua/g;->c:F

    iput p5, p0, Lua/g;->d:I

    iput p6, p0, Lua/g;->e:I

    iput p7, p0, Lua/g;->f:F

    iput-boolean p8, p0, Lua/g;->r:Z

    iput-boolean p9, p0, Lua/g;->s:Z

    iput-object p10, p0, Lua/g;->t:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public A1()I
    .locals 1

    iget v0, p0, Lua/g;->d:I

    return v0
.end method

.method public B1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lua/o;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lua/g;->t:Ljava/util/List;

    return-object v0
.end method

.method public C1()F
    .locals 1

    iget v0, p0, Lua/g;->c:F

    return v0
.end method

.method public D1()F
    .locals 1

    iget v0, p0, Lua/g;->f:F

    return v0
.end method

.method public E1()Z
    .locals 1

    iget-boolean v0, p0, Lua/g;->s:Z

    return v0
.end method

.method public F1()Z
    .locals 1

    iget-boolean v0, p0, Lua/g;->r:Z

    return v0
.end method

.method public G1(D)Lua/g;
    .locals 0

    iput-wide p1, p0, Lua/g;->b:D

    return-object p0
.end method

.method public H1(I)Lua/g;
    .locals 0

    iput p1, p0, Lua/g;->d:I

    return-object p0
.end method

.method public I1(F)Lua/g;
    .locals 0

    iput p1, p0, Lua/g;->c:F

    return-object p0
.end method

.method public J1(Z)Lua/g;
    .locals 0

    iput-boolean p1, p0, Lua/g;->r:Z

    return-object p0
.end method

.method public K1(F)Lua/g;
    .locals 0

    iput p1, p0, Lua/g;->f:F

    return-object p0
.end method

.method public u1(Lcom/google/android/gms/maps/model/LatLng;)Lua/g;
    .locals 1

    const-string v0, "center must not be null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lua/g;->a:Lcom/google/android/gms/maps/model/LatLng;

    return-object p0
.end method

.method public v1(Z)Lua/g;
    .locals 0

    iput-boolean p1, p0, Lua/g;->s:Z

    return-object p0
.end method

.method public w1(I)Lua/g;
    .locals 0

    iput p1, p0, Lua/g;->e:I

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lua/g;->x1()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x3

    invoke-virtual {p0}, Lua/g;->z1()D

    move-result-wide v1

    invoke-static {p1, p2, v1, v2}, Lea/c;->n(Landroid/os/Parcel;ID)V

    const/4 p2, 0x4

    invoke-virtual {p0}, Lua/g;->C1()F

    move-result v1

    invoke-static {p1, p2, v1}, Lea/c;->q(Landroid/os/Parcel;IF)V

    const/4 p2, 0x5

    invoke-virtual {p0}, Lua/g;->A1()I

    move-result v1

    invoke-static {p1, p2, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 p2, 0x6

    invoke-virtual {p0}, Lua/g;->y1()I

    move-result v1

    invoke-static {p1, p2, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 p2, 0x7

    invoke-virtual {p0}, Lua/g;->D1()F

    move-result v1

    invoke-static {p1, p2, v1}, Lea/c;->q(Landroid/os/Parcel;IF)V

    const/16 p2, 0x8

    invoke-virtual {p0}, Lua/g;->F1()Z

    move-result v1

    invoke-static {p1, p2, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/16 p2, 0x9

    invoke-virtual {p0}, Lua/g;->E1()Z

    move-result v1

    invoke-static {p1, p2, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/16 p2, 0xa

    invoke-virtual {p0}, Lua/g;->B1()Ljava/util/List;

    move-result-object v1

    invoke-static {p1, p2, v1, v3}, Lea/c;->K(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public x1()Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    iget-object v0, p0, Lua/g;->a:Lcom/google/android/gms/maps/model/LatLng;

    return-object v0
.end method

.method public y1()I
    .locals 1

    iget v0, p0, Lua/g;->e:I

    return v0
.end method

.method public z1()D
    .locals 2

    iget-wide v0, p0, Lua/g;->b:D

    return-wide v0
.end method

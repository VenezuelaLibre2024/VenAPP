.class public Lua/n;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lua/n;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private A:Landroid/view/View;

.field private B:I

.field private C:Ljava/lang/String;

.field private D:F

.field private a:Lcom/google/android/gms/maps/model/LatLng;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Lua/b;

.field private e:F

.field private f:F

.field private r:Z

.field private s:Z

.field private t:Z

.field private u:F

.field private v:F

.field private w:F

.field private x:F

.field private y:F

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lua/t0;

    invoke-direct {v0}, Lua/t0;-><init>()V

    sput-object v0, Lua/n;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lea/a;-><init>()V

    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lua/n;->e:F

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lua/n;->f:F

    const/4 v2, 0x1

    iput-boolean v2, p0, Lua/n;->s:Z

    const/4 v2, 0x0

    iput-boolean v2, p0, Lua/n;->t:Z

    const/4 v3, 0x0

    iput v3, p0, Lua/n;->u:F

    iput v0, p0, Lua/n;->v:F

    iput v3, p0, Lua/n;->w:F

    iput v1, p0, Lua/n;->x:F

    iput v2, p0, Lua/n;->z:I

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;Ljava/lang/String;Landroid/os/IBinder;FFZZZFFFFFILandroid/os/IBinder;ILjava/lang/String;F)V
    .locals 5

    move-object v0, p0

    invoke-direct {p0}, Lea/a;-><init>()V

    const/high16 v1, 0x3f000000    # 0.5f

    iput v1, v0, Lua/n;->e:F

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v0, Lua/n;->f:F

    const/4 v3, 0x1

    iput-boolean v3, v0, Lua/n;->s:Z

    const/4 v3, 0x0

    iput-boolean v3, v0, Lua/n;->t:Z

    const/4 v4, 0x0

    iput v4, v0, Lua/n;->u:F

    iput v1, v0, Lua/n;->v:F

    iput v4, v0, Lua/n;->w:F

    iput v2, v0, Lua/n;->x:F

    iput v3, v0, Lua/n;->z:I

    move-object v1, p1

    iput-object v1, v0, Lua/n;->a:Lcom/google/android/gms/maps/model/LatLng;

    move-object v1, p2

    iput-object v1, v0, Lua/n;->b:Ljava/lang/String;

    move-object v1, p3

    iput-object v1, v0, Lua/n;->c:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez p4, :cond_0

    iput-object v1, v0, Lua/n;->d:Lua/b;

    goto :goto_0

    :cond_0
    new-instance v2, Lua/b;

    invoke-static {p4}, Lcom/google/android/gms/dynamic/b$a;->f2(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/b;

    move-result-object v3

    invoke-direct {v2, v3}, Lua/b;-><init>(Lcom/google/android/gms/dynamic/b;)V

    iput-object v2, v0, Lua/n;->d:Lua/b;

    :goto_0
    move v2, p5

    iput v2, v0, Lua/n;->e:F

    move v2, p6

    iput v2, v0, Lua/n;->f:F

    move v2, p7

    iput-boolean v2, v0, Lua/n;->r:Z

    move v2, p8

    iput-boolean v2, v0, Lua/n;->s:Z

    move v2, p9

    iput-boolean v2, v0, Lua/n;->t:Z

    move v2, p10

    iput v2, v0, Lua/n;->u:F

    move/from16 v2, p11

    iput v2, v0, Lua/n;->v:F

    move/from16 v2, p12

    iput v2, v0, Lua/n;->w:F

    move/from16 v2, p13

    iput v2, v0, Lua/n;->x:F

    move/from16 v2, p14

    iput v2, v0, Lua/n;->y:F

    move/from16 v2, p17

    iput v2, v0, Lua/n;->B:I

    move/from16 v2, p15

    iput v2, v0, Lua/n;->z:I

    invoke-static/range {p16 .. p16}, Lcom/google/android/gms/dynamic/b$a;->f2(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/b;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v2}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    :goto_1
    iput-object v1, v0, Lua/n;->A:Landroid/view/View;

    move-object/from16 v1, p18

    iput-object v1, v0, Lua/n;->C:Ljava/lang/String;

    move/from16 v1, p19

    iput v1, v0, Lua/n;->D:F

    return-void
.end method


# virtual methods
.method public A1()F
    .locals 1

    iget v0, p0, Lua/n;->f:F

    return v0
.end method

.method public B1()F
    .locals 1

    iget v0, p0, Lua/n;->v:F

    return v0
.end method

.method public C1()F
    .locals 1

    iget v0, p0, Lua/n;->w:F

    return v0
.end method

.method public D1()Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    iget-object v0, p0, Lua/n;->a:Lcom/google/android/gms/maps/model/LatLng;

    return-object v0
.end method

.method public E1()F
    .locals 1

    iget v0, p0, Lua/n;->u:F

    return v0
.end method

.method public F1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lua/n;->c:Ljava/lang/String;

    return-object v0
.end method

.method public G1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lua/n;->b:Ljava/lang/String;

    return-object v0
.end method

.method public H1()F
    .locals 1

    iget v0, p0, Lua/n;->y:F

    return v0
.end method

.method public I1(Lua/b;)Lua/n;
    .locals 0

    iput-object p1, p0, Lua/n;->d:Lua/b;

    return-object p0
.end method

.method public J1(FF)Lua/n;
    .locals 0

    iput p1, p0, Lua/n;->v:F

    iput p2, p0, Lua/n;->w:F

    return-object p0
.end method

.method public K1()Z
    .locals 1

    iget-boolean v0, p0, Lua/n;->r:Z

    return v0
.end method

.method public L1()Z
    .locals 1

    iget-boolean v0, p0, Lua/n;->t:Z

    return v0
.end method

.method public M1()Z
    .locals 1

    iget-boolean v0, p0, Lua/n;->s:Z

    return v0
.end method

.method public N1(Lcom/google/android/gms/maps/model/LatLng;)Lua/n;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lua/n;->a:Lcom/google/android/gms/maps/model/LatLng;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "latlng cannot be null - a position is required."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public O1(F)Lua/n;
    .locals 0

    iput p1, p0, Lua/n;->u:F

    return-object p0
.end method

.method public P1(Ljava/lang/String;)Lua/n;
    .locals 0

    iput-object p1, p0, Lua/n;->c:Ljava/lang/String;

    return-object p0
.end method

.method public Q1(Ljava/lang/String;)Lua/n;
    .locals 0

    iput-object p1, p0, Lua/n;->b:Ljava/lang/String;

    return-object p0
.end method

.method public R1(Z)Lua/n;
    .locals 0

    iput-boolean p1, p0, Lua/n;->s:Z

    return-object p0
.end method

.method public S1(F)Lua/n;
    .locals 0

    iput p1, p0, Lua/n;->y:F

    return-object p0
.end method

.method public u1(F)Lua/n;
    .locals 0

    iput p1, p0, Lua/n;->x:F

    return-object p0
.end method

.method public v1(FF)Lua/n;
    .locals 0

    iput p1, p0, Lua/n;->e:F

    iput p2, p0, Lua/n;->f:F

    return-object p0
.end method

.method public w1(Z)Lua/n;
    .locals 0

    iput-boolean p1, p0, Lua/n;->r:Z

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lua/n;->D1()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x3

    invoke-virtual {p0}, Lua/n;->G1()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, p2, v1, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x4

    invoke-virtual {p0}, Lua/n;->F1()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, p2, v1, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object p2, p0, Lua/n;->d:Lua/b;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lua/b;->a()Lcom/google/android/gms/dynamic/b;

    move-result-object p2

    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p2

    :goto_0
    const/4 v1, 0x5

    invoke-static {p1, v1, p2, v3}, Lea/c;->t(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/4 p2, 0x6

    invoke-virtual {p0}, Lua/n;->z1()F

    move-result v1

    invoke-static {p1, p2, v1}, Lea/c;->q(Landroid/os/Parcel;IF)V

    const/4 p2, 0x7

    invoke-virtual {p0}, Lua/n;->A1()F

    move-result v1

    invoke-static {p1, p2, v1}, Lea/c;->q(Landroid/os/Parcel;IF)V

    const/16 p2, 0x8

    invoke-virtual {p0}, Lua/n;->K1()Z

    move-result v1

    invoke-static {p1, p2, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/16 p2, 0x9

    invoke-virtual {p0}, Lua/n;->M1()Z

    move-result v1

    invoke-static {p1, p2, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/16 p2, 0xa

    invoke-virtual {p0}, Lua/n;->L1()Z

    move-result v1

    invoke-static {p1, p2, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/16 p2, 0xb

    invoke-virtual {p0}, Lua/n;->E1()F

    move-result v1

    invoke-static {p1, p2, v1}, Lea/c;->q(Landroid/os/Parcel;IF)V

    const/16 p2, 0xc

    invoke-virtual {p0}, Lua/n;->B1()F

    move-result v1

    invoke-static {p1, p2, v1}, Lea/c;->q(Landroid/os/Parcel;IF)V

    const/16 p2, 0xd

    invoke-virtual {p0}, Lua/n;->C1()F

    move-result v1

    invoke-static {p1, p2, v1}, Lea/c;->q(Landroid/os/Parcel;IF)V

    const/16 p2, 0xe

    invoke-virtual {p0}, Lua/n;->y1()F

    move-result v1

    invoke-static {p1, p2, v1}, Lea/c;->q(Landroid/os/Parcel;IF)V

    const/16 p2, 0xf

    invoke-virtual {p0}, Lua/n;->H1()F

    move-result v1

    invoke-static {p1, p2, v1}, Lea/c;->q(Landroid/os/Parcel;IF)V

    const/16 p2, 0x11

    iget v1, p0, Lua/n;->z:I

    invoke-static {p1, p2, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    iget-object p2, p0, Lua/n;->A:Landroid/view/View;

    invoke-static {p2}, Lcom/google/android/gms/dynamic/d;->h2(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/b;

    move-result-object p2

    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p2

    const/16 v1, 0x12

    invoke-static {p1, v1, p2, v3}, Lea/c;->t(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/16 p2, 0x13

    iget v1, p0, Lua/n;->B:I

    invoke-static {p1, p2, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/16 p2, 0x14

    iget-object v1, p0, Lua/n;->C:Ljava/lang/String;

    invoke-static {p1, p2, v1, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 p2, 0x15

    iget v1, p0, Lua/n;->D:F

    invoke-static {p1, p2, v1}, Lea/c;->q(Landroid/os/Parcel;IF)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public x1(Z)Lua/n;
    .locals 0

    iput-boolean p1, p0, Lua/n;->t:Z

    return-object p0
.end method

.method public y1()F
    .locals 1

    iget v0, p0, Lua/n;->x:F

    return v0
.end method

.method public z1()F
    .locals 1

    iget v0, p0, Lua/n;->e:F

    return v0
.end method

.method public final zzb()I
    .locals 1

    iget v0, p0, Lua/n;->B:I

    return v0
.end method

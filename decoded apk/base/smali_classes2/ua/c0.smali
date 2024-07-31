.class public final Lua/c0;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lua/c0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Lcom/google/android/gms/internal/maps/zzap;

.field private b:Lua/d0;

.field private c:Z

.field private d:F

.field private e:Z

.field private f:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lua/l0;

    invoke-direct {v0}, Lua/l0;-><init>()V

    sput-object v0, Lua/c0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lea/a;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lua/c0;->c:Z

    iput-boolean v0, p0, Lua/c0;->e:Z

    const/4 v0, 0x0

    iput v0, p0, Lua/c0;->f:F

    return-void
.end method

.method constructor <init>(Landroid/os/IBinder;ZFZF)V
    .locals 1

    invoke-direct {p0}, Lea/a;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lua/c0;->c:Z

    iput-boolean v0, p0, Lua/c0;->e:Z

    const/4 v0, 0x0

    iput v0, p0, Lua/c0;->f:F

    invoke-static {p1}, Lcom/google/android/gms/internal/maps/zzao;->zzc(Landroid/os/IBinder;)Lcom/google/android/gms/internal/maps/zzap;

    move-result-object p1

    iput-object p1, p0, Lua/c0;->a:Lcom/google/android/gms/internal/maps/zzap;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance p1, Lua/j0;

    invoke-direct {p1, p0}, Lua/j0;-><init>(Lua/c0;)V

    :goto_0
    iput-object p1, p0, Lua/c0;->b:Lua/d0;

    iput-boolean p2, p0, Lua/c0;->c:Z

    iput p3, p0, Lua/c0;->d:F

    iput-boolean p4, p0, Lua/c0;->e:Z

    iput p5, p0, Lua/c0;->f:F

    return-void
.end method

.method static bridge synthetic D1(Lua/c0;)Lcom/google/android/gms/internal/maps/zzap;
    .locals 0

    iget-object p0, p0, Lua/c0;->a:Lcom/google/android/gms/internal/maps/zzap;

    return-object p0
.end method


# virtual methods
.method public A1(F)Lua/c0;
    .locals 2

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    const-string v0, "Transparency must be in the range [0..1]"

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/s;->b(ZLjava/lang/Object;)V

    iput p1, p0, Lua/c0;->f:F

    return-object p0
.end method

.method public B1(Z)Lua/c0;
    .locals 0

    iput-boolean p1, p0, Lua/c0;->c:Z

    return-object p0
.end method

.method public C1(F)Lua/c0;
    .locals 0

    iput p1, p0, Lua/c0;->d:F

    return-object p0
.end method

.method public u1(Z)Lua/c0;
    .locals 0

    iput-boolean p1, p0, Lua/c0;->e:Z

    return-object p0
.end method

.method public v1()Z
    .locals 1

    iget-boolean v0, p0, Lua/c0;->e:Z

    return v0
.end method

.method public w1()F
    .locals 1

    iget v0, p0, Lua/c0;->f:F

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-object v0, p0, Lua/c0;->a:Lcom/google/android/gms/internal/maps/zzap;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    :goto_0
    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lea/c;->t(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/4 v0, 0x3

    invoke-virtual {p0}, Lua/c0;->y1()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x4

    invoke-virtual {p0}, Lua/c0;->x1()F

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->q(Landroid/os/Parcel;IF)V

    const/4 v0, 0x5

    invoke-virtual {p0}, Lua/c0;->v1()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x6

    invoke-virtual {p0}, Lua/c0;->w1()F

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->q(Landroid/os/Parcel;IF)V

    invoke-static {p1, p2}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public x1()F
    .locals 1

    iget v0, p0, Lua/c0;->d:F

    return v0
.end method

.method public y1()Z
    .locals 1

    iget-boolean v0, p0, Lua/c0;->c:Z

    return v0
.end method

.method public z1(Lua/d0;)Lua/c0;
    .locals 1

    const-string v0, "tileProvider must not be null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lua/d0;

    iput-object v0, p0, Lua/c0;->b:Lua/d0;

    new-instance v0, Lua/k0;

    invoke-direct {v0, p0, p1}, Lua/k0;-><init>(Lua/c0;Lua/d0;)V

    iput-object v0, p0, Lua/c0;->a:Lcom/google/android/gms/internal/maps/zzap;

    return-object p0
.end method

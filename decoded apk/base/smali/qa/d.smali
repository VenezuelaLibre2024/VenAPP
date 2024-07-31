.class public Lqa/d;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lqa/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lqa/r;

.field private final b:Lqa/b2;

.field private final c:Lqa/f0;

.field private final d:Lqa/h2;

.field private final e:Lqa/k0;

.field private final f:Lqa/m0;

.field private final r:Lqa/d2;

.field private final s:Lqa/p0;

.field private final t:Lqa/s;

.field private final u:Lqa/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqa/m1;

    invoke-direct {v0}, Lqa/m1;-><init>()V

    sput-object v0, Lqa/d;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Lqa/r;Lqa/b2;Lqa/f0;Lqa/h2;Lqa/k0;Lqa/m0;Lqa/d2;Lqa/p0;Lqa/s;Lqa/r0;)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput-object p1, p0, Lqa/d;->a:Lqa/r;

    iput-object p3, p0, Lqa/d;->c:Lqa/f0;

    iput-object p2, p0, Lqa/d;->b:Lqa/b2;

    iput-object p4, p0, Lqa/d;->d:Lqa/h2;

    iput-object p5, p0, Lqa/d;->e:Lqa/k0;

    iput-object p6, p0, Lqa/d;->f:Lqa/m0;

    iput-object p7, p0, Lqa/d;->r:Lqa/d2;

    iput-object p8, p0, Lqa/d;->s:Lqa/p0;

    iput-object p9, p0, Lqa/d;->t:Lqa/s;

    iput-object p10, p0, Lqa/d;->u:Lqa/r0;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lqa/d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lqa/d;

    iget-object v0, p0, Lqa/d;->a:Lqa/r;

    iget-object v2, p1, Lqa/d;->a:Lqa/r;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqa/d;->b:Lqa/b2;

    iget-object v2, p1, Lqa/d;->b:Lqa/b2;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqa/d;->c:Lqa/f0;

    iget-object v2, p1, Lqa/d;->c:Lqa/f0;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqa/d;->d:Lqa/h2;

    iget-object v2, p1, Lqa/d;->d:Lqa/h2;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqa/d;->e:Lqa/k0;

    iget-object v2, p1, Lqa/d;->e:Lqa/k0;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqa/d;->f:Lqa/m0;

    iget-object v2, p1, Lqa/d;->f:Lqa/m0;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqa/d;->r:Lqa/d2;

    iget-object v2, p1, Lqa/d;->r:Lqa/d2;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqa/d;->s:Lqa/p0;

    iget-object v2, p1, Lqa/d;->s:Lqa/p0;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqa/d;->t:Lqa/s;

    iget-object v2, p1, Lqa/d;->t:Lqa/s;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqa/d;->u:Lqa/r0;

    iget-object p1, p1, Lqa/d;->u:Lqa/r0;

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

    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lqa/d;->a:Lqa/r;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lqa/d;->b:Lqa/b2;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lqa/d;->c:Lqa/f0;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lqa/d;->d:Lqa/h2;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, Lqa/d;->e:Lqa/k0;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, Lqa/d;->f:Lqa/m0;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    iget-object v2, p0, Lqa/d;->r:Lqa/d2;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    iget-object v2, p0, Lqa/d;->s:Lqa/p0;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    iget-object v2, p0, Lqa/d;->t:Lqa/s;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    iget-object v2, p0, Lqa/d;->u:Lqa/r0;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public u1()Lqa/r;
    .locals 1

    iget-object v0, p0, Lqa/d;->a:Lqa/r;

    return-object v0
.end method

.method public v1()Lqa/f0;
    .locals 1

    iget-object v0, p0, Lqa/d;->c:Lqa/f0;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lqa/d;->u1()Lqa/r;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x3

    iget-object v2, p0, Lqa/d;->b:Lqa/b2;

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x4

    invoke-virtual {p0}, Lqa/d;->v1()Lqa/f0;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x5

    iget-object v2, p0, Lqa/d;->d:Lqa/h2;

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x6

    iget-object v2, p0, Lqa/d;->e:Lqa/k0;

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x7

    iget-object v2, p0, Lqa/d;->f:Lqa/m0;

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0x8

    iget-object v2, p0, Lqa/d;->r:Lqa/d2;

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0x9

    iget-object v2, p0, Lqa/d;->s:Lqa/p0;

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xa

    iget-object v2, p0, Lqa/d;->t:Lqa/s;

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xb

    iget-object v2, p0, Lqa/d;->u:Lqa/r0;

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

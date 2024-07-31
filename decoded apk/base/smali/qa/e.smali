.class public Lqa/e;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lqa/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lqa/g0;

.field private final b:Lqa/o1;

.field private final c:Lqa/f;

.field private final d:Lqa/q1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqa/l1;

    invoke-direct {v0}, Lqa/l1;-><init>()V

    sput-object v0, Lqa/e;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Lqa/g0;Lqa/o1;Lqa/f;Lqa/q1;)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput-object p1, p0, Lqa/e;->a:Lqa/g0;

    iput-object p2, p0, Lqa/e;->b:Lqa/o1;

    iput-object p3, p0, Lqa/e;->c:Lqa/f;

    iput-object p4, p0, Lqa/e;->d:Lqa/q1;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lqa/e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lqa/e;

    iget-object v0, p0, Lqa/e;->a:Lqa/g0;

    iget-object v2, p1, Lqa/e;->a:Lqa/g0;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqa/e;->b:Lqa/o1;

    iget-object v2, p1, Lqa/e;->b:Lqa/o1;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqa/e;->c:Lqa/f;

    iget-object v2, p1, Lqa/e;->c:Lqa/f;

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqa/e;->d:Lqa/q1;

    iget-object p1, p1, Lqa/e;->d:Lqa/q1;

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

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lqa/e;->a:Lqa/g0;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lqa/e;->b:Lqa/o1;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lqa/e;->c:Lqa/f;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lqa/e;->d:Lqa/q1;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public u1()Lqa/f;
    .locals 1

    iget-object v0, p0, Lqa/e;->c:Lqa/f;

    return-object v0
.end method

.method public v1()Lqa/g0;
    .locals 1

    iget-object v0, p0, Lqa/e;->a:Lqa/g0;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lqa/e;->v1()Lqa/g0;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x2

    iget-object v2, p0, Lqa/e;->b:Lqa/o1;

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x3

    invoke-virtual {p0}, Lqa/e;->u1()Lqa/f;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x4

    iget-object v2, p0, Lqa/e;->d:Lqa/q1;

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.class public final Lqa/r0;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lqa/r0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:[[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqa/s0;

    invoke-direct {v0}, Lqa/s0;-><init>()V

    sput-object v0, Lqa/r0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>([[B)V
    .locals 5

    invoke-direct {p0}, Lea/a;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    invoke-static {v2}, Lcom/google/android/gms/common/internal/s;->a(Z)V

    array-length v2, p1

    and-int/2addr v2, v1

    xor-int/2addr v2, v1

    if-eq v1, v2, :cond_1

    move v2, v0

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    invoke-static {v2}, Lcom/google/android/gms/common/internal/s;->a(Z)V

    move v2, v0

    :goto_2
    array-length v3, p1

    if-ge v2, v3, :cond_7

    if-eqz v2, :cond_3

    aget-object v3, p1, v2

    if-eqz v3, :cond_2

    goto :goto_3

    :cond_2
    move v3, v0

    goto :goto_4

    :cond_3
    :goto_3
    move v3, v1

    :goto_4
    invoke-static {v3}, Lcom/google/android/gms/common/internal/s;->a(Z)V

    add-int/lit8 v3, v2, 0x1

    aget-object v4, p1, v3

    if-eqz v4, :cond_4

    move v4, v1

    goto :goto_5

    :cond_4
    move v4, v0

    :goto_5
    invoke-static {v4}, Lcom/google/android/gms/common/internal/s;->a(Z)V

    aget-object v3, p1, v3

    array-length v3, v3

    const/16 v4, 0x20

    if-eq v3, v4, :cond_6

    const/16 v4, 0x40

    if-ne v3, v4, :cond_5

    goto :goto_6

    :cond_5
    move v3, v0

    goto :goto_7

    :cond_6
    :goto_6
    move v3, v1

    :goto_7
    invoke-static {v3}, Lcom/google/android/gms/common/internal/s;->a(Z)V

    add-int/lit8 v2, v2, 0x2

    goto :goto_2

    :cond_7
    iput-object p1, p0, Lqa/r0;->a:[[B

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lqa/r0;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lqa/r0;

    iget-object v0, p0, Lqa/r0;->a:[[B

    iget-object p1, p1, Lqa/r0;->a:[[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->deepEquals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 7

    iget-object v0, p0, Lqa/r0;->a:[[B

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v5, v0, v3

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v5, v6, v2

    invoke-static {v6}, Lcom/google/android/gms/common/internal/q;->c([Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return v4
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-object v0, p0, Lqa/r0;->a:[[B

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p1, v2, v0, v1}, Lea/c;->m(Landroid/os/Parcel;I[[BZ)V

    invoke-static {p1, p2}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

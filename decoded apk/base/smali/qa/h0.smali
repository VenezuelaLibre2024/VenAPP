.class public Lqa/h0;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lqa/h0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:S

.field private final c:S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqa/k1;

    invoke-direct {v0}, Lqa/k1;-><init>()V

    sput-object v0, Lqa/h0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ISS)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput p1, p0, Lqa/h0;->a:I

    iput-short p2, p0, Lqa/h0;->b:S

    iput-short p3, p0, Lqa/h0;->c:S

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lqa/h0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lqa/h0;

    iget v0, p0, Lqa/h0;->a:I

    iget v2, p1, Lqa/h0;->a:I

    if-ne v0, v2, :cond_1

    iget-short v0, p0, Lqa/h0;->b:S

    iget-short v2, p1, Lqa/h0;->b:S

    if-ne v0, v2, :cond_1

    iget-short v0, p0, Lqa/h0;->c:S

    iget-short p1, p1, Lqa/h0;->c:S

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Lqa/h0;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-short v1, p0, Lqa/h0;->b:S

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-short v1, p0, Lqa/h0;->c:S

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/google/android/gms/common/internal/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public u1()S
    .locals 1

    iget-short v0, p0, Lqa/h0;->b:S

    return v0
.end method

.method public v1()S
    .locals 1

    iget-short v0, p0, Lqa/h0;->c:S

    return v0
.end method

.method public w1()I
    .locals 1

    iget v0, p0, Lqa/h0;->a:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    invoke-virtual {p0}, Lqa/h0;->w1()I

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 v0, 0x2

    invoke-virtual {p0}, Lqa/h0;->u1()S

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->F(Landroid/os/Parcel;IS)V

    const/4 v0, 0x3

    invoke-virtual {p0}, Lqa/h0;->v1()S

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->F(Landroid/os/Parcel;IS)V

    invoke-static {p1, p2}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

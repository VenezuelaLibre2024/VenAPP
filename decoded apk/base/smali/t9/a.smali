.class public Lt9/a;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lt9/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field private b:Z

.field private c:J

.field private final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt9/k;

    invoke-direct {v0}, Lt9/k;-><init>()V

    sput-object v0, Lt9/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IZJZ)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput p1, p0, Lt9/a;->a:I

    iput-boolean p2, p0, Lt9/a;->b:Z

    iput-wide p3, p0, Lt9/a;->c:J

    iput-boolean p5, p0, Lt9/a;->d:Z

    return-void
.end method


# virtual methods
.method public u1()J
    .locals 2

    iget-wide v0, p0, Lt9/a;->c:J

    return-wide v0
.end method

.method public v1()Z
    .locals 1

    iget-boolean v0, p0, Lt9/a;->d:Z

    return v0
.end method

.method public w1()Z
    .locals 1

    iget-boolean v0, p0, Lt9/a;->b:Z

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    iget v1, p0, Lt9/a;->a:I

    invoke-static {p1, v0, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 v0, 0x2

    invoke-virtual {p0}, Lt9/a;->w1()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x3

    invoke-virtual {p0}, Lt9/a;->u1()J

    move-result-wide v1

    invoke-static {p1, v0, v1, v2}, Lea/c;->z(Landroid/os/Parcel;IJ)V

    const/4 v0, 0x4

    invoke-virtual {p0}, Lt9/a;->v1()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    invoke-static {p1, p2}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

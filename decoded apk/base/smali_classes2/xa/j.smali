.class public final Lxa/j;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lxa/j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:J

.field public final b:[Lxa/a;

.field public final c:I

.field public final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxa/k;

    invoke-direct {v0}, Lxa/k;-><init>()V

    sput-object v0, Lxa/j;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(J[Lxa/a;IZ)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput-wide p1, p0, Lxa/j;->a:J

    iput-object p3, p0, Lxa/j;->b:[Lxa/a;

    iput-boolean p5, p0, Lxa/j;->d:Z

    if-eqz p5, :cond_0

    iput p4, p0, Lxa/j;->c:I

    return-void

    :cond_0
    const/4 p1, -0x1

    iput p1, p0, Lxa/j;->c:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x2

    iget-wide v2, p0, Lxa/j;->a:J

    invoke-static {p1, v1, v2, v3}, Lea/c;->z(Landroid/os/Parcel;IJ)V

    iget-object v1, p0, Lxa/j;->b:[Lxa/a;

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-static {p1, v3, v1, p2, v2}, Lea/c;->J(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    const/4 p2, 0x4

    iget v1, p0, Lxa/j;->c:I

    invoke-static {p1, p2, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 p2, 0x5

    iget-boolean v1, p0, Lxa/j;->d:Z

    invoke-static {p1, p2, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
